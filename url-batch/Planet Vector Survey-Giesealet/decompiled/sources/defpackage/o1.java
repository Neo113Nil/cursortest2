package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class o1 extends v00 implements mu {
    public static final o1 A;
    public static final o1 B;
    public static final o1 C;
    public static final o1 D;
    public static final o1 E;
    public static final o1 F;
    public static final o1 G;
    public static final o1 H;
    public static final o1 I;
    public static final o1 f;
    public static final o1 g;
    public static final o1 h;
    public static final o1 i;
    public static final o1 j;
    public static final o1 k;
    public static final o1 l;
    public static final o1 m;
    public static final o1 n;
    public static final o1 o;
    public static final o1 p;
    public static final o1 q;
    public static final o1 r;
    public static final o1 s;
    public static final o1 t;
    public static final o1 u;
    public static final o1 v;
    public static final o1 w;
    public static final o1 x;
    public static final o1 y;
    public static final o1 z;
    public final /* synthetic */ int e;

    static {
        int i2 = 1;
        f = new o1(i2, 0);
        g = new o1(i2, 1);
        h = new o1(i2, 2);
        i = new o1(i2, 3);
        j = new o1(i2, 4);
        k = new o1(i2, 5);
        l = new o1(i2, 6);
        m = new o1(i2, 7);
        n = new o1(i2, 8);
        o = new o1(i2, 9);
        p = new o1(i2, 10);
        q = new o1(i2, 11);
        r = new o1(i2, 12);
        s = new o1(i2, 13);
        t = new o1(i2, 14);
        u = new o1(i2, 15);
        v = new o1(i2, 16);
        w = new o1(i2, 17);
        x = new o1(i2, 18);
        y = new o1(i2, 19);
        z = new o1(i2, 20);
        A = new o1(i2, 21);
        B = new o1(i2, 22);
        C = new o1(i2, 23);
        D = new o1(i2, 24);
        E = new o1(i2, 25);
        F = new o1(i2, 26);
        G = new o1(i2, 27);
        H = new o1(i2, 28);
        I = new o1(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i2 = this.e;
        ky0 ky0Var = ky0.a;
        switch (i2) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                return ky0Var;
            case 2:
                return Boolean.TRUE;
            case 3:
                return Boolean.FALSE;
            case 4:
                ci ciVar = (ci) obj;
                ji jiVar = AndroidCompositionLocals_androidKt.a;
                gf0 gf0Var = (gf0) ciVar;
                gf0Var.getClass();
                a50.D(gf0Var, jiVar);
                return ((Context) a50.D((gf0) ciVar, AndroidCompositionLocals_androidKt.b)).getResources();
            case 5:
                n00[] n00VarArr = xp0.a;
                ((np0) obj).d(vp0.v, ky0Var);
                return ky0Var;
            case 6:
                ((g9) obj).l0();
                return ky0Var;
            case 7:
                ((r10) obj).b();
                return ky0Var;
            case 8:
                return ky0Var;
            case 9:
                return ky0Var;
            case 10:
                lt0 lt0Var = AndroidCompositionLocals_androidKt.b;
                gf0 gf0Var2 = (gf0) ((ci) obj);
                gf0Var2.getClass();
                if (((Context) a50.D(gf0Var2, lt0Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return va.b;
                }
                ta.a.getClass();
                return sa.c;
            case 11:
                xp0.a((np0) obj, 0);
                return ky0Var;
            case 12:
                ((Number) obj).longValue();
                return ky0Var;
            case 13:
                return Boolean.valueOf(!(((s50) obj) instanceof gh));
            case 14:
                return Boolean.valueOf(x40.s(obj));
            case 15:
                return ky0Var;
            case 16:
                long j2 = ((uw0) obj).a;
                return new f7(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (4294967295L & j2)));
            case 17:
                f7 f7Var = (f7) obj;
                float f2 = f7Var.a;
                float f3 = f7Var.b;
                return new uw0((4294967295L & Float.floatToRawIntBits(f3)) | (Float.floatToRawIntBits(f2) << 32));
            case 18:
                return nk.K(7, null);
            case 19:
                return ky0Var;
            case 20:
                return ky0Var;
            case 21:
                return Boolean.valueOf(((ts) obj).n0());
            case 22:
                return ky0Var;
            case 23:
                y6.q((oo) obj, ge.f, 0L, 126);
                return ky0Var;
            case 24:
                return ky0Var;
            case 25:
                ag0 ag0Var = (ag0) obj;
                if (ag0Var.q()) {
                    f40 f40Var = ag0Var.e;
                    if (!f40Var.n) {
                        mu c = ag0Var.d.c();
                        a70 a70Var = f40Var.q;
                        if (c != null) {
                            f40Var.S(ag0Var, 9223372034707292159L, 0L);
                            f40Var.j = c;
                        } else if (a70Var != null) {
                            Object[] objArr = a70Var.c;
                            long[] jArr = a70Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                while (true) {
                                    long j3 = jArr[i3];
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((255 & j3) < 128) {
                                                f40Var.i0((b70) objArr[(i3 << 3) + i5]);
                                            }
                                            j3 >>= 8;
                                        }
                                        if (i4 != 8) {
                                        }
                                    }
                                    if (i3 != length) {
                                        i3++;
                                    }
                                }
                            }
                            a70Var.a();
                        }
                    }
                }
                return ky0Var;
            case 26:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 27:
                m80 m80Var = (m80) obj;
                m80Var.getClass();
                p80 p80Var = m80Var.e;
                if (p80Var == null || p80Var.n != m80Var.i) {
                    return null;
                }
                return p80Var;
            case 28:
                m80 m80Var2 = (m80) obj;
                m80Var2.getClass();
                p80 p80Var2 = m80Var2.e;
                if (p80Var2 == null || p80Var2.n != m80Var2.i) {
                    return null;
                }
                return p80Var2;
            default:
                m80 m80Var3 = (m80) obj;
                m80Var3.getClass();
                return Integer.valueOf(m80Var3.i);
        }
    }
}
