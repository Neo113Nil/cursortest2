package g0;

import E1.AbstractC0001b;
import K.C0005a;
import K.C0007b;
import K.C0024q;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: g0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145O {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2798a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2799b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2800c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public int f2801e;

    /* renamed from: f, reason: collision with root package name */
    public int f2802f;

    /* renamed from: g, reason: collision with root package name */
    public C0144N f2803g;
    public final /* synthetic */ RecyclerView h;

    public C0145O(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f2798a = arrayList;
        this.f2799b = null;
        this.f2800c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.f2801e = 2;
        this.f2802f = 2;
    }

    public final void a(Z z2, boolean z3) {
        RecyclerView.l(z2);
        RecyclerView recyclerView = this.h;
        b0 b0Var = recyclerView.f1999l0;
        View view = z2.f2830a;
        if (b0Var != null) {
            a0 a0Var = b0Var.f2854e;
            K.T.l(view, a0Var != null ? (C0007b) a0Var.f2849e.remove(view) : null);
        }
        if (z3) {
            ArrayList arrayList = recyclerView.f2002n;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.f1987e0 != null) {
                recyclerView.f1990g.L(z2);
            }
            if (RecyclerView.f1955y0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + z2);
            }
        }
        z2.f2845s = null;
        z2.f2844r = null;
        C0144N c2 = c();
        c2.getClass();
        int i = z2.f2834f;
        ArrayList arrayList2 = c2.a(i).f2792a;
        if (((C0143M) c2.f2795a.get(i)).f2793b <= arrayList2.size()) {
            F1.l.g(view);
        } else {
            if (RecyclerView.f1954x0 && arrayList2.contains(z2)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            z2.n();
            arrayList2.add(z2);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.f1987e0.b()) {
            return !recyclerView.f1987e0.f2817g ? i : recyclerView.f1986e.e(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f1987e0.b() + recyclerView.B());
    }

    public final C0144N c() {
        if (this.f2803g == null) {
            C0144N c0144n = new C0144N();
            c0144n.f2795a = new SparseArray();
            c0144n.f2796b = 0;
            c0144n.f2797c = Collections.newSetFromMap(new IdentityHashMap());
            this.f2803g = c0144n;
            d();
        }
        return this.f2803g;
    }

    public final void d() {
        RecyclerView recyclerView;
        AbstractC0131A abstractC0131A;
        C0144N c0144n = this.f2803g;
        if (c0144n == null || (abstractC0131A = (recyclerView = this.h).f1998l) == null || !recyclerView.f2009r) {
            return;
        }
        c0144n.f2797c.add(abstractC0131A);
    }

    public final void e(AbstractC0131A abstractC0131A, boolean z2) {
        C0144N c0144n = this.f2803g;
        if (c0144n == null) {
            return;
        }
        Set set = c0144n.f2797c;
        set.remove(abstractC0131A);
        if (set.size() != 0 || z2) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = c0144n.f2795a;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((C0143M) sparseArray.get(sparseArray.keyAt(i))).f2792a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                F1.l.g(((Z) arrayList.get(i2)).f2830a);
            }
            i++;
        }
    }

    public final void f() {
        ArrayList arrayList = this.f2800c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.C0) {
            C0160m c0160m = this.h.f1985d0;
            int[] iArr = c0160m.f2954c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0160m.d = 0;
        }
    }

    public final void g(int i) {
        if (RecyclerView.f1955y0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f2800c;
        Z z2 = (Z) arrayList.get(i);
        if (RecyclerView.f1955y0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + z2);
        }
        a(z2, true);
        arrayList.remove(i);
    }

    public final void h(View view) {
        Z L2 = RecyclerView.L(view);
        boolean k2 = L2.k();
        RecyclerView recyclerView = this.h;
        if (k2) {
            recyclerView.removeDetachedView(view, false);
        }
        if (L2.j()) {
            L2.f2840n.l(L2);
        } else if (L2.q()) {
            L2.f2836j &= -33;
        }
        i(L2);
        if (recyclerView.f1965J == null || L2.h()) {
            return;
        }
        recyclerView.f1965J.d(L2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Z z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean j2 = z2.j();
        boolean z6 = true;
        RecyclerView recyclerView = this.h;
        View view = z2.f2830a;
        if (j2 || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(z2.j());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.B());
            throw new IllegalArgumentException(sb.toString());
        }
        if (z2.k()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(z2);
            throw new IllegalArgumentException(AbstractC0001b.e(recyclerView, sb2));
        }
        if (z2.p()) {
            throw new IllegalArgumentException(AbstractC0001b.e(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        if ((z2.f2836j & 16) == 0) {
            WeakHashMap weakHashMap = K.T.f633a;
            if (view.hasTransientState()) {
                z3 = true;
                AbstractC0131A abstractC0131A = recyclerView.f1998l;
                z4 = RecyclerView.f1954x0;
                ArrayList arrayList = this.f2800c;
                if (!z4 && arrayList.contains(z2)) {
                    StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
                    sb3.append(z2);
                    throw new IllegalArgumentException(AbstractC0001b.e(recyclerView, sb3));
                }
                if (z2.h()) {
                    if (RecyclerView.f1955y0) {
                        Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.B());
                    }
                    z6 = false;
                } else {
                    if (this.f2802f <= 0 || z2.d(526)) {
                        z5 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.f2802f && size > 0) {
                            g(0);
                            size--;
                        }
                        if (RecyclerView.C0 && size > 0) {
                            C0160m c0160m = recyclerView.f1985d0;
                            int i = z2.f2832c;
                            if (c0160m.f2954c != null) {
                                int i2 = c0160m.d * 2;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (c0160m.f2954c[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((Z) arrayList.get(i4)).f2832c;
                                C0160m c0160m2 = recyclerView.f1985d0;
                                if (c0160m2.f2954c == null) {
                                    break;
                                }
                                int i6 = c0160m2.d * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (c0160m2.f2954c[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i4 + 1;
                        }
                        arrayList.add(size, z2);
                        z5 = true;
                    }
                    if (z5) {
                        z6 = false;
                    } else {
                        a(z2, true);
                    }
                    r1 = z5;
                }
                recyclerView.f1990g.L(z2);
                if (r1 && !z6 && z3) {
                    F1.l.g(view);
                    z2.f2845s = null;
                    z2.f2844r = null;
                    return;
                }
                return;
            }
        }
        z3 = false;
        AbstractC0131A abstractC0131A2 = recyclerView.f1998l;
        z4 = RecyclerView.f1954x0;
        ArrayList arrayList2 = this.f2800c;
        if (!z4) {
        }
        if (z2.h()) {
        }
        recyclerView.f1990g.L(z2);
        if (r1) {
        }
    }

    public final void j(View view) {
        AbstractC0135E abstractC0135E;
        Z L2 = RecyclerView.L(view);
        boolean d = L2.d(12);
        RecyclerView recyclerView = this.h;
        if (!d && L2.l() && (abstractC0135E = recyclerView.f1965J) != null) {
            C0156i c0156i = (C0156i) abstractC0135E;
            if (L2.c().isEmpty() && c0156i.f2905g && !L2.g()) {
                if (this.f2799b == null) {
                    this.f2799b = new ArrayList();
                }
                L2.f2840n = this;
                L2.f2841o = true;
                this.f2799b.add(L2);
                return;
            }
        }
        if (L2.g() && !L2.i() && !recyclerView.f1998l.f2765b) {
            throw new IllegalArgumentException(AbstractC0001b.e(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        L2.f2840n = this;
        L2.f2841o = false;
        this.f2798a.add(L2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x0463, code lost:
    
        if (r11.g() == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x04ac, code lost:
    
        if ((r9 + r12) >= r27) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f5, code lost:
    
        if (r11.f2834f != 0) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Z k(int i, long j2) {
        boolean z2;
        Z z3;
        boolean z4;
        boolean z5;
        ViewGroup.LayoutParams layoutParams;
        C0140J c0140j;
        RecyclerView G2;
        Z z6;
        Z z7;
        View view;
        int b2;
        boolean z8;
        int size;
        int e2;
        RecyclerView recyclerView = this.h;
        if (i < 0 || i >= recyclerView.f1987e0.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + recyclerView.f1987e0.b() + recyclerView.B());
        }
        V v2 = recyclerView.f1987e0;
        boolean z9 = false;
        if (v2.f2817g) {
            ArrayList arrayList = this.f2799b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        z3 = (Z) this.f2799b.get(i2);
                        if (!z3.q() && z3.b() == i) {
                            z3.a(32);
                            break;
                        }
                        i2++;
                    } else if (recyclerView.f1998l.f2765b && (e2 = recyclerView.f1986e.e(i, 0)) > 0 && e2 < recyclerView.f1998l.a()) {
                        long b3 = recyclerView.f1998l.b(e2);
                        for (int i3 = 0; i3 < size; i3++) {
                            Z z10 = (Z) this.f2799b.get(i3);
                            if (!z10.q() && z10.f2833e == b3) {
                                z10.a(32);
                                z3 = z10;
                                break;
                            }
                        }
                    }
                }
                z2 = z3 == null;
            }
            z3 = null;
            if (z3 == null) {
            }
        } else {
            z2 = false;
            z3 = null;
        }
        ArrayList arrayList2 = this.f2800c;
        ArrayList arrayList3 = this.f2798a;
        if (z3 == null) {
            int size2 = arrayList3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                Z z11 = (Z) arrayList3.get(i4);
                if (!z11.q() && z11.b() == i && !z11.g() && (v2.f2817g || !z11.i())) {
                    z11.a(32);
                    z3 = z11;
                    break;
                }
            }
            ArrayList arrayList4 = recyclerView.f1988f.f2852c;
            int size3 = arrayList4.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    view = null;
                    break;
                }
                view = (View) arrayList4.get(i5);
                Z L2 = RecyclerView.L(view);
                if (L2.b() == i && !L2.g() && !L2.i()) {
                    break;
                }
                i5++;
            }
            if (view == null) {
                int size4 = arrayList2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        z3 = null;
                        break;
                    }
                    z3 = (Z) arrayList2.get(i6);
                    if (z3.g() || z3.b() != i || z3.e()) {
                        i6++;
                    } else {
                        arrayList2.remove(i6);
                        if (RecyclerView.f1955y0) {
                            Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + z3);
                        }
                    }
                }
            } else {
                Z L3 = RecyclerView.L(view);
                C0149b c0149b = recyclerView.f1988f;
                int indexOfChild = c0149b.f2850a.f3009a.indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                D1.a aVar = c0149b.f2851b;
                if (!aVar.d(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                aVar.a(indexOfChild);
                c0149b.j(view);
                C0149b c0149b2 = recyclerView.f1988f;
                int indexOfChild2 = c0149b2.f2850a.f3009a.indexOfChild(view);
                if (indexOfChild2 != -1) {
                    D1.a aVar2 = c0149b2.f2851b;
                    if (!aVar2.d(indexOfChild2)) {
                        b2 = indexOfChild2 - aVar2.b(indexOfChild2);
                        if (b2 != -1) {
                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb.append(L3);
                            throw new IllegalStateException(AbstractC0001b.e(recyclerView, sb));
                        }
                        recyclerView.f1988f.c(b2);
                        j(view);
                        L3.a(8224);
                        z3 = L3;
                    }
                }
                b2 = -1;
                if (b2 != -1) {
                }
            }
            if (z3 != null) {
                if (!z3.i()) {
                    int i7 = z3.f2832c;
                    if (i7 < 0 || i7 >= recyclerView.f1998l.a()) {
                        StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb2.append(z3);
                        throw new IndexOutOfBoundsException(AbstractC0001b.e(recyclerView, sb2));
                    }
                    if (!v2.f2817g) {
                        recyclerView.f1998l.getClass();
                    }
                    AbstractC0131A abstractC0131A = recyclerView.f1998l;
                    if (!abstractC0131A.f2765b || z3.f2833e == abstractC0131A.b(z3.f2832c)) {
                        z8 = true;
                    }
                    z8 = false;
                } else {
                    if (RecyclerView.f1954x0 && !v2.f2817g) {
                        throw new IllegalStateException(AbstractC0001b.e(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                    }
                    z8 = v2.f2817g;
                }
                if (z8) {
                    z2 = true;
                } else {
                    z3.a(4);
                    if (z3.j()) {
                        recyclerView.removeDetachedView(z3.f2830a, false);
                        z3.f2840n.l(z3);
                    } else if (z3.q()) {
                        z3.f2836j &= -33;
                    }
                    i(z3);
                    z3 = null;
                }
            }
        }
        if (z3 == null) {
            int e3 = recyclerView.f1986e.e(i, 0);
            if (e3 < 0 || e3 >= recyclerView.f1998l.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + e3 + ").state:" + v2.b() + recyclerView.B());
            }
            recyclerView.f1998l.getClass();
            AbstractC0131A abstractC0131A2 = recyclerView.f1998l;
            if (abstractC0131A2.f2765b) {
                long b4 = abstractC0131A2.b(e3);
                int size5 = arrayList3.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        Z z12 = (Z) arrayList3.get(size5);
                        if (z12.f2833e == b4 && !z12.q()) {
                            if (z12.f2834f == 0) {
                                z12.a(32);
                                if (z12.i() && !v2.f2817g) {
                                    z12.f2836j = (z12.f2836j & (-15)) | 2;
                                }
                                z7 = z12;
                            } else {
                                arrayList3.remove(size5);
                                View view2 = z12.f2830a;
                                recyclerView.removeDetachedView(view2, false);
                                Z L4 = RecyclerView.L(view2);
                                L4.f2840n = null;
                                L4.f2841o = false;
                                L4.f2836j &= -33;
                                i(L4);
                            }
                        }
                        size5--;
                    } else {
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            z7 = (Z) arrayList2.get(size6);
                            if (z7.f2833e != b4 || z7.e()) {
                                size6--;
                            } else if (z7.f2834f == 0) {
                                arrayList2.remove(size6);
                            } else {
                                g(size6);
                            }
                        }
                        z7 = null;
                    }
                }
                if (z7 != null) {
                    z7.f2832c = e3;
                    z3 = z7;
                    z2 = true;
                } else {
                    z3 = z7;
                }
            }
            if (z3 == null) {
                if (RecyclerView.f1955y0) {
                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                }
                C0143M c0143m = (C0143M) c().f2795a.get(0);
                if (c0143m != null) {
                    ArrayList arrayList5 = c0143m.f2792a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((Z) arrayList5.get(size7)).e()) {
                                z6 = (Z) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                z6 = null;
                if (z6 != null) {
                    z6.n();
                    boolean z13 = RecyclerView.f1954x0;
                }
                z3 = z6;
            }
            if (z3 == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j2 != Long.MAX_VALUE) {
                    long j3 = this.f2803g.a(0).f2794c;
                    if (!(j3 == 0 || j3 + nanoTime < j2)) {
                        return null;
                    }
                }
                AbstractC0131A abstractC0131A3 = recyclerView.f1998l;
                abstractC0131A3.getClass();
                try {
                    int i8 = G.h.f433a;
                    Trace.beginSection("RV CreateView");
                    z3 = abstractC0131A3.d(recyclerView);
                    View view3 = z3.f2830a;
                    if (view3.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    z3.f2834f = 0;
                    Trace.endSection();
                    if (RecyclerView.C0 && (G2 = RecyclerView.G(view3)) != null) {
                        z3.f2831b = new WeakReference(G2);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    C0143M a2 = this.f2803g.a(0);
                    long j4 = a2.f2794c;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j4 / 4) * 3);
                    }
                    a2.f2794c = nanoTime2;
                    if (RecyclerView.f1955y0) {
                        Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                    }
                } finally {
                    int i9 = G.h.f433a;
                    Trace.endSection();
                }
            }
        }
        if (z2 && !v2.f2817g && z3.d(8192)) {
            z3.f2836j &= -8193;
            if (v2.f2818j) {
                AbstractC0135E.b(z3);
                AbstractC0135E abstractC0135E = recyclerView.f1965J;
                z3.c();
                abstractC0135E.getClass();
                C0024q c0024q = new C0024q();
                c0024q.a(z3);
                recyclerView.X(z3, c0024q);
            }
        }
        boolean z14 = v2.f2817g;
        View view4 = z3.f2830a;
        if (!z14 || !z3.f()) {
            if (z3.f()) {
                if (!((z3.f2836j & 2) != 0)) {
                }
            }
            if (RecyclerView.f1954x0 && z3.i()) {
                StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                sb3.append(z3);
                throw new IllegalStateException(AbstractC0001b.e(recyclerView, sb3));
            }
            int e4 = recyclerView.f1986e.e(i, 0);
            z3.f2845s = null;
            z3.f2844r = recyclerView;
            int i10 = z3.f2834f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j2 != Long.MAX_VALUE) {
                long j5 = this.f2803g.a(i10).d;
                if (j5 != 0) {
                }
            }
            if (z3.k()) {
                recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                z4 = true;
            } else {
                z4 = false;
            }
            AbstractC0131A abstractC0131A4 = recyclerView.f1998l;
            abstractC0131A4.getClass();
            boolean z15 = z3.f2845s == null;
            if (z15) {
                z3.f2832c = e4;
                if (abstractC0131A4.f2765b) {
                    z3.f2833e = abstractC0131A4.b(e4);
                }
                z3.f2836j = (z3.f2836j & (-520)) | 1;
                int i11 = G.h.f433a;
                Trace.beginSection("RV OnBindView");
            }
            z3.f2845s = abstractC0131A4;
            if (RecyclerView.f1954x0) {
                if (view4.getParent() == null) {
                    WeakHashMap weakHashMap = K.T.f633a;
                    if (view4.isAttachedToWindow() != z3.k()) {
                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + z3.k() + ", attached to window: " + view4.isAttachedToWindow() + ", holder: " + z3);
                    }
                }
                if (view4.getParent() == null) {
                    WeakHashMap weakHashMap2 = K.T.f633a;
                    if (view4.isAttachedToWindow()) {
                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + z3);
                    }
                }
            }
            z3.c();
            abstractC0131A4.c(z3, e4);
            if (z15) {
                ArrayList arrayList6 = z3.f2837k;
                if (arrayList6 != null) {
                    arrayList6.clear();
                }
                z3.f2836j &= -1025;
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 instanceof C0140J) {
                    ((C0140J) layoutParams2).f2791c = true;
                }
            }
            if (z4) {
                recyclerView.detachViewFromParent(view4);
            }
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            C0143M a3 = this.f2803g.a(z3.f2834f);
            long j6 = a3.d;
            if (j6 != 0) {
                nanoTime4 = (nanoTime4 / 4) + ((j6 / 4) * 3);
            }
            a3.d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.f2022z;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap3 = K.T.f633a;
                if (view4.getImportantForAccessibility() == 0) {
                    z5 = true;
                    view4.setImportantForAccessibility(1);
                } else {
                    z5 = true;
                }
                b0 b0Var = recyclerView.f1999l0;
                if (b0Var != null) {
                    a0 a0Var = b0Var.f2854e;
                    if (a0Var != null) {
                        View.AccessibilityDelegate c2 = K.T.c(view4);
                        C0007b c0007b = c2 == null ? null : c2 instanceof C0005a ? ((C0005a) c2).f644a : new C0007b(c2);
                        if (c0007b != null && c0007b != a0Var) {
                            a0Var.f2849e.put(view4, c0007b);
                        }
                    }
                    K.T.l(view4, a0Var);
                }
            } else {
                z5 = true;
            }
            if (v2.f2817g) {
                z3.f2835g = i;
            }
            z9 = z5;
            layoutParams = view4.getLayoutParams();
            if (layoutParams != null) {
                c0140j = (C0140J) recyclerView.generateDefaultLayoutParams();
                view4.setLayoutParams(c0140j);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                c0140j = (C0140J) layoutParams;
            } else {
                c0140j = (C0140J) recyclerView.generateLayoutParams(layoutParams);
                view4.setLayoutParams(c0140j);
            }
            c0140j.f2789a = z3;
            c0140j.d = (z2 || !z9) ? false : z5;
            return z3;
        }
        z3.f2835g = i;
        z5 = true;
        layoutParams = view4.getLayoutParams();
        if (layoutParams != null) {
        }
        c0140j.f2789a = z3;
        c0140j.d = (z2 || !z9) ? false : z5;
        return z3;
    }

    public final void l(Z z2) {
        if (z2.f2841o) {
            this.f2799b.remove(z2);
        } else {
            this.f2798a.remove(z2);
        }
        z2.f2840n = null;
        z2.f2841o = false;
        z2.f2836j &= -33;
    }

    public final void m() {
        AbstractC0139I abstractC0139I = this.h.f2000m;
        this.f2802f = this.f2801e + (abstractC0139I != null ? abstractC0139I.f2783j : 0);
        ArrayList arrayList = this.f2800c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f2802f; size--) {
            g(size);
        }
    }
}
