package o;

import com.google.firebase.messaging.Constants;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class Y7 implements InterfaceC2235xe, InterfaceC0474Se, Serializable {
    private final InterfaceC2235xe<Object> completion;

    public Y7(InterfaceC2235xe interfaceC2235xe) {
        this.completion = interfaceC2235xe;
    }

    public InterfaceC2235xe<C0782bY> create(InterfaceC2235xe<?> interfaceC2235xe) {
        AbstractC0048Bt.n(interfaceC2235xe, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // o.InterfaceC0474Se
    public InterfaceC0474Se getCallerFrame() {
        InterfaceC2235xe<Object> interfaceC2235xe = this.completion;
        if (interfaceC2235xe instanceof InterfaceC0474Se) {
            return (InterfaceC0474Se) interfaceC2235xe;
        }
        return null;
    }

    public final InterfaceC2235xe<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        InterfaceC0986eg interfaceC0986eg = (InterfaceC0986eg) getClass().getAnnotation(InterfaceC0986eg.class);
        String str2 = null;
        if (interfaceC0986eg == null || interfaceC0986eg.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField(Constants.ScionAnalytics.PARAM_LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? interfaceC0986eg.l()[i] : -1;
        C0264Kb c0264Kb = AbstractC1473m3.f;
        C0264Kb c0264Kb2 = AbstractC1473m3.g;
        if (c0264Kb2 == null) {
            try {
                C0264Kb c0264Kb3 = new C0264Kb(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                AbstractC1473m3.g = c0264Kb3;
                c0264Kb2 = c0264Kb3;
            } catch (Exception unused2) {
                AbstractC1473m3.g = c0264Kb;
                c0264Kb2 = c0264Kb;
            }
        }
        if (c0264Kb2 != c0264Kb && (method = c0264Kb2.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = c0264Kb2.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = c0264Kb2.c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = interfaceC0986eg.c();
        } else {
            str = str2 + '/' + interfaceC0986eg.c();
        }
        return new StackTraceElement(str, interfaceC0986eg.m(), interfaceC0986eg.f(), i2);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC2235xe
    public final void resumeWith(Object obj) {
        InterfaceC2235xe interfaceC2235xe = this;
        while (true) {
            Y7 y7 = (Y7) interfaceC2235xe;
            InterfaceC2235xe interfaceC2235xe2 = y7.completion;
            AbstractC0048Bt.k(interfaceC2235xe2);
            try {
                obj = y7.invokeSuspend(obj);
                if (obj == EnumC0448Re.h) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC1494mO.d(th);
            }
            y7.releaseIntercepted();
            if (!(interfaceC2235xe2 instanceof Y7)) {
                interfaceC2235xe2.resumeWith(obj);
                return;
            }
            interfaceC2235xe = interfaceC2235xe2;
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

    public InterfaceC2235xe<C0782bY> create(Object obj, InterfaceC2235xe<?> interfaceC2235xe) {
        AbstractC0048Bt.n(interfaceC2235xe, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
