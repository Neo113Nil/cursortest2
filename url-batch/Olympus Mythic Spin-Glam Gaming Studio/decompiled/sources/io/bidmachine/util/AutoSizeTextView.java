package io.bidmachine.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AutoSizeTextView.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB+\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\tH\u0002J'\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\t2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\"H\u0082\bJ \u0010#\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\tH\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0014J0\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0014J*\u00101\u001a\u00020(2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\tH\u0014J\u0018\u00105\u001a\u00020(2\u0006\u0010&\u001a\u00020\t2\u0006\u00106\u001a\u00020\tH\u0002J\u0010\u00107\u001a\u00020(2\u0006\u00108\u001a\u00020\tH\u0016J\u0012\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u000209H\u0002J\u0012\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u000209H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lio/bidmachine/util/AutoSizeTextView;", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "autoTextScaleXStepDelta", "", "autoTextSizeStepPx", "isBalanceText", "", "isStretchingTextByHeight", "isStretchingTextByWidth", "staticLayouts", "", "Landroid/text/StaticLayout;", "balanceTextLines", "", "", "text", "", "paint", "Landroid/graphics/Paint;", "lineCount", "calculateTextScaleX", "width", "lineWidthAction", "Lkotlin/Function0;", "createStaticLayout", "textPaint", "Landroid/text/TextPaint;", "viewWidth", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "onTextChanged", "start", "lengthBefore", "lengthAfter", "resizeText", "viewHeight", "setTextColor", "color", "Landroid/text/Layout;", "getOptimalTextLines", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public class AutoSizeTextView extends TextView {
    private float autoTextScaleXStepDelta;
    private float autoTextSizeStepPx;
    private boolean isBalanceText;
    private boolean isStretchingTextByHeight;
    private boolean isStretchingTextByWidth;

    @NotNull
    private final List<StaticLayout> staticLayouts;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public AutoSizeTextView(@Nullable Context context) {
        super(context);
        this.staticLayouts = new CopyOnWriteArrayList();
        this.isStretchingTextByHeight = true;
        this.isStretchingTextByWidth = true;
        this.isBalanceText = true;
        this.autoTextSizeStepPx = 2.0f;
        this.autoTextScaleXStepDelta = 0.02f;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.autoTextSizeStepPx = DeviceUtilsKt.getScreenDensity(context2);
        getPaint().setColor(getCurrentTextColor());
        getPaint().setAntiAlias(true);
        getPaint().setSubpixelText(true);
    }

    public AutoSizeTextView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.staticLayouts = new CopyOnWriteArrayList();
        this.isStretchingTextByHeight = true;
        this.isStretchingTextByWidth = true;
        this.isBalanceText = true;
        this.autoTextSizeStepPx = 2.0f;
        this.autoTextScaleXStepDelta = 0.02f;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.autoTextSizeStepPx = DeviceUtilsKt.getScreenDensity(context2);
        getPaint().setColor(getCurrentTextColor());
        getPaint().setAntiAlias(true);
        getPaint().setSubpixelText(true);
    }

    public AutoSizeTextView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.staticLayouts = new CopyOnWriteArrayList();
        this.isStretchingTextByHeight = true;
        this.isStretchingTextByWidth = true;
        this.isBalanceText = true;
        this.autoTextSizeStepPx = 2.0f;
        this.autoTextScaleXStepDelta = 0.02f;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.autoTextSizeStepPx = DeviceUtilsKt.getScreenDensity(context2);
        getPaint().setColor(getCurrentTextColor());
        getPaint().setAntiAlias(true);
        getPaint().setSubpixelText(true);
    }

    public AutoSizeTextView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.staticLayouts = new CopyOnWriteArrayList();
        this.isStretchingTextByHeight = true;
        this.isStretchingTextByWidth = true;
        this.isBalanceText = true;
        this.autoTextSizeStepPx = 2.0f;
        this.autoTextScaleXStepDelta = 0.02f;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.autoTextSizeStepPx = DeviceUtilsKt.getScreenDensity(context2);
        getPaint().setColor(getCurrentTextColor());
        getPaint().setAntiAlias(true);
        getPaint().setSubpixelText(true);
    }

    @Override // android.widget.TextView
    public void setTextColor(int color) {
        super.setTextColor(color);
        getPaint().setColor(color);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(@Nullable CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        resizeText((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingBottom()) - getPaddingTop());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (changed) {
            resizeText(((right - left) - getPaddingLeft()) - getPaddingRight(), ((bottom - top) - getPaddingBottom()) - getPaddingTop());
        }
        super.onLayout(changed, left, top, right, bottom);
    }

    private final void resizeText(int viewWidth, int viewHeight) {
        if (viewWidth <= 0 || viewHeight <= 0) {
            return;
        }
        CharSequence text = getText();
        Intrinsics.checkNotNullExpressionValue(text, "text");
        TextPaint paint = getPaint();
        paint.setTextScaleX(1.0f);
        Intrinsics.checkNotNullExpressionValue(paint, "paint.apply {\n          …xtScaleX = 1.0F\n        }");
        TextPaint textPaint = new TextPaint(paint);
        float f = viewHeight;
        StaticLayout staticLayout = null;
        while (f > 0.0f) {
            textPaint.setTextSize(f);
            staticLayout = createStaticLayout(text, textPaint, viewWidth);
            if (staticLayout.getHeight() <= viewHeight) {
                break;
            } else {
                f -= this.autoTextSizeStepPx;
            }
        }
        if (staticLayout == null) {
            return;
        }
        if (this.isStretchingTextByHeight) {
            if (staticLayout.getLineCount() == 0) {
                return;
            }
            float height = ((viewHeight - staticLayout.getHeight()) / r2) + f;
            if (height == 0.0f) {
                return;
            }
            paint.setTextScaleX(f / height);
            f = height;
        }
        paint.setTextSize(f);
        this.staticLayouts.clear();
        for (String str : getOptimalTextLines(createStaticLayout(text, paint, viewWidth))) {
            TextPaint textPaint2 = new TextPaint(paint);
            if (this.isStretchingTextByWidth) {
                float textScaleX = textPaint2.getTextScaleX();
                float f2 = viewWidth;
                float measureText = f2 / textPaint2.measureText(str);
                float f3 = this.autoTextScaleXStepDelta * measureText;
                textPaint2.setTextScaleX(measureText);
                while (textPaint2.measureText(str) > f2) {
                    measureText -= f3;
                    textPaint2.setTextScaleX(measureText);
                }
                textPaint2.setTextScaleX(textScaleX);
                textPaint2.setTextScaleX(measureText);
            }
            this.staticLayouts.add(createStaticLayout(str, textPaint2, viewWidth));
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.staticLayouts.isEmpty()) {
            super.onDraw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            for (StaticLayout staticLayout : this.staticLayouts) {
                float maxLineWidth = ViewUtilsKt.getMaxLineWidth(staticLayout);
                float width = maxLineWidth < ((float) staticLayout.getWidth()) ? (staticLayout.getWidth() - maxLineWidth) / 2 : 0.0f;
                canvas.translate(width, 0.0f);
                staticLayout.draw(canvas);
                canvas.translate(-width, staticLayout.getHeight());
            }
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    private final StaticLayout createStaticLayout(CharSequence text, TextPaint textPaint, int viewWidth) {
        StaticLayout build = StaticLayout.Builder.obtain(text, 0, text.length(), textPaint, viewWidth).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(false).build();
        Intrinsics.checkNotNullExpressionValue(build, "{\n            StaticLayo…       .build()\n        }");
        return build;
    }

    private final List<String> getOptimalTextLines(Layout layout) {
        if (this.isBalanceText) {
            List<String> balanceTextLines = balanceTextLines(layout);
            if (balanceTextLines.size() == layout.getLineCount()) {
                return balanceTextLines;
            }
        }
        return ViewUtilsKt.getTextList(layout);
    }

    private final List<String> balanceTextLines(Layout layout) {
        CharSequence text = layout.getText();
        Intrinsics.checkNotNullExpressionValue(text, "text");
        TextPaint paint = layout.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "paint");
        return balanceTextLines(text, paint, layout.getLineCount());
    }

    private final List<String> balanceTextLines(CharSequence text, Paint paint, int lineCount) {
        if (lineCount <= 1) {
            return CollectionsKt.listOf(text.toString());
        }
        List<String> split$default = StringsKt.split$default(text, new String[]{" "}, false, 0, 6, (Object) null);
        if (split$default.size() <= lineCount) {
            return split$default;
        }
        float measureText = ViewUtilsKt.measureText(paint, text) / lineCount;
        float measureText2 = paint.measureText(" ");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        float f = 0.0f;
        for (String str : split$default) {
            float measureText3 = paint.measureText(str);
            if (sb.length() > 0 && f + measureText2 + measureText3 > measureText && arrayList.size() < lineCount - 1) {
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "currentLine.toString()");
                arrayList.add(sb2);
                sb = new StringBuilder(str);
                f = measureText3;
            } else {
                if (sb.length() > 0) {
                    sb.append(' ');
                    f += measureText2;
                }
                sb.append(str);
                f += measureText3;
            }
        }
        if (sb.length() > 0) {
            String sb3 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "currentLine.toString()");
            arrayList.add(sb3);
        }
        return arrayList;
    }

    private final float calculateTextScaleX(Paint paint, int width, Function0 lineWidthAction) {
        float textScaleX = paint.getTextScaleX();
        float f = width;
        float floatValue = f / ((Number) lineWidthAction.mo4828invoke()).floatValue();
        float f2 = this.autoTextScaleXStepDelta * floatValue;
        paint.setTextScaleX(floatValue);
        while (((Number) lineWidthAction.mo4828invoke()).floatValue() > f) {
            floatValue -= f2;
            paint.setTextScaleX(floatValue);
        }
        paint.setTextScaleX(textScaleX);
        return floatValue;
    }
}
