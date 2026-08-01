package defpackage;

import android.util.Log;
import java.util.Locale;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class b2 implements qj, hb, sx, bd0, ug0, bt, ig0, ew0, x7 {
    public final /* synthetic */ int d;
    public static final o9 e = new o9(-1.0f, -1.0f);
    public static final o9 f = new o9(0.0f, -1.0f);
    public static final o9 g = new o9(1.0f, -1.0f);
    public static final o9 h = new o9(-1.0f, 0.0f);
    public static final o9 i = new o9(0.0f, 0.0f);
    public static final o9 j = new o9(1.0f, 0.0f);
    public static final o9 k = new o9(-1.0f, 1.0f);
    public static final o9 l = new o9(0.0f, 1.0f);
    public static final o9 m = new o9(1.0f, 1.0f);
    public static final n9 n = new n9(-1.0f);
    public static final n9 o = new n9(0.0f);
    public static final m9 p = new m9(-1.0f);
    public static final m9 q = new m9(0.0f);
    public static final b2 r = new b2(1);
    public static final f4 s = new f4();
    public static final /* synthetic */ b2 t = new b2(3);
    public static final /* synthetic */ b2 u = new b2(4);
    public static final b2 v = new b2(5);
    public static final b2 w = new b2(6);
    public static final c10 x = c10.d;
    public static final tl y = new tl(1.0f, 1.0f);
    public static final b2 z = new b2(7);
    public static final /* synthetic */ b2 A = new b2(8);
    public static final /* synthetic */ b2 B = new b2(9);
    public static final /* synthetic */ b2 C = new b2(10);
    public static final /* synthetic */ b2 D = new b2(11);
    public static final /* synthetic */ b2 E = new b2(12);
    public static final b2 F = new b2(13);
    public static final b2 G = new b2(14);
    public static final b2 H = new b2(15);
    public static final b2 I = new b2(16);
    public static final /* synthetic */ b2 J = new b2(17);
    public static final b2 K = new b2(18);
    public static final b2 L = new b2(19);
    public static final b2 M = new b2(20);
    public static final b2 N = new b2(21);
    public static final n21 O = new n21();

    public b2(f3 f3Var) {
        this.d = 24;
        tg0.a.getClass();
    }

    @Override // defpackage.hb
    public sl a() {
        return y;
    }

    @Override // defpackage.w7, defpackage.a8
    public float b() {
        return 0.0f;
    }

    @Override // defpackage.hb
    public long c() {
        return 9205357640488583168L;
    }

    @Override // defpackage.w7
    public void d(f40 f40Var, int i2, int[] iArr, c10 c10Var, int[] iArr2) {
        if (c10Var == c10.d) {
            nz.O(i2, iArr, iArr2, false);
        } else {
            nz.O(i2, iArr, iArr2, true);
        }
    }

    @Override // defpackage.sx
    public void e(r10 r10Var) {
        r10Var.b();
    }

    @Override // defpackage.bd0
    public boolean f() {
        return false;
    }

    @Override // defpackage.ig0
    public t30 g() {
        return new t30(px0.H(new s30(Locale.getDefault())));
    }

    @Override // defpackage.hb
    public c10 getLayoutDirection() {
        return x;
    }

    @Override // defpackage.bd0
    public long h(long j2, int i2, f2 f2Var) {
        f2Var.getClass();
        zo0 zo0Var = (zo0) f2Var.f;
        return new ra0(zo0.a(zo0Var, zo0Var.h, j2, zo0Var.g)).a;
    }

    @Override // defpackage.bd0
    public u50 i() {
        return r50.a;
    }

    @Override // defpackage.bd0
    public Object j(long j2, yo0 yo0Var, kj kjVar) {
        yo0 yo0Var2 = new yo0(yo0Var.g, kjVar);
        yo0Var2.f = j2;
        ky0 ky0Var = ky0.a;
        Object invokeSuspend = yo0Var2.invokeSuspend(ky0Var);
        return invokeSuspend == ck.d ? invokeSuspend : ky0Var;
    }

    @Override // defpackage.a8
    public void k(int i2, f40 f40Var, int[] iArr, int[] iArr2) {
        nz.O(i2, iArr, iArr2, false);
    }

    public boolean l(Object obj, Object obj2) {
        switch (this.d) {
            case 14:
                return false;
            case 18:
                return obj == obj2;
            default:
                return nz.l(obj, obj2);
        }
    }

    @Override // defpackage.ig0
    public Locale m(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (nz.l(forLanguageTag.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtags delimiter and must be replaced with '-'.");
        }
        return forLanguageTag;
    }

    public String toString() {
        switch (this.d) {
            case 14:
                return "NeverEqualPolicy";
            case 18:
                return "ReferentialEqualityPolicy";
            case 20:
                return "StructuralEqualityPolicy";
            case 29:
                return "Arrangement#Center";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b2(int i2) {
        this.d = i2;
    }
}
