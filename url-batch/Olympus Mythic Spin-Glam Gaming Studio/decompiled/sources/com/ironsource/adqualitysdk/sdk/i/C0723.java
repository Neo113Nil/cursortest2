package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ઽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0723 extends AbstractC0544 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f1637;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0544 f1638;

    public C0723(AbstractC0544 abstractC0544, String str) {
        this.f1638 = abstractC0544;
        this.f1637 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0723.class != obj.getClass()) {
            return false;
        }
        C0723 c0723 = (C0723) obj;
        AbstractC0544 abstractC0544 = this.f1638;
        if (abstractC0544 == null ? c0723.f1638 != null : !abstractC0544.equals(c0723.f1638)) {
            return false;
        }
        String str = this.f1637;
        String str2 = c0723.f1637;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        AbstractC0544 abstractC0544 = this.f1638;
        int hashCode = (abstractC0544 != null ? abstractC0544.hashCode() : 0) * 31;
        String str = this.f1637;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return this.f1638.toString() + StringFog.decrypt("EA==\n", "PlH7KtvgWuo=\n") + this.f1637;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0544
    /* renamed from: ﾒ */
    public final C0954 mo4042(C0785 c0785, C0880 c0880) {
        Object obj = this.f1638.m4041(c0785, c0880).f2276;
        C1064 c1064 = null;
        if (!(obj instanceof C0880)) {
            try {
                return new C0954(obj.getClass().getDeclaredField(this.f1637).get(obj));
            } catch (Exception unused) {
                return new C0954(null);
            }
        }
        C0880 c08802 = (C0880) obj;
        String str = this.f1637;
        if (str != null) {
            c1064 = c08802.f2146.m4161(str);
        } else {
            c08802.getClass();
        }
        return new C0954(c1064);
    }
}
