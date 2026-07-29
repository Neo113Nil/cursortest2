package o;

import java.util.Map;

/* loaded from: classes.dex */
public final class FR {
    public int[] a;
    public Object[] b;
    public int c;

    public final int a(int i, Object obj) {
        int i2;
        int i3 = this.c;
        if (i3 == 0) {
            return -1;
        }
        int[] iArr = this.a;
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 > i4) {
                i2 = ~i5;
                break;
            }
            i2 = (i5 + i4) >>> 1;
            int i6 = iArr[i2];
            if (i6 >= i) {
                if (i6 <= i) {
                    break;
                }
                i4 = i2 - 1;
            } else {
                i5 = i2 + 1;
            }
        }
        if (i2 < 0 || AbstractC0048Bt.h(obj, this.b[i2 << 1])) {
            return i2;
        }
        int i7 = i2 + 1;
        while (i7 < i3 && this.a[i7] == i) {
            if (AbstractC0048Bt.h(obj, this.b[i7 << 1])) {
                return i7;
            }
            i7++;
        }
        for (int i8 = i2 - 1; i8 >= 0 && this.a[i8] == i; i8--) {
            if (AbstractC0048Bt.h(obj, this.b[i8 << 1])) {
                return i8;
            }
        }
        return ~i7;
    }

    public final int b() {
        int i;
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int[] iArr = this.a;
        int i3 = i2 - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i = ~i4;
                break;
            }
            i = (i4 + i3) >>> 1;
            int i5 = iArr[i];
            if (i5 >= 0) {
                if (i5 <= 0) {
                    break;
                }
                i3 = i - 1;
            } else {
                i4 = i + 1;
            }
        }
        if (i < 0 || this.b[i << 1] == null) {
            return i;
        }
        int i6 = i + 1;
        while (i6 < i2 && this.a[i6] == 0) {
            if (this.b[i6 << 1] == null) {
                return i6;
            }
            i6++;
        }
        for (int i7 = i - 1; i7 >= 0 && this.a[i7] == 0; i7--) {
            if (this.b[i7 << 1] == null) {
                return i7;
            }
        }
        return ~i6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FR)) {
                if ((obj instanceof Map) && this.c == ((Map) obj).size()) {
                    int i = this.c;
                    for (int i2 = 0; i2 < i; i2++) {
                        Object[] objArr = this.b;
                        int i3 = i2 << 1;
                        Object obj2 = objArr[i3];
                        Object obj3 = objArr[i3 + 1];
                        Object obj4 = ((Map) obj).get(obj2);
                        if (obj3 == null) {
                            if (obj4 == null && ((Map) obj).containsKey(obj2)) {
                            }
                        } else if (!obj3.equals(obj4)) {
                        }
                    }
                }
                return false;
            }
            FR fr = (FR) obj;
            int i4 = this.c;
            if (i4 == fr.c) {
                for (int i5 = 0; i5 < i4; i5++) {
                    Object[] objArr2 = this.b;
                    int i6 = i5 << 1;
                    Object obj5 = objArr2[i6];
                    Object obj6 = objArr2[i6 + 1];
                    int b = obj5 == null ? fr.b() : fr.a(obj5.hashCode(), obj5);
                    Object obj7 = b >= 0 ? fr.b[(b << 1) + 1] : null;
                    if (obj6 == null) {
                        if (obj7 == null) {
                            if ((obj5 == null ? fr.b() : fr.a(obj5.hashCode(), obj5)) >= 0) {
                            }
                        }
                    } else if (!obj6.equals(obj7)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i = this.c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final String toString() {
        int i = this.c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            int i4 = i3 << 1;
            Object obj = this.b[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.b[i4 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
