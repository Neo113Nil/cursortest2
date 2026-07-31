package com.yandex.div.core.view2;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnyThread;
import androidx.core.os.HandlerCompat;
import androidx.core.view.ViewGroupKt;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.SynchronizedWeakHashMap;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.divs.DivSightExtensionsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.KLog;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.Div;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivSightAction;
import com.yandex.div2.DivVisibilityAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivVisibilityActionTracker.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0011\u0018\u0000 H2\u00020\u0001:\u0001HB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\bH\u0012J\"\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0011H\u0016J\u0014\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110+H\u0016J:\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u0010!\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\"\u001a\u00020#2\u0006\u00101\u001a\u0002022\u0006\u0010$\u001a\u00020\bH\u0012J>\u00103\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u0010!\u001a\u00020\u000b2\f\u00104\u001a\b\u0012\u0004\u0012\u00020#052\u0006\u00106\u001a\u0002072\u0006\u0010$\u001a\u00020\bH\u0012J\"\u00108\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000b2\b\u00109\u001a\u0004\u0018\u00010\u0011H\u0016J \u0010:\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0011H\u0016J>\u0010;\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\u0006\u0010!\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u00112\u001a\u0010<\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00160=H\u0012JD\u0010>\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00112\f\u0010?\u001a\b\u0012\u0004\u0012\u00020@052\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\r05H\u0012JJ\u0010B\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u0010!\u001a\u0004\u0018\u00010\u000b2\u0006\u0010)\u001a\u00020\u00112\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020@052\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020\r05H\u0017J \u0010C\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00112\u0006\u00101\u001a\u000202H\u0012J\u0016\u0010D\u001a\u00020\u001e2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000b05H\u0017J*\u0010F\u001a\b\u0012\u0004\u0012\u0002HG05\"\b\b\u0000\u0010G*\u00020#*\b\u0012\u0004\u0012\u0002HG052\u0006\u0010/\u001a\u000200H\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0092\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0092\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u0010X\u0092\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\nX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0092\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0092\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\nX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\nX\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/yandex/div/core/view2/DivVisibilityActionTracker;", "", "viewVisibilityCalculator", "Lcom/yandex/div/core/view2/ViewVisibilityCalculator;", "visibilityActionDispatcher", "Lcom/yandex/div/core/view2/DivVisibilityActionDispatcher;", "(Lcom/yandex/div/core/view2/ViewVisibilityCalculator;Lcom/yandex/div/core/view2/DivVisibilityActionDispatcher;)V", "appearTrackedTokens", "Lcom/yandex/div/core/view2/DivVisibilityTokenHolder;", "appearedForDisappearActions", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "", "Lcom/yandex/div2/DivDisappearAction;", "disappearTrackedTokens", "divWithWaitingDisappearActions", "Lcom/yandex/div/core/util/SynchronizedWeakHashMap;", "Lcom/yandex/div2/Div;", "enqueuedVisibilityActions", "handler", "Landroid/os/Handler;", "hasPostedUpdateVisibilityTask", "", "isEnabledObserver", "Lcom/yandex/div/core/view2/SightActionIsEnabledObserver;", "previousVisibilityIsFull", "updateVisibilityTask", "Ljava/lang/Runnable;", "visibleActions", "cancelTracking", "", "compositeLogId", "Lcom/yandex/div/core/view2/CompositeLogId;", "view", "action", "Lcom/yandex/div2/DivSightAction;", "trackedTokens", "cancelTrackingViewsHierarchy", "context", "Lcom/yandex/div/core/view2/BindingContext;", "root", "div", "getDivWithWaitingDisappearActions", "", "shouldTrackVisibilityAction", "scope", "Lcom/yandex/div/core/view2/Div2View;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "visibilityPercentage", "", "startTracking", "actions", "", "delayMs", "", "startTrackingViewsHierarchy", "rootDiv", "trackDetachedView", "trackViewsHierarchy", "trackAction", "Lkotlin/Function2;", "trackVisibilityActions", "appearActions", "Lcom/yandex/div2/DivVisibilityAction;", "disappearActions", "trackVisibilityActionsOf", "updateVisibility", "updateVisibleViews", "viewList", "filterEnabled", "T", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes12.dex */
public class DivVisibilityActionTracker {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAG = "DivVisibilityActionTracker";
    private boolean hasPostedUpdateVisibilityTask;

    @NotNull
    private final ViewVisibilityCalculator viewVisibilityCalculator;

    @NotNull
    private final DivVisibilityActionDispatcher visibilityActionDispatcher;

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @NotNull
    private final DivVisibilityTokenHolder appearTrackedTokens = new DivVisibilityTokenHolder();

    @NotNull
    private final DivVisibilityTokenHolder disappearTrackedTokens = new DivVisibilityTokenHolder();

    @NotNull
    private final SightActionIsEnabledObserver isEnabledObserver = new SightActionIsEnabledObserver(new Function5() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$isEnabledObserver$1
        {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            invoke((Div2View) obj, (ExpressionResolver) obj2, (View) obj3, (Div) obj4, (DivSightAction) obj5);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull Div div, @NotNull DivSightAction divSightAction) {
            if (divSightAction instanceof DivVisibilityAction) {
                DivVisibilityActionTracker.this.trackVisibilityActions(div2View, expressionResolver, view, div, CollectionsKt.listOf(divSightAction), CollectionsKt.emptyList());
            } else if (divSightAction instanceof DivDisappearAction) {
                DivVisibilityActionTracker.this.trackVisibilityActions(div2View, expressionResolver, view, div, CollectionsKt.emptyList(), CollectionsKt.listOf(divSightAction));
            }
        }
    }, new Function5() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$isEnabledObserver$2
        {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            invoke((Div2View) obj, (ExpressionResolver) obj2, (View) obj3, (Div) obj4, (DivSightAction) obj5);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull Div div, @NotNull DivSightAction divSightAction) {
            DivVisibilityTokenHolder divVisibilityTokenHolder;
            DivVisibilityTokenHolder divVisibilityTokenHolder2;
            if (divSightAction instanceof DivVisibilityAction) {
                DivVisibilityActionTracker divVisibilityActionTracker = DivVisibilityActionTracker.this;
                divVisibilityTokenHolder2 = divVisibilityActionTracker.appearTrackedTokens;
                divVisibilityActionTracker.shouldTrackVisibilityAction(div2View, expressionResolver, null, divSightAction, 0, divVisibilityTokenHolder2);
            } else if (divSightAction instanceof DivDisappearAction) {
                DivVisibilityActionTracker divVisibilityActionTracker2 = DivVisibilityActionTracker.this;
                divVisibilityTokenHolder = divVisibilityActionTracker2.disappearTrackedTokens;
                divVisibilityActionTracker2.shouldTrackVisibilityAction(div2View, expressionResolver, null, divSightAction, 0, divVisibilityTokenHolder);
            }
        }
    });

    @NotNull
    private final WeakHashMap<View, Div> visibleActions = new WeakHashMap<>();

    @NotNull
    private final WeakHashMap<View, Div> enqueuedVisibilityActions = new WeakHashMap<>();

    @NotNull
    private final WeakHashMap<View, Boolean> previousVisibilityIsFull = new WeakHashMap<>();

    @NotNull
    private final SynchronizedWeakHashMap<View, Div> divWithWaitingDisappearActions = new SynchronizedWeakHashMap<>();

    @NotNull
    private final WeakHashMap<View, Set<DivDisappearAction>> appearedForDisappearActions = new WeakHashMap<>();

    @NotNull
    private final Runnable updateVisibilityTask = new Runnable() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            DivVisibilityActionTracker.updateVisibilityTask$lambda$0(DivVisibilityActionTracker.this);
        }
    };

    public DivVisibilityActionTracker(@NotNull ViewVisibilityCalculator viewVisibilityCalculator, @NotNull DivVisibilityActionDispatcher divVisibilityActionDispatcher) {
        this.viewVisibilityCalculator = viewVisibilityCalculator;
        this.visibilityActionDispatcher = divVisibilityActionDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateVisibilityTask$lambda$0(DivVisibilityActionTracker divVisibilityActionTracker) {
        divVisibilityActionTracker.visibilityActionDispatcher.dispatchVisibleViewsChanged(divVisibilityActionTracker.visibleActions);
        divVisibilityActionTracker.hasPostedUpdateVisibilityTask = false;
    }

    @NotNull
    public Map<View, Div> getDivWithWaitingDisappearActions() {
        return this.divWithWaitingDisappearActions.createMap();
    }

    @AnyThread
    public void updateVisibleViews(@NotNull List<? extends View> viewList) {
        Iterator<Map.Entry<View, Div>> it = this.visibleActions.entrySet().iterator();
        while (it.hasNext()) {
            if (!viewList.contains(it.next().getKey())) {
                it.remove();
            }
        }
        if (this.hasPostedUpdateVisibilityTask) {
            return;
        }
        this.hasPostedUpdateVisibilityTask = true;
        this.handler.post(this.updateVisibilityTask);
    }

    public static /* synthetic */ void trackVisibilityActionsOf$default(DivVisibilityActionTracker divVisibilityActionTracker, Div2View div2View, ExpressionResolver expressionResolver, View view, Div div, List list, List list2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackVisibilityActionsOf");
        }
        if ((i & 16) != 0) {
            list = DivUtilKt.getAllAppearActions(div.value());
        }
        List list3 = list;
        if ((i & 32) != 0) {
            list2 = DivUtilKt.getAllDisappearActions(div.value());
        }
        divVisibilityActionTracker.trackVisibilityActionsOf(div2View, expressionResolver, view, div, list3, list2);
    }

    @AnyThread
    public void trackVisibilityActionsOf(@NotNull final Div2View scope, @NotNull final ExpressionResolver resolver, @Nullable final View view, @NotNull final Div div, @NotNull final List<DivVisibilityAction> appearActions, @NotNull final List<DivDisappearAction> disappearActions) {
        List<DivDisappearAction> list = disappearActions;
        final List<? extends DivSightAction> plus = CollectionsKt.plus((Collection) appearActions, (Iterable) list);
        if (plus.isEmpty()) {
            return;
        }
        final DivDataTag dataTag = scope.getDataTag();
        if (view != null) {
            if (this.enqueuedVisibilityActions.containsKey(view)) {
                return;
            }
            if (!ViewsKt.isHierarchyLaidOut(view) || view.isLayoutRequested()) {
                View farthestLayoutCaller = ViewsKt.farthestLayoutCaller(view);
                if (farthestLayoutCaller != null) {
                    farthestLayoutCaller.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$trackVisibilityActionsOf$$inlined$doOnHierarchyLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                            view2.removeOnLayoutChangeListener(this);
                            if (Intrinsics.areEqual(Div2View.this.getDataTag(), dataTag)) {
                                this.isEnabledObserver.observe(view, Div2View.this, resolver, div, plus);
                                DivVisibilityActionTracker divVisibilityActionTracker = this;
                                Div2View div2View = Div2View.this;
                                ExpressionResolver expressionResolver = resolver;
                                divVisibilityActionTracker.trackVisibilityActions(div2View, expressionResolver, view, div, divVisibilityActionTracker.filterEnabled(appearActions, expressionResolver), this.filterEnabled(disappearActions, resolver));
                            }
                            this.enqueuedVisibilityActions.remove(view);
                        }
                    });
                    Unit unit = Unit.INSTANCE;
                }
                this.enqueuedVisibilityActions.put(view, div);
                return;
            }
            if (Intrinsics.areEqual(scope.getDataTag(), dataTag)) {
                this.isEnabledObserver.observe(view, scope, resolver, div, plus);
                trackVisibilityActions(scope, resolver, view, div, filterEnabled(appearActions, resolver), filterEnabled(disappearActions, resolver));
            }
            this.enqueuedVisibilityActions.remove(view);
            return;
        }
        this.isEnabledObserver.cancelObserving(plus);
        Iterator<T> it = appearActions.iterator();
        while (it.hasNext()) {
            shouldTrackVisibilityAction(scope, resolver, null, (DivVisibilityAction) it.next(), 0, this.appearTrackedTokens);
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            shouldTrackVisibilityAction(scope, resolver, null, (DivDisappearAction) it2.next(), 0, this.disappearTrackedTokens);
        }
    }

    public void trackDetachedView(@NotNull BindingContext context, @NotNull View view, @NotNull Div div) {
        List disappearActions = div.value().getDisappearActions();
        if (disappearActions == null) {
            return;
        }
        ExpressionResolver expressionResolver = context.getExpressionResolver();
        trackVisibilityActions(context.getDivView(), expressionResolver, view, div, CollectionsKt.emptyList(), filterEnabled(disappearActions, expressionResolver));
    }

    public void startTrackingViewsHierarchy(@NotNull final BindingContext context, @NotNull View root, @Nullable Div rootDiv) {
        trackViewsHierarchy(context, root, rootDiv, new Function2() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$startTrackingViewsHierarchy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final Boolean invoke(@NotNull View view, @Nullable Div div) {
                ViewVisibilityCalculator viewVisibilityCalculator;
                WeakHashMap weakHashMap;
                boolean z;
                WeakHashMap weakHashMap2;
                viewVisibilityCalculator = DivVisibilityActionTracker.this.viewVisibilityCalculator;
                boolean isViewFullyVisible = viewVisibilityCalculator.isViewFullyVisible(view);
                if (isViewFullyVisible) {
                    weakHashMap2 = DivVisibilityActionTracker.this.previousVisibilityIsFull;
                    if (Intrinsics.areEqual(weakHashMap2.get(view), Boolean.TRUE)) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                Boolean valueOf = Boolean.valueOf(isViewFullyVisible);
                weakHashMap = DivVisibilityActionTracker.this.previousVisibilityIsFull;
                weakHashMap.put(view, valueOf);
                if (div != null) {
                    DivVisibilityActionTracker divVisibilityActionTracker = DivVisibilityActionTracker.this;
                    BindingContext bindingContext = context;
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(divVisibilityActionTracker, bindingContext.getDivView(), bindingContext.getExpressionResolver(), view, div, null, null, 48, null);
                }
                z = true;
                return Boolean.valueOf(z);
            }
        });
    }

    public void cancelTrackingViewsHierarchy(@NotNull final BindingContext context, @NotNull View root, @Nullable Div div) {
        trackViewsHierarchy(context, root, div, new Function2() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$cancelTrackingViewsHierarchy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final Boolean invoke(@NotNull View view, @Nullable Div div2) {
                WeakHashMap weakHashMap;
                weakHashMap = DivVisibilityActionTracker.this.previousVisibilityIsFull;
                weakHashMap.remove(view);
                if (div2 != null) {
                    DivVisibilityActionTracker divVisibilityActionTracker = DivVisibilityActionTracker.this;
                    BindingContext bindingContext = context;
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(divVisibilityActionTracker, bindingContext.getDivView(), bindingContext.getExpressionResolver(), null, div2, null, null, 48, null);
                }
                return Boolean.TRUE;
            }
        });
    }

    private void trackViewsHierarchy(BindingContext context, View view, Div div, Function2 trackAction) {
        if (((Boolean) trackAction.invoke(view, div)).booleanValue() && (view instanceof ViewGroup)) {
            for (View view2 : ViewGroupKt.getChildren((ViewGroup) view)) {
                trackViewsHierarchy(context, view2, context.getDivView().takeBindingDiv$div_release(view2), trackAction);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackVisibilityActions(Div2View scope, ExpressionResolver resolver, View view, Div div, List<DivVisibilityAction> appearActions, List<DivDisappearAction> disappearActions) {
        ExpressionResolver expressionResolver = resolver;
        Assert.assertMainThread();
        int calculateVisibilityPercentage = this.viewVisibilityCalculator.calculateVisibilityPercentage(view);
        updateVisibility(view, div, calculateVisibilityPercentage);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : appearActions) {
            Long valueOf = Long.valueOf(DivSightExtensionsKt.getDuration((DivVisibilityAction) obj).evaluate(expressionResolver).longValue());
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            long longValue = ((Number) entry.getKey()).longValue();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj3 : list) {
                Iterator it2 = it;
                if (shouldTrackVisibilityAction(scope, resolver, view, (DivVisibilityAction) obj3, calculateVisibilityPercentage, this.appearTrackedTokens)) {
                    arrayList.add(obj3);
                }
                it = it2;
            }
            Iterator it3 = it;
            if (!arrayList.isEmpty()) {
                startTracking(scope, resolver, view, arrayList, longValue, this.appearTrackedTokens);
            }
            it = it3;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj4 : disappearActions) {
            Long valueOf2 = Long.valueOf(DivSightExtensionsKt.getDuration((DivDisappearAction) obj4).evaluate(expressionResolver).longValue());
            Object obj5 = linkedHashMap2.get(valueOf2);
            if (obj5 == null) {
                obj5 = new ArrayList();
                linkedHashMap2.put(valueOf2, obj5);
            }
            ((List) obj5).add(obj4);
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            long longValue2 = ((Number) entry2.getKey()).longValue();
            List list2 = (List) entry2.getValue();
            List<DivDisappearAction> list3 = list2;
            boolean z = false;
            for (DivDisappearAction divDisappearAction : list3) {
                boolean z2 = z;
                z = true;
                boolean z3 = ((long) calculateVisibilityPercentage) > ((Number) divDisappearAction.visibilityPercentage.evaluate(expressionResolver)).longValue();
                if (!z2 && !z3) {
                    z = false;
                }
                if (z3) {
                    WeakHashMap<View, Set<DivDisappearAction>> weakHashMap = this.appearedForDisappearActions;
                    Set<DivDisappearAction> set = weakHashMap.get(view);
                    if (set == null) {
                        set = new LinkedHashSet<>();
                        weakHashMap.put(view, set);
                    }
                    set.add(divDisappearAction);
                }
            }
            if (z) {
                this.divWithWaitingDisappearActions.put(view, div);
            }
            ArrayList arrayList2 = new ArrayList(list2.size());
            for (Object obj6 : list3) {
                if (shouldTrackVisibilityAction(scope, resolver, view, (DivDisappearAction) obj6, calculateVisibilityPercentage, this.disappearTrackedTokens)) {
                    arrayList2.add(obj6);
                }
            }
            if (!arrayList2.isEmpty()) {
                startTracking(scope, resolver, view, arrayList2, longValue2, this.disappearTrackedTokens);
            }
            expressionResolver = resolver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0046, code lost:
    
        if (r12 <= ((java.lang.Number) ((com.yandex.div2.DivDisappearAction) r11).visibilityPercentage.evaluate(r9)).longValue()) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r12 >= ((java.lang.Number) ((com.yandex.div2.DivVisibilityAction) r11).visibilityPercentage.evaluate(r9)).longValue()) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r12 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean shouldTrackVisibilityAction(Div2View scope, ExpressionResolver resolver, View view, DivSightAction action, int visibilityPercentage, DivVisibilityTokenHolder trackedTokens) {
        boolean z;
        if (!(action instanceof DivVisibilityAction)) {
            if (action instanceof DivDisappearAction) {
                Set<DivDisappearAction> set = this.appearedForDisappearActions.get(view);
                if (set != null ? set.contains(action) : false) {
                }
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Trying to check visibility for class without known visibility range");
                }
            }
            z = false;
        }
        CompositeLogId logId = trackedTokens.getLogId(CompositeLogIdKt.compositeLogIdOf(scope, (String) action.getLogId().evaluate(resolver)));
        if (view != null && logId == null && z) {
            return true;
        }
        if ((view == null || logId != null || z) && (view == null || logId == null || !z)) {
            if (view != null && logId != null && !z) {
                cancelTracking(logId, view, action, trackedTokens);
            } else if (view == null && logId != null) {
                cancelTracking(logId, null, action, trackedTokens);
            }
        }
        return false;
    }

    private void startTracking(final Div2View scope, final ExpressionResolver resolver, final View view, final List<? extends DivSightAction> actions, long delayMs, DivVisibilityTokenHolder trackedTokens) {
        HashMap hashMap = new HashMap(actions.size(), 1.0f);
        for (DivSightAction divSightAction : actions) {
            CompositeLogId compositeLogIdOf = CompositeLogIdKt.compositeLogIdOf(scope, (String) divSightAction.getLogId().evaluate(resolver));
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.INFO)) {
                kLog.print(4, TAG, "startTracking: id=" + compositeLogIdOf);
            }
            Pair pair = TuplesKt.to(compositeLogIdOf, divSightAction);
            hashMap.put(pair.getFirst(), pair.getSecond());
        }
        final Map<CompositeLogId, DivSightAction> synchronizedMap = Collections.synchronizedMap(hashMap);
        trackedTokens.add(synchronizedMap);
        final String logId = scope.getLogId();
        Handler handler = this.handler;
        Runnable runnable = new Runnable() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$startTracking$$inlined$postDelayed$1
            @Override // java.lang.Runnable
            public final void run() {
                WeakHashMap weakHashMap;
                DivVisibilityActionDispatcher divVisibilityActionDispatcher;
                WeakHashMap weakHashMap2;
                SynchronizedWeakHashMap synchronizedWeakHashMap;
                KLog kLog2 = KLog.INSTANCE;
                if (kLog2.isAtLeast(Severity.INFO)) {
                    kLog2.print(4, DivVisibilityActionTracker.TAG, "dispatchActions: id=" + CollectionsKt.joinToString$default(synchronizedMap.keySet(), null, null, null, 0, null, null, 63, null));
                }
                weakHashMap = DivVisibilityActionTracker.this.appearedForDisappearActions;
                Set set = (Set) weakHashMap.get(view);
                if (set != null) {
                    List list = actions;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof DivDisappearAction) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        set.remove((DivDisappearAction) it.next());
                    }
                    if (set.isEmpty()) {
                        weakHashMap2 = DivVisibilityActionTracker.this.appearedForDisappearActions;
                        weakHashMap2.remove(view);
                        synchronizedWeakHashMap = DivVisibilityActionTracker.this.divWithWaitingDisappearActions;
                        synchronizedWeakHashMap.remove(view);
                    }
                }
                if (Intrinsics.areEqual(scope.getLogId(), logId)) {
                    divVisibilityActionDispatcher = DivVisibilityActionTracker.this.visibilityActionDispatcher;
                    divVisibilityActionDispatcher.dispatchActions(scope, resolver, view, (DivSightAction[]) synchronizedMap.values().toArray(new DivSightAction[0]));
                }
            }
        };
        if (synchronizedMap == null) {
            handler.postDelayed(runnable, delayMs);
        } else {
            HandlerCompat.postDelayed(handler, runnable, synchronizedMap, delayMs);
        }
    }

    private void cancelTracking(CompositeLogId compositeLogId, View view, DivSightAction action, DivVisibilityTokenHolder trackedTokens) {
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.INFO)) {
            kLog.print(4, TAG, "cancelTracking: id=" + compositeLogId);
        }
        trackedTokens.remove(compositeLogId, new Function1() { // from class: com.yandex.div.core.view2.DivVisibilityActionTracker$cancelTracking$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map<CompositeLogId, ? extends DivSightAction>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Map<CompositeLogId, ? extends DivSightAction> map) {
                Handler handler;
                handler = DivVisibilityActionTracker.this.handler;
                handler.removeCallbacksAndMessages(map);
            }
        });
        Set<DivDisappearAction> set = this.appearedForDisappearActions.get(view);
        if (!(action instanceof DivDisappearAction) || view == null || set == null) {
            return;
        }
        set.remove(action);
        if (set.isEmpty()) {
            this.appearedForDisappearActions.remove(view);
            this.divWithWaitingDisappearActions.remove(view);
        }
    }

    private void updateVisibility(View view, Div div, int visibilityPercentage) {
        if (visibilityPercentage > 0) {
            this.visibleActions.put(view, div);
        } else {
            this.visibleActions.remove(view);
        }
        if (this.hasPostedUpdateVisibilityTask) {
            return;
        }
        this.hasPostedUpdateVisibilityTask = true;
        this.handler.post(this.updateVisibilityTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends DivSightAction> List<T> filterEnabled(List<? extends T> list, ExpressionResolver expressionResolver) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) ((DivSightAction) obj).isEnabled().evaluate(expressionResolver)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* compiled from: DivVisibilityActionTracker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/view2/DivVisibilityActionTracker$Companion;", "", "()V", "TAG", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
