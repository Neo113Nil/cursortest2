package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes15.dex */
public final class xd0 extends lw0 {
    public final Map b;

    public xd0(Map map) {
        this.b = map;
    }

    public static /* synthetic */ boolean a(String str) {
        return str != null;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        g gVar;
        g gVar2;
        Iterator it = ((ex) entrySet()).iterator();
        if (obj == null) {
            do {
                gVar2 = (g) it;
                if (!gVar2.hasNext()) {
                    return false;
                }
            } while (((Map.Entry) gVar2.next()).getValue() != null);
            return true;
        }
        do {
            gVar = (g) it;
            if (!gVar.hasNext()) {
                return false;
            }
        } while (!obj.equals(((Map.Entry) gVar.next()).getValue()));
        return true;
    }

    @Override // yads.lw0, java.util.Map
    public final Set entrySet() {
        return az2.a(super.entrySet(), new ig2() { // from class: yads.xd0$$ExternalSyntheticLambda1
            @Override // yads.ig2
            public final boolean apply(Object obj) {
                return xd0.a((Map.Entry) obj);
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != null) {
            return this == obj ? true : obj instanceof Map ? ((xy2) entrySet()).equals(((Map) obj).entrySet()) : false;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return az2.a(entrySet());
    }

    @Override // yads.lw0, java.util.Map
    public final boolean isEmpty() {
        if (super.isEmpty()) {
            return true;
        }
        return super.size() == 1 && this.b.containsKey(null);
    }

    @Override // yads.lw0, java.util.Map
    public final Set keySet() {
        return az2.a(super.keySet(), new ig2() { // from class: yads.xd0$$ExternalSyntheticLambda0
            @Override // yads.ig2
            public final boolean apply(Object obj) {
                return xd0.a((String) obj);
            }
        });
    }

    @Override // yads.lw0, java.util.Map
    public final int size() {
        return super.size() - (this.b.containsKey(null) ? 1 : 0);
    }

    public static /* synthetic */ boolean a(Map.Entry entry) {
        return entry.getKey() != null;
    }
}
