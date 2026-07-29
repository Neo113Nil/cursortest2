package o;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.i9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1217i9 extends OutputStream {
    public static final byte[] m = new byte[0];
    public int j;
    public int l;
    public final int h = 128;
    public final ArrayList i = new ArrayList();
    public byte[] k = new byte[128];

    public final void b(int i) {
        this.i.add(new C2271yA(this.k));
        int length = this.j + this.k.length;
        this.j = length;
        this.k = new byte[Math.max(this.h, Math.max(i, length >>> 1))];
        this.l = 0;
    }

    public final void c() {
        int i = this.l;
        byte[] bArr = this.k;
        int length = bArr.length;
        ArrayList arrayList = this.i;
        if (i >= length) {
            arrayList.add(new C2271yA(this.k));
            this.k = m;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            arrayList.add(new C2271yA(bArr2));
        }
        this.j += this.l;
        this.l = 0;
    }

    public final synchronized AbstractC1281j9 j() {
        ArrayList arrayList;
        c();
        arrayList = this.i;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((AbstractC1281j9) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? AbstractC1281j9.h : AbstractC1281j9.j(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.j + this.l;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.l == this.k.length) {
                b(1);
            }
            byte[] bArr = this.k;
            int i2 = this.l;
            this.l = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            byte[] bArr2 = this.k;
            int length = bArr2.length;
            int i3 = this.l;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.l += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                b(i4);
                System.arraycopy(bArr, i + length2, this.k, 0, i4);
                this.l = i4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
