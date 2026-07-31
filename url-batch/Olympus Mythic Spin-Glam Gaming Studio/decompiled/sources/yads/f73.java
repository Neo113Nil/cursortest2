package yads;

import android.net.Uri;
import android.os.Bundle;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public final class f73 implements nq {
    public static final Object s = new Object();
    public static final Object t = new Object();
    public static final wl1 u;
    public static final mq v;
    public Object b = s;
    public wl1 d = u;
    public Object e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public ql1 l;
    public boolean m;
    public long n;
    public long o;
    public int p;
    public int q;
    public long r;

    static {
        ll1 ll1Var = new ll1();
        i41 i41Var = l41.c;
        um2 um2Var = um2.f;
        List emptyList = Collections.emptyList();
        um2 um2Var2 = um2.f;
        tl1 tl1Var = tl1.d;
        Uri uri = Uri.EMPTY;
        u = new wl1("com.monetization.ads.exoplayer2.Timeline", new nl1(ll1Var), uri != null ? new rl1(uri, null, emptyList, null, um2Var2) : null, new ql1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), am1.H, tl1Var);
        v = new mq() { // from class: yads.f73$$ExternalSyntheticLambda0
            @Override // yads.mq
            public final nq a(Bundle bundle) {
                return f73.a(bundle);
            }
        };
    }

    public final f73 a(Object obj, wl1 wl1Var, Object obj2, long j, long j2, long j3, boolean z, boolean z2, ql1 ql1Var, long j4, long j5, int i, int i2, long j6) {
        this.b = obj;
        this.d = wl1Var != null ? wl1Var : u;
        this.e = obj2;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = z;
        this.j = z2;
        this.k = ql1Var != null;
        this.l = ql1Var;
        this.n = j4;
        this.o = j5;
        this.p = i;
        this.q = i2;
        this.r = j6;
        this.m = false;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !f73.class.equals(obj.getClass())) {
            return false;
        }
        f73 f73Var = (f73) obj;
        return sb3.a(this.b, f73Var.b) && sb3.a(this.d, f73Var.d) && sb3.a(this.e, f73Var.e) && sb3.a(this.l, f73Var.l) && this.f == f73Var.f && this.g == f73Var.g && this.h == f73Var.h && this.i == f73Var.i && this.j == f73Var.j && this.m == f73Var.m && this.n == f73Var.n && this.o == f73Var.o && this.p == f73Var.p && this.q == f73Var.q && this.r == f73Var.r;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.b.hashCode() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31)) * 31;
        Object obj = this.e;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        ql1 ql1Var = this.l;
        int hashCode3 = (hashCode2 + (ql1Var != null ? ql1Var.hashCode() : 0)) * 31;
        long j = this.f;
        int i = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31;
        long j4 = this.n;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.o;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.p) * 31) + this.q) * 31;
        long j6 = this.r;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final boolean a() {
        boolean z = this.k;
        ql1 ql1Var = this.l;
        if (z == (ql1Var != null)) {
            return ql1Var != null;
        }
        throw new IllegalStateException();
    }

    public static f73 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        wl1 wl1Var = bundle2 != null ? (wl1) wl1.h.a(bundle2) : null;
        long j = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
        long j2 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
        long j3 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
        boolean z = bundle.getBoolean(Integer.toString(5, 36), false);
        boolean z2 = bundle.getBoolean(Integer.toString(6, 36), false);
        Bundle bundle3 = bundle.getBundle(Integer.toString(7, 36));
        ql1 ql1Var = bundle3 != null ? (ql1) ql1.h.a(bundle3) : null;
        boolean z3 = bundle.getBoolean(Integer.toString(8, 36), false);
        long j4 = bundle.getLong(Integer.toString(9, 36), 0L);
        long j5 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
        int i = bundle.getInt(Integer.toString(11, 36), 0);
        int i2 = bundle.getInt(Integer.toString(12, 36), 0);
        long j6 = bundle.getLong(Integer.toString(13, 36), 0L);
        f73 f73Var = new f73();
        f73Var.a(t, wl1Var, null, j, j2, j3, z, z2, ql1Var, j4, j5, i, i2, j6);
        f73Var.m = z3;
        return f73Var;
    }
}
