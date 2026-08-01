package b1;

import F1.l;
import G1.i;
import a1.EnumC0064a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0092a implements Z0.d, InterfaceC0095d, Serializable {
    private final Z0.d completion;

    public AbstractC0092a(Z0.d dVar) {
        this.completion = dVar;
    }

    public Z0.d create(Z0.d dVar) {
        i1.f.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // b1.InterfaceC0095d
    public InterfaceC0095d getCallerFrame() {
        Z0.d dVar = this.completion;
        if (dVar instanceof InterfaceC0095d) {
            return (InterfaceC0095d) dVar;
        }
        return null;
    }

    public final Z0.d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        InterfaceC0096e interfaceC0096e = (InterfaceC0096e) getClass().getAnnotation(InterfaceC0096e.class);
        String str2 = null;
        if (interfaceC0096e == null) {
            return null;
        }
        int v2 = interfaceC0096e.v();
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
        int i2 = i >= 0 ? interfaceC0096e.l()[i] : -1;
        i iVar = AbstractC0097f.f2105b;
        i iVar2 = AbstractC0097f.f2104a;
        if (iVar == null) {
            try {
                i iVar3 = new i(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                AbstractC0097f.f2105b = iVar3;
                iVar = iVar3;
            } catch (Exception unused2) {
                AbstractC0097f.f2105b = iVar2;
                iVar = iVar2;
            }
        }
        if (iVar != iVar2) {
            Method method = iVar.f532a;
            Object invoke = method != null ? method.invoke(getClass(), null) : null;
            if (invoke != null) {
                Method method2 = iVar.f533b;
                Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
                if (invoke2 != null) {
                    Method method3 = iVar.f534c;
                    Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                    if (invoke3 instanceof String) {
                        str2 = (String) invoke3;
                    }
                }
            }
        }
        if (str2 == null) {
            str = interfaceC0096e.c();
        } else {
            str = str2 + '/' + interfaceC0096e.c();
        }
        return new StackTraceElement(str, interfaceC0096e.m(), interfaceC0096e.f(), i2);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // Z0.d
    public final void resumeWith(Object obj) {
        Z0.d dVar = this;
        while (true) {
            AbstractC0092a abstractC0092a = (AbstractC0092a) dVar;
            Z0.d dVar2 = abstractC0092a.completion;
            i1.f.b(dVar2);
            try {
                obj = abstractC0092a.invokeSuspend(obj);
                if (obj == EnumC0064a.f1630a) {
                    return;
                }
            } catch (Throwable th) {
                obj = l.t(th);
            }
            abstractC0092a.releaseIntercepted();
            if (!(dVar2 instanceof AbstractC0092a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
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

    public Z0.d create(Object obj, Z0.d dVar) {
        i1.f.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
