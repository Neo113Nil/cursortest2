package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import com.vectorharbor.planetvectorsurvey.R;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class a50 {
    public static final op f;
    public static final op g;
    public static final t7 h;
    public static t7 i;
    public static final op q;
    public static Method r;
    public static Method s;
    public static boolean t;
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final ng0 e = new ng0(new lg0());
    public static final byte[] j = {48, 49, 53, 0};
    public static final byte[] k = {48, 49, 48, 0};
    public static final byte[] l = {48, 48, 57, 0};
    public static final byte[] m = {48, 48, 53, 0};
    public static final byte[] n = {48, 48, 49, 0};
    public static final byte[] o = {48, 48, 49, 0};
    public static final byte[] p = {48, 48, 50, 0};

    static {
        int i2 = 1;
        f = new op("REMOVED_TASK", i2);
        g = new op("CLOSED_EMPTY", i2);
        Object obj = null;
        h = new t7(obj, obj, obj, 5);
        q = new op("NO_VALUE", i2);
    }

    public static float A(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final void B(mr0 mr0Var, u7 u7Var, int i2) {
        while (true) {
            int i3 = mr0Var.v;
            if (i2 > i3 && i2 < mr0Var.u) {
                return;
            }
            if (i3 == 0 && i2 == 0) {
                return;
            }
            mr0Var.K();
            if (mr0Var.w(mr0Var.v)) {
                u7Var.l();
            }
            mr0Var.j();
        }
    }

    public static m50 C(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i2 = duplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j2 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j3 = duplicate.getInt() & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = duplicate.getInt();
                long j4 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    duplicate.position((int) (j4 + j2));
                    m50 m50Var = new m50();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    m50Var.g = duplicate;
                    m50Var.d = position;
                    int i7 = position - duplicate.getInt(position);
                    m50Var.e = i7;
                    m50Var.f = ((ByteBuffer) m50Var.g).getShort(i7);
                    return m50Var;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final Object D(gf0 gf0Var, ii0 ii0Var) {
        ii0Var.getClass();
        Object obj = gf0Var.get(ii0Var);
        if (obj == null) {
            obj = ii0Var.b();
        }
        return ((xy0) obj).a(gf0Var);
    }

    public static final eg E(int i2, yu yuVar, ih ihVar) {
        qh qhVar = (qh) ihVar;
        Object K = qhVar.K();
        if (K == hh.a) {
            K = new eg(i2, true, yuVar);
            qhVar.e0(K);
        }
        eg egVar = (eg) K;
        if (!egVar.f.equals(yuVar)) {
            egVar.f = yuVar;
            if (egVar.e) {
                ri0 ri0Var = egVar.g;
                if (ri0Var != null) {
                    bi biVar = ri0Var.a;
                    if (biVar != null) {
                        biVar.n(ri0Var, null);
                    }
                    egVar.g = null;
                }
                ArrayList arrayList = egVar.h;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ri0 ri0Var2 = (ri0) arrayList.get(i3);
                        bi biVar2 = ri0Var2.a;
                        if (biVar2 != null) {
                            biVar2.n(ri0Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return egVar;
    }

    public static final boolean F(ri0 ri0Var, ri0 ri0Var2) {
        return ri0Var == null || !ri0Var.a() || ri0Var == ri0Var2 || nz.l(ri0Var.c, ri0Var2.c);
    }

    public static final void G(Object[] objArr, int i2, int i3) {
        objArr.getClass();
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static int H(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        g8.r("Cannot round NaN value.");
        return 0;
    }

    public static final fz I(zi0 zi0Var) {
        return new fz(Math.round(zi0Var.a), Math.round(zi0Var.b), Math.round(zi0Var.c), Math.round(zi0Var.d));
    }

    public static long J(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        g8.r("Cannot round NaN value.");
        return 0L;
    }

    public static final void K(c1 c1Var, rp0 rp0Var) {
        Object g2 = rp0Var.k().d.g(vp0.g);
        if (g2 == null) {
            g2 = null;
        }
        if (g2 != null) {
            g8.q();
            return;
        }
        rp0 l2 = rp0Var.l();
        if (l2 == null) {
            return;
        }
        Object g3 = l2.k().d.g(vp0.e);
        if (g3 == null) {
            g3 = null;
        }
        if (g3 != null) {
            Object g4 = l2.k().d.g(vp0.f);
            if ((g4 != null ? g4 : null) != null) {
                g8.q();
                return;
            }
            if (rp0Var.k().d.c(vp0.F)) {
                ArrayList arrayList = new ArrayList();
                List j2 = rp0.j(4, l2);
                int size = j2.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    rp0 rp0Var2 = (rp0) j2.get(i3);
                    if (rp0Var2.k().d.c(vp0.F)) {
                        arrayList.add(rp0Var2);
                        if (rp0Var2.c.o() < rp0Var.c.o()) {
                            i2++;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                boolean l3 = l(arrayList);
                int i4 = l3 ? 0 : i2;
                int i5 = l3 ? i2 : 0;
                Object g5 = rp0Var.k().d.g(vp0.F);
                if (g5 == null) {
                    g5 = Boolean.FALSE;
                }
                c1Var.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, 1, i5, 1, false, ((Boolean) g5).booleanValue()));
            }
        }
    }

    public static final long M(long j2, float f2) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public static final pi0 N(pm0 pm0Var, jj jjVar, at0 at0Var, Float f2) {
        tc.a.getClass();
        sc scVar = sc.a;
        j3 j3Var = new j3(13, pm0Var, up.d);
        et0 b2 = nk.b(f2);
        rj rjVar = (rj) j3Var.f;
        or orVar = (or) j3Var.e;
        ek ekVar = at0Var.equals(cr0.a) ? ek.d : ek.g;
        wg wgVar = new wg(at0Var, orVar, b2, f2, null, 3);
        rj s2 = s(jjVar.f(), rjVar, true);
        gl glVar = vm.a;
        if (s2 != glVar && s2.k(b2.t) == null) {
            s2 = s2.i(glVar);
        }
        l v10Var = ekVar == ek.e ? new v10(s2, wgVar) : new ws0(s2, true);
        v10Var.d0(ekVar, v10Var, wgVar);
        return new pi0(b2);
    }

    public static final gf0 O(ki0[] ki0VarArr, gf0 gf0Var, gf0 gf0Var2) {
        ff0 ff0Var = new ff0(gf0.g);
        for (ki0 ki0Var : ki0VarArr) {
            ii0 ii0Var = ki0Var.a;
            if (ki0Var.f || !gf0Var.containsKey(ii0Var)) {
                ff0Var.put(ii0Var, ii0Var.c(ki0Var, (xy0) gf0Var2.get(ii0Var)));
            }
        }
        return ff0Var.b();
    }

    public static final iy0 P(kj kjVar, rj rjVar, Object obj) {
        iy0 iy0Var = null;
        if ((kjVar instanceof dk) && rjVar.k(jc.f) != null) {
            dk dkVar = (dk) kjVar;
            while (true) {
                if ((dkVar instanceof sm) || (dkVar = dkVar.getCallerFrame()) == null) {
                    break;
                }
                if (dkVar instanceof iy0) {
                    iy0Var = (iy0) dkVar;
                    break;
                }
            }
            if (iy0Var != null) {
                iy0Var.f0(rjVar, obj);
            }
        }
        return iy0Var;
    }

    public static float Q() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final void a(lm lmVar, ih ihVar, int i2) {
        qh qhVar = (qh) ihVar;
        qhVar.W(294589392);
        int i3 = i2 | (qhVar.f(lmVar) ? 4 : 2);
        if ((i3 & 3) == 2 && qhVar.z()) {
            qhVar.Q();
        } else {
            wm0 r2 = ze0.r(qhVar);
            f70 g2 = ud0.g(lmVar.b().e, qhVar);
            List list = (List) g2.getValue();
            boolean booleanValue = ((Boolean) qhVar.j(uy.a)).booleanValue();
            boolean f2 = qhVar.f(list);
            Object K = qhVar.K();
            Object obj = hh.a;
            Object obj2 = K;
            if (f2 || K == obj) {
                gs0 gs0Var = new gs0();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    y70 y70Var = (y70) obj3;
                    if (booleanValue || y70Var.k.c.compareTo(f20.g) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                gs0Var.addAll(arrayList);
                qhVar.e0(gs0Var);
                obj2 = gs0Var;
            }
            gs0 gs0Var2 = (gs0) obj2;
            e(gs0Var2, (List) g2.getValue(), qhVar, 0);
            f70 g3 = ud0.g(lmVar.b().f, qhVar);
            Object K2 = qhVar.K();
            if (K2 == obj) {
                K2 = new gs0();
                qhVar.e0(K2);
            }
            gs0 gs0Var3 = (gs0) K2;
            qhVar.V(1361037007);
            ListIterator listIterator = gs0Var2.listIterator();
            while (true) {
                iw iwVar = (iw) listIterator;
                if (!iwVar.hasNext()) {
                    break;
                }
                y70 y70Var2 = (y70) iwVar.next();
                m80 m80Var = y70Var2.e;
                m80Var.getClass();
                km kmVar = (km) m80Var;
                boolean h2 = ((i3 & 14) == 4) | qhVar.h(y70Var2);
                Object K3 = qhVar.K();
                if (h2 || K3 == obj) {
                    K3 = new a3(3, lmVar, y70Var2);
                    qhVar.e0(K3);
                }
                x40.e((bu) K3, kmVar.m, E(1129586364, new em(y70Var2, lmVar, r2, gs0Var3, kmVar), qhVar), qhVar, 384);
            }
            qhVar.q(false);
            Set set = (Set) g3.getValue();
            boolean f3 = qhVar.f(g3) | ((i3 & 14) == 4);
            Object K4 = qhVar.K();
            if (f3 || K4 == obj) {
                K4 = new fm(g3, lmVar, gs0Var3, null);
                qhVar.e0(K4);
            }
            mz.l(set, gs0Var3, (qu) K4, qhVar);
        }
        ri0 s2 = qhVar.s();
        if (s2 != null) {
            s2.d = new j(i2, 6, lmVar);
        }
    }

    public static x4 b(int i2, int i3, int i4) {
        Bitmap createBitmap;
        dl0 dl0Var = qe.e;
        Bitmap.Config W = mz.W(i4);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, mz.W(i4), true, oe.a(dl0Var));
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, W);
            createBitmap.setHasAlpha(true);
        }
        return new x4(createBitmap);
    }

    public static zq0 c(int i2) {
        int i3 = (i2 & 1) != 0 ? 0 : 1;
        int i4 = (i2 & 2) == 0 ? 16 : 0;
        if (i3 <= 0 && i4 <= 0) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + cb.e).toString());
        }
        int i5 = i4 + i3;
        if (i5 < 0) {
            i5 = Integer.MAX_VALUE;
        }
        return new zq0(i3, i5);
    }

    public static final y4 d() {
        return new y4(new Paint(7));
    }

    public static final void e(List list, Collection collection, ih ihVar, int i2) {
        qh qhVar = (qh) ihVar;
        qhVar.W(1537894851);
        int i3 = 4;
        if ((((qhVar.h(list) ? 4 : 2) | i2 | (qhVar.h(collection) ? 32 : 16)) & 19) == 18 && qhVar.z()) {
            qhVar.Q();
        } else {
            boolean booleanValue = ((Boolean) qhVar.j(uy.a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                y70 y70Var = (y70) it.next();
                q20 q20Var = y70Var.k;
                boolean g2 = qhVar.g(booleanValue) | qhVar.h(list) | qhVar.h(y70Var);
                Object K = qhVar.K();
                if (g2 || K == hh.a) {
                    K = new hm(y70Var, list, booleanValue);
                    qhVar.e0(K);
                }
                mz.h(q20Var, (mu) K, qhVar);
            }
        }
        ri0 s2 = qhVar.s();
        if (s2 != null) {
            s2.d = new w3(i2, i3, list, collection);
        }
    }

    public static final boolean f(rp0 rp0Var) {
        np0 k2 = rp0Var.k();
        return !k2.d.c(vp0.i);
    }

    public static final boolean g(rp0 rp0Var, Resources resources) {
        Object g2 = rp0Var.d.d.g(vp0.a);
        if (g2 == null) {
            g2 = null;
        }
        List list = (List) g2;
        return !nz.I(rp0Var) && (rp0Var.d.f || (rp0Var.o() && ((list != null ? (String) zd.d0(list) : null) != null || x(rp0Var) != null || w(rp0Var, resources) != null || v(rp0Var))));
    }

    public static final void h(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static final String i(Object[] objArr, int i2, int i3, t tVar) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == tVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final int k(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static final boolean l(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = wp.d;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    rp0 rp0Var = (rp0) obj2;
                    rp0 rp0Var2 = (rp0) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (rp0Var2.g().a() >> 32)) - Float.intBitsToFloat((int) (rp0Var.g().a() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (rp0Var2.g().a() & 4294967295L)) - Float.intBitsToFloat((int) (rp0Var.g().a() & 4294967295L)));
                    arrayList2.add(new ra0((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((ra0) zd.c0(list)).a;
            } else {
                if (list.isEmpty()) {
                    l30.b("Empty collection can't be reduced.");
                }
                Object c0 = zd.c0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        c0 = new ra0(ra0.h(((ra0) c0).a, ((ra0) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((ra0) c0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static void m(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            g8.r(y6.v("fromIndex: ", i2, " > toIndex: ", i3));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
    }

    public static final dt n(Context context) {
        b2 b2Var = new b2(25);
        context.getApplicationContext();
        return new dt(b2Var, new u4(Build.VERSION.SDK_INT >= 31 ? vt.a.a(context) : 0));
    }

    public static k01 o(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                newInstance.getClass();
                return (k01) newInstance;
            } catch (IllegalAccessException e2) {
                g8.j("Cannot create an instance of ", cls, e2);
                return null;
            } catch (InstantiationException e3) {
                g8.j("Cannot create an instance of ", cls, e3);
                return null;
            }
        } catch (NoSuchMethodException e4) {
            g8.j("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    public static final or p(or orVar) {
        return orVar instanceof ct0 ? orVar : orVar instanceof gn ? orVar : new gn(orVar);
    }

    public static void q(Canvas canvas, boolean z) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!t) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    r = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    s = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    r = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    s = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = r;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = s;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            t = true;
        }
        if (z) {
            try {
                Method method4 = r;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = s) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object r(or orVar, qu quVar, lj ljVar) {
        zr zrVar;
        int i2;
        qu quVar2;
        gj0 gj0Var;
        a e2;
        fn fnVar;
        Object obj;
        op opVar = d31.e;
        if (ljVar instanceof zr) {
            zrVar = (zr) ljVar;
            int i3 = zrVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zrVar.h = i3 - Integer.MIN_VALUE;
                Object obj2 = zrVar.g;
                i2 = zrVar.h;
                if (i2 != 0) {
                    rg0.u(obj2);
                    gj0 gj0Var2 = new gj0();
                    gj0Var2.d = opVar;
                    fn fnVar2 = new fn(quVar, gj0Var2);
                    try {
                        zrVar.d = (fu0) quVar;
                        zrVar.e = gj0Var2;
                        zrVar.f = fnVar2;
                        zrVar.h = 1;
                        Object a2 = orVar.a(fnVar2, zrVar);
                        Object obj3 = ck.d;
                        if (a2 == obj3) {
                            return obj3;
                        }
                        quVar2 = quVar;
                        gj0Var = gj0Var2;
                    } catch (a e3) {
                        quVar2 = quVar;
                        gj0Var = gj0Var2;
                        e2 = e3;
                        fnVar = fnVar2;
                        if (e2.d != fnVar) {
                        }
                        obj = gj0Var.d;
                        if (obj == opVar) {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fnVar = zrVar.f;
                    gj0Var = zrVar.e;
                    quVar2 = (qu) zrVar.d;
                    try {
                        rg0.u(obj2);
                    } catch (a e4) {
                        e2 = e4;
                        if (e2.d != fnVar) {
                            throw e2;
                        }
                        obj = gj0Var.d;
                        if (obj == opVar) {
                        }
                    }
                }
                obj = gj0Var.d;
                if (obj == opVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + quVar2);
            }
        }
        zrVar = new zr(ljVar);
        Object obj22 = zrVar.g;
        i2 = zrVar.h;
        if (i2 != 0) {
        }
        obj = gj0Var.d;
        if (obj == opVar) {
        }
    }

    public static final rj s(rj rjVar, rj rjVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i2 = 9;
        boolean booleanValue = ((Boolean) rjVar.o(new ze(i2), bool)).booleanValue();
        boolean booleanValue2 = ((Boolean) rjVar2.o(new ze(i2), bool)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return rjVar.i(rjVar2);
        }
        ze zeVar = new ze(7);
        up upVar = up.d;
        rj rjVar3 = (rj) rjVar.o(zeVar, upVar);
        Object obj = rjVar2;
        if (booleanValue2) {
            obj = rjVar2.o(new ze(8), upVar);
        }
        return rjVar3.i((rj) obj);
    }

    public static final or t(wq0 wq0Var, rj rjVar, int i2, cb cbVar) {
        return ((i2 == 0 || i2 == -3) && cbVar == cb.d) ? wq0Var : new xc(wq0Var, rjVar, i2, cbVar);
    }

    public static String u(Context context, int i2) {
        String valueOf;
        context.getClass();
        if (i2 <= 16777215) {
            return String.valueOf(i2);
        }
        try {
            valueOf = context.getResources().getResourceName(i2);
        } catch (Resources.NotFoundException unused) {
            valueOf = String.valueOf(i2);
        }
        valueOf.getClass();
        return valueOf;
    }

    public static final boolean v(rp0 rp0Var) {
        Object g2 = rp0Var.d.d.g(vp0.G);
        if (g2 == null) {
            g2 = null;
        }
        pw0 pw0Var = (pw0) g2;
        a70 a70Var = rp0Var.d.d;
        Object g3 = a70Var.g(vp0.w);
        if (g3 == null) {
            g3 = null;
        }
        tl0 tl0Var = (tl0) g3;
        boolean z = pw0Var != null;
        Object g4 = a70Var.g(vp0.F);
        if (((Boolean) (g4 != null ? g4 : null)) == null || (tl0Var != null && tl0Var.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String w(rp0 rp0Var, Resources resources) {
        np0 np0Var = rp0Var.d;
        np0 np0Var2 = rp0Var.d;
        Object g2 = np0Var.d.g(vp0.b);
        String str = null;
        if (g2 == null) {
            g2 = null;
        }
        a70 a70Var = np0Var2.d;
        Object g3 = a70Var.g(vp0.G);
        if (g3 == null) {
            g3 = null;
        }
        pw0 pw0Var = (pw0) g3;
        Object g4 = a70Var.g(vp0.w);
        if (g4 == null) {
            g4 = null;
        }
        tl0 tl0Var = (tl0) g4;
        if (pw0Var != null) {
            int ordinal = pw0Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        g8.c();
                        return null;
                    }
                    if (g2 == null) {
                        g2 = resources.getString(R.string.indeterminate);
                    }
                } else if (tl0Var != null && tl0Var.a == 2 && g2 == null) {
                    g2 = resources.getString(R.string.state_off);
                }
            } else if (tl0Var != null && tl0Var.a == 2 && g2 == null) {
                g2 = resources.getString(R.string.state_on);
            }
        }
        Object g5 = a70Var.g(vp0.F);
        if (g5 == null) {
            g5 = null;
        }
        Boolean bool = (Boolean) g5;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((tl0Var == null || tl0Var.a != 4) && g2 == null) {
                g2 = booleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object g6 = a70Var.g(vp0.c);
        if (g6 == null) {
            g6 = null;
        }
        di0 di0Var = (di0) g6;
        if (di0Var != null) {
            if (di0Var != di0.b) {
                if (g2 == null) {
                    g2 = resources.getString(R.string.template_percent, 0);
                }
            } else if (g2 == null) {
                g2 = resources.getString(R.string.in_progress);
            }
        }
        yp0 yp0Var = vp0.D;
        if (a70Var.c(yp0Var)) {
            a70 a70Var2 = new rp0(rp0Var.a, true, rp0Var.c, np0Var2).k().d;
            Object g7 = a70Var2.g(vp0.a);
            if (g7 == null) {
                g7 = null;
            }
            Collection collection = (Collection) g7;
            if (collection == null || collection.isEmpty()) {
                Object g8 = a70Var2.g(vp0.z);
                if (g8 == null) {
                    g8 = null;
                }
                Collection collection2 = (Collection) g8;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g9 = a70Var2.g(yp0Var);
                    if (g9 == null) {
                        g9 = null;
                    }
                    CharSequence charSequence = (CharSequence) g9;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            g2 = str;
        }
        return (String) g2;
    }

    public static final l7 x(rp0 rp0Var) {
        Object g2 = rp0Var.d.d.g(vp0.D);
        if (g2 == null) {
            g2 = null;
        }
        l7 l7Var = (l7) g2;
        Object g3 = rp0Var.d.d.g(vp0.z);
        if (g3 == null) {
            g3 = null;
        }
        List list = (List) g3;
        return l7Var == null ? list != null ? (l7) zd.d0(list) : null : l7Var;
    }

    public static int y(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return te.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final void z(i10 i10Var) {
        nz.a0(i10Var).x();
    }

    public abstract void L(pu0 pu0Var, pu0 pu0Var2, Window window, View view, boolean z, boolean z2);

    public void j(Window window) {
    }
}
