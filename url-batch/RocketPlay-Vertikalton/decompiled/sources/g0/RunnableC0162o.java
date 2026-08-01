package g0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: g0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0162o implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2959e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final G0.n f2960f = new G0.n(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2961a;

    /* renamed from: b, reason: collision with root package name */
    public long f2962b;

    /* renamed from: c, reason: collision with root package name */
    public long f2963c;
    public ArrayList d;

    public static Z c(RecyclerView recyclerView, int i, long j2) {
        int h = recyclerView.f1988f.h();
        for (int i2 = 0; i2 < h; i2++) {
            Z L2 = RecyclerView.L(recyclerView.f1988f.g(i2));
            if (L2.f2832c == i && !L2.g()) {
                return null;
            }
        }
        C0145O c0145o = recyclerView.f1983c;
        try {
            recyclerView.S();
            Z k2 = c0145o.k(i, j2);
            if (k2 != null) {
                if (!k2.f() || k2.g()) {
                    c0145o.a(k2, false);
                } else {
                    c0145o.h(k2.f2830a);
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
        if (recyclerView.f2009r) {
            if (RecyclerView.f1954x0 && !this.f2961a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f2962b == 0) {
                this.f2962b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C0160m c0160m = recyclerView.f1985d0;
        c0160m.f2952a = i;
        c0160m.f2953b = i2;
    }

    public final void b(long j2) {
        C0161n c0161n;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0161n c0161n2;
        ArrayList arrayList = this.f2961a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0160m c0160m = recyclerView3.f1985d0;
                c0160m.b(recyclerView3, false);
                i += c0160m.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0160m c0160m2 = recyclerView4.f1985d0;
                int abs = Math.abs(c0160m2.f2953b) + Math.abs(c0160m2.f2952a);
                for (int i5 = 0; i5 < c0160m2.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0161n2 = new C0161n();
                        arrayList2.add(c0161n2);
                    } else {
                        c0161n2 = (C0161n) arrayList2.get(i3);
                    }
                    int[] iArr = c0160m2.f2954c;
                    int i6 = iArr[i5 + 1];
                    c0161n2.f2955a = i6 <= abs;
                    c0161n2.f2956b = abs;
                    c0161n2.f2957c = i6;
                    c0161n2.d = recyclerView4;
                    c0161n2.f2958e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f2960f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0161n = (C0161n) arrayList2.get(i7)).d) != null; i7++) {
            Z c2 = c(recyclerView, c0161n.f2958e, c0161n.f2955a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f2831b != null && c2.f() && !c2.g() && (recyclerView2 = (RecyclerView) c2.f2831b.get()) != null) {
                if (recyclerView2.f1957A && recyclerView2.f1988f.h() != 0) {
                    AbstractC0135E abstractC0135E = recyclerView2.f1965J;
                    if (abstractC0135E != null) {
                        abstractC0135E.e();
                    }
                    AbstractC0139I abstractC0139I = recyclerView2.f2000m;
                    C0145O c0145o = recyclerView2.f1983c;
                    if (abstractC0139I != null) {
                        abstractC0139I.i0(c0145o);
                        recyclerView2.f2000m.j0(c0145o);
                    }
                    c0145o.f2798a.clear();
                    c0145o.f();
                }
                C0160m c0160m3 = recyclerView2.f1985d0;
                c0160m3.b(recyclerView2, true);
                if (c0160m3.d != 0) {
                    try {
                        int i8 = G.h.f433a;
                        Trace.beginSection("RV Nested Prefetch");
                        V v2 = recyclerView2.f1987e0;
                        AbstractC0131A abstractC0131A = recyclerView2.f1998l;
                        v2.d = 1;
                        v2.f2815e = abstractC0131A.a();
                        v2.f2817g = false;
                        v2.h = false;
                        v2.i = false;
                        for (int i9 = 0; i9 < c0160m3.d * 2; i9 += 2) {
                            c(recyclerView2, c0160m3.f2954c[i9], j2);
                        }
                        Trace.endSection();
                        c0161n.f2955a = false;
                        c0161n.f2956b = 0;
                        c0161n.f2957c = 0;
                        c0161n.d = null;
                        c0161n.f2958e = 0;
                    } catch (Throwable th) {
                        int i10 = G.h.f433a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0161n.f2955a = false;
            c0161n.f2956b = 0;
            c0161n.f2957c = 0;
            c0161n.d = null;
            c0161n.f2958e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G.h.f433a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f2961a;
            if (arrayList.isEmpty()) {
                this.f2962b = 0L;
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
                this.f2962b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2963c);
                this.f2962b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f2962b = 0L;
            int i3 = G.h.f433a;
            Trace.endSection();
            throw th;
        }
    }
}
