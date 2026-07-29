package retrofit2;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import javax.annotation.Nullable;
import o.K7;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes.dex */
final class DefaultMethodSupport {

    @Nullable
    private static Constructor<MethodHandles.Lookup> lookupConstructor;

    private DefaultMethodSupport() {
    }

    @Nullable
    @IgnoreJRERequirement
    public static Object invoke(Method method, Class<?> cls, Object obj, @Nullable Object[] objArr) {
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor<MethodHandles.Lookup> constructor = lookupConstructor;
        if (constructor == null) {
            constructor = K7.h().getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor.setAccessible(true);
            lookupConstructor = constructor;
        }
        unreflectSpecial = K7.m(constructor.newInstance(cls, -1)).unreflectSpecial(method, cls);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }
}
