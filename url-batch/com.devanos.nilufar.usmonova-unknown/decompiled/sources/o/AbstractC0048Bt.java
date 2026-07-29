package o;

import android.os.Binder;
import android.os.Parcelable;
import android.text.InputFilter;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;

/* renamed from: o.Bt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0048Bt {
    public static final Object[] a = new Object[0];
    public static final Class[] b = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final C0457Rn c = new C0457Rn("InvalidModuleNotifier", 4);
    public static final byte[] d = {112, 114, 111, 0};
    public static final byte[] e = {112, 114, 109, 0};
    public static final C1432lS f = new C1432lS(2);
    public static final C1170hS g = new C1170hS(1);

    public static byte[] A(C1778qi[] c1778qiArr, byte[] bArr) {
        int i = 0;
        for (C1778qi c1778qi : c1778qiArr) {
            i += ((((c1778qi.g * 2) + 7) & (-8)) / 8) + (c1778qi.e * 2) + F(c1778qi.a, c1778qi.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c1778qi.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        if (Arrays.equals(bArr, EB.q)) {
            for (C1778qi c1778qi2 : c1778qiArr) {
                m0(byteArrayOutputStream, c1778qi2, F(c1778qi2.a, c1778qi2.b, bArr));
                o0(byteArrayOutputStream, c1778qi2);
                int[] iArr = c1778qi2.h;
                int length = iArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = iArr[i2];
                    EB.b0(byteArrayOutputStream, i4 - i3);
                    i2++;
                    i3 = i4;
                }
                n0(byteArrayOutputStream, c1778qi2);
            }
        } else {
            for (C1778qi c1778qi3 : c1778qiArr) {
                m0(byteArrayOutputStream, c1778qi3, F(c1778qi3.a, c1778qi3.b, bArr));
            }
            for (C1778qi c1778qi4 : c1778qiArr) {
                o0(byteArrayOutputStream, c1778qi4);
                int[] iArr2 = c1778qi4.h;
                int length2 = iArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length2) {
                    int i7 = iArr2[i5];
                    EB.b0(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                n0(byteArrayOutputStream, c1778qi4);
            }
        }
        if (byteArrayOutputStream.size() == i) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i);
    }

    public static final C0369Od B(AbstractC1508mc abstractC1508mc, AbstractC1508mc abstractC1508mc2) {
        if (abstractC1508mc == abstractC1508mc2) {
            return new C0317Md(abstractC1508mc, abstractC1508mc, 1);
        }
        long j = abstractC1508mc.b;
        long j2 = AbstractC1310jc.a;
        return (AbstractC1310jc.a(j, j2) && AbstractC1310jc.a(abstractC1508mc2.b, j2)) ? new C0343Nd((C2285yO) abstractC1508mc, (C2285yO) abstractC1508mc2) : new C0369Od(abstractC1508mc, abstractC1508mc2, 0);
    }

    public static final C1697pT C(InterfaceC1245ib interfaceC1245ib, InterfaceC1245ib interfaceC1245ib2) {
        n(interfaceC1245ib, Constants.MessagePayloadKeys.FROM);
        n(interfaceC1245ib2, "to");
        interfaceC1245ib.p().size();
        interfaceC1245ib2.p().size();
        List p = interfaceC1245ib.p();
        m(p, "from.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(p));
        Iterator it = p.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC1437lX) it.next()).z());
        }
        List p2 = interfaceC1245ib2.p();
        m(p2, "to.declaredTypeParameters");
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(p2));
        Iterator it2 = p2.iterator();
        while (it2.hasNext()) {
            JR i = ((InterfaceC1437lX) it2.next()).i();
            m(i, "it.defaultType");
            arrayList2.add(AbstractC0772bO.a(i));
        }
        return new C1697pT(1, EB.V(AbstractC0720ac.O0(arrayList, arrayList2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r1.emit(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005d, B:20:0x0071, B:22:0x0079, B:32:0x0048, B:35:0x0053), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r8v5, types: [o.TL] */
    /* JADX WARN: Type inference failed for: r8v7, types: [o.TL] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008b -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D(InterfaceC2309ym interfaceC2309ym, C2148wJ c2148wJ, boolean z, AbstractC2367ze abstractC2367ze) {
        C0093Dm c0093Dm;
        int i;
        I8 i8;
        C2148wJ c2148wJ2;
        I8 i82;
        InterfaceC2309ym interfaceC2309ym2;
        try {
            if (abstractC2367ze instanceof C0093Dm) {
                c0093Dm = (C0093Dm) abstractC2367ze;
                int i2 = c0093Dm.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0093Dm.m = i2 - Integer.MIN_VALUE;
                    Object obj = c0093Dm.l;
                    i = c0093Dm.m;
                    CancellationException cancellationException = null;
                    EnumC0448Re enumC0448Re = EnumC0448Re.h;
                    if (i != 0) {
                        AbstractC1494mO.l(obj);
                        if (interfaceC2309ym instanceof JV) {
                            throw ((JV) interfaceC2309ym).h;
                        }
                        J8 j8 = c2148wJ.k;
                        j8.getClass();
                        i8 = new I8(j8);
                        c2148wJ = c2148wJ;
                        c0093Dm.h = interfaceC2309ym;
                        c0093Dm.i = c2148wJ;
                        c0093Dm.j = i8;
                        c0093Dm.k = z;
                        c0093Dm.m = 1;
                        obj = i8.b(c0093Dm);
                        if (obj != enumC0448Re) {
                        }
                    } else if (i == 1) {
                        z = c0093Dm.k;
                        i82 = c0093Dm.j;
                        ?? r8 = c0093Dm.i;
                        interfaceC2309ym2 = c0093Dm.h;
                        AbstractC1494mO.l(obj);
                        c2148wJ2 = r8;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = c0093Dm.k;
                        i82 = c0093Dm.j;
                        ?? r82 = c0093Dm.i;
                        interfaceC2309ym2 = c0093Dm.h;
                        AbstractC1494mO.l(obj);
                        C2148wJ c2148wJ3 = r82;
                        InterfaceC2309ym interfaceC2309ym3 = interfaceC2309ym2;
                        i8 = i82;
                        interfaceC2309ym = interfaceC2309ym3;
                        c2148wJ = c2148wJ3;
                        c0093Dm.h = interfaceC2309ym;
                        c0093Dm.i = c2148wJ;
                        c0093Dm.j = i8;
                        c0093Dm.k = z;
                        c0093Dm.m = 1;
                        obj = i8.b(c0093Dm);
                        if (obj != enumC0448Re) {
                            return enumC0448Re;
                        }
                        I8 i83 = i8;
                        interfaceC2309ym2 = interfaceC2309ym;
                        i82 = i83;
                        c2148wJ2 = c2148wJ;
                        if (((Boolean) obj).booleanValue()) {
                            if (z) {
                                c2148wJ2.c(null);
                            }
                            return C0782bY.a;
                        }
                        Object c2 = i82.c();
                        c0093Dm.h = interfaceC2309ym2;
                        c0093Dm.i = c2148wJ2;
                        c0093Dm.j = i82;
                        c0093Dm.k = z;
                        c0093Dm.m = 2;
                        c2148wJ3 = c2148wJ2;
                    }
                }
            }
            if (i != 0) {
            }
        } finally {
        }
        c0093Dm = new C0093Dm(abstractC2367ze);
        Object obj2 = c0093Dm.l;
        i = c0093Dm.m;
        CancellationException cancellationException2 = null;
        EnumC0448Re enumC0448Re2 = EnumC0448Re.h;
    }

    public static YB E(AbstractC1052fg abstractC1052fg) {
        if (abstractC1052fg instanceof C1461lv) {
            C1461lv c1461lv = (C1461lv) abstractC1052fg;
            String str = c1461lv.h;
            String str2 = c1461lv.i;
            n(str, "name");
            n(str2, "desc");
            return new YB(str.concat(str2));
        }
        if (!(abstractC1052fg instanceof C1395kv)) {
            throw new C0057Cc();
        }
        C1395kv c1395kv = (C1395kv) abstractC1052fg;
        String str3 = c1395kv.h;
        String str4 = c1395kv.i;
        n(str3, "name");
        n(str4, "desc");
        return new YB(str3 + '#' + str4);
    }

    public static String F(String str, String str2, byte[] bArr) {
        byte[] bArr2 = EB.r;
        byte[] bArr3 = EB.s;
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
                return AbstractC1888sN.l(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static final Object G(AbstractC1003ex abstractC1003ex) {
        AbstractC1397kx t = abstractC1003ex.t();
        return AbstractC1052fg.h(t.p, t.p());
    }

    public static final int I(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static final float[] J(float[] fArr) {
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

    public static final boolean K(PJ pj) {
        n(pj, "<this>");
        return pj.getGetter() == null;
    }

    public static final float[] L(float[] fArr, float[] fArr2) {
        float f2 = fArr[0];
        float f3 = fArr2[0];
        float f4 = fArr[3];
        float f5 = fArr2[1];
        float f6 = fArr[6];
        float f7 = fArr2[2];
        float f8 = (f6 * f7) + (f4 * f5) + (f2 * f3);
        float f9 = fArr[1];
        float f10 = fArr[4];
        float f11 = fArr[7];
        float f12 = (f11 * f7) + (f10 * f5) + (f9 * f3);
        float f13 = fArr[2];
        float f14 = fArr[5];
        float f15 = fArr[8];
        float f16 = (f7 * f15) + (f5 * f14) + (f3 * f13);
        float f17 = fArr2[3];
        float f18 = fArr2[4];
        float f19 = fArr2[5];
        float f20 = (f6 * f19) + (f4 * f18) + (f2 * f17);
        float f21 = (f11 * f19) + (f10 * f18) + (f9 * f17);
        float f22 = (f19 * f15) + (f18 * f14) + (f17 * f13);
        float f23 = fArr2[6];
        float f24 = fArr2[7];
        float f25 = (f4 * f24) + (f2 * f23);
        float f26 = fArr2[8];
        return new float[]{f8, f12, f16, f20, f21, f22, (f6 * f26) + f25, (f11 * f26) + (f10 * f24) + (f9 * f23), (f15 * f26) + (f14 * f24) + (f13 * f23)};
    }

    public static final void M(float[] fArr, float[] fArr2) {
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
    }

    public static C1852rr N(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i2] = UT.T(str).toString();
        }
        int I = I(0, strArr2.length - 1, 2);
        if (I >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                j(str2);
                o(str3, str2);
                if (i == I) {
                    break;
                }
                i += 2;
            }
        }
        return new C1852rr(strArr2);
    }

    public static void O(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final Object P(Object obj, Object obj2) {
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

    public static void Q(InterfaceC0649Yx interfaceC0649Yx, Annotation annotation) {
        Class D = AbstractC1473m3.D(AbstractC1473m3.B(annotation));
        InterfaceC0597Wx b2 = interfaceC0649Yx.b(AbstractC1492mM.a(D), new C1426lM(annotation));
        if (b2 != null) {
            R(b2, annotation, D);
        }
    }

    public static void R(InterfaceC0597Wx interfaceC0597Wx, Annotation annotation, Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        m(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, null);
                k(invoke);
                C0827cE e2 = C0827cE.e(method.getName());
                Class<?> cls2 = invoke.getClass();
                if (cls2.equals(Class.class)) {
                    interfaceC0597Wx.k(e2, s((Class) invoke));
                } else if (PM.a.contains(cls2)) {
                    interfaceC0597Wx.m(e2, invoke);
                } else {
                    List list = AbstractC1492mM.a;
                    if (Enum.class.isAssignableFrom(cls2)) {
                        if (!cls2.isEnum()) {
                            cls2 = cls2.getEnclosingClass();
                        }
                        m(cls2, "if (clazz.isEnum) clazz else clazz.enclosingClass");
                        interfaceC0597Wx.l(e2, AbstractC1492mM.a(cls2), C0827cE.e(((Enum) invoke).name()));
                    } else if (Annotation.class.isAssignableFrom(cls2)) {
                        Class<?>[] interfaces = cls2.getInterfaces();
                        m(interfaces, "clazz.interfaces");
                        Class cls3 = (Class) P6.r0(interfaces);
                        m(cls3, "annotationClass");
                        InterfaceC0597Wx n = interfaceC0597Wx.n(AbstractC1492mM.a(cls3), e2);
                        if (n != null) {
                            R(n, (Annotation) invoke, cls3);
                        }
                    } else {
                        if (!cls2.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls2 + "): " + invoke);
                        }
                        InterfaceC0623Xx j = interfaceC0597Wx.j(e2);
                        if (j != null) {
                            Class<?> componentType = cls2.getComponentType();
                            if (componentType.isEnum()) {
                                C1639ob a2 = AbstractC1492mM.a(componentType);
                                for (Object obj : (Object[]) invoke) {
                                    l(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    j.u(a2, C0827cE.e(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) invoke) {
                                    l(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    j.F(s((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) invoke) {
                                    InterfaceC0597Wx w0 = j.w0(AbstractC1492mM.a(componentType));
                                    if (w0 != null) {
                                        l(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        R(w0, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) invoke) {
                                    j.q0(obj4);
                                }
                            }
                            j.h();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        interfaceC0597Wx.h();
    }

    public static int[] S(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) EB.R(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static C1778qi[] T(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C1778qi[] c1778qiArr) {
        byte[] bArr3 = EB.t;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, EB.u)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int R = (int) EB.R(fileInputStream, 2);
            byte[] Q = EB.Q(fileInputStream, (int) EB.R(fileInputStream, 4), (int) EB.R(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Q);
            try {
                C1778qi[] V = V(byteArrayInputStream, bArr2, R, c1778qiArr);
                byteArrayInputStream.close();
                return V;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(EB.f35o, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int R2 = (int) EB.R(fileInputStream, 1);
        byte[] Q2 = EB.Q(fileInputStream, (int) EB.R(fileInputStream, 4), (int) EB.R(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(Q2);
        try {
            C1778qi[] U = U(byteArrayInputStream2, R2, c1778qiArr);
            byteArrayInputStream2.close();
            return U;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static C1778qi[] U(ByteArrayInputStream byteArrayInputStream, int i, C1778qi[] c1778qiArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C1778qi[0];
        }
        if (i != c1778qiArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int R = (int) EB.R(byteArrayInputStream, 2);
            iArr[i2] = (int) EB.R(byteArrayInputStream, 2);
            strArr[i2] = new String(EB.P(byteArrayInputStream, R), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C1778qi c1778qi = c1778qiArr[i3];
            if (!c1778qi.b.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c1778qi.e = i4;
            c1778qi.h = S(byteArrayInputStream, i4);
        }
        return c1778qiArr;
    }

    public static C1778qi[] V(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C1778qi[] c1778qiArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C1778qi[0];
        }
        if (i != c1778qiArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            EB.R(byteArrayInputStream, 2);
            String str = new String(EB.P(byteArrayInputStream, (int) EB.R(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long R = EB.R(byteArrayInputStream, 4);
            int R2 = (int) EB.R(byteArrayInputStream, 2);
            C1778qi c1778qi = null;
            if (c1778qiArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= c1778qiArr.length) {
                        break;
                    }
                    if (c1778qiArr[i3].b.equals(substring)) {
                        c1778qi = c1778qiArr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (c1778qi == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c1778qi.d = R;
            int[] S = S(byteArrayInputStream, R2);
            if (Arrays.equals(bArr, EB.s)) {
                c1778qi.e = R2;
                c1778qi.h = S;
            }
        }
        return c1778qiArr;
    }

    public static C1778qi[] W(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, EB.p)) {
            throw new IllegalStateException("Unsupported version");
        }
        int R = (int) EB.R(fileInputStream, 1);
        byte[] Q = EB.Q(fileInputStream, (int) EB.R(fileInputStream, 4), (int) EB.R(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Q);
        try {
            C1778qi[] X = X(byteArrayInputStream, str, R);
            byteArrayInputStream.close();
            return X;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static C1778qi[] X(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C1778qi[0];
        }
        C1778qi[] c1778qiArr = new C1778qi[i];
        for (int i3 = 0; i3 < i; i3++) {
            int R = (int) EB.R(byteArrayInputStream, 2);
            int R2 = (int) EB.R(byteArrayInputStream, 2);
            c1778qiArr[i3] = new C1778qi(str, new String(EB.P(byteArrayInputStream, R), StandardCharsets.UTF_8), EB.R(byteArrayInputStream, 4), R2, (int) EB.R(byteArrayInputStream, 4), (int) EB.R(byteArrayInputStream, 4), new int[R2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            C1778qi c1778qi = c1778qiArr[i4];
            int available = byteArrayInputStream.available();
            int i5 = c1778qi.f;
            int i6 = c1778qi.g;
            TreeMap treeMap = c1778qi.i;
            int i7 = available - i5;
            int i8 = i2;
            while (byteArrayInputStream.available() > i7) {
                i8 += (int) EB.R(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i8), 1);
                int R3 = (int) EB.R(byteArrayInputStream, 2);
                while (R3 > 0) {
                    EB.R(byteArrayInputStream, 2);
                    int R4 = (int) EB.R(byteArrayInputStream, 1);
                    if (R4 != 6 && R4 != 7) {
                        while (R4 > 0) {
                            EB.R(byteArrayInputStream, 1);
                            int i9 = i2;
                            int i10 = i4;
                            for (int R5 = (int) EB.R(byteArrayInputStream, 1); R5 > 0; R5--) {
                                EB.R(byteArrayInputStream, 2);
                            }
                            R4--;
                            i2 = i9;
                            i4 = i10;
                        }
                    }
                    R3--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i11 = i2;
            int i12 = i4;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c1778qi.h = S(byteArrayInputStream, c1778qi.e);
            BitSet valueOf = BitSet.valueOf(EB.P(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i6; i13++) {
                int i14 = valueOf.get(i13) ? 2 : i11;
                if (valueOf.get(i13 + i6)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | num.intValue()));
                }
            }
            i4 = i12 + 1;
            i2 = i11;
        }
        return c1778qiArr;
    }

    public static final AbstractC1004ey Y(AbstractC1004ey abstractC1004ey, ArrayList arrayList) {
        C1767qX c1767qX;
        abstractC1004ey.w0().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MW mw = (MW) it.next();
            mw.getClass();
            AbstractC1004ey abstractC1004ey2 = mw.c;
            AbstractC1004ey abstractC1004ey3 = mw.b;
            InterfaceC1437lX interfaceC1437lX = mw.a;
            InterfaceC1136gy.a.b(abstractC1004ey3, abstractC1004ey2);
            if (!h(abstractC1004ey3, abstractC1004ey2)) {
                if (interfaceC1437lX.Y() != 2) {
                    if (AbstractC0545Ux.E(abstractC1004ey3) && interfaceC1437lX.Y() != 2) {
                        c1767qX = new C1767qX(3 != interfaceC1437lX.Y() ? 3 : 1, abstractC1004ey2);
                    } else {
                        if (abstractC1004ey2 == null) {
                            AbstractC0545Ux.a(140);
                            throw null;
                        }
                        if (AbstractC0545Ux.x(abstractC1004ey2) && abstractC1004ey2.C0()) {
                            c1767qX = new C1767qX(2 == interfaceC1437lX.Y() ? 1 : 2, abstractC1004ey3);
                        } else {
                            c1767qX = new C1767qX(3 != interfaceC1437lX.Y() ? 3 : 1, abstractC1004ey2);
                        }
                    }
                    arrayList2.add(c1767qX);
                }
            }
            c1767qX = new C1767qX(abstractC1004ey3);
            arrayList2.add(c1767qX);
        }
        return DY.o(abstractC1004ey, arrayList2, null, 6);
    }

    public static void Z(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final int a0(C1891sQ c1891sQ, int i) {
        int i2;
        int[] iArr = c1891sQ.m;
        int i3 = i + 1;
        int length = c1891sQ.l.length;
        n(iArr, "<this>");
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0112  */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, o.Iy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final G9 b(AbstractC1003ex abstractC1003ex, boolean z) {
        C1329jv c1329jv;
        Method method;
        G9 r9;
        C2318yv c2318yv;
        Method l;
        C0705aN c0705aN = AbstractC1330jw.h;
        String str = abstractC1003ex.t().f191o;
        c0705aN.getClass();
        n(str, "input");
        if (c0705aN.h.matcher(str).matches()) {
            return IV.a;
        }
        C1639ob c1639ob = AbstractC0969eP.a;
        AbstractC0868ct b2 = AbstractC0969eP.b(abstractC1003ex.t().p());
        if (b2 instanceof C1988tv) {
            C1988tv c1988tv = (C1988tv) b2;
            InterfaceC0893dE interfaceC0893dE = c1988tv.v;
            C0024Av c0024Av = c1988tv.u;
            if (z) {
                if ((c0024Av.i & 4) == 4) {
                    c2318yv = c0024Av.l;
                    l = c2318yv != null ? abstractC1003ex.t().m.l(interfaceC0893dE.getString(c2318yv.j), interfaceC0893dE.getString(c2318yv.k)) : null;
                    if (l == null) {
                        r9 = !Modifier.isStatic(l.getModifiers()) ? abstractC1003ex.r() ? new R9(G(abstractC1003ex), l) : new U9(l, 0) : abstractC1003ex.t().p().getAnnotations().i(JY.a) ? abstractC1003ex.r() ? new S9(l) : new U9(l, 1) : abstractC1003ex.r() ? new T9(G(abstractC1003ex), l) : new U9(l, 2);
                    } else if (AbstractC0306Ls.d(abstractC1003ex.t().p()) && h(abstractC1003ex.t().p().getVisibility(), AbstractC0270Kh.d)) {
                        Class V = AbstractC1052fg.V(abstractC1003ex.t().p().n());
                        if (V == null) {
                            throw new C0526Ue("Underlying property of inline class " + abstractC1003ex.t() + " should have a field");
                        }
                        Method E = AbstractC1052fg.E(V, abstractC1003ex.t().p());
                        r9 = abstractC1003ex.r() ? new C2118vt(G(abstractC1003ex), E) : new C2184wt(E, AbstractC0868ct.J(E.getDeclaringClass()));
                    } else {
                        Field field = (Field) abstractC1003ex.t().q.getValue();
                        if (field == null) {
                            throw new C0526Ue("No accessors or field is found for property " + abstractC1003ex.t());
                        }
                        r9 = v(abstractC1003ex, z, field);
                    }
                }
                c2318yv = null;
                if (c2318yv != null) {
                }
                if (l == null) {
                }
            } else {
                if ((c0024Av.i & 8) == 8) {
                    c2318yv = c0024Av.m;
                    if (c2318yv != null) {
                    }
                    if (l == null) {
                    }
                }
                c2318yv = null;
                if (c2318yv != null) {
                }
                if (l == null) {
                }
            }
        } else if (b2 instanceof C1856rv) {
            r9 = v(abstractC1003ex, z, ((C1856rv) b2).s);
        } else {
            if (!(b2 instanceof C1922sv)) {
                if (!(b2 instanceof C2054uv)) {
                    throw new C0057Cc();
                }
                if (z) {
                    c1329jv = ((C2054uv) b2).s;
                } else {
                    c1329jv = ((C2054uv) b2).t;
                    if (c1329jv == null) {
                        throw new C0526Ue("No setter found for property " + abstractC1003ex.t());
                    }
                }
                AbstractC1330jw abstractC1330jw = abstractC1003ex.t().m;
                C1461lv c1461lv = c1329jv.i;
                Method l2 = abstractC1330jw.l(c1461lv.h, c1461lv.i);
                if (l2 != null) {
                    Modifier.isStatic(l2.getModifiers());
                    return abstractC1003ex.r() ? new R9(G(abstractC1003ex), l2) : new U9(l2, 0);
                }
                throw new C0526Ue("No accessor found for property " + abstractC1003ex.t());
            }
            if (z) {
                method = ((C1922sv) b2).s;
            } else {
                C1922sv c1922sv = (C1922sv) b2;
                method = c1922sv.t;
                if (method == null) {
                    throw new C0526Ue("No source found for setter of Java method property: " + c1922sv.s);
                }
            }
            r9 = abstractC1003ex.r() ? new R9(G(abstractC1003ex), method) : new U9(method, 0);
        }
        return AbstractC1052fg.k(abstractC1003ex.s(), r9, false);
    }

    public static final Collection b0(Collection collection, InterfaceC2114vp interfaceC2114vp) {
        n(collection, "<this>");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C1630oS c1630oS = new C1630oS();
        while (!linkedList.isEmpty()) {
            Object n0 = AbstractC0720ac.n0(linkedList);
            C1630oS c1630oS2 = new C1630oS();
            ArrayList g2 = XG.g(n0, linkedList, interfaceC2114vp, new C1400l(29, c1630oS2));
            if (g2.size() == 1 && c1630oS2.isEmpty()) {
                Object C0 = AbstractC0720ac.C0(g2);
                m(C0, "overridableGroup.single()");
                c1630oS.add(C0);
            } else {
                Object s = XG.s(g2, interfaceC2114vp);
                InterfaceC2072v9 interfaceC2072v9 = (InterfaceC2072v9) interfaceC2114vp.invoke(s);
                Iterator it = g2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    m(next, "it");
                    if (!XG.k(interfaceC2072v9, (InterfaceC2072v9) interfaceC2114vp.invoke(next))) {
                        c1630oS2.add(next);
                    }
                }
                if (!c1630oS2.isEmpty()) {
                    c1630oS.addAll(c1630oS2);
                }
                c1630oS.add(s);
            }
        }
        return c1630oS;
    }

    public static final boolean c(C2287yQ c2287yQ) {
        C2023uQ i = c2287yQ.i();
        return !i.h.containsKey(CQ.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(List list, C2170wf c2170wf, AbstractC2367ze abstractC2367ze) {
        C1775qf c1775qf;
        int i;
        List list2;
        C1360kM c1360kM;
        Iterator it;
        Throwable th;
        if (abstractC2367ze instanceof C1775qf) {
            c1775qf = (C1775qf) abstractC2367ze;
            int i2 = c1775qf.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1775qf.k = i2 - Integer.MIN_VALUE;
                Object obj = c1775qf.j;
                i = c1775qf.k;
                Object obj2 = EnumC0448Re.h;
                if (i != 0) {
                    AbstractC1494mO.l(obj);
                    ArrayList arrayList = new ArrayList();
                    C1906sf c1906sf = new C1906sf(list, arrayList, null);
                    c1775qf.h = arrayList;
                    c1775qf.k = 1;
                    if (c2170wf.a(c1906sf, c1775qf) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c1775qf.i;
                        c1360kM = (C1360kM) c1775qf.h;
                        try {
                            AbstractC1494mO.l(obj);
                        } catch (Throwable th2) {
                            Object obj3 = c1360kM.h;
                            if (obj3 == null) {
                                c1360kM.h = th2;
                            } else {
                                AbstractC0946e20.e((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            InterfaceC2114vp interfaceC2114vp = (InterfaceC2114vp) it.next();
                            c1775qf.h = c1360kM;
                            c1775qf.i = it;
                            c1775qf.k = 2;
                            if (interfaceC2114vp.invoke(c1775qf) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) c1360kM.h;
                        if (th == null) {
                            return C0782bY.a;
                        }
                        throw th;
                    }
                    list2 = (List) c1775qf.h;
                    AbstractC1494mO.l(obj);
                }
                c1360kM = new C1360kM();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) c1360kM.h;
                if (th == null) {
                }
            }
        }
        c1775qf = new C1775qf(abstractC2367ze);
        Object obj4 = c1775qf.j;
        i = c1775qf.k;
        Object obj22 = EnumC0448Re.h;
        if (i != 0) {
        }
        c1360kM = new C1360kM();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) c1360kM.h;
        if (th == null) {
        }
    }

    public static AbstractC1508mc e(AbstractC1508mc abstractC1508mc) {
        H00 h00 = AbstractC0022At.e;
        Y1 y1 = Y1.j;
        if (AbstractC1310jc.a(abstractC1508mc.b, AbstractC1310jc.a)) {
            C2285yO c2285yO = (C2285yO) abstractC1508mc;
            H00 h002 = c2285yO.d;
            if (!u(h002, h00)) {
                return new C2285yO(c2285yO.a, c2285yO.h, h00, L(q((float[]) y1.i, h002.a(), h00.a()), c2285yO.i), c2285yO.k, c2285yO.m, c2285yO.e, c2285yO.f, c2285yO.g, -1);
            }
        }
        return abstractC1508mc;
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
    public static String f0(String str) {
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

    public static final C2267y6 g(AbstractC1004ey abstractC1004ey) {
        MW mw;
        n(abstractC1004ey, "type");
        if (AbstractC0868ct.E(abstractC1004ey)) {
            C2267y6 g2 = g(AbstractC0868ct.M(abstractC1004ey));
            C2267y6 g3 = g(AbstractC0868ct.a0(abstractC1004ey));
            return new C2267y6(AbstractC1494mO.h(HO.m(AbstractC0868ct.M((AbstractC1004ey) g2.a), AbstractC0868ct.a0((AbstractC1004ey) g3.a)), abstractC1004ey), AbstractC1494mO.h(HO.m(AbstractC0868ct.M((AbstractC1004ey) g2.b), AbstractC0868ct.a0((AbstractC1004ey) g3.b)), abstractC1004ey));
        }
        SW B0 = abstractC1004ey.B0();
        boolean z = true;
        if (abstractC1004ey.B0() instanceof InterfaceC1440la) {
            l(B0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            AbstractC1701pX b2 = ((InterfaceC1440la) B0).b();
            AbstractC1004ey b3 = b2.b();
            m(b3, "typeProjection.type");
            AbstractC1004ey h = AbstractC2228xX.h(b3, abstractC1004ey.C0());
            int v = AbstractC1888sN.v(b2.a());
            if (v == 1) {
                JR o2 = AbstractC0772bO.l(abstractC1004ey).o();
                m(o2, "type.builtIns.nullableAnyType");
                return new C2267y6(h, o2);
            }
            if (v == 2) {
                return new C2267y6(AbstractC2228xX.h(AbstractC0772bO.l(abstractC1004ey).n(), abstractC1004ey.C0()), h);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + b2);
        }
        if (abstractC1004ey.w0().isEmpty() || abstractC1004ey.w0().size() != B0.getParameters().size()) {
            return new C2267y6(abstractC1004ey, abstractC1004ey);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List w0 = abstractC1004ey.w0();
        List parameters = B0.getParameters();
        m(parameters, "typeConstructor.parameters");
        Iterator it = AbstractC0720ac.O0(w0, parameters).iterator();
        while (it.hasNext()) {
            C1619oH c1619oH = (C1619oH) it.next();
            AbstractC1701pX abstractC1701pX = (AbstractC1701pX) c1619oH.h;
            InterfaceC1437lX interfaceC1437lX = (InterfaceC1437lX) c1619oH.i;
            m(interfaceC1437lX, "typeParameter");
            int Y = interfaceC1437lX.Y();
            if (Y == 0) {
                C2096vX.a(35);
                throw null;
            }
            if (abstractC1701pX == null) {
                C2096vX.a(36);
                throw null;
            }
            C2096vX c2096vX = C2096vX.b;
            int v2 = AbstractC1888sN.v(abstractC1701pX.c() ? 3 : C2096vX.b(Y, abstractC1701pX.a()));
            if (v2 == 0) {
                AbstractC1004ey b4 = abstractC1701pX.b();
                m(b4, "type");
                AbstractC1004ey b5 = abstractC1701pX.b();
                m(b5, "type");
                mw = new MW(interfaceC1437lX, b4, b5);
            } else if (v2 == 1) {
                AbstractC1004ey b6 = abstractC1701pX.b();
                m(b6, "type");
                JR o3 = AbstractC0192Hh.e(interfaceC1437lX).o();
                m(o3, "typeParameter.builtIns.nullableAnyType");
                mw = new MW(interfaceC1437lX, b6, o3);
            } else {
                if (v2 != 2) {
                    throw new C0057Cc();
                }
                JR n = AbstractC0192Hh.e(interfaceC1437lX).n();
                AbstractC1004ey b7 = abstractC1701pX.b();
                m(b7, "type");
                mw = new MW(interfaceC1437lX, n, b7);
            }
            if (abstractC1701pX.c()) {
                arrayList.add(mw);
                arrayList2.add(mw);
            } else {
                C2267y6 g4 = g(mw.b);
                AbstractC1004ey abstractC1004ey2 = (AbstractC1004ey) g4.a;
                AbstractC1004ey abstractC1004ey3 = (AbstractC1004ey) g4.b;
                C2267y6 g5 = g(mw.c);
                AbstractC1004ey abstractC1004ey4 = (AbstractC1004ey) g5.a;
                AbstractC1004ey abstractC1004ey5 = (AbstractC1004ey) g5.b;
                InterfaceC1437lX interfaceC1437lX2 = mw.a;
                MW mw2 = new MW(interfaceC1437lX2, abstractC1004ey3, abstractC1004ey4);
                MW mw3 = new MW(interfaceC1437lX2, abstractC1004ey2, abstractC1004ey5);
                arrayList.add(mw2);
                arrayList2.add(mw3);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                MW mw4 = (MW) it2.next();
                mw4.getClass();
                if (!InterfaceC1136gy.a.b(mw4.b, mw4.c)) {
                    break;
                }
            }
        }
        z = false;
        return new C2267y6(z ? AbstractC0772bO.l(abstractC1004ey).n() : Y(abstractC1004ey, arrayList), Y(abstractC1004ey, arrayList2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r0.charAt(r1.length()) == '.') goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C2245xo g0(C2245xo c2245xo, C2245xo c2245xo2) {
        n(c2245xo, "<this>");
        n(c2245xo2, "prefix");
        if (!c2245xo.equals(c2245xo2) && !c2245xo2.d()) {
            String b2 = c2245xo.b();
            String b3 = c2245xo2.b();
            if (AbstractC0778bU.B(b2, b3, false)) {
            }
            return c2245xo;
        }
        if (!c2245xo2.d()) {
            if (c2245xo.equals(c2245xo2)) {
                C2245xo c2245xo3 = C2245xo.c;
                m(c2245xo3, "ROOT");
                return c2245xo3;
            }
            String substring = c2245xo.b().substring(c2245xo2.b().length() + 1);
            m(substring, "this as java.lang.String).substring(startIndex)");
            return new C2245xo(substring);
        }
        return c2245xo;
    }

    public static boolean h(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void h0() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final boolean i(Object obj) {
        if (obj instanceof InterfaceC2157wS) {
            InterfaceC2157wS interfaceC2157wS = (InterfaceC2157wS) obj;
            if (interfaceC2157wS.a() == C0460Rq.P || interfaceC2157wS.a() == C1623oL.n || interfaceC2157wS.a() == C1097gL.i) {
                Object value = interfaceC2157wS.getValue();
                if (value == null) {
                    return true;
                }
                return i(value);
            }
        } else {
            if ((obj instanceof InterfaceC0174Gp) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i = 0; i < 7; i++) {
                if (b[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void i0(String str) {
        C0057Cc c0057Cc = new C0057Cc(AbstractC1888sN.k("lateinit property ", str, " has not been initialized"));
        Z(c0057Cc, AbstractC0048Bt.class.getName());
        throw c0057Cc;
    }

    public static void j(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(HY.g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    public static final Object[] j0(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr[i] = it.next();
                    if (i2 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                        m(objArr, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i2);
                        m(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i = i2;
                }
            }
        }
        return a;
    }

    public static void k(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        Z(nullPointerException, AbstractC0048Bt.class.getName());
        throw nullPointerException;
    }

    public static final Object[] k0(Collection collection, Object[] objArr) {
        Object[] objArr2;
        n(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    l(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                        m(objArr2, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i2] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i2);
                        m(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static void l(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        Z(nullPointerException, AbstractC0048Bt.class.getName());
        throw nullPointerException;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean l0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C1778qi[] c1778qiArr) {
        long j;
        int length;
        byte[] bArr2 = EB.s;
        byte[] bArr3 = EB.r;
        byte[] bArr4 = EB.f35o;
        int i = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                EB.b0(byteArrayOutputStream2, c1778qiArr.length);
                int i2 = 2;
                int i3 = 2;
                for (C1778qi c1778qi : c1778qiArr) {
                    EB.a0(byteArrayOutputStream2, c1778qi.c, 4);
                    EB.a0(byteArrayOutputStream2, c1778qi.d, 4);
                    EB.a0(byteArrayOutputStream2, c1778qi.g, 4);
                    String F = F(c1778qi.a, c1778qi.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = F.getBytes(charset).length;
                    EB.b0(byteArrayOutputStream2, length2);
                    i3 = i3 + 14 + length2;
                    byteArrayOutputStream2.write(F.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 != byteArray.length) {
                    throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
                }
                C0684a20 c0684a20 = new C0684a20(1, byteArray, false);
                byteArrayOutputStream2.close();
                arrayList.add(c0684a20);
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i4 = 0;
                int i5 = 0;
                while (i4 < c1778qiArr.length) {
                    try {
                        C1778qi c1778qi2 = c1778qiArr[i4];
                        EB.b0(byteArrayOutputStream3, i4);
                        EB.b0(byteArrayOutputStream3, c1778qi2.e);
                        i5 = i5 + 4 + (c1778qi2.e * i2);
                        int[] iArr = c1778qi2.h;
                        int length3 = iArr.length;
                        int i6 = i;
                        int i7 = i2;
                        int i8 = i6;
                        while (i8 < length3) {
                            int i9 = iArr[i8];
                            EB.b0(byteArrayOutputStream3, i9 - i6);
                            i8++;
                            i6 = i9;
                        }
                        i4++;
                        i2 = i7;
                        i = 0;
                    } catch (Throwable th) {
                    }
                }
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                if (i5 != byteArray2.length) {
                    throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
                }
                C0684a20 c0684a202 = new C0684a20(3, byteArray2, true);
                byteArrayOutputStream3.close();
                arrayList.add(c0684a202);
                byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i10 = 0;
                int i11 = 0;
                while (i10 < c1778qiArr.length) {
                    try {
                        C1778qi c1778qi3 = c1778qiArr[i10];
                        Iterator it = c1778qi3.i.entrySet().iterator();
                        int i12 = 0;
                        while (it.hasNext()) {
                            i12 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                        }
                        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            n0(byteArrayOutputStream4, c1778qi3);
                            byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            byteArrayOutputStream4 = new ByteArrayOutputStream();
                            try {
                                o0(byteArrayOutputStream4, c1778qi3);
                                byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                EB.b0(byteArrayOutputStream3, i10);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i13 = i11 + 6;
                                int i14 = i10;
                                EB.a0(byteArrayOutputStream3, length4, 4);
                                EB.b0(byteArrayOutputStream3, i12);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i11 = i13 + length4;
                                i10 = i14 + 1;
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
                if (i11 != byteArray5.length) {
                    throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
                }
                C0684a20 c0684a203 = new C0684a20(4, byteArray5, true);
                byteArrayOutputStream3.close();
                arrayList.add(c0684a203);
                long j2 = 4;
                long size = j2 + j2 + 4 + (arrayList.size() * 16);
                EB.a0(byteArrayOutputStream, arrayList.size(), 4);
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    C0684a20 c0684a204 = (C0684a20) arrayList.get(i15);
                    int i16 = c0684a204.a;
                    byte[] bArr5 = c0684a204.b;
                    if (i16 == 1) {
                        j = 0;
                    } else if (i16 == 2) {
                        j = 1;
                    } else if (i16 == 3) {
                        j = 2;
                    } else if (i16 == 4) {
                        j = 3;
                    } else {
                        if (i16 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                    EB.a0(byteArrayOutputStream, j, 4);
                    EB.a0(byteArrayOutputStream, size, 4);
                    if (c0684a204.c) {
                        long length5 = bArr5.length;
                        byte[] j3 = EB.j(bArr5);
                        arrayList2.add(j3);
                        EB.a0(byteArrayOutputStream, j3.length, 4);
                        EB.a0(byteArrayOutputStream, length5, 4);
                        length = j3.length;
                    } else {
                        arrayList2.add(bArr5);
                        EB.a0(byteArrayOutputStream, bArr5.length, 4);
                        EB.a0(byteArrayOutputStream, 0L, 4);
                        length = bArr5.length;
                    }
                    size += length;
                }
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    byteArrayOutputStream.write((byte[]) arrayList2.get(i17));
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } else {
            byte[] bArr6 = EB.p;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] A = A(c1778qiArr, bArr6);
                EB.a0(byteArrayOutputStream, c1778qiArr.length, 1);
                EB.a0(byteArrayOutputStream, A.length, 4);
                byte[] j4 = EB.j(A);
                EB.a0(byteArrayOutputStream, j4.length, 4);
                byteArrayOutputStream.write(j4);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                EB.a0(byteArrayOutputStream, c1778qiArr.length, 1);
                for (C1778qi c1778qi4 : c1778qiArr) {
                    int size2 = c1778qi4.i.size() * 4;
                    String F2 = F(c1778qi4.a, c1778qi4.b, bArr3);
                    Charset charset2 = StandardCharsets.UTF_8;
                    EB.b0(byteArrayOutputStream, F2.getBytes(charset2).length);
                    EB.b0(byteArrayOutputStream, c1778qi4.h.length);
                    EB.a0(byteArrayOutputStream, size2, 4);
                    EB.a0(byteArrayOutputStream, c1778qi4.c, 4);
                    byteArrayOutputStream.write(F2.getBytes(charset2));
                    Iterator it2 = c1778qi4.i.keySet().iterator();
                    while (it2.hasNext()) {
                        EB.b0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                        EB.b0(byteArrayOutputStream, 0);
                    }
                    for (int i18 : c1778qi4.h) {
                        EB.b0(byteArrayOutputStream, i18);
                    }
                }
            } else {
                byte[] bArr7 = EB.q;
                if (Arrays.equals(bArr, bArr7)) {
                    byte[] A2 = A(c1778qiArr, bArr7);
                    EB.a0(byteArrayOutputStream, c1778qiArr.length, 1);
                    EB.a0(byteArrayOutputStream, A2.length, 4);
                    byte[] j5 = EB.j(A2);
                    EB.a0(byteArrayOutputStream, j5.length, 4);
                    byteArrayOutputStream.write(j5);
                    return true;
                }
                if (!Arrays.equals(bArr, bArr2)) {
                    return false;
                }
                EB.b0(byteArrayOutputStream, c1778qiArr.length);
                for (C1778qi c1778qi5 : c1778qiArr) {
                    String str = c1778qi5.a;
                    TreeMap treeMap = c1778qi5.i;
                    String F3 = F(str, c1778qi5.b, bArr2);
                    Charset charset3 = StandardCharsets.UTF_8;
                    EB.b0(byteArrayOutputStream, F3.getBytes(charset3).length);
                    EB.b0(byteArrayOutputStream, treeMap.size());
                    EB.b0(byteArrayOutputStream, c1778qi5.h.length);
                    EB.a0(byteArrayOutputStream, c1778qi5.c, 4);
                    byteArrayOutputStream.write(F3.getBytes(charset3));
                    Iterator it3 = treeMap.keySet().iterator();
                    while (it3.hasNext()) {
                        EB.b0(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                    }
                    for (int i19 : c1778qi5.h) {
                        EB.b0(byteArrayOutputStream, i19);
                    }
                }
            }
        }
        return true;
    }

    public static void m(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        Z(nullPointerException, AbstractC0048Bt.class.getName());
        throw nullPointerException;
    }

    public static void m0(ByteArrayOutputStream byteArrayOutputStream, C1778qi c1778qi, String str) {
        Charset charset = StandardCharsets.UTF_8;
        EB.b0(byteArrayOutputStream, str.getBytes(charset).length);
        EB.b0(byteArrayOutputStream, c1778qi.e);
        EB.a0(byteArrayOutputStream, c1778qi.f, 4);
        EB.a0(byteArrayOutputStream, c1778qi.c, 4);
        EB.a0(byteArrayOutputStream, c1778qi.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void n(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC0048Bt.class.getName();
            int i = 0;
            while (!stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            while (stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            Z(nullPointerException, AbstractC0048Bt.class.getName());
            throw nullPointerException;
        }
    }

    public static void n0(ByteArrayOutputStream byteArrayOutputStream, C1778qi c1778qi) {
        byte[] bArr = new byte[(((c1778qi.g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c1778qi.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i = intValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i2 = intValue + c1778qi.g;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void o(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(HY.g("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                sb.append(HY.o(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static void o0(ByteArrayOutputStream byteArrayOutputStream, C1778qi c1778qi) {
        int i = 0;
        for (Map.Entry entry : c1778qi.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                EB.b0(byteArrayOutputStream, intValue - i);
                EB.b0(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }

    public static C1216i8 p(C1216i8 c1216i8, InterfaceC1836rb interfaceC1836rb, C2217xM c2217xM, int i) {
        if ((i & 2) != 0) {
            c2217xM = null;
        }
        n(c1216i8, "<this>");
        return new C1216i8((C1198hu) c1216i8.i, c2217xM != null ? new C1333jz(c1216i8, interfaceC1836rb, c2217xM, 0) : (InterfaceC1569nX) c1216i8.j, EB.C(EnumC1992tz.i, new K2(c1216i8, 2, interfaceC1836rb)));
    }

    public static final float[] q(float[] fArr, float[] fArr2, float[] fArr3) {
        M(fArr, fArr2);
        M(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] J = J(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return L(J, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
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
    public static String r(String str) {
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

    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, o.Iy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, o.Iy] */
    public static C1705pb s(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            m(cls, "currentClass.componentType");
        }
        if (cls.isPrimitive()) {
            if (cls.equals(Void.TYPE)) {
                return new C1705pb(C1639ob.j(AbstractC1433lT.d.g()), i);
            }
            EnumC1423lJ d2 = EnumC1791qv.b(cls.getName()).d();
            m(d2, "get(currentClass.name).primitiveType");
            return i > 0 ? new C1705pb(C1639ob.j((C2245xo) d2.k.getValue()), i - 1) : new C1705pb(C1639ob.j((C2245xo) d2.j.getValue()), i);
        }
        C1639ob a2 = AbstractC1492mM.a(cls);
        String str = C1460lu.a;
        C1639ob c1639ob = (C1639ob) C1460lu.h.get(a2.b().i());
        if (c1639ob != null) {
            a2 = c1639ob;
        }
        return new C1705pb(a2, i);
    }

    public static int t(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static final boolean u(H00 h00, H00 h002) {
        if (h00 == h002) {
            return true;
        }
        return Math.abs(h00.a - h002.a) < 0.001f && Math.abs(h00.b - h002.b) < 0.001f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        if (o.C0206Hv.d(((o.C1186hi) r0).H) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (o.AbstractC0114Eh.n(r1, 5) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final V9 v(AbstractC1003ex abstractC1003ex, boolean z, Field field) {
        PJ p = abstractC1003ex.t().p();
        InterfaceC1118gg n = p.n();
        m(n, "containingDeclaration");
        boolean z2 = true;
        if (AbstractC0114Eh.l(n)) {
            InterfaceC1118gg n2 = n.n();
            if (!AbstractC0114Eh.n(n2, 2)) {
            }
            if (p instanceof C1186hi) {
            }
        }
        if (Modifier.isStatic(field.getModifiers())) {
            boolean z3 = false;
            return abstractC1003ex.t().p().getAnnotations().i(JY.a) ? z ? abstractC1003ex.r() ? new K9(field, false) : new L9(field, z2, 1) : abstractC1003ex.r() ? new O9(field, w(abstractC1003ex), false) : new P9(field, w(abstractC1003ex), z2, 1) : z ? new L9(field, z3, 2) : new P9(field, w(abstractC1003ex), z3, 2);
        }
        if (z) {
            if (abstractC1003ex.r()) {
                return new J9(field, G(abstractC1003ex));
            }
            n(field, "field");
            return new L9(field, z2, 0);
        }
        if (abstractC1003ex.r()) {
            return new N9(field, w(abstractC1003ex), G(abstractC1003ex));
        }
        boolean w = w(abstractC1003ex);
        n(field, "field");
        return new P9(field, w, z2, 0);
    }

    public static final boolean w(AbstractC1003ex abstractC1003ex) {
        return !AbstractC2228xX.e(abstractC1003ex.t().p().c());
    }

    public static final C1216i8 y(C1216i8 c1216i8, InterfaceC1738q4 interfaceC1738q4) {
        n(c1216i8, "<this>");
        n(interfaceC1738q4, "additionalAnnotations");
        if (interfaceC1738q4.isEmpty()) {
            return c1216i8;
        }
        return new C1216i8((C1198hu) c1216i8.i, (InterfaceC1569nX) c1216i8.j, EB.C(EnumC1992tz.i, new K2(c1216i8, 3, interfaceC1738q4)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0028, code lost:
    
        if (r1 <= r2) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static W8 z(C2245xo c2245xo, VA va, InterfaceC0761bD interfaceC0761bD, InputStream inputStream) {
        AK ak;
        AK ak2;
        n(c2245xo, "fqName");
        n(interfaceC0761bD, "module");
        try {
            R8 r8 = R8.f;
            R8 E = AbstractC0022At.E(inputStream);
            R8 r82 = R8.f;
            int i = E.c;
            n(r82, "ourVersion");
            int i2 = r82.c;
            int i3 = r82.b;
            int i4 = E.b;
            if (i4 == 0) {
                if (i3 == 0 && i == i2) {
                    C1649ol c1649ol = new C1649ol();
                    X8.a(c1649ol);
                    C2120vv c2120vv = AK.r;
                    c2120vv.getClass();
                    C0523Ub c0523Ub = new C0523Ub(inputStream);
                    E e2 = (E) c2120vv.a(c0523Ub, c1649ol);
                    try {
                        c0523Ub.a(0);
                        if (!e2.b()) {
                            C0204Ht c0204Ht = new C0204Ht(new C0057Cc().getMessage());
                            c0204Ht.h = e2;
                            throw c0204Ht;
                        }
                        ak = (AK) e2;
                        ak2 = ak;
                        inputStream.close();
                        if (ak2 != null) {
                            return new W8(c2245xo, va, interfaceC0761bD, ak2, E);
                        }
                        throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + r82 + ", actual " + E + ". Please update Kotlin");
                    } catch (C0204Ht e3) {
                        e3.h = e2;
                        throw e3;
                    }
                }
                ak = null;
                ak2 = ak;
                inputStream.close();
                if (ak2 != null) {
                }
            } else {
                if (i4 == i3) {
                }
                ak = null;
                ak2 = ak;
                inputStream.close();
                if (ak2 != null) {
                }
            }
        } finally {
        }
    }

    public abstract InputFilter[] H(InputFilter[] inputFilterArr);

    public abstract void c0(boolean z);

    public abstract void d0(boolean z);

    public void e0(InterfaceC2204x9 interfaceC2204x9, Collection collection) {
        n(interfaceC2204x9, "member");
        interfaceC2204x9.c0(collection);
    }

    public abstract void f(InterfaceC2204x9 interfaceC2204x9);

    public abstract void x(InterfaceC2204x9 interfaceC2204x9, InterfaceC2204x9 interfaceC2204x92);
}
