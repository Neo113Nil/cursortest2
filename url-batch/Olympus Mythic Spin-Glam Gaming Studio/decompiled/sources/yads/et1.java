package yads;

import android.os.Handler;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class et1 extends my {
    public static final wl1 r;
    public final ao[] k;
    public final g73[] l;
    public final ArrayList m;
    public final xc0 n;
    public int o;
    public long[][] p;
    public dt1 q;

    static {
        ll1 ll1Var = new ll1();
        i41 i41Var = l41.c;
        um2 um2Var = um2.f;
        Collections.emptyList();
        r = new wl1("MergingMediaSource", new nl1(ll1Var), null, new ql1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), am1.H, tl1.d);
    }

    public et1(ao... aoVarArr) {
        xc0 xc0Var = new xc0();
        this.k = aoVarArr;
        this.n = xc0Var;
        this.m = new ArrayList(Arrays.asList(aoVarArr));
        this.o = -1;
        this.l = new g73[aoVarArr.length];
        this.p = new long[0][];
        new HashMap();
        dx.a(8, "expectedKeys");
        new by1().a().a();
    }

    @Override // yads.my
    public final pm1 a(Object obj, pm1 pm1Var) {
        if (((Integer) obj).intValue() == 0) {
            return pm1Var;
        }
        return null;
    }

    @Override // yads.my
    /* renamed from: b */
    public final void a(Object obj, ao aoVar, g73 g73Var) {
        Integer num = (Integer) obj;
        if (this.q != null) {
            return;
        }
        if (this.o == -1) {
            this.o = g73Var.a();
        } else if (g73Var.a() != this.o) {
            this.q = new dt1();
            return;
        }
        if (this.p.length == 0) {
            this.p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.o, this.l.length);
        }
        this.m.remove(aoVar);
        this.l[num.intValue()] = g73Var;
        if (this.m.isEmpty()) {
            a(this.l[0]);
        }
    }

    @Override // yads.ao
    public final wl1 c() {
        ao[] aoVarArr = this.k;
        return aoVarArr.length > 0 ? aoVarArr[0].c() : r;
    }

    @Override // yads.my, yads.ao
    public final void d() {
        dt1 dt1Var = this.q;
        if (dt1Var != null) {
            throw dt1Var;
        }
        super.d();
    }

    @Override // yads.my, yads.ao
    public final void e() {
        super.e();
        Arrays.fill(this.l, (Object) null);
        this.o = -1;
        this.q = null;
        this.m.clear();
        Collections.addAll(this.m, this.k);
    }

    @Override // yads.ao
    public final void a(h93 h93Var) {
        this.j = h93Var;
        this.i = sb3.a((Handler.Callback) null);
        for (int i = 0; i < this.k.length; i++) {
            a(Integer.valueOf(i), this.k[i]);
        }
    }

    @Override // yads.ao
    public final gm1 a(pm1 pm1Var, ub0 ub0Var, long j) {
        int length = this.k.length;
        gm1[] gm1VarArr = new gm1[length];
        int a = this.l[0].a(pm1Var.a);
        for (int i = 0; i < length; i++) {
            gm1VarArr[i] = this.k[i].a(pm1Var.a(this.l[i].a(a)), ub0Var, j - this.p[a][i]);
        }
        return new ct1(this.n, this.p[a], gm1VarArr);
    }

    @Override // yads.ao
    public final void a(gm1 gm1Var) {
        ct1 ct1Var = (ct1) gm1Var;
        int i = 0;
        while (true) {
            ao[] aoVarArr = this.k;
            if (i >= aoVarArr.length) {
                return;
            }
            ao aoVar = aoVarArr[i];
            gm1 gm1Var2 = ct1Var.b[i];
            if (gm1Var2 instanceof at1) {
                gm1Var2 = ((at1) gm1Var2).b;
            }
            aoVar.a(gm1Var2);
            i++;
        }
    }
}
