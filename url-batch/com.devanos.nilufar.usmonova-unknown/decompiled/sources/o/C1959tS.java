package o;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.tS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1959tS implements Iterable, InterfaceC1594nw {
    public static final C1959tS l = new C1959tS(0, 0, 0, null);
    public final long h;
    public final long i;
    public final int j;
    public final int[] k;

    public C1959tS(long j, long j2, int i, int[] iArr) {
        this.h = j;
        this.i = j2;
        this.j = i;
        this.k = iArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return PO.i(new C1893sS(this, null));
    }

    public final C1959tS j(C1959tS c1959tS) {
        C1959tS c1959tS2;
        int[] iArr;
        C1959tS c1959tS3 = l;
        if (c1959tS == c1959tS3) {
            return this;
        }
        if (this == c1959tS3) {
            return c1959tS3;
        }
        int i = c1959tS.j;
        int i2 = c1959tS.j;
        int[] iArr2 = c1959tS.k;
        long j = c1959tS.i;
        long j2 = c1959tS.h;
        int i3 = this.j;
        if (i == i3 && iArr2 == (iArr = this.k)) {
            return new C1959tS(this.h & (~j2), this.i & (~j), i3, iArr);
        }
        if (iArr2 != null) {
            c1959tS2 = this;
            for (int i4 : iArr2) {
                c1959tS2 = c1959tS2.k(i4);
            }
        } else {
            c1959tS2 = this;
        }
        if (j != 0) {
            for (int i5 = 0; i5 < 64; i5++) {
                if (((1 << i5) & j) != 0) {
                    c1959tS2 = c1959tS2.k(i5 + i2);
                }
            }
        }
        if (j2 != 0) {
            for (int i6 = 0; i6 < 64; i6++) {
                if (((1 << i6) & j2) != 0) {
                    c1959tS2 = c1959tS2.k(i6 + 64 + i2);
                }
            }
        }
        return c1959tS2;
    }

    public final C1959tS k(int i) {
        int[] iArr;
        int b;
        int i2 = this.j;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.i;
            if ((j2 & j) != 0) {
                return new C1959tS(this.h, j2 & (~j), i2, this.k);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.h;
            if ((j4 & j3) != 0) {
                return new C1959tS((~j3) & j4, this.i, i2, this.k);
            }
        } else if (i3 < 0 && (iArr = this.k) != null && (b = AbstractC1494mO.b(iArr, i)) >= 0) {
            int length = iArr.length;
            int i4 = length - 1;
            if (i4 == 0) {
                return new C1959tS(this.h, this.i, this.j, null);
            }
            int[] iArr2 = new int[i4];
            if (b > 0) {
                P6.a0(0, 0, b, iArr, iArr2);
            }
            if (b < i4) {
                P6.a0(b, b + 1, length, iArr, iArr2);
            }
            return new C1959tS(this.h, this.i, this.j, iArr2);
        }
        return this;
    }

    public final boolean l(int i) {
        int[] iArr;
        int i2 = i - this.j;
        return (i2 < 0 || i2 >= 64) ? (i2 < 64 || i2 >= 128) ? i2 <= 0 && (iArr = this.k) != null && AbstractC1494mO.b(iArr, i) >= 0 : ((1 << (i2 - 64)) & this.h) != 0 : ((1 << i2) & this.i) != 0;
    }

    public final C1959tS m(C1959tS c1959tS) {
        C1959tS c1959tS2;
        int[] iArr;
        C1959tS c1959tS3 = c1959tS;
        C1959tS c1959tS4 = l;
        if (c1959tS3 == c1959tS4) {
            return this;
        }
        if (this == c1959tS4) {
            return c1959tS3;
        }
        int i = c1959tS3.j;
        int i2 = c1959tS3.j;
        int[] iArr2 = c1959tS3.k;
        long j = c1959tS3.i;
        long j2 = c1959tS3.h;
        long j3 = this.i;
        long j4 = this.h;
        int i3 = this.j;
        if (i == i3 && iArr2 == (iArr = this.k)) {
            return new C1959tS(j4 | j2, j3 | j, i3, iArr);
        }
        int i4 = 0;
        int[] iArr3 = this.k;
        if (iArr3 == null) {
            if (iArr3 != null) {
                for (int i5 : iArr3) {
                    c1959tS3 = c1959tS3.n(i5);
                }
            }
            int i6 = this.j;
            if (j3 != 0) {
                for (int i7 = 0; i7 < 64; i7++) {
                    if (((1 << i7) & j3) != 0) {
                        c1959tS3 = c1959tS3.n(i7 + i6);
                    }
                }
            }
            if (j4 != 0) {
                while (i4 < 64) {
                    if (((1 << i4) & j4) != 0) {
                        c1959tS3 = c1959tS3.n(i4 + 64 + i6);
                    }
                    i4++;
                }
            }
            return c1959tS3;
        }
        if (iArr2 != null) {
            c1959tS2 = this;
            for (int i8 : iArr2) {
                c1959tS2 = c1959tS2.n(i8);
            }
        } else {
            c1959tS2 = this;
        }
        if (j != 0) {
            for (int i9 = 0; i9 < 64; i9++) {
                if (((1 << i9) & j) != 0) {
                    c1959tS2 = c1959tS2.n(i9 + i2);
                }
            }
        }
        if (j2 != 0) {
            while (i4 < 64) {
                if (((1 << i4) & j2) != 0) {
                    c1959tS2 = c1959tS2.n(i4 + 64 + i2);
                }
                i4++;
            }
        }
        return c1959tS2;
    }

    public final C1959tS n(int i) {
        long j;
        int i2;
        long j2;
        int i3 = this.j;
        int i4 = i - i3;
        long j3 = this.h;
        long j4 = this.i;
        int[] iArr = this.k;
        long j5 = 1;
        if (i4 >= 0 && i4 < 64) {
            long j6 = 1 << i4;
            if ((j4 & j6) == 0) {
                return new C1959tS(j3, j4 | j6, i3, iArr);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j7 = 1 << (i4 - 64);
            if ((j3 & j7) == 0) {
                return new C1959tS(j7 | j3, j4, i3, iArr);
            }
        } else if (i4 < 128) {
            if (iArr == null) {
                return new C1959tS(j3, j4, i3, new int[]{i});
            }
            int b = AbstractC1494mO.b(iArr, i);
            if (b < 0) {
                int i5 = -(b + 1);
                int length = iArr.length;
                int[] iArr2 = new int[length + 1];
                P6.a0(0, 0, i5, iArr, iArr2);
                P6.a0(i5 + 1, i5, length, iArr, iArr2);
                iArr2[i5] = i;
                return new C1959tS(this.h, this.i, this.j, iArr2);
            }
        } else if (!l(i)) {
            int i6 = ((i + 1) / 64) * 64;
            int i7 = this.j;
            ArrayList arrayList = null;
            long j8 = j3;
            while (true) {
                if (i7 >= i6) {
                    j = j4;
                    i2 = i7;
                    break;
                }
                if (j4 != 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        if (iArr != null) {
                            int length2 = iArr.length;
                            int i8 = 0;
                            while (i8 < length2) {
                                arrayList.add(Integer.valueOf(iArr[i8]));
                                i8++;
                                j5 = j5;
                            }
                        }
                    }
                    j2 = j5;
                    for (int i9 = 0; i9 < 64; i9++) {
                        if (((j2 << i9) & j4) != 0) {
                            arrayList.add(Integer.valueOf(i9 + i7));
                        }
                    }
                } else {
                    j2 = j5;
                }
                if (j8 == 0) {
                    i2 = i6;
                    j = 0;
                    break;
                }
                i7 += 64;
                j4 = j8;
                j5 = j2;
                j8 = 0;
            }
            return new C1959tS(j8, j, i2, arrayList != null ? AbstractC0720ac.I0(arrayList) : iArr).n(i);
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(this));
        Iterator it = iterator();
        while (true) {
            OQ oq = (OQ) it;
            if (!oq.hasNext()) {
                break;
            }
            arrayList.add(String.valueOf(((Number) oq.next()).intValue()));
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
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
