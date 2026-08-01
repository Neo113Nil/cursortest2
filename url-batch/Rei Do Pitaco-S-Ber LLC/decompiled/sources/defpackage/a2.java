package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class a2 implements nd {
    public final nd a;
    public final float b;

    public a2(float f, nd ndVar) {
        while (ndVar instanceof a2) {
            ndVar = ((a2) ndVar).a;
            f += ((a2) ndVar).b;
        }
        this.a = ndVar;
        this.b = f;
    }

    @Override // defpackage.nd
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return this.a.equals(a2Var.a) && this.b == a2Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
