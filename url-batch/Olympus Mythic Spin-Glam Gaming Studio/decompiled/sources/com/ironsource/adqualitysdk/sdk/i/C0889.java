package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔩ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0889 extends AbstractC0502 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final AbstractC0502 f2154;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final AbstractC0544 f2155;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0544 f2156;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0544 f2157;

    public C0889(AbstractC0544 abstractC0544, AbstractC0544 abstractC05442, AbstractC0544 abstractC05443, AbstractC0502 abstractC0502) {
        this.f2157 = abstractC0544;
        this.f2156 = abstractC05442;
        this.f2155 = abstractC05443;
        this.f2154 = abstractC0502;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0889.class != obj.getClass()) {
            return false;
        }
        C0889 c0889 = (C0889) obj;
        AbstractC0544 abstractC0544 = this.f2157;
        if (abstractC0544 == null ? c0889.f2157 != null : !abstractC0544.equals(c0889.f2157)) {
            return false;
        }
        AbstractC0544 abstractC05442 = this.f2156;
        if (abstractC05442 == null ? c0889.f2156 != null : !abstractC05442.equals(c0889.f2156)) {
            return false;
        }
        AbstractC0544 abstractC05443 = this.f2155;
        if (abstractC05443 == null ? c0889.f2155 != null : !abstractC05443.equals(c0889.f2155)) {
            return false;
        }
        AbstractC0502 abstractC0502 = this.f2154;
        AbstractC0502 abstractC05022 = c0889.f2154;
        return abstractC0502 != null ? abstractC0502.equals(abstractC05022) : abstractC05022 == null;
    }

    public final int hashCode() {
        AbstractC0544 abstractC0544 = this.f2157;
        int hashCode = (abstractC0544 != null ? abstractC0544.hashCode() : 0) * 31;
        AbstractC0544 abstractC05442 = this.f2156;
        int hashCode2 = (hashCode + (abstractC05442 != null ? abstractC05442.hashCode() : 0)) * 31;
        AbstractC0544 abstractC05443 = this.f2155;
        int hashCode3 = (hashCode2 + (abstractC05443 != null ? abstractC05443.hashCode() : 0)) * 31;
        AbstractC0502 abstractC0502 = this.f2154;
        return hashCode3 + (abstractC0502 != null ? abstractC0502.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("vGrSGx0=\n", "2gWgOzUtfXw=\n"));
        AbstractC0544 abstractC0544 = this.f2157;
        if (abstractC0544 != null) {
            sb.append(abstractC0544);
        }
        sb.append(StringFog.decrypt("Tf4=\n", "dt6YOaUD8mg=\n"));
        sb.append(this.f2156);
        sb.append(StringFog.decrypt("wd4=\n", "+v7l6+xcsnc=\n"));
        AbstractC0544 abstractC05442 = this.f2155;
        if (abstractC05442 != null) {
            sb.append(abstractC05442);
        }
        sb.append(StringFog.decrypt("x1Q=\n", "7nR1CTRh8N4=\n"));
        sb.append(this.f2154);
        return sb.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0502
    /* renamed from: ﾒ */
    public final C0954 mo3961(C0785 c0785, C0880 c0880) {
        AbstractC0544 abstractC0544 = this.f2157;
        if (abstractC0544 != null) {
            abstractC0544.m4041(c0785, c0880);
        }
        while (this.f2156.m4041(c0785, c0880).m4250()) {
            C0954 m4026 = this.f2154.m4026(c0785, c0880);
            if (m4026.f2274) {
                break;
            }
            if (m4026.f2275) {
                return m4026;
            }
            AbstractC0544 abstractC05442 = this.f2155;
            if (abstractC05442 != null) {
                abstractC05442.m4041(c0785, c0880);
            }
        }
        return new C0954(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0502
    /* renamed from: ﾒ */
    public final int mo3960() {
        return this.f2154.mo3960();
    }
}
