package com.safedk.android.a;

import com.mbridge.msdk.foundation.download.Command;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/* loaded from: classes13.dex */
public class b implements Runnable {
    private static final String a = "ConfigDownload";
    private static final int b = 2;
    private static final int[] c = {60000, POBCommonConstants.BANNER_BID_EXPIRE_TIME_IN_MILLIS};
    private e d;
    private final String e;
    private final String f;

    public b(e eVar, String str, String str2) {
        this.d = new e();
        this.d = eVar;
        this.e = str;
        this.f = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
    
        if (r8 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ce, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        r8.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0074, code lost:
    
        if (r8 == null) goto L24;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        f fVar;
        Throwable th;
        Exception e;
        String userId = SafeDK.getInstance().getUserId();
        f fVar2 = null;
        int i = 0;
        while (i <= 2) {
            try {
                URL url = new URL(this.e);
                Logger.d(a, "Config url: ", url);
                fVar = new f(url.openConnection());
                try {
                    fVar.a(false);
                    if (userId != null) {
                        fVar.a("Cookie", "user_id=" + userId);
                    }
                    if (this.f != null) {
                        fVar.a("If-None-Match", this.f);
                    }
                    fVar.f();
                    a(fVar);
                } catch (Exception e2) {
                    e = e2;
                    Logger.e(a, "Failed to download configuration", e);
                    this.d.b(e.getMessage());
                    if (i >= 2 || !a(e)) {
                        if (fVar == null) {
                            return;
                        }
                        return;
                    }
                    int a2 = a(i);
                    try {
                        Logger.d(a, "Next retry in ", Integer.valueOf(a2), " ms");
                        Thread.sleep(a2);
                    } catch (InterruptedException e3) {
                        Logger.e(a, "Thread interrupted while sleeping: ", e3);
                        Thread.currentThread().interrupt();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        Logger.e(a, "Caught exception", th);
                        new CrashReporter().caughtException(th);
                    } finally {
                        if (fVar != null) {
                            fVar.d();
                        }
                    }
                }
            } catch (Exception e4) {
                fVar = fVar2;
                e = e4;
            } catch (Throwable th3) {
                fVar = fVar2;
                th = th3;
            }
            return;
        }
    }

    private String a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            char[] cArr = new char[65536];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    break;
                }
                sb.append(cArr, 0, read);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            Logger.e(a, "Failed to read configuration from input stream", e);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r2 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int a(f fVar) throws IOException, HttpRetryException {
        int b2 = fVar.b();
        Logger.d(a, "response code = ", Integer.valueOf(b2));
        InputStream inputStream = null;
        try {
            if (b2 < 300) {
                try {
                    inputStream = fVar.e();
                    String a2 = a(inputStream);
                    Logger.d(a, "response = ", a2);
                    this.d.a(a2, b(fVar));
                } catch (IOException e) {
                    Logger.e(a, "Failed to get response from server", e);
                    this.d.a("Failed to read data from connection");
                } catch (Throwable th) {
                    Logger.e(a, "Caught exception", th);
                    new CrashReporter().caughtException(th);
                    if (inputStream != null) {
                    }
                }
            } else {
                if (b2 != 304) {
                    InputStream g = fVar.g();
                    String a3 = a(g);
                    this.d.a(a3);
                    if (g != null) {
                        g.close();
                    }
                    throw new HttpRetryException(a3, b2);
                }
                this.d.a(null, b(fVar));
            }
            return b2;
        } finally {
            if (0 != 0) {
                inputStream.close();
            }
        }
    }

    private int a(int i) {
        return c[i];
    }

    private boolean a(Exception exc) {
        if (exc.getClass().isInstance(InterruptedIOException.class) || exc.getClass().isInstance(UnknownHostException.class) || exc.getClass().isInstance(MalformedURLException.class)) {
            return false;
        }
        return true;
    }

    private String b(f fVar) {
        return fVar.b(Command.HTTP_HEADER_ETAG);
    }
}
