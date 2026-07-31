package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class xj2 implements cg3 {
    public final Context a;
    public final List b;

    public xj2(Context context, we3 we3Var) {
        this.a = context.getApplicationContext();
        d20 d20Var = we3Var.a;
        long j = d20Var.i;
        ArrayList arrayList = d20Var.d;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (Intrinsics.areEqual("progress", ((n83) next).a)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            n83 n83Var = (n83) it2.next();
            id3 id3Var = n83Var.c;
            wj2 wj2Var = null;
            if (id3Var != null) {
                hd3 hd3Var = hd3.b;
                hd3 hd3Var2 = id3Var.b;
                Long valueOf = hd3Var == hd3Var2 ? Long.valueOf((long) id3Var.c) : hd3.c == hd3Var2 ? Long.valueOf((long) ((id3Var.c / 100) * j)) : null;
                if (valueOf != null) {
                    wj2Var = new wj2(n83Var.b, valueOf.longValue());
                }
            }
            if (wj2Var != null) {
                arrayList3.add(wj2Var);
            }
        }
        this.b = CollectionsKt.toMutableList((Collection) arrayList3);
    }

    @Override // yads.cg3
    public final void a(long j, long j2) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            wj2 wj2Var = (wj2) it.next();
            if (wj2Var.b <= j2) {
                li3 a = li3.c.a(this.a);
                a.b.a(new nd2(a.a, wj2Var.a, new om3()));
                it.remove();
            }
        }
    }
}
