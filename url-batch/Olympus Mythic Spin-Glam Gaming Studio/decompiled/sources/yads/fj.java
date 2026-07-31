package yads;

import android.util.Pair;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class fj {
    public static final byte[] a = sb3.c("OpusHead");

    /* JADX WARN: Code restructure failed: missing block: B:285:0x00e3, code lost:
    
        if (r8 == 0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x07ba A[EDGE_INSN: B:139:0x07ba->B:140:0x07ba BREAK  A[LOOP:6: B:119:0x0758->B:135:0x07ae], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x062c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList a(wi wiVar, by0 by0Var, long j, vk0 vk0Var, boolean z, boolean z2, yx0 yx0Var) {
        int i;
        long j2;
        int i2;
        int i3;
        int i4;
        cj a2;
        ArrayList arrayList;
        String str;
        long[] jArr;
        long[] jArr2;
        u73 u73Var;
        yx0 yx0Var2;
        wi b;
        Pair create;
        int i5;
        long a3;
        u73 u73Var2;
        bj ejVar;
        boolean z3;
        int i6;
        int i7;
        int i8;
        int a4;
        String str2;
        int i9;
        boolean z4;
        int i10;
        u73 u73Var3;
        long[] jArr3;
        int[] iArr;
        int i11;
        long j3;
        long[] jArr4;
        int[] iArr2;
        long[] jArr5;
        long[] jArr6;
        int i12;
        long[] jArr7;
        int i13;
        d83 d83Var;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        long[] jArr8;
        int[] iArr7;
        int[] iArr8;
        int i14;
        int i15;
        d83 d83Var2;
        ArrayList arrayList2;
        wi wiVar2 = wiVar;
        byte b2 = -1;
        ArrayList arrayList3 = new ArrayList();
        int i16 = 0;
        while (i16 < wiVar2.d.size()) {
            wi wiVar3 = (wi) wiVar2.d.get(i16);
            if (wiVar3.a != 1953653099) {
                arrayList2 = arrayList3;
                i = i16;
            } else {
                xi c = wiVar2.c(1836476516);
                c.getClass();
                wi b3 = wiVar3.b(1835297121);
                b3.getClass();
                xi c2 = b3.c(1751411826);
                c2.getClass();
                xb2 xb2Var = c2.b;
                xb2Var.e(16);
                int a5 = xb2Var.a();
                byte b4 = a5 == 1936684398 ? (byte) 1 : a5 == 1986618469 ? (byte) 2 : (a5 == 1952807028 || a5 == 1935832172 || a5 == 1937072756 || a5 == 1668047728) ? (byte) 3 : a5 == 1835365473 ? (byte) 5 : b2;
                i = i16;
                if (b4 == b2) {
                    arrayList = arrayList3;
                    str = "";
                } else {
                    xi c3 = wiVar3.c(1953196132);
                    c3.getClass();
                    xb2 xb2Var2 = c3.b;
                    xb2Var2.e(8);
                    int a6 = (xb2Var2.a() >> 24) & 255;
                    xb2Var2.e(xb2Var2.b + (a6 == 0 ? 8 : 16));
                    int a7 = xb2Var2.a();
                    xb2Var2.e(xb2Var2.b + 4);
                    int i17 = xb2Var2.b;
                    int i18 = a6 != 0 ? 8 : 4;
                    int i19 = 0;
                    while (true) {
                        if (i19 >= i18) {
                            xb2Var2.e(xb2Var2.b + i18);
                            break;
                        }
                        if (xb2Var2.a[i17 + i19] != b2) {
                            j2 = a6 == 0 ? xb2Var2.l() : xb2Var2.o();
                        } else {
                            i19++;
                        }
                    }
                    j2 = -9223372036854775807L;
                    xb2Var2.e(xb2Var2.b + 16);
                    int a8 = xb2Var2.a();
                    int a9 = xb2Var2.a();
                    xb2Var2.e(xb2Var2.b + 4);
                    int a10 = xb2Var2.a();
                    int a11 = xb2Var2.a();
                    if (a8 == 0 && a9 == 65536) {
                        i2 = -65536;
                        if (a10 == -65536 && a11 == 0) {
                            i4 = 90;
                            i3 = i4;
                            long j4 = j != -9223372036854775807L ? j2 : j;
                            xb2 xb2Var3 = c.b;
                            xb2Var3.e(8);
                            xb2Var3.e(xb2Var3.b + (((xb2Var3.a() >> 24) & 255) != 0 ? 8 : 16));
                            long l = xb2Var3.l();
                            long a12 = j4 != -9223372036854775807L ? -9223372036854775807L : sb3.a(j4, 1000000L, l);
                            wi b5 = b3.b(1835626086);
                            b5.getClass();
                            wi b6 = b5.b(1937007212);
                            b6.getClass();
                            xi c4 = b3.c(1835296868);
                            c4.getClass();
                            xb2 xb2Var4 = c4.b;
                            xb2Var4.e(8);
                            int a13 = (xb2Var4.a() >> 24) & 255;
                            xb2Var4.e(xb2Var4.b + (a13 != 0 ? 8 : 16));
                            long l2 = xb2Var4.l();
                            xb2Var4.e(xb2Var4.b + (a13 != 0 ? 4 : 8));
                            int p = xb2Var4.p();
                            Pair create2 = Pair.create(Long.valueOf(l2), "" + ((char) (((p >> 10) & 31) + 96)) + ((char) (((p >> 5) & 31) + 96)) + ((char) ((p & 31) + 96)));
                            xi c5 = b6.c(1937011556);
                            c5.getClass();
                            a2 = a(c5.b, a7, i3, (String) create2.second, vk0Var, z2);
                            if (!z || (b = wiVar3.b(1701082227)) == null) {
                                arrayList = arrayList3;
                                str = "";
                            } else {
                                xi c6 = b.c(1701606260);
                                if (c6 == null) {
                                    arrayList = arrayList3;
                                    str = "";
                                    create = null;
                                } else {
                                    xb2 xb2Var5 = c6.b;
                                    xb2Var5.e(8);
                                    int a14 = (xb2Var5.a() >> 24) & 255;
                                    int n = xb2Var5.n();
                                    long[] jArr9 = new long[n];
                                    str = "";
                                    long[] jArr10 = new long[n];
                                    arrayList = arrayList3;
                                    int i20 = 0;
                                    while (i20 < n) {
                                        int i21 = n;
                                        jArr9[i20] = a14 == 1 ? xb2Var5.o() : xb2Var5.l();
                                        if (a14 == 1) {
                                            i5 = a14;
                                            a3 = xb2Var5.g();
                                        } else {
                                            i5 = a14;
                                            a3 = xb2Var5.a();
                                        }
                                        jArr10[i20] = a3;
                                        if (xb2Var5.i() != 1) {
                                            throw new IllegalArgumentException("Unsupported media rate.");
                                        }
                                        xb2Var5.e(xb2Var5.b + 2);
                                        i20++;
                                        n = i21;
                                        a14 = i5;
                                    }
                                    create = Pair.create(jArr9, jArr10);
                                }
                                if (create != null) {
                                    long[] jArr11 = (long[]) create.first;
                                    jArr2 = (long[]) create.second;
                                    jArr = jArr11;
                                    if (a2.b != null) {
                                        u73Var = new u73(a7, b4, ((Long) create2.first).longValue(), l, a12, a2.b, a2.d, a2.a, a2.c, jArr, jArr2);
                                        yx0Var2 = yx0Var;
                                        u73Var2 = (u73) yx0Var2.apply(u73Var);
                                        if (u73Var2 != null) {
                                            arrayList2 = arrayList;
                                        } else {
                                            wi b7 = wiVar3.b(1835297121);
                                            b7.getClass();
                                            wi b8 = b7.b(1835626086);
                                            b8.getClass();
                                            wi b9 = b8.b(1937007212);
                                            b9.getClass();
                                            xi c7 = b9.c(1937011578);
                                            if (c7 != null) {
                                                ejVar = new dj(c7, u73Var2.f);
                                            } else {
                                                xi c8 = b9.c(1937013298);
                                                if (c8 == null) {
                                                    throw new cc2("Track has no sample table size information", null, true, 1);
                                                }
                                                ejVar = new ej(c8);
                                            }
                                            int b10 = ejVar.b();
                                            if (b10 == 0) {
                                                d83Var2 = new d83(u73Var2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                                            } else {
                                                xi c9 = b9.c(1937007471);
                                                if (c9 == null) {
                                                    c9 = b9.c(1668232756);
                                                    c9.getClass();
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                xb2 xb2Var6 = c9.b;
                                                xi c10 = b9.c(1937011555);
                                                c10.getClass();
                                                xb2 xb2Var7 = c10.b;
                                                xi c11 = b9.c(1937011827);
                                                c11.getClass();
                                                xb2 xb2Var8 = c11.b;
                                                xi c12 = b9.c(1937011571);
                                                xb2 xb2Var9 = c12 != null ? c12.b : null;
                                                xi c13 = b9.c(1668576371);
                                                xb2 xb2Var10 = c13 != null ? c13.b : null;
                                                zi ziVar = new zi(xb2Var7, xb2Var6, z3);
                                                xb2Var8.e(12);
                                                int n2 = xb2Var8.n() - 1;
                                                int n3 = xb2Var8.n();
                                                int n4 = xb2Var8.n();
                                                if (xb2Var10 != null) {
                                                    xb2Var10.e(12);
                                                    i6 = xb2Var10.n();
                                                } else {
                                                    i6 = 0;
                                                }
                                                if (xb2Var9 != null) {
                                                    xb2Var9.e(12);
                                                    i7 = xb2Var9.n();
                                                    if (i7 > 0) {
                                                        i8 = xb2Var9.n() - 1;
                                                        a4 = ejVar.a();
                                                        str2 = u73Var2.f.m;
                                                        if (a4 == -1 && ("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && n2 == 0 && i6 == 0 && i7 == 0) {
                                                            long[] jArr12 = new long[b10];
                                                            int[] iArr9 = new int[b10];
                                                            long[] jArr13 = new long[b10];
                                                            int i22 = i7;
                                                            int[] iArr10 = new int[b10];
                                                            int i23 = n2;
                                                            int i24 = i8;
                                                            int i25 = i22;
                                                            int i26 = 0;
                                                            int i27 = 0;
                                                            long j5 = 0;
                                                            long j6 = 0;
                                                            int i28 = 0;
                                                            int i29 = 0;
                                                            int i30 = n4;
                                                            int i31 = 0;
                                                            int i32 = i6;
                                                            int i33 = n3;
                                                            while (true) {
                                                                if (i31 >= b10) {
                                                                    i9 = i33;
                                                                    break;
                                                                }
                                                                boolean z5 = true;
                                                                while (i27 == 0) {
                                                                    z5 = ziVar.a();
                                                                    if (!z5) {
                                                                        break;
                                                                    }
                                                                    int i34 = i33;
                                                                    long j7 = ziVar.d;
                                                                    i27 = ziVar.c;
                                                                    j6 = j7;
                                                                    i33 = i34;
                                                                    i30 = i30;
                                                                    b10 = b10;
                                                                }
                                                                int i35 = b10;
                                                                i9 = i33;
                                                                int i36 = i30;
                                                                if (!z5) {
                                                                    gh1.d("AtomParsers", "Unexpected end of chunk data");
                                                                    jArr12 = Arrays.copyOf(jArr12, i31);
                                                                    iArr9 = Arrays.copyOf(iArr9, i31);
                                                                    jArr13 = Arrays.copyOf(jArr13, i31);
                                                                    iArr10 = Arrays.copyOf(iArr10, i31);
                                                                    b10 = i31;
                                                                    break;
                                                                }
                                                                if (xb2Var10 != null) {
                                                                    while (i29 == 0 && i32 > 0) {
                                                                        i29 = xb2Var10.n();
                                                                        i28 = xb2Var10.a();
                                                                        i32--;
                                                                    }
                                                                    i29--;
                                                                }
                                                                int i37 = i28;
                                                                jArr12[i31] = j6;
                                                                int c14 = ejVar.c();
                                                                iArr9[i31] = c14;
                                                                if (c14 > i26) {
                                                                    i26 = c14;
                                                                }
                                                                jArr13[i31] = j5 + i37;
                                                                iArr10[i31] = xb2Var9 == null ? 1 : 0;
                                                                if (i31 == i24) {
                                                                    iArr10[i31] = 1;
                                                                    i25--;
                                                                    if (i25 > 0) {
                                                                        xb2Var9.getClass();
                                                                        i24 = xb2Var9.n() - 1;
                                                                    }
                                                                }
                                                                long[] jArr14 = jArr12;
                                                                int i38 = i24;
                                                                int i39 = i36;
                                                                j5 += i39;
                                                                int i40 = i9 - 1;
                                                                if (i40 == 0 && i23 > 0) {
                                                                    i40 = xb2Var8.n();
                                                                    i23--;
                                                                    i39 = xb2Var8.a();
                                                                }
                                                                int i41 = i40;
                                                                j6 += iArr9[i31];
                                                                i27--;
                                                                i31++;
                                                                i28 = i37;
                                                                jArr12 = jArr14;
                                                                i24 = i38;
                                                                i33 = i41;
                                                                b10 = i35;
                                                                i30 = i39;
                                                            }
                                                            int i42 = i27;
                                                            long j8 = j5 + i28;
                                                            if (xb2Var10 != null) {
                                                                while (i32 > 0) {
                                                                    if (xb2Var10.n() != 0) {
                                                                        z4 = false;
                                                                        break;
                                                                    }
                                                                    xb2Var10.a();
                                                                    i32--;
                                                                }
                                                            }
                                                            z4 = true;
                                                            if (i25 == 0 && i9 == 0 && i42 == 0 && i23 == 0) {
                                                                i10 = i29;
                                                                if (i10 == 0 && z4) {
                                                                    u73Var3 = u73Var2;
                                                                    jArr3 = jArr12;
                                                                    iArr = iArr10;
                                                                    i11 = i26;
                                                                    j3 = j8;
                                                                    jArr4 = jArr13;
                                                                    iArr2 = iArr9;
                                                                }
                                                            } else {
                                                                i10 = i29;
                                                            }
                                                            StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                                            u73Var3 = u73Var2;
                                                            sb.append(u73Var3.a);
                                                            sb.append(": remainingSynchronizationSamples ");
                                                            sb.append(i25);
                                                            sb.append(", remainingSamplesAtTimestampDelta ");
                                                            sb.append(i9);
                                                            sb.append(", remainingSamplesInChunk ");
                                                            sb.append(i42);
                                                            sb.append(", remainingTimestampDeltaChanges ");
                                                            sb.append(i23);
                                                            sb.append(", remainingSamplesAtTimestampOffset ");
                                                            sb.append(i10);
                                                            sb.append(!z4 ? ", ctts invalid" : str);
                                                            gh1.d("AtomParsers", sb.toString());
                                                            jArr3 = jArr12;
                                                            iArr = iArr10;
                                                            i11 = i26;
                                                            j3 = j8;
                                                            jArr4 = jArr13;
                                                            iArr2 = iArr9;
                                                        } else {
                                                            int i43 = ziVar.a;
                                                            long[] jArr15 = new long[i43];
                                                            int[] iArr11 = new int[i43];
                                                            while (ziVar.a()) {
                                                                int i44 = ziVar.b;
                                                                jArr15[i44] = ziVar.d;
                                                                iArr11[i44] = ziVar.c;
                                                            }
                                                            long j9 = n4;
                                                            int i45 = 8192 / a4;
                                                            int i46 = 0;
                                                            for (int i47 = 0; i47 < i43; i47++) {
                                                                int i48 = iArr11[i47];
                                                                int i49 = sb3.a;
                                                                i46 += ((i48 + i45) - 1) / i45;
                                                            }
                                                            long[] jArr16 = new long[i46];
                                                            iArr2 = new int[i46];
                                                            jArr4 = new long[i46];
                                                            int[] iArr12 = new int[i46];
                                                            int i50 = 0;
                                                            int i51 = 0;
                                                            int i52 = 0;
                                                            int i53 = 0;
                                                            while (i50 < i43) {
                                                                int i54 = iArr11[i50];
                                                                long j10 = jArr15[i50];
                                                                int i55 = i53;
                                                                int i56 = i43;
                                                                int i57 = i52;
                                                                int i58 = i55;
                                                                long[] jArr17 = jArr15;
                                                                int i59 = i54;
                                                                while (i59 > 0) {
                                                                    int min = Math.min(i45, i59);
                                                                    jArr16[i58] = j10;
                                                                    int[] iArr13 = iArr11;
                                                                    int i60 = a4 * min;
                                                                    iArr2[i58] = i60;
                                                                    i57 = Math.max(i57, i60);
                                                                    jArr4[i58] = i51 * j9;
                                                                    iArr12[i58] = 1;
                                                                    j10 += iArr2[i58];
                                                                    i51 += min;
                                                                    i59 -= min;
                                                                    i58++;
                                                                    i45 = i45;
                                                                    iArr11 = iArr13;
                                                                    jArr16 = jArr16;
                                                                }
                                                                i50++;
                                                                i45 = i45;
                                                                jArr15 = jArr17;
                                                                iArr11 = iArr11;
                                                                int i61 = i58;
                                                                i52 = i57;
                                                                i43 = i56;
                                                                i53 = i61;
                                                            }
                                                            long j11 = j9 * i51;
                                                            u73Var3 = u73Var2;
                                                            j3 = j11;
                                                            iArr = iArr12;
                                                            i11 = i52;
                                                            jArr3 = jArr16;
                                                        }
                                                        long a15 = sb3.a(j3, 1000000L, u73Var3.c);
                                                        jArr5 = u73Var3.h;
                                                        if (jArr5 != null) {
                                                            sb3.a(jArr4, u73Var3.c);
                                                            d83Var = new d83(u73Var3, jArr3, iArr2, i11, jArr4, iArr, a15);
                                                        } else {
                                                            if (jArr5.length == 1 && u73Var3.b == 1 && jArr4.length >= 2) {
                                                                long[] jArr18 = u73Var3.i;
                                                                jArr18.getClass();
                                                                long j12 = jArr18[0];
                                                                long a16 = j12 + sb3.a(u73Var3.h[0], u73Var3.c, u73Var3.d);
                                                                int length = jArr4.length - 1;
                                                                int max = Math.max(0, Math.min(4, length));
                                                                int max2 = Math.max(0, Math.min(jArr4.length - 4, length));
                                                                long j13 = jArr4[0];
                                                                if (j13 <= j12 && j12 < jArr4[max] && jArr4[max2] < a16 && a16 <= j3) {
                                                                    long a17 = sb3.a(j12 - j13, u73Var3.f.A, u73Var3.c);
                                                                    long a18 = sb3.a(j3 - a16, u73Var3.f.A, u73Var3.c);
                                                                    if (a17 != 0 || a18 != 0) {
                                                                        if (a17 > 2147483647L || a18 > 2147483647L) {
                                                                            jArr6 = u73Var3.h;
                                                                            if (jArr6.length == 1 || jArr6[0] != 0) {
                                                                                boolean z6 = u73Var3.b != 1;
                                                                                int[] iArr14 = new int[jArr6.length];
                                                                                int[] iArr15 = new int[jArr6.length];
                                                                                long[] jArr19 = u73Var3.i;
                                                                                jArr19.getClass();
                                                                                i12 = 0;
                                                                                int i62 = 0;
                                                                                int i63 = 0;
                                                                                boolean z7 = false;
                                                                                while (true) {
                                                                                    jArr7 = u73Var3.h;
                                                                                    if (i12 < jArr7.length) {
                                                                                        break;
                                                                                    }
                                                                                    int i64 = b10;
                                                                                    long j14 = jArr19[i12];
                                                                                    if (j14 != -1) {
                                                                                        iArr8 = iArr2;
                                                                                        jArr8 = jArr3;
                                                                                        iArr7 = iArr;
                                                                                        long a19 = sb3.a(jArr7[i12], u73Var3.c, u73Var3.d);
                                                                                        int i65 = 1;
                                                                                        iArr14[i12] = sb3.b(jArr4, j14, true);
                                                                                        iArr15[i12] = sb3.a(jArr4, j14 + a19, z6);
                                                                                        while (true) {
                                                                                            i14 = iArr14[i12];
                                                                                            i15 = iArr15[i12];
                                                                                            if (i14 >= i15 || (iArr7[i14] & i65) != 0) {
                                                                                                break;
                                                                                            }
                                                                                            iArr14[i12] = i14 + i65;
                                                                                            i65 = 1;
                                                                                        }
                                                                                        int i66 = (i15 - i14) + i63;
                                                                                        z7 = (i62 != i14) | z7;
                                                                                        i62 = i15;
                                                                                        i63 = i66;
                                                                                    } else {
                                                                                        jArr8 = jArr3;
                                                                                        iArr7 = iArr;
                                                                                        iArr8 = iArr2;
                                                                                    }
                                                                                    i12++;
                                                                                    b10 = i64;
                                                                                    iArr2 = iArr8;
                                                                                    jArr3 = jArr8;
                                                                                    iArr = iArr7;
                                                                                }
                                                                                long[] jArr20 = jArr3;
                                                                                int[] iArr16 = iArr;
                                                                                int[] iArr17 = iArr2;
                                                                                boolean z8 = (i63 == b10) | z7;
                                                                                long[] jArr21 = !z8 ? new long[i63] : jArr20;
                                                                                int[] iArr18 = !z8 ? new int[i63] : iArr17;
                                                                                int i67 = !z8 ? 0 : i11;
                                                                                int[] iArr19 = !z8 ? new int[i63] : iArr16;
                                                                                long[] jArr22 = new long[i63];
                                                                                int i68 = i67;
                                                                                i13 = 0;
                                                                                int i69 = 0;
                                                                                long j15 = 0;
                                                                                while (i13 < u73Var3.h.length) {
                                                                                    long j16 = u73Var3.i[i13];
                                                                                    int i70 = iArr14[i13];
                                                                                    int i71 = iArr15[i13];
                                                                                    if (z8) {
                                                                                        int i72 = i71 - i70;
                                                                                        iArr3 = iArr14;
                                                                                        System.arraycopy(jArr20, i70, jArr21, i69, i72);
                                                                                        iArr4 = iArr17;
                                                                                        System.arraycopy(iArr4, i70, iArr18, i69, i72);
                                                                                        iArr5 = iArr15;
                                                                                        iArr6 = iArr16;
                                                                                        System.arraycopy(iArr6, i70, iArr19, i69, i72);
                                                                                    } else {
                                                                                        iArr3 = iArr14;
                                                                                        iArr4 = iArr17;
                                                                                        iArr5 = iArr15;
                                                                                        iArr6 = iArr16;
                                                                                    }
                                                                                    int i73 = i68;
                                                                                    while (i70 < i71) {
                                                                                        int[] iArr20 = iArr19;
                                                                                        int[] iArr21 = iArr6;
                                                                                        long[] jArr23 = jArr4;
                                                                                        int i74 = i71;
                                                                                        long j17 = j15;
                                                                                        jArr22[i69] = sb3.a(j15, 1000000L, u73Var3.d) + sb3.a(Math.max(0L, jArr4[i70] - j16), 1000000L, u73Var3.c);
                                                                                        if (z8 && iArr18[i69] > i73) {
                                                                                            i73 = iArr4[i70];
                                                                                        }
                                                                                        i69++;
                                                                                        i70++;
                                                                                        iArr6 = iArr21;
                                                                                        jArr4 = jArr23;
                                                                                        i71 = i74;
                                                                                        j15 = j17;
                                                                                        iArr19 = iArr20;
                                                                                    }
                                                                                    iArr16 = iArr6;
                                                                                    long j18 = j15 + u73Var3.h[i13];
                                                                                    i13++;
                                                                                    j15 = j18;
                                                                                    i68 = i73;
                                                                                    iArr15 = iArr5;
                                                                                    jArr4 = jArr4;
                                                                                    iArr19 = iArr19;
                                                                                    iArr17 = iArr4;
                                                                                    iArr14 = iArr3;
                                                                                }
                                                                                d83Var = new d83(u73Var3, jArr21, iArr18, i68, jArr22, iArr19, sb3.a(j15, 1000000L, u73Var3.d));
                                                                            } else {
                                                                                long[] jArr24 = u73Var3.i;
                                                                                jArr24.getClass();
                                                                                long j19 = jArr24[0];
                                                                                for (int i75 = 0; i75 < jArr4.length; i75++) {
                                                                                    jArr4[i75] = sb3.a(jArr4[i75] - j19, 1000000L, u73Var3.c);
                                                                                }
                                                                                d83Var = new d83(u73Var3, jArr3, iArr2, i11, jArr4, iArr, sb3.a(j3 - j19, 1000000L, u73Var3.c));
                                                                            }
                                                                        } else {
                                                                            by0Var.a = (int) a17;
                                                                            by0Var.b = (int) a18;
                                                                            sb3.a(jArr4, u73Var3.c);
                                                                            d83Var = new d83(u73Var3, jArr3, iArr2, i11, jArr4, iArr, sb3.a(u73Var3.h[0], 1000000L, u73Var3.d));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            jArr6 = u73Var3.h;
                                                            if (jArr6.length == 1) {
                                                            }
                                                            if (u73Var3.b != 1) {
                                                            }
                                                            int[] iArr142 = new int[jArr6.length];
                                                            int[] iArr152 = new int[jArr6.length];
                                                            long[] jArr192 = u73Var3.i;
                                                            jArr192.getClass();
                                                            i12 = 0;
                                                            int i622 = 0;
                                                            int i632 = 0;
                                                            boolean z72 = false;
                                                            while (true) {
                                                                jArr7 = u73Var3.h;
                                                                if (i12 < jArr7.length) {
                                                                }
                                                                i12++;
                                                                b10 = i64;
                                                                iArr2 = iArr8;
                                                                jArr3 = jArr8;
                                                                iArr = iArr7;
                                                            }
                                                            long[] jArr202 = jArr3;
                                                            int[] iArr162 = iArr;
                                                            int[] iArr172 = iArr2;
                                                            boolean z82 = (i632 == b10) | z72;
                                                            if (!z82) {
                                                            }
                                                            if (!z82) {
                                                            }
                                                            if (!z82) {
                                                            }
                                                            if (!z82) {
                                                            }
                                                            long[] jArr222 = new long[i632];
                                                            int i682 = i67;
                                                            i13 = 0;
                                                            int i692 = 0;
                                                            long j152 = 0;
                                                            while (i13 < u73Var3.h.length) {
                                                            }
                                                            d83Var = new d83(u73Var3, jArr21, iArr18, i682, jArr222, iArr19, sb3.a(j152, 1000000L, u73Var3.d));
                                                        }
                                                        d83Var2 = d83Var;
                                                    } else {
                                                        xb2Var9 = null;
                                                    }
                                                } else {
                                                    i7 = 0;
                                                }
                                                i8 = -1;
                                                a4 = ejVar.a();
                                                str2 = u73Var2.f.m;
                                                if (a4 == -1 && ("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && n2 == 0 && i6 == 0 && i7 == 0) {
                                                }
                                                long a152 = sb3.a(j3, 1000000L, u73Var3.c);
                                                jArr5 = u73Var3.h;
                                                if (jArr5 != null) {
                                                }
                                                d83Var2 = d83Var;
                                            }
                                            arrayList2 = arrayList;
                                            arrayList2.add(d83Var2);
                                        }
                                    }
                                }
                            }
                            jArr = null;
                            jArr2 = null;
                            if (a2.b != null) {
                            }
                        }
                    } else {
                        i2 = -65536;
                    }
                    if (a8 == 0 && a9 == i2) {
                        if (a10 == 65536 && a11 == 0) {
                            i4 = 270;
                            i3 = i4;
                            if (j != -9223372036854775807L) {
                            }
                            xb2 xb2Var32 = c.b;
                            xb2Var32.e(8);
                            xb2Var32.e(xb2Var32.b + (((xb2Var32.a() >> 24) & 255) != 0 ? 8 : 16));
                            long l3 = xb2Var32.l();
                            if (j4 != -9223372036854775807L) {
                            }
                            wi b52 = b3.b(1835626086);
                            b52.getClass();
                            wi b62 = b52.b(1937007212);
                            b62.getClass();
                            xi c42 = b3.c(1835296868);
                            c42.getClass();
                            xb2 xb2Var42 = c42.b;
                            xb2Var42.e(8);
                            int a132 = (xb2Var42.a() >> 24) & 255;
                            xb2Var42.e(xb2Var42.b + (a132 != 0 ? 8 : 16));
                            long l22 = xb2Var42.l();
                            xb2Var42.e(xb2Var42.b + (a132 != 0 ? 4 : 8));
                            int p2 = xb2Var42.p();
                            Pair create22 = Pair.create(Long.valueOf(l22), "" + ((char) (((p2 >> 10) & 31) + 96)) + ((char) (((p2 >> 5) & 31) + 96)) + ((char) ((p2 & 31) + 96)));
                            xi c52 = b62.c(1937011556);
                            c52.getClass();
                            a2 = a(c52.b, a7, i3, (String) create22.second, vk0Var, z2);
                            if (z) {
                            }
                            arrayList = arrayList3;
                            str = "";
                            jArr = null;
                            jArr2 = null;
                            if (a2.b != null) {
                            }
                        } else {
                            i2 = -65536;
                        }
                    }
                    if (a8 == i2 && a9 == 0 && a10 == 0 && a11 == i2) {
                        i4 = 180;
                        i3 = i4;
                        if (j != -9223372036854775807L) {
                        }
                        xb2 xb2Var322 = c.b;
                        xb2Var322.e(8);
                        xb2Var322.e(xb2Var322.b + (((xb2Var322.a() >> 24) & 255) != 0 ? 8 : 16));
                        long l32 = xb2Var322.l();
                        if (j4 != -9223372036854775807L) {
                        }
                        wi b522 = b3.b(1835626086);
                        b522.getClass();
                        wi b622 = b522.b(1937007212);
                        b622.getClass();
                        xi c422 = b3.c(1835296868);
                        c422.getClass();
                        xb2 xb2Var422 = c422.b;
                        xb2Var422.e(8);
                        int a1322 = (xb2Var422.a() >> 24) & 255;
                        xb2Var422.e(xb2Var422.b + (a1322 != 0 ? 8 : 16));
                        long l222 = xb2Var422.l();
                        xb2Var422.e(xb2Var422.b + (a1322 != 0 ? 4 : 8));
                        int p22 = xb2Var422.p();
                        Pair create222 = Pair.create(Long.valueOf(l222), "" + ((char) (((p22 >> 10) & 31) + 96)) + ((char) (((p22 >> 5) & 31) + 96)) + ((char) ((p22 & 31) + 96)));
                        xi c522 = b622.c(1937011556);
                        c522.getClass();
                        a2 = a(c522.b, a7, i3, (String) create222.second, vk0Var, z2);
                        if (z) {
                        }
                        arrayList = arrayList3;
                        str = "";
                        jArr = null;
                        jArr2 = null;
                        if (a2.b != null) {
                        }
                    } else {
                        i3 = 0;
                        if (j != -9223372036854775807L) {
                        }
                        xb2 xb2Var3222 = c.b;
                        xb2Var3222.e(8);
                        xb2Var3222.e(xb2Var3222.b + (((xb2Var3222.a() >> 24) & 255) != 0 ? 8 : 16));
                        long l322 = xb2Var3222.l();
                        if (j4 != -9223372036854775807L) {
                        }
                        wi b5222 = b3.b(1835626086);
                        b5222.getClass();
                        wi b6222 = b5222.b(1937007212);
                        b6222.getClass();
                        xi c4222 = b3.c(1835296868);
                        c4222.getClass();
                        xb2 xb2Var4222 = c4222.b;
                        xb2Var4222.e(8);
                        int a13222 = (xb2Var4222.a() >> 24) & 255;
                        xb2Var4222.e(xb2Var4222.b + (a13222 != 0 ? 8 : 16));
                        long l2222 = xb2Var4222.l();
                        xb2Var4222.e(xb2Var4222.b + (a13222 != 0 ? 4 : 8));
                        int p222 = xb2Var4222.p();
                        Pair create2222 = Pair.create(Long.valueOf(l2222), "" + ((char) (((p222 >> 10) & 31) + 96)) + ((char) (((p222 >> 5) & 31) + 96)) + ((char) ((p222 & 31) + 96)));
                        xi c5222 = b6222.c(1937011556);
                        c5222.getClass();
                        a2 = a(c5222.b, a7, i3, (String) create2222.second, vk0Var, z2);
                        if (z) {
                        }
                        arrayList = arrayList3;
                        str = "";
                        jArr = null;
                        jArr2 = null;
                        if (a2.b != null) {
                        }
                    }
                }
                yx0Var2 = yx0Var;
                u73Var = null;
                u73Var2 = (u73) yx0Var2.apply(u73Var);
                if (u73Var2 != null) {
                }
            }
            i16 = i + 1;
            arrayList3 = arrayList2;
            b2 = -1;
            wiVar2 = wiVar;
        }
        return arrayList3;
    }

    public static Pair a(xb2 xb2Var, int i, int i2) {
        Integer num;
        v73 v73Var;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int i5 = xb2Var.b;
        while (i5 - i < i2) {
            xb2Var.e(i5);
            int a2 = xb2Var.a();
            xp0.a("childAtomSize must be positive", a2 > 0);
            if (xb2Var.a() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                String str = null;
                Integer num2 = null;
                while (i6 - i5 < a2) {
                    xb2Var.e(i6);
                    int a3 = xb2Var.a();
                    int a4 = xb2Var.a();
                    if (a4 == 1718775137) {
                        num2 = Integer.valueOf(xb2Var.a());
                    } else if (a4 == 1935894637) {
                        xb2Var.e(xb2Var.b + 4);
                        str = xb2Var.a(4, zt.c);
                    } else if (a4 == 1935894633) {
                        i8 = i6;
                        i7 = a3;
                    }
                    i6 += a3;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    xp0.a("frma atom is mandatory", num2 != null);
                    xp0.a("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = num2;
                            v73Var = null;
                            break;
                        }
                        xb2Var.e(i9);
                        int a5 = xb2Var.a();
                        if (xb2Var.a() == 1952804451) {
                            int a6 = (xb2Var.a() >> 24) & 255;
                            xb2Var.e(xb2Var.b + 1);
                            if (a6 == 0) {
                                xb2Var.e(xb2Var.b + 1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int k = xb2Var.k();
                                int i10 = (k & 240) >> 4;
                                i3 = k & 15;
                                i4 = i10;
                            }
                            boolean z = xb2Var.k() == 1;
                            int k2 = xb2Var.k();
                            byte[] bArr2 = new byte[16];
                            xb2Var.a(bArr2, 0, 16);
                            if (z && k2 == 0) {
                                int k3 = xb2Var.k();
                                byte[] bArr3 = new byte[k3];
                                xb2Var.a(bArr3, 0, k3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            v73Var = new v73(z, str, k2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += a5;
                        }
                    }
                    xp0.a("tenc atom is mandatory", v73Var != null);
                    int i11 = sb3.a;
                    create = Pair.create(num, v73Var);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += a2;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:380:0x0b5d, code lost:
    
        if (r25 == null) goto L549;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0716  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static cj a(xb2 xb2Var, int i, int i2, String str, vk0 vk0Var, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        vk0 vk0Var2;
        String str2;
        int i7;
        int i8;
        float f;
        int i9;
        List list;
        int i10;
        int i11;
        cj cjVar;
        int i12;
        float f2;
        int i13;
        cj cjVar2;
        int i14;
        int i15;
        byte[] bArr;
        int i16;
        List list2;
        String str3;
        String str4;
        int i17;
        int a2;
        int i18;
        int i19;
        int i20;
        int i21;
        vk0 vk0Var3;
        String str5;
        String str6;
        int i22;
        String str7;
        String str8;
        int i23;
        String str9;
        int i24;
        int i25;
        aj ajVar;
        String str10;
        List list3;
        int i26;
        String str11;
        List list4;
        int i27;
        int i28;
        int i29;
        int i30;
        String str12;
        String str13;
        String str14;
        um2 a3;
        String str15 = str;
        vk0 vk0Var4 = vk0Var;
        xb2Var.e(12);
        int a4 = xb2Var.a();
        cj cjVar3 = new cj(a4);
        int i31 = 0;
        while (i31 < a4) {
            int i32 = xb2Var.b;
            int a5 = xb2Var.a();
            String str16 = "childAtomSize must be positive";
            xp0.a("childAtomSize must be positive", a5 > 0);
            int a6 = xb2Var.a();
            if (a6 == 1635148593 || a6 == 1635148595 || a6 == 1701733238 || a6 == 1831958048 || a6 == 1836070006 || a6 == 1752589105 || a6 == 1751479857 || a6 == 1932670515 || a6 == 1211250227 || a6 == 1987063864 || a6 == 1987063865 || a6 == 1635135537 || a6 == 1685479798 || a6 == 1685479729 || a6 == 1685481573 || a6 == 1685481521) {
                i3 = a4;
                i4 = i31;
                xb2Var.e(i32 + 16);
                xb2Var.e(xb2Var.b + 16);
                int p = xb2Var.p();
                int p2 = xb2Var.p();
                xb2Var.e(xb2Var.b + 50);
                int i33 = xb2Var.b;
                if (a6 == 1701733238) {
                    i5 = a5;
                    i6 = i32;
                    Pair a7 = a(xb2Var, i6, i5);
                    if (a7 != null) {
                        a6 = ((Integer) a7.first).intValue();
                        if (vk0Var == null) {
                            z2 = false;
                            vk0Var2 = null;
                        } else {
                            String str17 = ((v73) a7.second).b;
                            if (sb3.a(vk0Var.d, str17)) {
                                vk0Var2 = vk0Var;
                                z2 = false;
                            } else {
                                z2 = false;
                                vk0Var2 = new vk0(str17, false, vk0Var.b);
                            }
                        }
                        cjVar3.a[i4] = (v73) a7.second;
                    } else {
                        z2 = false;
                        vk0Var2 = vk0Var;
                    }
                    xb2Var.e(i33);
                } else {
                    i5 = a5;
                    i6 = i32;
                    z2 = false;
                    vk0Var2 = vk0Var;
                }
                if (a6 == 1831958048) {
                    str2 = "video/mpeg";
                } else {
                    str2 = a6 == 1211250227 ? "video/3gpp" : null;
                }
                boolean z3 = z2;
                String str18 = str2;
                float f3 = 1.0f;
                int i34 = i33;
                vk0 vk0Var5 = vk0Var2;
                int i35 = -1;
                List list5 = null;
                String str19 = null;
                byte[] bArr2 = null;
                ByteBuffer byteBuffer = null;
                aj ajVar2 = null;
                int i36 = -1;
                int i37 = -1;
                int i38 = -1;
                while (true) {
                    if (i34 - i6 >= i5) {
                        i7 = i35;
                        i8 = i5;
                        f = f3;
                        i9 = i6;
                        list = list5;
                        break;
                    }
                    xb2Var.e(i34);
                    int i39 = xb2Var.b;
                    list = list5;
                    int a8 = xb2Var.a();
                    i7 = i35;
                    if (a8 == 0 && xb2Var.b - i6 == i5) {
                        i8 = i5;
                        f = f3;
                        i9 = i6;
                        break;
                    }
                    xp0.a(str16, a8 > 0);
                    int a9 = xb2Var.a();
                    String str20 = str16;
                    if (a9 == 1635148611) {
                        xp0.a(null, str18 == null);
                        xb2Var.e(i39 + 8);
                        pk a10 = pk.a(xb2Var);
                        list2 = a10.a;
                        cjVar3.c = a10.b;
                        if (!z3) {
                            f3 = a10.e;
                        }
                        str3 = a10.f;
                        str4 = "video/avc";
                    } else if (a9 == 1752589123) {
                        xp0.a(null, str18 == null);
                        xb2Var.e(i39 + 8);
                        a01 a11 = a01.a(xb2Var);
                        list2 = a11.a;
                        cjVar3.c = a11.b;
                        if (!z3) {
                            f3 = a11.c;
                        }
                        str3 = a11.d;
                        str4 = "video/hevc";
                    } else {
                        if (a9 == 1685480259 || a9 == 1685485123) {
                            i12 = i5;
                            f2 = f3;
                            i13 = i6;
                            cjVar2 = cjVar3;
                            i14 = p2;
                            i15 = a6;
                            bArr = bArr2;
                            qj0 a12 = qj0.a(xb2Var);
                            if (a12 != null) {
                                str19 = a12.a;
                                str18 = "video/dolby-vision";
                            }
                        } else {
                            if (a9 == 1987076931) {
                                xp0.a(null, str18 == null);
                                str18 = a6 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                            } else if (a9 == 1635135811) {
                                xp0.a(null, str18 == null);
                                str18 = "video/av01";
                            } else if (a9 == 1668050025) {
                                if (byteBuffer == null) {
                                    byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                }
                                ByteBuffer byteBuffer2 = byteBuffer;
                                byteBuffer2.position(21);
                                byteBuffer2.putShort(xb2Var.i());
                                byteBuffer2.putShort(xb2Var.i());
                                byteBuffer = byteBuffer2;
                            } else {
                                if (a9 == 1835295606) {
                                    if (byteBuffer == null) {
                                        byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                    }
                                    ByteBuffer byteBuffer3 = byteBuffer;
                                    short i40 = xb2Var.i();
                                    short i41 = xb2Var.i();
                                    i15 = a6;
                                    short i42 = xb2Var.i();
                                    i12 = i5;
                                    short i43 = xb2Var.i();
                                    i13 = i6;
                                    short i44 = xb2Var.i();
                                    cjVar2 = cjVar3;
                                    short i45 = xb2Var.i();
                                    bArr = bArr2;
                                    short i46 = xb2Var.i();
                                    f2 = f3;
                                    short i47 = xb2Var.i();
                                    long l = xb2Var.l();
                                    long l2 = xb2Var.l();
                                    i14 = p2;
                                    byteBuffer3.position(1);
                                    byteBuffer3.putShort(i44);
                                    byteBuffer3.putShort(i45);
                                    byteBuffer3.putShort(i40);
                                    byteBuffer3.putShort(i41);
                                    byteBuffer3.putShort(i42);
                                    byteBuffer3.putShort(i43);
                                    byteBuffer3.putShort(i46);
                                    byteBuffer3.putShort(i47);
                                    byteBuffer3.putShort((short) (l / 10000));
                                    byteBuffer3.putShort((short) (l2 / 10000));
                                    byteBuffer = byteBuffer3;
                                } else {
                                    i12 = i5;
                                    f2 = f3;
                                    i13 = i6;
                                    cjVar2 = cjVar3;
                                    i14 = p2;
                                    i15 = a6;
                                    bArr = bArr2;
                                    if (a9 == 1681012275) {
                                        xp0.a(null, str18 == null);
                                        str18 = "video/3gpp";
                                    } else {
                                        if (a9 == 1702061171) {
                                            xp0.a(null, str18 == null);
                                            aj a13 = a(i39, xb2Var);
                                            String str21 = a13.a;
                                            byte[] bArr3 = a13.b;
                                            if (bArr3 != null) {
                                                list = l41.a(bArr3);
                                            }
                                            ajVar2 = a13;
                                            str18 = str21;
                                        } else if (a9 == 1885434736) {
                                            xb2Var.e(i39 + 8);
                                            f2 = xb2Var.n() / xb2Var.n();
                                            i35 = i7;
                                            z3 = true;
                                            i34 += a8;
                                            list5 = list;
                                            str16 = str20;
                                            a6 = i15;
                                            i5 = i12;
                                            i6 = i13;
                                            cjVar3 = cjVar2;
                                            bArr2 = bArr;
                                            f3 = f2;
                                            p2 = i14;
                                        } else if (a9 == 1937126244) {
                                            int i48 = i39 + 8;
                                            while (true) {
                                                if (i48 - i39 >= a8) {
                                                    bArr = null;
                                                    break;
                                                }
                                                xb2Var.e(i48);
                                                int a14 = xb2Var.a();
                                                if (xb2Var.a() == 1886547818) {
                                                    bArr = Arrays.copyOfRange(xb2Var.a, i48, a14 + i48);
                                                    break;
                                                }
                                                i48 += a14;
                                            }
                                        } else if (a9 == 1936995172) {
                                            int k = xb2Var.k();
                                            xb2Var.e(xb2Var.b + 3);
                                            if (k == 0) {
                                                int k2 = xb2Var.k();
                                                if (k2 == 0) {
                                                    i35 = 0;
                                                } else if (k2 == 1) {
                                                    i35 = 1;
                                                } else if (k2 == 2) {
                                                    i35 = 2;
                                                } else if (k2 == 3) {
                                                    i35 = 3;
                                                }
                                                i34 += a8;
                                                list5 = list;
                                                str16 = str20;
                                                a6 = i15;
                                                i5 = i12;
                                                i6 = i13;
                                                cjVar3 = cjVar2;
                                                bArr2 = bArr;
                                                f3 = f2;
                                                p2 = i14;
                                            }
                                        } else if (a9 == 1668246642) {
                                            int a15 = xb2Var.a();
                                            if (a15 != 1852009592 && a15 != 1852009571) {
                                                gh1.d("AtomParsers", "Unsupported color type: " + yi.a(a15));
                                            } else {
                                                int p3 = xb2Var.p();
                                                int p4 = xb2Var.p();
                                                xb2Var.e(xb2Var.b + 2);
                                                boolean z4 = a8 == 19 && (xb2Var.k() & 128) != 0;
                                                mq mqVar = fx.g;
                                                int i49 = p3 != 1 ? p3 != 9 ? (p3 == 4 || p3 == 5 || p3 == 6 || p3 == 7) ? 2 : -1 : 6 : 1;
                                                int i50 = z4 ? 1 : 2;
                                                if (p4 != 1) {
                                                    if (p4 == 16) {
                                                        i16 = 6;
                                                    } else if (p4 == 18) {
                                                        i16 = 7;
                                                    } else if (p4 != 6 && p4 != 7) {
                                                        i16 = -1;
                                                    }
                                                    i38 = i49;
                                                    i37 = i50;
                                                    i36 = i16;
                                                }
                                                i16 = 3;
                                                i38 = i49;
                                                i37 = i50;
                                                i36 = i16;
                                            }
                                        }
                                        i35 = i7;
                                        i34 += a8;
                                        list5 = list;
                                        str16 = str20;
                                        a6 = i15;
                                        i5 = i12;
                                        i6 = i13;
                                        cjVar3 = cjVar2;
                                        bArr2 = bArr;
                                        f3 = f2;
                                        p2 = i14;
                                    }
                                }
                                i35 = i7;
                                i34 += a8;
                                list5 = list;
                                str16 = str20;
                                a6 = i15;
                                i5 = i12;
                                i6 = i13;
                                cjVar3 = cjVar2;
                                bArr2 = bArr;
                                f3 = f2;
                                p2 = i14;
                            }
                            i12 = i5;
                            f2 = f3;
                            i13 = i6;
                            cjVar2 = cjVar3;
                            i14 = p2;
                            i15 = a6;
                            bArr = bArr2;
                            i35 = i7;
                            i34 += a8;
                            list5 = list;
                            str16 = str20;
                            a6 = i15;
                            i5 = i12;
                            i6 = i13;
                            cjVar3 = cjVar2;
                            bArr2 = bArr;
                            f3 = f2;
                            p2 = i14;
                        }
                        i35 = i7;
                        i34 += a8;
                        list5 = list;
                        str16 = str20;
                        a6 = i15;
                        i5 = i12;
                        i6 = i13;
                        cjVar3 = cjVar2;
                        bArr2 = bArr;
                        f3 = f2;
                        p2 = i14;
                    }
                    i12 = i5;
                    f2 = f3;
                    i13 = i6;
                    list = list2;
                    cjVar2 = cjVar3;
                    str18 = str4;
                    i14 = p2;
                    i15 = a6;
                    bArr = bArr2;
                    str19 = str3;
                    i35 = i7;
                    i34 += a8;
                    list5 = list;
                    str16 = str20;
                    a6 = i15;
                    i5 = i12;
                    i6 = i13;
                    cjVar3 = cjVar2;
                    bArr2 = bArr;
                    f3 = f2;
                    p2 = i14;
                }
                cj cjVar4 = cjVar3;
                int i51 = p2;
                byte[] bArr4 = bArr2;
                if (str18 == null) {
                    cjVar = cjVar4;
                } else {
                    iw0 iw0Var = new iw0();
                    iw0Var.a = Integer.toString(i);
                    iw0Var.k = str18;
                    iw0Var.h = str19;
                    iw0Var.p = p;
                    iw0Var.q = i51;
                    iw0Var.t = f;
                    iw0Var.s = i2;
                    iw0Var.u = bArr4;
                    iw0Var.v = i7;
                    iw0Var.m = list;
                    iw0Var.n = vk0Var5;
                    int i52 = i38;
                    if (i52 == -1) {
                        i11 = i37;
                        i10 = i36;
                        if (i11 == -1) {
                            if (i10 == -1) {
                            }
                        }
                    } else {
                        i10 = i36;
                        i11 = i37;
                    }
                    iw0Var.w = new fx(i52, i11, i10, byteBuffer != null ? byteBuffer.array() : null);
                    if (ajVar2 != null) {
                        aj ajVar3 = ajVar2;
                        iw0Var.f = nc1.b(ajVar3.c);
                        iw0Var.g = nc1.b(ajVar3.d);
                    }
                    jw0 jw0Var = new jw0(iw0Var);
                    cjVar = cjVar4;
                    cjVar.b = jw0Var;
                }
            } else if (a6 == 1836069985 || a6 == 1701733217 || a6 == 1633889587 || a6 == 1700998451 || a6 == 1633889588 || a6 == 1835823201 || a6 == 1685353315 || a6 == 1685353317 || a6 == 1685353320 || a6 == 1685353324 || a6 == 1685353336 || a6 == 1935764850 || a6 == 1935767394 || a6 == 1819304813 || a6 == 1936684916 || a6 == 1953984371 || a6 == 778924082 || a6 == 778924083 || a6 == 1835557169 || a6 == 1835560241 || a6 == 1634492771 || a6 == 1634492791 || a6 == 1970037111 || a6 == 1332770163 || a6 == 1716281667) {
                xb2Var.e(i32 + 16);
                if (z) {
                    i17 = xb2Var.p();
                    xb2Var.e(xb2Var.b + 6);
                } else {
                    xb2Var.e(xb2Var.b + 8);
                    i17 = 0;
                }
                if (i17 == 0 || i17 == 1) {
                    int p5 = xb2Var.p();
                    xb2Var.e(xb2Var.b + 6);
                    byte[] bArr5 = xb2Var.a;
                    int i53 = xb2Var.b;
                    int i54 = i53 + 1;
                    xb2Var.b = i54;
                    int i55 = (bArr5[i53] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
                    xb2Var.b = i53 + 2;
                    int i56 = (bArr5[i54] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i55;
                    xb2Var.b = i53 + 4;
                    xb2Var.e(i53);
                    a2 = xb2Var.a();
                    if (i17 == 1) {
                        xb2Var.e(xb2Var.b + 16);
                    }
                    i18 = i56;
                    i19 = p5;
                } else if (i17 == 2) {
                    xb2Var.e(xb2Var.b + 16);
                    i18 = (int) Math.round(Double.longBitsToDouble(xb2Var.g()));
                    i19 = xb2Var.n();
                    xb2Var.e(xb2Var.b + 20);
                    a2 = 0;
                } else {
                    i3 = a4;
                    cjVar = cjVar3;
                    i4 = i31;
                    i9 = i32;
                    i8 = a5;
                }
                int i57 = xb2Var.b;
                if (a6 == 1701733217) {
                    Pair a16 = a(xb2Var, i32, a5);
                    if (a16 != null) {
                        a6 = ((Integer) a16.first).intValue();
                        if (vk0Var4 == null) {
                            i20 = i18;
                            i21 = i19;
                            i3 = a4;
                            vk0Var3 = null;
                        } else {
                            String str22 = ((v73) a16.second).b;
                            i20 = i18;
                            if (sb3.a(vk0Var4.d, str22)) {
                                vk0Var3 = vk0Var4;
                                i21 = i19;
                                i3 = a4;
                            } else {
                                i21 = i19;
                                i3 = a4;
                                vk0Var3 = new vk0(str22, false, vk0Var4.b);
                            }
                        }
                        cjVar3.a[i31] = (v73) a16.second;
                    } else {
                        i20 = i18;
                        i21 = i19;
                        i3 = a4;
                        vk0Var3 = vk0Var4;
                    }
                    xb2Var.e(i57);
                } else {
                    i20 = i18;
                    i21 = i19;
                    i3 = a4;
                    vk0Var3 = vk0Var4;
                }
                if (a6 == 1633889587) {
                    str8 = "audio/ac3";
                } else if (a6 == 1700998451) {
                    str8 = "audio/eac3";
                } else if (a6 == 1633889588) {
                    str8 = "audio/ac4";
                } else if (a6 == 1685353315) {
                    str5 = "audio/vnd.dts";
                    str6 = str5;
                    i22 = -1;
                    i4 = i31;
                    i23 = i57;
                    str9 = str6;
                    i24 = i20;
                    i25 = i21;
                    String str23 = null;
                    List list6 = null;
                    ajVar = null;
                    while (i23 - i32 < a5) {
                        xb2Var.e(i23);
                        int a17 = xb2Var.a();
                        int i58 = a5;
                        xp0.a("childAtomSize must be positive", a17 > 0);
                        int a18 = xb2Var.a();
                        int i59 = i32;
                        if (a18 == 1835557187) {
                            int i60 = a17 - 13;
                            byte[] bArr6 = new byte[i60];
                            xb2Var.e(i23 + 13);
                            xb2Var.a(bArr6, 0, i60);
                            list4 = l41.a(bArr6);
                            i27 = i22;
                        } else {
                            int i61 = 1702061171;
                            if (a18 == 1702061171) {
                                str11 = str23;
                                list4 = list6;
                                i27 = i22;
                            } else if (z && a18 == 2002876005) {
                                str11 = str23;
                                list4 = list6;
                                i27 = i22;
                                i61 = 1702061171;
                            } else {
                                if (a18 == 1684103987) {
                                    xb2Var.e(i23 + 8);
                                    String num = Integer.toString(i);
                                    int i62 = e0.b[(xb2Var.k() & 192) >> 6];
                                    int k3 = xb2Var.k();
                                    int i63 = e0.d[(k3 & 56) >> 3];
                                    if ((k3 & 4) != 0) {
                                        i63++;
                                    }
                                    list4 = list6;
                                    int i64 = i63;
                                    i27 = i22;
                                    iw0 iw0Var2 = new iw0();
                                    iw0Var2.a = num;
                                    iw0Var2.k = "audio/ac3";
                                    iw0Var2.x = i64;
                                    iw0Var2.y = i62;
                                    iw0Var2.n = vk0Var3;
                                    iw0Var2.c = str15;
                                    cjVar3.b = new jw0(iw0Var2);
                                    str11 = str23;
                                } else {
                                    list4 = list6;
                                    i27 = i22;
                                    if (a18 == 1684366131) {
                                        xb2Var.e(i23 + 8);
                                        String num2 = Integer.toString(i);
                                        xb2Var.e(xb2Var.b + 2);
                                        int i65 = e0.b[(xb2Var.k() & 192) >> 6];
                                        int k4 = xb2Var.k();
                                        int i66 = e0.d[(k4 & 14) >> 1];
                                        if ((k4 & 1) != 0) {
                                            i66++;
                                        }
                                        if (((xb2Var.k() & 30) >> 1) > 0 && (xb2Var.k() & 2) != 0) {
                                            i66 += 2;
                                        }
                                        str11 = str23;
                                        if (xb2Var.c - xb2Var.b > 0 && (xb2Var.k() & 1) != 0) {
                                            str13 = "audio/eac3-joc";
                                        } else {
                                            str13 = "audio/eac3";
                                        }
                                        iw0 iw0Var3 = new iw0();
                                        iw0Var3.a = num2;
                                        iw0Var3.k = str13;
                                        iw0Var3.x = i66;
                                        iw0Var3.y = i65;
                                        iw0Var3.n = vk0Var3;
                                        iw0Var3.c = str15;
                                        cjVar3.b = new jw0(iw0Var3);
                                    } else {
                                        str11 = str23;
                                        if (a18 == 1684103988) {
                                            xb2Var.e(i23 + 8);
                                            String num3 = Integer.toString(i);
                                            xb2Var.e(xb2Var.b + 1);
                                            int i67 = ((xb2Var.k() & 32) >> 5) == 1 ? 48000 : 44100;
                                            iw0 iw0Var4 = new iw0();
                                            iw0Var4.a = num3;
                                            iw0Var4.k = "audio/ac4";
                                            iw0Var4.x = 2;
                                            iw0Var4.y = i67;
                                            iw0Var4.n = vk0Var3;
                                            iw0Var4.c = str15;
                                            cjVar3.b = new jw0(iw0Var4);
                                        } else if (a18 == 1684892784) {
                                            if (a2 <= 0) {
                                                throw new cc2(gg2.a(a2, "Invalid sample rate for Dolby TrueHD MLP stream: "), null, true, 1);
                                            }
                                            i24 = a2;
                                            str23 = str11;
                                            i25 = 2;
                                            i23 += a17;
                                            a5 = i58;
                                            i32 = i59;
                                            list6 = list4;
                                            i22 = i27;
                                        } else if (a18 == 1684305011) {
                                            iw0 iw0Var5 = new iw0();
                                            iw0Var5.a = Integer.toString(i);
                                            iw0Var5.k = str9;
                                            iw0Var5.x = i25;
                                            iw0Var5.y = i24;
                                            iw0Var5.n = vk0Var3;
                                            iw0Var5.c = str15;
                                            cjVar3.b = new jw0(iw0Var5);
                                        } else {
                                            if (a18 == 1682927731) {
                                                int i68 = a17 - 8;
                                                byte[] bArr7 = a;
                                                byte[] copyOf = Arrays.copyOf(bArr7, bArr7.length + i68);
                                                xb2Var.e(i23 + 8);
                                                xb2Var.a(copyOf, bArr7.length, i68);
                                                list4 = fb2.a(copyOf);
                                            } else if (a18 == 1684425825) {
                                                byte[] bArr8 = new byte[a17 - 8];
                                                bArr8[0] = 102;
                                                bArr8[1] = 76;
                                                bArr8[2] = 97;
                                                bArr8[3] = 67;
                                                xb2Var.e(i23 + 12);
                                                xb2Var.a(bArr8, 4, a17 - 12);
                                                list4 = l41.a(bArr8);
                                            } else {
                                                if (a18 == 1634492771) {
                                                    int i69 = a17 - 12;
                                                    byte[] bArr9 = new byte[i69];
                                                    xb2Var.e(i23 + 12);
                                                    xb2Var.a(bArr9, 0, i69);
                                                    xb2 xb2Var2 = new xb2(bArr9);
                                                    xb2Var2.e(9);
                                                    int k5 = xb2Var2.k();
                                                    xb2Var2.e(20);
                                                    Pair create = Pair.create(Integer.valueOf(xb2Var2.n()), Integer.valueOf(k5));
                                                    int intValue = ((Integer) create.first).intValue();
                                                    i25 = ((Integer) create.second).intValue();
                                                    list4 = l41.a(bArr9);
                                                    i24 = intValue;
                                                }
                                                str23 = str11;
                                                i23 += a17;
                                                a5 = i58;
                                                i32 = i59;
                                                list6 = list4;
                                                i22 = i27;
                                            }
                                            str23 = str11;
                                        }
                                    }
                                }
                                str23 = str11;
                                i23 += a17;
                                a5 = i58;
                                i32 = i59;
                                list6 = list4;
                                i22 = i27;
                            }
                            if (a18 == i61) {
                                i28 = i23;
                            } else {
                                i28 = xb2Var.b;
                                xp0.a(null, i28 >= i23);
                                while (i28 - i23 < a17) {
                                    xb2Var.e(i28);
                                    int a19 = xb2Var.a();
                                    xp0.a("childAtomSize must be positive", a19 > 0);
                                    if (xb2Var.a() != 1702061171) {
                                        i28 += a19;
                                    }
                                }
                                i29 = -1;
                                i28 = -1;
                                if (i28 != i29) {
                                    aj a20 = a(i28, xb2Var);
                                    str9 = a20.a;
                                    byte[] bArr10 = a20.b;
                                    if (bArr10 != null) {
                                        if ("audio/mp4a-latm".equals(str9)) {
                                            a a21 = b.a(new wb2(bArr10), false);
                                            i24 = a21.a;
                                            i30 = a21.b;
                                            str12 = a21.c;
                                        } else {
                                            i30 = i25;
                                            str12 = str11;
                                        }
                                        ajVar = a20;
                                        list4 = l41.a(bArr10);
                                        str23 = str12;
                                        i25 = i30;
                                        i23 += a17;
                                        a5 = i58;
                                        i32 = i59;
                                        list6 = list4;
                                        i22 = i27;
                                    } else {
                                        ajVar = a20;
                                    }
                                }
                                str23 = str11;
                                i23 += a17;
                                a5 = i58;
                                i32 = i59;
                                list6 = list4;
                                i22 = i27;
                            }
                            i29 = -1;
                            if (i28 != i29) {
                            }
                            str23 = str11;
                            i23 += a17;
                            a5 = i58;
                            i32 = i59;
                            list6 = list4;
                            i22 = i27;
                        }
                        i23 += a17;
                        a5 = i58;
                        i32 = i59;
                        list6 = list4;
                        i22 = i27;
                    }
                    str10 = str23;
                    list3 = list6;
                    int i70 = i32;
                    int i71 = a5;
                    i26 = i22;
                    if (cjVar3.b == null && str9 != null) {
                        iw0 iw0Var6 = new iw0();
                        iw0Var6.a = Integer.toString(i);
                        iw0Var6.k = str9;
                        iw0Var6.h = str10;
                        iw0Var6.x = i25;
                        iw0Var6.y = i24;
                        iw0Var6.z = i26;
                        iw0Var6.m = list3;
                        iw0Var6.n = vk0Var3;
                        iw0Var6.c = str15;
                        if (ajVar != null) {
                            aj ajVar4 = ajVar;
                            iw0Var6.f = nc1.b(ajVar4.c);
                            iw0Var6.g = nc1.b(ajVar4.d);
                        }
                        cjVar3.b = new jw0(iw0Var6);
                    }
                    cjVar = cjVar3;
                    i8 = i71;
                    i9 = i70;
                } else {
                    if (a6 != 1685353320 && a6 != 1685353324) {
                        if (a6 == 1685353317) {
                            str5 = "audio/vnd.dts.hd;profile=lbr";
                        } else if (a6 == 1685353336) {
                            str5 = "audio/vnd.dts.uhd;profile=p2";
                        } else if (a6 == 1935764850) {
                            str5 = "audio/3gpp";
                        } else if (a6 == 1935767394) {
                            str5 = "audio/amr-wb";
                        } else {
                            if (a6 == 1819304813 || a6 == 1936684916) {
                                str6 = "audio/raw";
                                i22 = 2;
                            } else if (a6 == 1953984371) {
                                str6 = "audio/raw";
                                i22 = 268435456;
                            } else {
                                if (a6 == 778924082 || a6 == 778924083) {
                                    str5 = "audio/mpeg";
                                } else if (a6 == 1835557169) {
                                    str5 = "audio/mha1";
                                } else if (a6 == 1835560241) {
                                    str5 = "audio/mhm1";
                                } else {
                                    if (a6 == 1634492771) {
                                        str7 = "audio/alac";
                                    } else if (a6 == 1634492791) {
                                        str7 = "audio/g711-alaw";
                                    } else if (a6 == 1970037111) {
                                        str7 = "audio/g711-mlaw";
                                    } else if (a6 == 1332770163) {
                                        str7 = "audio/opus";
                                    } else if (a6 == 1716281667) {
                                        str7 = "audio/flac";
                                    } else if (a6 == 1835823201) {
                                        str5 = "audio/true-hd";
                                    } else {
                                        i22 = -1;
                                        str6 = null;
                                    }
                                    str5 = str7;
                                }
                                str6 = str5;
                                i22 = -1;
                            }
                            i4 = i31;
                            i23 = i57;
                            str9 = str6;
                            i24 = i20;
                            i25 = i21;
                            String str232 = null;
                            List list62 = null;
                            ajVar = null;
                            while (i23 - i32 < a5) {
                            }
                            str10 = str232;
                            list3 = list62;
                            int i702 = i32;
                            int i712 = a5;
                            i26 = i22;
                            if (cjVar3.b == null) {
                                iw0 iw0Var62 = new iw0();
                                iw0Var62.a = Integer.toString(i);
                                iw0Var62.k = str9;
                                iw0Var62.h = str10;
                                iw0Var62.x = i25;
                                iw0Var62.y = i24;
                                iw0Var62.z = i26;
                                iw0Var62.m = list3;
                                iw0Var62.n = vk0Var3;
                                iw0Var62.c = str15;
                                if (ajVar != null) {
                                }
                                cjVar3.b = new jw0(iw0Var62);
                            }
                            cjVar = cjVar3;
                            i8 = i712;
                            i9 = i702;
                        }
                        str6 = str5;
                        i22 = -1;
                        i4 = i31;
                        i23 = i57;
                        str9 = str6;
                        i24 = i20;
                        i25 = i21;
                        String str2322 = null;
                        List list622 = null;
                        ajVar = null;
                        while (i23 - i32 < a5) {
                        }
                        str10 = str2322;
                        list3 = list622;
                        int i7022 = i32;
                        int i7122 = a5;
                        i26 = i22;
                        if (cjVar3.b == null) {
                        }
                        cjVar = cjVar3;
                        i8 = i7122;
                        i9 = i7022;
                    }
                    str5 = "audio/vnd.dts.hd";
                    str6 = str5;
                    i22 = -1;
                    i4 = i31;
                    i23 = i57;
                    str9 = str6;
                    i24 = i20;
                    i25 = i21;
                    String str23222 = null;
                    List list6222 = null;
                    ajVar = null;
                    while (i23 - i32 < a5) {
                    }
                    str10 = str23222;
                    list3 = list6222;
                    int i70222 = i32;
                    int i71222 = a5;
                    i26 = i22;
                    if (cjVar3.b == null) {
                    }
                    cjVar = cjVar3;
                    i8 = i71222;
                    i9 = i70222;
                }
                str5 = str8;
                str6 = str5;
                i22 = -1;
                i4 = i31;
                i23 = i57;
                str9 = str6;
                i24 = i20;
                i25 = i21;
                String str232222 = null;
                List list62222 = null;
                ajVar = null;
                while (i23 - i32 < a5) {
                }
                str10 = str232222;
                list3 = list62222;
                int i702222 = i32;
                int i712222 = a5;
                i26 = i22;
                if (cjVar3.b == null) {
                }
                cjVar = cjVar3;
                i8 = i712222;
                i9 = i702222;
            } else {
                if (a6 == 1414810956 || a6 == 1954034535 || a6 == 2004251764 || a6 == 1937010800 || a6 == 1664495672) {
                    xb2Var.e(i32 + 16);
                    long j = Long.MAX_VALUE;
                    if (a6 == 1414810956) {
                        str14 = "application/ttml+xml";
                    } else if (a6 == 1954034535) {
                        int i72 = a5 - 16;
                        byte[] bArr11 = new byte[i72];
                        xb2Var.a(bArr11, 0, i72);
                        a3 = l41.a(bArr11);
                        str14 = "application/x-quicktime-tx3g";
                        iw0 iw0Var7 = new iw0();
                        iw0Var7.a = Integer.toString(i);
                        iw0Var7.k = str14;
                        iw0Var7.c = str15;
                        iw0Var7.o = j;
                        iw0Var7.m = a3;
                        cjVar3.b = new jw0(iw0Var7);
                    } else if (a6 == 2004251764) {
                        str14 = "application/x-mp4-vtt";
                    } else if (a6 == 1937010800) {
                        str14 = "application/ttml+xml";
                        j = 0;
                    } else if (a6 == 1664495672) {
                        cjVar3.d = 1;
                        str14 = "application/x-mp4-cea-608";
                    } else {
                        throw new IllegalStateException();
                    }
                    a3 = null;
                    iw0 iw0Var72 = new iw0();
                    iw0Var72.a = Integer.toString(i);
                    iw0Var72.k = str14;
                    iw0Var72.c = str15;
                    iw0Var72.o = j;
                    iw0Var72.m = a3;
                    cjVar3.b = new jw0(iw0Var72);
                } else if (a6 == 1835365492) {
                    xb2Var.e(i32 + 16);
                    if (a6 == 1835365492) {
                        xb2Var.h();
                        String h = xb2Var.h();
                        if (h != null) {
                            iw0 iw0Var8 = new iw0();
                            iw0Var8.a = Integer.toString(i);
                            iw0Var8.k = h;
                            cjVar3.b = new jw0(iw0Var8);
                        }
                    }
                } else if (a6 == 1667329389) {
                    iw0 iw0Var9 = new iw0();
                    iw0Var9.a = Integer.toString(i);
                    iw0Var9.k = "application/x-camera-motion";
                    cjVar3.b = new jw0(iw0Var9);
                }
                i3 = a4;
                cjVar = cjVar3;
                i4 = i31;
                i9 = i32;
                i8 = a5;
            }
            xb2Var.e(i9 + i8);
            i31 = i4 + 1;
            vk0Var4 = vk0Var;
            cjVar3 = cjVar;
            a4 = i3;
            str15 = str;
        }
        return cjVar3;
    }

    public static aj a(int i, xb2 xb2Var) {
        xb2Var.e(i + 12);
        xb2Var.e(xb2Var.b + 1);
        a(xb2Var);
        xb2Var.e(xb2Var.b + 2);
        int k = xb2Var.k();
        if ((k & 128) != 0) {
            xb2Var.e(xb2Var.b + 2);
        }
        if ((k & 64) != 0) {
            xb2Var.e(xb2Var.b + xb2Var.k());
        }
        if ((k & 32) != 0) {
            xb2Var.e(xb2Var.b + 2);
        }
        xb2Var.e(xb2Var.b + 1);
        a(xb2Var);
        String a2 = vt1.a(xb2Var.k());
        if (!"audio/mpeg".equals(a2) && !"audio/vnd.dts".equals(a2) && !"audio/vnd.dts.hd".equals(a2)) {
            xb2Var.e(xb2Var.b + 4);
            long l = xb2Var.l();
            long l2 = xb2Var.l();
            xb2Var.e(xb2Var.b + 1);
            int a3 = a(xb2Var);
            byte[] bArr = new byte[a3];
            xb2Var.a(bArr, 0, a3);
            if (l2 <= 0) {
                l2 = -1;
            }
            return new aj(a2, bArr, l2, l > 0 ? l : -1L);
        }
        return new aj(a2, null, -1L, -1L);
    }

    public static int a(xb2 xb2Var) {
        int k = xb2Var.k();
        int i = k & 127;
        while ((k & 128) == 128) {
            k = xb2Var.k();
            i = (i << 7) | (k & 127);
        }
        return i;
    }
}
