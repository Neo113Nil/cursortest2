package defpackage;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class s80 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        for (p80 p80Var : this.a.values()) {
            p80Var.getClass();
            HashMap hashMap = p80Var.a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        Iterator it = p80Var.a.values().iterator();
                        while (it.hasNext()) {
                            p80.a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = p80Var.b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = p80Var.b.iterator();
                        while (it2.hasNext()) {
                            p80.a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
            }
            p80Var.b();
        }
        this.a.clear();
    }
}
