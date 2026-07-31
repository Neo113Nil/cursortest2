package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﹷ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public abstract class AbstractC1241 extends AbstractC0544 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0544 f3246;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0544 f3247;

    public AbstractC1241(AbstractC0544 abstractC0544, AbstractC0544 abstractC05442) {
        this.f3247 = abstractC0544;
        this.f3246 = abstractC05442;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1241 abstractC1241 = (AbstractC1241) obj;
        AbstractC0544 abstractC0544 = this.f3247;
        if (abstractC0544 == null ? abstractC1241.f3247 != null : !abstractC0544.equals(abstractC1241.f3247)) {
            return false;
        }
        AbstractC0544 abstractC05442 = this.f3246;
        AbstractC0544 abstractC05443 = abstractC1241.f3246;
        return abstractC05442 != null ? abstractC05442.equals(abstractC05443) : abstractC05443 == null;
    }

    public int hashCode() {
        AbstractC0544 abstractC0544 = this.f3247;
        int hashCode = (abstractC0544 != null ? abstractC0544.hashCode() : 0) * 31;
        AbstractC0544 abstractC05442 = this.f3246;
        return hashCode + (abstractC05442 != null ? abstractC05442.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3247.toString());
        sb.append(StringFog.decrypt("BA==\n", "X7A/yO6+O74=\n"));
        sb.append(this.f3246.toString());
        return AbstractC1293.m4543("xQ==\n", "mDQrX8CBIL0=\n", sb);
    }
}
