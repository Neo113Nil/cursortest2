package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ẏ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1060 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1054 f2675;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2676;

    public C1060(C1054 c1054, JSONObject jSONObject) {
        this.f2675 = c1054;
        this.f2676 = jSONObject;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        String m4267;
        JSONObject jSONObject;
        C1191 c1191 = this.f2675.f2662;
        JSONObject jSONObject2 = this.f2676;
        c1191.f3087.f2759.m4297(jSONObject2);
        C1086 c1086 = c1191.f3087;
        C1007 c1007 = c1086.f2769;
        C0495 c0495 = c1086.f2771;
        if (((C0600) AbstractC0590.m4087()).f1007) {
            m4267 = c1086.m4385().m4267();
        } else {
            C0972 m4385 = c1086.m4385();
            synchronized (m4385) {
                jSONObject = m4385.f2998;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(StringFog.decrypt("mc3f\n", "7L+z7L0HmoI=\n"));
            m4267 = optJSONObject != null ? optJSONObject.optString(StringFog.decrypt("5A==\n", "lGy/NqZdyjo=\n"), m4385.f2332) : m4385.f2332;
        }
        String str = c0495.f439;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(StringFog.decrypt("wQ==\n", "7nrFTMm1qjA=\n"));
        if (m4267 == null) {
            m4267 = "";
        }
        sb.append(m4267);
        String sb2 = sb.toString();
        C1193 c1193 = new C1193(c1191);
        c1007.getClass();
        if (TextUtils.isEmpty(sb2)) {
            String str2 = C1007.f2437;
            String decrypt = StringFog.decrypt("ZVplfwkCsPxfFHRyFhOw60VHcHIIR+LtQUFhbhFH9eFEXGFvRTLCxBBbdj0XAuP4X1p3eC0G/uxc\nUXY9EgLi7RBaa2lFF+LnRl1geAE=\n", "MDQEHWVnkIg=\n");
            if (AbstractC0580.m4075()) {
                Log.v(AbstractC0580.m4077(str2), decrypt);
                return;
            } else {
                if (AbstractC0580.m4076().shouldPrintLog(ISAdQualityLogLevel.VERBOSE)) {
                    Log.v(AbstractC0580.m4077(str2), decrypt);
                    return;
                }
                return;
            }
        }
        C1098 c1098 = new C1098(sb2, jSONObject2);
        if (c1007.f2438) {
            AbstractC0580.m4072(C1007.f2437, StringFog.decrypt("lX2KOLSi8sGyYI44v+zjjuZ7iSu0p/Kzo2OSOKi4t5aud4l9lanjlqlgjBC6ovaGo2DHKrq/t5Ku\nZ5M5tLv5\n", "xhLnXdvMl+E=\n"));
            return;
        }
        C1029 c1029 = new C1029(c1007, c1193, c1098);
        String str3 = AbstractC0530.f589;
        try {
            Executors.newSingleThreadExecutor().execute(c1029);
        } catch (Throwable th) {
            AbstractC0577.m4068(AbstractC0530.f589, StringFog.decrypt("CIuQwnq/D1oompfZYfENAiyKm8Nrvx5DPpI=\n", "TfnirQifaiI=\n"), th, false);
        }
    }
}
