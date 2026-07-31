package com.yandex.div.core.expression.local;

import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.FunctionProviderDecorator;
import com.yandex.div.core.expression.storedvalues.StoredValuesController;
import com.yandex.div.core.expression.triggers.TriggersController;
import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.expression.variables.VariableControllerImpl;
import com.yandex.div.core.expression.variables.VariableControllerKt;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.FunctionMapperKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.StoredValue;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.FunctionProvider;
import com.yandex.div.evaluable.StoredValueProvider;
import com.yandex.div.evaluable.WarningSender;
import com.yandex.div.evaluable.function.GeneratedBuiltinFunctionProvider;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivData;
import com.yandex.div2.DivTrigger;
import com.yandex.div2.DivVariable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExpressionsRuntimeProvider.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/core/expression/local/ExpressionsRuntimeProvider;", "", "divVariableController", "Lcom/yandex/div/core/expression/variables/DivVariableController;", "divActionBinder", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "logger", "Lcom/yandex/div/core/Div2Logger;", "storedValuesController", "Lcom/yandex/div/core/expression/storedvalues/StoredValuesController;", "(Lcom/yandex/div/core/expression/variables/DivVariableController;Lcom/yandex/div/core/view2/divs/DivActionBinder;Lcom/yandex/div/core/Div2Logger;Lcom/yandex/div/core/expression/storedvalues/StoredValuesController;)V", "createChildRuntime", "Lcom/yandex/div/core/expression/ExpressionsRuntime;", "path", "Lcom/yandex/div/core/state/DivStatePath;", "div", "Lcom/yandex/div2/DivBase;", "parentResolver", "Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "createRootRuntime", "data", "Lcom/yandex/div2/DivData;", "runtimeStore", "Lcom/yandex/div/core/expression/local/RuntimeStore;", "toTriggersController", "Lcom/yandex/div/core/expression/triggers/TriggersController;", "", "Lcom/yandex/div2/DivTrigger;", "resolver", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes11.dex */
public class ExpressionsRuntimeProvider {

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final DivVariableController divVariableController;

    @NotNull
    private final Div2Logger logger;

    @NotNull
    private final StoredValuesController storedValuesController;

    public ExpressionsRuntimeProvider(@NotNull DivVariableController divVariableController, @NotNull DivActionBinder divActionBinder, @NotNull Div2Logger div2Logger, @NotNull StoredValuesController storedValuesController) {
        this.divVariableController = divVariableController;
        this.divActionBinder = divActionBinder;
        this.logger = div2Logger;
        this.storedValuesController = storedValuesController;
    }

    @NotNull
    public ExpressionsRuntime createRootRuntime(@NotNull DivData data, @NotNull final ErrorCollector errorCollector, @NotNull RuntimeStore runtimeStore) {
        VariableControllerImpl variableControllerImpl = new VariableControllerImpl(null, 1, null);
        variableControllerImpl.addSource(this.divVariableController.getVariableSource());
        StoredValueProvider storedValueProvider = new StoredValueProvider() { // from class: com.yandex.div.core.expression.local.ExpressionsRuntimeProvider$$ExternalSyntheticLambda0
            @Override // com.yandex.div.evaluable.StoredValueProvider
            public final Object get(String str) {
                Object createRootRuntime$lambda$0;
                createRootRuntime$lambda$0 = ExpressionsRuntimeProvider.createRootRuntime$lambda$0(ExpressionsRuntimeProvider.this, errorCollector, str);
                return createRootRuntime$lambda$0;
            }
        };
        FunctionProviderDecorator functionProviderDecorator = new FunctionProviderDecorator(GeneratedBuiltinFunctionProvider.INSTANCE);
        List list = data.functions;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            functionProviderDecorator = functionProviderDecorator.plus(FunctionMapperKt.toLocalFunctions(list));
        }
        ExpressionResolverImpl expressionResolverImpl = new ExpressionResolverImpl("", runtimeStore, variableControllerImpl, new Evaluator(new EvaluationContext(variableControllerImpl, storedValueProvider, functionProviderDecorator, new WarningSender() { // from class: com.yandex.div.core.expression.local.ExpressionsRuntimeProvider$createRootRuntime$warningSender$1
            @Override // com.yandex.div.evaluable.WarningSender
            /* renamed from: send-BIH1yYw, reason: not valid java name */
            public final void mo7123sendBIH1yYw(@NotNull Evaluable evaluable, @NotNull String str) {
                ErrorCollector.this.logWarning(new Throwable("Warning occurred while evaluating '" + evaluable.getRawExpr() + "':", new Throwable(str)));
            }
        })), errorCollector, null, 32, null);
        List list3 = data.variables;
        if (list3 != null) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                VariableControllerKt.declare(variableControllerImpl, (DivVariable) it.next(), expressionResolverImpl, errorCollector);
            }
        }
        return new ExpressionsRuntime(expressionResolverImpl, toTriggersController(data.variableTriggers, expressionResolverImpl, errorCollector));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createRootRuntime$lambda$0(ExpressionsRuntimeProvider expressionsRuntimeProvider, ErrorCollector errorCollector, String str) {
        StoredValue storedValue = expressionsRuntimeProvider.storedValuesController.getStoredValue(str, errorCollector);
        if (storedValue != null) {
            return storedValue.getValue();
        }
        return null;
    }

    @NotNull
    public ExpressionsRuntime createChildRuntime(@NotNull DivStatePath path, @NotNull DivBase div, @NotNull ExpressionResolverImpl parentResolver, @NotNull ErrorCollector errorCollector) {
        VariableControllerImpl variableControllerImpl = new VariableControllerImpl(parentResolver.getVariableController());
        List functions = div.getFunctions();
        FunctionProvider functionProvider = parentResolver.getEvaluator().getEvaluationContext().getFunctionProvider();
        Intrinsics.checkNotNull(functionProvider, "null cannot be cast to non-null type com.yandex.div.core.expression.FunctionProviderDecorator");
        FunctionProviderDecorator functionProviderDecorator = (FunctionProviderDecorator) functionProvider;
        List list = functions;
        if (list != null && !list.isEmpty()) {
            functionProviderDecorator = functionProviderDecorator.plus(FunctionMapperKt.toLocalFunctions(functions));
        }
        ExpressionResolverImpl expressionResolverImpl = new ExpressionResolverImpl(parentResolver.getPath() + '/' + path.getLastDivId$div_release(), parentResolver.getRuntimeStore(), variableControllerImpl, new Evaluator(new EvaluationContext(variableControllerImpl, parentResolver.getEvaluator().getEvaluationContext().getStoredValueProvider(), functionProviderDecorator, parentResolver.getEvaluator().getEvaluationContext().getWarningSender())), errorCollector, null, 32, null);
        List variables = div.getVariables();
        if (variables != null) {
            Iterator it = variables.iterator();
            while (it.hasNext()) {
                VariableControllerKt.declare(variableControllerImpl, (DivVariable) it.next(), expressionResolverImpl, errorCollector);
            }
        }
        return new ExpressionsRuntime(expressionResolverImpl, toTriggersController(div.getVariableTriggers(), expressionResolverImpl, errorCollector));
    }

    private TriggersController toTriggersController(List<DivTrigger> list, ExpressionResolverImpl expressionResolverImpl, ErrorCollector errorCollector) {
        List<DivTrigger> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        TriggersController triggersController = new TriggersController(expressionResolverImpl, errorCollector, this.logger, this.divActionBinder);
        triggersController.ensureTriggersSynced(list);
        return triggersController;
    }
}
