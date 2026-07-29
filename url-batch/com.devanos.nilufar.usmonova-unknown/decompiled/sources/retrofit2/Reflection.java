package retrofit2;

import android.annotation.TargetApi;
import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes.dex */
class Reflection {

    @TargetApi(24)
    @IgnoreJRERequirement
    public static final class Android24 extends Reflection {
        @Override // retrofit2.Reflection
        public Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, @Nullable Object[] objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return DefaultMethodSupport.invoke(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        @Override // retrofit2.Reflection
        public boolean isDefaultMethod(Method method) {
            return method.isDefault();
        }
    }

    @IgnoreJRERequirement
    public static class Java8 extends Reflection {
        @Override // retrofit2.Reflection
        public String describeMethodParameter(Method method, int i) {
            Parameter[] parameters;
            boolean isNamePresent;
            String name;
            parameters = method.getParameters();
            Parameter parameter = parameters[i];
            isNamePresent = parameter.isNamePresent();
            if (!isNamePresent) {
                return super.describeMethodParameter(method, i);
            }
            StringBuilder sb = new StringBuilder("parameter '");
            name = parameter.getName();
            sb.append(name);
            sb.append('\'');
            return sb.toString();
        }

        @Override // retrofit2.Reflection
        public Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, @Nullable Object[] objArr) {
            return DefaultMethodSupport.invoke(method, cls, obj, objArr);
        }

        @Override // retrofit2.Reflection
        public boolean isDefaultMethod(Method method) {
            return method.isDefault();
        }
    }

    public String describeMethodParameter(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    @Nullable
    public Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, @Nullable Object[] objArr) {
        throw new AssertionError();
    }

    public boolean isDefaultMethod(Method method) {
        return false;
    }
}
