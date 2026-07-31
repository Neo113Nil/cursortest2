package com.facebook.ads.redexgen.core;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.kJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3424kJ implements InterfaceC2473Mw {
    public final /* synthetic */ C3218gi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C3424kJ(JSONObject jSONObject, C3218gi c3218gi, String str) {
        this.A02 = jSONObject;
        this.A00 = c3218gi;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2473Mw
    public final String A7O() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2473Mw
    public final Collection<String> A7p() {
        return AbstractC2474Mx.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2473Mw
    public final EnumC2472Mv A8K() {
        return AbstractC2474Mx.A00(this.A02);
    }
}
