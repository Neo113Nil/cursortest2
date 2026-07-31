package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮐ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C1221 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1187 f3212;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3213;

    public C1221(C1187 c1187, Activity activity) {
        this.f3212 = c1187;
        this.f3213 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        if (C1187.m4448(this.f3212, this.f3213)) {
            AbstractC1026.m4316(new C1231(this));
            C1187 c1187 = this.f3212;
            c1187.f3078 = false;
            c1187.f3079 = true;
            if ((!c1187.f3080 || c1187.f3077) && !this.f3213.isFinishing()) {
                C1187 c11872 = this.f3212;
                Activity activity = this.f3213;
                c11872.getClass();
                String hexString = Integer.toHexString(activity.hashCode());
                if (c11872.f3080) {
                    JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                    try {
                        jsonObjectInit.put(AbstractC1183.f3020, true);
                    } catch (JSONException e) {
                        AbstractC0580.m4072(C1187.f3075, StringFog.decrypt("yNHRNTzttkHpys09bqm4a+LX8D8gqfdR4oPJKSGj7QU=\n", "jaOjWk7N1yU=\n") + e.getLocalizedMessage());
                    }
                    c11872.m4226(jsonObjectInit, activity, hexString);
                } else {
                    c11872.f3080 = true;
                    c11872.m4226(IronSourceNetworkBridge.jsonObjectInit(), activity, hexString);
                }
            }
            this.f3212.f3077 = false;
        }
    }
}
