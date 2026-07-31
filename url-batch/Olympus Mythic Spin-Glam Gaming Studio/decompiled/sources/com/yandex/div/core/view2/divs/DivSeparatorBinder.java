package com.yandex.div.core.view2.divs;

import com.yandex.div.R;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivSeparator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivSeparatorBinder.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\u00020\t*\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J&\u0010\u000e\u001a\u00020\t*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0014J(\u0010\u0013\u001a\u00020\t*\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivSeparatorBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/Div$Separator;", "Lcom/yandex/div2/DivSeparator;", "Lcom/yandex/div/core/view2/divs/widgets/DivSeparatorView;", "baseBinder", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;)V", "applyStyle", "", "style", "Lcom/yandex/div2/DivSeparator$DelimiterStyle;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "bind", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "div", "oldDiv", "bindStyle", "newStyle", "oldStyle", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes4.dex */
public final class DivSeparatorBinder extends DivViewBinder<Div.Separator, DivSeparator, DivSeparatorView> {
    public DivSeparatorBinder(@NotNull DivBaseBinder divBaseBinder) {
        super(divBaseBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivSeparatorView divSeparatorView, @NotNull BindingContext bindingContext, @NotNull DivSeparator divSeparator, @Nullable DivSeparator divSeparator2) {
        BaseDivViewExtensionsKt.applyDivActions(divSeparatorView, bindingContext, divSeparator.action, divSeparator.actions, divSeparator.longtapActions, divSeparator.doubletapActions, divSeparator.hoverStartActions, divSeparator.hoverEndActions, divSeparator.pressStartActions, divSeparator.pressEndActions, divSeparator.actionAnimation, divSeparator.captureFocusOnAction);
        bindStyle(divSeparatorView, divSeparator.delimiterStyle, divSeparator2 != null ? divSeparator2.delimiterStyle : null, bindingContext.getExpressionResolver());
        divSeparatorView.setDividerHeightResource(R.dimen.div_separator_delimiter_height);
        divSeparatorView.setDividerGravity(17);
    }

    private final void bindStyle(final DivSeparatorView divSeparatorView, final DivSeparator.DelimiterStyle delimiterStyle, DivSeparator.DelimiterStyle delimiterStyle2, final ExpressionResolver expressionResolver) {
        Expression expression;
        Expression expression2;
        Disposable disposable = null;
        if (ExpressionsKt.equalsToConstant(delimiterStyle != null ? delimiterStyle.color : null, delimiterStyle2 != null ? delimiterStyle2.color : null)) {
            if (ExpressionsKt.equalsToConstant(delimiterStyle != null ? delimiterStyle.orientation : null, delimiterStyle2 != null ? delimiterStyle2.orientation : null)) {
                return;
            }
        }
        applyStyle(divSeparatorView, delimiterStyle, expressionResolver);
        if (ExpressionsKt.isConstantOrNull(delimiterStyle != null ? delimiterStyle.color : null)) {
            if (ExpressionsKt.isConstantOrNull(delimiterStyle != null ? delimiterStyle.orientation : null)) {
                return;
            }
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivSeparatorBinder$bindStyle$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7214invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7214invoke(@NotNull Object obj) {
                DivSeparatorBinder.this.applyStyle(divSeparatorView, delimiterStyle, expressionResolver);
            }
        };
        divSeparatorView.addSubscription((delimiterStyle == null || (expression2 = delimiterStyle.color) == null) ? null : expression2.observe(expressionResolver, function1));
        if (delimiterStyle != null && (expression = delimiterStyle.orientation) != null) {
            disposable = expression.observe(expressionResolver, function1);
        }
        divSeparatorView.addSubscription(disposable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyStyle(DivSeparatorView divSeparatorView, DivSeparator.DelimiterStyle delimiterStyle, ExpressionResolver expressionResolver) {
        if (delimiterStyle == null) {
            divSeparatorView.setDividerColor(DivSeparatorView.DEFAULT_DIVIDER_COLOR);
            divSeparatorView.setHorizontal(true);
        } else {
            divSeparatorView.setDividerColor(((Number) delimiterStyle.color.evaluate(expressionResolver)).intValue());
            divSeparatorView.setHorizontal(((DivSeparator.DelimiterStyle.Orientation) delimiterStyle.orientation.evaluate(expressionResolver)) == DivSeparator.DelimiterStyle.Orientation.HORIZONTAL);
        }
    }
}
