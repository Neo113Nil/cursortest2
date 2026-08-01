package Y;

import E1.AbstractC0001b;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0332e;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f1405a;

    /* renamed from: b, reason: collision with root package name */
    public int f1406b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0055q f1407c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f1408e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1409f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1410g;
    public final O h;

    public U(int i, int i2, O o2, G.c cVar) {
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = o2.f1389c;
        this.d = new ArrayList();
        this.f1408e = new HashSet();
        this.f1409f = false;
        this.f1410g = false;
        this.f1405a = i;
        this.f1406b = i2;
        this.f1407c = abstractComponentCallbacksC0055q;
        cVar.a(new A1.d(19, this));
        this.h = o2;
    }

    public final void a() {
        if (this.f1409f) {
            return;
        }
        this.f1409f = true;
        HashSet hashSet = this.f1408e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            G.c cVar = (G.c) it.next();
            synchronized (cVar) {
                try {
                    if (!cVar.f426a) {
                        cVar.f426a = true;
                        cVar.f428c = true;
                        G.b bVar = cVar.f427b;
                        if (bVar != null) {
                            try {
                                bVar.k();
                            } catch (Throwable th) {
                                synchronized (cVar) {
                                    cVar.f428c = false;
                                    cVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (cVar) {
                            cVar.f428c = false;
                            cVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f1410g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1410g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        int a2 = AbstractC0332e.a(i2);
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = this.f1407c;
        if (a2 == 0) {
            if (this.f1405a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0055q + " mFinalState = " + AbstractC0001b.m(this.f1405a) + " -> " + AbstractC0001b.m(i) + ". ");
                }
                this.f1405a = i;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f1405a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0055q + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + AbstractC0001b.l(this.f1406b) + " to ADDING.");
                }
                this.f1405a = 2;
                this.f1406b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0055q + " mFinalState = " + AbstractC0001b.m(this.f1405a) + " -> REMOVED. mLifecycleImpact  = " + AbstractC0001b.l(this.f1406b) + " to REMOVING.");
        }
        this.f1405a = 1;
        this.f1406b = 3;
    }

    public final void d() {
        int i = this.f1406b;
        O o2 = this.h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = o2.f1389c;
                View D2 = abstractComponentCallbacksC0055q.D();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + D2.findFocus() + " on view " + D2 + " for Fragment " + abstractComponentCallbacksC0055q);
                }
                D2.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q2 = o2.f1389c;
        View findFocus = abstractComponentCallbacksC0055q2.f1486E.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0055q2.f().f1480k = findFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0055q2);
            }
        }
        View D3 = this.f1407c.D();
        if (D3.getParent() == null) {
            o2.b();
            D3.setAlpha(RecyclerView.f1949A0);
        }
        if (D3.getAlpha() == RecyclerView.f1949A0 && D3.getVisibility() == 0) {
            D3.setVisibility(4);
        }
        C0054p c0054p = abstractComponentCallbacksC0055q2.f1488H;
        D3.setAlpha(c0054p == null ? 1.0f : c0054p.f1479j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + AbstractC0001b.m(this.f1405a) + "} {mLifecycleImpact = " + AbstractC0001b.l(this.f1406b) + "} {mFragment = " + this.f1407c + "}";
    }
}
