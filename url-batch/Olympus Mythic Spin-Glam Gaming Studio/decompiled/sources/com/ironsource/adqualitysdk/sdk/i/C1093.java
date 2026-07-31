package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ῑ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C1093 extends AbstractC0544 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0544 f2781;

    public C1093(AbstractC0544 abstractC0544) {
        this.f2781 = abstractC0544;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1093.class != obj.getClass()) {
            return false;
        }
        AbstractC0544 abstractC0544 = this.f2781;
        AbstractC0544 abstractC05442 = ((C1093) obj).f2781;
        return abstractC0544 != null ? abstractC0544.equals(abstractC05442) : abstractC05442 == null;
    }

    public final int hashCode() {
        AbstractC0544 abstractC0544 = this.f2781;
        if (abstractC0544 != null) {
            return abstractC0544.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("Xw==\n", "dykoCvsqvN0=\n"));
        sb.append(this.f2781);
        return AbstractC1293.m4543("bQ==\n", "RPzm20gFtBw=\n", sb);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0544
    /* renamed from: ﾒ */
    public final C0954 mo4042(C0785 c0785, C0880 c0880) {
        return this.f2781.m4041(c0785, c0880);
    }
}
