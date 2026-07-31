package com.yandex.div.core.view2.spannable;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import androidx.annotation.Px;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LineHeightWithTopOffsetSpan.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J:\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/yandex/div/core/view2/spannable/LineHeightWithTopOffsetSpan;", "Landroid/text/style/LineHeightSpan;", "topOffset", "", "lineHeight", "topOffsetStart", "topOffsetEnd", "(IIII)V", "fontMetricsSaved", "", "savedAscent", "savedBottom", "savedDescent", "savedTop", "applyLineHeight", "", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "applyTopOffset", "chooseHeight", "text", "", "start", "end", "spanstartv", "lh", "restoreFontMetrics", "saveFontMetrics", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LineHeightWithTopOffsetSpan implements LineHeightSpan {
    private boolean fontMetricsSaved;
    private final int lineHeight;
    private final int topOffset;
    private final int topOffsetEnd;
    private final int topOffsetStart;
    private int savedTop = Integer.MAX_VALUE;
    private int savedAscent = Integer.MAX_VALUE;
    private int savedDescent = Integer.MAX_VALUE;
    private int savedBottom = Integer.MAX_VALUE;

    public LineHeightWithTopOffsetSpan(@Px int i, @Px int i2, int i3, int i4) {
        this.topOffset = i;
        this.lineHeight = i2;
        this.topOffsetStart = i3;
        this.topOffsetEnd = i4;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@Nullable CharSequence text, int start, int end, int spanstartv, int lh, @NotNull Paint.FontMetricsInt fm) {
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        if (start > spanned.getSpanEnd(this) || spanStart > end) {
            return;
        }
        if (this.fontMetricsSaved) {
            restoreFontMetrics(fm);
        } else {
            this.fontMetricsSaved = true;
            saveFontMetrics(fm);
        }
        Object[] spans = spanned.getSpans(start, end, LineHeightWithTopOffsetSpan.class);
        int i = this.lineHeight;
        for (Object obj : spans) {
            i = Math.max(i, ((LineHeightWithTopOffsetSpan) obj).lineHeight);
        }
        applyLineHeight(i, fm);
        int i2 = this.topOffsetStart;
        if (i2 == spanStart && start <= i2 && i2 <= end) {
            applyTopOffset(fm);
        }
        if (StringsKt.contains$default((CharSequence) text.subSequence(start, end).toString(), (CharSequence) "\n", false, 2, (Object) null)) {
            this.fontMetricsSaved = false;
        }
    }

    private final void applyLineHeight(int lineHeight, Paint.FontMetricsInt fm) {
        if (lineHeight <= 0) {
            return;
        }
        int i = fm.descent;
        int i2 = fm.ascent;
        int i3 = i - i2;
        int i4 = fm.top - i2;
        int i5 = fm.bottom - i;
        if (i3 >= 0) {
            int i6 = lineHeight - i3;
            if (i6 < 0) {
                int coerceAtMost = RangesKt.coerceAtMost(i2 - (i6 / 2), 0);
                fm.ascent = coerceAtMost;
                fm.descent = RangesKt.coerceAtLeast(coerceAtMost + lineHeight, 0);
            } else {
                int coerceAtLeast = RangesKt.coerceAtLeast(i + (i6 / 2), 0);
                fm.descent = coerceAtLeast;
                fm.ascent = RangesKt.coerceAtMost(coerceAtLeast - lineHeight, 0);
            }
            fm.top = fm.ascent + i4;
            fm.bottom = fm.descent + i5;
        }
    }

    private final void applyTopOffset(Paint.FontMetricsInt fm) {
        int i = this.topOffset;
        if (i <= 0) {
            return;
        }
        fm.top -= i;
        fm.ascent -= i;
    }

    private final void saveFontMetrics(Paint.FontMetricsInt fm) {
        this.savedTop = fm.top;
        this.savedAscent = fm.ascent;
        this.savedDescent = fm.descent;
        this.savedBottom = fm.bottom;
    }

    private final void restoreFontMetrics(Paint.FontMetricsInt fm) {
        fm.top = this.savedTop;
        fm.ascent = this.savedAscent;
        fm.descent = this.savedDescent;
        fm.bottom = this.savedBottom;
    }
}
