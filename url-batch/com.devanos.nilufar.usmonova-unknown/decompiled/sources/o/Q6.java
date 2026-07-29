package o;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class Q6 extends B implements RandomAccess {
    public final /* synthetic */ int[] h;

    public Q6(int[] iArr) {
        this.h = iArr;
    }

    @Override // o.r, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Number) obj).intValue();
            int[] iArr = this.h;
            AbstractC0048Bt.n(iArr, "<this>");
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (intValue == iArr[i]) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Integer.valueOf(this.h[i]);
    }

    @Override // o.B, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.h;
        AbstractC0048Bt.n(iArr, "<this>");
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (intValue == iArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // o.r, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.h.length == 0;
    }

    @Override // o.r
    public final int j() {
        return this.h.length;
    }

    @Override // o.B, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.h;
        AbstractC0048Bt.n(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (intValue == iArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }
}
