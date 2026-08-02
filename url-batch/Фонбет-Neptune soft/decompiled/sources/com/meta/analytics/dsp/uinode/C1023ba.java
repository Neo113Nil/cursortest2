package com.meta.analytics.dsp.uinode;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.ba, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1023ba implements InterfaceC00490k {
    public final /* synthetic */ C0889Yn A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C1023ba(JSONObject jSONObject, C0889Yn c0889Yn, String str) {
        this.A02 = jSONObject;
        this.A00 = c0889Yn;
        this.A01 = str;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00490k
    public final String A6T() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00490k
    public final Collection<String> A6n() {
        return AbstractC00500l.A03(this.A00, this.A02);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00490k
    public final EnumC00480j A7E() {
        return AbstractC00500l.A00(this.A02);
    }
}
