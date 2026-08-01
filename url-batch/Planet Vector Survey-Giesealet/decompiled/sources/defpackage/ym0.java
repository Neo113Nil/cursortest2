package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ym0 implements xm0 {
    public final mu d;
    public final a70 e;
    public a70 f;

    public ym0(Map map, mu muVar) {
        a70 a70Var;
        this.d = muVar;
        if (map == null || map.isEmpty()) {
            a70Var = null;
        } else {
            a70Var = new a70(map.size());
            for (Map.Entry entry : map.entrySet()) {
                a70Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.e = a70Var;
    }

    @Override // defpackage.xm0
    public final t7 a(String str, bu buVar) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                a70 a70Var = this.f;
                if (a70Var == null) {
                    long[] jArr = vn0.a;
                    a70Var = new a70();
                    this.f = a70Var;
                }
                Object g = a70Var.g(str);
                if (g == null) {
                    g = new ArrayList();
                    a70Var.m(str, g);
                }
                ((List) g).add(buVar);
                return new t7(a70Var, str, buVar, 7);
            }
        }
        g8.r("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.xm0
    public final boolean b(Object obj) {
        return ((Boolean) this.d.c(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    @Override // defpackage.xm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map c() {
        char c;
        long j;
        long j2;
        long j3;
        a70 a70Var;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        char c2;
        long j4;
        a70 a70Var2 = this.e;
        if (a70Var2 == null && this.f == null) {
            return xp.d;
        }
        int i3 = 0;
        int i4 = a70Var2 != null ? a70Var2.e : 0;
        a70 a70Var3 = this.f;
        HashMap hashMap = new HashMap(i4 + (a70Var3 != null ? a70Var3.e : 0));
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (a70Var2 != null) {
            Object[] objArr = a70Var2.b;
            Object[] objArr2 = a70Var2.c;
            long[] jArr3 = a70Var2.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j6 = jArr3[i6];
                    j3 = 255;
                    if ((((~j6) << c3) & j6 & j5) != j5) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j6 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                c2 = c3;
                                j4 = j5;
                                hashMap.put((String) objArr[i9], (List) objArr2[i9]);
                            } else {
                                c2 = c3;
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i8++;
                            c3 = c2;
                            j5 = j4;
                        }
                        c = c3;
                        j = j5;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                        j = j5;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j5 = j;
                }
                a70Var = this.f;
                if (a70Var != null) {
                    Object[] objArr3 = a70Var.b;
                    Object[] objArr4 = a70Var.c;
                    long[] jArr4 = a70Var.a;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j7 = jArr4[i10];
                            if ((((~j7) << c) & j7 & j) != j) {
                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                int i12 = i3;
                                while (i12 < i11) {
                                    if ((j7 & j3) < j2) {
                                        int i13 = (i10 << 3) + i12;
                                        Object obj = objArr3[i13];
                                        List list = (List) objArr4[i13];
                                        String str = (String) obj;
                                        i2 = i5;
                                        if (list.size() == 1) {
                                            Object a = ((bu) list.get(i3)).a();
                                            if (a != null) {
                                                if (!b(a)) {
                                                    throw new IllegalStateException(ze0.i(a).toString());
                                                }
                                                Object[] objArr5 = new Object[1];
                                                objArr5[i3] = a;
                                                hashMap.put(str, px0.h(objArr5));
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            while (i3 < size) {
                                                long[] jArr5 = jArr4;
                                                Object a2 = ((bu) list.get(i3)).a();
                                                if (a2 != null && !b(a2)) {
                                                    throw new IllegalStateException(ze0.i(a2).toString());
                                                }
                                                arrayList.add(a2);
                                                i3++;
                                                jArr4 = jArr5;
                                            }
                                            jArr2 = jArr4;
                                            hashMap.put(str, arrayList);
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        i2 = i5;
                                    }
                                    j7 >>= i2;
                                    i12++;
                                    i5 = i2;
                                    jArr4 = jArr2;
                                    i3 = 0;
                                }
                                jArr = jArr4;
                                i = i5;
                                if (i11 != i) {
                                    break;
                                }
                            } else {
                                jArr = jArr4;
                                i = i5;
                            }
                            if (i10 == length2) {
                                break;
                            }
                            i10++;
                            i5 = i;
                            jArr4 = jArr;
                            i3 = 0;
                        }
                    }
                }
                return hashMap;
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 128;
        j3 = 255;
        a70Var = this.f;
        if (a70Var != null) {
        }
        return hashMap;
    }

    @Override // defpackage.xm0
    public final Object d(String str) {
        a70 a70Var = this.e;
        List list = a70Var != null ? (List) a70Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && a70Var != null) {
            List subList = list.subList(1, list.size());
            int f = a70Var.f(str);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = a70Var.c;
            Object obj = objArr[f];
            a70Var.b[f] = str;
            objArr[f] = subList;
        }
        return list.get(0);
    }
}
