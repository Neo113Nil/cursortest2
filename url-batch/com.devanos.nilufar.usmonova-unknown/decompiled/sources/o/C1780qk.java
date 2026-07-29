package o;

import java.util.Arrays;

/* renamed from: o.qk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1780qk {
    public final C1845rk a;
    public final byte[] b;

    public C1780qk(C1845rk c1845rk, byte[] bArr) {
        if (c1845rk == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = c1845rk;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1780qk)) {
            return false;
        }
        C1780qk c1780qk = (C1780qk) obj;
        if (this.a.equals(c1780qk.a)) {
            return Arrays.equals(this.b, c1780qk.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
