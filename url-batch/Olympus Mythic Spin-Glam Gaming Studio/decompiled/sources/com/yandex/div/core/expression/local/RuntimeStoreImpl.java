package com.yandex.div.core.expression.local;

import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.RuntimeTree;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivData;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RuntimeStoreImpl.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J \u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u000fH\u0016J&\u0010'\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0)H\u0016J\u0012\u0010*\u001a\u0004\u0018\u00010\u000b2\u0006\u0010+\u001a\u00020\u000fH\u0016J\u0014\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0-H\u0016J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J'\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\b2J\u0010\u00103\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u000eH\u0002J4\u00104\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000fH\u0016J\u0010\u00105\u001a\u00020\u001e2\u0006\u00106\u001a\u000207H\u0016J,\u00108\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001e0:H\u0016J\b\u0010;\u001a\u00020\u001eH\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0019\u001a\u00020\u0018*\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006<"}, d2 = {"Lcom/yandex/div/core/expression/local/RuntimeStoreImpl;", "Lcom/yandex/div/core/expression/local/RuntimeStore;", "data", "Lcom/yandex/div2/DivData;", "runtimeProvider", "Lcom/yandex/div/core/expression/local/ExpressionsRuntimeProvider;", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "(Lcom/yandex/div2/DivData;Lcom/yandex/div/core/expression/local/ExpressionsRuntimeProvider;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "allRuntimes", "Lcom/yandex/div/core/ObserverList;", "Lcom/yandex/div/core/expression/ExpressionsRuntime;", "itemBuilderResolvers", "", "", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "pathToRuntime", "resolverToRuntime", "rootRuntime", "getRootRuntime", "()Lcom/yandex/div/core/expression/ExpressionsRuntime;", "tree", "Lcom/yandex/div/core/expression/local/RuntimeTree;", "warningShown", "", "needLocalRuntime", "Lcom/yandex/div2/Div;", "getNeedLocalRuntime", "(Lcom/yandex/div2/Div;)Z", "cleanupRuntimes", "", "divView", "Lcom/yandex/div/core/DivViewFacade;", "clearBindings", "getOrCreateRuntime", "path", "Lcom/yandex/div/core/state/DivStatePath;", "div", "parentResolver", "getOrPutItemBuilderResolver", "createResolver", "Lkotlin/Function0;", "getRuntimeWithOrNull", "resolver", "getUniquePathsAndRuntimes", "", "onDetachedFromWindow", "putRuntime", "runtime", "parentRuntime", "putRuntime$div_release", "reportParentRuntimeError", "resolveRuntimeWith", "showWarningIfNeeded", "child", "Lcom/yandex/div2/DivBase;", "traverseFrom", "callback", "Lkotlin/Function1;", "updateSubscriptions", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RuntimeStoreImpl implements RuntimeStore {

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final ExpressionsRuntime rootRuntime;

    @NotNull
    private final ExpressionsRuntimeProvider runtimeProvider;
    private boolean warningShown;

    @NotNull
    private final Map<ExpressionResolver, ExpressionsRuntime> resolverToRuntime = new LinkedHashMap();

    @NotNull
    private final Map<String, ExpressionsRuntime> pathToRuntime = new LinkedHashMap();

    @NotNull
    private final ObserverList<ExpressionsRuntime> allRuntimes = new ObserverList<>();

    @NotNull
    private final RuntimeTree tree = new RuntimeTree();

    @NotNull
    private final Map<String, ExpressionResolver> itemBuilderResolvers = new LinkedHashMap();

    public RuntimeStoreImpl(@NotNull DivData divData, @NotNull ExpressionsRuntimeProvider expressionsRuntimeProvider, @NotNull ErrorCollector errorCollector) {
        this.runtimeProvider = expressionsRuntimeProvider;
        this.errorCollector = errorCollector;
        ExpressionsRuntime createRootRuntime = expressionsRuntimeProvider.createRootRuntime(divData, errorCollector, this);
        putRuntime$div_release(createRootRuntime, "", null);
        this.rootRuntime = createRootRuntime;
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    @NotNull
    public ExpressionsRuntime getRootRuntime() {
        return this.rootRuntime;
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void showWarningIfNeeded(@NotNull DivBase child) {
        if (this.warningShown || child.getVariables() == null) {
            return;
        }
        this.warningShown = true;
        this.errorCollector.logWarning(new Throwable("You are using local variables. Please ensure that all elements that use local variables and all of their parents recursively have an 'id' attribute."));
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    @NotNull
    public ExpressionsRuntime getOrCreateRuntime(@NotNull DivStatePath path, @NotNull Div div, @NotNull ExpressionResolver parentResolver) {
        String fullPath$div_release = path.getFullPath$div_release();
        ExpressionsRuntime expressionsRuntime = this.pathToRuntime.get(fullPath$div_release);
        if (expressionsRuntime != null) {
            return expressionsRuntime;
        }
        if (!(parentResolver instanceof ExpressionResolverImpl)) {
            return getRootRuntime();
        }
        ExpressionsRuntime runtimeWithOrNull = getRuntimeWithOrNull(parentResolver);
        if (runtimeWithOrNull == null) {
            reportParentRuntimeError(fullPath$div_release);
            return getRootRuntime();
        }
        if (!getNeedLocalRuntime(div)) {
            this.pathToRuntime.put(fullPath$div_release, runtimeWithOrNull);
            return runtimeWithOrNull;
        }
        ExpressionsRuntime createChildRuntime = this.runtimeProvider.createChildRuntime(path, div.value(), (ExpressionResolverImpl) parentResolver, this.errorCollector);
        putRuntime$div_release(createChildRuntime, fullPath$div_release, runtimeWithOrNull);
        return createChildRuntime;
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    @Nullable
    public ExpressionsRuntime getRuntimeWithOrNull(@NotNull ExpressionResolver resolver) {
        return this.resolverToRuntime.get(resolver);
    }

    public final void putRuntime$div_release(@NotNull ExpressionsRuntime runtime, @NotNull String path, @Nullable ExpressionsRuntime parentRuntime) {
        this.pathToRuntime.put(path, runtime);
        this.resolverToRuntime.put(runtime.getExpressionResolver(), runtime);
        this.allRuntimes.addObserver(runtime);
        this.tree.storeRuntime(runtime, parentRuntime, path);
        runtime.updateSubscriptions();
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    @Nullable
    public ExpressionsRuntime resolveRuntimeWith(@Nullable DivViewFacade divView, @NotNull DivStatePath path, @NotNull Div div, @NotNull ExpressionResolver resolver, @NotNull ExpressionResolver parentResolver) {
        ExpressionsRuntime expressionsRuntime;
        String fullPath$div_release = path.getFullPath$div_release();
        ExpressionsRuntime expressionsRuntime2 = this.pathToRuntime.get(fullPath$div_release);
        if (expressionsRuntime2 != null) {
            return expressionsRuntime2;
        }
        if (!(resolver instanceof ExpressionResolverImpl)) {
            return null;
        }
        ExpressionsRuntime runtimeWithOrNull = getRuntimeWithOrNull(parentResolver);
        if (runtimeWithOrNull == null) {
            reportParentRuntimeError(fullPath$div_release);
            return null;
        }
        if (getNeedLocalRuntime(div)) {
            expressionsRuntime = this.runtimeProvider.createChildRuntime(path, div.value(), (ExpressionResolverImpl) resolver, this.errorCollector);
            putRuntime$div_release(expressionsRuntime, fullPath$div_release, runtimeWithOrNull);
        } else if (!Intrinsics.areEqual(resolver, parentResolver)) {
            expressionsRuntime = new ExpressionsRuntime((ExpressionResolverImpl) resolver, null);
            putRuntime$div_release(expressionsRuntime, fullPath$div_release, runtimeWithOrNull);
        } else {
            this.pathToRuntime.put(fullPath$div_release, runtimeWithOrNull);
            return runtimeWithOrNull;
        }
        return expressionsRuntime;
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void cleanupRuntimes(@NotNull DivViewFacade divView) {
        this.warningShown = false;
        Iterator<ExpressionsRuntime> it = this.allRuntimes.iterator();
        while (it.hasNext()) {
            it.next().cleanup$div_release(divView);
        }
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void updateSubscriptions() {
        Iterator<ExpressionsRuntime> it = this.allRuntimes.iterator();
        while (it.hasNext()) {
            it.next().updateSubscriptions();
        }
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void clearBindings(@NotNull DivViewFacade divView) {
        Iterator<ExpressionsRuntime> it = this.allRuntimes.iterator();
        while (it.hasNext()) {
            it.next().clearBinding(divView);
        }
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void onDetachedFromWindow(@NotNull DivViewFacade divView) {
        Iterator<ExpressionsRuntime> it = this.allRuntimes.iterator();
        while (it.hasNext()) {
            it.next().onDetachedFromWindow(divView);
        }
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    public void traverseFrom(@NotNull ExpressionsRuntime runtime, @NotNull DivStatePath path, @NotNull final Function1 callback) {
        this.tree.invokeRecursively(runtime, path.getFullPath$div_release(), new Function1() { // from class: com.yandex.div.core.expression.local.RuntimeStoreImpl$traverseFrom$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((RuntimeTree.RuntimeNode) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull RuntimeTree.RuntimeNode runtimeNode) {
                Function1.this.invoke(runtimeNode.getRuntime());
            }
        });
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    @NotNull
    public Map<String, ExpressionsRuntime> getUniquePathsAndRuntimes() {
        return this.tree.getPathToRuntimes();
    }

    private final void reportParentRuntimeError(String path) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(RuntimeStoreImplKt.ERROR_PARENT_RUNTIME_NOT_STORED, Arrays.copyOf(new Object[]{path}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail(format);
        }
        this.errorCollector.logError(new AssertionError(format));
    }

    @Override // com.yandex.div.core.expression.local.RuntimeStore
    @NotNull
    public ExpressionResolver getOrPutItemBuilderResolver(@NotNull String path, @NotNull ExpressionResolver parentResolver, @NotNull Function0 createResolver) {
        Map<String, ExpressionResolver> map = this.itemBuilderResolvers;
        ExpressionResolver expressionResolver = map.get(path);
        if (expressionResolver == null) {
            expressionResolver = (ExpressionResolver) createResolver.mo4828invoke();
            ExpressionsRuntime runtimeWithOrNull = getRuntimeWithOrNull(parentResolver);
            if (runtimeWithOrNull != null) {
                this.resolverToRuntime.put(expressionResolver, runtimeWithOrNull);
            }
            map.put(path, expressionResolver);
        }
        return expressionResolver;
    }

    private final boolean getNeedLocalRuntime(Div div) {
        List variableTriggers;
        List functions;
        DivBase value = div.value();
        List variables = value.getVariables();
        return !((variables == null || variables.isEmpty()) && ((variableTriggers = value.getVariableTriggers()) == null || variableTriggers.isEmpty()) && ((functions = value.getFunctions()) == null || functions.isEmpty()));
    }
}
