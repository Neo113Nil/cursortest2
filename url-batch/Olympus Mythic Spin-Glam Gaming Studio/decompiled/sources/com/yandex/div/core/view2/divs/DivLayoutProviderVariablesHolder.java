package com.yandex.div.core.view2.divs;

import com.android.billingclient.api.BillingClient;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.core.DivTreeVisitor;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivData;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivLayoutProviderVariablesHolder.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007J \u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u0016\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0019\u001a\u00020\u0002*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0014\u0010\u001d\u001a\u00020\u0002*\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivLayoutProviderVariablesHolder;", "Lcom/yandex/div/internal/core/DivTreeVisitor;", "", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "()V", "changedVariables", "", "", BillingClient.FeatureType.SUBSCRIPTIONS, "Lcom/yandex/div/core/Disposable;", "getSubscriptions", "()Ljava/util/List;", "clear", "contains", "", "variable", "defaultVisit", "data", "Lcom/yandex/div2/Div;", "context", "Lcom/yandex/div/core/view2/BindingContext;", "path", "Lcom/yandex/div/core/state/DivStatePath;", "observeDivData", "Lcom/yandex/div2/DivData;", "observe", "Lcom/yandex/div2/DivSize;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "observeSize", "Lcom/yandex/div2/DivBase;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivLayoutProviderVariablesHolder extends DivTreeVisitor<Unit> implements ExpressionSubscriber {

    @NotNull
    private final List<String> changedVariables;

    @NotNull
    private final List<Disposable> subscriptions;

    /* JADX WARN: Multi-variable type inference failed */
    public DivLayoutProviderVariablesHolder() {
        super(null, 1, 0 == true ? 1 : 0);
        this.changedVariables = new ArrayList();
        this.subscriptions = new ArrayList();
    }

    @Override // com.yandex.div.internal.core.DivTreeVisitor
    public /* bridge */ /* synthetic */ Unit defaultVisit(Div div, BindingContext bindingContext, DivStatePath divStatePath) {
        defaultVisit2(div, bindingContext, divStatePath);
        return Unit.INSTANCE;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    public final boolean contains(@NotNull String variable) {
        return this.changedVariables.contains(variable);
    }

    public final void clear() {
        this.changedVariables.clear();
    }

    public final void observeDivData(@NotNull DivData data, @NotNull BindingContext context) {
        for (DivData.State state : data.states) {
            visit(state.div, context, DivStatePath.INSTANCE.fromState$div_release(state));
        }
    }

    /* renamed from: defaultVisit, reason: avoid collision after fix types in other method */
    protected void defaultVisit2(@NotNull Div data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        observeSize(data.value(), context.getExpressionResolver());
    }

    private final void observeSize(DivBase divBase, ExpressionResolver expressionResolver) {
        observe(divBase.getWidth(), expressionResolver);
        observe(divBase.getHeight(), expressionResolver);
    }

    private final void observe(DivSize divSize, final ExpressionResolver expressionResolver) {
        Object value = divSize.value();
        DivFixedSize divFixedSize = value instanceof DivFixedSize ? (DivFixedSize) value : null;
        if (divFixedSize == null) {
            return;
        }
        Expression expression = divFixedSize.value;
        final Expression.MutableExpression mutableExpression = expression instanceof Expression.MutableExpression ? (Expression.MutableExpression) expression : null;
        if (mutableExpression == null) {
            return;
        }
        addSubscription(mutableExpression.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivLayoutProviderVariablesHolder$observe$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                List list;
                list = DivLayoutProviderVariablesHolder.this.changedVariables;
                list.addAll(mutableExpression.getVariablesName(expressionResolver));
            }
        }));
    }
}
