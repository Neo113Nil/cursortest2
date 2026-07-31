package com.yandex.div.core.downloader;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.Div;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivCustom;
import com.yandex.div2.DivData;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivGrid;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivPatch;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivPatchApply.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u0000 <2\u00020\u0001:\u0001<B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\b\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\b\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\b\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\b\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\b\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\rH\u0002J$\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\f\u001a\u00020\rJ\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a2\u0006\u0010\n\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\rJ(\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001a2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001a2\u0006\u0010\f\u001a\u00020\rH\u0002J$\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\"0\u001a2\u0006\u0010\f\u001a\u00020\rH\u0002J\"\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u0007H\u0002J\\\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001e0,2\u0006\u0010\f\u001a\u00020\r2\u0018\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001a\u0012\u0004\u0012\u00020\u001e0.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001e00H\u0002J&\u00101\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001e0,2\u0006\u0010\f\u001a\u00020\rH\u0002J(\u00102\u001a\u0004\u0018\u00010\u001e2\u0006\u00103\u001a\u00020$2\u0006\u00104\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rJ6\u00106\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a2\u0006\u0010)\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020\u001e09H\u0002J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a*\u00020\u001e2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a*\u00020\u001eH\u0002J8\u00106\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a*\b\u0012\u0004\u0012\u00020\u001e0\u001a2\u0006\u00107\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020\u001e09H\u0002J\u0014\u0010;\u001a\u00020\"*\u00020\"2\u0006\u0010\f\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/yandex/div/core/downloader/DivPatchApply;", "", DivActionHandler.DivActionReason.PATCH, "Lcom/yandex/div/core/downloader/DivPatchMap;", "(Lcom/yandex/div/core/downloader/DivPatchMap;)V", "appliedPatches", "", "", "applyPatch", "Lcom/yandex/div2/Div$Container;", "div", "Lcom/yandex/div2/DivContainer;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "Lcom/yandex/div2/Div$Custom;", "Lcom/yandex/div2/DivCustom;", "Lcom/yandex/div2/Div$Gallery;", "Lcom/yandex/div2/DivGallery;", "Lcom/yandex/div2/Div$Grid;", "Lcom/yandex/div2/DivGrid;", "Lcom/yandex/div2/Div$Pager;", "Lcom/yandex/div2/DivPager;", "Lcom/yandex/div2/Div$State;", "Lcom/yandex/div2/DivState;", "Lcom/yandex/div2/Div$Tabs;", "Lcom/yandex/div2/DivTabs;", "", "Lcom/yandex/div2/DivData$State;", "states", "applyPatchForDiv", "Lcom/yandex/div2/Div;", "applyPatchForListOfDivs", "divs", "applyPatchForListStates", "Lcom/yandex/div2/DivState$State;", "findPatchedRecyclerViewAndNotifyChange", "Landroid/view/View;", "currentView", "divWithPatchedChild", "patchedChildId", "getPatchedDivCollection", "currentDiv", "items", "pathIterator", "", "createPatchedDiv", "Lkotlin/Function1;", "patchDiv", "Lkotlin/Function0;", "getPatchedTreeByPath", "patchDivChild", "parentView", "parentDiv", "idToPatch", "pathToChildWithId", "idToFind", "currentPath", "", "applyPatchForSingleDiv", "tryApplyPatchToDiv", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivPatchApply {

    @NotNull
    private static final String PATH_FOLLOWING_ERROR = "Unable to find the next child to patch by following a precalculated path";

    @NotNull
    public static final String TAG = "DivPatchApply";

    @NotNull
    private final Set<String> appliedPatches = new LinkedHashSet();

    @NotNull
    private final DivPatchMap patch;

    public DivPatchApply(@NotNull DivPatchMap divPatchMap) {
        this.patch = divPatchMap;
    }

    @Nullable
    public final List<DivData.State> applyPatch(@NotNull List<DivData.State> states, @NotNull ExpressionResolver resolver) {
        ArrayList arrayList = new ArrayList(states.size());
        for (DivData.State state : states) {
            arrayList.add(new DivData.State(applyPatch(state.div, resolver).get(0), state.stateId));
        }
        if (this.patch.getMode().evaluate(resolver) != DivPatch.Mode.TRANSACTIONAL || this.appliedPatches.size() == this.patch.getPatches().size()) {
            return arrayList;
        }
        return null;
    }

    @NotNull
    public final List<Div> applyPatchForDiv(@NotNull Div div, @NotNull ExpressionResolver resolver) {
        return applyPatch(div, resolver);
    }

    private final List<Div> applyPatch(Div div, ExpressionResolver expressionResolver) {
        String id = div.value().getId();
        if (id != null && this.patch.getPatches().containsKey(id)) {
            return applyPatchForSingleDiv(div);
        }
        if (div instanceof Div.Container) {
            div = applyPatch(((Div.Container) div).getValue(), expressionResolver);
        } else if (div instanceof Div.Grid) {
            div = applyPatch(((Div.Grid) div).getValue(), expressionResolver);
        } else if (div instanceof Div.Gallery) {
            div = applyPatch(((Div.Gallery) div).getValue(), expressionResolver);
        } else if (div instanceof Div.Pager) {
            div = applyPatch(((Div.Pager) div).getValue(), expressionResolver);
        } else if (div instanceof Div.State) {
            div = applyPatch(((Div.State) div).getValue(), expressionResolver);
        } else if (div instanceof Div.Tabs) {
            div = applyPatch(((Div.Tabs) div).getValue(), expressionResolver);
        } else if (div instanceof Div.Custom) {
            div = applyPatch(((Div.Custom) div).getValue(), expressionResolver);
        }
        return CollectionsKt.listOf(div);
    }

    private final List<Div> applyPatchForListOfDivs(List<? extends Div> divs, ExpressionResolver resolver) {
        if (divs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = divs.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, applyPatch((Div) it.next(), resolver));
        }
        return arrayList;
    }

    private final List<Div> applyPatchForSingleDiv(Div div) {
        String id = div.value().getId();
        if (id == null) {
            return CollectionsKt.listOf(div);
        }
        List<Div> list = this.patch.getPatches().get(id);
        if (list != null) {
            this.appliedPatches.add(id);
            return list;
        }
        return CollectionsKt.listOf(div);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Div.Container applyPatch(DivContainer div, ExpressionResolver resolver) {
        return new Div.Container(DivContainer.copy$default(div, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, applyPatchForListOfDivs(div.items, resolver), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 4194303, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Div.Grid applyPatch(DivGrid div, ExpressionResolver resolver) {
        return new Div.Grid(DivGrid.copy$default(div, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, applyPatchForListOfDivs(div.items, resolver), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, 16383, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Div.Gallery applyPatch(DivGallery div, ExpressionResolver resolver) {
        return new Div.Gallery(DivGallery.copy$default(div, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, applyPatchForListOfDivs(div.items, resolver), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048577, 2047, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Div.Pager applyPatch(DivPager div, ExpressionResolver resolver) {
        return new Div.Pager(DivPager.copy$default(div, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, applyPatchForListOfDivs(div.items, resolver), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 2047, null));
    }

    private final Div.State applyPatch(DivState div, ExpressionResolver resolver) {
        return new Div.State(DivState.copy$default(div, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, applyPatchForListStates(div.states, resolver), null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 65531, null));
    }

    private final Div.Custom applyPatch(DivCustom div, ExpressionResolver resolver) {
        DivCustom copy;
        copy = div.copy((r70 & 1) != 0 ? div.getAccessibility() : null, (r70 & 2) != 0 ? div.getAlignmentHorizontal() : null, (r70 & 4) != 0 ? div.getAlignmentVertical() : null, (r70 & 8) != 0 ? div.getAlpha() : null, (r70 & 16) != 0 ? div.getAnimators() : null, (r70 & 32) != 0 ? div.getBackground() : null, (r70 & 64) != 0 ? div.getBorder() : null, (r70 & 128) != 0 ? div.getColumnSpan() : null, (r70 & 256) != 0 ? div.customProps : null, (r70 & 512) != 0 ? div.customType : null, (r70 & 1024) != 0 ? div.getDisappearActions() : null, (r70 & 2048) != 0 ? div.getExtensions() : null, (r70 & 4096) != 0 ? div.getFocus() : null, (r70 & 8192) != 0 ? div.getFunctions() : null, (r70 & 16384) != 0 ? div.getHeight() : null, (r70 & 32768) != 0 ? div.getId() : null, (r70 & 65536) != 0 ? div.items : applyPatchForListOfDivs(div.items, resolver), (r70 & 131072) != 0 ? div.getLayoutProvider() : null, (r70 & 262144) != 0 ? div.getMargins() : null, (r70 & 524288) != 0 ? div.getPaddings() : null, (r70 & 1048576) != 0 ? div.getReuseId() : null, (r70 & 2097152) != 0 ? div.getRowSpan() : null, (r70 & 4194304) != 0 ? div.getSelectedActions() : null, (r70 & 8388608) != 0 ? div.getTooltips() : null, (r70 & 16777216) != 0 ? div.getTransform() : null, (r70 & 33554432) != 0 ? div.getTransitionChange() : null, (r70 & 67108864) != 0 ? div.getTransitionIn() : null, (r70 & 134217728) != 0 ? div.getTransitionOut() : null, (r70 & 268435456) != 0 ? div.getTransitionTriggers() : null, (r70 & 536870912) != 0 ? div.getVariableTriggers() : null, (r70 & 1073741824) != 0 ? div.getVariables() : null, (r70 & Integer.MIN_VALUE) != 0 ? div.getVisibility() : null, (r71 & 1) != 0 ? div.getVisibilityAction() : null, (r71 & 2) != 0 ? div.getVisibilityActions() : null, (r71 & 4) != 0 ? div.getWidth() : null);
        return new Div.Custom(copy);
    }

    private final List<DivState.State> applyPatchForListStates(List<DivState.State> states, ExpressionResolver resolver) {
        DivBase value;
        ArrayList arrayList = new ArrayList();
        for (DivState.State state : states) {
            Div div = state.div;
            String id = (div == null || (value = div.value()) == null) ? null : value.getId();
            if (id != null) {
                List<Div> list = this.patch.getPatches().get(id);
                if (list != null && list.size() == 1) {
                    arrayList.add(new DivState.State(state.animationIn, state.animationOut, list.get(0), state.stateId, state.swipeOutActions));
                    this.appliedPatches.add(id);
                } else if (list != null && list.isEmpty()) {
                    this.appliedPatches.add(id);
                } else {
                    arrayList.add(tryApplyPatchToDiv(state, resolver));
                }
            } else {
                arrayList.add(tryApplyPatchToDiv(state, resolver));
            }
        }
        return arrayList;
    }

    private final DivState.State tryApplyPatchToDiv(DivState.State state, ExpressionResolver expressionResolver) {
        Div div = state.div;
        List<Div> applyPatch = div != null ? applyPatch(div, expressionResolver) : null;
        return (applyPatch == null || applyPatch.size() != 1) ? state : new DivState.State(state.animationIn, state.animationOut, applyPatch.get(0), state.stateId, state.swipeOutActions);
    }

    private final Div.Tabs applyPatch(DivTabs div, ExpressionResolver resolver) {
        ArrayList arrayList = new ArrayList();
        for (DivTabs.Item item : div.items) {
            List<Div> applyPatch = applyPatch(item.div, resolver);
            if (applyPatch.size() == 1) {
                arrayList.add(new DivTabs.Item(applyPatch.get(0), item.title, item.titleClickAction));
            } else {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.ERROR)) {
                    kLog.print(6, TAG, "Unable to patch tab because there is more than 1 div in the patch");
                }
                arrayList.add(item);
            }
        }
        return new Div.Tabs(DivTabs.copy$default(div, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65537, 2047, null));
    }

    @Nullable
    public final Div patchDivChild(@NotNull View parentView, @NotNull Div parentDiv, @NotNull String idToPatch, @NotNull ExpressionResolver resolver) {
        List pathToChildWithId$default = pathToChildWithId$default(this, parentDiv, idToPatch, resolver, (List) null, 8, (Object) null);
        Iterator<? extends Div> it = pathToChildWithId$default.iterator();
        Object obj = null;
        if (pathToChildWithId$default.isEmpty()) {
            return null;
        }
        it.next();
        ListIterator listIterator = pathToChildWithId$default.listIterator(pathToChildWithId$default.size());
        while (listIterator.hasPrevious()) {
            Object previous = listIterator.previous();
            Div div = (Div) previous;
            if ((div instanceof Div.Gallery) || (div instanceof Div.Pager)) {
                obj = previous;
                break;
            }
        }
        Div div2 = (Div) obj;
        if (div2 != null) {
            findPatchedRecyclerViewAndNotifyChange(parentView, div2, idToPatch);
        }
        return getPatchedTreeByPath(parentDiv, it, resolver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List pathToChildWithId$default(DivPatchApply divPatchApply, Div div, String str, ExpressionResolver expressionResolver, List list, int i, Object obj) {
        if ((i & 8) != 0) {
            list = new ArrayList();
        }
        return divPatchApply.pathToChildWithId(div, str, expressionResolver, (List<Div>) list);
    }

    private final List<Div> pathToChildWithId(Div currentDiv, String idToFind, ExpressionResolver resolver, List<Div> currentPath) {
        DivBase value;
        currentPath.add(currentDiv);
        DivBase value2 = currentDiv.value();
        if (value2 instanceof DivContainer) {
            return pathToChildWithId(DivCollectionExtensionsKt.getNonNullItems((DivContainer) value2), idToFind, resolver, currentPath);
        }
        if (value2 instanceof DivGrid) {
            return pathToChildWithId(DivCollectionExtensionsKt.getNonNullItems((DivGrid) value2), idToFind, resolver, currentPath);
        }
        if (value2 instanceof DivGallery) {
            return pathToChildWithId(DivCollectionExtensionsKt.getNonNullItems((DivGallery) value2), idToFind, resolver, currentPath);
        }
        if (value2 instanceof DivPager) {
            return pathToChildWithId(DivCollectionExtensionsKt.getNonNullItems((DivPager) value2), idToFind, resolver, currentPath);
        }
        if (value2 instanceof DivTabs) {
            DivTabs divTabs = (DivTabs) value2;
            List list = divTabs.items;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((DivTabs.Item) it.next()).div.value().getId(), idToFind)) {
                        return currentPath;
                    }
                }
            }
            Iterator it2 = divTabs.items.iterator();
            while (it2.hasNext()) {
                List<Div> pathToChildWithId = pathToChildWithId(((DivTabs.Item) it2.next()).div, idToFind, resolver, currentPath);
                if (!pathToChildWithId.isEmpty()) {
                    return pathToChildWithId;
                }
                currentPath.remove(CollectionsKt.getLastIndex(currentPath));
            }
            return CollectionsKt.emptyList();
        }
        if (value2 instanceof DivState) {
            DivState divState = (DivState) value2;
            List list2 = divState.states;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    Div div = ((DivState.State) it3.next()).div;
                    if (Intrinsics.areEqual((div == null || (value = div.value()) == null) ? null : value.getId(), idToFind)) {
                        return currentPath;
                    }
                }
            }
            List list3 = divState.states;
            ArrayList arrayList = new ArrayList();
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                Div div2 = ((DivState.State) it4.next()).div;
                if (div2 != null) {
                    arrayList.add(div2);
                }
            }
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                List<Div> pathToChildWithId2 = pathToChildWithId((Div) it5.next(), idToFind, resolver, currentPath);
                if (!pathToChildWithId2.isEmpty()) {
                    return pathToChildWithId2;
                }
                currentPath.remove(CollectionsKt.getLastIndex(currentPath));
            }
            return CollectionsKt.emptyList();
        }
        return CollectionsKt.emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List pathToChildWithId$default(DivPatchApply divPatchApply, List list, String str, ExpressionResolver expressionResolver, List list2, int i, Object obj) {
        if ((i & 4) != 0) {
            list2 = new ArrayList();
        }
        return divPatchApply.pathToChildWithId((List<? extends Div>) list, str, expressionResolver, (List<Div>) list2);
    }

    private final List<Div> pathToChildWithId(List<? extends Div> list, String str, ExpressionResolver expressionResolver, List<Div> list2) {
        List<? extends Div> list3 = list;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((Div) it.next()).value().getId(), str)) {
                    return list2;
                }
            }
        }
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            List<Div> pathToChildWithId = pathToChildWithId((Div) it2.next(), str, expressionResolver, list2);
            if (!pathToChildWithId.isEmpty()) {
                return pathToChildWithId;
            }
            list2.remove(CollectionsKt.getLastIndex(list2));
        }
        return CollectionsKt.emptyList();
    }

    private final Div getPatchedTreeByPath(Div currentDiv, Iterator<? extends Div> pathIterator, final ExpressionResolver resolver) {
        Div state;
        final DivBase value = currentDiv.value();
        if (value instanceof DivContainer) {
            return getPatchedDivCollection(currentDiv, DivCollectionExtensionsKt.getNonNullItems((DivContainer) value), pathIterator, resolver, new Function1() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Div invoke(@NotNull List<? extends Div> list) {
                    return new Div.Container(DivContainer.copy$default((DivContainer) DivBase.this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 4194303, null));
                }
            }, new Function0() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final Div mo4828invoke() {
                    DivPatchMap divPatchMap;
                    Div.Container applyPatch;
                    divPatchMap = DivPatchApply.this.patch;
                    applyPatch = new DivPatchApply(divPatchMap).applyPatch((DivContainer) value, resolver);
                    return applyPatch;
                }
            });
        }
        if (value instanceof DivGrid) {
            return getPatchedDivCollection(currentDiv, DivCollectionExtensionsKt.getNonNullItems((DivGrid) value), pathIterator, resolver, new Function1() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Div invoke(@NotNull List<? extends Div> list) {
                    return new Div.Grid(DivGrid.copy$default((DivGrid) DivBase.this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, 16383, null));
                }
            }, new Function0() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final Div mo4828invoke() {
                    DivPatchMap divPatchMap;
                    Div.Grid applyPatch;
                    divPatchMap = DivPatchApply.this.patch;
                    applyPatch = new DivPatchApply(divPatchMap).applyPatch((DivGrid) value, resolver);
                    return applyPatch;
                }
            });
        }
        if (value instanceof DivGallery) {
            return getPatchedDivCollection(currentDiv, DivCollectionExtensionsKt.getNonNullItems((DivGallery) value), pathIterator, resolver, new Function1() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$5
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Div invoke(@NotNull List<? extends Div> list) {
                    return new Div.Gallery(DivGallery.copy$default((DivGallery) DivBase.this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048577, 2047, null));
                }
            }, new Function0() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final Div mo4828invoke() {
                    DivPatchMap divPatchMap;
                    Div.Gallery applyPatch;
                    divPatchMap = DivPatchApply.this.patch;
                    applyPatch = new DivPatchApply(divPatchMap).applyPatch((DivGallery) value, resolver);
                    return applyPatch;
                }
            });
        }
        if (value instanceof DivPager) {
            return getPatchedDivCollection(currentDiv, DivCollectionExtensionsKt.getNonNullItems((DivPager) value), pathIterator, resolver, new Function1() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$7
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Div invoke(@NotNull List<? extends Div> list) {
                    return new Div.Pager(DivPager.copy$default((DivPager) DivBase.this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 2047, null));
                }
            }, new Function0() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final Div mo4828invoke() {
                    DivPatchMap divPatchMap;
                    Div.Pager applyPatch;
                    divPatchMap = DivPatchApply.this.patch;
                    applyPatch = new DivPatchApply(divPatchMap).applyPatch((DivPager) value, resolver);
                    return applyPatch;
                }
            });
        }
        if (value instanceof DivTabs) {
            if (pathIterator.hasNext()) {
                DivTabs divTabs = (DivTabs) value;
                List mutableList = CollectionsKt.toMutableList((Collection) divTabs.items);
                List list = mutableList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DivTabs.Item) it.next()).div);
                }
                int indexOf = arrayList.indexOf(pathIterator.next());
                if (indexOf == -1) {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail(PATH_FOLLOWING_ERROR);
                    }
                    return currentDiv;
                }
                DivTabs.Item item = (DivTabs.Item) mutableList.get(indexOf);
                mutableList.set(indexOf, new DivTabs.Item(getPatchedTreeByPath(item.div, pathIterator, resolver), item.title, item.titleClickAction));
                state = new Div.Tabs(DivTabs.copy$default(divTabs, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mutableList, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65537, 2047, null));
            } else {
                return new DivPatchApply(this.patch).applyPatch((DivTabs) value, resolver);
            }
        } else {
            if (!(value instanceof DivState)) {
                return currentDiv;
            }
            if (pathIterator.hasNext()) {
                DivState divState = (DivState) value;
                List mutableList2 = CollectionsKt.toMutableList((Collection) divState.states);
                List list2 = mutableList2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((DivState.State) it2.next()).div);
                }
                int indexOf2 = arrayList2.indexOf(pathIterator.next());
                if (indexOf2 == -1) {
                    KAssert kAssert2 = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail(PATH_FOLLOWING_ERROR);
                    }
                    return currentDiv;
                }
                DivState.State state2 = (DivState.State) mutableList2.get(indexOf2);
                Div div = state2.div;
                if (div == null) {
                    return currentDiv;
                }
                mutableList2.set(indexOf2, new DivState.State(state2.animationIn, state2.animationOut, getPatchedTreeByPath(div, pathIterator, resolver), state2.stateId, state2.swipeOutActions));
                state = new Div.State(DivState.copy$default(divState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mutableList2, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 65531, null));
            } else {
                return new DivPatchApply(this.patch).applyPatch((DivState) value, resolver);
            }
        }
        return state;
    }

    private final Div getPatchedDivCollection(Div currentDiv, List<? extends Div> items, Iterator<? extends Div> pathIterator, ExpressionResolver resolver, Function1 createPatchedDiv, Function0 patchDiv) {
        if (!pathIterator.hasNext()) {
            return (Div) patchDiv.mo4828invoke();
        }
        int indexOf = items.indexOf(pathIterator.next());
        if (indexOf == -1) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(PATH_FOLLOWING_ERROR);
            }
            return currentDiv;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) items);
        mutableList.set(indexOf, getPatchedTreeByPath((Div) mutableList.get(indexOf), pathIterator, resolver));
        return (Div) createPatchedDiv.invoke(mutableList);
    }

    private final View findPatchedRecyclerViewAndNotifyChange(View currentView, Div divWithPatchedChild, String patchedChildId) {
        RecyclerView.Adapter adapter;
        Div.Pager div;
        DivPager value;
        List list;
        Div.Gallery div2;
        DivGallery value2;
        List list2;
        int i = 0;
        if (currentView instanceof DivRecyclerView) {
            DivRecyclerView divRecyclerView = (DivRecyclerView) currentView;
            if (divRecyclerView.getDiv() == divWithPatchedChild) {
                RecyclerView.Adapter adapter2 = divRecyclerView.getAdapter();
                DivGalleryAdapter divGalleryAdapter = adapter2 instanceof DivGalleryAdapter ? (DivGalleryAdapter) adapter2 : null;
                if (divGalleryAdapter != null && (div2 = divRecyclerView.getDiv()) != null && (value2 = div2.getValue()) != null && (list2 = value2.items) != null) {
                    for (Object obj : list2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (Intrinsics.areEqual(((Div) obj).value().getId(), patchedChildId)) {
                            divGalleryAdapter.notifyItemChanged(i);
                            return currentView;
                        }
                        i = i2;
                    }
                }
                return currentView;
            }
        } else if (currentView instanceof DivPagerView) {
            DivPagerView divPagerView = (DivPagerView) currentView;
            if (divPagerView.getDiv() == divWithPatchedChild) {
                View childAt = divPagerView.getViewPager().getChildAt(0);
                RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
                if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null && (div = divPagerView.getDiv()) != null && (value = div.getValue()) != null && (list = value.items) != null) {
                    for (Object obj2 : list) {
                        int i3 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (Intrinsics.areEqual(((Div) obj2).value().getId(), patchedChildId)) {
                            adapter.notifyItemChanged(i);
                            return currentView;
                        }
                        i = i3;
                    }
                }
                return currentView;
            }
        }
        if (currentView instanceof ViewGroup) {
            Iterator it = ViewGroupKt.getChildren((ViewGroup) currentView).iterator();
            while (it.hasNext()) {
                View findPatchedRecyclerViewAndNotifyChange = findPatchedRecyclerViewAndNotifyChange((View) it.next(), divWithPatchedChild, patchedChildId);
                if (findPatchedRecyclerViewAndNotifyChange != null) {
                    return findPatchedRecyclerViewAndNotifyChange;
                }
            }
        }
        return null;
    }
}
