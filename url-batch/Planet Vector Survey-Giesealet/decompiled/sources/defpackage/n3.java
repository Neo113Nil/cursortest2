package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.vectorharbor.planetvectorsurvey.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class n3 extends k0 {
    public static final o60 Q;
    public boolean A;
    public k3 B;
    public p60 C;
    public final q60 D;
    public final n60 E;
    public final n60 F;
    public final String G;
    public final String H;
    public final t7 I;
    public final p60 J;
    public sp0 K;
    public boolean L;
    public final n60 M;
    public final w2 N;
    public final ArrayList O;
    public final m3 P;
    public final f3 d;
    public int e = Integer.MIN_VALUE;
    public final m3 f;
    public final AccessibilityManager g;
    public long h;
    public final g3 i;
    public final h3 j;
    public List k;
    public final Handler l;
    public final j3 m;
    public int n;
    public int o;
    public c1 p;
    public c1 q;
    public boolean r;
    public final p60 s;
    public final p60 t;
    public final ps0 u;
    public final ps0 v;
    public int w;
    public Integer x;
    public final o8 y;
    public final eb z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i = yy.a;
        o60 o60Var = new o60(32);
        int i2 = o60Var.b;
        if (i2 < 0) {
            g8.m("");
            return;
        }
        int i3 = i2 + 32;
        int[] iArr2 = o60Var.a;
        if (iArr2.length < i3) {
            o60Var.a = Arrays.copyOf(iArr2, Math.max(i3, (iArr2.length * 3) / 2));
        }
        int[] iArr3 = o60Var.a;
        int i4 = o60Var.b;
        if (i2 != i4) {
            p8.R(iArr3, iArr3, i3, i2, i4);
        }
        p8.U(iArr, iArr3, i2, 0, 12);
        o60Var.b += 32;
        Q = o60Var;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [g3] */
    /* JADX WARN: Type inference failed for: r3v3, types: [h3] */
    public n3(f3 f3Var) {
        this.d = f3Var;
        int i = 0;
        this.f = new m3(this, i);
        Object systemService = f3Var.getContext().getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.g = accessibilityManager;
        this.h = 100L;
        this.i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: g3
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                n3 n3Var = n3.this;
                n3Var.k = z ? n3Var.g.getEnabledAccessibilityServiceList(-1) : wp.d;
            }
        };
        this.j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: h3
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                n3 n3Var = n3.this;
                n3Var.k = n3Var.g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.l = new Handler(Looper.getMainLooper());
        this.m = new j3(this);
        this.n = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.s = new p60();
        this.t = new p60();
        this.u = new ps0();
        this.v = new ps0();
        this.w = -1;
        this.y = new o8();
        int i2 = 1;
        this.z = x40.b(1, null, 6);
        this.A = true;
        p60 p60Var = az.a;
        p60Var.getClass();
        this.C = p60Var;
        this.D = new q60();
        this.E = new n60();
        this.F = new n60();
        this.G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.I = new t7(10);
        this.J = new p60();
        this.K = new sp0(f3Var.getSemanticsOwner().a(), p60Var);
        int i3 = wy.a;
        this.M = new n60();
        f3Var.addOnAttachStateChangeListener(new i3(i, this));
        this.N = new w2(i2, this);
        this.O = new ArrayList();
        this.P = new m3(this, i2);
    }

    public static Rect D(xc0 xc0Var) {
        if (!(xc0Var instanceof vc0) && !(xc0Var instanceof wc0)) {
            return null;
        }
        zi0 a = xc0Var.a();
        return new Rect((int) a.a, (int) a.b, (int) a.c, (int) a.d);
    }

    public static float[] E(xc0 xc0Var) {
        if (!(xc0Var instanceof wc0)) {
            return null;
        }
        zl0 zl0Var = ((wc0) xc0Var).a;
        long j = zl0Var.h;
        long j2 = zl0Var.g;
        long j3 = zl0Var.f;
        long j4 = zl0Var.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region F(xc0 xc0Var) {
        if (!(xc0Var instanceof uc0)) {
            return null;
        }
        uc0 uc0Var = (uc0) xc0Var;
        zi0 a = uc0Var.a();
        Region region = new Region(new Rect((int) a.a, (int) a.b, (int) a.c, (int) a.d));
        Region region2 = new Region();
        e5 e5Var = uc0Var.a;
        if (!(e5Var instanceof e5)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        region2.setPath(e5Var.a, region);
        return region2;
    }

    public static CharSequence G(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String m(rp0 rp0Var) {
        l7 l7Var;
        if (rp0Var != null) {
            np0 np0Var = rp0Var.d;
            a70 a70Var = np0Var.d;
            yp0 yp0Var = vp0.a;
            if (a70Var.c(yp0Var)) {
                return l30.a((List) np0Var.b(yp0Var), ",", null, 62);
            }
            yp0 yp0Var2 = vp0.D;
            if (a70Var.c(yp0Var2)) {
                Object g = a70Var.g(yp0Var2);
                if (g == null) {
                    g = null;
                }
                l7 l7Var2 = (l7) g;
                if (l7Var2 != null) {
                    return l7Var2.e;
                }
            } else {
                Object g2 = a70Var.g(vp0.z);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null && (l7Var = (l7) zd.d0(list)) != null) {
                    return l7Var.e;
                }
            }
        }
        return null;
    }

    public static final boolean p(zn0 zn0Var, float f) {
        eo0 eo0Var = zn0Var.a;
        if (f >= 0.0f || ((Number) eo0Var.a()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) eo0Var.a()).floatValue() < ((Number) zn0Var.b.a()).floatValue();
        }
        return true;
    }

    public static final boolean q(zn0 zn0Var) {
        eo0 eo0Var = zn0Var.a;
        if (((Number) eo0Var.a()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) eo0Var.a()).floatValue();
        ((Number) zn0Var.b.a()).floatValue();
        return false;
    }

    public static final boolean r(zn0 zn0Var) {
        eo0 eo0Var = zn0Var.a;
        if (((Number) eo0Var.a()).floatValue() < ((Number) zn0Var.b.a()).floatValue()) {
            return true;
        }
        ((Number) eo0Var.a()).floatValue();
        return false;
    }

    public static /* synthetic */ void w(n3 n3Var, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        n3Var.v(i, i2, num, null);
    }

    public final void A(p10 p10Var, q60 q60Var) {
        np0 p;
        if (p10Var.B() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(p10Var)) {
            p10 p10Var2 = null;
            if (!p10Var.F.h(8)) {
                p10Var = p10Var.n();
                while (true) {
                    if (p10Var == null) {
                        p10Var = null;
                        break;
                    } else if (p10Var.F.h(8)) {
                        break;
                    } else {
                        p10Var = p10Var.n();
                    }
                }
            }
            if (p10Var == null || (p = p10Var.p()) == null) {
                return;
            }
            if (!p.f) {
                p10 n = p10Var.n();
                while (true) {
                    if (n != null) {
                        np0 p2 = n.p();
                        if (p2 != null && p2.f) {
                            p10Var2 = n;
                            break;
                        }
                        n = n.n();
                    } else {
                        break;
                    }
                }
                if (p10Var2 != null) {
                    p10Var = p10Var2;
                }
            }
            int i = p10Var.e;
            if (q60Var.a(i)) {
                w(this, s(i), 2048, 1, 8);
            }
        }
    }

    public final void B(p10 p10Var) {
        if (p10Var.B() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(p10Var)) {
            int i = p10Var.e;
            zn0 zn0Var = (zn0) this.s.b(i);
            zn0 zn0Var2 = (zn0) this.t.b(i);
            if (zn0Var == null && zn0Var2 == null) {
                return;
            }
            AccessibilityEvent g = g(i, 4096);
            if (zn0Var != null) {
                g.setScrollX((int) ((Number) zn0Var.a.a()).floatValue());
                g.setMaxScrollX((int) ((Number) zn0Var.b.a()).floatValue());
            }
            if (zn0Var2 != null) {
                g.setScrollY((int) ((Number) zn0Var2.a.a()).floatValue());
                g.setMaxScrollY((int) ((Number) zn0Var2.b.a()).floatValue());
            }
            u(g);
        }
    }

    public final boolean C(rp0 rp0Var, int i, int i2, boolean z) {
        String m;
        np0 np0Var = rp0Var.d;
        int i3 = rp0Var.g;
        yp0 yp0Var = mp0.h;
        if (np0Var.d.c(yp0Var) && a50.f(rp0Var)) {
            ru ruVar = (ru) ((h0) rp0Var.d.b(yp0Var)).b;
            if (ruVar != null) {
                return ((Boolean) ruVar.b(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.w) && (m = m(rp0Var)) != null) {
            if (i < 0 || i != i2 || i2 > m.length()) {
                i = -1;
            }
            this.w = i;
            boolean z2 = m.length() > 0;
            u(i(s(i3), z2 ? Integer.valueOf(this.w) : null, z2 ? Integer.valueOf(this.w) : null, z2 ? Integer.valueOf(m.length()) : null, m));
            y(i3);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013b, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0145, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0147, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int i3;
        char c2;
        q60 q60Var = new q60();
        q60 q60Var2 = this.D;
        int[] iArr = q60Var2.b;
        long[] jArr3 = q60Var2.a;
        int length = jArr3.length - 2;
        p60 p60Var = this.J;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i5];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j5 & 255) < 128) {
                            int i8 = iArr[(i5 << 3) + i7];
                            c2 = c3;
                            tp0 tp0Var = (tp0) l().b(i8);
                            rp0 rp0Var = tp0Var != null ? tp0Var.a : null;
                            if (rp0Var != null) {
                                if (rp0Var.d.d.c(vp0.d)) {
                                }
                            }
                            q60Var.a(i8);
                            sp0 sp0Var = (sp0) p60Var.b(i8);
                            if (sp0Var != null) {
                                Object g = sp0Var.a.d.g(vp0.d);
                                r23 = g != 0 ? g : null;
                            }
                            x(i8, 32, r23);
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i7++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = q60Var.b;
        long[] jArr4 = q60Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j6 = jArr4[i9];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j6 & j2) < j) {
                            int i12 = iArr2[(i9 << 3) + i11];
                            int i13 = (-862048943) * i12;
                            int i14 = i13 ^ (i13 << 16);
                            int i15 = i14 & 127;
                            int i16 = q60Var2.c;
                            int i17 = (i14 >>> 7) & i16;
                            i = i4;
                            int i18 = 0;
                            while (true) {
                                long[] jArr5 = q60Var2.a;
                                int i19 = i17 >> 3;
                                jArr2 = jArr4;
                                int i20 = (i17 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i19] >>> i20) | ((jArr5[i19 + 1] << (64 - i20)) & ((-i20) >> 63));
                                int i21 = i16;
                                long j8 = (i15 * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    i3 = (i17 + (Long.numberOfTrailingZeros(j9) >> 3)) & i21;
                                    int i22 = i21;
                                    if (q60Var2.b[i3] == i12) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i21 = i22;
                                }
                                i18 += 8;
                                i17 = (i17 + i18) & i2;
                                jArr4 = jArr2;
                                i16 = i2;
                                j6 = j4;
                            }
                            int i23 = i3;
                            if (i23 >= 0) {
                                q60Var2.f(i23);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i4;
                        }
                        j6 = j4 >> i;
                        i11++;
                        i4 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i10 != i4) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                jArr4 = jArr;
                i4 = 8;
            }
        }
        p60Var.c();
        zy l = l();
        int[] iArr3 = l.b;
        Object[] objArr = l.c;
        long[] jArr6 = l.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i24 = 0;
            while (true) {
                long j10 = jArr6[i24];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i25 = 8 - ((~(i24 - length3)) >>> 31);
                    for (int i26 = 0; i26 < i25; i26++) {
                        if ((j10 & j2) < j) {
                            int i27 = (i24 << 3) + i26;
                            int i28 = iArr3[i27];
                            rp0 rp0Var2 = ((tp0) objArr[i27]).a;
                            np0 np0Var = rp0Var2.d;
                            yp0 yp0Var = vp0.d;
                            if (np0Var.d.c(yp0Var) && q60Var2.a(i28)) {
                                x(i28, 16, (String) rp0Var2.d.b(yp0Var));
                            }
                            p60Var.h(i28, new sp0(rp0Var2, l()));
                        }
                        j10 >>= 8;
                    }
                    if (i25 != 8) {
                        break;
                    }
                }
                if (i24 == length3) {
                    break;
                } else {
                    i24++;
                }
            }
        }
        this.K = new sp0(this.d.getSemanticsOwner().a(), l());
    }

    @Override // defpackage.k0
    public final j3 a(View view) {
        return this.m;
    }

    public final void b(int i, c1 c1Var, String str, Bundle bundle) {
        rp0 rp0Var;
        Region F;
        float[] E;
        Rect D;
        int i2;
        float h;
        float h2;
        float g;
        float g2;
        AccessibilityNodeInfo accessibilityNodeInfo;
        int i3;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo2 = c1Var.a;
        tp0 tp0Var = (tp0) l().b(i);
        if (tp0Var == null || (rp0Var = tp0Var.a) == null) {
            return;
        }
        np0 np0Var = rp0Var.d;
        a70 a70Var = np0Var.d;
        String m = m(rp0Var);
        if (nz.l(str, this.G)) {
            int d = this.E.d(i);
            if (d != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, d);
                return;
            }
            return;
        }
        if (nz.l(str, this.H)) {
            int d2 = this.F.d(i);
            if (d2 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, d2);
                return;
            }
            return;
        }
        boolean z = false;
        if (!a70Var.c(mp0.a) || bundle == null || !nz.l(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            yp0 yp0Var = vp0.x;
            if (a70Var.c(yp0Var) && bundle != null && nz.l(str, "androidx.compose.ui.semantics.testTag")) {
                Object g3 = a70Var.g(yp0Var);
                String str2 = (String) (g3 == null ? null : g3);
                if (str2 != null) {
                    accessibilityNodeInfo2.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (nz.l(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo2.getExtras().putInt(str, rp0Var.g);
                return;
            }
            if (nz.l(str, "androidx.compose.ui.semantics.shapeType")) {
                Object g4 = a70Var.g(vp0.L);
                rq0 rq0Var = (rq0) (g4 == null ? null : g4);
                if (rq0Var != null) {
                    xc0 h3 = h(rq0Var, rp0Var);
                    if (h3 instanceof vc0) {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", D(h3));
                        return;
                    } else if (h3 instanceof wc0) {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", D(h3));
                        accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", E(h3));
                        return;
                    } else if (!(h3 instanceof uc0)) {
                        g8.c();
                        return;
                    } else {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", F(h3));
                        return;
                    }
                }
                return;
            }
            if (nz.l(str, "androidx.compose.ui.semantics.shapeRect")) {
                Object g5 = a70Var.g(vp0.L);
                rq0 rq0Var2 = (rq0) (g5 == null ? null : g5);
                if (rq0Var2 == null || (D = D(h(rq0Var2, rp0Var))) == null) {
                    return;
                }
                accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", D);
                return;
            }
            if (nz.l(str, "androidx.compose.ui.semantics.shapeCorners")) {
                Object g6 = a70Var.g(vp0.L);
                rq0 rq0Var3 = (rq0) (g6 == null ? null : g6);
                if (rq0Var3 == null || (E = E(h(rq0Var3, rp0Var))) == null) {
                    return;
                }
                accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", E);
                return;
            }
            if (nz.l(str, "androidx.compose.ui.semantics.shapeRegion")) {
                Object g7 = a70Var.g(vp0.L);
                rq0 rq0Var4 = (rq0) (g7 == null ? null : g7);
                if (rq0Var4 == null || (F = F(h(rq0Var4, rp0Var))) == null) {
                    return;
                }
                accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", F);
                return;
            }
            return;
        }
        int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i5 > 0 && i4 >= 0) {
            if (i4 < (m != null ? m.length() : Integer.MAX_VALUE)) {
                sv0 i6 = ld0.i(np0Var);
                if (i6 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i7 = 0;
                while (i7 < i5) {
                    int i8 = i4 + i7;
                    if (i8 >= i6.a.a.e.length()) {
                        arrayList.add(z);
                        i2 = i4;
                        accessibilityNodeInfo = accessibilityNodeInfo2;
                        i3 = i5;
                    } else {
                        j60 j60Var = i6.b;
                        l7 l7Var = (l7) ((k2) j60Var.c).d;
                        if (i8 < 0 || i8 >= l7Var.e.length()) {
                            dy.a("offset(" + i8 + ") is out of bounds [0, " + l7Var.e.length() + ')');
                        }
                        ArrayList arrayList2 = (ArrayList) j60Var.e;
                        rd0 rd0Var = (rd0) arrayList2.get(nk.r(arrayList2, i8));
                        a5 a5Var = rd0Var.a;
                        int a = rd0Var.a(i8);
                        CharSequence charSequence = a5Var.e;
                        if (a < 0 || a >= charSequence.length()) {
                            dy.a("offset(" + a + ") is out of bounds [0," + charSequence.length() + ')');
                        }
                        qv0 qv0Var = a5Var.d;
                        Layout layout = qv0Var.e;
                        int lineForOffset = layout.getLineForOffset(a);
                        float f = qv0Var.f(lineForOffset);
                        float d3 = qv0Var.d(lineForOffset);
                        i2 = i4;
                        boolean z2 = layout.getParagraphDirection(lineForOffset) == 1;
                        boolean isRtlCharAt = layout.isRtlCharAt(a);
                        if (!z2 || isRtlCharAt) {
                            if (z2 && isRtlCharAt) {
                                g = qv0Var.h(a, false);
                                g2 = qv0Var.h(a + 1, true);
                            } else if (isRtlCharAt) {
                                g = qv0Var.g(a, false);
                                g2 = qv0Var.g(a + 1, true);
                            } else {
                                h = qv0Var.h(a, false);
                                h2 = qv0Var.h(a + 1, true);
                            }
                            float f2 = g;
                            h = g2;
                            h2 = f2;
                        } else {
                            h = qv0Var.g(a, false);
                            h2 = qv0Var.g(a + 1, true);
                        }
                        RectF rectF2 = new RectF(h, f, h2, d3);
                        accessibilityNodeInfo = accessibilityNodeInfo2;
                        i3 = i5;
                        long floatToRawIntBits = (Float.floatToRawIntBits(rd0Var.f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                        int i9 = (int) (floatToRawIntBits >> 32);
                        int i10 = (int) (floatToRawIntBits & 4294967295L);
                        zi0 zi0Var = new zi0(Float.intBitsToFloat(i9) + rectF2.left, Float.intBitsToFloat(i10) + rectF2.top, Float.intBitsToFloat(i9) + rectF2.right, Float.intBitsToFloat(i10) + rectF2.bottom);
                        ea0 d4 = rp0Var.d();
                        long j = 0;
                        if (d4 != null) {
                            if (!d4.v0().q) {
                                d4 = null;
                            }
                            if (d4 != null) {
                                j = d4.F0(0L);
                            }
                        }
                        zi0 e = zi0Var.e(j);
                        zi0 g8 = rp0Var.g();
                        if ((((((e.a > g8.c ? 1 : (e.a == g8.c ? 0 : -1)) < 0) & ((g8.a > e.c ? 1 : (g8.a == e.c ? 0 : -1)) < 0)) & ((e.b > g8.d ? 1 : (e.b == g8.d ? 0 : -1)) < 0)) & ((g8.b > e.d ? 1 : (g8.b == e.d ? 0 : -1)) < 0) ? e.c(g8) : null) != null) {
                            f3 f3Var = this.d;
                            long u = f3Var.u((Float.floatToRawIntBits(r1.b) & 4294967295L) | (Float.floatToRawIntBits(r1.a) << 32));
                            long u2 = f3Var.u((Float.floatToRawIntBits(r1.c) << 32) | (Float.floatToRawIntBits(r1.d) & 4294967295L));
                            int i11 = (int) (u >> 32);
                            int i12 = (int) (u2 >> 32);
                            int i13 = (int) (u & 4294967295L);
                            int i14 = (int) (u2 & 4294967295L);
                            rectF = new RectF(Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), Math.min(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), Math.max(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i7++;
                    i5 = i3;
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    i4 = i2;
                    z = false;
                }
                accessibilityNodeInfo2.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect c(tp0 tp0Var) {
        fz fzVar = tp0Var.b;
        float f = fzVar.a;
        float f2 = fzVar.b;
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        f3 f3Var = this.d;
        long u = f3Var.u((Float.floatToRawIntBits(f2) & 4294967295L) | (floatToRawIntBits << 32));
        float f3 = fzVar.c;
        float f4 = fzVar.d;
        long u2 = f3Var.u((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        int i = (int) (u >> 32);
        int i2 = (int) (u2 >> 32);
        int i3 = (int) (u & 4294967295L);
        int i4 = (int) (u2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ec, code lost:
    
        if (defpackage.mz.B(r4, r2) == r7) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x0030, B:15:0x005c, B:21:0x006e, B:23:0x0076, B:25:0x007f, B:27:0x0085, B:29:0x0094, B:31:0x009c, B:53:0x0046, B:55:0x004d), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ec -> B:14:0x00ef). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(lj ljVar) {
        l3 l3Var;
        int i;
        o8 o8Var;
        o8 o8Var2;
        q60 q60Var;
        db dbVar;
        q60 q60Var2;
        db dbVar2;
        int i2;
        long j;
        Object b;
        try {
            if (ljVar instanceof l3) {
                l3Var = (l3) ljVar;
                int i3 = l3Var.h;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    l3Var.h = i3 - Integer.MIN_VALUE;
                    Object obj = l3Var.f;
                    i = l3Var.h;
                    o8Var = this.y;
                    ck ckVar = ck.d;
                    if (i != 0) {
                        rg0.u(obj);
                        q60Var = new q60();
                        eb ebVar = this.z;
                        ebVar.getClass();
                        dbVar = new db(ebVar);
                        l3Var.d = q60Var;
                        l3Var.e = dbVar;
                        l3Var.h = 1;
                        b = dbVar.b(l3Var);
                        if (b != ckVar) {
                        }
                    } else if (i == 1) {
                        dbVar2 = l3Var.e;
                        q60Var2 = l3Var.d;
                        rg0.u(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dbVar2 = l3Var.e;
                        q60Var2 = l3Var.d;
                        rg0.u(obj);
                        char c = 2;
                        o8Var2 = o8Var;
                        q60Var = q60Var2;
                        o8Var = o8Var2;
                        dbVar = dbVar2;
                        l3Var.d = q60Var;
                        l3Var.e = dbVar;
                        l3Var.h = 1;
                        b = dbVar.b(l3Var);
                        if (b != ckVar) {
                            return ckVar;
                        }
                        db dbVar3 = dbVar;
                        q60Var2 = q60Var;
                        obj = b;
                        dbVar2 = dbVar3;
                        if (((Boolean) obj).booleanValue()) {
                            o8Var.clear();
                            return ky0.a;
                        }
                        dbVar2.c();
                        if (n()) {
                            int i4 = o8Var.f;
                            for (int i5 = 0; i5 < i4; i5++) {
                                p10 p10Var = (p10) o8Var.e[i5];
                                A(p10Var, q60Var2);
                                B(p10Var);
                            }
                            q60Var2.d = 0;
                            long[] jArr = q60Var2.a;
                            if (jArr != vn0.a) {
                                try {
                                    p8.Y(jArr);
                                    long[] jArr2 = q60Var2.a;
                                    i2 = q60Var2.c;
                                    int i6 = i2 >> 3;
                                    jArr2[i6] = ((~j) & jArr2[i6]) | j;
                                } catch (Throwable th) {
                                    th = th;
                                    o8Var2.clear();
                                    throw th;
                                }
                                j = 255 << ((i2 & 7) << 3);
                                o8Var2 = o8Var;
                            } else {
                                o8Var2 = o8Var;
                            }
                            q60Var2.e = vn0.a(q60Var2.c) - q60Var2.d;
                            if (!this.L) {
                                this.L = true;
                                this.l.post(this.N);
                            }
                        } else {
                            o8Var2 = o8Var;
                        }
                        o8Var2.clear();
                        this.s.c();
                        this.t.c();
                        long j2 = this.h;
                        l3Var.d = q60Var2;
                        l3Var.e = dbVar2;
                        c = 2;
                        l3Var.h = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
            o8Var2 = o8Var;
        }
        l3Var = new l3(this, ljVar);
        Object obj2 = l3Var.f;
        i = l3Var.h;
        o8Var = this.y;
        ck ckVar2 = ck.d;
    }

    public final boolean e(boolean z, int i, long j) {
        yp0 yp0Var;
        int i2;
        if (nz.l(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            zy l = l();
            if (!ra0.b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    yp0Var = vp0.u;
                } else {
                    if (z) {
                        g8.c();
                        return false;
                    }
                    yp0Var = vp0.t;
                }
                Object[] objArr = l.c;
                long[] jArr = l.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    tp0 tp0Var = (tp0) objArr[(i3 << 3) + i6];
                                    fz fzVar = tp0Var.b;
                                    float f = fzVar.a;
                                    i2 = i4;
                                    float f2 = fzVar.b;
                                    float f3 = fzVar.c;
                                    float f4 = fzVar.d;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((intBitsToFloat2 < f4) & (intBitsToFloat >= f) & (intBitsToFloat < f3) & (intBitsToFloat2 >= f2)) {
                                        Object g = tp0Var.a.d.d.g(yp0Var);
                                        if (g == null) {
                                            g = null;
                                        }
                                        zn0 zn0Var = (zn0) g;
                                        if (zn0Var != null) {
                                            eo0 eo0Var = zn0Var.a;
                                            if (i < 0) {
                                                if (((Number) eo0Var.a()).floatValue() <= 0.0f) {
                                                }
                                                z2 = true;
                                            } else {
                                                if (((Number) eo0Var.a()).floatValue() >= ((Number) zn0Var.b.a()).floatValue()) {
                                                }
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void f() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (n()) {
                t(this.d.getSemanticsOwner().a(), this.K);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                z(l());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    H();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent g(int i, int i2) {
        tp0 tp0Var;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        f3 f3Var = this.d;
        obtain.setPackageName(f3Var.getContext().getPackageName());
        obtain.setSource(f3Var, i);
        if (n() && (tp0Var = (tp0) l().b(i)) != null) {
            rp0 rp0Var = tp0Var.a;
            obtain.setPassword(rp0Var.d.d.c(vp0.H));
            Object g = rp0Var.d.d.g(vp0.n);
            if (g == null) {
                g = null;
            }
            boolean l = nz.l(g, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                l0.f(obtain, l);
            }
        }
        return obtain;
    }

    public final xc0 h(rq0 rq0Var, rp0 rp0Var) {
        ea0 d = rp0Var.d();
        return rq0Var.a(px0.W(d != null ? d.f : 0L), rp0Var.c.z, this.d.getDensity());
    }

    public final AccessibilityEvent i(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent g = g(i, 8192);
        if (num != null) {
            g.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            g.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            g.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            g.getText().add(charSequence);
        }
        return g;
    }

    public final int j(rp0 rp0Var) {
        np0 np0Var = rp0Var.d;
        if (!np0Var.d.c(vp0.a)) {
            yp0 yp0Var = vp0.E;
            if (np0Var.d.c(yp0Var)) {
                return (int) (((xv0) np0Var.b(yp0Var)).a & 4294967295L);
            }
        }
        return this.w;
    }

    public final int k(rp0 rp0Var) {
        np0 np0Var = rp0Var.d;
        if (!np0Var.d.c(vp0.a)) {
            yp0 yp0Var = vp0.E;
            if (np0Var.d.c(yp0Var)) {
                return (int) (((xv0) np0Var.b(yp0Var)).a >> 32);
            }
        }
        return this.w;
    }

    public final zy l() {
        if (this.A) {
            this.A = false;
            f3 f3Var = this.d;
            this.C = nz.C(f3Var.getSemanticsOwner());
            if (n()) {
                p60 p60Var = this.C;
                Resources resources = f3Var.getContext().getResources();
                n60 n60Var = this.E;
                n60Var.a();
                n60 n60Var2 = this.F;
                n60Var2.a();
                tp0 tp0Var = (tp0) p60Var.b(-1);
                rp0 rp0Var = tp0Var != null ? tp0Var.a : null;
                rp0Var.getClass();
                int i = 1;
                ArrayList b = aq0.b(rp0Var, new f2(i, p60Var), new f2(2, resources), px0.H(rp0Var));
                int size = b.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((rp0) b.get(i - 1)).g;
                        int i3 = ((rp0) b.get(i)).g;
                        n60Var.f(i2, i3);
                        n60Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.C;
    }

    public final boolean n() {
        return this.g.isEnabled() && !this.k.isEmpty();
    }

    public final void o(p10 p10Var) {
        if (this.y.add(p10Var)) {
            this.z.r(ky0.a);
        }
    }

    public final int s(int i) {
        if (i == this.d.getSemanticsOwner().a().g) {
            return -1;
        }
        return i;
    }

    public final void t(rp0 rp0Var, sp0 sp0Var) {
        int[] iArr = hz.a;
        q60 q60Var = new q60();
        List j = rp0.j(4, rp0Var);
        p10 p10Var = rp0Var.c;
        int size = j.size();
        for (int i = 0; i < size; i++) {
            rp0 rp0Var2 = (rp0) j.get(i);
            zy l = l();
            int i2 = rp0Var2.g;
            if (l.a(i2)) {
                if (!sp0Var.b.b(i2)) {
                    o(p10Var);
                    return;
                }
                q60Var.a(i2);
            }
        }
        q60 q60Var2 = sp0Var.b;
        int[] iArr2 = q60Var2.b;
        long[] jArr = q60Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128 && !q60Var.b(iArr2[(i3 << 3) + i5])) {
                            o(p10Var);
                            return;
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List j3 = rp0.j(4, rp0Var);
        int size2 = j3.size();
        for (int i6 = 0; i6 < size2; i6++) {
            rp0 rp0Var3 = (rp0) j3.get(i6);
            sp0 sp0Var2 = (sp0) this.J.b(rp0Var3.g);
            if (sp0Var2 != null && l().a(rp0Var3.g)) {
                t(rp0Var3, sp0Var2);
            }
        }
    }

    public final boolean u(AccessibilityEvent accessibilityEvent) {
        if (!n()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.r = true;
        }
        try {
            return ((Boolean) this.f.c(accessibilityEvent)).booleanValue();
        } finally {
            this.r = false;
        }
    }

    public final boolean v(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !n()) {
            return false;
        }
        AccessibilityEvent g = g(i, i2);
        if (num != null) {
            g.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            g.setContentDescription(l30.a(list, ",", null, 62));
        }
        return u(g);
    }

    public final void x(int i, int i2, String str) {
        AccessibilityEvent g = g(s(i), 32);
        g.setContentChangeTypes(i2);
        if (str != null) {
            g.getText().add(str);
        }
        u(g);
    }

    public final void y(int i) {
        k3 k3Var = this.B;
        if (k3Var != null) {
            rp0 rp0Var = k3Var.a;
            if (i != rp0Var.g) {
                return;
            }
            if (SystemClock.uptimeMillis() - k3Var.f <= 1000) {
                AccessibilityEvent g = g(s(rp0Var.g), 131072);
                g.setFromIndex(k3Var.d);
                g.setToIndex(k3Var.e);
                g.setAction(k3Var.b);
                g.setMovementGranularity(k3Var.c);
                g.getText().add(m(rp0Var));
                u(g);
            }
        }
        this.B = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x04be, code lost:
    
        if (r1.isEmpty() == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x04ed, code lost:
    
        if (r12 != null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04f2, code lost:
    
        if (r12 == null) goto L243;
     */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(zy zyVar) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        Integer num;
        int i;
        int i2;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i3;
        int i4;
        Integer num2;
        np0 np0Var;
        rp0 rp0Var;
        boolean z;
        int i5;
        boolean z2;
        boolean z3;
        a70 a70Var;
        p10 p10Var;
        int i6;
        np0 np0Var2;
        ArrayList arrayList3;
        long j;
        int i7;
        int i8;
        p10 p10Var2;
        Integer num3;
        int i9;
        a70 a70Var2;
        int i10;
        int i11;
        co0 co0Var;
        boolean z4;
        co0 co0Var2;
        boolean z5;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        a70 a70Var3;
        Integer num4;
        AccessibilityEvent i16;
        Integer num5;
        zy zyVar2 = zyVar;
        ArrayList arrayList4 = this.O;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = zyVar2.b;
        long[] jArr3 = zyVar2.a;
        int i17 = 2;
        int length = jArr3.length - 2;
        int i18 = 0;
        Integer num6 = 0;
        if (length < 0) {
            return;
        }
        int i19 = 0;
        while (true) {
            long j2 = jArr3[i19];
            int i20 = i17;
            int i21 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i22 = 8;
                int i23 = 8 - ((~(i19 - i21)) >>> 31);
                long j3 = j2;
                int i24 = i18;
                while (i24 < i23) {
                    if ((j3 & 255) < 128) {
                        int i25 = iArr3[(i19 << 3) + i24];
                        sp0 sp0Var = (sp0) this.J.b(i25);
                        if (sp0Var != null) {
                            np0 np0Var3 = sp0Var.a;
                            a70 a70Var4 = np0Var3.d;
                            tp0 tp0Var = (tp0) zyVar2.b(i25);
                            int i26 = i22;
                            rp0 rp0Var2 = tp0Var != null ? tp0Var.a : null;
                            if (rp0Var2 == null) {
                                throw y6.u("no value for specified key");
                            }
                            p10 p10Var3 = rp0Var2.c;
                            np0 np0Var4 = rp0Var2.d;
                            iArr2 = iArr3;
                            int i27 = rp0Var2.g;
                            jArr2 = jArr3;
                            a70 a70Var5 = np0Var4.d;
                            i4 = i19;
                            Object[] objArr = a70Var5.b;
                            Object[] objArr2 = a70Var5.c;
                            long[] jArr4 = a70Var5.a;
                            i2 = i24;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                p10 p10Var4 = p10Var3;
                                i3 = i23;
                                int i28 = 0;
                                z2 = false;
                                while (true) {
                                    long j4 = jArr4[i28];
                                    rp0Var = rp0Var2;
                                    int i29 = i28;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                        int i31 = 0;
                                        while (i31 < i30) {
                                            if ((j4 & 255) < 128) {
                                                int i32 = (i29 << 3) + i31;
                                                Object obj = objArr[i32];
                                                int i33 = length2;
                                                Object obj2 = objArr2[i32];
                                                np0Var2 = np0Var3;
                                                yp0 yp0Var = (yp0) obj;
                                                j = j4;
                                                yp0 yp0Var2 = vp0.t;
                                                if (nz.l(yp0Var, yp0Var2) || nz.l(yp0Var, vp0.u)) {
                                                    int size = arrayList5.size();
                                                    i8 = i31;
                                                    int i34 = 0;
                                                    while (true) {
                                                        if (i34 >= size) {
                                                            co0Var = null;
                                                            break;
                                                        }
                                                        int i35 = size;
                                                        if (((co0) arrayList5.get(i34)).d == i25) {
                                                            co0Var = (co0) arrayList5.get(i34);
                                                            break;
                                                        } else {
                                                            i34++;
                                                            size = i35;
                                                        }
                                                    }
                                                    if (co0Var != null) {
                                                        z4 = false;
                                                    } else {
                                                        co0Var = new co0(i25, arrayList4);
                                                        z4 = true;
                                                    }
                                                    arrayList4.add(co0Var);
                                                } else {
                                                    i8 = i31;
                                                    z4 = false;
                                                }
                                                if (!z4) {
                                                    Object g = a70Var4.g(yp0Var);
                                                    if (g == null) {
                                                        g = null;
                                                    }
                                                    if (nz.l(obj2, g)) {
                                                        i9 = i25;
                                                        arrayList3 = arrayList5;
                                                        i7 = i30;
                                                        i10 = i26;
                                                        p10Var2 = p10Var4;
                                                        num3 = num6;
                                                        a70Var2 = a70Var4;
                                                        i11 = i33;
                                                    }
                                                }
                                                yp0 yp0Var3 = vp0.d;
                                                if (nz.l(yp0Var, yp0Var3)) {
                                                    obj2.getClass();
                                                    String str2 = (String) obj2;
                                                    if (a70Var4.c(yp0Var3)) {
                                                        x(i25, i26, str2);
                                                    }
                                                    i9 = i25;
                                                    arrayList3 = arrayList5;
                                                    i7 = i30;
                                                    p10Var2 = p10Var4;
                                                    i10 = 8;
                                                    num3 = num6;
                                                    a70Var2 = a70Var4;
                                                    i11 = i33;
                                                } else if (nz.l(yp0Var, vp0.b) || nz.l(yp0Var, vp0.G)) {
                                                    i9 = i25;
                                                    arrayList3 = arrayList5;
                                                    i7 = i30;
                                                    p10Var2 = p10Var4;
                                                    num3 = num6;
                                                    a70Var2 = a70Var4;
                                                    i11 = i33;
                                                    i10 = 8;
                                                    w(this, s(i9), 2048, 64, 8);
                                                    w(this, s(i9), 2048, num3, 8);
                                                } else if (nz.l(yp0Var, vp0.c)) {
                                                    w(this, s(i25), 2048, 64, 8);
                                                    w(this, s(i25), 2048, num6, 8);
                                                    i9 = i25;
                                                    arrayList3 = arrayList5;
                                                    i10 = 8;
                                                    i7 = i30;
                                                    p10Var2 = p10Var4;
                                                    num3 = num6;
                                                    a70Var2 = a70Var4;
                                                    i11 = i33;
                                                } else {
                                                    yp0 yp0Var4 = vp0.F;
                                                    arrayList3 = arrayList5;
                                                    if (nz.l(yp0Var, yp0Var4)) {
                                                        Object g2 = a70Var5.g(vp0.w);
                                                        if (g2 == null) {
                                                            g2 = null;
                                                        }
                                                        tl0 tl0Var = (tl0) g2;
                                                        if (tl0Var != null && tl0Var.a == 4) {
                                                            Object g3 = a70Var5.g(yp0Var4);
                                                            if (g3 == null) {
                                                                g3 = null;
                                                            }
                                                            if (nz.l(g3, Boolean.TRUE)) {
                                                                AccessibilityEvent g4 = g(s(i25), 4);
                                                                rp0 rp0Var3 = rp0Var;
                                                                p10Var2 = p10Var4;
                                                                rp0 rp0Var4 = new rp0(rp0Var3.a, true, p10Var2, np0Var4);
                                                                Object g5 = rp0Var4.k().d.g(vp0.a);
                                                                if (g5 == null) {
                                                                    g5 = null;
                                                                }
                                                                List list = (List) g5;
                                                                rp0Var = rp0Var3;
                                                                String a = list != null ? l30.a(list, ",", null, 62) : null;
                                                                Object g6 = rp0Var4.k().d.g(vp0.z);
                                                                if (g6 == null) {
                                                                    g6 = null;
                                                                }
                                                                List list2 = (List) g6;
                                                                i7 = i30;
                                                                String a2 = list2 != null ? l30.a(list2, ",", null, 62) : null;
                                                                if (a != null) {
                                                                    g4.setContentDescription(a);
                                                                }
                                                                if (a2 != null) {
                                                                    g4.getText().add(a2);
                                                                }
                                                                u(g4);
                                                            } else {
                                                                i7 = i30;
                                                                p10Var2 = p10Var4;
                                                                w(this, s(i25), 2048, num6, 8);
                                                            }
                                                        } else {
                                                            i7 = i30;
                                                            p10Var2 = p10Var4;
                                                            w(this, s(i25), 2048, 64, 8);
                                                            w(this, s(i25), 2048, num6, 8);
                                                        }
                                                    } else {
                                                        i7 = i30;
                                                        p10Var2 = p10Var4;
                                                        if (nz.l(yp0Var, vp0.a)) {
                                                            int s = s(i25);
                                                            obj2.getClass();
                                                            v(s, 2048, 4, (List) obj2);
                                                        } else {
                                                            yp0 yp0Var5 = vp0.D;
                                                            String str3 = "";
                                                            if (!nz.l(yp0Var, yp0Var5)) {
                                                                Integer num7 = num6;
                                                                i9 = i25;
                                                                a70Var2 = a70Var4;
                                                                yp0 yp0Var6 = vp0.E;
                                                                if (nz.l(yp0Var, yp0Var6)) {
                                                                    Object g7 = a70Var5.g(yp0Var5);
                                                                    if (g7 == null) {
                                                                        g7 = null;
                                                                    }
                                                                    l7 l7Var = (l7) g7;
                                                                    if (l7Var != null && (str = l7Var.e) != null) {
                                                                        str3 = str;
                                                                    }
                                                                    long j5 = ((xv0) np0Var4.b(yp0Var6)).a;
                                                                    num3 = num7;
                                                                    u(i(s(i9), Integer.valueOf((int) (j5 >> 32)), Integer.valueOf((int) (j5 & 4294967295L)), Integer.valueOf(str3.length()), G(str3)));
                                                                    y(i27);
                                                                    i11 = i33;
                                                                    i10 = 8;
                                                                } else {
                                                                    i11 = i33;
                                                                    num3 = num7;
                                                                    if (nz.l(yp0Var, yp0Var2) || nz.l(yp0Var, vp0.u)) {
                                                                        o(p10Var2);
                                                                        int size2 = arrayList4.size();
                                                                        int i36 = 0;
                                                                        while (true) {
                                                                            if (i36 >= size2) {
                                                                                co0Var2 = null;
                                                                                break;
                                                                            } else {
                                                                                if (((co0) arrayList4.get(i36)).d == i9) {
                                                                                    co0Var2 = (co0) arrayList4.get(i36);
                                                                                    break;
                                                                                }
                                                                                i36++;
                                                                            }
                                                                        }
                                                                        co0Var2.getClass();
                                                                        Object g8 = a70Var5.g(yp0Var2);
                                                                        if (g8 == null) {
                                                                            g8 = null;
                                                                        }
                                                                        co0Var2.h = (zn0) g8;
                                                                        Object g9 = a70Var5.g(vp0.u);
                                                                        if (g9 == null) {
                                                                            g9 = null;
                                                                        }
                                                                        co0Var2.i = (zn0) g9;
                                                                        if (co0Var2.e.contains(co0Var2)) {
                                                                            this.d.getSnapshotObserver().a(co0Var2, this.P, new a3(1, co0Var2, this));
                                                                        }
                                                                        i10 = 8;
                                                                    } else if (nz.l(yp0Var, vp0.k)) {
                                                                        obj2.getClass();
                                                                        if (((Boolean) obj2).booleanValue()) {
                                                                            i12 = 8;
                                                                            u(g(s(i27), 8));
                                                                        } else {
                                                                            i12 = 8;
                                                                        }
                                                                        w(this, s(i27), 2048, num3, i12);
                                                                        i10 = i12;
                                                                    } else {
                                                                        yp0 yp0Var7 = mp0.u;
                                                                        if (nz.l(yp0Var, yp0Var7)) {
                                                                            List list3 = (List) np0Var4.b(yp0Var7);
                                                                            Object g10 = a70Var2.g(yp0Var7);
                                                                            if (g10 == null) {
                                                                                g10 = null;
                                                                            }
                                                                            List list4 = (List) g10;
                                                                            if (list4 != null) {
                                                                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                if (list3.size() > 0) {
                                                                                    list3.get(0).getClass();
                                                                                    g8.q();
                                                                                    return;
                                                                                }
                                                                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                if (list4.size() > 0) {
                                                                                    list4.get(0).getClass();
                                                                                    g8.q();
                                                                                    return;
                                                                                }
                                                                                z2 = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? false : true;
                                                                            }
                                                                            i10 = 8;
                                                                        } else {
                                                                            if (obj2 instanceof h0) {
                                                                                h0 h0Var = (h0) obj2;
                                                                                Object g11 = a70Var2.g(yp0Var);
                                                                                if (g11 == null) {
                                                                                    g11 = null;
                                                                                }
                                                                                if (h0Var != g11) {
                                                                                    if (g11 instanceof h0) {
                                                                                        String str4 = h0Var.a;
                                                                                        h0 h0Var2 = (h0) g11;
                                                                                        yu yuVar = h0Var2.b;
                                                                                        if (nz.l(str4, h0Var2.a)) {
                                                                                            yu yuVar2 = h0Var.b;
                                                                                            if (yuVar2 == null) {
                                                                                            }
                                                                                            if (yuVar2 != null) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5 = false;
                                                                                    if (z5) {
                                                                                        z2 = false;
                                                                                        i10 = 8;
                                                                                    }
                                                                                }
                                                                                z5 = true;
                                                                                if (z5) {
                                                                                }
                                                                            }
                                                                            z2 = true;
                                                                            i10 = 8;
                                                                        }
                                                                    }
                                                                }
                                                            } else if (a70Var5.c(mp0.i)) {
                                                                Object g12 = a70Var4.g(yp0Var5);
                                                                if (g12 == null) {
                                                                    g12 = null;
                                                                }
                                                                l7 l7Var2 = (l7) g12;
                                                                if (l7Var2 == null) {
                                                                    l7Var2 = "";
                                                                }
                                                                Object g13 = a70Var5.g(yp0Var5);
                                                                if (g13 == null) {
                                                                    g13 = null;
                                                                }
                                                                CharSequence charSequence = (l7) g13;
                                                                if (charSequence == null) {
                                                                    charSequence = "";
                                                                }
                                                                CharSequence G = G(charSequence);
                                                                int length3 = l7Var2.length();
                                                                int length4 = charSequence.length();
                                                                int i37 = length3 > length4 ? length4 : length3;
                                                                Integer num8 = num6;
                                                                int i38 = 0;
                                                                while (true) {
                                                                    i13 = length3;
                                                                    if (i38 >= i37) {
                                                                        i14 = length4;
                                                                        break;
                                                                    }
                                                                    i14 = length4;
                                                                    if (l7Var2.charAt(i38) != charSequence.charAt(i38)) {
                                                                        break;
                                                                    }
                                                                    i38++;
                                                                    length3 = i13;
                                                                    length4 = i14;
                                                                }
                                                                int i39 = 0;
                                                                while (true) {
                                                                    if (i39 >= i37 - i38) {
                                                                        i15 = i39;
                                                                        break;
                                                                    }
                                                                    i15 = i39;
                                                                    if (l7Var2.charAt((i13 - 1) - i39) != charSequence.charAt((i14 - 1) - i15)) {
                                                                        break;
                                                                    } else {
                                                                        i39 = i15 + 1;
                                                                    }
                                                                }
                                                                int i40 = (i13 - i15) - i38;
                                                                int i41 = (i14 - i15) - i38;
                                                                yp0 yp0Var8 = vp0.H;
                                                                boolean c = a70Var4.c(yp0Var8);
                                                                boolean c2 = a70Var5.c(yp0Var8);
                                                                boolean c3 = a70Var4.c(vp0.D);
                                                                boolean z6 = c3 && !c && c2;
                                                                boolean z7 = c3 && c && !c2;
                                                                if (z6 || z7) {
                                                                    a70Var3 = a70Var4;
                                                                    i9 = i25;
                                                                    num4 = num8;
                                                                    i16 = i(s(i25), num4, num8, Integer.valueOf(i14), G);
                                                                } else {
                                                                    a70Var3 = a70Var4;
                                                                    i16 = g(s(i25), 16);
                                                                    i16.setFromIndex(i38);
                                                                    i16.setRemovedCount(i40);
                                                                    i16.setAddedCount(i41);
                                                                    i16.setBeforeText(l7Var2);
                                                                    i16.getText().add(G);
                                                                    i9 = i25;
                                                                    num4 = num8;
                                                                }
                                                                i16.setClassName("android.widget.EditText");
                                                                u(i16);
                                                                if (z6 || z7) {
                                                                    long j6 = ((xv0) np0Var4.b(vp0.E)).a;
                                                                    num5 = num4;
                                                                    i16.setFromIndex((int) (j6 >> 32));
                                                                    i16.setToIndex((int) (j6 & 4294967295L));
                                                                    u(i16);
                                                                } else {
                                                                    num5 = num4;
                                                                }
                                                                i11 = i33;
                                                                num3 = num5;
                                                                a70Var2 = a70Var3;
                                                                i10 = 8;
                                                            } else {
                                                                Integer num9 = num6;
                                                                i9 = i25;
                                                                w(this, s(i9), 2048, Integer.valueOf(i20), 8);
                                                                i10 = 8;
                                                                i11 = i33;
                                                                num3 = num9;
                                                                a70Var2 = a70Var4;
                                                            }
                                                        }
                                                    }
                                                    num3 = num6;
                                                    i9 = i25;
                                                    a70Var2 = a70Var4;
                                                    i11 = i33;
                                                    i10 = 8;
                                                }
                                            } else {
                                                np0Var2 = np0Var3;
                                                arrayList3 = arrayList5;
                                                j = j4;
                                                i7 = i30;
                                                i8 = i31;
                                                p10Var2 = p10Var4;
                                                num3 = num6;
                                                i9 = i25;
                                                a70Var2 = a70Var4;
                                                i10 = i26;
                                                i11 = length2;
                                            }
                                            long j7 = j >> i10;
                                            i26 = i10;
                                            i25 = i9;
                                            p10Var4 = p10Var2;
                                            i31 = i8 + 1;
                                            length2 = i11;
                                            j4 = j7;
                                            num6 = num3;
                                            a70Var4 = a70Var2;
                                            i30 = i7;
                                            np0Var3 = np0Var2;
                                            arrayList5 = arrayList3;
                                        }
                                        i5 = i25;
                                        np0Var = np0Var3;
                                        arrayList2 = arrayList5;
                                        p10Var = p10Var4;
                                        z = true;
                                        num2 = num6;
                                        i6 = length2;
                                        int i42 = i30;
                                        a70Var = a70Var4;
                                        if (i42 != i26) {
                                            break;
                                        }
                                    } else {
                                        i5 = i25;
                                        np0Var = np0Var3;
                                        a70Var = a70Var4;
                                        arrayList2 = arrayList5;
                                        p10Var = p10Var4;
                                        z = true;
                                        num2 = num6;
                                        i6 = length2;
                                    }
                                    if (i29 == i6) {
                                        break;
                                    }
                                    i25 = i5;
                                    a70Var4 = a70Var;
                                    p10Var4 = p10Var;
                                    rp0Var2 = rp0Var;
                                    np0Var3 = np0Var;
                                    i26 = 8;
                                    i28 = i29 + 1;
                                    length2 = i6;
                                    num6 = num2;
                                    arrayList5 = arrayList2;
                                }
                            } else {
                                np0Var = np0Var3;
                                arrayList2 = arrayList5;
                                i3 = i23;
                                rp0Var = rp0Var2;
                                z = true;
                                num2 = num6;
                                i5 = i25;
                                z2 = false;
                            }
                            if (!z2) {
                                Iterator it = np0Var.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z3 = false;
                                        break;
                                    } else {
                                        if (!rp0Var.k().d.c((yp0) ((Map.Entry) it.next()).getKey())) {
                                            z3 = z;
                                            break;
                                        }
                                    }
                                }
                                z2 = z3;
                            }
                            if (z2) {
                                i22 = 8;
                                w(this, s(i5), 2048, num2, 8);
                            } else {
                                i22 = 8;
                            }
                            j3 >>= i22;
                            i24 = i2 + 1;
                            zyVar2 = zyVar;
                            num6 = num2;
                            iArr3 = iArr2;
                            jArr3 = jArr2;
                            i19 = i4;
                            i23 = i3;
                            arrayList5 = arrayList2;
                        }
                    }
                    i2 = i24;
                    arrayList2 = arrayList5;
                    iArr2 = iArr3;
                    jArr2 = jArr3;
                    i3 = i23;
                    i4 = i19;
                    num2 = num6;
                    j3 >>= i22;
                    i24 = i2 + 1;
                    zyVar2 = zyVar;
                    num6 = num2;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i19 = i4;
                    i23 = i3;
                    arrayList5 = arrayList2;
                }
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                int i43 = i19;
                num = num6;
                if (i23 != i22) {
                    return;
                } else {
                    i = i43;
                }
            } else {
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                num = num6;
                i = i19;
            }
            if (i == i21) {
                return;
            }
            i19 = i + 1;
            zyVar2 = zyVar;
            length = i21;
            num6 = num;
            i17 = i20;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            i18 = 0;
        }
    }
}
