package yads;

import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public abstract class fi1 extends h83 {
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e7, code lost:
    
        if (yads.xx.a(yads.bq.a(r9.c, r5.c)).a(r9.b, r5.b).a() > 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x053c, code lost:
    
        if (r5 != 2) goto L281;
     */
    @Override // yads.h83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i83 a(fo[] foVarArr, y73 y73Var, pm1 pm1Var, g73 g73Var) {
        hf0 hf0Var;
        String str;
        int i;
        boolean z;
        um2 um2Var;
        int i2;
        boolean z2;
        int i3;
        xo0 abVar;
        int[][][] iArr;
        ei1 ei1Var;
        dl dlVar;
        int i4;
        int i5;
        int i6;
        int i7;
        wo0 wo0Var;
        int i8;
        int[][] iArr2;
        kf0 kf0Var;
        int i9;
        int[] iArr3;
        y73 y73Var2 = y73Var;
        int i10 = 1;
        int[] iArr4 = new int[foVarArr.length + 1];
        int length = foVarArr.length + 1;
        x73[][] x73VarArr = new x73[length][];
        int[][][] iArr5 = new int[foVarArr.length + 1][][];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = y73Var2.b;
            x73VarArr[i11] = new x73[i12];
            iArr5[i11] = new int[i12][];
        }
        int length2 = foVarArr.length;
        int[] iArr6 = new int[length2];
        for (int i13 = 0; i13 < length2; i13++) {
            iArr6[i13] = foVarArr[i13].k();
        }
        int i14 = 0;
        while (i14 < y73Var2.b) {
            x73 a = y73Var2.a(i14);
            int i15 = a.d == 5 ? i10 : 0;
            int length3 = foVarArr.length;
            int i16 = i10;
            int i17 = 0;
            for (int i18 = 0; i18 < foVarArr.length; i18++) {
                fo foVar = foVarArr[i18];
                int i19 = 0;
                for (int i20 = 0; i20 < a.b; i20++) {
                    i19 = Math.max(i19, foVar.a(a.e[i20]) & 7);
                }
                int i21 = iArr4[i18] == 0 ? 1 : 0;
                if (i19 > i17 || (i19 == i17 && i15 != 0 && i16 == 0 && i21 != 0)) {
                    i16 = i21;
                    i17 = i19;
                    length3 = i18;
                }
            }
            if (length3 == foVarArr.length) {
                iArr3 = new int[a.b];
                i9 = 1;
            } else {
                fo foVar2 = foVarArr[length3];
                int[] iArr7 = new int[a.b];
                for (int i22 = 0; i22 < a.b; i22++) {
                    iArr7[i22] = foVar2.a(a.e[i22]);
                }
                i9 = 1;
                iArr3 = iArr7;
            }
            int i23 = iArr4[length3];
            x73VarArr[length3][i23] = a;
            iArr5[length3][i23] = iArr3;
            iArr4[length3] = i23 + i9;
            i14 += i9;
            y73Var2 = y73Var;
            i10 = i9;
        }
        y73[] y73VarArr = new y73[foVarArr.length];
        String[] strArr = new String[foVarArr.length];
        int[] iArr8 = new int[foVarArr.length];
        for (int i24 = 0; i24 < foVarArr.length; i24++) {
            int i25 = iArr4[i24];
            y73VarArr[i24] = new y73((x73[]) sb3.a(i25, x73VarArr[i24]));
            iArr5[i24] = (int[][]) sb3.a(i25, iArr5[i24]);
            strArr[i24] = foVarArr[i24].c();
            iArr8[i24] = foVarArr[i24].b;
        }
        ei1 ei1Var2 = new ei1(iArr8, y73VarArr, iArr6, iArr5, new y73((x73[]) sb3.a(iArr4[foVarArr.length], x73VarArr[foVarArr.length])));
        pf0 pf0Var = (pf0) this;
        synchronized (pf0Var.c) {
            try {
                hf0Var = pf0Var.f;
                if (hf0Var.L && sb3.a >= 32 && (kf0Var = pf0Var.g) != null) {
                    Looper myLooper = Looper.myLooper();
                    if (myLooper == null) {
                        throw new IllegalStateException();
                    }
                    kf0Var.a(pf0Var, myLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i26 = ei1Var2.a;
        wo0[] wo0VarArr = new wo0[i26];
        Pair a2 = pf0.a(ei1Var2, iArr5, iArr6, hf0Var);
        if (a2 != null) {
            wo0VarArr[((Integer) a2.second).intValue()] = (wo0) a2.first;
        }
        Pair a3 = pf0Var.a(ei1Var2, iArr5, hf0Var);
        if (a3 != null) {
            wo0VarArr[((Integer) a3.second).intValue()] = (wo0) a3.first;
        }
        if (a3 == null) {
            str = null;
        } else {
            wo0 wo0Var2 = (wo0) a3.first;
            str = wo0Var2.a.e[wo0Var2.b[0]].d;
        }
        Pair a4 = pf0.a(ei1Var2, iArr5, hf0Var, str);
        if (a4 != null) {
            wo0VarArr[((Integer) a4.second).intValue()] = (wo0) a4.first;
        }
        int i27 = 0;
        while (i27 < i26) {
            int i28 = ei1Var2.b[i27];
            if (i28 != 2) {
                if (i28 == 1) {
                    i8 = 1;
                    i27 += i8;
                } else if (i28 != 3) {
                    y73 y73Var3 = ei1Var2.c[i27];
                    int[][] iArr9 = iArr5[i27];
                    int i29 = 0;
                    int i30 = 0;
                    x73 x73Var = null;
                    ff0 ff0Var = null;
                    while (i29 < y73Var3.b) {
                        x73 a5 = y73Var3.a(i29);
                        int[] iArr10 = iArr9[i29];
                        ff0 ff0Var2 = ff0Var;
                        x73 x73Var2 = x73Var;
                        int i31 = i30;
                        int i32 = 0;
                        while (i32 < a5.b) {
                            y73 y73Var4 = y73Var3;
                            if (pf0.a(hf0Var.M, iArr10[i32])) {
                                iArr2 = iArr9;
                                ff0 ff0Var3 = new ff0(a5.e[i32], iArr10[i32]);
                                ff0 ff0Var4 = ff0Var2 != null ? ff0Var3 : ff0Var3;
                                i31 = i32;
                                x73Var2 = a5;
                                ff0Var2 = ff0Var4;
                            } else {
                                iArr2 = iArr9;
                            }
                            i32++;
                            y73Var3 = y73Var4;
                            iArr9 = iArr2;
                        }
                        i29++;
                        i30 = i31;
                        x73Var = x73Var2;
                        ff0Var = ff0Var2;
                    }
                    wo0VarArr[i27] = x73Var == null ? null : new wo0(0, x73Var, new int[]{i30});
                }
            }
            i8 = 1;
            i27 += i8;
        }
        int i33 = ei1Var2.a;
        HashMap hashMap = new HashMap();
        for (int i34 = 0; i34 < i33; i34++) {
            pf0.a(ei1Var2.c[i34], hf0Var, hashMap);
        }
        pf0.a(ei1Var2.f, hf0Var, hashMap);
        for (int i35 = 0; i35 < i33; i35++) {
            e83 e83Var = (e83) hashMap.get(Integer.valueOf(ei1Var2.b[i35]));
            if (e83Var != null) {
                if (!e83Var.c.isEmpty()) {
                    int indexOf = ei1Var2.c[i35].c.indexOf(e83Var.b);
                    if (indexOf < 0) {
                        indexOf = -1;
                    }
                    if (indexOf != -1) {
                        wo0Var = new wo0(0, e83Var.b, nc1.a(e83Var.c));
                        wo0VarArr[i35] = wo0Var;
                    }
                }
                wo0Var = null;
                wo0VarArr[i35] = wo0Var;
            }
        }
        int i36 = ei1Var2.a;
        for (int i37 = 0; i37 < i36; i37++) {
            y73 y73Var5 = ei1Var2.c[i37];
            Map map = (Map) hf0Var.P.get(i37);
            if (map != null && map.containsKey(y73Var5)) {
                Map map2 = (Map) hf0Var.P.get(i37);
                if0 if0Var = map2 != null ? (if0) map2.get(y73Var5) : null;
                wo0VarArr[i37] = (if0Var == null || if0Var.c.length == 0) ? null : new wo0(if0Var.d, y73Var5.a(if0Var.b), if0Var.c);
            }
        }
        for (int i38 = 0; i38 < i26; i38++) {
            int i39 = ei1Var2.b[i38];
            if (hf0Var.Q.get(i38) || hf0Var.A.contains(Integer.valueOf(i39))) {
                wo0VarArr[i38] = null;
            }
        }
        za zaVar = pf0Var.d;
        dl dlVar2 = pf0Var.b;
        if (dlVar2 == null) {
            throw new IllegalStateException();
        }
        zaVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i40 = 0; i40 < i26; i40 += i7) {
            wo0 wo0Var3 = wo0VarArr[i40];
            if (wo0Var3 != null) {
                i7 = 1;
                if (wo0Var3.b.length > 1) {
                    h41 f = l41.f();
                    f.a(new ya(0L, 0L));
                    arrayList.add(f);
                }
            } else {
                i7 = 1;
            }
            arrayList.add(null);
        }
        long[][] jArr = new long[i26][];
        int i41 = 0;
        while (i41 < i26) {
            wo0 wo0Var4 = wo0VarArr[i41];
            if (wo0Var4 == null) {
                jArr[i41] = new long[0];
                i6 = 1;
            } else {
                jArr[i41] = new long[wo0Var4.b.length];
                int i42 = 0;
                while (true) {
                    if (i42 >= wo0Var4.b.length) {
                        break;
                    }
                    jArr[i41][i42] = wo0Var4.a.e[r8[i42]].i;
                    i42++;
                }
                i6 = 1;
                Arrays.sort(jArr[i41]);
            }
            i41 += i6;
        }
        int[] iArr11 = new int[i26];
        long[] jArr2 = new long[i26];
        for (int i43 = 0; i43 < i26; i43++) {
            long[] jArr3 = jArr[i43];
            jArr2[i43] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        ab.a(arrayList, jArr2);
        p82 p82Var = p82.b;
        p82Var.getClass();
        gy1 a6 = new cy1(p82Var).a().a();
        int i44 = 0;
        while (i44 < i26) {
            long[] jArr4 = jArr[i44];
            if (jArr4.length <= 1) {
                dlVar = dlVar2;
                iArr = iArr5;
                i4 = 1;
                ei1Var = ei1Var2;
            } else {
                int length4 = jArr4.length;
                double[] dArr = new double[length4];
                int i45 = 0;
                while (true) {
                    long[] jArr5 = jArr[i44];
                    iArr = iArr5;
                    double d = 0.0d;
                    if (i45 >= jArr5.length) {
                        break;
                    }
                    ei1 ei1Var3 = ei1Var2;
                    dl dlVar3 = dlVar2;
                    long j = jArr5[i45];
                    if (j != -1) {
                        d = Math.log(j);
                    }
                    dArr[i45] = d;
                    i45++;
                    ei1Var2 = ei1Var3;
                    iArr5 = iArr;
                    dlVar2 = dlVar3;
                }
                ei1Var = ei1Var2;
                dlVar = dlVar2;
                int i46 = 1;
                int i47 = length4 - 1;
                double d2 = dArr[i47] - dArr[0];
                int i48 = 0;
                while (i48 < i47) {
                    double d3 = dArr[i48];
                    int i49 = i48 + i46;
                    Double valueOf = Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i49]) * 0.5d) - dArr[0]) / d2);
                    Integer valueOf2 = Integer.valueOf(i44);
                    int i50 = i47;
                    Collection collection = (Collection) a6.e.get(valueOf);
                    if (collection == null) {
                        List list = (List) a6.g.get();
                        if (!list.add(valueOf2)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        a6.f++;
                        a6.e.put(valueOf, list);
                    } else if (collection.add(valueOf2)) {
                        i5 = 1;
                        a6.f++;
                        i46 = i5;
                        i48 = i49;
                        i47 = i50;
                    }
                    i5 = 1;
                    i46 = i5;
                    i48 = i49;
                    i47 = i50;
                }
                i4 = i46;
            }
            i44 += i4;
            ei1Var2 = ei1Var;
            iArr5 = iArr;
            dlVar2 = dlVar;
        }
        dl dlVar4 = dlVar2;
        int[][][] iArr12 = iArr5;
        ei1 ei1Var4 = ei1Var2;
        a0 a0Var = a6.c;
        if (a0Var == null) {
            a0Var = new a0(a6);
            a6.c = a0Var;
        }
        l41 a7 = l41.a(a0Var);
        for (int i51 = 0; i51 < a7.size(); i51++) {
            int intValue = ((Integer) a7.get(i51)).intValue();
            int i52 = iArr11[intValue] + 1;
            iArr11[intValue] = i52;
            jArr2[intValue] = jArr[intValue][i52];
            ab.a(arrayList, jArr2);
        }
        for (int i53 = 0; i53 < i26; i53++) {
            if (arrayList.get(i53) != null) {
                jArr2[i53] = jArr2[i53] * 2;
            }
        }
        ab.a(arrayList, jArr2);
        h41 f2 = l41.f();
        for (int i54 = 0; i54 < arrayList.size(); i54++) {
            h41 h41Var = (h41) arrayList.get(i54);
            f2.a((Object) (h41Var == null ? um2.f : h41Var.a()));
        }
        um2 a8 = f2.a();
        xo0[] xo0VarArr = new xo0[i26];
        for (int i55 = 0; i55 < i26; i55++) {
            wo0 wo0Var5 = wo0VarArr[i55];
            if (wo0Var5 != null) {
                int[] iArr13 = wo0Var5.b;
                if (iArr13.length != 0) {
                    if (iArr13.length == 1) {
                        abVar = new mu0(wo0Var5.a, iArr13[0]);
                    } else {
                        long j2 = 25000;
                        abVar = new ab(wo0Var5.a, iArr13, dlVar4, 10000, j2, j2, (l41) a8.get(i55));
                    }
                    xo0VarArr[i55] = abVar;
                }
            }
        }
        on2[] on2VarArr = new on2[i26];
        for (int i56 = 0; i56 < i26; i56++) {
            on2VarArr[i56] = (hf0Var.Q.get(i56) || hf0Var.A.contains(Integer.valueOf(ei1Var4.b[i56])) || (ei1Var4.b[i56] != -2 && xo0VarArr[i56] == null)) ? null : on2.b;
        }
        int i57 = 1;
        if (hf0Var.N) {
            int i58 = -1;
            int i59 = -1;
            int i60 = 0;
            while (i60 < ei1Var4.a) {
                int i61 = ei1Var4.b[i60];
                xo0 xo0Var = xo0VarArr[i60];
                if (i61 == i57) {
                }
                if (xo0Var != null) {
                    int[][] iArr14 = iArr12[i60];
                    int indexOf2 = ei1Var4.c[i60].c.indexOf(xo0Var.c());
                    if (indexOf2 < 0) {
                        indexOf2 = -1;
                    }
                    int i62 = 0;
                    while (true) {
                        if (i62 >= xo0Var.g()) {
                            i3 = 1;
                            if (i61 == 1) {
                                i2 = -1;
                                if (i58 != -1) {
                                    z2 = false;
                                    break;
                                }
                                i58 = i60;
                            } else {
                                i2 = -1;
                                if (i59 != -1) {
                                    z2 = false;
                                    break;
                                }
                                i59 = i60;
                            }
                        } else {
                            if ((iArr14[indexOf2][xo0Var.b(i62)] & 32) != 32) {
                                i3 = 1;
                                break;
                            }
                            i62++;
                        }
                    }
                    i60 += i3;
                    i57 = i3;
                }
                i3 = 1;
                i60 += i3;
                i57 = i3;
            }
            i2 = -1;
            z2 = true;
            if (z2 & ((i58 == i2 || i59 == i2) ? false : true)) {
                on2 on2Var = new on2(true);
                on2VarArr[i58] = on2Var;
                on2VarArr[i59] = on2Var;
            }
        }
        Pair create = Pair.create(on2VarArr, xo0VarArr);
        xo0[] xo0VarArr2 = (xo0[]) create.second;
        List[] listArr = new List[xo0VarArr2.length];
        for (int i63 = 0; i63 < xo0VarArr2.length; i63++) {
            xo0 xo0Var2 = xo0VarArr2[i63];
            if (xo0Var2 != null) {
                um2Var = l41.a(xo0Var2);
            } else {
                i41 i41Var = l41.c;
                um2Var = um2.f;
            }
            listArr[i63] = um2Var;
        }
        h41 h41Var2 = new h41();
        for (int i64 = 0; i64 < ei1Var4.a; i64++) {
            y73 y73Var6 = ei1Var4.c[i64];
            List list2 = listArr[i64];
            for (int i65 = 0; i65 < y73Var6.b; i65++) {
                x73 a9 = y73Var6.a(i65);
                boolean z3 = ei1Var4.a(i64, i65) != 0;
                int i66 = a9.b;
                int[] iArr15 = new int[i66];
                boolean[] zArr = new boolean[i66];
                int i67 = 0;
                while (i67 < a9.b) {
                    iArr15[i67] = ei1Var4.e[i64][i65][i67] & 7;
                    int i68 = 0;
                    while (true) {
                        if (i68 >= list2.size()) {
                            i = 1;
                            z = false;
                            break;
                        }
                        xo0 xo0Var3 = (xo0) list2.get(i68);
                        if (xo0Var3.c().equals(a9) && xo0Var3.c(i67) != -1) {
                            z = true;
                            i = 1;
                            break;
                        }
                        i68++;
                    }
                    zArr[i67] = z;
                    i67 += i;
                }
                h41Var2.a(new d93(a9, z3, iArr15, zArr));
            }
        }
        y73 y73Var7 = ei1Var4.f;
        for (int i69 = 0; i69 < y73Var7.b; i69++) {
            x73 a10 = y73Var7.a(i69);
            int[] iArr16 = new int[a10.b];
            Arrays.fill(iArr16, 0);
            h41Var2.a(new d93(a10, false, iArr16, new boolean[a10.b]));
        }
        return new i83((on2[]) create.first, (xo0[]) create.second, new e93(h41Var2.a()), ei1Var4);
    }
}
