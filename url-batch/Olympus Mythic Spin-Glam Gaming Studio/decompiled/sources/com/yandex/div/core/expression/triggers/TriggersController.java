package com.yandex.div.core.expression.triggers;

import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivTrigger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TriggersController.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0016J\u0016\u0010\u0017\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\fH\u0012J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0092\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0092\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/core/expression/triggers/TriggersController;", "", "expressionResolver", "Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "logger", "Lcom/yandex/div/core/Div2Logger;", "divActionBinder", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "(Lcom/yandex/div/core/expression/ExpressionResolverImpl;Lcom/yandex/div/core/view2/errors/ErrorCollector;Lcom/yandex/div/core/Div2Logger;Lcom/yandex/div/core/view2/divs/DivActionBinder;)V", "activeTriggers", "", "Lcom/yandex/div2/DivTrigger;", "currentView", "Lcom/yandex/div/core/DivViewFacade;", "executors", "", "", "Lcom/yandex/div/core/expression/triggers/TriggerExecutor;", "clearBinding", "", "view", "ensureTriggersSynced", "divTriggers", "findErrors", "", "variables", "", "onAttachedToWindow", "onDetachedFromWindow", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public class TriggersController {

    @Nullable
    private List<DivTrigger> activeTriggers;

    @Nullable
    private DivViewFacade currentView;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final Map<List<DivTrigger>, List<TriggerExecutor>> executors = new LinkedHashMap();

    @NotNull
    private final ExpressionResolverImpl expressionResolver;

    @NotNull
    private final Div2Logger logger;

    public TriggersController(@NotNull ExpressionResolverImpl expressionResolverImpl, @NotNull ErrorCollector errorCollector, @NotNull Div2Logger div2Logger, @NotNull DivActionBinder divActionBinder) {
        this.expressionResolver = expressionResolverImpl;
        this.errorCollector = errorCollector;
        this.logger = div2Logger;
        this.divActionBinder = divActionBinder;
    }

    public void ensureTriggersSynced(@NotNull List<DivTrigger> divTriggers) {
        if (this.activeTriggers == divTriggers) {
            return;
        }
        this.activeTriggers = divTriggers;
        DivViewFacade divViewFacade = this.currentView;
        Map<List<DivTrigger>, List<TriggerExecutor>> map = this.executors;
        List<TriggerExecutor> list = map.get(divTriggers);
        if (list == null) {
            list = new ArrayList<>();
            map.put(divTriggers, list);
        }
        List<TriggerExecutor> list2 = list;
        if (divViewFacade != null) {
            clearBinding(divViewFacade);
        }
        for (DivTrigger divTrigger : divTriggers) {
            Expression expression = divTrigger.condition;
            Expression.MutableExpression mutableExpression = expression instanceof Expression.MutableExpression ? (Expression.MutableExpression) expression : null;
            if (mutableExpression == null) {
                this.errorCollector.logError(new IllegalStateException("Invalid condition: '" + divTrigger.condition + '\'', new RuntimeException("Condition is not mutable!")));
            } else {
                Throwable findErrors = findErrors(mutableExpression.getVariablesName(this.expressionResolver));
                if (findErrors != null) {
                    this.errorCollector.logError(new IllegalStateException("Invalid condition: '" + divTrigger.condition + '\'', findErrors));
                } else {
                    list2.add(new TriggerExecutor(mutableExpression, divTrigger.actions, divTrigger.mode, this.expressionResolver, this.errorCollector, this.logger, this.divActionBinder));
                }
            }
        }
        if (divViewFacade != null) {
            onAttachedToWindow(divViewFacade);
        }
    }

    private Throwable findErrors(List<String> variables) {
        if (variables.isEmpty()) {
            return new RuntimeException("No variables defined!");
        }
        return null;
    }

    public void clearBinding(@Nullable DivViewFacade view) {
        this.currentView = null;
        Iterator<Map.Entry<List<DivTrigger>, List<TriggerExecutor>>> it = this.executors.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                ((TriggerExecutor) it2.next()).onDetach(view);
            }
        }
    }

    public void onAttachedToWindow(@NotNull DivViewFacade view) {
        List<TriggerExecutor> list;
        if (Intrinsics.areEqual(this.currentView, view)) {
            return;
        }
        this.currentView = view;
        List<DivTrigger> list2 = this.activeTriggers;
        if (list2 == null || (list = this.executors.get(list2)) == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((TriggerExecutor) it.next()).onAttach(view);
        }
    }

    public void onDetachedFromWindow(@NotNull DivViewFacade view) {
        if (Intrinsics.areEqual(this.currentView, view)) {
            this.currentView = null;
        }
        Iterator<Map.Entry<List<DivTrigger>, List<TriggerExecutor>>> it = this.executors.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                ((TriggerExecutor) it2.next()).onDetach(view);
            }
        }
    }
}
