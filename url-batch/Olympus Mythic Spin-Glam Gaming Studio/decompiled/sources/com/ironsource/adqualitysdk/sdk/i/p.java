package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* loaded from: classes5.dex */
public final class p extends AbstractC0502 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0502 f158;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0544 f159;

    public p(AbstractC0544 abstractC0544, AbstractC0502 abstractC0502) {
        this.f159 = abstractC0544;
        this.f158 = abstractC0502;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        AbstractC0544 abstractC0544 = this.f159;
        if (abstractC0544 == null ? pVar.f159 != null : !abstractC0544.equals(pVar.f159)) {
            return false;
        }
        AbstractC0502 abstractC0502 = this.f158;
        AbstractC0502 abstractC05022 = pVar.f158;
        return abstractC0502 != null ? abstractC0502.equals(abstractC05022) : abstractC05022 == null;
    }

    public final int hashCode() {
        AbstractC0544 abstractC0544 = this.f159;
        int hashCode = (abstractC0544 != null ? abstractC0544.hashCode() : 0) * 31;
        AbstractC0502 abstractC0502 = this.f158;
        return hashCode + (abstractC0502 != null ? abstractC0502.hashCode() : 0);
    }

    public final String toString() {
        return StringFog.decrypt("FMRv3GyIAQ==\n", "Y6wGsAmoKZI=\n") + this.f159 + StringFog.decrypt("uWw=\n", "kEzn9NJRFnU=\n") + this.f158;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0502
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0954 mo3961(C0785 c0785, C0880 c0880) {
        while (this.f159.m4041(c0785, c0880).m4250()) {
            C0954 m4026 = this.f158.m4026(c0785, c0880);
            if (m4026.f2274) {
                break;
            }
            if (m4026.f2275) {
                return m4026;
            }
        }
        return new C0954(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0502
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int mo3960() {
        return this.f158.mo3960();
    }
}
