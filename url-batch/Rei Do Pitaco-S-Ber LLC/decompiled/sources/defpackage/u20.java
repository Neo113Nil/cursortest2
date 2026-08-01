package defpackage;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class u20 {
    public int a;
    public int b;
    public final dk c;
    public final ArrayList d;
    public final HashSet e;
    public boolean f;
    public boolean g;
    public final a h;

    public u20(int i, int i2, a aVar, a9 a9Var) {
        dk dkVar = aVar.c;
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = false;
        this.g = false;
        this.a = i;
        this.b = i2;
        this.c = dkVar;
        a9Var.a(new uv(this));
        this.h = aVar;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        if (this.e.isEmpty()) {
            b();
            return;
        }
        ArrayList arrayList = new ArrayList(this.e);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a9 a9Var = (a9) obj;
            synchronized (a9Var) {
                try {
                    if (!a9Var.a) {
                        a9Var.a = true;
                        a9Var.c = true;
                        z8 z8Var = a9Var.b;
                        if (z8Var != null) {
                            try {
                                z8Var.onCancel();
                            } catch (Throwable th) {
                                synchronized (a9Var) {
                                    a9Var.c = false;
                                    a9Var.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (a9Var) {
                            a9Var.c = false;
                            a9Var.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.g) {
            if (sk.G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        int h = n20.h(i2);
        dk dkVar = this.c;
        if (h == 0) {
            if (this.a != 1) {
                if (sk.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + dkVar + " mFinalState = " + n20.j(this.a) + " -> " + n20.j(i) + ". ");
                }
                this.a = i;
                return;
            }
            return;
        }
        if (h == 1) {
            if (this.a == 1) {
                if (sk.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + dkVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + n20.i(this.b) + " to ADDING.");
                }
                this.a = 2;
                this.b = 2;
                return;
            }
            return;
        }
        if (h != 2) {
            return;
        }
        if (sk.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + dkVar + " mFinalState = " + n20.j(this.a) + " -> REMOVED. mLifecycleImpact  = " + n20.i(this.b) + " to REMOVING.");
        }
        this.a = 1;
        this.b = 3;
    }

    public final void d() {
        int i = this.b;
        a aVar = this.h;
        if (i != 2) {
            if (i == 3) {
                dk dkVar = aVar.c;
                View D = dkVar.D();
                if (sk.G(2)) {
                    Log.v("FragmentManager", "Clearing focus " + D.findFocus() + " on view " + D + " for Fragment " + dkVar);
                }
                D.clearFocus();
                return;
            }
            return;
        }
        dk dkVar2 = aVar.c;
        View findFocus = dkVar2.J.findFocus();
        if (findFocus != null) {
            dkVar2.f().k = findFocus;
            if (sk.G(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + dkVar2);
            }
        }
        View D2 = this.c.D();
        if (D2.getParent() == null) {
            aVar.b();
            D2.setAlpha(0.0f);
        }
        if (D2.getAlpha() == 0.0f && D2.getVisibility() == 0) {
            D2.setVisibility(4);
        }
        bk bkVar = dkVar2.M;
        D2.setAlpha(bkVar == null ? 1.0f : bkVar.j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + n20.j(this.a) + "} {mLifecycleImpact = " + n20.i(this.b) + "} {mFragment = " + this.c + "}";
    }
}
