package k0;

import K.H;
import K.T;
import K.Z;
import K.e0;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.FrameLayout;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: k0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0191m implements Cloneable {

    /* renamed from: w, reason: collision with root package name */
    public static final Animator[] f2783w = new Animator[0];

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f2784x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final H0.e f2785y = new H0.e(24);

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f2786z = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2794k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2795l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0189k[] f2796m;

    /* renamed from: a, reason: collision with root package name */
    public final String f2787a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f2788b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f2789c = -1;
    public TimeInterpolator d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2790e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2791f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public T.u f2792g = new T.u(6);
    public T.u h = new T.u(6);
    public C0179a i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f2793j = f2784x;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2797n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f2798o = f2783w;

    /* renamed from: p, reason: collision with root package name */
    public int f2799p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2800q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2801r = false;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC0191m f2802s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f2803t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f2804u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public H0.e f2805v = f2785y;

    public static void b(T.u uVar, View view, C0199u c0199u) {
        ((o.b) uVar.f746a).put(view, c0199u);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) uVar.f747b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = T.f381a;
        String k2 = H.k(view);
        if (k2 != null) {
            o.b bVar = (o.b) uVar.d;
            if (bVar.containsKey(k2)) {
                bVar.put(k2, null);
            } else {
                bVar.put(k2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                o.e eVar = (o.e) uVar.f748c;
                if (eVar.f3309a) {
                    eVar.b();
                }
                if (o.d.b(eVar.f3310b, eVar.d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    eVar.d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) eVar.c(itemIdAtPosition, null);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    eVar.d(itemIdAtPosition, null);
                }
            }
        }
    }

    public static o.b p() {
        ThreadLocal threadLocal = f2786z;
        o.b bVar = (o.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean u(C0199u c0199u, C0199u c0199u2, String str) {
        Object obj = c0199u.f2816a.get(str);
        Object obj2 = c0199u2.f2816a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j2) {
        this.f2789c = j2;
    }

    public void B(i1.r rVar) {
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void D(H0.e eVar) {
        if (eVar == null) {
            this.f2805v = f2785y;
        } else {
            this.f2805v = eVar;
        }
    }

    public void E() {
    }

    public void F(long j2) {
        this.f2788b = j2;
    }

    public final void G() {
        if (this.f2799p == 0) {
            v(this, InterfaceC0190l.f2779a);
            this.f2801r = false;
        }
        this.f2799p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f2789c != -1) {
            sb.append("dur(");
            sb.append(this.f2789c);
            sb.append(") ");
        }
        if (this.f2788b != -1) {
            sb.append("dly(");
            sb.append(this.f2788b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f2790e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2791f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(InterfaceC0189k interfaceC0189k) {
        if (this.f2803t == null) {
            this.f2803t = new ArrayList();
        }
        this.f2803t.add(interfaceC0189k);
    }

    public void c() {
        ArrayList arrayList = this.f2797n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2798o);
        this.f2798o = f2783w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f2798o = animatorArr;
        v(this, InterfaceC0190l.f2781c);
    }

    public abstract void d(C0199u c0199u);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C0199u c0199u = new C0199u(view);
            if (z2) {
                g(c0199u);
            } else {
                d(c0199u);
            }
            c0199u.f2818c.add(this);
            f(c0199u);
            if (z2) {
                b(this.f2792g, view, c0199u);
            } else {
                b(this.h, view, c0199u);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z2);
            }
        }
    }

    public void f(C0199u c0199u) {
    }

    public abstract void g(C0199u c0199u);

    public final void h(FrameLayout frameLayout, boolean z2) {
        i(z2);
        ArrayList arrayList = this.f2790e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2791f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(frameLayout, z2);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = frameLayout.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                C0199u c0199u = new C0199u(findViewById);
                if (z2) {
                    g(c0199u);
                } else {
                    d(c0199u);
                }
                c0199u.f2818c.add(this);
                f(c0199u);
                if (z2) {
                    b(this.f2792g, findViewById, c0199u);
                } else {
                    b(this.h, findViewById, c0199u);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C0199u c0199u2 = new C0199u(view);
            if (z2) {
                g(c0199u2);
            } else {
                d(c0199u2);
            }
            c0199u2.f2818c.add(this);
            f(c0199u2);
            if (z2) {
                b(this.f2792g, view, c0199u2);
            } else {
                b(this.h, view, c0199u2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((o.b) this.f2792g.f746a).clear();
            ((SparseArray) this.f2792g.f747b).clear();
            ((o.e) this.f2792g.f748c).a();
        } else {
            ((o.b) this.h.f746a).clear();
            ((SparseArray) this.h.f747b).clear();
            ((o.e) this.h.f748c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public AbstractC0191m clone() {
        try {
            AbstractC0191m abstractC0191m = (AbstractC0191m) super.clone();
            abstractC0191m.f2804u = new ArrayList();
            abstractC0191m.f2792g = new T.u(6);
            abstractC0191m.h = new T.u(6);
            abstractC0191m.f2794k = null;
            abstractC0191m.f2795l = null;
            abstractC0191m.f2802s = this;
            abstractC0191m.f2803t = null;
            return abstractC0191m;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator k(FrameLayout frameLayout, C0199u c0199u, C0199u c0199u2) {
        return null;
    }

    public void l(FrameLayout frameLayout, T.u uVar, T.u uVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        C0199u c0199u;
        Animator animator;
        C0199u c0199u2;
        o.b p2 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i2 = 0;
        while (i2 < size) {
            C0199u c0199u3 = (C0199u) arrayList.get(i2);
            C0199u c0199u4 = (C0199u) arrayList2.get(i2);
            if (c0199u3 != null && !c0199u3.f2818c.contains(this)) {
                c0199u3 = null;
            }
            if (c0199u4 != null && !c0199u4.f2818c.contains(this)) {
                c0199u4 = null;
            }
            if ((c0199u3 != null || c0199u4 != null) && (c0199u3 == null || c0199u4 == null || s(c0199u3, c0199u4))) {
                Animator k2 = k(frameLayout, c0199u3, c0199u4);
                if (k2 != null) {
                    String str = this.f2787a;
                    if (c0199u4 != null) {
                        String[] q2 = q();
                        view = c0199u4.f2817b;
                        if (q2 != null && q2.length > 0) {
                            c0199u2 = new C0199u(view);
                            C0199u c0199u5 = (C0199u) ((o.b) uVar2.f746a).getOrDefault(view, null);
                            i = size;
                            if (c0199u5 != null) {
                                int i3 = 0;
                                while (i3 < q2.length) {
                                    HashMap hashMap = c0199u2.f2816a;
                                    String str2 = q2[i3];
                                    hashMap.put(str2, c0199u5.f2816a.get(str2));
                                    i3++;
                                    q2 = q2;
                                }
                            }
                            int i4 = p2.f3331c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = k2;
                                    break;
                                }
                                C0188j c0188j = (C0188j) p2.getOrDefault((Animator) p2.h(i5), null);
                                if (c0188j.f2776c != null && c0188j.f2774a == view && c0188j.f2775b.equals(str) && c0188j.f2776c.equals(c0199u2)) {
                                    animator = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator = k2;
                            c0199u2 = null;
                        }
                        k2 = animator;
                        c0199u = c0199u2;
                    } else {
                        i = size;
                        view = c0199u3.f2817b;
                        c0199u = null;
                    }
                    if (k2 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        C0188j c0188j2 = new C0188j();
                        c0188j2.f2774a = view;
                        c0188j2.f2775b = str;
                        c0188j2.f2776c = c0199u;
                        c0188j2.d = windowId;
                        c0188j2.f2777e = this;
                        c0188j2.f2778f = k2;
                        p2.put(k2, c0188j2);
                        this.f2804u.add(k2);
                    }
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                C0188j c0188j3 = (C0188j) p2.getOrDefault((Animator) this.f2804u.get(sparseIntArray.keyAt(i6)), null);
                c0188j3.f2778f.setStartDelay(c0188j3.f2778f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f2799p - 1;
        this.f2799p = i;
        if (i == 0) {
            v(this, InterfaceC0190l.f2780b);
            for (int i2 = 0; i2 < ((o.e) this.f2792g.f748c).e(); i2++) {
                View view = (View) ((o.e) this.f2792g.f748c).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((o.e) this.h.f748c).e(); i3++) {
                View view2 = (View) ((o.e) this.h.f748c).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f2801r = true;
        }
    }

    public final C0199u n(View view, boolean z2) {
        C0179a c0179a = this.i;
        if (c0179a != null) {
            return c0179a.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f2794k : this.f2795l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C0199u c0199u = (C0199u) arrayList.get(i);
            if (c0199u == null) {
                return null;
            }
            if (c0199u.f2817b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (C0199u) (z2 ? this.f2795l : this.f2794k).get(i);
        }
        return null;
    }

    public final AbstractC0191m o() {
        C0179a c0179a = this.i;
        return c0179a != null ? c0179a.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final C0199u r(View view, boolean z2) {
        C0179a c0179a = this.i;
        if (c0179a != null) {
            return c0179a.r(view, z2);
        }
        return (C0199u) ((o.b) (z2 ? this.f2792g : this.h).f746a).getOrDefault(view, null);
    }

    public boolean s(C0199u c0199u, C0199u c0199u2) {
        if (c0199u == null || c0199u2 == null) {
            return false;
        }
        String[] q2 = q();
        if (q2 == null) {
            Iterator it = c0199u.f2816a.keySet().iterator();
            while (it.hasNext()) {
                if (u(c0199u, c0199u2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : q2) {
            if (!u(c0199u, c0199u2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f2790e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2791f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(AbstractC0191m abstractC0191m, InterfaceC0190l interfaceC0190l) {
        AbstractC0191m abstractC0191m2 = this.f2802s;
        if (abstractC0191m2 != null) {
            abstractC0191m2.v(abstractC0191m, interfaceC0190l);
        }
        ArrayList arrayList = this.f2803t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f2803t.size();
        InterfaceC0189k[] interfaceC0189kArr = this.f2796m;
        if (interfaceC0189kArr == null) {
            interfaceC0189kArr = new InterfaceC0189k[size];
        }
        this.f2796m = null;
        InterfaceC0189k[] interfaceC0189kArr2 = (InterfaceC0189k[]) this.f2803t.toArray(interfaceC0189kArr);
        for (int i = 0; i < size; i++) {
            interfaceC0190l.a(interfaceC0189kArr2[i], abstractC0191m);
            interfaceC0189kArr2[i] = null;
        }
        this.f2796m = interfaceC0189kArr2;
    }

    public void w(ViewGroup viewGroup) {
        if (this.f2801r) {
            return;
        }
        ArrayList arrayList = this.f2797n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2798o);
        this.f2798o = f2783w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f2798o = animatorArr;
        v(this, InterfaceC0190l.d);
        this.f2800q = true;
    }

    public AbstractC0191m x(InterfaceC0189k interfaceC0189k) {
        AbstractC0191m abstractC0191m;
        ArrayList arrayList = this.f2803t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(interfaceC0189k) && (abstractC0191m = this.f2802s) != null) {
            abstractC0191m.x(interfaceC0189k);
        }
        if (this.f2803t.size() == 0) {
            this.f2803t = null;
        }
        return this;
    }

    public void y(FrameLayout frameLayout) {
        if (this.f2800q) {
            if (!this.f2801r) {
                ArrayList arrayList = this.f2797n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2798o);
                this.f2798o = f2783w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f2798o = animatorArr;
                v(this, InterfaceC0190l.f2782e);
            }
            this.f2800q = false;
        }
    }

    public void z() {
        G();
        o.b p2 = p();
        Iterator it = this.f2804u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p2.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new e0(this, p2));
                    long j2 = this.f2789c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f2788b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new Z(2, this));
                    animator.start();
                }
            }
        }
        this.f2804u.clear();
        m();
    }
}
