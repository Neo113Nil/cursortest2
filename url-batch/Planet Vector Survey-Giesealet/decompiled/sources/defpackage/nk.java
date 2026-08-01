package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class nk {
    public static final op g;
    public static final op h;
    public static final op i;
    public static final op j;
    public static final op k;
    public static final j3 o;
    public static final op p;
    public static final op q;
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};
    public static final Object e = new Object();
    public static final tl f = new tl(1.0f, 1.0f);
    public static final rp l = new rp(false);
    public static final rp m = new rp(true);
    public static final StackTraceElement[] n = new StackTraceElement[0];

    static {
        int i2 = 1;
        g = new op("COMPLETING_ALREADY", i2);
        h = new op("COMPLETING_WAITING_CHILDREN", i2);
        i = new op("COMPLETING_RETRY", i2);
        j = new op("TOO_LATE_TO_CANCEL", i2);
        k = new op("SEALED", i2);
        int i3 = 12;
        o = new j3(i3, new ze(i3), new sj(7));
        p = new op("NONE", i2);
        q = new op("PENDING", i2);
    }

    public static final bn A(zz zzVar, boolean z, c00 c00Var) {
        if (zzVar instanceof g00) {
            return ((g00) zzVar).N(z, c00Var);
        }
        return zzVar.g(c00Var.k(), z, new ss(1, c00Var, c00.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 1));
    }

    public static final boolean B(rj rjVar) {
        zz zzVar = (zz) rjVar.k(b2.C);
        if (zzVar != null) {
            return zzVar.b();
        }
        return true;
    }

    public static final u50 C(ih ihVar, u50 u50Var) {
        if (u50Var.e(o1.s)) {
            return u50Var;
        }
        qh qhVar = (qh) ihVar;
        qhVar.R(1219399079, 0, null, null);
        u50 u50Var2 = (u50) u50Var.a(new j(5, qhVar), r50.a);
        qhVar.q(false);
        return u50Var2;
    }

    public static final u50 D(ih ihVar, u50 u50Var) {
        qh qhVar = (qh) ihVar;
        qhVar.V(439770924);
        u50 C = C(qhVar, u50Var);
        qhVar.q(false);
        return C;
    }

    public static final float[] E(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final float[] F(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    public static final c90 G(mu muVar) {
        d90 d90Var = new d90();
        muVar.c(d90Var);
        String str = d90Var.c;
        b90 b90Var = d90Var.a;
        if (str != null) {
            boolean z = d90Var.d;
            boolean z2 = d90Var.e;
            b90Var.b = str;
            b90Var.a = -1;
            b90Var.c = z;
            b90Var.d = z2;
        } else {
            int i2 = d90Var.b;
            boolean z3 = d90Var.d;
            boolean z4 = d90Var.e;
            b90Var.a = i2;
            b90Var.b = null;
            b90Var.c = z3;
            b90Var.d = z4;
        }
        String str2 = b90Var.b;
        if (str2 == null) {
            return new c90(false, false, b90Var.a, b90Var.c, b90Var.d, b90Var.e, b90Var.f);
        }
        boolean z5 = b90Var.c;
        boolean z6 = b90Var.d;
        int i3 = b90Var.e;
        int i4 = b90Var.f;
        int i5 = m80.l;
        c90 c90Var = new c90(false, false, "android-app://androidx.navigation/".concat(str2).hashCode(), z5, z6, i3, i4);
        c90Var.h = str2;
        return c90Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void H(t50 t50Var, bu buVar) {
        qa0 qa0Var = t50Var.j;
        if (qa0Var == null) {
            qa0Var = new qa0((pa0) t50Var);
            t50Var.j = qa0Var;
        }
        ((f3) nz.b0(t50Var)).getSnapshotObserver().a(qa0Var, j80.m, buVar);
    }

    public static final Object I(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void J(ts tsVar) {
        t50 t50Var;
        ca0 ca0Var;
        if (!tsVar.d.q) {
            cy.b("visitAncestors called on an unattached node");
        }
        t50 t50Var2 = tsVar.d.h;
        p10 a0 = nz.a0(tsVar);
        loop0: while (true) {
            t50Var = null;
            if (a0 == null) {
                break;
            }
            if ((((t50) a0.F.j).g & 1024) != 0) {
                while (t50Var2 != null) {
                    if ((t50Var2.f & 1024) != 0) {
                        t50 t50Var3 = t50Var2;
                        l70 l70Var = null;
                        while (t50Var3 != null) {
                            if (t50Var3 instanceof ts) {
                                t50Var = t50Var3;
                                break loop0;
                            }
                            if ((t50Var3.f & 1024) != 0 && (t50Var3 instanceof ol)) {
                                int i2 = 0;
                                for (t50 t50Var4 = ((ol) t50Var3).s; t50Var4 != null; t50Var4 = t50Var4.i) {
                                    if ((t50Var4.f & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            t50Var3 = t50Var4;
                                        } else {
                                            if (l70Var == null) {
                                                l70Var = new l70(new t50[16]);
                                            }
                                            if (t50Var3 != null) {
                                                l70Var.b(t50Var3);
                                                t50Var3 = null;
                                            }
                                            l70Var.b(t50Var4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            t50Var3 = nz.j(l70Var);
                        }
                    }
                    t50Var2 = t50Var2.h;
                }
            }
            a0 = a0.n();
            t50Var2 = (a0 == null || (ca0Var = a0.F) == null) ? null : (su0) ca0Var.i;
        }
        ts tsVar2 = (ts) t50Var;
        if (tsVar2 == null) {
            if (tsVar.A(l9.a) == null) {
                return;
            }
            g8.q();
            return;
        }
        ji0 ji0Var = l9.a;
        if (tsVar2.A(ji0Var) != null) {
            g8.q();
        } else {
            if (tsVar.A(ji0Var) == null) {
                return;
            }
            g8.q();
        }
    }

    public static ts0 K(int i2, Object obj) {
        float f2 = (i2 & 2) != 0 ? 1500.0f : 400.0f;
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new ts0(f2, obj);
    }

    public static final Integer L(int i2) {
        if (i2 == 5) {
            return 33;
        }
        if (i2 == 6) {
            return 130;
        }
        if (i2 == 3) {
            return 17;
        }
        if (i2 == 4) {
            return 66;
        }
        if (i2 == 1) {
            return 2;
        }
        return i2 == 2 ? 1 : null;
    }

    public static final String M(kj kjVar) {
        Object uk0Var;
        if (kjVar instanceof rm) {
            return ((rm) kjVar).toString();
        }
        try {
            uk0Var = kjVar + '@' + u(kjVar);
        } catch (Throwable th) {
            uk0Var = new uk0(th);
        }
        if (vk0.a(uk0Var) != null) {
            uk0Var = kjVar.getClass().getName() + '@' + u(kjVar);
        }
        return (String) uk0Var;
    }

    public static final bs N(int i2) {
        if (i2 == 1) {
            return new bs(2);
        }
        if (i2 == 2) {
            return new bs(1);
        }
        if (i2 == 17) {
            return new bs(3);
        }
        if (i2 == 33) {
            return new bs(5);
        }
        if (i2 == 66) {
            return new bs(4);
        }
        if (i2 != 130) {
            return null;
        }
        return new bs(6);
    }

    public static String O(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3)) {
            return "CornerRadius.circular(" + x40.V(Float.intBitsToFloat(i2)) + ')';
        }
        return "CornerRadius.elliptical(" + x40.V(Float.intBitsToFloat(i2)) + ", " + x40.V(Float.intBitsToFloat(i3)) + ')';
    }

    public static void P(g20 g20Var, in0 in0Var) {
        f20 f20Var = ((q20) g20Var).c;
        if (f20Var == f20.e || f20Var.compareTo(f20.g) >= 0) {
            in0Var.d();
        } else {
            g20Var.a(new fl(g20Var, in0Var));
        }
    }

    public static ox0 Q(int i2, int i3, ro roVar) {
        int i4 = (i3 & 2) != 0 ? 0 : 90;
        if ((i3 & 4) != 0) {
            roVar = so.a;
        }
        return new ox0(i2, i4, roVar);
    }

    public static final Object R(Object obj) {
        nx nxVar;
        ox oxVar = obj instanceof ox ? (ox) obj : null;
        return (oxVar == null || (nxVar = oxVar.a) == null) ? obj : nxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0194  */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(bu buVar, u50 u50Var, boolean z, rq0 rq0Var, ib ibVar, mb mbVar, z9 z9Var, id0 id0Var, eg egVar, ih ihVar, int i2, int i3) {
        int i4;
        mb mbVar2;
        z9 z9Var2;
        int i5;
        id0 id0Var2;
        int i6;
        int i7;
        z9 z9Var3;
        id0 id0Var3;
        mb mbVar3;
        Object K;
        Object obj;
        float f2;
        long j2;
        r60 r60Var;
        z9 z9Var4;
        b6 b6Var;
        long j3;
        boolean z2;
        id0 id0Var4;
        mb mbVar4;
        d7 d7Var;
        ?? r14;
        qh qhVar;
        id0 id0Var5;
        mb mbVar5;
        ri0 s;
        int i8;
        qh qhVar2 = (qh) ihVar;
        qhVar2.W(650121315);
        if ((i2 & 6) == 0) {
            i4 = (qhVar2.h(buVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= qhVar2.f(u50Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= qhVar2.g(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= qhVar2.f(rq0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= qhVar2.f(ibVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                mbVar2 = mbVar;
                if (qhVar2.f(mbVar2)) {
                    i8 = 131072;
                    i4 |= i8;
                }
            } else {
                mbVar2 = mbVar;
            }
            i8 = 65536;
            i4 |= i8;
        } else {
            mbVar2 = mbVar;
        }
        int i9 = i3 & 64;
        if (i9 != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i2) == 0) {
            z9Var2 = z9Var;
            i4 |= qhVar2.f(z9Var2) ? 1048576 : 524288;
            i5 = i3 & 128;
            if (i5 == 0) {
                i4 |= 12582912;
                id0Var2 = id0Var;
            } else {
                id0Var2 = id0Var;
                if ((i2 & 12582912) == 0) {
                    i4 |= qhVar2.f(id0Var2) ? 8388608 : 4194304;
                }
            }
            int i10 = i4;
            if ((i3 & 256) == 0) {
                i6 = i10 | 100663296;
            } else if ((i2 & 100663296) == 0) {
                i6 = i10 | (qhVar2.f(null) ? 67108864 : 33554432);
            } else {
                i6 = i10;
            }
            if ((i2 & 805306368) == 0) {
                i6 |= qhVar2.h(egVar) ? 536870912 : 268435456;
            }
            int i11 = i6;
            if ((i6 & 306783379) == 306783378 || !qhVar2.z()) {
                qhVar2.S();
                if ((i2 & 1) != 0 || qhVar2.x()) {
                    if ((i3 & 32) == 0) {
                        id0 id0Var6 = jb.a;
                        i7 = i11 & (-458753);
                        mbVar2 = new mb();
                    } else {
                        i7 = i11;
                    }
                    if (i9 != 0) {
                        z9Var2 = null;
                    }
                    if (i5 != 0) {
                        id0Var2 = jb.a;
                    }
                } else {
                    qhVar2.Q();
                    if ((i3 & 32) != 0) {
                        i7 = i11 & (-458753);
                    } else {
                        id0Var3 = id0Var2;
                        z9Var3 = z9Var2;
                        i7 = i11;
                        mbVar3 = mbVar2;
                        qhVar2.r();
                        qhVar2.V(-239156623);
                        K = qhVar2.K();
                        obj = hh.a;
                        if (K == obj) {
                            K = new r60();
                            qhVar2.e0(K);
                        }
                        r60 r60Var2 = (r60) K;
                        qhVar2.q(false);
                        long j4 = z ? ibVar.a : ibVar.c;
                        long j5 = z ? ibVar.b : ibVar.d;
                        qhVar2.V(-239150048);
                        if (mbVar3 == null) {
                            id0Var4 = id0Var3;
                            r60Var = r60Var2;
                            mbVar4 = mbVar3;
                            z9Var4 = z9Var3;
                            f2 = 0.0f;
                            d7Var = null;
                            r14 = 0;
                            j3 = j5;
                        } else {
                            int i12 = ((i7 >> 6) & 14) | ((i7 >> 9) & 896);
                            f2 = 0.0f;
                            Object K2 = qhVar2.K();
                            if (K2 == obj) {
                                K2 = new gs0();
                                qhVar2.e0(K2);
                            }
                            gs0 gs0Var = (gs0) K2;
                            boolean f3 = qhVar2.f(r60Var2);
                            id0 id0Var7 = id0Var3;
                            Object K3 = qhVar2.K();
                            if (f3 || K3 == obj) {
                                j2 = j5;
                                K3 = new c(r60Var2, gs0Var, null, 5);
                                qhVar2.e0(K3);
                            } else {
                                j2 = j5;
                            }
                            mz.k(qhVar2, (qu) K3, r60Var2);
                            kz kzVar = (kz) zd.i0(gs0Var);
                            float f4 = (z && !(kzVar instanceof qh0) && (kzVar instanceof ow)) ? 1.0f : 0.0f;
                            Object K4 = qhVar2.K();
                            if (K4 == obj) {
                                r60Var = r60Var2;
                                z9Var4 = z9Var3;
                                K4 = new b6(new jn(f4), dz0.c, null, 12);
                                qhVar2.e0(K4);
                            } else {
                                r60Var = r60Var2;
                                z9Var4 = z9Var3;
                            }
                            b6 b6Var2 = (b6) K4;
                            jn jnVar = new jn(f4);
                            boolean h2 = ((((i12 & 896) ^ 384) > 256 && qhVar2.f(mbVar3)) || (i12 & 384) == 256) | qhVar2.h(b6Var2) | qhVar2.c(f4) | ((((i12 & 14) ^ 6) > 4 && qhVar2.g(z)) || (i12 & 6) == 4) | qhVar2.h(kzVar);
                            Object K5 = qhVar2.K();
                            if (h2 || K5 == obj) {
                                b6Var = b6Var2;
                                j3 = j2;
                                z2 = false;
                                id0Var4 = id0Var7;
                                lb lbVar = new lb(b6Var, f4, z, mbVar3, kzVar, null);
                                mbVar4 = mbVar3;
                                qhVar2.e0(lbVar);
                                K5 = lbVar;
                            } else {
                                id0Var4 = id0Var7;
                                mbVar4 = mbVar3;
                                b6Var = b6Var2;
                                j3 = j2;
                                z2 = false;
                            }
                            mz.k(qhVar2, (qu) K5, jnVar);
                            d7Var = b6Var.c;
                            r14 = z2;
                        }
                        qhVar2.q(r14);
                        float f5 = d7Var != null ? ((jn) d7Var.e.getValue()).d : f2;
                        o1 o1Var = o1.q;
                        AtomicInteger atomicInteger = op0.a;
                        u50 c2 = u50Var.c(new AppendedSemanticsElement(o1Var));
                        eg E = a50.E(956488494, new nb(j3, id0Var4, egVar), qhVar2);
                        ji jiVar = au0.a;
                        float f6 = ((jn) qhVar2.j(jiVar)).d + f2;
                        ki0 a2 = aj.a.a(new ge(j3));
                        ki0 a3 = jiVar.a(new jn(f6));
                        ki0[] ki0VarArr = new ki0[2];
                        ki0VarArr[r14] = a2;
                        ki0VarArr[1] = a3;
                        id0 id0Var8 = id0Var4;
                        qhVar = qhVar2;
                        z9Var2 = z9Var4;
                        nz.c(ki0VarArr, a50.E(1279702876, new zt0(c2, rq0Var, j4, f6, z9Var2, r60Var, z, buVar, f5, E), qhVar), qhVar, 56);
                        id0Var5 = id0Var8;
                        mbVar5 = mbVar4;
                    }
                }
                id0Var3 = id0Var2;
                z9Var3 = z9Var2;
                mbVar3 = mbVar2;
                qhVar2.r();
                qhVar2.V(-239156623);
                K = qhVar2.K();
                obj = hh.a;
                if (K == obj) {
                }
                r60 r60Var22 = (r60) K;
                qhVar2.q(false);
                long j42 = z ? ibVar.a : ibVar.c;
                if (z) {
                }
                qhVar2.V(-239150048);
                if (mbVar3 == null) {
                }
                qhVar2.q(r14);
                if (d7Var != null) {
                }
                o1 o1Var2 = o1.q;
                AtomicInteger atomicInteger2 = op0.a;
                u50 c22 = u50Var.c(new AppendedSemanticsElement(o1Var2));
                eg E2 = a50.E(956488494, new nb(j3, id0Var4, egVar), qhVar2);
                ji jiVar2 = au0.a;
                float f62 = ((jn) qhVar2.j(jiVar2)).d + f2;
                ki0 a22 = aj.a.a(new ge(j3));
                ki0 a32 = jiVar2.a(new jn(f62));
                ki0[] ki0VarArr2 = new ki0[2];
                ki0VarArr2[r14] = a22;
                ki0VarArr2[1] = a32;
                id0 id0Var82 = id0Var4;
                qhVar = qhVar2;
                z9Var2 = z9Var4;
                nz.c(ki0VarArr2, a50.E(1279702876, new zt0(c22, rq0Var, j42, f62, z9Var2, r60Var, z, buVar, f5, E2), qhVar), qhVar, 56);
                id0Var5 = id0Var82;
                mbVar5 = mbVar4;
            } else {
                qhVar2.Q();
                mbVar5 = mbVar2;
                id0Var5 = id0Var2;
                qhVar = qhVar2;
            }
            z9 z9Var5 = z9Var2;
            s = qhVar.s();
            if (s == null) {
                s.d = new ob(buVar, u50Var, z, rq0Var, ibVar, mbVar5, z9Var5, id0Var5, egVar, i2, i3);
                return;
            }
            return;
        }
        z9Var2 = z9Var;
        i5 = i3 & 128;
        if (i5 == 0) {
        }
        int i102 = i4;
        if ((i3 & 256) == 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        int i112 = i6;
        if ((i6 & 306783379) == 306783378) {
        }
        qhVar2.S();
        if ((i2 & 1) != 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if (i9 != 0) {
        }
        if (i5 != 0) {
        }
        id0Var3 = id0Var2;
        z9Var3 = z9Var2;
        mbVar3 = mbVar2;
        qhVar2.r();
        qhVar2.V(-239156623);
        K = qhVar2.K();
        obj = hh.a;
        if (K == obj) {
        }
        r60 r60Var222 = (r60) K;
        qhVar2.q(false);
        long j422 = z ? ibVar.a : ibVar.c;
        if (z) {
        }
        qhVar2.V(-239150048);
        if (mbVar3 == null) {
        }
        qhVar2.q(r14);
        if (d7Var != null) {
        }
        o1 o1Var22 = o1.q;
        AtomicInteger atomicInteger22 = op0.a;
        u50 c222 = u50Var.c(new AppendedSemanticsElement(o1Var22));
        eg E22 = a50.E(956488494, new nb(j3, id0Var4, egVar), qhVar2);
        ji jiVar22 = au0.a;
        float f622 = ((jn) qhVar2.j(jiVar22)).d + f2;
        ki0 a222 = aj.a.a(new ge(j3));
        ki0 a322 = jiVar22.a(new jn(f622));
        ki0[] ki0VarArr22 = new ki0[2];
        ki0VarArr22[r14] = a222;
        ki0VarArr22[1] = a322;
        id0 id0Var822 = id0Var4;
        qhVar = qhVar2;
        z9Var2 = z9Var4;
        nz.c(ki0VarArr22, a50.E(1279702876, new zt0(c222, rq0Var, j422, f622, z9Var2, r60Var, z, buVar, f5, E22), qhVar), qhVar, 56);
        id0Var5 = id0Var822;
        mbVar5 = mbVar4;
        z9 z9Var52 = z9Var2;
        s = qhVar.s();
        if (s == null) {
        }
    }

    public static final et0 b(Object obj) {
        if (obj == null) {
            obj = d31.e;
        }
        return new et0(obj);
    }

    public static final void c(bu buVar, u50 u50Var, boolean z, rq0 rq0Var, ib ibVar, z9 z9Var, id0 id0Var, eg egVar, ih ihVar, int i2) {
        int i3;
        long b2;
        int i4;
        z9 z9Var2;
        id0 id0Var2;
        qh qhVar = (qh) ihVar;
        qhVar.W(-1694808287);
        if ((i2 & 6) == 0) {
            i3 = (qhVar.h(buVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qhVar.f(u50Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qhVar.g(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qhVar.f(rq0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= qhVar.f(ibVar) ? 16384 : 8192;
        }
        int i5 = 196608 | i3;
        if ((1572864 & i2) == 0) {
            i5 = 720896 | i3;
        }
        int i6 = 113246208 | i5;
        if ((805306368 & i2) == 0) {
            i6 |= qhVar.h(egVar) ? 536870912 : 268435456;
        }
        if ((306783379 & i6) == 306783378 && qhVar.z()) {
            qhVar.Q();
            z9Var2 = z9Var;
            id0Var2 = id0Var;
        } else {
            qhVar.S();
            if ((i2 & 1) == 0 || qhVar.x()) {
                id0 id0Var3 = jb.a;
                if (z) {
                    qhVar.V(-855870548);
                    b2 = le.c((ke) qhVar.j(le.a), 24);
                    qhVar.q(false);
                } else {
                    qhVar.V(-855783004);
                    b2 = ge.b(le.c((ke) qhVar.j(le.a), 24), 0.12f);
                    qhVar.q(false);
                }
                i4 = i6 & (-3670017);
                z9Var2 = new z9(1.0f, new ks0(b2));
                id0Var2 = jb.a;
            } else {
                qhVar.Q();
                i4 = i6 & (-3670017);
                z9Var2 = z9Var;
                id0Var2 = id0Var;
            }
            qhVar.r();
            a(buVar, u50Var, z, rq0Var, ibVar, null, z9Var2, id0Var2, egVar, qhVar, i4 & 2147483646, 0);
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new pb(buVar, u50Var, z, rq0Var, ibVar, z9Var2, id0Var2, egVar, i2);
        }
    }

    public static me d(me meVar) {
        y01 y01Var = x40.e;
        if (x40.A(meVar.b, 12884901888L)) {
            dl0 dl0Var = (dl0) meVar;
            y01 y01Var2 = dl0Var.d;
            if (!i(y01Var2, y01Var)) {
                return new dl0(dl0Var.a, dl0Var.h, y01Var, E(h(z1.c.b, y01Var2.a(), y01Var.a()), dl0Var.i), dl0Var.k, dl0Var.n, dl0Var.e, dl0Var.f, dl0Var.g, -1);
            }
        }
        return meVar;
    }

    public static final void e(k01 k01Var, in0 in0Var, g20 g20Var) {
        in0Var.getClass();
        g20Var.getClass();
        cn0 cn0Var = (cn0) k01Var.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (cn0Var == null || cn0Var.f) {
            return;
        }
        cn0Var.h(g20Var, in0Var);
        P(g20Var, in0Var);
    }

    public static final zi0 f(View view, f3 f3Var) {
        int[] iArr = d31.d;
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        f3Var.getLocationInWindow(iArr);
        float f2 = i2 - iArr[0];
        float f3 = i3 - iArr[1];
        return new zi0(f2, f3, view.getWidth() + f2, view.getHeight() + f3);
    }

    public static void g(int i2) {
        if (2 > i2 || i2 >= 37) {
            throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new ez(2, 36, 1));
        }
    }

    public static final float[] h(float[] fArr, float[] fArr2, float[] fArr3) {
        F(fArr, fArr2);
        F(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] z = z(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return E(z, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static final boolean i(y01 y01Var, y01 y01Var2) {
        if (y01Var == y01Var2) {
            return true;
        }
        return Math.abs(y01Var.a - y01Var2.a) < 0.001f && Math.abs(y01Var.b - y01Var2.b) < 0.001f;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ot j(Context context) {
        ProviderInfo providerInfo;
        mt mtVar;
        ApplicationInfo applicationInfo;
        int i2 = 13;
        y7 tkVar = Build.VERSION.SDK_INT >= 28 ? new tk(i2) : new y7(i2);
        PackageManager packageManager = context.getPackageManager();
        ld0.f(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] j2 = tkVar.j(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : j2) {
                    arrayList.add(signature.toByteArray());
                }
                mtVar = new mt(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (mtVar != null) {
                return null;
            }
            return new ot(new nt(context, mtVar));
        }
        mtVar = null;
        if (mtVar != null) {
        }
    }

    public static final cn0 k(in0 in0Var, g20 g20Var, String str, Bundle bundle) {
        bn0 bn0Var;
        in0Var.getClass();
        g20Var.getClass();
        Bundle a2 = in0Var.a(str);
        if (a2 != null) {
            bundle = a2;
        }
        if (bundle == null) {
            bn0Var = new bn0();
        } else {
            ClassLoader classLoader = bn0.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
            s40 s40Var = new s40(bundle.size());
            for (String str2 : bundle.keySet()) {
                str2.getClass();
                s40Var.put(str2, bundle.get(str2));
            }
            bn0Var = new bn0(x40.q(s40Var));
        }
        cn0 cn0Var = new cn0(str, bn0Var);
        cn0Var.h(g20Var, in0Var);
        P(g20Var, in0Var);
        return cn0Var;
    }

    public static Handler l(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return wm.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final ri m(me meVar, me meVar2) {
        return meVar == meVar2 ? new pi(meVar, meVar, 1) : (x40.A(meVar.b, 12884901888L) && x40.A(meVar2.b, 12884901888L)) ? new qi((dl0) meVar, (dl0) meVar2) : new ri(meVar, meVar2, 0);
    }

    public static final void n(rj rjVar) {
        zz zzVar = (zz) rjVar.k(b2.C);
        if (zzVar != null && !zzVar.b()) {
            throw zzVar.n();
        }
    }

    public static final oq o(Enum[] enumArr) {
        enumArr.getClass();
        return new oq(enumArr);
    }

    public static final boolean p(long j2, long j3) {
        return j2 == j3;
    }

    public static final float q(float f2) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f2) & 8589934591L) / 3)) + 709952852);
        float f3 = intBitsToFloat - ((intBitsToFloat - (f2 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static final int r(List list, int i2) {
        int i3;
        int i4 = ((rd0) zd.h0(list)).c;
        if (i2 > ((rd0) zd.h0(list)).c) {
            dy.a("Index " + i2 + " should be less or equal than last line's end " + i4);
        }
        int size = list.size() - 1;
        int i5 = 0;
        while (true) {
            if (i5 > size) {
                i3 = -(i5 + 1);
                break;
            }
            i3 = (i5 + size) >>> 1;
            rd0 rd0Var = (rd0) list.get(i3);
            char c2 = rd0Var.b > i2 ? (char) 1 : rd0Var.c <= i2 ? (char) 65535 : (char) 0;
            if (c2 >= 0) {
                if (c2 <= 0) {
                    break;
                }
                size = i3 - 1;
            } else {
                i5 = i3 + 1;
            }
        }
        if (i3 >= 0 && i3 < list.size()) {
            return i3;
        }
        dy.a("Found paragraph index " + i3 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i2 + ", paragraphs=[" + l30.a(list, null, new sj(2), 31) + ']');
        return i3;
    }

    public static final int s(List list, int i2) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            rd0 rd0Var = (rd0) list.get(i4);
            char c2 = rd0Var.d > i2 ? (char) 1 : rd0Var.e <= i2 ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i3 = i4 + 1;
            } else {
                if (c2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int t(ut utVar, int i2) {
        boolean z = nz.s(utVar.d, ut.e.d) >= 0;
        boolean z2 = i2 == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final String u(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static boolean v() {
        try {
            if (f3.I0 == null) {
                f3.I0 = Class.forName("android.os.SystemProperties");
            }
            if (f3.J0 == null) {
                Class cls = f3.I0;
                f3.J0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = f3.J0;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return nz.l(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final zz w(rj rjVar) {
        zz zzVar = (zz) rjVar.k(b2.C);
        if (zzVar != null) {
            return zzVar;
        }
        g8.d(rjVar, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final int x(Layout layout, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i2 || lineEnd == i2) {
            if (lineStart == i2) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final long y(p01 p01Var) {
        DragEvent dragEvent = (DragEvent) p01Var.e;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    public static final float[] z(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }
}
