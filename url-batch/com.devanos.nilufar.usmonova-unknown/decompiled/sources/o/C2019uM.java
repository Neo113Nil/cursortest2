package o;

import java.lang.reflect.Member;

/* renamed from: o.uM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2019uM extends AbstractC0485Sp implements InterfaceC2114vp {
    public static final C2019uM j = new C2019uM(1);

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
