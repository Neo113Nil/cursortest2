package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: o.Qz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0443Qz {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0339Mz interfaceC0339Mz) {
        try {
            AbstractC0048Bt.m(constructor.newInstance(interfaceC0339Mz), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        boolean z;
        HashMap hashMap = a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r3 != null ? r3.getName() : "";
                AbstractC0048Bt.m(name, "fullPackage");
                if (name.length() != 0) {
                    AbstractC0048Bt.m(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    AbstractC0048Bt.m(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                AbstractC0048Bt.m(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = AbstractC0778bU.z(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    concat = name + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap hashMap2 = b;
            if (constructor != null) {
                hashMap2.put(cls, AbstractC0868ct.J(constructor));
            } else {
                C2166wb c2166wb = C2166wb.c;
                HashMap hashMap3 = c2166wb.b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            }
                            if (((InterfaceC1026fG) declaredMethods[i2].getAnnotation(InterfaceC1026fG.class)) != null) {
                                c2166wb.a(cls, declaredMethods);
                                z = true;
                                break;
                            }
                            i2++;
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0339Mz.class.isAssignableFrom(superclass)) {
                        AbstractC0048Bt.m(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            AbstractC0048Bt.k(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    AbstractC0048Bt.m(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class<?> cls2 = interfaces[i3];
                            if (cls2 != null && InterfaceC0339Mz.class.isAssignableFrom(cls2)) {
                                AbstractC0048Bt.m(cls2, "intrface");
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                AbstractC0048Bt.k(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i3++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        hashMap.put(cls, Integer.valueOf(i));
        return i;
    }
}
