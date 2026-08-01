package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class c60 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public z50 f;
    public ViewGroup g;

    /* JADX WARN: Removed duplicated region for block: B:114:0x01e0 A[EDGE_INSN: B:114:0x01e0->B:115:0x01e0 BREAK  A[LOOP:1: B:16:0x0084->B:28:0x01d9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        l6 l6Var;
        l6 l6Var2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        v50 v50Var;
        boolean z;
        h60 h60Var;
        View view;
        View view2;
        boolean z2;
        z50 z50Var = this.f;
        ViewGroup viewGroup = this.g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z3 = true;
        if (!d60.c.remove(viewGroup)) {
            return true;
        }
        l6 b = d60.b();
        ArrayList arrayList2 = (ArrayList) b.get(viewGroup);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            b.put(viewGroup, arrayList2);
        } else if (arrayList2.size() > 0) {
            arrayList = new ArrayList(arrayList2);
            arrayList2.add(z50Var);
            z50Var.a(new b60(this, b));
            i = 0;
            z50Var.h(viewGroup, false);
            if (arrayList != null) {
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ((z50) obj).z(viewGroup);
                }
            }
            z50Var.q = new ArrayList();
            z50Var.r = new ArrayList();
            oe oeVar = z50Var.m;
            oe oeVar2 = z50Var.n;
            l6Var = new l6((l6) oeVar.f);
            l6Var2 = new l6((l6) oeVar2.f);
            i2 = 0;
            while (true) {
                iArr = z50Var.p;
                if (i2 < iArr.length) {
                    break;
                }
                int i7 = iArr[i2];
                if (i7 == z3) {
                    z = z3;
                    for (int i8 = l6Var.h - 1; i8 >= 0; i8--) {
                        View view3 = (View) l6Var.f(i8);
                        if (view3 != null && z50Var.u(view3) && (h60Var = (h60) l6Var2.remove(view3)) != null && z50Var.u(h60Var.b)) {
                            z50Var.q.add((h60) l6Var.g(i8));
                            z50Var.r.add(h60Var);
                        }
                    }
                } else if (i7 == 2) {
                    z = z3;
                    l6 l6Var3 = (l6) oeVar.i;
                    l6 l6Var4 = (l6) oeVar2.i;
                    int i9 = l6Var3.h;
                    for (int i10 = 0; i10 < i9; i10++) {
                        View view4 = (View) l6Var3.i(i10);
                        if (view4 != null && z50Var.u(view4) && (view = (View) l6Var4.get(l6Var3.f(i10))) != null && z50Var.u(view)) {
                            h60 h60Var2 = (h60) l6Var.get(view4);
                            h60 h60Var3 = (h60) l6Var2.get(view);
                            if (h60Var2 != null && h60Var3 != null) {
                                z50Var.q.add(h60Var2);
                                z50Var.r.add(h60Var3);
                                l6Var.remove(view4);
                                l6Var2.remove(view);
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 4) {
                        rq rqVar = (rq) oeVar.h;
                        rq rqVar2 = (rq) oeVar2.h;
                        int e = rqVar.e();
                        int i11 = i;
                        while (i11 < e) {
                            View view5 = (View) rqVar.f(i11);
                            if (view5 == null || !z50Var.u(view5)) {
                                z2 = z3;
                            } else {
                                boolean z4 = z3;
                                View view6 = (View) rqVar2.b(rqVar.c(i11));
                                if (view6 != null && z50Var.u(view6)) {
                                    h60 h60Var4 = (h60) l6Var.get(view5);
                                    h60 h60Var5 = (h60) l6Var2.get(view6);
                                    if (h60Var4 != null && h60Var5 != null) {
                                        z2 = z4;
                                        z50Var.q.add(h60Var4);
                                        z50Var.r.add(h60Var5);
                                        l6Var.remove(view5);
                                        l6Var2.remove(view6);
                                    }
                                }
                                z2 = z4;
                            }
                            i11++;
                            z3 = z2;
                        }
                    }
                    z = z3;
                } else {
                    z = z3;
                    SparseArray sparseArray = (SparseArray) oeVar.g;
                    SparseArray sparseArray2 = (SparseArray) oeVar2.g;
                    int size2 = sparseArray.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        View view7 = (View) sparseArray.valueAt(i12);
                        if (view7 != null && z50Var.u(view7) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i12))) != null && z50Var.u(view2)) {
                            h60 h60Var6 = (h60) l6Var.get(view7);
                            h60 h60Var7 = (h60) l6Var2.get(view2);
                            if (h60Var6 != null && h60Var7 != null) {
                                z50Var.q.add(h60Var6);
                                z50Var.r.add(h60Var7);
                                l6Var.remove(view7);
                                l6Var2.remove(view2);
                            }
                        }
                    }
                }
                i2++;
                z3 = z;
                i = 0;
            }
            boolean z5 = z3;
            for (i3 = 0; i3 < l6Var.h; i3++) {
                h60 h60Var8 = (h60) l6Var.i(i3);
                if (z50Var.u(h60Var8.b)) {
                    z50Var.q.add(h60Var8);
                    z50Var.r.add(null);
                }
            }
            for (i4 = 0; i4 < l6Var2.h; i4++) {
                h60 h60Var9 = (h60) l6Var2.i(i4);
                if (z50Var.u(h60Var9.b)) {
                    z50Var.r.add(h60Var9);
                    z50Var.q.add(null);
                }
            }
            l6 q = z50.q();
            int i13 = q.h;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i13 - 1;
            while (i5 >= 0) {
                Animator animator = (Animator) q.f(i5);
                if (animator != null && (v50Var = (v50) q.get(animator)) != null) {
                    z50 z50Var2 = v50Var.e;
                    View view8 = v50Var.a;
                    if (view8 != null && windowId.equals(v50Var.d)) {
                        h60 h60Var10 = v50Var.c;
                        boolean z6 = z5;
                        h60 s = z50Var.s(view8, z6);
                        h60 o = z50Var.o(view8, z6);
                        if (s == null && o == null) {
                            o = (h60) ((l6) z50Var.n.f).get(view8);
                        }
                        if ((s != null || o != null) && z50Var2.t(h60Var10, o)) {
                            z50Var2.p().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                q.remove(animator);
                            }
                        }
                    }
                }
                i5--;
                z5 = true;
            }
            z50Var.l(viewGroup, z50Var.m, z50Var.n, z50Var.q, z50Var.r);
            z50Var.A();
            return true;
        }
        arrayList = null;
        arrayList2.add(z50Var);
        z50Var.a(new b60(this, b));
        i = 0;
        z50Var.h(viewGroup, false);
        if (arrayList != null) {
        }
        z50Var.q = new ArrayList();
        z50Var.r = new ArrayList();
        oe oeVar3 = z50Var.m;
        oe oeVar22 = z50Var.n;
        l6Var = new l6((l6) oeVar3.f);
        l6Var2 = new l6((l6) oeVar22.f);
        i2 = 0;
        while (true) {
            iArr = z50Var.p;
            if (i2 < iArr.length) {
            }
            i2++;
            z3 = z;
            i = 0;
        }
        boolean z52 = z3;
        while (i3 < l6Var.h) {
        }
        while (i4 < l6Var2.h) {
        }
        l6 q2 = z50.q();
        int i132 = q2.h;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i132 - 1;
        while (i5 >= 0) {
        }
        z50Var.l(viewGroup, z50Var.m, z50Var.n, z50Var.q, z50Var.r);
        z50Var.A();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        d60.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) d60.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((z50) obj).z(viewGroup);
            }
        }
        this.f.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
