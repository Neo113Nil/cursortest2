package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔿ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0901 extends AbstractC0544 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0544 f2195;

    public C0901(AbstractC0544 abstractC0544) {
        this.f2195 = abstractC0544;
    }

    public final String toString() {
        return StringFog.decrypt("zA==\n", "7SzsdHc0Y9s=\n") + this.f2195;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0544
    /* renamed from: ﾒ */
    public final C0954 mo4042(C0785 c0785, C0880 c0880) {
        return new C0954(Boolean.valueOf(!this.f2195.m4041(c0785, c0880).m4250()));
    }
}
