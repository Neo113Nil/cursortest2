package o;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public abstract class EB {
    public static final C0457Rn h;
    public static final C0457Rn i;
    public static final C0457Rn j;
    public static final C0457Rn k;
    public static final C0457Rn l;
    public static Boolean w;
    public static Boolean x;
    public static Boolean y;
    public static Boolean z;
    public static final C1420lG a = new C1420lG("provider");
    public static final C1420lG b = new C1420lG("provider");
    public static final C1420lG c = new C1420lG("compositionLocalMap");
    public static final C1420lG d = new C1420lG("providers");
    public static final C1420lG e = new C1420lG("reference");
    public static final T2 f = new T2(1);
    public static final C1185hh g = new C1185hh(1.0f, 1.0f);
    public static final C0794bk m = new C0794bk(false);
    public static final C0794bk n = new C0794bk(true);

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f35o = {48, 49, 53, 0};
    public static final byte[] p = {48, 49, 48, 0};
    public static final byte[] q = {48, 48, 57, 0};
    public static final byte[] r = {48, 48, 53, 0};
    public static final byte[] s = {48, 48, 49, 0};
    public static final byte[] t = {48, 48, 49, 0};
    public static final byte[] u = {48, 48, 50, 0};
    public static final Object v = new Object();

    static {
        int i2 = 5;
        h = new C0457Rn("COMPLETING_ALREADY", i2);
        i = new C0457Rn("COMPLETING_WAITING_CHILDREN", i2);
        j = new C0457Rn("COMPLETING_RETRY", i2);
        k = new C0457Rn("TOO_LATE_TO_CANCEL", i2);
        l = new C0457Rn("SEALED", i2);
    }

    public static final boolean A(InterfaceC1245ib interfaceC1245ib) {
        LinkedHashSet linkedHashSet = C2101vc.a;
        if (!AbstractC0114Eh.l(interfaceC1245ib)) {
            return false;
        }
        LinkedHashSet linkedHashSet2 = C2101vc.a;
        C1639ob f2 = AbstractC0192Hh.f(interfaceC1245ib);
        return AbstractC0720ac.j0(linkedHashSet2, f2 != null ? f2.f() : null);
    }

    public static boolean B(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (w == null) {
            w = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        w.booleanValue();
        if (x == null) {
            x = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (x.booleanValue()) {
            return !PX.d0() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC0235Iy C(EnumC1992tz enumC1992tz, InterfaceC1455lp interfaceC1455lp) {
        C1097gL c1097gL = C1097gL.f168o;
        int ordinal = enumC1992tz.ordinal();
        if (ordinal == 0) {
            return new BU(interfaceC1455lp);
        }
        if (ordinal == 1) {
            C2220xP c2220xP = new C2220xP();
            c2220xP.h = (AbstractC1596ny) interfaceC1455lp;
            c2220xP.i = c1097gL;
            return c2220xP;
        }
        if (ordinal != 2) {
            throw new C0057Cc();
        }
        C1438lY c1438lY = new C1438lY();
        c1438lY.h = (AbstractC1596ny) interfaceC1455lp;
        c1438lY.i = c1097gL;
        return c1438lY;
    }

    public static BU D(InterfaceC1455lp interfaceC1455lp) {
        AbstractC0048Bt.n(interfaceC1455lp, "initializer");
        return new BU(interfaceC1455lp);
    }

    public static int E(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map F(C1619oH c1619oH) {
        AbstractC0048Bt.n(c1619oH, "pair");
        Map singletonMap = Collections.singletonMap(c1619oH.h, c1619oH.i);
        AbstractC0048Bt.m(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static Map G(C1619oH... c1619oHArr) {
        if (c1619oHArr.length <= 0) {
            return C1384kk.h;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(E(c1619oHArr.length));
        N(linkedHashMap, c1619oHArr);
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c7, code lost:
    
        if (o.AbstractC0048Bt.h(((o.C0284Kv) r5).i, "java/lang/Object") != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x011f, code lost:
    
        r8 = r9.c();
        o.AbstractC0048Bt.m(r8, "valueParameterDescriptor.type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0134, code lost:
    
        return (o.AbstractC0335Mv) o.AbstractC1473m3.S(o.AbstractC0772bO.u(r8), o.C1371kX.k, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011d, code lost:
    
        if (o.AbstractC0192Hh.g(r0).equals(o.AbstractC0192Hh.g(r3)) == false) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC0335Mv H(InterfaceC0381Op interfaceC0381Op, RY ry) {
        InterfaceC0381Op a2;
        AbstractC0048Bt.n(interfaceC0381Op, "f");
        boolean h2 = AbstractC0048Bt.h(((AbstractC1184hg) interfaceC0381Op).getName().b(), "remove");
        C0563Vp c0563Vp = C0563Vp.h;
        if (h2 && interfaceC0381Op.t0().size() == 1 && !(AbstractC0192Hh.k(interfaceC0381Op).n() instanceof InterfaceC0593Wt) && !AbstractC0545Ux.z(interfaceC0381Op)) {
            List t0 = interfaceC0381Op.a().t0();
            AbstractC0048Bt.m(t0, "f.original.valueParameters");
            AbstractC1004ey c2 = ((RY) AbstractC0720ac.D0(t0)).c();
            AbstractC0048Bt.m(c2, "f.original.valueParameters.single().type");
            C1371kX c1371kX = C1371kX.k;
            AbstractC0335Mv abstractC0335Mv = (AbstractC0335Mv) AbstractC1473m3.S(c2, c1371kX, c0563Vp);
            C0309Lv c0309Lv = abstractC0335Mv instanceof C0309Lv ? (C0309Lv) abstractC0335Mv : null;
            if ((c0309Lv != null ? c0309Lv.i : null) == EnumC1791qv.INT && (a2 = C0691a9.a(interfaceC0381Op)) != null) {
                List t02 = a2.a().t0();
                AbstractC0048Bt.m(t02, "overridden.original.valueParameters");
                AbstractC1004ey c3 = ((RY) AbstractC0720ac.D0(t02)).c();
                AbstractC0048Bt.m(c3, "overridden.original.valueParameters.single().type");
                AbstractC0335Mv abstractC0335Mv2 = (AbstractC0335Mv) AbstractC1473m3.S(c3, c1371kX, c0563Vp);
                InterfaceC1118gg n2 = a2.n();
                AbstractC0048Bt.m(n2, "overridden.containingDeclaration");
                if (AbstractC0192Hh.h(n2).equals(AbstractC1433lT.J.i())) {
                    if (abstractC0335Mv2 instanceof C0284Kv) {
                    }
                }
            }
        }
        if (interfaceC0381Op.t0().size() == 1) {
            InterfaceC1118gg n3 = interfaceC0381Op.n();
            InterfaceC1245ib interfaceC1245ib = n3 instanceof InterfaceC1245ib ? (InterfaceC1245ib) n3 : null;
            if (interfaceC1245ib != null) {
                List t03 = interfaceC0381Op.t0();
                AbstractC0048Bt.m(t03, "f.valueParameters");
                InterfaceC2364zb c4 = ((RY) AbstractC0720ac.D0(t03)).c().B0().c();
                InterfaceC1245ib interfaceC1245ib2 = c4 instanceof InterfaceC1245ib ? (InterfaceC1245ib) c4 : null;
                if (interfaceC1245ib2 != null) {
                    if (AbstractC0545Ux.t(interfaceC1245ib) != null) {
                    }
                }
            }
        }
        AbstractC1004ey c5 = ry.c();
        AbstractC0048Bt.m(c5, "valueParameterDescriptor.type");
        return (AbstractC0335Mv) AbstractC1473m3.S(c5, C1371kX.k, c0563Vp);
    }

    public static final long I(long j2, long j3) {
        return ((((int) (j2 >> 32)) - ((int) (j3 >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j3 & 4294967295L))) & 4294967295L);
    }

    public static final ArrayList J(InterfaceC1159hH interfaceC1159hH, C2245xo c2245xo) {
        AbstractC0048Bt.n(interfaceC1159hH, "<this>");
        AbstractC0048Bt.n(c2245xo, "fqName");
        ArrayList arrayList = new ArrayList();
        g(interfaceC1159hH, c2245xo, arrayList);
        return arrayList;
    }

    public static long K(int i2, String str) {
        int m2 = m(str, 0, i2, false);
        Matcher matcher = C0059Ce.m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (m2 < i2) {
            int m3 = m(str, m2 + 1, i2, true);
            matcher.region(m2, m3);
            if (i4 == -1 && matcher.usePattern(C0059Ce.m).matches()) {
                String group = matcher.group(1);
                AbstractC0048Bt.m(group, "matcher.group(1)");
                i4 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                AbstractC0048Bt.m(group2, "matcher.group(2)");
                i7 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                AbstractC0048Bt.m(group3, "matcher.group(3)");
                i8 = Integer.parseInt(group3);
            } else if (i5 == -1 && matcher.usePattern(C0059Ce.l).matches()) {
                String group4 = matcher.group(1);
                AbstractC0048Bt.m(group4, "matcher.group(1)");
                i5 = Integer.parseInt(group4);
            } else {
                if (i6 == -1) {
                    Pattern pattern = C0059Ce.k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        AbstractC0048Bt.m(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        AbstractC0048Bt.m(locale, "US");
                        String lowerCase = group5.toLowerCase(locale);
                        AbstractC0048Bt.m(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        AbstractC0048Bt.m(pattern2, "MONTH_PATTERN.pattern()");
                        i6 = UT.G(pattern2, lowerCase, 0, false) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(C0059Ce.j).matches()) {
                    String group6 = matcher.group(1);
                    AbstractC0048Bt.m(group6, "matcher.group(1)");
                    i3 = Integer.parseInt(group6);
                }
            }
            m2 = m(str, m3 + 1, i2, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i6 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i5 || i5 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i4 < 0 || i4 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i7 < 0 || i7 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i8 < 0 || i8 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(HY.e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final long L(long j2, long j3) {
        return ((((int) (j2 >> 32)) + ((int) (j3 >> 32))) << 32) | ((((int) (j2 & 4294967295L)) + ((int) (j3 & 4294967295L))) & 4294967295L);
    }

    public static C0827cE M(C0827cE c0827cE, String str, String str2, int i2) {
        char charAt;
        char charAt2;
        Object obj;
        boolean z2 = (i2 & 4) != 0;
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if (!c0827cE.i) {
            String c2 = c0827cE.c();
            if (AbstractC0778bU.B(c2, str, false) && c2.length() != str.length() && ('a' > (charAt = c2.charAt(str.length())) || charAt >= '{')) {
                if (str2 != null) {
                    return C0827cE.e(str2.concat(UT.M(c2, str)));
                }
                if (!z2) {
                    return c0827cE;
                }
                String M = UT.M(c2, str);
                if (M.length() != 0 && AbstractC0022At.z(0, M)) {
                    if (M.length() != 1 && AbstractC0022At.z(1, M)) {
                        Iterator it = new C1197ht(0, M.length() - 1, 1).iterator();
                        while (true) {
                            C1131gt c1131gt = (C1131gt) it;
                            if (!c1131gt.j) {
                                obj = null;
                                break;
                            }
                            obj = c1131gt.next();
                            if (!AbstractC0022At.z(((Number) obj).intValue(), M)) {
                                break;
                            }
                        }
                        Integer num = (Integer) obj;
                        if (num != null) {
                            int intValue = num.intValue() - 1;
                            String substring = M.substring(0, intValue);
                            AbstractC0048Bt.m(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String M2 = AbstractC0022At.M(substring);
                            String substring2 = M.substring(intValue);
                            AbstractC0048Bt.m(substring2, "this as java.lang.String).substring(startIndex)");
                            M = M2.concat(substring2);
                        } else {
                            M = AbstractC0022At.M(M);
                        }
                    } else if (M.length() != 0 && 'A' <= (charAt2 = M.charAt(0)) && charAt2 < '[') {
                        char lowerCase = Character.toLowerCase(charAt2);
                        String substring3 = M.substring(1);
                        AbstractC0048Bt.m(substring3, "this as java.lang.String).substring(startIndex)");
                        M = lowerCase + substring3;
                    }
                }
                if (C0827cE.f(M)) {
                    return C0827cE.e(M);
                }
            }
        }
        return null;
    }

    public static final void N(HashMap hashMap, C1619oH[] c1619oHArr) {
        for (C1619oH c1619oH : c1619oHArr) {
            hashMap.put(c1619oH.h, c1619oH.i);
        }
    }

    public static LC O(MappedByteBuffer mappedByteBuffer) {
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
                    LC lc = new LC();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    lc.k = duplicate;
                    lc.h = position;
                    int i7 = position - duplicate.getInt(position);
                    lc.i = i7;
                    lc.j = ((ByteBuffer) lc.k).getShort(i7);
                    return lc;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static byte[] P(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                throw new IllegalStateException(AbstractC2188wx.g(i2, "Not enough bytes to read: "));
            }
            i3 += read;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] Q(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int i5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i5 += inflater.inflate(bArr, i5, i3 - i5);
                    i4 += read;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static long R(InputStream inputStream, int i2) {
        byte[] P = P(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (P[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static final void S(C0972eS c0972eS, C1970td c1970td) {
        int i2;
        int[] iArr = c0972eS.b;
        int i3 = c0972eS.t;
        int f2 = c0972eS.f(iArr, c0972eS.p(c0972eS.q(i3) + i3));
        for (int f3 = c0972eS.f(c0972eS.b, c0972eS.p(c0972eS.t)); f3 < f2; f3++) {
            Object obj = c0972eS.c[c0972eS.g(f3)];
            int i4 = -1;
            if (obj instanceof C0027Ay) {
                int o2 = c0972eS.o() - f3;
                C0027Ay c0027Ay = (C0027Ay) obj;
                QD qd = (QD) c1970td.g;
                if (qd == null) {
                    int i5 = WP.a;
                    qd = new QD();
                    c1970td.g = qd;
                }
                qd.b[qd.d(c0027Ay)] = c0027Ay;
                c1970td.h(c0027Ay, o2, -1, -1);
            }
            if (obj instanceof C0836cN) {
                int o3 = c0972eS.o() - f3;
                C0836cN c0836cN = (C0836cN) obj;
                C1471m2 c1471m2 = c0836cN.b;
                if (c1471m2 == null || !c1471m2.a()) {
                    i2 = -1;
                } else {
                    i4 = c0972eS.c(c1471m2);
                    i2 = c0972eS.o() - c0972eS.f(c0972eS.b, c0972eS.p(c0972eS.q(i4) + i4));
                }
                c1970td.h(c0836cN.a, o3, i4, i2);
            }
            if (obj instanceof WL) {
                ((WL) obj).d();
            }
        }
        c0972eS.z();
    }

    public static final void T(boolean z2) {
        if (z2) {
            return;
        }
        h("Check failed");
        throw null;
    }

    public static int U(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Map V(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C1384kk.h;
        }
        if (size == 1) {
            return F((C1619oH) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(E(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1619oH c1619oH = (C1619oH) it.next();
            linkedHashMap.put(c1619oH.h, c1619oH.i);
        }
        return linkedHashMap;
    }

    public static Map W(Map map) {
        AbstractC0048Bt.n(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return C1384kk.h;
        }
        if (size != 1) {
            return X(map);
        }
        AbstractC0048Bt.n(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC0048Bt.m(singletonMap, "with(...)");
        return singletonMap;
    }

    public static LinkedHashMap X(Map map) {
        AbstractC0048Bt.n(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static final Object Y(Object obj) {
        InterfaceC2249xs interfaceC2249xs;
        C2315ys c2315ys = obj instanceof C2315ys ? (C2315ys) obj : null;
        return (c2315ys == null || (interfaceC2249xs = c2315ys.a) == null) ? obj : interfaceC2249xs;
    }

    public static AbstractC1964tX Z(AbstractC1964tX abstractC1964tX) {
        if (!(abstractC1964tX instanceof C2381zs)) {
            return new C1572na(abstractC1964tX, 0);
        }
        C2381zs c2381zs = (C2381zs) abstractC1964tX;
        InterfaceC1437lX[] interfaceC1437lXArr = c2381zs.b;
        AbstractC1701pX[] abstractC1701pXArr = c2381zs.c;
        AbstractC0048Bt.n(abstractC1701pXArr, "<this>");
        AbstractC0048Bt.n(interfaceC1437lXArr, "other");
        int min = Math.min(abstractC1701pXArr.length, interfaceC1437lXArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(new C1619oH(abstractC1701pXArr[i2], interfaceC1437lXArr[i2]));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1619oH c1619oH = (C1619oH) it.next();
            arrayList2.add(l((AbstractC1701pX) c1619oH.h, (InterfaceC1437lX) c1619oH.i));
        }
        return new C2381zs(interfaceC1437lXArr, (AbstractC1701pX[]) arrayList2.toArray(new AbstractC1701pX[0]), true);
    }

    public static final C1250ih a(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        InterfaceC1388ko a2 = AbstractC1454lo.a(f2);
        if (a2 == null) {
            a2 = new C0547Uz(f2);
        }
        return new C1250ih(f3, f2, a2);
    }

    public static void a0(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final long b(float f2, boolean z2) {
        return ((z2 ? 1L : 0L) & 4294967295L) | (Float.floatToIntBits(f2) << 32);
    }

    public static void b0(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        a0(byteArrayOutputStream, i2, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(JV jv, C0008Af c0008Af, Throwable th, AbstractC2367ze abstractC2367ze) {
        C0119Em c0119Em;
        int i2;
        try {
            if (abstractC2367ze instanceof C0119Em) {
                c0119Em = (C0119Em) abstractC2367ze;
                int i3 = c0119Em.j;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c0119Em.j = i3 - Integer.MIN_VALUE;
                    Object obj = c0119Em.i;
                    i2 = c0119Em.j;
                    C0782bY c0782bY = C0782bY.a;
                    if (i2 != 0) {
                        AbstractC1494mO.l(obj);
                        c0119Em.h = th;
                        c0119Em.j = 1;
                        c0008Af.e(jv, th, c0119Em);
                        EnumC0448Re enumC0448Re = EnumC0448Re.h;
                        if (c0782bY == enumC0448Re) {
                            return enumC0448Re;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = c0119Em.h;
                        AbstractC1494mO.l(obj);
                    }
                    return c0782bY;
                }
            }
            if (i2 != 0) {
            }
            return c0782bY;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                AbstractC0946e20.e(th2, th);
            }
            throw th2;
        }
        c0119Em = new C0119Em(abstractC2367ze);
        Object obj2 = c0119Em.i;
        i2 = c0119Em.j;
        C0782bY c0782bY2 = C0782bY.a;
    }

    public static final void d(ArrayList arrayList, int i2, int i3) {
        int q2 = q(i2, arrayList);
        if (q2 < 0) {
            q2 = -(q2 + 1);
        }
        while (q2 < arrayList.size() && ((C0256Jt) arrayList.get(q2)).b < i3) {
            arrayList.remove(q2);
        }
    }

    public static final boolean e(int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        AbstractC0048Bt.n(bArr, "a");
        AbstractC0048Bt.n(bArr2, "b");
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final void f(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static final void g(InterfaceC1159hH interfaceC1159hH, C2245xo c2245xo, ArrayList arrayList) {
        AbstractC0048Bt.n(interfaceC1159hH, "<this>");
        AbstractC0048Bt.n(c2245xo, "fqName");
        interfaceC1159hH.b(c2245xo, arrayList);
    }

    public static final void h(String str) {
        throw new C1049fd(AbstractC1888sN.k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void i(String str) {
        throw new C1049fd(AbstractC1888sN.k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static byte[] j(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0665Zn k(Context context) {
        ProviderInfo providerInfo;
        C1216i8 c1216i8;
        ApplicationInfo applicationInfo;
        C1097gL c2039ug = Build.VERSION.SDK_INT >= 28 ? new C2039ug(27) : new C1097gL(27);
        PackageManager packageManager = context.getPackageManager();
        AbstractC1807r8.m(packageManager, "Package manager required to locate emoji font provider");
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
                Signature[] n0 = c2039ug.n0(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : n0) {
                    arrayList.add(signature.toByteArray());
                }
                c1216i8 = new C1216i8(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (c1216i8 != null) {
                return null;
            }
            return new C0665Zn(new C0639Yn(context, c1216i8));
        }
        c1216i8 = null;
        if (c1216i8 != null) {
        }
    }

    public static final AbstractC1701pX l(AbstractC1701pX abstractC1701pX, InterfaceC1437lX interfaceC1437lX) {
        if (interfaceC1437lX == null || abstractC1701pX.a() == 1) {
            return abstractC1701pX;
        }
        if (interfaceC1437lX.Y() != abstractC1701pX.a()) {
            C1506ma c1506ma = new C1506ma(abstractC1701pX);
            OW.i.getClass();
            return new C1767qX(1, new C1308ja(abstractC1701pX, c1506ma, false, OW.j));
        }
        if (!abstractC1701pX.c()) {
            return new C1767qX(abstractC1701pX.b());
        }
        MA ma = VA.e;
        AbstractC0048Bt.m(ma, "NO_LOCKS");
        return new C1767qX(1, new C2124vz(ma, new C1139h0(4, abstractC1701pX)));
    }

    public static int m(String str, int i2, int i3, boolean z2) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z2)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean n(InterfaceC2072v9 interfaceC2072v9, InterfaceC2072v9 interfaceC2072v92) {
        AbstractC0048Bt.n(interfaceC2072v9, "superDescriptor");
        AbstractC0048Bt.n(interfaceC2072v92, "subDescriptor");
        if (!(interfaceC2072v92 instanceof C0934du) || !(interfaceC2072v9 instanceof InterfaceC0381Op)) {
            return false;
        }
        C0934du c0934du = (C0934du) interfaceC2072v92;
        c0934du.t0().size();
        InterfaceC0381Op interfaceC0381Op = (InterfaceC0381Op) interfaceC2072v9;
        interfaceC0381Op.t0().size();
        List t0 = c0934du.a().t0();
        AbstractC0048Bt.m(t0, "subDescriptor.original.valueParameters");
        List t02 = interfaceC0381Op.a().t0();
        AbstractC0048Bt.m(t02, "superDescriptor.original.valueParameters");
        Iterator it = AbstractC0720ac.O0(t0, t02).iterator();
        while (it.hasNext()) {
            C1619oH c1619oH = (C1619oH) it.next();
            RY ry = (RY) c1619oH.h;
            RY ry2 = (RY) c1619oH.i;
            AbstractC0048Bt.m(ry, "subParameter");
            boolean z2 = H((InterfaceC0381Op) interfaceC2072v92, ry) instanceof C0309Lv;
            AbstractC0048Bt.m(ry2, "superParameter");
            if (z2 != (H(interfaceC0381Op, ry2) instanceof C0309Lv)) {
                return true;
            }
        }
        return false;
    }

    public static boolean o(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final C1558nM p(Annotation[] annotationArr, C2245xo c2245xo) {
        Annotation annotation;
        AbstractC0048Bt.n(annotationArr, "<this>");
        AbstractC0048Bt.n(c2245xo, "fqName");
        int length = annotationArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i2];
            if (AbstractC1492mM.a(AbstractC1473m3.D(AbstractC1473m3.B(annotation))).b().equals(c2245xo)) {
                break;
            }
            i2++;
        }
        if (annotation != null) {
            return new C1558nM(annotation);
        }
        return null;
    }

    public static final int q(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int t2 = AbstractC0048Bt.t(((C0256Jt) list.get(i4)).b, i2);
            if (t2 < 0) {
                i3 = i4 + 1;
            } else {
                if (t2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final ArrayList r(Annotation[] annotationArr) {
        AbstractC0048Bt.n(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C1558nM(annotation));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList s(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        XN xn;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        YN yn = new YN(resources, theme);
        synchronized (AbstractC0706aO.c) {
            try {
                SparseArray sparseArray = (SparseArray) AbstractC0706aO.b.get(yn);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (xn = (XN) sparseArray.get(i2)) != null) {
                    if (xn.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (xn.c != 0) {
                            }
                            colorStateList2 = xn.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i2);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = AbstractC0706aO.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateList = AbstractC1706pc.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList == null) {
            return WN.b(resources, i2, theme);
        }
        synchronized (AbstractC0706aO.c) {
            try {
                WeakHashMap weakHashMap = AbstractC0706aO.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(yn);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(yn, sparseArray2);
                }
                sparseArray2.append(i2, new XN(colorStateList, yn.a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static Drawable t(Context context, int i2) {
        return VN.b().c(context, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC0517Tv u(InterfaceC1068fw interfaceC1068fw) {
        InterfaceC1245ib interfaceC1245ib;
        if (interfaceC1068fw instanceof InterfaceC0517Tv) {
            return (InterfaceC0517Tv) interfaceC1068fw;
        }
        if (!(interfaceC1068fw instanceof InterfaceC1727px)) {
            throw new C0526Ue("Cannot calculate JVM erasure for type: " + interfaceC1068fw);
        }
        RM rm = ((C1793qx) ((InterfaceC1727px) interfaceC1068fw)).i;
        InterfaceC0937dx interfaceC0937dx = C1793qx.k[0];
        Object invoke = rm.invoke();
        AbstractC0048Bt.m(invoke, "<get-upperBounds>(...)");
        List list = (List) invoke;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC1463lx interfaceC1463lx = (InterfaceC1463lx) next;
            AbstractC0048Bt.l(interfaceC1463lx, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            InterfaceC2364zb c2 = ((C1661ox) interfaceC1463lx).h.B0().c();
            interfaceC1245ib = c2 instanceof InterfaceC1245ib ? (InterfaceC1245ib) c2 : null;
            if (interfaceC1245ib != null && interfaceC1245ib.B() != 2 && interfaceC1245ib.B() != 5) {
                interfaceC1245ib = next;
                break;
            }
        }
        InterfaceC1463lx interfaceC1463lx2 = (InterfaceC1463lx) interfaceC1245ib;
        if (interfaceC1463lx2 == null) {
            interfaceC1463lx2 = (InterfaceC1463lx) AbstractC0720ac.p0(list);
        }
        return interfaceC1463lx2 != null ? v(interfaceC1463lx2) : UM.a.b(Object.class);
    }

    public static final InterfaceC0517Tv v(InterfaceC1463lx interfaceC1463lx) {
        InterfaceC1068fw l2 = ((C1661ox) interfaceC1463lx).l();
        if (l2 != null) {
            return u(l2);
        }
        throw new C0526Ue("Cannot calculate JVM erasure for type: " + interfaceC1463lx);
    }

    public static Object w(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC0888d9.a(bundle, str, K1.class);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (K1.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static Object x(Object obj, Map map) {
        AbstractC0048Bt.n(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static boolean y(InterfaceC2204x9 interfaceC2204x9) {
        AbstractC0048Bt.n(interfaceC2204x9, "callableMemberDescriptor");
        if (!AbstractC0757b9.d.contains(interfaceC2204x9.getName())) {
            return false;
        }
        if (AbstractC0720ac.j0(AbstractC0757b9.c, AbstractC0192Hh.c(interfaceC2204x9)) && interfaceC2204x9.t0().isEmpty()) {
            return true;
        }
        if (!AbstractC0545Ux.z(interfaceC2204x9)) {
            return false;
        }
        Collection o2 = interfaceC2204x9.o();
        AbstractC0048Bt.m(o2, "overriddenDescriptors");
        Collection<InterfaceC2204x9> collection = o2;
        if (collection.isEmpty()) {
            return false;
        }
        for (InterfaceC2204x9 interfaceC2204x92 : collection) {
            AbstractC0048Bt.m(interfaceC2204x92, "it");
            if (y(interfaceC2204x92)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean z(InterfaceC1159hH interfaceC1159hH, C2245xo c2245xo) {
        AbstractC0048Bt.n(interfaceC1159hH, "<this>");
        AbstractC0048Bt.n(c2245xo, "fqName");
        return interfaceC1159hH.a(c2245xo);
    }
}
