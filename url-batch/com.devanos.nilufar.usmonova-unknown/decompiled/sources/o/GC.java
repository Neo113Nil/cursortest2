package o;

import com.google.firebase.database.core.ValidationPath;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class GC implements InterfaceC0839cQ {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f43o = new int[0];
    public static final Unsafe p = AbstractC1768qY.j();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final F e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final C2143wE k;
    public final AbstractC1152hA l;
    public final C0913dY m;
    public final CB n;

    public GC(int[] iArr, Object[] objArr, int i, int i2, F f, boolean z, int[] iArr2, int i3, int i4, C2143wE c2143wE, AbstractC1152hA abstractC1152hA, C0913dY c0913dY, C1781ql c1781ql, CB cb) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = f instanceof AbstractC2181wq;
        this.g = z;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = c2143wE;
        this.l = abstractC1152hA;
        this.m = c0913dY;
        this.e = f;
        this.n = cb;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static GC A(C2018uL c2018uL, C2143wE c2143wE, AbstractC1152hA abstractC1152hA, C0913dY c0913dY, C1781ql c1781ql, CB cb) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        char charAt4;
        int i7;
        char charAt5;
        int i8;
        char charAt6;
        int i9;
        char charAt7;
        int i10;
        char charAt8;
        int i11;
        char charAt9;
        int i12;
        char charAt10;
        int i13;
        char charAt11;
        int i14;
        int i15;
        int i16;
        int objectFieldOffset;
        int i17;
        int i18;
        int i19;
        Field I;
        char charAt12;
        int i20;
        Object obj;
        Field I2;
        Object obj2;
        Field I3;
        int i21;
        char charAt13;
        int i22;
        char charAt14;
        int i23;
        int i24;
        char charAt15;
        int i25;
        char charAt16;
        boolean z = (c2018uL.d & 1) != 1;
        String str = c2018uL.b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i26 = 1;
            while (true) {
                i = i26 + 1;
                if (str.charAt(i26) < 55296) {
                    break;
                }
                i26 = i;
            }
        } else {
            i = 1;
        }
        int i27 = i + 1;
        int charAt17 = str.charAt(i);
        if (charAt17 >= 55296) {
            int i28 = charAt17 & 8191;
            int i29 = 13;
            while (true) {
                i25 = i27 + 1;
                charAt16 = str.charAt(i27);
                if (charAt16 < 55296) {
                    break;
                }
                i28 |= (charAt16 & 8191) << i29;
                i29 += 13;
                i27 = i25;
            }
            charAt17 = i28 | (charAt16 << i29);
            i27 = i25;
        }
        if (charAt17 == 0) {
            i5 = 0;
            charAt = 0;
            charAt2 = 0;
            i2 = 0;
            charAt3 = 0;
            iArr = f43o;
            i3 = 0;
            i4 = 0;
        } else {
            int i30 = i27 + 1;
            int charAt18 = str.charAt(i27);
            if (charAt18 >= 55296) {
                int i31 = charAt18 & 8191;
                int i32 = 13;
                while (true) {
                    i13 = i30 + 1;
                    charAt11 = str.charAt(i30);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i31 |= (charAt11 & 8191) << i32;
                    i32 += 13;
                    i30 = i13;
                }
                charAt18 = i31 | (charAt11 << i32);
                i30 = i13;
            }
            int i33 = i30 + 1;
            int charAt19 = str.charAt(i30);
            if (charAt19 >= 55296) {
                int i34 = charAt19 & 8191;
                int i35 = 13;
                while (true) {
                    i12 = i33 + 1;
                    charAt10 = str.charAt(i33);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i34 |= (charAt10 & 8191) << i35;
                    i35 += 13;
                    i33 = i12;
                }
                charAt19 = i34 | (charAt10 << i35);
                i33 = i12;
            }
            int i36 = i33 + 1;
            int charAt20 = str.charAt(i33);
            if (charAt20 >= 55296) {
                int i37 = charAt20 & 8191;
                int i38 = 13;
                while (true) {
                    i11 = i36 + 1;
                    charAt9 = str.charAt(i36);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i37 |= (charAt9 & 8191) << i38;
                    i38 += 13;
                    i36 = i11;
                }
                charAt20 = i37 | (charAt9 << i38);
                i36 = i11;
            }
            int i39 = i36 + 1;
            int charAt21 = str.charAt(i36);
            if (charAt21 >= 55296) {
                int i40 = charAt21 & 8191;
                int i41 = 13;
                while (true) {
                    i10 = i39 + 1;
                    charAt8 = str.charAt(i39);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i40 |= (charAt8 & 8191) << i41;
                    i41 += 13;
                    i39 = i10;
                }
                charAt21 = i40 | (charAt8 << i41);
                i39 = i10;
            }
            int i42 = i39 + 1;
            charAt = str.charAt(i39);
            if (charAt >= 55296) {
                int i43 = charAt & 8191;
                int i44 = 13;
                while (true) {
                    i9 = i42 + 1;
                    charAt7 = str.charAt(i42);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i43 |= (charAt7 & 8191) << i44;
                    i44 += 13;
                    i42 = i9;
                }
                charAt = i43 | (charAt7 << i44);
                i42 = i9;
            }
            int i45 = i42 + 1;
            charAt2 = str.charAt(i42);
            if (charAt2 >= 55296) {
                int i46 = charAt2 & 8191;
                int i47 = 13;
                while (true) {
                    i8 = i45 + 1;
                    charAt6 = str.charAt(i45);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i46 |= (charAt6 & 8191) << i47;
                    i47 += 13;
                    i45 = i8;
                }
                charAt2 = i46 | (charAt6 << i47);
                i45 = i8;
            }
            int i48 = i45 + 1;
            int charAt22 = str.charAt(i45);
            if (charAt22 >= 55296) {
                int i49 = charAt22 & 8191;
                int i50 = 13;
                while (true) {
                    i7 = i48 + 1;
                    charAt5 = str.charAt(i48);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i49 |= (charAt5 & 8191) << i50;
                    i50 += 13;
                    i48 = i7;
                }
                charAt22 = i49 | (charAt5 << i50);
                i48 = i7;
            }
            int i51 = i48 + 1;
            charAt3 = str.charAt(i48);
            if (charAt3 >= 55296) {
                int i52 = charAt3 & 8191;
                int i53 = i51;
                int i54 = 13;
                while (true) {
                    i6 = i53 + 1;
                    charAt4 = str.charAt(i53);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i52 |= (charAt4 & 8191) << i54;
                    i54 += 13;
                    i53 = i6;
                }
                charAt3 = i52 | (charAt4 << i54);
                i51 = i6;
            }
            int[] iArr2 = new int[charAt3 + charAt2 + charAt22];
            i2 = (charAt18 * 2) + charAt19;
            i3 = charAt20;
            i4 = charAt21;
            iArr = iArr2;
            i5 = charAt18;
            i27 = i51;
        }
        Unsafe unsafe = p;
        Object[] objArr = c2018uL.c;
        Class<?> cls = c2018uL.a.getClass();
        int i55 = i5;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt * 2];
        int i56 = charAt2 + charAt3;
        int i57 = i56;
        int i58 = charAt3;
        int i59 = 0;
        int i60 = 0;
        while (i27 < length) {
            int i61 = i27 + 1;
            int charAt23 = str.charAt(i27);
            int[] iArr4 = iArr3;
            if (charAt23 >= 55296) {
                int i62 = charAt23 & 8191;
                int i63 = i61;
                int i64 = 13;
                while (true) {
                    i24 = i63 + 1;
                    charAt15 = str.charAt(i63);
                    i14 = length;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i62 |= (charAt15 & 8191) << i64;
                    i64 += 13;
                    i63 = i24;
                    length = i14;
                }
                charAt23 = i62 | (charAt15 << i64);
                i15 = i24;
            } else {
                i14 = length;
                i15 = i61;
            }
            int i65 = i15 + 1;
            int charAt24 = str.charAt(i15);
            if (charAt24 >= 55296) {
                int i66 = charAt24 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i22 = i67 + 1;
                    charAt14 = str.charAt(i67);
                    i23 = i66;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i66 = i23 | ((charAt14 & 8191) << i68);
                    i68 += 13;
                    i67 = i22;
                }
                charAt24 = i23 | (charAt14 << i68);
                i16 = i22;
            } else {
                i16 = i65;
            }
            int i69 = charAt23;
            int i70 = charAt24 & 255;
            int i71 = i3;
            if ((charAt24 & 1024) != 0) {
                iArr[i59] = i60;
                i59++;
            }
            int i72 = i4;
            if (i70 >= 51) {
                int i73 = i16 + 1;
                int charAt25 = str.charAt(i16);
                char c = 55296;
                if (charAt25 >= 55296) {
                    int i74 = charAt25 & 8191;
                    int i75 = 13;
                    while (true) {
                        i21 = i73 + 1;
                        charAt13 = str.charAt(i73);
                        if (charAt13 < c) {
                            break;
                        }
                        i74 |= (charAt13 & 8191) << i75;
                        i75 += 13;
                        i73 = i21;
                        c = 55296;
                    }
                    charAt25 = i74 | (charAt13 << i75);
                    i73 = i21;
                }
                int i76 = i70 - 51;
                int i77 = charAt25;
                if (i76 == 9 || i76 == 17) {
                    i20 = i2 + 1;
                    objArr2[((i60 / 3) * 2) + 1] = objArr[i2];
                } else {
                    if (i76 == 12 && !z) {
                        i20 = i2 + 1;
                        objArr2[((i60 / 3) * 2) + 1] = objArr[i2];
                    }
                    int i78 = i77 * 2;
                    obj = objArr[i78];
                    if (obj instanceof Field) {
                        I2 = I(cls, (String) obj);
                        objArr[i78] = I2;
                    } else {
                        I2 = (Field) obj;
                    }
                    int i79 = i73;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(I2);
                    int i80 = i78 + 1;
                    obj2 = objArr[i80];
                    if (obj2 instanceof Field) {
                        I3 = I(cls, (String) obj2);
                        objArr[i80] = I3;
                    } else {
                        I3 = (Field) obj2;
                    }
                    i18 = i79;
                    objectFieldOffset = objectFieldOffset2;
                    i17 = (int) unsafe.objectFieldOffset(I3);
                    i19 = 0;
                }
                i2 = i20;
                int i782 = i77 * 2;
                obj = objArr[i782];
                if (obj instanceof Field) {
                }
                int i792 = i73;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(I2);
                int i802 = i782 + 1;
                obj2 = objArr[i802];
                if (obj2 instanceof Field) {
                }
                i18 = i792;
                objectFieldOffset = objectFieldOffset22;
                i17 = (int) unsafe.objectFieldOffset(I3);
                i19 = 0;
            } else {
                int i81 = i2 + 1;
                Field I4 = I(cls, (String) objArr[i2]);
                if (i70 == 9 || i70 == 17) {
                    objArr2[((i60 / 3) * 2) + 1] = I4.getType();
                } else {
                    if (i70 == 27 || i70 == 49) {
                        i2 += 2;
                        objArr2[((i60 / 3) * 2) + 1] = objArr[i81];
                    } else if (i70 == 12 || i70 == 30 || i70 == 44) {
                        if (!z) {
                            i2 += 2;
                            objArr2[((i60 / 3) * 2) + 1] = objArr[i81];
                        }
                    } else if (i70 == 50) {
                        int i82 = i58 + 1;
                        iArr[i58] = i60;
                        int i83 = (i60 / 3) * 2;
                        int i84 = i2 + 2;
                        objArr2[i83] = objArr[i81];
                        if ((charAt24 & 2048) != 0) {
                            objArr2[i83 + 1] = objArr[i84];
                            i2 += 3;
                        } else {
                            i2 = i84;
                        }
                        i58 = i82;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(I4);
                    if ((charAt24 & 4096) == 4096 || i70 > 17) {
                        i17 = 1048575;
                        i18 = i16;
                        i19 = 0;
                    } else {
                        int i85 = i16 + 1;
                        int charAt26 = str.charAt(i16);
                        if (charAt26 >= 55296) {
                            int i86 = charAt26 & 8191;
                            int i87 = 13;
                            while (true) {
                                i18 = i85 + 1;
                                charAt12 = str.charAt(i85);
                                if (charAt12 < 55296) {
                                    break;
                                }
                                i86 |= (charAt12 & 8191) << i87;
                                i87 += 13;
                                i85 = i18;
                            }
                            charAt26 = i86 | (charAt12 << i87);
                        } else {
                            i18 = i85;
                        }
                        int i88 = (charAt26 / 32) + (i55 * 2);
                        Object obj3 = objArr[i88];
                        if (obj3 instanceof Field) {
                            I = (Field) obj3;
                        } else {
                            I = I(cls, (String) obj3);
                            objArr[i88] = I;
                        }
                        i17 = (int) unsafe.objectFieldOffset(I);
                        i19 = charAt26 % 32;
                    }
                    if (i70 >= 18 && i70 <= 49) {
                        iArr[i57] = objectFieldOffset;
                        i57++;
                    }
                }
                i2 = i81;
                objectFieldOffset = (int) unsafe.objectFieldOffset(I4);
                if ((charAt24 & 4096) == 4096) {
                }
                i17 = 1048575;
                i18 = i16;
                i19 = 0;
                if (i70 >= 18) {
                    iArr[i57] = objectFieldOffset;
                    i57++;
                }
            }
            int i89 = i60 + 1;
            iArr4[i60] = i69;
            int i90 = i60 + 2;
            String str2 = str;
            iArr4[i89] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i70 << 20) | objectFieldOffset;
            i60 += 3;
            iArr4[i90] = (i19 << 20) | i17;
            str = str2;
            iArr3 = iArr4;
            i3 = i71;
            length = i14;
            i27 = i18;
            i4 = i72;
        }
        return new GC(iArr3, objArr2, i3, i4, c2018uL.a, z, iArr, charAt3, i56, c2143wE, abstractC1152hA, c0913dY, c1781ql, cb);
    }

    public static long B(int i) {
        return i & 1048575;
    }

    public static int C(long j, Object obj) {
        return ((Integer) AbstractC1768qY.c.i(j, obj)).intValue();
    }

    public static long D(long j, Object obj) {
        return ((Long) AbstractC1768qY.c.i(j, obj)).longValue();
    }

    public static Field I(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int N(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void R(int i, Object obj, Y1 y1) {
        if (!(obj instanceof String)) {
            y1.h0(i, (C1151h9) obj);
        } else {
            ((C0627Yb) y1.i).q0(i, (String) obj);
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2181wq) {
            return ((AbstractC2181wq) obj).g();
        }
        return true;
    }

    public static List t(AbstractC2181wq abstractC2181wq, long j) {
        return (List) AbstractC1768qY.c.i(j, abstractC2181wq);
    }

    public static GC z(C2018uL c2018uL, C2143wE c2143wE, AbstractC1152hA abstractC1152hA, C0913dY c0913dY, C1781ql c1781ql, CB cb) {
        if (c2018uL instanceof C2018uL) {
            return A(c2018uL, c2143wE, abstractC1152hA, c0913dY, c1781ql, cb);
        }
        c2018uL.getClass();
        throw new ClassCastException();
    }

    public final void E(Object obj, long j, C0575Wb c0575Wb, InterfaceC0839cQ interfaceC0839cQ, C1715pl c1715pl) {
        int u;
        List c = this.l.c(j, obj);
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) c0575Wb.d;
        int i = c0575Wb.a;
        if ((i & 7) != 3) {
            throw C0230It.b();
        }
        do {
            AbstractC2181wq h = interfaceC0839cQ.h();
            c0575Wb.d(h, interfaceC0839cQ, c1715pl);
            interfaceC0839cQ.d(h);
            c.add(h);
            if (abstractC0549Vb.c() || c0575Wb.c != 0) {
                return;
            } else {
                u = abstractC0549Vb.u();
            }
        } while (u == i);
        c0575Wb.c = u;
    }

    public final void F(Object obj, int i, C0575Wb c0575Wb, InterfaceC0839cQ interfaceC0839cQ, C1715pl c1715pl) {
        int u;
        List c = this.l.c(i & 1048575, obj);
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) c0575Wb.d;
        int i2 = c0575Wb.a;
        if ((i2 & 7) != 2) {
            throw C0230It.b();
        }
        do {
            AbstractC2181wq h = interfaceC0839cQ.h();
            c0575Wb.e(h, interfaceC0839cQ, c1715pl);
            interfaceC0839cQ.d(h);
            c.add(h);
            if (abstractC0549Vb.c() || c0575Wb.c != 0) {
                return;
            } else {
                u = abstractC0549Vb.u();
            }
        } while (u == i2);
        c0575Wb.c = u;
    }

    public final void G(Object obj, int i, C0575Wb c0575Wb) {
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) c0575Wb.d;
        if ((536870912 & i) != 0) {
            c0575Wb.y(2);
            AbstractC1768qY.p(i & 1048575, obj, abstractC0549Vb.t());
        } else if (!this.f) {
            AbstractC1768qY.p(i & 1048575, obj, c0575Wb.g());
        } else {
            c0575Wb.y(2);
            AbstractC1768qY.p(i & 1048575, obj, abstractC0549Vb.s());
        }
    }

    public final void H(Object obj, int i, C0575Wb c0575Wb) {
        int i2 = 536870912 & i;
        AbstractC1152hA abstractC1152hA = this.l;
        if (i2 != 0) {
            c0575Wb.u(abstractC1152hA.c(i & 1048575, obj), true);
        } else {
            c0575Wb.u(abstractC1152hA.c(i & 1048575, obj), false);
        }
    }

    public final void J(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        AbstractC1768qY.n(obj, j, (1 << (i2 >>> 20)) | AbstractC1768qY.c.g(j, obj));
    }

    public final void K(int i, int i2, Object obj) {
        AbstractC1768qY.n(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final void L(Object obj, int i, F f) {
        p.putObject(obj, O(i) & 1048575, f);
        J(i, obj);
    }

    public final void M(Object obj, int i, int i2, F f) {
        p.putObject(obj, O(i2) & 1048575, f);
        K(i, i2, obj);
    }

    public final int O(int i) {
        return this.a[i + 1];
    }

    public final void P(Object obj, Y1 y1) {
        int i;
        int i2;
        int i3;
        int[] iArr = this.a;
        int length = iArr.length;
        Unsafe unsafe = p;
        int i4 = 1048575;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 = i3 + 3) {
            int O = O(i6);
            int i7 = iArr[i6];
            int N = N(O);
            if (N <= 17) {
                int i8 = iArr[i6 + 2];
                i = 1048575;
                int i9 = i8 & 1048575;
                if (i9 != i4) {
                    i5 = unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i2 = 1 << (i8 >>> 20);
            } else {
                i = 1048575;
                i2 = 0;
            }
            int i10 = i6;
            long j = O & i;
            switch (N) {
                case 0:
                    i3 = i10;
                    if ((i2 & i5) == 0) {
                        break;
                    } else {
                        double e = AbstractC1768qY.c.e(j, obj);
                        C0627Yb c0627Yb = (C0627Yb) y1.i;
                        c0627Yb.getClass();
                        c0627Yb.l0(Double.doubleToRawLongBits(e), i7);
                        continue;
                    }
                case 1:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        float f = AbstractC1768qY.c.f(j, obj);
                        C0627Yb c0627Yb2 = (C0627Yb) y1.i;
                        c0627Yb2.getClass();
                        c0627Yb2.j0(i7, Float.floatToRawIntBits(f));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        ((C0627Yb) y1.i).v0(unsafe.getLong(obj, j), i7);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        ((C0627Yb) y1.i).v0(unsafe.getLong(obj, j), i7);
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        ((C0627Yb) y1.i).n0(i7, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        ((C0627Yb) y1.i).l0(unsafe.getLong(obj, j), i7);
                        break;
                    } else {
                        continue;
                    }
                case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        ((C0627Yb) y1.i).j0(i7, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        ((C0627Yb) y1.i).g0(i7, AbstractC1768qY.c.c(j, obj));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        R(i7, unsafe.getObject(obj, j), y1);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        ((C0627Yb) y1.i).p0(i7, (F) unsafe.getObject(obj, j), n(i3));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        y1.h0(i7, (C1151h9) unsafe.getObject(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        ((C0627Yb) y1.i).t0(i7, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        ((C0627Yb) y1.i).n0(i7, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        ((C0627Yb) y1.i).j0(i7, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        ((C0627Yb) y1.i).l0(unsafe.getLong(obj, j), i7);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        int i11 = unsafe.getInt(obj, j);
                        ((C0627Yb) y1.i).t0(i7, (i11 >> 31) ^ (i11 << 1));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        ((C0627Yb) y1.i).v0((j2 << 1) ^ (j2 >> 63), i7);
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    i3 = i10;
                    if ((i2 & i5) != 0) {
                        y1.i0(i7, unsafe.getObject(obj, j), n(i3));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    i3 = i10;
                    AbstractC1036fQ.B(iArr[i3], (List) unsafe.getObject(obj, j), y1, false);
                    continue;
                case 19:
                    i3 = i10;
                    AbstractC1036fQ.F(iArr[i3], (List) unsafe.getObject(obj, j), y1, false);
                    continue;
                case 20:
                    i3 = i10;
                    AbstractC1036fQ.I(iArr[i3], (List) unsafe.getObject(obj, j), y1, false);
                    continue;
                case 21:
                    i3 = i10;
                    AbstractC1036fQ.Q(iArr[i3], (List) unsafe.getObject(obj, j), y1, false);
                    continue;
                case 22:
                    i3 = i10;
                    AbstractC1036fQ.H(iArr[i3], (List) unsafe.getObject(obj, j), y1, false);
                    continue;
                case 23:
                    i3 = i10;
                    AbstractC1036fQ.E(iArr[i3], (List) unsafe.getObject(obj, j), y1, false);
                    continue;
                case 24:
                    i3 = i10;
                    AbstractC1036fQ.D(iArr[i3], (List) unsafe.getObject(obj, j), y1, false);
                    continue;
                case 25:
                    i3 = i10;
                    AbstractC1036fQ.z(iArr[i3], (List) unsafe.getObject(obj, j), y1, false);
                    continue;
                case 26:
                    i3 = i10;
                    AbstractC1036fQ.O(iArr[i3], (List) unsafe.getObject(obj, j), y1);
                    break;
                case 27:
                    i3 = i10;
                    AbstractC1036fQ.J(iArr[i3], (List) unsafe.getObject(obj, j), y1, n(i3));
                    break;
                case 28:
                    i3 = i10;
                    AbstractC1036fQ.A(iArr[i3], (List) unsafe.getObject(obj, j), y1);
                    break;
                case 29:
                    i3 = i10;
                    AbstractC1036fQ.P(iArr[i3], (List) unsafe.getObject(obj, j), y1, false);
                    break;
                case 30:
                    i3 = i10;
                    AbstractC1036fQ.C(iArr[i3], (List) unsafe.getObject(obj, j), y1, false);
                    continue;
                case 31:
                    i3 = i10;
                    AbstractC1036fQ.K(iArr[i3], (List) unsafe.getObject(obj, j), y1, false);
                    continue;
                case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                    i3 = i10;
                    AbstractC1036fQ.L(iArr[i3], (List) unsafe.getObject(obj, j), y1, false);
                    continue;
                case 33:
                    i3 = i10;
                    AbstractC1036fQ.M(iArr[i3], (List) unsafe.getObject(obj, j), y1, false);
                    continue;
                case 34:
                    i3 = i10;
                    AbstractC1036fQ.N(iArr[i3], (List) unsafe.getObject(obj, j), y1, false);
                    continue;
                case 35:
                    i3 = i10;
                    AbstractC1036fQ.B(iArr[i3], (List) unsafe.getObject(obj, j), y1, true);
                    break;
                case 36:
                    i3 = i10;
                    AbstractC1036fQ.F(iArr[i3], (List) unsafe.getObject(obj, j), y1, true);
                    break;
                case 37:
                    i3 = i10;
                    AbstractC1036fQ.I(iArr[i3], (List) unsafe.getObject(obj, j), y1, true);
                    break;
                case 38:
                    i3 = i10;
                    AbstractC1036fQ.Q(iArr[i3], (List) unsafe.getObject(obj, j), y1, true);
                    break;
                case 39:
                    i3 = i10;
                    AbstractC1036fQ.H(iArr[i3], (List) unsafe.getObject(obj, j), y1, true);
                    break;
                case 40:
                    i3 = i10;
                    AbstractC1036fQ.E(iArr[i3], (List) unsafe.getObject(obj, j), y1, true);
                    break;
                case 41:
                    i3 = i10;
                    AbstractC1036fQ.D(iArr[i3], (List) unsafe.getObject(obj, j), y1, true);
                    break;
                case 42:
                    i3 = i10;
                    AbstractC1036fQ.z(iArr[i3], (List) unsafe.getObject(obj, j), y1, true);
                    break;
                case 43:
                    i3 = i10;
                    AbstractC1036fQ.P(iArr[i3], (List) unsafe.getObject(obj, j), y1, true);
                    break;
                case 44:
                    i3 = i10;
                    AbstractC1036fQ.C(iArr[i3], (List) unsafe.getObject(obj, j), y1, true);
                    break;
                case 45:
                    i3 = i10;
                    AbstractC1036fQ.K(iArr[i3], (List) unsafe.getObject(obj, j), y1, true);
                    break;
                case 46:
                    i3 = i10;
                    AbstractC1036fQ.L(iArr[i3], (List) unsafe.getObject(obj, j), y1, true);
                    break;
                case 47:
                    i3 = i10;
                    AbstractC1036fQ.M(iArr[i3], (List) unsafe.getObject(obj, j), y1, true);
                    break;
                case 48:
                    i3 = i10;
                    AbstractC1036fQ.N(iArr[i3], (List) unsafe.getObject(obj, j), y1, true);
                    break;
                case 49:
                    i3 = i10;
                    AbstractC1036fQ.G(iArr[i3], (List) unsafe.getObject(obj, j), y1, n(i3));
                    break;
                case 50:
                    i3 = i10;
                    Q(y1, i7, unsafe.getObject(obj, j), i3);
                    break;
                case 51:
                    i3 = i10;
                    if (s(i7, i3, obj)) {
                        double doubleValue = ((Double) AbstractC1768qY.c.i(j, obj)).doubleValue();
                        C0627Yb c0627Yb3 = (C0627Yb) y1.i;
                        c0627Yb3.getClass();
                        c0627Yb3.l0(Double.doubleToRawLongBits(doubleValue), i7);
                        break;
                    }
                    break;
                case 52:
                    i3 = i10;
                    if (s(i7, i3, obj)) {
                        float floatValue = ((Float) AbstractC1768qY.c.i(j, obj)).floatValue();
                        C0627Yb c0627Yb4 = (C0627Yb) y1.i;
                        c0627Yb4.getClass();
                        c0627Yb4.j0(i7, Float.floatToRawIntBits(floatValue));
                        break;
                    }
                    break;
                case 53:
                    i3 = i10;
                    if (s(i7, i3, obj)) {
                        ((C0627Yb) y1.i).v0(D(j, obj), i7);
                        break;
                    }
                    break;
                case 54:
                    i3 = i10;
                    if (s(i7, i3, obj)) {
                        ((C0627Yb) y1.i).v0(D(j, obj), i7);
                        break;
                    }
                    break;
                case 55:
                    i3 = i10;
                    if (s(i7, i3, obj)) {
                        ((C0627Yb) y1.i).n0(i7, C(j, obj));
                        break;
                    }
                    break;
                case 56:
                    i3 = i10;
                    if (s(i7, i3, obj)) {
                        ((C0627Yb) y1.i).l0(D(j, obj), i7);
                        break;
                    }
                    break;
                case 57:
                    i3 = i10;
                    if (s(i7, i3, obj)) {
                        ((C0627Yb) y1.i).j0(i7, C(j, obj));
                        break;
                    }
                    break;
                case 58:
                    i3 = i10;
                    if (s(i7, i3, obj)) {
                        ((C0627Yb) y1.i).g0(i7, ((Boolean) AbstractC1768qY.c.i(j, obj)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    i3 = i10;
                    if (s(i7, i3, obj)) {
                        R(i7, unsafe.getObject(obj, j), y1);
                        break;
                    }
                    break;
                case 60:
                    i3 = i10;
                    if (s(i7, i3, obj)) {
                        ((C0627Yb) y1.i).p0(i7, (F) unsafe.getObject(obj, j), n(i3));
                        break;
                    }
                    break;
                case 61:
                    i3 = i10;
                    if (s(i7, i3, obj)) {
                        y1.h0(i7, (C1151h9) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    i3 = i10;
                    if (s(i7, i3, obj)) {
                        ((C0627Yb) y1.i).t0(i7, C(j, obj));
                        break;
                    }
                    break;
                case 63:
                    i3 = i10;
                    if (s(i7, i3, obj)) {
                        ((C0627Yb) y1.i).n0(i7, C(j, obj));
                        break;
                    }
                    break;
                case 64:
                    i3 = i10;
                    if (s(i7, i3, obj)) {
                        ((C0627Yb) y1.i).j0(i7, C(j, obj));
                        break;
                    }
                    break;
                case 65:
                    i3 = i10;
                    if (s(i7, i3, obj)) {
                        ((C0627Yb) y1.i).l0(D(j, obj), i7);
                        break;
                    }
                    break;
                case 66:
                    i3 = i10;
                    if (s(i7, i3, obj)) {
                        int C = C(j, obj);
                        ((C0627Yb) y1.i).t0(i7, (C >> 31) ^ (C << 1));
                        break;
                    }
                    break;
                case 67:
                    i3 = i10;
                    if (s(i7, i3, obj)) {
                        long D = D(j, obj);
                        ((C0627Yb) y1.i).v0((D << 1) ^ (D >> 63), i7);
                        break;
                    }
                    break;
                case 68:
                    i3 = i10;
                    if (s(i7, i3, obj)) {
                        y1.i0(i7, unsafe.getObject(obj, j), n(i3));
                        break;
                    }
                    break;
                default:
                    i3 = i10;
                    break;
            }
        }
        this.m.getClass();
        ((AbstractC2181wq) obj).unknownFields.d(y1);
    }

    public final void Q(Y1 y1, int i, Object obj, int i2) {
        if (obj != null) {
            Object m = m(i2);
            this.n.getClass();
            C0950e6 c0950e6 = ((AB) m).a;
            C0627Yb c0627Yb = (C0627Yb) y1.i;
            c0627Yb.getClass();
            for (Map.Entry entry : ((BB) obj).entrySet()) {
                c0627Yb.s0(i, 2);
                c0627Yb.u0(AB.a(c0950e6, entry.getKey(), entry.getValue()));
                Object key = entry.getKey();
                Object value = entry.getValue();
                C0403Pl.b(c0627Yb, (J10) c0950e6.i, 1, key);
                C0403Pl.b(c0627Yb, (J10) c0950e6.j, 2, value);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC0839cQ
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                AbstractC1036fQ.x(this.m, obj, obj2);
                return;
            }
            int O = O(i);
            long j = 1048575 & O;
            int i2 = iArr[i];
            switch (N(O)) {
                case 0:
                    if (q(i, obj2)) {
                        AbstractC1702pY abstractC1702pY = AbstractC1768qY.c;
                        obj3 = obj;
                        abstractC1702pY.m(obj3, j, abstractC1702pY.e(j, obj2));
                        J(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (q(i, obj2)) {
                        AbstractC1702pY abstractC1702pY2 = AbstractC1768qY.c;
                        abstractC1702pY2.n(obj, j, abstractC1702pY2.f(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (q(i, obj2)) {
                        AbstractC1768qY.o(obj, j, AbstractC1768qY.c.h(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (q(i, obj2)) {
                        AbstractC1768qY.o(obj, j, AbstractC1768qY.c.h(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (q(i, obj2)) {
                        AbstractC1768qY.n(obj, j, AbstractC1768qY.c.g(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    if (q(i, obj2)) {
                        AbstractC1768qY.o(obj, j, AbstractC1768qY.c.h(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (q(i, obj2)) {
                        AbstractC1768qY.n(obj, j, AbstractC1768qY.c.g(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (q(i, obj2)) {
                        AbstractC1702pY abstractC1702pY3 = AbstractC1768qY.c;
                        abstractC1702pY3.k(obj, j, abstractC1702pY3.c(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (q(i, obj2)) {
                        AbstractC1768qY.p(j, obj, AbstractC1768qY.c.i(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    v(obj, i, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (q(i, obj2)) {
                        AbstractC1768qY.p(j, obj, AbstractC1768qY.c.i(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (q(i, obj2)) {
                        AbstractC1768qY.n(obj, j, AbstractC1768qY.c.g(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (q(i, obj2)) {
                        AbstractC1768qY.n(obj, j, AbstractC1768qY.c.g(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (q(i, obj2)) {
                        AbstractC1768qY.n(obj, j, AbstractC1768qY.c.g(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (q(i, obj2)) {
                        AbstractC1768qY.o(obj, j, AbstractC1768qY.c.h(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (q(i, obj2)) {
                        AbstractC1768qY.n(obj, j, AbstractC1768qY.c.g(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (q(i, obj2)) {
                        AbstractC1768qY.o(obj, j, AbstractC1768qY.c.h(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    v(obj, i, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.l.b(j, obj, obj2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = AbstractC1036fQ.a;
                    AbstractC1702pY abstractC1702pY4 = AbstractC1768qY.c;
                    Object i3 = abstractC1702pY4.i(j, obj);
                    Object i4 = abstractC1702pY4.i(j, obj2);
                    this.n.getClass();
                    AbstractC1768qY.p(j, obj, CB.b(i3, i4));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (s(i2, i, obj2)) {
                        AbstractC1768qY.p(j, obj, AbstractC1768qY.c.i(j, obj2));
                        K(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    w(obj, i, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (s(i2, i, obj2)) {
                        AbstractC1768qY.p(j, obj, AbstractC1768qY.c.i(j, obj2));
                        K(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    w(obj, i, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (o.AbstractC1036fQ.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (o.AbstractC1036fQ.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (o.AbstractC1036fQ.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (o.AbstractC1036fQ.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.f(r7, r12)) == java.lang.Float.floatToIntBits(r5.f(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.e(r7, r12)) == java.lang.Double.doubleToLongBits(r5.e(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (o.AbstractC1036fQ.y(r9.i(r7, r12), r9.i(r7, r13)) != false) goto L105;
     */
    @Override // o.InterfaceC0839cQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(AbstractC2181wq abstractC2181wq, AbstractC2181wq abstractC2181wq2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int O = O(i);
                long j = O & 1048575;
                switch (N(O)) {
                    case 0:
                        if (j(abstractC2181wq, abstractC2181wq2, i)) {
                            AbstractC1702pY abstractC1702pY = AbstractC1768qY.c;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (j(abstractC2181wq, abstractC2181wq2, i)) {
                            AbstractC1702pY abstractC1702pY2 = AbstractC1768qY.c;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (j(abstractC2181wq, abstractC2181wq2, i)) {
                            AbstractC1702pY abstractC1702pY3 = AbstractC1768qY.c;
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (j(abstractC2181wq, abstractC2181wq2, i)) {
                            AbstractC1702pY abstractC1702pY4 = AbstractC1768qY.c;
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (j(abstractC2181wq, abstractC2181wq2, i)) {
                            AbstractC1702pY abstractC1702pY5 = AbstractC1768qY.c;
                            break;
                        }
                        z = false;
                        break;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                        if (j(abstractC2181wq, abstractC2181wq2, i)) {
                            AbstractC1702pY abstractC1702pY6 = AbstractC1768qY.c;
                            break;
                        }
                        z = false;
                        break;
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (j(abstractC2181wq, abstractC2181wq2, i)) {
                            AbstractC1702pY abstractC1702pY7 = AbstractC1768qY.c;
                            break;
                        }
                        z = false;
                        break;
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (j(abstractC2181wq, abstractC2181wq2, i)) {
                            AbstractC1702pY abstractC1702pY8 = AbstractC1768qY.c;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (j(abstractC2181wq, abstractC2181wq2, i)) {
                            AbstractC1702pY abstractC1702pY9 = AbstractC1768qY.c;
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (j(abstractC2181wq, abstractC2181wq2, i)) {
                            AbstractC1702pY abstractC1702pY10 = AbstractC1768qY.c;
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (j(abstractC2181wq, abstractC2181wq2, i)) {
                            AbstractC1702pY abstractC1702pY11 = AbstractC1768qY.c;
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (j(abstractC2181wq, abstractC2181wq2, i)) {
                            AbstractC1702pY abstractC1702pY12 = AbstractC1768qY.c;
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (j(abstractC2181wq, abstractC2181wq2, i)) {
                            AbstractC1702pY abstractC1702pY13 = AbstractC1768qY.c;
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (j(abstractC2181wq, abstractC2181wq2, i)) {
                            AbstractC1702pY abstractC1702pY14 = AbstractC1768qY.c;
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (j(abstractC2181wq, abstractC2181wq2, i)) {
                            AbstractC1702pY abstractC1702pY15 = AbstractC1768qY.c;
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (j(abstractC2181wq, abstractC2181wq2, i)) {
                            AbstractC1702pY abstractC1702pY16 = AbstractC1768qY.c;
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (j(abstractC2181wq, abstractC2181wq2, i)) {
                            AbstractC1702pY abstractC1702pY17 = AbstractC1768qY.c;
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (j(abstractC2181wq, abstractC2181wq2, i)) {
                            AbstractC1702pY abstractC1702pY18 = AbstractC1768qY.c;
                            break;
                        }
                        z = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        AbstractC1702pY abstractC1702pY19 = AbstractC1768qY.c;
                        z = AbstractC1036fQ.y(abstractC1702pY19.i(j, abstractC2181wq), abstractC1702pY19.i(j, abstractC2181wq2));
                        break;
                    case 50:
                        AbstractC1702pY abstractC1702pY20 = AbstractC1768qY.c;
                        z = AbstractC1036fQ.y(abstractC1702pY20.i(j, abstractC2181wq), abstractC1702pY20.i(j, abstractC2181wq2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        AbstractC1702pY abstractC1702pY21 = AbstractC1768qY.c;
                        if (abstractC1702pY21.g(j2, abstractC2181wq) == abstractC1702pY21.g(j2, abstractC2181wq2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                this.m.getClass();
                if (abstractC2181wq.unknownFields.equals(abstractC2181wq2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.InterfaceC0839cQ
    public final void c(Object obj, Y1 y1) {
        y1.getClass();
        C0627Yb c0627Yb = (C0627Yb) y1.i;
        if (!this.g) {
            P(obj, y1);
            return;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int O = O(i);
            int i2 = iArr[i];
            switch (N(O)) {
                case 0:
                    if (q(i, obj)) {
                        double e = AbstractC1768qY.c.e(O & 1048575, obj);
                        c0627Yb.getClass();
                        c0627Yb.l0(Double.doubleToRawLongBits(e), i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(i, obj)) {
                        float f = AbstractC1768qY.c.f(O & 1048575, obj);
                        c0627Yb.getClass();
                        c0627Yb.j0(i2, Float.floatToRawIntBits(f));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (q(i, obj)) {
                        c0627Yb.v0(AbstractC1768qY.c.h(O & 1048575, obj), i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(i, obj)) {
                        c0627Yb.v0(AbstractC1768qY.c.h(O & 1048575, obj), i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(i, obj)) {
                        c0627Yb.n0(i2, AbstractC1768qY.c.g(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    if (q(i, obj)) {
                        c0627Yb.l0(AbstractC1768qY.c.h(O & 1048575, obj), i2);
                        break;
                    } else {
                        break;
                    }
                case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (q(i, obj)) {
                        c0627Yb.j0(i2, AbstractC1768qY.c.g(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (q(i, obj)) {
                        c0627Yb.g0(i2, AbstractC1768qY.c.c(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (q(i, obj)) {
                        R(i2, AbstractC1768qY.c.i(O & 1048575, obj), y1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (q(i, obj)) {
                        c0627Yb.p0(i2, (F) AbstractC1768qY.c.i(O & 1048575, obj), n(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (q(i, obj)) {
                        y1.h0(i2, (C1151h9) AbstractC1768qY.c.i(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(i, obj)) {
                        c0627Yb.t0(i2, AbstractC1768qY.c.g(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(i, obj)) {
                        c0627Yb.n0(i2, AbstractC1768qY.c.g(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(i, obj)) {
                        c0627Yb.j0(i2, AbstractC1768qY.c.g(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (q(i, obj)) {
                        c0627Yb.l0(AbstractC1768qY.c.h(O & 1048575, obj), i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (q(i, obj)) {
                        int g = AbstractC1768qY.c.g(O & 1048575, obj);
                        c0627Yb.t0(i2, (g >> 31) ^ (g << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(i, obj)) {
                        long h = AbstractC1768qY.c.h(O & 1048575, obj);
                        c0627Yb.v0((h >> 63) ^ (h << 1), i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (q(i, obj)) {
                        y1.i0(i2, AbstractC1768qY.c.i(O & 1048575, obj), n(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    AbstractC1036fQ.B(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, false);
                    break;
                case 19:
                    AbstractC1036fQ.F(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, false);
                    break;
                case 20:
                    AbstractC1036fQ.I(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, false);
                    break;
                case 21:
                    AbstractC1036fQ.Q(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, false);
                    break;
                case 22:
                    AbstractC1036fQ.H(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, false);
                    break;
                case 23:
                    AbstractC1036fQ.E(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, false);
                    break;
                case 24:
                    AbstractC1036fQ.D(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, false);
                    break;
                case 25:
                    AbstractC1036fQ.z(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, false);
                    break;
                case 26:
                    AbstractC1036fQ.O(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1);
                    break;
                case 27:
                    AbstractC1036fQ.J(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, n(i));
                    break;
                case 28:
                    AbstractC1036fQ.A(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1);
                    break;
                case 29:
                    AbstractC1036fQ.P(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, false);
                    break;
                case 30:
                    AbstractC1036fQ.C(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, false);
                    break;
                case 31:
                    AbstractC1036fQ.K(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, false);
                    break;
                case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                    AbstractC1036fQ.L(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, false);
                    break;
                case 33:
                    AbstractC1036fQ.M(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, false);
                    break;
                case 34:
                    AbstractC1036fQ.N(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, false);
                    break;
                case 35:
                    AbstractC1036fQ.B(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, true);
                    break;
                case 36:
                    AbstractC1036fQ.F(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, true);
                    break;
                case 37:
                    AbstractC1036fQ.I(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, true);
                    break;
                case 38:
                    AbstractC1036fQ.Q(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, true);
                    break;
                case 39:
                    AbstractC1036fQ.H(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, true);
                    break;
                case 40:
                    AbstractC1036fQ.E(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, true);
                    break;
                case 41:
                    AbstractC1036fQ.D(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, true);
                    break;
                case 42:
                    AbstractC1036fQ.z(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, true);
                    break;
                case 43:
                    AbstractC1036fQ.P(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, true);
                    break;
                case 44:
                    AbstractC1036fQ.C(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, true);
                    break;
                case 45:
                    AbstractC1036fQ.K(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, true);
                    break;
                case 46:
                    AbstractC1036fQ.L(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, true);
                    break;
                case 47:
                    AbstractC1036fQ.M(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, true);
                    break;
                case 48:
                    AbstractC1036fQ.N(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, true);
                    break;
                case 49:
                    AbstractC1036fQ.G(iArr[i], (List) AbstractC1768qY.c.i(O & 1048575, obj), y1, n(i));
                    break;
                case 50:
                    Q(y1, i2, AbstractC1768qY.c.i(O & 1048575, obj), i);
                    break;
                case 51:
                    if (s(i2, i, obj)) {
                        double doubleValue = ((Double) AbstractC1768qY.c.i(O & 1048575, obj)).doubleValue();
                        c0627Yb.getClass();
                        c0627Yb.l0(Double.doubleToRawLongBits(doubleValue), i2);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(i2, i, obj)) {
                        float floatValue = ((Float) AbstractC1768qY.c.i(O & 1048575, obj)).floatValue();
                        c0627Yb.getClass();
                        c0627Yb.j0(i2, Float.floatToRawIntBits(floatValue));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(i2, i, obj)) {
                        c0627Yb.v0(D(O & 1048575, obj), i2);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(i2, i, obj)) {
                        c0627Yb.v0(D(O & 1048575, obj), i2);
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(i2, i, obj)) {
                        c0627Yb.n0(i2, C(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(i2, i, obj)) {
                        c0627Yb.l0(D(O & 1048575, obj), i2);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(i2, i, obj)) {
                        c0627Yb.j0(i2, C(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(i2, i, obj)) {
                        c0627Yb.g0(i2, ((Boolean) AbstractC1768qY.c.i(O & 1048575, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (s(i2, i, obj)) {
                        R(i2, AbstractC1768qY.c.i(O & 1048575, obj), y1);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (s(i2, i, obj)) {
                        c0627Yb.p0(i2, (F) AbstractC1768qY.c.i(O & 1048575, obj), n(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i2, i, obj)) {
                        y1.h0(i2, (C1151h9) AbstractC1768qY.c.i(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i2, i, obj)) {
                        c0627Yb.t0(i2, C(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i2, i, obj)) {
                        c0627Yb.n0(i2, C(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(i2, i, obj)) {
                        c0627Yb.j0(i2, C(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(i2, i, obj)) {
                        c0627Yb.l0(D(O & 1048575, obj), i2);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(i2, i, obj)) {
                        int C = C(O & 1048575, obj);
                        c0627Yb.t0(i2, (C >> 31) ^ (C << 1));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i2, i, obj)) {
                        long D = D(O & 1048575, obj);
                        c0627Yb.v0((D >> 63) ^ (D << 1), i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i2, i, obj)) {
                        y1.i0(i2, AbstractC1768qY.c.i(O & 1048575, obj), n(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.m.getClass();
        ((AbstractC2181wq) obj).unknownFields.d(y1);
    }

    @Override // o.InterfaceC0839cQ
    public final void d(Object obj) {
        if (r(obj)) {
            if (obj instanceof AbstractC2181wq) {
                AbstractC2181wq abstractC2181wq = (AbstractC2181wq) obj;
                abstractC2181wq.k(Integer.MAX_VALUE);
                abstractC2181wq.memoizedHashCode = 0;
                abstractC2181wq.h();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int O = O(i);
                long j = 1048575 & O;
                int N = N(O);
                if (N != 9) {
                    if (N != 60 && N != 68) {
                        switch (N) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.l.a(j, obj);
                                break;
                            case 50:
                                Unsafe unsafe = p;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.n.getClass();
                                    ((BB) object).h = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (s(iArr[i], i, obj)) {
                        n(i).d(p.getObject(obj, j));
                    }
                }
                if (q(i, obj)) {
                    n(i).d(p.getObject(obj, j));
                }
            }
            this.m.getClass();
            ((AbstractC2181wq) obj).unknownFields.e = false;
        }
    }

    @Override // o.InterfaceC0839cQ
    public final boolean e(Object obj) {
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            boolean z = true;
            if (i2 >= this.i) {
                return true;
            }
            int i4 = this.h[i2];
            int[] iArr = this.a;
            int i5 = iArr[i4];
            int O = O(i4);
            int i6 = iArr[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i) {
                if (i7 != 1048575) {
                    i3 = p.getInt(obj, i7);
                }
                i = i7;
            }
            if ((268435456 & O) != 0) {
                if (!(i == 1048575 ? q(i4, obj) : (i3 & i8) != 0)) {
                    break;
                }
            }
            int N = N(O);
            if (N == 9 || N == 17) {
                if (i == 1048575) {
                    z = q(i4, obj);
                } else if ((i8 & i3) == 0) {
                    z = false;
                }
                if (z) {
                    if (!n(i4).e(AbstractC1768qY.c.i(O & 1048575, obj))) {
                        break;
                    }
                } else {
                    continue;
                }
                i2++;
            } else {
                if (N != 27) {
                    if (N == 60 || N == 68) {
                        if (s(i5, i4, obj)) {
                            if (!n(i4).e(AbstractC1768qY.c.i(O & 1048575, obj))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                        i2++;
                    } else if (N != 49) {
                        if (N == 50) {
                            Object i9 = AbstractC1768qY.c.i(O & 1048575, obj);
                            this.n.getClass();
                            BB bb = (BB) i9;
                            if (!bb.isEmpty() && ((J10) ((AB) m(i4)).a.j).h == L10.MESSAGE) {
                                InterfaceC0839cQ interfaceC0839cQ = null;
                                for (Object obj2 : bb.values()) {
                                    if (interfaceC0839cQ == null) {
                                        interfaceC0839cQ = C1229iL.c.a(obj2.getClass());
                                    }
                                    if (!interfaceC0839cQ.e(obj2)) {
                                        break loop0;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                        i2++;
                    }
                }
                List list = (List) AbstractC1768qY.c.i(O & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC0839cQ n = n(i4);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!n.e(list.get(i10))) {
                            break loop0;
                        }
                    }
                }
                i2++;
            }
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // o.InterfaceC0839cQ
    public final void f(java.lang.Object r19, o.C0575Wb r20, o.C1715pl r21) {
        /*
            Method dump skipped, instructions count: 1856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GC.f(java.lang.Object, o.Wb, o.pl):void");
    }

    @Override // o.InterfaceC0839cQ
    public final int g(AbstractC2181wq abstractC2181wq) {
        return this.g ? p(abstractC2181wq) : o(abstractC2181wq);
    }

    @Override // o.InterfaceC0839cQ
    public final AbstractC2181wq h() {
        this.k.getClass();
        return ((AbstractC2181wq) this.e).i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    @Override // o.InterfaceC0839cQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(AbstractC2181wq abstractC2181wq) {
        int i;
        int b;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int O = O(i4);
            int i5 = iArr[i4];
            long j = 1048575 & O;
            int i6 = 1237;
            int i7 = 37;
            switch (N(O)) {
                case 0:
                    i = i3 * 53;
                    b = AbstractC2052ut.b(Double.doubleToLongBits(AbstractC1768qY.c.e(j, abstractC2181wq)));
                    i3 = b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    b = Float.floatToIntBits(AbstractC1768qY.c.f(j, abstractC2181wq));
                    i3 = b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    b = AbstractC2052ut.b(AbstractC1768qY.c.h(j, abstractC2181wq));
                    i3 = b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    b = AbstractC2052ut.b(AbstractC1768qY.c.h(j, abstractC2181wq));
                    i3 = b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    b = AbstractC1768qY.c.g(j, abstractC2181wq);
                    i3 = b + i;
                    break;
                case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    i = i3 * 53;
                    b = AbstractC2052ut.b(AbstractC1768qY.c.h(j, abstractC2181wq));
                    i3 = b + i;
                    break;
                case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    i = i3 * 53;
                    b = AbstractC1768qY.c.g(j, abstractC2181wq);
                    i3 = b + i;
                    break;
                case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    i2 = i3 * 53;
                    boolean c = AbstractC1768qY.c.c(j, abstractC2181wq);
                    Charset charset = AbstractC2052ut.a;
                    break;
                case 8:
                    i = i3 * 53;
                    b = ((String) AbstractC1768qY.c.i(j, abstractC2181wq)).hashCode();
                    i3 = b + i;
                    break;
                case 9:
                    Object i8 = AbstractC1768qY.c.i(j, abstractC2181wq);
                    if (i8 != null) {
                        i7 = i8.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    b = AbstractC1768qY.c.i(j, abstractC2181wq).hashCode();
                    i3 = b + i;
                    break;
                case 11:
                    i = i3 * 53;
                    b = AbstractC1768qY.c.g(j, abstractC2181wq);
                    i3 = b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    b = AbstractC1768qY.c.g(j, abstractC2181wq);
                    i3 = b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    b = AbstractC1768qY.c.g(j, abstractC2181wq);
                    i3 = b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    b = AbstractC2052ut.b(AbstractC1768qY.c.h(j, abstractC2181wq));
                    i3 = b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    b = AbstractC1768qY.c.g(j, abstractC2181wq);
                    i3 = b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    b = AbstractC2052ut.b(AbstractC1768qY.c.h(j, abstractC2181wq));
                    i3 = b + i;
                    break;
                case 17:
                    Object i9 = AbstractC1768qY.c.i(j, abstractC2181wq);
                    if (i9 != null) {
                        i7 = i9.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    b = AbstractC1768qY.c.i(j, abstractC2181wq).hashCode();
                    i3 = b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    b = AbstractC1768qY.c.i(j, abstractC2181wq).hashCode();
                    i3 = b + i;
                    break;
                case 51:
                    if (s(i5, i4, abstractC2181wq)) {
                        i = i3 * 53;
                        b = AbstractC2052ut.b(Double.doubleToLongBits(((Double) AbstractC1768qY.c.i(j, abstractC2181wq)).doubleValue()));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(i5, i4, abstractC2181wq)) {
                        i = i3 * 53;
                        b = Float.floatToIntBits(((Float) AbstractC1768qY.c.i(j, abstractC2181wq)).floatValue());
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(i5, i4, abstractC2181wq)) {
                        i = i3 * 53;
                        b = AbstractC2052ut.b(D(j, abstractC2181wq));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(i5, i4, abstractC2181wq)) {
                        i = i3 * 53;
                        b = AbstractC2052ut.b(D(j, abstractC2181wq));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(i5, i4, abstractC2181wq)) {
                        i = i3 * 53;
                        b = C(j, abstractC2181wq);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(i5, i4, abstractC2181wq)) {
                        i = i3 * 53;
                        b = AbstractC2052ut.b(D(j, abstractC2181wq));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(i5, i4, abstractC2181wq)) {
                        i = i3 * 53;
                        b = C(j, abstractC2181wq);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(i5, i4, abstractC2181wq)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) AbstractC1768qY.c.i(j, abstractC2181wq)).booleanValue();
                        Charset charset2 = AbstractC2052ut.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (s(i5, i4, abstractC2181wq)) {
                        i = i3 * 53;
                        b = ((String) AbstractC1768qY.c.i(j, abstractC2181wq)).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (s(i5, i4, abstractC2181wq)) {
                        i = i3 * 53;
                        b = AbstractC1768qY.c.i(j, abstractC2181wq).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i5, i4, abstractC2181wq)) {
                        i = i3 * 53;
                        b = AbstractC1768qY.c.i(j, abstractC2181wq).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i5, i4, abstractC2181wq)) {
                        i = i3 * 53;
                        b = C(j, abstractC2181wq);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i5, i4, abstractC2181wq)) {
                        i = i3 * 53;
                        b = C(j, abstractC2181wq);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(i5, i4, abstractC2181wq)) {
                        i = i3 * 53;
                        b = C(j, abstractC2181wq);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(i5, i4, abstractC2181wq)) {
                        i = i3 * 53;
                        b = AbstractC2052ut.b(D(j, abstractC2181wq));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(i5, i4, abstractC2181wq)) {
                        i = i3 * 53;
                        b = C(j, abstractC2181wq);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i5, i4, abstractC2181wq)) {
                        i = i3 * 53;
                        b = AbstractC2052ut.b(D(j, abstractC2181wq));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i5, i4, abstractC2181wq)) {
                        i = i3 * 53;
                        b = AbstractC1768qY.c.i(j, abstractC2181wq).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.m.getClass();
        return abstractC2181wq.unknownFields.hashCode() + (i3 * 53);
    }

    public final boolean j(AbstractC2181wq abstractC2181wq, AbstractC2181wq abstractC2181wq2, int i) {
        return q(i, abstractC2181wq) == q(i, abstractC2181wq2);
    }

    public final void k(Object obj, int i, Object obj2) {
        int i2 = this.a[i];
        if (AbstractC1768qY.c.i(O(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final Object m(int i) {
        return this.b[(i / 3) * 2];
    }

    public final InterfaceC0839cQ n(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        InterfaceC0839cQ interfaceC0839cQ = (InterfaceC0839cQ) objArr[i2];
        if (interfaceC0839cQ != null) {
            return interfaceC0839cQ;
        }
        InterfaceC0839cQ a = C1229iL.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final int o(AbstractC2181wq abstractC2181wq) {
        int i;
        int Z;
        int b0;
        int Z2;
        int X;
        int V;
        int Z3;
        int Y;
        int S;
        int Z4;
        int a;
        int g;
        int Z5;
        int i2;
        Unsafe unsafe = p;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i5 >= iArr.length) {
                this.m.getClass();
                return abstractC2181wq.unknownFields.b() + i6;
            }
            int O = O(i5);
            int i8 = iArr[i5];
            int N = N(O);
            if (N <= 17) {
                int i9 = iArr[i5 + 2];
                int i10 = i9 & i3;
                i = 1 << (i9 >>> 20);
                if (i10 != i4) {
                    i7 = unsafe.getInt(abstractC2181wq, i10);
                    i4 = i10;
                }
            } else {
                i = 0;
            }
            long j = O & i3;
            switch (N) {
                case 0:
                    if ((i7 & i) == 0) {
                        break;
                    }
                    i6 = AbstractC2188wx.e(i8, 8, i6);
                    break;
                case 1:
                    if ((i7 & i) == 0) {
                        break;
                    }
                    i6 = AbstractC2188wx.e(i8, 4, i6);
                    break;
                case 2:
                    if ((i & i7) != 0) {
                        long j2 = unsafe.getLong(abstractC2181wq, j);
                        Z = C0627Yb.Z(i8);
                        b0 = C0627Yb.b0(j2);
                        V = b0 + Z;
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i & i7) != 0) {
                        long j3 = unsafe.getLong(abstractC2181wq, j);
                        Z = C0627Yb.Z(i8);
                        b0 = C0627Yb.b0(j3);
                        V = b0 + Z;
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i & i7) != 0) {
                        int i11 = unsafe.getInt(abstractC2181wq, j);
                        Z2 = C0627Yb.Z(i8);
                        X = C0627Yb.X(i11);
                        V = X + Z2;
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    if ((i7 & i) != 0) {
                        V = C0627Yb.V(i8);
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    if ((i7 & i) != 0) {
                        V = C0627Yb.U(i8);
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ((i7 & i) == 0) {
                        break;
                    }
                    i6 = AbstractC2188wx.e(i8, 1, i6);
                    break;
                case 8:
                    if ((i & i7) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC2181wq, j);
                        if (object instanceof C1151h9) {
                            S = C0627Yb.S(i8, (C1151h9) object);
                            i6 = S + i6;
                            break;
                        } else {
                            Z3 = C0627Yb.Z(i8);
                            Y = C0627Yb.Y((String) object);
                            S = Y + Z3;
                            i6 = S + i6;
                        }
                    }
                case 9:
                    if ((i & i7) != 0) {
                        Object object2 = unsafe.getObject(abstractC2181wq, j);
                        InterfaceC0839cQ n = n(i5);
                        Class cls = AbstractC1036fQ.a;
                        Z4 = C0627Yb.Z(i8);
                        a = ((F) object2).a(n);
                        i6 = AbstractC2188wx.f(a, a, Z4, i6);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i & i7) != 0) {
                        V = C0627Yb.S(i8, (C1151h9) unsafe.getObject(abstractC2181wq, j));
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i & i7) != 0) {
                        int i12 = unsafe.getInt(abstractC2181wq, j);
                        Z2 = C0627Yb.Z(i8);
                        X = C0627Yb.a0(i12);
                        V = X + Z2;
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i & i7) != 0) {
                        int i13 = unsafe.getInt(abstractC2181wq, j);
                        Z2 = C0627Yb.Z(i8);
                        X = C0627Yb.X(i13);
                        V = X + Z2;
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i7 & i) == 0) {
                        break;
                    }
                    i6 = AbstractC2188wx.e(i8, 4, i6);
                    break;
                case 14:
                    if ((i7 & i) == 0) {
                        break;
                    }
                    i6 = AbstractC2188wx.e(i8, 8, i6);
                    break;
                case 15:
                    if ((i & i7) != 0) {
                        int i14 = unsafe.getInt(abstractC2181wq, j);
                        Z2 = C0627Yb.Z(i8);
                        X = C0627Yb.a0((i14 >> 31) ^ (i14 << 1));
                        V = X + Z2;
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i & i7) != 0) {
                        long j4 = unsafe.getLong(abstractC2181wq, j);
                        Z = C0627Yb.Z(i8);
                        b0 = C0627Yb.b0((j4 >> 63) ^ (j4 << 1));
                        V = b0 + Z;
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i & i7) != 0) {
                        V = C0627Yb.W(i8, (F) unsafe.getObject(abstractC2181wq, j), n(i5));
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    V = AbstractC1036fQ.f(i8, (List) unsafe.getObject(abstractC2181wq, j));
                    i6 += V;
                    break;
                case 19:
                    V = AbstractC1036fQ.d(i8, (List) unsafe.getObject(abstractC2181wq, j));
                    i6 += V;
                    break;
                case 20:
                    V = AbstractC1036fQ.j(i8, (List) unsafe.getObject(abstractC2181wq, j));
                    i6 += V;
                    break;
                case 21:
                    V = AbstractC1036fQ.t(i8, (List) unsafe.getObject(abstractC2181wq, j));
                    i6 += V;
                    break;
                case 22:
                    V = AbstractC1036fQ.h(i8, (List) unsafe.getObject(abstractC2181wq, j));
                    i6 += V;
                    break;
                case 23:
                    V = AbstractC1036fQ.f(i8, (List) unsafe.getObject(abstractC2181wq, j));
                    i6 += V;
                    break;
                case 24:
                    V = AbstractC1036fQ.d(i8, (List) unsafe.getObject(abstractC2181wq, j));
                    i6 += V;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(abstractC2181wq, j);
                    Class cls2 = AbstractC1036fQ.a;
                    int size = list.size();
                    i6 += size == 0 ? 0 : (C0627Yb.Z(i8) + 1) * size;
                    break;
                case 26:
                    V = AbstractC1036fQ.q(i8, (List) unsafe.getObject(abstractC2181wq, j));
                    i6 += V;
                    break;
                case 27:
                    V = AbstractC1036fQ.l(i8, (List) unsafe.getObject(abstractC2181wq, j), n(i5));
                    i6 += V;
                    break;
                case 28:
                    V = AbstractC1036fQ.a(i8, (List) unsafe.getObject(abstractC2181wq, j));
                    i6 += V;
                    break;
                case 29:
                    V = AbstractC1036fQ.r(i8, (List) unsafe.getObject(abstractC2181wq, j));
                    i6 += V;
                    break;
                case 30:
                    V = AbstractC1036fQ.b(i8, (List) unsafe.getObject(abstractC2181wq, j));
                    i6 += V;
                    break;
                case 31:
                    V = AbstractC1036fQ.d(i8, (List) unsafe.getObject(abstractC2181wq, j));
                    i6 += V;
                    break;
                case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                    V = AbstractC1036fQ.f(i8, (List) unsafe.getObject(abstractC2181wq, j));
                    i6 += V;
                    break;
                case 33:
                    V = AbstractC1036fQ.m(i8, (List) unsafe.getObject(abstractC2181wq, j));
                    i6 += V;
                    break;
                case 34:
                    V = AbstractC1036fQ.o(i8, (List) unsafe.getObject(abstractC2181wq, j));
                    i6 += V;
                    break;
                case 35:
                    g = AbstractC1036fQ.g((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z5 = C0627Yb.Z(i8);
                        i6 = AbstractC2188wx.f(g, Z5, g, i6);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    g = AbstractC1036fQ.e((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z5 = C0627Yb.Z(i8);
                        i6 = AbstractC2188wx.f(g, Z5, g, i6);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    g = AbstractC1036fQ.k((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z5 = C0627Yb.Z(i8);
                        i6 = AbstractC2188wx.f(g, Z5, g, i6);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    g = AbstractC1036fQ.u((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z5 = C0627Yb.Z(i8);
                        i6 = AbstractC2188wx.f(g, Z5, g, i6);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    g = AbstractC1036fQ.i((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z5 = C0627Yb.Z(i8);
                        i6 = AbstractC2188wx.f(g, Z5, g, i6);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    g = AbstractC1036fQ.g((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z5 = C0627Yb.Z(i8);
                        i6 = AbstractC2188wx.f(g, Z5, g, i6);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    g = AbstractC1036fQ.e((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z5 = C0627Yb.Z(i8);
                        i6 = AbstractC2188wx.f(g, Z5, g, i6);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list2 = (List) unsafe.getObject(abstractC2181wq, j);
                    Class cls3 = AbstractC1036fQ.a;
                    g = list2.size();
                    if (g > 0) {
                        Z5 = C0627Yb.Z(i8);
                        i6 = AbstractC2188wx.f(g, Z5, g, i6);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    g = AbstractC1036fQ.s((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z5 = C0627Yb.Z(i8);
                        i6 = AbstractC2188wx.f(g, Z5, g, i6);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    g = AbstractC1036fQ.c((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z5 = C0627Yb.Z(i8);
                        i6 = AbstractC2188wx.f(g, Z5, g, i6);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    g = AbstractC1036fQ.e((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z5 = C0627Yb.Z(i8);
                        i6 = AbstractC2188wx.f(g, Z5, g, i6);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    g = AbstractC1036fQ.g((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z5 = C0627Yb.Z(i8);
                        i6 = AbstractC2188wx.f(g, Z5, g, i6);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    g = AbstractC1036fQ.n((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z5 = C0627Yb.Z(i8);
                        i6 = AbstractC2188wx.f(g, Z5, g, i6);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    g = AbstractC1036fQ.p((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z5 = C0627Yb.Z(i8);
                        i6 = AbstractC2188wx.f(g, Z5, g, i6);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list3 = (List) unsafe.getObject(abstractC2181wq, j);
                    InterfaceC0839cQ n2 = n(i5);
                    Class cls4 = AbstractC1036fQ.a;
                    int size2 = list3.size();
                    if (size2 == 0) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        for (int i15 = 0; i15 < size2; i15++) {
                            i2 += C0627Yb.W(i8, (F) list3.get(i15), n2);
                        }
                    }
                    i6 += i2;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC2181wq, j);
                    Object m = m(i5);
                    this.n.getClass();
                    V = CB.a(object3, i8, m);
                    i6 += V;
                    break;
                case 51:
                    if (!s(i8, i5, abstractC2181wq)) {
                        break;
                    }
                    i6 = AbstractC2188wx.e(i8, 8, i6);
                    break;
                case 52:
                    if (!s(i8, i5, abstractC2181wq)) {
                        break;
                    }
                    i6 = AbstractC2188wx.e(i8, 4, i6);
                    break;
                case 53:
                    if (s(i8, i5, abstractC2181wq)) {
                        long D = D(j, abstractC2181wq);
                        Z = C0627Yb.Z(i8);
                        b0 = C0627Yb.b0(D);
                        V = b0 + Z;
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(i8, i5, abstractC2181wq)) {
                        long D2 = D(j, abstractC2181wq);
                        Z = C0627Yb.Z(i8);
                        b0 = C0627Yb.b0(D2);
                        V = b0 + Z;
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(i8, i5, abstractC2181wq)) {
                        int C = C(j, abstractC2181wq);
                        Z2 = C0627Yb.Z(i8);
                        X = C0627Yb.X(C);
                        V = X + Z2;
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(i8, i5, abstractC2181wq)) {
                        V = C0627Yb.V(i8);
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(i8, i5, abstractC2181wq)) {
                        V = C0627Yb.U(i8);
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (!s(i8, i5, abstractC2181wq)) {
                        break;
                    }
                    i6 = AbstractC2188wx.e(i8, 1, i6);
                    break;
                case 59:
                    if (!s(i8, i5, abstractC2181wq)) {
                        break;
                    } else {
                        Object object4 = unsafe.getObject(abstractC2181wq, j);
                        if (object4 instanceof C1151h9) {
                            S = C0627Yb.S(i8, (C1151h9) object4);
                            i6 = S + i6;
                            break;
                        } else {
                            Z3 = C0627Yb.Z(i8);
                            Y = C0627Yb.Y((String) object4);
                            S = Y + Z3;
                            i6 = S + i6;
                        }
                    }
                case 60:
                    if (s(i8, i5, abstractC2181wq)) {
                        Object object5 = unsafe.getObject(abstractC2181wq, j);
                        InterfaceC0839cQ n3 = n(i5);
                        Class cls5 = AbstractC1036fQ.a;
                        Z4 = C0627Yb.Z(i8);
                        a = ((F) object5).a(n3);
                        i6 = AbstractC2188wx.f(a, a, Z4, i6);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i8, i5, abstractC2181wq)) {
                        V = C0627Yb.S(i8, (C1151h9) unsafe.getObject(abstractC2181wq, j));
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i8, i5, abstractC2181wq)) {
                        int C2 = C(j, abstractC2181wq);
                        Z2 = C0627Yb.Z(i8);
                        X = C0627Yb.a0(C2);
                        V = X + Z2;
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i8, i5, abstractC2181wq)) {
                        int C3 = C(j, abstractC2181wq);
                        Z2 = C0627Yb.Z(i8);
                        X = C0627Yb.X(C3);
                        V = X + Z2;
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (!s(i8, i5, abstractC2181wq)) {
                        break;
                    }
                    i6 = AbstractC2188wx.e(i8, 4, i6);
                    break;
                case 65:
                    if (!s(i8, i5, abstractC2181wq)) {
                        break;
                    }
                    i6 = AbstractC2188wx.e(i8, 8, i6);
                    break;
                case 66:
                    if (s(i8, i5, abstractC2181wq)) {
                        int C4 = C(j, abstractC2181wq);
                        Z2 = C0627Yb.Z(i8);
                        X = C0627Yb.a0((C4 >> 31) ^ (C4 << 1));
                        V = X + Z2;
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i8, i5, abstractC2181wq)) {
                        long D3 = D(j, abstractC2181wq);
                        Z = C0627Yb.Z(i8);
                        b0 = C0627Yb.b0((D3 >> 63) ^ (D3 << 1));
                        V = b0 + Z;
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i8, i5, abstractC2181wq)) {
                        V = C0627Yb.W(i8, (F) unsafe.getObject(abstractC2181wq, j), n(i5));
                        i6 += V;
                        break;
                    } else {
                        break;
                    }
            }
            i5 += 3;
            i3 = 1048575;
        }
    }

    public final int p(AbstractC2181wq abstractC2181wq) {
        int Z;
        int b0;
        int Z2;
        int X;
        int V;
        int Z3;
        int Y;
        int S;
        int Z4;
        int a;
        int Z5;
        int b02;
        int g;
        int Z6;
        int i;
        Unsafe unsafe = p;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                this.m.getClass();
                return abstractC2181wq.unknownFields.b() + i3;
            }
            int O = O(i2);
            int N = N(O);
            int i4 = iArr[i2];
            long j = O & 1048575;
            if (N >= EnumC0429Ql.i.h && N <= EnumC0429Ql.j.h) {
                int i5 = iArr[i2 + 2];
            }
            switch (N) {
                case 0:
                    if (!q(i2, abstractC2181wq)) {
                        break;
                    }
                    i3 = AbstractC2188wx.e(i4, 8, i3);
                    break;
                case 1:
                    if (!q(i2, abstractC2181wq)) {
                        break;
                    }
                    i3 = AbstractC2188wx.e(i4, 4, i3);
                    break;
                case 2:
                    if (q(i2, abstractC2181wq)) {
                        long h = AbstractC1768qY.c.h(j, abstractC2181wq);
                        Z = C0627Yb.Z(i4);
                        b0 = C0627Yb.b0(h);
                        V = b0 + Z;
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(i2, abstractC2181wq)) {
                        long h2 = AbstractC1768qY.c.h(j, abstractC2181wq);
                        Z = C0627Yb.Z(i4);
                        b0 = C0627Yb.b0(h2);
                        V = b0 + Z;
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(i2, abstractC2181wq)) {
                        int g2 = AbstractC1768qY.c.g(j, abstractC2181wq);
                        Z2 = C0627Yb.Z(i4);
                        X = C0627Yb.X(g2);
                        V = X + Z2;
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    if (q(i2, abstractC2181wq)) {
                        V = C0627Yb.V(i4);
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (q(i2, abstractC2181wq)) {
                        V = C0627Yb.U(i4);
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!q(i2, abstractC2181wq)) {
                        break;
                    }
                    i3 = AbstractC2188wx.e(i4, 1, i3);
                    break;
                case 8:
                    if (!q(i2, abstractC2181wq)) {
                        break;
                    } else {
                        Object i6 = AbstractC1768qY.c.i(j, abstractC2181wq);
                        if (i6 instanceof C1151h9) {
                            S = C0627Yb.S(i4, (C1151h9) i6);
                            i3 = S + i3;
                            break;
                        } else {
                            Z3 = C0627Yb.Z(i4);
                            Y = C0627Yb.Y((String) i6);
                            S = Y + Z3;
                            i3 = S + i3;
                        }
                    }
                case 9:
                    if (q(i2, abstractC2181wq)) {
                        Object i7 = AbstractC1768qY.c.i(j, abstractC2181wq);
                        InterfaceC0839cQ n = n(i2);
                        Class cls = AbstractC1036fQ.a;
                        Z4 = C0627Yb.Z(i4);
                        a = ((F) i7).a(n);
                        i3 = AbstractC2188wx.f(a, a, Z4, i3);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (q(i2, abstractC2181wq)) {
                        V = C0627Yb.S(i4, (C1151h9) AbstractC1768qY.c.i(j, abstractC2181wq));
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(i2, abstractC2181wq)) {
                        int g3 = AbstractC1768qY.c.g(j, abstractC2181wq);
                        Z2 = C0627Yb.Z(i4);
                        X = C0627Yb.a0(g3);
                        V = X + Z2;
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(i2, abstractC2181wq)) {
                        int g4 = AbstractC1768qY.c.g(j, abstractC2181wq);
                        Z2 = C0627Yb.Z(i4);
                        X = C0627Yb.X(g4);
                        V = X + Z2;
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (!q(i2, abstractC2181wq)) {
                        break;
                    }
                    i3 = AbstractC2188wx.e(i4, 4, i3);
                    break;
                case 14:
                    if (!q(i2, abstractC2181wq)) {
                        break;
                    }
                    i3 = AbstractC2188wx.e(i4, 8, i3);
                    break;
                case 15:
                    if (q(i2, abstractC2181wq)) {
                        int g5 = AbstractC1768qY.c.g(j, abstractC2181wq);
                        Z2 = C0627Yb.Z(i4);
                        X = C0627Yb.a0((g5 >> 31) ^ (g5 << 1));
                        V = X + Z2;
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(i2, abstractC2181wq)) {
                        long h3 = AbstractC1768qY.c.h(j, abstractC2181wq);
                        Z5 = C0627Yb.Z(i4);
                        b02 = C0627Yb.b0((h3 >> 63) ^ (h3 << 1));
                        V = b02 + Z5;
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (q(i2, abstractC2181wq)) {
                        V = C0627Yb.W(i4, (F) AbstractC1768qY.c.i(j, abstractC2181wq), n(i2));
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    V = AbstractC1036fQ.f(i4, t(abstractC2181wq, j));
                    i3 += V;
                    break;
                case 19:
                    V = AbstractC1036fQ.d(i4, t(abstractC2181wq, j));
                    i3 += V;
                    break;
                case 20:
                    V = AbstractC1036fQ.j(i4, t(abstractC2181wq, j));
                    i3 += V;
                    break;
                case 21:
                    V = AbstractC1036fQ.t(i4, t(abstractC2181wq, j));
                    i3 += V;
                    break;
                case 22:
                    V = AbstractC1036fQ.h(i4, t(abstractC2181wq, j));
                    i3 += V;
                    break;
                case 23:
                    V = AbstractC1036fQ.f(i4, t(abstractC2181wq, j));
                    i3 += V;
                    break;
                case 24:
                    V = AbstractC1036fQ.d(i4, t(abstractC2181wq, j));
                    i3 += V;
                    break;
                case 25:
                    List t = t(abstractC2181wq, j);
                    Class cls2 = AbstractC1036fQ.a;
                    int size = t.size();
                    i3 += size == 0 ? 0 : (C0627Yb.Z(i4) + 1) * size;
                    break;
                case 26:
                    V = AbstractC1036fQ.q(i4, t(abstractC2181wq, j));
                    i3 += V;
                    break;
                case 27:
                    V = AbstractC1036fQ.l(i4, t(abstractC2181wq, j), n(i2));
                    i3 += V;
                    break;
                case 28:
                    V = AbstractC1036fQ.a(i4, t(abstractC2181wq, j));
                    i3 += V;
                    break;
                case 29:
                    V = AbstractC1036fQ.r(i4, t(abstractC2181wq, j));
                    i3 += V;
                    break;
                case 30:
                    V = AbstractC1036fQ.b(i4, t(abstractC2181wq, j));
                    i3 += V;
                    break;
                case 31:
                    V = AbstractC1036fQ.d(i4, t(abstractC2181wq, j));
                    i3 += V;
                    break;
                case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                    V = AbstractC1036fQ.f(i4, t(abstractC2181wq, j));
                    i3 += V;
                    break;
                case 33:
                    V = AbstractC1036fQ.m(i4, t(abstractC2181wq, j));
                    i3 += V;
                    break;
                case 34:
                    V = AbstractC1036fQ.o(i4, t(abstractC2181wq, j));
                    i3 += V;
                    break;
                case 35:
                    g = AbstractC1036fQ.g((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z6 = C0627Yb.Z(i4);
                        i3 = AbstractC2188wx.f(g, Z6, g, i3);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    g = AbstractC1036fQ.e((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z6 = C0627Yb.Z(i4);
                        i3 = AbstractC2188wx.f(g, Z6, g, i3);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    g = AbstractC1036fQ.k((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z6 = C0627Yb.Z(i4);
                        i3 = AbstractC2188wx.f(g, Z6, g, i3);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    g = AbstractC1036fQ.u((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z6 = C0627Yb.Z(i4);
                        i3 = AbstractC2188wx.f(g, Z6, g, i3);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    g = AbstractC1036fQ.i((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z6 = C0627Yb.Z(i4);
                        i3 = AbstractC2188wx.f(g, Z6, g, i3);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    g = AbstractC1036fQ.g((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z6 = C0627Yb.Z(i4);
                        i3 = AbstractC2188wx.f(g, Z6, g, i3);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    g = AbstractC1036fQ.e((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z6 = C0627Yb.Z(i4);
                        i3 = AbstractC2188wx.f(g, Z6, g, i3);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(abstractC2181wq, j);
                    Class cls3 = AbstractC1036fQ.a;
                    g = list.size();
                    if (g > 0) {
                        Z6 = C0627Yb.Z(i4);
                        i3 = AbstractC2188wx.f(g, Z6, g, i3);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    g = AbstractC1036fQ.s((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z6 = C0627Yb.Z(i4);
                        i3 = AbstractC2188wx.f(g, Z6, g, i3);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    g = AbstractC1036fQ.c((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z6 = C0627Yb.Z(i4);
                        i3 = AbstractC2188wx.f(g, Z6, g, i3);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    g = AbstractC1036fQ.e((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z6 = C0627Yb.Z(i4);
                        i3 = AbstractC2188wx.f(g, Z6, g, i3);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    g = AbstractC1036fQ.g((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z6 = C0627Yb.Z(i4);
                        i3 = AbstractC2188wx.f(g, Z6, g, i3);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    g = AbstractC1036fQ.n((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z6 = C0627Yb.Z(i4);
                        i3 = AbstractC2188wx.f(g, Z6, g, i3);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    g = AbstractC1036fQ.p((List) unsafe.getObject(abstractC2181wq, j));
                    if (g > 0) {
                        Z6 = C0627Yb.Z(i4);
                        i3 = AbstractC2188wx.f(g, Z6, g, i3);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List t2 = t(abstractC2181wq, j);
                    InterfaceC0839cQ n2 = n(i2);
                    Class cls4 = AbstractC1036fQ.a;
                    int size2 = t2.size();
                    if (size2 == 0) {
                        i = 0;
                    } else {
                        i = 0;
                        for (int i8 = 0; i8 < size2; i8++) {
                            i += C0627Yb.W(i4, (F) t2.get(i8), n2);
                        }
                    }
                    i3 += i;
                    break;
                case 50:
                    Object i9 = AbstractC1768qY.c.i(j, abstractC2181wq);
                    Object m = m(i2);
                    this.n.getClass();
                    V = CB.a(i9, i4, m);
                    i3 += V;
                    break;
                case 51:
                    if (!s(i4, i2, abstractC2181wq)) {
                        break;
                    }
                    i3 = AbstractC2188wx.e(i4, 8, i3);
                    break;
                case 52:
                    if (!s(i4, i2, abstractC2181wq)) {
                        break;
                    }
                    i3 = AbstractC2188wx.e(i4, 4, i3);
                    break;
                case 53:
                    if (s(i4, i2, abstractC2181wq)) {
                        long D = D(j, abstractC2181wq);
                        Z = C0627Yb.Z(i4);
                        b0 = C0627Yb.b0(D);
                        V = b0 + Z;
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(i4, i2, abstractC2181wq)) {
                        long D2 = D(j, abstractC2181wq);
                        Z = C0627Yb.Z(i4);
                        b0 = C0627Yb.b0(D2);
                        V = b0 + Z;
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(i4, i2, abstractC2181wq)) {
                        int C = C(j, abstractC2181wq);
                        Z2 = C0627Yb.Z(i4);
                        X = C0627Yb.X(C);
                        V = X + Z2;
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(i4, i2, abstractC2181wq)) {
                        V = C0627Yb.V(i4);
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(i4, i2, abstractC2181wq)) {
                        V = C0627Yb.U(i4);
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (!s(i4, i2, abstractC2181wq)) {
                        break;
                    }
                    i3 = AbstractC2188wx.e(i4, 1, i3);
                    break;
                case 59:
                    if (!s(i4, i2, abstractC2181wq)) {
                        break;
                    } else {
                        Object i10 = AbstractC1768qY.c.i(j, abstractC2181wq);
                        if (i10 instanceof C1151h9) {
                            S = C0627Yb.S(i4, (C1151h9) i10);
                            i3 = S + i3;
                            break;
                        } else {
                            Z3 = C0627Yb.Z(i4);
                            Y = C0627Yb.Y((String) i10);
                            S = Y + Z3;
                            i3 = S + i3;
                        }
                    }
                case 60:
                    if (s(i4, i2, abstractC2181wq)) {
                        Object i11 = AbstractC1768qY.c.i(j, abstractC2181wq);
                        InterfaceC0839cQ n3 = n(i2);
                        Class cls5 = AbstractC1036fQ.a;
                        Z4 = C0627Yb.Z(i4);
                        a = ((F) i11).a(n3);
                        i3 = AbstractC2188wx.f(a, a, Z4, i3);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i4, i2, abstractC2181wq)) {
                        V = C0627Yb.S(i4, (C1151h9) AbstractC1768qY.c.i(j, abstractC2181wq));
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i4, i2, abstractC2181wq)) {
                        int C2 = C(j, abstractC2181wq);
                        Z2 = C0627Yb.Z(i4);
                        X = C0627Yb.a0(C2);
                        V = X + Z2;
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i4, i2, abstractC2181wq)) {
                        int C3 = C(j, abstractC2181wq);
                        Z2 = C0627Yb.Z(i4);
                        X = C0627Yb.X(C3);
                        V = X + Z2;
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (!s(i4, i2, abstractC2181wq)) {
                        break;
                    }
                    i3 = AbstractC2188wx.e(i4, 4, i3);
                    break;
                case 65:
                    if (!s(i4, i2, abstractC2181wq)) {
                        break;
                    }
                    i3 = AbstractC2188wx.e(i4, 8, i3);
                    break;
                case 66:
                    if (s(i4, i2, abstractC2181wq)) {
                        int C4 = C(j, abstractC2181wq);
                        Z2 = C0627Yb.Z(i4);
                        X = C0627Yb.a0((C4 >> 31) ^ (C4 << 1));
                        V = X + Z2;
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i4, i2, abstractC2181wq)) {
                        long D3 = D(j, abstractC2181wq);
                        Z5 = C0627Yb.Z(i4);
                        b02 = C0627Yb.b0((D3 >> 63) ^ (D3 << 1));
                        V = b02 + Z5;
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i4, i2, abstractC2181wq)) {
                        V = C0627Yb.W(i4, (F) AbstractC1768qY.c.i(j, abstractC2181wq), n(i2));
                        i3 += V;
                        break;
                    } else {
                        break;
                    }
            }
            i2 += 3;
        }
    }

    public final boolean q(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int O = O(i);
            long j2 = O & 1048575;
            switch (N(O)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC1768qY.c.e(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC1768qY.c.f(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (AbstractC1768qY.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (AbstractC1768qY.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (AbstractC1768qY.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    if (AbstractC1768qY.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (AbstractC1768qY.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    return AbstractC1768qY.c.c(j2, obj);
                case 8:
                    Object i3 = AbstractC1768qY.c.i(j2, obj);
                    if (i3 instanceof String) {
                        return !((String) i3).isEmpty();
                    }
                    if (i3 instanceof C1151h9) {
                        return !C1151h9.j.equals(i3);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (AbstractC1768qY.c.i(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C1151h9.j.equals(AbstractC1768qY.c.i(j2, obj));
                case 11:
                    if (AbstractC1768qY.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (AbstractC1768qY.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (AbstractC1768qY.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (AbstractC1768qY.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (AbstractC1768qY.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (AbstractC1768qY.c.h(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (AbstractC1768qY.c.i(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & AbstractC1768qY.c.g(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean s(int i, int i2, Object obj) {
        return AbstractC1768qY.c.g((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        r10.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        r0.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(Object obj, int i, Object obj2, C1715pl c1715pl, C0575Wb c0575Wb) {
        long O = O(i) & 1048575;
        Object i2 = AbstractC1768qY.c.i(O, obj);
        CB cb = this.n;
        if (i2 == null) {
            cb.getClass();
            i2 = BB.i.b();
            AbstractC1768qY.p(O, obj, i2);
        } else {
            cb.getClass();
            if (!((BB) i2).h) {
                BB b = BB.i.b();
                CB.b(b, i2);
                AbstractC1768qY.p(O, obj, b);
                i2 = b;
            }
        }
        cb.getClass();
        BB bb = (BB) i2;
        C0950e6 c0950e6 = ((AB) obj2).a;
        c0575Wb.y(2);
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) c0575Wb.d;
        int e = abstractC0549Vb.e(abstractC0549Vb.v());
        Object obj3 = c0950e6.k;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int a = c0575Wb.a();
                if (a == Integer.MAX_VALUE || abstractC0549Vb.c()) {
                    break;
                }
                if (a == 1) {
                    obj4 = c0575Wb.k((J10) c0950e6.i, null, null);
                } else if (a != 2) {
                    try {
                        if (!c0575Wb.z()) {
                            throw new C0230It("Unable to parse map entry.");
                        }
                    } catch (C0178Gt unused) {
                        if (!c0575Wb.z()) {
                            throw new C0230It("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = c0575Wb.k((J10) c0950e6.j, obj3.getClass(), c1715pl);
                }
            } catch (Throwable th) {
                abstractC0549Vb.d(e);
                throw th;
            }
        }
    }

    public final void v(Object obj, int i, Object obj2) {
        if (q(i, obj2)) {
            long O = O(i) & 1048575;
            Unsafe unsafe = p;
            Object object = unsafe.getObject(obj2, O);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2);
            }
            InterfaceC0839cQ n = n(i);
            if (!q(i, obj)) {
                if (r(object)) {
                    AbstractC2181wq h = n.h();
                    n.a(h, object);
                    unsafe.putObject(obj, O, h);
                } else {
                    unsafe.putObject(obj, O, object);
                }
                J(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, O);
            if (!r(object2)) {
                AbstractC2181wq h2 = n.h();
                n.a(h2, object2);
                unsafe.putObject(obj, O, h2);
                object2 = h2;
            }
            n.a(object2, object);
        }
    }

    public final void w(Object obj, int i, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (s(i2, i, obj2)) {
            long O = O(i) & 1048575;
            Unsafe unsafe = p;
            Object object = unsafe.getObject(obj2, O);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            InterfaceC0839cQ n = n(i);
            if (!s(i2, i, obj)) {
                if (r(object)) {
                    AbstractC2181wq h = n.h();
                    n.a(h, object);
                    unsafe.putObject(obj, O, h);
                } else {
                    unsafe.putObject(obj, O, object);
                }
                K(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, O);
            if (!r(object2)) {
                AbstractC2181wq h2 = n.h();
                n.a(h2, object2);
                unsafe.putObject(obj, O, h2);
                object2 = h2;
            }
            n.a(object2, object);
        }
    }

    public final Object x(int i, Object obj) {
        InterfaceC0839cQ n = n(i);
        long O = O(i) & 1048575;
        if (!q(i, obj)) {
            return n.h();
        }
        Object object = p.getObject(obj, O);
        if (r(object)) {
            return object;
        }
        AbstractC2181wq h = n.h();
        if (object != null) {
            n.a(h, object);
        }
        return h;
    }

    public final Object y(int i, int i2, Object obj) {
        InterfaceC0839cQ n = n(i2);
        if (!s(i, i2, obj)) {
            return n.h();
        }
        Object object = p.getObject(obj, O(i2) & 1048575);
        if (r(object)) {
            return object;
        }
        AbstractC2181wq h = n.h();
        if (object != null) {
            n.a(h, object);
        }
        return h;
    }
}
