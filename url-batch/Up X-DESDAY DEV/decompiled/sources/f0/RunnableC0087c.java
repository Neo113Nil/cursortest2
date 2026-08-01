package f0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0087c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0093i f2042c;

    public /* synthetic */ RunnableC0087c(C0093i c0093i, ArrayList arrayList, int i) {
        this.f2040a = i;
        this.f2042c = c0093i;
        this.f2041b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f2040a) {
            case 0:
                ArrayList arrayList = this.f2041b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0093i c0093i = this.f2042c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0093i.f2093m.remove(arrayList);
                        break;
                    } else {
                        C0092h c0092h = (C0092h) it2.next();
                        X x2 = c0092h.f2081a;
                        c0093i.getClass();
                        View view = x2.f2009a;
                        int i = c0092h.d - c0092h.f2082b;
                        int i2 = c0092h.f2084e - c0092h.f2083c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0093i.f2096p.add(x2);
                        animate.setDuration(c0093i.f1951e).setListener(new C0089e(c0093i, x2, i, view, i2, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f2041b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0093i c0093i2 = this.f2042c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0093i2.f2094n.remove(arrayList2);
                        break;
                    } else {
                        C0091g c0091g = (C0091g) it3.next();
                        c0093i2.getClass();
                        X x3 = c0091g.f2072a;
                        View view2 = x3 == null ? null : x3.f2009a;
                        X x4 = c0091g.f2073b;
                        View view3 = x4 != null ? x4.f2009a : null;
                        ArrayList arrayList3 = c0093i2.f2098r;
                        long j2 = c0093i2.f1952f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0091g.f2072a);
                            duration.translationX(c0091g.f2075e - c0091g.f2074c);
                            duration.translationY(c0091g.f2076f - c0091g.d);
                            it = it3;
                            duration.alpha(0.0f).setListener(new C0090f(c0093i2, c0091g, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0091g.f2073b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0090f(c0093i2, c0091g, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f2041b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0093i c0093i3 = this.f2042c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0093i3.f2092l.remove(arrayList4);
                        break;
                    } else {
                        X x5 = (X) it4.next();
                        c0093i3.getClass();
                        View view4 = x5.f2009a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0093i3.f2095o.add(x5);
                        animate3.alpha(1.0f).setDuration(c0093i3.f1950c).setListener(new C0088d(c0093i3, x5, view4, animate3)).start();
                    }
                }
        }
    }
}
