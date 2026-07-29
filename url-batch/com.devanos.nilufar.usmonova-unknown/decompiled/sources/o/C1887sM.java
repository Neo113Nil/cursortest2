package o;

import java.lang.reflect.Member;

/* renamed from: o.sM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1887sM extends AbstractC0485Sp implements InterfaceC2114vp {
    public static final C1887sM j = new C1887sM(1);

    @Override // o.AbstractC2336z9, o.InterfaceC0387Ov
    public final String getName() {
        return "isSynthetic";
    }

    @Override // o.AbstractC2336z9
    public final InterfaceC1134gw getOwner() {
        return UM.a.b(Member.class);
    }

    @Override // o.AbstractC2336z9
    public final String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        Member member = (Member) obj;
        AbstractC0048Bt.n(member, "p0");
        return Boolean.valueOf(member.isSynthetic());
    }
}
