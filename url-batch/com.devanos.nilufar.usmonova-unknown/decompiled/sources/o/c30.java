package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c30 extends a30 {
    public final byte[] c;

    public c30(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.c = bArr;
    }

    @Override // o.a30
    public final byte[] f() {
        return this.c;
    }
}
