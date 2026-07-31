package com.yandex.div.core.expression.variables;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.VariableProvider;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VariableController.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\bH&J\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0003H&J$\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0014H&J:\u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0014H&J4\u0010\u001c\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0014H&J*\u0010\u001e\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0014H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/expression/variables/VariableController;", "Lcom/yandex/div/evaluable/VariableProvider;", "addSource", "", "source", "Lcom/yandex/div/core/expression/variables/VariableSource;", "captureAll", "", "Lcom/yandex/div/data/Variable;", "cleanupSubscriptions", "declare", "variable", "getMutableVariable", "name", "", "restoreSubscriptions", "setOnAnyVariableChangeCallback", "owner", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "callback", "Lkotlin/Function1;", "subscribeToVariableChange", "Lcom/yandex/div/core/Disposable;", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "invokeOnSubscription", "", "observer", "subscribeToVariablesChange", "names", "subscribeToVariablesUndeclared", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface VariableController extends VariableProvider {
    void addSource(@NotNull VariableSource source);

    void cleanupSubscriptions();

    void declare(@NotNull Variable variable);

    @Nullable
    Variable getMutableVariable(@NotNull String name);

    void restoreSubscriptions();

    void setOnAnyVariableChangeCallback(@NotNull ExpressionResolver owner, @NotNull Function1 callback);

    @NotNull
    Disposable subscribeToVariableChange(@NotNull String name, @Nullable ErrorCollector errorCollector, boolean invokeOnSubscription, @NotNull Function1 observer);

    @NotNull
    Disposable subscribeToVariablesChange(@NotNull List<String> names, boolean invokeOnSubscription, @NotNull Function1 observer);

    @NotNull
    Disposable subscribeToVariablesUndeclared(@NotNull List<String> names, @NotNull Function1 observer);

    static /* synthetic */ Disposable subscribeToVariablesChange$default(VariableController variableController, List list, boolean z, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeToVariablesChange");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return variableController.subscribeToVariablesChange(list, z, function1);
    }

    static /* synthetic */ Disposable subscribeToVariableChange$default(VariableController variableController, String str, ErrorCollector errorCollector, boolean z, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeToVariableChange");
        }
        if ((i & 2) != 0) {
            errorCollector = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return variableController.subscribeToVariableChange(str, errorCollector, z, function1);
    }

    @NotNull
    default List<Variable> captureAll() {
        return CollectionsKt.emptyList();
    }
}
