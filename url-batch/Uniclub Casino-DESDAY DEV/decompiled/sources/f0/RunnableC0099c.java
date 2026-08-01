package f0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0099c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0105i f2047c;

    public /* synthetic */ RunnableC0099c(C0105i c0105i, ArrayList arrayList, int i) {
        this.f2045a = i;
        this.f2047c = c0105i;
        this.f2046b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f2045a) {
            case 0:
                ArrayList arrayList = this.f2046b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0105i c0105i = this.f2047c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0105i.f2098m.remove(arrayList);
                        break;
                    } else {
                        C0104h c0104h = (C0104h) it2.next();
                        X x2 = c0104h.f2086a;
                        c0105i.getClass();
                        View view = x2.f2014a;
                        int i = c0104h.d - c0104h.f2087b;
                        int i2 = c0104h.f2089e - c0104h.f2088c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0105i.f2101p.add(x2);
                        animate.setDuration(c0105i.f1956e).setListener(new C0101e(c0105i, x2, i, view, i2, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f2046b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0105i c0105i2 = this.f2047c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0105i2.f2099n.remove(arrayList2);
                        break;
                    } else {
                        C0103g c0103g = (C0103g) it3.next();
                        c0105i2.getClass();
                        X x3 = c0103g.f2077a;
                        View view2 = x3 == null ? null : x3.f2014a;
                        X x4 = c0103g.f2078b;
                        View view3 = x4 != null ? x4.f2014a : null;
                        ArrayList arrayList3 = c0105i2.f2103r;
                        long j2 = c0105i2.f1957f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0103g.f2077a);
                            duration.translationX(c0103g.f2080e - c0103g.f2079c);
                            duration.translationY(c0103g.f2081f - c0103g.d);
                            it = it3;
                            duration.alpha(0.0f).setListener(new C0102f(c0105i2, c0103g, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0103g.f2078b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0102f(c0105i2, c0103g, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f2046b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0105i c0105i3 = this.f2047c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0105i3.f2097l.remove(arrayList4);
                        break;
                    } else {
                        X x5 = (X) it4.next();
                        c0105i3.getClass();
                        View view4 = x5.f2014a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0105i3.f2100o.add(x5);
                        animate3.alpha(1.0f).setDuration(c0105i3.f1955c).setListener(new C0100d(c0105i3, x5, view4, animate3)).start();
                    }
                }
        }
    }
}
