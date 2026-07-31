package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ṙ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1046 extends AbstractC1108 {
    public C1046(AbstractC0544 abstractC0544, AbstractC0544 abstractC05442) {
        super(abstractC0544, abstractC05442);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0544
    /* renamed from: ﾒ */
    public final C0954 mo4042(C0785 c0785, C0880 c0880) {
        C0954 m4041 = this.f2816.m4041(c0785, c0880);
        C0954 m40412 = this.f2815.m4041(c0785, c0880);
        if ((m4041.f2276 instanceof String) || (m40412.f2276 instanceof String)) {
            return new C0954("" + m4041.f2276 + m40412.f2276);
        }
        Number m4249 = m4041.m4249();
        Number m42492 = m40412.m4249();
        if ((m4249 instanceof Double) || (m42492 instanceof Double)) {
            return new C0954(Double.valueOf(m42492.doubleValue() + m4249.doubleValue()));
        }
        if ((m4249 instanceof Long) || (m42492 instanceof Long)) {
            return new C0954(Long.valueOf(m42492.longValue() + m4249.longValue()));
        }
        return new C0954(Integer.valueOf(m42492.intValue() + m4249.intValue()));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1108
    /* renamed from: ﾒ */
    public final String mo3987() {
        return StringFog.decrypt("7g==\n", "xVE1G77m9C0=\n");
    }
}
