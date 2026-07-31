package com.yandex.div.core.view2;

import android.view.View;
import com.android.billingclient.api.BillingClient;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivSightAction;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import org.jetbrains.annotations.NotNull;

/* compiled from: SightActionIsEnabledObserver.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001&B]\u0012*\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0003\u0012*\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u0014\u0010\u0014\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0017JS\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u001eH\u0082\bJ6\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00072\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u001aJ\f\u0010%\u001a\u00020\t*\u00020\u0006H\u0002R \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0011j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/yandex/div/core/view2/SightActionIsEnabledObserver;", "", "onEnable", "Lkotlin/Function5;", "Lcom/yandex/div/core/view2/Div2View;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "Landroid/view/View;", "Lcom/yandex/div2/Div;", "Lcom/yandex/div2/DivSightAction;", "", "onDisable", "(Lkotlin/jvm/functions/Function5;Lkotlin/jvm/functions/Function5;)V", "boundedActions", "Ljava/util/WeakHashMap;", "", "hasSubscription", BillingClient.FeatureType.SUBSCRIPTIONS, "Ljava/util/HashMap;", "Lcom/yandex/div/core/view2/SightActionIsEnabledObserver$Subscription;", "Lkotlin/collections/HashMap;", "cancelObserving", "action", "actions", "", "leftJoin", "new", "", "old", "", "onDelete", "Lkotlin/Function1;", "onAdd", "observe", "view", "div2View", "resolver", "div", "addSubscriptionIfNeeded", "Subscription", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SightActionIsEnabledObserver {

    @NotNull
    private final Function5 onDisable;

    @NotNull
    private final Function5 onEnable;

    @NotNull
    private final WeakHashMap<View, Set<DivSightAction>> boundedActions = new WeakHashMap<>();

    @NotNull
    private final HashMap<DivSightAction, Subscription> subscriptions = new HashMap<>();

    @NotNull
    private final WeakHashMap<View, Unit> hasSubscription = new WeakHashMap<>();

    public SightActionIsEnabledObserver(@NotNull Function5 function5, @NotNull Function5 function52) {
        this.onEnable = function5;
        this.onDisable = function52;
    }

    public static /* synthetic */ void observe$default(SightActionIsEnabledObserver sightActionIsEnabledObserver, View view, Div2View div2View, ExpressionResolver expressionResolver, Div div, List list, int i, Object obj) {
        if ((i & 16) != 0) {
            list = DivUtilKt.getAllSightActions(div.value());
        }
        sightActionIsEnabledObserver.observe(view, div2View, expressionResolver, div, list);
    }

    public final void observe(@NotNull final View view, @NotNull final Div2View div2View, @NotNull final ExpressionResolver resolver, @NotNull final Div div, @NotNull List<? extends DivSightAction> actions) {
        Subscription remove;
        SightActionIsEnabledObserver sightActionIsEnabledObserver = this;
        addSubscriptionIfNeeded(view);
        WeakHashMap<View, Set<DivSightAction>> weakHashMap = sightActionIsEnabledObserver.boundedActions;
        Set<DivSightAction> set = weakHashMap.get(view);
        if (set == null) {
            set = SetsKt.emptySet();
        }
        Set intersect = CollectionsKt.intersect(actions, set);
        Set<DivSightAction> mutableSet = CollectionsKt.toMutableSet(intersect);
        for (DivSightAction divSightAction : set) {
            if (!intersect.contains(divSightAction) && (remove = sightActionIsEnabledObserver.subscriptions.remove(divSightAction)) != null) {
                remove.close();
            }
        }
        for (final DivSightAction divSightAction2 : actions) {
            if (intersect.contains(divSightAction2)) {
                sightActionIsEnabledObserver = this;
            } else {
                mutableSet.add(divSightAction2);
                sightActionIsEnabledObserver.cancelObserving(divSightAction2);
                sightActionIsEnabledObserver.subscriptions.put(divSightAction2, new Subscription(divSightAction2.isEnabled().observe(resolver, new Function1() { // from class: com.yandex.div.core.view2.SightActionIsEnabledObserver$observe$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Boolean) obj).booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        Function5 function5;
                        Function5 function52;
                        if (z) {
                            function52 = SightActionIsEnabledObserver.this.onEnable;
                            function52.invoke(div2View, resolver, view, div, divSightAction2);
                        } else {
                            function5 = SightActionIsEnabledObserver.this.onDisable;
                            function5.invoke(div2View, resolver, view, div, divSightAction2);
                        }
                    }
                }), view));
                sightActionIsEnabledObserver = this;
                intersect = intersect;
            }
        }
        weakHashMap.put(view, mutableSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addSubscriptionIfNeeded(final View view) {
        if (this.hasSubscription.containsKey(view) || !(view instanceof ExpressionSubscriber)) {
            return;
        }
        ((ExpressionSubscriber) view).addSubscription(new Disposable() { // from class: com.yandex.div.core.view2.SightActionIsEnabledObserver$$ExternalSyntheticLambda0
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                SightActionIsEnabledObserver.addSubscriptionIfNeeded$lambda$2(SightActionIsEnabledObserver.this, view);
            }
        });
        this.hasSubscription.put(view, Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscriptionIfNeeded$lambda$2(SightActionIsEnabledObserver sightActionIsEnabledObserver, View view) {
        Set<DivSightAction> remove = sightActionIsEnabledObserver.boundedActions.remove(view);
        if (remove == null) {
            remove = SetsKt.emptySet();
        }
        sightActionIsEnabledObserver.cancelObserving(remove);
    }

    private final Set<DivSightAction> leftJoin(List<? extends DivSightAction> r5, Set<? extends DivSightAction> old, Function1 onDelete, Function1 onAdd) {
        Set intersect = CollectionsKt.intersect(r5, old);
        Set<DivSightAction> mutableSet = CollectionsKt.toMutableSet(intersect);
        for (DivSightAction divSightAction : old) {
            if (!intersect.contains(divSightAction)) {
                onDelete.invoke(divSightAction);
            }
        }
        for (DivSightAction divSightAction2 : r5) {
            if (!intersect.contains(divSightAction2)) {
                mutableSet.add(divSightAction2);
                onAdd.invoke(divSightAction2);
            }
        }
        return mutableSet;
    }

    private final void cancelObserving(DivSightAction action) {
        Set<DivSightAction> set;
        Subscription remove = this.subscriptions.remove(action);
        if (remove == null) {
            return;
        }
        remove.close();
        View view = remove.getOwner().get();
        if (view == null || (set = this.boundedActions.get(view)) == null) {
            return;
        }
        set.remove(action);
    }

    /* compiled from: SightActionIsEnabledObserver.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00050\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/core/view2/SightActionIsEnabledObserver$Subscription;", "", "disposable", "Lcom/yandex/div/core/Disposable;", "owner", "Landroid/view/View;", "(Lcom/yandex/div/core/Disposable;Landroid/view/View;)V", "getDisposable", "()Lcom/yandex/div/core/Disposable;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getOwner", "()Ljava/lang/ref/WeakReference;", "close", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Subscription {

        @NotNull
        private final Disposable disposable;

        @NotNull
        private final WeakReference<View> owner;

        public Subscription(@NotNull Disposable disposable, @NotNull View view) {
            this.disposable = disposable;
            this.owner = new WeakReference<>(view);
        }

        @NotNull
        public final Disposable getDisposable() {
            return this.disposable;
        }

        @NotNull
        public final WeakReference<View> getOwner() {
            return this.owner;
        }

        public final void close() {
            this.disposable.close();
        }
    }

    public final void cancelObserving(@NotNull Iterable<? extends DivSightAction> actions) {
        Iterator<? extends DivSightAction> it = actions.iterator();
        while (it.hasNext()) {
            cancelObserving(it.next());
        }
    }
}
