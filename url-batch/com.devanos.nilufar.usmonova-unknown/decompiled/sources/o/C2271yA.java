package o;

import java.io.OutputStream;
import java.util.Iterator;

/* renamed from: o.yA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2271yA extends AbstractC1281j9 {
    public final byte[] i;
    public int j = 0;

    public C2271yA(byte[] bArr) {
        this.i = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1281j9) || size() != ((AbstractC1281j9) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C2271yA) {
            return x((C2271yA) obj, 0, size());
        }
        if (obj instanceof LO) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(AbstractC1888sN.l(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
    }

    public final int hashCode() {
        int i = this.j;
        if (i == 0) {
            int size = size();
            i = r(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.j = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C0953e9(this);
    }

    @Override // o.AbstractC1281j9
    public void m(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.i, i, bArr, i2, i3);
    }

    @Override // o.AbstractC1281j9
    public final int n() {
        return 0;
    }

    @Override // o.AbstractC1281j9
    public final boolean o() {
        return true;
    }

    @Override // o.AbstractC1281j9
    public final boolean p() {
        byte[] bArr = this.i;
        return ON.o(bArr, 0, bArr.length) == 0;
    }

    @Override // o.AbstractC1281j9
    public final int r(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.i[i4];
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
    
        if (r0[r8] > (-65)) goto L59;
     */
    @Override // o.AbstractC1281j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int s(int i, int i2, int i3) {
        byte b;
        int i4;
        int i5;
        int i6 = i3 + i2;
        byte[] bArr = this.i;
        if (i != 0) {
            if (i2 >= i6) {
                return i;
            }
            byte b2 = (byte) i;
            if (b2 < -32) {
                if (b2 >= -62) {
                    i5 = i2 + 1;
                }
                return -1;
            }
            if (b2 < -16) {
                byte b3 = (byte) (~(i >> 8));
                if (b3 == 0) {
                    int i7 = i2 + 1;
                    byte b4 = bArr[i2];
                    if (i7 >= i6) {
                        return ON.i(b2, b4);
                    }
                    i2 = i7;
                    b3 = b4;
                }
                if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                    i5 = i2 + 1;
                }
            } else {
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    i4 = i2 + 1;
                    b5 = bArr[i2];
                    if (i4 >= i6) {
                        return ON.i(b2, b5);
                    }
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                    i4 = i2;
                }
                if (b == 0) {
                    int i8 = i4 + 1;
                    byte b6 = bArr[i4];
                    if (i8 >= i6) {
                        if (b2 > -12 || b5 > -65 || b6 > -65) {
                            return -1;
                        }
                        return (b6 << 16) ^ ((b5 << 8) ^ b2);
                    }
                    b = b6;
                    i4 = i8;
                }
                if (b5 <= -65) {
                    if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && b <= -65) {
                        i2 = i4 + 1;
                    }
                }
            }
            return -1;
        }
        return ON.o(bArr, i2, i6);
    }

    @Override // o.AbstractC1281j9
    public int size() {
        return this.i.length;
    }

    @Override // o.AbstractC1281j9
    public final int t() {
        return this.j;
    }

    @Override // o.AbstractC1281j9
    public final String u() {
        byte[] bArr = this.i;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // o.AbstractC1281j9
    public final void w(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.i, i, i2);
    }

    public final boolean x(C2271yA c2271yA, int i, int i2) {
        byte[] bArr = c2271yA.i;
        int length = bArr.length;
        byte[] bArr2 = this.i;
        if (i2 > length) {
            int length2 = bArr2.length;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + i2 <= bArr.length) {
            int i3 = 0;
            while (i3 < i2) {
                if (bArr2[i3] != bArr[i]) {
                    return false;
                }
                i3++;
                i++;
            }
            return true;
        }
        int length3 = c2271yA.i.length;
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("Ran off end of other: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(length3);
        throw new IllegalArgumentException(sb2.toString());
    }
}
