package com.yandex.div.internal.core;

import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTreeVisitor.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH$¢\u0006\u0002\u0010\u000eJS\u0010\u000f\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011H\u0014¢\u0006\u0002\u0010\u0015J%\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0004¢\u0006\u0002\u0010\u000eJ%\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u0010\u001aJ%\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u0010\u001cJ%\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u0010\u001eJ%\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u0010 J%\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020!2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u0010\"J%\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020#2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u0010$J%\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020%2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u0010&J%\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020'2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u0010(J%\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020)2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u0010*J%\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020+2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u0010,J%\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020-2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u0010.J%\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020/2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u00100J%\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u0002012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u00102J%\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u0002032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u00104J%\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u0002052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u00106J%\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u0002072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u00108J%\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u0002092\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u0010:J-\u0010;\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010<\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010=J)\u0010\u0016\u001a\u00028\u0000*\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010<\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010>R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/yandex/div/internal/core/DivTreeVisitor;", "T", "", "returnCondition", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "defaultVisit", "data", "Lcom/yandex/div2/Div;", "context", "Lcom/yandex/div/core/view2/BindingContext;", "path", "Lcom/yandex/div/core/state/DivStatePath;", "(Lcom/yandex/div2/Div;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "defaultVisitCollection", "items", "", "itemBuilder", "Lcom/yandex/div2/DivCollectionItemBuilder;", "pathOverride", "(Lcom/yandex/div2/Div;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;Ljava/util/List;Lcom/yandex/div2/DivCollectionItemBuilder;Ljava/util/List;)Ljava/lang/Object;", "visit", "div", "parentContext", "Lcom/yandex/div2/Div$Container;", "(Lcom/yandex/div2/Div$Container;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lcom/yandex/div2/Div$Custom;", "(Lcom/yandex/div2/Div$Custom;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lcom/yandex/div2/Div$Gallery;", "(Lcom/yandex/div2/Div$Gallery;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lcom/yandex/div2/Div$GifImage;", "(Lcom/yandex/div2/Div$GifImage;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lcom/yandex/div2/Div$Grid;", "(Lcom/yandex/div2/Div$Grid;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lcom/yandex/div2/Div$Image;", "(Lcom/yandex/div2/Div$Image;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lcom/yandex/div2/Div$Indicator;", "(Lcom/yandex/div2/Div$Indicator;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lcom/yandex/div2/Div$Input;", "(Lcom/yandex/div2/Div$Input;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lcom/yandex/div2/Div$Pager;", "(Lcom/yandex/div2/Div$Pager;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lcom/yandex/div2/Div$Select;", "(Lcom/yandex/div2/Div$Select;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lcom/yandex/div2/Div$Separator;", "(Lcom/yandex/div2/Div$Separator;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lcom/yandex/div2/Div$Slider;", "(Lcom/yandex/div2/Div$Slider;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lcom/yandex/div2/Div$State;", "(Lcom/yandex/div2/Div$State;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lcom/yandex/div2/Div$Switch;", "(Lcom/yandex/div2/Div$Switch;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lcom/yandex/div2/Div$Tabs;", "(Lcom/yandex/div2/Div$Tabs;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lcom/yandex/div2/Div$Text;", "(Lcom/yandex/div2/Div$Text;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lcom/yandex/div2/Div$Video;", "(Lcom/yandex/div2/Div$Video;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "visitCollectionChild", "parent", "(Lcom/yandex/div2/Div;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;Ljava/lang/Object;)Ljava/lang/Object;", "(Lcom/yandex/div2/DivCollectionItemBuilder;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;Ljava/lang/Object;)Ljava/lang/Object;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DivTreeVisitor<T> {

    @Nullable
    private final Function1 returnCondition;

    /* JADX WARN: Multi-variable type inference failed */
    public DivTreeVisitor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    protected abstract T defaultVisit(@NotNull Div data, @NotNull BindingContext context, @NotNull DivStatePath path);

    public DivTreeVisitor(@Nullable Function1 function1) {
        this.returnCondition = function1;
    }

    public /* synthetic */ DivTreeVisitor(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    protected final T visit(@NotNull Div div, @NotNull BindingContext parentContext, @NotNull DivStatePath path) {
        BindingContext childContext = DivTreeVisitorKt.getChildContext(parentContext, div, path);
        if (div instanceof Div.Text) {
            return visit((Div.Text) div, childContext, path);
        }
        if (div instanceof Div.Image) {
            return visit((Div.Image) div, childContext, path);
        }
        if (div instanceof Div.GifImage) {
            return visit((Div.GifImage) div, childContext, path);
        }
        if (div instanceof Div.Separator) {
            return visit((Div.Separator) div, childContext, path);
        }
        if (div instanceof Div.Container) {
            return visit((Div.Container) div, childContext, path);
        }
        if (div instanceof Div.Grid) {
            return visit((Div.Grid) div, childContext, path);
        }
        if (div instanceof Div.Gallery) {
            return visit((Div.Gallery) div, childContext, path);
        }
        if (div instanceof Div.Pager) {
            return visit((Div.Pager) div, childContext, path);
        }
        if (div instanceof Div.Tabs) {
            return visit((Div.Tabs) div, childContext, path);
        }
        if (div instanceof Div.State) {
            return visit((Div.State) div, childContext, path);
        }
        if (div instanceof Div.Custom) {
            return visit((Div.Custom) div, childContext, path);
        }
        if (div instanceof Div.Indicator) {
            return visit((Div.Indicator) div, childContext, path);
        }
        if (div instanceof Div.Slider) {
            return visit((Div.Slider) div, childContext, path);
        }
        if (div instanceof Div.Input) {
            return visit((Div.Input) div, childContext, path);
        }
        if (div instanceof Div.Select) {
            return visit((Div.Select) div, childContext, path);
        }
        if (div instanceof Div.Video) {
            return visit((Div.Video) div, childContext, path);
        }
        if (div instanceof Div.Switch) {
            return visit((Div.Switch) div, childContext, path);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Object defaultVisitCollection$default(DivTreeVisitor divTreeVisitor, Div div, BindingContext bindingContext, DivStatePath divStatePath, List list, DivCollectionItemBuilder divCollectionItemBuilder, List list2, int i, Object obj) {
        if (obj == null) {
            return divTreeVisitor.defaultVisitCollection(div, bindingContext, divStatePath, list, (i & 16) != 0 ? null : divCollectionItemBuilder, (i & 32) != 0 ? null : list2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultVisitCollection");
    }

    protected T defaultVisitCollection(@NotNull Div data, @NotNull BindingContext context, @NotNull DivStatePath path, @Nullable List<? extends Div> items, @Nullable DivCollectionItemBuilder itemBuilder, @Nullable List<DivStatePath> pathOverride) {
        List<String> ids;
        DivStatePath appendDiv;
        T defaultVisit = defaultVisit(data, context, path);
        Function1 function1 = this.returnCondition;
        if (function1 != null && ((Boolean) function1.invoke(defaultVisit)).booleanValue()) {
            return defaultVisit;
        }
        if (itemBuilder != null) {
            return visit(itemBuilder, context, path, defaultVisit);
        }
        if (items != null && (ids = DivPathUtils.INSTANCE.getIds(items)) != null) {
            int i = 0;
            for (T t : items) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Div div = (Div) t;
                if (pathOverride == null || (appendDiv = pathOverride.get(i)) == null) {
                    appendDiv = path.appendDiv(ids.get(i));
                }
                T visitCollectionChild = visitCollectionChild(div, context, appendDiv, defaultVisit);
                Function1 function12 = this.returnCondition;
                if (function12 != null && ((Boolean) function12.invoke(visitCollectionChild)).booleanValue()) {
                    return visitCollectionChild;
                }
                i = i2;
            }
        }
        return defaultVisit;
    }

    private final T visit(DivCollectionItemBuilder divCollectionItemBuilder, BindingContext bindingContext, DivStatePath divStatePath, T t) {
        ExpressionResolver expressionResolver;
        List<DivItemBuilderResult> build = DivCollectionExtensionsKt.build(divCollectionItemBuilder, bindingContext.getExpressionResolver());
        List<String> itemIds = DivPathUtils.INSTANCE.getItemIds(build);
        int i = 0;
        for (T t2 : build) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) t2;
            DivStatePath appendDiv = divStatePath.appendDiv(itemIds.get(i));
            ExpressionsRuntime resolveRuntimeWith = bindingContext.getDivView().getRuntimeStore().resolveRuntimeWith(bindingContext.getDivView(), appendDiv, divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver(), bindingContext.getExpressionResolver());
            if (resolveRuntimeWith == null || (expressionResolver = resolveRuntimeWith.getExpressionResolver()) == null) {
                expressionResolver = divItemBuilderResult.getExpressionResolver();
            }
            T visitCollectionChild = visitCollectionChild(divItemBuilderResult.getDiv(), new BindingContext(bindingContext.getDivView(), expressionResolver), appendDiv, t);
            Function1 function1 = this.returnCondition;
            if (function1 != null && ((Boolean) function1.invoke(visitCollectionChild)).booleanValue()) {
                return visitCollectionChild;
            }
            i = i2;
        }
        return t;
    }

    protected T visitCollectionChild(@NotNull Div div, @NotNull BindingContext context, @NotNull DivStatePath path, T parent) {
        return visit(div, context, path);
    }

    protected T visit(@NotNull Div.Container data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return (T) defaultVisitCollection$default(this, data, context, path, data.getValue().items, data.getValue().itemBuilder, null, 32, null);
    }

    protected T visit(@NotNull Div.Grid data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return (T) defaultVisitCollection$default(this, data, context, path, data.getValue().items, null, null, 48, null);
    }

    protected T visit(@NotNull Div.Gallery data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return (T) defaultVisitCollection$default(this, data, context, path, data.getValue().items, data.getValue().itemBuilder, null, 32, null);
    }

    protected T visit(@NotNull Div.Pager data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return (T) defaultVisitCollection$default(this, data, context, path, data.getValue().items, data.getValue().itemBuilder, null, 32, null);
    }

    protected T visit(@NotNull Div.Tabs data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        List list = data.getValue().items;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DivTabs.Item) it.next()).div);
        }
        return (T) defaultVisitCollection$default(this, data, context, path, arrayList, null, null, 48, null);
    }

    protected T visit(@NotNull Div.State data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        String id$div_release$default = DivPathUtils.getId$div_release$default(DivPathUtils.INSTANCE, data.getValue(), null, 1, null);
        List<DivState.State> list = data.getValue().states;
        ArrayList arrayList = new ArrayList();
        for (DivState.State state : list) {
            DivStatePath append$div_release = state.div == null ? null : path.append$div_release(id$div_release$default, state, state.stateId);
            if (append$div_release != null) {
                arrayList.add(append$div_release);
            }
        }
        List list2 = data.getValue().states;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            Div div = ((DivState.State) it.next()).div;
            if (div != null) {
                arrayList2.add(div);
            }
        }
        return defaultVisitCollection(data, context, path, arrayList2, null, arrayList);
    }

    protected T visit(@NotNull Div.Custom data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return (T) defaultVisitCollection$default(this, data, context, path, data.getValue().items, null, null, 48, null);
    }

    protected T visit(@NotNull Div.Text data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull Div.Image data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull Div.GifImage data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull Div.Separator data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull Div.Indicator data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull Div.Slider data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull Div.Input data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull Div.Select data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull Div.Video data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull Div.Switch data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }
}
