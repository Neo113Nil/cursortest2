package org.chromium.net.impl;

import android.annotation.SuppressLint;
import androidx.annotation.VisibleForTesting;
import internal.org.jni_zero.CalledByNative;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.Log;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
import org.chromium.net.impl.VersionSafeCallbacks;

@VisibleForTesting
/* loaded from: classes.dex */
public final class CronetUploadDataStream extends UploadDataSink {
    private static final String TAG = "CronetUploadDataStream";
    private ByteBuffer mByteBuffer;
    private long mByteBufferLimit;
    private final VersionSafeCallbacks.UploadDataProviderWrapper mDataProvider;
    private boolean mDestroyAdapterPostponed;
    private final Executor mExecutor;
    private long mLength;
    private Runnable mOnDestroyedCallbackForTesting;
    private long mRemainingLength;
    private final CronetUrlRequest mRequest;
    private long mUploadDataStreamAdapter;
    private final AtomicInteger mReadCount = new AtomicInteger();
    private final Runnable mReadTask = new Runnable() { // from class: org.chromium.net.impl.CronetUploadDataStream.1
        static final /* synthetic */ boolean $assertionsDisabled = false;

        @Override // java.lang.Runnable
        public void run() {
            synchronized (CronetUploadDataStream.this.mLock) {
                try {
                    if (CronetUploadDataStream.this.mUploadDataStreamAdapter == 0) {
                        return;
                    }
                    CronetUploadDataStream.this.checkState(3);
                    if (CronetUploadDataStream.this.mByteBuffer == null) {
                        throw new IllegalStateException("Unexpected readData call. Buffer is null");
                    }
                    CronetUploadDataStream.this.mInWhichUserCallback = 0;
                    try {
                        CronetUploadDataStream.this.checkCallingThread();
                        VersionSafeCallbacks.UploadDataProviderWrapper uploadDataProviderWrapper = CronetUploadDataStream.this.mDataProvider;
                        CronetUploadDataStream cronetUploadDataStream = CronetUploadDataStream.this;
                        uploadDataProviderWrapper.read(cronetUploadDataStream, cronetUploadDataStream.mByteBuffer);
                        CronetUploadDataStream.this.mReadCount.incrementAndGet();
                    } catch (Exception e) {
                        CronetUploadDataStream.this.onError(e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };
    private final Object mLock = new Object();
    private int mInWhichUserCallback = 3;

    interface Natives {
        long attachUploadDataToRequest(CronetUploadDataStream cronetUploadDataStream, long j, long j2);

        long createAdapterForTesting(CronetUploadDataStream cronetUploadDataStream);

        long createUploadDataStreamForTesting(CronetUploadDataStream cronetUploadDataStream, long j, long j2);

        void destroy(long j);

        void onReadSucceeded(long j, int i, boolean z);

        void onRewindSucceeded(long j);
    }

    @Retention(RetentionPolicy.SOURCE)
    private @interface UserCallback {
        public static final int GET_LENGTH = 2;
        public static final int NOT_IN_CALLBACK = 3;
        public static final int READ = 0;
        public static final int REWIND = 1;
    }

    public CronetUploadDataStream(UploadDataProvider uploadDataProvider, Executor executor, CronetUrlRequest cronetUrlRequest) {
        this.mExecutor = executor;
        this.mDataProvider = new VersionSafeCallbacks.UploadDataProviderWrapper(uploadDataProvider);
        this.mRequest = cronetUrlRequest;
    }

    @CalledByNative
    void readData(ByteBuffer byteBuffer) {
        this.mByteBuffer = byteBuffer;
        this.mByteBufferLimit = byteBuffer.limit();
        postTaskToExecutor(this.mReadTask, "readData");
    }

    @CalledByNative
    void rewind() {
        postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetUploadDataStream.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (CronetUploadDataStream.this.mLock) {
                    try {
                        if (CronetUploadDataStream.this.mUploadDataStreamAdapter == 0) {
                            return;
                        }
                        CronetUploadDataStream.this.checkState(3);
                        CronetUploadDataStream.this.mInWhichUserCallback = 1;
                        try {
                            CronetUploadDataStream.this.checkCallingThread();
                            CronetUploadDataStream.this.mDataProvider.rewind(CronetUploadDataStream.this);
                        } catch (Exception e) {
                            CronetUploadDataStream.this.onError(e);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }, "rewind");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkCallingThread() {
        this.mRequest.checkCallingThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkState(int i) {
        if (this.mInWhichUserCallback == i) {
            return;
        }
        throw new IllegalStateException("Expected " + i + ", but was " + this.mInWhichUserCallback);
    }

    @CalledByNative
    void onUploadDataStreamDestroyed() {
        destroyAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onError(Throwable th) {
        boolean z;
        synchronized (this.mLock) {
            int i = this.mInWhichUserCallback;
            if (i == 3) {
                throw new IllegalStateException("There is no read or rewind or length check in progress.", th);
            }
            z = i == 2;
            this.mInWhichUserCallback = 3;
            this.mByteBuffer = null;
            destroyAdapterIfPostponed();
        }
        if (z) {
            try {
                this.mDataProvider.close();
            } catch (Exception e) {
                Log.e(TAG, "Failure closing data provider", (Throwable) e);
            }
        }
        this.mRequest.onUploadException(th);
    }

    @Override // org.chromium.net.UploadDataSink
    @SuppressLint({"DefaultLocale"})
    public void onReadSucceeded(boolean z) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUploadDataStream#onReadSucceeded");
        try {
            synchronized (this.mLock) {
                try {
                    checkState(0);
                    if (this.mByteBufferLimit != this.mByteBuffer.limit()) {
                        throw new IllegalStateException("ByteBuffer limit changed");
                    }
                    if (z && this.mLength >= 0) {
                        throw new IllegalArgumentException("Non-chunked upload can't have last chunk");
                    }
                    int position = this.mByteBuffer.position();
                    if (position == 0 && !z) {
                        onError(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
                        if (scoped != null) {
                            scoped.close();
                            return;
                        }
                        return;
                    }
                    long j = this.mRemainingLength - position;
                    this.mRemainingLength = j;
                    if (j < 0 && this.mLength >= 0) {
                        throw new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", Long.valueOf(this.mLength - this.mRemainingLength), Long.valueOf(this.mLength)));
                    }
                    this.mByteBuffer = null;
                    this.mInWhichUserCallback = 3;
                    destroyAdapterIfPostponed();
                    if (this.mUploadDataStreamAdapter == 0) {
                        if (scoped != null) {
                            scoped.close();
                        }
                    } else {
                        CronetUploadDataStreamJni.get().onReadSucceeded(this.mUploadDataStreamAdapter, position, z);
                        if (scoped != null) {
                            scoped.close();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public void onReadError(Exception exc) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUploadDataStream#onReadError");
        try {
            synchronized (this.mLock) {
                checkState(0);
                onError(exc);
            }
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public void onRewindSucceeded() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUploadDataStream#onRewindSucceeded");
        try {
            synchronized (this.mLock) {
                checkState(1);
                this.mInWhichUserCallback = 3;
                this.mRemainingLength = this.mLength;
                if (this.mUploadDataStreamAdapter == 0) {
                    if (scoped != null) {
                        scoped.close();
                    }
                } else {
                    CronetUploadDataStreamJni.get().onRewindSucceeded(this.mUploadDataStreamAdapter);
                    if (scoped != null) {
                        scoped.close();
                    }
                }
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public void onRewindError(Exception exc) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUploadDataStream#onRewindError");
        try {
            synchronized (this.mLock) {
                checkState(1);
                onError(exc);
            }
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    void postTaskToExecutor(final Runnable runnable, final String str) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUploadDataStream#postTaskToExecutor " + str);
        try {
            this.mExecutor.execute(new Runnable() { // from class: org.chromium.net.impl.CronetUploadDataStream$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CronetUploadDataStream.lambda$postTaskToExecutor$0(str, runnable);
                }
            });
        } catch (Throwable th) {
            try {
                this.mRequest.onUploadException(th);
            } catch (Throwable th2) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        if (scoped != null) {
            scoped.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$postTaskToExecutor$0(String str, Runnable runnable) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUploadDataStream#postTaskToExecutor " + str + " running callback");
        try {
            runnable.run();
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private void destroyAdapter() {
        synchronized (this.mLock) {
            try {
                if (this.mInWhichUserCallback == 0) {
                    this.mDestroyAdapterPostponed = true;
                    return;
                }
                if (this.mUploadDataStreamAdapter == 0) {
                    return;
                }
                CronetUploadDataStreamJni.get().destroy(this.mUploadDataStreamAdapter);
                this.mUploadDataStreamAdapter = 0L;
                Runnable runnable = this.mOnDestroyedCallbackForTesting;
                if (runnable != null) {
                    runnable.run();
                }
                postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetUploadDataStream.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            CronetUploadDataStream.this.checkCallingThread();
                            CronetUploadDataStream.this.mDataProvider.close();
                        } catch (Exception e) {
                            Log.e(CronetUploadDataStream.TAG, "Exception thrown when closing", (Throwable) e);
                        }
                    }
                }, "destroyAdapter");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void destroyAdapterIfPostponed() {
        synchronized (this.mLock) {
            try {
                if (this.mInWhichUserCallback == 0) {
                    throw new IllegalStateException("Method should not be called when read has not completed.");
                }
                if (this.mDestroyAdapterPostponed) {
                    destroyAdapter();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void initializeWithRequest() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUploadDataStream#initializeWithRequest");
        try {
            synchronized (this.mLock) {
                this.mInWhichUserCallback = 2;
            }
            try {
                this.mRequest.checkCallingThread();
                long length = this.mDataProvider.getLength();
                this.mLength = length;
                this.mRemainingLength = length;
            } catch (Throwable th) {
                onError(th);
            }
            synchronized (this.mLock) {
                this.mInWhichUserCallback = 3;
            }
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th2) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    void attachNativeAdapterToRequest(long j) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUploadDataStream#attachNativeAdapterToRequest");
        try {
            synchronized (this.mLock) {
                this.mUploadDataStreamAdapter = CronetUploadDataStreamJni.get().attachUploadDataToRequest(this, j, this.mLength);
            }
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public long createUploadDataStreamForTesting() throws IOException {
        long createUploadDataStreamForTesting;
        synchronized (this.mLock) {
            this.mUploadDataStreamAdapter = CronetUploadDataStreamJni.get().createAdapterForTesting(this);
            long length = this.mDataProvider.getLength();
            this.mLength = length;
            this.mRemainingLength = length;
            createUploadDataStreamForTesting = CronetUploadDataStreamJni.get().createUploadDataStreamForTesting(this, this.mLength, this.mUploadDataStreamAdapter);
        }
        return createUploadDataStreamForTesting;
    }

    void setOnDestroyedCallbackForTesting(Runnable runnable) {
        this.mOnDestroyedCallbackForTesting = runnable;
    }

    int getReadCount() {
        return this.mReadCount.get();
    }
}
