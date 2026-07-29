package o;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class F7 {
    public final String a;
    public final byte[] b;
    public final EnumC1489mJ c;

    public F7(String str, byte[] bArr, EnumC1489mJ enumC1489mJ) {
        this.a = str;
        this.b = bArr;
        this.c = enumC1489mJ;
    }

    public static C0950e6 a() {
        C0950e6 c0950e6 = new C0950e6(3, false);
        c0950e6.k = EnumC1489mJ.h;
        return c0950e6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F7) {
            F7 f7 = (F7) obj;
            if (this.a.equals(f7.a) && Arrays.equals(this.b, f7.b) && this.c.equals(f7.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.b;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return AbstractC1888sN.l(sb, encodeToString, ")");
    }
}
