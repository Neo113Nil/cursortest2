package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class cm implements Runnable {
    public static final ThreadLocal j = new ThreadLocal();
    public static final ca k = new ca(2);
    public long g;
    public long h;
    public final ArrayList f = new ArrayList();
    public final ArrayList i = new ArrayList();

    public static dz c(RecyclerView recyclerView, int i, long j2) {
        int h = recyclerView.k.h();
        for (int i2 = 0; i2 < h; i2++) {
            dz M = RecyclerView.M(recyclerView.k.g(i2));
            if (M.c == i && !M.f()) {
                return null;
            }
        }
        ty tyVar = recyclerView.h;
        if (j2 == Long.MAX_VALUE) {
            try {
                if (u50.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.U(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.T();
        dz l = tyVar.l(i, j2);
        if (l != null) {
            if (!l.e() || l.f()) {
                tyVar.a(l, false);
            } else {
                tyVar.i(l.a);
            }
        }
        recyclerView.U(false);
        Trace.endSection();
        return l;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.x) {
            if (RecyclerView.G0 && !this.f.contains(recyclerView)) {
                l8.u("attempting to post unregistered view!");
                return;
            } else if (this.g == 0) {
                this.g = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        am amVar = recyclerView.k0;
        amVar.a = i;
        amVar.b = i2;
    }

    public final void b(long j2) {
        bm bmVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        bm bmVar2;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            am amVar = recyclerView3.k0;
            if (windowVisibility == 0) {
                amVar.b(recyclerView3, false);
                i += amVar.d;
            }
        }
        ArrayList arrayList2 = this.i;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i3);
            if (recyclerView4.getWindowVisibility() == 0) {
                am amVar2 = recyclerView4.k0;
                int abs = Math.abs(amVar2.b) + Math.abs(amVar2.a);
                int i5 = z ? 1 : 0;
                while (i5 < amVar2.d * 2) {
                    if (i4 >= arrayList2.size()) {
                        bmVar2 = new bm();
                        arrayList2.add(bmVar2);
                    } else {
                        bmVar2 = (bm) arrayList2.get(i4);
                    }
                    int[] iArr = amVar2.c;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    }
                    bmVar2.a = z;
                    bmVar2.b = abs;
                    bmVar2.c = i6;
                    bmVar2.d = recyclerView4;
                    bmVar2.e = iArr[i5];
                    i4++;
                    i5 += 2;
                    z = false;
                }
            }
            i3++;
            z = false;
        }
        Collections.sort(arrayList2, k);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (bmVar = (bm) arrayList2.get(i7)).d) != null; i7++) {
            dz c = c(recyclerView, bmVar.e, bmVar.a ? Long.MAX_VALUE : j2);
            if (c != null && c.b != null && c.e() && !c.f() && (recyclerView2 = (RecyclerView) c.b.get()) != null) {
                if (recyclerView2.H && recyclerView2.k.h() != 0) {
                    ty tyVar = recyclerView2.h;
                    jy jyVar = recyclerView2.Q;
                    if (jyVar != null) {
                        jyVar.e();
                    }
                    ny nyVar = recyclerView2.s;
                    if (nyVar != null) {
                        nyVar.j0(tyVar);
                        recyclerView2.s.k0(tyVar);
                    }
                    tyVar.a.clear();
                    tyVar.g();
                }
                am amVar3 = recyclerView2.k0;
                amVar3.b(recyclerView2, true);
                if (amVar3.d != 0) {
                    try {
                        Trace.beginSection(j2 == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        zy zyVar = recyclerView2.l0;
                        ey eyVar = recyclerView2.r;
                        zyVar.d = 1;
                        zyVar.e = eyVar.a();
                        zyVar.g = false;
                        zyVar.h = false;
                        zyVar.i = false;
                        for (int i8 = 0; i8 < amVar3.d * 2; i8 += 2) {
                            c(recyclerView2, amVar3.c[i8], j2);
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            bmVar.a = false;
            bmVar.b = 0;
            bmVar.c = 0;
            bmVar.d = null;
            bmVar.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j2 = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView.getDrawingTime(), j2);
                    }
                }
                if (j2 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j2) + this.h);
                }
            }
        } finally {
            this.g = 0L;
            Trace.endSection();
        }
    }
}
