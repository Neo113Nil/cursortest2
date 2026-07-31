package io.intercom.android.sdk.m5.shapes;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CutIconWithIndicatorShape.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/shapes/CutIconWithIndicatorShape;", "Landroidx/compose/ui/graphics/Shape;", "indicatorSize", "Landroidx/compose/ui/unit/Dp;", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "getOffset", "Landroidx/compose/ui/geometry/Offset;", "width", "", "dotSize", "getOffset-P-0qjgQ", "(FFLandroidx/compose/ui/unit/LayoutDirection;)J", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CutIconWithIndicatorShape implements Shape {
    public static final int $stable = 0;
    private final float indicatorSize;

    /* compiled from: CutIconWithIndicatorShape.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CutIconWithIndicatorShape(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    private CutIconWithIndicatorShape(float f) {
        this.indicatorSize = f;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo326createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float mo424toPx0680j_4 = density.mo424toPx0680j_4(this.indicatorSize);
        Path Path = AndroidPath_androidKt.Path();
        OutlineKt.addOutline(Path, RectangleShapeKt.getRectangleShape().mo326createOutlinePq9zytI(size, layoutDirection, density));
        Path Path2 = AndroidPath_androidKt.Path();
        OutlineKt.addOutline(Path2, RoundedCornerShapeKt.getCircleShape().mo326createOutlinePq9zytI(Size.m5473constructorimpl((Float.floatToRawIntBits(mo424toPx0680j_4) << 32) | (Float.floatToRawIntBits(mo424toPx0680j_4) & 4294967295L)), layoutDirection, density));
        Path Path3 = AndroidPath_androidKt.Path();
        Path3.mo5545addPathUv8p0NA(Path2, m11663getOffsetP0qjgQ(Float.intBitsToFloat((int) (size >> 32)), mo424toPx0680j_4, layoutDirection));
        Path Path4 = AndroidPath_androidKt.Path();
        Path4.mo5547opN5in7k0(Path, Path3, PathOperation.INSTANCE.m5961getDifferenceb3I0S0c());
        return new Outline.Generic(Path4);
    }

    /* renamed from: getOffset-P-0qjgQ, reason: not valid java name */
    private final long m11663getOffsetP0qjgQ(float width, float dotSize, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            return Offset.m5405constructorimpl((Float.floatToRawIntBits(width - dotSize) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Offset.m5405constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
    }

    public /* synthetic */ CutIconWithIndicatorShape(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dp.m8401constructorimpl(8) : f, null);
    }
}
