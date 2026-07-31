package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ṯ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1054 extends AbstractRunnableC0913 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1052 f2661;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1191 f2662;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONArray f2663;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2664;

    public C1054(C1052 c1052, boolean z, JSONArray jSONArray, C1191 c1191) {
        this.f2661 = c1052;
        this.f2664 = z;
        this.f2663 = jSONArray;
        this.f2662 = c1191;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        JSONObject mo4064 = this.f2661.mo4064(null, this.f2664, false, false);
        try {
            mo4064.put(StringFog.decrypt("f7w/rkfi\n", "GspawDORG9s=\n"), this.f2663);
        } catch (JSONException e) {
            String decrypt = StringFog.decrypt("+4n6/UbBHzDJou30UcExNtSC6fBL2gQ=\n", "uuebkT+1dlM=\n");
            AbstractC0580.m4080(decrypt, decrypt, StringFog.decrypt("XJsQsYg1/fJ8iBa3lHK+5W+MDKq3cOrh\n", "Geli3voVnoA=\n"), e, null, false);
        }
        AbstractC1026.m4313(new C1060(this, mo4064));
    }
}
