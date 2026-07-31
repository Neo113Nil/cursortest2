package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class fx implements nq {
    public static final mq g = new mq() { // from class: yads.fx$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return fx.a(bundle);
        }
    };
    public final int b;
    public final int c;
    public final int d;
    public final byte[] e;
    public int f;

    public fx(int i, int i2, int i3, byte[] bArr) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = bArr;
    }

    public static fx a(Bundle bundle) {
        return new fx(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fx.class != obj.getClass()) {
            return false;
        }
        fx fxVar = (fx) obj;
        return this.b == fxVar.b && this.c == fxVar.c && this.d == fxVar.d && Arrays.equals(this.e, fxVar.e);
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.e) + ((((((this.b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.c) * 31) + this.d) * 31);
        }
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.e != null);
        sb.append(")");
        return sb.toString();
    }
}
