package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes14.dex */
public final class jw0 implements nq {
    public static final jw0 H = new jw0(new iw0());
    public static final mq I = new mq() { // from class: yads.jw0$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return jw0.a(bundle);
        }
    };
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public int G;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final ht1 k;
    public final String l;
    public final String m;
    public final int n;
    public final List o;
    public final vk0 p;
    public final long q;
    public final int r;
    public final int s;
    public final float t;
    public final int u;
    public final float v;
    public final byte[] w;
    public final int x;
    public final fx y;
    public final int z;

    public jw0(iw0 iw0Var) {
        this.b = iw0Var.a;
        this.c = iw0Var.b;
        this.d = sb3.e(iw0Var.c);
        this.e = iw0Var.d;
        this.f = iw0Var.e;
        int i = iw0Var.f;
        this.g = i;
        int i2 = iw0Var.g;
        this.h = i2;
        this.i = i2 != -1 ? i2 : i;
        this.j = iw0Var.h;
        this.k = iw0Var.i;
        this.l = iw0Var.j;
        this.m = iw0Var.k;
        this.n = iw0Var.l;
        List list = iw0Var.m;
        this.o = list == null ? Collections.emptyList() : list;
        vk0 vk0Var = iw0Var.n;
        this.p = vk0Var;
        this.q = iw0Var.o;
        this.r = iw0Var.p;
        this.s = iw0Var.q;
        this.t = iw0Var.r;
        int i3 = iw0Var.s;
        this.u = i3 == -1 ? 0 : i3;
        float f = iw0Var.t;
        this.v = f == -1.0f ? 1.0f : f;
        this.w = iw0Var.u;
        this.x = iw0Var.v;
        this.y = iw0Var.w;
        this.z = iw0Var.x;
        this.A = iw0Var.y;
        this.B = iw0Var.z;
        int i4 = iw0Var.A;
        this.C = i4 == -1 ? 0 : i4;
        int i5 = iw0Var.B;
        this.D = i5 != -1 ? i5 : 0;
        this.E = iw0Var.C;
        int i6 = iw0Var.D;
        if (i6 != 0 || vk0Var == null) {
            this.F = i6;
        } else {
            this.F = 1;
        }
    }

    public final int a() {
        int i;
        int i2 = this.r;
        if (i2 == -1 || (i = this.s) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || jw0.class != obj.getClass()) {
            return false;
        }
        jw0 jw0Var = (jw0) obj;
        int i2 = this.G;
        if (i2 == 0 || (i = jw0Var.G) == 0 || i2 == i) {
            return this.e == jw0Var.e && this.f == jw0Var.f && this.g == jw0Var.g && this.h == jw0Var.h && this.n == jw0Var.n && this.q == jw0Var.q && this.r == jw0Var.r && this.s == jw0Var.s && this.u == jw0Var.u && this.x == jw0Var.x && this.z == jw0Var.z && this.A == jw0Var.A && this.B == jw0Var.B && this.C == jw0Var.C && this.D == jw0Var.D && this.E == jw0Var.E && this.F == jw0Var.F && Float.compare(this.t, jw0Var.t) == 0 && Float.compare(this.v, jw0Var.v) == 0 && sb3.a(this.b, jw0Var.b) && sb3.a(this.c, jw0Var.c) && sb3.a(this.j, jw0Var.j) && sb3.a(this.l, jw0Var.l) && sb3.a(this.m, jw0Var.m) && sb3.a(this.d, jw0Var.d) && Arrays.equals(this.w, jw0Var.w) && sb3.a(this.k, jw0Var.k) && sb3.a(this.y, jw0Var.y) && sb3.a(this.p, jw0Var.p) && a(jw0Var);
        }
        return false;
    }

    public final int hashCode() {
        if (this.G == 0) {
            String str = this.b;
            int hashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.d;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31;
            String str4 = this.j;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ht1 ht1Var = this.k;
            int hashCode5 = (hashCode4 + (ht1Var == null ? 0 : Arrays.hashCode(ht1Var.b))) * 31;
            String str5 = this.l;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.m;
            this.G = ((((((((((((((((Float.floatToIntBits(this.v) + ((((Float.floatToIntBits(this.t) + ((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.n) * 31) + ((int) this.q)) * 31) + this.r) * 31) + this.s) * 31)) * 31) + this.u) * 31)) * 31) + this.x) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F;
        }
        return this.G;
    }

    public final String toString() {
        return "Format(" + this.b + ", " + this.c + ", " + this.l + ", " + this.m + ", " + this.j + ", " + this.i + ", " + this.d + ", [" + this.r + ", " + this.s + ", " + this.t + "], [" + this.z + ", " + this.A + "])";
    }

    public final boolean a(jw0 jw0Var) {
        if (this.o.size() != jw0Var.o.size()) {
            return false;
        }
        for (int i = 0; i < this.o.size(); i++) {
            if (!Arrays.equals((byte[]) this.o.get(i), (byte[]) jw0Var.o.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static jw0 a(Bundle bundle) {
        iw0 iw0Var = new iw0();
        if (bundle != null) {
            ClassLoader classLoader = oq.class.getClassLoader();
            int i = sb3.a;
            bundle.setClassLoader(classLoader);
        }
        int i2 = 0;
        String string = bundle.getString(Integer.toString(0, 36));
        jw0 jw0Var = H;
        String str = jw0Var.b;
        if (string == null) {
            string = str;
        }
        iw0Var.a = string;
        String string2 = bundle.getString(Integer.toString(1, 36));
        String str2 = jw0Var.c;
        if (string2 == null) {
            string2 = str2;
        }
        iw0Var.b = string2;
        String string3 = bundle.getString(Integer.toString(2, 36));
        String str3 = jw0Var.d;
        if (string3 == null) {
            string3 = str3;
        }
        iw0Var.c = string3;
        iw0Var.d = bundle.getInt(Integer.toString(3, 36), jw0Var.e);
        iw0Var.e = bundle.getInt(Integer.toString(4, 36), jw0Var.f);
        iw0Var.f = bundle.getInt(Integer.toString(5, 36), jw0Var.g);
        iw0Var.g = bundle.getInt(Integer.toString(6, 36), jw0Var.h);
        String string4 = bundle.getString(Integer.toString(7, 36));
        String str4 = jw0Var.j;
        if (string4 == null) {
            string4 = str4;
        }
        iw0Var.h = string4;
        ht1 ht1Var = (ht1) bundle.getParcelable(Integer.toString(8, 36));
        ht1 ht1Var2 = jw0Var.k;
        if (ht1Var == null) {
            ht1Var = ht1Var2;
        }
        iw0Var.i = ht1Var;
        String string5 = bundle.getString(Integer.toString(9, 36));
        String str5 = jw0Var.l;
        if (string5 == null) {
            string5 = str5;
        }
        iw0Var.j = string5;
        String string6 = bundle.getString(Integer.toString(10, 36));
        String str6 = jw0Var.m;
        if (string6 == null) {
            string6 = str6;
        }
        iw0Var.k = string6;
        iw0Var.l = bundle.getInt(Integer.toString(11, 36), jw0Var.n);
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(Integer.toString(12, 36) + "_" + Integer.toString(i2, 36));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i2++;
        }
        iw0Var.m = arrayList;
        iw0Var.n = (vk0) bundle.getParcelable(Integer.toString(13, 36));
        String num = Integer.toString(14, 36);
        jw0 jw0Var2 = H;
        iw0Var.o = bundle.getLong(num, jw0Var2.q);
        iw0Var.p = bundle.getInt(Integer.toString(15, 36), jw0Var2.r);
        iw0Var.q = bundle.getInt(Integer.toString(16, 36), jw0Var2.s);
        iw0Var.r = bundle.getFloat(Integer.toString(17, 36), jw0Var2.t);
        iw0Var.s = bundle.getInt(Integer.toString(18, 36), jw0Var2.u);
        iw0Var.t = bundle.getFloat(Integer.toString(19, 36), jw0Var2.v);
        iw0Var.u = bundle.getByteArray(Integer.toString(20, 36));
        iw0Var.v = bundle.getInt(Integer.toString(21, 36), jw0Var2.x);
        Bundle bundle2 = bundle.getBundle(Integer.toString(22, 36));
        if (bundle2 != null) {
            iw0Var.w = (fx) fx.g.a(bundle2);
        }
        iw0Var.x = bundle.getInt(Integer.toString(23, 36), jw0Var2.z);
        iw0Var.y = bundle.getInt(Integer.toString(24, 36), jw0Var2.A);
        iw0Var.z = bundle.getInt(Integer.toString(25, 36), jw0Var2.B);
        iw0Var.A = bundle.getInt(Integer.toString(26, 36), jw0Var2.C);
        iw0Var.B = bundle.getInt(Integer.toString(27, 36), jw0Var2.D);
        iw0Var.C = bundle.getInt(Integer.toString(28, 36), jw0Var2.E);
        iw0Var.D = bundle.getInt(Integer.toString(29, 36), jw0Var2.F);
        return new jw0(iw0Var);
    }
}
