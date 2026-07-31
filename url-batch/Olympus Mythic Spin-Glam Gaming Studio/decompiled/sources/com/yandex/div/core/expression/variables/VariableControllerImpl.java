package com.yandex.div.core.expression.variables;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VariableControllerImpl.kt */
@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J$\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0012J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\tH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\fH\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\u0010\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\fH\u0012J\u0010\u0010%\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\fH\u0012J\u0010\u0010&\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\fH\u0012J$\u0010'\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0012J\b\u0010(\u001a\u00020\rH\u0016J$\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00102\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016J6\u0010,\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016J:\u00102\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00122\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\b\b\u0002\u00100\u001a\u0002012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0012J2\u00103\u001a\u00020-2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00120\u001c2\u0006\u00100\u001a\u0002012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016J*\u00105\u001a\u00020-2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00120\u001c2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016R\u0010\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0092\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0092\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0092\u0004¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u000fX\u0092\u0004¢\u0006\u0002\n\u0000R,\u0010\u0011\u001a \u0012\u0004\u0012\u00020\u0012\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u00130\u000fX\u0092\u0004¢\u0006\u0002\n\u0000R,\u0010\u0014\u001a \u0012\u0004\u0012\u00020\u0012\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u00130\u000fX\u0092\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u000fX\u0092\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/yandex/div/core/expression/variables/VariableControllerImpl;", "Lcom/yandex/div/core/expression/variables/VariableController;", "delegate", "(Lcom/yandex/div/core/expression/variables/VariableController;)V", "declarationObserver", "com/yandex/div/core/expression/variables/VariableControllerImpl$declarationObserver$1", "Lcom/yandex/div/core/expression/variables/VariableControllerImpl$declarationObserver$1;", "extraVariablesSources", "", "Lcom/yandex/div/core/expression/variables/VariableSource;", "notifyVariableChangedCallback", "Lkotlin/Function1;", "Lcom/yandex/div/data/Variable;", "", "onAnyVariableChangeObservers", "", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "onChangeObservers", "", "Lcom/yandex/div/core/ObserverList;", "onRemoveObservers", "variables", "addObserver", "name", "observer", "addSource", "source", "captureAll", "", "cleanupSubscriptions", "declare", "variable", "get", "", "getMutableVariable", "notifyVariableChanged", "v", "onVariableDeclared", "onVariableRemoved", "removeChangeObserver", "restoreSubscriptions", "setOnAnyVariableChangeCallback", "owner", "callback", "subscribeToVariableChange", "Lcom/yandex/div/core/Disposable;", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "invokeOnSubscription", "", "subscribeToVariableChangeImpl", "subscribeToVariablesChange", "names", "subscribeToVariablesUndeclared", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public class VariableControllerImpl implements VariableController {

    @NotNull
    private final VariableControllerImpl$declarationObserver$1 declarationObserver;

    @Nullable
    private final VariableController delegate;

    @NotNull
    private final List<VariableSource> extraVariablesSources;

    @NotNull
    private final Function1 notifyVariableChangedCallback;

    @NotNull
    private final Map<ExpressionResolver, Function1> onAnyVariableChangeObservers;

    @NotNull
    private final Map<String, ObserverList<Function1>> onChangeObservers;

    @NotNull
    private final Map<String, ObserverList<Function1>> onRemoveObservers;

    @NotNull
    private final Map<String, Variable> variables;

    /* JADX WARN: Multi-variable type inference failed */
    public VariableControllerImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [com.yandex.div.core.expression.variables.VariableControllerImpl$declarationObserver$1] */
    public VariableControllerImpl(@Nullable VariableController variableController) {
        this.delegate = variableController;
        this.variables = new LinkedHashMap();
        this.extraVariablesSources = new ArrayList();
        this.onChangeObservers = new LinkedHashMap();
        this.onRemoveObservers = new LinkedHashMap();
        this.onAnyVariableChangeObservers = new LinkedHashMap();
        this.notifyVariableChangedCallback = new Function1() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl$notifyVariableChangedCallback$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Variable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Variable variable) {
                VariableControllerImpl.this.notifyVariableChanged(variable);
            }
        };
        this.declarationObserver = new DeclarationObserver() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl$declarationObserver$1
            @Override // com.yandex.div.core.expression.variables.DeclarationObserver
            public void onDeclared(@NotNull Variable variable) {
                VariableControllerImpl.this.onVariableDeclared(variable);
            }

            @Override // com.yandex.div.core.expression.variables.DeclarationObserver
            public void onUndeclared(@NotNull Variable variable) {
                VariableControllerImpl.this.onVariableRemoved(variable);
            }
        };
    }

    public /* synthetic */ VariableControllerImpl(VariableController variableController, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : variableController);
    }

    private void addObserver(String name, Function1 observer) {
        Map<String, ObserverList<Function1>> map = this.onChangeObservers;
        ObserverList<Function1> observerList = map.get(name);
        if (observerList == null) {
            observerList = new ObserverList<>();
            map.put(name, observerList);
        }
        observerList.addObserver(observer);
    }

    @Override // com.yandex.div.evaluable.VariableProvider
    @Nullable
    public Object get(@NotNull String name) {
        Variable mutableVariable = getMutableVariable(name);
        Object wrapVariableValue = VariableControllerKt.wrapVariableValue(mutableVariable != null ? mutableVariable.getValue() : null);
        if (wrapVariableValue != null) {
            return wrapVariableValue;
        }
        VariableController variableController = this.delegate;
        if (variableController != null) {
            return variableController.get(name);
        }
        return null;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariablesChange(@NotNull final List<String> names, boolean invokeOnSubscription, @NotNull final Function1 observer) {
        final ArrayList arrayList = new ArrayList();
        for (String str : names) {
            if (!this.variables.containsKey(str)) {
                VariableController variableController = this.delegate;
                if ((variableController != null ? variableController.getMutableVariable(str) : null) != null) {
                    arrayList.add(this.delegate.subscribeToVariableChange(str, null, invokeOnSubscription, observer));
                }
            }
            subscribeToVariableChangeImpl(str, null, invokeOnSubscription, observer);
        }
        return new Disposable() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl$$ExternalSyntheticLambda2
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                VariableControllerImpl.subscribeToVariablesChange$lambda$5(names, arrayList, this, observer);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToVariablesChange$lambda$5(List list, List list2, VariableControllerImpl variableControllerImpl, Function1 function1) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            variableControllerImpl.removeChangeObserver((String) it.next(), function1);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((Disposable) it2.next()).close();
        }
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariableChange(@NotNull final String name, @Nullable ErrorCollector errorCollector, boolean invokeOnSubscription, @NotNull final Function1 observer) {
        if (!this.variables.containsKey(name)) {
            VariableController variableController = this.delegate;
            if ((variableController != null ? variableController.getMutableVariable(name) : null) != null) {
                return this.delegate.subscribeToVariableChange(name, errorCollector, invokeOnSubscription, observer);
            }
        }
        subscribeToVariableChangeImpl(name, errorCollector, invokeOnSubscription, observer);
        return new Disposable() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl$$ExternalSyntheticLambda0
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                VariableControllerImpl.this.removeChangeObserver(name, observer);
            }
        };
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariablesUndeclared(@NotNull final List<String> names, @NotNull final Function1 observer) {
        for (String str : names) {
            Map<String, ObserverList<Function1>> map = this.onRemoveObservers;
            ObserverList<Function1> observerList = map.get(str);
            if (observerList == null) {
                observerList = new ObserverList<>();
                map.put(str, observerList);
            }
            observerList.addObserver(observer);
        }
        return new Disposable() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl$$ExternalSyntheticLambda1
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                VariableControllerImpl.subscribeToVariablesUndeclared$lambda$10(names, this, observer);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToVariablesUndeclared$lambda$10(List list, VariableControllerImpl variableControllerImpl, Function1 function1) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ObserverList<Function1> observerList = variableControllerImpl.onRemoveObservers.get((String) it.next());
            if (observerList != null) {
                observerList.removeObserver(function1);
            }
        }
    }

    static /* synthetic */ void subscribeToVariableChangeImpl$default(VariableControllerImpl variableControllerImpl, String str, ErrorCollector errorCollector, boolean z, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeToVariableChangeImpl");
        }
        if ((i & 2) != 0) {
            errorCollector = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        variableControllerImpl.subscribeToVariableChangeImpl(str, errorCollector, z, function1);
    }

    private void subscribeToVariableChangeImpl(String name, ErrorCollector errorCollector, boolean invokeOnSubscription, Function1 observer) {
        Variable mutableVariable = getMutableVariable(name);
        if (mutableVariable == null) {
            if (errorCollector != null) {
                errorCollector.logError(ParsingExceptionKt.missingVariable$default(name, null, 2, null));
            }
            addObserver(name, observer);
        } else {
            if (invokeOnSubscription) {
                Assert.assertMainThread();
                observer.invoke(mutableVariable);
            }
            addObserver(name, observer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeChangeObserver(String name, Function1 observer) {
        ObserverList<Function1> observerList = this.onChangeObservers.get(name);
        if (observerList != null) {
            observerList.removeObserver(observer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyVariableChanged(Variable v) {
        Assert.assertMainThread();
        Iterator it = CollectionsKt.toList(this.onAnyVariableChangeObservers.values()).iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(v);
        }
        ObserverList<Function1> observerList = this.onChangeObservers.get(v.getName());
        if (observerList != null) {
            Iterator<Function1> it2 = observerList.iterator();
            while (it2.hasNext()) {
                it2.next().invoke(v);
            }
        }
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void addSource(@NotNull VariableSource source) {
        source.observeVariables(this.notifyVariableChangedCallback);
        source.observeDeclaration(this.declarationObserver);
        this.extraVariablesSources.add(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onVariableDeclared(Variable variable) {
        variable.addObserver(this.notifyVariableChangedCallback);
        notifyVariableChanged(variable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onVariableRemoved(Variable variable) {
        variable.removeObserver(this.notifyVariableChangedCallback);
        ObserverList<Function1> observerList = this.onRemoveObservers.get(variable.getName());
        if (observerList != null) {
            Iterator<Function1> it = observerList.iterator();
            while (it.hasNext()) {
                it.next().invoke(variable);
            }
        }
        for (Function1 function1 : CollectionsKt.toList(this.onAnyVariableChangeObservers.values())) {
            function1.invoke(variable);
            variable.removeObserver(function1);
        }
        this.variables.remove(variable.getName());
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @Nullable
    public Variable getMutableVariable(@NotNull String name) {
        Variable mutableVariable;
        Variable variable = this.variables.get(name);
        if (variable != null) {
            return variable;
        }
        VariableController variableController = this.delegate;
        if (variableController != null && (mutableVariable = variableController.getMutableVariable(name)) != null) {
            return mutableVariable;
        }
        Iterator<T> it = this.extraVariablesSources.iterator();
        while (it.hasNext()) {
            Variable mutableVariable2 = ((VariableSource) it.next()).getMutableVariable(name);
            if (mutableVariable2 != null) {
                return mutableVariable2;
            }
        }
        return null;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void cleanupSubscriptions() {
        for (VariableSource variableSource : this.extraVariablesSources) {
            variableSource.removeVariablesObserver(this.notifyVariableChangedCallback);
            variableSource.removeDeclarationObserver(this.declarationObserver);
        }
        this.onAnyVariableChangeObservers.clear();
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void restoreSubscriptions() {
        for (VariableSource variableSource : this.extraVariablesSources) {
            variableSource.observeVariables(this.notifyVariableChangedCallback);
            variableSource.receiveVariablesUpdates(this.notifyVariableChangedCallback);
            variableSource.observeDeclaration(this.declarationObserver);
        }
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void declare(@NotNull Variable variable) throws VariableDeclarationException {
        Variable put = this.variables.put(variable.getName(), variable);
        if (put != null) {
            this.variables.put(variable.getName(), put);
            throw new VariableDeclarationException("Variable '" + variable.getName() + "' already declared!", null, 2, null);
        }
        onVariableDeclared(variable);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void setOnAnyVariableChangeCallback(@NotNull ExpressionResolver owner, @NotNull final Function1 callback) {
        this.onAnyVariableChangeObservers.put(owner, callback);
        VariableController variableController = this.delegate;
        if (variableController != null) {
            variableController.setOnAnyVariableChangeCallback(owner, new Function1() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl$setOnAnyVariableChangeCallback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Variable) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Variable variable) {
                    Map map;
                    map = VariableControllerImpl.this.variables;
                    if (map.get(variable.getName()) == null) {
                        callback.invoke(variable);
                    }
                }
            });
        }
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public List<Variable> captureAll() {
        return CollectionsKt.toList(this.variables.values());
    }
}
