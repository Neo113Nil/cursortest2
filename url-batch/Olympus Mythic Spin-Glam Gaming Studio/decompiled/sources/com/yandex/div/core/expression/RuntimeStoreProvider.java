package com.yandex.div.core.expression;

import com.yandex.div.DivDataTag;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.expression.local.ExpressionsRuntimeProvider;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.local.RuntimeStoreImpl;
import com.yandex.div.core.expression.triggers.TriggersController;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.expression.variables.VariableControllerKt;
import com.yandex.div.core.timer.TimerController;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.data.Variable;
import com.yandex.div2.DivData;
import com.yandex.div2.DivTrigger;
import com.yandex.div2.DivVariable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: RuntimeStoreProvider.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\b\u0011\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0002\b\u0014J \u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0012J%\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\tH\u0010¢\u0006\u0002\b J\u0016\u0010!\u001a\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0#H\u0016R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000RN\u0010\f\u001aB\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u000b0\u000b\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u000f0\u000f \u000e* \u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u000b0\u000b\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u00100\rX\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/yandex/div/core/expression/RuntimeStoreProvider;", "", "runtimeProvider", "Lcom/yandex/div/core/expression/local/ExpressionsRuntimeProvider;", "errorCollectors", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "(Lcom/yandex/div/core/expression/local/ExpressionsRuntimeProvider;Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "divDataTags", "Ljava/util/WeakHashMap;", "Lcom/yandex/div/core/view2/Div2View;", "", "", "runtimeStores", "", "kotlin.jvm.PlatformType", "Lcom/yandex/div/core/expression/local/RuntimeStore;", "", "cleanupRuntime", "", "view", "cleanupRuntime$div_release", "ensureVariablesSynced", "resolver", "Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "data", "Lcom/yandex/div2/DivData;", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "getOrCreate", "tag", "Lcom/yandex/div/DivDataTag;", "div2View", "getOrCreate$div_release", TimerController.RESET_COMMAND, "tags", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes4.dex */
public class RuntimeStoreProvider {

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final ExpressionsRuntimeProvider runtimeProvider;
    private final Map<String, RuntimeStore> runtimeStores = Collections.synchronizedMap(new LinkedHashMap());

    @NotNull
    private final WeakHashMap<Div2View, Set<String>> divDataTags = new WeakHashMap<>();

    public RuntimeStoreProvider(@NotNull ExpressionsRuntimeProvider expressionsRuntimeProvider, @NotNull ErrorCollectors errorCollectors) {
        this.runtimeProvider = expressionsRuntimeProvider;
        this.errorCollectors = errorCollectors;
    }

    @NotNull
    public RuntimeStore getOrCreate$div_release(@NotNull DivDataTag tag, @NotNull DivData data, @NotNull Div2View div2View) {
        WeakHashMap<Div2View, Set<String>> weakHashMap = this.divDataTags;
        Set<String> set = weakHashMap.get(div2View);
        if (set == null) {
            set = new LinkedHashSet<>();
            weakHashMap.put(div2View, set);
        }
        set.add(tag.getId());
        RuntimeStore runtimeStore = this.runtimeStores.get(tag.getId());
        if (runtimeStore != null) {
            ensureVariablesSynced(runtimeStore.getRootRuntime().getExpressionResolver(), data, this.errorCollectors.getOrCreate(tag, data));
            TriggersController triggersController = runtimeStore.getRootRuntime().getTriggersController();
            if (triggersController != null) {
                List<DivTrigger> list = data.variableTriggers;
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                triggersController.ensureTriggersSynced(list);
            }
            return runtimeStore;
        }
        RuntimeStoreImpl runtimeStoreImpl = new RuntimeStoreImpl(data, this.runtimeProvider, this.errorCollectors.getOrCreate(tag, data));
        this.runtimeStores.put(tag.getId(), runtimeStoreImpl);
        return runtimeStoreImpl;
    }

    public void reset(@NotNull List<? extends DivDataTag> tags) {
        if (tags.isEmpty()) {
            this.runtimeStores.clear();
            return;
        }
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            this.runtimeStores.remove(((DivDataTag) it.next()).getId());
        }
    }

    public void cleanupRuntime$div_release(@NotNull Div2View view) {
        Set<String> set = this.divDataTags.get(view);
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                RuntimeStore runtimeStore = this.runtimeStores.get((String) it.next());
                if (runtimeStore != null) {
                    runtimeStore.cleanupRuntimes(view);
                }
            }
        }
        this.divDataTags.remove(view);
    }

    private void ensureVariablesSynced(ExpressionResolverImpl resolver, DivData data, ErrorCollector errorCollector) {
        boolean z;
        VariableController variableController = resolver.getVariableController();
        List<DivVariable> list = data.variables;
        if (list != null) {
            for (DivVariable divVariable : list) {
                Variable mutableVariable = variableController.getMutableVariable(RuntimeStoreProviderKt.getName(divVariable));
                if (mutableVariable == null) {
                    VariableControllerKt.declare(variableController, divVariable, resolver, errorCollector);
                } else {
                    if (divVariable instanceof DivVariable.Bool) {
                        z = mutableVariable instanceof Variable.BooleanVariable;
                    } else if (divVariable instanceof DivVariable.Integer) {
                        z = mutableVariable instanceof Variable.IntegerVariable;
                    } else if (divVariable instanceof DivVariable.Number) {
                        z = mutableVariable instanceof Variable.DoubleVariable;
                    } else if (divVariable instanceof DivVariable.Str) {
                        z = mutableVariable instanceof Variable.StringVariable;
                    } else if (divVariable instanceof DivVariable.Color) {
                        z = mutableVariable instanceof Variable.ColorVariable;
                    } else if (divVariable instanceof DivVariable.Url) {
                        z = mutableVariable instanceof Variable.UrlVariable;
                    } else if (divVariable instanceof DivVariable.Dict) {
                        z = mutableVariable instanceof Variable.DictVariable;
                    } else if (divVariable instanceof DivVariable.Array) {
                        z = mutableVariable instanceof Variable.ArrayVariable;
                    } else {
                        if (!(divVariable instanceof DivVariable.Property)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z = mutableVariable instanceof Variable.PropertyVariable;
                    }
                    if (!z) {
                        errorCollector.logError(new IllegalArgumentException(StringsKt.trimIndent("\n                           Variable inconsistency detected!\n                           at DivData: " + RuntimeStoreProviderKt.getName(divVariable) + " (" + divVariable + ")\n                           at VariableController: " + variableController.getMutableVariable(RuntimeStoreProviderKt.getName(divVariable)) + "\n                        ")));
                    }
                }
            }
        }
    }
}
