package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes11.dex */
public final class ng1 {
    public final bf a;
    public final sv2 b;
    public final es1 c;
    public final az d;
    public final x30 e;
    public final hh1 f;

    public ng1(bf bfVar, sv2 sv2Var, es1 es1Var, az azVar, x30 x30Var, hh1 hh1Var) {
        this.a = bfVar;
        this.b = sv2Var;
        this.c = es1Var;
        this.d = azVar;
        this.e = x30Var;
        this.f = hh1Var;
    }

    public final g80 a() {
        g90 g90Var;
        String d;
        String c;
        h80 h80Var;
        r50 a = this.a.a();
        sv2 sv2Var = this.b;
        ou1 ou1Var = sv2Var.b;
        Context context = sv2Var.a;
        ou1Var.getClass();
        nu1 a2 = ou1.a(context);
        boolean z = false;
        if (Intrinsics.areEqual(a2, lu1.a)) {
            g90Var = new g90(true, CollectionsKt.emptyList());
        } else {
            if (!(a2 instanceof mu1)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = ((mu1) a2).a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ja1) it.next()).getMessage());
            }
            g90Var = new g90(false, arrayList);
        }
        es1 es1Var = this.c;
        es1Var.getClass();
        String str = dr1.d;
        ArrayList a3 = es1Var.a.a(br1.a());
        az azVar = this.d;
        boolean b = azVar.a.b();
        Boolean c2 = azVar.a.c();
        Boolean e = azVar.a.e();
        String b2 = azVar.b.b();
        if ((b2 != null && !StringsKt.isBlank(b2)) || (((d = azVar.b.d()) != null && !StringsKt.isBlank(d)) || ((c = azVar.b.c()) != null && !StringsKt.isBlank(c)))) {
            z = true;
        }
        y50 y50Var = new y50(b, c2, e, z);
        z70 z70Var = new z70(this.e.a.d());
        hh1 hh1Var = this.f;
        hh1Var.getClass();
        synchronized (hh1.c) {
            h80Var = !su1.a.a() ? null : new h80(hh1Var.a.b(), hh1Var.b.b());
        }
        return new g80(a, g90Var, a3, y50Var, z70Var, h80Var);
    }
}
