package com.yandex.div.core.tooltip;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBase;
import javax.inject.Provider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTooltipViewBuilder.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J,\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0012R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/tooltip/DivTooltipViewBuilder;", "", "div2Builder", "Ljavax/inject/Provider;", "Lcom/yandex/div/core/view2/Div2Builder;", "(Ljavax/inject/Provider;)V", "buildTooltipView", "Lcom/yandex/div/core/tooltip/DivTooltipContainer;", "context", "Lcom/yandex/div/core/view2/BindingContext;", "div", "Lcom/yandex/div2/Div;", "width", "", "height", "prepareTooltipView", "Landroid/view/View;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes4.dex */
public class DivTooltipViewBuilder {

    @NotNull
    private final Provider div2Builder;

    public DivTooltipViewBuilder(@NotNull Provider provider) {
        this.div2Builder = provider;
    }

    public static /* synthetic */ DivTooltipContainer buildTooltipView$default(DivTooltipViewBuilder divTooltipViewBuilder, BindingContext bindingContext, Div div, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildTooltipView");
        }
        if ((i3 & 4) != 0) {
            i = -2;
        }
        if ((i3 & 8) != 0) {
            i2 = -2;
        }
        return divTooltipViewBuilder.buildTooltipView(bindingContext, div, i, i2);
    }

    @NotNull
    public DivTooltipContainer buildTooltipView(@NotNull BindingContext context, @NotNull Div div, int width, int height) {
        View prepareTooltipView = prepareTooltipView(context, div);
        DivTooltipContainer divTooltipContainer = new DivTooltipContainer(context.getDivView().getContext(), null, 0, 6, null);
        divTooltipContainer.addView(prepareTooltipView);
        divTooltipContainer.setLayoutParams(new ViewGroup.LayoutParams(width, height));
        return divTooltipContainer;
    }

    private View prepareTooltipView(BindingContext context, Div div) {
        DivBase value = div.value();
        View buildView = ((Div2Builder) this.div2Builder.get()).buildView(div, context, DivStatePath.INSTANCE.fromRootDiv$div_release(0L, div));
        ExpressionResolver expressionResolver = context.getExpressionResolver();
        DisplayMetrics displayMetrics = buildView.getContext().getResources().getDisplayMetrics();
        buildView.setLayoutParams(new RelativeLayout.LayoutParams(DivUtilKt.toLayoutParamsSize$default(value.getWidth(), displayMetrics, expressionResolver, null, 4, null), DivUtilKt.toLayoutParamsSize$default(value.getHeight(), displayMetrics, expressionResolver, null, 4, null)));
        buildView.setFocusable(true);
        return buildView;
    }
}
