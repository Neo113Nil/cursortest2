package defpackage;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class yi implements TypeEvaluator {
    public final FloatEvaluator a = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        float floatValue = this.a.evaluate(f, (Number) obj, (Number) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
