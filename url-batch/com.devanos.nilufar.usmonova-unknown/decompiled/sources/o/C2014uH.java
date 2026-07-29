package o;

import java.lang.reflect.Type;

/* renamed from: o.uH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2014uH extends AbstractC0511Tp implements InterfaceC2114vp {
    public static final C2014uH j = new C2014uH(1, PX.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        Type type = (Type) obj;
        AbstractC0048Bt.n(type, "p0");
        return PX.i(type);
    }
}
