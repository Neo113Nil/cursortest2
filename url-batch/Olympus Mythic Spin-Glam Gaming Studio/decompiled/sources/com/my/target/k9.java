package com.my.target;

import com.my.target.a2;
import com.my.target.z9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public class k9 {
    final ia a;
    final ArrayList b = new ArrayList();
    z9.a c;

    private k9(List list, a2 a2Var) {
        this.a = a2Var;
        a2Var.setCarouselListener(new a());
        for (int i : a2Var.getNumbersOfCurrentShowingCards()) {
            if (i < list.size() && i >= 0) {
                k8 k8Var = (k8) list.get(i);
                this.b.add(k8Var);
                wh.b(k8Var.H(), "show", 1);
            }
        }
    }

    public static k9 a(List list, a2 a2Var) {
        return new k9(list, a2Var);
    }

    public void a(z9.a aVar) {
        this.c = aVar;
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements a2.b {
        a() {
        }

        @Override // com.my.target.a2.b
        public void a(k8 k8Var, int i, n2 n2Var) {
            z9.a aVar = k9.this.c;
            if (aVar != null) {
                aVar.a(k8Var, null, i, s2.a(n2Var), k9.this.a.getView().getContext());
            }
        }

        @Override // com.my.target.a2.b
        public void a(List list) {
            String e = qi.e(k9.this.a.getView().getContext());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k8 k8Var = (k8) it.next();
                if (!k9.this.b.contains(k8Var)) {
                    k9.this.b.add(k8Var);
                    th H = k8Var.H();
                    if (e != null) {
                        wh.a(H, e, 1);
                    }
                    wh.a(H, "show", 1);
                }
            }
        }
    }
}
