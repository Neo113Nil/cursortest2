package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ῐ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C1092 implements InterfaceC1072 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1065 f2780;

    public C1092(C1065 c1065) {
        this.f2780 = c1065;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1072
    /* renamed from: ﾒ */
    public final Object mo4365(List list) {
        AbstractC0544 m4345 = this.f2780.m4345(list);
        if ((m4345 instanceof C0780) || (m4345 instanceof C0741)) {
            return m4345;
        }
        this.f2780.m4355(StringFog.decrypt("NJI4CRQ8F+xRnCkeHikQ5BTKKhkDaADtEo8hGhIsUg==\n", "cepIbHdIcog=\n") + m4345);
        throw null;
    }
}
