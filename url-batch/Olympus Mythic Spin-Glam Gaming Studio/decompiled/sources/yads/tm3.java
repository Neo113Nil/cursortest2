package yads;

import com.inmobi.media.core.config.models.AdConfig;

/* loaded from: classes4.dex */
public final class tm3 {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;

    public tm3(byte[] bArr) {
        this.a = bArr;
        this.b = bArr.length;
    }

    public final boolean a() {
        boolean z = (((this.a[this.c] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.d) & 1) == 1;
        b(1);
        return z;
    }

    public final void b(int i) {
        int i2 = i / 8;
        int i3 = this.c + i2;
        this.c = i3;
        int i4 = (i - (i2 * 8)) + this.d;
        this.d = i4;
        if (i4 > 7) {
            this.c = i3 + 1;
            this.d = i4 - 8;
        }
        int i5 = this.c;
        if (i5 >= 0) {
            int i6 = this.b;
            if (i5 < i6) {
                return;
            }
            if (i5 == i6 && this.d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final int a(int i) {
        int i2 = this.c;
        int min = Math.min(i, 8 - this.d);
        int i3 = i2 + 1;
        int i4 = ((this.a[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.a[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        b(i);
        return i5;
    }
}
