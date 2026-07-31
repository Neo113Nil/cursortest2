package com.smaato.sdk.ng.vpaid.helpers;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.C4701ic;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.internal.partials.SmaatoNetworkBridge;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.vpaid.PlayerInfo;
import com.smaato.sdk.ng.vpaid.enums.VastError;
import com.smaato.sdk.ng.vpaid.utils.FileUtils;
import com.smaato.sdk.ng.vpaid.utils.Utils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;

/* loaded from: classes15.dex */
public class FileLoader {
    private static final String l = "FileLoader";
    private static boolean m;
    private final Context a;
    private final File b;
    private final Callback c;
    private final String d;
    private volatile HttpURLConnection e;
    private volatile boolean f;
    private volatile boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;

    public interface Callback {
        void onError(PlayerInfo playerInfo);

        void onFileLoaded(String str);

        void onProgress(double d);
    }

    private static class a {
        final String a;
        final int b;
        final Bitmap c;

        a(String str, int i, Bitmap bitmap) {
            this.a = str;
            this.b = i;
            this.c = bitmap;
        }
    }

    public FileLoader(String str, Context context, Callback callback, Boolean bool) {
        this.c = callback;
        this.a = context;
        this.d = str;
        this.k = bool.booleanValue();
        this.b = new File(FileUtils.getParentDir(context), TextUtils.isEmpty(str) ? "default_file" : FileUtils.obtainHashName(str));
    }

    private void a(Bitmap bitmap) {
        new AndroidBmpUtil().save(bitmap, this.b.getAbsolutePath());
    }

    private void b() {
        this.f = true;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.helpers.FileLoader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FileLoader.this.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        Callback callback = this.c;
        if (callback != null) {
            callback.onFileLoaded(this.b.getAbsolutePath());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Logger.e(l, "disconnect()");
        SmaatoNetworkBridge.httpUrlConnectionDisconnect(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            if (this.g) {
                return;
            }
            a a2 = a(this.d);
            if (a2 == null) {
                Callback callback = this.c;
                if (callback != null) {
                    callback.onError(new PlayerInfo("Error during loading file"));
                    return;
                }
                return;
            }
            Logger.d(l, "File length: " + a2.b);
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            int i2 = 0;
            while (!this.g && i < a2.b) {
                i = a(this.b, this.d, i, a2);
                i2++;
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str = l;
            Logger.d(str, "Load time: " + (currentTimeMillis2 / 1000.0d));
            Logger.d(str, "AttemptsCount: " + i2);
            if (i == a2.b) {
                b();
                return;
            }
            Bitmap bitmap = a2.c;
            if (bitmap != null) {
                a(bitmap);
                b();
                return;
            }
            Callback callback2 = this.c;
            if (callback2 != null) {
                callback2.onError(new PlayerInfo("Error during file loading, attemptsCount: " + i2));
            }
        } catch (Exception e) {
            Logger.e(l, "Unexpected FileLoader error: " + e.getMessage());
        }
    }

    private void f() {
        if (RequestParametersProvider.a(this.a) == 2 || m) {
            ExecutorHelper.getExecutor().submit(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.helpers.FileLoader$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    FileLoader.this.e();
                }
            });
            return;
        }
        Callback callback = this.c;
        if (callback != null) {
            callback.onError(new PlayerInfo("Mobile network. File will not be cached"));
        }
    }

    public static void setUseMobileNetworkForCaching(boolean z) {
        m = z;
    }

    public void start() {
        String str = l;
        Logger.d(str, "start");
        a();
        Logger.d(str, "Use mobile network for caching: " + m);
        if (TextUtils.isEmpty(this.d)) {
            this.c.onError(new PlayerInfo("FileUrl is empty"));
        } else if (!this.b.exists()) {
            f();
        } else {
            Logger.d(str, "File already exists");
            b();
        }
    }

    public void stop() {
        File file;
        String str = l;
        Logger.e(str, "stop()");
        this.g = true;
        if (this.e != null) {
            ExecutorHelper.getExecutor().submit(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.helpers.FileLoader$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    FileLoader.this.d();
                }
            });
        }
        if (this.f || (file = this.b) == null || !file.exists()) {
            return;
        }
        Logger.e(str, "remove bad file");
        this.b.delete();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable, java.io.FileOutputStream] */
    private int a(File file, String str, int i, a aVar) {
        InputStream inputStream;
        InputStream inputStream2;
        ?? r1;
        InputStream inputStream3 = null;
        try {
            this.e = a(str, i, aVar);
            inputStream2 = SmaatoNetworkBridge.urlConnectionGetInputStream(this.e);
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
                a(inputStream2);
                a((Closeable) r1);
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
            a(inputStream2);
            a((Closeable) r1);
            throw th;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream2.read(bArr);
                if (read == -1) {
                    a(inputStream2);
                    a((Closeable) r1);
                    return i;
                }
                r1.write(bArr, 0, read);
                i += read;
                a(i / aVar.b);
            }
        } catch (Exception e3) {
            e = e3;
            inputStream3 = r1;
            Logger.e(l, "appendFile interrupted: " + e.getMessage());
            a(inputStream2);
            a(inputStream3);
            return i;
        } catch (Throwable th3) {
            th = th3;
            a(inputStream2);
            a((Closeable) r1);
            throw th;
        }
    }

    private a a(String str) {
        try {
            try {
                try {
                    this.e = (HttpURLConnection) new URL(str).openConnection();
                    if (this.e != null && this.e.getHeaderFields() != null && this.e.getHeaderFields().get("content-Length") != null && this.e.getHeaderFields().get("content-Length").isEmpty()) {
                        Logger.e(l, "File not found by URL: " + this.d);
                        ErrorLog.postError(this.a, VastError.TRAFFICKING);
                        if (this.e != null) {
                            SmaatoNetworkBridge.httpUrlConnectionDisconnect(this.e);
                        }
                        return null;
                    }
                    this.e.setRequestMethod(C4701ic.a);
                    if (SmaatoNetworkBridge.httpUrlConnectionGetResponseCode(this.e) == 200) {
                        String headerField = this.e.getHeaderField(Command.HTTP_HEADER_ETAG);
                        int contentLength = this.e.getContentLength();
                        a aVar = new a(headerField, contentLength, (contentLength == -1 && this.k) ? EndCardFileDownloader.mLoad(this.d) : null);
                        if (this.e != null) {
                            SmaatoNetworkBridge.httpUrlConnectionDisconnect(this.e);
                        }
                        return aVar;
                    }
                    if (SmaatoNetworkBridge.httpUrlConnectionGetResponseCode(this.e) != 403 && SmaatoNetworkBridge.httpUrlConnectionGetResponseCode(this.e) != 206 && SmaatoNetworkBridge.httpUrlConnectionGetResponseCode(this.e) != 404) {
                        if (this.e != null) {
                            SmaatoNetworkBridge.httpUrlConnectionDisconnect(this.e);
                        }
                        return null;
                    }
                    Logger.e(l, "File not found by URL: " + this.d);
                    ErrorLog.postError(this.a, VastError.TRAFFICKING);
                    if (this.e != null) {
                        SmaatoNetworkBridge.httpUrlConnectionDisconnect(this.e);
                    }
                    return null;
                } catch (IOException unused) {
                    Logger.e(l, "File not found by URL: " + this.d);
                    ErrorLog.postError(this.a, VastError.FILE_NOT_FOUND);
                    if (this.e != null) {
                        SmaatoNetworkBridge.httpUrlConnectionDisconnect(this.e);
                    }
                    return null;
                }
            } catch (SocketTimeoutException unused2) {
                Logger.e(l, "Timeout by URL: " + this.d);
                ErrorLog.postError(this.a, VastError.TIMEOUT);
                if (this.e != null) {
                    SmaatoNetworkBridge.httpUrlConnectionDisconnect(this.e);
                }
                return null;
            }
        } catch (Throwable th) {
            if (this.e != null) {
                SmaatoNetworkBridge.httpUrlConnectionDisconnect(this.e);
            }
            throw th;
        }
    }

    private HttpURLConnection a(String str, int i, a aVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setRequestMethod(C4701ic.a);
        return httpURLConnection;
    }

    private void a(double d) {
        Callback callback = this.c;
        if (callback != null) {
            if (!this.h) {
                if (d > 0.25d) {
                    this.h = true;
                    callback.onProgress(0.25d);
                    return;
                }
                return;
            }
            if (!this.i) {
                if (d > 0.5d) {
                    this.i = true;
                    callback.onProgress(0.5d);
                    return;
                }
                return;
            }
            if (this.j || d <= 0.75d) {
                return;
            }
            this.j = true;
            callback.onProgress(0.75d);
        }
    }

    private void a() {
        if (Utils.isEmulator()) {
            Logger.e(l, "running on emulator");
            m = true;
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Logger.e(l, "Can't close stream");
            }
        }
    }
}
