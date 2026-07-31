package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.device.ads.DTBFetchManager;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｎ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1304 extends HashMap implements InterfaceC1111 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1303 f3596;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1189 f3597;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1304(C1303 c1303, HashMap hashMap, C1189 c1189) {
        super(hashMap);
        this.f3596 = c1303;
        this.f3597 = c1189;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        DTBFetchManager dTBFetchManager = (DTBFetchManager) obj2;
        this.f3596.m4103(this, this.f3597, StringFog.decrypt("bFkuKTNjtJtlbAIOMXKlmGBsHwcbdqfdWHgY\n", "KA1sb1YX1/M=\n"), str, dTBFetchManager);
        return (DTBFetchManager) super.put(str, dTBFetchManager);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1111
    /* renamed from: ﾒ */
    public final Object mo3996() {
        return this;
    }
}
