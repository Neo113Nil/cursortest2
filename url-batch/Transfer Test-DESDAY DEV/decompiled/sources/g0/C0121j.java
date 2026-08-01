package g0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: g0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121j extends E {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f2472s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2473g;
    public ArrayList h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f2474j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2475k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2476l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f2477m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f2478n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f2479o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f2480p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f2481q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f2482r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Z) arrayList.get(size)).f2392a.animate().cancel();
        }
    }

    @Override // g0.E
    public final boolean a(Z z2, Z z3, K.r rVar, K.r rVar2) {
        int i;
        int i2;
        int i3 = rVar.f440a;
        int i4 = rVar.f441b;
        if (z3.p()) {
            int i5 = rVar.f440a;
            i2 = rVar.f441b;
            i = i5;
        } else {
            i = rVar2.f440a;
            i2 = rVar2.f441b;
        }
        if (z2 == z3) {
            return g(z2, i3, i4, i, i2);
        }
        View view = z2.f2392a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(z2);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(z3);
        float f2 = -((int) ((i - i3) - translationX));
        View view2 = z3.f2392a;
        view2.setTranslationX(f2);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(RecyclerView.f1570A0);
        ArrayList arrayList = this.f2475k;
        C0119h c0119h = new C0119h();
        c0119h.f2454a = z2;
        c0119h.f2455b = z3;
        c0119h.f2456c = i3;
        c0119h.d = i4;
        c0119h.f2457e = i;
        c0119h.f2458f = i2;
        arrayList.add(c0119h);
        return true;
    }

    @Override // g0.E
    public final void d(Z z2) {
        View view = z2.f2392a;
        view.animate().cancel();
        ArrayList arrayList = this.f2474j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0120i) arrayList.get(size)).f2464a == z2) {
                view.setTranslationY(RecyclerView.f1570A0);
                view.setTranslationX(RecyclerView.f1570A0);
                c(z2);
                arrayList.remove(size);
            }
        }
        j(this.f2475k, z2);
        if (this.h.remove(z2)) {
            view.setAlpha(1.0f);
            c(z2);
        }
        if (this.i.remove(z2)) {
            view.setAlpha(1.0f);
            c(z2);
        }
        ArrayList arrayList2 = this.f2478n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, z2);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f2477m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0120i) arrayList5.get(size4)).f2464a == z2) {
                    view.setTranslationY(RecyclerView.f1570A0);
                    view.setTranslationX(RecyclerView.f1570A0);
                    c(z2);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f2476l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(z2)) {
                view.setAlpha(1.0f);
                c(z2);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f2481q.remove(z2);
        this.f2479o.remove(z2);
        this.f2482r.remove(z2);
        this.f2480p.remove(z2);
        i();
    }

    @Override // g0.E
    public final void e() {
        ArrayList arrayList = this.f2474j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0120i c0120i = (C0120i) arrayList.get(size);
            View view = c0120i.f2464a.f2392a;
            view.setTranslationY(RecyclerView.f1570A0);
            view.setTranslationX(RecyclerView.f1570A0);
            c(c0120i.f2464a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((Z) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            Z z2 = (Z) arrayList3.get(size3);
            z2.f2392a.setAlpha(1.0f);
            c(z2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f2475k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0119h c0119h = (C0119h) arrayList4.get(size4);
            Z z3 = c0119h.f2454a;
            if (z3 != null) {
                k(c0119h, z3);
            }
            Z z4 = c0119h.f2455b;
            if (z4 != null) {
                k(c0119h, z4);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f2477m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0120i c0120i2 = (C0120i) arrayList6.get(size6);
                    View view2 = c0120i2.f2464a.f2392a;
                    view2.setTranslationY(RecyclerView.f1570A0);
                    view2.setTranslationX(RecyclerView.f1570A0);
                    c(c0120i2.f2464a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f2476l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    Z z5 = (Z) arrayList8.get(size8);
                    z5.f2392a.setAlpha(1.0f);
                    c(z5);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f2478n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0119h c0119h2 = (C0119h) arrayList10.get(size10);
                    Z z6 = c0119h2.f2454a;
                    if (z6 != null) {
                        k(c0119h2, z6);
                    }
                    Z z7 = c0119h2.f2455b;
                    if (z7 != null) {
                        k(c0119h2, z7);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f2481q);
            h(this.f2480p);
            h(this.f2479o);
            h(this.f2482r);
            ArrayList arrayList11 = this.f2330b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // g0.E
    public final boolean f() {
        return (this.i.isEmpty() && this.f2475k.isEmpty() && this.f2474j.isEmpty() && this.h.isEmpty() && this.f2480p.isEmpty() && this.f2481q.isEmpty() && this.f2479o.isEmpty() && this.f2482r.isEmpty() && this.f2477m.isEmpty() && this.f2476l.isEmpty() && this.f2478n.isEmpty()) ? false : true;
    }

    public final boolean g(Z z2, int i, int i2, int i3, int i4) {
        View view = z2.f2392a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) z2.f2392a.getTranslationY());
        l(z2);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(z2);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.f2474j;
        C0120i c0120i = new C0120i();
        c0120i.f2464a = z2;
        c0120i.f2465b = translationX;
        c0120i.f2466c = translationY;
        c0120i.d = i3;
        c0120i.f2467e = i4;
        arrayList.add(c0120i);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f2330b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, Z z2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0119h c0119h = (C0119h) arrayList.get(size);
            if (k(c0119h, z2) && c0119h.f2454a == null && c0119h.f2455b == null) {
                arrayList.remove(c0119h);
            }
        }
    }

    public final boolean k(C0119h c0119h, Z z2) {
        if (c0119h.f2455b == z2) {
            c0119h.f2455b = null;
        } else {
            if (c0119h.f2454a != z2) {
                return false;
            }
            c0119h.f2454a = null;
        }
        z2.f2392a.setAlpha(1.0f);
        View view = z2.f2392a;
        view.setTranslationX(RecyclerView.f1570A0);
        view.setTranslationY(RecyclerView.f1570A0);
        c(z2);
        return true;
    }

    public final void l(Z z2) {
        if (f2472s == null) {
            f2472s = new ValueAnimator().getInterpolator();
        }
        z2.f2392a.animate().setInterpolator(f2472s);
        d(z2);
    }
}
