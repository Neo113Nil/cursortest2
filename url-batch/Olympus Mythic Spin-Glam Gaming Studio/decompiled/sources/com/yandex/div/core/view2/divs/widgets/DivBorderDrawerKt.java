package com.yandex.div.core.view2.divs.widgets;

import android.graphics.Canvas;
import android.util.DisplayMetrics;
import androidx.annotation.Px;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivStroke;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivBorderDrawer.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\bH\u0080\b\u001a?\u0010\t\u001a\u00020\u0003*\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\bH\u0080\b\u001a\u001e\u0010\r\u001a\u00020\u0001*\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"STROKE_OFFSET_PERCENTAGE", "", "drawClipped", "", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "canvas", "Landroid/graphics/Canvas;", "drawCallback", "Lkotlin/Function1;", "drawClippedAndTranslated", "translationX", "", "translationY", "widthPx", "Lcom/yandex/div2/DivStroke;", "expressionResolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "metrics", "Landroid/util/DisplayMetrics;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivBorderDrawerKt {
    private static final float STROKE_OFFSET_PERCENTAGE = 0.1f;

    /* compiled from: DivBorderDrawer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivSizeUnit.values().length];
            try {
                iArr[DivSizeUnit.DP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivSizeUnit.SP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivSizeUnit.PX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void drawClipped(@Nullable DivBorderDrawer divBorderDrawer, @NotNull Canvas canvas, @NotNull Function1 function1) {
        if (divBorderDrawer != null) {
            int save = canvas.save();
            try {
                divBorderDrawer.clipCorners(canvas);
                function1.invoke(canvas);
                divBorderDrawer.drawBorder(canvas);
                return;
            } finally {
                InlineMarker.finallyStart(1);
                canvas.restoreToCount(save);
                InlineMarker.finallyEnd(1);
            }
        }
        function1.invoke(canvas);
    }

    @Px
    public static final float widthPx(@Nullable DivStroke divStroke, @NotNull ExpressionResolver expressionResolver, @NotNull DisplayMetrics displayMetrics) {
        double doubleValue;
        Expression expression;
        Expression expression2;
        DivSizeUnit divSizeUnit = (divStroke == null || (expression2 = divStroke.unit) == null) ? null : (DivSizeUnit) expression2.evaluate(expressionResolver);
        int i = divSizeUnit == null ? -1 : WhenMappings.$EnumSwitchMapping$0[divSizeUnit.ordinal()];
        if (i == 1) {
            return BaseDivViewExtensionsKt.dpToPxF((Number) divStroke.width.evaluate(expressionResolver), displayMetrics);
        }
        if (i == 2) {
            return BaseDivViewExtensionsKt.spToPxF((Number) divStroke.width.evaluate(expressionResolver), displayMetrics);
        }
        if (i == 3) {
            doubleValue = ((Number) divStroke.width.evaluate(expressionResolver)).doubleValue();
        } else {
            if (divStroke == null || (expression = divStroke.width) == null) {
                return 0.0f;
            }
            doubleValue = ((Number) expression.evaluate(expressionResolver)).doubleValue();
        }
        return (float) doubleValue;
    }

    public static final void drawClippedAndTranslated(@Nullable DivBorderDrawer divBorderDrawer, @NotNull Canvas canvas, int i, int i2, @NotNull Function1 function1) {
        if (divBorderDrawer != null) {
            float f = i;
            float f2 = i2;
            int save = canvas.save();
            try {
                canvas.translate(f, f2);
                divBorderDrawer.clipCorners(canvas);
                canvas.translate(-f, -f2);
                function1.invoke(canvas);
                canvas.translate(f, f2);
                divBorderDrawer.drawBorder(canvas);
                return;
            } finally {
                InlineMarker.finallyStart(1);
                canvas.restoreToCount(save);
                InlineMarker.finallyEnd(1);
            }
        }
        function1.invoke(canvas);
    }

    public static /* synthetic */ void drawClippedAndTranslated$default(DivBorderDrawer divBorderDrawer, Canvas canvas, int i, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if (divBorderDrawer != null) {
            float f = i;
            float f2 = i2;
            int save = canvas.save();
            try {
                canvas.translate(f, f2);
                divBorderDrawer.clipCorners(canvas);
                canvas.translate(-f, -f2);
                function1.invoke(canvas);
                canvas.translate(f, f2);
                divBorderDrawer.drawBorder(canvas);
                return;
            } finally {
                InlineMarker.finallyStart(1);
                canvas.restoreToCount(save);
                InlineMarker.finallyEnd(1);
            }
        }
        function1.invoke(canvas);
    }
}
