package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class FM extends BM implements InterfaceC0489St, InterfaceC0738au {
    @Override // o.InterfaceC0489St
    public final C1558nM a(C2245xo c2245xo) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        Member b = b();
        AbstractC0048Bt.l(b, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) b).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return EB.p(declaredAnnotations, c2245xo);
        }
        return null;
    }

    public abstract Member b();

    public final C0827cE c() {
        String name = b().getName();
        C0827cE e = name != null ? C0827cE.e(name) : null;
        return e == null ? YS.a : e;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList d(Type[] typeArr, Annotation[][] annotationArr, boolean z) {
        Method method;
        ArrayList arrayList;
        KM c1821rM;
        String str;
        boolean z2;
        C0385Ot c0385Ot;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        HO ho = HO.x;
        Member b = b();
        AbstractC0048Bt.n(b, "member");
        C0385Ot c0385Ot2 = HO.y;
        if (c0385Ot2 == null) {
            synchronized (ho) {
                c0385Ot2 = HO.y;
                if (c0385Ot2 == null) {
                    Class<?> cls = b.getClass();
                    try {
                        c0385Ot = new C0385Ot(cls.getMethod("getParameters", null), AbstractC1492mM.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
                    } catch (NoSuchMethodException unused) {
                        c0385Ot = new C0385Ot(null, null);
                    }
                    HO.y = c0385Ot;
                    c0385Ot2 = c0385Ot;
                }
            }
        }
        Method method2 = c0385Ot2.a;
        if (method2 == null || (method = c0385Ot2.b) == null) {
            arrayList = null;
        } else {
            Object invoke = method2.invoke(b, null);
            AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) invoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Object invoke2 = method.invoke(obj, null);
                AbstractC0048Bt.l(invoke2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) invoke2);
            }
        }
        int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i = 0; i < length; i++) {
            Type type = typeArr[i];
            AbstractC0048Bt.n(type, "type");
            boolean z3 = type instanceof Class;
            if (z3) {
                Class cls2 = (Class) type;
                if (cls2.isPrimitive()) {
                    c1821rM = new IM(cls2);
                    if (arrayList == null) {
                        str = (String) AbstractC0720ac.q0(i + size, arrayList);
                        if (str == null) {
                            throw new IllegalStateException(("No parameter with index " + i + '+' + size + " (name=" + c() + " type=" + c1821rM + ") in " + this).toString());
                        }
                    } else {
                        str = null;
                    }
                    if (z) {
                        z2 = true;
                        if (i == typeArr.length - 1) {
                            arrayList2.add(new MM(c1821rM, annotationArr[i], str, z2));
                        }
                    }
                    z2 = false;
                    arrayList2.add(new MM(c1821rM, annotationArr[i], str, z2));
                }
            }
            c1821rM = ((type instanceof GenericArrayType) || (z3 && ((Class) type).isArray())) ? new C1821rM(type) : type instanceof WildcardType ? new NM((WildcardType) type) : new C2349zM(type);
            if (arrayList == null) {
            }
            if (z) {
            }
            z2 = false;
            arrayList2.add(new MM(c1821rM, annotationArr[i], str, z2));
        }
        return arrayList2;
    }

    public final AbstractC2325z00 e() {
        int modifiers = b().getModifiers();
        return Modifier.isPublic(modifiers) ? C2127w00.c : Modifier.isPrivate(modifiers) ? C1929t00.c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C2317yu.c : C2251xu.c : C2185wu.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof FM) && AbstractC0048Bt.h(b(), ((FM) obj).b());
    }

    @Override // o.InterfaceC0489St
    public final Collection getAnnotations() {
        Member b = b();
        AbstractC0048Bt.l(b, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) b).getDeclaredAnnotations();
        return declaredAnnotations != null ? EB.r(declaredAnnotations) : C1318jk.h;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
