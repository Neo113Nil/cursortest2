package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class o80 implements sl, ed, Serializable {
    public final ed f;
    public int g;
    public /* synthetic */ i10 h;
    public final /* synthetic */ View i;

    public o80(View view, ed edVar) {
        this.i = view;
        this.f = edVar;
        if (edVar == null || edVar.a() == sh.f) {
            return;
        }
        l8.l("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.ed
    public final sh a() {
        return sh.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ed
    public final void b(Object obj) {
        Object c;
        while (true) {
            o80 o80Var = this;
            ed edVar = o80Var.f;
            edVar.getClass();
            try {
                c = o80Var.c(obj);
            } catch (Throwable th) {
                obj = new c00(th);
            }
            if (c == od.f) {
                return;
            }
            obj = c;
            if (!(edVar instanceof o80)) {
                edVar.b(obj);
                return;
            }
            this = edVar;
        }
    }

    public final Object c(Object obj) {
        Object obj2;
        Object obj3 = tg.m;
        int i = this.g;
        View view = this.i;
        Object obj4 = od.f;
        if (i == 0) {
            vv.X(obj);
            i10 i10Var = this.h;
            this.h = i10Var;
            this.g = 1;
            i10Var.g = view;
            i10Var.f = 3;
            i10Var.i = this;
            return obj4;
        }
        if (i != 1) {
            if (i == 2) {
                vv.X(obj);
                return obj3;
            }
            l8.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i10 i10Var2 = this.h;
        vv.X(obj);
        if (view instanceof ViewGroup) {
            this.h = null;
            this.g = 2;
            i10Var2.getClass();
            i60 i60Var = new i60(new i(3, (ViewGroup) view));
            if (i60Var.g.hasNext()) {
                i10Var2.h = i60Var;
                i10Var2.f = 2;
                i10Var2.i = this;
                obj2 = obj4;
            } else {
                obj2 = obj3;
            }
            if (obj2 != obj4) {
                obj2 = obj3;
            }
            if (obj2 == obj4) {
                return obj4;
            }
        }
        return obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.StackTraceElement] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    public final String e() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        StringBuilder sb = new StringBuilder("Continuation at ");
        zd zdVar = (zd) getClass().getAnnotation(zd.class);
        String str2 = null;
        if (zdVar != null) {
            int v = zdVar.v();
            if (v > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
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
            int i2 = i >= 0 ? zdVar.l()[i] : -1;
            ra raVar = vv.c;
            ra raVar2 = vv.d;
            if (raVar2 == null) {
                try {
                    ra raVar3 = new ra(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    vv.d = raVar3;
                    raVar2 = raVar3;
                } catch (Exception unused2) {
                    vv.d = raVar;
                    raVar2 = raVar;
                }
            }
            if (raVar2 != raVar && (method = raVar2.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = raVar2.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = raVar2.c;
                String invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                if (invoke3 instanceof String) {
                    str2 = invoke3;
                }
            }
            if (str2 == null) {
                str = zdVar.c();
            } else {
                str = str2 + '/' + zdVar.c();
            }
            str2 = new StackTraceElement(str, zdVar.m(), zdVar.f(), i2);
        }
        if (str2 == null) {
            str2 = getClass().getName();
        }
        sb.append((Object) str2);
        return sb.toString();
    }

    public final String toString() {
        if (this.f != null) {
            return e();
        }
        hz.a.getClass();
        String obj = o80.class.getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public void d() {
    }
}
