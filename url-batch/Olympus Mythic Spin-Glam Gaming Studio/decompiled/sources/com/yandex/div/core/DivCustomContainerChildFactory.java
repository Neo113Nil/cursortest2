package com.yandex.div.core;

import android.view.View;
import androidx.annotation.AnyThread;
import com.yandex.div.core.expression.local.ChildPathUnitCache;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivCustomContainerChildFactory.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0001¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007J*\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007J\u0014\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bH\u0002¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/DivCustomContainerChildFactory;", "", "()V", "bindChildView", "", "childView", "Landroid/view/View;", "childIndex", "", "div", "Lcom/yandex/div2/Div;", "divStatePath", "Lcom/yandex/div/core/state/DivStatePath;", "divView", "Lcom/yandex/div/core/view2/Div2View;", "expressionResolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "createChildView", "createUnboundChildView", "getChildPathUnit", "", "Lcom/yandex/div2/DivBase;", "index", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivCustomContainerChildFactory {
    @NotNull
    public final View createChildView(@NotNull Div div, @NotNull DivStatePath divStatePath, @NotNull Div2View div2View) {
        return createChildView$default(this, div, divStatePath, div2View, null, 8, null);
    }

    @AnyThread
    @NotNull
    public final View createUnboundChildView(@NotNull Div div, @NotNull DivStatePath divStatePath, @NotNull Div2View div2View) {
        return createUnboundChildView$default(this, div, divStatePath, div2View, null, 8, null);
    }

    public static /* synthetic */ View createChildView$default(DivCustomContainerChildFactory divCustomContainerChildFactory, Div div, DivStatePath divStatePath, Div2View div2View, ExpressionResolver expressionResolver, int i, Object obj) {
        if ((i & 8) != 0) {
            expressionResolver = div2View.getExpressionResolver();
        }
        return divCustomContainerChildFactory.createChildView(div, divStatePath, div2View, expressionResolver);
    }

    @NotNull
    public final View createChildView(@NotNull Div div, @NotNull DivStatePath divStatePath, @NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver) {
        return divView.getDiv2Component().getDiv2Builder().buildView(div, divView.getBindingContext().getFor(expressionResolver), divStatePath);
    }

    public static /* synthetic */ View createUnboundChildView$default(DivCustomContainerChildFactory divCustomContainerChildFactory, Div div, DivStatePath divStatePath, Div2View div2View, ExpressionResolver expressionResolver, int i, Object obj) {
        if ((i & 8) != 0) {
            expressionResolver = div2View.getExpressionResolver();
        }
        return divCustomContainerChildFactory.createUnboundChildView(div, divStatePath, div2View, expressionResolver);
    }

    @AnyThread
    @NotNull
    public final View createUnboundChildView(@NotNull Div div, @NotNull DivStatePath divStatePath, @NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver) {
        return divView.getDiv2Component().getDiv2Builder().createView(div, divView.getBindingContext().getFor(expressionResolver), divStatePath);
    }

    public final void bindChildView(@NotNull View childView, int childIndex, @NotNull Div div, @NotNull DivStatePath divStatePath, @NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver) {
        divView.getDiv2Component().getDivBinder().bind(divView.getBindingContext().getFor(expressionResolver), childView, div, divStatePath.appendDiv(getChildPathUnit(div.value(), childIndex)));
        divView.getRuntimeStore().showWarningIfNeeded(div.value());
    }

    private final String getChildPathUnit(DivBase divBase, int i) {
        if (divBase instanceof DivState) {
            return DivPathUtils.getId$div_release$default(DivPathUtils.INSTANCE, (DivState) divBase, null, 1, null);
        }
        String id = divBase.getId();
        return id == null ? ChildPathUnitCache.INSTANCE.getValue$div_release(i) : id;
    }
}
