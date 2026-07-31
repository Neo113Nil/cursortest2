package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.⁔, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC1108 extends AbstractC0544 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0544 f2815;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0544 f2816;

    public AbstractC1108(AbstractC0544 abstractC0544, AbstractC0544 abstractC05442) {
        this.f2816 = abstractC0544;
        this.f2815 = abstractC05442;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1108 abstractC1108 = (AbstractC1108) obj;
        AbstractC0544 abstractC0544 = this.f2816;
        if (abstractC0544 == null ? abstractC1108.f2816 != null : !abstractC0544.equals(abstractC1108.f2816)) {
            return false;
        }
        AbstractC0544 abstractC05442 = this.f2815;
        AbstractC0544 abstractC05443 = abstractC1108.f2815;
        return abstractC05442 != null ? abstractC05442.equals(abstractC05443) : abstractC05443 == null;
    }

    public final int hashCode() {
        AbstractC0544 abstractC0544 = this.f2816;
        int hashCode = (abstractC0544 != null ? abstractC0544.hashCode() : 0) * 31;
        AbstractC0544 abstractC05442 = this.f2815;
        return hashCode + (abstractC05442 != null ? abstractC05442.hashCode() : 0);
    }

    public final String toString() {
        return this.f2816 + " " + mo3987() + " " + this.f2815;
    }

    /* renamed from: ﾒ */
    public abstract String mo3987();
}
