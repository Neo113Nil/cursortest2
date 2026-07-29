package o;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public abstract class M9 extends V9 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public M9(Field field, boolean z) {
        super(field, r0, z ? field.getDeclaringClass() : null, new Type[0]);
        Type genericType = field.getGenericType();
        AbstractC0048Bt.m(genericType, "field.genericType");
    }

    @Override // o.G9
    public Object call(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "args");
        c(objArr);
        return ((Field) this.a).get(this.c != null ? P6.j0(objArr) : null);
    }
}
