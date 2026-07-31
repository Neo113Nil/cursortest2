package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivGestureListener;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAspect;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivSizeUnitValue;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"com/yandex/div/core/view2/divs/BaseDivViewExtensionsKt__BaseDivViewExtensionsKt", "com/yandex/div/core/view2/divs/BaseDivViewExtensionsKt__SizeUnitUtilsKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BaseDivViewExtensionsKt {
    public static final void applyAlignment(@NotNull View view, @Nullable DivAlignmentHorizontal divAlignmentHorizontal, @Nullable DivAlignmentVertical divAlignmentVertical) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyAlignment(view, divAlignmentHorizontal, divAlignmentVertical);
    }

    public static final void applyBitmapFilters(@NotNull View view, @NotNull BindingContext bindingContext, @NotNull Bitmap bitmap, @Nullable List<? extends DivFilter> list, @NotNull Function1 function1) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyBitmapFilters(view, bindingContext, bitmap, list, function1);
    }

    public static final void applyDivActions(@NotNull View view, @NotNull BindingContext bindingContext, @Nullable DivAction divAction, @Nullable List<DivAction> list, @Nullable List<DivAction> list2, @Nullable List<DivAction> list3, @Nullable List<DivAction> list4, @Nullable List<DivAction> list5, @Nullable List<DivAction> list6, @Nullable List<DivAction> list7, @NotNull DivAnimation divAnimation, @NotNull Expression<Boolean> expression) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyDivActions(view, bindingContext, divAction, list, list2, list3, list4, list5, list6, list7, divAnimation, expression);
    }

    public static final void applyMargins(@NotNull View view, @Nullable DivEdgeInsets divEdgeInsets, @NotNull ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyMargins(view, divEdgeInsets, expressionResolver);
    }

    public static final void applyPaddings(@NotNull View view, @Nullable DivEdgeInsets divEdgeInsets, @NotNull ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyPaddings(view, divEdgeInsets, expressionResolver);
    }

    public static final void applyTransform(@NotNull View view, @NotNull DivBase divBase, @NotNull ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyTransform(view, divBase, expressionResolver);
    }

    public static final void bindAspectRatio(@NotNull View view, @Nullable DivAspect divAspect, @Nullable DivAspect divAspect2, @NotNull ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindAspectRatio(view, divAspect, divAspect2, expressionResolver);
    }

    public static final void bindClipChildren(@NotNull ViewGroup viewGroup, @NotNull Expression<Boolean> expression, @Nullable Expression<Boolean> expression2, @NotNull ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindClipChildren(viewGroup, expression, expression2, expressionResolver);
    }

    public static final void bindItemBuilder(@NotNull DivCollectionItemBuilder divCollectionItemBuilder, @NotNull ExpressionResolver expressionResolver, @NotNull Function1 function1) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindItemBuilder(divCollectionItemBuilder, expressionResolver, function1);
    }

    public static final void bindStates(@NotNull View view, @NotNull BindingContext bindingContext, @NotNull DivBinder divBinder) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindStates(view, bindingContext, divBinder);
    }

    public static final void clearFocusOnClick(@NotNull View view, @NotNull InputFocusTracker inputFocusTracker) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.clearFocusOnClick(view, inputFocusTracker);
    }

    @Nullable
    public static final Function2 createAnimatedTouchListener(@NotNull View view, @NotNull BindingContext bindingContext, @Nullable DivAnimation divAnimation, @Nullable DivGestureListener divGestureListener) {
        return BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.createAnimatedTouchListener(view, bindingContext, divAnimation, divGestureListener);
    }

    public static final int dpToPx(@Nullable Long l, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.dpToPx(l, displayMetrics);
    }

    public static final <T extends Number> int dpToPx(@Nullable T t, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.dpToPx(t, displayMetrics);
    }

    public static final <T extends Number> float dpToPxF(@Nullable T t, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.dpToPxF(t, displayMetrics);
    }

    public static final void drawShadow(@NotNull View view, @NotNull Canvas canvas) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.drawShadow(view, canvas);
    }

    public static final float fontSizeToPx(long j, @NotNull DivSizeUnit divSizeUnit, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.fontSizeToPx(j, divSizeUnit, displayMetrics);
    }

    public static final void gainAccessibilityFocus(@NotNull View view) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.gainAccessibilityFocus(view);
    }

    @Nullable
    public static final BindingContext getBindingContext(@NotNull View view) {
        return BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.getBindingContext(view);
    }

    public static final int pxToDp(@Nullable Long l, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.pxToDp(l, displayMetrics);
    }

    public static final <T extends Number> int pxToDp(@Nullable T t, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.pxToDp(t, displayMetrics);
    }

    public static final <T extends Number> float pxToDpF(@Nullable T t, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.pxToDpF(t, displayMetrics);
    }

    public static final int pxToSp(@Nullable Long l, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.pxToSp(l, displayMetrics);
    }

    public static final <T extends Number> int pxToSp(@Nullable T t, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.pxToSp(t, displayMetrics);
    }

    public static final <T extends Number> float pxToSpF(@Nullable T t, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.pxToSpF(t, displayMetrics);
    }

    public static final int spToPx(@Nullable Long l, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.spToPx(l, displayMetrics);
    }

    public static final <T extends Number> int spToPx(@Nullable T t, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.spToPx(t, displayMetrics);
    }

    public static final <T extends Number> float spToPxF(@Nullable T t, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.spToPxF(t, displayMetrics);
    }

    public static final int toAndroidUnit(@NotNull DivSizeUnit divSizeUnit) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toAndroidUnit(divSizeUnit);
    }

    public static final int toPx(long j, @NotNull DivSizeUnit divSizeUnit, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPx(j, divSizeUnit, displayMetrics);
    }

    public static final int toPx(@NotNull DivDimension divDimension, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPx(divDimension, displayMetrics, expressionResolver);
    }

    public static final int toPx(@NotNull DivFixedSize divFixedSize, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPx(divFixedSize, displayMetrics, expressionResolver);
    }

    public static final int toPx(@NotNull DivSizeUnitValue divSizeUnitValue, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPx(divSizeUnitValue, displayMetrics, expressionResolver);
    }

    public static final float toPxF(long j, @NotNull DivSizeUnit divSizeUnit, @NotNull DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPxF(j, divSizeUnit, displayMetrics);
    }

    public static final float toPxF(@NotNull DivFixedSize divFixedSize, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPxF(divFixedSize, displayMetrics, expressionResolver);
    }

    @MainThread
    public static final void trackVisibilityActions(@NotNull ViewGroup viewGroup, @NotNull Div2View div2View, @NotNull List<DivItemBuilderResult> list, @Nullable List<DivItemBuilderResult> list2) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.trackVisibilityActions(viewGroup, div2View, list, list2);
    }

    public static final int unitToPx(@Nullable Long l, @NotNull DisplayMetrics displayMetrics, @NotNull DivSizeUnit divSizeUnit) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.unitToPx(l, displayMetrics, divSizeUnit);
    }

    public static final <T extends Number> int unitToPx(@Nullable T t, @NotNull DisplayMetrics displayMetrics, @NotNull DivSizeUnit divSizeUnit) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.unitToPx(t, displayMetrics, divSizeUnit);
    }

    public static final <T extends Number> float unitToPxF(@Nullable T t, @NotNull DisplayMetrics displayMetrics, @NotNull DivSizeUnit divSizeUnit) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.unitToPxF(t, displayMetrics, divSizeUnit);
    }
}
