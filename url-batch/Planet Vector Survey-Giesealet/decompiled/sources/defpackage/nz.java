package defpackage;

import android.R;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import androidx.compose.foundation.layout.c;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class nz {
    public static final y7 a = new y7(1);
    public static final y7 b = new y7(2);
    public static final b2 c = new b2(29);
    public static final y7 d = new y7(0);
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final Object[] g = new Object[0];
    public static final kx h = new kx(false);
    public static final Object i = new Object();
    public static final byte[] j = {112, 114, 111, 0};
    public static final byte[] k = {112, 114, 109, 0};
    public static final zi0 l = new zi0(0.0f, 0.0f, 10.0f, 10.0f);
    public static final long m = Long.MIN_VALUE;
    public static final /* synthetic */ int n = 0;

    public static pj A(pj pjVar, qj qjVar) {
        qjVar.getClass();
        if (l(pjVar.getKey(), qjVar)) {
            return pjVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ts B(ts tsVar) {
        boolean z = tsVar.d.q;
        if (z) {
            if (!z) {
                cy.b("visitChildren called on an unattached node");
            }
            l70 l70Var = new l70(new t50[16]);
            t50 t50Var = tsVar.d;
            t50 t50Var2 = t50Var.i;
            if (t50Var2 == null) {
                h(l70Var, t50Var);
            } else {
                l70Var.b(t50Var2);
            }
            loop0: while (true) {
                int i2 = l70Var.f;
                if (i2 == 0) {
                    break;
                }
                t50 t50Var3 = (t50) l70Var.j(i2 - 1);
                if ((t50Var3.g & 1024) == 0) {
                    h(l70Var, t50Var3);
                } else {
                    while (true) {
                        if (t50Var3 == null) {
                            break;
                        }
                        if ((t50Var3.f & 1024) != 0) {
                            l70 l70Var2 = null;
                            while (t50Var3 != null) {
                                if (t50Var3 instanceof ts) {
                                    ts tsVar2 = (ts) t50Var3;
                                    if (tsVar2.d.q) {
                                        int ordinal = tsVar2.l0().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            break loop0;
                                        }
                                        if (ordinal != 3) {
                                            g8.c();
                                            return null;
                                        }
                                    }
                                } else if ((t50Var3.f & 1024) != 0 && (t50Var3 instanceof ol)) {
                                    int i3 = 0;
                                    for (t50 t50Var4 = ((ol) t50Var3).s; t50Var4 != null; t50Var4 = t50Var4.i) {
                                        if ((t50Var4.f & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                t50Var3 = t50Var4;
                                            } else {
                                                if (l70Var2 == null) {
                                                    l70Var2 = new l70(new t50[16]);
                                                }
                                                if (t50Var3 != null) {
                                                    l70Var2.b(t50Var3);
                                                    t50Var3 = null;
                                                }
                                                l70Var2.b(t50Var4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                t50Var3 = j(l70Var2);
                            }
                        } else {
                            t50Var3 = t50Var3.i;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final p60 C(up0 up0Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            rp0 a2 = up0Var.a();
            p10 p10Var = a2.c;
            if (p10Var.C() && p10Var.B()) {
                p60 p60Var = new p60(48);
                p01 p01Var = new p01(19);
                fz I = a50.I(a2.g());
                ((Region) p01Var.e).set(I.a, I.b, I.c, I.d);
                D(p01Var, a2, p60Var, a2, new p01(19));
                return p60Var;
            }
            p60 p60Var2 = az.a;
            p60Var2.getClass();
            return p60Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void D(p01 p01Var, rp0 rp0Var, p60 p60Var, rp0 rp0Var2, p01 p01Var2) {
        zi0 R0;
        p10 p10Var;
        int i2 = rp0Var.g;
        Region region = (Region) p01Var2.e;
        p10 p10Var2 = rp0Var2.c;
        int i3 = rp0Var2.g;
        boolean z = (p10Var2.C() && p10Var2.B()) ? false : true;
        Region region2 = (Region) p01Var.e;
        if (!region2.isEmpty() || i3 == i2) {
            if (!z || rp0Var2.e) {
                Object f2 = rp0Var2.f();
                if (f2 == null) {
                    R0 = ((iy) p10Var2.F.g).R0();
                } else {
                    t50 t50Var = ((t50) f2).d;
                    Object g2 = rp0Var2.d.d.g(mp0.b);
                    if (g2 == null) {
                        g2 = null;
                    }
                    boolean z2 = g2 != null;
                    if (!t50Var.d.q) {
                        R0 = zi0.e;
                    } else if (z2) {
                        R0 = Y(t50Var, 8).R0();
                    } else {
                        ea0 Y = Y(t50Var, 8);
                        R0 = mz.C(Y).z(Y, true);
                    }
                }
                fz I = a50.I(R0);
                region.set(I.a, I.b, I.c, I.d);
                if (i3 == i2) {
                    i3 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (rp0Var2.e) {
                        rp0 l2 = rp0Var2.l();
                        p60Var.h(i3, new tp0(rp0Var2, a50.I((l2 == null || (p10Var = l2.c) == null || !p10Var.C()) ? l : l2.g())));
                        return;
                    } else {
                        if (i3 == -1) {
                            Rect bounds = region.getBounds();
                            p60Var.h(i3, new tp0(rp0Var2, new fz(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                p60Var.h(i3, new tp0(rp0Var2, new fz(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List j2 = rp0.j(4, rp0Var2);
                for (int size = j2.size() - 1; -1 < size; size--) {
                    if (!((rp0) j2.get(size)).k().d.c(vp0.y)) {
                        D(p01Var, rp0Var, p60Var, (rp0) j2.get(size), p01Var2);
                    }
                }
                if (K(rp0Var2)) {
                    region2.op(I.a, I.b, I.c, I.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class E(ld ldVar) {
        ldVar.getClass();
        Class cls = ldVar.a;
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return cls;
    }

    public static final int F(o8 o8Var, Object obj, int i2) {
        int i3 = o8Var.f;
        if (i3 == 0) {
            return -1;
        }
        try {
            int o = o(o8Var.d, i3, i2);
            if (o < 0 || l(obj, o8Var.e[o])) {
                return o;
            }
            int i4 = o + 1;
            while (i4 < i3 && o8Var.d[i4] == i2) {
                if (l(obj, o8Var.e[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = o - 1; i5 >= 0 && o8Var.d[i5] == i2; i5--) {
                if (l(obj, o8Var.e[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final void G(qh qhVar, qu quVar) {
        quVar.getClass();
        px0.k(2, quVar);
        quVar.invoke(qhVar, 1);
    }

    public static final boolean H(ts tsVar) {
        p10 p10Var;
        ea0 ea0Var;
        p10 p10Var2;
        ea0 ea0Var2 = tsVar.k;
        return (ea0Var2 == null || (p10Var = ea0Var2.r) == null || !p10Var.C() || (ea0Var = tsVar.k) == null || (p10Var2 = ea0Var.r) == null || !p10Var2.B()) ? false : true;
    }

    public static final boolean I(rp0 rp0Var) {
        ea0 d2 = rp0Var.d();
        a70 a70Var = rp0Var.d.d;
        return (d2 != null ? d2.D0() : false) || a70Var.c(vp0.p) || a70Var.c(vp0.o);
    }

    public static final boolean J(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final boolean K(rp0 rp0Var) {
        if (!I(rp0Var)) {
            np0 np0Var = rp0Var.d;
            if (np0Var.f) {
                return true;
            }
            a70 a70Var = np0Var.d;
            Object[] objArr = a70Var.b;
            Object[] objArr2 = a70Var.c;
            long[] jArr = a70Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((yp0) obj).c) {
                                    return true;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    public static rj L(pj pjVar, qj qjVar) {
        qjVar.getClass();
        return l(pjVar.getKey(), qjVar) ? up.d : pjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean M(ts tsVar, y5 y5Var) {
        ts[] tsVarArr = new ts[16];
        if (!tsVar.d.q) {
            cy.b("visitChildren called on an unattached node");
        }
        l70 l70Var = new l70(new t50[16]);
        t50 t50Var = tsVar.d;
        t50 t50Var2 = t50Var.i;
        if (t50Var2 == null) {
            h(l70Var, t50Var);
        } else {
            l70Var.b(t50Var2);
        }
        int i2 = 0;
        while (true) {
            int i3 = l70Var.f;
            if (i3 == 0) {
                break;
            }
            t50 t50Var3 = (t50) l70Var.j(i3 - 1);
            if ((t50Var3.g & 1024) == 0) {
                h(l70Var, t50Var3);
            } else {
                while (true) {
                    if (t50Var3 == null) {
                        break;
                    }
                    if ((t50Var3.f & 1024) != 0) {
                        l70 l70Var2 = null;
                        while (t50Var3 != null) {
                            if (t50Var3 instanceof ts) {
                                ts tsVar2 = (ts) t50Var3;
                                int i4 = i2 + 1;
                                if (tsVarArr.length < i4) {
                                    int length = tsVarArr.length;
                                    ?? r10 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(tsVarArr, 0, r10, 0, length);
                                    tsVarArr = r10;
                                }
                                tsVarArr[i2] = tsVar2;
                                i2 = i4;
                            } else if ((t50Var3.f & 1024) != 0 && (t50Var3 instanceof ol)) {
                                int i5 = 0;
                                for (t50 t50Var4 = ((ol) t50Var3).s; t50Var4 != null; t50Var4 = t50Var4.i) {
                                    if ((t50Var4.f & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            t50Var3 = t50Var4;
                                        } else {
                                            if (l70Var2 == null) {
                                                l70Var2 = new l70(new t50[16]);
                                            }
                                            if (t50Var3 != null) {
                                                l70Var2.b(t50Var3);
                                                t50Var3 = null;
                                            }
                                            l70Var2.b(t50Var4);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            t50Var3 = j(l70Var2);
                        }
                    } else {
                        t50Var3 = t50Var3.i;
                    }
                }
            }
        }
        Arrays.sort(tsVarArr, 0, i2, us.b);
        int i6 = i2 - 1;
        if (i6 < tsVarArr.length) {
            while (i6 >= 0) {
                ts tsVar3 = tsVarArr[i6];
                if (H(tsVar3) && n(tsVar3, y5Var)) {
                    return true;
                }
                i6--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean N(ts tsVar, y5 y5Var) {
        ts[] tsVarArr = new ts[16];
        if (!tsVar.d.q) {
            cy.b("visitChildren called on an unattached node");
        }
        l70 l70Var = new l70(new t50[16]);
        t50 t50Var = tsVar.d;
        t50 t50Var2 = t50Var.i;
        if (t50Var2 == null) {
            h(l70Var, t50Var);
        } else {
            l70Var.b(t50Var2);
        }
        int i2 = 0;
        while (true) {
            int i3 = l70Var.f;
            if (i3 == 0) {
                break;
            }
            t50 t50Var3 = (t50) l70Var.j(i3 - 1);
            if ((t50Var3.g & 1024) == 0) {
                h(l70Var, t50Var3);
            } else {
                while (true) {
                    if (t50Var3 == null) {
                        break;
                    }
                    if ((t50Var3.f & 1024) != 0) {
                        l70 l70Var2 = null;
                        while (t50Var3 != null) {
                            if (t50Var3 instanceof ts) {
                                ts tsVar2 = (ts) t50Var3;
                                int i4 = i2 + 1;
                                if (tsVarArr.length < i4) {
                                    int length = tsVarArr.length;
                                    ?? r10 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(tsVarArr, 0, r10, 0, length);
                                    tsVarArr = r10;
                                }
                                tsVarArr[i2] = tsVar2;
                                i2 = i4;
                            } else if ((t50Var3.f & 1024) != 0 && (t50Var3 instanceof ol)) {
                                int i5 = 0;
                                for (t50 t50Var4 = ((ol) t50Var3).s; t50Var4 != null; t50Var4 = t50Var4.i) {
                                    if ((t50Var4.f & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            t50Var3 = t50Var4;
                                        } else {
                                            if (l70Var2 == null) {
                                                l70Var2 = new l70(new t50[16]);
                                            }
                                            if (t50Var3 != null) {
                                                l70Var2.b(t50Var3);
                                                t50Var3 = null;
                                            }
                                            l70Var2.b(t50Var4);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            t50Var3 = j(l70Var2);
                        }
                    } else {
                        t50Var3 = t50Var3.i;
                    }
                }
            }
        }
        Arrays.sort(tsVarArr, 0, i2, us.b);
        for (int i6 = 0; i6 < i2; i6++) {
            ts tsVar3 = tsVarArr[i6];
            if (H(tsVar3) && x(tsVar3, y5Var)) {
                return true;
            }
        }
        return false;
    }

    public static void O(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    public static void P(int i2, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float max = (i2 - i4) / Math.max(iArr.length - 1, 1);
        float f2 = (z && iArr.length == 1) ? max : 0.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i6 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + max;
            i3++;
            i7++;
        }
    }

    public static rj Q(pj pjVar, rj rjVar) {
        rjVar.getClass();
        return rjVar == up.d ? pjVar : (rj) rjVar.o(new ze(6), pjVar);
    }

    public static int[] R(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) x40.N(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static bm[] S(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, bm[] bmVarArr) {
        byte[] bArr3 = a50.o;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, a50.p)) {
                g8.s("Unsupported meta version");
                return null;
            }
            int N = (int) x40.N(fileInputStream, 2);
            byte[] M = x40.M(fileInputStream, (int) x40.N(fileInputStream, 4), (int) x40.N(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                g8.s("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(M);
            try {
                bm[] U = U(byteArrayInputStream, bArr2, N, bmVarArr);
                byteArrayInputStream.close();
                return U;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(a50.j, bArr2)) {
            g8.s("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            g8.s("Unsupported meta version");
            return null;
        }
        int N2 = (int) x40.N(fileInputStream, 1);
        byte[] M2 = x40.M(fileInputStream, (int) x40.N(fileInputStream, 4), (int) x40.N(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            g8.s("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(M2);
        try {
            bm[] T = T(byteArrayInputStream2, N2, bmVarArr);
            byteArrayInputStream2.close();
            return T;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static bm[] T(ByteArrayInputStream byteArrayInputStream, int i2, bm[] bmVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new bm[0];
        }
        if (i2 != bmVarArr.length) {
            g8.s("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int N = (int) x40.N(byteArrayInputStream, 2);
            iArr[i3] = (int) x40.N(byteArrayInputStream, 2);
            strArr[i3] = new String(x40.L(byteArrayInputStream, N), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            bm bmVar = bmVarArr[i4];
            if (!bmVar.b.equals(strArr[i4])) {
                g8.s("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            bmVar.e = i5;
            bmVar.h = R(byteArrayInputStream, i5);
        }
        return bmVarArr;
    }

    public static bm[] U(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, bm[] bmVarArr) {
        bm bmVar;
        if (byteArrayInputStream.available() == 0) {
            return new bm[0];
        }
        if (i2 != bmVarArr.length) {
            g8.s("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            x40.N(byteArrayInputStream, 2);
            String str = new String(x40.L(byteArrayInputStream, (int) x40.N(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long N = x40.N(byteArrayInputStream, 4);
            int N2 = (int) x40.N(byteArrayInputStream, 2);
            if (bmVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i4 = 0; i4 < bmVarArr.length; i4++) {
                    if (bmVarArr[i4].b.equals(substring)) {
                        bmVar = bmVarArr[i4];
                        break;
                    }
                }
            }
            bmVar = null;
            if (bmVar == null) {
                g8.s("Missing profile key: ".concat(str));
                return null;
            }
            bmVar.d = N;
            int[] R = R(byteArrayInputStream, N2);
            if (Arrays.equals(bArr, a50.n)) {
                bmVar.e = N2;
                bmVar.h = R;
            }
        }
        return bmVarArr;
    }

    public static bm[] V(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, a50.k)) {
            g8.s("Unsupported version");
            return null;
        }
        int N = (int) x40.N(fileInputStream, 1);
        byte[] M = x40.M(fileInputStream, (int) x40.N(fileInputStream, 4), (int) x40.N(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            g8.s("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(M);
        try {
            bm[] W = W(byteArrayInputStream, str, N);
            byteArrayInputStream.close();
            return W;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static bm[] W(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new bm[0];
        }
        bm[] bmVarArr = new bm[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int N = (int) x40.N(byteArrayInputStream, 2);
            int N2 = (int) x40.N(byteArrayInputStream, 2);
            bmVarArr[i4] = new bm(str, new String(x40.L(byteArrayInputStream, N), StandardCharsets.UTF_8), x40.N(byteArrayInputStream, 4), N2, (int) x40.N(byteArrayInputStream, 4), (int) x40.N(byteArrayInputStream, 4), new int[N2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            bm bmVar = bmVarArr[i5];
            int available = byteArrayInputStream.available();
            int i6 = bmVar.f;
            int i7 = bmVar.g;
            TreeMap treeMap = bmVar.i;
            int i8 = available - i6;
            int i9 = i3;
            while (byteArrayInputStream.available() > i8) {
                i9 += (int) x40.N(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i9), 1);
                int N3 = (int) x40.N(byteArrayInputStream, 2);
                while (N3 > 0) {
                    x40.N(byteArrayInputStream, 2);
                    int N4 = (int) x40.N(byteArrayInputStream, 1);
                    if (N4 != 6 && N4 != 7) {
                        while (N4 > 0) {
                            x40.N(byteArrayInputStream, 1);
                            int i10 = i3;
                            int i11 = i5;
                            for (int N5 = (int) x40.N(byteArrayInputStream, 1); N5 > 0; N5--) {
                                x40.N(byteArrayInputStream, 2);
                            }
                            N4--;
                            i3 = i10;
                            i5 = i11;
                        }
                    }
                    N3--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i12 = i3;
            int i13 = i5;
            if (byteArrayInputStream.available() != i8) {
                g8.s("Read too much data during profile line parse");
                return null;
            }
            bmVar.h = R(byteArrayInputStream, bmVar.e);
            BitSet valueOf = BitSet.valueOf(x40.L(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i14 = i12; i14 < i7; i14++) {
                int i15 = valueOf.get(i14) ? 2 : i12;
                if (valueOf.get(i14 + i7)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
            i5 = i13 + 1;
            i3 = i12;
        }
        return bmVarArr;
    }

    public static final Object X(Object obj) {
        return obj instanceof jf ? rg0.i(((jf) obj).a) : obj;
    }

    public static final ea0 Y(nl nlVar, int i2) {
        ea0 ea0Var = ((t50) nlVar).d.k;
        ea0Var.getClass();
        if (ea0Var.v0() != nlVar || !fa0.g(i2)) {
            return ea0Var;
        }
        ea0 ea0Var2 = ea0Var.s;
        ea0Var2.getClass();
        return ea0Var2;
    }

    public static final ea0 Z(nl nlVar) {
        if (!((t50) nlVar).d.q) {
            cy.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        ea0 Y = Y(nlVar, 2);
        if (!Y.v0().q) {
            cy.b("LayoutCoordinates is not attached.");
        }
        return Y;
    }

    public static final void a(u50 u50Var, mu muVar, ih ihVar, int i2) {
        int i3;
        qh qhVar = (qh) ihVar;
        qhVar.W(-932836462);
        if ((i2 & 6) == 0) {
            i3 = (qhVar.f(u50Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = 1;
        if (((i3 | (qhVar.h(muVar) ? 32 : 16)) & 19) == 18 && qhVar.z()) {
            qhVar.Q();
        } else {
            u50 a2 = a.a(u50Var, muVar);
            k4 k4Var = k4.f;
            int A = px0.A(qhVar);
            u50 D = nk.D(qhVar, a2);
            gf0 l2 = qhVar.l();
            eh.b.getClass();
            gi giVar = dh.b;
            qhVar.X();
            if (qhVar.Q) {
                qhVar.k(giVar);
            } else {
                qhVar.h0();
            }
            ld0.r(qhVar, dh.e, k4Var);
            ld0.r(qhVar, dh.d, l2);
            ld0.r(qhVar, dh.c, D);
            h6 h6Var = dh.f;
            if (qhVar.Q || !l(qhVar.K(), Integer.valueOf(A))) {
                y6.y(A, qhVar, A, h6Var);
            }
            qhVar.q(true);
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new l4(u50Var, muVar, i2, i4);
        }
    }

    public static final p10 a0(nl nlVar) {
        ea0 ea0Var = ((t50) nlVar).d.k;
        if (ea0Var != null) {
            return ea0Var.r;
        }
        throw y6.u("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(ki0 ki0Var, qu quVar, ih ihVar, int i2) {
        xy0 xy0Var;
        boolean z;
        ri0 s;
        qh qhVar = (qh) ihVar;
        qhVar.W(-149765515);
        jz jzVar = qhVar.w;
        gf0 l2 = qhVar.l();
        qhVar.T(201, th.b);
        Object K = qhVar.K();
        if (l(K, hh.a)) {
            xy0Var = null;
        } else {
            K.getClass();
            xy0Var = (xy0) K;
        }
        ii0 ii0Var = ki0Var.a;
        xy0 c2 = ii0Var.c(ki0Var, xy0Var);
        boolean equals = c2.equals(xy0Var);
        if (!equals) {
            qhVar.e0(c2);
        }
        if (qhVar.Q) {
            if (ki0Var.f || !l2.containsKey(ii0Var)) {
                l2 = l2.b(ii0Var, c2);
            }
            qhVar.I = true;
        } else {
            ir0 ir0Var = qhVar.F;
            Object b2 = ir0Var.b(ir0Var.b, ir0Var.g);
            b2.getClass();
            gf0 gf0Var = (gf0) b2;
            if (!(qhVar.z() && equals) && (ki0Var.f || !l2.containsKey(ii0Var))) {
                l2 = l2.b(ii0Var, c2);
            } else if ((equals && !qhVar.v) || !qhVar.v) {
                l2 = gf0Var;
            }
            if (qhVar.x || gf0Var != l2) {
                z = true;
                if (z && !qhVar.Q) {
                    qhVar.I(l2);
                }
                jzVar.c(qhVar.v ? 1 : 0);
                qhVar.v = z;
                qhVar.J = l2;
                qhVar.R(202, 0, th.c, l2);
                quVar.invoke(qhVar, Integer.valueOf((i2 >> 3) & 14));
                qhVar.q(false);
                qhVar.q(false);
                qhVar.v = jzVar.b() != 0;
                qhVar.J = null;
                s = qhVar.s();
                if (s == null) {
                    s.d = new d8(i2, 2, ki0Var, quVar);
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
            qhVar.I(l2);
        }
        jzVar.c(qhVar.v ? 1 : 0);
        qhVar.v = z;
        qhVar.J = l2;
        qhVar.R(202, 0, th.c, l2);
        quVar.invoke(qhVar, Integer.valueOf((i2 >> 3) & 14));
        qhVar.q(false);
        qhVar.q(false);
        qhVar.v = jzVar.b() != 0;
        qhVar.J = null;
        s = qhVar.s();
        if (s == null) {
        }
    }

    public static final dd0 b0(nl nlVar) {
        dd0 dd0Var = a0(nlVar).p;
        if (dd0Var != null) {
            return dd0Var;
        }
        throw y6.u("This node does not have an owner.");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(ki0[] ki0VarArr, qu quVar, ih ihVar, int i2) {
        gf0 d0;
        boolean z;
        ri0 s;
        qh qhVar = (qh) ihVar;
        qhVar.W(415205898);
        jz jzVar = qhVar.w;
        gf0 l2 = qhVar.l();
        qhVar.T(201, th.b);
        if (qhVar.Q) {
            d0 = qhVar.d0(l2, a50.O(ki0VarArr, l2, gf0.g));
            qhVar.I = true;
        } else {
            ir0 ir0Var = qhVar.F;
            Object h2 = ir0Var.h(ir0Var.g, 0);
            h2.getClass();
            gf0 gf0Var = (gf0) h2;
            ir0 ir0Var2 = qhVar.F;
            Object h3 = ir0Var2.h(ir0Var2.g, 1);
            h3.getClass();
            gf0 gf0Var2 = (gf0) h3;
            gf0 O = a50.O(ki0VarArr, l2, gf0Var2);
            if (qhVar.z() && !qhVar.x && gf0Var2.equals(O)) {
                qhVar.k = qhVar.F.s() + qhVar.k;
                d0 = gf0Var;
            } else {
                d0 = qhVar.d0(l2, O);
                if (qhVar.x || !l(d0, gf0Var)) {
                    z = true;
                    if (z && !qhVar.Q) {
                        qhVar.I(d0);
                    }
                    jzVar.c(qhVar.v ? 1 : 0);
                    qhVar.v = z;
                    qhVar.J = d0;
                    qhVar.R(202, 0, th.c, d0);
                    quVar.invoke(qhVar, Integer.valueOf((i2 >> 3) & 14));
                    qhVar.q(false);
                    qhVar.q(false);
                    qhVar.v = jzVar.b() != 0;
                    qhVar.J = null;
                    s = qhVar.s();
                    if (s == null) {
                        s.d = new d8(i2, 3, ki0VarArr, quVar);
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        if (z) {
            qhVar.I(d0);
        }
        jzVar.c(qhVar.v ? 1 : 0);
        qhVar.v = z;
        qhVar.J = d0;
        qhVar.R(202, 0, th.c, d0);
        quVar.invoke(qhVar, Integer.valueOf((i2 >> 3) & 14));
        qhVar.q(false);
        qhVar.q(false);
        qhVar.v = jzVar.b() != 0;
        qhVar.J = null;
        s = qhVar.s();
        if (s == null) {
        }
    }

    public static final long c0(long j2) {
        return (Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j2 >> 32))) << 32);
    }

    public static final void d(bu buVar, u50 u50Var, boolean z, rw rwVar, qu quVar, ih ihVar, int i2) {
        rw rwVar2;
        u50 u50Var2;
        rw rwVar3;
        boolean z2;
        qu quVar2;
        u50 u50Var3;
        rw rwVar4;
        qh qhVar = (qh) ihVar;
        qhVar.W(-1142896114);
        if (((i2 | (qhVar.h(buVar) ? 4 : 2) | 26032) & 74899) == 74898 && qhVar.z()) {
            qhVar.Q();
            u50Var3 = u50Var;
            z2 = z;
            rwVar4 = rwVar;
            quVar2 = quVar;
        } else {
            qhVar.S();
            if ((i2 & 1) == 0 || qhVar.x()) {
                qhVar.V(-1519621781);
                long j2 = ((ge) qhVar.j(aj.a)).a;
                ke keVar = (ke) qhVar.j(le.a);
                rw rwVar5 = keVar.N;
                if (rwVar5 == null) {
                    long j3 = ge.f;
                    rw rwVar6 = new rw(j3, j2, j3, ge.b(j2, 0.38f));
                    keVar.N = rwVar6;
                    rwVar5 = rwVar6;
                }
                long j4 = rwVar5.b;
                if (ge.c(j4, j2)) {
                    qhVar.q(false);
                    rwVar2 = rwVar5;
                } else {
                    long b2 = ge.b(j2, 0.38f);
                    rwVar2 = new rw(rwVar5.a, j2 != 16 ? j2 : j4, rwVar5.c, b2 != 16 ? b2 : rwVar5.d);
                    qhVar.q(false);
                }
                u50Var2 = r50.a;
                rwVar3 = rwVar2;
                z2 = true;
            } else {
                qhVar.Q();
                u50Var2 = u50Var;
                z2 = z;
                rwVar3 = rwVar;
            }
            qhVar.r();
            lt0 lt0Var = lz.a;
            u50 c2 = androidx.compose.foundation.a.c(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.c(c.c(u50Var2.c(MinimumInteractiveModifier.a), 40.0f), vq0.a(qhVar, 5), 518143), z2 ? rwVar3.a : rwVar3.c, px0.f), null, nl0.a(54, qhVar, 4), z2, new tl0(0), buVar, 8);
            g50 e2 = ca.e(b2.i, false);
            int A = px0.A(qhVar);
            gf0 l2 = qhVar.l();
            u50 D = nk.D(qhVar, c2);
            eh.b.getClass();
            gi giVar = dh.b;
            qhVar.X();
            if (qhVar.Q) {
                qhVar.k(giVar);
            } else {
                qhVar.h0();
            }
            ld0.r(qhVar, dh.e, e2);
            ld0.r(qhVar, dh.d, l2);
            h6 h6Var = dh.f;
            if (qhVar.Q || !l(qhVar.K(), Integer.valueOf(A))) {
                y6.y(A, qhVar, A, h6Var);
            }
            ld0.r(qhVar, dh.c, D);
            quVar2 = quVar;
            b(aj.a.a(new ge(z2 ? rwVar3.b : rwVar3.d)), quVar2, qhVar, 56);
            qhVar.q(true);
            u50Var3 = u50Var2;
            rwVar4 = rwVar3;
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new sw(buVar, u50Var3, z2, rwVar4, quVar2, i2);
        }
    }

    public static void d0(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static final long e(int i2, int i3) {
        return (i3 & 4294967295L) | (i2 << 32);
    }

    public static final void e0(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static final void f(y70 y70Var, wm0 wm0Var, eg egVar, ih ihVar, int i2) {
        qh qhVar = (qh) ihVar;
        qhVar.W(-1579360880);
        if ((((qhVar.h(y70Var) ? 4 : 2) | i2 | (qhVar.h(wm0Var) ? 32 : 16)) & 147) == 146 && qhVar.z()) {
            qhVar.Q();
        } else {
            c(new ki0[]{r30.a.a(y70Var), n30.a.a(y70Var), AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner().a(y70Var)}, a50.E(-52928304, new w3(7, wm0Var, egVar), qhVar), qhVar, 56);
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new v3(y70Var, wm0Var, egVar, i2, 3);
        }
    }

    public static void f0(String str) {
        kf kfVar = new kf("lateinit property " + str + " has not been initialized");
        d0(kfVar, nz.class.getName());
        throw kfVar;
    }

    public static final void g(wm0 wm0Var, eg egVar, ih ihVar, int i2) {
        int i3;
        qh qhVar = (qh) ihVar;
        qhVar.W(1211832233);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (qhVar.h(wm0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qhVar.h(egVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && qhVar.z()) {
            qhVar.Q();
        } else {
            qhVar.R(1729797275, 0, null, null);
            r01 a2 = r30.a(qhVar);
            if (a2 == null) {
                g8.s("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            k01 w = od0.w(hj0.a(b9.class), a2, a2 instanceof fw ? ((fw) a2).getDefaultViewModelCreationExtras() : gk.b, qhVar);
            qhVar.q(false);
            b9 b9Var = (b9) w;
            b9Var.c = new WeakReference(wm0Var);
            wm0Var.a(b9Var.b, egVar, qhVar, ((i3 << 6) & 896) | (i3 & 112));
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new l4(wm0Var, egVar, i2, i4);
        }
    }

    public static String g0(int i2) {
        return i2 == 0 ? "Clear" : i2 == 1 ? "Src" : i2 == 2 ? "Dst" : i2 == 3 ? "SrcOver" : i2 == 4 ? "DstOver" : i2 == 5 ? "SrcIn" : i2 == 6 ? "DstIn" : i2 == 7 ? "SrcOut" : i2 == 8 ? "DstOut" : i2 == 9 ? "SrcAtop" : i2 == 10 ? "DstAtop" : i2 == 11 ? "Xor" : i2 == 12 ? "Plus" : i2 == 13 ? "Modulate" : i2 == 14 ? "Screen" : i2 == 15 ? "Overlay" : i2 == 16 ? "Darken" : i2 == 17 ? "Lighten" : i2 == 18 ? "ColorDodge" : i2 == 19 ? "ColorBurn" : i2 == 20 ? "HardLight" : i2 == 21 ? "Softlight" : i2 == 22 ? "Difference" : i2 == 23 ? "Exclusion" : i2 == 24 ? "Multiply" : i2 == 25 ? "Hue" : i2 == 26 ? "Saturation" : i2 == 27 ? "Color" : i2 == 28 ? "Luminosity" : "Unknown";
    }

    public static final void h(l70 l70Var, t50 t50Var) {
        l70 s = a0(t50Var).s();
        int i2 = s.f - 1;
        Object[] objArr = s.d;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                l70Var.b((t50) ((p10) objArr[i2]).F.j);
                i2--;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public static boolean h0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, bm[] bmVarArr) {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = a50.n;
        byte[] bArr3 = a50.m;
        byte[] bArr4 = a50.j;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = a50.k;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] u = u(bmVarArr, bArr5);
                x40.X(byteArrayOutputStream, bmVarArr.length, 1);
                x40.X(byteArrayOutputStream, u.length, 4);
                byte[] u2 = x40.u(u);
                x40.X(byteArrayOutputStream, u2.length, 4);
                byteArrayOutputStream.write(u2);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                x40.X(byteArrayOutputStream, bmVarArr.length, 1);
                for (bm bmVar : bmVarArr) {
                    int size = bmVar.i.size() * 4;
                    String z = z(bmVar.a, bmVar.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    x40.Y(byteArrayOutputStream, z.getBytes(charset).length);
                    x40.Y(byteArrayOutputStream, bmVar.h.length);
                    x40.X(byteArrayOutputStream, size, 4);
                    x40.X(byteArrayOutputStream, bmVar.c, 4);
                    byteArrayOutputStream.write(z.getBytes(charset));
                    Iterator it = bmVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        x40.Y(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        x40.Y(byteArrayOutputStream, 0);
                    }
                    for (int i4 : bmVar.h) {
                        x40.Y(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = a50.l;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] u3 = u(bmVarArr, bArr6);
                x40.X(byteArrayOutputStream, bmVarArr.length, 1);
                x40.X(byteArrayOutputStream, u3.length, 4);
                byte[] u4 = x40.u(u3);
                x40.X(byteArrayOutputStream, u4.length, 4);
                byteArrayOutputStream.write(u4);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            x40.Y(byteArrayOutputStream, bmVarArr.length);
            for (bm bmVar2 : bmVarArr) {
                String str = bmVar2.a;
                TreeMap treeMap = bmVar2.i;
                String z2 = z(str, bmVar2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                x40.Y(byteArrayOutputStream, z2.getBytes(charset2).length);
                x40.Y(byteArrayOutputStream, treeMap.size());
                x40.Y(byteArrayOutputStream, bmVar2.h.length);
                x40.X(byteArrayOutputStream, bmVar2.c, 4);
                byteArrayOutputStream.write(z2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    x40.Y(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : bmVar2.h) {
                    x40.Y(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            x40.Y(byteArrayOutputStream2, bmVarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (bm bmVar3 : bmVarArr) {
                x40.X(byteArrayOutputStream2, bmVar3.c, 4);
                x40.X(byteArrayOutputStream2, bmVar3.d, 4);
                x40.X(byteArrayOutputStream2, bmVar3.g, 4);
                String z3 = z(bmVar3.a, bmVar3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = z3.getBytes(charset3).length;
                x40.Y(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(z3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            c31 c31Var = new c31(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(c31Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < bmVarArr.length) {
                try {
                    bm bmVar4 = bmVarArr[i8];
                    x40.Y(byteArrayOutputStream3, i8);
                    x40.Y(byteArrayOutputStream3, bmVar4.e);
                    i9 = i9 + 4 + (bmVar4.e * i6);
                    int[] iArr = bmVar4.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        x40.Y(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i6 = i6;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                }
            }
            int i12 = i6;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            c31 c31Var2 = new c31(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(c31Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < bmVarArr.length; i14++) {
                try {
                    bm bmVar5 = bmVarArr[i14];
                    Iterator it3 = bmVar5.i.entrySet().iterator();
                    int i15 = 0;
                    while (it3.hasNext()) {
                        i15 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        k0(byteArrayOutputStream4, i15, bmVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            l0(byteArrayOutputStream4, bmVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            x40.Y(byteArrayOutputStream3, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i16 = i13 + 6;
                            x40.X(byteArrayOutputStream3, length4, 4);
                            x40.Y(byteArrayOutputStream3, i15);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i13 = i16 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            c31 c31Var3 = new c31(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(c31Var3);
            long size2 = 12 + (arrayList.size() * 16);
            x40.X(byteArrayOutputStream, arrayList.size(), 4);
            int i17 = 0;
            while (i17 < arrayList.size()) {
                c31 c31Var4 = (c31) arrayList.get(i17);
                int i18 = c31Var4.a;
                byte[] bArr7 = c31Var4.b;
                if (i18 != 1) {
                    i2 = i12;
                    if (i18 == i2) {
                        j2 = 1;
                    } else if (i18 == 3) {
                        j2 = 2;
                    } else if (i18 == 4) {
                        j2 = 3;
                    } else {
                        if (i18 != 5) {
                            throw null;
                        }
                        j2 = 4;
                    }
                } else {
                    i2 = i12;
                    j2 = 0;
                }
                x40.X(byteArrayOutputStream, j2, 4);
                x40.X(byteArrayOutputStream, size2, 4);
                if (c31Var4.c) {
                    long length5 = bArr7.length;
                    byte[] u5 = x40.u(bArr7);
                    arrayList2.add(u5);
                    x40.X(byteArrayOutputStream, u5.length, 4);
                    x40.X(byteArrayOutputStream, length5, 4);
                    length = u5.length;
                } else {
                    arrayList2.add(bArr7);
                    x40.X(byteArrayOutputStream, bArr7.length, 4);
                    x40.X(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i17++;
                i12 = i2;
            }
            for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i19));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static final int i(f40 f40Var, lw lwVar) {
        f40 W = f40Var.W();
        if (W == null) {
            cy.b("Child of " + f40Var + " cannot be null when calculating alignment line");
        }
        if (f40Var.a0().a().containsKey(lwVar)) {
            Integer num = (Integer) f40Var.a0().a().get(lwVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int V = W.V(lwVar);
            if (V != Integer.MIN_VALUE) {
                W.m = true;
                f40Var.n = true;
                f40Var.j0();
                W.m = false;
                f40Var.n = false;
                return V + ((int) (lwVar instanceof lw ? W.c0() & 4294967295L : W.c0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static void i0(ByteArrayOutputStream byteArrayOutputStream, bm bmVar) {
        l0(byteArrayOutputStream, bmVar);
        int i2 = bmVar.g;
        int[] iArr = bmVar.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            x40.Y(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bmVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i6 = intValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i7 = intValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final t50 j(l70 l70Var) {
        int i2;
        if (l70Var == null || (i2 = l70Var.f) == 0) {
            return null;
        }
        return (t50) l70Var.j(i2 - 1);
    }

    public static void j0(ByteArrayOutputStream byteArrayOutputStream, bm bmVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        x40.Y(byteArrayOutputStream, str.getBytes(charset).length);
        x40.Y(byteArrayOutputStream, bmVar.e);
        x40.X(byteArrayOutputStream, bmVar.f, 4);
        x40.X(byteArrayOutputStream, bmVar.c, 4);
        x40.X(byteArrayOutputStream, bmVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static final void k(c1 c1Var, rp0 rp0Var) {
        np0 np0Var = rp0Var.d;
        a70 a70Var = np0Var.d;
        Object g2 = np0Var.d.g(vp0.w);
        if (g2 == null) {
            g2 = null;
        }
        tl0 tl0Var = (tl0) g2;
        if (a50.f(rp0Var)) {
            if (tl0Var != null && tl0Var.a == 8) {
                return;
            }
            Object g3 = a70Var.g(mp0.v);
            if (g3 == null) {
                g3 = null;
            }
            h0 h0Var = (h0) g3;
            if (h0Var != null) {
                c1Var.a(new y0(null, R.id.accessibilityActionPageUp, h0Var.a, null));
            }
            Object g4 = a70Var.g(mp0.x);
            if (g4 == null) {
                g4 = null;
            }
            h0 h0Var2 = (h0) g4;
            if (h0Var2 != null) {
                c1Var.a(new y0(null, R.id.accessibilityActionPageDown, h0Var2.a, null));
            }
            Object g5 = a70Var.g(mp0.w);
            if (g5 == null) {
                g5 = null;
            }
            h0 h0Var3 = (h0) g5;
            if (h0Var3 != null) {
                c1Var.a(new y0(null, R.id.accessibilityActionPageLeft, h0Var3.a, null));
            }
            Object g6 = a70Var.g(mp0.y);
            if (g6 == null) {
                g6 = null;
            }
            h0 h0Var4 = (h0) g6;
            if (h0Var4 != null) {
                c1Var.a(new y0(null, R.id.accessibilityActionPageRight, h0Var4.a, null));
            }
        }
    }

    public static void k0(ByteArrayOutputStream byteArrayOutputStream, int i2, bm bmVar) {
        int i3 = bmVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : bmVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & intValue2) == i5) {
                        int i6 = (i4 * i3) + intValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static boolean l(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void l0(ByteArrayOutputStream byteArrayOutputStream, bm bmVar) {
        int i2 = 0;
        for (Map.Entry entry : bmVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                x40.Y(byteArrayOutputStream, intValue - i2);
                x40.Y(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final i10 m(t50 t50Var) {
        if ((t50Var.f & 2) != 0) {
            if (t50Var instanceof i10) {
                return (i10) t50Var;
            }
            if (t50Var instanceof ol) {
                t50 t50Var2 = ((ol) t50Var).s;
                while (t50Var2 != 0) {
                    if (t50Var2 instanceof i10) {
                        return (i10) t50Var2;
                    }
                    t50Var2 = (!(t50Var2 instanceof ol) || (t50Var2.f & 2) == 0) ? t50Var2.i : ((ol) t50Var2).s;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean n(ts tsVar, y5 y5Var) {
        int ordinal = tsVar.l0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ts B = B(tsVar);
                if (B == null) {
                    g8.s("ActiveParent must have a focusedChild");
                    return false;
                }
                int ordinal2 = B.l0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                g8.c();
                                return false;
                            }
                            g8.s("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (n(B, y5Var) || y(tsVar, B, 2, y5Var) || (B.k0().a && ((Boolean) y5Var.c(B)).booleanValue())) {
                        return true;
                    }
                }
                return y(tsVar, B, 2, y5Var);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    g8.c();
                    return false;
                }
                if (!M(tsVar, y5Var)) {
                    if (!(tsVar.k0().a ? ((Boolean) y5Var.c(tsVar)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return M(tsVar, y5Var);
    }

    public static final int o(int[] iArr, int i2, int i3) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int p(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final void q(int i2) {
        if (i2 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i2).toString());
    }

    public static final u50 r(u50 u50Var) {
        return androidx.compose.ui.graphics.a.c(u50Var, null, 520191);
    }

    public static int s(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int t(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static byte[] u(bm[] bmVarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (bm bmVar : bmVarArr) {
            i3 += ((((bmVar.g * 2) + 7) & (-8)) / 8) + (bmVar.e * 2) + z(bmVar.a, bmVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bmVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, a50.l)) {
            int length = bmVarArr.length;
            while (i2 < length) {
                bm bmVar2 = bmVarArr[i2];
                j0(byteArrayOutputStream, bmVar2, z(bmVar2.a, bmVar2.b, bArr));
                i0(byteArrayOutputStream, bmVar2);
                i2++;
            }
        } else {
            for (bm bmVar3 : bmVarArr) {
                j0(byteArrayOutputStream, bmVar3, z(bmVar3.a, bmVar3.b, bArr));
            }
            int length2 = bmVarArr.length;
            while (i2 < length2) {
                i0(byteArrayOutputStream, bmVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static final ts v(ts tsVar) {
        ts tsVar2 = ((ks) ((f3) b0(tsVar)).getFocusOwner()).h;
        if (tsVar2 == null || !tsVar2.q) {
            return null;
        }
        return tsVar2;
    }

    public static final zi0 w(ts tsVar) {
        ea0 ea0Var = tsVar.k;
        return ea0Var != null ? mz.C(ea0Var).z(ea0Var, false) : zi0.e;
    }

    public static final boolean x(ts tsVar, y5 y5Var) {
        int ordinal = tsVar.l0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ts B = B(tsVar);
                if (B != null) {
                    return x(B, y5Var) || y(tsVar, B, 1, y5Var);
                }
                g8.s("ActiveParent must have a focusedChild");
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return tsVar.k0().a ? ((Boolean) y5Var.c(tsVar)).booleanValue() : N(tsVar, y5Var);
                }
                g8.c();
                return false;
            }
        }
        return N(tsVar, y5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x019d A[EDGE_INSN: B:154:0x019d->B:136:0x019d BREAK  A[LOOP:5: B:95:0x012e->B:149:0x012e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0130  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean y(ts tsVar, ts tsVar2, int i2, y5 y5Var) {
        boolean z;
        t50 t50Var;
        p10 a0;
        ca0 ca0Var;
        if (tsVar.l0() == rs.e) {
            ts[] tsVarArr = new ts[16];
            if (!tsVar.d.q) {
                cy.b("visitChildren called on an unattached node");
            }
            l70 l70Var = new l70(new t50[16]);
            t50 t50Var2 = tsVar.d;
            t50 t50Var3 = t50Var2.i;
            if (t50Var3 == null) {
                h(l70Var, t50Var2);
            } else {
                l70Var.b(t50Var3);
            }
            int i3 = 0;
            while (true) {
                int i4 = l70Var.f;
                t50Var = null;
                if (i4 == 0) {
                    break;
                }
                t50 t50Var4 = (t50) l70Var.j(i4 - 1);
                if ((t50Var4.g & 1024) == 0) {
                    h(l70Var, t50Var4);
                } else {
                    while (true) {
                        if (t50Var4 == null) {
                            break;
                        }
                        if ((t50Var4.f & 1024) != 0) {
                            l70 l70Var2 = null;
                            while (t50Var4 != null) {
                                if (t50Var4 instanceof ts) {
                                    ts tsVar3 = (ts) t50Var4;
                                    int i5 = i3 + 1;
                                    if (tsVarArr.length < i5) {
                                        int length = tsVarArr.length;
                                        ?? r11 = new Object[Math.max(i5, length * 2)];
                                        System.arraycopy(tsVarArr, 0, r11, 0, length);
                                        tsVarArr = r11;
                                    }
                                    tsVarArr[i3] = tsVar3;
                                    i3 = i5;
                                } else if ((t50Var4.f & 1024) != 0 && (t50Var4 instanceof ol)) {
                                    int i6 = 0;
                                    for (t50 t50Var5 = ((ol) t50Var4).s; t50Var5 != null; t50Var5 = t50Var5.i) {
                                        if ((t50Var5.f & 1024) != 0) {
                                            i6++;
                                            if (i6 == 1) {
                                                t50Var4 = t50Var5;
                                            } else {
                                                if (l70Var2 == null) {
                                                    l70Var2 = new l70(new t50[16]);
                                                }
                                                if (t50Var4 != null) {
                                                    l70Var2.b(t50Var4);
                                                    t50Var4 = null;
                                                }
                                                l70Var2.b(t50Var5);
                                            }
                                        }
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                t50Var4 = j(l70Var2);
                            }
                        } else {
                            t50Var4 = t50Var4.i;
                        }
                    }
                }
            }
            Arrays.sort(tsVarArr, 0, i3, us.b);
            if (i2 == 1) {
                ez v = rg0.v(0, i3);
                int i7 = v.d;
                int i8 = v.e;
                if (i7 <= i8) {
                    boolean z2 = false;
                    while (true) {
                        if (z2) {
                            ts tsVar4 = tsVarArr[i7];
                            if (H(tsVar4) && x(tsVar4, y5Var)) {
                                break;
                            }
                        }
                        if (l(tsVarArr[i7], tsVar2)) {
                            z2 = true;
                        }
                        if (i7 == i8) {
                            break;
                        }
                        i7++;
                    }
                    z = true;
                }
                if (i2 != 1 && tsVar.k0().a) {
                    if (!tsVar.d.q) {
                        cy.b("visitAncestors called on an unattached node");
                    }
                    t50 t50Var6 = tsVar.d.h;
                    a0 = a0(tsVar);
                    loop5: while (true) {
                        if (a0 == null) {
                            break;
                        }
                        if ((((t50) a0.F.j).g & 1024) != 0) {
                            while (t50Var6 != null) {
                                if ((t50Var6.f & 1024) != 0) {
                                    t50 t50Var7 = t50Var6;
                                    l70 l70Var3 = null;
                                    while (t50Var7 != null) {
                                        if (t50Var7 instanceof ts) {
                                            t50Var = t50Var7;
                                            break loop5;
                                        }
                                        if ((t50Var7.f & 1024) != 0 && (t50Var7 instanceof ol)) {
                                            int i9 = 0;
                                            for (t50 t50Var8 = ((ol) t50Var7).s; t50Var8 != null; t50Var8 = t50Var8.i) {
                                                if ((t50Var8.f & 1024) != 0) {
                                                    i9++;
                                                    if (i9 == 1) {
                                                        t50Var7 = t50Var8;
                                                    } else {
                                                        if (l70Var3 == null) {
                                                            l70Var3 = new l70(new t50[16]);
                                                        }
                                                        if (t50Var7 != null) {
                                                            l70Var3.b(t50Var7);
                                                            t50Var7 = null;
                                                        }
                                                        l70Var3.b(t50Var8);
                                                    }
                                                }
                                            }
                                            if (i9 == 1) {
                                            }
                                        }
                                        t50Var7 = j(l70Var3);
                                    }
                                }
                                t50Var6 = t50Var6.h;
                            }
                        }
                        a0 = a0.n();
                        t50Var6 = (a0 == null || (ca0Var = a0.F) == null) ? null : (su0) ca0Var.i;
                    }
                    if (t50Var != null) {
                        z = ((Boolean) y5Var.c(tsVar)).booleanValue();
                    }
                }
            } else if (i2 == 2) {
                ez v2 = rg0.v(0, i3);
                int i10 = v2.d;
                int i11 = v2.e;
                if (i10 <= i11) {
                    boolean z3 = false;
                    while (true) {
                        if (z3) {
                            ts tsVar5 = tsVarArr[i11];
                            if (H(tsVar5) && n(tsVar5, y5Var)) {
                                break;
                            }
                        }
                        if (l(tsVarArr[i11], tsVar2)) {
                            z3 = true;
                        }
                        if (i11 == i10) {
                            break;
                        }
                        i11--;
                    }
                    z = true;
                }
                if (i2 != 1) {
                    if (!tsVar.d.q) {
                    }
                    t50 t50Var62 = tsVar.d.h;
                    a0 = a0(tsVar);
                    loop5: while (true) {
                        if (a0 == null) {
                        }
                    }
                    if (t50Var != null) {
                    }
                }
            } else {
                g8.s("This function should only be used for 1-D focus search");
            }
            if (!z) {
                return true;
            }
            ts tsVar6 = ((ks) ((f3) b0(tsVar)).getFocusOwner()).h;
            nk.J(tsVar);
            return false;
        }
        g8.s("This function should only be used within a parent that has focus.");
        z = false;
        if (!z) {
        }
    }

    public static String z(String str, String str2, byte[] bArr) {
        byte[] bArr2 = a50.m;
        byte[] bArr3 = a50.n;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }
}
