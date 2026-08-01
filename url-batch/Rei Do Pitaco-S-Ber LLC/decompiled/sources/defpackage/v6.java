package defpackage;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class v6 extends z50 {
    public int I;
    public ArrayList G = new ArrayList();
    public boolean H = true;
    public boolean J = false;
    public int K = 0;

    public v6() {
        M(1);
        J(new oi(2));
        J(new q9());
        J(new oi(1));
    }

    @Override // defpackage.z50
    public final void A() {
        ArrayList arrayList;
        if (this.G.isEmpty()) {
            H();
            m();
            return;
        }
        e60 e60Var = new e60();
        e60Var.b = this;
        ArrayList arrayList2 = this.G;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((z50) obj).a(e60Var);
        }
        this.I = this.G.size();
        if (this.H) {
            ArrayList arrayList3 = this.G;
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj2 = arrayList3.get(i);
                i++;
                ((z50) obj2).A();
            }
            return;
        }
        int i3 = 1;
        while (true) {
            int size3 = this.G.size();
            arrayList = this.G;
            if (i3 >= size3) {
                break;
            }
            ((z50) arrayList.get(i3 - 1)).a(new e60((z50) this.G.get(i3)));
            i3++;
        }
        z50 z50Var = (z50) arrayList.get(0);
        if (z50Var != null) {
            z50Var.A();
        }
    }

    @Override // defpackage.z50
    public final void C(oo ooVar) {
        this.K |= 8;
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            ((z50) this.G.get(i)).C(ooVar);
        }
    }

    @Override // defpackage.z50
    public final void E(iw iwVar) {
        super.E(iwVar);
        this.K |= 4;
        if (this.G != null) {
            for (int i = 0; i < this.G.size(); i++) {
                ((z50) this.G.get(i)).E(iwVar);
            }
        }
    }

    @Override // defpackage.z50
    public final void F() {
        this.K |= 2;
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            ((z50) this.G.get(i)).F();
        }
    }

    @Override // defpackage.z50
    public final void G(long j) {
        this.g = j;
    }

    @Override // defpackage.z50
    public final String I(String str) {
        String I = super.I(str);
        for (int i = 0; i < this.G.size(); i++) {
            I = I + "\n" + ((z50) this.G.get(i)).I(str.concat("  "));
        }
        return I;
    }

    public final void J(z50 z50Var) {
        this.G.add(z50Var);
        z50Var.o = this;
        long j = this.h;
        if (j >= 0) {
            z50Var.B(j);
        }
        if ((this.K & 1) != 0) {
            z50Var.D(this.i);
        }
        if ((this.K & 2) != 0) {
            z50Var.F();
        }
        if ((this.K & 4) != 0) {
            z50Var.E(this.B);
        }
        if ((this.K & 8) != 0) {
            z50Var.C(null);
        }
    }

    @Override // defpackage.z50
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void B(long j) {
        ArrayList arrayList;
        this.h = j;
        if (j < 0 || (arrayList = this.G) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((z50) this.G.get(i)).B(j);
        }
    }

    @Override // defpackage.z50
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void D(TimeInterpolator timeInterpolator) {
        this.K |= 1;
        ArrayList arrayList = this.G;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((z50) this.G.get(i)).D(timeInterpolator);
            }
        }
        this.i = timeInterpolator;
    }

    public final void M(int i) {
        if (i == 0) {
            this.H = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(n20.e("Invalid parameter for TransitionSet ordering: ", i));
            }
            this.H = false;
        }
    }

    @Override // defpackage.z50
    public final void c() {
        super.c();
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            ((z50) this.G.get(i)).c();
        }
    }

    @Override // defpackage.z50
    public final void d(h60 h60Var) {
        View view = h60Var.b;
        if (u(view)) {
            ArrayList arrayList = this.G;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                z50 z50Var = (z50) obj;
                if (z50Var.u(view)) {
                    z50Var.d(h60Var);
                    h60Var.c.add(z50Var);
                }
            }
        }
    }

    @Override // defpackage.z50
    public final void f(h60 h60Var) {
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            ((z50) this.G.get(i)).f(h60Var);
        }
    }

    @Override // defpackage.z50
    public final void g(h60 h60Var) {
        View view = h60Var.b;
        if (u(view)) {
            ArrayList arrayList = this.G;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                z50 z50Var = (z50) obj;
                if (z50Var.u(view)) {
                    z50Var.g(h60Var);
                    h60Var.c.add(z50Var);
                }
            }
        }
    }

    @Override // defpackage.z50
    /* renamed from: j */
    public final z50 clone() {
        v6 v6Var = (v6) super.clone();
        v6Var.G = new ArrayList();
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            z50 clone = ((z50) this.G.get(i)).clone();
            v6Var.G.add(clone);
            clone.o = v6Var;
        }
        return v6Var;
    }

    @Override // defpackage.z50
    public final void l(ViewGroup viewGroup, oe oeVar, oe oeVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.g;
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            z50 z50Var = (z50) this.G.get(i);
            if (j > 0 && (this.H || i == 0)) {
                long j2 = z50Var.g;
                if (j2 > 0) {
                    z50Var.G(j2 + j);
                } else {
                    z50Var.G(j);
                }
            }
            z50Var.l(viewGroup, oeVar, oeVar2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.z50
    public final void n() {
        for (int i = 0; i < this.G.size(); i++) {
            ((z50) this.G.get(i)).n();
        }
        super.n();
    }

    @Override // defpackage.z50
    public final void x(View view) {
        super.x(view);
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            ((z50) this.G.get(i)).x(view);
        }
    }

    @Override // defpackage.z50
    public final z50 y(w50 w50Var) {
        super.y(w50Var);
        return this;
    }

    @Override // defpackage.z50
    public final void z(View view) {
        super.z(view);
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            ((z50) this.G.get(i)).z(view);
        }
    }
}
