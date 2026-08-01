package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.vectorharbor.planetvectorsurvey.R;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class ud0 {
    public static a5 a(String str, dw0 dw0Var, long j, sl slVar, ct ctVar, int i) {
        wp wpVar = wp.d;
        return new a5(new d5(str, dw0Var, wpVar, wpVar, ctVar, slVar), i, 1, j);
    }

    public static final int b(float[] fArr) {
        int i = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i2 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i = 1;
        }
        return (i2 << 1) | i;
    }

    public static final boolean c(long j) {
        return !bz.a(j, 9223372034707292159L);
    }

    public static final float d(xf0 xf0Var, boolean z, nw[] nwVarArr, float f) {
        float f2 = Float.NaN;
        for (nw nwVar : nwVarArr) {
            float d = xf0Var.d(nwVar);
            if (!Float.isNaN(f2)) {
                int i = z != (d > f2) ? i + 1 : 0;
            }
            f2 = d;
        }
        return Float.isNaN(f2) ? f : f2;
    }

    public static final void e(o60 o60Var, int i) {
        if (o60Var.b == 0 || !(o60Var.b(0) == i || o60Var.b(o60Var.b - 1) == i)) {
            int i2 = o60Var.b;
            o60Var.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int b = o60Var.b(i3);
                if (i <= b) {
                    break;
                }
                o60Var.d(i2, b);
                i2 = i3;
            }
            o60Var.d(i2, i);
        }
    }

    public static void f(StringBuilder sb, Object obj, mu muVar) {
        if (muVar != null) {
            sb.append((CharSequence) muVar.c(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final f70 g(ct0 ct0Var, ih ihVar) {
        Object value = ct0Var.getValue();
        qh qhVar = (qh) ihVar;
        up upVar = up.d;
        boolean h = qhVar.h(upVar) | qhVar.h(ct0Var);
        Object K = qhVar.K();
        kj kjVar = null;
        y7 y7Var = hh.a;
        if (h || K == y7Var) {
            K = new u6(upVar, ct0Var, kjVar, 12);
            qhVar.e0(K);
        }
        qu quVar = (qu) K;
        Object K2 = qhVar.K();
        if (K2 == y7Var) {
            K2 = o(value);
            qhVar.e0(K2);
        }
        f70 f70Var = (f70) K2;
        boolean h2 = qhVar.h(quVar);
        Object K3 = qhVar.K();
        if (h2 || K3 == y7Var) {
            K3 = new bs0(quVar, f70Var, kjVar, 1);
            qhVar.e0(K3);
        }
        mz.l(ct0Var, upVar, (qu) K3, qhVar);
        return f70Var;
    }

    public static final l70 h() {
        t7 t7Var = as0.b;
        l70 l70Var = (l70) t7Var.o();
        if (l70Var != null) {
            return l70Var;
        }
        l70 l70Var2 = new l70(new oh[0]);
        t7Var.x(l70Var2);
        return l70Var2;
    }

    public static final yl i(bu buVar) {
        t7 t7Var = as0.a;
        return new yl(buVar);
    }

    public static final boolean j(long j, long j2) {
        return j == j2;
    }

    public static final ViewParent k(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final kp0 l(Object obj) {
        if (obj != mz.i) {
            return (kp0) obj;
        }
        g8.s("Does not contain segment");
        return null;
    }

    public static boolean m(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final boolean n(Object obj) {
        return obj == mz.i;
    }

    public static ce0 o(Object obj) {
        return new ce0(obj, b2.M);
    }

    public static final f70 p(Object obj, ih ihVar) {
        qh qhVar = (qh) ihVar;
        Object K = qhVar.K();
        if (K == hh.a) {
            K = o(obj);
            qhVar.e0(K);
        }
        f70 f70Var = (f70) K;
        f70Var.setValue(obj);
        return f70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final dw0 q(dw0 dw0Var, c10 c10Var) {
        int i;
        long j;
        mv0 mv0Var;
        int i2;
        wv0 wv0Var;
        ns0 ns0Var = dw0Var.a;
        kv0 kv0Var = os0.d;
        kv0 d = ns0Var.a.d(new zh(11));
        long j2 = ns0Var.b;
        gw0[] gw0VarArr = fw0.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = os0.a;
        }
        long j3 = j2;
        ut utVar = ns0Var.c;
        if (utVar == null) {
            utVar = ut.f;
        }
        ut utVar2 = utVar;
        st stVar = ns0Var.d;
        st stVar2 = new st(stVar != null ? stVar.a : 0);
        tt ttVar = ns0Var.e;
        tt ttVar2 = new tt(ttVar != null ? ttVar.a : 65535);
        qu0 qu0Var = ns0Var.f;
        if (qu0Var == null) {
            qu0Var = qu0.a;
        }
        qu0 qu0Var2 = qu0Var;
        String str = ns0Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = ns0Var.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = os0.b;
        }
        long j5 = j4;
        i9 i9Var = ns0Var.i;
        i9 i9Var2 = new i9(i9Var != null ? i9Var.a : 0.0f);
        lv0 lv0Var = ns0Var.j;
        if (lv0Var == null) {
            lv0Var = lv0.c;
        }
        lv0 lv0Var2 = lv0Var;
        t30 t30Var = ns0Var.k;
        if (t30Var == null) {
            t30 t30Var2 = t30.f;
            t30Var = jg0.a.g();
        }
        t30 t30Var3 = t30Var;
        long j6 = ns0Var.l;
        if (j6 == 16) {
            j6 = os0.c;
        }
        long j7 = j6;
        gv0 gv0Var = ns0Var.m;
        if (gv0Var == null) {
            gv0Var = gv0.b;
        }
        gv0 gv0Var2 = gv0Var;
        pq0 pq0Var = ns0Var.n;
        if (pq0Var == null) {
            pq0Var = pq0.d;
        }
        pq0 pq0Var2 = pq0Var;
        nz nzVar = ns0Var.o;
        if (nzVar == null) {
            nzVar = ar.o;
        }
        ns0 ns0Var2 = new ns0(d, j3, utVar2, stVar2, ttVar2, qu0Var2, str2, j5, i9Var2, lv0Var2, t30Var3, j7, gv0Var2, pq0Var2, nzVar);
        wd0 wd0Var = dw0Var.b;
        int i3 = xd0.b;
        int i4 = wd0Var.a;
        int i5 = 5;
        int i6 = i4 == Integer.MIN_VALUE ? 5 : i4;
        int i7 = wd0Var.b;
        if (i7 != 3) {
            if (i7 == Integer.MIN_VALUE) {
                int ordinal = c10Var.ordinal();
                if (ordinal == 0) {
                    i = 1;
                } else {
                    if (ordinal != 1) {
                        g8.c();
                        return null;
                    }
                    i5 = 2;
                }
            } else {
                i = i7;
            }
            j = wd0Var.c;
            if ((j & 1095216660480L) == 0) {
                j = xd0.a;
            }
            mv0Var = wd0Var.d;
            if (mv0Var == null) {
                mv0Var = mv0.c;
            }
            mv0 mv0Var2 = mv0Var;
            lg0 lg0Var = wd0Var.e;
            z20 z20Var = wd0Var.f;
            i2 = wd0Var.g;
            if (i2 == 0) {
                i2 = u20.b;
            }
            int i8 = i2;
            int i9 = wd0Var.h;
            int i10 = i9 != Integer.MIN_VALUE ? 1 : i9;
            wv0Var = wd0Var.i;
            if (wv0Var == null) {
                wv0Var = wv0.c;
            }
            return new dw0(ns0Var2, new wd0(i6, i, j, mv0Var2, lg0Var, z20Var, i8, i10, wv0Var), dw0Var.c);
        }
        int ordinal2 = c10Var.ordinal();
        if (ordinal2 == 0) {
            i5 = 4;
        } else if (ordinal2 != 1) {
            g8.c();
            return null;
        }
        i = i5;
        j = wd0Var.c;
        if ((j & 1095216660480L) == 0) {
        }
        mv0Var = wd0Var.d;
        if (mv0Var == null) {
        }
        mv0 mv0Var22 = mv0Var;
        lg0 lg0Var2 = wd0Var.e;
        z20 z20Var2 = wd0Var.f;
        i2 = wd0Var.g;
        if (i2 == 0) {
        }
        int i82 = i2;
        int i92 = wd0Var.h;
        if (i92 != Integer.MIN_VALUE) {
        }
        wv0Var = wd0Var.i;
        if (wv0Var == null) {
        }
        return new dw0(ns0Var2, new wd0(i6, i, j, mv0Var22, lg0Var2, z20Var2, i82, i10, wv0Var), dw0Var.c);
    }

    public static final int r(o60 o60Var) {
        int b;
        int i = o60Var.b;
        int b2 = o60Var.b(0);
        while (o60Var.b != 0 && o60Var.b(0) == b2) {
            int i2 = o60Var.b;
            if (i2 == 0) {
                g8.e("IntList is empty.");
                return 0;
            }
            o60Var.d(0, o60Var.a[i2 - 1]);
            o60Var.c(o60Var.b - 1);
            int i3 = o60Var.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int b3 = o60Var.b(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int b4 = o60Var.b(i7);
                if (i6 >= i3 || (b = o60Var.b(i6)) <= b4) {
                    if (b4 > b3) {
                        o60Var.d(i5, b4);
                        o60Var.d(i7, b3);
                        i5 = i7;
                    }
                } else if (b > b3) {
                    o60Var.d(i5, b);
                    o60Var.d(i6, b3);
                    i5 = i6;
                }
            }
        }
        return b2;
    }

    public static final ty s(oy oyVar) {
        return new ty(oyVar.a, oyVar.b, oyVar.c, oyVar.d);
    }
}
