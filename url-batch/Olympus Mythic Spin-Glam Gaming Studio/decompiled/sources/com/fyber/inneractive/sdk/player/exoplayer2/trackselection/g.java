package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class g extends i {
    public final SparseArray a = new SparseArray();
    public final SparseBooleanArray b = new SparseBooleanArray();

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ba, code lost:
    
        if (r13 == (-1)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cd, code lost:
    
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01cb, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c9, code lost:
    
        if (r15 == (-1)) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ab  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j a(com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr, z zVar) {
        int i;
        boolean z;
        int[][] iArr;
        int[][] iArr2;
        int i2;
        y yVar;
        c cVar;
        int[] iArr3;
        y yVar2;
        ArrayList arrayList;
        boolean z2;
        int i3;
        boolean a;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr4;
        int[] iArr5 = new int[aVarArr.length + 1];
        int length = aVarArr.length + 1;
        y[][] yVarArr = new y[length][];
        int[][][] iArr6 = new int[aVarArr.length + 1][][];
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = zVar.a;
            yVarArr[i9] = new y[i10];
            iArr6[i9] = new int[i10][];
        }
        int length2 = aVarArr.length;
        int[] iArr7 = new int[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            aVarArr[i11].getClass();
            iArr7[i11] = 4;
        }
        for (int i12 = 0; i12 < zVar.a; i12++) {
            y yVar3 = zVar.b[i12];
            int length3 = aVarArr.length;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i13 >= aVarArr.length) {
                    break;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.a aVar = aVarArr[i13];
                for (int i15 = 0; i15 < yVar3.a; i15++) {
                    o oVar = yVar3.b[i15];
                    com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c) aVar;
                    cVar2.getClass();
                    try {
                        int b = cVar2.b(cVar2.h, oVar) & 3;
                        if (b > i14) {
                            if (b == 3) {
                                length3 = i13;
                                break;
                            }
                            i14 = b;
                            length3 = i13;
                        }
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.f e) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e);
                    }
                }
                i13++;
            }
            if (length3 == aVarArr.length) {
                iArr4 = new int[yVar3.a];
            } else {
                com.fyber.inneractive.sdk.player.exoplayer2.a aVar2 = aVarArr[length3];
                int[] iArr8 = new int[yVar3.a];
                for (int i16 = 0; i16 < yVar3.a; i16++) {
                    o oVar2 = yVar3.b[i16];
                    com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c) aVar2;
                    cVar3.getClass();
                    try {
                        iArr8[i16] = cVar3.b(cVar3.h, oVar2);
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.f e2) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e2);
                    }
                }
                iArr4 = iArr8;
            }
            int i17 = iArr5[length3];
            yVarArr[length3][i17] = yVar3;
            iArr6[length3][i17] = iArr4;
            iArr5[length3] = i17 + 1;
        }
        z[] zVarArr = new z[aVarArr.length];
        int[] iArr9 = new int[aVarArr.length];
        for (int i18 = 0; i18 < aVarArr.length; i18++) {
            int i19 = iArr5[i18];
            zVarArr[i18] = new z((y[]) Arrays.copyOf(yVarArr[i18], i19));
            iArr6[i18] = (int[][]) Arrays.copyOf(iArr6[i18], i19);
            iArr9[i18] = aVarArr[i18].a;
        }
        new z((y[]) Arrays.copyOf(yVarArr[aVarArr.length], iArr5[aVarArr.length]));
        int length4 = aVarArr.length;
        b[] bVarArr = new b[length4];
        c cVar4 = (c) ((d) this).c.get();
        int i20 = 0;
        boolean z4 = false;
        while (i20 < length4) {
            if (2 == aVarArr[i20].a) {
                if (z4) {
                    cVar = cVar4;
                } else {
                    z zVar2 = zVarArr[i20];
                    int[][] iArr10 = iArr6[i20];
                    cVar4.getClass();
                    y yVar4 = null;
                    int i21 = 0;
                    int i22 = 0;
                    int i23 = 0;
                    int i24 = -1;
                    int i25 = -1;
                    while (i21 < zVar2.a) {
                        y yVar5 = zVar2.b[i21];
                        z zVar3 = zVar2;
                        ArrayList arrayList2 = new ArrayList(yVar5.a);
                        for (int i26 = 0; i26 < yVar5.a; i26++) {
                            arrayList2.add(Integer.valueOf(i26));
                        }
                        int[] iArr11 = iArr10[i21];
                        int i27 = 0;
                        int i28 = i23;
                        y yVar6 = yVar4;
                        int i29 = i28;
                        int i30 = i24;
                        int[][] iArr12 = iArr10;
                        int i31 = i30;
                        int i32 = i25;
                        int i33 = i22;
                        int i34 = i32;
                        while (i27 < yVar5.a) {
                            c cVar5 = cVar4;
                            if (d.a(iArr11[i27], true)) {
                                o oVar3 = yVar5.b[i27];
                                if (arrayList2.contains(Integer.valueOf(i27))) {
                                    int i35 = oVar3.j;
                                    yVar2 = yVar5;
                                    arrayList = arrayList2;
                                    if ((i35 == -1 || i35 <= Integer.MAX_VALUE) && (((i7 = oVar3.k) == -1 || i7 <= Integer.MAX_VALUE) && ((i8 = oVar3.b) == -1 || i8 <= Integer.MAX_VALUE))) {
                                        z2 = true;
                                        i3 = !z2 ? 2 : 1;
                                        iArr3 = iArr11;
                                        a = d.a(iArr11[i27], false);
                                        if (a) {
                                            i3 += 1000;
                                        }
                                        z3 = i3 <= i29;
                                        if (i3 == i29) {
                                            i4 = i3;
                                        } else if (oVar3.b() != i31) {
                                            int b2 = oVar3.b();
                                            i4 = i3;
                                            i5 = -1;
                                            if (b2 != -1) {
                                                if (i31 != -1) {
                                                    i6 = b2 - i31;
                                                    z3 = a || !z2 ? i6 < 0 : i6 > 0;
                                                }
                                                i6 = 1;
                                                if (a) {
                                                }
                                            }
                                        } else {
                                            i4 = i3;
                                            i5 = -1;
                                            int i36 = oVar3.b;
                                            if (i36 != -1) {
                                                if (i34 != -1) {
                                                    i6 = i36 - i34;
                                                    if (a) {
                                                    }
                                                }
                                                i6 = 1;
                                                if (a) {
                                                }
                                            }
                                        }
                                        if (!z3) {
                                            int i37 = oVar3.b;
                                            i31 = oVar3.b();
                                            i34 = i37;
                                            i33 = i27;
                                            yVar6 = yVar2;
                                            i29 = i4;
                                        }
                                    }
                                } else {
                                    yVar2 = yVar5;
                                    arrayList = arrayList2;
                                }
                                z2 = false;
                                if (!z2) {
                                }
                                iArr3 = iArr11;
                                a = d.a(iArr11[i27], false);
                                if (a) {
                                }
                                if (i3 <= i29) {
                                }
                                if (i3 == i29) {
                                }
                                if (!z3) {
                                }
                            } else {
                                iArr3 = iArr11;
                                yVar2 = yVar5;
                                arrayList = arrayList2;
                            }
                            i27++;
                            cVar4 = cVar5;
                            yVar5 = yVar2;
                            arrayList2 = arrayList;
                            iArr11 = iArr3;
                        }
                        i21++;
                        zVar2 = zVar3;
                        y yVar7 = yVar6;
                        i23 = i29;
                        yVar4 = yVar7;
                        i24 = i31;
                        iArr10 = iArr12;
                        int i38 = i33;
                        i25 = i34;
                        i22 = i38;
                    }
                    cVar = cVar4;
                    e eVar = yVar4 == null ? null : new e(yVar4, i22);
                    bVarArr[i20] = eVar;
                    z4 = eVar != null;
                }
                int i39 = zVarArr[i20].a;
            } else {
                cVar = cVar4;
            }
            i20++;
            cVar4 = cVar;
        }
        c cVar6 = cVar4;
        boolean z5 = false;
        int i40 = 0;
        boolean z6 = false;
        while (i40 < length4) {
            int i41 = aVarArr[i40].a;
            if (i41 != 1) {
                if (i41 == 2) {
                    i = length4;
                } else if (i41 != 3) {
                    z zVar4 = zVarArr[i40];
                    int[][] iArr13 = iArr6[i40];
                    cVar6.getClass();
                    int i42 = 0;
                    int i43 = 0;
                    int i44 = 0;
                    y yVar8 = null;
                    while (i42 < zVar4.a) {
                        y yVar9 = zVar4.b[i42];
                        int[] iArr14 = iArr13[i42];
                        int i45 = length4;
                        int i46 = 0;
                        while (i46 < yVar9.a) {
                            z zVar5 = zVar4;
                            if (d.a(iArr14[i46], true)) {
                                int i47 = (yVar9.b[i46].x & 1) != 0 ? 2 : 1;
                                yVar = yVar9;
                                if (d.a(iArr14[i46], false)) {
                                    i47 += 1000;
                                }
                                if (i47 > i44) {
                                    i44 = i47;
                                    i43 = i46;
                                    yVar8 = yVar;
                                }
                            } else {
                                yVar = yVar9;
                            }
                            i46++;
                            zVar4 = zVar5;
                            yVar9 = yVar;
                        }
                        i42++;
                        length4 = i45;
                    }
                    i = length4;
                    bVarArr[i40] = yVar8 == null ? null : new e(yVar8, i43);
                } else {
                    i = length4;
                    if (!z6) {
                        z zVar6 = zVarArr[i40];
                        int[][] iArr15 = iArr6[i40];
                        cVar6.getClass();
                        int i48 = 0;
                        int i49 = 0;
                        int i50 = 0;
                        y yVar10 = null;
                        while (i48 < zVar6.a) {
                            y yVar11 = zVar6.b[i48];
                            int[] iArr16 = iArr15[i48];
                            y yVar12 = yVar10;
                            int i51 = i50;
                            int i52 = i49;
                            int i53 = 0;
                            while (i53 < yVar11.a) {
                                z zVar7 = zVar6;
                                if (d.a(iArr16[i53], true)) {
                                    int i54 = yVar11.b[i53].x;
                                    boolean z7 = (i54 & 1) != 0;
                                    boolean z8 = (i54 & 2) != 0;
                                    if (!z7) {
                                        i2 = z8 ? 1 : 3;
                                    }
                                    iArr2 = iArr15;
                                    if (d.a(iArr16[i53], false)) {
                                        i2 += 1000;
                                    }
                                    if (i2 > i51) {
                                        i51 = i2;
                                        i52 = i53;
                                        yVar12 = yVar11;
                                    }
                                    i53++;
                                    zVar6 = zVar7;
                                    iArr15 = iArr2;
                                }
                                iArr2 = iArr15;
                                i53++;
                                zVar6 = zVar7;
                                iArr15 = iArr2;
                            }
                            i48++;
                            i49 = i52;
                            i50 = i51;
                            yVar10 = yVar12;
                        }
                        e eVar2 = yVar10 == null ? null : new e(yVar10, i49);
                        bVarArr[i40] = eVar2;
                        z = eVar2 != null;
                        i40++;
                        z6 = z;
                        length4 = i;
                    }
                }
                z = z6;
                i40++;
                z6 = z;
                length4 = i;
            } else {
                i = length4;
                if (!z5) {
                    z zVar8 = zVarArr[i40];
                    int[][] iArr17 = iArr6[i40];
                    cVar6.getClass();
                    int i55 = 0;
                    int i56 = 0;
                    int i57 = -1;
                    int i58 = -1;
                    while (i55 < zVar8.a) {
                        y yVar13 = zVar8.b[i55];
                        int[] iArr18 = iArr17[i55];
                        int i59 = i58;
                        int i60 = i57;
                        int i61 = i56;
                        int i62 = 0;
                        while (i62 < yVar13.a) {
                            boolean z9 = z6;
                            if (d.a(iArr18[i62], true)) {
                                o oVar4 = yVar13.b[i62];
                                iArr = iArr17;
                                int i63 = iArr18[i62];
                                int i64 = (oVar4.x & 1) != 0 ? 2 : 1;
                                if (d.a(i63, false)) {
                                    i64 += 1000;
                                }
                                if (i64 > i61) {
                                    i61 = i64;
                                    i59 = i55;
                                    i60 = i62;
                                }
                            } else {
                                iArr = iArr17;
                            }
                            i62++;
                            iArr17 = iArr;
                            z6 = z9;
                        }
                        i55++;
                        i56 = i61;
                        i57 = i60;
                        i58 = i59;
                    }
                    z = z6;
                    e eVar3 = i58 == -1 ? null : new e(zVar8.b[i58], i57);
                    bVarArr[i40] = eVar3;
                    z5 = eVar3 != null;
                    i40++;
                    z6 = z;
                    length4 = i;
                }
                z = z6;
                i40++;
                z6 = z;
                length4 = i;
            }
        }
        for (int i65 = 0; i65 < aVarArr.length; i65++) {
            if (this.b.get(i65)) {
                bVarArr[i65] = null;
            } else {
                z zVar9 = zVarArr[i65];
                Map map = (Map) this.a.get(i65);
                if (map != null && map.containsKey(zVar9)) {
                    if (((Map) this.a.get(i65)).get(zVar9) != null) {
                        throw new ClassCastException();
                    }
                    bVarArr[i65] = null;
                }
            }
        }
        f fVar = new f(zVarArr);
        t[] tVarArr = new t[aVarArr.length];
        for (int i66 = 0; i66 < aVarArr.length; i66++) {
            tVarArr[i66] = bVarArr[i66] != null ? t.b : null;
        }
        return new j(zVar, new h(bVarArr), fVar, tVarArr);
    }
}
