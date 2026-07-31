package yads;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class pl2 implements cg3 {
    public final wj3 a;
    public final List b = CollectionsKt.mutableListOf(new ol2(uj3.b, 0.25f), new ol2(uj3.c, 0.5f), new ol2(uj3.d, 0.75f));

    public pl2(wj3 wj3Var) {
        this.a = wj3Var;
    }

    @Override // yads.cg3
    public final void a(long j, long j2) {
        if (j != 0) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ol2 ol2Var = (ol2) it.next();
                if (ol2Var.b * j <= j2) {
                    this.a.a.a(ol2Var.a);
                    it.remove();
                }
            }
        }
    }
}
