package io.bidmachine.iab.utils;

import android.graphics.Point;
import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"relativeToView", "Landroid/graphics/Point;", "Landroid/graphics/PointF;", "w", "", "h", "bidmachine-android-sdk_bb_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ClickPointGeneratorKt {
    @NotNull
    public static final Point relativeToView(@NotNull PointF pointF, int i, int i2) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        return new Point(MathKt.roundToInt(i * pointF.x), MathKt.roundToInt(i2 * pointF.y));
    }
}
