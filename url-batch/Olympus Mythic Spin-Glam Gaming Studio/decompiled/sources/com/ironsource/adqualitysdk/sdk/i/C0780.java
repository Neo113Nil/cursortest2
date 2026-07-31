package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐠ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0780 extends AbstractC0544 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f1826;

    public C0780(String str) {
        this.f1826 = AbstractC0471.m4008(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0780.class != obj.getClass()) {
            return false;
        }
        return this.f1826.equals(((C0780) obj).f1826);
    }

    public final int hashCode() {
        String str = this.f1826;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return this.f1826;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0544
    /* renamed from: ﾒ */
    public final C0954 mo4042(C0785 c0785, C0880 c0880) {
        C1064 c1064;
        try {
            return new C0954(c0785.m4181(this.f1826));
        } catch (Exception unused) {
            String str = this.f1826;
            if (str != null) {
                c1064 = c0880.f2146.m4161(str);
            } else {
                c0880.getClass();
                c1064 = null;
            }
            if (c1064 != null) {
                return new C0954(c1064);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("W5thoYBeV5R/hWavhhdchT6Ma76AG0GRd4Z97tU=\n", "HukTzvJ+MuI=\n"));
            sb.append(this);
            new C1262(c0880, c0785, AbstractC1293.m4543("qg==\n", "jaO3NxkKf5Y=\n", sb), null).m4002(c0880.m4231());
            return new C0954(null);
        }
    }
}
