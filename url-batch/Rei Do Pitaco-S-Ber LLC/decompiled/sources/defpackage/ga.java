package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ga {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public ga(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            fp fpVar = (fp) entry.getValue();
            List list = (List) this.a.get(fpVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(fpVar, list);
            }
            list.add((ha) entry.getKey());
        }
    }

    public static void a(List list, lp lpVar, fp fpVar, kp kpVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ha haVar = (ha) list.get(size);
                Method method = haVar.b;
                try {
                    int i = haVar.a;
                    if (i == 0) {
                        method.invoke(kpVar, null);
                    } else if (i == 1) {
                        method.invoke(kpVar, lpVar);
                    } else if (i == 2) {
                        method.invoke(kpVar, lpVar, fpVar);
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
