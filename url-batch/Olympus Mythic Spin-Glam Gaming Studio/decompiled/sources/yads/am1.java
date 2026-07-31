package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class am1 implements nq {
    public static final am1 H = new am1(new zl1());
    public static final mq I = new mq() { // from class: yads.am1$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return am1.a(bundle);
        }
    };
    public final CharSequence A;
    public final Integer B;
    public final Integer C;
    public final CharSequence D;
    public final CharSequence E;
    public final CharSequence F;
    public final Bundle G;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final CharSequence h;
    public final ul2 i;
    public final ul2 j;
    public final byte[] k;
    public final Integer l;
    public final Uri m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Boolean q;
    public final Integer r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final CharSequence y;
    public final CharSequence z;

    public am1(zl1 zl1Var) {
        this.b = zl1Var.a;
        this.c = zl1Var.b;
        this.d = zl1Var.c;
        this.e = zl1Var.d;
        this.f = zl1Var.e;
        this.g = zl1Var.f;
        this.h = zl1Var.g;
        this.i = zl1Var.h;
        this.j = zl1Var.i;
        this.k = zl1Var.j;
        this.l = zl1Var.k;
        this.m = zl1Var.l;
        this.n = zl1Var.m;
        this.o = zl1Var.n;
        this.p = zl1Var.o;
        this.q = zl1Var.p;
        Integer num = zl1Var.q;
        this.r = num;
        this.s = num;
        this.t = zl1Var.r;
        this.u = zl1Var.s;
        this.v = zl1Var.t;
        this.w = zl1Var.u;
        this.x = zl1Var.v;
        this.y = zl1Var.w;
        this.z = zl1Var.x;
        this.A = zl1Var.y;
        this.B = zl1Var.z;
        this.C = zl1Var.A;
        this.D = zl1Var.B;
        this.E = zl1Var.C;
        this.F = zl1Var.D;
        this.G = zl1Var.E;
    }

    public static am1 a(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        zl1 zl1Var = new zl1();
        zl1Var.a = bundle.getCharSequence(Integer.toString(0, 36));
        zl1Var.b = bundle.getCharSequence(Integer.toString(1, 36));
        zl1Var.c = bundle.getCharSequence(Integer.toString(2, 36));
        zl1Var.d = bundle.getCharSequence(Integer.toString(3, 36));
        zl1Var.e = bundle.getCharSequence(Integer.toString(4, 36));
        zl1Var.f = bundle.getCharSequence(Integer.toString(5, 36));
        zl1Var.g = bundle.getCharSequence(Integer.toString(6, 36));
        byte[] byteArray = bundle.getByteArray(Integer.toString(10, 36));
        Integer valueOf = bundle.containsKey(Integer.toString(29, 36)) ? Integer.valueOf(bundle.getInt(Integer.toString(29, 36))) : null;
        zl1Var.j = byteArray != null ? (byte[]) byteArray.clone() : null;
        zl1Var.k = valueOf;
        zl1Var.l = (Uri) bundle.getParcelable(Integer.toString(11, 36));
        zl1Var.w = bundle.getCharSequence(Integer.toString(22, 36));
        zl1Var.x = bundle.getCharSequence(Integer.toString(23, 36));
        zl1Var.y = bundle.getCharSequence(Integer.toString(24, 36));
        zl1Var.B = bundle.getCharSequence(Integer.toString(27, 36));
        zl1Var.C = bundle.getCharSequence(Integer.toString(28, 36));
        zl1Var.D = bundle.getCharSequence(Integer.toString(30, 36));
        zl1Var.E = bundle.getBundle(Integer.toString(1000, 36));
        if (bundle.containsKey(Integer.toString(8, 36)) && (bundle3 = bundle.getBundle(Integer.toString(8, 36))) != null) {
            zl1Var.h = (ul2) ul2.b.a(bundle3);
        }
        if (bundle.containsKey(Integer.toString(9, 36)) && (bundle2 = bundle.getBundle(Integer.toString(9, 36))) != null) {
            zl1Var.i = (ul2) ul2.b.a(bundle2);
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            zl1Var.m = Integer.valueOf(bundle.getInt(Integer.toString(12, 36)));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            zl1Var.n = Integer.valueOf(bundle.getInt(Integer.toString(13, 36)));
        }
        if (bundle.containsKey(Integer.toString(14, 36))) {
            zl1Var.o = Integer.valueOf(bundle.getInt(Integer.toString(14, 36)));
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            zl1Var.p = Boolean.valueOf(bundle.getBoolean(Integer.toString(15, 36)));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            zl1Var.q = Integer.valueOf(bundle.getInt(Integer.toString(16, 36)));
        }
        if (bundle.containsKey(Integer.toString(17, 36))) {
            zl1Var.r = Integer.valueOf(bundle.getInt(Integer.toString(17, 36)));
        }
        if (bundle.containsKey(Integer.toString(18, 36))) {
            zl1Var.s = Integer.valueOf(bundle.getInt(Integer.toString(18, 36)));
        }
        if (bundle.containsKey(Integer.toString(19, 36))) {
            zl1Var.t = Integer.valueOf(bundle.getInt(Integer.toString(19, 36)));
        }
        if (bundle.containsKey(Integer.toString(20, 36))) {
            zl1Var.u = Integer.valueOf(bundle.getInt(Integer.toString(20, 36)));
        }
        if (bundle.containsKey(Integer.toString(21, 36))) {
            zl1Var.v = Integer.valueOf(bundle.getInt(Integer.toString(21, 36)));
        }
        if (bundle.containsKey(Integer.toString(25, 36))) {
            zl1Var.z = Integer.valueOf(bundle.getInt(Integer.toString(25, 36)));
        }
        if (bundle.containsKey(Integer.toString(26, 36))) {
            zl1Var.A = Integer.valueOf(bundle.getInt(Integer.toString(26, 36)));
        }
        return new am1(zl1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || am1.class != obj.getClass()) {
            return false;
        }
        am1 am1Var = (am1) obj;
        return sb3.a(this.b, am1Var.b) && sb3.a(this.c, am1Var.c) && sb3.a(this.d, am1Var.d) && sb3.a(this.e, am1Var.e) && sb3.a(this.f, am1Var.f) && sb3.a(this.g, am1Var.g) && sb3.a(this.h, am1Var.h) && sb3.a(this.i, am1Var.i) && sb3.a(this.j, am1Var.j) && Arrays.equals(this.k, am1Var.k) && sb3.a(this.l, am1Var.l) && sb3.a(this.m, am1Var.m) && sb3.a(this.n, am1Var.n) && sb3.a(this.o, am1Var.o) && sb3.a(this.p, am1Var.p) && sb3.a(this.q, am1Var.q) && sb3.a(this.s, am1Var.s) && sb3.a(this.t, am1Var.t) && sb3.a(this.u, am1Var.u) && sb3.a(this.v, am1Var.v) && sb3.a(this.w, am1Var.w) && sb3.a(this.x, am1Var.x) && sb3.a(this.y, am1Var.y) && sb3.a(this.z, am1Var.z) && sb3.a(this.A, am1Var.A) && sb3.a(this.B, am1Var.B) && sb3.a(this.C, am1Var.C) && sb3.a(this.D, am1Var.D) && sb3.a(this.E, am1Var.E) && sb3.a(this.F, am1Var.F);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.k)), this.l, this.m, this.n, this.o, this.p, this.q, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F});
    }
}
