package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ῑ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC1099 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f2810 = StringFog.decrypt("AkgEaFtccWw=\n", "TC1wPS81HR8=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static C1335 m4395(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod(StringFog.decrypt("ZEt/\n", "Iw4rwwH3WCg=\n"));
            String str2 = AbstractC0530.f589;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String m4396 = m4396(httpURLConnection);
            int httpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            String responseMessage = httpURLConnection.getResponseMessage();
            if (httpUrlConnectionGetResponseCode >= 400) {
                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            }
            return new C1335(m4396, httpUrlConnectionGetResponseCode, responseMessage, SystemClock.elapsedRealtime() - elapsedRealtime);
        } catch (Throwable th) {
            String str3 = f2810;
            AbstractC0580.m4080(str3, str3, StringFog.decrypt("/nY0t0ivzn7VYC+2Xa/afs8kNL1L+thozz5m\n", "uwRG2DqPvRs=\n") + th.getLocalizedMessage(), th, null, false);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static HttpURLConnection m4397(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(StringFog.decrypt("2/xX1g==\n", "i7MEgj7P874=\n"));
        httpURLConnection.setRequestProperty(StringFog.decrypt("bn5Hdpre0fB5aFln\n", "LREpAv+wpd0=\n"), StringFog.decrypt("O2TLbGF6uH8ze9UvYmq2ZWE02Ghpa6puLinOdG404Q==\n", "WhS7AAgZ2Qs=\n"));
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        return httpURLConnection;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m4396(HttpURLConnection httpURLConnection) {
        Throwable th;
        InputStream inputStream;
        BufferedReader bufferedReader;
        try {
            inputStream = IronSourceNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            if (stringBuffer.length() > 0) {
                                stringBuffer.append('\r');
                            }
                            stringBuffer.append(readLine);
                        } else {
                            return stringBuffer.toString();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    try {
                        String str = f2810;
                        AbstractC0580.m4080(str, str, StringFog.decrypt("wEgFPUjKBePxTh48XcoQ4/ZKGDxJjw==\n", "hTp3UjrqYoY=\n"), th3, null, false);
                        return null;
                    } finally {
                        m4398(inputStream);
                        m4398(bufferedReader);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
                Throwable th32 = th;
                String str2 = f2810;
                AbstractC0580.m4080(str2, str2, StringFog.decrypt("wEgFPUjKBePxTh48XcoQ4/ZKGDxJjw==\n", "hTp3UjrqYoY=\n"), th32, null, false);
                return null;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4398(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static byte[] m4399(HttpURLConnection httpURLConnection, JSONObject jSONObject) {
        String str;
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        String jSONObject2 = jSONObject.toString();
        String str2 = AbstractC0737.f1661;
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(AbstractC0737.f1660.getBytes(StringFog.decrypt("R59m3vQ=\n", "Essg88zQb4o=\n")), mac.getAlgorithm()));
            str = AbstractC1048.m4323(mac.doFinal(jSONObject2.replaceAll(" ", "").replaceAll("\n", "").getBytes(StringFog.decrypt("1uXQTk8=\n", "g7GWY3f8FJQ=\n"))));
        } catch (Exception e) {
            AbstractC0580.m4072(AbstractC0737.f1661, StringFog.decrypt("zzUmIkMqpQ==\n", "ikdUTTEQheY=\n") + e.getLocalizedMessage());
            str = null;
        }
        String substring = jSONObject2.substring(0, jSONObject2.lastIndexOf(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE));
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        String m4543 = AbstractC1293.m4543("TG0=\n", "bhB1ZCL7zlU=\n", AbstractC0446.m4006("19t6DyDY1Q==\n", "+/kSfALi97M=\n", sb, str));
        byte[] bytes = m4543.getBytes(StringFog.decrypt("wGxqisY=\n", "lTgsp/7mJA4=\n"));
        if (m4543.length() <= 256) {
            return bytes;
        }
        httpURLConnection.setRequestProperty(StringFog.decrypt("rk/L5SCiOBqoTsb+IaUiUA==\n", "7SClkUXMTDc=\n"), StringFog.decrypt("rsaTMg==\n", "ybz6QspStc8=\n"));
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
            gZIPOutputStream = gZIPOutputStream2;
        }
        try {
            gZIPOutputStream.write(bytes);
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e3) {
            e = e3;
            gZIPOutputStream2 = gZIPOutputStream;
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            th = th2;
            if (gZIPOutputStream != null) {
                try {
                    gZIPOutputStream.close();
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }
}
