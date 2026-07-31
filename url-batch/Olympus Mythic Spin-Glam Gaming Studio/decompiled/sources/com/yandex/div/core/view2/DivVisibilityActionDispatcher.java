package com.yandex.div.core.view2;

import android.view.View;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivVisibilityChangeListener;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.timer.TimerController;
import com.yandex.div.core.view2.divs.DivActionBeaconSender;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.Div;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivSightAction;
import com.yandex.div2.DivVisibilityAction;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivVisibilityActionDispatcher.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u0000 *2\u00020\u0001:\u0001*B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0012J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J3\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u001eH\u0016¢\u0006\u0002\u0010\u001fJ\u001c\u0010 \u001a\u00020\u00152\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020#0\"H\u0016J(\u0010$\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0012J0\u0010$\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&H\u0012J\u0016\u0010'\u001a\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0005H\u0016R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0092\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/yandex/div/core/view2/DivVisibilityActionDispatcher;", "", "logger", "Lcom/yandex/div/core/Div2Logger;", "visibilityListeners", "", "Lcom/yandex/div/core/DivVisibilityChangeListener;", "divActionHandler", "Lcom/yandex/div/core/DivActionHandler;", "divActionBeaconSender", "Lcom/yandex/div/core/view2/divs/DivActionBeaconSender;", "(Lcom/yandex/div/core/Div2Logger;Ljava/util/List;Lcom/yandex/div/core/DivActionHandler;Lcom/yandex/div/core/view2/divs/DivActionBeaconSender;)V", "appearLogCounters", "", "Lcom/yandex/div/core/view2/CompositeLogId;", "", "disappearLogCounters", "countersFor", "action", "Lcom/yandex/div2/DivSightAction;", "dispatchAction", "", "scope", "Lcom/yandex/div/core/view2/Div2View;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "view", "Landroid/view/View;", "dispatchActions", "actions", "", "(Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/view/View;[Lcom/yandex/div2/DivSightAction;)V", "dispatchVisibleViewsChanged", "visibleViews", "", "Lcom/yandex/div2/Div;", "logAction", "actionUid", "", TimerController.RESET_COMMAND, "tags", "Lcom/yandex/div/DivDataTag;", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes10.dex */
public class DivVisibilityActionDispatcher {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long LIMITLESS_LOG = 0;

    @NotNull
    private static final String TAG = "DivVisibilityActionDispatcher";

    @NotNull
    private final Map<CompositeLogId, Integer> appearLogCounters = CollectionsKt.arrayMap();

    @NotNull
    private final Map<CompositeLogId, Integer> disappearLogCounters = CollectionsKt.arrayMap();

    @NotNull
    private final DivActionBeaconSender divActionBeaconSender;

    @NotNull
    private final DivActionHandler divActionHandler;

    @NotNull
    private final Div2Logger logger;

    @NotNull
    private final List<DivVisibilityChangeListener> visibilityListeners;

    /* JADX WARN: Multi-variable type inference failed */
    public DivVisibilityActionDispatcher(@NotNull Div2Logger div2Logger, @NotNull List<? extends DivVisibilityChangeListener> list, @NotNull DivActionHandler divActionHandler, @NotNull DivActionBeaconSender divActionBeaconSender) {
        this.logger = div2Logger;
        this.visibilityListeners = list;
        this.divActionHandler = divActionHandler;
        this.divActionBeaconSender = divActionBeaconSender;
    }

    public void dispatchActions(@NotNull final Div2View scope, @NotNull final ExpressionResolver resolver, @NotNull final View view, @NotNull final DivSightAction[] actions) {
        scope.bulkActions$div_release(new Function0() { // from class: com.yandex.div.core.view2.DivVisibilityActionDispatcher$dispatchActions$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                DivSightAction[] divSightActionArr = actions;
                DivVisibilityActionDispatcher divVisibilityActionDispatcher = this;
                Div2View div2View = scope;
                ExpressionResolver expressionResolver = resolver;
                View view2 = view;
                for (DivSightAction divSightAction : divSightActionArr) {
                    divVisibilityActionDispatcher.dispatchAction(div2View, expressionResolver, view2, divSightAction);
                }
            }
        });
    }

    public void dispatchAction(@NotNull Div2View scope, @NotNull ExpressionResolver resolver, @NotNull View view, @NotNull DivSightAction action) {
        CompositeLogId compositeLogIdOf = CompositeLogIdKt.compositeLogIdOf(scope, (String) action.getLogId().evaluate(resolver));
        Map<CompositeLogId, Integer> countersFor = countersFor(action);
        Integer num = countersFor.get(compositeLogIdOf);
        if (num == null) {
            num = 0;
            countersFor.put(compositeLogIdOf, num);
        }
        int intValue = num.intValue();
        KLog kLog = KLog.INSTANCE;
        Severity severity = Severity.INFO;
        if (kLog.isAtLeast(severity)) {
            kLog.print(4, TAG, "visibility action dispatched: id=" + compositeLogIdOf + ", counter=" + intValue);
        }
        long longValue = ((Number) action.getLogLimit().evaluate(resolver)).longValue();
        if (longValue == 0 || intValue < longValue) {
            if (this.divActionHandler.getUseActionUid()) {
                String uuid = UUID.randomUUID().toString();
                DivActionHandler actionHandler = scope.getActionHandler();
                if (!(actionHandler != null ? actionHandler.handleAction(action, scope, resolver, uuid) : false) && !this.divActionHandler.handleAction(action, scope, resolver, uuid)) {
                    logAction(scope, resolver, view, action, uuid);
                }
            } else {
                DivActionHandler actionHandler2 = scope.getActionHandler();
                if (!(actionHandler2 != null ? actionHandler2.handleAction(action, scope, resolver) : false) && !this.divActionHandler.handleAction(action, scope, resolver)) {
                    logAction(scope, resolver, view, action);
                }
            }
            countersFor(action).put(compositeLogIdOf, Integer.valueOf(intValue + 1));
            if (kLog.isAtLeast(severity)) {
                kLog.print(4, TAG, "visibility action logged: " + compositeLogIdOf);
            }
        }
    }

    private Map<CompositeLogId, Integer> countersFor(DivSightAction action) {
        if (action instanceof DivVisibilityAction) {
            return this.appearLogCounters;
        }
        return this.disappearLogCounters;
    }

    private void logAction(Div2View scope, ExpressionResolver resolver, View view, DivSightAction action) {
        if (action instanceof DivVisibilityAction) {
            this.logger.logViewShown(scope, resolver, view, (DivVisibilityAction) action);
        } else {
            Div2Logger div2Logger = this.logger;
            Intrinsics.checkNotNull(action, "null cannot be cast to non-null type com.yandex.div2.DivDisappearAction");
            div2Logger.logViewDisappeared(scope, resolver, view, (DivDisappearAction) action);
        }
        this.divActionBeaconSender.sendVisibilityActionBeacon(action, resolver);
    }

    private void logAction(Div2View scope, ExpressionResolver resolver, View view, DivSightAction action, String actionUid) {
        if (action instanceof DivVisibilityAction) {
            this.logger.logViewShown(scope, resolver, view, (DivVisibilityAction) action, actionUid);
        } else {
            Div2Logger div2Logger = this.logger;
            Intrinsics.checkNotNull(action, "null cannot be cast to non-null type com.yandex.div2.DivDisappearAction");
            div2Logger.logViewDisappeared(scope, resolver, view, (DivDisappearAction) action, actionUid);
        }
        this.divActionBeaconSender.sendVisibilityActionBeacon(action, resolver);
    }

    public void dispatchVisibleViewsChanged(@NotNull Map<View, ? extends Div> visibleViews) {
        Iterator<T> it = this.visibilityListeners.iterator();
        while (it.hasNext()) {
            ((DivVisibilityChangeListener) it.next()).onViewsVisibilityChanged(visibleViews);
        }
    }

    public void reset(@NotNull List<? extends DivDataTag> tags) {
        if (tags.isEmpty()) {
            this.appearLogCounters.clear();
            this.disappearLogCounters.clear();
            return;
        }
        for (final DivDataTag divDataTag : tags) {
            kotlin.collections.CollectionsKt.removeAll(this.appearLogCounters.keySet(), new Function1() { // from class: com.yandex.div.core.view2.DivVisibilityActionDispatcher$reset$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull CompositeLogId compositeLogId) {
                    return Boolean.valueOf(Intrinsics.areEqual(compositeLogId.getDataTag(), DivDataTag.this.getId()));
                }
            });
            kotlin.collections.CollectionsKt.removeAll(this.disappearLogCounters.keySet(), new Function1() { // from class: com.yandex.div.core.view2.DivVisibilityActionDispatcher$reset$1$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull CompositeLogId compositeLogId) {
                    return Boolean.valueOf(Intrinsics.areEqual(compositeLogId.getDataTag(), DivDataTag.this.getId()));
                }
            });
        }
    }

    /* compiled from: DivVisibilityActionDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/view2/DivVisibilityActionDispatcher$Companion;", "", "()V", "LIMITLESS_LOG", "", "TAG", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
