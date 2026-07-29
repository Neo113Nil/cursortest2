package o;

import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class DY {
    public final /* synthetic */ int a;

    public /* synthetic */ DY(int i) {
        this.a = i;
    }

    public static final JR a(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        AbstractC2097vY E0 = abstractC1004ey.E0();
        JR jr = E0 instanceof JR ? (JR) E0 : null;
        if (jr != null) {
            return jr;
        }
        throw new IllegalStateException(("This is should be simple type: " + abstractC1004ey).toString());
    }

    public static Object b(MU mu) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
        AbstractC1473m3.m();
        AbstractC1473m3.o(mu, "Task must not be null");
        if (mu.h()) {
            return w(mu);
        }
        J20 j20 = new J20();
        Executor executor = OU.b;
        mu.c(executor, j20);
        mu.b(executor, j20);
        p30 p30Var = (p30) mu;
        p30Var.b.e(new Y20(executor, (InterfaceC0698aG) j20));
        p30Var.n();
        j20.h.await();
        return w(mu);
    }

    public static Object c(MU mu, long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
        AbstractC1473m3.m();
        AbstractC1473m3.o(mu, "Task must not be null");
        AbstractC1473m3.o(timeUnit, "TimeUnit must not be null");
        if (mu.h()) {
            return w(mu);
        }
        J20 j20 = new J20();
        Executor executor = OU.b;
        mu.c(executor, j20);
        mu.b(executor, j20);
        p30 p30Var = (p30) mu;
        p30Var.b.e(new Y20(executor, (InterfaceC0698aG) j20));
        p30Var.n();
        if (j20.h.await(j, timeUnit)) {
            return w(mu);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static final AbstractC1004ey d(ArrayList arrayList, List list, AbstractC0545Ux abstractC0545Ux) {
        AbstractC1004ey i = new C2096vX(new C1697pT(0, arrayList)).i(3, (AbstractC1004ey) AbstractC0720ac.n0(list));
        return i == null ? abstractC0545Ux.m() : i;
    }

    public static p30 e(Executor executor, Callable callable) {
        AbstractC1473m3.o(executor, "Executor must not be null");
        p30 p30Var = new p30();
        executor.execute(new RunnableC1996u1(18, p30Var, callable, false));
        return p30Var;
    }

    public static DP f(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new DP();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                AbstractC0048Bt.m(str, "key");
                hashMap.put(str, bundle2.get(str));
            }
            return new DP(hashMap);
        }
        ClassLoader classLoader = DP.class.getClassLoader();
        AbstractC0048Bt.k(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = parcelableArrayList.get(i);
            AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
        }
        return new DP(linkedHashMap);
    }

    public static p30 i(Object obj) {
        p30 p30Var = new p30();
        p30Var.k(obj);
        return p30Var;
    }

    public static final int j(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    public static final String l(C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "<this>");
        String b = c0827cE.b();
        AbstractC0048Bt.m(b, "asString()");
        if (!AbstractC0467Rx.a.contains(b)) {
            for (int i = 0; i < b.length(); i++) {
                char charAt = b.charAt(i);
                if (Character.isLetterOrDigit(charAt) || charAt == '_') {
                }
            }
            String b2 = c0827cE.b();
            AbstractC0048Bt.m(b2, "asString()");
            return b2;
        }
        StringBuilder sb = new StringBuilder();
        String b3 = c0827cE.b();
        AbstractC0048Bt.m(b3, "asString()");
        sb.append("`".concat(b3));
        sb.append('`');
        return sb.toString();
    }

    public static final String m(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0827cE c0827cE = (C0827cE) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(l(c0827cE));
        }
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final JR n(JR jr, List list, OW ow) {
        AbstractC0048Bt.n(jr, "<this>");
        AbstractC0048Bt.n(list, "newArguments");
        AbstractC0048Bt.n(ow, "newAttributes");
        if (list.isEmpty() && ow == jr.A0()) {
            return jr;
        }
        if (list.isEmpty()) {
            return jr.H0(ow);
        }
        if (!(jr instanceof C0195Hk)) {
            return HO.r(list, ow, jr.B0(), jr.C0());
        }
        C0195Hk c0195Hk = (C0195Hk) jr;
        SW sw = c0195Hk.i;
        C0169Gk c0169Gk = c0195Hk.j;
        EnumC0247Jk enumC0247Jk = c0195Hk.k;
        boolean z = c0195Hk.m;
        String[] strArr = c0195Hk.n;
        return new C0195Hk(sw, c0169Gk, enumC0247Jk, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static AbstractC1004ey o(AbstractC1004ey abstractC1004ey, List list, InterfaceC1738q4 interfaceC1738q4, int i) {
        if ((i & 2) != 0) {
            interfaceC1738q4 = abstractC1004ey.getAnnotations();
        }
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        if ((list.isEmpty() || list == abstractC1004ey.w0()) && interfaceC1738q4 == abstractC1004ey.getAnnotations()) {
            return abstractC1004ey;
        }
        OW A0 = abstractC1004ey.A0();
        if ((interfaceC1738q4 instanceof C0637Yl) && interfaceC1738q4.isEmpty()) {
            interfaceC1738q4 = C0460Rq.t;
        }
        OW j = AbstractC1494mO.j(A0, interfaceC1738q4);
        AbstractC2097vY E0 = abstractC1004ey.E0();
        if (E0 instanceof AbstractC1782qm) {
            AbstractC1782qm abstractC1782qm = (AbstractC1782qm) E0;
            return HO.m(n(abstractC1782qm.i, list, j), n(abstractC1782qm.j, list, j));
        }
        if (E0 instanceof JR) {
            return n((JR) E0, list, j);
        }
        throw new C0057Cc();
    }

    public static /* synthetic */ JR p(JR jr, List list, OW ow, int i) {
        if ((i & 1) != 0) {
            list = jr.w0();
        }
        if ((i & 2) != 0) {
            ow = jr.A0();
        }
        return n(jr, list, ow);
    }

    public static final String q(String str, String str2, String str3, String str4, String str5) {
        AbstractC0048Bt.n(str, "lowerRendered");
        AbstractC0048Bt.n(str2, "lowerPrefix");
        AbstractC0048Bt.n(str3, "upperRendered");
        AbstractC0048Bt.n(str4, "upperPrefix");
        AbstractC0048Bt.n(str5, "foldedPrefix");
        if (!AbstractC0778bU.B(str, str2, false) || !AbstractC0778bU.B(str3, str4, false)) {
            return null;
        }
        String substring = str.substring(str2.length());
        AbstractC0048Bt.m(substring, "this as java.lang.String).substring(startIndex)");
        String substring2 = str3.substring(str4.length());
        AbstractC0048Bt.m(substring2, "this as java.lang.String).substring(startIndex)");
        String concat = str5.concat(substring);
        if (substring.equals(substring2)) {
            return concat;
        }
        if (!t(substring, substring2)) {
            return null;
        }
        return concat + '!';
    }

    public static final AbstractC1004ey r(InterfaceC1437lX interfaceC1437lX) {
        AbstractC0048Bt.n(interfaceC1437lX, "<this>");
        InterfaceC1118gg n = interfaceC1437lX.n();
        AbstractC0048Bt.m(n, "this.containingDeclaration");
        if (n instanceof InterfaceC0004Ab) {
            List parameters = ((InterfaceC0004Ab) n).z().getParameters();
            AbstractC0048Bt.m(parameters, "descriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(parameters));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                SW z = ((InterfaceC1437lX) it.next()).z();
                AbstractC0048Bt.m(z, "it.typeConstructor");
                arrayList.add(z);
            }
            List upperBounds = interfaceC1437lX.getUpperBounds();
            AbstractC0048Bt.m(upperBounds, "upperBounds");
            return d(arrayList, upperBounds, AbstractC0192Hh.e(interfaceC1437lX));
        }
        if (!(n instanceof InterfaceC0381Op)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((InterfaceC0381Op) n).getTypeParameters();
        AbstractC0048Bt.m(typeParameters, "descriptor.typeParameters");
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(typeParameters));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            SW z2 = ((InterfaceC1437lX) it2.next()).z();
            AbstractC0048Bt.m(z2, "it.typeConstructor");
            arrayList2.add(z2);
        }
        List upperBounds2 = interfaceC1437lX.getUpperBounds();
        AbstractC0048Bt.m(upperBounds2, "upperBounds");
        return d(arrayList2, upperBounds2, AbstractC0192Hh.e(interfaceC1437lX));
    }

    public static final void s(C0727aj c0727aj, InterfaceC2114vp interfaceC2114vp) {
        TC tc = c0727aj.b;
        if (!tc.m) {
            AbstractC0868ct.W("visitSubtreeIf called on an unattached node");
            throw null;
        }
        YD yd = new YD(new TC[16]);
        TC tc2 = tc.f;
        if (tc2 == null) {
            AbstractC0946e20.c(yd, tc);
        } else {
            yd.b(tc2);
        }
        while (yd.l()) {
            TC tc3 = (TC) yd.n(yd.j - 1);
            if ((tc3.d & 262144) != 0) {
                for (TC tc4 = tc3; tc4 != null; tc4 = tc4.f) {
                    if ((tc4.c & 262144) != 0) {
                        for (TC tc5 = tc4; tc5 != null; tc5 = null) {
                            if (tc5 instanceof C0727aj) {
                                C0727aj c0727aj2 = (C0727aj) tc5;
                                Object obj = C0460Rq.B;
                                EnumC2359zW enumC2359zW = (obj.equals(obj) && c0727aj.getClass() == c0727aj2.getClass()) ? (EnumC2359zW) interfaceC2114vp.invoke(c0727aj2) : EnumC2359zW.h;
                                if (enumC2359zW == EnumC2359zW.j) {
                                    return;
                                } else {
                                    if (enumC2359zW != EnumC2359zW.i) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            AbstractC0946e20.c(yd, tc3);
        }
    }

    public static final boolean t(String str, String str2) {
        AbstractC0048Bt.n(str, "lower");
        AbstractC0048Bt.n(str2, "upper");
        if (str.equals(AbstractC0778bU.z(str2, "?", ""))) {
            return true;
        }
        if (AbstractC0778bU.v(str2, "?", false) && AbstractC0048Bt.h(str.concat("?"), str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return AbstractC0048Bt.h(sb.toString(), str2);
    }

    public static int u(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            DY dy = FY.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return FY.c(i, AbstractC1768qY.g(bArr, j));
        }
        if (i2 == 2) {
            return FY.d(i, AbstractC1768qY.g(bArr, j), AbstractC1768qY.g(bArr, j + 1));
        }
        throw new AssertionError();
    }

    public static void v(View view) {
        try {
            if (!NZ.z) {
                NZ.z = true;
                if (Build.VERSION.SDK_INT < 28) {
                    NZ.x = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    NZ.y = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    NZ.x = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    NZ.y = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = NZ.x;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = NZ.y;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = NZ.y;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = NZ.x;
            if (method2 != null) {
                method2.invoke(view, null);
            }
        } catch (Throwable unused) {
            NZ.A = true;
        }
    }

    public static Object w(MU mu) {
        if (mu.i()) {
            return mu.g();
        }
        if (((p30) mu).d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(mu.f());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String g(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = bArr[i];
                    if (b < 0) {
                        while (i < i3) {
                            int i5 = i + 1;
                            byte b2 = bArr[i];
                            if (b2 >= 0) {
                                int i6 = i4 + 1;
                                cArr[i4] = (char) b2;
                                while (i5 < i3) {
                                    byte b3 = bArr[i5];
                                    if (b3 >= 0) {
                                        i5++;
                                        cArr[i6] = (char) b3;
                                        i6++;
                                    } else {
                                        i4 = i6;
                                        i = i5;
                                    }
                                }
                                i4 = i6;
                                i = i5;
                            } else if (b2 < -32) {
                                if (i5 >= i3) {
                                    throw C0230It.a();
                                }
                                i += 2;
                                byte b4 = bArr[i5];
                                int i7 = i4 + 1;
                                if (b2 < -62 || ZM.i(b4)) {
                                    throw C0230It.a();
                                }
                                cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                                i4 = i7;
                            } else {
                                if (b2 >= -16) {
                                    if (i5 >= i3 - 2) {
                                        throw C0230It.a();
                                    }
                                    byte b5 = bArr[i5];
                                    int i8 = i + 3;
                                    byte b6 = bArr[i + 2];
                                    i += 4;
                                    byte b7 = bArr[i8];
                                    int i9 = i4 + 1;
                                    if (!ZM.i(b5)) {
                                        if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !ZM.i(b6) && !ZM.i(b7)) {
                                            int i10 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b6 & 63) << 6) | (b7 & 63);
                                            cArr[i4] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i4 += 2;
                                        }
                                    }
                                    throw C0230It.a();
                                }
                                if (i5 >= i3 - 1) {
                                    throw C0230It.a();
                                }
                                int i11 = i + 2;
                                byte b8 = bArr[i5];
                                i += 3;
                                byte b9 = bArr[i11];
                                int i12 = i4 + 1;
                                if (ZM.i(b8) || ((b2 == -32 && b8 < -96) || ((b2 == -19 && b8 >= -96) || ZM.i(b9)))) {
                                    throw C0230It.a();
                                }
                                cArr[i4] = (char) (((b8 & 63) << 6) | ((b2 & 15) << 12) | (b9 & 63));
                                i4 = i12;
                            }
                        }
                        return new String(cArr, 0, i4);
                    }
                    i++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                while (i < i3) {
                }
                return new String(cArr, 0, i4);
            default:
                Charset charset = AbstractC2052ut.a;
                String str = new String(bArr, i, i2, charset);
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw C0230It.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r27 + r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char charAt;
        long j;
        char c;
        long j2;
        long j3;
        char c2;
        int i5;
        char charAt2;
        switch (this.a) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length && (i4 = i7 + i) < i6 && (charAt = str.charAt(i7)) < 128) {
                    bArr[i4] = (byte) charAt;
                    i7++;
                }
                int i8 = i + i7;
                while (i7 < length) {
                    char charAt3 = str.charAt(i7);
                    if (charAt3 < 128 && i8 < i6) {
                        bArr[i8] = (byte) charAt3;
                        i8++;
                    } else if (charAt3 < 2048 && i8 <= i6 - 2) {
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) ((charAt3 >>> 6) | 960);
                        i8 += 2;
                        bArr[i9] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || i8 > i6 - 3) {
                            if (i8 > i6 - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i7 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i3)))) {
                                    throw new EY(i7, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i8);
                            }
                            int i10 = i7 + 1;
                            if (i10 != str.length()) {
                                char charAt4 = str.charAt(i10);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i11 = i8 + 3;
                                    bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i8 += 4;
                                    bArr[i11] = (byte) ((codePoint & 63) | 128);
                                    i7 = i10;
                                } else {
                                    i7 = i10;
                                }
                            }
                            throw new EY(i7 - 1, length);
                        }
                        bArr[i8] = (byte) ((charAt3 >>> '\f') | 480);
                        int i12 = i8 + 2;
                        bArr[i8 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i8 += 3;
                        bArr[i12] = (byte) ((charAt3 & '?') | 128);
                    }
                    i7++;
                }
                return i8;
            default:
                long j4 = i;
                long j5 = i2 + j4;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i13 = 0;
                while (true) {
                    j = 1;
                    c = 128;
                    if (i13 < length2 && (charAt2 = str.charAt(i13)) < 128) {
                        AbstractC1768qY.k(bArr, j4, (byte) charAt2);
                        i13++;
                        j4 = 1 + j4;
                    }
                }
                if (i13 == length2) {
                    return (int) j4;
                }
                while (i13 < length2) {
                    char charAt5 = str.charAt(i13);
                    if (charAt5 < c && j4 < j5) {
                        AbstractC1768qY.k(bArr, j4, (byte) charAt5);
                        c2 = c;
                        j2 = j;
                        j3 = j4 + j;
                    } else if (charAt5 >= 2048 || j4 > j5 - 2) {
                        j2 = j;
                        if ((charAt5 >= 55296 && 57343 >= charAt5) || j4 > j5 - 3) {
                            long j6 = j4;
                            if (j6 > j5 - 4) {
                                if (55296 <= charAt5 && charAt5 <= 57343 && ((i5 = i13 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i5)))) {
                                    throw new EY(i13, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j6);
                            }
                            int i14 = i13 + 1;
                            if (i14 != length2) {
                                char charAt6 = str.charAt(i14);
                                if (Character.isSurrogatePair(charAt5, charAt6)) {
                                    int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                    AbstractC1768qY.k(bArr, j6, (byte) ((codePoint2 >>> 18) | 240));
                                    c2 = 128;
                                    AbstractC1768qY.k(bArr, j6 + j2, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    AbstractC1768qY.k(bArr, j6 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    AbstractC1768qY.k(bArr, j6 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j3 = j6 + 4;
                                    i13 = i14;
                                } else {
                                    i13 = i14;
                                }
                            }
                            throw new EY(i13 - 1, length2);
                        }
                        AbstractC1768qY.k(bArr, j4, (byte) ((charAt5 >>> '\f') | 480));
                        long j7 = j4;
                        AbstractC1768qY.k(bArr, j4 + j2, (byte) (((charAt5 >>> 6) & 63) | 128));
                        j3 = j7 + 3;
                        AbstractC1768qY.k(bArr, j7 + 2, (byte) ((charAt5 & '?') | 128));
                        c2 = 128;
                    } else {
                        j2 = j;
                        AbstractC1768qY.k(bArr, j4, (byte) ((charAt5 >>> 6) | 960));
                        AbstractC1768qY.k(bArr, j4 + j2, (byte) ((charAt5 & '?') | c));
                        j3 = j4 + 2;
                        c2 = c;
                    }
                    i13++;
                    c = c2;
                    j4 = j3;
                    j = j2;
                }
                return (int) j4;
        }
    }

    public final int k(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        int i4 = i;
        switch (this.a) {
            case 0:
                break;
            default:
                if ((i4 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i2)));
                }
                long j2 = i4;
                int i5 = (int) (i2 - j2);
                long j3 = 1;
                if (i5 < 16) {
                    i3 = 0;
                } else {
                    int i6 = 8 - (((int) j2) & 7);
                    long j4 = j2;
                    i3 = 0;
                    while (true) {
                        if (i3 < i6) {
                            long j5 = j4 + 1;
                            if (AbstractC1768qY.g(bArr, j4) >= 0) {
                                i3++;
                                j4 = j5;
                            }
                        } else {
                            while (true) {
                                int i7 = i3 + 8;
                                if (i7 <= i5) {
                                    if ((AbstractC1768qY.c.h(AbstractC1768qY.f + j4, bArr) & (-9187201950435737472L)) == 0) {
                                        j4 += 8;
                                        i3 = i7;
                                    }
                                }
                            }
                            while (true) {
                                if (i3 < i5) {
                                    long j6 = j4 + 1;
                                    if (AbstractC1768qY.g(bArr, j4) >= 0) {
                                        i3++;
                                        j4 = j6;
                                    }
                                } else {
                                    i3 = i5;
                                }
                            }
                        }
                    }
                }
                int i8 = i5 - i3;
                long j7 = j2 + i3;
                while (true) {
                    byte b = 0;
                    while (true) {
                        if (i8 > 0) {
                            long j8 = j7 + j3;
                            b = AbstractC1768qY.g(bArr, j7);
                            if (b >= 0) {
                                i8--;
                                j7 = j8;
                            } else {
                                j7 = j8;
                            }
                        }
                    }
                    if (i8 == 0) {
                        return 0;
                    }
                    int i9 = i8 - 1;
                    if (b < -32) {
                        if (i9 == 0) {
                            return b;
                        }
                        i8 -= 2;
                        if (b >= -62) {
                            long j9 = j7 + j3;
                            if (AbstractC1768qY.g(bArr, j7) <= -65) {
                                j = j3;
                                j7 = j9;
                                j3 = j;
                            }
                        }
                    } else if (b >= -16) {
                        j = j3;
                        if (i9 < 3) {
                            return u(j7, bArr, b, i9);
                        }
                        i8 -= 4;
                        long j10 = j7 + j;
                        byte g = AbstractC1768qY.g(bArr, j7);
                        if (g <= -65) {
                            if ((((g + 112) + (b << 28)) >> 30) == 0) {
                                long j11 = 2 + j7;
                                if (AbstractC1768qY.g(bArr, j10) <= -65) {
                                    j7 += 3;
                                    if (AbstractC1768qY.g(bArr, j11) <= -65) {
                                        j3 = j;
                                    }
                                }
                            }
                        }
                    } else {
                        if (i9 < 2) {
                            return u(j7, bArr, b, i9);
                        }
                        i8 -= 3;
                        j = j3;
                        long j12 = j7 + j;
                        byte g2 = AbstractC1768qY.g(bArr, j7);
                        if (g2 <= -65 && ((b != -32 || g2 >= -96) && (b != -19 || g2 < -96))) {
                            j7 += 2;
                            if (AbstractC1768qY.g(bArr, j12) <= -65) {
                                j3 = j;
                            }
                        }
                    }
                }
                return -1;
        }
        while (i4 < i2 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 < i2) {
            while (i4 < i2) {
                int i10 = i4 + 1;
                byte b2 = bArr[i4];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i10 >= i2) {
                            return b2;
                        }
                        if (b2 >= -62) {
                            i4 += 2;
                            if (bArr[i10] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b2 < -16) {
                        if (i10 >= i2 - 1) {
                            return FY.a(bArr, i10, i2);
                        }
                        int i11 = i4 + 2;
                        byte b3 = bArr[i10];
                        if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                            i4 += 3;
                            if (bArr[i11] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i10 >= i2 - 2) {
                        return FY.a(bArr, i10, i2);
                    }
                    int i12 = i4 + 2;
                    byte b4 = bArr[i10];
                    if (b4 <= -65) {
                        if ((((b4 + 112) + (b2 << 28)) >> 30) == 0) {
                            int i13 = i4 + 3;
                            if (bArr[i12] <= -65) {
                                i4 += 4;
                                if (bArr[i13] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i4 = i10;
            }
        }
        return 0;
    }
}
