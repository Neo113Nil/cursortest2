package com.smaato.sdk.ng.utils.reflection;

import com.smaato.sdk.ng.NextGen;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ReflectionUtils {
    public static Method getDeclaredMethodWithTraversal(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        while (cls != null) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException e) {
                NextGen.reportException((Exception) e);
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException();
    }

    public static class MethodBuilder {
        private final Object a;
        private final String b;
        private Class<?> c;
        private final List<Class<?>> d = new ArrayList();
        private final List<Object> e = new ArrayList();
        private boolean f;
        private boolean g;

        public MethodBuilder(Object obj, String str) {
            this.a = obj;
            this.b = str;
            this.c = obj != null ? obj.getClass() : null;
        }

        public <T> MethodBuilder addParam(Class<T> cls, T t) {
            this.d.add(cls);
            this.e.add(t);
            return this;
        }

        public Object execute() throws Exception {
            Method declaredMethodWithTraversal = ReflectionUtils.getDeclaredMethodWithTraversal(this.c, this.b, (Class[]) this.d.toArray(new Class[this.d.size()]));
            if (this.f) {
                declaredMethodWithTraversal.setAccessible(true);
            }
            Object[] array = this.e.toArray();
            return this.g ? declaredMethodWithTraversal.invoke(null, array) : declaredMethodWithTraversal.invoke(this.a, array);
        }

        public MethodBuilder setStatic(Class<?> cls) {
            this.g = true;
            this.c = cls;
            return this;
        }

        public MethodBuilder setStatic(String str) throws ClassNotFoundException {
            this.g = true;
            this.c = Class.forName(str);
            return this;
        }
    }
}
