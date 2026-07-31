package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ґ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0568 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f952 = StringFog.decrypt("saQcW6493b6QohNM\n", "/sZ2Ps1Jm9c=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final HashMap f951 = new HashMap();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final InterfaceC0858 m4061(Object obj, C0612 c0612, int i, C0658 c0658) {
        Field[] fieldArr;
        if (i != c0612.f1116.f1265.f1286 && obj != null && !c0612.f1114.contains(obj) && (i <= 0 || !(obj instanceof Activity))) {
            c0612.f1114.add(obj);
            try {
                k kVar = c0612.f1116.f1263;
                if (kVar != null) {
                    C1082 c1082 = C0860.m4221().f2086;
                    fieldArr = C1082.m4368(obj.getClass(), true, -1, kVar.f147);
                } else {
                    Class<?> cls = obj.getClass();
                    C0628 c0628 = c0612.f1116;
                    int i2 = C0628.m4118(i, c0628.f1265.f1284) ? c0628.f1265.f1283 : 0;
                    Field[] declaredFields = cls.getDeclaredFields();
                    for (int i3 = 0; cls != null && i3 != i2; i3++) {
                        cls = cls.getSuperclass();
                        if (cls != null) {
                            Field[] declaredFields2 = cls.getDeclaredFields();
                            String str = AbstractC1226.f3226;
                            int length = declaredFields.length;
                            int length2 = declaredFields2.length;
                            Field[] fieldArr2 = new Field[length + length2];
                            System.arraycopy(declaredFields, 0, fieldArr2, 0, length);
                            System.arraycopy(declaredFields2, 0, fieldArr2, length, length2);
                            declaredFields = fieldArr2;
                        }
                    }
                    fieldArr = declaredFields;
                }
                C1062 c1062 = c0612.f1115;
                for (Field field : fieldArr) {
                    field.setAccessible(true);
                    ((List) c1062.f2684.get(c1062.f2683)).add(field);
                    InterfaceC0858 m4059 = m4059(new C0658(field, obj, c0658), c0612, i);
                    if (m4059 != null && !c0612.f1113) {
                        return m4059;
                    }
                    ((List) c1062.f2684.get(c1062.f2683)).remove(field);
                }
            } catch (Throwable th) {
                String str2 = this.f952;
                AbstractC0580.m4080(str2, str2, StringFog.decrypt("ravV45Zvknecrc7ig2+6cIK8xPiiJpB+jA==\n", "6NmnjORP9RI=\n"), th, null, false);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0091 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:35:0x004f, B:37:0x0053, B:14:0x0087, B:15:0x008b, B:17:0x0091, B:19:0x00a3, B:21:0x00b2, B:22:0x00ae, B:27:0x00bc, B:38:0x005c, B:40:0x0060, B:41:0x0069, B:43:0x0073), top: B:34:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0043 A[SYNTHETIC] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0858 m4060(InterfaceC0858 interfaceC0858, C1062 c1062, int i) {
        C0658 c0658;
        Object obj;
        if (i >= c1062.f2684.size()) {
            return interfaceC0858;
        }
        List<Field> list = (List) c1062.f2684.get(i);
        C0658 c06582 = (C0658) interfaceC0858;
        Object m4133 = c06582.m4133();
        ArrayList m4058 = m4058(m4133, true, true, true);
        if (m4058 == null) {
            AbstractC0580.m4072(this.f952, StringFog.decrypt("O1CSvhCuW21ea423H79dfRdHjPscqB5EH1jO+wG/XWwXXoe/Uw==\n", "fiji23PaPgk=\n") + m4133.getClass());
            return null;
        }
        Iterator it = m4058.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (m4133 != null) {
                try {
                    if (m4133 instanceof Collection) {
                        c0658 = new C0658((Collection) m4133, next, c06582);
                    } else if (m4133 instanceof Map) {
                        c0658 = new C0658((Map) m4133, next, c06582);
                    } else if (m4133.getClass().isArray()) {
                        c0658 = new C0658(new ArrayList(Arrays.asList(m4133)), next, c06582);
                    }
                    for (Field field : list) {
                        if (WeakReference.class.isAssignableFrom(field.getType())) {
                            obj = ((WeakReference) field.get(next)).get();
                        } else {
                            obj = field.get(next);
                        }
                        C0658 c06583 = new C0658(field, next, c0658);
                        next = obj;
                        c0658 = c06583;
                    }
                } catch (Exception unused) {
                    continue;
                }
                if (c0658 == null) {
                    return m4060(c0658, c1062, i + 1);
                }
                continue;
            }
            c0658 = null;
            while (r7.hasNext()) {
            }
            if (c0658 == null) {
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final InterfaceC0858 m4062(Object obj, C0628 c0628) {
        InterfaceC0858 interfaceC0858;
        boolean z;
        Object obj2;
        long currentTimeMillis = System.currentTimeMillis();
        Class<?> cls = obj.getClass();
        C0635 c0635 = c0628.f1265;
        c0635.f1290 = cls;
        C1062 c1062 = (C1062) this.f951.get(c0635);
        if (c1062 != null) {
            try {
                Object obj3 = obj;
                C0658 c0658 = null;
                for (Field field : (List) c1062.f2684.get(0)) {
                    if (WeakReference.class.isAssignableFrom(field.getType())) {
                        obj2 = ((WeakReference) field.get(obj3)).get();
                    } else {
                        obj2 = field.get(obj3);
                    }
                    C0658 c06582 = new C0658(field, obj3, c0658);
                    obj3 = obj2;
                    c0658 = c06582;
                }
                interfaceC0858 = m4060(c0658, c1062, 1);
            } catch (Exception e) {
                String str = this.f952;
                AbstractC0580.m4080(str, str, StringFog.decrypt("7VS6yGIculrcUqHJdxySXcJDq9NWVbhTzAau1X9R/U/JUqA=\n", "qCbIpxA83T8=\n"), e, null, false);
                interfaceC0858 = null;
            }
            if (interfaceC0858 != null) {
                try {
                    z = c0628.f1264.mo3952(interfaceC0858);
                } catch (Exception unused) {
                    z = false;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(StringFog.decrypt("p8kU4zT7wX2uy0H9Ma/PL6jIQQ==\n", "waZhjVDbpw8=\n"));
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    m4063(interfaceC0858, obj, AbstractC1293.m4543("TMI=\n", "IbFgcbMGyBM=\n", sb));
                    return interfaceC0858;
                }
            }
            AbstractC0580.m4072(this.f952, obj + StringFog.decrypt("0vcs9znbsNqBpC8=\n", "6Ndclk2zkLc=\n"));
            this.f951.remove(c0635);
        }
        C0612 c0612 = new C0612(c0628);
        InterfaceC0858 m4061 = m4061(obj, c0612, 0, (C0658) null);
        if (m4061 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(StringFog.decrypt("ig4KI1lZgWzM\n", "7GF/TT156AI=\n"));
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append(StringFog.decrypt("L4kCHA==\n", "QvouPHYQuZo=\n"));
            sb2.append(c0612.f1114.size());
            m4063(m4061, obj, AbstractC1293.m4543("YAlNiHOllsdgD0HCZaOW\n", "QGYv4hbG4rQ=\n", sb2));
            this.f951.put(c0635, c0612.f1115);
            return m4061;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(StringFog.decrypt("gVXjwFngIB+LGv6OHw==\n", "7zqX4D+PVXE=\n"));
        sb3.append(System.currentTimeMillis() - currentTimeMillis);
        sb3.append(StringFog.decrypt("IU/xqQ==\n", "TDzdiU/k6Ac=\n"));
        sb3.append(c0612.f1114.size());
        m4063((InterfaceC0858) null, obj, AbstractC1293.m4543("5PuXgTwHBwHk/ZvLKgEH\n", "xJT161lkc3I=\n", sb3));
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final InterfaceC0858 m4059(C0658 c0658, C0612 c0612, int i) {
        C0658 c06582;
        boolean z;
        Object m4133 = c0658.m4133();
        if (c0612.f1114.contains(m4133) || c0612.f1112.contains(m4133)) {
            return null;
        }
        if (C0628.m4118(i, c0612.f1116.f1265.f1285)) {
            try {
                z = c0612.f1116.f1264.mo3952(c0658);
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                if (c0612.f1113) {
                    c0612.f1111.add(c0658);
                    c0612.f1112.add(m4133);
                }
                return c0658;
            }
        }
        if (m4133 instanceof WeakReference) {
            WeakReference weakReference = (WeakReference) m4133;
            if (weakReference.get() != null && C0628.m4118(i, c0612.f1116.f1265.f1282)) {
                Object obj = weakReference.get();
                if (obj != null ? AbstractC1226.m4479(obj.getClass(), c0612.f1116.f1265.f1287) : false) {
                    return m4061(weakReference.get(), c0612, i + 1, c0658);
                }
            }
        }
        if (m4133 != null ? AbstractC1226.m4479(m4133.getClass(), c0612.f1116.f1265.f1287) : false) {
            return m4061(m4133, c0612, i + 1, c0658);
        }
        if (c0612.f1116.f1265.f1278 && m4133 != null) {
            c0612.f1114.add(m4133);
        }
        C0628 c0628 = c0612.f1116;
        ArrayList m4058 = m4058(m4133, C0628.m4118(i, c0628.f1265.f1281), C0628.m4118(i, c0628.f1265.f1280), C0628.m4118(i, c0628.f1265.f1279));
        C1062 c1062 = c0612.f1115;
        if (m4058 == null) {
            return null;
        }
        InterfaceC0858 interfaceC0858 = null;
        for (Object obj2 : m4058) {
            if (m4133 != null) {
                if (m4133 instanceof Collection) {
                    c06582 = new C0658((Collection) m4133, obj2, c0658);
                } else if (m4133 instanceof Map) {
                    c06582 = new C0658((Map) m4133, obj2, c0658);
                } else if (m4133.getClass().isArray()) {
                    c06582 = new C0658(new ArrayList(Arrays.asList(m4133)), obj2, c0658);
                }
                int i2 = c1062.f2683 + 1;
                c1062.f2683 = i2;
                c1062.f2684.add(i2, new ArrayList());
                interfaceC0858 = m4059(c06582, c0612, i);
                if (interfaceC0858 == null && !c0612.f1113) {
                    return interfaceC0858;
                }
                c1062.f2684.remove(c1062.f2683);
                c1062.f2683--;
            }
            c06582 = null;
            int i22 = c1062.f2683 + 1;
            c1062.f2683 = i22;
            c1062.f2684.add(i22, new ArrayList());
            interfaceC0858 = m4059(c06582, c0612, i);
            if (interfaceC0858 == null) {
            }
            c1062.f2684.remove(c1062.f2683);
            c1062.f2683--;
        }
        return interfaceC0858;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m4058(Object obj, boolean z, boolean z2, boolean z3) {
        if (obj != null) {
            if ((obj instanceof Collection) && z) {
                return new ArrayList((Collection) obj);
            }
            if (obj.getClass().isArray() && z3) {
                return new ArrayList(Arrays.asList(obj));
            }
            if ((obj instanceof Map) && z2) {
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                arrayList.addAll(map.keySet());
                return arrayList;
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m4057(Object obj, Class cls, String str) {
        if (cls == null || cls.equals(Object.class)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Field field : cls.getDeclaredFields()) {
            if (field.getType().equals(String.class)) {
                arrayList.add(field);
            }
        }
        for (Field field2 : (Field[]) arrayList.toArray(new Field[0])) {
            field2.setAccessible(true);
            try {
                String str2 = (String) field2.get(obj);
                if (str2 != null && Pattern.compile(str).matcher(str2).matches()) {
                    return str2;
                }
            } catch (Exception unused) {
            }
        }
        return m4057(obj, cls.getSuperclass(), str);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4063(InterfaceC0858 interfaceC0858, Object obj, String str) {
        if (interfaceC0858 != null) {
            String str2 = this.f952;
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            StringBuilder m4006 = AbstractC0446.m4006("SUQ=\n", "c2RW7+138C8=\n", sb, str);
            m4006.append(StringFog.decrypt("G70561htnBQ=\n", "N51PijQY+TQ=\n"));
            m4006.append(((C0658) interfaceC0858).m4133());
            AbstractC0580.m4073(str2, m4006.toString());
            return;
        }
        AbstractC0580.m4073(this.f952, obj + StringFog.decrypt("wYo=\n", "+6q/aOt/zzs=\n") + str);
    }
}
