package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class f13 extends z12 {
    public final j32 g;
    public final vw2 h;

    public f13(j32 j32Var, zy1 zy1Var, vw2 vw2Var, t8 t8Var) {
        super(zy1Var, t8Var);
        this.g = j32Var;
        this.h = vw2Var;
    }

    @Override // yads.z12
    public final ec3 a(Context context, int i, boolean z) {
        bu2 a = this.h.a(context);
        boolean z2 = true;
        ec3 a2 = a != null ? a.p : true ? super.a(context, i, z) : new cc3();
        if (!(a2 instanceof cc3)) {
            return a2;
        }
        ArrayList arrayList = this.g.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof f42) {
                arrayList2.add(next);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            loop1: while (it2.hasNext()) {
                f42 f42Var = (f42) it2.next();
                z12 z12Var = f42Var.d;
                x72 x72Var = f42Var.e;
                bu2 a3 = this.h.a(context);
                boolean z3 = a3 != null ? a3.p : true;
                Iterator it3 = x72Var.b.iterator();
                while (it3.hasNext()) {
                    int i2 = z3 ? ((ez2) it3.next()).c : i;
                    if ((z ? z12Var.a(context, i2, true) : z12Var.a(context, i2, false)) instanceof bc3) {
                        break;
                    }
                }
            }
        }
        z2 = false;
        return !z2 ? new bc3(ac3.d, null, null) : a2;
    }
}
