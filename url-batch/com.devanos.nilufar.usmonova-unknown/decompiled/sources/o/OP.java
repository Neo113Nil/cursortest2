package o;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class OP {
    public static final List a = AbstractC0868ct.K(Application.class, DP.class);
    public static final List b = AbstractC0868ct.J(DP.class);

    public static final Constructor a(Class cls, List list) {
        AbstractC0048Bt.n(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        AbstractC0048Bt.m(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC0048Bt.m(parameterTypes, "constructor.parameterTypes");
            List t0 = P6.t0(parameterTypes);
            if (list.equals(t0)) {
                return constructor;
            }
            if (list.size() == t0.size() && t0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final UZ b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (UZ) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
