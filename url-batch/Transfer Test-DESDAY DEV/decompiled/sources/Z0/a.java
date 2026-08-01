package Z0;

import K.C0014m;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a implements X0.d, d, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final X0.d f1174a;

    public a(X0.d dVar) {
        this.f1174a = dVar;
    }

    public X0.d a(Object obj, X0.d dVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // X0.d
    public final void b(Object obj) {
        X0.d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            X0.d dVar2 = aVar.f1174a;
            g1.f.b(dVar2);
            try {
                obj = aVar.i(obj);
                if (obj == Y0.a.f1162a) {
                    return;
                }
            } catch (Throwable th) {
                obj = T.e.s(th);
            }
            aVar.j();
            if (!(dVar2 instanceof a)) {
                dVar2.b(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    @Override // Z0.d
    public final d e() {
        X0.d dVar = this.f1174a;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public abstract Object i(Object obj);

    public void j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StackTraceElement] */
    public String toString() {
        int i;
        String str;
        StringBuilder sb = new StringBuilder("Continuation at ");
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar != null) {
            int v2 = eVar.v();
            if (v2 > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v2 + ". Please update the Kotlin standard library.").toString());
            }
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                i = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i = -1;
            }
            int i2 = i >= 0 ? eVar.l()[i] : -1;
            C0014m c0014m = f.f1179b;
            C0014m c0014m2 = f.f1178a;
            if (c0014m == null) {
                try {
                    C0014m c0014m3 = new C0014m(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    f.f1179b = c0014m3;
                    c0014m = c0014m3;
                } catch (Exception unused2) {
                    f.f1179b = c0014m2;
                    c0014m = c0014m2;
                }
            }
            if (c0014m != c0014m2) {
                Method method = (Method) c0014m.f424a;
                Object invoke = method != null ? method.invoke(getClass(), null) : null;
                if (invoke != null) {
                    Method method2 = (Method) c0014m.f425b;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
                    if (invoke2 != null) {
                        Method method3 = (Method) c0014m.f426c;
                        String invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                        if (invoke3 instanceof String) {
                            str2 = invoke3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            str2 = new StackTraceElement(str, eVar.m(), eVar.f(), i2);
        }
        if (str2 == null) {
            str2 = getClass().getName();
        }
        sb.append((Object) str2);
        return sb.toString();
    }
}
