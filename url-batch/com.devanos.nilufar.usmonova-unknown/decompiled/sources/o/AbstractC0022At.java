package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import com.google.firebase.messaging.ServiceStarter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.At, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0022At implements InterfaceC1418lE {
    public static final C0457Rn a;
    public static final C0457Rn b;
    public static final C0457Rn c;
    public static final H00 d = new H00(0.31006f, 0.31616f);
    public static final H00 e = new H00(0.34567f, 0.3585f);
    public static final H00 f = new H00(0.32168f, 0.33767f);
    public static final H00 g = new H00(0.31271f, 0.32902f);
    public static final float[] h = {0.964212f, 1.0f, 0.825188f};
    public static final C0218Ih i = new C0218Ih(16);
    public static final C1432lS j = new C1432lS(1);
    public static final C1170hS k = new C1170hS(0);
    public static final Object l = new Object();
    public static boolean m;
    public static int n;

    /* renamed from: o, reason: collision with root package name */
    public static C1334k f14o;

    static {
        int i2 = 5;
        a = new C0457Rn("RESUME_TOKEN", i2);
        b = new C0457Rn("UNDEFINED", i2);
        c = new C0457Rn("REUSABLE_CLAIMED", i2);
    }

    public static void A(PackageInfo packageInfo, File file) {
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

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0134, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NG B(C1347k9... c1347k9Arr) {
        int i2;
        int i3 = 0;
        if (c1347k9Arr.length == 0) {
            return new NG(new C1347k9[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new C6(c1347k9Arr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(c1347k9Arr.length);
        for (C1347k9 c1347k9 : c1347k9Arr) {
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        ArrayList N = AbstractC0868ct.N(Arrays.copyOf(numArr, numArr.length));
        int length = c1347k9Arr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            C1347k9 c1347k92 = c1347k9Arr[i4];
            int i6 = i5 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                throw new IllegalArgumentException(AbstractC1888sN.h(size, "fromIndex (0) is greater than toIndex (", ")."));
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
            int i7 = size - 1;
            int i8 = 0;
            while (true) {
                if (i8 > i7) {
                    i2 = -(i8 + 1);
                    break;
                }
                i2 = (i8 + i7) >>> 1;
                int l2 = AbstractC1305jX.l((Comparable) arrayList.get(i2), c1347k92);
                if (l2 < 0) {
                    i8 = i2 + 1;
                } else if (l2 > 0) {
                    i7 = i2 - 1;
                }
            }
            N.set(i2, Integer.valueOf(i5));
            i4++;
            i5 = i6;
        }
        if (((C1347k9) arrayList.get(0)).b() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i9 = 0;
        while (i9 < arrayList.size()) {
            C1347k9 c1347k93 = (C1347k9) arrayList.get(i9);
            int i10 = i9 + 1;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                C1347k9 c1347k94 = (C1347k9) arrayList.get(i11);
                c1347k94.getClass();
                AbstractC0048Bt.n(c1347k93, "prefix");
                if (c1347k94.k(0, c1347k93, c1347k93.b())) {
                    if (c1347k94.b() == c1347k93.b()) {
                        throw new IllegalArgumentException(("duplicate option: " + c1347k94).toString());
                    }
                    if (((Number) N.get(i11)).intValue() > ((Number) N.get(i9)).intValue()) {
                        arrayList.remove(i11);
                        N.remove(i11);
                    } else {
                        i11++;
                    }
                }
            }
            i9 = i10;
        }
        G8 g8 = new G8();
        i(0L, g8, 0, arrayList, 0, arrayList.size(), N);
        int[] iArr = new int[(int) (g8.i / 4)];
        while (!g8.m()) {
            iArr[i3] = g8.readInt();
            i3++;
        }
        Object[] copyOf = Arrays.copyOf(c1347k9Arr, c1347k9Arr.length);
        AbstractC0048Bt.m(copyOf, "copyOf(...)");
        return new NG((C1347k9[]) copyOf, iArr);
    }

    public static InterfaceC1126go C(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            K(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1755qL.b);
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(4);
        String string3 = obtainAttributes.getString(5);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int integer = obtainAttributes.getInteger(2, 1);
        int integer2 = obtainAttributes.getInteger(3, ServiceStarter.ERROR_UNKNOWN);
        String string4 = obtainAttributes.getString(6);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                K(xmlResourceParser);
            }
            return new C1322jo(new C1216i8(string, string2, string3, D(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1755qL.c);
                    int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i3 = obtainAttributes2.hasValue(9) ? 9 : 3;
                    String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                    int i4 = obtainAttributes2.getInt(i3, 0);
                    int i5 = obtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                    String string6 = obtainAttributes2.getString(i5);
                    obtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        K(xmlResourceParser);
                    }
                    arrayList.add(new C1257io(i2, i4, resourceId2, string6, string5, z));
                } else {
                    K(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1192ho((C1257io[]) arrayList.toArray(new C1257io[0]));
    }

    public static List D(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (AbstractC1060fo.a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static R8 E(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C1197ht c1197ht = new C1197ht(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(c1197ht));
        Iterator it = c1197ht.iterator();
        while (((C1131gt) it).j) {
            ((C1131gt) it).nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
        int[] I0 = AbstractC0720ac.I0(arrayList);
        return new R8(Arrays.copyOf(I0, I0.length));
    }

    public static final boolean F(AbstractC1004ey abstractC1004ey) {
        InterfaceC2364zb c2 = abstractC1004ey.B0().c();
        if (c2 != null && AbstractC0306Ls.b(c2) && !AbstractC0192Hh.g((InterfaceC1245ib) c2).equals(AbstractC1499mT.g)) {
            return true;
        }
        InterfaceC2364zb c3 = abstractC1004ey.B0().c();
        InterfaceC1437lX interfaceC1437lX = c3 instanceof InterfaceC1437lX ? (InterfaceC1437lX) c3 : null;
        return interfaceC1437lX == null ? false : F(AbstractC0772bO.m(interfaceC1437lX));
    }

    public static final C0338My G(C1216i8 c1216i8, InterfaceC0489St interfaceC0489St) {
        AbstractC0048Bt.n(c1216i8, "<this>");
        AbstractC0048Bt.n(interfaceC0489St, "annotationsOwner");
        return new C0338My(c1216i8, interfaceC0489St, false);
    }

    public static final InterfaceC1245ib H(InterfaceC0761bD interfaceC0761bD, C2245xo c2245xo) {
        InterfaceC2364zb interfaceC2364zb;
        WB g0;
        AbstractC0048Bt.n(interfaceC0761bD, "<this>");
        AbstractC0048Bt.n(c2245xo, "fqName");
        if (!c2245xo.d()) {
            C1531mz c1531mz = ((C1465lz) interfaceC0761bD.S(c2245xo.e())).n;
            C0827cE f2 = c2245xo.f();
            AbstractC0048Bt.m(f2, "fqName.shortName()");
            DE de = DE.h;
            InterfaceC2364zb g2 = c1531mz.g(f2, de);
            InterfaceC1245ib interfaceC1245ib = g2 instanceof InterfaceC1245ib ? (InterfaceC1245ib) g2 : null;
            if (interfaceC1245ib != null) {
                return interfaceC1245ib;
            }
            InterfaceC1245ib H = H(interfaceC0761bD, c2245xo.e());
            if (H == null || (g0 = H.g0()) == null) {
                interfaceC2364zb = null;
            } else {
                C0827cE f3 = c2245xo.f();
                AbstractC0048Bt.m(f3, "fqName.shortName()");
                interfaceC2364zb = g0.g(f3, de);
            }
            if (interfaceC2364zb instanceof InterfaceC1245ib) {
                return (InterfaceC1245ib) interfaceC2364zb;
            }
        }
        return null;
    }

    public static final void I(Object obj, InterfaceC2235xe interfaceC2235xe) {
        if (!(interfaceC2235xe instanceof C0011Ai)) {
            interfaceC2235xe.resumeWith(obj);
            return;
        }
        C0011Ai c0011Ai = (C0011Ai) interfaceC2235xe;
        AbstractC0267Ke abstractC0267Ke = c0011Ai.k;
        Throwable a2 = C1428lO.a(obj);
        Object c0031Bc = a2 == null ? obj : new C0031Bc(a2, false);
        AbstractC2367ze abstractC2367ze = c0011Ai.l;
        if (abstractC0267Ke.M(abstractC2367ze.getContext())) {
            c0011Ai.m = c0031Bc;
            c0011Ai.j = 1;
            abstractC0267Ke.L(abstractC2367ze.getContext(), c0011Ai);
            return;
        }
        AbstractC0454Rk a3 = EV.a();
        if (a3.j >= 4294967296L) {
            c0011Ai.m = c0031Bc;
            c0011Ai.j = 1;
            a3.P(c0011Ai);
            return;
        }
        a3.R(true);
        try {
            InterfaceC0075Cu interfaceC0075Cu = (InterfaceC0075Cu) abstractC2367ze.getContext().k(C0460Rq.K);
            if (interfaceC0075Cu == null || interfaceC0075Cu.b()) {
                Object obj2 = c0011Ai.n;
                InterfaceC0189He context = abstractC2367ze.getContext();
                Object R0 = PX.R0(context, obj2);
                YX V = R0 != PX.l ? AbstractC0946e20.V(abstractC2367ze, context, R0) : null;
                try {
                    abstractC2367ze.resumeWith(obj);
                } finally {
                    if (V == null || V.d0()) {
                        PX.K0(context, R0);
                    }
                }
            } else {
                c0011Ai.resumeWith(AbstractC1494mO.d(interfaceC0075Cu.t()));
            }
            while (a3.T()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void J(InterfaceC0387Ov interfaceC0387Ov) {
        G9 m2;
        G9 o2;
        if (interfaceC0387Ov instanceof InterfaceC0077Cw) {
            InterfaceC0937dx interfaceC0937dx = (InterfaceC0937dx) interfaceC0387Ov;
            Field N = PX.N(interfaceC0937dx);
            if (N != null) {
                N.setAccessible(true);
            }
            Method O = PX.O(interfaceC0937dx.getGetter());
            if (O != null) {
                O.setAccessible(true);
            }
            Method O2 = PX.O(((InterfaceC0077Cw) interfaceC0387Ov).b());
            if (O2 == null) {
                return;
            }
            O2.setAccessible(true);
            return;
        }
        if (interfaceC0387Ov instanceof InterfaceC0937dx) {
            InterfaceC0937dx interfaceC0937dx2 = (InterfaceC0937dx) interfaceC0387Ov;
            Field N2 = PX.N(interfaceC0937dx2);
            if (N2 != null) {
                N2.setAccessible(true);
            }
            Method O3 = PX.O(interfaceC0937dx2.getGetter());
            if (O3 == null) {
                return;
            }
            O3.setAccessible(true);
            return;
        }
        if (interfaceC0387Ov instanceof InterfaceC0414Pw) {
            Field N3 = PX.N(((InterfaceC0414Pw) interfaceC0387Ov).i());
            if (N3 != null) {
                N3.setAccessible(true);
            }
            Method O4 = PX.O((InterfaceC1396kw) interfaceC0387Ov);
            if (O4 == null) {
                return;
            }
            O4.setAccessible(true);
            return;
        }
        if (interfaceC0387Ov instanceof InterfaceC1857rw) {
            Field N4 = PX.N(((InterfaceC1857rw) interfaceC0387Ov).i());
            if (N4 != null) {
                N4.setAccessible(true);
            }
            Method O5 = PX.O((InterfaceC1396kw) interfaceC0387Ov);
            if (O5 == null) {
                return;
            }
            O5.setAccessible(true);
            return;
        }
        if (!(interfaceC0387Ov instanceof InterfaceC1396kw)) {
            throw new UnsupportedOperationException("Unknown callable: " + interfaceC0387Ov + " (" + interfaceC0387Ov.getClass() + ')');
        }
        InterfaceC1396kw interfaceC1396kw = (InterfaceC1396kw) interfaceC0387Ov;
        Method O6 = PX.O(interfaceC1396kw);
        if (O6 != null) {
            O6.setAccessible(true);
        }
        AbstractC0491Sv a2 = JY.a(interfaceC0387Ov);
        Object b2 = (a2 == null || (o2 = a2.o()) == null) ? null : o2.b();
        AccessibleObject accessibleObject = b2 instanceof AccessibleObject ? (AccessibleObject) b2 : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        AbstractC0491Sv a3 = JY.a(interfaceC1396kw);
        Object b3 = (a3 == null || (m2 = a3.m()) == null) ? null : m2.b();
        Constructor constructor = b3 instanceof Constructor ? (Constructor) b3 : null;
        if (constructor == null) {
            return;
        }
        constructor.setAccessible(true);
    }

    public static void K(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static final int L(long j2) {
        C0369Od c0369Od;
        C2285yO c2285yO = C1640oc.c;
        int i2 = C1114gc.g;
        AbstractC1508mc abstractC1508mc = C1640oc.f[(int) (63 & j2)];
        int i3 = abstractC1508mc.c;
        int i4 = c2285yO.c;
        if ((i3 | i4) < 0) {
            c0369Od = AbstractC0048Bt.B(abstractC1508mc, c2285yO);
        } else {
            C2340zD c2340zD = AbstractC0395Pd.a;
            int i5 = i3 | (i4 << 6);
            Object e2 = c2340zD.e(i5);
            if (e2 == null) {
                e2 = AbstractC0048Bt.B(abstractC1508mc, c2285yO);
                c2340zD.h(i5, e2);
            }
            c0369Od = (C0369Od) e2;
        }
        return (int) (c0369Od.a(j2) >>> 32);
    }

    public static final String M(String str) {
        AbstractC0048Bt.n(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "builder.toString()");
        return sb2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x028d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void N(Context context, Executor executor, InterfaceC2346zJ interfaceC2346zJ, boolean z) {
        boolean z2;
        FileInputStream fileInputStream;
        ?? r7;
        C1778qi[] c1778qiArr;
        C1778qi[] c1778qiArr2;
        C1778qi[] c1778qiArr3;
        byte[] bArr;
        boolean z3;
        boolean z4;
        ?? r72;
        boolean z5;
        boolean z6;
        ByteArrayOutputStream byteArrayOutputStream;
        int i2;
        C1646oi c1646oi;
        FileInputStream a2;
        boolean z7;
        boolean z8;
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
                            z8 = readLong == packageInfo.lastUpdateTime;
                            if (z8) {
                                interfaceC2346zJ.j(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z8) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        FJ.c(context, false);
                        return;
                    }
                }
                z8 = false;
                if (z8) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = AbstractC0048Bt.d;
            int i3 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C1646oi c1646oi2 = new C1646oi(assets, executor, interfaceC2346zJ, name, file2);
            byte[] bArr3 = c1646oi2.c;
            if (bArr3 == null) {
                c1646oi2.b(3, Integer.valueOf(i3));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        z2 = true;
                        c1646oi2.b(4, null);
                    }
                } else if (!file2.canWrite()) {
                    c1646oi2.b(4, null);
                }
                c1646oi2.f = true;
                try {
                    try {
                        fileInputStream = c1646oi2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        interfaceC2346zJ.j(6, e2);
                        fileInputStream = null;
                        r7 = 8;
                        r72 = 8;
                        if (fileInputStream != null) {
                        }
                        c1778qiArr2 = c1646oi2.g;
                        if (c1778qiArr2 != null) {
                            if (i2 != 24) {
                                switch (i2) {
                                }
                            }
                            try {
                                a2 = c1646oi2.a(assets, "dexopt/baseline.profm");
                                if (a2 == null) {
                                }
                            } catch (FileNotFoundException e3) {
                                interfaceC2346zJ.j(9, e3);
                            } catch (IOException e4) {
                                interfaceC2346zJ.j(7, e4);
                            } catch (IllegalStateException e5) {
                                c1646oi2.g = null;
                                interfaceC2346zJ.j(8, e5);
                            }
                        }
                        InterfaceC2346zJ interfaceC2346zJ2 = c1646oi2.b;
                        c1778qiArr3 = c1646oi2.g;
                        byte[] bArr4 = c1646oi2.c;
                        if (c1778qiArr3 != null) {
                            if (c1646oi2.f) {
                            }
                        }
                        bArr = c1646oi2.h;
                        if (bArr == null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z7 = z5;
                        FJ.c(context, (z6 || !z) ? false : z7);
                    } catch (IOException e6) {
                        interfaceC2346zJ.j(7, e6);
                        fileInputStream = null;
                        r7 = 8;
                        r72 = 8;
                        if (fileInputStream != null) {
                        }
                        c1778qiArr2 = c1646oi2.g;
                        if (c1778qiArr2 != null) {
                        }
                        InterfaceC2346zJ interfaceC2346zJ22 = c1646oi2.b;
                        c1778qiArr3 = c1646oi2.g;
                        byte[] bArr42 = c1646oi2.c;
                        if (c1778qiArr3 != null) {
                        }
                        bArr = c1646oi2.h;
                        if (bArr == null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z7 = z5;
                        FJ.c(context, (z6 || !z) ? false : z7);
                    }
                    if (fileInputStream != null) {
                        try {
                        } catch (IOException e7) {
                            interfaceC2346zJ.j(7, e7);
                            try {
                                fileInputStream.close();
                            } catch (IOException e8) {
                                interfaceC2346zJ.j(7, e8);
                            }
                            c1778qiArr = null;
                            c1646oi2.g = c1778qiArr;
                            c1778qiArr2 = c1646oi2.g;
                            if (c1778qiArr2 != null) {
                            }
                            InterfaceC2346zJ interfaceC2346zJ222 = c1646oi2.b;
                            c1778qiArr3 = c1646oi2.g;
                            byte[] bArr422 = c1646oi2.c;
                            if (c1778qiArr3 != null) {
                            }
                            bArr = c1646oi2.h;
                            if (bArr == null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z7 = z5;
                            FJ.c(context, (z6 || !z) ? false : z7);
                        } catch (IllegalStateException e9) {
                            interfaceC2346zJ.j(8, e9);
                            fileInputStream.close();
                            c1778qiArr = null;
                            c1646oi2.g = c1778qiArr;
                            c1778qiArr2 = c1646oi2.g;
                            if (c1778qiArr2 != null) {
                            }
                            InterfaceC2346zJ interfaceC2346zJ2222 = c1646oi2.b;
                            c1778qiArr3 = c1646oi2.g;
                            byte[] bArr4222 = c1646oi2.c;
                            if (c1778qiArr3 != null) {
                            }
                            bArr = c1646oi2.h;
                            if (bArr == null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z7 = z5;
                            FJ.c(context, (z6 || !z) ? false : z7);
                        }
                        if (!Arrays.equals(bArr2, EB.P(fileInputStream, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        c1778qiArr = AbstractC0048Bt.W(fileInputStream, EB.P(fileInputStream, 4), c1646oi2.e);
                        try {
                            fileInputStream.close();
                        } catch (IOException e10) {
                            interfaceC2346zJ.j(7, e10);
                        }
                        c1646oi2.g = c1778qiArr;
                    }
                    c1778qiArr2 = c1646oi2.g;
                    if (c1778qiArr2 != null && (i2 = Build.VERSION.SDK_INT) <= 34) {
                        if (i2 != 24 && i2 != 25) {
                            switch (i2) {
                            }
                        }
                        a2 = c1646oi2.a(assets, "dexopt/baseline.profm");
                        if (a2 == null) {
                            try {
                                if (!Arrays.equals(AbstractC0048Bt.e, EB.P(a2, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                c1646oi2.g = AbstractC0048Bt.T(a2, EB.P(a2, 4), bArr3, c1778qiArr2);
                                a2.close();
                                c1646oi = c1646oi2;
                                if (c1646oi != null) {
                                    c1646oi2 = c1646oi;
                                }
                            } finally {
                            }
                        } else {
                            if (a2 != null) {
                                a2.close();
                            }
                            c1646oi = null;
                            if (c1646oi != null) {
                            }
                        }
                    }
                    InterfaceC2346zJ interfaceC2346zJ22222 = c1646oi2.b;
                    c1778qiArr3 = c1646oi2.g;
                    byte[] bArr42222 = c1646oi2.c;
                    if (c1778qiArr3 != null && bArr42222 != null) {
                        if (c1646oi2.f) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(bArr2);
                                byteArrayOutputStream.write(bArr42222);
                            } finally {
                            }
                        } catch (IOException e11) {
                            interfaceC2346zJ22222.j(7, e11);
                        } catch (IllegalStateException e12) {
                            interfaceC2346zJ22222.j(8, e12);
                        }
                        if (AbstractC0048Bt.l0(byteArrayOutputStream, bArr42222, c1778qiArr3)) {
                            c1646oi2.h = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            c1646oi2.g = null;
                        } else {
                            interfaceC2346zJ22222.j(5, null);
                            c1646oi2.g = null;
                            byteArrayOutputStream.close();
                        }
                    }
                    bArr = c1646oi2.h;
                    if (bArr == null) {
                        z4 = false;
                        z5 = true;
                    } else {
                        try {
                            if (!c1646oi2.f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(c1646oi2.d);
                                        try {
                                            try {
                                                byte[] bArr5 = new byte[512];
                                                while (true) {
                                                    int read = byteArrayInputStream.read(bArr5);
                                                    if (read > 0) {
                                                        fileOutputStream.write(bArr5, 0, read);
                                                    } else {
                                                        z5 = true;
                                                        try {
                                                            c1646oi2.b(1, null);
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            c1646oi2.h = null;
                                                            c1646oi2.g = null;
                                                            z4 = true;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            Throwable th2 = th;
                                                            try {
                                                                fileOutputStream.close();
                                                                throw th2;
                                                            } catch (Throwable th3) {
                                                                th2.addSuppressed(th3);
                                                                throw th2;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                Throwable th5 = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th5;
                                                } catch (Throwable th6) {
                                                    th5.addSuppressed(th6);
                                                    throw th5;
                                                }
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                } catch (FileNotFoundException e13) {
                                    e = e13;
                                    r72 = 1;
                                    c1646oi2.b(6, e);
                                    z3 = r72;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z7 = z5;
                                    FJ.c(context, (z6 || !z) ? false : z7);
                                } catch (IOException e14) {
                                    e = e14;
                                    r7 = 1;
                                    c1646oi2.b(7, e);
                                    z3 = r7;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z7 = z5;
                                    FJ.c(context, (z6 || !z) ? false : z7);
                                }
                            } catch (FileNotFoundException e15) {
                                e = e15;
                                c1646oi2.b(6, e);
                                z3 = r72;
                                z4 = false;
                                z5 = z3;
                                if (z4) {
                                }
                                z6 = z4;
                                z7 = z5;
                                FJ.c(context, (z6 || !z) ? false : z7);
                            } catch (IOException e16) {
                                e = e16;
                                c1646oi2.b(7, e);
                                z3 = r7;
                                z4 = false;
                                z5 = z3;
                                if (z4) {
                                }
                                z6 = z4;
                                z7 = z5;
                                FJ.c(context, (z6 || !z) ? false : z7);
                            }
                        } finally {
                            c1646oi2.h = null;
                            c1646oi2.g = null;
                        }
                    }
                    if (z4) {
                        A(packageInfo, filesDir);
                    }
                    z6 = z4;
                    z7 = z5;
                    FJ.c(context, (z6 || !z) ? false : z7);
                } finally {
                }
                r7 = 8;
                r72 = 8;
            }
            z2 = true;
            z6 = false;
            z7 = z2;
            FJ.c(context, (z6 || !z) ? false : z7);
        } catch (PackageManager.NameNotFoundException e17) {
            interfaceC2346zJ.j(7, e17);
            FJ.c(context, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(float f2, float f3, float f4, float f5, AbstractC1508mc abstractC1508mc) {
        int i2;
        int i3;
        int i4;
        float b2;
        float a2;
        int i5;
        int i6;
        int i7;
        int i8;
        float b3;
        float a3;
        int i9;
        int i10;
        int i11;
        if (abstractC1508mc.c()) {
            float f6 = f5 < 0.0f ? 0.0f : f5;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i12 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f2 < 0.0f ? 0.0f : f2;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f3 < 0.0f ? 0.0f : f3;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i14 = i13 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            long j2 = (i14 | ((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 255.0f) + 0.5f))) << 32;
            int i15 = C1114gc.g;
            return j2;
        }
        long j3 = abstractC1508mc.b;
        int i16 = AbstractC1310jc.e;
        if (((int) (j3 >> 32)) != 3) {
            throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
        }
        int i17 = abstractC1508mc.c;
        if (i17 == -1) {
            throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
        }
        float b4 = abstractC1508mc.b(0);
        float a4 = abstractC1508mc.a(0);
        if (f2 >= b4) {
            b4 = f2;
        }
        if (b4 <= a4) {
            a4 = b4;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(a4);
        int i18 = floatToRawIntBits >>> 31;
        int i19 = (floatToRawIntBits >>> 23) & 255;
        int i20 = floatToRawIntBits & 8388607;
        if (i19 == 255) {
            i3 = i20 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i19 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else if (i2 > 0) {
                int i21 = i20 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i4 = (((i2 << 10) | i21) + 1) | (i18 << 15);
                    short s = (short) i4;
                    b2 = abstractC1508mc.b(1);
                    a2 = abstractC1508mc.a(1);
                    if (f3 >= b2) {
                        b2 = f3;
                    }
                    if (b2 <= a2) {
                        a2 = b2;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(a2);
                    int i22 = floatToRawIntBits2 >>> 31;
                    i5 = (floatToRawIntBits2 >>> 23) & 255;
                    int i23 = floatToRawIntBits2 & 8388607;
                    if (i5 != 255) {
                        i7 = i23 != 0 ? 512 : 0;
                        i6 = 31;
                    } else {
                        i6 = i5 - 112;
                        if (i6 >= 31) {
                            i7 = 0;
                            i6 = 49;
                        } else if (i6 > 0) {
                            int i24 = i23 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i8 = (((i6 << 10) | i24) + 1) | (i22 << 15);
                                short s2 = (short) i8;
                                b3 = abstractC1508mc.b(2);
                                a3 = abstractC1508mc.a(2);
                                if (f4 >= b3) {
                                    b3 = f4;
                                }
                                if (b3 <= a3) {
                                    a3 = b3;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(a3);
                                int i25 = floatToRawIntBits3 >>> 31;
                                i9 = (floatToRawIntBits3 >>> 23) & 255;
                                int i26 = 8388607 & floatToRawIntBits3;
                                if (i9 == 255) {
                                    i10 = i26 != 0 ? 512 : 0;
                                    r7 = 31;
                                } else {
                                    int i27 = i9 - 112;
                                    if (i27 >= 31) {
                                        i10 = 0;
                                        r7 = 49;
                                    } else if (i27 > 0) {
                                        int i28 = i26 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i11 = (((i27 << 10) | i28) + 1) | (i25 << 15);
                                            long j4 = (i17 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            int i29 = C1114gc.g;
                                            return j4;
                                        }
                                        i10 = i28;
                                        r7 = i27;
                                    } else if (i27 >= -10) {
                                        int i30 = (i26 | 8388608) >> (1 - i27);
                                        if ((i30 & 4096) != 0) {
                                            i30 += 8192;
                                        }
                                        i10 = i30 >> 13;
                                    } else {
                                        i10 = 0;
                                    }
                                }
                                i11 = i10 | (i25 << 15) | (r7 << 10);
                                if (f5 >= 0.0f) {
                                }
                                long j42 = (i17 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                int i292 = C1114gc.g;
                                return j42;
                            }
                            i7 = i24;
                        } else if (i6 >= -10) {
                            int i31 = (i23 | 8388608) >> (1 - i6);
                            if ((i31 & 4096) != 0) {
                                i31 += 8192;
                            }
                            i7 = i31 >> 13;
                            i6 = 0;
                        } else {
                            i7 = 0;
                            i6 = 0;
                        }
                    }
                    i8 = i7 | (i22 << 15) | (i6 << 10);
                    short s22 = (short) i8;
                    b3 = abstractC1508mc.b(2);
                    a3 = abstractC1508mc.a(2);
                    if (f4 >= b3) {
                    }
                    if (b3 <= a3) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(a3);
                    int i252 = floatToRawIntBits32 >>> 31;
                    i9 = (floatToRawIntBits32 >>> 23) & 255;
                    int i262 = 8388607 & floatToRawIntBits32;
                    if (i9 == 255) {
                    }
                    i11 = i10 | (i252 << 15) | (r7 << 10);
                    if (f5 >= 0.0f) {
                    }
                    long j422 = (i17 & 63) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    int i2922 = C1114gc.g;
                    return j422;
                }
                i3 = i21;
            } else if (i2 >= -10) {
                int i32 = (i20 | 8388608) >> (1 - i2);
                if ((i32 & 4096) != 0) {
                    i32 += 8192;
                }
                i3 = i32 >> 13;
                i2 = 0;
            } else {
                i3 = 0;
                i2 = 0;
            }
        }
        i4 = i3 | (i18 << 15) | (i2 << 10);
        short s3 = (short) i4;
        b2 = abstractC1508mc.b(1);
        a2 = abstractC1508mc.a(1);
        if (f3 >= b2) {
        }
        if (b2 <= a2) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(a2);
        int i222 = floatToRawIntBits22 >>> 31;
        i5 = (floatToRawIntBits22 >>> 23) & 255;
        int i232 = floatToRawIntBits22 & 8388607;
        if (i5 != 255) {
        }
        i8 = i7 | (i222 << 15) | (i6 << 10);
        short s222 = (short) i8;
        b3 = abstractC1508mc.b(2);
        a3 = abstractC1508mc.a(2);
        if (f4 >= b3) {
        }
        if (b3 <= a3) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(a3);
        int i2522 = floatToRawIntBits322 >>> 31;
        i9 = (floatToRawIntBits322 >>> 23) & 255;
        int i2622 = 8388607 & floatToRawIntBits322;
        if (i9 == 255) {
        }
        i11 = i10 | (i2522 << 15) | (r7 << 10);
        if (f5 >= 0.0f) {
        }
        long j4222 = (i17 & 63) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        int i29222 = C1114gc.g;
        return j4222;
    }

    public static final long b(int i2) {
        long j2 = i2 << 32;
        int i3 = C1114gc.g;
        return j2;
    }

    public static final long c(long j2) {
        long j3 = j2 << 32;
        int i2 = C1114gc.g;
        return j3;
    }

    public static long d(int i2, int i3, int i4) {
        return b(((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static final C1032fM e(long j2, long j3) {
        return new C1032fM(BF.b(j2), BF.c(j2), ZR.b(j3) + BF.b(j2), ZR.a(j3) + BF.c(j2));
    }

    public static final TC f(InterfaceC0725ah interfaceC0725ah, int i2) {
        TC tc = ((TC) interfaceC0725ah).b.f;
        if (tc == null || (tc.d & i2) == 0) {
            return null;
        }
        while (tc != null) {
            int i3 = tc.c;
            if ((i3 & 2) != 0) {
                return null;
            }
            if ((i3 & i2) != 0) {
                return tc;
            }
            tc = tc.f;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(InterfaceC2214xJ interfaceC2214xJ, InterfaceC1455lp interfaceC1455lp, AbstractC2367ze abstractC2367ze) {
        C2016uJ c2016uJ;
        int i2;
        try {
            if (abstractC2367ze instanceof C2016uJ) {
                c2016uJ = (C2016uJ) abstractC2367ze;
                int i3 = c2016uJ.j;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c2016uJ.j = i3 - Integer.MIN_VALUE;
                    Object obj = c2016uJ.i;
                    i2 = c2016uJ.j;
                    if (i2 != 0) {
                        AbstractC1494mO.l(obj);
                        if (c2016uJ.getContext().k(C0460Rq.K) != interfaceC2214xJ) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        c2016uJ.h = (AbstractC1596ny) interfaceC1455lp;
                        c2016uJ.j = 1;
                        C0849ca c0849ca = new C0849ca(1, AbstractC1473m3.L(c2016uJ));
                        c0849ca.r();
                        ((C2148wJ) interfaceC2214xJ).d0(new C1466m(3, c0849ca));
                        Object q = c0849ca.q();
                        EnumC0448Re enumC0448Re = EnumC0448Re.h;
                        interfaceC1455lp = interfaceC1455lp;
                        if (q == enumC0448Re) {
                            return enumC0448Re;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC1455lp interfaceC1455lp2 = (InterfaceC1455lp) c2016uJ.h;
                        AbstractC1494mO.l(obj);
                        interfaceC1455lp = interfaceC1455lp2;
                    }
                    interfaceC1455lp.invoke();
                    return C0782bY.a;
                }
            }
            if (i2 != 0) {
            }
            interfaceC1455lp.invoke();
            return C0782bY.a;
        } catch (Throwable th) {
            interfaceC1455lp.invoke();
            throw th;
        }
        c2016uJ = new C2016uJ(abstractC2367ze);
        Object obj2 = c2016uJ.i;
        i2 = c2016uJ.j;
    }

    public static InterfaceC2243xm h(InterfaceC2243xm interfaceC2243xm, int i2) {
        H8 h8;
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            throw new IllegalArgumentException(AbstractC2188wx.g(i2, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i2 == -1) {
            i2 = 0;
            h8 = H8.i;
        } else {
            h8 = H8.h;
        }
        return interfaceC2243xm instanceof InterfaceC0589Wp ? AbstractC1473m3.y((InterfaceC0589Wp) interfaceC2243xm, null, i2, h8, 1) : new C0159Ga(i2, h8, C1188hk.h, interfaceC2243xm);
    }

    public static void i(long j2, G8 g8, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        int i5;
        int i6;
        ArrayList arrayList3;
        long j3;
        int i7;
        int i8 = i2;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i3 >= i4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i9 = i3; i9 < i4; i9++) {
            if (((C1347k9) arrayList4.get(i9)).b() < i8) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C1347k9 c1347k9 = (C1347k9) arrayList.get(i3);
        C1347k9 c1347k92 = (C1347k9) arrayList4.get(i4 - 1);
        if (i8 == c1347k9.b()) {
            int intValue = ((Number) arrayList5.get(i3)).intValue();
            int i10 = i3 + 1;
            C1347k9 c1347k93 = (C1347k9) arrayList4.get(i10);
            i5 = i10;
            i6 = intValue;
            c1347k9 = c1347k93;
        } else {
            i5 = i3;
            i6 = -1;
        }
        if (c1347k9.g(i8) == c1347k92.g(i8)) {
            int min = Math.min(c1347k9.b(), c1347k92.b());
            int i11 = 0;
            for (int i12 = i8; i12 < min && c1347k9.g(i12) == c1347k92.g(i12); i12++) {
                i11++;
            }
            long j4 = 4;
            long j5 = (g8.i / j4) + j2 + 2 + i11 + 1;
            g8.Q(-i11);
            g8.Q(i6);
            int i13 = i8 + i11;
            while (i8 < i13) {
                g8.Q(c1347k9.g(i8) & 255);
                i8++;
            }
            if (i5 + 1 == i4) {
                if (i13 != ((C1347k9) arrayList4.get(i5)).b()) {
                    throw new IllegalStateException("Check failed.");
                }
                g8.Q(((Number) arrayList5.get(i5)).intValue());
                return;
            } else {
                G8 g82 = new G8();
                g8.Q(((int) ((g82.i / j4) + j5)) * (-1));
                i(j5, g82, i13, arrayList4, i5, i4, arrayList5);
                g8.E(g82);
                return;
            }
        }
        int i14 = 1;
        for (int i15 = i5 + 1; i15 < i4; i15++) {
            if (((C1347k9) arrayList4.get(i15 - 1)).g(i8) != ((C1347k9) arrayList4.get(i15)).g(i8)) {
                i14++;
            }
        }
        long j6 = 4;
        long j7 = (g8.i / j6) + j2 + 2 + (i14 * 2);
        g8.Q(i14);
        g8.Q(i6);
        for (int i16 = i5; i16 < i4; i16++) {
            int g2 = ((C1347k9) arrayList4.get(i16)).g(i8);
            if (i16 == i5 || g2 != ((C1347k9) arrayList4.get(i16 - 1)).g(i8)) {
                g8.Q(g2 & 255);
            }
        }
        G8 g83 = new G8();
        int i17 = i5;
        while (i17 < i4) {
            byte g3 = ((C1347k9) arrayList4.get(i17)).g(i8);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i4) {
                    i19 = i4;
                    break;
                } else if (g3 != ((C1347k9) arrayList4.get(i19)).g(i8)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i8 + 1 == ((C1347k9) arrayList4.get(i17)).b()) {
                g8.Q(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j3 = j7;
                i7 = i19;
            } else {
                g8.Q(((int) ((g83.i / j6) + j7)) * (-1));
                arrayList3 = arrayList5;
                j3 = j7;
                i7 = i19;
                i(j3, g83, i8 + 1, arrayList, i17, i7, arrayList3);
                arrayList4 = arrayList;
            }
            j7 = j3;
            i17 = i7;
            arrayList5 = arrayList3;
        }
        g8.E(g83);
    }

    public static final C9 j(InterfaceC2312yp interfaceC2312yp) {
        return new C9(interfaceC2312yp, C1188hk.h, -2, H8.h);
    }

    public static final String k(String str) {
        AbstractC0048Bt.n(str, "<this>");
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' > charAt || charAt >= '{') {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        AbstractC0048Bt.m(substring, "this as java.lang.String).substring(startIndex)");
        return upperCase + substring;
    }

    public static Object l(List list, InterfaceC0920df interfaceC0920df, AbstractC0868ct abstractC0868ct) {
        Y1 y1 = new Y1(17);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n(it.next(), interfaceC0920df, y1, abstractC0868ct);
        }
        return abstractC0868ct.R();
    }

    public static final InterfaceC2243xm m(InterfaceC2243xm interfaceC2243xm) {
        if (interfaceC2243xm instanceof CT) {
            return interfaceC2243xm;
        }
        if (!(interfaceC2243xm instanceof C0452Ri)) {
            return new C0452Ri(interfaceC2243xm);
        }
        ((C0452Ri) interfaceC2243xm).getClass();
        return interfaceC2243xm;
    }

    public static void n(Object obj, InterfaceC0920df interfaceC0920df, Y1 y1, AbstractC0868ct abstractC0868ct) {
        if (obj != null) {
            if (((HashSet) y1.i).add(obj) && abstractC0868ct.h(obj)) {
                Iterator it = interfaceC0920df.e(obj).iterator();
                while (it.hasNext()) {
                    n(it.next(), interfaceC0920df, y1, abstractC0868ct);
                }
                abstractC0868ct.e(obj);
                return;
            }
            return;
        }
        Object[] objArr = new Object[3];
        switch (22) {
            case 1:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (22) {
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(InterfaceC2243xm interfaceC2243xm, AbstractC2367ze abstractC2367ze) {
        C0404Pm c0404Pm;
        int i2;
        C1360kM c1360kM;
        C0940e e2;
        D9 d9;
        Object obj;
        C0457Rn c0457Rn = AbstractC1052fg.e;
        if (abstractC2367ze instanceof C0404Pm) {
            c0404Pm = (C0404Pm) abstractC2367ze;
            int i3 = c0404Pm.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0404Pm.k = i3 - Integer.MIN_VALUE;
                Object obj2 = c0404Pm.j;
                i2 = c0404Pm.k;
                if (i2 != 0) {
                    AbstractC1494mO.l(obj2);
                    C1360kM c1360kM2 = new C1360kM();
                    c1360kM2.h = c0457Rn;
                    D9 d92 = new D9(3, c1360kM2);
                    try {
                        c0404Pm.h = c1360kM2;
                        c0404Pm.i = d92;
                        c0404Pm.k = 1;
                        Object collect = interfaceC2243xm.collect(d92, c0404Pm);
                        Object obj3 = EnumC0448Re.h;
                        if (collect == obj3) {
                            return obj3;
                        }
                        c1360kM = c1360kM2;
                    } catch (C0940e e3) {
                        c1360kM = c1360kM2;
                        e2 = e3;
                        d9 = d92;
                        if (e2.h != d9) {
                            throw e2;
                        }
                        obj = c1360kM.h;
                        if (obj == c0457Rn) {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d9 = c0404Pm.i;
                    c1360kM = c0404Pm.h;
                    try {
                        AbstractC1494mO.l(obj2);
                    } catch (C0940e e4) {
                        e2 = e4;
                        if (e2.h != d9) {
                        }
                        obj = c1360kM.h;
                        if (obj == c0457Rn) {
                        }
                    }
                }
                obj = c1360kM.h;
                if (obj == c0457Rn) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        c0404Pm = new C0404Pm(abstractC2367ze);
        Object obj22 = c0404Pm.j;
        i2 = c0404Pm.k;
        if (i2 != 0) {
        }
        obj = c1360kM.h;
        if (obj == c0457Rn) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(InterfaceC2243xm interfaceC2243xm, InterfaceC2312yp interfaceC2312yp, AbstractC2367ze abstractC2367ze) {
        C0430Qm c0430Qm;
        int i2;
        InterfaceC2312yp interfaceC2312yp2;
        C1360kM c1360kM;
        C0940e e2;
        C0426Qi c0426Qi;
        Object obj;
        C0457Rn c0457Rn = AbstractC1052fg.e;
        if (abstractC2367ze instanceof C0430Qm) {
            c0430Qm = (C0430Qm) abstractC2367ze;
            int i3 = c0430Qm.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0430Qm.l = i3 - Integer.MIN_VALUE;
                Object obj2 = c0430Qm.k;
                i2 = c0430Qm.l;
                if (i2 != 0) {
                    AbstractC1494mO.l(obj2);
                    C1360kM c1360kM2 = new C1360kM();
                    c1360kM2.h = c0457Rn;
                    C0426Qi c0426Qi2 = new C0426Qi(interfaceC2312yp, c1360kM2);
                    try {
                        c0430Qm.h = (AbstractC2225xU) interfaceC2312yp;
                        c0430Qm.i = c1360kM2;
                        c0430Qm.j = c0426Qi2;
                        c0430Qm.l = 1;
                        Object collect = interfaceC2243xm.collect(c0426Qi2, c0430Qm);
                        Object obj3 = EnumC0448Re.h;
                        if (collect == obj3) {
                            return obj3;
                        }
                        interfaceC2312yp2 = interfaceC2312yp;
                        c1360kM = c1360kM2;
                    } catch (C0940e e3) {
                        interfaceC2312yp2 = interfaceC2312yp;
                        c1360kM = c1360kM2;
                        e2 = e3;
                        c0426Qi = c0426Qi2;
                        if (e2.h != c0426Qi) {
                            throw e2;
                        }
                        obj = c1360kM.h;
                        if (obj == c0457Rn) {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0426Qi = c0430Qm.j;
                    c1360kM = c0430Qm.i;
                    interfaceC2312yp2 = (InterfaceC2312yp) c0430Qm.h;
                    try {
                        AbstractC1494mO.l(obj2);
                    } catch (C0940e e4) {
                        e2 = e4;
                        if (e2.h != c0426Qi) {
                        }
                        obj = c1360kM.h;
                        if (obj == c0457Rn) {
                        }
                    }
                }
                obj = c1360kM.h;
                if (obj == c0457Rn) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + interfaceC2312yp2);
            }
        }
        c0430Qm = new C0430Qm(abstractC2367ze);
        Object obj22 = c0430Qm.k;
        i2 = c0430Qm.l;
        if (i2 != 0) {
        }
        obj = c1360kM.h;
        if (obj == c0457Rn) {
        }
    }

    public static final HashSet q(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set f2 = ((WB) it.next()).f();
            if (f2 == null) {
                return null;
            }
            AbstractC1048fc.f0(hashSet, f2);
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1457lr r(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = C1318jk.h;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        C0850cb i0 = C0850cb.b.i0(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        TV d2 = AbstractC1035fP.d(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = HY.j(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = HY.j(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new C1457lr(d2, i0, list2, new C1139h0(11, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new C1457lr(d2, i0, list2, new C1139h0(11, list));
    }

    public static Set s() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final AbstractC1547nB t(AbstractC1547nB abstractC1547nB) {
        C0027Ay c0027Ay = abstractC1547nB.l.l;
        while (true) {
            C0027Ay l2 = c0027Ay.l();
            C0027Ay c0027Ay2 = null;
            if ((l2 != null ? l2.d : null) == null) {
                AbstractC1547nB f0 = ((ME) c0027Ay.u.d).f0();
                AbstractC0048Bt.k(f0);
                return f0;
            }
            C0027Ay l3 = c0027Ay.l();
            if (l3 != null) {
                c0027Ay2 = l3.d;
            }
            AbstractC0048Bt.k(c0027Ay2);
            C0027Ay l4 = c0027Ay.l();
            AbstractC0048Bt.k(l4);
            c0027Ay = l4.d;
            AbstractC0048Bt.k(c0027Ay);
        }
    }

    public static final InterfaceC2364zb u(InterfaceC1118gg interfaceC1118gg) {
        AbstractC0048Bt.n(interfaceC1118gg, "<this>");
        InterfaceC1118gg n2 = interfaceC1118gg.n();
        if (n2 == null || (interfaceC1118gg instanceof InterfaceC0961eH)) {
            return null;
        }
        if (!(n2.n() instanceof InterfaceC0961eH)) {
            return u(n2);
        }
        if (n2 instanceof InterfaceC2364zb) {
            return (InterfaceC2364zb) n2;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public static Boolean v(List list, InterfaceC0920df interfaceC0920df, InterfaceC2114vp interfaceC2114vp) {
        return (Boolean) l(list, interfaceC0920df, new C0854cf(interfaceC2114vp, new boolean[1], 0));
    }

    public static String w(InterfaceC0496Ta interfaceC0496Ta, C0934du c0934du) {
        if (interfaceC0496Ta.d(c0934du)) {
            return null;
        }
        return interfaceC0496Ta.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean x(AbstractC1397kx abstractC1397kx) {
        AbstractC0048Bt.n(abstractC1397kx, "<this>");
        if (abstractC1397kx instanceof InterfaceC0077Cw) {
            Field N = PX.N(abstractC1397kx);
            if (!(N != null ? N.isAccessible() : true)) {
                return false;
            }
            Method O = PX.O(abstractC1397kx.getGetter());
            if (!(O != null ? O.isAccessible() : true)) {
                return false;
            }
            Method O2 = PX.O(((InterfaceC0077Cw) abstractC1397kx).b());
            if (!(O2 != null ? O2.isAccessible() : true)) {
                return false;
            }
        } else {
            Field N2 = PX.N(abstractC1397kx);
            if (!(N2 != null ? N2.isAccessible() : true)) {
                return false;
            }
            Method O3 = PX.O(abstractC1397kx.getGetter());
            if (!(O3 != null ? O3.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static boolean y(Context context) {
        Bundle bundle;
        Context applicationContext = context.getApplicationContext();
        try {
            bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("ContentSizingFlag", "Could not get metadata");
            bundle = null;
        }
        if (bundle != null) {
            return bundle.getBoolean("io.flutter.embedding.android.EnableContentSizing", false);
        }
        return false;
    }

    public static final boolean z(int i2, String str) {
        char charAt = str.charAt(i2);
        return 'A' <= charAt && charAt < '[';
    }
}
