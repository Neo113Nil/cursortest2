package yads;

import android.content.Context;
import android.util.TypedValue;
import kotlin.math.MathKt;

/* loaded from: classes4.dex */
public final class yg0 {
    public static int a(Context context, float f) {
        return MathKt.roundToInt(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }

    public static int a(Context context, int i) {
        return MathKt.roundToInt(i / context.getResources().getDisplayMetrics().density);
    }
}
