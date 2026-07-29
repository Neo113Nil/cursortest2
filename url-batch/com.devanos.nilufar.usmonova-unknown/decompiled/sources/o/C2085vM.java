package o;

import java.lang.reflect.Field;

/* renamed from: o.vM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2085vM extends AbstractC0485Sp implements InterfaceC2114vp {
    public static final C2085vM j = new C2085vM(1);

    @Override // o.AbstractC2336z9, o.InterfaceC0387Ov
    public final String getName() {
        return "<init>";
    }

    @Override // o.AbstractC2336z9
    public final InterfaceC1134gw getOwner() {
        return UM.a.b(DM.class);
    }

    @Override // o.AbstractC2336z9
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        Field field = (Field) obj;
        AbstractC0048Bt.n(field, "p0");
        return new DM(field);
    }
}
