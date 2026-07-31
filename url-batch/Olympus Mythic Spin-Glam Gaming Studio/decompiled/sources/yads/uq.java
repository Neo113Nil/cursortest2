package yads;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes4.dex */
public final class uq {
    public static final tq e = new tq();
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList(64);
    public int c = 0;
    public final int d = 4096;

    public final synchronized byte[] a(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            byte[] bArr = (byte[]) this.b.get(i2);
            if (bArr.length >= i) {
                this.c -= bArr.length;
                this.b.remove(i2);
                this.a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.d) {
                this.a.add(bArr);
                int binarySearch = Collections.binarySearch(this.b, bArr, e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.b.add(binarySearch, bArr);
                this.c += bArr.length;
                a();
            }
        }
    }

    public final synchronized void a() {
        while (this.c > this.d) {
            byte[] bArr = (byte[]) this.a.remove(0);
            this.b.remove(bArr);
            this.c -= bArr.length;
        }
    }
}
