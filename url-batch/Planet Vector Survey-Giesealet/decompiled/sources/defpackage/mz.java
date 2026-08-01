package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class mz {
    public static final j3 m;
    public static final j3 n;
    public static final j3 o;
    public static final e7 a = new e7(Float.POSITIVE_INFINITY);
    public static final f7 b = new f7(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final g7 c = new g7(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final h7 d = new h7(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final e7 e = new e7(Float.NEGATIVE_INFINITY);
    public static final f7 f = new f7(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final g7 g = new g7(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final h7 h = new h7(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final op i = new op("CLOSED", 1);
    public static final an j = new an();
    public static final tl k = new tl(1.0f, 1.0f);
    public static final pg0 l = new pg0(1);
    public static final op p = new op("NO_THREAD_ELEMENTS", 1);
    public static final pn0 q = new pn0(8);
    public static final pn0 r = new pn0(9);
    public static final pn0 s = new pn0(10);

    static {
        int i2 = 12;
        m = new j3(i2, new pn0(5), new tn0(0));
        n = new j3(i2, new pn0(6), new tn0(1));
        o = new j3(i2, new pn0(7), new tn0(2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object A(di diVar, ii0 ii0Var) {
        if (!((t50) diVar).d.q) {
            cy.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        gf0 gf0Var = (gf0) nz.a0(diVar).B;
        gf0Var.getClass();
        return a50.D(gf0Var, ii0Var);
    }

    public static final Object B(long j2, lj ljVar) {
        if (j2 > 0) {
            hc hcVar = new hc(1, d31.B(ljVar));
            hcVar.q();
            if (j2 < Long.MAX_VALUE) {
                pj k2 = hcVar.h.k(b2.t);
                ml mlVar = k2 instanceof ml ? (ml) k2 : null;
                if (mlVar == null) {
                    mlVar = vk.a;
                }
                mlVar.c(j2, hcVar);
            }
            Object p2 = hcVar.p();
            if (p2 == ck.d) {
                return p2;
            }
        }
        return ky0.a;
    }

    public static final b10 C(b10 b10Var) {
        b10 b10Var2;
        b10 g2 = b10Var.g();
        while (true) {
            b10 b10Var3 = g2;
            b10Var2 = b10Var;
            b10Var = b10Var3;
            if (b10Var == null) {
                break;
            }
            g2 = b10Var.g();
        }
        ea0 ea0Var = b10Var2 instanceof ea0 ? (ea0) b10Var2 : null;
        if (ea0Var == null) {
            return b10Var2;
        }
        ea0 ea0Var2 = ea0Var.t;
        while (true) {
            ea0 ea0Var3 = ea0Var2;
            ea0 ea0Var4 = ea0Var;
            ea0Var = ea0Var3;
            if (ea0Var == null) {
                return ea0Var4;
            }
            ea0Var2 = ea0Var.t;
        }
    }

    public static final Object D(kp0 kp0Var, long j2, qu quVar) {
        while (true) {
            if (kp0Var.c >= j2 && !kp0Var.c()) {
                return kp0Var;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ni.a;
            Object obj = atomicReferenceFieldUpdater.get(kp0Var);
            op opVar = i;
            if (obj == opVar) {
                return opVar;
            }
            kp0 kp0Var2 = (kp0) ((ni) obj);
            if (kp0Var2 == null) {
                kp0Var2 = (kp0) quVar.invoke(Long.valueOf(kp0Var.c + 1), kp0Var);
                while (!atomicReferenceFieldUpdater.compareAndSet(kp0Var, null, kp0Var2)) {
                    if (atomicReferenceFieldUpdater.get(kp0Var) != null) {
                        break;
                    }
                }
                if (kp0Var.c()) {
                    kp0Var.d();
                }
            }
            kp0Var = kp0Var2;
        }
    }

    public static final hc E(kj kjVar) {
        hc hcVar;
        hc hcVar2;
        if (!(kjVar instanceof rm)) {
            return new hc(1, kjVar);
        }
        rm rmVar = (rm) kjVar;
        op opVar = d31.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = rm.k;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(rmVar);
            hcVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(rmVar, opVar);
                hcVar2 = null;
                break;
            }
            if (obj instanceof hc) {
                while (!atomicReferenceFieldUpdater.compareAndSet(rmVar, obj, opVar)) {
                    if (atomicReferenceFieldUpdater.get(rmVar) != obj) {
                        break;
                    }
                }
                hcVar2 = (hc) obj;
                break loop0;
            }
            if (obj != opVar && !(obj instanceof Throwable)) {
                g8.d(obj, "Inconsistent state ");
                return null;
            }
        }
        if (hcVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = hc.j;
            Object obj2 = atomicReferenceFieldUpdater2.get(hcVar2);
            if (!(obj2 instanceof gf) || ((gf) obj2).d == null) {
                hc.i.set(hcVar2, 536870911);
                atomicReferenceFieldUpdater2.set(hcVar2, m1.a);
                hcVar = hcVar2;
            } else {
                hcVar2.m();
            }
            if (hcVar != null) {
                return hcVar;
            }
        }
        return new hc(2, kjVar);
    }

    public static Intent F(Context context, ComponentName componentName) {
        String G = G(context, componentName);
        if (G == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), G);
        return G(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String G(Context context, ComponentName componentName) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2 >= 29 ? 269222528 : i2 >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void H(no noVar) {
        if (((t50) noVar).d.q) {
            nz.Y(noVar, 1).C0();
        }
    }

    public static final long I(float[] fArr, long j2) {
        if (fArr.length < 16) {
            return j2;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[7];
        float f8 = fArr[12];
        float f9 = fArr[13];
        float f10 = fArr[15];
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        float f11 = 1.0f / (((f7 * intBitsToFloat2) + (f4 * intBitsToFloat)) + f10);
        if ((Float.floatToRawIntBits(f11) & Integer.MAX_VALUE) >= 2139095040) {
            f11 = 0.0f;
        }
        float f12 = ((f6 * intBitsToFloat2) + (f3 * intBitsToFloat) + f9) * f11;
        return (Float.floatToRawIntBits((((f5 * intBitsToFloat2) + (f2 * intBitsToFloat)) + f8) * f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
    }

    public static final void J(float[] fArr, z60 z60Var) {
        if (fArr.length < 16) {
            return;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[7];
        float f8 = fArr[12];
        float f9 = fArr[13];
        float f10 = fArr[15];
        float f11 = z60Var.a;
        float f12 = z60Var.b;
        float f13 = z60Var.c;
        float f14 = z60Var.d;
        float f15 = f4 * f11;
        float f16 = f7 * f12;
        float f17 = 1.0f / ((f15 + f16) + f10);
        if ((Float.floatToRawIntBits(f17) & Integer.MAX_VALUE) >= 2139095040) {
            f17 = 0.0f;
        }
        float f18 = f2 * f11;
        float f19 = f5 * f12;
        float f20 = (f18 + f19 + f8) * f17;
        float f21 = f11 * f3;
        float f22 = f12 * f6;
        float f23 = (f21 + f22 + f9) * f17;
        float f24 = f7 * f14;
        float f25 = 1.0f / ((f15 + f24) + f10);
        if ((Float.floatToRawIntBits(f25) & Integer.MAX_VALUE) >= 2139095040) {
            f25 = 0.0f;
        }
        float f26 = f5 * f14;
        float f27 = (f18 + f26 + f8) * f25;
        float f28 = f6 * f14;
        float f29 = (f21 + f28 + f9) * f25;
        float f30 = f4 * f13;
        float f31 = 1.0f / ((f16 + f30) + f10);
        if ((Float.floatToRawIntBits(f31) & Integer.MAX_VALUE) >= 2139095040) {
            f31 = 0.0f;
        }
        float f32 = f2 * f13;
        float f33 = (f32 + f19 + f8) * f31;
        float f34 = f13 * f3;
        float f35 = (f22 + f34 + f9) * f31;
        float f36 = 1.0f / ((f30 + f24) + f10);
        float f37 = (Float.floatToRawIntBits(f36) & Integer.MAX_VALUE) < 2139095040 ? f36 : 0.0f;
        float f38 = (f32 + f26 + f8) * f37;
        float f39 = (f34 + f28 + f9) * f37;
        z60Var.a = Math.min(f20, Math.min(f27, Math.min(f33, f38)));
        z60Var.b = Math.min(f23, Math.min(f29, Math.min(f35, f39)));
        z60Var.c = Math.max(f20, Math.max(f27, Math.max(f33, f38)));
        z60Var.d = Math.max(f23, Math.max(f29, Math.max(f35, f39)));
    }

    public static final ArrayList K(Map map, mu muVar) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            ((Map.Entry) it.next()).getValue().getClass();
            g8.q();
            return null;
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) muVar.c((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void L(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static final jk M(ts tsVar) {
        int ordinal = tsVar.l0().ordinal();
        jk jkVar = jk.d;
        if (ordinal != 0) {
            jk jkVar2 = jk.e;
            if (ordinal == 1) {
                ts B = nz.B(tsVar);
                if (B == null) {
                    g8.r("ActiveParent with no focused child");
                    return null;
                }
                jk M = M(B);
                jk jkVar3 = M != jkVar ? M : null;
                if (jkVar3 != null) {
                    return jkVar3;
                }
                if (tsVar.s) {
                    return jkVar;
                }
                tsVar.s = true;
                try {
                    ms k0 = tsVar.k0();
                    js focusOwner = ((f3) nz.b0(tsVar)).getFocusOwner();
                    ts tsVar2 = ((ks) focusOwner).h;
                    k0.k.getClass();
                    ts tsVar3 = ((ks) focusOwner).h;
                    return (tsVar2 == tsVar3 || tsVar3 == null) ? jkVar : os.d == os.c ? jkVar2 : jk.f;
                } finally {
                    tsVar.s = false;
                }
            }
            if (ordinal == 2) {
                return jkVar2;
            }
            if (ordinal != 3) {
                g8.c();
                return null;
            }
        }
        return jkVar;
    }

    public static final jk N(ts tsVar) {
        if (!tsVar.t) {
            tsVar.t = true;
            try {
                ms k0 = tsVar.k0();
                js focusOwner = ((f3) nz.b0(tsVar)).getFocusOwner();
                ts tsVar2 = ((ks) focusOwner).h;
                k0.j.getClass();
                ts tsVar3 = ((ks) focusOwner).h;
                if (tsVar2 != tsVar3 && tsVar3 != null) {
                    return os.d == os.c ? jk.e : jk.f;
                }
            } finally {
                tsVar.t = false;
            }
        }
        return jk.d;
    }

    public static final jk O(ts tsVar) {
        t50 t50Var;
        ca0 ca0Var;
        int ordinal = tsVar.l0().ordinal();
        jk jkVar = jk.d;
        if (ordinal != 0) {
            if (ordinal == 1) {
                ts B = nz.B(tsVar);
                if (B != null) {
                    return M(B);
                }
                g8.r("ActiveParent with no focused child");
                return null;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    g8.c();
                    return null;
                }
                if (!tsVar.d.q) {
                    cy.b("visitAncestors called on an unattached node");
                }
                t50 t50Var2 = tsVar.d.h;
                p10 a0 = nz.a0(tsVar);
                loop0: while (true) {
                    if (a0 == null) {
                        t50Var = null;
                        break;
                    }
                    if ((((t50) a0.F.j).g & 1024) != 0) {
                        while (t50Var2 != null) {
                            if ((t50Var2.f & 1024) != 0) {
                                t50Var = t50Var2;
                                l70 l70Var = null;
                                while (t50Var != null) {
                                    if (t50Var instanceof ts) {
                                        break loop0;
                                    }
                                    if ((t50Var.f & 1024) != 0 && (t50Var instanceof ol)) {
                                        int i2 = 0;
                                        for (t50 t50Var3 = ((ol) t50Var).s; t50Var3 != null; t50Var3 = t50Var3.i) {
                                            if ((t50Var3.f & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    t50Var = t50Var3;
                                                } else {
                                                    if (l70Var == null) {
                                                        l70Var = new l70(new t50[16]);
                                                    }
                                                    if (t50Var != null) {
                                                        l70Var.b(t50Var);
                                                        t50Var = null;
                                                    }
                                                    l70Var.b(t50Var3);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    t50Var = nz.j(l70Var);
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
                    return jkVar;
                }
                int ordinal2 = tsVar2.l0().ordinal();
                if (ordinal2 == 0) {
                    return N(tsVar2);
                }
                if (ordinal2 == 1) {
                    return O(tsVar2);
                }
                if (ordinal2 == 2) {
                    return jk.e;
                }
                if (ordinal2 != 3) {
                    g8.c();
                    return null;
                }
                jk O = O(tsVar2);
                jk jkVar2 = O != jkVar ? O : null;
                return jkVar2 == null ? N(tsVar2) : jkVar2;
            }
        }
        return jkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean P(ts tsVar) {
        l70 l70Var;
        ca0 ca0Var;
        char c2;
        ca0 ca0Var2;
        js focusOwner = ((f3) nz.b0(tsVar)).getFocusOwner();
        ts tsVar2 = ((ks) focusOwner).h;
        rs l0 = tsVar.l0();
        if (tsVar2 == tsVar) {
            tsVar.j0(l0, l0);
            return true;
        }
        int i2 = 0;
        if (tsVar2 == null && !((ks) ((f3) nz.b0(tsVar)).getFocusOwner()).a.D()) {
            return false;
        }
        char c3 = 16;
        if (tsVar2 != null) {
            l70Var = new l70(new ts[16]);
            if (!tsVar2.d.q) {
                cy.b("visitAncestors called on an unattached node");
            }
            t50 t50Var = tsVar2.d.h;
            p10 a0 = nz.a0(tsVar2);
            while (a0 != null) {
                if ((((t50) a0.F.j).g & 1024) != 0) {
                    while (t50Var != null) {
                        if ((t50Var.f & 1024) != 0) {
                            t50 t50Var2 = t50Var;
                            l70 l70Var2 = null;
                            while (t50Var2 != null) {
                                if (t50Var2 instanceof ts) {
                                    l70Var.b((ts) t50Var2);
                                } else if ((t50Var2.f & 1024) != 0 && (t50Var2 instanceof ol)) {
                                    int i3 = 0;
                                    for (t50 t50Var3 = ((ol) t50Var2).s; t50Var3 != null; t50Var3 = t50Var3.i) {
                                        if ((t50Var3.f & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                t50Var2 = t50Var3;
                                            } else {
                                                if (l70Var2 == null) {
                                                    l70Var2 = new l70(new t50[16]);
                                                }
                                                if (t50Var2 != null) {
                                                    l70Var2.b(t50Var2);
                                                    t50Var2 = null;
                                                }
                                                l70Var2.b(t50Var3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                t50Var2 = nz.j(l70Var2);
                            }
                        }
                        t50Var = t50Var.h;
                    }
                }
                a0 = a0.n();
                t50Var = (a0 == null || (ca0Var2 = a0.F) == null) ? null : (su0) ca0Var2.i;
            }
        } else {
            l70Var = null;
        }
        ts[] tsVarArr = new ts[16];
        if (!tsVar.d.q) {
            cy.b("visitAncestors called on an unattached node");
        }
        t50 t50Var4 = tsVar.d.h;
        p10 a02 = nz.a0(tsVar);
        int i4 = 1;
        int i5 = 0;
        while (a02 != null) {
            if ((((t50) a02.F.j).g & 1024) != 0) {
                while (t50Var4 != null) {
                    if ((t50Var4.f & 1024) != 0) {
                        t50 t50Var5 = t50Var4;
                        l70 l70Var3 = null;
                        while (t50Var5 != null) {
                            if (t50Var5 instanceof ts) {
                                ts tsVar3 = (ts) t50Var5;
                                Boolean valueOf = l70Var != null ? Boolean.valueOf(l70Var.i(tsVar3)) : null;
                                if (valueOf == null || !valueOf.booleanValue()) {
                                    int i6 = i5 + 1;
                                    if (tsVarArr.length < i6) {
                                        int length = tsVarArr.length;
                                        ?? r4 = new Object[Math.max(i6, length * 2)];
                                        System.arraycopy(tsVarArr, i2, r4, i2, length);
                                        tsVarArr = r4;
                                    }
                                    tsVarArr[i5] = tsVar3;
                                    i5 = i6;
                                }
                                if (tsVar3 == tsVar2) {
                                    i4 = i2;
                                }
                            } else if ((t50Var5.f & 1024) != 0 && (t50Var5 instanceof ol)) {
                                int i7 = i2;
                                for (t50 t50Var6 = ((ol) t50Var5).s; t50Var6 != null; t50Var6 = t50Var6.i) {
                                    if ((t50Var6.f & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            t50Var5 = t50Var6;
                                        } else {
                                            if (l70Var3 == null) {
                                                l70Var3 = new l70(new t50[16]);
                                            }
                                            if (t50Var5 != null) {
                                                l70Var3.b(t50Var5);
                                                t50Var5 = null;
                                            }
                                            l70Var3.b(t50Var6);
                                        }
                                    }
                                }
                                c2 = 16;
                                if (i7 == 1) {
                                    c3 = 16;
                                    i2 = 0;
                                }
                                t50Var5 = nz.j(l70Var3);
                                c3 = c2;
                                i2 = 0;
                            }
                            c2 = 16;
                            t50Var5 = nz.j(l70Var3);
                            c3 = c2;
                            i2 = 0;
                        }
                    }
                    t50Var4 = t50Var4.h;
                    c3 = c3;
                    i2 = 0;
                }
            }
            char c4 = c3;
            a02 = a02.n();
            t50Var4 = (a02 == null || (ca0Var = a02.F) == null) ? null : (su0) ca0Var.i;
            c3 = c4;
            i2 = 0;
        }
        if (i4 == 0 || tsVar2 == null || v(tsVar2, false)) {
            nk.H(tsVar, new b(3, tsVar));
            int ordinal = tsVar.l0().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            g8.c();
                            return false;
                        }
                    }
                }
                ((ks) ((f3) nz.b0(tsVar)).getFocusOwner()).f(tsVar);
            }
            rs rsVar = rs.g;
            rs rsVar2 = rs.e;
            if (l70Var != null) {
                int i8 = l70Var.f - 1;
                Object[] objArr = l70Var.d;
                if (i8 < objArr.length) {
                    while (i8 >= 0) {
                        ts tsVar4 = (ts) objArr[i8];
                        if (((ks) focusOwner).h != tsVar) {
                            break;
                        }
                        tsVar4.j0(rsVar2, rsVar);
                        i8--;
                    }
                }
            }
            int i9 = i5 - 1;
            int length2 = tsVarArr.length;
            rs rsVar3 = rs.d;
            if (i9 < length2) {
                while (i9 >= 0) {
                    ts tsVar5 = tsVarArr[i9];
                    if (((ks) focusOwner).h != tsVar) {
                        break;
                    }
                    tsVar5.j0(tsVar5 == tsVar2 ? rsVar3 : rsVar, rsVar2);
                    i9--;
                }
            }
            ks ksVar = (ks) focusOwner;
            if (ksVar.h == tsVar) {
                tsVar.j0(l0, rsVar3);
                if (ksVar.h != tsVar) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static final dd0 Q(p10 p10Var) {
        dd0 dd0Var = p10Var.p;
        if (dd0Var != null) {
            return dd0Var;
        }
        throw y6.u("LayoutNode should be attached to an owner");
    }

    public static final void R(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void S(rj rjVar, Object obj) {
        if (obj == p) {
            return;
        }
        if (!(obj instanceof kw0)) {
            rjVar.o(r, null).getClass();
            g8.q();
            return;
        }
        mj[] mjVarArr = ((kw0) obj).b;
        int length = mjVarArr.length - 1;
        if (length < 0) {
            return;
        }
        mj mjVar = mjVarArr[length];
        throw null;
    }

    public static final String T(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String U(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final Object V(rj rjVar) {
        Object o2 = rjVar.o(q, 0);
        o2.getClass();
        return o2;
    }

    public static final Bitmap.Config W(int i2) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (i2 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i2 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i2 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && i2 == 3) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i3 < 26 || i2 != 4) {
            return Bitmap.Config.ARGB_8888;
        }
        config = Bitmap.Config.HARDWARE;
        return config;
    }

    public static void X(float[] fArr, float f2, float f3) {
        if (fArr.length < 16) {
            return;
        }
        float f4 = (fArr[8] * 0.0f) + (fArr[4] * f3) + (fArr[0] * f2) + fArr[12];
        float f5 = (fArr[9] * 0.0f) + (fArr[5] * f3) + (fArr[1] * f2) + fArr[13];
        float f6 = (fArr[10] * 0.0f) + (fArr[6] * f3) + (fArr[2] * f2) + fArr[14];
        float f7 = (fArr[11] * 0.0f) + (fArr[7] * f3) + (fArr[3] * f2) + fArr[15];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = f7;
    }

    public static final Object Y(rj rjVar, Object obj) {
        if (obj == null) {
            obj = V(rjVar);
        }
        if (obj == 0) {
            return p;
        }
        if (obj instanceof Integer) {
            return rjVar.o(s, new kw0(((Number) obj).intValue(), rjVar));
        }
        g8.q();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(Context context, Executor executor, yh0 yh0Var, boolean z) {
        boolean z2;
        ?? r7;
        bm[] bmVarArr;
        bm[] bmVarArr2;
        bm[] bmVarArr3;
        byte[] bArr;
        boolean z3;
        boolean z4;
        Throwable th;
        Throwable th2;
        boolean z5;
        boolean z6;
        ?? r72;
        boolean z7;
        am amVar;
        boolean z8;
        FileInputStream a2;
        boolean z9;
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z10 = readLong == packageInfo.lastUpdateTime;
                            if (z10) {
                                yh0Var.d(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        ci0.c(context, false);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = nz.j;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            am amVar2 = new am(assets, executor, yh0Var, name, file2);
            byte[] bArr3 = amVar2.c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        amVar2.b(4, null);
                    }
                    amVar2.f = true;
                    try {
                        try {
                            r7 = amVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e2) {
                            yh0Var.d(6, e2);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            bmVarArr2 = amVar2.g;
                            if (bmVarArr2 != null) {
                            }
                            yh0 yh0Var2 = amVar2.b;
                            bmVarArr3 = amVar2.g;
                            byte[] bArr4 = amVar2.c;
                            boolean z11 = r7;
                            z11 = r7;
                            if (bmVarArr3 != null) {
                            }
                            bArr = amVar2.h;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            ci0.c(context, (z6 || !z) ? false : z9);
                        } catch (IOException e3) {
                            yh0Var.d(7, e3);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            bmVarArr2 = amVar2.g;
                            if (bmVarArr2 != null) {
                            }
                            yh0 yh0Var22 = amVar2.b;
                            bmVarArr3 = amVar2.g;
                            byte[] bArr42 = amVar2.c;
                            boolean z112 = r7;
                            z112 = r7;
                            if (bmVarArr3 != null) {
                            }
                            bArr = amVar2.h;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            ci0.c(context, (z6 || !z) ? false : z9);
                        }
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e4) {
                                    yh0Var.d(8, e4);
                                    try {
                                        r7.close();
                                    } catch (IOException e5) {
                                        yh0Var.d(7, e5);
                                    }
                                    bmVarArr = null;
                                    amVar2.g = bmVarArr;
                                    bmVarArr2 = amVar2.g;
                                    if (bmVarArr2 != null) {
                                    }
                                    yh0 yh0Var222 = amVar2.b;
                                    bmVarArr3 = amVar2.g;
                                    byte[] bArr422 = amVar2.c;
                                    boolean z1122 = r7;
                                    z1122 = r7;
                                    if (bmVarArr3 != null) {
                                    }
                                    bArr = amVar2.h;
                                    if (bArr != null) {
                                    }
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    ci0.c(context, (z6 || !z) ? false : z9);
                                }
                            } catch (IOException e6) {
                                yh0Var.d(7, e6);
                                r7.close();
                                bmVarArr = null;
                                amVar2.g = bmVarArr;
                                bmVarArr2 = amVar2.g;
                                if (bmVarArr2 != null) {
                                }
                                yh0 yh0Var2222 = amVar2.b;
                                bmVarArr3 = amVar2.g;
                                byte[] bArr4222 = amVar2.c;
                                boolean z11222 = r7;
                                z11222 = r7;
                                if (bmVarArr3 != null) {
                                }
                                bArr = amVar2.h;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                ci0.c(context, (z6 || !z) ? false : z9);
                            }
                            if (!Arrays.equals(bArr2, x40.L(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            bmVarArr = nz.V(r7, x40.L(r7, 4), amVar2.e);
                            try {
                                r7.close();
                            } catch (IOException e7) {
                                yh0Var.d(7, e7);
                            }
                            amVar2.g = bmVarArr;
                        }
                        bmVarArr2 = amVar2.g;
                        if (bmVarArr2 != null && (r7 = Build.VERSION.SDK_INT) >= 24 && (r7 >= 31 || r7 == 24 || r7 == 25)) {
                            try {
                                r7 = "dexopt/baseline.profm";
                                a2 = amVar2.a(assets, "dexopt/baseline.profm");
                                z8 = r7;
                            } catch (FileNotFoundException e8) {
                                yh0Var.d(9, e8);
                                z8 = r7;
                            } catch (IOException e9) {
                                yh0Var.d(7, e9);
                                z8 = r7;
                            } catch (IllegalStateException e10) {
                                amVar2.g = null;
                                yh0Var.d(8, e10);
                                z8 = r7;
                            }
                            if (a2 == null) {
                                try {
                                    if (!Arrays.equals(nz.k, x40.L(a2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] L = x40.L(a2, 4);
                                    amVar2.g = nz.S(a2, L, bArr3, bmVarArr2);
                                    a2.close();
                                    amVar = amVar2;
                                    r7 = L;
                                    if (amVar != null) {
                                        amVar2 = amVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (a2 != null) {
                                    a2.close();
                                    z8 = r7;
                                }
                                amVar = null;
                                r7 = z8;
                                if (amVar != null) {
                                }
                            }
                        }
                        yh0 yh0Var22222 = amVar2.b;
                        bmVarArr3 = amVar2.g;
                        byte[] bArr42222 = amVar2.c;
                        boolean z112222 = r7;
                        z112222 = r7;
                        if (bmVarArr3 != null && bArr42222 != null) {
                            r72 = amVar2.f;
                            if (r72 != 0) {
                                g8.s("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                r72 = new ByteArrayOutputStream();
                                try {
                                    r72.write(bArr2);
                                    r72.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e11) {
                                yh0Var22222.d(7, e11);
                                z7 = r72;
                            } catch (IllegalStateException e12) {
                                yh0Var22222.d(8, e12);
                                z7 = r72;
                            }
                            if (nz.h0(r72, bArr42222, bmVarArr3)) {
                                amVar2.h = r72.toByteArray();
                                r72.close();
                                z7 = r72;
                                amVar2.g = null;
                                z112222 = z7;
                            } else {
                                yh0Var22222.d(5, null);
                                amVar2.g = null;
                                r72.close();
                                z112222 = r72;
                            }
                        }
                        bArr = amVar2.h;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!amVar2.f) {
                                    g8.s("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(amVar2.d);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z5 = true;
                                                                                amVar2.b(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                amVar2.h = null;
                                                                                amVar2.g = null;
                                                                                z4 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e13) {
                                        e = e13;
                                        amVar2.b(6, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        ci0.c(context, (z6 || !z) ? false : z9);
                                    } catch (IOException e14) {
                                        e = e14;
                                        amVar2.b(7, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        ci0.c(context, (z6 || !z) ? false : z9);
                                    }
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    z112222 = true;
                                    amVar2.b(6, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    ci0.c(context, (z6 || !z) ? false : z9);
                                } catch (IOException e16) {
                                    e = e16;
                                    z112222 = true;
                                    amVar2.b(7, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    ci0.c(context, (z6 || !z) ? false : z9);
                                }
                            } finally {
                                amVar2.h = null;
                                amVar2.g = null;
                            }
                        }
                        if (z4) {
                            L(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z9 = z5;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            amVar2.b(4, null);
                        }
                        amVar2.f = true;
                        r7 = amVar2.a(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        bmVarArr2 = amVar2.g;
                        if (bmVarArr2 != null) {
                            r7 = "dexopt/baseline.profm";
                            a2 = amVar2.a(assets, "dexopt/baseline.profm");
                            z8 = r7;
                            if (a2 == null) {
                            }
                        }
                        yh0 yh0Var222222 = amVar2.b;
                        bmVarArr3 = amVar2.g;
                        byte[] bArr422222 = amVar2.c;
                        boolean z1122222 = r7;
                        z1122222 = r7;
                        if (bmVarArr3 != null) {
                            r72 = amVar2.f;
                            if (r72 != 0) {
                            }
                        }
                        bArr = amVar2.h;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        amVar2.b(4, null);
                    }
                }
                ci0.c(context, (z6 || !z) ? false : z9);
            }
            amVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z9 = z2;
            ci0.c(context, (z6 || !z) ? false : z9);
        } catch (PackageManager.NameNotFoundException e17) {
            yh0Var.d(7, e17);
            ci0.c(context, false);
        }
    }

    public static final int a0(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    public static b6 f() {
        return new b6(Float.valueOf(0.0f), dz0.a, Float.valueOf(0.01f), 8);
    }

    public static long g(float f2) {
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static final void h(Object obj, mu muVar, ih ihVar) {
        qh qhVar = (qh) ihVar;
        boolean f2 = qhVar.f(obj);
        Object K = qhVar.K();
        if (f2 || K == hh.a) {
            K = new ym(muVar);
            qhVar.e0(K);
        }
    }

    public static final void i(Object obj, Object obj2, mu muVar, ih ihVar) {
        qh qhVar = (qh) ihVar;
        boolean f2 = qhVar.f(obj) | qhVar.f(obj2);
        Object K = qhVar.K();
        if (f2 || K == hh.a) {
            K = new ym(muVar);
            qhVar.e0(K);
        }
    }

    public static final long j(float f2, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void k(ih ihVar, qu quVar, Object obj) {
        rj rjVar = ((qh) ihVar).P;
        qh qhVar = (qh) ihVar;
        boolean f2 = qhVar.f(obj);
        Object K = qhVar.K();
        if (f2 || K == hh.a) {
            K = new x00(rjVar, quVar);
            qhVar.e0(K);
        }
    }

    public static final void l(Object obj, Object obj2, qu quVar, ih ihVar) {
        rj rjVar = ((qh) ihVar).P;
        qh qhVar = (qh) ihVar;
        boolean f2 = qhVar.f(obj) | qhVar.f(obj2);
        Object K = qhVar.K();
        if (f2 || K == hh.a) {
            K = new x00(rjVar, quVar);
            qhVar.e0(K);
        }
    }

    public static final void m(Boolean bool, Object obj, o20 o20Var, mu muVar, ih ihVar, int i2) {
        int i3;
        qh qhVar = (qh) ihVar;
        qhVar.W(696924721);
        if ((i2 & 6) == 0) {
            i3 = (qhVar.h(bool) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qhVar.h(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qhVar.h(muVar) ? 2048 : 1024;
        }
        if (qhVar.N(i3 & 1, (i3 & 1171) != 1170)) {
            qhVar.S();
            if ((i2 & 1) == 0 || qhVar.x()) {
                o20Var = (o20) qhVar.j(n30.a);
            } else {
                qhVar.Q();
            }
            int i4 = i3 & (-897);
            qhVar.r();
            boolean f2 = qhVar.f(bool) | qhVar.f(obj) | qhVar.f(o20Var);
            Object K = qhVar.K();
            if (f2 || K == hh.a) {
                K = new r20(o20Var.getLifecycle());
                qhVar.e0(K);
            }
            n(o20Var, (r20) K, muVar, qhVar, (i4 >> 3) & 896);
        } else {
            qhVar.Q();
        }
        o20 o20Var2 = o20Var;
        ri0 s2 = qhVar.s();
        if (s2 != null) {
            s2.d = new ka(bool, obj, o20Var2, muVar, i2, 1);
        }
    }

    public static final void n(o20 o20Var, r20 r20Var, mu muVar, ih ihVar, int i2) {
        int i3;
        qh qhVar = (qh) ihVar;
        qhVar.W(228371534);
        if ((i2 & 6) == 0) {
            i3 = (qhVar.h(o20Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qhVar.h(r20Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qhVar.h(muVar) ? 256 : 128;
        }
        int i4 = 0;
        if (qhVar.N(i3 & 1, (i3 & 147) != 146)) {
            boolean h2 = qhVar.h(r20Var) | ((i3 & 896) == 256) | qhVar.h(o20Var);
            Object K = qhVar.K();
            if (h2 || K == hh.a) {
                K = new j20(o20Var, r20Var, muVar, i4);
                qhVar.e0(K);
            }
            i(o20Var, r20Var, (mu) K, qhVar);
        } else {
            qhVar.Q();
        }
        ri0 s2 = qhVar.s();
        if (s2 != null) {
            s2.d = new cg(o20Var, r20Var, muVar, i2, 1);
        }
    }

    public static final long o(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void p(bu buVar, ih ihVar) {
        rc0 rc0Var = ((qh) ihVar).L.b.h;
        rc0Var.R(gc0.c);
        px0.S(rc0Var, 0, buVar);
    }

    public static final void q(c1 c1Var, rp0 rp0Var) {
        if (a50.f(rp0Var)) {
            Object g2 = rp0Var.d.d.g(mp0.g);
            if (g2 == null) {
                g2 = null;
            }
            h0 h0Var = (h0) g2;
            if (h0Var != null) {
                c1Var.a(new y0(null, R.id.accessibilityActionSetProgress, h0Var.a, null));
            }
        }
    }

    public static void r(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = yz.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = hg0.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final zi0 s(b10 b10Var) {
        b10 g2 = b10Var.g();
        return g2 != null ? g2.z(b10Var, true) : new zi0(0.0f, 0.0f, (int) (b10Var.A() >> 32), (int) (b10Var.A() & 4294967295L));
    }

    public static final zi0 t(ea0 ea0Var) {
        b10 C = C(ea0Var);
        float A = (int) (C.A() >> 32);
        float A2 = (int) (C.A() & 4294967295L);
        zi0 z = C.z(ea0Var, true);
        float f2 = z.a;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > A) {
            f2 = A;
        }
        float f3 = z.b;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > A2) {
            f3 = A2;
        }
        float f4 = z.c;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 <= A) {
            A = f4;
        }
        float f5 = z.d;
        float f6 = f5 >= 0.0f ? f5 : 0.0f;
        if (f6 <= A2) {
            A2 = f6;
        }
        if (f2 == A || f3 == A2) {
            return zi0.e;
        }
        long e2 = C.e((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        long e3 = C.e((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(A) << 32));
        long e4 = C.e((Float.floatToRawIntBits(A) << 32) | (Float.floatToRawIntBits(A2) & 4294967295L));
        long e5 = C.e((Float.floatToRawIntBits(A2) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (e2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (e3 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (e5 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (e4 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (e2 & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (e3 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (e5 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (4294967295L & e4));
        return new zi0(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String u(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final boolean v(ts tsVar, boolean z) {
        int ordinal = tsVar.l0().ordinal();
        rs rsVar = rs.g;
        if (ordinal == 0) {
            ((ks) ((f3) nz.b0(tsVar)).getFocusOwner()).f(null);
            tsVar.j0(rs.d, rsVar);
            return true;
        }
        if (ordinal == 1) {
            ts B = nz.B(tsVar);
            if (!(B != null ? v(B, z) : true)) {
                return false;
            }
            tsVar.j0(rs.e, rsVar);
            return true;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return true;
            }
            g8.c();
            return false;
        }
        if (z) {
            ((ks) ((f3) nz.b0(tsVar)).getFocusOwner()).f(null);
            tsVar.j0(rs.f, rsVar);
        }
        return z;
    }

    public static int w(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static float[] x() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final i7 y(i7 i7Var) {
        i7 c2 = i7Var.c();
        int b2 = c2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            c2.e(i7Var.a(i2), i2);
        }
        return c2;
    }

    public static final bk z(ih ihVar) {
        return new gk0(((qh) ihVar).P);
    }
}
