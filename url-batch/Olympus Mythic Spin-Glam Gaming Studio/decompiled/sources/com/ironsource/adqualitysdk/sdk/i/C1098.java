package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ῐ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C1098 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2808;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2809;

    public C1098(String str, JSONObject jSONObject) {
        this.f2809 = jSONObject;
        this.f2808 = str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1335 m4394() {
        DataOutputStream dataOutputStream;
        JSONObject jSONObject = this.f2809;
        try {
            HttpURLConnection m4397 = AbstractC1099.m4397(this.f2808);
            byte[] m4399 = AbstractC1099.m4399(m4397, jSONObject);
            String str = AbstractC0530.f589;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                m4397.connect();
                dataOutputStream = new DataOutputStream(IronSourceNetworkBridge.urlConnectionGetOutputStream(m4397));
                try {
                    dataOutputStream.write(m4399);
                    dataOutputStream.flush();
                    AbstractC1099.m4398(dataOutputStream);
                    String m4396 = AbstractC1099.m4396(m4397);
                    int httpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(m4397);
                    String responseMessage = m4397.getResponseMessage();
                    if (httpUrlConnectionGetResponseCode >= 400) {
                        IronSourceNetworkBridge.httpUrlConnectionDisconnect(m4397);
                    }
                    return new C1335(m4396, httpUrlConnectionGetResponseCode, responseMessage, SystemClock.elapsedRealtime() - elapsedRealtime);
                } catch (Throwable th) {
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC1099.m4398(dataOutputStream);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream = null;
            }
        } catch (Throwable th4) {
            String str2 = AbstractC1099.f2810;
            AbstractC0580.m4080(str2, str2, StringFog.decrypt("952nuS0I023ci7y4OAjQZ8Gb9aQ6WdVtwZvv9g==\n", "su/V1l8ooAg=\n") + th4.getLocalizedMessage(), th4, null, false);
            return null;
        }
    }
}
