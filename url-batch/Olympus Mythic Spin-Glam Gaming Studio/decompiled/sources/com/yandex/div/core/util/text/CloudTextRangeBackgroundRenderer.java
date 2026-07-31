package com.yandex.div.core.util.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.Layout;
import android.util.DisplayMetrics;
import androidx.annotation.ColorInt;
import com.safedk.android.analytics.reporters.b;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivCloudBackground;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;
import io.appmetrica.analytics.impl.M2;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CloudTextRangeBackgroundRenderer.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J+\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010\u0017JK\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0013H\u0002¢\u0006\u0002\u0010!J+\u0010\"\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010\u0017J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0015H\u0002J\u001b\u0010&\u001a\u00020$2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0002\u0010'J\u001b\u0010(\u001a\u00020$2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0002\u0010'J@\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-H\u0002JL\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010.\u001a\u0004\u0018\u00010/2\b\u0010,\u001a\u0004\u0018\u000100H\u0016JE\u00101\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00152\b\b\u0001\u00102\u001a\u00020\u0015H\u0002¢\u0006\u0002\u00103R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/yandex/div/core/util/text/CloudTextRangeBackgroundRenderer;", "Lcom/yandex/div/core/util/text/DivTextRangesBackgroundRenderer;", "context", "Landroid/content/Context;", "expressionResolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "(Landroid/content/Context;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "displayMetrics", "Landroid/util/DisplayMetrics;", "getDisplayMetrics", "()Landroid/util/DisplayMetrics;", "paint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "buildLeftSegments", "", b.d, "", "Landroid/graphics/Rect;", "start", "", "lineCount", "([Landroid/graphics/Rect;II)[I", "buildLines", "layout", "Landroid/text/Layout;", "startLine", "endLine", "startOffset", "endOffset", "cornerRadius", VastAttributes.PADDING, "(Landroid/text/Layout;IIIIILandroid/graphics/Rect;)[Landroid/graphics/Rect;", "buildRightSegments", "coalesceCloseBounds", "", "minDelta", "coalesceInvisibleLeftBounds", "([Landroid/graphics/Rect;)V", "coalesceInvisibleRightBounds", "draw", "canvas", "Landroid/graphics/Canvas;", M2.g, "Lcom/yandex/div2/DivCloudBackground;", "border", "Lcom/yandex/div2/DivTextRangeBorder;", "Lcom/yandex/div2/DivTextRangeBackground;", "drawLines", "fillColor", "(Landroid/graphics/Canvas;[Landroid/graphics/Rect;IIII)V", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CloudTextRangeBackgroundRenderer extends DivTextRangesBackgroundRenderer {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int OFFSET_SEGMENT_DELTA_X = 0;

    @Deprecated
    public static final int OFFSET_SEGMENT_DELTA_Y = 1;

    @Deprecated
    public static final int SEGMENT_VALUES = 2;

    @NotNull
    private final Context context;

    @NotNull
    private final ExpressionResolver expressionResolver;

    @NotNull
    private final Path path = new Path();

    @NotNull
    private final Paint paint = new Paint();

    public CloudTextRangeBackgroundRenderer(@NotNull Context context, @NotNull ExpressionResolver expressionResolver) {
        this.context = context;
        this.expressionResolver = expressionResolver;
    }

    private final DisplayMetrics getDisplayMetrics() {
        return this.context.getResources().getDisplayMetrics();
    }

    @Override // com.yandex.div.core.util.text.DivTextRangesBackgroundRenderer
    public void draw(@NotNull Canvas canvas, @NotNull Layout layout, int startLine, int endLine, int startOffset, int endOffset, @Nullable DivTextRangeBorder border, @Nullable DivTextRangeBackground background) {
        Object value = background != null ? background.value() : null;
        DivCloudBackground divCloudBackground = value instanceof DivCloudBackground ? (DivCloudBackground) value : null;
        if (divCloudBackground == null) {
            return;
        }
        draw(canvas, layout, startLine, endLine, startOffset, endOffset, divCloudBackground);
    }

    private final void draw(Canvas canvas, Layout layout, int startLine, int endLine, int startOffset, int endOffset, DivCloudBackground background) {
        DivSizeUnit divSizeUnit;
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        Expression expression5;
        DisplayMetrics displayMetrics = getDisplayMetrics();
        int intValue = ((Number) background.color.evaluate(this.expressionResolver)).intValue();
        int dpToPx = BaseDivViewExtensionsKt.dpToPx((Long) background.cornerRadius.evaluate(this.expressionResolver), displayMetrics);
        DivEdgeInsets divEdgeInsets = background.paddings;
        if (divEdgeInsets == null || (expression5 = divEdgeInsets.unit) == null || (divSizeUnit = (DivSizeUnit) expression5.evaluate(this.expressionResolver)) == null) {
            divSizeUnit = DivSizeUnit.DP;
        }
        DivEdgeInsets divEdgeInsets2 = background.paddings;
        int unitToPx = (divEdgeInsets2 == null || (expression4 = divEdgeInsets2.left) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(((Number) expression4.evaluate(this.expressionResolver)).longValue()), displayMetrics, divSizeUnit);
        DivEdgeInsets divEdgeInsets3 = background.paddings;
        int unitToPx2 = (divEdgeInsets3 == null || (expression3 = divEdgeInsets3.top) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(((Number) expression3.evaluate(this.expressionResolver)).longValue()), displayMetrics, divSizeUnit);
        DivEdgeInsets divEdgeInsets4 = background.paddings;
        int unitToPx3 = (divEdgeInsets4 == null || (expression2 = divEdgeInsets4.right) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(((Number) expression2.evaluate(this.expressionResolver)).longValue()), displayMetrics, divSizeUnit);
        DivEdgeInsets divEdgeInsets5 = background.paddings;
        Rect[] buildLines = buildLines(layout, startLine, endLine, startOffset, endOffset, dpToPx, new Rect(unitToPx, unitToPx2, unitToPx3, (divEdgeInsets5 == null || (expression = divEdgeInsets5.bottom) == null) ? 0 : BaseDivViewExtensionsKt.unitToPx(Long.valueOf(((Number) expression.evaluate(this.expressionResolver)).longValue()), displayMetrics, divSizeUnit)));
        if (buildLines.length < 2) {
            drawLines(canvas, buildLines, 0, buildLines.length, dpToPx, intValue);
            return;
        }
        int length = buildLines.length - 1;
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (i < length) {
            int i4 = i + 1;
            if (buildLines[i].left > buildLines[i4].right) {
                drawLines(canvas, buildLines, i2, i3, dpToPx, intValue);
                i3 = 0;
                i2 = i4;
            }
            i3++;
            i = i4;
        }
        drawLines(canvas, buildLines, i2, i3, dpToPx, intValue);
    }

    private final void coalesceInvisibleLeftBounds(Rect[] lines) {
        int i;
        int length = lines.length;
        int i2 = ((Rect) ArraysKt.first(lines)).left;
        int i3 = ((Rect) ArraysKt.first(lines)).top;
        int length2 = lines.length;
        int i4 = 0;
        while (i4 < length2) {
            Rect rect = lines[i4];
            int i5 = rect.bottom - i3;
            i4++;
            for (int i6 = i4; i6 < length; i6++) {
                Rect rect2 = lines[i6];
                int i7 = rect2.top;
                int i8 = rect.bottom;
                if (i7 >= i8) {
                    break;
                }
                i = rect2.left;
                if (i <= rect.left) {
                    i5 -= i8 - i7;
                    break;
                }
            }
            i = Integer.MIN_VALUE;
            if (i5 <= 0) {
                rect.left = Math.max(i2, i);
                i5 = 0;
            } else {
                i2 = rect.left;
            }
            i3 += i5;
        }
    }

    private final void coalesceInvisibleRightBounds(Rect[] lines) {
        int i;
        int length = lines.length;
        int i2 = ((Rect) ArraysKt.first(lines)).right;
        int i3 = ((Rect) ArraysKt.first(lines)).top;
        int length2 = lines.length;
        int i4 = 0;
        while (i4 < length2) {
            Rect rect = lines[i4];
            int i5 = rect.bottom - i3;
            i4++;
            for (int i6 = i4; i6 < length; i6++) {
                Rect rect2 = lines[i6];
                int i7 = rect2.top;
                int i8 = rect.bottom;
                if (i7 >= i8) {
                    break;
                }
                i = rect2.right;
                if (i >= rect.right) {
                    i5 -= i8 - i7;
                    break;
                }
            }
            i = Integer.MAX_VALUE;
            if (i5 <= 0) {
                rect.right = Math.min(i2, i);
                i5 = 0;
            } else {
                i2 = rect.right;
            }
            i3 += i5;
        }
    }

    private final void coalesceCloseBounds(int[] lines, int minDelta) {
        boolean z;
        int i = 0;
        do {
            IntProgression indices = i % 2 == 0 ? ArraysKt.getIndices(lines) : RangesKt.reversed(ArraysKt.getIndices(lines));
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                z = false;
                while (true) {
                    int i2 = first == 0 ? 0 : lines[first - 1] - lines[first];
                    int i3 = first == ArraysKt.getLastIndex(lines) ? 0 : lines[first + 1] - lines[first];
                    if ((i2 <= 0 || i2 >= minDelta) && (i3 <= 0 || i3 >= minDelta)) {
                        if (first != 0 && i2 < 0 && Math.abs(i2) < minDelta) {
                            lines[first - 1] = lines[first];
                            z = true;
                        }
                        if (first != ArraysKt.getLastIndex(lines) && i3 < 0 && Math.abs(i3) < minDelta) {
                            lines[first + 1] = lines[first];
                            z = true;
                        }
                    }
                    if (first == last) {
                        break;
                    } else {
                        first += step;
                    }
                }
            } else {
                z = false;
            }
            i++;
        } while (z);
    }

    private final void drawLines(Canvas canvas, Rect[] lines, int start, int lineCount, int cornerRadius, @ColorInt int fillColor) {
        float f;
        boolean z = true;
        if (lineCount < 1) {
            return;
        }
        Rect rect = lines[start];
        Rect rect2 = lines[(start + lineCount) - 1];
        int[] buildLeftSegments = buildLeftSegments(lines, start, lineCount);
        int[] buildRightSegments = buildRightSegments(lines, start, lineCount);
        this.path.reset();
        float f2 = cornerRadius;
        float f3 = 2.0f;
        float min = Math.min(f2, Math.min(rect.width() / 2.0f, buildRightSegments[1] / 2.0f));
        this.path.moveTo(rect.right - min, rect.top);
        this.path.rQuadTo(min * 0.9f, min * 0.1f, min, min);
        boolean z2 = false;
        int i = 2;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, buildRightSegments.length - 1, 2);
        float f4 = 0.0f;
        if (progressionLastElement >= 0) {
            int i2 = 0;
            while (true) {
                boolean z3 = i2 >= buildRightSegments.length - i ? z : z2;
                float f5 = buildRightSegments[i2];
                float f6 = buildRightSegments[i2 + 1];
                float f7 = z3 ? f4 : buildRightSegments[i2 + 3];
                f = Math.min(f2, Math.min(Math.abs(f5) / f3, f6 / f3));
                this.path.rLineTo(f4, (f6 - min) - f);
                this.path.rQuadTo(Math.signum(f5) * min * 0.1f, f * 0.9f, f * Math.signum(f5), f);
                if (!z3) {
                    min = Math.min(f2, Math.min(Math.abs(f5) / 2.0f, f7 / 2.0f));
                    this.path.rLineTo(f5 - ((min + f) * Math.signum(f5)), 0.0f);
                    this.path.rQuadTo(min * 0.9f * Math.signum(f5), min * 0.1f, Math.signum(f5) * min, min);
                }
                if (i2 == progressionLastElement) {
                    break;
                }
                i2 += 2;
                z = true;
                f3 = 2.0f;
                z2 = false;
                i = 2;
                f4 = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        boolean z4 = true;
        float min2 = Math.min(f2, Math.min(rect2.width() / 2.0f, (-buildLeftSegments[1]) / 2.0f));
        this.path.rLineTo((-rect2.width()) + f + min2, 0.0f);
        float f8 = -0.9f;
        float f9 = -min2;
        this.path.rQuadTo(min2 * (-0.9f), min2 * (-0.1f), f9, f9);
        boolean z5 = false;
        int i3 = 2;
        int progressionLastElement2 = ProgressionUtilKt.getProgressionLastElement(0, buildLeftSegments.length - 1, 2);
        if (progressionLastElement2 >= 0) {
            int i4 = 0;
            while (true) {
                boolean z6 = i4 >= buildLeftSegments.length - i3 ? z4 : z5;
                float f10 = buildLeftSegments[i4];
                float f11 = buildLeftSegments[i4 + 1];
                float f12 = z6 ? 0.0f : buildLeftSegments[i4 + 3];
                float min3 = Math.min(f2, Math.min(Math.abs(f10) / 2.0f, (-f11) / 2.0f));
                this.path.rLineTo(0.0f, f11 + min2 + min3);
                this.path.rQuadTo(min3 * 0.1f * Math.signum(f10), min3 * f8, min3 * Math.signum(f10), -min3);
                if (!z6) {
                    min2 = Math.min(f2, Math.min(Math.abs(f10) / 2.0f, (-f12) / 2.0f));
                    this.path.rLineTo(f10 - ((min3 + min2) * Math.signum(f10)), 0.0f);
                    this.path.rQuadTo(min2 * 0.9f * Math.signum(f10), min2 * (-0.1f), Math.signum(f10) * min2, -min2);
                }
                if (i4 == progressionLastElement2) {
                    break;
                }
                i4 += 2;
                z4 = true;
                f8 = -0.9f;
                z5 = false;
                i3 = 2;
            }
        }
        this.path.close();
        this.paint.setColor(fillColor);
        canvas.drawPath(this.path, this.paint);
    }

    private final int[] buildLeftSegments(Rect[] lines, int start, int lineCount) {
        int i = (start + lineCount) - 1;
        if (lineCount == 1) {
            return new int[]{lines[i].width(), -lines[i].height()};
        }
        Rect rect = lines[i];
        int i2 = rect.left;
        int i3 = rect.bottom;
        int[] iArr = new int[lineCount * 2];
        int i4 = 0;
        if (start <= i) {
            int i5 = 0;
            while (true) {
                Rect rect2 = lines[i];
                int i6 = rect2.left;
                if (i6 != i2) {
                    iArr[i5 * 2] = i6 - i2;
                    i5++;
                    i2 = i6;
                }
                int i7 = rect2.top - i3;
                int i8 = i - 1;
                while (true) {
                    if (i8 < start) {
                        break;
                    }
                    Rect rect3 = lines[i8];
                    int i9 = rect3.bottom;
                    int i10 = rect2.top;
                    if (i9 <= i10) {
                        break;
                    }
                    if (rect3.left <= rect2.left) {
                        i7 -= i10 - i9;
                        break;
                    }
                    i8--;
                }
                int coerceAtMost = RangesKt.coerceAtMost(i7, 0);
                int i11 = (i5 * 2) + 1;
                iArr[i11] = iArr[i11] + coerceAtMost;
                i3 += coerceAtMost;
                if (i == start) {
                    break;
                }
                i--;
            }
            i4 = i5;
        }
        iArr[i4 * 2] = lines[start].width();
        int[] copyOf = Arrays.copyOf(iArr, (i4 + 1) * 2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    private final int[] buildRightSegments(Rect[] lines, int start, int lineCount) {
        int i = start;
        int i2 = (i + lineCount) - 1;
        if (lineCount == 1) {
            return new int[]{-lines[i].width(), lines[i].height()};
        }
        Rect rect = lines[i];
        int i3 = rect.right;
        int i4 = rect.top;
        int[] iArr = new int[lineCount * 2];
        int i5 = 0;
        if (i <= i2) {
            int i6 = 0;
            while (true) {
                Rect rect2 = lines[i];
                int i7 = rect2.right;
                if (i7 != i3) {
                    iArr[i6 * 2] = i7 - i3;
                    i6++;
                    i3 = i7;
                }
                int i8 = rect2.bottom - i4;
                int i9 = i + 1;
                int i10 = i9;
                while (true) {
                    if (i10 > i2) {
                        break;
                    }
                    Rect rect3 = lines[i10];
                    int i11 = rect3.top;
                    int i12 = rect2.bottom;
                    if (i11 >= i12) {
                        break;
                    }
                    if (rect3.right >= rect2.right) {
                        i8 -= i12 - i11;
                        break;
                    }
                    i10++;
                }
                int coerceAtLeast = RangesKt.coerceAtLeast(i8, 0);
                int i13 = (i6 * 2) + 1;
                iArr[i13] = iArr[i13] + coerceAtLeast;
                i4 += coerceAtLeast;
                if (i == i2) {
                    break;
                }
                i = i9;
            }
            i5 = i6;
        }
        iArr[i5 * 2] = -lines[i2].width();
        int[] copyOf = Arrays.copyOf(iArr, (i5 + 1) * 2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    /* compiled from: CloudTextRangeBackgroundRenderer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/util/text/CloudTextRangeBackgroundRenderer$Companion;", "", "()V", "OFFSET_SEGMENT_DELTA_X", "", "OFFSET_SEGMENT_DELTA_Y", "SEGMENT_VALUES", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final Rect[] buildLines(Layout layout, int startLine, int endLine, int startOffset, int endOffset, int cornerRadius, Rect padding) {
        int i = endLine - startLine;
        int i2 = i + 1;
        if (i2 != 0) {
            Rect[] rectArr = new Rect[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i4 = startLine + i3;
                rectArr[i3] = new Rect((i3 == 0 ? startOffset : MathKt.roundToInt(layout.getLineLeft(startLine + i3))) - padding.left, layout.getLineTop(i4) - padding.top, (i3 == i ? endOffset : MathKt.roundToInt(layout.getLineRight(i4))) + padding.right, layout.getLineBottom(i4) + padding.bottom);
                i3++;
            }
            coalesceInvisibleLeftBounds(rectArr);
            coalesceInvisibleRightBounds(rectArr);
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            for (int i5 = 0; i5 < i2; i5++) {
                Rect rect = rectArr[i5];
                iArr[i5] = -rect.left;
                iArr2[i5] = rect.right;
            }
            int i6 = cornerRadius * 2;
            coalesceCloseBounds(iArr, i6);
            coalesceCloseBounds(iArr2, i6);
            for (int i7 = 0; i7 < i2; i7++) {
                Rect rect2 = rectArr[i7];
                rect2.left = -iArr[i7];
                rect2.right = iArr2[i7];
            }
            return rectArr;
        }
        return new Rect[0];
    }
}
