package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* loaded from: classes15.dex */
public final class u83 implements q92 {
    public final w41 a;
    public final y41 b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;

    public u83(w41 w41Var, y41 y41Var) {
        this.a = w41Var;
        this.b = y41Var;
    }

    @Override // yads.q92
    public final void a(t8 t8Var) {
        this.a.a = t8Var;
    }

    @Override // yads.q92
    public final void invalidate() {
        this.c = false;
        this.d = 0;
        this.e = false;
        this.f = false;
    }

    @Override // yads.q92
    public final void a(fz2 fz2Var, cc3 cc3Var) {
        if (this.c) {
            return;
        }
        this.c = true;
        Map a = a(cc3Var);
        w41 w41Var = this.a;
        fo2 fo2Var = this.b.b;
        io2 a2 = w41Var.a();
        a2.a.putAll(a);
        w41Var.a(fo2Var, a2);
    }

    @Override // yads.q92
    public final void a(fz2 fz2Var, bc3 bc3Var) {
        int i = this.d + 1;
        this.d = i;
        if (i == 20) {
            this.e = true;
            w41 w41Var = this.a;
            w41Var.a(this.b.c, w41Var.a(bc3Var));
        }
    }

    @Override // yads.q92
    public final void a(List list) {
        t92 t92Var = (t92) CollectionsKt.firstOrNull(list);
        if (t92Var == null) {
            return;
        }
        w41 w41Var = this.a;
        w41Var.a(this.b.d, w41Var.a(t92Var.b));
    }

    @Override // yads.q92
    public final void a(fz2 fz2Var, List list, cc3 cc3Var) {
        if (this.f) {
            return;
        }
        this.f = true;
        Map a = a(cc3Var);
        w41 w41Var = this.a;
        fo2 fo2Var = this.b.a;
        io2 a2 = w41Var.a();
        a2.a.putAll(a);
        w41Var.a(fo2Var, a2);
    }

    public final Map a(cc3 cc3Var) {
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put("failure_tracked", Boolean.valueOf(this.e));
        if (!cc3Var.a.isEmpty()) {
            List list = cc3Var.a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((dc3) it.next()).b);
            }
            createMapBuilder.put("warnings", arrayList);
        }
        return MapsKt.build(createMapBuilder);
    }
}
