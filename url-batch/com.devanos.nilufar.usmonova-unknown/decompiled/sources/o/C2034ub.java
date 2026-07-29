package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.ub, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2034ub {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public C2034ub(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0054Bz enumC0054Bz = (EnumC0054Bz) entry.getValue();
            List list = (List) this.a.get(enumC0054Bz);
            if (list == null) {
                list = new ArrayList();
                this.a.put(enumC0054Bz, list);
            }
            list.add((C2100vb) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0365Nz interfaceC0365Nz, EnumC0054Bz enumC0054Bz, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C2100vb c2100vb = (C2100vb) list.get(size);
                Method method = c2100vb.b;
                try {
                    int i = c2100vb.a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, interfaceC0365Nz);
                    } else if (i == 2) {
                        method.invoke(obj, interfaceC0365Nz, enumC0054Bz);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
