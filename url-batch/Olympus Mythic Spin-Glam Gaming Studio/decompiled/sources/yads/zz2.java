package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* loaded from: classes13.dex */
public final class zz2 implements q92 {
    public static final List c = CollectionsKt.listOf((Object[]) new fz2[]{fz2.b, fz2.c});
    public final Map a;
    public boolean b;

    public zz2(u83 u83Var, u83 u83Var2) {
        this.a = MapsKt.mapOf(TuplesKt.to(fz2.b, u83Var), TuplesKt.to(fz2.c, u83Var2));
    }

    @Override // yads.q92
    public final void a(t8 t8Var) {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((q92) it.next()).a(t8Var);
        }
    }

    @Override // yads.q92
    public final void invalidate() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((q92) it.next()).invalidate();
        }
    }

    @Override // yads.q92
    public final void a(fz2 fz2Var, cc3 cc3Var) {
        q92 q92Var = (q92) this.a.get(fz2Var);
        if (q92Var != null) {
            q92Var.a(fz2Var, cc3Var);
        }
    }

    @Override // yads.q92
    public final void a(fz2 fz2Var, bc3 bc3Var) {
        q92 q92Var = (q92) this.a.get(fz2Var);
        if (q92Var != null) {
            q92Var.a(fz2Var, bc3Var);
        }
    }

    @Override // yads.q92
    public final void a(fz2 fz2Var, List list, cc3 cc3Var) {
        if (!this.b) {
            this.b = true;
            List plus = CollectionsKt.plus(list, fz2Var);
            for (fz2 fz2Var2 : CollectionsKt.minus((Iterable) c, (Iterable) CollectionsKt.toSet(plus))) {
                a(fz2Var2, cc3Var);
                a(fz2Var2, plus, cc3Var);
            }
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((fz2) it.next()) == fz2Var) {
                    return;
                }
            }
        }
        q92 q92Var = (q92) this.a.get(fz2Var);
        if (q92Var != null) {
            q92Var.a(fz2Var, list, cc3Var);
        }
    }

    @Override // yads.q92
    public final void a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            fz2 fz2Var = ((t92) obj).a.d;
            Object obj2 = linkedHashMap.get(fz2Var);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(fz2Var, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : MapsKt.withDefault(linkedHashMap, yz2.b).entrySet()) {
            fz2 fz2Var2 = (fz2) entry.getKey();
            List list2 = (List) entry.getValue();
            q92 q92Var = (q92) this.a.get(fz2Var2);
            if (q92Var != null) {
                q92Var.a(list2);
            }
        }
    }
}
