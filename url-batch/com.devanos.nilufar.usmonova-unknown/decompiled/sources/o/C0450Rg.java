package o;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import com.devanos.nilufar.usmonova.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: o.Rg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0450Rg {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;

    public C0450Rg(ViewGroup viewGroup) {
        AbstractC0048Bt.n(viewGroup, "container");
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final C0450Rg e(ViewGroup viewGroup, AbstractC0588Wo abstractC0588Wo) {
        AbstractC0048Bt.n(viewGroup, "container");
        AbstractC0048Bt.n(abstractC0588Wo, "fragmentManager");
        AbstractC0048Bt.m(abstractC0588Wo.H(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0450Rg) {
            return (C0450Rg) tag;
        }
        C0450Rg c0450Rg = new C0450Rg(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0450Rg);
        return c0450Rg;
    }

    public final void a(RS rs) {
        AbstractC0048Bt.n(rs, "operation");
        if (rs.b) {
            throw null;
        }
    }

    public final void b(ArrayList arrayList, boolean z) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((RS) it.next()).getClass();
            throw null;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        if (listIterator.hasPrevious()) {
            ((RS) listIterator.previous()).getClass();
            throw null;
        }
        if (AbstractC0588Wo.J(2)) {
            Log.v("FragmentManager", "Executing operations from " + ((Object) null) + " to " + ((Object) null));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ((RS) AbstractC0720ac.v0(arrayList)).getClass();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            ((RS) it2.next()).getClass();
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            RS rs = (RS) it3.next();
            arrayList2.add(new C0295Lg(rs, z));
            rs.getClass();
            new C0424Qg(rs);
            if (!z) {
                throw null;
            }
            throw null;
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (!((C0424Qg) next).y()) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            ((C0424Qg) it5.next()).getClass();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((C0424Qg) it6.next()).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        if (it7.hasNext()) {
            ((C0295Lg) it7.next()).getClass();
            throw null;
        }
        arrayList7.isEmpty();
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            C0295Lg c0295Lg = (C0295Lg) it8.next();
            Context context = this.a.getContext();
            c0295Lg.getClass();
            AbstractC0048Bt.m(context, "context");
            C2002u5 N = c0295Lg.N(context);
            if (N != null) {
                if (((AnimatorSet) N.j) != null) {
                    throw null;
                }
                arrayList6.add(c0295Lg);
            }
        }
        Iterator it9 = arrayList6.iterator();
        if (it9.hasNext()) {
            ((C0295Lg) it9.next()).getClass();
            throw null;
        }
    }

    public final void c() {
        if (this.e) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            d();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (this.b.isEmpty()) {
                    ArrayList K0 = AbstractC0720ac.K0(this.c);
                    this.c.clear();
                    Iterator it = K0.iterator();
                    while (it.hasNext()) {
                        RS rs = (RS) it.next();
                        if (AbstractC0588Wo.J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + rs + " with no incoming pendingOperations");
                        }
                        ViewGroup viewGroup = this.a;
                        rs.getClass();
                        AbstractC0048Bt.n(viewGroup, "container");
                        rs.a(viewGroup);
                        this.c.add(rs);
                    }
                } else {
                    ArrayList K02 = AbstractC0720ac.K0(this.c);
                    this.c.clear();
                    Iterator it2 = K02.iterator();
                    if (it2.hasNext()) {
                        RS rs2 = (RS) it2.next();
                        if (AbstractC0588Wo.J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + rs2);
                        }
                        rs2.getClass();
                        throw null;
                    }
                    g();
                    ArrayList K03 = AbstractC0720ac.K0(this.b);
                    if (K03.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(K03);
                    if (AbstractC0588Wo.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(K03, this.d);
                    Iterator it3 = K03.iterator();
                    if (it3.hasNext()) {
                        ((RS) it3.next()).getClass();
                        throw null;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it4 = K03.iterator();
                    while (it4.hasNext()) {
                        ((RS) it4.next()).getClass();
                        AbstractC1048fc.f0(arrayList, null);
                    }
                    if (!arrayList.isEmpty()) {
                        f(K03);
                        int size = K03.size();
                        for (int i = 0; i < size; i++) {
                            a((RS) K03.get(i));
                        }
                    }
                    this.d = false;
                    if (AbstractC0588Wo.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        String str;
        String str2;
        if (AbstractC0588Wo.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                g();
                f(this.b);
                Iterator it = AbstractC0720ac.K0(this.c).iterator();
                while (it.hasNext()) {
                    RS rs = (RS) it.next();
                    if (AbstractC0588Wo.J(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + rs);
                    }
                    rs.a(this.a);
                }
                Iterator it2 = AbstractC0720ac.K0(this.b).iterator();
                while (it2.hasNext()) {
                    RS rs2 = (RS) it2.next();
                    if (AbstractC0588Wo.J(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + rs2);
                    }
                    rs2.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RS rs = (RS) list.get(i);
            rs.getClass();
            if (!rs.a) {
                rs.a = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((RS) it.next()).getClass();
            AbstractC1048fc.f0(arrayList, null);
        }
        List J0 = AbstractC0720ac.J0(AbstractC0720ac.M0(arrayList));
        int size2 = J0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            QS qs = (QS) J0.get(i2);
            qs.getClass();
            ViewGroup viewGroup = this.a;
            AbstractC0048Bt.n(viewGroup, "container");
            if (!qs.a) {
                qs.c(viewGroup);
            }
            qs.a = true;
        }
    }

    public final void g() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((RS) it.next()).getClass();
        }
    }
}
