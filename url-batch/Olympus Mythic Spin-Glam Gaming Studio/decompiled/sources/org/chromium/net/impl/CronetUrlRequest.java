package org.chromium.net.impl;

import android.os.Build;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import internal.org.jni_zero.CalledByNative;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.Log;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetLogger;
import org.chromium.net.impl.VersionSafeCallbacks;

@VisibleForTesting
/* loaded from: classes15.dex */
public final class CronetUrlRequest extends ExperimentalUrlRequest {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean mAllowDirectExecutor;
    private final VersionSafeCallbacks.UrlRequestCallback mCallback;
    private final ByteBuffer mDictionary;
    private final String mDictionaryId;
    private final byte[] mDictionarySha256Hash;
    private final boolean mDisableCache;
    private final boolean mDisableConnectionMigration;
    private CronetException mException;
    private final Executor mExecutor;
    private boolean mFinalUserCallbackThrew;
    private int mFinishedReason;
    private final int mIdempotency;
    private final String mInitialMethod;
    private final String mInitialUrl;
    private final CronetLogger mLogger;
    private CronetMetrics mMetrics;
    private final long mNetworkHandle;
    private int mNonfinalUserCallbackExceptionCount;
    private Runnable mOnDestroyedCallbackForTesting;
    private OnReadCompletedRunnable mOnReadCompletedTask;
    private final int mPriority;
    private boolean mQuicConnectionMigrationAttempted;
    private boolean mQuicConnectionMigrationSuccessful;
    private int mReadCount;
    private final Collection<Object> mRequestAnnotations;
    private final CronetUrlRequestContext mRequestContext;
    private final VersionSafeCallbacks.RequestFinishedInfoListener mRequestFinishedListener;
    private final List<Map.Entry<String, String>> mRequestHeaders;
    private UrlResponseInfoImpl mResponseInfo;
    private boolean mStarted;
    private final int mTrafficStatsTag;
    private final boolean mTrafficStatsTagSet;
    private final int mTrafficStatsUid;
    private final boolean mTrafficStatsUidSet;
    private final CronetUploadDataStream mUploadDataStream;
    private final List<String> mUrlChain;
    private long mUrlRequestAdapter;
    private final Object mUrlRequestAdapterLock = new Object();
    private boolean mWaitingOnRead;
    private boolean mWaitingOnRedirect;

    interface Natives {
        boolean addRequestHeader(long j, String str, String str2);

        long createRequestAdapter(CronetUrlRequest cronetUrlRequest, long j, String str, int i, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, int i4, byte[] bArr, ByteBuffer byteBuffer, int i5, int i6, String str2, long j2);

        void destroy(long j, boolean z);

        void followDeferredRedirect(long j);

        void getStatus(long j, VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener);

        boolean readData(long j, ByteBuffer byteBuffer, int i, int i2);

        boolean setHttpMethod(long j, String str);

        void start(long j);
    }

    private static int convertIdempotency(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    private static int convertRequestPriority(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 4 ? 4 : 5;
        }
        return 3;
    }

    private final class OnReadCompletedRunnable implements Runnable {
        ByteBuffer mByteBuffer;

        private OnReadCompletedRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CronetUrlRequest.this.checkCallingThread();
            ByteBuffer byteBuffer = this.mByteBuffer;
            this.mByteBuffer = null;
            try {
                synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    try {
                        if (CronetUrlRequest.this.isDoneLocked()) {
                            return;
                        }
                        CronetUrlRequest.this.mWaitingOnRead = true;
                        VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                        CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                        urlRequestCallback.onReadCompleted(cronetUrlRequest, cronetUrlRequest.mResponseInfo, byteBuffer);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                CronetUrlRequest.this.onNonfinalCallbackException(e);
            }
        }
    }

    CronetUrlRequest(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, UrlRequest.Callback callback, Executor executor, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener, int i4, long j, String str2, ArrayList<Map.Entry<String, String>> arrayList, UploadDataProvider uploadDataProvider, Executor executor2, byte[] bArr, ByteBuffer byteBuffer, @NonNull String str3) {
        ArrayList arrayList2 = new ArrayList();
        this.mUrlChain = arrayList2;
        Objects.requireNonNull(str, "URL is required");
        Objects.requireNonNull(callback, "Listener is required");
        Objects.requireNonNull(executor, "Executor is required");
        Objects.requireNonNull(str3, "Dictionary ID is expect to be an empty string if not specified");
        this.mAllowDirectExecutor = z3;
        this.mRequestContext = cronetUrlRequestContext;
        this.mLogger = cronetUrlRequestContext.getCronetLogger();
        this.mInitialUrl = str;
        arrayList2.add(str);
        this.mPriority = convertRequestPriority(i);
        this.mCallback = new VersionSafeCallbacks.UrlRequestCallback(callback);
        this.mExecutor = executor;
        this.mRequestAnnotations = collection;
        this.mDisableCache = z;
        this.mDisableConnectionMigration = z2;
        this.mTrafficStatsTagSet = z4;
        this.mTrafficStatsTag = i2;
        this.mTrafficStatsUidSet = z5;
        this.mTrafficStatsUid = i3;
        this.mRequestFinishedListener = listener != null ? new VersionSafeCallbacks.RequestFinishedInfoListener(listener) : null;
        this.mDictionarySha256Hash = bArr;
        this.mDictionary = byteBuffer;
        this.mDictionaryId = str3;
        this.mIdempotency = convertIdempotency(i4);
        this.mNetworkHandle = j;
        this.mInitialMethod = str2;
        this.mRequestHeaders = Collections.unmodifiableList(new ArrayList(arrayList));
        this.mUploadDataStream = uploadDataProvider != null ? new CronetUploadDataStream(uploadDataProvider, executor2, this) : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [org.chromium.net.impl.CronetUrlRequest$Natives] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [org.chromium.net.impl.CronetUrlRequest$Natives] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [org.chromium.net.impl.CronetUrlRequest] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [org.chromium.net.impl.CronetUrlRequest] */
    @Override // org.chromium.net.UrlRequest
    public void start() {
        Object obj;
        ?? r2;
        ?? r1;
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequest#start");
        try {
            Object obj2 = this.mUrlRequestAdapterLock;
            try {
                synchronized (obj2) {
                    try {
                        checkNotStarted();
                        try {
                            ?? r12 = CronetUrlRequestJni.get();
                            long urlRequestContextAdapter = this.mRequestContext.getUrlRequestContextAdapter();
                            String str = this.mInitialUrl;
                            int i = this.mPriority;
                            boolean z = this.mDisableCache;
                            boolean z2 = this.mDisableConnectionMigration;
                            boolean z3 = this.mTrafficStatsTagSet;
                            int i2 = this.mTrafficStatsTag;
                            boolean z4 = this.mTrafficStatsUidSet;
                            int i3 = this.mTrafficStatsUid;
                            int i4 = this.mIdempotency;
                            byte[] bArr = this.mDictionarySha256Hash;
                            try {
                                ByteBuffer byteBuffer = this.mDictionary;
                                int position = byteBuffer != null ? byteBuffer.position() : 0;
                                ByteBuffer byteBuffer2 = this.mDictionary;
                                r2 = this;
                                obj = obj2;
                                try {
                                    try {
                                        r2.mUrlRequestAdapter = r12.createRequestAdapter(r2, urlRequestContextAdapter, str, i, z, z2, z3, i2, z4, i3, i4, bArr, byteBuffer, position, byteBuffer2 != null ? byteBuffer2.limit() : 0, this.mDictionaryId, this.mNetworkHandle);
                                        r2.mRequestContext.onRequestStarted();
                                        ?? r0 = CronetUrlRequestJni.get();
                                        long j = r2.mUrlRequestAdapter;
                                        r1 = r2.mInitialMethod;
                                        try {
                                            if (!r0.setHttpMethod(j, r1)) {
                                                throw new IllegalArgumentException("Invalid http method " + r2.mInitialMethod);
                                            }
                                            boolean z5 = false;
                                            for (Map.Entry<String, String> entry : r2.mRequestHeaders) {
                                                if (entry.getKey().equalsIgnoreCase("Content-Type") && !entry.getValue().isEmpty()) {
                                                    z5 = true;
                                                }
                                                if (!CronetUrlRequestJni.get().addRequestHeader(r2.mUrlRequestAdapter, entry.getKey(), entry.getValue())) {
                                                    throw new IllegalArgumentException("Invalid header with headername: " + entry.getKey());
                                                }
                                            }
                                            CronetUploadDataStream cronetUploadDataStream = r2.mUploadDataStream;
                                            if (cronetUploadDataStream == null) {
                                                r2.mStarted = true;
                                                startInternalLocked();
                                                if (scoped != null) {
                                                    scoped.close();
                                                    return;
                                                }
                                                return;
                                            }
                                            if (!z5) {
                                                throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                                            }
                                            r2.mStarted = true;
                                            cronetUploadDataStream.postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.1
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    CronetUrlRequest.this.mUploadDataStream.initializeWithRequest();
                                                    synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                                                        try {
                                                            if (CronetUrlRequest.this.isDoneLocked()) {
                                                                return;
                                                            }
                                                            CronetUrlRequest.this.mUploadDataStream.attachNativeAdapterToRequest(CronetUrlRequest.this.mUrlRequestAdapter);
                                                            CronetUrlRequest.this.startInternalLocked();
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                    }
                                                }
                                            }, "CronetUrlRequest#start");
                                            if (scoped != null) {
                                                scoped.close();
                                            }
                                        } catch (RuntimeException e) {
                                            e = e;
                                            r2.destroyRequestAdapterLocked(r1);
                                            r2.mRequestContext.onRequestFinished();
                                            throw e;
                                        }
                                    } catch (RuntimeException e2) {
                                        e = e2;
                                        r2 = r2;
                                        r1 = 1;
                                        r2.destroyRequestAdapterLocked(r1);
                                        r2.mRequestContext.onRequestFinished();
                                        throw e;
                                    }
                                } catch (RuntimeException e3) {
                                    e = e3;
                                    r1 = 1;
                                    r2 = this;
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        Throwable th3 = th;
                                        if (scoped == null) {
                                            throw th3;
                                        }
                                        try {
                                            scoped.close();
                                            throw th3;
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                            throw th3;
                                        }
                                    }
                                }
                            } catch (RuntimeException e4) {
                                e = e4;
                                r2 = this;
                            } catch (Throwable th5) {
                                th = th5;
                                obj = obj2;
                            }
                        } catch (RuntimeException e5) {
                            e = e5;
                            r2 = this;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        obj = obj2;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInternalLocked() {
        CronetUrlRequestJni.get().start(this.mUrlRequestAdapter);
    }

    @Override // org.chromium.net.UrlRequest
    public void followRedirect() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequest#followRedirect");
        try {
            synchronized (this.mUrlRequestAdapterLock) {
                if (!this.mWaitingOnRedirect) {
                    throw new IllegalStateException("No redirect to follow.");
                }
                this.mWaitingOnRedirect = false;
                if (isDoneLocked()) {
                    if (scoped != null) {
                        scoped.close();
                    }
                } else {
                    CronetUrlRequestJni.get().followDeferredRedirect(this.mUrlRequestAdapter);
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

    @Override // org.chromium.net.UrlRequest
    public void read(ByteBuffer byteBuffer) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequest#read");
        try {
            Preconditions.checkHasRemaining(byteBuffer);
            Preconditions.checkDirect(byteBuffer);
            synchronized (this.mUrlRequestAdapterLock) {
                if (!this.mWaitingOnRead) {
                    throw new IllegalStateException("Unexpected read attempt.");
                }
                this.mWaitingOnRead = false;
                if (isDoneLocked()) {
                    if (scoped != null) {
                        scoped.close();
                    }
                } else {
                    if (!CronetUrlRequestJni.get().readData(this.mUrlRequestAdapter, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                        this.mWaitingOnRead = true;
                        throw new IllegalArgumentException("Unable to call native read");
                    }
                    this.mReadCount++;
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

    @Override // org.chromium.net.UrlRequest
    public void cancel() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequest#cancel");
        try {
            synchronized (this.mUrlRequestAdapterLock) {
                if (!isDoneLocked() && this.mStarted) {
                    destroyRequestAdapterLocked(2);
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                if (scoped != null) {
                    scoped.close();
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

    @Override // org.chromium.net.UrlRequest
    public boolean isDone() {
        boolean isDoneLocked;
        synchronized (this.mUrlRequestAdapterLock) {
            isDoneLocked = isDoneLocked();
        }
        return isDoneLocked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDoneLocked() {
        return this.mStarted && this.mUrlRequestAdapter == 0;
    }

    @Override // org.chromium.net.UrlRequest
    public void getStatus(UrlRequest.StatusListener statusListener) {
        final VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener = new VersionSafeCallbacks.UrlRequestStatusListener(statusListener);
        synchronized (this.mUrlRequestAdapterLock) {
            try {
                if (this.mUrlRequestAdapter != 0) {
                    CronetUrlRequestJni.get().getStatus(this.mUrlRequestAdapter, urlRequestStatusListener);
                } else {
                    postTaskToExecutor(new Runnable(this) { // from class: org.chromium.net.impl.CronetUrlRequest.2
                        final /* synthetic */ CronetUrlRequest this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequest#getStatus running callback");
                            try {
                                urlRequestStatusListener.onStatus(-1);
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
                    }, "getStatus");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setOnDestroyedCallbackForTesting(Runnable runnable) {
        synchronized (this.mUrlRequestAdapterLock) {
            this.mOnDestroyedCallbackForTesting = runnable;
        }
    }

    public void setOnDestroyedUploadCallbackForTesting(Runnable runnable) {
        this.mUploadDataStream.setOnDestroyedCallbackForTesting(runnable);
    }

    public long getUrlRequestAdapterForTesting() {
        long j;
        synchronized (this.mUrlRequestAdapterLock) {
            j = this.mUrlRequestAdapter;
        }
        return j;
    }

    private void postTaskToExecutor(final Runnable runnable, final String str) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequest#postTaskToExecutor " + str);
        try {
            try {
                this.mExecutor.execute(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CronetUrlRequest.lambda$postTaskToExecutor$0(str, runnable);
                    }
                });
            } catch (RejectedExecutionException e) {
                Log.e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", (Throwable) e);
                failWithException(new CronetExceptionImpl("Exception posting task to executor", e));
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$postTaskToExecutor$0(String str, Runnable runnable) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequest#postTaskToExecutor " + str + " running callback");
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

    private UrlResponseInfoImpl prepareResponseInfoOnNetworkThread(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i2], strArr[i2 + 1]));
        }
        return new UrlResponseInfoImpl(new ArrayList(this.mUrlChain), i, str, arrayList, z, str2, str3, j);
    }

    private void checkNotStarted() {
        synchronized (this.mUrlRequestAdapterLock) {
            try {
                if (this.mStarted || isDoneLocked()) {
                    throw new IllegalStateException("Request is already started.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public CronetMetrics getFinishedRequestTimings() {
        return this.mMetrics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyRequestAdapterLocked(int i) {
        this.mFinishedReason = i;
        if (this.mUrlRequestAdapter == 0) {
            return;
        }
        this.mRequestContext.onRequestDestroyed();
        CronetUrlRequestJni.get().destroy(this.mUrlRequestAdapter, i == 2);
        this.mUrlRequestAdapter = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNonfinalCallbackException(Exception exc) {
        this.mNonfinalUserCallbackExceptionCount++;
        CallbackExceptionImpl callbackExceptionImpl = new CallbackExceptionImpl("Exception received from UrlRequest.Callback", exc);
        Log.e(CronetUrlRequestContext.LOG_TAG, "Exception in CalledByNative method", (Throwable) exc);
        failWithException(callbackExceptionImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFinalCallbackException(String str, Exception exc) {
        this.mFinalUserCallbackThrew = true;
        Log.e(CronetUrlRequestContext.LOG_TAG, "Exception in " + str + " method", (Throwable) exc);
    }

    void onUploadException(Throwable th) {
        CallbackExceptionImpl callbackExceptionImpl = new CallbackExceptionImpl("Exception received from UploadDataProvider", th);
        Log.e(CronetUrlRequestContext.LOG_TAG, "Exception in upload method", th);
        failWithException(callbackExceptionImpl);
    }

    private void failWithException(CronetException cronetException) {
        synchronized (this.mUrlRequestAdapterLock) {
            try {
                if (isDoneLocked()) {
                    return;
                }
                this.mException = cronetException;
                destroyRequestAdapterLocked(1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @CalledByNative
    private void onRedirectReceived(final String str, int i, String str2, String[] strArr, boolean z, String str3, String str4, long j) {
        final UrlResponseInfoImpl prepareResponseInfoOnNetworkThread = prepareResponseInfoOnNetworkThread(i, str2, strArr, z, str3, str4, j);
        this.mUrlChain.add(str);
        postTaskToExecutor(new Runnable(this) { // from class: org.chromium.net.impl.CronetUrlRequest.3
            final /* synthetic */ CronetUrlRequest this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.checkCallingThread();
                synchronized (this.this$0.mUrlRequestAdapterLock) {
                    try {
                        if (this.this$0.isDoneLocked()) {
                            return;
                        }
                        this.this$0.mWaitingOnRedirect = true;
                        try {
                            this.this$0.mCallback.onRedirectReceived(this.this$0, prepareResponseInfoOnNetworkThread, str);
                        } catch (Exception e) {
                            this.this$0.onNonfinalCallbackException(e);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }, "onRedirectReceived");
    }

    @CalledByNative
    private void onResponseStarted(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        this.mResponseInfo = prepareResponseInfoOnNetworkThread(i, str, strArr, z, str2, str3, j);
        postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.4
            @Override // java.lang.Runnable
            public void run() {
                CronetUrlRequest.this.checkCallingThread();
                synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    try {
                        if (CronetUrlRequest.this.isDoneLocked()) {
                            return;
                        }
                        CronetUrlRequest.this.mWaitingOnRead = true;
                        try {
                            VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                            CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                            urlRequestCallback.onResponseStarted(cronetUrlRequest, cronetUrlRequest.mResponseInfo);
                        } catch (Exception e) {
                            CronetUrlRequest.this.onNonfinalCallbackException(e);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }, "onResponseStarted");
    }

    @CalledByNative
    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.mResponseInfo.setReceivedByteCount(j);
        if (byteBuffer.position() != i2 || byteBuffer.limit() != i3) {
            failWithException(new CronetExceptionImpl("ByteBuffer modified externally during read", null));
            return;
        }
        if (this.mOnReadCompletedTask == null) {
            this.mOnReadCompletedTask = new OnReadCompletedRunnable();
        }
        OnReadCompletedRunnable onReadCompletedRunnable = this.mOnReadCompletedTask;
        onReadCompletedRunnable.mByteBuffer = byteBuffer;
        postTaskToExecutor(onReadCompletedRunnable, "onReadCompleted");
    }

    @CalledByNative
    private void onSucceeded(long j) {
        this.mResponseInfo.setReceivedByteCount(j);
        postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.5
            @Override // java.lang.Runnable
            public void run() {
                synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    try {
                        if (CronetUrlRequest.this.isDoneLocked()) {
                            return;
                        }
                        CronetUrlRequest.this.destroyRequestAdapterLocked(0);
                        try {
                            VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                            CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                            urlRequestCallback.onSucceeded(cronetUrlRequest, cronetUrlRequest.mResponseInfo);
                        } catch (Exception e) {
                            CronetUrlRequest.this.onFinalCallbackException("onSucceeded", e);
                        }
                        CronetUrlRequest.this.maybeReportMetrics();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }, "onSucceeded");
    }

    @CalledByNative
    private void onError(int i, int i2, int i3, int i4, String str, long j) {
        UrlResponseInfoImpl urlResponseInfoImpl = this.mResponseInfo;
        if (urlResponseInfoImpl != null) {
            urlResponseInfoImpl.setReceivedByteCount(j);
        }
        if (i == 10 || i3 != 0) {
            failWithException(new QuicExceptionImpl("Exception in CronetUrlRequest: " + str, i, i2, i3, i4));
            return;
        }
        failWithException(new NetworkExceptionImpl("Exception in CronetUrlRequest: " + str, mapUrlRequestErrorToApiErrorCode(i), i2));
    }

    @CalledByNative
    private void onCanceled() {
        if (this.mMetrics == null) {
            this.mMetrics = CronetMetrics.empty();
        }
        postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                    CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                    urlRequestCallback.onCanceled(cronetUrlRequest, cronetUrlRequest.mResponseInfo);
                } catch (Exception e) {
                    CronetUrlRequest.this.onFinalCallbackException("onCanceled", e);
                }
                CronetUrlRequest.this.maybeReportMetrics();
            }
        }, "onCanceled");
    }

    @CalledByNative
    private void onStatus(final VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener, final int i) {
        postTaskToExecutor(new Runnable(this) { // from class: org.chromium.net.impl.CronetUrlRequest.7
            final /* synthetic */ CronetUrlRequest this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                urlRequestStatusListener.onStatus(UrlRequestUtil.convertLoadState(i));
            }
        }, "onStatus");
    }

    @CalledByNative
    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, boolean z2, boolean z3) {
        if (this.mMetrics != null) {
            throw new IllegalStateException("Metrics collection should only happen once.");
        }
        this.mMetrics = new CronetMetrics(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15);
        this.mQuicConnectionMigrationAttempted = z2;
        this.mQuicConnectionMigrationSuccessful = z3;
    }

    @CalledByNative
    private void onNativeAdapterDestroyed() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetUrlRequest#onNativeAdapterDestroyed");
        try {
            synchronized (this.mUrlRequestAdapterLock) {
                try {
                    Runnable runnable = this.mOnDestroyedCallbackForTesting;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (this.mException == null) {
                        if (scoped != null) {
                            scoped.close();
                            return;
                        }
                        return;
                    }
                    if (this.mMetrics == null) {
                        this.mMetrics = CronetMetrics.empty();
                    }
                    Runnable runnable2 = new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.8
                        @Override // java.lang.Runnable
                        public void run() {
                            ScopedSysTraceEvent scoped2 = ScopedSysTraceEvent.scoped("CronetUrlRequest#onNativeAdapterDestroyed running callback");
                            try {
                                try {
                                    VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                                    CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                                    urlRequestCallback.onFailed(cronetUrlRequest, cronetUrlRequest.mResponseInfo, CronetUrlRequest.this.mException);
                                } catch (Exception e) {
                                    CronetUrlRequest.this.onFinalCallbackException("onFailed", e);
                                }
                                CronetUrlRequest.this.maybeReportMetrics();
                                if (scoped2 != null) {
                                    scoped2.close();
                                }
                            } catch (Throwable th) {
                                if (scoped2 != null) {
                                    try {
                                        scoped2.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        }
                    };
                    ScopedSysTraceEvent scoped2 = ScopedSysTraceEvent.scoped("CronetUrlRequest#onNativeAdapterDestroyed scheduling callback");
                    try {
                        try {
                            this.mExecutor.execute(runnable2);
                        } catch (RejectedExecutionException e) {
                            Log.e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", (Throwable) e);
                        }
                        if (scoped2 != null) {
                            scoped2.close();
                        }
                        if (scoped != null) {
                            scoped.close();
                        }
                    } finally {
                    }
                } finally {
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

    void checkCallingThread() {
        if (!this.mAllowDirectExecutor && this.mRequestContext.isNetworkThread(Thread.currentThread())) {
            throw new InlineExecutionProhibitedException();
        }
    }

    private int mapUrlRequestErrorToApiErrorCode(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            default:
                Log.e(CronetUrlRequestContext.LOG_TAG, "Unknown error code: " + i);
                return i;
        }
    }

    @RequiresApi
    private CronetLogger.CronetTrafficInfo buildCronetTrafficInfo() {
        Map<String, List<String>> emptyMap;
        boolean z;
        int i;
        String str;
        long estimateHeadersSizeInBytes;
        long max;
        long estimateHeadersSizeInBytes2;
        long max2;
        Duration ofSeconds;
        Duration ofSeconds2;
        int i2;
        int i3;
        int i4;
        CronetLogger.CronetTrafficInfo.RequestFailureReason requestFailureReason;
        UrlResponseInfoImpl urlResponseInfoImpl = this.mResponseInfo;
        if (urlResponseInfoImpl != null) {
            emptyMap = urlResponseInfoImpl.getAllHeaders();
            String negotiatedProtocol = this.mResponseInfo.getNegotiatedProtocol();
            int httpStatusCode = this.mResponseInfo.getHttpStatusCode();
            z = this.mResponseInfo.wasCached();
            str = negotiatedProtocol;
            i = httpStatusCode;
        } else {
            emptyMap = Collections.emptyMap();
            z = false;
            i = 0;
            str = "";
        }
        long longValue = this.mMetrics.getSentByteCount().longValue();
        if (z && longValue == 0) {
            estimateHeadersSizeInBytes = 0;
            max = 0;
        } else {
            estimateHeadersSizeInBytes = CronetRequestCommon.estimateHeadersSizeInBytes(this.mRequestHeaders);
            max = Math.max(0L, longValue - estimateHeadersSizeInBytes);
        }
        long longValue2 = this.mMetrics.getReceivedByteCount().longValue();
        if (z && longValue2 == 0) {
            estimateHeadersSizeInBytes2 = 0;
            max2 = 0;
        } else {
            estimateHeadersSizeInBytes2 = CronetRequestCommon.estimateHeadersSizeInBytes(emptyMap);
            max2 = Math.max(0L, longValue2 - estimateHeadersSizeInBytes2);
        }
        if (this.mMetrics.getRequestStart() != null && this.mMetrics.getResponseStart() != null) {
            ofSeconds = Duration.ofMillis(this.mMetrics.getResponseStart().getTime() - this.mMetrics.getRequestStart().getTime());
        } else {
            ofSeconds = Duration.ofSeconds(0L);
        }
        if (this.mMetrics.getRequestStart() != null && this.mMetrics.getRequestEnd() != null) {
            ofSeconds2 = Duration.ofMillis(this.mMetrics.getRequestEnd().getTime() - this.mMetrics.getRequestStart().getTime());
        } else {
            ofSeconds2 = Duration.ofSeconds(0L);
        }
        Duration duration = ofSeconds2;
        CronetLogger.CronetTrafficInfo.RequestFailureReason requestFailureReason2 = CronetLogger.CronetTrafficInfo.RequestFailureReason.UNKNOWN;
        CronetException cronetException = this.mException;
        if (cronetException instanceof NetworkExceptionImpl) {
            i3 = 0;
            i4 = 0;
            i2 = ((NetworkExceptionImpl) cronetException).getCronetInternalErrorCode();
            requestFailureReason = CronetLogger.CronetTrafficInfo.RequestFailureReason.NETWORK;
        } else if (cronetException instanceof QuicExceptionImpl) {
            QuicExceptionImpl quicExceptionImpl = (QuicExceptionImpl) cronetException;
            int cronetInternalErrorCode = quicExceptionImpl.getCronetInternalErrorCode();
            int quicDetailedErrorCode = quicExceptionImpl.getQuicDetailedErrorCode();
            i2 = cronetInternalErrorCode;
            i4 = quicExceptionImpl.getConnectionCloseSource();
            i3 = quicDetailedErrorCode;
            requestFailureReason = CronetLogger.CronetTrafficInfo.RequestFailureReason.NETWORK;
        } else {
            if (cronetException != null) {
                requestFailureReason2 = CronetLogger.CronetTrafficInfo.RequestFailureReason.OTHER;
            }
            i2 = 0;
            i3 = 0;
            i4 = 0;
            requestFailureReason = requestFailureReason2;
        }
        boolean z2 = this.mQuicConnectionMigrationAttempted;
        boolean z3 = this.mQuicConnectionMigrationSuccessful;
        CronetLogger.CronetTrafficInfo.RequestTerminalState finishedReasonToCronetTrafficInfoRequestTerminalState = CronetRequestCommon.finishedReasonToCronetTrafficInfoRequestTerminalState(this.mFinishedReason);
        int i5 = this.mNonfinalUserCallbackExceptionCount;
        int i6 = this.mReadCount;
        CronetUploadDataStream cronetUploadDataStream = this.mUploadDataStream;
        return new CronetLogger.CronetTrafficInfo(estimateHeadersSizeInBytes, max, estimateHeadersSizeInBytes2, max2, i, ofSeconds, duration, str, z2, z3, finishedReasonToCronetTrafficInfoRequestTerminalState, i5, i6, cronetUploadDataStream != null ? cronetUploadDataStream.getReadCount() : 0, false, this.mFinalUserCallbackThrew, Process.myUid(), i2, i3, i4, requestFailureReason, this.mMetrics.getSocketReused(), ImplVersion.getCronetVersion(), NativeCronetEngineBuilderImpl.getCronetSource(), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getDnsStart(), this.mMetrics.getDnsEnd(), -1L), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getSslStart(), this.mMetrics.getSslEnd(), -1L), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getConnectStart(), this.mMetrics.getConnectEnd(), -1L), CronetMetrics.getDateDeltaMillisOrDefault(this.mMetrics.getRequestStart(), this.mMetrics.getSendingStart(), -1L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeReportMetrics() {
        RefCountDelegate refCountDelegate = new RefCountDelegate(new Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                CronetUrlRequest.this.lambda$maybeReportMetrics$1();
            }
        });
        try {
            if (this.mMetrics == null) {
                throw new IllegalStateException("The metrics should have been initialized.");
            }
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    this.mLogger.logCronetTrafficInfo(this.mRequestContext.getLogId(), buildCronetTrafficInfo());
                } catch (RuntimeException e) {
                    Log.e(CronetUrlRequestContext.LOG_TAG, "Error while trying to log CronetTrafficInfo: ", (Throwable) e);
                }
            }
            this.mRequestContext.reportRequestFinished(new RequestFinishedInfoImpl(this.mInitialUrl, this.mRequestAnnotations, this.mMetrics, this.mFinishedReason, this.mResponseInfo, this.mException), refCountDelegate, this.mRequestFinishedListener);
        } finally {
            refCountDelegate.decrement();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeReportMetrics$1() {
        this.mRequestContext.onRequestFinished();
    }
}
