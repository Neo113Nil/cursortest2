package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class md {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public md(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            e20 e20Var = (e20) entry.getValue();
            List list = (List) this.a.get(e20Var);
            if (list == null) {
                list = new ArrayList();
                this.a.put(e20Var, list);
            }
            list.add((nd) entry.getKey());
        }
    }

    public static void a(List list, o20 o20Var, e20 e20Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                nd ndVar = (nd) list.get(size);
                Method method = ndVar.b;
                try {
                    int i = ndVar.a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, o20Var);
                    } else if (i == 2) {
                        method.invoke(obj, o20Var, e20Var);
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
