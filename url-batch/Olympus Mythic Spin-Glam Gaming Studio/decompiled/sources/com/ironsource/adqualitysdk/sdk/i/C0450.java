package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʎ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0450 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0404 f335;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1275 f336;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ int f337;

    public C0450(C0404 c0404, int i, C1275 c1275) {
        this.f335 = c0404;
        this.f337 = i;
        this.f336 = c1275;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        HashMap hashMap;
        ArrayList arrayList = new ArrayList();
        C0404 c0404 = this.f335;
        C0916 c0916 = c0404.f224;
        String str = c0404.f225 + StringFog.decrypt("Rg==\n", "bFPPFKFUHes=\n");
        int i = this.f337;
        C1041 c1041 = c0916.f2211;
        c1041.getClass();
        try {
            HashMap m4281 = c1041.f2634.m4281(str, i);
            hashMap = new HashMap();
            for (String str2 : m4281.keySet()) {
                String str3 = (String) m4281.get(str2);
                if (str3 != null && !TextUtils.isEmpty(str3)) {
                    try {
                        hashMap.put(str2, c1041.f2635.m4328(str3));
                    } catch (C1074 unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
            hashMap = null;
        }
        for (String str4 : hashMap.values()) {
            try {
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str4);
                arrayList.add(new C0515(jsonObjectInit.optString(StringFog.decrypt("q2yxgQ==\n", "3hnY5Tt59TI=\n")), jsonObjectInit.getJSONObject(StringFog.decrypt("vEjPmxjrAT8=\n", "zCe871yKdV4=\n"))));
            } catch (Exception unused3) {
                AbstractC0580.m4080(C0404.m3997(this.f335), StringFog.decrypt("Wfqk9rQcwZNo+qD7\n", "GpvHntFPtfw=\n"), AbstractC0584.m4083("7v3h+tps44WN8ebz33ah0c7z9/7bZuSU2/f64pAit4Xf+/rxnnSlndj3rrY=\n", "rZKUlr4CxPE=\n", new StringBuilder(), str4), null, null, true);
            }
        }
        AbstractC1026.m4312(new C0460(this, arrayList));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo4007(Throwable th) {
        super.mo4007(th);
        AbstractC1026.m4312(new C0456(this));
    }
}
