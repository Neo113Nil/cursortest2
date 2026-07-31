package yads;

import java.util.Arrays;

/* loaded from: classes12.dex */
public final class b83 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public b83(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b83.class != obj.getClass()) {
            return false;
        }
        b83 b83Var = (b83) obj;
        return this.a == b83Var.a && this.c == b83Var.c && this.d == b83Var.d && Arrays.equals(this.b, b83Var.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
