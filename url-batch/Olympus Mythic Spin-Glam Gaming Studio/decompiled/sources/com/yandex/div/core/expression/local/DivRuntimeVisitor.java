package com.yandex.div.core.expression.local;

import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.state.DivStateCache;
import com.yandex.div2.Div;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivRuntimeVisitor.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J(\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J(\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J(\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0012J*\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fH\u0012J(\u0010 \u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0012J0\u0010!\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0012JB\u0010$\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0012J(\u0010)\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020*2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0012J(\u0010+\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u001aH\u0012J(\u0010-\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020.2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0012J(\u0010-\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u001aH\u0012J$\u0010 \u001a\u00020\n*\u00020(2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u001aH\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;", "", "divStateCache", "Lcom/yandex/div/state/DivStateCache;", "temporaryStateCache", "Lcom/yandex/div/core/state/TemporaryDivStateCache;", "tabsCache", "Lcom/yandex/div/core/state/TabsStateCache;", "(Lcom/yandex/div/state/DivStateCache;Lcom/yandex/div/core/state/TemporaryDivStateCache;Lcom/yandex/div/core/state/TabsStateCache;)V", "createAndAttachRuntimes", "", "rootDiv", "Lcom/yandex/div2/Div;", "rootPath", "Lcom/yandex/div/core/state/DivStatePath;", "divView", "Lcom/yandex/div/core/view2/Div2View;", "createAndAttachRuntimesToState", "div", "Lcom/yandex/div2/DivState;", "path", "expressionResolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "createAndAttachRuntimesToTabs", "Lcom/yandex/div2/DivTabs;", "defaultVisit", "Lcom/yandex/div/core/expression/ExpressionsRuntime;", "parentRuntime", "getActiveStateId", "", "resolver", "Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "visit", "visitChild", "isActive", "", "visitContainer", "items", "", "itemBuilder", "Lcom/yandex/div2/DivCollectionItemBuilder;", "visitState", "Lcom/yandex/div2/Div$State;", "visitStates", "runtime", "visitTabs", "Lcom/yandex/div2/Div$Tabs;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes13.dex */
public class DivRuntimeVisitor {

    @NotNull
    private final DivStateCache divStateCache;

    @NotNull
    private final TabsStateCache tabsCache;

    @NotNull
    private final TemporaryDivStateCache temporaryStateCache;

    public DivRuntimeVisitor(@NotNull DivStateCache divStateCache, @NotNull TemporaryDivStateCache temporaryDivStateCache, @NotNull TabsStateCache tabsStateCache) {
        this.divStateCache = divStateCache;
        this.temporaryStateCache = temporaryDivStateCache;
        this.tabsCache = tabsStateCache;
    }

    public void createAndAttachRuntimes(@NotNull Div rootDiv, @NotNull DivStatePath rootPath, @NotNull Div2View divView) {
        ExpressionsRuntime rootRuntime = divView.getRuntimeStore().getRootRuntime();
        rootRuntime.onAttachedToWindow(divView);
        visit(rootDiv, divView, rootPath, rootRuntime);
    }

    public void createAndAttachRuntimesToState(@NotNull Div2View divView, @NotNull DivState div, @NotNull DivStatePath path, @NotNull ExpressionResolver expressionResolver) {
        ExpressionsRuntime runtimeWithOrNull = divView.getRuntimeStore().getRuntimeWithOrNull(expressionResolver);
        if (runtimeWithOrNull == null) {
            return;
        }
        visitStates(div, divView, path, runtimeWithOrNull);
    }

    public void createAndAttachRuntimesToTabs(@NotNull Div2View divView, @NotNull DivTabs div, @NotNull DivStatePath path, @NotNull ExpressionResolver expressionResolver) {
        ExpressionsRuntime runtimeWithOrNull = divView.getRuntimeStore().getRuntimeWithOrNull(expressionResolver);
        if (runtimeWithOrNull == null) {
            return;
        }
        visitTabs(div, divView, path, runtimeWithOrNull);
    }

    private void visit(Div div, Div2View divView, DivStatePath path, ExpressionsRuntime parentRuntime) {
        if (div instanceof Div.Container) {
            Div.Container container = (Div.Container) div;
            visitContainer(div, divView, container.getValue().items, container.getValue().itemBuilder, path, parentRuntime);
            return;
        }
        if (div instanceof Div.Grid) {
            visitContainer(div, divView, ((Div.Grid) div).getValue().items, null, path, parentRuntime);
            return;
        }
        if (div instanceof Div.Gallery) {
            Div.Gallery gallery = (Div.Gallery) div;
            visitContainer(div, divView, gallery.getValue().items, gallery.getValue().itemBuilder, path, parentRuntime);
            return;
        }
        if (div instanceof Div.Pager) {
            Div.Pager pager = (Div.Pager) div;
            visitContainer(div, divView, pager.getValue().items, pager.getValue().itemBuilder, path, parentRuntime);
            return;
        }
        if (div instanceof Div.State) {
            visitState((Div.State) div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof Div.Tabs) {
            visitTabs((Div.Tabs) div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof Div.Custom) {
            defaultVisit(div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof Div.GifImage) {
            defaultVisit(div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof Div.Image) {
            defaultVisit(div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof Div.Indicator) {
            defaultVisit(div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof Div.Input) {
            defaultVisit(div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof Div.Select) {
            defaultVisit(div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof Div.Separator) {
            defaultVisit(div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof Div.Slider) {
            defaultVisit(div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof Div.Text) {
            defaultVisit(div, divView, path, parentRuntime);
        } else if (div instanceof Div.Video) {
            defaultVisit(div, divView, path, parentRuntime);
        } else if (div instanceof Div.Switch) {
            defaultVisit(div, divView, path, parentRuntime);
        }
    }

    private ExpressionsRuntime defaultVisit(Div div, Div2View divView, DivStatePath path, ExpressionsRuntime parentRuntime) {
        ExpressionsRuntime orCreateRuntime = divView.getRuntimeStore().getOrCreateRuntime(path, div, parentRuntime.getExpressionResolver());
        orCreateRuntime.onAttachedToWindow(divView);
        return orCreateRuntime;
    }

    private void visitContainer(Div div, Div2View divView, List<? extends Div> items, DivCollectionItemBuilder itemBuilder, DivStatePath path, ExpressionsRuntime parentRuntime) {
        List<String> ids;
        ExpressionsRuntime defaultVisit = defaultVisit(div, divView, path, parentRuntime);
        if (itemBuilder != null) {
            visit(itemBuilder, divView, path, defaultVisit);
            return;
        }
        if (items == null || (ids = DivPathUtils.INSTANCE.getIds(items)) == null) {
            return;
        }
        int i = 0;
        for (Object obj : items) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            visit((Div) obj, divView, path.appendDiv(ids.get(i)), defaultVisit);
            i = i2;
        }
    }

    private void visit(DivCollectionItemBuilder divCollectionItemBuilder, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        List<DivItemBuilderResult> build = DivCollectionExtensionsKt.build(divCollectionItemBuilder, expressionsRuntime.getExpressionResolver());
        List<String> itemIds = DivPathUtils.INSTANCE.getItemIds(build);
        int i = 0;
        for (Object obj : build) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
            DivStatePath appendDiv = divStatePath.appendDiv(itemIds.get(i));
            ExpressionsRuntime resolveRuntimeWith = div2View.getRuntimeStore().resolveRuntimeWith(div2View, appendDiv, divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver(), expressionsRuntime.getExpressionResolver());
            Div div = divItemBuilderResult.getDiv();
            if (resolveRuntimeWith == null) {
                resolveRuntimeWith = expressionsRuntime;
            }
            visit(div, div2View, appendDiv, resolveRuntimeWith);
            i = i2;
        }
    }

    private String getActiveStateId(DivState div, Div2View divView, DivStatePath path, ExpressionResolverImpl resolver) {
        String str;
        String str2 = path.getStatesString$div_release() + '/' + path.getLastDivId$div_release();
        String id = divView.getDivTag().getId();
        String state = this.temporaryStateCache.getState(id, str2);
        if (state != null) {
            return state;
        }
        String state2 = this.divStateCache.getState(id, str2);
        if (state2 != null) {
            return state2;
        }
        String str3 = div.stateIdVariable;
        if (str3 != null) {
            Variable mutableVariable = resolver.getVariableController().getMutableVariable(str3);
            str = String.valueOf(mutableVariable != null ? mutableVariable.getValue() : null);
        } else {
            str = null;
        }
        if (str == null) {
            Expression expression = div.defaultStateId;
            str = expression != null ? (String) expression.evaluate(resolver) : null;
            if (str == null) {
                DivState.State state3 = (DivState.State) CollectionsKt.firstOrNull(div.states);
                if (state3 != null) {
                    return state3.stateId;
                }
                return null;
            }
        }
        return str;
    }

    private void visitState(Div.State div, Div2View divView, DivStatePath path, ExpressionsRuntime parentRuntime) {
        visitStates(div.getValue(), divView, path, defaultVisit(div, divView, path, parentRuntime));
    }

    private void visitStates(DivState div, Div2View divView, DivStatePath path, ExpressionsRuntime runtime) {
        String activeStateId = getActiveStateId(div, divView, path, runtime.getExpressionResolver());
        for (DivState.State state : div.states) {
            Div div2 = state.div;
            if (div2 != null) {
                visitChild(div2, divView, path.append$div_release(path.getLastDivId$div_release(), state, state.stateId), runtime, Intrinsics.areEqual(state.stateId, activeStateId));
            }
        }
    }

    private void visitTabs(Div.Tabs div, Div2View divView, DivStatePath path, ExpressionsRuntime parentRuntime) {
        visitTabs(div.getValue(), divView, path, defaultVisit(div, divView, path, parentRuntime));
    }

    private void visitTabs(DivTabs div, Div2View divView, DivStatePath path, ExpressionsRuntime runtime) {
        int i;
        Integer selectedTab = this.tabsCache.getSelectedTab(divView.getDataTag().getId(), path.getFullPath$div_release());
        if (selectedTab != null) {
            i = selectedTab.intValue();
        } else {
            long longValue = ((Number) div.selectedTab.evaluate(runtime.getExpressionResolver())).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        int i2 = i;
        List ids$default = DivPathUtils.getIds$default(DivPathUtils.INSTANCE, div.items, new Function1() { // from class: com.yandex.div.core.expression.local.DivRuntimeVisitor$visitTabs$ids$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Div invoke(@NotNull DivTabs.Item item) {
                return item.div;
            }
        }, null, 2, null);
        int i3 = 0;
        for (Object obj : div.items) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            visitChild(((DivTabs.Item) obj).div, divView, path.appendDiv((String) ids$default.get(i3)), runtime, i2 == i3);
            i3 = i4;
        }
    }

    private void visitChild(Div div, final Div2View divView, DivStatePath path, ExpressionsRuntime parentRuntime, boolean isActive) {
        if (isActive) {
            visit(div, divView, path, parentRuntime);
        } else {
            divView.getRuntimeStore().traverseFrom(divView.getRuntimeStore().getOrCreateRuntime(path, div, parentRuntime.getExpressionResolver()), path, new Function1() { // from class: com.yandex.div.core.expression.local.DivRuntimeVisitor$visitChild$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ExpressionsRuntime) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull ExpressionsRuntime expressionsRuntime) {
                    expressionsRuntime.clearBinding(Div2View.this);
                }
            });
        }
    }
}
