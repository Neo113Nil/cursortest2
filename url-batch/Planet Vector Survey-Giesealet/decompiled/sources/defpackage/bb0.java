package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class bb0 implements ua0 {
    public final /* synthetic */ Object d;

    public /* synthetic */ bb0(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.ua0
    public d21 a(View view, d21 d21Var) {
        ou0 ou0Var = (ou0) this.d;
        ArrayList arrayList = ou0Var.b;
        z11 z11Var = d21Var.a;
        oy b = oy.b(z11Var.f(519), z11Var.f(64));
        oy b2 = oy.b(z11Var.g(519), z11Var.g(64));
        if (!b.equals(ou0Var.c) || !b2.equals(ou0Var.d)) {
            ou0Var.c = b;
            ou0Var.d = b2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                gi0 gi0Var = (gi0) arrayList.get(size);
                gi0Var.c = b;
                gi0Var.d = b2;
                gi0Var.c();
            }
        }
        return d21Var;
    }

    public void b() {
        qu quVar = (qu) this.d;
        synchronized (ur0.c) {
            List list = ur0.h;
            list.getClass();
            ArrayList arrayList = new ArrayList(ae.Y(list, 10));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && nz.l(obj, quVar)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            ur0.h = arrayList;
        }
    }
}
