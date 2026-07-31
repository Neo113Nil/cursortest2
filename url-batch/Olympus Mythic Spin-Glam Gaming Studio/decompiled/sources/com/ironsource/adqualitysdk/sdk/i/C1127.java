package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ⅽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C1127 extends AbstractC0750 {
    public C1127(AbstractC0544 abstractC0544, AbstractC0544 abstractC05442) {
        super(abstractC0544, abstractC05442);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0750
    /* renamed from: ﾒ */
    public final Number mo4104(Number number, Number number2) {
        if ((number instanceof Double) || (number2 instanceof Double)) {
            return Double.valueOf(number2.doubleValue() * number.doubleValue());
        }
        if ((number instanceof Long) || (number2 instanceof Long)) {
            return Long.valueOf(number2.longValue() * number.longValue());
        }
        return Integer.valueOf(number2.intValue() * number.intValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1108
    /* renamed from: ﾒ */
    public final String mo3987() {
        return StringFog.decrypt("QQ==\n", "a0Mt7PA/pVk=\n");
    }
}
