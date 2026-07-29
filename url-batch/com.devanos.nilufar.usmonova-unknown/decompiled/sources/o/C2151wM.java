package o;

import java.lang.reflect.Method;

/* renamed from: o.wM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2151wM extends AbstractC0485Sp implements InterfaceC2114vp {
    public static final C2151wM j = new C2151wM(1);

    @Override // o.AbstractC2336z9, o.InterfaceC0387Ov
    public final String getName() {
        return "<init>";
    }

    @Override // o.AbstractC2336z9
    public final InterfaceC1134gw getOwner() {
        return UM.a.b(GM.class);
    }

    @Override // o.AbstractC2336z9
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        Method method = (Method) obj;
        AbstractC0048Bt.n(method, "p0");
        return new GM(method);
    }
}
