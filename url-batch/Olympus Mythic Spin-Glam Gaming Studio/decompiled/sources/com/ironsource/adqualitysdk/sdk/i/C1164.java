package com.ironsource.adqualitysdk.sdk.i;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.忄, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1164 implements InterfaceC1078 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0880 f2961;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0785 f2962;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1064 f2963;

    public C1164(C1064 c1064, C0785 c0785, C0880 c0880) {
        this.f2963 = c1064;
        this.f2962 = c0785;
        this.f2961 = c0880;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1078
    /* renamed from: ﾒ */
    public final JSONObject mo4239(String str, JSONObject jSONObject) {
        return (JSONObject) this.f2963.m4337(this.f2962, this.f2961, Arrays.asList(str, jSONObject)).f2276;
    }
}
