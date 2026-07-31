package com.yandex.div.core.state;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.local.ChildPathUnitCache;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivData;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivPathUtils.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u0004\u0018\u00010\t*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJI\u0010\u0014\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0014\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\u00160\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0017J\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u001a*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010 \u001a\u0004\u0018\u00010\t*\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ;\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020$\u0018\u00010#*\u00020\u00182\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b%\u0010&J#\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040(H\u0000¢\u0006\u0004\b*\u0010+J%\u00103\u001a\u00020\n*\u00020-2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0000¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\n0(*\b\u0012\u0004\u0012\u00020\t0(¢\u0006\u0004\b4\u0010+J\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\n0(*\b\u0012\u0004\u0012\u00020\u00160(¢\u0006\u0004\b5\u0010+JO\u00104\u001a\b\u0012\u0004\u0012\u00020\n0(\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000(2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u00122\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u0001070\u0012¢\u0006\u0004\b4\u00108J\u0013\u00103\u001a\u0004\u0018\u00010\n*\u00020\t¢\u0006\u0004\b3\u00109¨\u0006:"}, d2 = {"Lcom/yandex/div/core/state/DivPathUtils;", "", "<init>", "()V", "Lcom/yandex/div/core/state/DivStatePath;", "other", "", "lastStateEquals", "(Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/state/DivStatePath;)Z", "Lcom/yandex/div2/Div;", "", "divId", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "findByPath", "(Lcom/yandex/div2/Div;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div2/Div;", "T", "", "Lkotlin/Function1;", "getDiv", "findRecursively", "(Ljava/lang/Iterable;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div2/Div;", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "(Ljava/lang/Iterable;Ljava/lang/String;)Lcom/yandex/div2/Div;", "Landroid/view/View;", "path", "Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;", "findStateLayout$div_release", "(Landroid/view/View;Lcom/yandex/div/core/state/DivStatePath;)Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;", "findStateLayout", "findDivState$div_release", "(Lcom/yandex/div2/Div;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div2/Div;", "findDivState", "Lcom/yandex/div2/DivData$State;", "state", "Lkotlin/Pair;", "Lcom/yandex/div2/Div$State;", "tryFindStateDivAndLayout$div_release", "(Landroid/view/View;Lcom/yandex/div2/DivData$State;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lkotlin/Pair;", "tryFindStateDivAndLayout", "", "paths", "compactPathList$div_release", "(Ljava/util/List;)Ljava/util/List;", "compactPathList", "Lcom/yandex/div2/DivState;", "Lkotlin/Function0;", "", "errorCallback", "getId$div_release", "(Lcom/yandex/div2/DivState;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;", "getId", "getIds", "getItemIds", "div", "Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "(Lcom/yandex/div2/Div;)Ljava/lang/String;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DivPathUtils {

    @NotNull
    public static final DivPathUtils INSTANCE = new DivPathUtils();

    private DivPathUtils() {
    }

    @Nullable
    public final DivStateLayout findStateLayout$div_release(@NotNull View view, @NotNull DivStatePath divStatePath) throws StateConflictException {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof DivStateLayout) {
            DivStateLayout divStateLayout = (DivStateLayout) view;
            if (lastStateEquals(divStateLayout.getPath(), divStatePath)) {
                return divStateLayout;
            }
        }
        Iterator it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
        DivStateLayout divStateLayout2 = null;
        while (it.hasNext()) {
            DivStateLayout findStateLayout$div_release = findStateLayout$div_release((View) it.next(), divStatePath);
            if (findStateLayout$div_release != null) {
                if (Intrinsics.areEqual(String.valueOf(divStateLayout2 != null ? divStateLayout2.getPath() : null), String.valueOf(findStateLayout$div_release.getPath()))) {
                    throw new StateConflictException("Error resolving state for '" + divStatePath + "'. Found multiple elements that respond to path '" + findStateLayout$div_release.getPath() + "'!", null, 2, null);
                }
                divStateLayout2 = findStateLayout$div_release;
            }
        }
        return divStateLayout2;
    }

    private final boolean lastStateEquals(DivStatePath divStatePath, DivStatePath divStatePath2) {
        DivStatePath parentState;
        if (divStatePath2.getContainsOnlyStates$div_release()) {
            return Intrinsics.areEqual(divStatePath != null ? divStatePath.getPathToLastState() : null, divStatePath2.getPathToLastState());
        }
        if (divStatePath != null && (parentState = divStatePath.parentState()) != null) {
            r1 = parentState.getFullPath$div_release();
        }
        return Intrinsics.areEqual(r1, divStatePath2.parentState().getFullPath$div_release());
    }

    @Nullable
    public final Div findDivState$div_release(@NotNull Div div, @NotNull DivStatePath divStatePath, @NotNull ExpressionResolver expressionResolver) {
        List<Pair<String, String>> states = divStatePath.getStates();
        if (states.isEmpty()) {
            return null;
        }
        Iterator<T> it = states.iterator();
        while (it.hasNext()) {
            String str = (String) ((Pair) it.next()).component1();
            if (div == null || (div = INSTANCE.findByPath(div, str, expressionResolver)) == null) {
                return null;
            }
        }
        return div;
    }

    @Nullable
    public final Pair<DivStateLayout, Div.State> tryFindStateDivAndLayout$div_release(@NotNull View view, @NotNull DivData.State state, @NotNull DivStatePath divStatePath, @NotNull ExpressionResolver expressionResolver) throws StateConflictException {
        Div.State state2;
        DivStateLayout findStateLayout$div_release = findStateLayout$div_release(view, divStatePath);
        if (findStateLayout$div_release == null) {
            DivStatePath parentState = divStatePath.parentState();
            if ((parentState.isRootPath() && state.stateId == divStatePath.getTopLevelStateId()) || findStateLayout$div_release(view, parentState) == null) {
                return null;
            }
        }
        if (findStateLayout$div_release == null || (state2 = findStateLayout$div_release.getDiv()) == null) {
            Div findDivState$div_release = findDivState$div_release(state.div, divStatePath, expressionResolver);
            state2 = findDivState$div_release instanceof Div.State ? (Div.State) findDivState$div_release : null;
            if (state2 == null) {
                return null;
            }
        }
        return new Pair<>(findStateLayout$div_release, state2);
    }

    @NotNull
    public final List<DivStatePath> compactPathList$div_release(@NotNull List<DivStatePath> paths) {
        List list;
        if (paths.isEmpty()) {
            return paths;
        }
        List sortedWith = CollectionsKt.sortedWith(paths, DivStatePath.INSTANCE.alphabeticalComparator$div_release());
        List<DivStatePath> list2 = sortedWith;
        Object first = CollectionsKt.first(sortedWith);
        int collectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(list2, 9);
        if (collectionSizeOrDefault == 0) {
            list = CollectionsKt.listOf(first);
        } else {
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault + 1);
            arrayList.add(first);
            Object obj = first;
            for (DivStatePath divStatePath : list2) {
                DivStatePath divStatePath2 = (DivStatePath) obj;
                if (!divStatePath2.isAncestorOf(divStatePath)) {
                    divStatePath2 = divStatePath;
                }
                arrayList.add(divStatePath2);
                obj = divStatePath2;
            }
            list = arrayList;
        }
        return CollectionsKt.distinct(list);
    }

    private final Div findByPath(Div div, String str, ExpressionResolver expressionResolver) {
        if (div instanceof Div.State) {
            Div.State state = (Div.State) div;
            if (!Intrinsics.areEqual(getId$div_release$default(INSTANCE, state.getValue(), null, 1, null), str)) {
                div = null;
            }
            Div.State state2 = (Div.State) div;
            return state2 != null ? state2 : findRecursively(state.getValue().states, str, expressionResolver, new Function1() { // from class: com.yandex.div.core.state.DivPathUtils$findByPath$2
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Div invoke(@NotNull DivState.State state3) {
                    return state3.div;
                }
            });
        }
        if (div instanceof Div.Tabs) {
            return findRecursively(((Div.Tabs) div).getValue().items, str, expressionResolver, new Function1() { // from class: com.yandex.div.core.state.DivPathUtils$findByPath$3
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Div invoke(@NotNull DivTabs.Item item) {
                    return item.div;
                }
            });
        }
        if (div instanceof Div.Container) {
            return findRecursively(DivCollectionExtensionsKt.buildItems(((Div.Container) div).getValue(), expressionResolver), str);
        }
        if (div instanceof Div.Grid) {
            return findRecursively$default(this, DivCollectionExtensionsKt.getNonNullItems(((Div.Grid) div).getValue()), str, expressionResolver, null, 4, null);
        }
        if (div instanceof Div.Gallery) {
            return findRecursively(DivCollectionExtensionsKt.buildItems(((Div.Gallery) div).getValue(), expressionResolver), str);
        }
        if (div instanceof Div.Pager) {
            return findRecursively(DivCollectionExtensionsKt.buildItems(((Div.Pager) div).getValue(), expressionResolver), str);
        }
        if (div instanceof Div.Custom) {
            List list = ((Div.Custom) div).getValue().items;
            if (list != null) {
                return findRecursively$default(this, list, str, expressionResolver, null, 4, null);
            }
            return null;
        }
        if ((div instanceof Div.Text) || (div instanceof Div.Image) || (div instanceof Div.Slider) || (div instanceof Div.Input) || (div instanceof Div.GifImage) || (div instanceof Div.Indicator) || (div instanceof Div.Separator) || (div instanceof Div.Select) || (div instanceof Div.Video) || (div instanceof Div.Switch)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    static /* synthetic */ Div findRecursively$default(DivPathUtils divPathUtils, Iterable iterable, String str, ExpressionResolver expressionResolver, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: com.yandex.div.core.state.DivPathUtils$findRecursively$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Div invoke(Object obj2) {
                    return (Div) obj2;
                }
            };
        }
        return divPathUtils.findRecursively(iterable, str, expressionResolver, function1);
    }

    private final <T> Div findRecursively(Iterable<? extends T> iterable, String str, ExpressionResolver expressionResolver, Function1 function1) {
        Div div;
        Iterator<? extends T> it = iterable.iterator();
        do {
            div = null;
            if (!it.hasNext()) {
                break;
            }
            Div div2 = (Div) function1.invoke(it.next());
            if (div2 != null) {
                div = INSTANCE.findByPath(div2, str, expressionResolver);
            }
        } while (div == null);
        return div;
    }

    private final Div findRecursively(Iterable<DivItemBuilderResult> iterable, String str) {
        for (DivItemBuilderResult divItemBuilderResult : iterable) {
            Div findByPath = INSTANCE.findByPath(divItemBuilderResult.getDiv(), str, divItemBuilderResult.getExpressionResolver());
            if (findByPath != null) {
                return findByPath;
            }
        }
        return null;
    }

    public static /* synthetic */ String getId$div_release$default(DivPathUtils divPathUtils, DivState divState, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        return divPathUtils.getId$div_release(divState, function0);
    }

    @NotNull
    public final String getId$div_release(@NotNull DivState divState, @Nullable Function0 function0) {
        String str = divState.divId;
        if (str != null) {
            return str;
        }
        String id = divState.getId();
        if (id != null) {
            return id;
        }
        if (function0 != null) {
            function0.mo4828invoke();
        }
        return "";
    }

    @NotNull
    public final List<String> getIds(@NotNull List<? extends Div> list) {
        return getIds$default(this, list, new Function1() { // from class: com.yandex.div.core.state.DivPathUtils$getIds$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Div invoke(@NotNull Div div) {
                return div;
            }
        }, null, 2, null);
    }

    @NotNull
    public final List<String> getItemIds(@NotNull List<DivItemBuilderResult> list) {
        return getIds(list, new Function1() { // from class: com.yandex.div.core.state.DivPathUtils$getItemIds$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Div invoke(@NotNull DivItemBuilderResult divItemBuilderResult) {
                return divItemBuilderResult.getDiv();
            }
        }, new Function1() { // from class: com.yandex.div.core.state.DivPathUtils$getItemIds$2
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final ExpressionResolverImpl invoke(@NotNull DivItemBuilderResult divItemBuilderResult) {
                return UtilsKt.getAsImpl(divItemBuilderResult.getExpressionResolver());
            }
        });
    }

    public static /* synthetic */ List getIds$default(DivPathUtils divPathUtils, List list, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 2) != 0) {
            function12 = new Function1() { // from class: com.yandex.div.core.state.DivPathUtils$getIds$2
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        return divPathUtils.getIds(list, function1, function12);
    }

    @NotNull
    public final <T> List<String> getIds(@NotNull List<? extends T> list, @NotNull Function1 function1, @NotNull Function1 function12) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<? extends T> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String id = INSTANCE.getId((Div) function1.invoke(it.next()));
            if (id != null) {
                Integer num = (Integer) linkedHashMap.get(id);
                linkedHashMap.put(id, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            }
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (T t : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String id2 = INSTANCE.getId((Div) function1.invoke(t));
            if (id2 != null) {
                Integer num2 = (Integer) linkedHashMap.get(id2);
                if ((num2 != null ? num2.intValue() : 0) > 1) {
                    id2 = id2 + '#' + i;
                }
                if (id2 != null) {
                    arrayList.add(id2);
                    i = i2;
                }
            }
            ExpressionResolverImpl expressionResolverImpl = (ExpressionResolverImpl) function12.invoke(t);
            id2 = expressionResolverImpl != null ? expressionResolverImpl.getItemBuilderData() : null;
            if (id2 == null) {
                id2 = ChildPathUnitCache.INSTANCE.getValue$div_release(i);
            }
            arrayList.add(id2);
            i = i2;
        }
        return arrayList;
    }

    @Nullable
    public final String getId(@NotNull Div div) {
        DivBase value = div.value();
        return value instanceof DivState ? getId$div_release$default(INSTANCE, (DivState) value, null, 1, null) : value.getId();
    }
}
