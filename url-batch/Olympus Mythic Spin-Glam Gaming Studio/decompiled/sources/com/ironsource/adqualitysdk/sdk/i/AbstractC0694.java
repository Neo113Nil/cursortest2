package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ܬ, reason: contains not printable characters */
/* loaded from: classes14.dex */
public abstract class AbstractC0694 extends AbstractC0544 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object f1548;

    public AbstractC0694(Object obj) {
        this.f1548 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f1548;
        Object obj3 = ((AbstractC0694) obj).f1548;
        return obj2 != null ? obj2.equals(obj3) : obj3 == null;
    }

    public final int hashCode() {
        Object obj = this.f1548;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "" + this.f1548;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0544
    /* renamed from: ﾒ */
    public final C0954 mo4042(C0785 c0785, C0880 c0880) {
        return new C0954(this.f1548);
    }
}
