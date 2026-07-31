package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﯧ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public abstract class AbstractC1226 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f3226 = StringFog.decrypt("p0t7uGPJb4qaQEigb8Zo\n", "9S4d1AaqG+M=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final ConcurrentHashMap f3225 = new ConcurrentHashMap();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Method m4478(Object obj, String str, List list) {
        Method m4476;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 != null) {
                arrayList.add(obj2.getClass());
            } else {
                arrayList.add(Object.class);
            }
        }
        C1230 c1230 = new C1230(obj, str, arrayList);
        ConcurrentHashMap concurrentHashMap = f3225;
        Method method = (Method) concurrentHashMap.get(c1230);
        if (method != null) {
            if (m4480(method.getParameterTypes(), list)) {
                return method;
            }
            AbstractC0844.m4219(f3226, StringFog.decrypt("vYHACmM5oLeMh9sLdjmks5ub1wExdKKmkJzWRQ==\n", "+POyZREZx9I=\n") + c1230, null, null);
        }
        if (obj instanceof Class) {
            m4476 = m4476((Class) obj, str, list, true);
            if (m4476 == null) {
                m4476 = m4476(Class.class.getClass(), str, list, false);
            }
        } else {
            m4476 = m4476(obj.getClass(), str, list, false);
        }
        if (m4476 != null) {
            concurrentHashMap.put(c1230, m4476);
        }
        return m4476;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Method m4476(Class cls, String str, List list, boolean z) {
        for (Method method : cls.getMethods()) {
            if (method.getName().equals(str) && method.getParameterTypes().length == list.size() && Modifier.isStatic(method.getModifiers()) == z && m4480(method.getParameterTypes(), list)) {
                return method;
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m4480(Class[] clsArr, List list) {
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= clsArr.length) {
                return true;
            }
            Object obj = list.get(i);
            if (obj == null && !Object.class.isAssignableFrom(clsArr[i])) {
                break;
            }
            if (obj != null) {
                Class cls = clsArr[i];
                Class<?> cls2 = obj.getClass();
                if (!cls.isAssignableFrom(Byte.TYPE) || !cls2.isAssignableFrom(Byte.class)) {
                    Class<?> cls3 = Short.TYPE;
                    if ((!cls.isAssignableFrom(cls3) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(cls3) || !cls2.isAssignableFrom(Byte.class))) {
                        Class<?> cls4 = Integer.TYPE;
                        if ((!cls.isAssignableFrom(cls4) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(cls4) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(cls4) || !cls2.isAssignableFrom(Byte.class)))) {
                            Class<?> cls5 = Long.TYPE;
                            if ((!cls.isAssignableFrom(cls5) || !cls2.isAssignableFrom(Long.class)) && ((!cls.isAssignableFrom(cls5) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(cls5) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(cls5) || !cls2.isAssignableFrom(Byte.class))))) {
                                Class<?> cls6 = Float.TYPE;
                                if ((!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Float.class)) && ((!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Long.class)) && ((!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Byte.class)))))) {
                                    Class<?> cls7 = Double.TYPE;
                                    if ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Double.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Float.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Long.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Short.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Byte.class)) && (!cls.isAssignableFrom(Boolean.TYPE) || !cls2.isAssignableFrom(Boolean.class)))))))) {
                                        z = cls.isAssignableFrom(cls2);
                                    }
                                }
                            }
                        }
                    }
                }
                if (!z) {
                    break;
                }
            }
            i++;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.reflect.Method] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Method m4477(Object obj, String str, ArrayList arrayList) {
        try {
            Class<?>[] clsArr = new Class[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                clsArr[i] = (Class) arrayList.get(i);
            }
            if (obj instanceof Class) {
                try {
                    obj = ((Class) obj).getMethod(str, clsArr);
                    return obj;
                } catch (NoSuchMethodException unused) {
                    return Class.class.getMethod(str, clsArr);
                }
            }
            return obj.getClass().getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String str2 = f3226;
            StringBuilder m4006 = AbstractC0446.m4006("3raY1g==\n", "kNm48Wq/DWI=\n", new StringBuilder(), str);
            m4006.append(StringFog.decrypt("NPi01FDvMYYzvrbESuN+hHyq+Q==\n", "E9jZsSSHXuI=\n"));
            m4006.append(obj);
            AbstractC0844.m4219(str2, m4006.toString(), e, null);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m4479(Class cls, List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if ((str.equals("") && (cls.getPackage() == null || cls.getPackage().getName().equals(""))) || (!str.equals("") && cls.getName().startsWith(str))) {
                return true;
            }
        }
        if (AbstractC1226.class.getName().startsWith(StringFog.decrypt("/F+VHVG63W/sX41BW62cYPtBjVJUocZ4\n", "nzD4MzjIsgE=\n"))) {
            return false;
        }
        if (AbstractC1226.class.getPackage() == null && cls.getPackage() == null) {
            return true;
        }
        return AbstractC1226.class.getPackage() != null && AbstractC1226.class.getPackage().equals(cls.getPackage());
    }
}
