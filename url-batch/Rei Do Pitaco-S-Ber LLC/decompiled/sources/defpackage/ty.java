package defpackage;

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

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ty {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public sy g;
    public final /* synthetic */ RecyclerView h;

    public ty(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(dz dzVar, boolean z) {
        RecyclerView.l(dzVar);
        View view = dzVar.a;
        RecyclerView recyclerView = this.h;
        fz fzVar = recyclerView.s0;
        if (fzVar != null) {
            ez ezVar = fzVar.e;
            f80.m(view, ezVar != null ? (x) ezVar.e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.t;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                l8.c();
                return;
            }
            if (recyclerView.l0 != null) {
                recyclerView.l.L(dzVar);
            }
            if (RecyclerView.H0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + dzVar);
            }
        }
        dzVar.s = null;
        dzVar.r = null;
        sy c = c();
        c.getClass();
        int i = dzVar.f;
        ArrayList arrayList2 = c.a(i).a;
        if (((ry) c.a.get(i)).b <= arrayList2.size()) {
            m60.h(view);
        } else if (RecyclerView.G0 && arrayList2.contains(dzVar)) {
            l8.l("this scrap item already exists");
        } else {
            dzVar.m();
            arrayList2.add(dzVar);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        zy zyVar = recyclerView.l0;
        if (i >= 0 && i < zyVar.b()) {
            return !zyVar.g ? i : recyclerView.j.g(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + zyVar.b() + recyclerView.B());
    }

    public final sy c() {
        if (this.g == null) {
            sy syVar = new sy();
            syVar.a = new SparseArray();
            syVar.b = 0;
            syVar.c = Collections.newSetFromMap(new IdentityHashMap());
            this.g = syVar;
            e();
        }
        return this.g;
    }

    public final View d(int i) {
        return l(i, Long.MAX_VALUE).a;
    }

    public final void e() {
        RecyclerView recyclerView;
        ey eyVar;
        sy syVar = this.g;
        if (syVar == null || (eyVar = (recyclerView = this.h).r) == null || !recyclerView.x) {
            return;
        }
        syVar.c.add(eyVar);
    }

    public final void f(ey eyVar, boolean z) {
        sy syVar = this.g;
        if (syVar != null) {
            SparseArray sparseArray = syVar.a;
            Set set = syVar.c;
            set.remove(eyVar);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((ry) sparseArray.get(sparseArray.keyAt(i))).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    m60.h(((dz) arrayList.get(i2)).a);
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.L0) {
            am amVar = this.h.k0;
            int[] iArr = amVar.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            amVar.d = 0;
        }
    }

    public final void h(int i) {
        if (RecyclerView.H0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.c;
        dz dzVar = (dz) arrayList.get(i);
        if (RecyclerView.H0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + dzVar);
        }
        a(dzVar, true);
        arrayList.remove(i);
    }

    public final void i(View view) {
        dz M = RecyclerView.M(view);
        boolean j = M.j();
        RecyclerView recyclerView = this.h;
        if (j) {
            recyclerView.removeDetachedView(view, false);
        }
        if (M.i()) {
            M.n.m(M);
        } else if (M.p()) {
            M.j &= -33;
        }
        j(M);
        if (recyclerView.Q == null || M.g()) {
            return;
        }
        recyclerView.Q.d(M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ac, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(dz dzVar) {
        boolean z;
        boolean z2;
        boolean z3;
        RecyclerView recyclerView = this.h;
        am amVar = recyclerView.k0;
        boolean i = dzVar.i();
        View view = dzVar.a;
        boolean z4 = true;
        if (i || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(dzVar.i());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.B());
            throw new IllegalArgumentException(sb.toString());
        }
        if (dzVar.j()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(dzVar);
            l8.q(sb2, recyclerView.B());
            return;
        }
        if (dzVar.o()) {
            l8.l("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.B()));
            return;
        }
        if ((dzVar.j & 16) == 0) {
            WeakHashMap weakHashMap = f80.a;
            if (view.hasTransientState()) {
                z = true;
                z2 = RecyclerView.G0;
                ArrayList arrayList = this.c;
                if (!z2 && arrayList.contains(dzVar)) {
                    StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
                    sb3.append(dzVar);
                    l8.q(sb3, recyclerView.B());
                    return;
                }
                if (dzVar.g()) {
                    if (RecyclerView.H0) {
                        Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists".concat(recyclerView.B()));
                    }
                    z4 = false;
                } else {
                    if (this.f <= 0 || (dzVar.j & 526) != 0) {
                        z3 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.f && size > 0) {
                            h(0);
                            size--;
                        }
                        if (RecyclerView.L0 && size > 0) {
                            int i2 = dzVar.c;
                            if (amVar.c != null) {
                                int i3 = amVar.d * 2;
                                for (int i4 = 0; i4 < i3; i4 += 2) {
                                    if (amVar.c[i4] == i2) {
                                        break;
                                    }
                                }
                            }
                            int i5 = size - 1;
                            loop1: while (i5 >= 0) {
                                int i6 = ((dz) arrayList.get(i5)).c;
                                if (amVar.c == null) {
                                    break;
                                }
                                int i7 = amVar.d * 2;
                                for (int i8 = 0; i8 < i7; i8 += 2) {
                                    if (amVar.c[i8] == i6) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i5 + 1;
                        }
                        arrayList.add(size, dzVar);
                        z3 = true;
                    }
                    if (z3) {
                        z4 = false;
                    } else {
                        a(dzVar, true);
                    }
                    r4 = z3;
                }
                recyclerView.l.L(dzVar);
                if (r4 && !z4 && z) {
                    m60.h(view);
                    dzVar.s = null;
                    dzVar.r = null;
                    return;
                }
                return;
            }
        }
        z = false;
        z2 = RecyclerView.G0;
        ArrayList arrayList2 = this.c;
        if (!z2) {
        }
        if (dzVar.g()) {
        }
        recyclerView.l.L(dzVar);
        if (r4) {
        }
    }

    public final void k(View view) {
        jy jyVar;
        dz M = RecyclerView.M(view);
        int i = M.j & 12;
        RecyclerView recyclerView = this.h;
        if (i == 0 && M.k() && (jyVar = recyclerView.Q) != null) {
            je jeVar = (je) jyVar;
            if (M.c().isEmpty() && jeVar.g && !M.f()) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                M.n = this;
                M.o = true;
                this.b.add(M);
                return;
            }
        }
        if (M.f() && !M.h() && !recyclerView.r.b) {
            l8.l("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.B()));
            return;
        }
        M.n = this;
        M.o = false;
        this.a.add(M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x048f, code lost:
    
        if (r10.f() == false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f1, code lost:
    
        if (r10.f != 0) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x065b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dz l(int i, long j) {
        dz dzVar;
        boolean z;
        boolean z2;
        long j2;
        long j3;
        boolean z3;
        boolean z4;
        long j4;
        AccessibilityManager accessibilityManager;
        boolean z5;
        boolean z6;
        ViewGroup.LayoutParams layoutParams;
        oy oyVar;
        int i2;
        RecyclerView G;
        dz dzVar2;
        int i3;
        View view;
        boolean z7;
        int size;
        int g;
        RecyclerView recyclerView = this.h;
        zy zyVar = recyclerView.l0;
        if (i < 0 || i >= zyVar.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + zyVar.b() + recyclerView.B());
        }
        if (zyVar.g) {
            ArrayList arrayList = this.b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        dzVar = (dz) this.b.get(i4);
                        if (!dzVar.p() && dzVar.b() == i) {
                            dzVar.a(32);
                            break;
                        }
                        i4++;
                    } else if (recyclerView.r.b && (g = recyclerView.j.g(i, 0)) > 0 && g < recyclerView.r.a()) {
                        long b = recyclerView.r.b(g);
                        for (int i5 = 0; i5 < size; i5++) {
                            dz dzVar3 = (dz) this.b.get(i5);
                            if (!dzVar3.p() && dzVar3.e == b) {
                                dzVar3.a(32);
                                dzVar = dzVar3;
                                break;
                            }
                        }
                    }
                }
                if (dzVar != null) {
                    z = true;
                    ArrayList arrayList2 = this.a;
                    ArrayList arrayList3 = this.c;
                    if (dzVar != null) {
                        int size2 = arrayList2.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            dz dzVar4 = (dz) arrayList2.get(i6);
                            if (!dzVar4.p() && dzVar4.b() == i && !dzVar4.f() && (zyVar.g || !dzVar4.h())) {
                                dzVar4.a(32);
                                dzVar = dzVar4;
                                z2 = true;
                                break;
                            }
                        }
                        ArrayList arrayList4 = recyclerView.k.c;
                        int size3 = arrayList4.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size3) {
                                z2 = true;
                                view = null;
                                break;
                            }
                            view = (View) arrayList4.get(i7);
                            dz M = RecyclerView.M(view);
                            z2 = true;
                            if (M.b() == i && !M.f() && !M.h()) {
                                break;
                            }
                            i7++;
                        }
                        if (view == null) {
                            int size4 = arrayList3.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size4) {
                                    dzVar = null;
                                    break;
                                }
                                dz dzVar5 = (dz) arrayList3.get(i8);
                                if (dzVar5.f() || dzVar5.b() != i || dzVar5.d()) {
                                    i8++;
                                } else {
                                    arrayList3.remove(i8);
                                    if (RecyclerView.H0) {
                                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + dzVar5);
                                    }
                                    dzVar = dzVar5;
                                }
                            }
                        } else {
                            dz M2 = RecyclerView.M(view);
                            v9 v9Var = recyclerView.k;
                            u9 u9Var = v9Var.b;
                            int indexOfChild = v9Var.a.f.indexOfChild(view);
                            if (indexOfChild < 0) {
                                l8.w(view, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (!u9Var.d(indexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                            }
                            u9Var.a(indexOfChild);
                            v9Var.j(view);
                            v9 v9Var2 = recyclerView.k;
                            u9 u9Var2 = v9Var2.b;
                            int indexOfChild2 = v9Var2.a.f.indexOfChild(view);
                            int b2 = (indexOfChild2 == -1 || u9Var2.d(indexOfChild2)) ? -1 : indexOfChild2 - u9Var2.b(indexOfChild2);
                            if (b2 == -1) {
                                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + M2 + recyclerView.B());
                            }
                            recyclerView.k.c(b2);
                            k(view);
                            M2.a(8224);
                            dzVar = M2;
                        }
                        if (dzVar != null) {
                            if (!dzVar.h()) {
                                int i9 = dzVar.c;
                                if (i9 < 0 || i9 >= recyclerView.r.a()) {
                                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + dzVar + recyclerView.B());
                                }
                                if (!zyVar.g) {
                                    recyclerView.r.getClass();
                                }
                                ey eyVar = recyclerView.r;
                                if (!eyVar.b || dzVar.e == eyVar.b(dzVar.c)) {
                                    z7 = z2;
                                }
                                z7 = false;
                            } else {
                                if (RecyclerView.G0 && !zyVar.g) {
                                    l8.u("should not receive a removed view unless it is pre layout".concat(recyclerView.B()));
                                    return null;
                                }
                                z7 = zyVar.g;
                            }
                            if (z7) {
                                z = z2;
                            } else {
                                dzVar.a(4);
                                if (dzVar.i()) {
                                    recyclerView.removeDetachedView(dzVar.a, false);
                                    dzVar.n.m(dzVar);
                                } else if (dzVar.p()) {
                                    dzVar.j &= -33;
                                }
                                j(dzVar);
                                dzVar = null;
                            }
                        }
                    } else {
                        z2 = true;
                    }
                    if (dzVar != null) {
                        int g2 = recyclerView.j.g(i, 0);
                        if (g2 >= 0) {
                            j2 = 3;
                            if (g2 < recyclerView.r.a()) {
                                recyclerView.r.getClass();
                                ey eyVar2 = recyclerView.r;
                                if (eyVar2.b) {
                                    long b3 = eyVar2.b(g2);
                                    int size5 = arrayList2.size() - 1;
                                    while (true) {
                                        if (size5 >= 0) {
                                            j3 = 4;
                                            dz dzVar6 = (dz) arrayList2.get(size5);
                                            i3 = g2;
                                            long j5 = dzVar6.e;
                                            View view2 = dzVar6.a;
                                            if (j5 == b3 && !dzVar6.p()) {
                                                if (dzVar6.f == 0) {
                                                    dzVar6.a(32);
                                                    if (dzVar6.h() && !zyVar.g) {
                                                        dzVar6.j = (dzVar6.j & (-15)) | 2;
                                                    }
                                                    dzVar = dzVar6;
                                                } else {
                                                    arrayList2.remove(size5);
                                                    recyclerView.removeDetachedView(view2, false);
                                                    dz M3 = RecyclerView.M(view2);
                                                    M3.n = null;
                                                    M3.o = false;
                                                    M3.j &= -33;
                                                    j(M3);
                                                }
                                            }
                                            size5--;
                                            g2 = i3;
                                        } else {
                                            i3 = g2;
                                            j3 = 4;
                                            int size6 = arrayList3.size() - 1;
                                            while (true) {
                                                if (size6 < 0) {
                                                    break;
                                                }
                                                dz dzVar7 = (dz) arrayList3.get(size6);
                                                if (dzVar7.e != b3 || dzVar7.d()) {
                                                    size6--;
                                                } else if (dzVar7.f == 0) {
                                                    arrayList3.remove(size6);
                                                    dzVar = dzVar7;
                                                } else {
                                                    h(size6);
                                                }
                                            }
                                            dzVar = null;
                                        }
                                    }
                                    if (dzVar != null) {
                                        dzVar.c = i3;
                                        z = z2;
                                    }
                                } else {
                                    j3 = 4;
                                }
                                if (dzVar == null) {
                                    if (RecyclerView.H0) {
                                        Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                                    }
                                    ry ryVar = (ry) c().a.get(0);
                                    if (ryVar != null) {
                                        ArrayList arrayList5 = ryVar.a;
                                        if (!arrayList5.isEmpty()) {
                                            for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                                if (!((dz) arrayList5.get(size7)).d()) {
                                                    dzVar2 = (dz) arrayList5.remove(size7);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    dzVar2 = null;
                                    if (dzVar2 != null) {
                                        dzVar2.m();
                                        boolean z8 = RecyclerView.G0;
                                    }
                                    dzVar = dzVar2;
                                }
                                if (dzVar == null) {
                                    long nanoTime = recyclerView.getNanoTime();
                                    if (j != Long.MAX_VALUE) {
                                        long j6 = this.g.a(0).c;
                                        if (!((j6 == 0 || j6 + nanoTime < j) ? z2 : false)) {
                                            return null;
                                        }
                                    }
                                    ey eyVar3 = recyclerView.r;
                                    eyVar3.getClass();
                                    try {
                                        if (u50.a()) {
                                            Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", 0));
                                        }
                                        dzVar = eyVar3.d(recyclerView);
                                        View view3 = dzVar.a;
                                        if (view3.getParent() != null) {
                                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                        }
                                        dzVar.f = 0;
                                        Trace.endSection();
                                        if (RecyclerView.L0 && (G = RecyclerView.G(view3)) != null) {
                                            dzVar.b = new WeakReference(G);
                                        }
                                        long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                                        ry a = this.g.a(0);
                                        long j7 = a.c;
                                        if (j7 != 0) {
                                            nanoTime2 = (nanoTime2 / j3) + ((j7 / j3) * 3);
                                        }
                                        a.c = nanoTime2;
                                        if (RecyclerView.H0) {
                                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                                        }
                                    } finally {
                                        Trace.endSection();
                                    }
                                }
                            }
                        }
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + g2 + ").state:" + zyVar.b() + recyclerView.B());
                    }
                    j2 = 3;
                    j3 = 4;
                    View view4 = dzVar.a;
                    if (z && !zyVar.g) {
                        i2 = dzVar.j;
                        if ((i2 & 8192) == 0 ? z2 : false) {
                            dzVar.j = i2 & (-8193);
                            if (zyVar.j) {
                                jy.b(dzVar);
                                jy jyVar = recyclerView.Q;
                                dzVar.c();
                                jyVar.getClass();
                                av avVar = new av();
                                avVar.a(dzVar);
                                recyclerView.Z(dzVar, avVar);
                            }
                        }
                    }
                    if (zyVar.g || !dzVar.e()) {
                        if (dzVar.e()) {
                            if (!((dzVar.j & 2) != 0 ? z2 : false)) {
                            }
                        }
                        if (!RecyclerView.G0 && dzVar.h()) {
                            throw new IllegalStateException("Removed holder should be bound and it should come here only in pre-layout. Holder: " + dzVar + recyclerView.B());
                        }
                        int g3 = recyclerView.j.g(i, 0);
                        dzVar.s = null;
                        dzVar.r = recyclerView;
                        int i10 = dzVar.f;
                        long nanoTime3 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j8 = this.g.a(i10).d;
                            if (j8 != 0 && j8 + nanoTime3 >= j) {
                                z6 = false;
                                z5 = z2;
                                layoutParams = view4.getLayoutParams();
                                if (layoutParams != null) {
                                    oyVar = (oy) recyclerView.generateDefaultLayoutParams();
                                    view4.setLayoutParams(oyVar);
                                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                                    oyVar = (oy) layoutParams;
                                } else {
                                    oyVar = (oy) recyclerView.generateLayoutParams(layoutParams);
                                    view4.setLayoutParams(oyVar);
                                }
                                oyVar.a = dzVar;
                                if (z || !z6) {
                                    z5 = false;
                                }
                                oyVar.d = z5;
                                return dzVar;
                            }
                        }
                        if (dzVar.j()) {
                            z3 = false;
                        } else {
                            recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                            z3 = z2;
                        }
                        ey eyVar4 = recyclerView.r;
                        eyVar4.getClass();
                        z4 = dzVar.s != null ? z2 : false;
                        if (z4) {
                            dzVar.c = g3;
                            if (eyVar4.b) {
                                dzVar.e = eyVar4.b(g3);
                            }
                            dzVar.j = (dzVar.j & (-520)) | 1;
                            if (u50.a()) {
                                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(dzVar.f)));
                            }
                        }
                        dzVar.s = eyVar4;
                        if (RecyclerView.G0) {
                            if (view4.getParent() == null && view4.isAttachedToWindow() != dzVar.j()) {
                                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + dzVar.j() + ", attached to window: " + view4.isAttachedToWindow() + ", holder: " + dzVar);
                            }
                            if (view4.getParent() == null && view4.isAttachedToWindow()) {
                                throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + dzVar);
                            }
                        }
                        dzVar.c();
                        eyVar4.c(dzVar, g3);
                        if (z4) {
                            ArrayList arrayList6 = dzVar.k;
                            if (arrayList6 != null) {
                                arrayList6.clear();
                            }
                            dzVar.j &= -1025;
                            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                            if (layoutParams2 instanceof oy) {
                                ((oy) layoutParams2).c = z2;
                            }
                        }
                        if (z3) {
                            recyclerView.detachViewFromParent(view4);
                        }
                        long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        ry a2 = this.g.a(dzVar.f);
                        j4 = a2.d;
                        if (j4 != 0) {
                            nanoTime4 = (nanoTime4 / j3) + ((j4 / j3) * j2);
                        }
                        a2.d = nanoTime4;
                        accessibilityManager = recyclerView.G;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            z5 = true;
                        } else {
                            z5 = true;
                            if (view4.getImportantForAccessibility() == 0) {
                                view4.setImportantForAccessibility(1);
                            }
                            fz fzVar = recyclerView.s0;
                            if (fzVar != null) {
                                ez ezVar = fzVar.e;
                                if (ezVar != null) {
                                    View.AccessibilityDelegate d = f80.d(view4);
                                    x xVar = d == null ? null : d instanceof w ? ((w) d).a : new x(d);
                                    if (xVar != null && xVar != ezVar) {
                                        ezVar.e.put(view4, xVar);
                                    }
                                }
                                f80.m(view4, ezVar);
                            }
                        }
                        if (zyVar.g) {
                            dzVar.g = i;
                        }
                        z6 = z5;
                        layoutParams = view4.getLayoutParams();
                        if (layoutParams != null) {
                        }
                        oyVar.a = dzVar;
                        if (z) {
                        }
                        z5 = false;
                        oyVar.d = z5;
                        return dzVar;
                    }
                    dzVar.g = i;
                    z5 = z2;
                    z6 = false;
                    layoutParams = view4.getLayoutParams();
                    if (layoutParams != null) {
                    }
                    oyVar.a = dzVar;
                    if (z) {
                    }
                    z5 = false;
                    oyVar.d = z5;
                    return dzVar;
                }
            }
            dzVar = null;
            if (dzVar != null) {
            }
        } else {
            dzVar = null;
        }
        z = false;
        ArrayList arrayList22 = this.a;
        ArrayList arrayList32 = this.c;
        if (dzVar != null) {
        }
        if (dzVar != null) {
        }
        View view42 = dzVar.a;
        if (z) {
            i2 = dzVar.j;
            if ((i2 & 8192) == 0 ? z2 : false) {
            }
        }
        if (zyVar.g) {
        }
        if (dzVar.e()) {
        }
        if (!RecyclerView.G0) {
        }
        int g32 = recyclerView.j.g(i, 0);
        dzVar.s = null;
        dzVar.r = recyclerView;
        int i102 = dzVar.f;
        long nanoTime32 = recyclerView.getNanoTime();
        if (j != Long.MAX_VALUE) {
        }
        if (dzVar.j()) {
        }
        ey eyVar42 = recyclerView.r;
        eyVar42.getClass();
        if (dzVar.s != null) {
        }
        if (z4) {
        }
        dzVar.s = eyVar42;
        if (RecyclerView.G0) {
        }
        dzVar.c();
        eyVar42.c(dzVar, g32);
        if (z4) {
        }
        if (z3) {
        }
        long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
        ry a22 = this.g.a(dzVar.f);
        j4 = a22.d;
        if (j4 != 0) {
        }
        a22.d = nanoTime42;
        accessibilityManager = recyclerView.G;
        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
        }
        if (zyVar.g) {
        }
        z6 = z5;
        layoutParams = view42.getLayoutParams();
        if (layoutParams != null) {
        }
        oyVar.a = dzVar;
        if (z) {
        }
        z5 = false;
        oyVar.d = z5;
        return dzVar;
    }

    public final void m(dz dzVar) {
        if (dzVar.o) {
            this.b.remove(dzVar);
        } else {
            this.a.remove(dzVar);
        }
        dzVar.n = null;
        dzVar.o = false;
        dzVar.j &= -33;
    }

    public final void n() {
        ny nyVar = this.h.s;
        this.f = this.e + (nyVar != null ? nyVar.j : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            h(size);
        }
    }
}
