package f0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: f0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0111o implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2141e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final D0.o f2142f = new D0.o(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2143a;

    /* renamed from: b, reason: collision with root package name */
    public long f2144b;

    /* renamed from: c, reason: collision with root package name */
    public long f2145c;
    public ArrayList d;

    public static X c(RecyclerView recyclerView, int i, long j2) {
        int m2 = recyclerView.f1442e.m();
        for (int i2 = 0; i2 < m2; i2++) {
            X I2 = RecyclerView.I(recyclerView.f1442e.l(i2));
            if (I2.f2016c == i && !I2.g()) {
                return null;
            }
        }
        O o2 = recyclerView.f1437b;
        try {
            recyclerView.P();
            X i3 = o2.i(i, j2);
            if (i3 != null) {
                if (!i3.f() || i3.g()) {
                    o2.a(i3, false);
                } else {
                    o2.f(i3.f2014a);
                }
            }
            recyclerView.Q(false);
            return i3;
        } catch (Throwable th) {
            recyclerView.Q(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f1461p && this.f2144b == 0) {
            this.f2144b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0109m c0109m = recyclerView.f1438b0;
        c0109m.f2134a = i;
        c0109m.f2135b = i2;
    }

    public final void b(long j2) {
        C0110n c0110n;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0110n c0110n2;
        ArrayList arrayList = this.f2143a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0109m c0109m = recyclerView3.f1438b0;
                c0109m.b(recyclerView3, false);
                i += c0109m.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0109m c0109m2 = recyclerView4.f1438b0;
                int abs = Math.abs(c0109m2.f2135b) + Math.abs(c0109m2.f2134a);
                for (int i5 = 0; i5 < c0109m2.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0110n2 = new C0110n();
                        arrayList2.add(c0110n2);
                    } else {
                        c0110n2 = (C0110n) arrayList2.get(i3);
                    }
                    int[] iArr = c0109m2.f2136c;
                    int i6 = iArr[i5 + 1];
                    c0110n2.f2137a = i6 <= abs;
                    c0110n2.f2138b = abs;
                    c0110n2.f2139c = i6;
                    c0110n2.d = recyclerView4;
                    c0110n2.f2140e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f2142f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0110n = (C0110n) arrayList2.get(i7)).d) != null; i7++) {
            X c2 = c(recyclerView, c0110n.f2140e, c0110n.f2137a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f2015b != null && c2.f() && !c2.g() && (recyclerView2 = (RecyclerView) c2.f2015b.get()) != null) {
                if (recyclerView2.f1473y && recyclerView2.f1442e.m() != 0) {
                    E e2 = recyclerView2.f1419H;
                    if (e2 != null) {
                        e2.e();
                    }
                    I i8 = recyclerView2.f1453l;
                    O o2 = recyclerView2.f1437b;
                    if (i8 != null) {
                        i8.g0(o2);
                        recyclerView2.f1453l.h0(o2);
                    }
                    o2.f1983a.clear();
                    o2.d();
                }
                C0109m c0109m3 = recyclerView2.f1438b0;
                c0109m3.b(recyclerView2, true);
                if (c0109m3.d != 0) {
                    try {
                        int i9 = G.h.f179a;
                        Trace.beginSection("RV Nested Prefetch");
                        U u2 = recyclerView2.f1440c0;
                        AbstractC0096A abstractC0096A = recyclerView2.f1451k;
                        u2.d = 1;
                        u2.f1999e = abstractC0096A.a();
                        u2.f2001g = false;
                        u2.h = false;
                        u2.i = false;
                        for (int i10 = 0; i10 < c0109m3.d * 2; i10 += 2) {
                            c(recyclerView2, c0109m3.f2136c[i10], j2);
                        }
                        Trace.endSection();
                        c0110n.f2137a = false;
                        c0110n.f2138b = 0;
                        c0110n.f2139c = 0;
                        c0110n.d = null;
                        c0110n.f2140e = 0;
                    } catch (Throwable th) {
                        int i11 = G.h.f179a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0110n.f2137a = false;
            c0110n.f2138b = 0;
            c0110n.f2139c = 0;
            c0110n.d = null;
            c0110n.f2140e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G.h.f179a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f2143a;
            if (arrayList.isEmpty()) {
                this.f2144b = 0L;
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
                this.f2144b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2145c);
                this.f2144b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f2144b = 0L;
            int i3 = G.h.f179a;
            Trace.endSection();
            throw th;
        }
    }
}
