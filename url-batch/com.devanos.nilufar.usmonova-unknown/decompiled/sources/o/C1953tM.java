package o;

import java.lang.reflect.Constructor;

/* renamed from: o.tM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1953tM extends AbstractC0485Sp implements InterfaceC2114vp {
    public static final C1953tM j = new C1953tM(1);

    @Override // o.AbstractC2336z9, o.InterfaceC0387Ov
    public final String getName() {
        return "<init>";
    }

    @Override // o.AbstractC2336z9
    public final InterfaceC1134gw getOwner() {
        return UM.a.b(AM.class);
    }

    @Override // o.AbstractC2336z9
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        Constructor constructor = (Constructor) obj;
        AbstractC0048Bt.n(constructor, "p0");
        return new AM(constructor);
    }
}
