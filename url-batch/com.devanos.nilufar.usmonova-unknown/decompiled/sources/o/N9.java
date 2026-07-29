package o;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class N9 extends Q9 implements InterfaceC2071v8 {
    public final Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N9(Field field, boolean z, Object obj) {
        super(field, z, false);
        AbstractC0048Bt.n(field, "field");
        this.g = obj;
    }

    @Override // o.Q9, o.G9
    public final Object call(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "args");
        c(objArr);
        ((Field) this.a).set(this.g, P6.j0(objArr));
        return C0782bY.a;
    }
}
