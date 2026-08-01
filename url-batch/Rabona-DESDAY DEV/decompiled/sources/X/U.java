package X;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0291e;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f877a;

    /* renamed from: b, reason: collision with root package name */
    public int f878b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0049q f879c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f880e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f881f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f882g;
    public final O h;

    public U(int i, int i2, O o2, G.c cVar) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = o2.f861c;
        this.d = new ArrayList();
        this.f880e = new HashSet();
        this.f881f = false;
        this.f882g = false;
        this.f877a = i;
        this.f878b = i2;
        this.f879c = abstractComponentCallbacksC0049q;
        cVar.a(new B0.d(18, this));
        this.h = o2;
    }

    public final void a() {
        if (this.f881f) {
            return;
        }
        this.f881f = true;
        HashSet hashSet = this.f880e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            G.c cVar = (G.c) it.next();
            synchronized (cVar) {
                try {
                    if (!cVar.f187a) {
                        cVar.f187a = true;
                        cVar.f189c = true;
                        G.b bVar = cVar.f188b;
                        if (bVar != null) {
                            try {
                                bVar.k();
                            } catch (Throwable th) {
                                synchronized (cVar) {
                                    cVar.f189c = false;
                                    cVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (cVar) {
                            cVar.f189c = false;
                            cVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f882g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f882g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        int a2 = AbstractC0291e.a(i2);
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = this.f879c;
        if (a2 == 0) {
            if (this.f877a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0049q + " mFinalState = " + V.j(this.f877a) + " -> " + V.j(i) + ". ");
                }
                this.f877a = i;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f877a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0049q + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + V.i(this.f878b) + " to ADDING.");
                }
                this.f877a = 2;
                this.f878b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0049q + " mFinalState = " + V.j(this.f877a) + " -> REMOVED. mLifecycleImpact  = " + V.i(this.f878b) + " to REMOVING.");
        }
        this.f877a = 1;
        this.f878b = 3;
    }

    public final void d() {
        int i = this.f878b;
        O o2 = this.h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = o2.f861c;
                View D2 = abstractComponentCallbacksC0049q.D();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + D2.findFocus() + " on view " + D2 + " for Fragment " + abstractComponentCallbacksC0049q);
                }
                D2.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = o2.f861c;
        View findFocus = abstractComponentCallbacksC0049q2.f958E.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0049q2.f().f952k = findFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0049q2);
            }
        }
        View D3 = this.f879c.D();
        if (D3.getParent() == null) {
            o2.b();
            D3.setAlpha(0.0f);
        }
        if (D3.getAlpha() == 0.0f && D3.getVisibility() == 0) {
            D3.setVisibility(4);
        }
        C0048p c0048p = abstractComponentCallbacksC0049q2.f960H;
        D3.setAlpha(c0048p == null ? 1.0f : c0048p.f951j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + V.j(this.f877a) + "} {mLifecycleImpact = " + V.i(this.f878b) + "} {mFragment = " + this.f879c + "}";
    }
}
