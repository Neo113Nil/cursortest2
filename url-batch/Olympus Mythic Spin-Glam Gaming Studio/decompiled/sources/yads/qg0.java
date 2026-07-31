package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes6.dex */
public final class qg0 implements nq {
    public final int b;
    public final int c;
    public final int d;

    static {
        new mq() { // from class: yads.qg0$$ExternalSyntheticLambda0
            @Override // yads.mq
            public final nq a(Bundle bundle) {
                return qg0.a(bundle);
            }
        };
    }

    public qg0(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public static qg0 a(Bundle bundle) {
        return new qg0(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg0)) {
            return false;
        }
        qg0 qg0Var = (qg0) obj;
        return this.b == qg0Var.b && this.c == qg0Var.c && this.d == qg0Var.d;
    }

    public final int hashCode() {
        return ((((this.b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.c) * 31) + this.d;
    }
}
