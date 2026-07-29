package o;

import android.os.Build;
import android.util.Log;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class YF {
    public final Runnable a;
    public final D6 b = new D6();
    public C0380Oo c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public YF(Runnable runnable) {
        OnBackInvokedCallback a;
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                a = VF.a.a(new RF(this, 0), new RF(this, 1), new SF(this, 0), new SF(this, 1));
            } else {
                a = TF.a.a(new SF(this, 2));
            }
            this.d = a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void a() {
        C0380Oo c0380Oo;
        C0380Oo c0380Oo2 = this.c;
        if (c0380Oo2 == null) {
            D6 d6 = this.b;
            ListIterator listIterator = d6.listIterator(d6.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c0380Oo = 0;
                    break;
                } else {
                    c0380Oo = listIterator.previous();
                    if (((C0380Oo) c0380Oo).a) {
                        break;
                    }
                }
            }
            c0380Oo2 = c0380Oo;
        }
        this.c = null;
        if (c0380Oo2 != null) {
            c0380Oo2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    public final void b() {
        C0380Oo c0380Oo;
        C0380Oo c0380Oo2 = this.c;
        if (c0380Oo2 == null) {
            D6 d6 = this.b;
            ListIterator listIterator = d6.listIterator(d6.j());
            while (true) {
                if (listIterator.hasPrevious()) {
                    c0380Oo = listIterator.previous();
                    if (((C0380Oo) c0380Oo).a) {
                        break;
                    }
                } else {
                    c0380Oo = 0;
                    break;
                }
            }
            c0380Oo2 = c0380Oo;
        }
        this.c = null;
        if (c0380Oo2 == null) {
            this.a.run();
            return;
        }
        AbstractC0588Wo abstractC0588Wo = c0380Oo2.d;
        if (AbstractC0588Wo.J(3)) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + abstractC0588Wo);
        }
        C0380Oo c0380Oo3 = abstractC0588Wo.i;
        ArrayList arrayList = abstractC0588Wo.m;
        abstractC0588Wo.A(true);
        if (abstractC0588Wo.h == null) {
            if (c0380Oo3.a) {
                if (AbstractC0588Wo.J(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                abstractC0588Wo.Q();
                return;
            } else {
                if (AbstractC0588Wo.J(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                abstractC0588Wo.g.b();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0588Wo.E(abstractC0588Wo.h));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
            }
        }
        Iterator it3 = abstractC0588Wo.h.a.iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = ((C1258ip) it3.next()).b;
            if (abstractComponentCallbacksC0069Co != null) {
                abstractComponentCallbacksC0069Co.t = false;
            }
        }
        Iterator it4 = abstractC0588Wo.f(new ArrayList(Collections.singletonList(abstractC0588Wo.h)), 0, 1).iterator();
        while (it4.hasNext()) {
            C0450Rg c0450Rg = (C0450Rg) it4.next();
            ArrayList arrayList2 = c0450Rg.c;
            if (AbstractC0588Wo.J(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            c0450Rg.f(arrayList2);
            c0450Rg.getClass();
            AbstractC0048Bt.n(arrayList2, "operations");
            ArrayList arrayList3 = new ArrayList();
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                ((RS) it5.next()).getClass();
                AbstractC1048fc.f0(arrayList3, null);
            }
            List J0 = AbstractC0720ac.J0(AbstractC0720ac.M0(arrayList3));
            int size = J0.size();
            for (int i = 0; i < size; i++) {
                ((QS) J0.get(i)).a(c0450Rg.a);
            }
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                c0450Rg.a((RS) arrayList2.get(i2));
            }
            List J02 = AbstractC0720ac.J0(arrayList2);
            if (J02.size() > 0) {
                ((RS) J02.get(0)).getClass();
                throw null;
            }
        }
        abstractC0588Wo.h = null;
        abstractC0588Wo.e0();
        if (AbstractC0588Wo.J(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + c0380Oo3.a + " for  FragmentManager " + abstractC0588Wo);
        }
    }

    public final void c(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        TF tf = TF.a;
        if (z && !this.f) {
            tf.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            tf.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void d() {
        boolean z = this.g;
        boolean z2 = false;
        D6 d6 = this.b;
        if (d6 == null || !d6.isEmpty()) {
            Iterator<E> it = d6.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C0380Oo) it.next()).a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z2);
    }
}
