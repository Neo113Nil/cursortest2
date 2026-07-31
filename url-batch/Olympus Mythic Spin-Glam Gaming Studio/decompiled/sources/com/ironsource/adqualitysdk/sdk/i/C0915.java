package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᖕ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0915 extends AbstractC0751 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final AbstractC0502 f2207;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final AbstractC0502 f2208;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0544 f2209;

    public C0915(AbstractC0544 abstractC0544, AbstractC0502 abstractC0502, AbstractC0502 abstractC05022, byte b) {
        super(b);
        this.f2209 = abstractC0544;
        this.f2208 = abstractC0502;
        this.f2207 = abstractC05022;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0915.class != obj.getClass()) {
            return false;
        }
        C0915 c0915 = (C0915) obj;
        AbstractC0544 abstractC0544 = this.f2209;
        if (abstractC0544 == null ? c0915.f2209 != null : !abstractC0544.equals(c0915.f2209)) {
            return false;
        }
        AbstractC0502 abstractC0502 = this.f2208;
        if (abstractC0502 == null ? c0915.f2208 != null : !abstractC0502.equals(c0915.f2208)) {
            return false;
        }
        AbstractC0502 abstractC05022 = this.f2207;
        AbstractC0502 abstractC05023 = c0915.f2207;
        return abstractC05022 != null ? abstractC05022.equals(abstractC05023) : abstractC05023 == null;
    }

    public final int hashCode() {
        AbstractC0544 abstractC0544 = this.f2209;
        int hashCode = (abstractC0544 != null ? abstractC0544.hashCode() : 0) * 31;
        AbstractC0502 abstractC0502 = this.f2208;
        int hashCode2 = (hashCode + (abstractC0502 != null ? abstractC0502.hashCode() : 0)) * 31;
        AbstractC0502 abstractC05022 = this.f2207;
        return hashCode2 + (abstractC05022 != null ? abstractC05022.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("hcDwQg==\n", "7KbQakbWUu4=\n"));
        sb.append(this.f2209);
        sb.append(StringFog.decrypt("TSU=\n", "ZAV09cqVqpw=\n"));
        sb.append(this.f2208);
        if (this.f2207 != null) {
            if (this.f2208 instanceof C1219) {
                sb.append(" ");
            } else {
                sb.append("\n");
                byte b = this.f1680;
                for (int i = 0; i < b; i++) {
                    sb.append("  ");
                }
            }
            sb.append(StringFog.decrypt("RAYYPTg=\n", "IWprWBjVtes=\n"));
            sb.append(this.f2207);
        }
        return sb.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0502
    /* renamed from: ﾒ */
    public final C0954 mo3961(C0785 c0785, C0880 c0880) {
        if (this.f2209.m4041(c0785, c0880).m4250()) {
            return this.f2208.m4026(c0785, c0880);
        }
        if (this.f2207 == null) {
            return new C0954(Boolean.FALSE);
        }
        c0785.f1844.add(this);
        return this.f2207.m4026(c0785, c0880);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0502
    /* renamed from: ﾒ */
    public final int mo3960() {
        int mo3960 = this.f2208.mo3960();
        AbstractC0502 abstractC0502 = this.f2207;
        if (abstractC0502 == null) {
            return mo3960;
        }
        int mo39602 = mo3960 + abstractC0502.mo3960();
        return this.f2208 instanceof C1219 ? mo39602 - 1 : mo39602;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0502
    /* renamed from: ﾒ */
    public final int mo4027(C0785 c0785) {
        if (!c0785.f1844.contains(this)) {
            return this.f2208 instanceof C1219 ? 1 : 0;
        }
        int mo3960 = this.f2208.mo3960();
        return this.f2207 instanceof C1219 ? mo3960 : mo3960 - 1;
    }
}
