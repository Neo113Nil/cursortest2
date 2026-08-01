package o0;

import K.C0008b0;
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
import c1.AbstractC0104b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class m implements Cloneable {

    /* renamed from: w, reason: collision with root package name */
    public static final Animator[] f3665w = new Animator[0];

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f3666x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final t.n f3667y = new t.n();

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f3668z = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3676k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f3677l;

    /* renamed from: m, reason: collision with root package name */
    public k[] f3678m;

    /* renamed from: a, reason: collision with root package name */
    public final String f3669a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f3670b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f3671c = -1;
    public TimeInterpolator d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3672e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3673f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public U.v f3674g = new U.v(4);
    public U.v h = new U.v(4);
    public C0303a i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f3675j = f3666x;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3679n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f3680o = f3665w;

    /* renamed from: p, reason: collision with root package name */
    public int f3681p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3682q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3683r = false;

    /* renamed from: s, reason: collision with root package name */
    public m f3684s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f3685t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f3686u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public t.n f3687v = f3667y;

    public static void b(U.v vVar, View view, u uVar) {
        ((o.b) vVar.f1207a).put(view, uVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) vVar.f1208b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = T.f633a;
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
                o.e eVar = (o.e) vVar.f1209c;
                if (eVar.f3590a) {
                    eVar.b();
                }
                if (o.d.b(eVar.f3591b, eVar.d, itemIdAtPosition) < 0) {
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
        ThreadLocal threadLocal = f3668z;
        o.b bVar = (o.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean u(u uVar, u uVar2, String str) {
        Object obj = uVar.f3698a.get(str);
        Object obj2 = uVar2.f3698a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j2) {
        this.f3671c = j2;
    }

    public void B(AbstractC0104b abstractC0104b) {
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void D(t.n nVar) {
        if (nVar == null) {
            this.f3687v = f3667y;
        } else {
            this.f3687v = nVar;
        }
    }

    public void E() {
    }

    public void F(long j2) {
        this.f3670b = j2;
    }

    public final void G() {
        if (this.f3681p == 0) {
            v(this, l.f3661a);
            this.f3683r = false;
        }
        this.f3681p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f3671c != -1) {
            sb.append("dur(");
            sb.append(this.f3671c);
            sb.append(") ");
        }
        if (this.f3670b != -1) {
            sb.append("dly(");
            sb.append(this.f3670b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f3672e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3673f;
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

    public void a(k kVar) {
        if (this.f3685t == null) {
            this.f3685t = new ArrayList();
        }
        this.f3685t.add(kVar);
    }

    public void c() {
        ArrayList arrayList = this.f3679n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3680o);
        this.f3680o = f3665w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f3680o = animatorArr;
        v(this, l.f3663c);
    }

    public abstract void d(u uVar);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            u uVar = new u(view);
            if (z2) {
                g(uVar);
            } else {
                d(uVar);
            }
            uVar.f3700c.add(this);
            f(uVar);
            if (z2) {
                b(this.f3674g, view, uVar);
            } else {
                b(this.h, view, uVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z2);
            }
        }
    }

    public void f(u uVar) {
    }

    public abstract void g(u uVar);

    public final void h(FrameLayout frameLayout, boolean z2) {
        i(z2);
        ArrayList arrayList = this.f3672e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3673f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(frameLayout, z2);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = frameLayout.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                u uVar = new u(findViewById);
                if (z2) {
                    g(uVar);
                } else {
                    d(uVar);
                }
                uVar.f3700c.add(this);
                f(uVar);
                if (z2) {
                    b(this.f3674g, findViewById, uVar);
                } else {
                    b(this.h, findViewById, uVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            u uVar2 = new u(view);
            if (z2) {
                g(uVar2);
            } else {
                d(uVar2);
            }
            uVar2.f3700c.add(this);
            f(uVar2);
            if (z2) {
                b(this.f3674g, view, uVar2);
            } else {
                b(this.h, view, uVar2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((o.b) this.f3674g.f1207a).clear();
            ((SparseArray) this.f3674g.f1208b).clear();
            ((o.e) this.f3674g.f1209c).a();
        } else {
            ((o.b) this.h.f1207a).clear();
            ((SparseArray) this.h.f1208b).clear();
            ((o.e) this.h.f1209c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.f3686u = new ArrayList();
            mVar.f3674g = new U.v(4);
            mVar.h = new U.v(4);
            mVar.f3676k = null;
            mVar.f3677l = null;
            mVar.f3684s = this;
            mVar.f3685t = null;
            return mVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator k(FrameLayout frameLayout, u uVar, u uVar2) {
        return null;
    }

    public void l(FrameLayout frameLayout, U.v vVar, U.v vVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        u uVar;
        Animator animator;
        u uVar2;
        o.b p2 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i2 = 0;
        while (i2 < size) {
            u uVar3 = (u) arrayList.get(i2);
            u uVar4 = (u) arrayList2.get(i2);
            if (uVar3 != null && !uVar3.f3700c.contains(this)) {
                uVar3 = null;
            }
            if (uVar4 != null && !uVar4.f3700c.contains(this)) {
                uVar4 = null;
            }
            if ((uVar3 != null || uVar4 != null) && (uVar3 == null || uVar4 == null || s(uVar3, uVar4))) {
                Animator k2 = k(frameLayout, uVar3, uVar4);
                if (k2 != null) {
                    String str = this.f3669a;
                    if (uVar4 != null) {
                        String[] q2 = q();
                        view = uVar4.f3699b;
                        if (q2 != null && q2.length > 0) {
                            uVar2 = new u(view);
                            u uVar5 = (u) ((o.b) vVar2.f1207a).getOrDefault(view, null);
                            i = size;
                            if (uVar5 != null) {
                                int i3 = 0;
                                while (i3 < q2.length) {
                                    HashMap hashMap = uVar2.f3698a;
                                    String str2 = q2[i3];
                                    hashMap.put(str2, uVar5.f3698a.get(str2));
                                    i3++;
                                    q2 = q2;
                                }
                            }
                            int i4 = p2.f3612c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = k2;
                                    break;
                                }
                                j jVar = (j) p2.getOrDefault((Animator) p2.h(i5), null);
                                if (jVar.f3658c != null && jVar.f3656a == view && jVar.f3657b.equals(str) && jVar.f3658c.equals(uVar2)) {
                                    animator = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator = k2;
                            uVar2 = null;
                        }
                        k2 = animator;
                        uVar = uVar2;
                    } else {
                        i = size;
                        view = uVar3.f3699b;
                        uVar = null;
                    }
                    if (k2 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        j jVar2 = new j();
                        jVar2.f3656a = view;
                        jVar2.f3657b = str;
                        jVar2.f3658c = uVar;
                        jVar2.d = windowId;
                        jVar2.f3659e = this;
                        jVar2.f3660f = k2;
                        p2.put(k2, jVar2);
                        this.f3686u.add(k2);
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
                j jVar3 = (j) p2.getOrDefault((Animator) this.f3686u.get(sparseIntArray.keyAt(i6)), null);
                jVar3.f3660f.setStartDelay(jVar3.f3660f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f3681p - 1;
        this.f3681p = i;
        if (i == 0) {
            v(this, l.f3662b);
            for (int i2 = 0; i2 < ((o.e) this.f3674g.f1209c).e(); i2++) {
                View view = (View) ((o.e) this.f3674g.f1209c).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((o.e) this.h.f1209c).e(); i3++) {
                View view2 = (View) ((o.e) this.h.f1209c).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f3683r = true;
        }
    }

    public final u n(View view, boolean z2) {
        C0303a c0303a = this.i;
        if (c0303a != null) {
            return c0303a.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f3676k : this.f3677l;
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
            u uVar = (u) arrayList.get(i);
            if (uVar == null) {
                return null;
            }
            if (uVar.f3699b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (u) (z2 ? this.f3677l : this.f3676k).get(i);
        }
        return null;
    }

    public final m o() {
        C0303a c0303a = this.i;
        return c0303a != null ? c0303a.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final u r(View view, boolean z2) {
        C0303a c0303a = this.i;
        if (c0303a != null) {
            return c0303a.r(view, z2);
        }
        return (u) ((o.b) (z2 ? this.f3674g : this.h).f1207a).getOrDefault(view, null);
    }

    public boolean s(u uVar, u uVar2) {
        if (uVar == null || uVar2 == null) {
            return false;
        }
        String[] q2 = q();
        if (q2 == null) {
            Iterator it = uVar.f3698a.keySet().iterator();
            while (it.hasNext()) {
                if (u(uVar, uVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : q2) {
            if (!u(uVar, uVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f3672e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3673f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(m mVar, l lVar) {
        m mVar2 = this.f3684s;
        if (mVar2 != null) {
            mVar2.v(mVar, lVar);
        }
        ArrayList arrayList = this.f3685t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f3685t.size();
        k[] kVarArr = this.f3678m;
        if (kVarArr == null) {
            kVarArr = new k[size];
        }
        this.f3678m = null;
        k[] kVarArr2 = (k[]) this.f3685t.toArray(kVarArr);
        for (int i = 0; i < size; i++) {
            lVar.a(kVarArr2[i], mVar);
            kVarArr2[i] = null;
        }
        this.f3678m = kVarArr2;
    }

    public void w(ViewGroup viewGroup) {
        if (this.f3683r) {
            return;
        }
        ArrayList arrayList = this.f3679n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3680o);
        this.f3680o = f3665w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f3680o = animatorArr;
        v(this, l.d);
        this.f3682q = true;
    }

    public m x(k kVar) {
        m mVar;
        ArrayList arrayList = this.f3685t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(kVar) && (mVar = this.f3684s) != null) {
            mVar.x(kVar);
        }
        if (this.f3685t.size() == 0) {
            this.f3685t = null;
        }
        return this;
    }

    public void y(FrameLayout frameLayout) {
        if (this.f3682q) {
            if (!this.f3683r) {
                ArrayList arrayList = this.f3679n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3680o);
                this.f3680o = f3665w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f3680o = animatorArr;
                v(this, l.f3664e);
            }
            this.f3682q = false;
        }
    }

    public void z() {
        G();
        o.b p2 = p();
        Iterator it = this.f3686u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p2.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new g0(this, p2));
                    long j2 = this.f3671c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f3670b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0008b0(3, this));
                    animator.start();
                }
            }
        }
        this.f3686u.clear();
        m();
    }
}
