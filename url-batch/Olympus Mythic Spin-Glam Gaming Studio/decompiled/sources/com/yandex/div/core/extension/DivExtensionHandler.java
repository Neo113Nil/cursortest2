package com.yandex.div.core.extension;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivBase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivExtensionHandler.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J(\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/extension/DivExtensionHandler;", "", "beforeBindView", "", "divView", "Lcom/yandex/div/core/view2/Div2View;", "expressionResolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "view", "Landroid/view/View;", "div", "Lcom/yandex/div2/DivBase;", "bindView", "matches", "", "preprocess", "unbindView", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface DivExtensionHandler {
    default void beforeBindView(@NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull DivBase div) {
    }

    void bindView(@NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull DivBase div);

    boolean matches(@NotNull DivBase div);

    default void preprocess(@NotNull DivBase div, @NotNull ExpressionResolver expressionResolver) {
    }

    void unbindView(@NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull DivBase div);
}
