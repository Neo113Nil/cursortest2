package o0;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0277p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0274m f3263a;

    /* renamed from: b, reason: collision with root package name */
    public FrameLayout f3264b;

    /* JADX WARN: Removed duplicated region for block: B:119:0x01e6 A[EDGE_INSN: B:119:0x01e6->B:120:0x01e6 BREAK  A[LOOP:1: B:17:0x0088->B:53:0x01dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        AbstractC0274m abstractC0274m;
        int i;
        o.b bVar;
        o.b bVar2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        C0271j c0271j;
        View view;
        C0282u c0282u;
        View view2;
        FrameLayout frameLayout = this.f3264b;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = AbstractC0278q.f3267c;
        FrameLayout frameLayout2 = this.f3264b;
        int i6 = 1;
        if (!arrayList2.remove(frameLayout2)) {
            return true;
        }
        o.b b2 = AbstractC0278q.b();
        Long l2 = null;
        ArrayList arrayList3 = (ArrayList) b2.getOrDefault(frameLayout2, null);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            b2.put(frameLayout2, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            abstractC0274m = this.f3263a;
            arrayList3.add(abstractC0274m);
            abstractC0274m.a(new C0276o(this, b2));
            i = 0;
            abstractC0274m.h(frameLayout2, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC0274m) it.next()).y(frameLayout2);
                }
            }
            abstractC0274m.f3249k = new ArrayList();
            abstractC0274m.f3250l = new ArrayList();
            U.v vVar = abstractC0274m.f3247g;
            U.v vVar2 = abstractC0274m.h;
            bVar = new o.b((o.b) vVar.f849a);
            bVar2 = new o.b((o.b) vVar2.f849a);
            i2 = 0;
            while (true) {
                iArr = abstractC0274m.f3248j;
                if (i2 < iArr.length) {
                    break;
                }
                int i7 = iArr[i2];
                if (i7 == i6) {
                    for (int i8 = bVar.f3186c - 1; i8 >= 0; i8--) {
                        View view3 = (View) bVar.h(i8);
                        if (view3 != null && abstractC0274m.t(view3) && (c0282u = (C0282u) bVar2.remove(view3)) != null && abstractC0274m.t(c0282u.f3272b)) {
                            abstractC0274m.f3249k.add((C0282u) bVar.i(i8));
                            abstractC0274m.f3250l.add(c0282u);
                        }
                    }
                } else if (i7 == 2) {
                    o.b bVar3 = (o.b) vVar.d;
                    int i9 = bVar3.f3186c;
                    for (int i10 = 0; i10 < i9; i10++) {
                        View view4 = (View) bVar3.j(i10);
                        if (view4 != null && abstractC0274m.t(view4)) {
                            View view5 = (View) ((o.b) vVar2.d).getOrDefault(bVar3.h(i10), null);
                            if (view5 != null && abstractC0274m.t(view5)) {
                                C0282u c0282u2 = (C0282u) bVar.getOrDefault(view4, null);
                                C0282u c0282u3 = (C0282u) bVar2.getOrDefault(view5, null);
                                if (c0282u2 != null && c0282u3 != null) {
                                    abstractC0274m.f3249k.add(c0282u2);
                                    abstractC0274m.f3250l.add(c0282u3);
                                    bVar.remove(view4);
                                    bVar2.remove(view5);
                                }
                            }
                        }
                    }
                } else if (i7 == 3) {
                    SparseArray sparseArray = (SparseArray) vVar.f850b;
                    SparseArray sparseArray2 = (SparseArray) vVar2.f850b;
                    int size = sparseArray.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        View view6 = (View) sparseArray.valueAt(i11);
                        if (view6 != null && abstractC0274m.t(view6) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i11))) != null && abstractC0274m.t(view2)) {
                            C0282u c0282u4 = (C0282u) bVar.getOrDefault(view6, null);
                            C0282u c0282u5 = (C0282u) bVar2.getOrDefault(view2, null);
                            if (c0282u4 != null && c0282u5 != null) {
                                abstractC0274m.f3249k.add(c0282u4);
                                abstractC0274m.f3250l.add(c0282u5);
                                bVar.remove(view6);
                                bVar2.remove(view2);
                            }
                        }
                    }
                } else if (i7 == 4) {
                    o.e eVar = (o.e) vVar.f851c;
                    int e2 = eVar.e();
                    int i12 = i;
                    while (i12 < e2) {
                        View view7 = (View) eVar.f(i12);
                        if (view7 != null && abstractC0274m.t(view7)) {
                            if (eVar.f3164a) {
                                eVar.b();
                            }
                            View view8 = (View) ((o.e) vVar2.f851c).c(eVar.f3165b[i12], l2);
                            abstractC0274m = abstractC0274m;
                            if (view8 != null && abstractC0274m.t(view8)) {
                                C0282u c0282u6 = (C0282u) bVar.getOrDefault(view7, l2);
                                C0282u c0282u7 = (C0282u) bVar2.getOrDefault(view8, l2);
                                if (c0282u6 != null && c0282u7 != null) {
                                    abstractC0274m.f3249k.add(c0282u6);
                                    abstractC0274m.f3250l.add(c0282u7);
                                    bVar.remove(view7);
                                    bVar2.remove(view8);
                                }
                            }
                        }
                        i12++;
                        l2 = null;
                    }
                }
                i2++;
                i = 0;
                l2 = null;
                i6 = 1;
            }
            for (i3 = 0; i3 < bVar.f3186c; i3++) {
                C0282u c0282u8 = (C0282u) bVar.j(i3);
                if (abstractC0274m.t(c0282u8.f3272b)) {
                    abstractC0274m.f3249k.add(c0282u8);
                    abstractC0274m.f3250l.add(null);
                }
            }
            for (i4 = 0; i4 < bVar2.f3186c; i4++) {
                C0282u c0282u9 = (C0282u) bVar2.j(i4);
                if (abstractC0274m.t(c0282u9.f3272b)) {
                    abstractC0274m.f3250l.add(c0282u9);
                    abstractC0274m.f3249k.add(null);
                }
            }
            o.b p2 = AbstractC0274m.p();
            int i13 = p2.f3186c;
            WindowId windowId = frameLayout2.getWindowId();
            for (i5 = i13 - 1; i5 >= 0; i5--) {
                Animator animator = (Animator) p2.h(i5);
                if (animator != null && (c0271j = (C0271j) p2.getOrDefault(animator, null)) != null && (view = c0271j.f3229a) != null && windowId.equals(c0271j.d)) {
                    C0282u r2 = abstractC0274m.r(view, true);
                    C0282u n2 = abstractC0274m.n(view, true);
                    if (r2 == null && n2 == null) {
                        n2 = (C0282u) ((o.b) abstractC0274m.h.f849a).getOrDefault(view, null);
                    }
                    if (r2 != null || n2 != null) {
                        C0282u c0282u10 = c0271j.f3231c;
                        AbstractC0274m abstractC0274m2 = c0271j.f3232e;
                        if (abstractC0274m2.s(c0282u10, n2)) {
                            abstractC0274m2.o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                p2.remove(animator);
                            }
                        }
                    }
                }
            }
            abstractC0274m.l(frameLayout2, abstractC0274m.f3247g, abstractC0274m.h, abstractC0274m.f3249k, abstractC0274m.f3250l);
            abstractC0274m.z();
            return true;
        }
        arrayList = null;
        abstractC0274m = this.f3263a;
        arrayList3.add(abstractC0274m);
        abstractC0274m.a(new C0276o(this, b2));
        i = 0;
        abstractC0274m.h(frameLayout2, false);
        if (arrayList != null) {
        }
        abstractC0274m.f3249k = new ArrayList();
        abstractC0274m.f3250l = new ArrayList();
        U.v vVar3 = abstractC0274m.f3247g;
        U.v vVar22 = abstractC0274m.h;
        bVar = new o.b((o.b) vVar3.f849a);
        bVar2 = new o.b((o.b) vVar22.f849a);
        i2 = 0;
        while (true) {
            iArr = abstractC0274m.f3248j;
            if (i2 < iArr.length) {
            }
            i2++;
            i = 0;
            l2 = null;
            i6 = 1;
        }
        while (i3 < bVar.f3186c) {
        }
        while (i4 < bVar2.f3186c) {
        }
        o.b p22 = AbstractC0274m.p();
        int i132 = p22.f3186c;
        WindowId windowId2 = frameLayout2.getWindowId();
        while (i5 >= 0) {
        }
        abstractC0274m.l(frameLayout2, abstractC0274m.f3247g, abstractC0274m.h, abstractC0274m.f3249k, abstractC0274m.f3250l);
        abstractC0274m.z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        FrameLayout frameLayout = this.f3264b;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = AbstractC0278q.f3267c;
        FrameLayout frameLayout2 = this.f3264b;
        arrayList.remove(frameLayout2);
        ArrayList arrayList2 = (ArrayList) AbstractC0278q.b().getOrDefault(frameLayout2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC0274m) it.next()).y(frameLayout2);
            }
        }
        this.f3263a.i(true);
    }
}
