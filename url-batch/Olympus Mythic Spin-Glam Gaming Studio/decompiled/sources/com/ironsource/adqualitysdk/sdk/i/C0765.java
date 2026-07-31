package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ꭲ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C0765 extends AbstractC0544 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0780 f1770;

    public C0765(C0780 c0780) {
        this.f1770 = c0780;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1770.f1826);
        return AbstractC1293.m4543("lqg=\n", "vYPCg2l8KVg=\n", sb);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0544
    /* renamed from: ﾒ */
    public final C0954 mo4042(C0785 c0785, C0880 c0880) {
        C0954 m4041 = this.f1770.m4041(c0785, c0880);
        c0785.m4182(this.f1770.f1826, Integer.valueOf(m4041.m4249().intValue() + 1));
        return m4041;
    }
}
