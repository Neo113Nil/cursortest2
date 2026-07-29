package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: o.d4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0883d4 implements InvocationHandler {
    public final Class a;
    public final Map b;
    public final BU c;
    public final BU d;
    public final List e;

    public C0883d4(Class cls, Map map, BU bu, BU bu2, List list) {
        this.a = cls;
        this.b = map;
        this.c = bu;
        this.d = bu2;
        this.e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean h;
        boolean z;
        Class cls = this.a;
        AbstractC0048Bt.n(cls, "$annotationClass");
        List<Method> list = this.e;
        AbstractC0048Bt.n(list, "$methods");
        String name = method.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) this.d.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) this.c.getValue();
            }
        }
        boolean h2 = AbstractC0048Bt.h(name, "equals");
        Map map = this.b;
        boolean z2 = false;
        if (!h2 || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb = new StringBuilder("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(P6.t0(objArr));
            sb.append(')');
            throw new C0526Ue(sb.toString());
        }
        Object r0 = P6.r0(objArr);
        Annotation annotation = r0 instanceof Annotation ? (Annotation) r0 : null;
        if (AbstractC0048Bt.h(annotation != null ? AbstractC1473m3.D(AbstractC1473m3.B(annotation)) : null, cls)) {
            if (!list.isEmpty()) {
                for (Method method2 : list) {
                    Object obj2 = map.get(method2.getName());
                    Object invoke = method2.invoke(r0, null);
                    if (obj2 instanceof boolean[]) {
                        AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        h = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                    } else if (obj2 instanceof char[]) {
                        AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                        h = Arrays.equals((char[]) obj2, (char[]) invoke);
                    } else if (obj2 instanceof byte[]) {
                        AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        h = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                    } else if (obj2 instanceof short[]) {
                        AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        h = Arrays.equals((short[]) obj2, (short[]) invoke);
                    } else if (obj2 instanceof int[]) {
                        AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                        h = Arrays.equals((int[]) obj2, (int[]) invoke);
                    } else if (obj2 instanceof float[]) {
                        AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        h = Arrays.equals((float[]) obj2, (float[]) invoke);
                    } else if (obj2 instanceof long[]) {
                        AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                        h = Arrays.equals((long[]) obj2, (long[]) invoke);
                    } else if (obj2 instanceof double[]) {
                        AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        h = Arrays.equals((double[]) obj2, (double[]) invoke);
                    } else if (obj2 instanceof Object[]) {
                        AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        h = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                    } else {
                        h = AbstractC0048Bt.h(obj2, invoke);
                    }
                    if (!h) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
