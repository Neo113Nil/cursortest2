package o;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: o.h9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1151h9 implements Iterable, Serializable {
    public static final C1151h9 j = new C1151h9(AbstractC2052ut.b);
    public static final InterfaceC1085g9 k;
    public int h = 0;
    public final byte[] i;

    static {
        k = AbstractC1735q2.a() ? new C1623oL(21) : new C1623oL(20);
    }

    public C1151h9(byte[] bArr) {
        bArr.getClass();
        this.i = bArr;
    }

    public static int k(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC1888sN.h(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC1888sN.g(i2, i3, "End index: ", " >= "));
    }

    public static C1151h9 l(byte[] bArr, int i, int i2) {
        k(i, i + i2, bArr.length);
        return new C1151h9(k.e(bArr, i, i2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1151h9) || size() != ((C1151h9) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C1151h9)) {
            return obj.equals(this);
        }
        C1151h9 c1151h9 = (C1151h9) obj;
        int i = this.h;
        int i2 = c1151h9.h;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > c1151h9.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c1151h9.size()) {
            StringBuilder i3 = AbstractC2188wx.i(size, "Ran off end of other: 0, ", ", ");
            i3.append(c1151h9.size());
            throw new IllegalArgumentException(i3.toString());
        }
        byte[] bArr = c1151h9.i;
        int n = n() + size;
        int n2 = n();
        int n3 = c1151h9.n();
        while (n2 < n) {
            if (this.i[n2] != bArr[n3]) {
                return false;
            }
            n2++;
            n3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int size = size();
        int n = n();
        int i2 = size;
        for (int i3 = n; i3 < n + size; i3++) {
            i2 = (i2 * 31) + this.i[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.h = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0953e9(this);
    }

    public byte j(int i) {
        return this.i[i];
    }

    public void m(byte[] bArr, int i) {
        System.arraycopy(this.i, 0, bArr, 0, i);
    }

    public int n() {
        return 0;
    }

    public byte o(int i) {
        return this.i[i];
    }

    public int size() {
        return this.i.length;
    }

    public final String toString() {
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = AbstractC0772bO.g(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int k2 = k(0, 47, size());
            sb2.append(AbstractC0772bO.g(k2 == 0 ? j : new C1019f9(this.i, n(), k2)));
            sb2.append("...");
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return AbstractC1888sN.l(sb3, sb, "\">");
    }
}
