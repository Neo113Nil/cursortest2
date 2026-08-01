package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class d1 extends AccessibilityNodeProvider {
    public final j3 a;

    public d1(j3 j3Var) {
        this.a = j3Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        c1 f = this.a.f(i);
        if (f == null) {
            return null;
        }
        return f.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        c1 f;
        j3 j3Var = this.a;
        n3 n3Var = (n3) j3Var.f;
        if (i == 1) {
            int i2 = n3Var.o;
            if (i2 != Integer.MIN_VALUE) {
                f = j3Var.f(i2);
            }
            f = null;
        } else if (i == 2) {
            f = j3Var.f(n3Var.n);
        } else {
            g8.f("Unknown focus type: ", i);
            f = null;
        }
        if (f == null) {
            return null;
        }
        return f.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 34 ? defpackage.l0.e(r4) : true) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02e8, code lost:
    
        if (((java.lang.Boolean) r0.invoke(java.lang.Float.valueOf(r2), java.lang.Float.valueOf(r5))).booleanValue() == true) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x01b3, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x06dc, code lost:
    
        if (r0 != 16) goto L485;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x078d  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAction(int i, int i2, Bundle bundle) {
        boolean z;
        rp0 rp0Var;
        boolean z2;
        int i3;
        Integer num;
        m0 m0Var;
        int i4;
        int i5;
        sv0 i6;
        bu buVar;
        bu buVar2;
        bu buVar3;
        bu buVar4;
        Float f;
        boolean z3;
        h0 h0Var;
        bu buVar5;
        float intBitsToFloat;
        h0 h0Var2;
        bu buVar6;
        mu muVar;
        bu buVar7;
        bu buVar8;
        bu buVar9;
        bu buVar10;
        bu buVar11;
        mu muVar2;
        h0 h0Var3;
        long j;
        Object g;
        float f2;
        float f3;
        mu muVar3;
        bu buVar12;
        bu buVar13;
        bu buVar14;
        bu buVar15;
        bu buVar16;
        n3 n3Var = (n3) this.a.f;
        AccessibilityManager accessibilityManager = n3Var.g;
        Float valueOf = Float.valueOf(0.0f);
        f3 f3Var = n3Var.d;
        tp0 tp0Var = (tp0) n3Var.l().b(i);
        if (tp0Var != null && (rp0Var = tp0Var.a) != null) {
            p10 p10Var = rp0Var.c;
            int i7 = rp0Var.g;
            np0 np0Var = rp0Var.d;
            a70 a70Var = np0Var.d;
            Object g2 = a70Var.g(vp0.n);
            if (g2 == null) {
                g2 = null;
            }
            Boolean bool = Boolean.TRUE;
            if (nz.l(g2, bool)) {
            }
            if (i2 == 64) {
                z2 = true;
                z = false;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                    int i8 = n3Var.n;
                    if (!(i8 == i)) {
                        if (i8 != Integer.MIN_VALUE) {
                            i3 = 12;
                            num = null;
                            n3.w(n3Var, i8, 65536, null, 12);
                        } else {
                            i3 = 12;
                            num = null;
                        }
                        n3Var.n = i;
                        f3Var.invalidate();
                        n3.w(n3Var, i, 32768, num, i3);
                        return z2;
                    }
                }
                return z;
            }
            if (i2 == 128) {
                z2 = true;
                z = false;
                if (n3Var.n == i) {
                    n3Var.n = Integer.MIN_VALUE;
                    n3Var.p = null;
                    f3Var.invalidate();
                    n3.w(n3Var, i, 65536, null, 12);
                }
                return z;
            }
            if (i2 == 256 || i2 == 512) {
                if (bundle != null) {
                    int i9 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                    boolean z4 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                    boolean z5 = i2 == 256;
                    Integer num2 = n3Var.x;
                    if (num2 == null || i7 != num2.intValue()) {
                        n3Var.w = -1;
                        n3Var.x = Integer.valueOf(i7);
                    }
                    String m = n3.m(rp0Var);
                    if (m != null && m.length() != 0) {
                        String m2 = n3.m(rp0Var);
                        if (m2 != null && m2.length() != 0) {
                            if (i9 == 1) {
                                Locale locale = f3Var.getContext().getResources().getConfiguration().locale;
                                if (n0.e == null) {
                                    n0 n0Var = new n0(0);
                                    n0Var.d = BreakIterator.getCharacterInstance(locale);
                                    n0.e = n0Var;
                                }
                                n0 n0Var2 = n0.e;
                                n0Var2.getClass();
                                n0Var2.f(m2);
                                m0Var = n0Var2;
                            } else if (i9 != 2) {
                                if (i9 != 4) {
                                    if (i9 == 8) {
                                        if (p0.c == null) {
                                            p0.c = new p0();
                                        }
                                        p0 p0Var = p0.c;
                                        p0Var.getClass();
                                        p0Var.a = m2;
                                        m0Var = p0Var;
                                    }
                                }
                                if (a70Var.c(mp0.a) && (i6 = ld0.i(np0Var)) != null) {
                                    if (i9 == 4) {
                                        if (n0.g == null) {
                                            n0.g = new n0(2);
                                        }
                                        n0 n0Var3 = n0.g;
                                        n0Var3.getClass();
                                        n0Var3.a = m2;
                                        n0Var3.d = i6;
                                        m0Var = n0Var3;
                                    } else {
                                        if (o0.e == null) {
                                            o0 o0Var = new o0();
                                            new Rect();
                                            o0.e = o0Var;
                                        }
                                        o0 o0Var2 = o0.e;
                                        o0Var2.getClass();
                                        o0Var2.a = m2;
                                        o0Var2.c = i6;
                                        o0Var2.d = rp0Var;
                                        m0Var = o0Var2;
                                    }
                                }
                            } else {
                                Locale locale2 = f3Var.getContext().getResources().getConfiguration().locale;
                                if (n0.f == null) {
                                    n0 n0Var4 = new n0(r15);
                                    n0Var4.d = BreakIterator.getWordInstance(locale2);
                                    n0.f = n0Var4;
                                }
                                n0 n0Var5 = n0.f;
                                n0Var5.getClass();
                                n0Var5.f(m2);
                                m0Var = n0Var5;
                            }
                            if (m0Var != null) {
                                int j2 = n3Var.j(rp0Var);
                                if (j2 == -1) {
                                    j2 = z5 ? 0 : m.length();
                                }
                                int[] a = z5 ? m0Var.a(j2) : m0Var.d(j2);
                                if (a != null) {
                                    int i10 = a[0];
                                    int i11 = a[1];
                                    if (z4 && !a70Var.c(vp0.a) && a70Var.c(vp0.D)) {
                                        i4 = n3Var.k(rp0Var);
                                        if (i4 == -1) {
                                            i4 = z5 ? i10 : i11;
                                        }
                                        i5 = z5 ? i11 : i10;
                                    } else {
                                        i4 = z5 ? i11 : i10;
                                        i5 = i4;
                                    }
                                    int i12 = z5 ? 256 : 512;
                                    z2 = true;
                                    n3Var.B = new k3(rp0Var, i12, i9, i10, i11, SystemClock.uptimeMillis());
                                    n3Var.C(rp0Var, i4, i5, true);
                                }
                            }
                        }
                        m0Var = null;
                        if (m0Var != null) {
                        }
                    }
                }
            } else if (i2 == 16384) {
                Object g3 = a70Var.g(mp0.n);
                h0 h0Var4 = (h0) (g3 == null ? null : g3);
                if (h0Var4 != null && (buVar = (bu) h0Var4.b) != null) {
                    return ((Boolean) buVar.a()).booleanValue();
                }
            } else {
                if (i2 == 131072) {
                    boolean C = n3Var.C(rp0Var, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                    if (C) {
                        n3.w(n3Var, n3Var.s(i7), 0, null, 12);
                    }
                    return C;
                }
                if (a50.f(rp0Var)) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            c10 c10Var = c10.e;
                            switch (i2) {
                                case 16:
                                    Object g4 = a70Var.g(mp0.b);
                                    if (g4 == null) {
                                        g4 = null;
                                    }
                                    h0 h0Var5 = (h0) g4;
                                    Boolean bool2 = (h0Var5 == null || (buVar3 = (bu) h0Var5.b) == null) ? null : (Boolean) buVar3.a();
                                    n3.w(n3Var, i, 1, null, 12);
                                    if (bool2 != null) {
                                        return bool2.booleanValue();
                                    }
                                    break;
                                case 32:
                                    Object g5 = a70Var.g(mp0.c);
                                    h0 h0Var6 = (h0) (g5 == null ? null : g5);
                                    if (h0Var6 != null && (buVar4 = (bu) h0Var6.b) != null) {
                                        return ((Boolean) buVar4.a()).booleanValue();
                                    }
                                    break;
                                case 4096:
                                case 8192:
                                    boolean z6 = i2 == 4096;
                                    boolean z7 = i2 == 8192;
                                    boolean z8 = i2 == 16908345;
                                    boolean z9 = i2 == 16908347;
                                    boolean z10 = i2 == 16908344;
                                    boolean z11 = i2 == 16908346;
                                    boolean z12 = z8 || z9 || z6 || z7;
                                    boolean z13 = z10 || z11 || z6 || z7;
                                    if (z6 || z7) {
                                        Object g6 = a70Var.g(vp0.c);
                                        if (g6 == null) {
                                            g6 = null;
                                        }
                                        di0 di0Var = (di0) g6;
                                        Object g7 = a70Var.g(mp0.g);
                                        if (g7 == null) {
                                            g7 = null;
                                        }
                                        h0 h0Var7 = (h0) g7;
                                        if (di0Var != null && h0Var7 != null) {
                                            float f4 = z7 ? -0.0f : 0.0f;
                                            mu muVar4 = (mu) h0Var7.b;
                                            if (muVar4 != null) {
                                                return ((Boolean) muVar4.c(Float.valueOf(0.0f + f4))).booleanValue();
                                            }
                                        }
                                    }
                                    long b = mz.s((iy) p10Var.F.g).b();
                                    ArrayList arrayList = new ArrayList();
                                    Object g8 = a70Var.g(mp0.z);
                                    if (g8 == null) {
                                        g8 = null;
                                    }
                                    h0 h0Var8 = (h0) g8;
                                    Float f5 = (h0Var8 == null || (muVar = (mu) h0Var8.b) == null || !((Boolean) muVar.c(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                    Object g9 = a70Var.g(mp0.d);
                                    if (g9 == null) {
                                        g9 = null;
                                    }
                                    h0 h0Var9 = (h0) g9;
                                    if (h0Var9 != null) {
                                        yu yuVar = h0Var9.b;
                                        Object g10 = a70Var.g(vp0.t);
                                        if (g10 == null) {
                                            g10 = null;
                                        }
                                        zn0 zn0Var = (zn0) g10;
                                        if (zn0Var == null || !z12) {
                                            f = f5;
                                            z3 = z13;
                                        } else {
                                            if (f5 != null) {
                                                intBitsToFloat = f5.floatValue();
                                                f = f5;
                                                z3 = z13;
                                            } else {
                                                f = f5;
                                                z3 = z13;
                                                intBitsToFloat = Float.intBitsToFloat((int) (b >> 32));
                                            }
                                            if (z8 || z7) {
                                                intBitsToFloat = -intBitsToFloat;
                                            }
                                            if ((p10Var.z != c10Var ? 0 : 1) != 0 && (z8 || z9)) {
                                                intBitsToFloat = -intBitsToFloat;
                                            }
                                            if (n3.p(zn0Var, intBitsToFloat)) {
                                                yp0 yp0Var = mp0.w;
                                                if (a70Var.c(yp0Var) || a70Var.c(mp0.y)) {
                                                    if (intBitsToFloat > 0.0f) {
                                                        Object g11 = a70Var.g(mp0.y);
                                                        h0Var2 = (h0) (g11 == null ? null : g11);
                                                    } else {
                                                        Object g12 = a70Var.g(yp0Var);
                                                        h0Var2 = (h0) (g12 == null ? null : g12);
                                                    }
                                                    if (h0Var2 != null && (buVar6 = (bu) h0Var2.b) != null) {
                                                        return ((Boolean) buVar6.a()).booleanValue();
                                                    }
                                                } else {
                                                    qu quVar = (qu) yuVar;
                                                    if (quVar != null) {
                                                        return ((Boolean) quVar.invoke(Float.valueOf(intBitsToFloat), valueOf)).booleanValue();
                                                    }
                                                }
                                            }
                                        }
                                        Object g13 = a70Var.g(vp0.u);
                                        if (g13 == null) {
                                            g13 = null;
                                        }
                                        zn0 zn0Var2 = (zn0) g13;
                                        if (zn0Var2 != null && z3) {
                                            float floatValue = f != null ? f.floatValue() : Float.intBitsToFloat((int) (4294967295L & b));
                                            if (z10 || z7) {
                                                floatValue = -floatValue;
                                            }
                                            if (n3.p(zn0Var2, floatValue)) {
                                                yp0 yp0Var2 = mp0.v;
                                                if (a70Var.c(yp0Var2) || a70Var.c(mp0.x)) {
                                                    if (floatValue > 0.0f) {
                                                        Object g14 = a70Var.g(mp0.x);
                                                        h0Var = (h0) (g14 == null ? null : g14);
                                                    } else {
                                                        Object g15 = a70Var.g(yp0Var2);
                                                        h0Var = (h0) (g15 == null ? null : g15);
                                                    }
                                                    if (h0Var != null && (buVar5 = (bu) h0Var.b) != null) {
                                                        return ((Boolean) buVar5.a()).booleanValue();
                                                    }
                                                } else {
                                                    qu quVar2 = (qu) yuVar;
                                                    if (quVar2 != null) {
                                                        return ((Boolean) quVar2.invoke(valueOf, Float.valueOf(floatValue))).booleanValue();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 32768:
                                    Object g16 = a70Var.g(mp0.p);
                                    h0 h0Var10 = (h0) (g16 == null ? null : g16);
                                    if (h0Var10 != null && (buVar7 = (bu) h0Var10.b) != null) {
                                        return ((Boolean) buVar7.a()).booleanValue();
                                    }
                                    break;
                                case 65536:
                                    Object g17 = a70Var.g(mp0.o);
                                    h0 h0Var11 = (h0) (g17 == null ? null : g17);
                                    if (h0Var11 != null && (buVar8 = (bu) h0Var11.b) != null) {
                                        return ((Boolean) buVar8.a()).booleanValue();
                                    }
                                    break;
                                case 262144:
                                    Object g18 = a70Var.g(mp0.q);
                                    h0 h0Var12 = (h0) (g18 == null ? null : g18);
                                    if (h0Var12 != null && (buVar9 = (bu) h0Var12.b) != null) {
                                        return ((Boolean) buVar9.a()).booleanValue();
                                    }
                                    break;
                                case 524288:
                                    Object g19 = a70Var.g(mp0.r);
                                    h0 h0Var13 = (h0) (g19 == null ? null : g19);
                                    if (h0Var13 != null && (buVar10 = (bu) h0Var13.b) != null) {
                                        return ((Boolean) buVar10.a()).booleanValue();
                                    }
                                    break;
                                case 1048576:
                                    Object g20 = a70Var.g(mp0.s);
                                    h0 h0Var14 = (h0) (g20 == null ? null : g20);
                                    if (h0Var14 != null && (buVar11 = (bu) h0Var14.b) != null) {
                                        return ((Boolean) buVar11.a()).booleanValue();
                                    }
                                    break;
                                case 2097152:
                                    String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                    Object g21 = a70Var.g(mp0.i);
                                    h0 h0Var15 = (h0) (g21 == null ? null : g21);
                                    if (h0Var15 != null && (muVar2 = (mu) h0Var15.b) != null) {
                                        if (string == null) {
                                            string = "";
                                        }
                                        return ((Boolean) muVar2.c(new l7(string, 0))).booleanValue();
                                    }
                                    break;
                                case R.id.accessibilityActionShowOnScreen:
                                    rp0 l = rp0Var.l();
                                    if (l != null) {
                                        Object g22 = l.d.d.g(mp0.d);
                                        if (g22 == null) {
                                            g22 = null;
                                        }
                                        h0Var3 = (h0) g22;
                                        while (l != null && h0Var3 == null) {
                                            l = l.l();
                                            if (l != null) {
                                                Object g23 = l.d.d.g(mp0.d);
                                                if (g23 == null) {
                                                    g23 = null;
                                                }
                                                h0Var3 = (h0) g23;
                                            }
                                        }
                                        if (l == null) {
                                            zi0 g24 = rp0Var.g();
                                            return f3Var.requestRectangleOnScreen(new Rect((int) Math.floor(g24.a), (int) Math.floor(g24.b), a50.H((float) Math.ceil(g24.c)), a50.H((float) Math.ceil(g24.d))));
                                        }
                                        a70 a70Var2 = l.d.d;
                                        p10 p10Var2 = l.c;
                                        zi0 s = mz.s((iy) p10Var2.F.g);
                                        b10 g25 = ((iy) p10Var2.F.g).g();
                                        zi0 e = s.e(g25 != null ? ((ea0) g25).F0(0L) : 0L);
                                        ea0 d = rp0Var.d();
                                        if (d != null) {
                                            if (!d.v0().q) {
                                                d = null;
                                            }
                                            if (d != null) {
                                                j = d.F0(0L);
                                                ea0 d2 = rp0Var.d();
                                                zi0 b2 = od0.b(j, px0.W(d2 != null ? d2.f : 0L));
                                                g = a70Var2.g(vp0.t);
                                                if (g == null) {
                                                    g = null;
                                                }
                                                Object g26 = a70Var2.g(vp0.u);
                                                f2 = b2.a - e.a;
                                                f3 = b2.c - e.c;
                                                if (Math.signum(f2) == Math.signum(f3)) {
                                                    f2 = 0.0f;
                                                } else if (Math.abs(f2) >= Math.abs(f3)) {
                                                    f2 = f3;
                                                }
                                                if (p10Var.z != c10Var) {
                                                    f2 = -f2;
                                                }
                                                float f6 = b2.b - e.b;
                                                float f7 = b2.d - e.d;
                                                float f8 = Math.signum(f6) != Math.signum(f7) ? Math.abs(f6) < Math.abs(f7) ? f6 : f7 : 0.0f;
                                                if (h0Var3 != null) {
                                                    qu quVar3 = (qu) h0Var3.b;
                                                    if (quVar3 != null) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        j = 0;
                                        ea0 d22 = rp0Var.d();
                                        zi0 b22 = od0.b(j, px0.W(d22 != null ? d22.f : 0L));
                                        g = a70Var2.g(vp0.t);
                                        if (g == null) {
                                        }
                                        Object g262 = a70Var2.g(vp0.u);
                                        f2 = b22.a - e.a;
                                        f3 = b22.c - e.c;
                                        if (Math.signum(f2) == Math.signum(f3)) {
                                        }
                                        if (p10Var.z != c10Var) {
                                        }
                                        float f62 = b22.b - e.b;
                                        float f72 = b22.d - e.d;
                                        if (Math.signum(f62) != Math.signum(f72)) {
                                        }
                                        if (h0Var3 != null) {
                                        }
                                    }
                                    h0Var3 = null;
                                    break;
                                case R.id.accessibilityActionSetProgress:
                                    if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                        Object g27 = a70Var.g(mp0.g);
                                        h0 h0Var16 = (h0) (g27 == null ? null : g27);
                                        if (h0Var16 != null && (muVar3 = (mu) h0Var16.b) != null) {
                                            return ((Boolean) muVar3.c(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                        }
                                    }
                                    break;
                                case R.id.accessibilityActionImeEnter:
                                    Object g28 = a70Var.g(mp0.m);
                                    h0 h0Var17 = (h0) (g28 == null ? null : g28);
                                    if (h0Var17 != null && (buVar12 = (bu) h0Var17.b) != null) {
                                        return ((Boolean) buVar12.a()).booleanValue();
                                    }
                                    break;
                                default:
                                    switch (i2) {
                                        case R.id.accessibilityActionScrollUp:
                                        case R.id.accessibilityActionScrollLeft:
                                        case R.id.accessibilityActionScrollDown:
                                        case R.id.accessibilityActionScrollRight:
                                            break;
                                        default:
                                            switch (i2) {
                                                case R.id.accessibilityActionPageUp:
                                                    Object g29 = a70Var.g(mp0.v);
                                                    h0 h0Var18 = (h0) (g29 == null ? null : g29);
                                                    if (h0Var18 != null && (buVar13 = (bu) h0Var18.b) != null) {
                                                        return ((Boolean) buVar13.a()).booleanValue();
                                                    }
                                                    break;
                                                case R.id.accessibilityActionPageDown:
                                                    Object g30 = a70Var.g(mp0.x);
                                                    h0 h0Var19 = (h0) (g30 == null ? null : g30);
                                                    if (h0Var19 != null && (buVar14 = (bu) h0Var19.b) != null) {
                                                        return ((Boolean) buVar14.a()).booleanValue();
                                                    }
                                                    break;
                                                case R.id.accessibilityActionPageLeft:
                                                    Object g31 = a70Var.g(mp0.w);
                                                    h0 h0Var20 = (h0) (g31 == null ? null : g31);
                                                    if (h0Var20 != null && (buVar15 = (bu) h0Var20.b) != null) {
                                                        return ((Boolean) buVar15.a()).booleanValue();
                                                    }
                                                    break;
                                                case R.id.accessibilityActionPageRight:
                                                    Object g32 = a70Var.g(mp0.y);
                                                    h0 h0Var21 = (h0) (g32 == null ? null : g32);
                                                    if (h0Var21 != null && (buVar16 = (bu) h0Var21.b) != null) {
                                                        return ((Boolean) buVar16.a()).booleanValue();
                                                    }
                                                    break;
                                                default:
                                                    ps0 ps0Var = (ps0) n3Var.u.b(i);
                                                    if (ps0Var != null && ((CharSequence) ps0Var.b(i2)) != null) {
                                                        Object g33 = a70Var.g(mp0.u);
                                                        List list = (List) (g33 == null ? null : g33);
                                                        if (list != null && list.size() > 0) {
                                                            list.get(0).getClass();
                                                            g8.q();
                                                            return false;
                                                        }
                                                    }
                                                    break;
                                            }
                                    }
                            }
                        } else {
                            Object g34 = a70Var.g(vp0.k);
                            if (g34 == null) {
                                g34 = null;
                            }
                            if (nz.l(g34, bool)) {
                                ((ks) f3Var.getFocusOwner()).b(8, false, true);
                                return true;
                            }
                        }
                        return z;
                    }
                    if (f3Var.isInTouchMode()) {
                        f3Var.requestFocusFromTouch();
                    }
                    Object g35 = a70Var.g(mp0.t);
                    h0 h0Var22 = (h0) (g35 == null ? null : g35);
                    if (h0Var22 != null && (buVar2 = (bu) h0Var22.b) != null) {
                        return ((Boolean) buVar2.a()).booleanValue();
                    }
                }
            }
            return z2;
        }
        z = false;
        return z;
    }
}
