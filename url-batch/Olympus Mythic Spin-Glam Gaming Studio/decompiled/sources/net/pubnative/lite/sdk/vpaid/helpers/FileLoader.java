package net.pubnative.lite.sdk.vpaid.helpers;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.C4701ic;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.internal.partials.VerveNetworkBridge;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.enums.VastError;
import net.pubnative.lite.sdk.vpaid.utils.FileUtils;
import net.pubnative.lite.sdk.vpaid.utils.Utils;

/* loaded from: classes4.dex */
public class FileLoader {
    private static final int CONNECT_TIMEOUT = 10000;
    private static final String LOG_TAG = "FileLoader";
    private static final int READ_TIMEOUT = 10000;
    private static boolean useMobileNetworkForCaching;
    private boolean firstQuartile;
    private final Callback mCallback;
    private volatile HttpURLConnection mConnection;
    private final Context mContext;
    private boolean mIsEndCard;
    private volatile boolean mIsFileFullyDownloaded;
    private final File mLoadingFile;
    private final String mRemoteFileUrl;
    private volatile boolean mStop;
    private boolean midpoint;
    private boolean thirdQuartile;

    public interface Callback {
        void onError(PlayerInfo playerInfo);

        void onFileLoaded(String str);

        void onProgress(double d);
    }

    public FileLoader(String str, Context context, Callback callback, Boolean bool) {
        this.mCallback = callback;
        this.mContext = context;
        this.mRemoteFileUrl = str;
        this.mIsEndCard = bool.booleanValue();
        this.mLoadingFile = new File(FileUtils.getParentDir(context), TextUtils.isEmpty(str) ? "default_file" : FileUtils.obtainHashName(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable, java.io.FileOutputStream] */
    private int appendFile(File file, String str, int i, FileHeaders fileHeaders) {
        InputStream inputStream;
        InputStream inputStream2;
        ?? r1;
        InputStream inputStream3 = null;
        try {
            this.mConnection = obtainGetConnection(str, i, fileHeaders);
            inputStream2 = VerveNetworkBridge.urlConnectionGetInputStream(this.mConnection);
            try {
                try {
                    r1 = new FileOutputStream(file, true);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
                InputStream inputStream4 = inputStream3;
                inputStream3 = inputStream2;
                inputStream = inputStream4;
                r1 = inputStream;
                inputStream2 = inputStream3;
                closeStream(inputStream2);
                closeStream(r1);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            inputStream2 = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            r1 = inputStream;
            inputStream2 = inputStream3;
            closeStream(inputStream2);
            closeStream(r1);
            throw th;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream2.read(bArr);
                if (read == -1) {
                    closeStream(inputStream2);
                    closeStream(r1);
                    return i;
                }
                r1.write(bArr, 0, read);
                i += read;
                handleProgress(i / fileHeaders.fileLength);
            }
        } catch (Exception e3) {
            e = e3;
            inputStream3 = r1;
            Logger.e(LOG_TAG, "appendFile interrupted: " + e.getMessage());
            closeStream(inputStream2);
            closeStream(inputStream3);
            return i;
        } catch (Throwable th3) {
            th = th3;
            closeStream(inputStream2);
            closeStream(r1);
            throw th;
        }
    }

    private static void closeStream(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Logger.e(LOG_TAG, "Can't close stream");
            }
        }
    }

    private void handleEmulator() {
        if (Utils.isEmulator()) {
            Logger.e(LOG_TAG, "running on emulator");
            useMobileNetworkForCaching = true;
        }
    }

    private void handleFileFullDownloaded() {
        this.mIsFileFullyDownloaded = true;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.helpers.FileLoader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FileLoader.this.lambda$handleFileFullDownloaded$0();
            }
        });
    }

    private void handleProgress(double d) {
        Callback callback = this.mCallback;
        if (callback != null) {
            if (!this.firstQuartile) {
                if (d > 0.25d) {
                    this.firstQuartile = true;
                    callback.onProgress(0.25d);
                    return;
                }
                return;
            }
            if (!this.midpoint) {
                if (d > 0.5d) {
                    this.midpoint = true;
                    callback.onProgress(0.5d);
                    return;
                }
                return;
            }
            if (this.thirdQuartile || d <= 0.75d) {
                return;
            }
            this.thirdQuartile = true;
            callback.onProgress(0.75d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleFileFullDownloaded$0() {
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onFileLoaded(this.mLoadingFile.getAbsolutePath());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stop$1() {
        Logger.e(LOG_TAG, "disconnect()");
        VerveNetworkBridge.httpUrlConnectionDisconnect(this.mConnection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void load() {
        try {
            if (this.mStop) {
                return;
            }
            FileHeaders obtainHeaders = obtainHeaders(this.mRemoteFileUrl);
            if (obtainHeaders == null) {
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onError(new PlayerInfo("Error during loading file"));
                    return;
                }
                return;
            }
            Logger.d(LOG_TAG, "File length: " + obtainHeaders.fileLength);
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            int i2 = 0;
            while (!this.mStop && i < obtainHeaders.fileLength) {
                i = appendFile(this.mLoadingFile, this.mRemoteFileUrl, i, obtainHeaders);
                i2++;
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str = LOG_TAG;
            Logger.d(str, "Load time: " + (currentTimeMillis2 / 1000.0d));
            Logger.d(str, "AttemptsCount: " + i2);
            if (i == obtainHeaders.fileLength) {
                handleFileFullDownloaded();
                return;
            }
            Bitmap bitmap = obtainHeaders.bitmap;
            if (bitmap != null) {
                saveBitmapIntoFile(bitmap);
                handleFileFullDownloaded();
                return;
            }
            Callback callback2 = this.mCallback;
            if (callback2 != null) {
                callback2.onError(new PlayerInfo("Error during file loading, attemptsCount: " + i2));
            }
        } catch (Exception e) {
            Logger.e(LOG_TAG, "Unexpected FileLoader error: " + e.getMessage());
        }
    }

    private void maybeLoadFile() {
        if (RequestParametersProvider.getConnectionType(this.mContext) == 2 || useMobileNetworkForCaching) {
            ExecutorHelper.getExecutor().submit(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.helpers.FileLoader$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    FileLoader.this.load();
                }
            });
            return;
        }
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onError(new PlayerInfo("Mobile network. File will not be cached"));
        }
    }

    private HttpURLConnection obtainGetConnection(String str, int i, FileHeaders fileHeaders) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setRequestMethod(C4701ic.a);
        return httpURLConnection;
    }

    private FileHeaders obtainHeaders(String str) {
        try {
            try {
                try {
                    this.mConnection = (HttpURLConnection) new URL(str).openConnection();
                    if (this.mConnection != null && this.mConnection.getHeaderFields() != null && this.mConnection.getHeaderFields().get("content-Length") != null && this.mConnection.getHeaderFields().get("content-Length").isEmpty()) {
                        Logger.e(LOG_TAG, "File not found by URL: " + this.mRemoteFileUrl);
                        ErrorLog.postError(this.mContext, VastError.TRAFFICKING);
                        if (this.mConnection != null) {
                            VerveNetworkBridge.httpUrlConnectionDisconnect(this.mConnection);
                        }
                        return null;
                    }
                    this.mConnection.setRequestMethod(C4701ic.a);
                    if (VerveNetworkBridge.httpUrlConnectionGetResponseCode(this.mConnection) == 200) {
                        String headerField = this.mConnection.getHeaderField(Command.HTTP_HEADER_ETAG);
                        int contentLength = this.mConnection.getContentLength();
                        FileHeaders fileHeaders = new FileHeaders(headerField, contentLength, (contentLength == -1 && this.mIsEndCard) ? EndCardFileDownloader.mLoad(this.mRemoteFileUrl) : null);
                        if (this.mConnection != null) {
                            VerveNetworkBridge.httpUrlConnectionDisconnect(this.mConnection);
                        }
                        return fileHeaders;
                    }
                    if (VerveNetworkBridge.httpUrlConnectionGetResponseCode(this.mConnection) != 403 && VerveNetworkBridge.httpUrlConnectionGetResponseCode(this.mConnection) != 206 && VerveNetworkBridge.httpUrlConnectionGetResponseCode(this.mConnection) != 404) {
                        if (this.mConnection != null) {
                            VerveNetworkBridge.httpUrlConnectionDisconnect(this.mConnection);
                        }
                        return null;
                    }
                    Logger.e(LOG_TAG, "File not found by URL: " + this.mRemoteFileUrl);
                    ErrorLog.postError(this.mContext, VastError.TRAFFICKING);
                    if (this.mConnection != null) {
                        VerveNetworkBridge.httpUrlConnectionDisconnect(this.mConnection);
                    }
                    return null;
                } catch (IOException unused) {
                    Logger.e(LOG_TAG, "File not found by URL: " + this.mRemoteFileUrl);
                    ErrorLog.postError(this.mContext, VastError.FILE_NOT_FOUND);
                    if (this.mConnection != null) {
                        VerveNetworkBridge.httpUrlConnectionDisconnect(this.mConnection);
                    }
                    return null;
                }
            } catch (SocketTimeoutException unused2) {
                Logger.e(LOG_TAG, "Timeout by URL: " + this.mRemoteFileUrl);
                ErrorLog.postError(this.mContext, VastError.TIMEOUT);
                if (this.mConnection != null) {
                    VerveNetworkBridge.httpUrlConnectionDisconnect(this.mConnection);
                }
                return null;
            }
        } catch (Throwable th) {
            if (this.mConnection != null) {
                VerveNetworkBridge.httpUrlConnectionDisconnect(this.mConnection);
            }
            throw th;
        }
    }

    private void saveBitmapIntoFile(Bitmap bitmap) {
        new AndroidBmpUtil().save(bitmap, this.mLoadingFile.getAbsolutePath());
    }

    public static void setUseMobileNetworkForCaching(boolean z) {
        useMobileNetworkForCaching = z;
    }

    public void start() {
        String str = LOG_TAG;
        Logger.d(str, "start");
        handleEmulator();
        Logger.d(str, "Use mobile network for caching: " + useMobileNetworkForCaching);
        if (TextUtils.isEmpty(this.mRemoteFileUrl)) {
            this.mCallback.onError(new PlayerInfo("FileUrl is empty"));
        } else if (!this.mLoadingFile.exists()) {
            maybeLoadFile();
        } else {
            Logger.d(str, "File already exists");
            handleFileFullDownloaded();
        }
    }

    public void stop() {
        File file;
        String str = LOG_TAG;
        Logger.e(str, "stop()");
        this.mStop = true;
        if (this.mConnection != null) {
            ExecutorHelper.getExecutor().submit(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.helpers.FileLoader$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    FileLoader.this.lambda$stop$1();
                }
            });
        }
        if (this.mIsFileFullyDownloaded || (file = this.mLoadingFile) == null || !file.exists()) {
            return;
        }
        Logger.e(str, "remove bad file");
        this.mLoadingFile.delete();
    }

    private static class FileHeaders {
        final Bitmap bitmap;
        final String eTag;
        final int fileLength;

        FileHeaders(String str, int i) {
            this.eTag = str;
            this.fileLength = i;
            this.bitmap = null;
        }

        FileHeaders(String str, int i, Bitmap bitmap) {
            this.eTag = str;
            this.fileLength = i;
            this.bitmap = bitmap;
        }
    }
}
