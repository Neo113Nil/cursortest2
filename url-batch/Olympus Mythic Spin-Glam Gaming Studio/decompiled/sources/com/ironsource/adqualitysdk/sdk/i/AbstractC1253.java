package com.ironsource.adqualitysdk.sdk.i;

import java.math.BigDecimal;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺏ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public abstract class AbstractC1253 extends AbstractC1108 {
    public AbstractC1253(AbstractC0544 abstractC0544, AbstractC0544 abstractC05442) {
        super(abstractC0544, abstractC05442);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0544
    /* renamed from: ﾒ */
    public final C0954 mo4042(C0785 c0785, C0880 c0880) {
        Object obj = this.f2816.m4041(c0785, c0880).f2276;
        Object obj2 = this.f2815.m4041(c0785, c0880).f2276;
        try {
            return new C0954(Boolean.valueOf(mo3988(new BigDecimal(obj.toString()).compareTo(new BigDecimal(obj2.toString())))));
        } catch (Exception unused) {
            return ((obj instanceof String) && (obj2 instanceof String)) ? new C0954(Boolean.valueOf(mo4071((String) obj, (String) obj2))) : new C0954(Boolean.valueOf(mo4070(obj, obj2)));
        }
    }

    /* renamed from: ﾒ */
    public abstract boolean mo3988(int i);

    /* renamed from: ﾒ */
    public abstract boolean mo4070(Object obj, Object obj2);

    /* renamed from: ﾒ */
    public abstract boolean mo4071(String str, String str2);
}
