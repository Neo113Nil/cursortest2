package com.yandex.div.core.util.text;

import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTextRangeBorder;
import kotlin.Metadata;

/* compiled from: DivTextRangesBackgroundRenderer.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"DEFAULT_LINESPACING_EXTRA", "", "DEFAULT_LINESPACING_MULTIPLIER", "getCornerRadii", "", "Lcom/yandex/div2/DivTextRangeBorder;", "metrics", "Landroid/util/DisplayMetrics;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DivTextRangesBackgroundRendererKt {
    private static final float DEFAULT_LINESPACING_EXTRA = 0.0f;
    private static final float DEFAULT_LINESPACING_MULTIPLIER = 1.0f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] getCornerRadii(DivTextRangeBorder divTextRangeBorder, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        Expression expression = divTextRangeBorder.cornerRadius;
        float dpToPx = BaseDivViewExtensionsKt.dpToPx(expression != null ? (Long) expression.evaluate(expressionResolver) : null, displayMetrics);
        return new float[]{dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx};
    }
}
