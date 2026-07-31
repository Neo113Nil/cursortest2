package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɢ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0428 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0422 f295;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ int f296;

    public C0428(C0422 c0422, int i) {
        this.f295 = c0422;
        this.f296 = i;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        int i;
        JSONObject jSONObject;
        C1087 c1087 = this.f295.f251;
        if (this.f296 >= c1087.f2772.m4385().m4271()) {
            i = 0;
        } else {
            C1086 c1086 = c1087.f2772;
            if (c1086.m4385() == null || ((C0600) AbstractC0590.m4087()).f1007) {
                i = 100;
            } else {
                C0972 m4385 = c1086.m4385();
                synchronized (m4385) {
                    jSONObject = m4385.f2998;
                }
                i = jSONObject.optInt(StringFog.decrypt("7bXA\n", "iMa01MmXolg=\n"), m4385.f2333);
            }
        }
        C1086 c10862 = c1087.f2772;
        c10862.f2766.removeCallbacksAndMessages(null);
        c10862.f2766.postDelayed(new C1283(c10862), i);
    }
}
