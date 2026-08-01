package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class sr0 implements Iterable, j00 {
    public static final sr0 h = new sr0(0, 0, 0, null);
    public final long d;
    public final long e;
    public final long f;
    public final long[] g;

    public sr0(long j, long j2, long j3, long[] jArr) {
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = jArr;
    }

    public final sr0 a(sr0 sr0Var) {
        long[] jArr;
        sr0 sr0Var2 = this;
        sr0 sr0Var3 = h;
        if (sr0Var == sr0Var3) {
            return sr0Var2;
        }
        if (sr0Var2 == sr0Var3) {
            return sr0Var3;
        }
        long j = sr0Var.f;
        long j2 = sr0Var.f;
        long[] jArr2 = sr0Var.g;
        long j3 = sr0Var.e;
        long j4 = sr0Var.d;
        long j5 = sr0Var2.f;
        if (j == j5 && jArr2 == (jArr = sr0Var2.g)) {
            return new sr0(sr0Var2.d & (~j4), sr0Var2.e & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                sr0Var2 = sr0Var2.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    sr0Var2 = sr0Var2.b(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    sr0Var2 = sr0Var2.b(i2 + j2 + 64);
                }
            }
        }
        return sr0Var2;
    }

    public final sr0 b(long j) {
        long[] jArr;
        int f;
        long[] jArr2;
        long j2 = j - this.f;
        if (nz.t(j2, 0L) >= 0 && nz.t(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.e;
            if ((j4 & j3) != 0) {
                return new sr0(this.d, j4 & (~j3), this.f, this.g);
            }
        } else if (nz.t(j2, 64L) >= 0 && nz.t(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.d;
            if ((j6 & j5) != 0) {
                return new sr0(j6 & (~j5), this.e, this.f, this.g);
            }
        } else if (nz.t(j2, 0L) < 0 && (jArr = this.g) != null && (f = od0.f(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (f > 0) {
                    p8.S(jArr, jArr3, 0, 0, f);
                }
                if (f < i) {
                    p8.S(jArr, jArr3, f, f + 1, length);
                }
                jArr2 = jArr3;
            }
            return new sr0(this.d, this.e, this.f, jArr2);
        }
        return this;
    }

    public final boolean c(long j) {
        long[] jArr;
        long j2 = j - this.f;
        return (nz.t(j2, 0L) < 0 || nz.t(j2, 64L) >= 0) ? (nz.t(j2, 64L) < 0 || nz.t(j2, 128L) >= 0) ? nz.t(j2, 0L) <= 0 && (jArr = this.g) != null && od0.f(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.d) != 0 : ((1 << ((int) j2)) & this.e) != 0;
    }

    public final sr0 d(sr0 sr0Var) {
        sr0 sr0Var2;
        long[] jArr;
        sr0 sr0Var3 = this;
        sr0 sr0Var4 = h;
        if (sr0Var == sr0Var4) {
            return sr0Var3;
        }
        if (sr0Var3 == sr0Var4) {
            return sr0Var;
        }
        long j = sr0Var.f;
        long j2 = sr0Var.f;
        long[] jArr2 = sr0Var.g;
        long j3 = sr0Var.e;
        long j4 = sr0Var.d;
        long j5 = sr0Var3.f;
        long j6 = sr0Var3.e;
        long j7 = sr0Var3.d;
        if (j == j5 && jArr2 == (jArr = sr0Var3.g)) {
            return new sr0(j7 | j4, j6 | j3, j5, jArr);
        }
        long[] jArr3 = sr0Var3.g;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    sr0Var3 = sr0Var3.e(j8);
                }
            }
            if (j3 != 0) {
                for (int i = 0; i < 64; i++) {
                    if (((1 << i) & j3) != 0) {
                        sr0Var3 = sr0Var3.e(i + j2);
                    }
                }
            }
            if (j4 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j4) != 0) {
                        sr0Var3 = sr0Var3.e(i2 + j2 + 64);
                    }
                }
            }
            return sr0Var3;
        }
        if (jArr3 != null) {
            sr0Var2 = sr0Var;
            for (long j9 : jArr3) {
                sr0Var2 = sr0Var2.e(j9);
            }
        } else {
            sr0Var2 = sr0Var;
        }
        long j10 = sr0Var3.f;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    sr0Var2 = sr0Var2.e(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if (((1 << i4) & j7) != 0) {
                    sr0Var2 = sr0Var2.e(i4 + j10 + 64);
                }
            }
        }
        return sr0Var2;
    }

    public final sr0 e(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        long j5 = this.f;
        long j6 = j - j5;
        long j7 = 0;
        int t = nz.t(j6, 0L);
        long j8 = this.e;
        if (t < 0 || nz.t(j6, 64L) >= 0) {
            int t2 = nz.t(j6, 64L);
            long j9 = this.d;
            int i2 = 64;
            if (t2 < 0 || nz.t(j6, 128L) >= 0) {
                int t3 = nz.t(j6, 128L);
                long[] jArr3 = this.g;
                if (t3 < 0) {
                    if (jArr3 == null) {
                        return new sr0(this.d, this.e, this.f, new long[]{j});
                    }
                    int f = od0.f(jArr3, j);
                    if (f < 0) {
                        int i3 = -(f + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        p8.S(jArr3, jArr4, 0, 0, i3);
                        p8.S(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new sr0(this.d, this.e, this.f, jArr4);
                    }
                } else if (!c(j)) {
                    long j10 = ((j + 1) / 64) * 64;
                    if (nz.t(j10, 0L) < 0) {
                        j10 = 9223372036854775680L;
                    }
                    long j11 = j9;
                    p01 p01Var = null;
                    while (true) {
                        if (nz.t(j5, j10) >= 0) {
                            j2 = j5;
                            j3 = j8;
                            break;
                        }
                        if (j8 != j7) {
                            if (p01Var == null) {
                                p01Var = new p01(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j8 & (1 << i4)) != j7) {
                                    j4 = j7;
                                    ((s60) p01Var.e).a(i4 + j5);
                                } else {
                                    j4 = j7;
                                }
                                i4++;
                                j7 = j4;
                            }
                        } else {
                            i = i2;
                        }
                        long j12 = j7;
                        if (j11 == j12) {
                            j2 = j10;
                            j3 = j12;
                            break;
                        }
                        j5 += 64;
                        j7 = j12;
                        j8 = j11;
                        i2 = i;
                        j11 = j7;
                    }
                    if (p01Var != null) {
                        s60 s60Var = (s60) p01Var.e;
                        int i5 = s60Var.b;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = s60Var.a;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                            return new sr0(j11, j3, j2, jArr).e(j);
                        }
                    }
                    jArr = jArr3;
                    return new sr0(j11, j3, j2, jArr).e(j);
                }
            } else {
                long j13 = 1 << (((int) j6) - 64);
                if ((j9 & j13) == 0) {
                    return new sr0(j9 | j13, this.e, this.f, this.g);
                }
            }
        } else {
            long j14 = 1 << ((int) j6);
            if ((j8 & j14) == 0) {
                return new sr0(this.d, j8 | j14, this.f, this.g);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return od0.p(new rr0(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(ae.Y(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
