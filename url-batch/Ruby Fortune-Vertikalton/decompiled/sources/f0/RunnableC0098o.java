package f0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: f0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0098o implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f2133e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final B0.p f2134f = new B0.p(1);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f2135a;

    /* renamed from: b, reason: collision with root package name */
    public long f2136b;

    /* renamed from: c, reason: collision with root package name */
    public long f2137c;
    public ArrayList d;

    public static X c(RecyclerView recyclerView, int i, long j2) {
        int m2 = recyclerView.f1437e.m();
        for (int i2 = 0; i2 < m2; i2++) {
            X I2 = RecyclerView.I(recyclerView.f1437e.l(i2));
            if (I2.f2008c == i && !I2.g()) {
                return null;
            }
        }
        O o2 = recyclerView.f1432b;
        try {
            recyclerView.P();
            X i3 = o2.i(i, j2);
            if (i3 != null) {
                if (!i3.f() || i3.g()) {
                    o2.a(i3, false);
                } else {
                    o2.f(i3.f2006a);
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
        if (recyclerView.f1456p && this.f2136b == 0) {
            this.f2136b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0096m c0096m = recyclerView.f1433b0;
        c0096m.f2126a = i;
        c0096m.f2127b = i2;
    }

    public final void b(long j2) {
        C0097n c0097n;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0097n c0097n2;
        ArrayList arrayList = this.f2135a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0096m c0096m = recyclerView3.f1433b0;
                c0096m.b(recyclerView3, false);
                i += c0096m.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0096m c0096m2 = recyclerView4.f1433b0;
                int abs = Math.abs(c0096m2.f2127b) + Math.abs(c0096m2.f2126a);
                for (int i5 = 0; i5 < c0096m2.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0097n2 = new C0097n();
                        arrayList2.add(c0097n2);
                    } else {
                        c0097n2 = (C0097n) arrayList2.get(i3);
                    }
                    int[] iArr = c0096m2.f2128c;
                    int i6 = iArr[i5 + 1];
                    c0097n2.f2129a = i6 <= abs;
                    c0097n2.f2130b = abs;
                    c0097n2.f2131c = i6;
                    c0097n2.d = recyclerView4;
                    c0097n2.f2132e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f2134f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0097n = (C0097n) arrayList2.get(i7)).d) != null; i7++) {
            X c2 = c(recyclerView, c0097n.f2132e, c0097n.f2129a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f2007b != null && c2.f() && !c2.g() && (recyclerView2 = (RecyclerView) c2.f2007b.get()) != null) {
                if (recyclerView2.f1468y && recyclerView2.f1437e.m() != 0) {
                    E e2 = recyclerView2.f1414H;
                    if (e2 != null) {
                        e2.e();
                    }
                    I i8 = recyclerView2.f1448l;
                    O o2 = recyclerView2.f1432b;
                    if (i8 != null) {
                        i8.g0(o2);
                        recyclerView2.f1448l.h0(o2);
                    }
                    o2.f1975a.clear();
                    o2.d();
                }
                C0096m c0096m3 = recyclerView2.f1433b0;
                c0096m3.b(recyclerView2, true);
                if (c0096m3.d != 0) {
                    try {
                        int i9 = G.h.f194a;
                        Trace.beginSection("RV Nested Prefetch");
                        U u2 = recyclerView2.f1435c0;
                        AbstractC0083A abstractC0083A = recyclerView2.f1446k;
                        u2.d = 1;
                        u2.f1991e = abstractC0083A.a();
                        u2.f1993g = false;
                        u2.h = false;
                        u2.i = false;
                        for (int i10 = 0; i10 < c0096m3.d * 2; i10 += 2) {
                            c(recyclerView2, c0096m3.f2128c[i10], j2);
                        }
                        Trace.endSection();
                        c0097n.f2129a = false;
                        c0097n.f2130b = 0;
                        c0097n.f2131c = 0;
                        c0097n.d = null;
                        c0097n.f2132e = 0;
                    } catch (Throwable th) {
                        int i11 = G.h.f194a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0097n.f2129a = false;
            c0097n.f2130b = 0;
            c0097n.f2131c = 0;
            c0097n.d = null;
            c0097n.f2132e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = G.h.f194a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f2135a;
            if (arrayList.isEmpty()) {
                this.f2136b = 0L;
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
                this.f2136b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2137c);
                this.f2136b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f2136b = 0L;
            int i3 = G.h.f194a;
            Trace.endSection();
            throw th;
        }
    }
}
