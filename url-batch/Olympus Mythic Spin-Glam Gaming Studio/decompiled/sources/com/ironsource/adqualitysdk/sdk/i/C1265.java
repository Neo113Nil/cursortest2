package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺣ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1265 extends AbstractC0544 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f3431;

    public C1265(String str) {
        this.f3431 = AbstractC0471.m4008(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1265.class != obj.getClass()) {
            return false;
        }
        String str = this.f3431;
        String str2 = ((C1265) obj).f3431;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        String str = this.f3431;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return this.f3431;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0544
    /* renamed from: ﾒ */
    public final C0954 mo4042(C0785 c0785, C0880 c0880) {
        AbstractC0593 abstractC0593 = c0880.f2143;
        String str = this.f3431;
        return new C0954(abstractC0593.m4102(str.substring(0, str.length() - StringFog.decrypt("VjlNGCYe\n", "eFoheVVtpds=\n").length()), true));
    }
}
