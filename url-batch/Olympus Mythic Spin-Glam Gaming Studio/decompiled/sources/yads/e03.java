package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class e03 extends g73 {
    public static final Object h = new Object();
    public final long c;
    public final long d;
    public final boolean e;
    public final wl1 f;
    public final ql1 g;

    static {
        i41 i41Var = l41.c;
        um2 um2Var = um2.f;
        List emptyList = Collections.emptyList();
        um2 um2Var2 = um2.f;
        tl1 tl1Var = tl1.d;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new rl1(uri, null, emptyList, null, um2Var2);
        }
        am1 am1Var = am1.H;
    }

    public e03(long j, boolean z, boolean z2, wl1 wl1Var) {
        ql1 ql1Var = z2 ? wl1Var.d : null;
        this.c = j;
        this.d = j;
        this.e = z;
        wl1Var.getClass();
        this.f = wl1Var;
        this.g = ql1Var;
    }

    @Override // yads.g73
    public final int a() {
        return 1;
    }

    @Override // yads.g73
    public final f73 a(int i, f73 f73Var, long j) {
        oh.a(i, 1);
        return f73Var.a(f73.s, this.f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.e, false, this.g, 0L, this.d, 0, 0, 0L);
    }

    @Override // yads.g73
    public final int b() {
        return 1;
    }

    @Override // yads.g73
    public final d73 a(int i, d73 d73Var, boolean z) {
        oh.a(i, 1);
        Object obj = z ? h : null;
        long j = this.c;
        d73Var.getClass();
        return d73Var.a(null, obj, 0, j, 0L, p5.g, false);
    }

    @Override // yads.g73
    public final int a(Object obj) {
        return h.equals(obj) ? 0 : -1;
    }

    @Override // yads.g73
    public final Object a(int i) {
        oh.a(i, 1);
        return h;
    }
}
