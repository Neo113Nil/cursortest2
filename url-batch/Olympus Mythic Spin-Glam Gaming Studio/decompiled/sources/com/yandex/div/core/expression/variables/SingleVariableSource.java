package com.yandex.div.core.expression.variables;

import com.yandex.div.data.Variable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SingleVariableSource.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0010\u0018\u00002\u00020\u0001B=\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0013J#\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0015R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/div/core/expression/variables/SingleVariableSource;", "Lcom/yandex/div/core/expression/variables/VariableSource;", "", "", "Lcom/yandex/div/data/Variable;", "variables", "Lkotlin/Function1;", "", "requestObserver", "", "Lcom/yandex/div/core/expression/variables/DeclarationObserver;", "declarationObservers", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;Ljava/util/Collection;)V", "name", "getMutableVariable", "(Ljava/lang/String;)Lcom/yandex/div/data/Variable;", "observer", "observeDeclaration", "(Lcom/yandex/div/core/expression/variables/DeclarationObserver;)V", "observeVariables", "(Lkotlin/jvm/functions/Function1;)V", "receiveVariablesUpdates", "removeDeclarationObserver", "removeVariablesObserver", "Ljava/util/Map;", "Lkotlin/jvm/functions/Function1;", "Ljava/util/Collection;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class SingleVariableSource implements VariableSource {

    @NotNull
    private final Collection<DeclarationObserver> declarationObservers;

    @NotNull
    private final Function1 requestObserver;

    @NotNull
    private final Map<String, Variable> variables;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleVariableSource(@NotNull Map<String, ? extends Variable> map, @NotNull Function1 function1, @NotNull Collection<DeclarationObserver> collection) {
        this.variables = map;
        this.requestObserver = function1;
        this.declarationObservers = collection;
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    @Nullable
    public Variable getMutableVariable(@NotNull String name) {
        this.requestObserver.invoke(name);
        return this.variables.get(name);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void observeDeclaration(@NotNull DeclarationObserver observer) {
        this.declarationObservers.add(observer);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void observeVariables(@NotNull Function1 observer) {
        Iterator<T> it = this.variables.values().iterator();
        while (it.hasNext()) {
            ((Variable) it.next()).addObserver(observer);
        }
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void receiveVariablesUpdates(@NotNull Function1 observer) {
        Iterator<T> it = this.variables.values().iterator();
        while (it.hasNext()) {
            observer.invoke((Variable) it.next());
        }
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void removeDeclarationObserver(@NotNull DeclarationObserver observer) {
        this.declarationObservers.remove(observer);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void removeVariablesObserver(@NotNull Function1 observer) {
        Iterator<T> it = this.variables.values().iterator();
        while (it.hasNext()) {
            ((Variable) it.next()).removeObserver(observer);
        }
    }
}
