package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class z50 implements Cloneable {
    public static final Animator[] C = new Animator[0];
    public static final int[] D = {2, 1, 3, 4};
    public static final iw E = new iw(16);
    public static final ThreadLocal F = new ThreadLocal();
    public ArrayList q;
    public ArrayList r;
    public w50[] s;
    public final String f = getClass().getName();
    public long g = -1;
    public long h = -1;
    public TimeInterpolator i = null;
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public ArrayList l = null;
    public oe m = new oe(9);
    public oe n = new oe(9);
    public v6 o = null;
    public final int[] p = D;
    public final ArrayList t = new ArrayList();
    public Animator[] u = C;
    public int v = 0;
    public boolean w = false;
    public boolean x = false;
    public z50 y = null;
    public ArrayList z = null;
    public ArrayList A = new ArrayList();
    public iw B = E;

    public static void b(oe oeVar, View view, h60 h60Var) {
        l6 l6Var = (l6) oeVar.f;
        l6 l6Var2 = (l6) oeVar.i;
        SparseArray sparseArray = (SparseArray) oeVar.g;
        rq rqVar = (rq) oeVar.h;
        l6Var.put(view, h60Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = f80.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (l6Var2.containsKey(transitionName)) {
                l6Var2.put(transitionName, null);
            } else {
                l6Var2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (rqVar.f) {
                    int i = rqVar.i;
                    long[] jArr = rqVar.g;
                    Object[] objArr = rqVar.h;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != g8.c) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    rqVar.f = false;
                    rqVar.i = i2;
                }
                if (oo.e(rqVar.g, rqVar.i, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    rqVar.d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) rqVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    rqVar.d(itemIdAtPosition, null);
                }
            }
        }
    }

    public static l6 q() {
        ThreadLocal threadLocal = F;
        l6 l6Var = (l6) threadLocal.get();
        if (l6Var != null) {
            return l6Var;
        }
        l6 l6Var2 = new l6(0);
        threadLocal.set(l6Var2);
        return l6Var2;
    }

    public static boolean v(h60 h60Var, h60 h60Var2, String str) {
        Object obj = h60Var.a.get(str);
        Object obj2 = h60Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A() {
        H();
        l6 q = q();
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (q.containsKey(animator)) {
                H();
                if (animator != null) {
                    animator.addListener(new rm(this, q, 2));
                    long j = this.h;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.g;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.i;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new w0(6, this));
                    animator.start();
                }
            }
        }
        this.A.clear();
        m();
    }

    public void B(long j) {
        this.h = j;
    }

    public void D(TimeInterpolator timeInterpolator) {
        this.i = timeInterpolator;
    }

    public void E(iw iwVar) {
        if (iwVar == null) {
            this.B = E;
        } else {
            this.B = iwVar;
        }
    }

    public void G(long j) {
        this.g = j;
    }

    public final void H() {
        if (this.v == 0) {
            w(this, y50.a);
            this.x = false;
        }
        this.v++;
    }

    public String I(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.h != -1) {
            sb.append("dur(");
            sb.append(this.h);
            sb.append(") ");
        }
        if (this.g != -1) {
            sb.append("dly(");
            sb.append(this.g);
            sb.append(") ");
        }
        if (this.i != null) {
            sb.append("interp(");
            sb.append(this.i);
            sb.append(") ");
        }
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.k;
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

    public void a(w50 w50Var) {
        if (this.z == null) {
            this.z = new ArrayList();
        }
        this.z.add(w50Var);
    }

    public void c() {
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.u);
        this.u = C;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.u = animatorArr;
        w(this, y50.c);
    }

    public abstract void d(h60 h60Var);

    public final void e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        ArrayList arrayList = this.l;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.l.get(i)).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            h60 h60Var = new h60(view);
            if (z) {
                g(h60Var);
            } else {
                d(h60Var);
            }
            h60Var.c.add(this);
            f(h60Var);
            if (z) {
                b(this.m, view, h60Var);
            } else {
                b(this.n, view, h60Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                e(viewGroup.getChildAt(i2), z);
            }
        }
    }

    public abstract void g(h60 h60Var);

    public final void h(ViewGroup viewGroup, boolean z) {
        i(z);
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.k;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                h60 h60Var = new h60(findViewById);
                if (z) {
                    g(h60Var);
                } else {
                    d(h60Var);
                }
                h60Var.c.add(this);
                f(h60Var);
                if (z) {
                    b(this.m, findViewById, h60Var);
                } else {
                    b(this.n, findViewById, h60Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            h60 h60Var2 = new h60(view);
            if (z) {
                g(h60Var2);
            } else {
                d(h60Var2);
            }
            h60Var2.c.add(this);
            f(h60Var2);
            if (z) {
                b(this.m, view, h60Var2);
            } else {
                b(this.n, view, h60Var2);
            }
        }
    }

    public final void i(boolean z) {
        if (z) {
            ((l6) this.m.f).clear();
            ((SparseArray) this.m.g).clear();
            ((rq) this.m.h).a();
        } else {
            ((l6) this.n.f).clear();
            ((SparseArray) this.n.g).clear();
            ((rq) this.n.h).a();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public z50 clone() {
        try {
            z50 z50Var = (z50) super.clone();
            z50Var.A = new ArrayList();
            z50Var.m = new oe(9);
            z50Var.n = new oe(9);
            z50Var.q = null;
            z50Var.r = null;
            z50Var.y = this;
            z50Var.z = null;
            return z50Var;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator k(ViewGroup viewGroup, h60 h60Var, h60 h60Var2) {
        return null;
    }

    public void l(ViewGroup viewGroup, oe oeVar, oe oeVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        h60 h60Var;
        Animator animator;
        h60 h60Var2;
        l6 q = q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        p().getClass();
        int i3 = 0;
        while (i3 < size) {
            h60 h60Var3 = (h60) arrayList.get(i3);
            h60 h60Var4 = (h60) arrayList2.get(i3);
            if (h60Var3 != null && !h60Var3.c.contains(this)) {
                h60Var3 = null;
            }
            if (h60Var4 != null && !h60Var4.c.contains(this)) {
                h60Var4 = null;
            }
            if ((h60Var3 != null || h60Var4 != null) && (h60Var3 == null || h60Var4 == null || t(h60Var3, h60Var4))) {
                Animator k = k(viewGroup, h60Var3, h60Var4);
                if (k != null) {
                    String str = this.f;
                    if (h60Var4 != null) {
                        view = h60Var4.b;
                        String[] r = r();
                        if (r != null && r.length > 0) {
                            h60Var2 = new h60(view);
                            h60 h60Var5 = (h60) ((l6) oeVar2.f).get(view);
                            i = size;
                            if (h60Var5 != null) {
                                int i4 = 0;
                                while (i4 < r.length) {
                                    String str2 = r[i4];
                                    h60Var2.a.put(str2, h60Var5.a.get(str2));
                                    i4++;
                                    i3 = i3;
                                    h60Var5 = h60Var5;
                                }
                            }
                            i2 = i3;
                            int i5 = q.h;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    animator = k;
                                    break;
                                }
                                v50 v50Var = (v50) q.get((Animator) q.f(i6));
                                if (v50Var.c != null && v50Var.a == view && v50Var.b.equals(str) && v50Var.c.equals(h60Var2)) {
                                    animator = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = k;
                            h60Var2 = null;
                        }
                        k = animator;
                        h60Var = h60Var2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = h60Var3.b;
                        h60Var = null;
                    }
                    if (k != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        v50 v50Var2 = new v50();
                        v50Var2.a = view;
                        v50Var2.b = str;
                        v50Var2.c = h60Var;
                        v50Var2.d = windowId;
                        v50Var2.e = this;
                        v50Var2.f = k;
                        q.put(k, v50Var2);
                        this.A.add(k);
                    }
                    i3 = i2 + 1;
                    size = i;
                }
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                v50 v50Var3 = (v50) q.get((Animator) this.A.get(sparseIntArray.keyAt(i7)));
                v50Var3.f.setStartDelay(v50Var3.f.getStartDelay() + (sparseIntArray.valueAt(i7) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.v - 1;
        this.v = i;
        if (i == 0) {
            w(this, y50.b);
            for (int i2 = 0; i2 < ((rq) this.m.h).e(); i2++) {
                View view = (View) ((rq) this.m.h).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((rq) this.n.h).e(); i3++) {
                View view2 = (View) ((rq) this.n.h).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.x = true;
        }
    }

    public void n() {
        ArrayList arrayList = this.l;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(TextView.class)) {
            arrayList.add(TextView.class);
        }
        this.l = arrayList;
    }

    public final h60 o(View view, boolean z) {
        v6 v6Var = this.o;
        if (v6Var != null) {
            return v6Var.o(view, z);
        }
        ArrayList arrayList = z ? this.q : this.r;
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
            h60 h60Var = (h60) arrayList.get(i);
            if (h60Var == null) {
                return null;
            }
            if (h60Var.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (h60) (z ? this.r : this.q).get(i);
        }
        return null;
    }

    public final z50 p() {
        v6 v6Var = this.o;
        return v6Var != null ? v6Var.p() : this;
    }

    public String[] r() {
        return null;
    }

    public final h60 s(View view, boolean z) {
        v6 v6Var = this.o;
        if (v6Var != null) {
            return v6Var.s(view, z);
        }
        return (h60) ((l6) (z ? this.m : this.n).f).get(view);
    }

    public boolean t(h60 h60Var, h60 h60Var2) {
        if (h60Var != null && h60Var2 != null) {
            String[] r = r();
            if (r != null) {
                for (String str : r) {
                    if (v(h60Var, h60Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = h60Var.a.keySet().iterator();
                while (it.hasNext()) {
                    if (v(h60Var, h60Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        return I("");
    }

    public final boolean u(View view) {
        int id = view.getId();
        ArrayList arrayList = this.l;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.l.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        ArrayList arrayList2 = this.j;
        int size2 = arrayList2.size();
        ArrayList arrayList3 = this.k;
        return (size2 == 0 && arrayList3.size() == 0) || arrayList2.contains(Integer.valueOf(id)) || arrayList3.contains(view);
    }

    public final void w(z50 z50Var, y50 y50Var) {
        z50 z50Var2 = this.y;
        if (z50Var2 != null) {
            z50Var2.w(z50Var, y50Var);
        }
        ArrayList arrayList = this.z;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.z.size();
        w50[] w50VarArr = this.s;
        if (w50VarArr == null) {
            w50VarArr = new w50[size];
        }
        this.s = null;
        w50[] w50VarArr2 = (w50[]) this.z.toArray(w50VarArr);
        for (int i = 0; i < size; i++) {
            y50Var.b(w50VarArr2[i], z50Var);
            w50VarArr2[i] = null;
        }
        this.s = w50VarArr2;
    }

    public void x(View view) {
        if (this.x) {
            return;
        }
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.u);
        this.u = C;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.u = animatorArr;
        w(this, y50.d);
        this.w = true;
    }

    public z50 y(w50 w50Var) {
        z50 z50Var;
        ArrayList arrayList = this.z;
        if (arrayList != null) {
            if (!arrayList.remove(w50Var) && (z50Var = this.y) != null) {
                z50Var.y(w50Var);
            }
            if (this.z.size() == 0) {
                this.z = null;
            }
        }
        return this;
    }

    public void z(View view) {
        if (this.w) {
            if (!this.x) {
                ArrayList arrayList = this.t;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.u);
                this.u = C;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.u = animatorArr;
                w(this, y50.e);
            }
            this.w = false;
        }
    }

    public void C(oo ooVar) {
    }

    public void f(h60 h60Var) {
    }

    public void F() {
    }
}
