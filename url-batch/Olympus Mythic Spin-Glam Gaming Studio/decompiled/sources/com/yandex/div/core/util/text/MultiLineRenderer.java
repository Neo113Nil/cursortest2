package com.yandex.div.core.util.text;

import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;
import io.appmetrica.analytics.impl.M2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTextRangesBackgroundRenderer.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JL\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/core/util/text/MultiLineRenderer;", "Lcom/yandex/div/core/util/text/DivTextRangesBackgroundRenderer;", "view", "Landroid/view/View;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "(Landroid/view/View;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "layout", "Landroid/text/Layout;", "startLine", "", "endLine", "startOffset", "endOffset", "border", "Lcom/yandex/div2/DivTextRangeBorder;", M2.g, "Lcom/yandex/div2/DivTextRangeBackground;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MultiLineRenderer extends DivTextRangesBackgroundRenderer {

    @NotNull
    private final ExpressionResolver resolver;

    @NotNull
    private final View view;

    public MultiLineRenderer(@NotNull View view, @NotNull ExpressionResolver expressionResolver) {
        this.view = view;
        this.resolver = expressionResolver;
    }

    @Override // com.yandex.div.core.util.text.DivTextRangesBackgroundRenderer
    public void draw(@NotNull Canvas canvas, @NotNull Layout layout, int startLine, int endLine, int startOffset, int endOffset, @Nullable DivTextRangeBorder border, @Nullable DivTextRangeBackground background) {
        float lineRight;
        float lineLeft;
        int paragraphDirection = layout.getParagraphDirection(startLine);
        if (paragraphDirection == -1) {
            lineRight = layout.getLineLeft(startLine);
        } else {
            lineRight = layout.getLineRight(startLine);
        }
        int lineBottom = getLineBottom(layout, startLine);
        int lineTop = getLineTop(layout, startLine);
        BackgroundDrawer backgroundDrawer = new BackgroundDrawer(this.view.getResources().getDisplayMetrics(), border, background, canvas, this.resolver);
        backgroundDrawer.drawBackgroundStart(startOffset, lineTop, (int) lineRight, lineBottom);
        for (int i = startLine + 1; i < endLine; i++) {
            backgroundDrawer.drawBackgroundMiddle((int) layout.getLineLeft(i), getLineTop(layout, i), (int) layout.getLineRight(i), getLineBottom(layout, i));
        }
        if (paragraphDirection == -1) {
            lineLeft = layout.getLineRight(startLine);
        } else {
            lineLeft = layout.getLineLeft(startLine);
        }
        backgroundDrawer.drawBackgroundEnd((int) lineLeft, getLineTop(layout, endLine), endOffset, getLineBottom(layout, endLine));
    }
}
