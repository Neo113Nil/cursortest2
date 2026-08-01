package Y;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0321e;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f1024a;

    /* renamed from: b, reason: collision with root package name */
    public int f1025b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0049q f1026c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f1027e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1028f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1029g;
    public final O h;

    public U(int i, int i2, O o2, G.c cVar) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = o2.f1008c;
        this.d = new ArrayList();
        this.f1027e = new HashSet();
        this.f1028f = false;
        this.f1029g = false;
        this.f1024a = i;
        this.f1025b = i2;
        this.f1026c = abstractComponentCallbacksC0049q;
        cVar.a(new A0.h(16, this));
        this.h = o2;
    }

    public final void a() {
        if (this.f1028f) {
            return;
        }
        this.f1028f = true;
        HashSet hashSet = this.f1027e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            G.c cVar = (G.c) it.next();
            synchronized (cVar) {
                try {
                    if (!cVar.f204a) {
                        cVar.f204a = true;
                        cVar.f206c = true;
                        G.b bVar = cVar.f205b;
                        if (bVar != null) {
                            try {
                                bVar.l();
                            } catch (Throwable th) {
                                synchronized (cVar) {
                                    cVar.f206c = false;
                                    cVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (cVar) {
                            cVar.f206c = false;
                            cVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f1029g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1029g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        int a2 = AbstractC0321e.a(i2);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f1026c;
        if (a2 == 0) {
            if (this.f1024a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0049q + " mFinalState = " + V.k(this.f1024a) + " -> " + V.k(i) + ". ");
                }
                this.f1024a = i;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f1024a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0049q + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + V.j(this.f1025b) + " to ADDING.");
                }
                this.f1024a = 2;
                this.f1025b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0049q + " mFinalState = " + V.k(this.f1024a) + " -> REMOVED. mLifecycleImpact  = " + V.j(this.f1025b) + " to REMOVING.");
        }
        this.f1024a = 1;
        this.f1025b = 3;
    }

    public final void d() {
        int i = this.f1025b;
        O o2 = this.h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = o2.f1008c;
                View D2 = abstractComponentCallbacksC0049q.D();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + D2.findFocus() + " on view " + D2 + " for Fragment " + abstractComponentCallbacksC0049q);
                }
                D2.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = o2.f1008c;
        View findFocus = abstractComponentCallbacksC0049q2.f1105E.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0049q2.f().f1099k = findFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0049q2);
            }
        }
        View D3 = this.f1026c.D();
        if (D3.getParent() == null) {
            o2.b();
            D3.setAlpha(RecyclerView.f1570A0);
        }
        if (D3.getAlpha() == RecyclerView.f1570A0 && D3.getVisibility() == 0) {
            D3.setVisibility(4);
        }
        C0048p c0048p = abstractComponentCallbacksC0049q2.f1107H;
        D3.setAlpha(c0048p == null ? 1.0f : c0048p.f1098j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + V.k(this.f1024a) + "} {mLifecycleImpact = " + V.j(this.f1025b) + "} {mFragment = " + this.f1026c + "}";
    }
}
