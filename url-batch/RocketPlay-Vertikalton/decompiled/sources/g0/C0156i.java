package g0;

import K.C0024q;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: g0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156i extends AbstractC0135E {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f2904s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2905g;
    public ArrayList h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f2906j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2907k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2908l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f2909m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f2910n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f2911o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f2912p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f2913q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f2914r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Z) arrayList.get(size)).f2830a.animate().cancel();
        }
    }

    @Override // g0.AbstractC0135E
    public final boolean a(Z z2, Z z3, C0024q c0024q, C0024q c0024q2) {
        int i;
        int i2;
        int i3 = c0024q.f702a;
        int i4 = c0024q.f703b;
        if (z3.p()) {
            int i5 = c0024q.f702a;
            i2 = c0024q.f703b;
            i = i5;
        } else {
            i = c0024q2.f702a;
            i2 = c0024q2.f703b;
        }
        if (z2 == z3) {
            return g(z2, i3, i4, i, i2);
        }
        View view = z2.f2830a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(z2);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(z3);
        float f2 = -((int) ((i - i3) - translationX));
        View view2 = z3.f2830a;
        view2.setTranslationX(f2);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(RecyclerView.f1949A0);
        ArrayList arrayList = this.f2907k;
        C0154g c0154g = new C0154g();
        c0154g.f2883a = z2;
        c0154g.f2884b = z3;
        c0154g.f2885c = i3;
        c0154g.d = i4;
        c0154g.f2886e = i;
        c0154g.f2887f = i2;
        arrayList.add(c0154g);
        return true;
    }

    @Override // g0.AbstractC0135E
    public final void d(Z z2) {
        View view = z2.f2830a;
        view.animate().cancel();
        ArrayList arrayList = this.f2906j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0155h) arrayList.get(size)).f2895a == z2) {
                view.setTranslationY(RecyclerView.f1949A0);
                view.setTranslationX(RecyclerView.f1949A0);
                c(z2);
                arrayList.remove(size);
            }
        }
        j(this.f2907k, z2);
        if (this.h.remove(z2)) {
            view.setAlpha(1.0f);
            c(z2);
        }
        if (this.i.remove(z2)) {
            view.setAlpha(1.0f);
            c(z2);
        }
        ArrayList arrayList2 = this.f2910n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, z2);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f2909m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0155h) arrayList5.get(size4)).f2895a == z2) {
                    view.setTranslationY(RecyclerView.f1949A0);
                    view.setTranslationX(RecyclerView.f1949A0);
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
        ArrayList arrayList6 = this.f2908l;
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
        this.f2913q.remove(z2);
        this.f2911o.remove(z2);
        this.f2914r.remove(z2);
        this.f2912p.remove(z2);
        i();
    }

    @Override // g0.AbstractC0135E
    public final void e() {
        ArrayList arrayList = this.f2906j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0155h c0155h = (C0155h) arrayList.get(size);
            View view = c0155h.f2895a.f2830a;
            view.setTranslationY(RecyclerView.f1949A0);
            view.setTranslationX(RecyclerView.f1949A0);
            c(c0155h.f2895a);
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
            z2.f2830a.setAlpha(1.0f);
            c(z2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f2907k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0154g c0154g = (C0154g) arrayList4.get(size4);
            Z z3 = c0154g.f2883a;
            if (z3 != null) {
                k(c0154g, z3);
            }
            Z z4 = c0154g.f2884b;
            if (z4 != null) {
                k(c0154g, z4);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f2909m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0155h c0155h2 = (C0155h) arrayList6.get(size6);
                    View view2 = c0155h2.f2895a.f2830a;
                    view2.setTranslationY(RecyclerView.f1949A0);
                    view2.setTranslationX(RecyclerView.f1949A0);
                    c(c0155h2.f2895a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f2908l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    Z z5 = (Z) arrayList8.get(size8);
                    z5.f2830a.setAlpha(1.0f);
                    c(z5);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f2910n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0154g c0154g2 = (C0154g) arrayList10.get(size10);
                    Z z6 = c0154g2.f2883a;
                    if (z6 != null) {
                        k(c0154g2, z6);
                    }
                    Z z7 = c0154g2.f2884b;
                    if (z7 != null) {
                        k(c0154g2, z7);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f2913q);
            h(this.f2912p);
            h(this.f2911o);
            h(this.f2914r);
            ArrayList arrayList11 = this.f2768b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // g0.AbstractC0135E
    public final boolean f() {
        return (this.i.isEmpty() && this.f2907k.isEmpty() && this.f2906j.isEmpty() && this.h.isEmpty() && this.f2912p.isEmpty() && this.f2913q.isEmpty() && this.f2911o.isEmpty() && this.f2914r.isEmpty() && this.f2909m.isEmpty() && this.f2908l.isEmpty() && this.f2910n.isEmpty()) ? false : true;
    }

    public final boolean g(Z z2, int i, int i2, int i3, int i4) {
        View view = z2.f2830a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) z2.f2830a.getTranslationY());
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
        ArrayList arrayList = this.f2906j;
        C0155h c0155h = new C0155h();
        c0155h.f2895a = z2;
        c0155h.f2896b = translationX;
        c0155h.f2897c = translationY;
        c0155h.d = i3;
        c0155h.f2898e = i4;
        arrayList.add(c0155h);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f2768b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, Z z2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0154g c0154g = (C0154g) arrayList.get(size);
            if (k(c0154g, z2) && c0154g.f2883a == null && c0154g.f2884b == null) {
                arrayList.remove(c0154g);
            }
        }
    }

    public final boolean k(C0154g c0154g, Z z2) {
        if (c0154g.f2884b == z2) {
            c0154g.f2884b = null;
        } else {
            if (c0154g.f2883a != z2) {
                return false;
            }
            c0154g.f2883a = null;
        }
        z2.f2830a.setAlpha(1.0f);
        View view = z2.f2830a;
        view.setTranslationX(RecyclerView.f1949A0);
        view.setTranslationY(RecyclerView.f1949A0);
        c(z2);
        return true;
    }

    public final void l(Z z2) {
        if (f2904s == null) {
            f2904s = new ValueAnimator().getInterpolator();
        }
        z2.f2830a.animate().setInterpolator(f2904s);
        d(z2);
    }
}
