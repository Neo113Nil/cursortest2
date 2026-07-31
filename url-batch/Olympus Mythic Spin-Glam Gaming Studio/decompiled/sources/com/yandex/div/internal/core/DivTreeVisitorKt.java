package com.yandex.div.internal.core;

import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div2.Div;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTreeVisitor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"getChildContext", "Lcom/yandex/div/core/view2/BindingContext;", "div", "Lcom/yandex/div2/Div;", "path", "Lcom/yandex/div/core/state/DivStatePath;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DivTreeVisitorKt {
    @NotNull
    public static final BindingContext getChildContext(@NotNull BindingContext bindingContext, @NotNull Div div, @NotNull DivStatePath divStatePath) {
        return bindingContext.getFor(bindingContext.getDivView().getRuntimeStore().getOrCreateRuntime(divStatePath, div, bindingContext.getExpressionResolver()).getExpressionResolver());
    }
}
