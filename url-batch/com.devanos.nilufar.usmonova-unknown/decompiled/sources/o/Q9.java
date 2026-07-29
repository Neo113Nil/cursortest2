package o;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class Q9 extends V9 {
    public final /* synthetic */ int e = 0;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Q9(Method method, boolean z, int i) {
        this(method, z, r4);
        z = (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        AbstractC0048Bt.m(genericParameterTypes, "method.genericParameterTypes");
    }

    @Override // o.V9
    public void c(Object[] objArr) {
        switch (this.e) {
            case 0:
                AbstractC0048Bt.n(objArr, "args");
                AbstractC0946e20.j(this, objArr);
                if (this.f && P6.p0(objArr) == null) {
                    throw new IllegalArgumentException("null is not allowed as a value for this property.");
                }
                return;
            default:
                super.c(objArr);
                return;
        }
    }

    @Override // o.G9
    public Object call(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "args");
        c(objArr);
        ((Field) this.a).set(this.c != null ? P6.j0(objArr) : null, P6.p0(objArr));
        return C0782bY.a;
    }

    public Object e(Object obj, Object[] objArr) {
        AbstractC0048Bt.n(objArr, "args");
        return this.f ? C0782bY.a : ((Method) this.a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Q9(Method method, boolean z, Type[] typeArr) {
        super(method, r0, z ? method.getDeclaringClass() : null, typeArr);
        Type genericReturnType = method.getGenericReturnType();
        AbstractC0048Bt.m(genericReturnType, "method.genericReturnType");
        this.f = genericReturnType.equals(Void.TYPE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Q9(Field field, boolean z, boolean z2) {
        super(field, r2, r7, new Type[]{r1});
        Class cls = Void.TYPE;
        AbstractC0048Bt.m(cls, "TYPE");
        Class<?> declaringClass = z2 ? field.getDeclaringClass() : null;
        Type genericType = field.getGenericType();
        AbstractC0048Bt.m(genericType, "field.genericType");
        this.f = z;
    }
}
