package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class re2 implements nq {
    public static final re2 e = new re2(1.0f, 1.0f);
    public final float b;
    public final float c;
    public final int d;

    static {
        new mq() { // from class: yads.re2$$ExternalSyntheticLambda0
            @Override // yads.mq
            public final nq a(Bundle bundle) {
                return re2.a(bundle);
            }
        };
    }

    public re2(float f, float f2) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException();
        }
        this.b = f;
        this.c = f2;
        this.d = Math.round(f * 1000.0f);
    }

    public static re2 a(Bundle bundle) {
        return new re2(bundle.getFloat(Integer.toString(0, 36), 1.0f), bundle.getFloat(Integer.toString(1, 36), 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || re2.class != obj.getClass()) {
            return false;
        }
        re2 re2Var = (re2) obj;
        return this.b == re2Var.b && this.c == re2Var.c;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((Float.floatToRawIntBits(this.b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.b), Float.valueOf(this.c)};
        int i = sb3.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
