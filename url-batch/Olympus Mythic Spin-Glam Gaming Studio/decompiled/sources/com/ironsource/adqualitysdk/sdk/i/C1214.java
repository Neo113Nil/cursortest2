package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮆ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C1214 extends AbstractC0750 {
    public C1214(AbstractC0544 abstractC0544, AbstractC0544 abstractC05442) {
        super(abstractC0544, abstractC05442);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0750
    /* renamed from: ﾒ */
    public final Number mo4104(Number number, Number number2) {
        return ((number instanceof Double) || (number2 instanceof Double)) ? Double.valueOf(number.doubleValue() % number2.doubleValue()) : ((number instanceof Long) || (number2 instanceof Long)) ? Long.valueOf(number.longValue() % number2.longValue()) : Integer.valueOf(number.intValue() % number2.intValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1108
    /* renamed from: ﾒ */
    public final String mo3987() {
        return StringFog.decrypt("aw==\n", "TrmEkLRmcCQ=\n");
    }
}
