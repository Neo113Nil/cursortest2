package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class h9 implements kj, dk, Serializable {
    private final kj completion;

    public h9(kj kjVar) {
        this.completion = kjVar;
    }

    public kj create(kj kjVar) {
        kjVar.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.dk
    public dk getCallerFrame() {
        kj kjVar = this.completion;
        if (kjVar instanceof dk) {
            return (dk) kjVar;
        }
        return null;
    }

    public final kj getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        mk mkVar = (mk) getClass().getAnnotation(mk.class);
        String str2 = null;
        if (mkVar == null) {
            return null;
        }
        int v = mkVar.v();
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
        int i2 = i >= 0 ? mkVar.l()[i] : -1;
        t7 t7Var = a50.h;
        t7 t7Var2 = a50.i;
        if (t7Var2 == null) {
            try {
                t7 t7Var3 = new t7(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 5);
                a50.i = t7Var3;
                t7Var2 = t7Var3;
            } catch (Exception unused2) {
                a50.i = t7Var;
                t7Var2 = t7Var;
            }
        }
        if (t7Var2 != t7Var && (method = (Method) t7Var2.e) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) t7Var2.f) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) t7Var2.g;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = mkVar.c();
        } else {
            str = str2 + '/' + mkVar.c();
        }
        return new StackTraceElement(str, mkVar.m(), mkVar.f(), i2);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kj
    public final void resumeWith(Object obj) {
        while (true) {
            h9 h9Var = this;
            kj kjVar = h9Var.completion;
            kjVar.getClass();
            try {
                obj = h9Var.invokeSuspend(obj);
                if (obj == ck.d) {
                    return;
                }
            } catch (Throwable th) {
                obj = new uk0(th);
            }
            h9Var.releaseIntercepted();
            if (!(kjVar instanceof h9)) {
                kjVar.resumeWith(obj);
                return;
            }
            this = kjVar;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public kj create(Object obj, kj kjVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
