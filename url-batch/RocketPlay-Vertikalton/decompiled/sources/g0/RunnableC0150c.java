package g0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0150c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0156i f2857c;

    public /* synthetic */ RunnableC0150c(C0156i c0156i, ArrayList arrayList, int i) {
        this.f2855a = i;
        this.f2857c = c0156i;
        this.f2856b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f2855a) {
            case 0:
                ArrayList arrayList = this.f2856b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0156i c0156i = this.f2857c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0156i.f2909m.remove(arrayList);
                        break;
                    } else {
                        C0155h c0155h = (C0155h) it2.next();
                        Z z2 = c0155h.f2895a;
                        c0156i.getClass();
                        View view = z2.f2830a;
                        int i = c0155h.d - c0155h.f2896b;
                        int i2 = c0155h.f2898e - c0155h.f2897c;
                        if (i != 0) {
                            view.animate().translationX(RecyclerView.f1949A0);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(RecyclerView.f1949A0);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0156i.f2912p.add(z2);
                        animate.setDuration(c0156i.f2770e).setListener(new C0152e(c0156i, z2, i, view, i2, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f2856b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0156i c0156i2 = this.f2857c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0156i2.f2910n.remove(arrayList2);
                        break;
                    } else {
                        C0154g c0154g = (C0154g) it3.next();
                        c0156i2.getClass();
                        Z z3 = c0154g.f2883a;
                        View view2 = z3 == null ? null : z3.f2830a;
                        Z z4 = c0154g.f2884b;
                        View view3 = z4 != null ? z4.f2830a : null;
                        ArrayList arrayList3 = c0156i2.f2914r;
                        long j2 = c0156i2.f2771f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0154g.f2883a);
                            duration.translationX(c0154g.f2886e - c0154g.f2885c);
                            duration.translationY(c0154g.f2887f - c0154g.d);
                            it = it3;
                            duration.alpha(RecyclerView.f1949A0).setListener(new C0153f(c0156i2, c0154g, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0154g.f2884b);
                            animate2.translationX(RecyclerView.f1949A0).translationY(RecyclerView.f1949A0).setDuration(j2).alpha(1.0f).setListener(new C0153f(c0156i2, c0154g, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f2856b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0156i c0156i3 = this.f2857c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0156i3.f2908l.remove(arrayList4);
                        break;
                    } else {
                        Z z5 = (Z) it4.next();
                        c0156i3.getClass();
                        View view4 = z5.f2830a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0156i3.f2911o.add(z5);
                        animate3.alpha(1.0f).setDuration(c0156i3.f2769c).setListener(new C0151d(c0156i3, z5, view4, animate3)).start();
                    }
                }
        }
    }
}
