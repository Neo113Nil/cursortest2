package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ț, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0419 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0404 f244;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1151 f245;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0515 f246;

    public C0419(C0404 c0404, C0515 c0515, C1151 c1151) {
        this.f244 = c0404;
        this.f246 = c0515;
        this.f245 = c1151;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        int i;
        C0404 c0404 = this.f244;
        C0916 c0916 = c0404.f224;
        String str = c0404.f225 + StringFog.decrypt("3A==\n", "9sBmsSj3M30=\n");
        C1041 c1041 = c0916.f2211;
        c1041.getClass();
        try {
            i = c1041.f2634.m4279(str);
        } catch (Throwable unused) {
            i = 0;
        }
        C0404 c04042 = this.f244;
        c04042.getClass();
        if (i <= 10000) {
            String str2 = c04042.f225 + this.f246.f478;
            if (TextUtils.isEmpty(str2)) {
                AbstractC0580.m4080(C0404.m3997(this.f244), StringFog.decrypt("zjWkt31REUf/NaC6\n", "jVTH3xgCZSg=\n"), StringFog.decrypt("nzCpppg56oepOaT0mBP4yews4LLdJLnUvzeytN81ucyuIeCz1yK5yKkypbbM\n", "y1jA1bhQmac=\n"), null, null, true);
                return;
            }
            try {
                C0515 c0515 = this.f246;
                c0515.getClass();
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                jsonObjectInit.put(StringFog.decrypt("JTbu8bHI//U=\n", "VVmdhfWpi5Q=\n"), c0515.f479);
                jsonObjectInit.put(StringFog.decrypt("lCqzYQ==\n", "4V/aBVjQI3E=\n"), c0515.f478);
                String jSONObject = jsonObjectInit.toString();
                AbstractC0580.m4079(C0404.m3997(this.f244), StringFog.decrypt("NP2hUrq2nXIF/aVf\n", "d5zCOt/l6R0=\n"), StringFog.decrypt("o3EAKtY+ZQyPcgkn3CQ4\n", "4BBjQr9QAiw=\n"), jSONObject, true);
                this.f244.f224.m4243(str2, jSONObject);
            } catch (JSONException unused2) {
                return;
            }
        }
        C1151 c1151 = this.f245;
        if (c1151 != null) {
            AbstractC1026.m4312(c1151);
        }
    }
}
