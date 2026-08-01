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
    public static final Animator[] f2805w = new Animator[0];

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f2806x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final H0.e f2807y = new H0.e(24);

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f2808z = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2816k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2817l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0189k[] f2818m;

    /* renamed from: a, reason: collision with root package name */
    public final String f2809a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f2810b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f2811c = -1;
    public TimeInterpolator d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2812e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2813f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public T.u f2814g = new T.u(6);
    public T.u h = new T.u(6);
    public C0179a i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f2815j = f2806x;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2819n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f2820o = f2805w;

    /* renamed from: p, reason: collision with root package name */
    public int f2821p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2822q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2823r = false;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC0191m f2824s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f2825t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f2826u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public H0.e f2827v = f2807y;

    public static void b(T.u uVar, View view, C0199u c0199u) {
        ((o.b) uVar.f752a).put(view, c0199u);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) uVar.f753b;
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
                o.e eVar = (o.e) uVar.f754c;
                if (eVar.f3331a) {
                    eVar.b();
                }
                if (o.d.b(eVar.f3332b, eVar.d, itemIdAtPosition) < 0) {
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
        ThreadLocal threadLocal = f2808z;
        o.b bVar = (o.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean u(C0199u c0199u, C0199u c0199u2, String str) {
        Object obj = c0199u.f2838a.get(str);
        Object obj2 = c0199u2.f2838a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j2) {
        this.f2811c = j2;
    }

    public void B(i1.s sVar) {
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void D(H0.e eVar) {
        if (eVar == null) {
            this.f2827v = f2807y;
        } else {
            this.f2827v = eVar;
        }
    }

    public void E() {
    }

    public void F(long j2) {
        this.f2810b = j2;
    }

    public final void G() {
        if (this.f2821p == 0) {
            v(this, InterfaceC0190l.f2801a);
            this.f2823r = false;
        }
        this.f2821p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f2811c != -1) {
            sb.append("dur(");
            sb.append(this.f2811c);
            sb.append(") ");
        }
        if (this.f2810b != -1) {
            sb.append("dly(");
            sb.append(this.f2810b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f2812e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2813f;
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
        if (this.f2825t == null) {
            this.f2825t = new ArrayList();
        }
        this.f2825t.add(interfaceC0189k);
    }

    public void c() {
        ArrayList arrayList = this.f2819n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2820o);
        this.f2820o = f2805w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f2820o = animatorArr;
        v(this, InterfaceC0190l.f2803c);
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
            c0199u.f2840c.add(this);
            f(c0199u);
            if (z2) {
                b(this.f2814g, view, c0199u);
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
        ArrayList arrayList = this.f2812e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2813f;
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
                c0199u.f2840c.add(this);
                f(c0199u);
                if (z2) {
                    b(this.f2814g, findViewById, c0199u);
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
            c0199u2.f2840c.add(this);
            f(c0199u2);
            if (z2) {
                b(this.f2814g, view, c0199u2);
            } else {
                b(this.h, view, c0199u2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((o.b) this.f2814g.f752a).clear();
            ((SparseArray) this.f2814g.f753b).clear();
            ((o.e) this.f2814g.f754c).a();
        } else {
            ((o.b) this.h.f752a).clear();
            ((SparseArray) this.h.f753b).clear();
            ((o.e) this.h.f754c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public AbstractC0191m clone() {
        try {
            AbstractC0191m abstractC0191m = (AbstractC0191m) super.clone();
            abstractC0191m.f2826u = new ArrayList();
            abstractC0191m.f2814g = new T.u(6);
            abstractC0191m.h = new T.u(6);
            abstractC0191m.f2816k = null;
            abstractC0191m.f2817l = null;
            abstractC0191m.f2824s = this;
            abstractC0191m.f2825t = null;
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
            if (c0199u3 != null && !c0199u3.f2840c.contains(this)) {
                c0199u3 = null;
            }
            if (c0199u4 != null && !c0199u4.f2840c.contains(this)) {
                c0199u4 = null;
            }
            if ((c0199u3 != null || c0199u4 != null) && (c0199u3 == null || c0199u4 == null || s(c0199u3, c0199u4))) {
                Animator k2 = k(frameLayout, c0199u3, c0199u4);
                if (k2 != null) {
                    String str = this.f2809a;
                    if (c0199u4 != null) {
                        String[] q2 = q();
                        view = c0199u4.f2839b;
                        if (q2 != null && q2.length > 0) {
                            c0199u2 = new C0199u(view);
                            C0199u c0199u5 = (C0199u) ((o.b) uVar2.f752a).getOrDefault(view, null);
                            i = size;
                            if (c0199u5 != null) {
                                int i3 = 0;
                                while (i3 < q2.length) {
                                    HashMap hashMap = c0199u2.f2838a;
                                    String str2 = q2[i3];
                                    hashMap.put(str2, c0199u5.f2838a.get(str2));
                                    i3++;
                                    q2 = q2;
                                }
                            }
                            int i4 = p2.f3353c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = k2;
                                    break;
                                }
                                C0188j c0188j = (C0188j) p2.getOrDefault((Animator) p2.h(i5), null);
                                if (c0188j.f2798c != null && c0188j.f2796a == view && c0188j.f2797b.equals(str) && c0188j.f2798c.equals(c0199u2)) {
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
                        view = c0199u3.f2839b;
                        c0199u = null;
                    }
                    if (k2 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        C0188j c0188j2 = new C0188j();
                        c0188j2.f2796a = view;
                        c0188j2.f2797b = str;
                        c0188j2.f2798c = c0199u;
                        c0188j2.d = windowId;
                        c0188j2.f2799e = this;
                        c0188j2.f2800f = k2;
                        p2.put(k2, c0188j2);
                        this.f2826u.add(k2);
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
                C0188j c0188j3 = (C0188j) p2.getOrDefault((Animator) this.f2826u.get(sparseIntArray.keyAt(i6)), null);
                c0188j3.f2800f.setStartDelay(c0188j3.f2800f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f2821p - 1;
        this.f2821p = i;
        if (i == 0) {
            v(this, InterfaceC0190l.f2802b);
            for (int i2 = 0; i2 < ((o.e) this.f2814g.f754c).e(); i2++) {
                View view = (View) ((o.e) this.f2814g.f754c).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((o.e) this.h.f754c).e(); i3++) {
                View view2 = (View) ((o.e) this.h.f754c).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f2823r = true;
        }
    }

    public final C0199u n(View view, boolean z2) {
        C0179a c0179a = this.i;
        if (c0179a != null) {
            return c0179a.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f2816k : this.f2817l;
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
            if (c0199u.f2839b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (C0199u) (z2 ? this.f2817l : this.f2816k).get(i);
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
        return (C0199u) ((o.b) (z2 ? this.f2814g : this.h).f752a).getOrDefault(view, null);
    }

    public boolean s(C0199u c0199u, C0199u c0199u2) {
        if (c0199u == null || c0199u2 == null) {
            return false;
        }
        String[] q2 = q();
        if (q2 == null) {
            Iterator it = c0199u.f2838a.keySet().iterator();
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
        ArrayList arrayList = this.f2812e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2813f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(AbstractC0191m abstractC0191m, InterfaceC0190l interfaceC0190l) {
        AbstractC0191m abstractC0191m2 = this.f2824s;
        if (abstractC0191m2 != null) {
            abstractC0191m2.v(abstractC0191m, interfaceC0190l);
        }
        ArrayList arrayList = this.f2825t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f2825t.size();
        InterfaceC0189k[] interfaceC0189kArr = this.f2818m;
        if (interfaceC0189kArr == null) {
            interfaceC0189kArr = new InterfaceC0189k[size];
        }
        this.f2818m = null;
        InterfaceC0189k[] interfaceC0189kArr2 = (InterfaceC0189k[]) this.f2825t.toArray(interfaceC0189kArr);
        for (int i = 0; i < size; i++) {
            interfaceC0190l.a(interfaceC0189kArr2[i], abstractC0191m);
            interfaceC0189kArr2[i] = null;
        }
        this.f2818m = interfaceC0189kArr2;
    }

    public void w(ViewGroup viewGroup) {
        if (this.f2823r) {
            return;
        }
        ArrayList arrayList = this.f2819n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2820o);
        this.f2820o = f2805w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f2820o = animatorArr;
        v(this, InterfaceC0190l.d);
        this.f2822q = true;
    }

    public AbstractC0191m x(InterfaceC0189k interfaceC0189k) {
        AbstractC0191m abstractC0191m;
        ArrayList arrayList = this.f2825t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(interfaceC0189k) && (abstractC0191m = this.f2824s) != null) {
            abstractC0191m.x(interfaceC0189k);
        }
        if (this.f2825t.size() == 0) {
            this.f2825t = null;
        }
        return this;
    }

    public void y(FrameLayout frameLayout) {
        if (this.f2822q) {
            if (!this.f2823r) {
                ArrayList arrayList = this.f2819n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2820o);
                this.f2820o = f2805w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f2820o = animatorArr;
                v(this, InterfaceC0190l.f2804e);
            }
            this.f2822q = false;
        }
    }

    public void z() {
        G();
        o.b p2 = p();
        Iterator it = this.f2826u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p2.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new e0(this, p2));
                    long j2 = this.f2811c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f2810b;
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
        this.f2826u.clear();
        m();
    }
}
