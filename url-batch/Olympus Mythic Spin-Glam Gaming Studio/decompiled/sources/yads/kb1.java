package yads;

import android.content.Context;
import android.util.TypedValue;
import kotlin.math.MathKt;

/* loaded from: classes13.dex */
public final class kb1 implements ib1 {
    @Override // yads.ib1
    public final void a(Context context, hb1 hb1Var) {
        hb1Var.setVisibility(0);
        hb1Var.setMinimumHeight(MathKt.roundToInt(TypedValue.applyDimension(1, 50.0f, context.getResources().getDisplayMetrics())));
    }

    @Override // yads.ib1
    public final void onAttachedToWindow() {
    }

    @Override // yads.ib1
    public final void onDetachedFromWindow() {
    }
}
