package o0;

import K.C0003b0;
import K.H;
import K.T;
import K.g0;
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

/* renamed from: o0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0274m implements Cloneable {

    /* renamed from: w, reason: collision with root package name */
    public static final Animator[] f3238w = new Animator[0];

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f3239x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final O0.e f3240y = new O0.e(28);

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f3241z = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3249k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f3250l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0272k[] f3251m;

    /* renamed from: a, reason: collision with root package name */
    public final String f3242a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f3243b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f3244c = -1;
    public TimeInterpolator d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3245e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3246f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public U.v f3247g = new U.v(4);
    public U.v h = new U.v(4);
    public C0262a i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f3248j = f3239x;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3252n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f3253o = f3238w;

    /* renamed from: p, reason: collision with root package name */
    public int f3254p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3255q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3256r = false;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC0274m f3257s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f3258t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f3259u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public O0.e f3260v = f3240y;

    public static void b(U.v vVar, View view, C0282u c0282u) {
        ((o.b) vVar.f849a).put(view, c0282u);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) vVar.f850b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = T.f372a;
        String k2 = H.k(view);
        if (k2 != null) {
            o.b bVar = (o.b) vVar.d;
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
                o.e eVar = (o.e) vVar.f851c;
                if (eVar.f3164a) {
                    eVar.b();
                }
                if (o.d.b(eVar.f3165b, eVar.d, itemIdAtPosition) < 0) {
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
        ThreadLocal threadLocal = f3241z;
        o.b bVar = (o.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean u(C0282u c0282u, C0282u c0282u2, String str) {
        Object obj = c0282u.f3271a.get(str);
        Object obj2 = c0282u2.f3271a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j2) {
        this.f3244c = j2;
    }

    public void B(h0.f fVar) {
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void D(O0.e eVar) {
        if (eVar == null) {
            this.f3260v = f3240y;
        } else {
            this.f3260v = eVar;
        }
    }

    public void E() {
    }

    public void F(long j2) {
        this.f3243b = j2;
    }

    public final void G() {
        if (this.f3254p == 0) {
            v(this, InterfaceC0273l.f3234a);
            this.f3256r = false;
        }
        this.f3254p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f3244c != -1) {
            sb.append("dur(");
            sb.append(this.f3244c);
            sb.append(") ");
        }
        if (this.f3243b != -1) {
            sb.append("dly(");
            sb.append(this.f3243b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f3245e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3246f;
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

    public void a(InterfaceC0272k interfaceC0272k) {
        if (this.f3258t == null) {
            this.f3258t = new ArrayList();
        }
        this.f3258t.add(interfaceC0272k);
    }

    public void c() {
        ArrayList arrayList = this.f3252n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3253o);
        this.f3253o = f3238w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f3253o = animatorArr;
        v(this, InterfaceC0273l.f3236c);
    }

    public abstract void d(C0282u c0282u);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C0282u c0282u = new C0282u(view);
            if (z2) {
                g(c0282u);
            } else {
                d(c0282u);
            }
            c0282u.f3273c.add(this);
            f(c0282u);
            if (z2) {
                b(this.f3247g, view, c0282u);
            } else {
                b(this.h, view, c0282u);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z2);
            }
        }
    }

    public void f(C0282u c0282u) {
    }

    public abstract void g(C0282u c0282u);

    public final void h(FrameLayout frameLayout, boolean z2) {
        i(z2);
        ArrayList arrayList = this.f3245e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3246f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(frameLayout, z2);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = frameLayout.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                C0282u c0282u = new C0282u(findViewById);
                if (z2) {
                    g(c0282u);
                } else {
                    d(c0282u);
                }
                c0282u.f3273c.add(this);
                f(c0282u);
                if (z2) {
                    b(this.f3247g, findViewById, c0282u);
                } else {
                    b(this.h, findViewById, c0282u);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C0282u c0282u2 = new C0282u(view);
            if (z2) {
                g(c0282u2);
            } else {
                d(c0282u2);
            }
            c0282u2.f3273c.add(this);
            f(c0282u2);
            if (z2) {
                b(this.f3247g, view, c0282u2);
            } else {
                b(this.h, view, c0282u2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((o.b) this.f3247g.f849a).clear();
            ((SparseArray) this.f3247g.f850b).clear();
            ((o.e) this.f3247g.f851c).a();
        } else {
            ((o.b) this.h.f849a).clear();
            ((SparseArray) this.h.f850b).clear();
            ((o.e) this.h.f851c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public AbstractC0274m clone() {
        try {
            AbstractC0274m abstractC0274m = (AbstractC0274m) super.clone();
            abstractC0274m.f3259u = new ArrayList();
            abstractC0274m.f3247g = new U.v(4);
            abstractC0274m.h = new U.v(4);
            abstractC0274m.f3249k = null;
            abstractC0274m.f3250l = null;
            abstractC0274m.f3257s = this;
            abstractC0274m.f3258t = null;
            return abstractC0274m;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator k(FrameLayout frameLayout, C0282u c0282u, C0282u c0282u2) {
        return null;
    }

    public void l(FrameLayout frameLayout, U.v vVar, U.v vVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        C0282u c0282u;
        Animator animator;
        C0282u c0282u2;
        o.b p2 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i2 = 0;
        while (i2 < size) {
            C0282u c0282u3 = (C0282u) arrayList.get(i2);
            C0282u c0282u4 = (C0282u) arrayList2.get(i2);
            if (c0282u3 != null && !c0282u3.f3273c.contains(this)) {
                c0282u3 = null;
            }
            if (c0282u4 != null && !c0282u4.f3273c.contains(this)) {
                c0282u4 = null;
            }
            if ((c0282u3 != null || c0282u4 != null) && (c0282u3 == null || c0282u4 == null || s(c0282u3, c0282u4))) {
                Animator k2 = k(frameLayout, c0282u3, c0282u4);
                if (k2 != null) {
                    String str = this.f3242a;
                    if (c0282u4 != null) {
                        String[] q2 = q();
                        view = c0282u4.f3272b;
                        if (q2 != null && q2.length > 0) {
                            c0282u2 = new C0282u(view);
                            C0282u c0282u5 = (C0282u) ((o.b) vVar2.f849a).getOrDefault(view, null);
                            i = size;
                            if (c0282u5 != null) {
                                int i3 = 0;
                                while (i3 < q2.length) {
                                    HashMap hashMap = c0282u2.f3271a;
                                    String str2 = q2[i3];
                                    hashMap.put(str2, c0282u5.f3271a.get(str2));
                                    i3++;
                                    q2 = q2;
                                }
                            }
                            int i4 = p2.f3186c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = k2;
                                    break;
                                }
                                C0271j c0271j = (C0271j) p2.getOrDefault((Animator) p2.h(i5), null);
                                if (c0271j.f3231c != null && c0271j.f3229a == view && c0271j.f3230b.equals(str) && c0271j.f3231c.equals(c0282u2)) {
                                    animator = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator = k2;
                            c0282u2 = null;
                        }
                        k2 = animator;
                        c0282u = c0282u2;
                    } else {
                        i = size;
                        view = c0282u3.f3272b;
                        c0282u = null;
                    }
                    if (k2 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        C0271j c0271j2 = new C0271j();
                        c0271j2.f3229a = view;
                        c0271j2.f3230b = str;
                        c0271j2.f3231c = c0282u;
                        c0271j2.d = windowId;
                        c0271j2.f3232e = this;
                        c0271j2.f3233f = k2;
                        p2.put(k2, c0271j2);
                        this.f3259u.add(k2);
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
                C0271j c0271j3 = (C0271j) p2.getOrDefault((Animator) this.f3259u.get(sparseIntArray.keyAt(i6)), null);
                c0271j3.f3233f.setStartDelay(c0271j3.f3233f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f3254p - 1;
        this.f3254p = i;
        if (i == 0) {
            v(this, InterfaceC0273l.f3235b);
            for (int i2 = 0; i2 < ((o.e) this.f3247g.f851c).e(); i2++) {
                View view = (View) ((o.e) this.f3247g.f851c).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((o.e) this.h.f851c).e(); i3++) {
                View view2 = (View) ((o.e) this.h.f851c).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f3256r = true;
        }
    }

    public final C0282u n(View view, boolean z2) {
        C0262a c0262a = this.i;
        if (c0262a != null) {
            return c0262a.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f3249k : this.f3250l;
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
            C0282u c0282u = (C0282u) arrayList.get(i);
            if (c0282u == null) {
                return null;
            }
            if (c0282u.f3272b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (C0282u) (z2 ? this.f3250l : this.f3249k).get(i);
        }
        return null;
    }

    public final AbstractC0274m o() {
        C0262a c0262a = this.i;
        return c0262a != null ? c0262a.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final C0282u r(View view, boolean z2) {
        C0262a c0262a = this.i;
        if (c0262a != null) {
            return c0262a.r(view, z2);
        }
        return (C0282u) ((o.b) (z2 ? this.f3247g : this.h).f849a).getOrDefault(view, null);
    }

    public boolean s(C0282u c0282u, C0282u c0282u2) {
        if (c0282u == null || c0282u2 == null) {
            return false;
        }
        String[] q2 = q();
        if (q2 == null) {
            Iterator it = c0282u.f3271a.keySet().iterator();
            while (it.hasNext()) {
                if (u(c0282u, c0282u2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : q2) {
            if (!u(c0282u, c0282u2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f3245e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3246f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(AbstractC0274m abstractC0274m, InterfaceC0273l interfaceC0273l) {
        AbstractC0274m abstractC0274m2 = this.f3257s;
        if (abstractC0274m2 != null) {
            abstractC0274m2.v(abstractC0274m, interfaceC0273l);
        }
        ArrayList arrayList = this.f3258t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f3258t.size();
        InterfaceC0272k[] interfaceC0272kArr = this.f3251m;
        if (interfaceC0272kArr == null) {
            interfaceC0272kArr = new InterfaceC0272k[size];
        }
        this.f3251m = null;
        InterfaceC0272k[] interfaceC0272kArr2 = (InterfaceC0272k[]) this.f3258t.toArray(interfaceC0272kArr);
        for (int i = 0; i < size; i++) {
            interfaceC0273l.a(interfaceC0272kArr2[i], abstractC0274m);
            interfaceC0272kArr2[i] = null;
        }
        this.f3251m = interfaceC0272kArr2;
    }

    public void w(ViewGroup viewGroup) {
        if (this.f3256r) {
            return;
        }
        ArrayList arrayList = this.f3252n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3253o);
        this.f3253o = f3238w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f3253o = animatorArr;
        v(this, InterfaceC0273l.d);
        this.f3255q = true;
    }

    public AbstractC0274m x(InterfaceC0272k interfaceC0272k) {
        AbstractC0274m abstractC0274m;
        ArrayList arrayList = this.f3258t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(interfaceC0272k) && (abstractC0274m = this.f3257s) != null) {
            abstractC0274m.x(interfaceC0272k);
        }
        if (this.f3258t.size() == 0) {
            this.f3258t = null;
        }
        return this;
    }

    public void y(FrameLayout frameLayout) {
        if (this.f3255q) {
            if (!this.f3256r) {
                ArrayList arrayList = this.f3252n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3253o);
                this.f3253o = f3238w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f3253o = animatorArr;
                v(this, InterfaceC0273l.f3237e);
            }
            this.f3255q = false;
        }
    }

    public void z() {
        G();
        o.b p2 = p();
        Iterator it = this.f3259u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p2.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new g0(this, p2));
                    long j2 = this.f3244c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f3243b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0003b0(3, this));
                    animator.start();
                }
            }
        }
        this.f3259u.clear();
        m();
    }
}
