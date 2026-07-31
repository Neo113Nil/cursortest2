package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class e32 implements ez1 {
    public final m02 a;

    public e32(yu2 yu2Var) {
        this.a = new m02(yu2Var);
    }

    @Override // yads.ez1
    public final void a(Context context, dz1 dz1Var, ri2 ri2Var, cz1 cz1Var, l02 l02Var, sz1 sz1Var, uz1 uz1Var) {
        List list = dz1Var.a.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            az1 a = this.a.a(context, dz1Var, ri2Var, cz1Var, l02Var, sz1Var, (ry1) it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.isEmpty()) {
            uz1Var.a(e8.a);
        } else {
            uz1Var.a(arrayList);
        }
    }
}
