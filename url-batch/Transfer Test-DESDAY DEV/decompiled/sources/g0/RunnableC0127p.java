package g0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: g0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0127p implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2523e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final I0.l f2524f = new I0.l(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2525a;

    /* renamed from: b, reason: collision with root package name */
    public long f2526b;

    /* renamed from: c, reason: collision with root package name */
    public long f2527c;
    public ArrayList d;

    public static Z c(RecyclerView recyclerView, int i, long j2) {
        int h = recyclerView.f1609f.h();
        for (int i2 = 0; i2 < h; i2++) {
            Z L2 = RecyclerView.L(recyclerView.f1609f.g(i2));
            if (L2.f2394c == i && !L2.g()) {
                return null;
            }
        }
        O o2 = recyclerView.f1604c;
        try {
            recyclerView.S();
            Z k2 = o2.k(i, j2);
            if (k2 != null) {
                if (!k2.f() || k2.g()) {
                    o2.a(k2, false);
                } else {
                    o2.h(k2.f2392a);
                }
            }
            recyclerView.T(false);
            return k2;
        } catch (Throwable th) {
            recyclerView.T(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f1630r) {
            if (RecyclerView.f1575x0 && !this.f2525a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f2526b == 0) {
                this.f2526b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C0125n c0125n = recyclerView.f1606d0;
        c0125n.f2516a = i;
        c0125n.f2517b = i2;
    }

    public final void b(long j2) {
        C0126o c0126o;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0126o c0126o2;
        ArrayList arrayList = this.f2525a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0125n c0125n = recyclerView3.f1606d0;
                c0125n.b(recyclerView3, false);
                i += c0125n.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0125n c0125n2 = recyclerView4.f1606d0;
                int abs = Math.abs(c0125n2.f2517b) + Math.abs(c0125n2.f2516a);
                for (int i5 = 0; i5 < c0125n2.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0126o2 = new C0126o();
                        arrayList2.add(c0126o2);
                    } else {
                        c0126o2 = (C0126o) arrayList2.get(i3);
                    }
                    int[] iArr = c0125n2.f2518c;
                    int i6 = iArr[i5 + 1];
                    c0126o2.f2519a = i6 <= abs;
                    c0126o2.f2520b = abs;
                    c0126o2.f2521c = i6;
                    c0126o2.d = recyclerView4;
                    c0126o2.f2522e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f2524f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0126o = (C0126o) arrayList2.get(i7)).d) != null; i7++) {
            Z c2 = c(recyclerView, c0126o.f2522e, c0126o.f2519a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f2393b != null && c2.f() && !c2.g() && (recyclerView2 = (RecyclerView) c2.f2393b.get()) != null) {
                if (recyclerView2.f1578A && recyclerView2.f1609f.h() != 0) {
                    E e2 = recyclerView2.f1586J;
                    if (e2 != null) {
                        e2.e();
                    }
                    I i8 = recyclerView2.f1621m;
                    O o2 = recyclerView2.f1604c;
                    if (i8 != null) {
                        i8.i0(o2);
                        recyclerView2.f1621m.j0(o2);
                    }
                    o2.f2360a.clear();
                    o2.f();
                }
                C0125n c0125n3 = recyclerView2.f1606d0;
                c0125n3.b(recyclerView2, true);
                if (c0125n3.d != 0) {
                    try {
                        int i9 = G.h.f211a;
                        Trace.beginSection("RV Nested Prefetch");
                        V v2 = recyclerView2.f1608e0;
                        AbstractC0109A abstractC0109A = recyclerView2.f1619l;
                        v2.d = 1;
                        v2.f2377e = abstractC0109A.a();
                        v2.f2379g = false;
                        v2.h = false;
                        v2.i = false;
                        for (int i10 = 0; i10 < c0125n3.d * 2; i10 += 2) {
                            c(recyclerView2, c0125n3.f2518c[i10], j2);
                        }
                        Trace.endSection();
                        c0126o.f2519a = false;
                        c0126o.f2520b = 0;
                        c0126o.f2521c = 0;
                        c0126o.d = null;
                        c0126o.f2522e = 0;
                    } catch (Throwable th) {
                        int i11 = G.h.f211a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0126o.f2519a = false;
            c0126o.f2520b = 0;
            c0126o.f2521c = 0;
            c0126o.d = null;
            c0126o.f2522e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G.h.f211a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f2525a;
            if (arrayList.isEmpty()) {
                this.f2526b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j2 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f2526b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2527c);
                this.f2526b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f2526b = 0L;
            int i3 = G.h.f211a;
            Trace.endSection();
            throw th;
        }
    }
}
