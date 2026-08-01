package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class je extends jy {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((dz) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // defpackage.jy
    public final boolean a(dz dzVar, dz dzVar2, av avVar, av avVar2) {
        int i;
        int i2;
        int i3 = avVar.a;
        int i4 = avVar.b;
        if (dzVar2.o()) {
            int i5 = avVar.a;
            i2 = avVar.b;
            i = i5;
        } else {
            i = avVar2.a;
            i2 = avVar2.b;
        }
        if (dzVar == dzVar2) {
            return g(dzVar, i3, i4, i, i2);
        }
        View view = dzVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(dzVar);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = dzVar2.a;
        l(dzVar2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        he heVar = new he();
        heVar.a = dzVar;
        heVar.b = dzVar2;
        heVar.c = i3;
        heVar.d = i4;
        heVar.e = i;
        heVar.f = i2;
        arrayList.add(heVar);
        return true;
    }

    @Override // defpackage.jy
    public final void d(dz dzVar) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = dzVar.a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((ie) arrayList4.get(size)).a == dzVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(dzVar);
                arrayList4.remove(size);
            }
        }
        j(this.k, dzVar);
        if (this.h.remove(dzVar)) {
            view.setAlpha(1.0f);
            c(dzVar);
        }
        if (this.i.remove(dzVar)) {
            view.setAlpha(1.0f);
            c(dzVar);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, dzVar);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((ie) arrayList6.get(size4)).a == dzVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(dzVar);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(dzVar)) {
                view.setAlpha(1.0f);
                c(dzVar);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(dzVar);
        this.o.remove(dzVar);
        this.r.remove(dzVar);
        this.p.remove(dzVar);
        i();
    }

    @Override // defpackage.jy
    public final void e() {
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.n;
        ArrayList arrayList3 = this.l;
        ArrayList arrayList4 = this.m;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ie ieVar = (ie) arrayList7.get(size);
            View view = ieVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(ieVar.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((dz) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            dz dzVar = (dz) arrayList5.get(size3);
            dzVar.a.setAlpha(1.0f);
            c(dzVar);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            he heVar = (he) arrayList.get(size4);
            dz dzVar2 = heVar.a;
            if (dzVar2 != null) {
                k(heVar, dzVar2);
            }
            dz dzVar3 = heVar.b;
            if (dzVar3 != null) {
                k(heVar, dzVar3);
            }
        }
        arrayList.clear();
        if (f()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    ie ieVar2 = (ie) arrayList8.get(size6);
                    View view2 = ieVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(ieVar2.a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    dz dzVar4 = (dz) arrayList9.get(size8);
                    dzVar4.a.setAlpha(1.0f);
                    c(dzVar4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    he heVar2 = (he) arrayList10.get(size10);
                    dz dzVar5 = heVar2.a;
                    if (dzVar5 != null) {
                        k(heVar2, dzVar5);
                    }
                    dz dzVar6 = heVar2.b;
                    if (dzVar6 != null) {
                        k(heVar2, dzVar6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                l8.c();
            }
        }
    }

    @Override // defpackage.jy
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(dz dzVar, int i, int i2, int i3, int i4) {
        View view = dzVar.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) dzVar.a.getTranslationY());
        l(dzVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(dzVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        ie ieVar = new ie();
        ieVar.a = dzVar;
        ieVar.b = translationX;
        ieVar.c = translationY;
        ieVar.d = i3;
        ieVar.e = i4;
        arrayList.add(ieVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            l8.c();
        }
    }

    public final void j(ArrayList arrayList, dz dzVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            he heVar = (he) arrayList.get(size);
            if (k(heVar, dzVar) && heVar.a == null && heVar.b == null) {
                arrayList.remove(heVar);
            }
        }
    }

    public final boolean k(he heVar, dz dzVar) {
        if (heVar.b == dzVar) {
            heVar.b = null;
        } else {
            if (heVar.a != dzVar) {
                return false;
            }
            heVar.a = null;
        }
        View view = dzVar.a;
        View view2 = dzVar.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(dzVar);
        return true;
    }

    public final void l(dz dzVar) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        dzVar.a.animate().setInterpolator(s);
        d(dzVar);
    }
}
