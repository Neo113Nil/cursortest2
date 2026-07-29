package o;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class J9 extends M9 implements InterfaceC2071v8 {
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J9(Field field, Object obj) {
        super(field, false);
        AbstractC0048Bt.n(field, "field");
        this.e = obj;
    }

    @Override // o.M9, o.G9
    public final Object call(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "args");
        AbstractC0946e20.j(this, objArr);
        return ((Field) this.a).get(this.e);
    }
}
