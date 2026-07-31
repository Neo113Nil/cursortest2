package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ล, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0741 extends AbstractC0544 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0544 f1667;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0780 f1668;

    public C0741(C0780 c0780, AbstractC0544 abstractC0544) {
        this.f1668 = c0780;
        this.f1667 = abstractC0544;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0741.class != obj.getClass()) {
            return false;
        }
        C0741 c0741 = (C0741) obj;
        C0780 c0780 = this.f1668;
        if (c0780 == null ? c0741.f1668 != null : !c0780.equals(c0741.f1668)) {
            return false;
        }
        AbstractC0544 abstractC0544 = this.f1667;
        AbstractC0544 abstractC05442 = c0741.f1667;
        return abstractC0544 != null ? abstractC0544.equals(abstractC05442) : abstractC05442 == null;
    }

    public final int hashCode() {
        C0780 c0780 = this.f1668;
        int hashCode = (c0780 != null ? c0780.hashCode() : 0) * 31;
        AbstractC0544 abstractC0544 = this.f1667;
        return hashCode + (abstractC0544 != null ? abstractC0544.hashCode() : 0);
    }

    public final String toString() {
        return this.f1668 + StringFog.decrypt("so+v\n", "krKPrUfALcs=\n") + this.f1667;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0544
    /* renamed from: ﾒ */
    public final C0954 mo4042(C0785 c0785, C0880 c0880) {
        C0954 m4041 = this.f1667.m4041(c0785, c0880);
        c0785.m4182(this.f1668.f1826, m4041.f2276);
        return m4041;
    }
}
