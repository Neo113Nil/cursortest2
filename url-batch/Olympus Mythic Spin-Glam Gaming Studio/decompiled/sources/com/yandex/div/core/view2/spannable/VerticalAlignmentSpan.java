package com.yandex.div.core.view2.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.LineBackgroundSpan;
import androidx.annotation.Px;
import androidx.core.util.Pools;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.safedk.android.analytics.reporters.b;
import java.util.LinkedList;
import java.util.Queue;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: VerticalAlignmentSpan.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ`\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0016J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020#H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/yandex/div/core/view2/spannable/VerticalAlignmentSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/LineBackgroundSpan;", "fontSize", "", "alignment", "Lcom/yandex/div/core/view2/spannable/TextVerticalAlignment;", "layoutProvider", "Ljavax/inject/Provider;", "Landroid/text/Layout;", "(ILcom/yandex/div/core/view2/spannable/TextVerticalAlignment;Ljavax/inject/Provider;)V", "fontMetrics", "Landroid/graphics/Paint$FontMetricsInt;", b.d, "Ljava/util/Queue;", "", "textDrawWasCalled", "", "drawBackground", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "left", "right", ViewHierarchyConstants.DIMENSION_TOP_KEY, "baseline", "bottom", "text", "", "start", "end", "lineNumber", "updateDrawState", "Landroid/text/TextPaint;", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VerticalAlignmentSpan extends CharacterStyle implements LineBackgroundSpan {
    private static final int INDEX_LINE_ASCENT = 0;
    private static final int INDEX_LINE_DESCENT = 1;

    @NotNull
    private final TextVerticalAlignment alignment;
    private final int fontSize;

    @NotNull
    private final Provider layoutProvider;
    private boolean textDrawWasCalled;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Pools.SimplePool<int[]> LINE_POOL = new Pools.SimplePool<>(16);

    @NotNull
    private final Paint.FontMetricsInt fontMetrics = new Paint.FontMetricsInt();

    @NotNull
    private final Queue<int[]> lines = new LinkedList();

    /* compiled from: VerticalAlignmentSpan.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextVerticalAlignment.values().length];
            try {
                iArr[TextVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextVerticalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextVerticalAlignment.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextVerticalAlignment.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VerticalAlignmentSpan(@Px int i, @NotNull TextVerticalAlignment textVerticalAlignment, @NotNull Provider provider) {
        this.fontSize = i;
        this.alignment = textVerticalAlignment;
        this.layoutProvider = provider;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(@NotNull Canvas canvas, @NotNull Paint paint, int left, int right, int top, int baseline, int bottom, @NotNull CharSequence text, int start, int end, int lineNumber) {
        if (this.textDrawWasCalled) {
            this.lines.clear();
        }
        this.textDrawWasCalled = false;
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        if (start > spanned.getSpanEnd(this) || spanStart > end) {
            return;
        }
        Layout layout = (Layout) this.layoutProvider.get();
        int roundToInt = lineNumber == layout.getLineCount() - 1 ? 0 : MathKt.roundToInt(layout.getSpacingAdd());
        int[] iArr = (int[]) LINE_POOL.acquire();
        if (iArr == null) {
            iArr = new int[2];
        }
        iArr[0] = top - baseline;
        iArr[1] = (bottom - baseline) - roundToInt;
        this.lines.add(iArr);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint paint) {
        this.textDrawWasCalled = true;
        if (this.lines.isEmpty()) {
            return;
        }
        int[] remove = this.lines.remove();
        int i = remove[0];
        int i2 = remove[1];
        LINE_POOL.release(remove);
        int i3 = this.fontSize;
        if (i3 > 0) {
            paint.setTextSize(i3);
        }
        paint.getFontMetricsInt(this.fontMetrics);
        int i4 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i4 == 1) {
            paint.baselineShift += i - this.fontMetrics.ascent;
            return;
        }
        if (i4 != 2) {
            if (i4 != 4) {
                return;
            }
            paint.baselineShift += i2 - this.fontMetrics.descent;
        } else {
            Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
            paint.baselineShift += ((i + i2) / 2) - ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2);
        }
    }

    /* compiled from: VerticalAlignmentSpan.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/view2/spannable/VerticalAlignmentSpan$Companion;", "", "()V", "INDEX_LINE_ASCENT", "", "INDEX_LINE_DESCENT", "LINE_POOL", "Landroidx/core/util/Pools$SimplePool;", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
