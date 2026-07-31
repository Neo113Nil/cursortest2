package com.yandex.div.core.expression.variables;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VariableAndConstantController.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J$\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0018H\u0016J6\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0018H\u0016J2\u0010 \u001a\u00020\u001a2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\"2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0018H\u0016J*\u0010#\u001a\u00020\u001a2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\"2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/yandex/div/core/expression/variables/VariableAndConstantController;", "Lcom/yandex/div/core/expression/variables/VariableController;", "delegate", "constants", "Lcom/yandex/div/core/expression/variables/ConstantsProvider;", "(Lcom/yandex/div/core/expression/variables/VariableController;Lcom/yandex/div/core/expression/variables/ConstantsProvider;)V", "addSource", "", "source", "Lcom/yandex/div/core/expression/variables/VariableSource;", "cleanupSubscriptions", "declare", "variable", "Lcom/yandex/div/data/Variable;", "get", "", "name", "", "getMutableVariable", "restoreSubscriptions", "setOnAnyVariableChangeCallback", "owner", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "callback", "Lkotlin/Function1;", "subscribeToVariableChange", "Lcom/yandex/div/core/Disposable;", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "invokeOnSubscription", "", "observer", "subscribeToVariablesChange", "names", "", "subscribeToVariablesUndeclared", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VariableAndConstantController implements VariableController {

    @NotNull
    private final ConstantsProvider constants;

    @NotNull
    private final VariableController delegate;

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void cleanupSubscriptions() {
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void restoreSubscriptions() {
    }

    public VariableAndConstantController(@NotNull VariableController variableController, @NotNull ConstantsProvider constantsProvider) {
        this.delegate = variableController;
        this.constants = constantsProvider;
    }

    @Override // com.yandex.div.evaluable.VariableProvider
    @Nullable
    public Object get(@NotNull String name) {
        Object wrapVariableValue = VariableControllerKt.wrapVariableValue(this.constants.get(name));
        return wrapVariableValue == null ? this.delegate.get(name) : wrapVariableValue;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariablesChange(@NotNull List<String> names, boolean invokeOnSubscription, @NotNull Function1 observer) {
        return this.delegate.subscribeToVariablesChange(names, invokeOnSubscription, observer);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariablesUndeclared(@NotNull List<String> names, @NotNull Function1 observer) {
        return Disposable.NULL;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariableChange(@NotNull String name, @Nullable ErrorCollector errorCollector, boolean invokeOnSubscription, @NotNull Function1 observer) {
        return this.delegate.subscribeToVariableChange(name, errorCollector, invokeOnSubscription, observer);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void addSource(@NotNull VariableSource source) {
        this.delegate.addSource(source);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @Nullable
    public Variable getMutableVariable(@NotNull String name) {
        return this.delegate.getMutableVariable(name);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void declare(@NotNull Variable variable) {
        this.delegate.declare(variable);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void setOnAnyVariableChangeCallback(@NotNull ExpressionResolver owner, @NotNull Function1 callback) {
        this.delegate.setOnAnyVariableChangeCallback(owner, callback);
    }
}
