package o;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.regex.Matcher;

/* renamed from: o.ct, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0868ct {
    public static Context a;
    public static Boolean b;
    public static final float[][] c = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] d = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] e = {95.047f, 100.0f, 108.883f};
    public static final float[][] f = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final C0633Yh g = new C0633Yh();
    public static final char[] h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final C1097gL i = new C1097gL(15);
    public static final C0457Rn j = new C0457Rn("NO_VALUE", 5);
    public static final C0300Ll k;
    public static final C0300Ll[] l;
    public static Method m;
    public static Method n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f154o;
    public static C0385Ot p;
    public static String q;
    public static int r;

    static {
        C0300Ll c0300Ll = new C0300Ll();
        k = c0300Ll;
        l = new C0300Ll[]{c0300Ll};
    }

    public static String A(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
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

    public static String B(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static int C(float f2) {
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
        float[] fArr = e;
        return AbstractC1837rc.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final void D(C1575nd c1575nd, InterfaceC2312yp interfaceC2312yp) {
        AbstractC0048Bt.l(interfaceC2312yp, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        AbstractC1305jX.i(2, interfaceC2312yp);
        interfaceC2312yp.invoke(c1575nd, 1);
    }

    public static final boolean E(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        return abstractC1004ey.E0() instanceof AbstractC1782qm;
    }

    public static final boolean F(C0027Ay c0027Ay) {
        if (c0027Ay.d == null) {
            return false;
        }
        C0027Ay l2 = c0027Ay.l();
        if ((l2 != null ? l2.d : null) == null) {
            return true;
        }
        c0027Ay.v.getClass();
        return false;
    }

    public static boolean G(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static C0908dT H(InterfaceC0422Qe interfaceC0422Qe, InterfaceC0189He interfaceC0189He, EnumC0500Te enumC0500Te, InterfaceC2312yp interfaceC2312yp, int i2) {
        if ((i2 & 1) != 0) {
            interfaceC0189He = C1188hk.h;
        }
        if ((i2 & 2) != 0) {
            enumC0500Te = EnumC0500Te.h;
        }
        InterfaceC0189He t = AbstractC0946e20.t(interfaceC0422Qe.m(), interfaceC0189He, true);
        C0191Hg c0191Hg = AbstractC0115Ei.a;
        if (t != c0191Hg && t.k(C0460Rq.w) == null) {
            t = t.D(c0191Hg);
        }
        C0908dT c1597nz = enumC0500Te == EnumC0500Te.i ? new C1597nz(t, interfaceC2312yp) : new C0908dT(t, true);
        c1597nz.c0(enumC0500Te, c1597nz, interfaceC2312yp);
        return c1597nz;
    }

    public static float I(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static List J(Object obj) {
        List singletonList = Collections.singletonList(obj);
        AbstractC0048Bt.m(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static List K(Object... objArr) {
        AbstractC0048Bt.n(objArr, "elements");
        return objArr.length > 0 ? P6.W(objArr) : C1318jk.h;
    }

    public static List L(Object obj) {
        return obj != null ? J(obj) : C1318jk.h;
    }

    public static final JR M(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        AbstractC2097vY E0 = abstractC1004ey.E0();
        if (E0 instanceof AbstractC1782qm) {
            return ((AbstractC1782qm) E0).i;
        }
        if (E0 instanceof JR) {
            return (JR) E0;
        }
        throw new C0057Cc();
    }

    public static ArrayList N(Object... objArr) {
        AbstractC0048Bt.n(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C6(objArr, true));
    }

    public static final List Q(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : J(list.get(0)) : C1318jk.h;
    }

    public static final Object S(InterfaceC0189He interfaceC0189He, InterfaceC2312yp interfaceC2312yp) {
        AbstractC0454Rk abstractC0454Rk;
        InterfaceC0189He t;
        Thread currentThread = Thread.currentThread();
        InterfaceC0163Ge interfaceC0163Ge = C0460Rq.w;
        InterfaceC0007Ae interfaceC0007Ae = (InterfaceC0007Ae) interfaceC0189He.k(interfaceC0163Ge);
        C1188hk c1188hk = C1188hk.h;
        if (interfaceC0007Ae == null) {
            abstractC0454Rk = EV.a();
            t = AbstractC0946e20.t(c1188hk, interfaceC0189He.D(abstractC0454Rk), true);
            C0191Hg c0191Hg = AbstractC0115Ei.a;
            if (t != c0191Hg && t.k(interfaceC0163Ge) == null) {
                t = t.D(c0191Hg);
            }
        } else {
            if (interfaceC0007Ae instanceof AbstractC0454Rk) {
            }
            abstractC0454Rk = (AbstractC0454Rk) EV.a.get();
            t = AbstractC0946e20.t(c1188hk, interfaceC0189He, true);
            C0191Hg c0191Hg2 = AbstractC0115Ei.a;
            if (t != c0191Hg2 && t.k(interfaceC0163Ge) == null) {
                t = t.D(c0191Hg2);
            }
        }
        C1610o8 c1610o8 = new C1610o8(t, currentThread, abstractC0454Rk);
        c1610o8.c0(EnumC0500Te.h, c1610o8, interfaceC2312yp);
        AbstractC0454Rk abstractC0454Rk2 = c1610o8.l;
        if (abstractC0454Rk2 != null) {
            int i2 = AbstractC0454Rk.m;
            abstractC0454Rk2.R(false);
        }
        while (!Thread.interrupted()) {
            try {
                long S = abstractC0454Rk2 != null ? abstractC0454Rk2.S() : Long.MAX_VALUE;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0283Ku.h;
                if (!(atomicReferenceFieldUpdater.get(c1610o8) instanceof InterfaceC2249xs)) {
                    if (abstractC0454Rk2 != null) {
                        int i3 = AbstractC0454Rk.m;
                        abstractC0454Rk2.O(false);
                    }
                    Object Y = EB.Y(atomicReferenceFieldUpdater.get(c1610o8));
                    C0031Bc c0031Bc = Y instanceof C0031Bc ? (C0031Bc) Y : null;
                    if (c0031Bc == null) {
                        return Y;
                    }
                    throw c0031Bc.a;
                }
                LockSupport.parkNanos(c1610o8, S);
            } catch (Throwable th) {
                if (abstractC0454Rk2 != null) {
                    int i4 = AbstractC0454Rk.m;
                    abstractC0454Rk2.O(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c1610o8.n(interruptedException);
        throw interruptedException;
    }

    public static C2096vX T(List list, AbstractC1964tX abstractC1964tX, InterfaceC1118gg interfaceC1118gg, ArrayList arrayList) {
        if (abstractC1964tX == null) {
            a(1);
            throw null;
        }
        if (interfaceC1118gg == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        C2096vX U = U(list, abstractC1964tX, interfaceC1118gg, arrayList, null);
        if (U != null) {
            return U;
        }
        throw new AssertionError("Substitution failed");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2096vX U(List list, AbstractC1964tX abstractC1964tX, InterfaceC1118gg interfaceC1118gg, List list2, boolean[] zArr) {
        C2096vX c2096vX;
        AbstractC1004ey i2;
        if (abstractC1964tX == null) {
            a(6);
            throw null;
        }
        if (interfaceC1118gg == null) {
            a(7);
            throw null;
        }
        if (list2 == null) {
            a(8);
            throw null;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            InterfaceC1437lX interfaceC1437lX = (InterfaceC1437lX) it.next();
            C1503mX J0 = C1503mX.J0(interfaceC1118gg, interfaceC1437lX.getAnnotations(), interfaceC1437lX.P(), interfaceC1437lX.Y(), interfaceC1437lX.getName(), i3, interfaceC1437lX.A());
            hashMap.put(interfaceC1437lX.z(), new C1767qX(1, J0.i()));
            hashMap2.put(interfaceC1437lX, J0);
            list2.add(J0);
            i3++;
        }
        C1697pT c1697pT = new C1697pT(1, hashMap);
        C2096vX e2 = C2096vX.e(abstractC1964tX, c1697pT);
        C2096vX e3 = C2096vX.e(new C1572na(abstractC1964tX, 1), c1697pT);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC1437lX interfaceC1437lX2 = (InterfaceC1437lX) it2.next();
            C1503mX c1503mX = (C1503mX) hashMap2.get(interfaceC1437lX2);
            for (AbstractC1004ey abstractC1004ey : interfaceC1437lX2.getUpperBounds()) {
                InterfaceC2364zb c2 = abstractC1004ey.B0().c();
                if (c2 instanceof InterfaceC1437lX) {
                    InterfaceC1437lX interfaceC1437lX3 = (InterfaceC1437lX) c2;
                    AbstractC0048Bt.n(interfaceC1437lX3, "typeParameter");
                    if (AbstractC0772bO.p(interfaceC1437lX3, null, null)) {
                        c2096vX = e2;
                        i2 = c2096vX.i(3, abstractC1004ey);
                        if (i2 != null) {
                            return null;
                        }
                        if (i2 != abstractC1004ey && zArr != null) {
                            zArr[0] = true;
                        }
                        if (c1503mX.s) {
                            throw new IllegalStateException("Type parameter descriptor is already initialized: " + c1503mX.L0());
                        }
                        if (!AbstractC1473m3.P(i2)) {
                            c1503mX.r.add(i2);
                        }
                    }
                }
                c2096vX = e3;
                i2 = c2096vX.i(3, abstractC1004ey);
                if (i2 != null) {
                }
            }
            if (c1503mX.s) {
                throw new IllegalStateException("Type parameter descriptor is already initialized: " + c1503mX.L0());
            }
            c1503mX.s = true;
        }
        return e2;
    }

    public static final void V(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void W(String str) {
        throw new IllegalStateException(str);
    }

    public static final void X(String str) {
        throw new IllegalStateException(str);
    }

    public static void Y() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final Rect Z(C1032fM c1032fM) {
        return new Rect((int) c1032fM.a, (int) c1032fM.b, (int) c1032fM.c, (int) c1032fM.d);
    }

    public static /* synthetic */ void a(int i2) {
        String str = i2 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 4 ? 3 : 2];
        switch (i2) {
            case 1:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i2 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i2 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i2 == 4) {
            throw new IllegalStateException(format);
        }
    }

    public static final JR a0(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        AbstractC2097vY E0 = abstractC1004ey.E0();
        if (E0 instanceof AbstractC1782qm) {
            return ((AbstractC1782qm) E0).j;
        }
        if (E0 instanceof JR) {
            return (JR) E0;
        }
        throw new C0057Cc();
    }

    public static final long b(int i2, int i3, int i4, int i5) {
        if (i3 < i2) {
            throw new IllegalArgumentException("maxWidth(" + i3 + ") must be >= than minWidth(" + i2 + ')');
        }
        if (i5 < i4) {
            throw new IllegalArgumentException("maxHeight(" + i5 + ") must be >= than minHeight(" + i4 + ')');
        }
        if (i2 >= 0 && i4 >= 0) {
            return n(i2, i3, i4, i5);
        }
        throw new IllegalArgumentException("minWidth(" + i2 + ") and minHeight(" + i4 + ") must be >= 0");
    }

    public static final Object b0(InterfaceC0189He interfaceC0189He, InterfaceC2312yp interfaceC2312yp, InterfaceC2235xe interfaceC2235xe) {
        InterfaceC0189He context = interfaceC2235xe.getContext();
        InterfaceC0189He D = !((Boolean) interfaceC0189He.I(Boolean.FALSE, new C1903sc(2))).booleanValue() ? context.D(interfaceC0189He) : AbstractC0946e20.t(context, interfaceC0189He, false);
        PX.F(D);
        if (D == context) {
            C1102gQ c1102gQ = new C1102gQ(interfaceC2235xe, D);
            return AbstractC0773bP.k(c1102gQ, c1102gQ, interfaceC2312yp);
        }
        C0460Rq c0460Rq = C0460Rq.w;
        if (AbstractC0048Bt.h(D.k(c0460Rq), context.k(c0460Rq))) {
            YX yx = new YX(interfaceC2235xe, D);
            InterfaceC0189He interfaceC0189He2 = yx.j;
            Object R0 = PX.R0(interfaceC0189He2, null);
            try {
                return AbstractC0773bP.k(yx, yx, interfaceC2312yp);
            } finally {
                PX.K0(interfaceC0189He2, R0);
            }
        }
        C0037Bi c0037Bi = new C0037Bi(interfaceC2235xe, D);
        try {
            AbstractC0022At.I(C0782bY.a, AbstractC1473m3.L(AbstractC1473m3.t(c0037Bi, c0037Bi, interfaceC2312yp)));
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0037Bi.l;
            do {
                int i2 = atomicIntegerFieldUpdater.get(c0037Bi);
                if (i2 != 0) {
                    if (i2 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object Y = EB.Y(C0283Ku.h.get(c0037Bi));
                    if (Y instanceof C0031Bc) {
                        throw ((C0031Bc) Y).a;
                    }
                    return Y;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c0037Bi, 0, 1));
            return EnumC0448Re.h;
        } catch (Throwable th) {
            c0037Bi.resumeWith(AbstractC1494mO.d(th));
            throw th;
        }
    }

    public static float c0() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static final void d(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static ArrayList f(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C6(objArr, true));
    }

    public static final int i(int i2) {
        if (i2 < 8191) {
            return 13;
        }
        if (i2 < 32767) {
            return 15;
        }
        if (i2 < 65535) {
            return 16;
        }
        return i2 < 262143 ? 18 : 255;
    }

    public static C0889dA j(C0889dA c0889dA) {
        c0889dA.o();
        c0889dA.j = true;
        return c0889dA.i > 0 ? c0889dA : C0889dA.k;
    }

    public static void k(int i2) {
        if (2 > i2 || i2 >= 37) {
            StringBuilder i3 = AbstractC2188wx.i(i2, "radix ", " was not in valid range ");
            i3.append(new C1197ht(2, 36, 1));
            throw new IllegalArgumentException(i3.toString());
        }
    }

    public static final InterfaceC1738q4 l(InterfaceC1738q4 interfaceC1738q4, InterfaceC1738q4 interfaceC1738q42) {
        AbstractC0048Bt.n(interfaceC1738q4, "first");
        AbstractC0048Bt.n(interfaceC1738q42, "second");
        return interfaceC1738q4.isEmpty() ? interfaceC1738q42 : interfaceC1738q42.isEmpty() ? interfaceC1738q4 : new C1803r4(new InterfaceC1738q4[]{interfaceC1738q4, interfaceC1738q42});
    }

    public static Handler m(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC1129gr.a(looper);
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

    public static final long n(int i2, int i3, int i4, int i5) {
        int i6 = i5 == Integer.MAX_VALUE ? i4 : i5;
        int i7 = i(i6);
        int i8 = i3 == Integer.MAX_VALUE ? i2 : i3;
        int i9 = i(i8);
        if (i7 + i9 > 31) {
            throw new IllegalArgumentException("Can't represent a width of " + i8 + " and height of " + i6 + " in Constraints");
        }
        int i10 = i3 + 1;
        int i11 = i10 & (~(i10 >> 31));
        int i12 = i5 + 1;
        int i13 = i12 & (~(i12 >> 31));
        int i14 = 0;
        if (i9 != 13) {
            if (i9 == 18) {
                i14 = 3;
            } else if (i9 == 15) {
                i14 = 1;
            } else if (i9 == 16) {
                i14 = 2;
            }
        }
        int i15 = (((i14 & 2) >> 1) * 3) + ((i14 & 1) << 1);
        return (i11 << 33) | i14 | (i2 << 2) | (i4 << (i15 + 15)) | (i13 << (i15 + 46));
    }

    public static final C0535Un o(Context context) {
        C1097gL c1097gL = new C1097gL(14);
        context.getApplicationContext();
        return new C0535Un(c1097gL, new C2330z3(Build.VERSION.SDK_INT >= 31 ? C1652oo.a.a(context) : 0));
    }

    public static final long p() {
        return Thread.currentThread().getId();
    }

    public static void q(String str, String str2, Object obj) {
        String B = B(str);
        if (Log.isLoggable(B, 3)) {
            Log.d(B, String.format(str2, obj));
        }
    }

    public static void r(String str, String str2, Exception exc) {
        String B = B(str);
        if (Log.isLoggable(B, 6)) {
            Log.e(B, str2, exc);
        }
    }

    public static void s(Canvas canvas, boolean z) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            C1244ia.a.a(canvas, z);
            return;
        }
        if (!f154o) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    m = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    n = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    m = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    n = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = m;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = n;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f154o = true;
        }
        if (z) {
            try {
                Method method4 = m;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = n) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final boolean t(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final InterfaceC2243xm u(InterfaceC1103gR interfaceC1103gR, InterfaceC0189He interfaceC0189He, int i2, H8 h8) {
        return ((i2 == 0 || i2 == -3) && h8 == H8.h) ? interfaceC1103gR : new C0159Ga(i2, h8, interfaceC0189He, interfaceC1103gR);
    }

    public static NB v(String str) {
        AbstractC0048Bt.n(str, "<this>");
        Matcher matcher = NB.d.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String group = matcher.group(1);
        AbstractC0048Bt.m(group, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        AbstractC0048Bt.m(locale, "US");
        String lowerCase = group.toLowerCase(locale);
        AbstractC0048Bt.m(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        AbstractC0048Bt.m(group2, "typeSubtype.group(2)");
        AbstractC0048Bt.m(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = NB.e.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                AbstractC0048Bt.m(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(AbstractC2188wx.h(sb, str, '\"').toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (AbstractC0778bU.B(group4, "'", false) && AbstractC0778bU.v(group4, "'", false) && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    AbstractC0048Bt.m(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new NB(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
    }

    public static int w(List list) {
        AbstractC0048Bt.n(list, "<this>");
        return list.size() - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r3 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String x() {
        BufferedReader bufferedReader;
        String processName;
        if (q == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                q = processName;
            } else {
                int i2 = r;
                if (i2 == 0) {
                    i2 = Process.myPid();
                    r = i2;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i2 > 0) {
                    try {
                        String str2 = "/proc/" + i2 + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            try {
                                String readLine = bufferedReader.readLine();
                                AbstractC1473m3.n(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused3) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                q = str;
            }
        }
        return q;
    }

    public static Intent y(J4 j4) {
        Intent parentActivityIntent = j4.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String A = A(j4, j4.getComponentName());
            if (A == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(j4, A);
            try {
                return A(j4, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + A + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent z(J4 j4, ComponentName componentName) {
        String A = A(j4, componentName);
        if (A == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), A);
        return A(j4, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public abstract void O(Throwable th);

    public abstract void P(C1334k c1334k);

    public abstract Object R();

    public abstract String g();

    public abstract boolean h(Object obj);

    public void e(Object obj) {
    }
}
