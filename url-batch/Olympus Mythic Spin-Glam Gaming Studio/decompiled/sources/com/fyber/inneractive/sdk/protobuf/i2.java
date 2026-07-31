package com.fyber.inneractive.sdk.protobuf;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
public final class i2 implements t2 {
    public static final int[] q = new int[0];
    public static final Unsafe r;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final d2 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int k;
    public final k2 l;
    public final t1 m;
    public final o3 n;
    public final j0 o;
    public final z1 p;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new s3());
        } catch (Throwable unused) {
            unsafe = null;
        }
        r = unsafe;
    }

    public i2(int[] iArr, Object[] objArr, int i, int i2, d2 d2Var, boolean z, int[] iArr2, int i3, int i4, k2 k2Var, t1 t1Var, o3 o3Var, j0 j0Var, z1 z1Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = d2Var instanceof z0;
        this.h = z;
        this.f = j0Var != null && (d2Var instanceof GeneratedMessageLite$ExtendableMessage);
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = k2Var;
        this.m = t1Var;
        this.n = o3Var;
        this.o = j0Var;
        this.e = d2Var;
        this.p = z1Var;
    }

    public static long d(int i) {
        return i & 1048575;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.u2.a(com.fyber.inneractive.sdk.protobuf.x3.e(r11, r7), com.fyber.inneractive.sdk.protobuf.x3.e(r12, r7)) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.d(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.d(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.c(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.c(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.d(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.d(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.c(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.c(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.c(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.c(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.c(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.c(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.u2.a(com.fyber.inneractive.sdk.protobuf.x3.e(r11, r7), com.fyber.inneractive.sdk.protobuf.x3.e(r12, r7)) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.u2.a(com.fyber.inneractive.sdk.protobuf.x3.e(r11, r7), com.fyber.inneractive.sdk.protobuf.x3.e(r12, r7)) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.u2.a(com.fyber.inneractive.sdk.protobuf.x3.e(r11, r7), com.fyber.inneractive.sdk.protobuf.x3.e(r12, r7)) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0132, code lost:
    
        if (r4.a(r11, r7) == r4.a(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.c(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.c(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.d(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.d(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.c(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.c(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.d(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.d(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0190, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.x3.d(r11, r7) == com.fyber.inneractive.sdk.protobuf.x3.d(r12, r7)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
    
        if (java.lang.Float.floatToIntBits(r4.d(r11, r7)) == java.lang.Float.floatToIntBits(r4.d(r12, r7))) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c8, code lost:
    
        if (java.lang.Double.doubleToLongBits(r4.c(r11, r7)) == java.lang.Double.doubleToLongBits(r4.c(r12, r7))) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (com.fyber.inneractive.sdk.protobuf.u2.a(com.fyber.inneractive.sdk.protobuf.x3.e(r11, r7), com.fyber.inneractive.sdk.protobuf.x3.e(r12, r7)) != false) goto L106;
     */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Object obj, Object obj2) {
        int length = this.a.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                this.n.getClass();
                n3 n3Var = ((z0) obj).unknownFields;
                this.n.getClass();
                if (!n3Var.equals(((z0) obj2).unknownFields)) {
                    return false;
                }
                if (!this.f) {
                    return true;
                }
                this.o.getClass();
                n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
                this.o.getClass();
                return n0Var.equals(((GeneratedMessageLite$ExtendableMessage) obj2).extensions);
            }
            int[] iArr = this.a;
            int i2 = iArr[i + 1];
            long j = i2 & 1048575;
            switch ((i2 & 267386880) >>> 20) {
                case 0:
                    if (a(i, obj, obj2)) {
                        w3 w3Var = x3.c;
                        break;
                    }
                    z = false;
                    break;
                case 1:
                    if (a(i, obj, obj2)) {
                        w3 w3Var2 = x3.c;
                        break;
                    }
                    z = false;
                    break;
                case 2:
                    if (a(i, obj, obj2)) {
                        break;
                    }
                    z = false;
                    break;
                case 3:
                    if (a(i, obj, obj2)) {
                        break;
                    }
                    z = false;
                    break;
                case 4:
                    if (a(i, obj, obj2)) {
                        break;
                    }
                    z = false;
                    break;
                case 5:
                    if (a(i, obj, obj2)) {
                        break;
                    }
                    z = false;
                    break;
                case 6:
                    if (a(i, obj, obj2)) {
                        break;
                    }
                    z = false;
                    break;
                case 7:
                    if (a(i, obj, obj2)) {
                        w3 w3Var3 = x3.c;
                        break;
                    }
                    z = false;
                    break;
                case 8:
                    if (a(i, obj, obj2)) {
                        break;
                    }
                    z = false;
                    break;
                case 9:
                    if (a(i, obj, obj2)) {
                        break;
                    }
                    z = false;
                    break;
                case 10:
                    if (a(i, obj, obj2)) {
                        break;
                    }
                    z = false;
                    break;
                case 11:
                    if (a(i, obj, obj2)) {
                        break;
                    }
                    z = false;
                    break;
                case 12:
                    if (a(i, obj, obj2)) {
                        break;
                    }
                    z = false;
                    break;
                case 13:
                    if (a(i, obj, obj2)) {
                        break;
                    }
                    z = false;
                    break;
                case 14:
                    if (a(i, obj, obj2)) {
                        break;
                    }
                    z = false;
                    break;
                case 15:
                    if (a(i, obj, obj2)) {
                        break;
                    }
                    z = false;
                    break;
                case 16:
                    if (a(i, obj, obj2)) {
                        break;
                    }
                    z = false;
                    break;
                case 17:
                    if (a(i, obj, obj2)) {
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
                case 32:
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
                    z = u2.a(x3.e(obj, j), x3.e(obj2, j));
                    break;
                case 50:
                    z = u2.a(x3.e(obj, j), x3.e(obj2, j));
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
                    if (x3.c(obj, j2) == x3.c(obj2, j2)) {
                        break;
                    }
                    z = false;
                    break;
            }
            if (!z) {
                return false;
            }
            i += 3;
        }
    }

    public final t2 c(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        t2 t2Var = (t2) objArr[i2];
        if (t2Var != null) {
            return t2Var;
        }
        t2 a = p2.c.a((Class) objArr[i2 + 1]);
        this.b[i2] = a;
        return a;
    }

    public final void e(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i + 1];
        int i3 = iArr[i];
        long j = i2 & 1048575;
        if (a(obj2, i3, i)) {
            Object e = a(obj, i3, i) ? x3.e(obj, j) : null;
            Object e2 = x3.e(obj2, j);
            if (e != null && e2 != null) {
                x3.a(j, obj, l1.a(e, e2));
                b(obj, i3, i);
            } else if (e2 != null) {
                x3.a(j, obj, e2);
                b(obj, i3, i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i2 a(r2 r2Var, k2 k2Var, t1 t1Var, o3 o3Var, j0 j0Var, z1 z1Var) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int charAt3;
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
        int i17;
        int[] iArr2;
        int i18;
        int objectFieldOffset;
        int i19;
        String str;
        int i20;
        int i21;
        int i22;
        Field a;
        char charAt12;
        int i23;
        int i24;
        Object obj;
        Field a2;
        Object obj2;
        Field a3;
        int i25;
        char charAt13;
        int i26;
        char charAt14;
        int i27;
        char charAt15;
        int i28;
        char charAt16;
        if (r2Var == null) {
            r2Var.getClass();
            throw new ClassCastException();
        }
        int i29 = 0;
        boolean z = ((r2Var.d & 1) == 1 ? o2.PROTO2 : o2.PROTO3) == o2.PROTO3;
        String str2 = r2Var.b;
        int length = str2.length();
        if (str2.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (str2.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int charAt17 = str2.charAt(i);
        if (charAt17 >= 55296) {
            int i32 = charAt17 & 8191;
            int i33 = 13;
            while (true) {
                i28 = i31 + 1;
                charAt16 = str2.charAt(i31);
                if (charAt16 < 55296) {
                    break;
                }
                i32 |= (charAt16 & 8191) << i33;
                i33 += 13;
                i31 = i28;
            }
            charAt17 = i32 | (charAt16 << i33);
            i31 = i28;
        }
        if (charAt17 == 0) {
            i5 = 0;
            charAt2 = 0;
            i3 = 0;
            charAt3 = 0;
            i2 = i31;
            iArr = q;
            charAt = 0;
            i4 = 0;
        } else {
            int i34 = i31 + 1;
            charAt = str2.charAt(i31);
            if (charAt >= 55296) {
                int i35 = charAt & 8191;
                int i36 = 13;
                while (true) {
                    i13 = i34 + 1;
                    charAt11 = str2.charAt(i34);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i35 |= (charAt11 & 8191) << i36;
                    i36 += 13;
                    i34 = i13;
                }
                charAt = i35 | (charAt11 << i36);
                i34 = i13;
            }
            int i37 = i34 + 1;
            int charAt18 = str2.charAt(i34);
            if (charAt18 >= 55296) {
                int i38 = charAt18 & 8191;
                int i39 = 13;
                while (true) {
                    i12 = i37 + 1;
                    charAt10 = str2.charAt(i37);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i38 |= (charAt10 & 8191) << i39;
                    i39 += 13;
                    i37 = i12;
                }
                charAt18 = i38 | (charAt10 << i39);
                i37 = i12;
            }
            int i40 = i37 + 1;
            int charAt19 = str2.charAt(i37);
            if (charAt19 >= 55296) {
                int i41 = charAt19 & 8191;
                int i42 = 13;
                while (true) {
                    i11 = i40 + 1;
                    charAt9 = str2.charAt(i40);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i41 |= (charAt9 & 8191) << i42;
                    i42 += 13;
                    i40 = i11;
                }
                charAt19 = i41 | (charAt9 << i42);
                i40 = i11;
            }
            int i43 = i40 + 1;
            int charAt20 = str2.charAt(i40);
            if (charAt20 >= 55296) {
                int i44 = charAt20 & 8191;
                int i45 = 13;
                while (true) {
                    i10 = i43 + 1;
                    charAt8 = str2.charAt(i43);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i44 |= (charAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i10;
                }
                charAt20 = i44 | (charAt8 << i45);
                i43 = i10;
            }
            int i46 = i43 + 1;
            charAt2 = str2.charAt(i43);
            if (charAt2 >= 55296) {
                int i47 = charAt2 & 8191;
                int i48 = 13;
                while (true) {
                    i9 = i46 + 1;
                    charAt7 = str2.charAt(i46);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i47 |= (charAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i9;
                }
                charAt2 = i47 | (charAt7 << i48);
                i46 = i9;
            }
            int i49 = i46 + 1;
            int charAt21 = str2.charAt(i46);
            if (charAt21 >= 55296) {
                int i50 = charAt21 & 8191;
                int i51 = 13;
                while (true) {
                    i8 = i49 + 1;
                    charAt6 = str2.charAt(i49);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i50 |= (charAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i8;
                }
                charAt21 = i50 | (charAt6 << i51);
                i49 = i8;
            }
            int i52 = i49 + 1;
            int charAt22 = str2.charAt(i49);
            if (charAt22 >= 55296) {
                int i53 = charAt22 & 8191;
                int i54 = 13;
                while (true) {
                    i7 = i52 + 1;
                    charAt5 = str2.charAt(i52);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i53 |= (charAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i7;
                }
                charAt22 = i53 | (charAt5 << i54);
                i52 = i7;
            }
            i2 = i52 + 1;
            charAt3 = str2.charAt(i52);
            if (charAt3 >= 55296) {
                int i55 = charAt3 & 8191;
                int i56 = i2;
                int i57 = 13;
                while (true) {
                    i6 = i56 + 1;
                    charAt4 = str2.charAt(i56);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i55 |= (charAt4 & 8191) << i57;
                    i57 += 13;
                    i56 = i6;
                }
                charAt3 = i55 | (charAt4 << i57);
                i2 = i6;
            }
            int[] iArr3 = new int[charAt3 + charAt21 + charAt22];
            i3 = (charAt * 2) + charAt18;
            i4 = charAt21;
            iArr = iArr3;
            i29 = charAt19;
            i5 = charAt20;
        }
        Unsafe unsafe = r;
        Object[] objArr = r2Var.c;
        Class<?> cls = r2Var.a.getClass();
        int[] iArr4 = new int[charAt2 * 3];
        Object[] objArr2 = new Object[charAt2 * 2];
        int i58 = charAt3 + i4;
        int i59 = charAt3;
        int i60 = i2;
        int i61 = i58;
        int i62 = 0;
        int i63 = 0;
        while (i60 < length) {
            int i64 = i60 + 1;
            int charAt23 = str2.charAt(i60);
            int i65 = length;
            if (charAt23 >= 55296) {
                int i66 = charAt23 & 8191;
                int i67 = i64;
                int i68 = 13;
                while (true) {
                    i27 = i67 + 1;
                    charAt15 = str2.charAt(i67);
                    i14 = charAt3;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i66 |= (charAt15 & 8191) << i68;
                    i68 += 13;
                    i67 = i27;
                    charAt3 = i14;
                }
                charAt23 = i66 | (charAt15 << i68);
                i15 = i27;
            } else {
                i14 = charAt3;
                i15 = i64;
            }
            int i69 = i15 + 1;
            int charAt24 = str2.charAt(i15);
            if (charAt24 >= 55296) {
                int i70 = charAt24 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i26 = i71 + 1;
                    charAt14 = str2.charAt(i71);
                    i16 = i5;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i70 |= (charAt14 & 8191) << i72;
                    i72 += 13;
                    i71 = i26;
                    i5 = i16;
                }
                charAt24 = i70 | (charAt14 << i72);
                i17 = i26;
            } else {
                i16 = i5;
                i17 = i69;
            }
            int i73 = charAt24 & 255;
            int i74 = i29;
            if ((charAt24 & 1024) != 0) {
                iArr[i62] = i63;
                i62++;
            }
            if (i73 >= 51) {
                int i75 = i17 + 1;
                int charAt25 = str2.charAt(i17);
                char c = 55296;
                if (charAt25 >= 55296) {
                    int i76 = charAt25 & 8191;
                    int i77 = 13;
                    while (true) {
                        i25 = i75 + 1;
                        charAt13 = str2.charAt(i75);
                        if (charAt13 < c) {
                            break;
                        }
                        i76 |= (charAt13 & 8191) << i77;
                        i77 += 13;
                        i75 = i25;
                        c = 55296;
                    }
                    charAt25 = i76 | (charAt13 << i77);
                    i75 = i25;
                }
                int i78 = i73 - 51;
                int i79 = i75;
                if (i78 == 9 || i78 == 17) {
                    i24 = i3 + 1;
                    objArr2[((i63 / 3) * 2) + 1] = objArr[i3];
                } else {
                    if (i78 == 12 && !z) {
                        i24 = i3 + 1;
                        objArr2[((i63 / 3) * 2) + 1] = objArr[i3];
                    }
                    int i80 = charAt25 * 2;
                    obj = objArr[i80];
                    if (obj instanceof Field) {
                        a2 = a((Class) cls, (String) obj);
                        objArr[i80] = a2;
                    } else {
                        a2 = (Field) obj;
                    }
                    iArr2 = iArr4;
                    i18 = charAt23;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(a2);
                    int i81 = i80 + 1;
                    obj2 = objArr[i81];
                    if (obj2 instanceof Field) {
                        a3 = a((Class) cls, (String) obj2);
                        objArr[i81] = a3;
                    } else {
                        a3 = (Field) obj2;
                    }
                    str = str2;
                    i20 = (int) unsafe.objectFieldOffset(a3);
                    i19 = i3;
                    i60 = i79;
                    i21 = 0;
                    objectFieldOffset = objectFieldOffset2;
                }
                i3 = i24;
                int i802 = charAt25 * 2;
                obj = objArr[i802];
                if (obj instanceof Field) {
                }
                iArr2 = iArr4;
                i18 = charAt23;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(a2);
                int i812 = i802 + 1;
                obj2 = objArr[i812];
                if (obj2 instanceof Field) {
                }
                str = str2;
                i20 = (int) unsafe.objectFieldOffset(a3);
                i19 = i3;
                i60 = i79;
                i21 = 0;
                objectFieldOffset = objectFieldOffset22;
            } else {
                iArr2 = iArr4;
                i18 = charAt23;
                int i82 = i3 + 1;
                Field a4 = a((Class) cls, (String) objArr[i3]);
                if (i73 == 9 || i73 == 17) {
                    objArr2[((i63 / 3) * 2) + 1] = a4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        i23 = i3 + 2;
                        objArr2[((i63 / 3) * 2) + 1] = objArr[i82];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        if (!z) {
                            i23 = i3 + 2;
                            objArr2[((i63 / 3) * 2) + 1] = objArr[i82];
                        }
                    } else if (i73 == 50) {
                        int i83 = i59 + 1;
                        iArr[i59] = i63;
                        int i84 = (i63 / 3) * 2;
                        int i85 = i3 + 2;
                        objArr2[i84] = objArr[i82];
                        if ((charAt24 & 2048) != 0) {
                            i82 = i3 + 3;
                            objArr2[i84 + 1] = objArr[i85];
                            i59 = i83;
                        } else {
                            i59 = i83;
                            i82 = i85;
                        }
                    }
                    i82 = i23;
                }
                objectFieldOffset = (int) unsafe.objectFieldOffset(a4);
                if ((charAt24 & 4096) != 4096 || i73 > 17) {
                    i19 = i82;
                    str = str2;
                    i20 = 1048575;
                    i21 = 0;
                } else {
                    int i86 = i17 + 1;
                    int charAt26 = str2.charAt(i17);
                    if (charAt26 >= 55296) {
                        int i87 = charAt26 & 8191;
                        int i88 = 13;
                        while (true) {
                            i22 = i86 + 1;
                            charAt12 = str2.charAt(i86);
                            if (charAt12 < 55296) {
                                break;
                            }
                            i87 |= (charAt12 & 8191) << i88;
                            i88 += 13;
                            i86 = i22;
                        }
                        charAt26 = i87 | (charAt12 << i88);
                    } else {
                        i22 = i86;
                    }
                    int i89 = (charAt26 / 32) + (charAt * 2);
                    Object obj3 = objArr[i89];
                    if (obj3 instanceof Field) {
                        a = (Field) obj3;
                    } else {
                        a = a((Class) cls, (String) obj3);
                        objArr[i89] = a;
                    }
                    i19 = i82;
                    str = str2;
                    i21 = charAt26 % 32;
                    i20 = (int) unsafe.objectFieldOffset(a);
                    i17 = i22;
                }
                if (i73 >= 18 && i73 <= 49) {
                    iArr[i61] = objectFieldOffset;
                    i61++;
                }
                i60 = i17;
            }
            int i90 = i63 + 1;
            iArr2[i63] = i18;
            int i91 = i63 + 2;
            iArr2[i90] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i73 << 20) | objectFieldOffset;
            i63 += 3;
            iArr2[i91] = (i21 << 20) | i20;
            iArr4 = iArr2;
            str2 = str;
            i29 = i74;
            length = i65;
            charAt3 = i14;
            i5 = i16;
            i3 = i19;
        }
        return new i2(iArr4, objArr2, i29, i5, r2Var.a, z, iArr, charAt3, i58, k2Var, t1Var, o3Var, j0Var, z1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0227, code lost:
    
        if (r3 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:
    
        if (r3 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0100, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
    
        r8 = r8 + r2;
     */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4;
        int length = this.a.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int[] iArr = this.a;
            int i7 = iArr[i6 + 1];
            int i8 = iArr[i6];
            long j = 1048575 & i7;
            int i9 = 37;
            int i10 = 1237;
            switch ((i7 & 267386880) >>> 20) {
                case 0:
                    i = i5 * 53;
                    doubleToLongBits = Double.doubleToLongBits(x3.c.c(obj, j));
                    Charset charset = l1.a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 1:
                    i2 = i5 * 53;
                    floatToIntBits = Float.floatToIntBits(x3.c.d(obj, j));
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 2:
                    i = i5 * 53;
                    doubleToLongBits = x3.d(obj, j);
                    Charset charset2 = l1.a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 3:
                    i = i5 * 53;
                    doubleToLongBits = x3.d(obj, j);
                    Charset charset3 = l1.a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 4:
                    i2 = i5 * 53;
                    floatToIntBits = x3.c(obj, j);
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 5:
                    i = i5 * 53;
                    doubleToLongBits = x3.d(obj, j);
                    Charset charset4 = l1.a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 6:
                    i2 = i5 * 53;
                    floatToIntBits = x3.c(obj, j);
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 7:
                    i3 = i5 * 53;
                    boolean a = x3.c.a(obj, j);
                    Charset charset5 = l1.a;
                    break;
                case 8:
                    i2 = i5 * 53;
                    floatToIntBits = ((String) x3.e(obj, j)).hashCode();
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 9:
                    Object e = x3.e(obj, j);
                    if (e != null) {
                        i9 = e.hashCode();
                    }
                    floatToIntBits = i5 * 53;
                    i2 = i9;
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 10:
                    i2 = i5 * 53;
                    floatToIntBits = x3.e(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 11:
                    i2 = i5 * 53;
                    floatToIntBits = x3.c(obj, j);
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 12:
                    i2 = i5 * 53;
                    floatToIntBits = x3.c(obj, j);
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 13:
                    i2 = i5 * 53;
                    floatToIntBits = x3.c(obj, j);
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 14:
                    i = i5 * 53;
                    doubleToLongBits = x3.d(obj, j);
                    Charset charset6 = l1.a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 15:
                    i2 = i5 * 53;
                    floatToIntBits = x3.c(obj, j);
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 16:
                    i = i5 * 53;
                    doubleToLongBits = x3.d(obj, j);
                    Charset charset7 = l1.a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 17:
                    Object e2 = x3.e(obj, j);
                    if (e2 != null) {
                        i9 = e2.hashCode();
                    }
                    floatToIntBits = i5 * 53;
                    i2 = i9;
                    i4 = floatToIntBits + i2;
                    i5 = i4;
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
                case 32:
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
                    i2 = i5 * 53;
                    floatToIntBits = x3.e(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 50:
                    i2 = i5 * 53;
                    floatToIntBits = x3.e(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 51:
                    if (a(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) x3.e(obj, j)).doubleValue());
                        Charset charset8 = l1.a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) x3.e(obj, j)).floatValue());
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (a(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = ((Long) x3.e(obj, j)).longValue();
                        Charset charset9 = l1.a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (a(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = ((Long) x3.e(obj, j)).longValue();
                        Charset charset10 = l1.a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((Integer) x3.e(obj, j)).intValue();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (a(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = ((Long) x3.e(obj, j)).longValue();
                        Charset charset11 = l1.a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((Integer) x3.e(obj, j)).intValue();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (a(obj, i8, i6)) {
                        i3 = i5 * 53;
                        boolean booleanValue = ((Boolean) x3.e(obj, j)).booleanValue();
                        Charset charset12 = l1.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((String) x3.e(obj, j)).hashCode();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = x3.e(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = x3.e(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((Integer) x3.e(obj, j)).intValue();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((Integer) x3.e(obj, j)).intValue();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((Integer) x3.e(obj, j)).intValue();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (a(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = ((Long) x3.e(obj, j)).longValue();
                        Charset charset13 = l1.a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((Integer) x3.e(obj, j)).intValue();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (a(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = ((Long) x3.e(obj, j)).longValue();
                        Charset charset14 = l1.a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = x3.e(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.n.getClass();
        int hashCode = ((z0) obj).unknownFields.hashCode() + (i5 * 53);
        if (!this.f) {
            return hashCode;
        }
        this.o.getClass();
        return (hashCode * 53) + ((GeneratedMessageLite$ExtendableMessage) obj).extensions.a.hashCode();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void c(Object obj) {
        int i;
        int i2 = this.j;
        while (true) {
            i = this.k;
            if (i2 >= i) {
                break;
            }
            long j = this.a[this.i[i2] + 1] & 1048575;
            Object e = x3.e(obj, j);
            if (e != null) {
                this.p.getClass();
                ((y1) e).a = false;
                x3.a(j, obj, e);
            }
            i2++;
        }
        int length = this.i.length;
        while (i < length) {
            this.m.a(obj, this.i[i]);
            i++;
        }
        this.n.getClass();
        ((z0) obj).unknownFields.e = false;
        if (this.f) {
            this.o.getClass();
            ((GeneratedMessageLite$ExtendableMessage) obj).extensions.e();
        }
    }

    public final void c(int i, Object obj, Object obj2) {
        long j = this.a[i + 1] & 1048575;
        Object e = x3.e(obj, j);
        if (e != null) {
            this.p.getClass();
            if (!((y1) e).a) {
                this.p.getClass();
                y1 y1Var = y1.b;
                y1 y1Var2 = y1Var.isEmpty() ? new y1() : new y1(y1Var);
                this.p.getClass();
                z1.a(y1Var2, e);
                x3.a(j, obj, y1Var2);
                e = y1Var2;
            }
        } else {
            this.p.getClass();
            y1 y1Var3 = y1.b;
            e = y1Var3.isEmpty() ? new y1() : new y1(y1Var3);
            x3.a(j, obj, e);
        }
        this.p.getClass();
        this.p.getClass();
        obj2.getClass();
        throw new ClassCastException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final int b(Object obj) {
        int i;
        int i2;
        int a;
        int b;
        int a2;
        int b2;
        int c;
        int b3;
        int a3;
        int b4;
        int b5;
        int a4;
        int b6;
        int a5;
        int a6;
        int b7;
        int c2;
        int b8;
        int a7;
        int b9;
        int i3 = 267386880;
        int i4 = 1048575;
        if (this.h) {
            Unsafe unsafe = r;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int[] iArr = this.a;
                if (i5 < iArr.length) {
                    int i7 = iArr[i5 + 1];
                    int i8 = (i7 & 267386880) >>> 20;
                    int i9 = iArr[i5];
                    long j = i7 & i4;
                    if (i8 >= FieldType.DOUBLE_LIST_PACKED.id() && i8 <= FieldType.SINT64_LIST_PACKED.id()) {
                        int i10 = this.a[i5 + 2];
                    }
                    switch (i8) {
                        case 0:
                            if (a(i5, obj)) {
                                a4 = g2.a(i9, 8, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 1:
                            if (a(i5, obj)) {
                                a4 = g2.a(i9, 4, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 2:
                            if (a(i5, obj)) {
                                long d = x3.d(obj, j);
                                b6 = b0.b(i9);
                                a5 = b0.a(d);
                                a6 = a5 + b6;
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 3:
                            if (a(i5, obj)) {
                                a6 = b0.a(x3.d(obj, j)) + b0.b(i9);
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 4:
                            if (a(i5, obj)) {
                                int c3 = x3.c(obj, j);
                                b7 = b0.b(i9);
                                if (c3 >= 0) {
                                    c2 = b0.c(c3);
                                    a6 = c2 + b7;
                                    a4 = a6 + i6;
                                    i6 = a4;
                                    i5 += 3;
                                    i4 = 1048575;
                                }
                                c2 = 10;
                                a6 = c2 + b7;
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 5:
                            if (a(i5, obj)) {
                                a4 = g2.a(i9, 8, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 6:
                            if (a(i5, obj)) {
                                a4 = g2.a(i9, 4, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 7:
                            if (a(i5, obj)) {
                                a4 = g2.a(i9, 1, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 8:
                            if (a(i5, obj)) {
                                Object e = x3.e(obj, j);
                                if (e instanceof s) {
                                    b8 = b0.b(i9);
                                    a7 = b0.a((s) e);
                                } else {
                                    b8 = b0.b(i9);
                                    a7 = b0.a((String) e);
                                }
                                a6 = a7 + b8;
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 9:
                            if (a(i5, obj)) {
                                Object e2 = x3.e(obj, j);
                                t2 c4 = c(i5);
                                Class cls = u2.a;
                                int b10 = b0.b(i9);
                                int serializedSize = ((b) ((d2) e2)).getSerializedSize(c4);
                                a4 = l0.a(serializedSize, serializedSize, b10, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 10:
                            if (a(i5, obj)) {
                                s sVar = (s) x3.e(obj, j);
                                b8 = b0.b(i9);
                                a7 = b0.a(sVar);
                                a6 = a7 + b8;
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 11:
                            if (a(i5, obj)) {
                                int c5 = x3.c(obj, j);
                                b8 = b0.b(i9);
                                a7 = b0.c(c5);
                                a6 = a7 + b8;
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 12:
                            if (a(i5, obj)) {
                                int c6 = x3.c(obj, j);
                                b8 = b0.b(i9);
                                a7 = b0.a(c6);
                                a6 = a7 + b8;
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 13:
                            if (a(i5, obj)) {
                                a4 = g2.a(i9, 4, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 14:
                            if (a(i5, obj)) {
                                a4 = g2.a(i9, 8, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 15:
                            if (a(i5, obj)) {
                                int c7 = x3.c(obj, j);
                                b6 = b0.b(i9);
                                a5 = b0.c(b0.d(c7));
                                a6 = a5 + b6;
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 16:
                            if (a(i5, obj)) {
                                long d2 = x3.d(obj, j);
                                b6 = b0.b(i9);
                                a5 = b0.a(b0.b(d2));
                                a6 = a5 + b6;
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 17:
                            if (a(i5, obj)) {
                                d2 d2Var = (d2) x3.e(obj, j);
                                t2 c8 = c(i5);
                                b6 = b0.b(i9) * 2;
                                a5 = ((b) d2Var).getSerializedSize(c8);
                                a6 = a5 + b6;
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 18:
                            a6 = u2.b(i9, (List) x3.e(obj, j));
                            a4 = a6 + i6;
                            i6 = a4;
                            i5 += 3;
                            i4 = 1048575;
                        case 19:
                            a6 = u2.a(i9, (List) x3.e(obj, j));
                            a4 = a6 + i6;
                            i6 = a4;
                            i5 += 3;
                            i4 = 1048575;
                        case 20:
                            List list = (List) x3.e(obj, j);
                            Class cls2 = u2.a;
                            if (list.size() != 0) {
                                a6 = h2.a(i9, list.size(), u2.c(list));
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            a6 = 0;
                            a4 = a6 + i6;
                            i6 = a4;
                            i5 += 3;
                            i4 = 1048575;
                        case 21:
                            List list2 = (List) x3.e(obj, j);
                            Class cls3 = u2.a;
                            int size = list2.size();
                            if (size != 0) {
                                a6 = h2.a(i9, size, u2.g(list2));
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            a6 = 0;
                            a4 = a6 + i6;
                            i6 = a4;
                            i5 += 3;
                            i4 = 1048575;
                        case 22:
                            List list3 = (List) x3.e(obj, j);
                            Class cls4 = u2.a;
                            int size2 = list3.size();
                            if (size2 != 0) {
                                a6 = h2.a(i9, size2, u2.b(list3));
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            a6 = 0;
                            a4 = a6 + i6;
                            i6 = a4;
                            i5 += 3;
                            i4 = 1048575;
                        case 23:
                            a6 = u2.b(i9, (List) x3.e(obj, j));
                            a4 = a6 + i6;
                            i6 = a4;
                            i5 += 3;
                            i4 = 1048575;
                        case 24:
                            a6 = u2.a(i9, (List) x3.e(obj, j));
                            a4 = a6 + i6;
                            i6 = a4;
                            i5 += 3;
                            i4 = 1048575;
                        case 25:
                            List list4 = (List) x3.e(obj, j);
                            Class cls5 = u2.a;
                            int size3 = list4.size();
                            i6 = (size3 == 0 ? 0 : (b0.b(i9) + 1) * size3) + i6;
                            i5 += 3;
                            i4 = 1048575;
                        case 26:
                            a6 = u2.c(i9, (List) x3.e(obj, j));
                            a4 = a6 + i6;
                            i6 = a4;
                            i5 += 3;
                            i4 = 1048575;
                        case 27:
                            List list5 = (List) x3.e(obj, j);
                            t2 c9 = c(i5);
                            Class cls6 = u2.a;
                            int size4 = list5.size();
                            if (size4 != 0) {
                                b9 = b0.b(i9) * size4;
                                for (int i11 = 0; i11 < size4; i11++) {
                                    int serializedSize2 = ((b) ((d2) list5.get(i11))).getSerializedSize(c9);
                                    b9 = b0.c(serializedSize2) + serializedSize2 + b9;
                                }
                                i6 = b9 + i6;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            b9 = 0;
                            i6 = b9 + i6;
                            i5 += 3;
                            i4 = 1048575;
                        case 28:
                            List list6 = (List) x3.e(obj, j);
                            Class cls7 = u2.a;
                            int size5 = list6.size();
                            if (size5 != 0) {
                                b9 = b0.b(i9) * size5;
                                for (int i12 = 0; i12 < list6.size(); i12++) {
                                    b9 = b0.a((s) list6.get(i12)) + b9;
                                }
                                i6 = b9 + i6;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            b9 = 0;
                            i6 = b9 + i6;
                            i5 += 3;
                            i4 = 1048575;
                        case 29:
                            List list7 = (List) x3.e(obj, j);
                            Class cls8 = u2.a;
                            int size6 = list7.size();
                            if (size6 != 0) {
                                a6 = h2.a(i9, size6, u2.f(list7));
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            a6 = 0;
                            a4 = a6 + i6;
                            i6 = a4;
                            i5 += 3;
                            i4 = 1048575;
                        case 30:
                            List list8 = (List) x3.e(obj, j);
                            Class cls9 = u2.a;
                            int size7 = list8.size();
                            if (size7 != 0) {
                                a6 = h2.a(i9, size7, u2.a(list8));
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            a6 = 0;
                            a4 = a6 + i6;
                            i6 = a4;
                            i5 += 3;
                            i4 = 1048575;
                        case 31:
                            a6 = u2.a(i9, (List) x3.e(obj, j));
                            a4 = a6 + i6;
                            i6 = a4;
                            i5 += 3;
                            i4 = 1048575;
                        case 32:
                            a6 = u2.b(i9, (List) x3.e(obj, j));
                            a4 = a6 + i6;
                            i6 = a4;
                            i5 += 3;
                            i4 = 1048575;
                        case 33:
                            List list9 = (List) x3.e(obj, j);
                            Class cls10 = u2.a;
                            int size8 = list9.size();
                            if (size8 != 0) {
                                a6 = h2.a(i9, size8, u2.d(list9));
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            a6 = 0;
                            a4 = a6 + i6;
                            i6 = a4;
                            i5 += 3;
                            i4 = 1048575;
                        case 34:
                            List list10 = (List) x3.e(obj, j);
                            Class cls11 = u2.a;
                            int size9 = list10.size();
                            if (size9 != 0) {
                                a6 = h2.a(i9, size9, u2.e(list10));
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            a6 = 0;
                            a4 = a6 + i6;
                            i6 = a4;
                            i5 += 3;
                            i4 = 1048575;
                        case 35:
                            List list11 = (List) unsafe.getObject(obj, j);
                            Class cls12 = u2.a;
                            int size10 = list11.size() * 8;
                            if (size10 > 0) {
                                a4 = l0.a(size10, b0.b(i9), size10, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 36:
                            List list12 = (List) unsafe.getObject(obj, j);
                            Class cls13 = u2.a;
                            int size11 = list12.size() * 4;
                            if (size11 > 0) {
                                a4 = l0.a(size11, b0.b(i9), size11, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 37:
                            int c10 = u2.c((List) unsafe.getObject(obj, j));
                            if (c10 > 0) {
                                a4 = l0.a(c10, b0.b(i9), c10, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 38:
                            int g = u2.g((List) unsafe.getObject(obj, j));
                            if (g > 0) {
                                a4 = l0.a(g, b0.b(i9), g, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 39:
                            int b11 = u2.b((List) unsafe.getObject(obj, j));
                            if (b11 > 0) {
                                a4 = l0.a(b11, b0.b(i9), b11, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 40:
                            List list13 = (List) unsafe.getObject(obj, j);
                            Class cls14 = u2.a;
                            int size12 = list13.size() * 8;
                            if (size12 > 0) {
                                a4 = l0.a(size12, b0.b(i9), size12, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 41:
                            List list14 = (List) unsafe.getObject(obj, j);
                            Class cls15 = u2.a;
                            int size13 = list14.size() * 4;
                            if (size13 > 0) {
                                a4 = l0.a(size13, b0.b(i9), size13, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 42:
                            List list15 = (List) unsafe.getObject(obj, j);
                            Class cls16 = u2.a;
                            int size14 = list15.size();
                            if (size14 > 0) {
                                a4 = l0.a(size14, b0.b(i9), size14, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 43:
                            int f = u2.f((List) unsafe.getObject(obj, j));
                            if (f > 0) {
                                a4 = l0.a(f, b0.b(i9), f, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 44:
                            int a8 = u2.a((List) unsafe.getObject(obj, j));
                            if (a8 > 0) {
                                a4 = l0.a(a8, b0.b(i9), a8, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 45:
                            List list16 = (List) unsafe.getObject(obj, j);
                            Class cls17 = u2.a;
                            int size15 = list16.size() * 4;
                            if (size15 > 0) {
                                a4 = l0.a(size15, b0.b(i9), size15, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 46:
                            List list17 = (List) unsafe.getObject(obj, j);
                            Class cls18 = u2.a;
                            int size16 = list17.size() * 8;
                            if (size16 > 0) {
                                a4 = l0.a(size16, b0.b(i9), size16, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 47:
                            int d3 = u2.d((List) unsafe.getObject(obj, j));
                            if (d3 > 0) {
                                a4 = l0.a(d3, b0.b(i9), d3, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 48:
                            int e3 = u2.e((List) unsafe.getObject(obj, j));
                            if (e3 > 0) {
                                a4 = l0.a(e3, b0.b(i9), e3, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 49:
                            List list18 = (List) x3.e(obj, j);
                            t2 c11 = c(i5);
                            Class cls19 = u2.a;
                            int size17 = list18.size();
                            if (size17 != 0) {
                                b9 = 0;
                                for (int i13 = 0; i13 < size17; i13++) {
                                    b9 = ((b) ((d2) list18.get(i13))).getSerializedSize(c11) + (b0.b(i9) * 2) + b9;
                                }
                                i6 = b9 + i6;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            b9 = 0;
                            i6 = b9 + i6;
                            i5 += 3;
                            i4 = 1048575;
                        case 50:
                            z1 z1Var = this.p;
                            Object e4 = x3.e(obj, j);
                            Object b12 = b(i5);
                            z1Var.getClass();
                            y1 y1Var = (y1) e4;
                            if (b12 == null) {
                                if (y1Var.isEmpty()) {
                                    continue;
                                } else {
                                    Iterator it = y1Var.entrySet().iterator();
                                    if (it.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it.next();
                                        entry.getKey();
                                        entry.getValue();
                                        throw null;
                                    }
                                }
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                throw new ClassCastException();
                            }
                        case 51:
                            if (a(obj, i9, i5)) {
                                a4 = g2.a(i9, 8, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 52:
                            if (a(obj, i9, i5)) {
                                a4 = g2.a(i9, 4, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 53:
                            if (a(obj, i9, i5)) {
                                long longValue = ((Long) x3.e(obj, j)).longValue();
                                b6 = b0.b(i9);
                                a5 = b0.a(longValue);
                                a6 = a5 + b6;
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 54:
                            if (a(obj, i9, i5)) {
                                long longValue2 = ((Long) x3.e(obj, j)).longValue();
                                b6 = b0.b(i9);
                                a5 = b0.a(longValue2);
                                a6 = a5 + b6;
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 55:
                            if (a(obj, i9, i5)) {
                                int intValue = ((Integer) x3.e(obj, j)).intValue();
                                b7 = b0.b(i9);
                                if (intValue >= 0) {
                                    c2 = b0.c(intValue);
                                    a6 = c2 + b7;
                                    a4 = a6 + i6;
                                    i6 = a4;
                                    i5 += 3;
                                    i4 = 1048575;
                                }
                                c2 = 10;
                                a6 = c2 + b7;
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 56:
                            if (a(obj, i9, i5)) {
                                a4 = g2.a(i9, 8, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 57:
                            if (a(obj, i9, i5)) {
                                a4 = g2.a(i9, 4, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 58:
                            if (a(obj, i9, i5)) {
                                a4 = g2.a(i9, 1, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 59:
                            if (a(obj, i9, i5)) {
                                Object e5 = x3.e(obj, j);
                                if (e5 instanceof s) {
                                    b8 = b0.b(i9);
                                    a7 = b0.a((s) e5);
                                } else {
                                    b8 = b0.b(i9);
                                    a7 = b0.a((String) e5);
                                }
                                a6 = a7 + b8;
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 60:
                            if (a(obj, i9, i5)) {
                                Object e6 = x3.e(obj, j);
                                t2 c12 = c(i5);
                                Class cls20 = u2.a;
                                int b13 = b0.b(i9);
                                int serializedSize3 = ((b) ((d2) e6)).getSerializedSize(c12);
                                a4 = l0.a(serializedSize3, serializedSize3, b13, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 61:
                            if (a(obj, i9, i5)) {
                                s sVar2 = (s) x3.e(obj, j);
                                b8 = b0.b(i9);
                                a7 = b0.a(sVar2);
                                a6 = a7 + b8;
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 62:
                            if (a(obj, i9, i5)) {
                                int intValue2 = ((Integer) x3.e(obj, j)).intValue();
                                b8 = b0.b(i9);
                                a7 = b0.c(intValue2);
                                a6 = a7 + b8;
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 63:
                            if (a(obj, i9, i5)) {
                                int intValue3 = ((Integer) x3.e(obj, j)).intValue();
                                b8 = b0.b(i9);
                                a7 = b0.a(intValue3);
                                a6 = a7 + b8;
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 64:
                            if (a(obj, i9, i5)) {
                                a4 = g2.a(i9, 4, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 65:
                            if (a(obj, i9, i5)) {
                                a4 = g2.a(i9, 8, i6);
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 66:
                            if (a(obj, i9, i5)) {
                                int intValue4 = ((Integer) x3.e(obj, j)).intValue();
                                b6 = b0.b(i9);
                                a5 = b0.c(b0.d(intValue4));
                                a6 = a5 + b6;
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 67:
                            if (a(obj, i9, i5)) {
                                long longValue3 = ((Long) x3.e(obj, j)).longValue();
                                b6 = b0.b(i9);
                                a5 = b0.a(b0.b(longValue3));
                                a6 = a5 + b6;
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 68:
                            if (a(obj, i9, i5)) {
                                d2 d2Var2 = (d2) x3.e(obj, j);
                                t2 c13 = c(i5);
                                b6 = b0.b(i9) * 2;
                                a5 = ((b) d2Var2).getSerializedSize(c13);
                                a6 = a5 + b6;
                                a4 = a6 + i6;
                                i6 = a4;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        default:
                            i5 += 3;
                            i4 = 1048575;
                    }
                } else {
                    this.n.getClass();
                    return ((z0) obj).unknownFields.a() + i6;
                }
            }
        } else {
            Unsafe unsafe2 = r;
            int i14 = 0;
            int i15 = 0;
            int i16 = 1048575;
            int i17 = 0;
            while (true) {
                int[] iArr2 = this.a;
                if (i14 < iArr2.length) {
                    int i18 = iArr2[i14 + 1];
                    int i19 = iArr2[i14];
                    int i20 = (i18 & i3) >>> 20;
                    if (i20 <= 17) {
                        int i21 = iArr2[i14 + 2];
                        i = 1048575;
                        int i22 = i21 & 1048575;
                        i2 = 1 << (i21 >>> 20);
                        if (i22 != i16) {
                            i17 = unsafe2.getInt(obj, i22);
                            i16 = i22;
                        }
                    } else {
                        i = 1048575;
                        i2 = 0;
                    }
                    long j2 = i18 & i;
                    switch (i20) {
                        case 0:
                            if ((i17 & i2) != 0) {
                                a = g2.a(i19, 8, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 1:
                            if ((i17 & i2) != 0) {
                                a = g2.a(i19, 4, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 2:
                            if ((i17 & i2) != 0) {
                                long j3 = unsafe2.getLong(obj, j2);
                                b = b0.b(i19);
                                a2 = b0.a(j3);
                                b4 = a2 + b;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 3:
                            if ((i17 & i2) != 0) {
                                long j4 = unsafe2.getLong(obj, j2);
                                b = b0.b(i19);
                                a2 = b0.a(j4);
                                b4 = a2 + b;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 4:
                            if ((i17 & i2) != 0) {
                                int i23 = unsafe2.getInt(obj, j2);
                                b2 = b0.b(i19);
                                if (i23 >= 0) {
                                    c = b0.c(i23);
                                    b4 = c + b2;
                                    a = b4 + i15;
                                    i15 = a;
                                    i14 += 3;
                                    i3 = 267386880;
                                }
                                c = 10;
                                b4 = c + b2;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 5:
                            if ((i17 & i2) != 0) {
                                a = g2.a(i19, 8, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 6:
                            if ((i17 & i2) != 0) {
                                a = g2.a(i19, 4, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 7:
                            if ((i17 & i2) != 0) {
                                a = g2.a(i19, 1, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 8:
                            if ((i17 & i2) != 0) {
                                Object object = unsafe2.getObject(obj, j2);
                                if (object instanceof s) {
                                    b3 = b0.b(i19);
                                    a3 = b0.a((s) object);
                                } else {
                                    b3 = b0.b(i19);
                                    a3 = b0.a((String) object);
                                }
                                b4 = a3 + b3;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 9:
                            if ((i17 & i2) != 0) {
                                Object object2 = unsafe2.getObject(obj, j2);
                                t2 c14 = c(i14);
                                Class cls21 = u2.a;
                                int b14 = b0.b(i19);
                                int serializedSize4 = ((b) ((d2) object2)).getSerializedSize(c14);
                                a = l0.a(serializedSize4, serializedSize4, b14, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 10:
                            if ((i17 & i2) != 0) {
                                s sVar3 = (s) unsafe2.getObject(obj, j2);
                                b3 = b0.b(i19);
                                a3 = b0.a(sVar3);
                                b4 = a3 + b3;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 11:
                            if ((i17 & i2) != 0) {
                                int i24 = unsafe2.getInt(obj, j2);
                                b3 = b0.b(i19);
                                a3 = b0.c(i24);
                                b4 = a3 + b3;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 12:
                            if ((i17 & i2) != 0) {
                                int i25 = unsafe2.getInt(obj, j2);
                                b3 = b0.b(i19);
                                a3 = b0.a(i25);
                                b4 = a3 + b3;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 13:
                            if ((i17 & i2) != 0) {
                                a = g2.a(i19, 4, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 14:
                            if ((i17 & i2) != 0) {
                                a = g2.a(i19, 8, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 15:
                            if ((i17 & i2) != 0) {
                                int i26 = unsafe2.getInt(obj, j2);
                                b = b0.b(i19);
                                a2 = b0.c(b0.d(i26));
                                b4 = a2 + b;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 16:
                            if ((i17 & i2) != 0) {
                                long j5 = unsafe2.getLong(obj, j2);
                                b = b0.b(i19);
                                a2 = b0.a(b0.b(j5));
                                b4 = a2 + b;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 17:
                            if ((i17 & i2) != 0) {
                                d2 d2Var3 = (d2) unsafe2.getObject(obj, j2);
                                t2 c15 = c(i14);
                                b = b0.b(i19) * 2;
                                a2 = ((b) d2Var3).getSerializedSize(c15);
                                b4 = a2 + b;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 18:
                            b4 = u2.b(i19, (List) unsafe2.getObject(obj, j2));
                            a = b4 + i15;
                            i15 = a;
                            i14 += 3;
                            i3 = 267386880;
                        case 19:
                            b4 = u2.a(i19, (List) unsafe2.getObject(obj, j2));
                            a = b4 + i15;
                            i15 = a;
                            i14 += 3;
                            i3 = 267386880;
                        case 20:
                            List list19 = (List) unsafe2.getObject(obj, j2);
                            Class cls22 = u2.a;
                            if (list19.size() != 0) {
                                b4 = h2.a(i19, list19.size(), u2.c(list19));
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b4 = 0;
                            a = b4 + i15;
                            i15 = a;
                            i14 += 3;
                            i3 = 267386880;
                        case 21:
                            List list20 = (List) unsafe2.getObject(obj, j2);
                            Class cls23 = u2.a;
                            int size18 = list20.size();
                            if (size18 != 0) {
                                b4 = h2.a(i19, size18, u2.g(list20));
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b4 = 0;
                            a = b4 + i15;
                            i15 = a;
                            i14 += 3;
                            i3 = 267386880;
                        case 22:
                            List list21 = (List) unsafe2.getObject(obj, j2);
                            Class cls24 = u2.a;
                            int size19 = list21.size();
                            if (size19 != 0) {
                                b4 = h2.a(i19, size19, u2.b(list21));
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b4 = 0;
                            a = b4 + i15;
                            i15 = a;
                            i14 += 3;
                            i3 = 267386880;
                        case 23:
                            b4 = u2.b(i19, (List) unsafe2.getObject(obj, j2));
                            a = b4 + i15;
                            i15 = a;
                            i14 += 3;
                            i3 = 267386880;
                        case 24:
                            b4 = u2.a(i19, (List) unsafe2.getObject(obj, j2));
                            a = b4 + i15;
                            i15 = a;
                            i14 += 3;
                            i3 = 267386880;
                        case 25:
                            List list22 = (List) unsafe2.getObject(obj, j2);
                            Class cls25 = u2.a;
                            int size20 = list22.size();
                            i15 = (size20 == 0 ? 0 : (b0.b(i19) + 1) * size20) + i15;
                            i14 += 3;
                            i3 = 267386880;
                        case 26:
                            b4 = u2.c(i19, (List) unsafe2.getObject(obj, j2));
                            a = b4 + i15;
                            i15 = a;
                            i14 += 3;
                            i3 = 267386880;
                        case 27:
                            List list23 = (List) unsafe2.getObject(obj, j2);
                            t2 c16 = c(i14);
                            Class cls26 = u2.a;
                            int size21 = list23.size();
                            if (size21 != 0) {
                                b5 = b0.b(i19) * size21;
                                for (int i27 = 0; i27 < size21; i27++) {
                                    int serializedSize5 = ((b) ((d2) list23.get(i27))).getSerializedSize(c16);
                                    b5 = b0.c(serializedSize5) + serializedSize5 + b5;
                                }
                                i15 = b5 + i15;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b5 = 0;
                            i15 = b5 + i15;
                            i14 += 3;
                            i3 = 267386880;
                        case 28:
                            List list24 = (List) unsafe2.getObject(obj, j2);
                            Class cls27 = u2.a;
                            int size22 = list24.size();
                            if (size22 != 0) {
                                b5 = b0.b(i19) * size22;
                                for (int i28 = 0; i28 < list24.size(); i28++) {
                                    b5 = b0.a((s) list24.get(i28)) + b5;
                                }
                                i15 = b5 + i15;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b5 = 0;
                            i15 = b5 + i15;
                            i14 += 3;
                            i3 = 267386880;
                        case 29:
                            List list25 = (List) unsafe2.getObject(obj, j2);
                            Class cls28 = u2.a;
                            int size23 = list25.size();
                            if (size23 != 0) {
                                b4 = h2.a(i19, size23, u2.f(list25));
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b4 = 0;
                            a = b4 + i15;
                            i15 = a;
                            i14 += 3;
                            i3 = 267386880;
                        case 30:
                            List list26 = (List) unsafe2.getObject(obj, j2);
                            Class cls29 = u2.a;
                            int size24 = list26.size();
                            if (size24 != 0) {
                                b4 = h2.a(i19, size24, u2.a(list26));
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b4 = 0;
                            a = b4 + i15;
                            i15 = a;
                            i14 += 3;
                            i3 = 267386880;
                        case 31:
                            b4 = u2.a(i19, (List) unsafe2.getObject(obj, j2));
                            a = b4 + i15;
                            i15 = a;
                            i14 += 3;
                            i3 = 267386880;
                        case 32:
                            b4 = u2.b(i19, (List) unsafe2.getObject(obj, j2));
                            a = b4 + i15;
                            i15 = a;
                            i14 += 3;
                            i3 = 267386880;
                        case 33:
                            List list27 = (List) unsafe2.getObject(obj, j2);
                            Class cls30 = u2.a;
                            int size25 = list27.size();
                            if (size25 != 0) {
                                b4 = h2.a(i19, size25, u2.d(list27));
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b4 = 0;
                            a = b4 + i15;
                            i15 = a;
                            i14 += 3;
                            i3 = 267386880;
                        case 34:
                            List list28 = (List) unsafe2.getObject(obj, j2);
                            Class cls31 = u2.a;
                            int size26 = list28.size();
                            if (size26 != 0) {
                                b4 = h2.a(i19, size26, u2.e(list28));
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b4 = 0;
                            a = b4 + i15;
                            i15 = a;
                            i14 += 3;
                            i3 = 267386880;
                        case 35:
                            List list29 = (List) unsafe2.getObject(obj, j2);
                            Class cls32 = u2.a;
                            int size27 = list29.size() * 8;
                            if (size27 > 0) {
                                a = l0.a(size27, b0.b(i19), size27, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 36:
                            List list30 = (List) unsafe2.getObject(obj, j2);
                            Class cls33 = u2.a;
                            int size28 = list30.size() * 4;
                            if (size28 > 0) {
                                a = l0.a(size28, b0.b(i19), size28, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 37:
                            int c17 = u2.c((List) unsafe2.getObject(obj, j2));
                            if (c17 > 0) {
                                a = l0.a(c17, b0.b(i19), c17, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 38:
                            int g2 = u2.g((List) unsafe2.getObject(obj, j2));
                            if (g2 > 0) {
                                a = l0.a(g2, b0.b(i19), g2, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 39:
                            int b15 = u2.b((List) unsafe2.getObject(obj, j2));
                            if (b15 > 0) {
                                a = l0.a(b15, b0.b(i19), b15, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 40:
                            List list31 = (List) unsafe2.getObject(obj, j2);
                            Class cls34 = u2.a;
                            int size29 = list31.size() * 8;
                            if (size29 > 0) {
                                a = l0.a(size29, b0.b(i19), size29, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 41:
                            List list32 = (List) unsafe2.getObject(obj, j2);
                            Class cls35 = u2.a;
                            int size30 = list32.size() * 4;
                            if (size30 > 0) {
                                a = l0.a(size30, b0.b(i19), size30, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 42:
                            List list33 = (List) unsafe2.getObject(obj, j2);
                            Class cls36 = u2.a;
                            int size31 = list33.size();
                            if (size31 > 0) {
                                a = l0.a(size31, b0.b(i19), size31, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 43:
                            int f2 = u2.f((List) unsafe2.getObject(obj, j2));
                            if (f2 > 0) {
                                a = l0.a(f2, b0.b(i19), f2, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 44:
                            int a9 = u2.a((List) unsafe2.getObject(obj, j2));
                            if (a9 > 0) {
                                a = l0.a(a9, b0.b(i19), a9, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 45:
                            List list34 = (List) unsafe2.getObject(obj, j2);
                            Class cls37 = u2.a;
                            int size32 = list34.size() * 4;
                            if (size32 > 0) {
                                a = l0.a(size32, b0.b(i19), size32, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 46:
                            List list35 = (List) unsafe2.getObject(obj, j2);
                            Class cls38 = u2.a;
                            int size33 = list35.size() * 8;
                            if (size33 > 0) {
                                a = l0.a(size33, b0.b(i19), size33, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 47:
                            int d4 = u2.d((List) unsafe2.getObject(obj, j2));
                            if (d4 > 0) {
                                a = l0.a(d4, b0.b(i19), d4, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 48:
                            int e7 = u2.e((List) unsafe2.getObject(obj, j2));
                            if (e7 > 0) {
                                a = l0.a(e7, b0.b(i19), e7, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 49:
                            List list36 = (List) unsafe2.getObject(obj, j2);
                            t2 c18 = c(i14);
                            Class cls39 = u2.a;
                            int size34 = list36.size();
                            if (size34 != 0) {
                                b5 = 0;
                                for (int i29 = 0; i29 < size34; i29++) {
                                    b5 = ((b) ((d2) list36.get(i29))).getSerializedSize(c18) + (b0.b(i19) * 2) + b5;
                                }
                                i15 = b5 + i15;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b5 = 0;
                            i15 = b5 + i15;
                            i14 += 3;
                            i3 = 267386880;
                        case 50:
                            z1 z1Var2 = this.p;
                            Object object3 = unsafe2.getObject(obj, j2);
                            Object b16 = b(i14);
                            z1Var2.getClass();
                            y1 y1Var2 = (y1) object3;
                            if (b16 == null) {
                                if (y1Var2.isEmpty()) {
                                    continue;
                                } else {
                                    Iterator it2 = y1Var2.entrySet().iterator();
                                    if (it2.hasNext()) {
                                        Map.Entry entry2 = (Map.Entry) it2.next();
                                        entry2.getKey();
                                        entry2.getValue();
                                        throw null;
                                    }
                                }
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                throw new ClassCastException();
                            }
                        case 51:
                            if (a(obj, i19, i14)) {
                                a = g2.a(i19, 8, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 52:
                            if (a(obj, i19, i14)) {
                                a = g2.a(i19, 4, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 53:
                            if (a(obj, i19, i14)) {
                                long longValue4 = ((Long) x3.e(obj, j2)).longValue();
                                b = b0.b(i19);
                                a2 = b0.a(longValue4);
                                b4 = a2 + b;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 54:
                            if (a(obj, i19, i14)) {
                                long longValue5 = ((Long) x3.e(obj, j2)).longValue();
                                b = b0.b(i19);
                                a2 = b0.a(longValue5);
                                b4 = a2 + b;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 55:
                            if (a(obj, i19, i14)) {
                                int intValue5 = ((Integer) x3.e(obj, j2)).intValue();
                                b2 = b0.b(i19);
                                if (intValue5 >= 0) {
                                    c = b0.c(intValue5);
                                    b4 = c + b2;
                                    a = b4 + i15;
                                    i15 = a;
                                    i14 += 3;
                                    i3 = 267386880;
                                }
                                c = 10;
                                b4 = c + b2;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 56:
                            if (a(obj, i19, i14)) {
                                a = g2.a(i19, 8, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 57:
                            if (a(obj, i19, i14)) {
                                a = g2.a(i19, 4, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 58:
                            if (a(obj, i19, i14)) {
                                a = g2.a(i19, 1, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 59:
                            if (a(obj, i19, i14)) {
                                Object object4 = unsafe2.getObject(obj, j2);
                                if (object4 instanceof s) {
                                    b3 = b0.b(i19);
                                    a3 = b0.a((s) object4);
                                } else {
                                    b3 = b0.b(i19);
                                    a3 = b0.a((String) object4);
                                }
                                b4 = a3 + b3;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 60:
                            if (a(obj, i19, i14)) {
                                Object object5 = unsafe2.getObject(obj, j2);
                                t2 c19 = c(i14);
                                Class cls40 = u2.a;
                                int b17 = b0.b(i19);
                                int serializedSize6 = ((b) ((d2) object5)).getSerializedSize(c19);
                                a = l0.a(serializedSize6, serializedSize6, b17, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 61:
                            if (a(obj, i19, i14)) {
                                s sVar4 = (s) unsafe2.getObject(obj, j2);
                                b3 = b0.b(i19);
                                a3 = b0.a(sVar4);
                                b4 = a3 + b3;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 62:
                            if (a(obj, i19, i14)) {
                                int intValue6 = ((Integer) x3.e(obj, j2)).intValue();
                                b3 = b0.b(i19);
                                a3 = b0.c(intValue6);
                                b4 = a3 + b3;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 63:
                            if (a(obj, i19, i14)) {
                                int intValue7 = ((Integer) x3.e(obj, j2)).intValue();
                                b3 = b0.b(i19);
                                a3 = b0.a(intValue7);
                                b4 = a3 + b3;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 64:
                            if (a(obj, i19, i14)) {
                                a = g2.a(i19, 4, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 65:
                            if (a(obj, i19, i14)) {
                                a = g2.a(i19, 8, i15);
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 66:
                            if (a(obj, i19, i14)) {
                                int intValue8 = ((Integer) x3.e(obj, j2)).intValue();
                                b = b0.b(i19);
                                a2 = b0.c(b0.d(intValue8));
                                b4 = a2 + b;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 67:
                            if (a(obj, i19, i14)) {
                                long longValue6 = ((Long) x3.e(obj, j2)).longValue();
                                b = b0.b(i19);
                                a2 = b0.a(b0.b(longValue6));
                                b4 = a2 + b;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 68:
                            if (a(obj, i19, i14)) {
                                d2 d2Var4 = (d2) unsafe2.getObject(obj, j2);
                                t2 c20 = c(i14);
                                b = b0.b(i19) * 2;
                                a2 = ((b) d2Var4).getSerializedSize(c20);
                                b4 = a2 + b;
                                a = b4 + i15;
                                i15 = a;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        default:
                            i14 += 3;
                            i3 = 267386880;
                    }
                } else {
                    this.n.getClass();
                    int a10 = ((z0) obj).unknownFields.a() + i15;
                    if (!this.f) {
                        return a10;
                    }
                    this.o.getClass();
                    return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.b() + a10;
                }
            }
        }
    }

    public final void d(int i, Object obj, Object obj2) {
        long j = this.a[i + 1] & 1048575;
        if (a(i, obj2)) {
            Object e = x3.e(obj, j);
            Object e2 = x3.e(obj2, j);
            if (e != null && e2 != null) {
                x3.a(j, obj, l1.a(e, e2));
                b(i, obj);
            } else if (e2 != null) {
                x3.a(j, obj, e2);
                b(i, obj);
            }
        }
    }

    public static Field a(Class cls, String str) {
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

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final Object a() {
        k2 k2Var = this.l;
        d2 d2Var = this.e;
        k2Var.getClass();
        return ((z0) d2Var).dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, Object obj2) {
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int i2 = iArr[i + 1];
                long j = 1048575 & i2;
                int i3 = iArr[i];
                switch ((i2 & 267386880) >>> 20) {
                    case 0:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            w3 w3Var = x3.c;
                            w3Var.a(obj, j, w3Var.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 1:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            w3 w3Var2 = x3.c;
                            w3Var2.a(obj, j, w3Var2.d(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 2:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            x3.a(obj, j, x3.d(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 3:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            x3.a(obj, j, x3.d(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 4:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            x3.a(obj, j, x3.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 5:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            x3.a(obj, j, x3.d(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 6:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            x3.a(obj, j, x3.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 7:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            w3 w3Var3 = x3.c;
                            w3Var3.a(obj, j, w3Var3.a(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 8:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            x3.a(j, obj, x3.e(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 9:
                        d(i, obj, obj2);
                        break;
                    case 10:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            x3.a(j, obj, x3.e(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 11:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            x3.a(obj, j, x3.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 12:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            x3.a(obj, j, x3.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 13:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            x3.a(obj, j, x3.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 14:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            x3.a(obj, j, x3.d(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 15:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            x3.a(obj, j, x3.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 16:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            x3.a(obj, j, x3.d(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 17:
                        d(i, obj, obj2);
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
                    case 32:
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
                        this.m.a(j, obj, obj2);
                        break;
                    case 50:
                        z1 z1Var = this.p;
                        Class cls = u2.a;
                        Object e = x3.e(obj, j);
                        Object e2 = x3.e(obj2, j);
                        z1Var.getClass();
                        x3.a(j, obj, z1.a(e, e2));
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
                        if (!a(obj2, i3, i)) {
                            break;
                        } else {
                            x3.a(j, obj, x3.e(obj2, j));
                            b(obj, i3, i);
                            break;
                        }
                    case 60:
                        e(i, obj, obj2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!a(obj2, i3, i)) {
                            break;
                        } else {
                            x3.a(j, obj, x3.e(obj2, j));
                            b(obj, i3, i);
                            break;
                        }
                    case 68:
                        e(i, obj, obj2);
                        break;
                }
                i += 3;
            } else {
                o3 o3Var = this.n;
                Class cls2 = u2.a;
                o3Var.getClass();
                z0 z0Var = (z0) obj;
                n3 n3Var = z0Var.unknownFields;
                n3 n3Var2 = ((z0) obj2).unknownFields;
                if (!n3Var2.equals(n3.f)) {
                    n3Var = n3.a(n3Var, n3Var2);
                }
                z0Var.unknownFields = n3Var;
                if (this.f) {
                    this.o.getClass();
                    n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj2).extensions;
                    if (n0Var.a.isEmpty()) {
                        return;
                    }
                    ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable().a(n0Var);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x09a3  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x09f2  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0a32  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0a60  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0aa0  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0ad6  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0af6  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0b05  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0b23  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0b5d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e9  */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, c0 c0Var) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i;
        int i2;
        boolean z;
        boolean z2;
        Map.Entry entry2;
        Iterator it2;
        int length2;
        c0Var.getClass();
        int i3 = 267386880;
        int i4 = 1048575;
        if (q4.ASCENDING == q4.DESCENDING) {
            this.n.getClass();
            ((z0) obj).unknownFields.a(c0Var);
            if (this.f) {
                this.o.getClass();
                n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
                if (!n0Var.a.isEmpty()) {
                    if (n0Var.c) {
                        e3 e3Var = n0Var.a;
                        if (e3Var.g == null) {
                            e3Var.g = new x2(e3Var);
                        }
                        it2 = new o1(new w2(e3Var.g.b));
                    } else {
                        e3 e3Var2 = n0Var.a;
                        if (e3Var2.g == null) {
                            e3Var2.g = new x2(e3Var2);
                        }
                        it2 = new w2(e3Var2.g.b);
                    }
                    entry2 = (Map.Entry) it2.next();
                    for (length2 = this.a.length - 3; length2 >= 0; length2 -= 3) {
                        int[] iArr = this.a;
                        int i5 = iArr[length2 + 1];
                        int i6 = iArr[length2];
                        while (entry2 != null) {
                            this.o.getClass();
                            if (((w0) entry2.getKey()).b > i6) {
                                this.o.getClass();
                                j0.a(c0Var, entry2);
                                entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                            } else {
                                switch ((i5 & 267386880) >>> 20) {
                                    case 0:
                                        if (a(length2, obj)) {
                                            c0Var.a(i6, x3.c.c(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1:
                                        if (a(length2, obj)) {
                                            c0Var.a(i6, x3.c.d(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 2:
                                        if (a(length2, obj)) {
                                            c0Var.a.b(i6, x3.d(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 3:
                                        if (a(length2, obj)) {
                                            c0Var.a.b(i6, x3.d(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 4:
                                        if (a(length2, obj)) {
                                            c0Var.a.b(i6, x3.c(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 5:
                                        if (a(length2, obj)) {
                                            c0Var.a.a(i6, x3.d(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 6:
                                        if (a(length2, obj)) {
                                            c0Var.a.a(i6, x3.c(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 7:
                                        if (a(length2, obj)) {
                                            c0Var.a.a(i6, x3.c.a(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 8:
                                        if (a(length2, obj)) {
                                            a(i6, x3.e(obj, i5 & 1048575), c0Var);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 9:
                                        if (a(length2, obj)) {
                                            c0Var.a.a(i6, (d2) x3.e(obj, i5 & 1048575), c(length2));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 10:
                                        if (a(length2, obj)) {
                                            c0Var.a.a(i6, (s) x3.e(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 11:
                                        if (a(length2, obj)) {
                                            c0Var.a.d(i6, x3.c(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 12:
                                        if (a(length2, obj)) {
                                            c0Var.a.b(i6, x3.c(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 13:
                                        if (a(length2, obj)) {
                                            c0Var.a.a(i6, x3.c(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 14:
                                        if (a(length2, obj)) {
                                            c0Var.a.a(i6, x3.d(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 15:
                                        if (a(length2, obj)) {
                                            c0Var.a(i6, x3.c(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 16:
                                        if (a(length2, obj)) {
                                            c0Var.a(i6, x3.d(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 17:
                                        if (a(length2, obj)) {
                                            c0Var.a(i6, x3.e(obj, i5 & 1048575), c(length2));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 18:
                                        u2.b(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 19:
                                        u2.f(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 20:
                                        u2.h(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 21:
                                        u2.n(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 22:
                                        u2.g(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 23:
                                        u2.e(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 24:
                                        u2.d(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 25:
                                        u2.a(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 26:
                                        u2.b(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var);
                                        break;
                                    case 27:
                                        u2.b(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, c(length2));
                                        break;
                                    case 28:
                                        u2.a(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var);
                                        break;
                                    case 29:
                                        u2.m(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 30:
                                        u2.c(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 31:
                                        u2.i(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 32:
                                        u2.j(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 33:
                                        u2.k(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 34:
                                        u2.l(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 35:
                                        u2.b(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 36:
                                        u2.f(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 37:
                                        u2.h(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 38:
                                        u2.n(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 39:
                                        u2.g(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 40:
                                        u2.e(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 41:
                                        u2.d(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 42:
                                        u2.a(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 43:
                                        u2.m(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 44:
                                        u2.c(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 45:
                                        u2.i(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 46:
                                        u2.j(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 47:
                                        u2.k(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 48:
                                        u2.l(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 49:
                                        u2.a(this.a[length2], (List) x3.e(obj, i5 & 1048575), c0Var, c(length2));
                                        break;
                                    case 50:
                                        if (x3.e(obj, i5 & 1048575) != null) {
                                            z1 z1Var = this.p;
                                            Object b = b(length2);
                                            z1Var.getClass();
                                            b.getClass();
                                            throw new ClassCastException();
                                        }
                                        break;
                                    case 51:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a(i6, ((Double) x3.e(obj, i5 & 1048575)).doubleValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 52:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a(i6, ((Float) x3.e(obj, i5 & 1048575)).floatValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 53:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a.b(i6, ((Long) x3.e(obj, i5 & 1048575)).longValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 54:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a.b(i6, ((Long) x3.e(obj, i5 & 1048575)).longValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 55:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a.b(i6, ((Integer) x3.e(obj, i5 & 1048575)).intValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 56:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a.a(i6, ((Long) x3.e(obj, i5 & 1048575)).longValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 57:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a.a(i6, ((Integer) x3.e(obj, i5 & 1048575)).intValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 58:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a.a(i6, ((Boolean) x3.e(obj, i5 & 1048575)).booleanValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 59:
                                        if (a(obj, i6, length2)) {
                                            a(i6, x3.e(obj, i5 & 1048575), c0Var);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 60:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a.a(i6, (d2) x3.e(obj, i5 & 1048575), c(length2));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 61:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a.a(i6, (s) x3.e(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 62:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a.d(i6, ((Integer) x3.e(obj, i5 & 1048575)).intValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 63:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a.b(i6, ((Integer) x3.e(obj, i5 & 1048575)).intValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 64:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a.a(i6, ((Integer) x3.e(obj, i5 & 1048575)).intValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 65:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a.a(i6, ((Long) x3.e(obj, i5 & 1048575)).longValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 66:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a(i6, ((Integer) x3.e(obj, i5 & 1048575)).intValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 67:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a(i6, ((Long) x3.e(obj, i5 & 1048575)).longValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 68:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a(i6, x3.e(obj, i5 & 1048575), c(length2));
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            }
                        }
                        switch ((i5 & 267386880) >>> 20) {
                        }
                    }
                    while (entry2 != null) {
                        this.o.getClass();
                        j0.a(c0Var, entry2);
                        entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                    }
                    return;
                }
            }
            entry2 = null;
            it2 = null;
            while (length2 >= 0) {
            }
            while (entry2 != null) {
            }
            return;
        }
        if (this.h) {
            b(obj, c0Var);
            return;
        }
        if (this.f) {
            this.o.getClass();
            n0 n0Var2 = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
            if (!n0Var2.a.isEmpty()) {
                it = n0Var2.d();
                entry = (Map.Entry) it.next();
                length = this.a.length;
                Unsafe unsafe = r;
                i = 0;
                int i7 = 0;
                int i8 = 1048575;
                while (i < length) {
                    int[] iArr2 = this.a;
                    int i9 = iArr2[i + 1];
                    int i10 = iArr2[i];
                    int i11 = (i9 & i3) >>> 20;
                    if (i11 <= 17) {
                        int i12 = iArr2[i + 2];
                        int i13 = i12 & i4;
                        if (i13 != i8) {
                            i7 = unsafe.getInt(obj, i13);
                            i8 = i13;
                        }
                        i2 = 1 << (i12 >>> 20);
                    } else {
                        i2 = 0;
                    }
                    while (entry != null) {
                        this.o.getClass();
                        if (((w0) entry.getKey()).b <= i10) {
                            this.o.getClass();
                            j0.a(c0Var, entry);
                            entry = it.hasNext() ? (Map.Entry) it.next() : null;
                        } else {
                            int i14 = length;
                            long j = i9 & i4;
                            switch (i11) {
                                case 0:
                                    z = false;
                                    if ((i7 & i2) != 0) {
                                        c0Var.a(i10, x3.c.c(obj, j));
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 1:
                                    z = false;
                                    if ((i7 & i2) != 0) {
                                        c0Var.a(i10, x3.c.d(obj, j));
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 2:
                                    z = false;
                                    if ((i7 & i2) != 0) {
                                        c0Var.a.b(i10, unsafe.getLong(obj, j));
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 3:
                                    z = false;
                                    if ((i7 & i2) != 0) {
                                        c0Var.a.b(i10, unsafe.getLong(obj, j));
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 4:
                                    z = false;
                                    if ((i7 & i2) != 0) {
                                        c0Var.a.b(i10, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 5:
                                    z = false;
                                    if ((i7 & i2) != 0) {
                                        c0Var.a.a(i10, unsafe.getLong(obj, j));
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 6:
                                    z = false;
                                    if ((i7 & i2) != 0) {
                                        c0Var.a.a(i10, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 7:
                                    z = false;
                                    if ((i7 & i2) != 0) {
                                        c0Var.a.a(i10, x3.c.a(obj, j));
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 8:
                                    z = false;
                                    if ((i7 & i2) != 0) {
                                        a(i10, unsafe.getObject(obj, j), c0Var);
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 9:
                                    z = false;
                                    if ((i7 & i2) != 0) {
                                        c0Var.a.a(i10, (d2) unsafe.getObject(obj, j), c(i));
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 10:
                                    z = false;
                                    if ((i7 & i2) != 0) {
                                        c0Var.a.a(i10, (s) unsafe.getObject(obj, j));
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 11:
                                    z = false;
                                    if ((i7 & i2) != 0) {
                                        c0Var.a.d(i10, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 12:
                                    z = false;
                                    if ((i7 & i2) != 0) {
                                        c0Var.a.b(i10, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 13:
                                    z = false;
                                    if ((i7 & i2) != 0) {
                                        c0Var.a.a(i10, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 14:
                                    z = false;
                                    if ((i7 & i2) != 0) {
                                        c0Var.a.a(i10, unsafe.getLong(obj, j));
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 15:
                                    z = false;
                                    if ((i7 & i2) != 0) {
                                        c0Var.a(i10, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 16:
                                    z = false;
                                    if ((i7 & i2) != 0) {
                                        c0Var.a(i10, unsafe.getLong(obj, j));
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 17:
                                    z = false;
                                    if ((i7 & i2) != 0) {
                                        c0Var.a(i10, unsafe.getObject(obj, j), c(i));
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 18:
                                    z = false;
                                    u2.b(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 19:
                                    z = false;
                                    u2.f(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 20:
                                    z = false;
                                    u2.h(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 21:
                                    z = false;
                                    u2.n(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 22:
                                    z = false;
                                    u2.g(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 23:
                                    z = false;
                                    u2.e(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 24:
                                    z = false;
                                    u2.d(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 25:
                                    z = false;
                                    u2.a(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 26:
                                    u2.b(this.a[i], (List) unsafe.getObject(obj, j), c0Var);
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 27:
                                    u2.b(this.a[i], (List) unsafe.getObject(obj, j), c0Var, c(i));
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 28:
                                    u2.a(this.a[i], (List) unsafe.getObject(obj, j), c0Var);
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 29:
                                    z2 = false;
                                    u2.m(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    z = z2;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 30:
                                    z2 = false;
                                    u2.c(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    z = z2;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 31:
                                    z2 = false;
                                    u2.i(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    z = z2;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 32:
                                    z2 = false;
                                    u2.j(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    z = z2;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 33:
                                    z2 = false;
                                    u2.k(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    z = z2;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 34:
                                    z2 = false;
                                    u2.l(this.a[i], (List) unsafe.getObject(obj, j), c0Var, false);
                                    z = z2;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 35:
                                    u2.b(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 36:
                                    u2.f(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 37:
                                    u2.h(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 38:
                                    u2.n(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 39:
                                    u2.g(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 40:
                                    u2.e(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 41:
                                    u2.d(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 42:
                                    u2.a(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 43:
                                    u2.m(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 44:
                                    u2.c(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 45:
                                    u2.i(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 46:
                                    u2.j(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 47:
                                    u2.k(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 48:
                                    u2.l(this.a[i], (List) unsafe.getObject(obj, j), c0Var, true);
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 49:
                                    u2.a(this.a[i], (List) unsafe.getObject(obj, j), c0Var, c(i));
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 50:
                                    if (unsafe.getObject(obj, j) != null) {
                                        z1 z1Var2 = this.p;
                                        Object b2 = b(i);
                                        z1Var2.getClass();
                                        b2.getClass();
                                        throw new ClassCastException();
                                    }
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 51:
                                    if (a(obj, i10, i)) {
                                        c0Var.a(i10, ((Double) x3.e(obj, j)).doubleValue());
                                    }
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 52:
                                    if (a(obj, i10, i)) {
                                        c0Var.a(i10, ((Float) x3.e(obj, j)).floatValue());
                                    }
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 53:
                                    if (a(obj, i10, i)) {
                                        c0Var.a.b(i10, ((Long) x3.e(obj, j)).longValue());
                                    }
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 54:
                                    if (a(obj, i10, i)) {
                                        c0Var.a.b(i10, ((Long) x3.e(obj, j)).longValue());
                                    }
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 55:
                                    if (a(obj, i10, i)) {
                                        c0Var.a.b(i10, ((Integer) x3.e(obj, j)).intValue());
                                    }
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 56:
                                    if (a(obj, i10, i)) {
                                        c0Var.a.a(i10, ((Long) x3.e(obj, j)).longValue());
                                    }
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 57:
                                    if (a(obj, i10, i)) {
                                        c0Var.a.a(i10, ((Integer) x3.e(obj, j)).intValue());
                                    }
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 58:
                                    if (a(obj, i10, i)) {
                                        c0Var.a.a(i10, ((Boolean) x3.e(obj, j)).booleanValue());
                                    }
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 59:
                                    if (a(obj, i10, i)) {
                                        a(i10, unsafe.getObject(obj, j), c0Var);
                                    }
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 60:
                                    if (a(obj, i10, i)) {
                                        c0Var.a.a(i10, (d2) unsafe.getObject(obj, j), c(i));
                                    }
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 61:
                                    if (a(obj, i10, i)) {
                                        c0Var.a.a(i10, (s) unsafe.getObject(obj, j));
                                    }
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 62:
                                    if (a(obj, i10, i)) {
                                        c0Var.a.d(i10, ((Integer) x3.e(obj, j)).intValue());
                                    }
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 63:
                                    if (a(obj, i10, i)) {
                                        c0Var.a.b(i10, ((Integer) x3.e(obj, j)).intValue());
                                    }
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 64:
                                    if (a(obj, i10, i)) {
                                        c0Var.a.a(i10, ((Integer) x3.e(obj, j)).intValue());
                                    }
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 65:
                                    if (a(obj, i10, i)) {
                                        c0Var.a.a(i10, ((Long) x3.e(obj, j)).longValue());
                                    }
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 66:
                                    if (a(obj, i10, i)) {
                                        c0Var.a(i10, ((Integer) x3.e(obj, j)).intValue());
                                    }
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 67:
                                    if (a(obj, i10, i)) {
                                        c0Var.a(i10, ((Long) x3.e(obj, j)).longValue());
                                    }
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 68:
                                    if (a(obj, i10, i)) {
                                        c0Var.a(i10, unsafe.getObject(obj, j), c(i));
                                    }
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                default:
                                    z = false;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                            }
                        }
                    }
                    int i142 = length;
                    long j2 = i9 & i4;
                    switch (i11) {
                    }
                }
                while (entry != null) {
                    this.o.getClass();
                    j0.a(c0Var, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                this.n.getClass();
                ((z0) obj).unknownFields.a(c0Var);
            }
        }
        it = null;
        entry = null;
        length = this.a.length;
        Unsafe unsafe2 = r;
        i = 0;
        int i72 = 0;
        int i82 = 1048575;
        while (i < length) {
        }
        while (entry != null) {
        }
        this.n.getClass();
        ((z0) obj).unknownFields.a(c0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj, c0 c0Var) {
        Iterator it;
        Map.Entry entry;
        int length;
        int i;
        if (this.f) {
            this.o.getClass();
            n0 n0Var = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
            if (!n0Var.a.isEmpty()) {
                it = n0Var.d();
                entry = (Map.Entry) it.next();
                length = this.a.length;
                for (i = 0; i < length; i += 3) {
                    int[] iArr = this.a;
                    int i2 = iArr[i + 1];
                    int i3 = iArr[i];
                    while (entry != null) {
                        this.o.getClass();
                        if (((w0) entry.getKey()).b <= i3) {
                            this.o.getClass();
                            j0.a(c0Var, entry);
                            entry = it.hasNext() ? (Map.Entry) it.next() : null;
                        } else {
                            switch ((267386880 & i2) >>> 20) {
                                case 0:
                                    if (a(i, obj)) {
                                        c0Var.a(i3, x3.c.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1:
                                    if (a(i, obj)) {
                                        c0Var.a(i3, x3.c.d(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 2:
                                    if (a(i, obj)) {
                                        c0Var.a.b(i3, x3.d(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 3:
                                    if (a(i, obj)) {
                                        c0Var.a.b(i3, x3.d(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 4:
                                    if (a(i, obj)) {
                                        c0Var.a.b(i3, x3.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 5:
                                    if (a(i, obj)) {
                                        c0Var.a.a(i3, x3.d(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 6:
                                    if (a(i, obj)) {
                                        c0Var.a.a(i3, x3.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 7:
                                    if (a(i, obj)) {
                                        c0Var.a.a(i3, x3.c.a(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 8:
                                    if (a(i, obj)) {
                                        a(i3, x3.e(obj, i2 & 1048575), c0Var);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 9:
                                    if (a(i, obj)) {
                                        c0Var.a.a(i3, (d2) x3.e(obj, i2 & 1048575), c(i));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 10:
                                    if (a(i, obj)) {
                                        c0Var.a.a(i3, (s) x3.e(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 11:
                                    if (a(i, obj)) {
                                        c0Var.a.d(i3, x3.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 12:
                                    if (a(i, obj)) {
                                        c0Var.a.b(i3, x3.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 13:
                                    if (a(i, obj)) {
                                        c0Var.a.a(i3, x3.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 14:
                                    if (a(i, obj)) {
                                        c0Var.a.a(i3, x3.d(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 15:
                                    if (a(i, obj)) {
                                        c0Var.a(i3, x3.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 16:
                                    if (a(i, obj)) {
                                        c0Var.a(i3, x3.d(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 17:
                                    if (a(i, obj)) {
                                        c0Var.a(i3, x3.e(obj, i2 & 1048575), c(i));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 18:
                                    u2.b(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 19:
                                    u2.f(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 20:
                                    u2.h(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 21:
                                    u2.n(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 22:
                                    u2.g(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 23:
                                    u2.e(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 24:
                                    u2.d(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 25:
                                    u2.a(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 26:
                                    u2.b(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var);
                                    break;
                                case 27:
                                    u2.b(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, c(i));
                                    break;
                                case 28:
                                    u2.a(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var);
                                    break;
                                case 29:
                                    u2.m(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 30:
                                    u2.c(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 31:
                                    u2.i(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 32:
                                    u2.j(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 33:
                                    u2.k(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 34:
                                    u2.l(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 35:
                                    u2.b(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 36:
                                    u2.f(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 37:
                                    u2.h(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 38:
                                    u2.n(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 39:
                                    u2.g(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 40:
                                    u2.e(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 41:
                                    u2.d(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 42:
                                    u2.a(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 43:
                                    u2.m(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 44:
                                    u2.c(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 45:
                                    u2.i(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 46:
                                    u2.j(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 47:
                                    u2.k(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 48:
                                    u2.l(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 49:
                                    u2.a(this.a[i], (List) x3.e(obj, i2 & 1048575), c0Var, c(i));
                                    break;
                                case 50:
                                    if (x3.e(obj, i2 & 1048575) != null) {
                                        z1 z1Var = this.p;
                                        Object b = b(i);
                                        z1Var.getClass();
                                        b.getClass();
                                        throw new ClassCastException();
                                    }
                                    break;
                                case 51:
                                    if (a(obj, i3, i)) {
                                        c0Var.a(i3, ((Double) x3.e(obj, i2 & 1048575)).doubleValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 52:
                                    if (a(obj, i3, i)) {
                                        c0Var.a(i3, ((Float) x3.e(obj, i2 & 1048575)).floatValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 53:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.b(i3, ((Long) x3.e(obj, i2 & 1048575)).longValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 54:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.b(i3, ((Long) x3.e(obj, i2 & 1048575)).longValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 55:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.b(i3, ((Integer) x3.e(obj, i2 & 1048575)).intValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 56:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.a(i3, ((Long) x3.e(obj, i2 & 1048575)).longValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 57:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.a(i3, ((Integer) x3.e(obj, i2 & 1048575)).intValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 58:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.a(i3, ((Boolean) x3.e(obj, i2 & 1048575)).booleanValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 59:
                                    if (a(obj, i3, i)) {
                                        a(i3, x3.e(obj, i2 & 1048575), c0Var);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 60:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.a(i3, (d2) x3.e(obj, i2 & 1048575), c(i));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 61:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.a(i3, (s) x3.e(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 62:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.d(i3, ((Integer) x3.e(obj, i2 & 1048575)).intValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 63:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.b(i3, ((Integer) x3.e(obj, i2 & 1048575)).intValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 64:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.a(i3, ((Integer) x3.e(obj, i2 & 1048575)).intValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 65:
                                    if (a(obj, i3, i)) {
                                        c0Var.a.a(i3, ((Long) x3.e(obj, i2 & 1048575)).longValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 66:
                                    if (a(obj, i3, i)) {
                                        c0Var.a(i3, ((Integer) x3.e(obj, i2 & 1048575)).intValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 67:
                                    if (a(obj, i3, i)) {
                                        c0Var.a(i3, ((Long) x3.e(obj, i2 & 1048575)).longValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 68:
                                    if (a(obj, i3, i)) {
                                        c0Var.a(i3, x3.e(obj, i2 & 1048575), c(i));
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        }
                    }
                    switch ((267386880 & i2) >>> 20) {
                    }
                }
                while (entry != null) {
                    this.o.getClass();
                    j0.a(c0Var, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                this.n.getClass();
                ((z0) obj).unknownFields.a(c0Var);
            }
        }
        it = null;
        entry = null;
        length = this.a.length;
        while (i < length) {
        }
        while (entry != null) {
        }
        this.n.getClass();
        ((z0) obj).unknownFields.a(c0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(Object obj, s2 s2Var, h0 h0Var) {
        h0Var.getClass();
        a(this.n, this.o, obj, s2Var, h0Var);
    }

    public final void a(o3 o3Var, j0 j0Var, Object obj, s2 s2Var, h0 h0Var) {
        x0 a;
        Object a2;
        Object obj2 = null;
        n0 n0Var = null;
        while (true) {
            try {
                int s = s2Var.s();
                int a3 = (s < this.c || s > this.d) ? -1 : a(s, 0);
                if (a3 < 0) {
                    if (s == Integer.MAX_VALUE) {
                        if (obj2 != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (this.f) {
                        d2 d2Var = this.e;
                        j0Var.getClass();
                        a = h0Var.a(s, d2Var);
                    } else {
                        a = null;
                    }
                    if (a != null) {
                        if (n0Var == null) {
                            j0Var.getClass();
                            n0Var = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
                        }
                        j0Var.getClass();
                        a2 = j0.a(s2Var, a, h0Var, n0Var, obj2, o3Var);
                    } else {
                        o3Var.getClass();
                        if (obj2 == null) {
                            z0 z0Var = (z0) obj;
                            n3 n3Var = z0Var.unknownFields;
                            if (n3Var == n3.f) {
                                n3Var = new n3();
                                z0Var.unknownFields = n3Var;
                            }
                            obj2 = n3Var;
                        }
                        if (!o3.a(obj2, s2Var)) {
                            for (int i = this.j; i < this.k; i++) {
                                obj2 = b(this.i[i], obj, obj2);
                            }
                            if (obj2 != null) {
                                o3.a(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    int i2 = this.a[a3 + 1];
                    switch ((267386880 & i2) >>> 20) {
                        case 0:
                            x3.c.a(obj, d(i2), s2Var.h());
                            b(a3, obj);
                        case 1:
                            x3.c.a(obj, d(i2), s2Var.k());
                            b(a3, obj);
                        case 2:
                            x3.a(obj, d(i2), s2Var.o());
                            b(a3, obj);
                        case 3:
                            x3.a(obj, d(i2), s2Var.f());
                            b(a3, obj);
                        case 4:
                            x3.a(obj, d(i2), s2Var.d());
                            b(a3, obj);
                        case 5:
                            x3.a(obj, d(i2), s2Var.g());
                            b(a3, obj);
                        case 6:
                            x3.a(obj, d(i2), s2Var.q());
                            b(a3, obj);
                        case 7:
                            x3.c.a(obj, d(i2), s2Var.r());
                            b(a3, obj);
                        case 8:
                            if ((i2 & 536870912) != 0) {
                                x3.a(i2 & 1048575, obj, s2Var.p());
                            } else if (this.g) {
                                x3.a(i2 & 1048575, obj, s2Var.n());
                            } else {
                                x3.a(i2 & 1048575, obj, s2Var.a());
                            }
                            b(a3, obj);
                        case 9:
                            if (a(a3, obj)) {
                                x3.a(d(i2), obj, l1.a(x3.e(obj, d(i2)), s2Var.b(c(a3), h0Var)));
                            } else {
                                x3.a(d(i2), obj, s2Var.b(c(a3), h0Var));
                                b(a3, obj);
                            }
                        case 10:
                            x3.a(d(i2), obj, s2Var.a());
                            b(a3, obj);
                        case 11:
                            x3.a(obj, d(i2), s2Var.c());
                            b(a3, obj);
                        case 12:
                            int b = s2Var.b();
                            a(a3);
                            x3.a(obj, d(i2), b);
                            b(a3, obj);
                        case 13:
                            x3.a(obj, d(i2), s2Var.m());
                            b(a3, obj);
                        case 14:
                            x3.a(obj, d(i2), s2Var.t());
                            b(a3, obj);
                        case 15:
                            x3.a(obj, d(i2), s2Var.j());
                            b(a3, obj);
                        case 16:
                            x3.a(obj, d(i2), s2Var.l());
                            b(a3, obj);
                        case 17:
                            if (a(a3, obj)) {
                                x3.a(d(i2), obj, l1.a(x3.e(obj, d(i2)), s2Var.a(c(a3), h0Var)));
                            } else {
                                x3.a(d(i2), obj, s2Var.a(c(a3), h0Var));
                                b(a3, obj);
                            }
                        case 18:
                            s2Var.j(this.m.b(obj, d(i2)));
                        case 19:
                            s2Var.d(this.m.b(obj, d(i2)));
                        case 20:
                            s2Var.k(this.m.b(obj, d(i2)));
                        case 21:
                            s2Var.a(this.m.b(obj, d(i2)));
                        case 22:
                            s2Var.o(this.m.b(obj, d(i2)));
                        case 23:
                            s2Var.n(this.m.b(obj, d(i2)));
                        case 24:
                            s2Var.e(this.m.b(obj, d(i2)));
                        case 25:
                            s2Var.l(this.m.b(obj, d(i2)));
                        case 26:
                            a(obj, i2, s2Var);
                        case 27:
                            a(obj, i2, s2Var, c(a3), h0Var);
                        case 28:
                            s2Var.h(this.m.b(obj, d(i2)));
                        case 29:
                            s2Var.i(this.m.b(obj, d(i2)));
                        case 30:
                            List b2 = this.m.b(obj, d(i2));
                            s2Var.p(b2);
                            a(a3);
                            a2 = u2.a(s, b2, obj2, o3Var);
                            break;
                        case 31:
                            s2Var.f(this.m.b(obj, d(i2)));
                        case 32:
                            s2Var.m(this.m.b(obj, d(i2)));
                        case 33:
                            s2Var.c(this.m.b(obj, d(i2)));
                        case 34:
                            s2Var.g(this.m.b(obj, d(i2)));
                        case 35:
                            s2Var.j(this.m.b(obj, d(i2)));
                        case 36:
                            s2Var.d(this.m.b(obj, d(i2)));
                        case 37:
                            s2Var.k(this.m.b(obj, d(i2)));
                        case 38:
                            s2Var.a(this.m.b(obj, d(i2)));
                        case 39:
                            s2Var.o(this.m.b(obj, d(i2)));
                        case 40:
                            s2Var.n(this.m.b(obj, d(i2)));
                        case 41:
                            s2Var.e(this.m.b(obj, d(i2)));
                        case 42:
                            s2Var.l(this.m.b(obj, d(i2)));
                        case 43:
                            s2Var.i(this.m.b(obj, d(i2)));
                        case 44:
                            List b3 = this.m.b(obj, d(i2));
                            s2Var.p(b3);
                            a(a3);
                            a2 = u2.a(s, b3, obj2, o3Var);
                            break;
                        case 45:
                            s2Var.f(this.m.b(obj, d(i2)));
                        case 46:
                            s2Var.m(this.m.b(obj, d(i2)));
                        case 47:
                            s2Var.c(this.m.b(obj, d(i2)));
                        case 48:
                            s2Var.g(this.m.b(obj, d(i2)));
                        case 49:
                            a(obj, d(i2), s2Var, c(a3), h0Var);
                        case 50:
                            c(a3, obj, b(a3));
                            throw null;
                            break;
                        case 51:
                            x3.a(d(i2), obj, Double.valueOf(s2Var.h()));
                            b(obj, s, a3);
                        case 52:
                            x3.a(d(i2), obj, Float.valueOf(s2Var.k()));
                            b(obj, s, a3);
                        case 53:
                            x3.a(d(i2), obj, Long.valueOf(s2Var.o()));
                            b(obj, s, a3);
                        case 54:
                            x3.a(d(i2), obj, Long.valueOf(s2Var.f()));
                            b(obj, s, a3);
                        case 55:
                            x3.a(d(i2), obj, Integer.valueOf(s2Var.d()));
                            b(obj, s, a3);
                        case 56:
                            x3.a(d(i2), obj, Long.valueOf(s2Var.g()));
                            b(obj, s, a3);
                        case 57:
                            x3.a(d(i2), obj, Integer.valueOf(s2Var.q()));
                            b(obj, s, a3);
                        case 58:
                            x3.a(d(i2), obj, Boolean.valueOf(s2Var.r()));
                            b(obj, s, a3);
                        case 59:
                            if ((i2 & 536870912) != 0) {
                                x3.a(i2 & 1048575, obj, s2Var.p());
                            } else if (this.g) {
                                x3.a(i2 & 1048575, obj, s2Var.n());
                            } else {
                                x3.a(i2 & 1048575, obj, s2Var.a());
                            }
                            b(obj, s, a3);
                        case 60:
                            if (a(obj, s, a3)) {
                                x3.a(d(i2), obj, l1.a(x3.e(obj, d(i2)), s2Var.b(c(a3), h0Var)));
                            } else {
                                x3.a(d(i2), obj, s2Var.b(c(a3), h0Var));
                                b(a3, obj);
                            }
                            b(obj, s, a3);
                        case 61:
                            x3.a(d(i2), obj, s2Var.a());
                            b(obj, s, a3);
                        case 62:
                            x3.a(d(i2), obj, Integer.valueOf(s2Var.c()));
                            b(obj, s, a3);
                        case 63:
                            int b4 = s2Var.b();
                            a(a3);
                            x3.a(d(i2), obj, Integer.valueOf(b4));
                            b(obj, s, a3);
                        case 64:
                            x3.a(d(i2), obj, Integer.valueOf(s2Var.m()));
                            b(obj, s, a3);
                        case 65:
                            x3.a(d(i2), obj, Long.valueOf(s2Var.t()));
                            b(obj, s, a3);
                        case 66:
                            x3.a(d(i2), obj, Integer.valueOf(s2Var.j()));
                            b(obj, s, a3);
                        case 67:
                            x3.a(d(i2), obj, Long.valueOf(s2Var.l()));
                            b(obj, s, a3);
                        case 68:
                            x3.a(d(i2), obj, s2Var.a(c(a3), h0Var));
                            b(obj, s, a3);
                        default:
                            if (obj2 == null) {
                                try {
                                    o3Var.getClass();
                                    obj2 = new n3();
                                } catch (m1 unused) {
                                    o3Var.getClass();
                                    if (obj2 == null) {
                                        z0 z0Var2 = (z0) obj;
                                        n3 n3Var2 = z0Var2.unknownFields;
                                        if (n3Var2 == n3.f) {
                                            n3Var2 = new n3();
                                            z0Var2.unknownFields = n3Var2;
                                        }
                                        obj2 = n3Var2;
                                    }
                                    if (!o3.a(obj2, s2Var)) {
                                        for (int i3 = this.j; i3 < this.k; i3++) {
                                            obj2 = b(this.i[i3], obj, obj2);
                                        }
                                        if (obj2 != null) {
                                            o3.a(obj, obj2);
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            o3Var.getClass();
                            if (!o3.a(obj2, s2Var)) {
                                for (int i4 = this.j; i4 < this.k; i4++) {
                                    obj2 = b(this.i[i4], obj, obj2);
                                }
                                if (obj2 != null) {
                                    o3.a(obj, obj2);
                                    return;
                                }
                                return;
                            }
                    }
                }
                obj2 = a2;
            } finally {
                for (int i5 = this.j; i5 < this.k; i5++) {
                    obj2 = b(this.i[i5], obj, obj2);
                }
                if (obj2 != null) {
                    o3Var.getClass();
                    o3.a(obj, obj2);
                }
            }
        }
    }

    public final Object b(int i) {
        return this.b[(i / 3) * 2];
    }

    public final Object b(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (x3.e(obj, r0[i + 1] & 1048575) == null) {
            return obj2;
        }
        a(i);
        return obj2;
    }

    public final void b(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        x3.a(obj, j, (1 << (i2 >>> 20)) | x3.c(obj, j));
    }

    public final void b(Object obj, int i, int i2) {
        x3.a(obj, this.a[i2 + 2] & 1048575, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int a(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, f fVar) {
        int d;
        int i7;
        int i8 = i;
        Unsafe unsafe = r;
        k1 k1Var = (k1) unsafe.getObject(obj, j2);
        if (!((c) k1Var).a) {
            int size = k1Var.size();
            k1Var = k1Var.b(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, k1Var);
        }
        switch (i6) {
            case 18:
            case 35:
                if (i4 == 2) {
                    d0 d0Var = (d0) k1Var;
                    int d2 = g.d(bArr, i8, fVar);
                    int i9 = fVar.a + d2;
                    while (d2 < i9) {
                        d0Var.a(Double.longBitsToDouble(g.b(d2, bArr)));
                        d2 += 8;
                    }
                    if (d2 == i9) {
                        return d2;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 1) {
                    d0 d0Var2 = (d0) k1Var;
                    d0Var2.a(Double.longBitsToDouble(g.b(i8, bArr)));
                    while (true) {
                        int i10 = i8 + 8;
                        if (i10 >= i2) {
                            return i10;
                        }
                        i8 = i10 + 1;
                        byte b = bArr[i10];
                        if (b >= 0) {
                            fVar.a = b;
                        } else {
                            i8 = g.a(b, bArr, i8, fVar);
                        }
                        if (i3 != fVar.a) {
                            return i10;
                        }
                        d0Var2.a(Double.longBitsToDouble(g.b(i8, bArr)));
                    }
                }
                return i8;
            case 19:
            case 36:
                if (i4 == 2) {
                    q0 q0Var = (q0) k1Var;
                    int d3 = g.d(bArr, i8, fVar);
                    int i11 = fVar.a + d3;
                    while (d3 < i11) {
                        q0Var.a(Float.intBitsToFloat(g.a(d3, bArr)));
                        d3 += 4;
                    }
                    if (d3 == i11) {
                        return d3;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 5) {
                    q0 q0Var2 = (q0) k1Var;
                    q0Var2.a(Float.intBitsToFloat(g.a(i8, bArr)));
                    while (true) {
                        int i12 = i8 + 4;
                        if (i12 >= i2) {
                            return i12;
                        }
                        i8 = i12 + 1;
                        byte b2 = bArr[i12];
                        if (b2 >= 0) {
                            fVar.a = b2;
                        } else {
                            i8 = g.a(b2, bArr, i8, fVar);
                        }
                        if (i3 != fVar.a) {
                            return i12;
                        }
                        q0Var2.a(Float.intBitsToFloat(g.a(i8, bArr)));
                    }
                }
                return i8;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i4 == 2) {
                    u1 u1Var = (u1) k1Var;
                    int d4 = g.d(bArr, i8, fVar);
                    int i13 = fVar.a + d4;
                    while (d4 < i13) {
                        d4 = g.e(bArr, d4, fVar);
                        u1Var.a(fVar.b);
                    }
                    if (d4 == i13) {
                        return d4;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 0) {
                    u1 u1Var2 = (u1) k1Var;
                    int e = g.e(bArr, i8, fVar);
                    u1Var2.a(fVar.b);
                    while (e < i2) {
                        int i14 = e + 1;
                        byte b3 = bArr[e];
                        if (b3 >= 0) {
                            fVar.a = b3;
                        } else {
                            i14 = g.a(b3, bArr, i14, fVar);
                        }
                        if (i3 != fVar.a) {
                            return e;
                        }
                        e = g.e(bArr, i14, fVar);
                        u1Var2.a(fVar.b);
                    }
                    return e;
                }
                return i8;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i4 == 2) {
                    return g.a(bArr, i8, k1Var, fVar);
                }
                if (i4 == 0) {
                    return g.c(i3, bArr, i, i2, k1Var, fVar);
                }
                return i8;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i4 == 2) {
                    u1 u1Var3 = (u1) k1Var;
                    int d5 = g.d(bArr, i8, fVar);
                    int i15 = fVar.a + d5;
                    while (d5 < i15) {
                        u1Var3.a(g.b(d5, bArr));
                        d5 += 8;
                    }
                    if (d5 == i15) {
                        return d5;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 1) {
                    u1 u1Var4 = (u1) k1Var;
                    u1Var4.a(g.b(i8, bArr));
                    while (true) {
                        int i16 = i8 + 8;
                        if (i16 >= i2) {
                            return i16;
                        }
                        i8 = i16 + 1;
                        byte b4 = bArr[i16];
                        if (b4 >= 0) {
                            fVar.a = b4;
                        } else {
                            i8 = g.a(b4, bArr, i8, fVar);
                        }
                        if (i3 != fVar.a) {
                            return i16;
                        }
                        u1Var4.a(g.b(i8, bArr));
                    }
                }
                return i8;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i4 == 2) {
                    a1 a1Var = (a1) k1Var;
                    int d6 = g.d(bArr, i8, fVar);
                    int i17 = fVar.a + d6;
                    while (d6 < i17) {
                        a1Var.c(g.a(d6, bArr));
                        d6 += 4;
                    }
                    if (d6 == i17) {
                        return d6;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 5) {
                    a1 a1Var2 = (a1) k1Var;
                    a1Var2.c(g.a(i8, bArr));
                    while (true) {
                        int i18 = i8 + 4;
                        if (i18 >= i2) {
                            return i18;
                        }
                        i8 = i18 + 1;
                        byte b5 = bArr[i18];
                        if (b5 >= 0) {
                            fVar.a = b5;
                        } else {
                            i8 = g.a(b5, bArr, i8, fVar);
                        }
                        if (i3 != fVar.a) {
                            return i18;
                        }
                        a1Var2.c(g.a(i8, bArr));
                    }
                }
                return i8;
            case 25:
            case 42:
                if (i4 == 2) {
                    j jVar = (j) k1Var;
                    d = g.d(bArr, i8, fVar);
                    int i19 = fVar.a + d;
                    while (d < i19) {
                        d = g.e(bArr, d, fVar);
                        jVar.a(fVar.b != 0);
                    }
                    if (d != i19) {
                        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    return d;
                }
                if (i4 == 0) {
                    j jVar2 = (j) k1Var;
                    i8 = g.e(bArr, i8, fVar);
                    jVar2.a(fVar.b != 0);
                    while (i8 < i2) {
                        int i20 = i8 + 1;
                        byte b6 = bArr[i8];
                        if (b6 >= 0) {
                            fVar.a = b6;
                        } else {
                            i20 = g.a(b6, bArr, i20, fVar);
                        }
                        if (i3 == fVar.a) {
                            i8 = g.e(bArr, i20, fVar);
                            jVar2.a(fVar.b != 0);
                        }
                    }
                }
                return i8;
            case 26:
                if (i4 == 2) {
                    if ((j & 536870912) == 0) {
                        return g.a(i3, bArr, i, i2, k1Var, fVar);
                    }
                    return g.b(i3, bArr, i, i2, k1Var, fVar);
                }
                return i8;
            case 27:
                if (i4 == 2) {
                    t2 c = c(i5);
                    i8 = g.a(c, bArr, i8, i2, fVar);
                    k1Var.add(fVar.c);
                    while (i8 < i2) {
                        int i21 = i8 + 1;
                        byte b7 = bArr[i8];
                        if (b7 >= 0) {
                            fVar.a = b7;
                        } else {
                            i21 = g.a(b7, bArr, i21, fVar);
                        }
                        if (i3 == fVar.a) {
                            i8 = g.a(c, bArr, i21, i2, fVar);
                            k1Var.add(fVar.c);
                        }
                    }
                }
                return i8;
            case 28:
                if (i4 == 2) {
                    int d7 = g.d(bArr, i8, fVar);
                    int i22 = fVar.a;
                    if (i22 >= 0) {
                        if (i22 > bArr.length - d7) {
                            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        if (i22 == 0) {
                            k1Var.add(s.b);
                            i7 = d7;
                        } else {
                            i7 = d7 + i22;
                            s.a(d7, i7, bArr.length);
                            k1Var.add(new q(s.c.a(bArr, d7, i22)));
                        }
                        while (i7 < i2) {
                            int i23 = i7 + 1;
                            byte b8 = bArr[i7];
                            if (b8 >= 0) {
                                fVar.a = b8;
                            } else {
                                i23 = g.a(b8, bArr, i23, fVar);
                            }
                            if (i3 != fVar.a) {
                                return i7;
                            }
                            int i24 = i23 + 1;
                            byte b9 = bArr[i23];
                            if (b9 >= 0) {
                                fVar.a = b9;
                            } else {
                                i24 = g.a(b9, bArr, i24, fVar);
                            }
                            int i25 = fVar.a;
                            if (i25 >= 0) {
                                if (i25 > bArr.length - i24) {
                                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                                if (i25 == 0) {
                                    k1Var.add(s.b);
                                    i7 = i24;
                                } else {
                                    i7 = i24 + i25;
                                    s.a(i24, i7, bArr.length);
                                    k1Var.add(new q(s.c.a(bArr, i24, i25)));
                                }
                            } else {
                                throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                            }
                        }
                        return i7;
                    }
                    throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                return i8;
            case 30:
            case 44:
                if (i4 != 2) {
                    if (i4 == 0) {
                        d = g.c(i3, bArr, i, i2, k1Var, fVar);
                    }
                    return i8;
                }
                d = g.a(bArr, i8, k1Var, fVar);
                z0 z0Var = (z0) obj;
                n3 n3Var = z0Var.unknownFields;
                if (n3Var == n3.f) {
                    n3Var = null;
                }
                a(i5);
                Class cls = u2.a;
                if (n3Var != null) {
                    z0Var.unknownFields = n3Var;
                }
                return d;
            case 33:
            case 47:
                if (i4 == 2) {
                    a1 a1Var3 = (a1) k1Var;
                    int d8 = g.d(bArr, i8, fVar);
                    int i26 = fVar.a + d8;
                    while (d8 < i26) {
                        int i27 = d8 + 1;
                        byte b10 = bArr[d8];
                        if (b10 >= 0) {
                            fVar.a = b10;
                            d8 = i27;
                        } else {
                            d8 = g.a(b10, bArr, i27, fVar);
                        }
                        a1Var3.c(w.b(fVar.a));
                    }
                    if (d8 == i26) {
                        return d8;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 0) {
                    a1 a1Var4 = (a1) k1Var;
                    int d9 = g.d(bArr, i8, fVar);
                    a1Var4.c(w.b(fVar.a));
                    while (d9 < i2) {
                        int i28 = d9 + 1;
                        byte b11 = bArr[d9];
                        if (b11 >= 0) {
                            fVar.a = b11;
                        } else {
                            i28 = g.a(b11, bArr, i28, fVar);
                        }
                        if (i3 != fVar.a) {
                            return d9;
                        }
                        d9 = i28 + 1;
                        byte b12 = bArr[i28];
                        if (b12 >= 0) {
                            fVar.a = b12;
                        } else {
                            d9 = g.a(b12, bArr, d9, fVar);
                        }
                        a1Var4.c(w.b(fVar.a));
                    }
                    return d9;
                }
                return i8;
            case 34:
            case 48:
                if (i4 == 2) {
                    u1 u1Var5 = (u1) k1Var;
                    int d10 = g.d(bArr, i8, fVar);
                    int i29 = fVar.a + d10;
                    while (d10 < i29) {
                        d10 = g.e(bArr, d10, fVar);
                        u1Var5.a(w.a(fVar.b));
                    }
                    if (d10 == i29) {
                        return d10;
                    }
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 0) {
                    u1 u1Var6 = (u1) k1Var;
                    int e2 = g.e(bArr, i8, fVar);
                    u1Var6.a(w.a(fVar.b));
                    while (e2 < i2) {
                        int i30 = e2 + 1;
                        byte b13 = bArr[e2];
                        if (b13 >= 0) {
                            fVar.a = b13;
                        } else {
                            i30 = g.a(b13, bArr, i30, fVar);
                        }
                        if (i3 != fVar.a) {
                            return e2;
                        }
                        e2 = g.e(bArr, i30, fVar);
                        u1Var6.a(w.a(fVar.b));
                    }
                    return e2;
                }
                return i8;
            case 49:
                if (i4 == 3) {
                    t2 c2 = c(i5);
                    int i31 = (i3 & (-8)) | 4;
                    i8 = g.a(c2, bArr, i, i2, i31, fVar);
                    k1Var.add(fVar.c);
                    while (i8 < i2) {
                        int d11 = g.d(bArr, i8, fVar);
                        if (i3 == fVar.a) {
                            i8 = g.a(c2, bArr, d11, i2, i31, fVar);
                            k1Var.add(fVar.c);
                        }
                    }
                }
                return i8;
            default:
                return i8;
        }
    }

    public final int a(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, f fVar) {
        Unsafe unsafe = r;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(g.b(i, bArr))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(g.a(i, bArr))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int e = g.e(bArr, i, fVar);
                    unsafe.putObject(obj, j, Long.valueOf(fVar.b));
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int d = g.d(bArr, i, fVar);
                    unsafe.putObject(obj, j, Integer.valueOf(fVar.a));
                    unsafe.putInt(obj, j2, i4);
                    return d;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(g.b(i, bArr)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(g.a(i, bArr)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int e2 = g.e(bArr, i, fVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(fVar.b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return e2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int d2 = g.d(bArr, i, fVar);
                    int i13 = fVar.a;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0) {
                            if (!d4.a.b(bArr, d2, d2 + i13)) {
                                throw new n1("Protocol message had invalid UTF-8.");
                            }
                        }
                        unsafe.putObject(obj, j, new String(bArr, d2, i13, l1.a));
                        d2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return d2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int a = g.a(c(i8), bArr, i, i2, fVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, fVar.c);
                    } else {
                        unsafe.putObject(obj, j, l1.a(object, fVar.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return a;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int a2 = g.a(bArr, i, fVar);
                    unsafe.putObject(obj, j, fVar.c);
                    unsafe.putInt(obj, j2, i4);
                    return a2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int d3 = g.d(bArr, i, fVar);
                    int i14 = fVar.a;
                    a(i8);
                    unsafe.putObject(obj, j, Integer.valueOf(i14));
                    unsafe.putInt(obj, j2, i4);
                    return d3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int d4 = g.d(bArr, i, fVar);
                    unsafe.putObject(obj, j, Integer.valueOf(w.b(fVar.a)));
                    unsafe.putInt(obj, j2, i4);
                    return d4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int e3 = g.e(bArr, i, fVar);
                    unsafe.putObject(obj, j, Long.valueOf(w.a(fVar.b)));
                    unsafe.putInt(obj, j2, i4);
                    return e3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int a3 = g.a(c(i8), bArr, i, i2, (i3 & (-8)) | 4, fVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, fVar.c);
                    } else {
                        unsafe.putObject(obj, j, l1.a(object2, fVar.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return a3;
                }
                break;
        }
        return i;
    }

    public final void a(int i) {
        if (this.b[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x08ad, code lost:
    
        if (r5 == 1048575) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x08af, code lost:
    
        r29.putInt(r13, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x08b5, code lost:
    
        r1 = r12.j;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x08bb, code lost:
    
        if (r1 >= r12.k) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x08bd, code lost:
    
        r2 = (com.fyber.inneractive.sdk.protobuf.n3) r12.b(r12.i[r1], r13, r2);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x08ca, code lost:
    
        if (r2 == null) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x08cc, code lost:
    
        r12.n.getClass();
        ((com.fyber.inneractive.sdk.protobuf.z0) r13).unknownFields = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x08da, code lost:
    
        if (r37 != 0) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x08dc, code lost:
    
        if (r0 != r7) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x08e4, code lost:
    
        throw new com.fyber.inneractive.sdk.protobuf.n1("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x08e9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x08e5, code lost:
    
        if (r0 > r7) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x08e7, code lost:
    
        if (r3 != r37) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x08ef, code lost:
    
        throw new com.fyber.inneractive.sdk.protobuf.n1("Failed to parse the message.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x04a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Object obj, byte[] bArr, int i, int i2, int i3, f fVar) {
        Unsafe unsafe;
        int i4;
        i2 i2Var;
        Object obj2;
        int i5;
        int a;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        int i12;
        int i13;
        byte[] bArr2;
        Object obj3;
        i2 i2Var2;
        int i14;
        f fVar2;
        int i15;
        n3 n3Var;
        Object obj4;
        w0 w0Var;
        int i16;
        int d;
        int i17;
        int i18;
        int i19;
        boolean z2;
        byte[] bArr3;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int e;
        int i28;
        int i29;
        int i30;
        int i31;
        int c;
        int i32;
        int i33;
        int i34;
        int i35;
        boolean z3;
        boolean z4;
        int i36;
        boolean z5;
        i2 i2Var3 = this;
        Object obj5 = obj;
        byte[] bArr4 = bArr;
        int i37 = i2;
        int i38 = i3;
        f fVar3 = fVar;
        Unsafe unsafe2 = r;
        int i39 = i;
        int i40 = -1;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 1048575;
        while (true) {
            Object obj6 = null;
            if (i39 < i37) {
                int i45 = i39 + 1;
                int i46 = bArr4[i39];
                if (i46 < 0) {
                    i45 = g.a(i46, bArr4, i45, fVar3);
                    i46 = fVar3.a;
                }
                int i47 = i46 >>> 3;
                int i48 = i46 & 7;
                if (i47 > i40) {
                    int i49 = i41 / 3;
                    if (i47 >= i2Var3.c && i47 <= i2Var3.d) {
                        a = i2Var3.a(i47, i49);
                        i5 = 0;
                        if (a != -1) {
                            i6 = i46;
                            i7 = i5;
                            i8 = i43;
                            i9 = i44;
                            unsafe = unsafe2;
                            i10 = i47;
                            i11 = i38;
                            z = true;
                            i12 = i7;
                            i13 = i45;
                        } else {
                            int[] iArr = i2Var3.a;
                            int i50 = iArr[a + 1];
                            int i51 = (i50 & 267386880) >>> 20;
                            int i52 = i46;
                            long j = i50 & 1048575;
                            if (i51 <= 17) {
                                int i53 = iArr[a + 2];
                                int i54 = 1 << (i53 >>> 20);
                                int i55 = i53 & 1048575;
                                int i56 = a;
                                if (i55 != i44) {
                                    if (i44 != 1048575) {
                                        unsafe2.putInt(obj5, i44, i43);
                                    }
                                    i18 = i55;
                                    i17 = unsafe2.getInt(obj5, i55);
                                } else {
                                    i17 = i43;
                                    i18 = i44;
                                }
                                switch (i51) {
                                    case 0:
                                        int i57 = i45;
                                        i19 = i52;
                                        z2 = true;
                                        i7 = 0;
                                        bArr3 = bArr;
                                        if (i48 != 1) {
                                            i20 = i56;
                                            i21 = i57;
                                            i11 = i3;
                                            z = z2;
                                            unsafe = unsafe2;
                                            i13 = i21;
                                            i8 = i17;
                                            i9 = i18;
                                            i10 = i47;
                                            int i58 = i19;
                                            i12 = i20;
                                            i6 = i58;
                                            break;
                                        } else {
                                            i22 = i56;
                                            i23 = i2;
                                            x3.c.a(obj, j, Double.longBitsToDouble(g.b(i57, bArr3)));
                                            i39 = i57 + 8;
                                            i43 = i17 | i54;
                                            i41 = i22;
                                            i6 = i19;
                                            unsafe = unsafe2;
                                            i15 = i23;
                                            i2Var2 = i2Var3;
                                            i44 = i18;
                                            f fVar4 = fVar3;
                                            i14 = i47;
                                            fVar2 = fVar4;
                                            Object obj7 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj7;
                                            i42 = i6;
                                            i37 = i15;
                                            i40 = i14;
                                            i2Var3 = i2Var2;
                                            unsafe2 = unsafe;
                                            i38 = i3;
                                            fVar3 = fVar2;
                                            byte[] bArr5 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr5;
                                        }
                                    case 1:
                                        i24 = i2;
                                        i25 = i45;
                                        i19 = i52;
                                        i26 = i56;
                                        i7 = 0;
                                        bArr3 = bArr;
                                        if (i48 == 5) {
                                            x3.c.a(obj5, j, Float.intBitsToFloat(g.a(i25, bArr3)));
                                            i27 = i25 + 4;
                                            i23 = i24;
                                            i39 = i27;
                                            i22 = i26;
                                            i43 = i17 | i54;
                                            i41 = i22;
                                            i6 = i19;
                                            unsafe = unsafe2;
                                            i15 = i23;
                                            i2Var2 = i2Var3;
                                            i44 = i18;
                                            f fVar42 = fVar3;
                                            i14 = i47;
                                            fVar2 = fVar42;
                                            Object obj72 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj72;
                                            i42 = i6;
                                            i37 = i15;
                                            i40 = i14;
                                            i2Var3 = i2Var2;
                                            unsafe2 = unsafe;
                                            i38 = i3;
                                            fVar3 = fVar2;
                                            byte[] bArr52 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr52;
                                        }
                                        i20 = i26;
                                        i21 = i25;
                                        z2 = true;
                                        i11 = i3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i13 = i21;
                                        i8 = i17;
                                        i9 = i18;
                                        i10 = i47;
                                        int i582 = i19;
                                        i12 = i20;
                                        i6 = i582;
                                        break;
                                    case 2:
                                    case 3:
                                        i24 = i2;
                                        i25 = i45;
                                        i19 = i52;
                                        i26 = i56;
                                        i7 = 0;
                                        bArr3 = bArr;
                                        if (i48 == 0) {
                                            e = g.e(bArr3, i25, fVar3);
                                            i23 = i24;
                                            i28 = i26;
                                            unsafe2.putLong(obj, j, fVar3.b);
                                            i39 = e;
                                            i22 = i28;
                                            i43 = i17 | i54;
                                            i41 = i22;
                                            i6 = i19;
                                            unsafe = unsafe2;
                                            i15 = i23;
                                            i2Var2 = i2Var3;
                                            i44 = i18;
                                            f fVar422 = fVar3;
                                            i14 = i47;
                                            fVar2 = fVar422;
                                            Object obj722 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj722;
                                            i42 = i6;
                                            i37 = i15;
                                            i40 = i14;
                                            i2Var3 = i2Var2;
                                            unsafe2 = unsafe;
                                            i38 = i3;
                                            fVar3 = fVar2;
                                            byte[] bArr522 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr522;
                                        }
                                        i20 = i26;
                                        i21 = i25;
                                        z2 = true;
                                        i11 = i3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i13 = i21;
                                        i8 = i17;
                                        i9 = i18;
                                        i10 = i47;
                                        int i5822 = i19;
                                        i12 = i20;
                                        i6 = i5822;
                                        break;
                                    case 4:
                                    case 11:
                                        i24 = i2;
                                        i25 = i45;
                                        i19 = i52;
                                        i26 = i56;
                                        i7 = 0;
                                        bArr3 = bArr;
                                        if (i48 == 0) {
                                            int i59 = i25 + 1;
                                            byte b = bArr3[i25];
                                            if (b >= 0) {
                                                fVar3.a = b;
                                                i27 = i59;
                                            } else {
                                                i27 = g.a(b, bArr3, i59, fVar3);
                                            }
                                            unsafe2.putInt(obj5, j, fVar3.a);
                                            i23 = i24;
                                            i39 = i27;
                                            i22 = i26;
                                            i43 = i17 | i54;
                                            i41 = i22;
                                            i6 = i19;
                                            unsafe = unsafe2;
                                            i15 = i23;
                                            i2Var2 = i2Var3;
                                            i44 = i18;
                                            f fVar4222 = fVar3;
                                            i14 = i47;
                                            fVar2 = fVar4222;
                                            Object obj7222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj7222;
                                            i42 = i6;
                                            i37 = i15;
                                            i40 = i14;
                                            i2Var3 = i2Var2;
                                            unsafe2 = unsafe;
                                            i38 = i3;
                                            fVar3 = fVar2;
                                            byte[] bArr5222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr5222;
                                        }
                                        i20 = i26;
                                        i21 = i25;
                                        z2 = true;
                                        i11 = i3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i13 = i21;
                                        i8 = i17;
                                        i9 = i18;
                                        i10 = i47;
                                        int i58222 = i19;
                                        i12 = i20;
                                        i6 = i58222;
                                        break;
                                    case 5:
                                    case 14:
                                        i19 = i52;
                                        i7 = 0;
                                        bArr3 = bArr;
                                        if (i48 != 1) {
                                            i21 = i45;
                                            i20 = i56;
                                            z2 = true;
                                            i11 = i3;
                                            z = z2;
                                            unsafe = unsafe2;
                                            i13 = i21;
                                            i8 = i17;
                                            i9 = i18;
                                            i10 = i47;
                                            int i582222 = i19;
                                            i12 = i20;
                                            i6 = i582222;
                                            break;
                                        } else {
                                            i28 = i56;
                                            i23 = i2;
                                            unsafe2.putLong(obj, j, g.b(i45, bArr3));
                                            e = i45 + 8;
                                            i39 = e;
                                            i22 = i28;
                                            i43 = i17 | i54;
                                            i41 = i22;
                                            i6 = i19;
                                            unsafe = unsafe2;
                                            i15 = i23;
                                            i2Var2 = i2Var3;
                                            i44 = i18;
                                            f fVar42222 = fVar3;
                                            i14 = i47;
                                            fVar2 = fVar42222;
                                            Object obj72222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj72222;
                                            i42 = i6;
                                            i37 = i15;
                                            i40 = i14;
                                            i2Var3 = i2Var2;
                                            unsafe2 = unsafe;
                                            i38 = i3;
                                            fVar3 = fVar2;
                                            byte[] bArr52222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr52222;
                                        }
                                    case 6:
                                    case 13:
                                        i29 = i2;
                                        i19 = i52;
                                        i30 = i56;
                                        i7 = 0;
                                        bArr3 = bArr;
                                        if (i48 == 5) {
                                            unsafe2.putInt(obj5, j, g.a(i45, bArr3));
                                            i31 = i45 + 4;
                                            i23 = i29;
                                            i39 = i31;
                                            i22 = i30;
                                            i43 = i17 | i54;
                                            i41 = i22;
                                            i6 = i19;
                                            unsafe = unsafe2;
                                            i15 = i23;
                                            i2Var2 = i2Var3;
                                            i44 = i18;
                                            f fVar422222 = fVar3;
                                            i14 = i47;
                                            fVar2 = fVar422222;
                                            Object obj722222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj722222;
                                            i42 = i6;
                                            i37 = i15;
                                            i40 = i14;
                                            i2Var3 = i2Var2;
                                            unsafe2 = unsafe;
                                            i38 = i3;
                                            fVar3 = fVar2;
                                            byte[] bArr522222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr522222;
                                        }
                                        i21 = i45;
                                        i20 = i30;
                                        z2 = true;
                                        i11 = i3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i13 = i21;
                                        i8 = i17;
                                        i9 = i18;
                                        i10 = i47;
                                        int i5822222 = i19;
                                        i12 = i20;
                                        i6 = i5822222;
                                        break;
                                    case 7:
                                        i29 = i2;
                                        i19 = i52;
                                        i30 = i56;
                                        i7 = 0;
                                        bArr3 = bArr;
                                        if (i48 == 0) {
                                            i31 = g.e(bArr3, i45, fVar3);
                                            x3.c.a(obj5, j, fVar3.b != 0);
                                            i23 = i29;
                                            i39 = i31;
                                            i22 = i30;
                                            i43 = i17 | i54;
                                            i41 = i22;
                                            i6 = i19;
                                            unsafe = unsafe2;
                                            i15 = i23;
                                            i2Var2 = i2Var3;
                                            i44 = i18;
                                            f fVar4222222 = fVar3;
                                            i14 = i47;
                                            fVar2 = fVar4222222;
                                            Object obj7222222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj7222222;
                                            i42 = i6;
                                            i37 = i15;
                                            i40 = i14;
                                            i2Var3 = i2Var2;
                                            unsafe2 = unsafe;
                                            i38 = i3;
                                            fVar3 = fVar2;
                                            byte[] bArr5222222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr5222222;
                                        }
                                        i21 = i45;
                                        i20 = i30;
                                        z2 = true;
                                        i11 = i3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i13 = i21;
                                        i8 = i17;
                                        i9 = i18;
                                        i10 = i47;
                                        int i58222222 = i19;
                                        i12 = i20;
                                        i6 = i58222222;
                                        break;
                                    case 8:
                                        i29 = i2;
                                        i19 = i52;
                                        i30 = i56;
                                        i7 = 0;
                                        bArr3 = bArr;
                                        if (i48 == 2) {
                                            if ((i50 & 536870912) == 0) {
                                                c = g.b(bArr3, i45, fVar3);
                                            } else {
                                                c = g.c(bArr3, i45, fVar3);
                                            }
                                            i31 = c;
                                            unsafe2.putObject(obj5, j, fVar3.c);
                                            i23 = i29;
                                            i39 = i31;
                                            i22 = i30;
                                            i43 = i17 | i54;
                                            i41 = i22;
                                            i6 = i19;
                                            unsafe = unsafe2;
                                            i15 = i23;
                                            i2Var2 = i2Var3;
                                            i44 = i18;
                                            f fVar42222222 = fVar3;
                                            i14 = i47;
                                            fVar2 = fVar42222222;
                                            Object obj72222222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj72222222;
                                            i42 = i6;
                                            i37 = i15;
                                            i40 = i14;
                                            i2Var3 = i2Var2;
                                            unsafe2 = unsafe;
                                            i38 = i3;
                                            fVar3 = fVar2;
                                            byte[] bArr52222222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr52222222;
                                        }
                                        i21 = i45;
                                        i20 = i30;
                                        z2 = true;
                                        i11 = i3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i13 = i21;
                                        i8 = i17;
                                        i9 = i18;
                                        i10 = i47;
                                        int i582222222 = i19;
                                        i12 = i20;
                                        i6 = i582222222;
                                        break;
                                    case 9:
                                        i19 = i52;
                                        i30 = i56;
                                        i7 = 0;
                                        bArr3 = bArr;
                                        if (i48 == 2) {
                                            i32 = i2;
                                            i39 = g.a(i2Var3.c(i30), bArr3, i45, i32, fVar3);
                                            if ((i17 & i54) == 0) {
                                                unsafe2.putObject(obj5, j, fVar3.c);
                                            } else {
                                                unsafe2.putObject(obj5, j, l1.a(unsafe2.getObject(obj5, j), fVar3.c));
                                            }
                                            i22 = i30;
                                            i23 = i32;
                                            i43 = i17 | i54;
                                            i41 = i22;
                                            i6 = i19;
                                            unsafe = unsafe2;
                                            i15 = i23;
                                            i2Var2 = i2Var3;
                                            i44 = i18;
                                            f fVar422222222 = fVar3;
                                            i14 = i47;
                                            fVar2 = fVar422222222;
                                            Object obj722222222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj722222222;
                                            i42 = i6;
                                            i37 = i15;
                                            i40 = i14;
                                            i2Var3 = i2Var2;
                                            unsafe2 = unsafe;
                                            i38 = i3;
                                            fVar3 = fVar2;
                                            byte[] bArr522222222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr522222222;
                                        }
                                        i21 = i45;
                                        i20 = i30;
                                        z2 = true;
                                        i11 = i3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i13 = i21;
                                        i8 = i17;
                                        i9 = i18;
                                        i10 = i47;
                                        int i5822222222 = i19;
                                        i12 = i20;
                                        i6 = i5822222222;
                                        break;
                                    case 10:
                                        i19 = i52;
                                        i30 = i56;
                                        i7 = 0;
                                        bArr3 = bArr;
                                        if (i48 == 2) {
                                            i31 = g.a(bArr3, i45, fVar3);
                                            unsafe2.putObject(obj5, j, fVar3.c);
                                            i23 = i2;
                                            i39 = i31;
                                            i22 = i30;
                                            i43 = i17 | i54;
                                            i41 = i22;
                                            i6 = i19;
                                            unsafe = unsafe2;
                                            i15 = i23;
                                            i2Var2 = i2Var3;
                                            i44 = i18;
                                            f fVar4222222222 = fVar3;
                                            i14 = i47;
                                            fVar2 = fVar4222222222;
                                            Object obj7222222222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj7222222222;
                                            i42 = i6;
                                            i37 = i15;
                                            i40 = i14;
                                            i2Var3 = i2Var2;
                                            unsafe2 = unsafe;
                                            i38 = i3;
                                            fVar3 = fVar2;
                                            byte[] bArr5222222222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr5222222222;
                                        }
                                        i21 = i45;
                                        i20 = i30;
                                        z2 = true;
                                        i11 = i3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i13 = i21;
                                        i8 = i17;
                                        i9 = i18;
                                        i10 = i47;
                                        int i58222222222 = i19;
                                        i12 = i20;
                                        i6 = i58222222222;
                                        break;
                                    case 12:
                                        i19 = i52;
                                        i30 = i56;
                                        i7 = 0;
                                        bArr3 = bArr;
                                        if (i48 == 0) {
                                            int i60 = i45 + 1;
                                            byte b2 = bArr3[i45];
                                            if (b2 >= 0) {
                                                fVar3.a = b2;
                                            } else {
                                                i60 = g.a(b2, bArr3, i60, fVar3);
                                            }
                                            i31 = i60;
                                            int i61 = fVar3.a;
                                            i2Var3.a(i30);
                                            unsafe2.putInt(obj5, j, i61);
                                            i23 = i2;
                                            i39 = i31;
                                            i22 = i30;
                                            i43 = i17 | i54;
                                            i41 = i22;
                                            i6 = i19;
                                            unsafe = unsafe2;
                                            i15 = i23;
                                            i2Var2 = i2Var3;
                                            i44 = i18;
                                            f fVar42222222222 = fVar3;
                                            i14 = i47;
                                            fVar2 = fVar42222222222;
                                            Object obj72222222222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj72222222222;
                                            i42 = i6;
                                            i37 = i15;
                                            i40 = i14;
                                            i2Var3 = i2Var2;
                                            unsafe2 = unsafe;
                                            i38 = i3;
                                            fVar3 = fVar2;
                                            byte[] bArr52222222222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr52222222222;
                                        }
                                        i21 = i45;
                                        i20 = i30;
                                        z2 = true;
                                        i11 = i3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i13 = i21;
                                        i8 = i17;
                                        i9 = i18;
                                        i10 = i47;
                                        int i582222222222 = i19;
                                        i12 = i20;
                                        i6 = i582222222222;
                                        break;
                                    case 15:
                                        i19 = i52;
                                        i30 = i56;
                                        i7 = 0;
                                        bArr3 = bArr;
                                        if (i48 == 0) {
                                            int i62 = i45 + 1;
                                            byte b3 = bArr3[i45];
                                            if (b3 >= 0) {
                                                fVar3.a = b3;
                                            } else {
                                                i62 = g.a(b3, bArr3, i62, fVar3);
                                            }
                                            i31 = i62;
                                            unsafe2.putInt(obj5, j, w.b(fVar3.a));
                                            i23 = i2;
                                            i39 = i31;
                                            i22 = i30;
                                            i43 = i17 | i54;
                                            i41 = i22;
                                            i6 = i19;
                                            unsafe = unsafe2;
                                            i15 = i23;
                                            i2Var2 = i2Var3;
                                            i44 = i18;
                                            f fVar422222222222 = fVar3;
                                            i14 = i47;
                                            fVar2 = fVar422222222222;
                                            Object obj722222222222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj722222222222;
                                            i42 = i6;
                                            i37 = i15;
                                            i40 = i14;
                                            i2Var3 = i2Var2;
                                            unsafe2 = unsafe;
                                            i38 = i3;
                                            fVar3 = fVar2;
                                            byte[] bArr522222222222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr522222222222;
                                        }
                                        i21 = i45;
                                        i20 = i30;
                                        z2 = true;
                                        i11 = i3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i13 = i21;
                                        i8 = i17;
                                        i9 = i18;
                                        i10 = i47;
                                        int i5822222222222 = i19;
                                        i12 = i20;
                                        i6 = i5822222222222;
                                        break;
                                    case 16:
                                        i19 = i52;
                                        i30 = i56;
                                        i7 = 0;
                                        bArr3 = bArr;
                                        if (i48 == 0) {
                                            int e2 = g.e(bArr3, i45, fVar3);
                                            unsafe2.putLong(obj, j, w.a(fVar3.b));
                                            i39 = e2;
                                            i22 = i30;
                                            i23 = i2;
                                            i43 = i17 | i54;
                                            i41 = i22;
                                            i6 = i19;
                                            unsafe = unsafe2;
                                            i15 = i23;
                                            i2Var2 = i2Var3;
                                            i44 = i18;
                                            f fVar4222222222222 = fVar3;
                                            i14 = i47;
                                            fVar2 = fVar4222222222222;
                                            Object obj7222222222222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj7222222222222;
                                            i42 = i6;
                                            i37 = i15;
                                            i40 = i14;
                                            i2Var3 = i2Var2;
                                            unsafe2 = unsafe;
                                            i38 = i3;
                                            fVar3 = fVar2;
                                            byte[] bArr5222222222222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr5222222222222;
                                        }
                                        i21 = i45;
                                        i20 = i30;
                                        z2 = true;
                                        i11 = i3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i13 = i21;
                                        i8 = i17;
                                        i9 = i18;
                                        i10 = i47;
                                        int i58222222222222 = i19;
                                        i12 = i20;
                                        i6 = i58222222222222;
                                        break;
                                    case 17:
                                        if (i48 != 3) {
                                            i19 = i52;
                                            i7 = 0;
                                            i21 = i45;
                                            i20 = i56;
                                            z2 = true;
                                            i11 = i3;
                                            z = z2;
                                            unsafe = unsafe2;
                                            i13 = i21;
                                            i8 = i17;
                                            i9 = i18;
                                            i10 = i47;
                                            int i582222222222222 = i19;
                                            i12 = i20;
                                            i6 = i582222222222222;
                                            break;
                                        } else {
                                            i19 = i52;
                                            i39 = g.a(i2Var3.c(i56), bArr, i45, i2, (i47 << 3) | 4, fVar);
                                            if ((i17 & i54) == 0) {
                                                unsafe2.putObject(obj5, j, fVar3.c);
                                            } else {
                                                unsafe2.putObject(obj5, j, l1.a(unsafe2.getObject(obj5, j), fVar3.c));
                                            }
                                            i32 = i2;
                                            i30 = i56;
                                            bArr3 = bArr;
                                            i22 = i30;
                                            i23 = i32;
                                            i43 = i17 | i54;
                                            i41 = i22;
                                            i6 = i19;
                                            unsafe = unsafe2;
                                            i15 = i23;
                                            i2Var2 = i2Var3;
                                            i44 = i18;
                                            f fVar42222222222222 = fVar3;
                                            i14 = i47;
                                            fVar2 = fVar42222222222222;
                                            Object obj72222222222222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj72222222222222;
                                            i42 = i6;
                                            i37 = i15;
                                            i40 = i14;
                                            i2Var3 = i2Var2;
                                            unsafe2 = unsafe;
                                            i38 = i3;
                                            fVar3 = fVar2;
                                            byte[] bArr52222222222222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr52222222222222;
                                        }
                                    default:
                                        i21 = i45;
                                        i19 = i52;
                                        i20 = i56;
                                        z2 = true;
                                        i7 = 0;
                                        i11 = i3;
                                        z = z2;
                                        unsafe = unsafe2;
                                        i13 = i21;
                                        i8 = i17;
                                        i9 = i18;
                                        i10 = i47;
                                        int i5822222222222222 = i19;
                                        i12 = i20;
                                        i6 = i5822222222222222;
                                        break;
                                }
                            } else {
                                int i63 = i45;
                                int i64 = a;
                                i7 = 0;
                                if (i51 == 27) {
                                    if (i48 == 2) {
                                        k1 k1Var = (k1) unsafe2.getObject(obj5, j);
                                        if (!((c) k1Var).a) {
                                            int size = k1Var.size();
                                            k1Var = k1Var.b(size == 0 ? 10 : size * 2);
                                            unsafe2.putObject(obj5, j, k1Var);
                                        }
                                        t2 c2 = i2Var3.c(i64);
                                        i39 = g.a(c2, bArr4, i63, i2, fVar3);
                                        k1Var.add(fVar3.c);
                                        while (i39 < i2) {
                                            int i65 = i39 + 1;
                                            byte b4 = bArr4[i39];
                                            if (b4 >= 0) {
                                                fVar3.a = b4;
                                            } else {
                                                i65 = g.a(b4, bArr4, i65, fVar3);
                                            }
                                            if (i52 != fVar3.a) {
                                                i6 = i52;
                                                i15 = i2;
                                                unsafe = unsafe2;
                                                i41 = i64;
                                                fVar2 = fVar3;
                                                i2Var2 = i2Var3;
                                                i14 = i47;
                                                Object obj8 = obj5;
                                                bArr2 = bArr4;
                                                obj3 = obj8;
                                                i42 = i6;
                                                i37 = i15;
                                                i40 = i14;
                                                i2Var3 = i2Var2;
                                                unsafe2 = unsafe;
                                                i38 = i3;
                                                fVar3 = fVar2;
                                                byte[] bArr522222222222222 = bArr2;
                                                obj5 = obj3;
                                                bArr4 = bArr522222222222222;
                                            } else {
                                                i39 = g.a(c2, bArr4, i65, i2, fVar3);
                                                k1Var.add(fVar3.c);
                                            }
                                        }
                                        i6 = i52;
                                        i15 = i2;
                                        unsafe = unsafe2;
                                        i41 = i64;
                                        fVar2 = fVar3;
                                        i2Var2 = i2Var3;
                                        i14 = i47;
                                        Object obj82 = obj5;
                                        bArr2 = bArr4;
                                        obj3 = obj82;
                                        i42 = i6;
                                        i37 = i15;
                                        i40 = i14;
                                        i2Var3 = i2Var2;
                                        unsafe2 = unsafe;
                                        i38 = i3;
                                        fVar3 = fVar2;
                                        byte[] bArr5222222222222222 = bArr2;
                                        obj5 = obj3;
                                        bArr4 = bArr5222222222222222;
                                    } else {
                                        i10 = i47;
                                        i11 = i3;
                                        i33 = i63;
                                        i34 = i52;
                                        i8 = i43;
                                        i9 = i44;
                                        unsafe = unsafe2;
                                        i35 = i64;
                                        z3 = true;
                                    }
                                } else if (i51 <= 49) {
                                    i34 = i52;
                                    z5 = true;
                                    i8 = i43;
                                    i9 = i44;
                                    i10 = i47;
                                    unsafe = unsafe2;
                                    i11 = i3;
                                    i39 = a(obj, bArr, i63, i2, i34, i48, i64, i50, i51, j, fVar);
                                    i36 = i64;
                                    if (i39 != i63) {
                                        obj5 = obj;
                                        bArr4 = bArr;
                                        i37 = i2;
                                        fVar3 = fVar;
                                        i38 = i11;
                                        i41 = i36;
                                        i42 = i34;
                                        i43 = i8;
                                        i44 = i9;
                                        i40 = i10;
                                        unsafe2 = unsafe;
                                        i2Var3 = this;
                                    } else {
                                        i13 = i39;
                                        i12 = i36;
                                        z4 = z5;
                                        i6 = i34;
                                        z = z4;
                                    }
                                } else {
                                    i10 = i47;
                                    i11 = i3;
                                    i33 = i63;
                                    i34 = i52;
                                    i8 = i43;
                                    i9 = i44;
                                    unsafe = unsafe2;
                                    i35 = i64;
                                    z3 = true;
                                    z5 = true;
                                    if (i51 != 50) {
                                        i36 = i35;
                                        i39 = a(obj, bArr, i33, i2, i34, i10, i48, i50, i51, j, i36, fVar);
                                        if (i39 != i33) {
                                            obj5 = obj;
                                            bArr4 = bArr;
                                            i37 = i2;
                                            fVar3 = fVar;
                                            i38 = i11;
                                            i41 = i36;
                                            i42 = i34;
                                            i43 = i8;
                                            i44 = i9;
                                            i40 = i10;
                                            unsafe2 = unsafe;
                                            i2Var3 = this;
                                        } else {
                                            i13 = i39;
                                            i12 = i36;
                                            z4 = z5;
                                            i6 = i34;
                                            z = z4;
                                        }
                                    } else if (i48 == 2) {
                                        Unsafe unsafe3 = r;
                                        Object b5 = b(i35);
                                        Object object = unsafe3.getObject(obj, j);
                                        this.p.getClass();
                                        if (!((y1) object).a) {
                                            this.p.getClass();
                                            y1 y1Var = y1.b;
                                            y1 y1Var2 = y1Var.isEmpty() ? new y1() : new y1(y1Var);
                                            this.p.getClass();
                                            z1.a(y1Var2, object);
                                            unsafe3.putObject(obj, j, y1Var2);
                                        }
                                        this.p.getClass();
                                        b5.getClass();
                                        throw new ClassCastException();
                                    }
                                }
                                i13 = i33;
                                i12 = i35;
                                z4 = z3;
                                i6 = i34;
                                z = z4;
                            }
                        }
                        if (i6 == i11 || i11 == 0) {
                            if (this.f) {
                                obj3 = obj;
                                bArr2 = bArr;
                                fVar2 = fVar;
                            } else {
                                fVar2 = fVar;
                                if (fVar2.d != h0.a()) {
                                    d2 d2Var = this.e;
                                    o3 o3Var = this.n;
                                    i14 = i10;
                                    x0 a2 = fVar2.d.a(i14, d2Var);
                                    if (a2 == null) {
                                        obj3 = obj;
                                        i2Var2 = this;
                                        z0 z0Var = (z0) obj3;
                                        n3 n3Var2 = z0Var.unknownFields;
                                        if (n3Var2 == n3.f) {
                                            n3Var2 = new n3();
                                            z0Var.unknownFields = n3Var2;
                                        }
                                        i39 = g.a(i6, bArr, i13, i2, n3Var2, fVar);
                                        bArr2 = bArr;
                                    } else {
                                        obj3 = obj;
                                        i2Var2 = this;
                                        GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage = (GeneratedMessageLite$ExtendableMessage) obj3;
                                        generatedMessageLite$ExtendableMessage.ensureExtensionsAreMutable();
                                        n0 n0Var = generatedMessageLite$ExtendableMessage.extensions;
                                        w0 w0Var2 = a2.d;
                                        if (w0Var2.d && w0Var2.e) {
                                            switch (e.a[w0Var2.c.ordinal()]) {
                                                case 1:
                                                    bArr2 = bArr;
                                                    i16 = i12;
                                                    d0 d0Var = new d0();
                                                    d = g.d(bArr2, i13, fVar2);
                                                    int i66 = fVar2.a + d;
                                                    while (d < i66) {
                                                        d0Var.a(Double.longBitsToDouble(g.b(d, bArr2)));
                                                        d += 8;
                                                    }
                                                    if (d == i66) {
                                                        n0Var.c(a2.d, d0Var);
                                                        i41 = i16;
                                                        i15 = i2;
                                                        i39 = d;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr52222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr52222222222222222;
                                                    } else {
                                                        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                case 2:
                                                    bArr2 = bArr;
                                                    i16 = i12;
                                                    q0 q0Var = new q0();
                                                    d = g.d(bArr2, i13, fVar2);
                                                    int i67 = fVar2.a + d;
                                                    while (d < i67) {
                                                        q0Var.a(Float.intBitsToFloat(g.a(d, bArr2)));
                                                        d += 4;
                                                    }
                                                    if (d == i67) {
                                                        n0Var.c(a2.d, q0Var);
                                                        i41 = i16;
                                                        i15 = i2;
                                                        i39 = d;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr522222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr522222222222222222;
                                                    } else {
                                                        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                case 3:
                                                case 4:
                                                    bArr2 = bArr;
                                                    i16 = i12;
                                                    u1 u1Var = new u1();
                                                    d = g.d(bArr2, i13, fVar2);
                                                    int i68 = fVar2.a + d;
                                                    while (d < i68) {
                                                        d = g.e(bArr2, d, fVar2);
                                                        u1Var.a(fVar2.b);
                                                    }
                                                    if (d == i68) {
                                                        n0Var.c(a2.d, u1Var);
                                                        i41 = i16;
                                                        i15 = i2;
                                                        i39 = d;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr5222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr5222222222222222222;
                                                    } else {
                                                        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                case 5:
                                                case 6:
                                                    bArr2 = bArr;
                                                    i16 = i12;
                                                    a1 a1Var = new a1();
                                                    d = g.a(bArr2, i13, a1Var, fVar2);
                                                    n0Var.c(a2.d, a1Var);
                                                    i41 = i16;
                                                    i15 = i2;
                                                    i39 = d;
                                                    i43 = i8;
                                                    i44 = i9;
                                                    i42 = i6;
                                                    i37 = i15;
                                                    i40 = i14;
                                                    i2Var3 = i2Var2;
                                                    unsafe2 = unsafe;
                                                    i38 = i3;
                                                    fVar3 = fVar2;
                                                    byte[] bArr52222222222222222222 = bArr2;
                                                    obj5 = obj3;
                                                    bArr4 = bArr52222222222222222222;
                                                case 7:
                                                case 8:
                                                    bArr2 = bArr;
                                                    i16 = i12;
                                                    u1 u1Var2 = new u1();
                                                    d = g.d(bArr2, i13, fVar2);
                                                    int i69 = fVar2.a + d;
                                                    while (d < i69) {
                                                        u1Var2.a(g.b(d, bArr2));
                                                        d += 8;
                                                    }
                                                    if (d == i69) {
                                                        n0Var.c(a2.d, u1Var2);
                                                        i41 = i16;
                                                        i15 = i2;
                                                        i39 = d;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr522222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr522222222222222222222;
                                                    } else {
                                                        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                case 9:
                                                case 10:
                                                    bArr2 = bArr;
                                                    i16 = i12;
                                                    a1 a1Var2 = new a1();
                                                    d = g.d(bArr2, i13, fVar2);
                                                    int i70 = fVar2.a + d;
                                                    while (d < i70) {
                                                        a1Var2.c(g.a(d, bArr2));
                                                        d += 4;
                                                    }
                                                    if (d == i70) {
                                                        n0Var.c(a2.d, a1Var2);
                                                        i41 = i16;
                                                        i15 = i2;
                                                        i39 = d;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr5222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr5222222222222222222222;
                                                    } else {
                                                        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                case 11:
                                                    bArr2 = bArr;
                                                    i16 = i12;
                                                    j jVar = new j();
                                                    d = g.d(bArr2, i13, fVar2);
                                                    int i71 = fVar2.a + d;
                                                    while (d < i71) {
                                                        d = g.e(bArr2, d, fVar2);
                                                        jVar.a(fVar2.b != 0 ? z ? 1 : 0 : i7);
                                                    }
                                                    if (d == i71) {
                                                        n0Var.c(a2.d, jVar);
                                                        i41 = i16;
                                                        i15 = i2;
                                                        i39 = d;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr52222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr52222222222222222222222;
                                                    } else {
                                                        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                case 12:
                                                    bArr2 = bArr;
                                                    i16 = i12;
                                                    a1 a1Var3 = new a1();
                                                    d = g.d(bArr2, i13, fVar2);
                                                    int i72 = fVar2.a + d;
                                                    while (d < i72) {
                                                        int i73 = d + 1;
                                                        byte b6 = bArr2[d];
                                                        if (b6 >= 0) {
                                                            fVar2.a = b6;
                                                            d = i73;
                                                        } else {
                                                            d = g.a(b6, bArr2, i73, fVar2);
                                                        }
                                                        a1Var3.c(w.b(fVar2.a));
                                                    }
                                                    if (d == i72) {
                                                        n0Var.c(a2.d, a1Var3);
                                                        i41 = i16;
                                                        i15 = i2;
                                                        i39 = d;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr522222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr522222222222222222222222;
                                                    } else {
                                                        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                case 13:
                                                    bArr2 = bArr;
                                                    u1 u1Var3 = new u1();
                                                    d = g.d(bArr2, i13, fVar2);
                                                    int i74 = fVar2.a + d;
                                                    while (d < i74) {
                                                        d = g.e(bArr2, d, fVar2);
                                                        u1Var3.a(w.a(fVar2.b));
                                                        i12 = i12;
                                                    }
                                                    i16 = i12;
                                                    if (d == i74) {
                                                        n0Var.c(a2.d, u1Var3);
                                                        i41 = i16;
                                                        i15 = i2;
                                                        i39 = d;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr5222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr5222222222222222222222222;
                                                    } else {
                                                        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                case 14:
                                                    a1 a1Var4 = new a1();
                                                    bArr2 = bArr;
                                                    int a3 = g.a(bArr2, i13, a1Var4, fVar2);
                                                    n3 n3Var3 = generatedMessageLite$ExtendableMessage.unknownFields;
                                                    if (n3Var3 == n3.f) {
                                                        n3Var3 = null;
                                                    }
                                                    n3 n3Var4 = (n3) u2.a(i14, a1Var4, a2.d.a, n3Var3, o3Var);
                                                    if (n3Var4 != null) {
                                                        generatedMessageLite$ExtendableMessage.unknownFields = n3Var4;
                                                    }
                                                    n0Var.c(a2.d, a1Var4);
                                                    i39 = a3;
                                                    break;
                                                default:
                                                    throw new IllegalStateException("Type cannot be packed: " + a2.d.c);
                                            }
                                        } else {
                                            bArr2 = bArr;
                                            int i75 = i12;
                                            j4 j4Var = w0Var2.c;
                                            if (j4Var == j4.ENUM) {
                                                i13 = g.d(bArr2, i13, fVar2);
                                                if (a2.d.a.a(fVar2.a) == null) {
                                                    n3 n3Var5 = generatedMessageLite$ExtendableMessage.unknownFields;
                                                    if (n3Var5 == n3.f) {
                                                        n3Var5 = new n3();
                                                        generatedMessageLite$ExtendableMessage.unknownFields = n3Var5;
                                                    }
                                                    u2.a(i14, fVar2.a, n3Var5, o3Var);
                                                    i15 = i2;
                                                    i39 = i13;
                                                    i43 = i8;
                                                    i44 = i9;
                                                    i41 = i75;
                                                    i42 = i6;
                                                    i37 = i15;
                                                    i40 = i14;
                                                    i2Var3 = i2Var2;
                                                    unsafe2 = unsafe;
                                                    i38 = i3;
                                                    fVar3 = fVar2;
                                                    byte[] bArr52222222222222222222222222 = bArr2;
                                                    obj5 = obj3;
                                                    bArr4 = bArr52222222222222222222222222;
                                                } else {
                                                    obj6 = Integer.valueOf(fVar2.a);
                                                }
                                            } else {
                                                switch (e.a[j4Var.ordinal()]) {
                                                    case 1:
                                                        i15 = i2;
                                                        obj6 = Double.valueOf(Double.longBitsToDouble(g.b(i13, bArr2)));
                                                        i13 += 8;
                                                        obj4 = obj6;
                                                        w0Var = a2.d;
                                                        if (!w0Var.d) {
                                                            n0Var.a(w0Var, obj4);
                                                        } else {
                                                            int i76 = e.a[w0Var.c.ordinal()];
                                                            if (i76 == 17 || i76 == 18) {
                                                                Object obj9 = n0Var.a.get(a2.d);
                                                                if (obj9 != null) {
                                                                    obj4 = l1.a(obj9, obj4);
                                                                }
                                                            }
                                                            n0Var.c(a2.d, obj4);
                                                        }
                                                        i39 = i13;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i41 = i75;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr522222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr522222222222222222222222222;
                                                        break;
                                                    case 2:
                                                        i15 = i2;
                                                        obj6 = Float.valueOf(Float.intBitsToFloat(g.a(i13, bArr2)));
                                                        i13 += 4;
                                                        obj4 = obj6;
                                                        w0Var = a2.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i39 = i13;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i41 = i75;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr5222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr5222222222222222222222222222;
                                                        break;
                                                    case 3:
                                                    case 4:
                                                        i15 = i2;
                                                        i13 = g.e(bArr2, i13, fVar2);
                                                        obj6 = Long.valueOf(fVar2.b);
                                                        obj4 = obj6;
                                                        w0Var = a2.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i39 = i13;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i41 = i75;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr52222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr52222222222222222222222222222;
                                                        break;
                                                    case 5:
                                                    case 6:
                                                        i15 = i2;
                                                        i13 = g.d(bArr2, i13, fVar2);
                                                        obj6 = Integer.valueOf(fVar2.a);
                                                        obj4 = obj6;
                                                        w0Var = a2.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i39 = i13;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i41 = i75;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr522222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr522222222222222222222222222222;
                                                        break;
                                                    case 7:
                                                    case 8:
                                                        i15 = i2;
                                                        obj6 = Long.valueOf(g.b(i13, bArr2));
                                                        i13 += 8;
                                                        obj4 = obj6;
                                                        w0Var = a2.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i39 = i13;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i41 = i75;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr5222222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr5222222222222222222222222222222;
                                                        break;
                                                    case 9:
                                                    case 10:
                                                        i15 = i2;
                                                        obj6 = Integer.valueOf(g.a(i13, bArr2));
                                                        i13 += 4;
                                                        obj4 = obj6;
                                                        w0Var = a2.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i39 = i13;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i41 = i75;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr52222222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr52222222222222222222222222222222;
                                                        break;
                                                    case 11:
                                                        i15 = i2;
                                                        i13 = g.e(bArr2, i13, fVar2);
                                                        boolean z6 = z;
                                                        if (fVar2.b == 0) {
                                                            z6 = i7;
                                                        }
                                                        obj6 = Boolean.valueOf(z6);
                                                        obj4 = obj6;
                                                        w0Var = a2.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i39 = i13;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i41 = i75;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr522222222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr522222222222222222222222222222222;
                                                        break;
                                                    case 12:
                                                        i15 = i2;
                                                        i13 = g.d(bArr2, i13, fVar2);
                                                        obj6 = Integer.valueOf(w.b(fVar2.a));
                                                        obj4 = obj6;
                                                        w0Var = a2.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i39 = i13;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i41 = i75;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr5222222222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr5222222222222222222222222222222222;
                                                        break;
                                                    case 13:
                                                        i15 = i2;
                                                        i13 = g.e(bArr2, i13, fVar2);
                                                        obj6 = Long.valueOf(w.a(fVar2.b));
                                                        obj4 = obj6;
                                                        w0Var = a2.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i39 = i13;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i41 = i75;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr52222222222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr52222222222222222222222222222222222;
                                                        break;
                                                    case 14:
                                                        throw new IllegalStateException("Shouldn't reach here.");
                                                    case 15:
                                                        i15 = i2;
                                                        i13 = g.a(bArr2, i13, fVar2);
                                                        obj4 = fVar2.c;
                                                        w0Var = a2.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i39 = i13;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i41 = i75;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr522222222222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr522222222222222222222222222222222222;
                                                        break;
                                                    case 16:
                                                        i15 = i2;
                                                        i13 = g.b(bArr2, i13, fVar2);
                                                        obj4 = fVar2.c;
                                                        w0Var = a2.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i39 = i13;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i41 = i75;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr5222222222222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr5222222222222222222222222222222222222;
                                                        break;
                                                    case 17:
                                                        i15 = i2;
                                                        i13 = g.a(p2.c.a(a2.c.getClass()), bArr, i13, i2, (i14 << 3) | 4, fVar);
                                                        obj4 = fVar2.c;
                                                        w0Var = a2.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i39 = i13;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i41 = i75;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr52222222222222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr52222222222222222222222222222222222222;
                                                        break;
                                                    case 18:
                                                        i15 = i2;
                                                        i13 = g.a(p2.c.a(a2.c.getClass()), bArr2, i13, i15, fVar2);
                                                        obj4 = fVar2.c;
                                                        w0Var = a2.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i39 = i13;
                                                        i43 = i8;
                                                        i44 = i9;
                                                        i41 = i75;
                                                        i42 = i6;
                                                        i37 = i15;
                                                        i40 = i14;
                                                        i2Var3 = i2Var2;
                                                        unsafe2 = unsafe;
                                                        i38 = i3;
                                                        fVar3 = fVar2;
                                                        byte[] bArr522222222222222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr522222222222222222222222222222222222222;
                                                        break;
                                                }
                                            }
                                            i15 = i2;
                                            obj4 = obj6;
                                            w0Var = a2.d;
                                            if (!w0Var.d) {
                                            }
                                            i39 = i13;
                                            i43 = i8;
                                            i44 = i9;
                                            i41 = i75;
                                            i42 = i6;
                                            i37 = i15;
                                            i40 = i14;
                                            i2Var3 = i2Var2;
                                            unsafe2 = unsafe;
                                            i38 = i3;
                                            fVar3 = fVar2;
                                            byte[] bArr5222222222222222222222222222222222222222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr5222222222222222222222222222222222222222;
                                        }
                                    }
                                    i41 = i12;
                                    i43 = i8;
                                    i44 = i9;
                                    i15 = i2;
                                    i42 = i6;
                                    i37 = i15;
                                    i40 = i14;
                                    i2Var3 = i2Var2;
                                    unsafe2 = unsafe;
                                    i38 = i3;
                                    fVar3 = fVar2;
                                    byte[] bArr52222222222222222222222222222222222222222 = bArr2;
                                    obj5 = obj3;
                                    bArr4 = bArr52222222222222222222222222222222222222222;
                                } else {
                                    obj3 = obj;
                                    bArr2 = bArr;
                                }
                            }
                            i2Var2 = this;
                            int i77 = i12;
                            i14 = i10;
                            i15 = i2;
                            z0 z0Var2 = (z0) obj3;
                            n3Var = z0Var2.unknownFields;
                            if (n3Var == n3.f) {
                                n3Var = new n3();
                                z0Var2.unknownFields = n3Var;
                            }
                            i39 = g.a(i6, bArr, i13, i2, n3Var, fVar);
                            i41 = i77;
                            i43 = i8;
                            i44 = i9;
                            i42 = i6;
                            i37 = i15;
                            i40 = i14;
                            i2Var3 = i2Var2;
                            unsafe2 = unsafe;
                            i38 = i3;
                            fVar3 = fVar2;
                            byte[] bArr522222222222222222222222222222222222222222 = bArr2;
                            obj5 = obj3;
                            bArr4 = bArr522222222222222222222222222222222222222222;
                        } else {
                            i2Var = this;
                            obj2 = obj;
                            i4 = i2;
                            i39 = i13;
                            i42 = i6;
                            i43 = i8;
                            i44 = i9;
                        }
                    }
                    i5 = 0;
                    a = -1;
                    if (a != -1) {
                    }
                    if (i6 == i11) {
                    }
                    if (this.f) {
                    }
                    i2Var2 = this;
                    int i772 = i12;
                    i14 = i10;
                    i15 = i2;
                    z0 z0Var22 = (z0) obj3;
                    n3Var = z0Var22.unknownFields;
                    if (n3Var == n3.f) {
                    }
                    i39 = g.a(i6, bArr, i13, i2, n3Var, fVar);
                    i41 = i772;
                    i43 = i8;
                    i44 = i9;
                    i42 = i6;
                    i37 = i15;
                    i40 = i14;
                    i2Var3 = i2Var2;
                    unsafe2 = unsafe;
                    i38 = i3;
                    fVar3 = fVar2;
                    byte[] bArr5222222222222222222222222222222222222222222 = bArr2;
                    obj5 = obj3;
                    bArr4 = bArr5222222222222222222222222222222222222222222;
                } else {
                    if (i47 >= i2Var3.c && i47 <= i2Var3.d) {
                        i5 = 0;
                        a = i2Var3.a(i47, 0);
                        if (a != -1) {
                        }
                        if (i6 == i11) {
                        }
                        if (this.f) {
                        }
                        i2Var2 = this;
                        int i7722 = i12;
                        i14 = i10;
                        i15 = i2;
                        z0 z0Var222 = (z0) obj3;
                        n3Var = z0Var222.unknownFields;
                        if (n3Var == n3.f) {
                        }
                        i39 = g.a(i6, bArr, i13, i2, n3Var, fVar);
                        i41 = i7722;
                        i43 = i8;
                        i44 = i9;
                        i42 = i6;
                        i37 = i15;
                        i40 = i14;
                        i2Var3 = i2Var2;
                        unsafe2 = unsafe;
                        i38 = i3;
                        fVar3 = fVar2;
                        byte[] bArr52222222222222222222222222222222222222222222 = bArr2;
                        obj5 = obj3;
                        bArr4 = bArr52222222222222222222222222222222222222222222;
                    }
                    i5 = 0;
                    a = -1;
                    if (a != -1) {
                    }
                    if (i6 == i11) {
                    }
                    if (this.f) {
                    }
                    i2Var2 = this;
                    int i77222 = i12;
                    i14 = i10;
                    i15 = i2;
                    z0 z0Var2222 = (z0) obj3;
                    n3Var = z0Var2222.unknownFields;
                    if (n3Var == n3.f) {
                    }
                    i39 = g.a(i6, bArr, i13, i2, n3Var, fVar);
                    i41 = i77222;
                    i43 = i8;
                    i44 = i9;
                    i42 = i6;
                    i37 = i15;
                    i40 = i14;
                    i2Var3 = i2Var2;
                    unsafe2 = unsafe;
                    i38 = i3;
                    fVar3 = fVar2;
                    byte[] bArr522222222222222222222222222222222222222222222 = bArr2;
                    obj5 = obj3;
                    bArr4 = bArr522222222222222222222222222222222222222222222;
                }
            } else {
                unsafe = unsafe2;
                i4 = i37;
                i2Var = i2Var3;
                obj2 = obj5;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x039d, code lost:
    
        if (r0 != r15) goto L155;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x00a0. Please report as an issue. */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, byte[] bArr, int i, int i2, f fVar) {
        int a;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Unsafe unsafe;
        int i10;
        int i11;
        int i12;
        int e;
        int c;
        int i13;
        int i14;
        int i15;
        int i16;
        i2 i2Var = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i17 = i2;
        f fVar2 = fVar;
        if (i2Var.h) {
            Unsafe unsafe2 = r;
            int i18 = -1;
            int i19 = 0;
            int i20 = i;
            int i21 = -1;
            int i22 = 0;
            int i23 = 0;
            int i24 = 1048575;
            while (i20 < i17) {
                int i25 = i20 + 1;
                int i26 = bArr2[i20];
                if (i26 < 0) {
                    i25 = g.a(i26, bArr2, i25, fVar2);
                    i26 = fVar2.a;
                }
                int i27 = i26;
                int i28 = i27 >>> 3;
                int i29 = i27 & 7;
                if (i28 > i21) {
                    int i30 = i22 / 3;
                    if (i28 >= i2Var.c && i28 <= i2Var.d) {
                        a = i2Var.a(i28, i30);
                        i3 = a;
                    }
                    i3 = i18;
                } else {
                    if (i28 >= i2Var.c && i28 <= i2Var.d) {
                        a = i2Var.a(i28, i19);
                        i3 = a;
                    }
                    i3 = i18;
                }
                if (i3 == i18) {
                    i4 = i28;
                    i5 = i25;
                    i6 = i27;
                    i7 = i23;
                    i8 = i18;
                    i9 = i19;
                    unsafe = unsafe2;
                } else {
                    int[] iArr = i2Var.a;
                    int i31 = iArr[i3 + 1];
                    int i32 = (i31 & 267386880) >>> 20;
                    int i33 = i25;
                    int i34 = i27;
                    long j = i31 & 1048575;
                    if (i32 <= 17) {
                        int i35 = iArr[i3 + 2];
                        int i36 = 1 << (i35 >>> 20);
                        int i37 = i35 & 1048575;
                        if (i37 != i24) {
                            if (i24 != 1048575) {
                                unsafe2.putInt(obj2, i24, i23);
                            }
                            if (i37 != 1048575) {
                                i23 = unsafe2.getInt(obj2, i37);
                            }
                            i10 = i37;
                        } else {
                            i10 = i24;
                        }
                        int i38 = i23;
                        switch (i32) {
                            case 0:
                                i4 = i28;
                                i19 = i3;
                                i11 = i33;
                                if (i29 == 1) {
                                    i12 = i11;
                                    x3.c.a(obj, j, Double.longBitsToDouble(g.b(i11, bArr2)));
                                    e = i12 + 8;
                                    i23 = i38 | i36;
                                    i20 = e;
                                    i24 = i10;
                                    i22 = i19;
                                    unsafe = unsafe2;
                                    i8 = -1;
                                    i9 = 0;
                                    break;
                                }
                                i13 = i11;
                                i7 = i38;
                                i5 = i13;
                                i24 = i10;
                                unsafe = unsafe2;
                                i6 = i34;
                                i8 = -1;
                                i9 = 0;
                                break;
                            case 1:
                                i4 = i28;
                                i19 = i3;
                                i11 = i33;
                                if (i29 == 5) {
                                    x3.c.a(obj2, j, Float.intBitsToFloat(g.a(i11, bArr2)));
                                    e = i11 + 4;
                                    i23 = i38 | i36;
                                    i20 = e;
                                    i24 = i10;
                                    i22 = i19;
                                    unsafe = unsafe2;
                                    i8 = -1;
                                    i9 = 0;
                                    break;
                                }
                                i13 = i11;
                                i7 = i38;
                                i5 = i13;
                                i24 = i10;
                                unsafe = unsafe2;
                                i6 = i34;
                                i8 = -1;
                                i9 = 0;
                                break;
                            case 2:
                            case 3:
                                i4 = i28;
                                i19 = i3;
                                i11 = i33;
                                if (i29 == 0) {
                                    e = g.e(bArr2, i11, fVar2);
                                    unsafe2.putLong(obj, j, fVar2.b);
                                    i23 = i38 | i36;
                                    i20 = e;
                                    i24 = i10;
                                    i22 = i19;
                                    unsafe = unsafe2;
                                    i8 = -1;
                                    i9 = 0;
                                    break;
                                }
                                i13 = i11;
                                i7 = i38;
                                i5 = i13;
                                i24 = i10;
                                unsafe = unsafe2;
                                i6 = i34;
                                i8 = -1;
                                i9 = 0;
                                break;
                            case 4:
                            case 11:
                                i4 = i28;
                                i19 = i3;
                                i11 = i33;
                                if (i29 == 0) {
                                    int i39 = i11 + 1;
                                    byte b = bArr2[i11];
                                    if (b >= 0) {
                                        fVar2.a = b;
                                    } else {
                                        i39 = g.a(b, bArr2, i39, fVar2);
                                    }
                                    e = i39;
                                    unsafe2.putInt(obj2, j, fVar2.a);
                                    i23 = i38 | i36;
                                    i20 = e;
                                    i24 = i10;
                                    i22 = i19;
                                    unsafe = unsafe2;
                                    i8 = -1;
                                    i9 = 0;
                                    break;
                                }
                                i13 = i11;
                                i7 = i38;
                                i5 = i13;
                                i24 = i10;
                                unsafe = unsafe2;
                                i6 = i34;
                                i8 = -1;
                                i9 = 0;
                                break;
                            case 5:
                            case 14:
                                i4 = i28;
                                i19 = i3;
                                i11 = i33;
                                if (i29 == 1) {
                                    i12 = i11;
                                    unsafe2.putLong(obj, j, g.b(i11, bArr2));
                                    e = i12 + 8;
                                    i23 = i38 | i36;
                                    i20 = e;
                                    i24 = i10;
                                    i22 = i19;
                                    unsafe = unsafe2;
                                    i8 = -1;
                                    i9 = 0;
                                    break;
                                }
                                i13 = i11;
                                i7 = i38;
                                i5 = i13;
                                i24 = i10;
                                unsafe = unsafe2;
                                i6 = i34;
                                i8 = -1;
                                i9 = 0;
                                break;
                            case 6:
                            case 13:
                                i4 = i28;
                                i19 = i3;
                                i11 = i33;
                                if (i29 == 5) {
                                    unsafe2.putInt(obj2, j, g.a(i11, bArr2));
                                    e = i11 + 4;
                                    i23 = i38 | i36;
                                    i20 = e;
                                    i24 = i10;
                                    i22 = i19;
                                    unsafe = unsafe2;
                                    i8 = -1;
                                    i9 = 0;
                                    break;
                                }
                                i13 = i11;
                                i7 = i38;
                                i5 = i13;
                                i24 = i10;
                                unsafe = unsafe2;
                                i6 = i34;
                                i8 = -1;
                                i9 = 0;
                                break;
                            case 7:
                                i4 = i28;
                                i19 = i3;
                                i11 = i33;
                                if (i29 == 0) {
                                    e = g.e(bArr2, i11, fVar2);
                                    x3.c.a(obj2, j, fVar2.b != 0);
                                    i23 = i38 | i36;
                                    i20 = e;
                                    i24 = i10;
                                    i22 = i19;
                                    unsafe = unsafe2;
                                    i8 = -1;
                                    i9 = 0;
                                    break;
                                }
                                i13 = i11;
                                i7 = i38;
                                i5 = i13;
                                i24 = i10;
                                unsafe = unsafe2;
                                i6 = i34;
                                i8 = -1;
                                i9 = 0;
                                break;
                            case 8:
                                i4 = i28;
                                i19 = i3;
                                i11 = i33;
                                if (i29 == 2) {
                                    if ((i31 & 536870912) == 0) {
                                        c = g.b(bArr2, i11, fVar2);
                                    } else {
                                        c = g.c(bArr2, i11, fVar2);
                                    }
                                    e = c;
                                    unsafe2.putObject(obj2, j, fVar2.c);
                                    i23 = i38 | i36;
                                    i20 = e;
                                    i24 = i10;
                                    i22 = i19;
                                    unsafe = unsafe2;
                                    i8 = -1;
                                    i9 = 0;
                                    break;
                                }
                                i13 = i11;
                                i7 = i38;
                                i5 = i13;
                                i24 = i10;
                                unsafe = unsafe2;
                                i6 = i34;
                                i8 = -1;
                                i9 = 0;
                                break;
                            case 9:
                                i4 = i28;
                                i19 = i3;
                                i11 = i33;
                                if (i29 == 2) {
                                    e = g.a(i2Var.c(i19), bArr2, i11, i17, fVar2);
                                    Object object = unsafe2.getObject(obj2, j);
                                    if (object == null) {
                                        unsafe2.putObject(obj2, j, fVar2.c);
                                    } else {
                                        unsafe2.putObject(obj2, j, l1.a(object, fVar2.c));
                                    }
                                    i23 = i38 | i36;
                                    i20 = e;
                                    i24 = i10;
                                    i22 = i19;
                                    unsafe = unsafe2;
                                    i8 = -1;
                                    i9 = 0;
                                    break;
                                }
                                i13 = i11;
                                i7 = i38;
                                i5 = i13;
                                i24 = i10;
                                unsafe = unsafe2;
                                i6 = i34;
                                i8 = -1;
                                i9 = 0;
                                break;
                            case 10:
                                i4 = i28;
                                i19 = i3;
                                i11 = i33;
                                if (i29 == 2) {
                                    e = g.a(bArr2, i11, fVar2);
                                    unsafe2.putObject(obj2, j, fVar2.c);
                                    i23 = i38 | i36;
                                    i20 = e;
                                    i24 = i10;
                                    i22 = i19;
                                    unsafe = unsafe2;
                                    i8 = -1;
                                    i9 = 0;
                                    break;
                                }
                                i13 = i11;
                                i7 = i38;
                                i5 = i13;
                                i24 = i10;
                                unsafe = unsafe2;
                                i6 = i34;
                                i8 = -1;
                                i9 = 0;
                                break;
                            case 12:
                                i4 = i28;
                                i19 = i3;
                                i11 = i33;
                                if (i29 == 0) {
                                    int i40 = i11 + 1;
                                    byte b2 = bArr2[i11];
                                    if (b2 >= 0) {
                                        fVar2.a = b2;
                                    } else {
                                        i40 = g.a(b2, bArr2, i40, fVar2);
                                    }
                                    e = i40;
                                    unsafe2.putInt(obj2, j, fVar2.a);
                                    i23 = i38 | i36;
                                    i20 = e;
                                    i24 = i10;
                                    i22 = i19;
                                    unsafe = unsafe2;
                                    i8 = -1;
                                    i9 = 0;
                                    break;
                                }
                                i13 = i11;
                                i7 = i38;
                                i5 = i13;
                                i24 = i10;
                                unsafe = unsafe2;
                                i6 = i34;
                                i8 = -1;
                                i9 = 0;
                                break;
                            case 15:
                                i4 = i28;
                                i19 = i3;
                                i11 = i33;
                                if (i29 == 0) {
                                    int i41 = i11 + 1;
                                    byte b3 = bArr2[i11];
                                    if (b3 >= 0) {
                                        fVar2.a = b3;
                                    } else {
                                        i41 = g.a(b3, bArr2, i41, fVar2);
                                    }
                                    e = i41;
                                    unsafe2.putInt(obj2, j, w.b(fVar2.a));
                                    i23 = i38 | i36;
                                    i20 = e;
                                    i24 = i10;
                                    i22 = i19;
                                    unsafe = unsafe2;
                                    i8 = -1;
                                    i9 = 0;
                                    break;
                                }
                                i13 = i11;
                                i7 = i38;
                                i5 = i13;
                                i24 = i10;
                                unsafe = unsafe2;
                                i6 = i34;
                                i8 = -1;
                                i9 = 0;
                                break;
                            case 16:
                                if (i29 != 0) {
                                    i4 = i28;
                                    i19 = i3;
                                    i11 = i33;
                                    i13 = i11;
                                    i7 = i38;
                                    i5 = i13;
                                    i24 = i10;
                                    unsafe = unsafe2;
                                    i6 = i34;
                                    i8 = -1;
                                    i9 = 0;
                                    break;
                                } else {
                                    e = g.e(bArr2, i33, fVar2);
                                    i19 = i3;
                                    i4 = i28;
                                    unsafe2.putLong(obj, j, w.a(fVar2.b));
                                    i23 = i38 | i36;
                                    i20 = e;
                                    i24 = i10;
                                    i22 = i19;
                                    unsafe = unsafe2;
                                    i8 = -1;
                                    i9 = 0;
                                    break;
                                }
                            default:
                                i4 = i28;
                                i19 = i3;
                                i13 = i33;
                                i7 = i38;
                                i5 = i13;
                                i24 = i10;
                                unsafe = unsafe2;
                                i6 = i34;
                                i8 = -1;
                                i9 = 0;
                                break;
                        }
                        i2Var = this;
                        bArr2 = bArr;
                        i17 = i2;
                        fVar2 = fVar;
                        i18 = i8;
                        i19 = i9;
                        i21 = i4;
                        unsafe2 = unsafe;
                    } else {
                        i4 = i28;
                        int i42 = i3;
                        if (i32 != 27) {
                            i6 = i34;
                            if (i32 <= 49) {
                                i7 = i23;
                                i14 = i24;
                                i16 = i42;
                                i8 = -1;
                                i9 = 0;
                                unsafe = unsafe2;
                                i20 = a(obj, bArr, i33, i2, i6, i29, i42, i31, i32, j, fVar);
                                if (i20 != i33) {
                                    obj2 = obj;
                                    i2Var = this;
                                    bArr2 = bArr;
                                    i17 = i2;
                                    fVar2 = fVar;
                                    i18 = i8;
                                    i19 = i9;
                                    i21 = i4;
                                    i23 = i7;
                                    i24 = i14;
                                    i22 = i16;
                                } else {
                                    obj2 = obj;
                                    i5 = i20;
                                    i24 = i14;
                                    i19 = i16;
                                }
                            } else {
                                i7 = i23;
                                i14 = i24;
                                i15 = i33;
                                i16 = i42;
                                unsafe = unsafe2;
                                i8 = -1;
                                i9 = 0;
                                if (i32 != 50) {
                                    obj2 = obj;
                                    i20 = a(obj, bArr, i15, i2, i6, i4, i29, i31, i32, j, i16, fVar);
                                } else if (i29 == 2) {
                                    Unsafe unsafe3 = r;
                                    Object b4 = i2Var.b(i16);
                                    Object object2 = unsafe3.getObject(obj, j);
                                    i2Var.p.getClass();
                                    if (!((y1) object2).a) {
                                        i2Var.p.getClass();
                                        y1 y1Var = y1.b;
                                        y1 y1Var2 = y1Var.isEmpty() ? new y1() : new y1(y1Var);
                                        i2Var.p.getClass();
                                        z1.a(y1Var2, object2);
                                        unsafe3.putObject(obj, j, y1Var2);
                                    }
                                    i2Var.p.getClass();
                                    b4.getClass();
                                    throw new ClassCastException();
                                }
                            }
                            unsafe2 = unsafe;
                        } else if (i29 == 2) {
                            k1 k1Var = (k1) unsafe2.getObject(obj2, j);
                            if (!((c) k1Var).a) {
                                int size = k1Var.size();
                                k1Var = k1Var.b(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj2, j, k1Var);
                            }
                            t2 c2 = i2Var.c(i42);
                            int a2 = g.a(c2, bArr2, i33, i17, fVar2);
                            k1Var.add(fVar2.c);
                            while (a2 < i17) {
                                int i43 = a2 + 1;
                                byte b5 = bArr2[a2];
                                if (b5 >= 0) {
                                    fVar2.a = b5;
                                } else {
                                    i43 = g.a(b5, bArr2, i43, fVar2);
                                }
                                int i44 = i34;
                                if (i44 != fVar2.a) {
                                    i20 = a2;
                                    i22 = i42;
                                    i21 = i4;
                                    i18 = -1;
                                    i19 = 0;
                                } else {
                                    a2 = g.a(c2, bArr2, i43, i17, fVar2);
                                    k1Var.add(fVar2.c);
                                    i34 = i44;
                                }
                            }
                            i20 = a2;
                            i22 = i42;
                            i21 = i4;
                            i18 = -1;
                            i19 = 0;
                        } else {
                            i7 = i23;
                            i14 = i24;
                            i15 = i33;
                            i16 = i42;
                            unsafe = unsafe2;
                            i6 = i34;
                            i8 = -1;
                            i9 = 0;
                        }
                        i5 = i15;
                        i24 = i14;
                        i19 = i16;
                        obj2 = obj;
                    }
                }
                z0 z0Var = (z0) obj2;
                n3 n3Var = z0Var.unknownFields;
                if (n3Var == n3.f) {
                    n3Var = new n3();
                    z0Var.unknownFields = n3Var;
                }
                i20 = g.a(i6, bArr, i5, i2, n3Var, fVar);
                i22 = i19;
                i23 = i7;
                i2Var = this;
                bArr2 = bArr;
                i17 = i2;
                fVar2 = fVar;
                i18 = i8;
                i19 = i9;
                i21 = i4;
                unsafe2 = unsafe;
            }
            int i45 = i23;
            Unsafe unsafe4 = unsafe2;
            if (i24 != 1048575) {
                unsafe4.putInt(obj2, i24, i45);
            }
            if (i20 != i2) {
                throw new n1("Failed to parse the message.");
            }
            return;
        }
        a(obj, bArr, i, i2, 0, fVar);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final boolean a(Object obj) {
        boolean z;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 < this.j) {
                int i4 = this.i[i2];
                int[] iArr = this.a;
                int i5 = iArr[i4];
                int i6 = iArr[i4 + 1];
                int i7 = iArr[i4 + 2];
                int i8 = i7 & 1048575;
                int i9 = 1 << (i7 >>> 20);
                if (i8 != i) {
                    if (i8 != 1048575) {
                        i3 = r.getInt(obj, i8);
                    }
                    i = i8;
                }
                if ((268435456 & i6) != 0) {
                    if (i == 1048575) {
                        z = a(i4, obj);
                    } else {
                        z = (i3 & i9) != 0;
                    }
                    if (!z) {
                        return false;
                    }
                }
                int i10 = (267386880 & i6) >>> 20;
                if (i10 != 9 && i10 != 17) {
                    if (i10 != 27) {
                        if (i10 == 60 || i10 == 68) {
                            if (a(obj, i5, i4) && !c(i4).a(x3.e(obj, i6 & 1048575))) {
                                return false;
                            }
                        } else if (i10 != 49) {
                            if (i10 != 50) {
                                continue;
                            } else {
                                z1 z1Var = this.p;
                                Object e = x3.e(obj, i6 & 1048575);
                                z1Var.getClass();
                                if (!((y1) e).isEmpty()) {
                                    Object b = b(i4);
                                    this.p.getClass();
                                    b.getClass();
                                    throw new ClassCastException();
                                }
                            }
                        }
                    }
                    List list = (List) x3.e(obj, i6 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        t2 c = c(i4);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (!c.a(list.get(i11))) {
                                return false;
                            }
                        }
                    }
                } else {
                    if (i == 1048575) {
                        z2 = a(i4, obj);
                    } else if ((i9 & i3) == 0) {
                        z2 = false;
                    }
                    if (z2 && !c(i4).a(x3.e(obj, i6 & 1048575))) {
                        return false;
                    }
                }
                i2++;
            } else {
                if (this.f) {
                    this.o.getClass();
                    if (!((GeneratedMessageLite$ExtendableMessage) obj).extensions.c()) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public static void a(int i, Object obj, c0 c0Var) {
        if (obj instanceof String) {
            c0Var.a.a((String) obj, i);
        } else {
            c0Var.a.a(i, (s) obj);
        }
    }

    public final void a(Object obj, int i, s2 s2Var) {
        if ((536870912 & i) != 0) {
            s2Var.b(this.m.b(obj, i & 1048575));
        } else {
            s2Var.q(this.m.b(obj, i & 1048575));
        }
    }

    public final void a(Object obj, int i, s2 s2Var, t2 t2Var, h0 h0Var) {
        s2Var.b(this.m.b(obj, i & 1048575), t2Var, h0Var);
    }

    public final void a(Object obj, long j, s2 s2Var, t2 t2Var, h0 h0Var) {
        s2Var.a(this.m.b(obj, j), t2Var, h0Var);
    }

    public final boolean a(int i, Object obj) {
        int[] iArr = this.a;
        int i2 = iArr[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & x3.c(obj, j)) != 0;
        }
        int i3 = iArr[i + 1];
        long j2 = i3 & 1048575;
        switch ((i3 & 267386880) >>> 20) {
            case 0:
                return x3.c.c(obj, j2) != 0.0d;
            case 1:
                return x3.c.d(obj, j2) != 0.0f;
            case 2:
                return x3.d(obj, j2) != 0;
            case 3:
                return x3.d(obj, j2) != 0;
            case 4:
                return x3.c(obj, j2) != 0;
            case 5:
                return x3.d(obj, j2) != 0;
            case 6:
                return x3.c(obj, j2) != 0;
            case 7:
                return x3.c.a(obj, j2);
            case 8:
                Object e = x3.e(obj, j2);
                if (e instanceof String) {
                    return !((String) e).isEmpty();
                }
                if (e instanceof s) {
                    return !s.b.equals(e);
                }
                throw new IllegalArgumentException();
            case 9:
                return x3.e(obj, j2) != null;
            case 10:
                return !s.b.equals(x3.e(obj, j2));
            case 11:
                return x3.c(obj, j2) != 0;
            case 12:
                return x3.c(obj, j2) != 0;
            case 13:
                return x3.c(obj, j2) != 0;
            case 14:
                return x3.d(obj, j2) != 0;
            case 15:
                return x3.c(obj, j2) != 0;
            case 16:
                return x3.d(obj, j2) != 0;
            case 17:
                return x3.e(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean a(Object obj, int i, int i2) {
        return x3.c(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final boolean a(int i, Object obj, Object obj2) {
        return a(i, obj) == a(i, obj2);
    }

    public final int a(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
