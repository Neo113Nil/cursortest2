package g0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: g0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0115d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2422b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0121j f2423c;

    public /* synthetic */ RunnableC0115d(C0121j c0121j, ArrayList arrayList, int i) {
        this.f2421a = i;
        this.f2423c = c0121j;
        this.f2422b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f2421a) {
            case 0:
                ArrayList arrayList = this.f2422b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0121j c0121j = this.f2423c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0121j.f2477m.remove(arrayList);
                        break;
                    } else {
                        C0120i c0120i = (C0120i) it2.next();
                        Z z2 = c0120i.f2464a;
                        c0121j.getClass();
                        View view = z2.f2392a;
                        int i = c0120i.d - c0120i.f2465b;
                        int i2 = c0120i.f2467e - c0120i.f2466c;
                        if (i != 0) {
                            view.animate().translationX(RecyclerView.f1570A0);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(RecyclerView.f1570A0);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0121j.f2480p.add(z2);
                        animate.setDuration(c0121j.f2332e).setListener(new C0117f(c0121j, z2, i, view, i2, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f2422b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0121j c0121j2 = this.f2423c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0121j2.f2478n.remove(arrayList2);
                        break;
                    } else {
                        C0119h c0119h = (C0119h) it3.next();
                        c0121j2.getClass();
                        Z z3 = c0119h.f2454a;
                        View view2 = z3 == null ? null : z3.f2392a;
                        Z z4 = c0119h.f2455b;
                        View view3 = z4 != null ? z4.f2392a : null;
                        ArrayList arrayList3 = c0121j2.f2482r;
                        long j2 = c0121j2.f2333f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0119h.f2454a);
                            duration.translationX(c0119h.f2457e - c0119h.f2456c);
                            duration.translationY(c0119h.f2458f - c0119h.d);
                            it = it3;
                            duration.alpha(RecyclerView.f1570A0).setListener(new C0118g(c0121j2, c0119h, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0119h.f2455b);
                            animate2.translationX(RecyclerView.f1570A0).translationY(RecyclerView.f1570A0).setDuration(j2).alpha(1.0f).setListener(new C0118g(c0121j2, c0119h, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f2422b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0121j c0121j3 = this.f2423c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0121j3.f2476l.remove(arrayList4);
                        break;
                    } else {
                        Z z5 = (Z) it4.next();
                        c0121j3.getClass();
                        View view4 = z5.f2392a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0121j3.f2479o.add(z5);
                        animate3.alpha(1.0f).setDuration(c0121j3.f2331c).setListener(new C0116e(c0121j3, z5, view4, animate3)).start();
                    }
                }
        }
    }
}
