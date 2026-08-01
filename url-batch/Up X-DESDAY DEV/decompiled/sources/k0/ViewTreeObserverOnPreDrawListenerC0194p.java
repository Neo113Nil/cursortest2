package k0;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0194p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0191m f2808a;

    /* renamed from: b, reason: collision with root package name */
    public FrameLayout f2809b;

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
        AbstractC0191m abstractC0191m;
        int i;
        o.b bVar;
        o.b bVar2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        C0188j c0188j;
        View view;
        C0199u c0199u;
        View view2;
        FrameLayout frameLayout = this.f2809b;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = AbstractC0195q.f2812c;
        FrameLayout frameLayout2 = this.f2809b;
        int i6 = 1;
        if (!arrayList2.remove(frameLayout2)) {
            return true;
        }
        o.b b2 = AbstractC0195q.b();
        Long l2 = null;
        ArrayList arrayList3 = (ArrayList) b2.getOrDefault(frameLayout2, null);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            b2.put(frameLayout2, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            abstractC0191m = this.f2808a;
            arrayList3.add(abstractC0191m);
            abstractC0191m.a(new C0193o(this, b2));
            i = 0;
            abstractC0191m.h(frameLayout2, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC0191m) it.next()).y(frameLayout2);
                }
            }
            abstractC0191m.f2794k = new ArrayList();
            abstractC0191m.f2795l = new ArrayList();
            T.u uVar = abstractC0191m.f2792g;
            T.u uVar2 = abstractC0191m.h;
            bVar = new o.b((o.b) uVar.f746a);
            bVar2 = new o.b((o.b) uVar2.f746a);
            i2 = 0;
            while (true) {
                iArr = abstractC0191m.f2793j;
                if (i2 < iArr.length) {
                    break;
                }
                int i7 = iArr[i2];
                if (i7 == i6) {
                    for (int i8 = bVar.f3331c - 1; i8 >= 0; i8--) {
                        View view3 = (View) bVar.h(i8);
                        if (view3 != null && abstractC0191m.t(view3) && (c0199u = (C0199u) bVar2.remove(view3)) != null && abstractC0191m.t(c0199u.f2817b)) {
                            abstractC0191m.f2794k.add((C0199u) bVar.i(i8));
                            abstractC0191m.f2795l.add(c0199u);
                        }
                    }
                } else if (i7 == 2) {
                    o.b bVar3 = (o.b) uVar.d;
                    int i9 = bVar3.f3331c;
                    for (int i10 = 0; i10 < i9; i10++) {
                        View view4 = (View) bVar3.j(i10);
                        if (view4 != null && abstractC0191m.t(view4)) {
                            View view5 = (View) ((o.b) uVar2.d).getOrDefault(bVar3.h(i10), null);
                            if (view5 != null && abstractC0191m.t(view5)) {
                                C0199u c0199u2 = (C0199u) bVar.getOrDefault(view4, null);
                                C0199u c0199u3 = (C0199u) bVar2.getOrDefault(view5, null);
                                if (c0199u2 != null && c0199u3 != null) {
                                    abstractC0191m.f2794k.add(c0199u2);
                                    abstractC0191m.f2795l.add(c0199u3);
                                    bVar.remove(view4);
                                    bVar2.remove(view5);
                                }
                            }
                        }
                    }
                } else if (i7 == 3) {
                    SparseArray sparseArray = (SparseArray) uVar.f747b;
                    SparseArray sparseArray2 = (SparseArray) uVar2.f747b;
                    int size = sparseArray.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        View view6 = (View) sparseArray.valueAt(i11);
                        if (view6 != null && abstractC0191m.t(view6) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i11))) != null && abstractC0191m.t(view2)) {
                            C0199u c0199u4 = (C0199u) bVar.getOrDefault(view6, null);
                            C0199u c0199u5 = (C0199u) bVar2.getOrDefault(view2, null);
                            if (c0199u4 != null && c0199u5 != null) {
                                abstractC0191m.f2794k.add(c0199u4);
                                abstractC0191m.f2795l.add(c0199u5);
                                bVar.remove(view6);
                                bVar2.remove(view2);
                            }
                        }
                    }
                } else if (i7 == 4) {
                    o.e eVar = (o.e) uVar.f748c;
                    int e2 = eVar.e();
                    int i12 = i;
                    while (i12 < e2) {
                        View view7 = (View) eVar.f(i12);
                        if (view7 != null && abstractC0191m.t(view7)) {
                            if (eVar.f3309a) {
                                eVar.b();
                            }
                            View view8 = (View) ((o.e) uVar2.f748c).c(eVar.f3310b[i12], l2);
                            abstractC0191m = abstractC0191m;
                            if (view8 != null && abstractC0191m.t(view8)) {
                                C0199u c0199u6 = (C0199u) bVar.getOrDefault(view7, l2);
                                C0199u c0199u7 = (C0199u) bVar2.getOrDefault(view8, l2);
                                if (c0199u6 != null && c0199u7 != null) {
                                    abstractC0191m.f2794k.add(c0199u6);
                                    abstractC0191m.f2795l.add(c0199u7);
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
            for (i3 = 0; i3 < bVar.f3331c; i3++) {
                C0199u c0199u8 = (C0199u) bVar.j(i3);
                if (abstractC0191m.t(c0199u8.f2817b)) {
                    abstractC0191m.f2794k.add(c0199u8);
                    abstractC0191m.f2795l.add(null);
                }
            }
            for (i4 = 0; i4 < bVar2.f3331c; i4++) {
                C0199u c0199u9 = (C0199u) bVar2.j(i4);
                if (abstractC0191m.t(c0199u9.f2817b)) {
                    abstractC0191m.f2795l.add(c0199u9);
                    abstractC0191m.f2794k.add(null);
                }
            }
            o.b p2 = AbstractC0191m.p();
            int i13 = p2.f3331c;
            WindowId windowId = frameLayout2.getWindowId();
            for (i5 = i13 - 1; i5 >= 0; i5--) {
                Animator animator = (Animator) p2.h(i5);
                if (animator != null && (c0188j = (C0188j) p2.getOrDefault(animator, null)) != null && (view = c0188j.f2774a) != null && windowId.equals(c0188j.d)) {
                    C0199u r2 = abstractC0191m.r(view, true);
                    C0199u n2 = abstractC0191m.n(view, true);
                    if (r2 == null && n2 == null) {
                        n2 = (C0199u) ((o.b) abstractC0191m.h.f746a).getOrDefault(view, null);
                    }
                    if (r2 != null || n2 != null) {
                        C0199u c0199u10 = c0188j.f2776c;
                        AbstractC0191m abstractC0191m2 = c0188j.f2777e;
                        if (abstractC0191m2.s(c0199u10, n2)) {
                            abstractC0191m2.o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                p2.remove(animator);
                            }
                        }
                    }
                }
            }
            abstractC0191m.l(frameLayout2, abstractC0191m.f2792g, abstractC0191m.h, abstractC0191m.f2794k, abstractC0191m.f2795l);
            abstractC0191m.z();
            return true;
        }
        arrayList = null;
        abstractC0191m = this.f2808a;
        arrayList3.add(abstractC0191m);
        abstractC0191m.a(new C0193o(this, b2));
        i = 0;
        abstractC0191m.h(frameLayout2, false);
        if (arrayList != null) {
        }
        abstractC0191m.f2794k = new ArrayList();
        abstractC0191m.f2795l = new ArrayList();
        T.u uVar3 = abstractC0191m.f2792g;
        T.u uVar22 = abstractC0191m.h;
        bVar = new o.b((o.b) uVar3.f746a);
        bVar2 = new o.b((o.b) uVar22.f746a);
        i2 = 0;
        while (true) {
            iArr = abstractC0191m.f2793j;
            if (i2 < iArr.length) {
            }
            i2++;
            i = 0;
            l2 = null;
            i6 = 1;
        }
        while (i3 < bVar.f3331c) {
        }
        while (i4 < bVar2.f3331c) {
        }
        o.b p22 = AbstractC0191m.p();
        int i132 = p22.f3331c;
        WindowId windowId2 = frameLayout2.getWindowId();
        while (i5 >= 0) {
        }
        abstractC0191m.l(frameLayout2, abstractC0191m.f2792g, abstractC0191m.h, abstractC0191m.f2794k, abstractC0191m.f2795l);
        abstractC0191m.z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        FrameLayout frameLayout = this.f2809b;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = AbstractC0195q.f2812c;
        FrameLayout frameLayout2 = this.f2809b;
        arrayList.remove(frameLayout2);
        ArrayList arrayList2 = (ArrayList) AbstractC0195q.b().getOrDefault(frameLayout2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC0191m) it.next()).y(frameLayout2);
            }
        }
        this.f2808a.i(true);
    }
}
