package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1884a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1885b;

    public C0068a(HashMap hashMap) {
        this.f1885b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0079l enumC0079l = (EnumC0079l) entry.getValue();
            List list = (List) this.f1884a.get(enumC0079l);
            if (list == null) {
                list = new ArrayList();
                this.f1884a.put(enumC0079l, list);
            }
            list.add((C0069b) entry.getKey());
        }
    }

    public static void a(List list, t tVar, EnumC0079l enumC0079l, InterfaceC0085s interfaceC0085s) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0069b c0069b = (C0069b) list.get(size);
                c0069b.getClass();
                try {
                    int i = c0069b.f1886a;
                    Method method = c0069b.f1887b;
                    if (i == 0) {
                        method.invoke(interfaceC0085s, null);
                    } else if (i == 1) {
                        method.invoke(interfaceC0085s, tVar);
                    } else if (i == 2) {
                        method.invoke(interfaceC0085s, tVar, enumC0079l);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException("Failed to call observer method", e3.getCause());
                }
            }
        }
    }
}
