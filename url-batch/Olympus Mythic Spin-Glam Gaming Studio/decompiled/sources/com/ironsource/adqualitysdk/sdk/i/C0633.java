package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.د, reason: contains not printable characters */
/* loaded from: classes15.dex */
public class C0633 extends AbstractC0502 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0544 f1271;

    public C0633(AbstractC0544 abstractC0544) {
        this.f1271 = abstractC0544;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0544 abstractC0544 = this.f1271;
        AbstractC0544 abstractC05442 = ((C0633) obj).f1271;
        return abstractC0544 != null ? abstractC0544.equals(abstractC05442) : abstractC05442 == null;
    }

    public final int hashCode() {
        AbstractC0544 abstractC0544 = this.f1271;
        if (abstractC0544 != null) {
            return abstractC0544.hashCode();
        }
        return 0;
    }

    public String toString() {
        if (this.f1271 == null) {
            return StringFog.decrypt("Hw==\n", "JFQcQ1S1JKs=\n");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1271);
        return AbstractC1293.m4543("bg==\n", "VVICBrfVGq4=\n", sb);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0502
    /* renamed from: ﾒ */
    public C0954 mo3961(C0785 c0785, C0880 c0880) {
        AbstractC0544 abstractC0544 = this.f1271;
        return abstractC0544 != null ? abstractC0544.m4041(c0785, c0880) : new C0954(null);
    }
}
