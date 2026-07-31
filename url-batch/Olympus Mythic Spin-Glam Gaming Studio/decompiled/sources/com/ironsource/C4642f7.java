package com.ironsource;

import android.text.TextUtils;
import com.ironsource.InterfaceC4678h7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.f7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4642f7 {
    private static final int a = 15000;
    private static final String b = "GET";
    private static final String c = "POST";
    private static final String d = "UTF-8";
    public static final String e = "ERROR:";
    private static final String f = "Bad Request - 400";
    private static final ExecutorService g = Executors.newSingleThreadExecutor();

    /* renamed from: com.ironsource.f7$a */
    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ InterfaceC4660g7 c;

        a(String str, String str2, InterfaceC4660g7 interfaceC4660g7) {
            this.a = str;
            this.b = str2;
            this.c = interfaceC4660g7;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpURLConnection httpURLConnection;
            OutputStream outputStream;
            try {
                httpURLConnection = C4642f7.b(this.a);
            } catch (Exception e) {
                e = e;
                httpURLConnection = null;
                outputStream = null;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = null;
                outputStream = null;
            }
            try {
                outputStream = IronSourceNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
                try {
                    try {
                        C4642f7.a(this.b, outputStream);
                        int httpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                        boolean z = httpUrlConnectionGetResponseCode == 200;
                        if (!z) {
                            IronLog.INTERNAL.error("invalid response code " + httpUrlConnectionGetResponseCode + " sending request");
                        }
                        this.c.a(z);
                    } catch (Exception e2) {
                        e = e2;
                        C4782n4.d().a(e);
                        IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
                        this.c.a(false);
                        C4642f7.a(outputStream, httpURLConnection, (BufferedReader) null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C4642f7.a(outputStream, httpURLConnection, (BufferedReader) null);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                outputStream = null;
            } catch (Throwable th3) {
                th = th3;
                outputStream = null;
                C4642f7.a(outputStream, httpURLConnection, (BufferedReader) null);
                throw th;
            }
            C4642f7.a(outputStream, httpURLConnection, (BufferedReader) null);
        }
    }

    public static String a(String str) throws Exception {
        return a(str, (p.b) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HttpURLConnection b(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        return httpURLConnection;
    }

    public static String a(String str, p.b bVar) {
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        Exception e2;
        BufferedReader bufferedReader2;
        Throwable th;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                if (IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection) == 400) {
                    if (bVar != null) {
                        bVar.a("Bad Request - 400");
                    }
                    a((OutputStream) null, httpURLConnection, (BufferedReader) null);
                    return null;
                }
                bufferedReader2 = new BufferedReader(new InputStreamReader(IronSourceNetworkBridge.urlConnectionGetInputStream(httpURLConnection)));
                try {
                    String a2 = a(bufferedReader2);
                    a((OutputStream) null, httpURLConnection, bufferedReader2);
                    return a2;
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        C4782n4.d().a(e2);
                        a((OutputStream) null, httpURLConnection, bufferedReader2);
                        return null;
                    } catch (Throwable th2) {
                        bufferedReader = bufferedReader2;
                        th = th2;
                        BufferedReader bufferedReader3 = bufferedReader;
                        th = th;
                        bufferedReader2 = bufferedReader3;
                        a((OutputStream) null, httpURLConnection, bufferedReader2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    a((OutputStream) null, httpURLConnection, bufferedReader2);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                e2 = e;
                bufferedReader2 = null;
                C4782n4.d().a(e2);
                a((OutputStream) null, httpURLConnection, bufferedReader2);
                return null;
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
                BufferedReader bufferedReader32 = bufferedReader;
                th = th;
                bufferedReader2 = bufferedReader32;
                a((OutputStream) null, httpURLConnection, bufferedReader2);
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            httpURLConnection = null;
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            bufferedReader = null;
        }
    }

    public static void a(String str, String str2, InterfaceC4660g7 interfaceC4660g7) {
        g.submit(new a(str, str2, interfaceC4660g7));
    }

    @Nullable
    public static String a(String str, String str2, p.b bVar) {
        InterfaceC4678h7 a2 = a(str, str2);
        if (a2 instanceof InterfaceC4678h7.a) {
            InterfaceC4678h7.a aVar = (InterfaceC4678h7.a) a2;
            if (aVar.b()) {
                return null;
            }
            bVar.a(aVar.a());
            return null;
        }
        return ((InterfaceC4678h7.b) a2).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    public static InterfaceC4678h7 a(String str, String str2) {
        OutputStream outputStream;
        Exception e2;
        Exception e3;
        BufferedReader bufferedReader;
        ?? r0 = 0;
        r0 = 0;
        r0 = 0;
        try {
            try {
                str = b(str);
                try {
                    str.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                    outputStream = IronSourceNetworkBridge.urlConnectionGetOutputStream(str);
                } catch (Exception e4) {
                    e2 = e4;
                    outputStream = null;
                } catch (Throwable th) {
                    th = th;
                    outputStream = null;
                }
            } catch (Throwable th2) {
                r0 = str2;
                th = th2;
            }
            try {
                a(str2, outputStream);
                int httpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(str);
                if (httpUrlConnectionGetResponseCode == 200) {
                    bufferedReader = new BufferedReader(new InputStreamReader(IronSourceNetworkBridge.urlConnectionGetInputStream(str)));
                    try {
                        String a2 = a(bufferedReader);
                        if (a2 != null) {
                            InterfaceC4678h7.b bVar = new InterfaceC4678h7.b(a2);
                            a(outputStream, (HttpURLConnection) str, bufferedReader);
                            return bVar;
                        }
                        InterfaceC4678h7.a.c cVar = new InterfaceC4678h7.a.c();
                        a(outputStream, (HttpURLConnection) str, bufferedReader);
                        return cVar;
                    } catch (Exception e5) {
                        e3 = e5;
                        C4782n4.d().a(e3);
                        IronLog.INTERNAL.error("exception while sending request " + e3.getMessage());
                        InterfaceC4678h7.a.C1363a c1363a = new InterfaceC4678h7.a.C1363a(e3);
                        a(outputStream, (HttpURLConnection) str, bufferedReader);
                        return c1363a;
                    }
                }
                InterfaceC4678h7.a.b bVar2 = new InterfaceC4678h7.a.b(httpUrlConnectionGetResponseCode, str.getResponseMessage());
                a(outputStream, (HttpURLConnection) str, (BufferedReader) null);
                return bVar2;
            } catch (Exception e6) {
                e2 = e6;
                e3 = e2;
                bufferedReader = null;
                C4782n4.d().a(e3);
                IronLog.INTERNAL.error("exception while sending request " + e3.getMessage());
                InterfaceC4678h7.a.C1363a c1363a2 = new InterfaceC4678h7.a.C1363a(e3);
                a(outputStream, (HttpURLConnection) str, bufferedReader);
                return c1363a2;
            } catch (Throwable th3) {
                th = th3;
                a(outputStream, (HttpURLConnection) str, (BufferedReader) r0);
                throw th;
            }
        } catch (Exception e7) {
            e2 = e7;
            str = 0;
            outputStream = null;
        } catch (Throwable th4) {
            th = th4;
            str = 0;
            outputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        bufferedWriter.write(str);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    @Nullable
    private static String a(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            sb.append(readLine);
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return null;
        }
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(OutputStream outputStream, HttpURLConnection httpURLConnection, BufferedReader bufferedReader) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                C4782n4.d().a(e2);
                IronLog.INTERNAL.error("exception while closing output stream " + e2.getMessage());
            }
        }
        if (httpURLConnection != null) {
            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e3) {
                C4782n4.d().a(e3);
                IronLog.INTERNAL.error("exception while closing reader " + e3.getMessage());
            }
        }
    }
}
