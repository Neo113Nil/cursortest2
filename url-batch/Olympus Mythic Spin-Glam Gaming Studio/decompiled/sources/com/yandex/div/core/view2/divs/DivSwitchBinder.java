package com.yandex.div.core.view2.divs;

import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.expression.variables.TwoWayBooleanVariableBinder;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivSwitchView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivSwitch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivSwitchBinder.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001c\u0010\u000f\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0002J.\u0010\u0010\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J&\u0010\u0016\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\f\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0002J&\u0010\u0017\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\f\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0002J$\u0010\u0018\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivSwitchBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/Div$Switch;", "Lcom/yandex/div2/DivSwitch;", "Lcom/yandex/div/core/view2/divs/widgets/DivSwitchView;", "baseBinder", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "variableBinder", "Lcom/yandex/div/core/expression/variables/TwoWayBooleanVariableBinder;", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/expression/variables/TwoWayBooleanVariableBinder;)V", "applyIsEnabled", "", "div", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "applyOnColor", "bind", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "oldDiv", "path", "Lcom/yandex/div/core/state/DivStatePath;", "bindIsEnabled", "bindOnColor", "observeVariable", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes15.dex */
public final class DivSwitchBinder extends DivViewBinder<Div.Switch, DivSwitch, DivSwitchView> {

    @NotNull
    private final TwoWayBooleanVariableBinder variableBinder;

    public DivSwitchBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull TwoWayBooleanVariableBinder twoWayBooleanVariableBinder) {
        super(divBaseBinder);
        this.variableBinder = twoWayBooleanVariableBinder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivSwitchView divSwitchView, @NotNull BindingContext bindingContext, @NotNull DivSwitch divSwitch, @Nullable DivSwitch divSwitch2, @NotNull DivStatePath divStatePath) {
        bindIsEnabled(divSwitchView, divSwitch, divSwitch2, bindingContext.getExpressionResolver());
        bindOnColor(divSwitchView, divSwitch, divSwitch2, bindingContext.getExpressionResolver());
        observeVariable(divSwitchView, divSwitch, bindingContext, divStatePath);
    }

    private final void bindIsEnabled(final DivSwitchView divSwitchView, final DivSwitch divSwitch, DivSwitch divSwitch2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divSwitch.isEnabled, divSwitch2 != null ? divSwitch2.isEnabled : null)) {
            return;
        }
        applyIsEnabled(divSwitchView, divSwitch, expressionResolver);
        if (ExpressionsKt.isConstant(divSwitch.isEnabled)) {
            return;
        }
        divSwitchView.addSubscription(divSwitch.isEnabled.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivSwitchBinder$bindIsEnabled$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7223invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7223invoke(@NotNull Object obj) {
                DivSwitchBinder.this.applyIsEnabled(divSwitchView, divSwitch, expressionResolver);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyIsEnabled(DivSwitchView divSwitchView, DivSwitch divSwitch, ExpressionResolver expressionResolver) {
        divSwitchView.setEnabled(((Boolean) divSwitch.isEnabled.evaluate(expressionResolver)).booleanValue());
    }

    private final void bindOnColor(final DivSwitchView divSwitchView, final DivSwitch divSwitch, DivSwitch divSwitch2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divSwitch.onColor, divSwitch2 != null ? divSwitch2.onColor : null)) {
            return;
        }
        applyOnColor(divSwitchView, divSwitch, expressionResolver);
        if (ExpressionsKt.isConstantOrNull(divSwitch.onColor)) {
            return;
        }
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivSwitchBinder$bindOnColor$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7224invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7224invoke(@NotNull Object obj) {
                DivSwitchBinder.this.applyOnColor(divSwitchView, divSwitch, expressionResolver);
            }
        };
        Expression expression = divSwitch.onColor;
        divSwitchView.addSubscription(expression != null ? expression.observe(expressionResolver, function1) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyOnColor(DivSwitchView divSwitchView, DivSwitch divSwitch, ExpressionResolver expressionResolver) {
        Expression expression = divSwitch.onColor;
        divSwitchView.setColorOn(expression != null ? (Integer) expression.evaluate(expressionResolver) : null);
    }

    private final void observeVariable(final DivSwitchView divSwitchView, DivSwitch divSwitch, BindingContext bindingContext, DivStatePath divStatePath) {
        divSwitchView.addSubscription(this.variableBinder.bindVariable(bindingContext, divSwitch.isOnVariable, new TwoWayBooleanVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSwitchBinder$observeVariable$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable Boolean value) {
                if (value != null) {
                    DivSwitchView.this.setChecked(value.booleanValue());
                }
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull Function1 valueUpdater) {
                DivSwitchView.this.setOnCheckedChangeListener(valueUpdater);
            }
        }, divStatePath));
    }
}
