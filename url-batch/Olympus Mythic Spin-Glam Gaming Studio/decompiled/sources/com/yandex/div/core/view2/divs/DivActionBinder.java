package com.yandex.div.core.view2.divs;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.PopupMenu;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.dagger.ExperimentFlag;
import com.yandex.div.core.experiments.Experiment;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivGestureListener;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.internal.widget.menu.OverflowMenuWrapper;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAnimation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivActionBinder.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u0001:\u0002NOB3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0090\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0 H\u0012J\u009e\u0001\u0010!\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0 H\u0016J<\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0 H\u0012J4\u0010%\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0012J<\u0010(\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010)\u001a\u00020\t2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0 H\u0012JL\u0010*\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\n\u001a\u00020\t2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0 2\u0006\u0010+\u001a\u00020\tH\u0012J \u0010,\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0012JH\u0010.\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\t\u0018\u00010/2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0012JE\u00101\u001a\u00020\t2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u0002082\n\b\u0002\u00109\u001a\u0004\u0018\u0001082\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0003H\u0010¢\u0006\u0002\b;JE\u0010<\u001a\u00020\t2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u0002082\n\b\u0002\u00109\u001a\u0004\u0018\u0001082\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0003H\u0011¢\u0006\u0002\b=JM\u0010>\u001a\u00020\u00102\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u00107\u001a\u0002082\u0016\b\u0002\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rH\u0010¢\u0006\u0002\b@J5\u0010A\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010B\u001a\u000208H\u0010¢\u0006\u0002\bCJ+\u0010D\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0010¢\u0006\u0002\bEJ5\u0010F\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u00106\u001a\u00020\u00162\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u00100\rH\u0092\bJM\u0010I\u001a\u00020\u0010*\u00020\u000e2:\u0010J\u001a\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\t\u0018\u00010/0K\"\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\t\u0018\u00010/H\u0013¢\u0006\u0002\u0010LJ\f\u0010M\u001a\u000208*\u000208H\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\rX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivActionBinder;", "", "actionHandler", "Lcom/yandex/div/core/DivActionHandler;", "logger", "Lcom/yandex/div/core/Div2Logger;", "divActionBeaconSender", "Lcom/yandex/div/core/view2/divs/DivActionBeaconSender;", "longtapActionsPassToChild", "", "shouldIgnoreActionMenuItems", "(Lcom/yandex/div/core/DivActionHandler;Lcom/yandex/div/core/Div2Logger;Lcom/yandex/div/core/view2/divs/DivActionBeaconSender;ZZ)V", "passToParentLongClickListener", "Lkotlin/Function1;", "Landroid/view/View;", "applyDivActions", "", "context", "Lcom/yandex/div/core/view2/BindingContext;", "target", "actions", "", "Lcom/yandex/div2/DivAction;", "longTapActions", "doubleTapActions", "hoverStartActions", "hoverEndActions", "pressStartActions", "pressEndActions", "actionAnimation", "Lcom/yandex/div2/DivAnimation;", "captureFocusOnAction", "Lcom/yandex/div/json/expressions/Expression;", "bindDivActions", "bindDoubleTapActions", "divGestureListener", "Lcom/yandex/div/core/view2/DivGestureListener;", "bindHoverActions", "startActions", "endActions", "bindLongTapActions", "noClickAction", "bindTapActions", "hasNonSingleTapActions", "clearLongClickListener", "passLongTapsToChildren", "createPressTouchListener", "Lkotlin/Function2;", "Landroid/view/MotionEvent;", "handleAction", "divView", "Lcom/yandex/div/core/DivViewFacade;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "action", "reason", "", "actionUid", "viewActionHandler", "handleAction$div_release", "handleActionWithoutEnableCheck", "handleActionWithoutEnableCheck$div_release", "handleActions", "onEachEnabledAction", "handleActions$div_release", "handleBulkActions", "actionLogType", "handleBulkActions$div_release", "handleTapClick", "handleTapClick$div_release", "prepareMenu", "onPrepared", "Lcom/yandex/div/internal/widget/menu/OverflowMenuWrapper;", "attachTouchListeners", "listeners", "", "(Landroid/view/View;[Lkotlin/jvm/functions/Function2;)V", "toDivActionReason", "LogType", "MenuWrapperListener", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes9.dex */
public class DivActionBinder {

    @NotNull
    private final DivActionHandler actionHandler;

    @NotNull
    private final DivActionBeaconSender divActionBeaconSender;

    @NotNull
    private final Div2Logger logger;
    private final boolean longtapActionsPassToChild;

    @NotNull
    private final Function1 passToParentLongClickListener = new Function1() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$passToParentLongClickListener$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull View view) {
            boolean z = false;
            do {
                ViewParent parent = view.getParent();
                view = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (view == null || view.getParent() == null) {
                    break;
                }
                z = view.performLongClick();
            } while (!z);
            return Boolean.valueOf(z);
        }
    };
    private final boolean shouldIgnoreActionMenuItems;

    public DivActionBinder(@NotNull DivActionHandler divActionHandler, @NotNull Div2Logger div2Logger, @NotNull DivActionBeaconSender divActionBeaconSender, @ExperimentFlag(experiment = Experiment.LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED) boolean z, @ExperimentFlag(experiment = Experiment.IGNORE_ACTION_MENU_ITEMS_ENABLED) boolean z2) {
        this.actionHandler = divActionHandler;
        this.logger = div2Logger;
        this.divActionBeaconSender = divActionBeaconSender;
        this.longtapActionsPassToChild = z;
        this.shouldIgnoreActionMenuItems = z2;
    }

    public void bindDivActions(@NotNull final BindingContext context, @NotNull final View target, @Nullable final List<DivAction> actions, @Nullable final List<DivAction> longTapActions, @Nullable final List<DivAction> doubleTapActions, @Nullable final List<DivAction> hoverStartActions, @Nullable final List<DivAction> hoverEndActions, @Nullable final List<DivAction> pressStartActions, @Nullable final List<DivAction> pressEndActions, @NotNull final DivAnimation actionAnimation, @NotNull final Expression<Boolean> captureFocusOnAction) {
        final ExpressionResolver expressionResolver = context.getExpressionResolver();
        final Function0 function0 = new Function0() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$onApply$1
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
                List onlyEnabled;
                List onlyEnabled2;
                List onlyEnabled3;
                List onlyEnabled4;
                List onlyEnabled5;
                List onlyEnabled6;
                List onlyEnabled7;
                onlyEnabled = DivActionBinderKt.onlyEnabled(actions, expressionResolver);
                onlyEnabled2 = DivActionBinderKt.onlyEnabled(doubleTapActions, expressionResolver);
                onlyEnabled3 = DivActionBinderKt.onlyEnabled(longTapActions, expressionResolver);
                onlyEnabled4 = DivActionBinderKt.onlyEnabled(hoverStartActions, expressionResolver);
                onlyEnabled5 = DivActionBinderKt.onlyEnabled(hoverEndActions, expressionResolver);
                onlyEnabled6 = DivActionBinderKt.onlyEnabled(pressStartActions, expressionResolver);
                onlyEnabled7 = DivActionBinderKt.onlyEnabled(pressEndActions, expressionResolver);
                this.applyDivActions(context, target, onlyEnabled, onlyEnabled3, onlyEnabled2, onlyEnabled4, onlyEnabled5, onlyEnabled6, onlyEnabled7, actionAnimation, captureFocusOnAction);
            }
        };
        DivActionBinderKt.observe(target, (List<DivAction>) actions, expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7164invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7164invoke(@NotNull Object obj) {
                Function0.this.mo4828invoke();
            }
        });
        DivActionBinderKt.observe(target, (List<DivAction>) longTapActions, expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7165invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7165invoke(@NotNull Object obj) {
                Function0.this.mo4828invoke();
            }
        });
        DivActionBinderKt.observe(target, (List<DivAction>) doubleTapActions, expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7166invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7166invoke(@NotNull Object obj) {
                Function0.this.mo4828invoke();
            }
        });
        DivActionBinderKt.observe(target, (Expression<Boolean>) captureFocusOnAction, expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7167invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7167invoke(@NotNull Object obj) {
                Function0.this.mo4828invoke();
            }
        });
        function0.mo4828invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void applyDivActions(BindingContext context, View target, List<DivAction> actions, List<DivAction> longTapActions, List<DivAction> doubleTapActions, List<DivAction> hoverStartActions, List<DivAction> hoverEndActions, List<DivAction> pressStartActions, List<DivAction> pressEndActions, DivAnimation actionAnimation, Expression<Boolean> captureFocusOnAction) {
        boolean z;
        boolean parentIsLongClickable;
        List<DivAction> list = longTapActions;
        if (list.isEmpty()) {
            parentIsLongClickable = DivActionBinderKt.parentIsLongClickable(target);
            if (!parentIsLongClickable) {
                z = false;
                DivGestureListener divGestureListener = new DivGestureListener(z);
                bindLongTapActions(context, target, longTapActions, actions.isEmpty(), captureFocusOnAction);
                bindDoubleTapActions(context, target, divGestureListener, doubleTapActions, captureFocusOnAction);
                bindTapActions(context, target, divGestureListener, actions, this.shouldIgnoreActionMenuItems, captureFocusOnAction, list.isEmpty() || !doubleTapActions.isEmpty());
                Function2 createAnimatedTouchListener = BaseDivViewExtensionsKt.createAnimatedTouchListener(target, context, CollectionsKt.allIsNullOrEmpty(actions, longTapActions, doubleTapActions) ? actionAnimation : null, divGestureListener);
                Function2 createPressTouchListener = createPressTouchListener(context, target, pressStartActions, pressEndActions);
                bindHoverActions(context, target, hoverStartActions, hoverEndActions);
                attachTouchListeners(target, createAnimatedTouchListener, createPressTouchListener);
            }
        }
        z = true;
        DivGestureListener divGestureListener2 = new DivGestureListener(z);
        bindLongTapActions(context, target, longTapActions, actions.isEmpty(), captureFocusOnAction);
        bindDoubleTapActions(context, target, divGestureListener2, doubleTapActions, captureFocusOnAction);
        bindTapActions(context, target, divGestureListener2, actions, this.shouldIgnoreActionMenuItems, captureFocusOnAction, list.isEmpty() || !doubleTapActions.isEmpty());
        Function2 createAnimatedTouchListener2 = BaseDivViewExtensionsKt.createAnimatedTouchListener(target, context, CollectionsKt.allIsNullOrEmpty(actions, longTapActions, doubleTapActions) ? actionAnimation : null, divGestureListener2);
        Function2 createPressTouchListener2 = createPressTouchListener(context, target, pressStartActions, pressEndActions);
        bindHoverActions(context, target, hoverStartActions, hoverEndActions);
        attachTouchListeners(target, createAnimatedTouchListener2, createPressTouchListener2);
    }

    private static final void bindTapActions$setTapListener(DivGestureListener divGestureListener, final View view, final View.OnClickListener onClickListener) {
        if (divGestureListener.getOnDoubleTapListener() != null) {
            divGestureListener.setOnSingleTapListener(new Function0() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindTapActions$setTapListener$1
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
                    onClickListener.onClick(view);
                }
            });
        } else {
            view.setOnClickListener(onClickListener);
        }
    }

    private void bindTapActions(final BindingContext context, final View target, DivGestureListener divGestureListener, final List<DivAction> actions, boolean shouldIgnoreActionMenuItems, final Expression<Boolean> captureFocusOnAction, boolean hasNonSingleTapActions) {
        Object obj = null;
        if (actions.isEmpty()) {
            if (hasNonSingleTapActions) {
                bindTapActions$setTapListener(divGestureListener, target, new View.OnClickListener() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$$ExternalSyntheticLambda4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        DivActionBinder.bindTapActions$lambda$2(Expression.this, context, view);
                    }
                });
                return;
            }
            divGestureListener.setOnSingleTapListener(null);
            target.setOnClickListener(null);
            target.setClickable(false);
            return;
        }
        Iterator<T> it = actions.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            List list = ((DivAction) next).menuItems;
            if (list != null && !list.isEmpty() && !shouldIgnoreActionMenuItems) {
                obj = next;
                break;
            }
        }
        final DivAction divAction = (DivAction) obj;
        if (divAction == null) {
            bindTapActions$setTapListener(divGestureListener, target, new View.OnClickListener() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DivActionBinder.bindTapActions$lambda$6(Expression.this, context, this, target, actions, view);
                }
            });
            return;
        }
        List list2 = divAction.menuItems;
        if (list2 == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable to bind empty menu action: " + divAction.logId);
            }
            return;
        }
        final OverflowMenuWrapper overflowGravity = new OverflowMenuWrapper(target.getContext(), target, context.getDivView()).listener(new MenuWrapperListener(context, list2)).overflowGravity(53);
        Div2View divView = context.getDivView();
        divView.clearSubscriptions();
        divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowGravity));
        bindTapActions$setTapListener(divGestureListener, target, new View.OnClickListener() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DivActionBinder.bindTapActions$lambda$5$lambda$4(DivActionBinder.this, context, target, divAction, captureFocusOnAction, overflowGravity, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTapActions$lambda$2(Expression expression, BindingContext bindingContext, View view) {
        DivActionBinderKt.clearFocusIfNeeded(view, expression, bindingContext.getDivView().getInputFocusTracker(), bindingContext.getExpressionResolver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTapActions$lambda$5$lambda$4(DivActionBinder divActionBinder, BindingContext bindingContext, View view, DivAction divAction, Expression expression, OverflowMenuWrapper overflowMenuWrapper, View view2) {
        divActionBinder.logger.logClick(bindingContext.getDivView(), bindingContext.getExpressionResolver(), view, divAction);
        divActionBinder.divActionBeaconSender.sendTapActionBeacon(divAction, bindingContext.getExpressionResolver());
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker(), bindingContext.getExpressionResolver());
        overflowMenuWrapper.getOnMenuClickListener().onClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTapActions$lambda$6(Expression expression, BindingContext bindingContext, DivActionBinder divActionBinder, View view, List list, View view2) {
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker(), bindingContext.getExpressionResolver());
        handleBulkActions$div_release$default(divActionBinder, bindingContext, view, list, null, 8, null);
    }

    private void bindLongTapActions(final BindingContext context, final View target, final List<DivAction> actions, boolean noClickAction, final Expression<Boolean> captureFocusOnAction) {
        Object obj;
        if (actions.isEmpty()) {
            clearLongClickListener(target, this.longtapActionsPassToChild, noClickAction);
            return;
        }
        Iterator<T> it = actions.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            List list = ((DivAction) obj).menuItems;
            if (list != null && !list.isEmpty() && !this.shouldIgnoreActionMenuItems) {
                break;
            }
        }
        final DivAction divAction = (DivAction) obj;
        if (divAction == null) {
            target.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$$ExternalSyntheticLambda3
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean bindLongTapActions$lambda$11;
                    bindLongTapActions$lambda$11 = DivActionBinder.bindLongTapActions$lambda$11(Expression.this, context, this, target, actions, view);
                    return bindLongTapActions$lambda$11;
                }
            });
        } else {
            List list2 = divAction.menuItems;
            if (list2 == null) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable to bind empty menu action: " + divAction.logId);
                }
            } else {
                final OverflowMenuWrapper overflowGravity = new OverflowMenuWrapper(target.getContext(), target, context.getDivView()).listener(new MenuWrapperListener(context, list2)).overflowGravity(53);
                Div2View divView = context.getDivView();
                divView.clearSubscriptions();
                divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowGravity));
                target.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$$ExternalSyntheticLambda2
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean bindLongTapActions$lambda$10$lambda$9;
                        bindLongTapActions$lambda$10$lambda$9 = DivActionBinder.bindLongTapActions$lambda$10$lambda$9(DivActionBinder.this, divAction, context, captureFocusOnAction, overflowGravity, target, actions, view);
                        return bindLongTapActions$lambda$10$lambda$9;
                    }
                });
            }
        }
        if (this.longtapActionsPassToChild) {
            DivActionBinderKt.setPenetratingLongClickable$default(target, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindLongTapActions$lambda$10$lambda$9(DivActionBinder divActionBinder, DivAction divAction, BindingContext bindingContext, Expression expression, OverflowMenuWrapper overflowMenuWrapper, View view, List list, View view2) {
        String uuid = UUID.randomUUID().toString();
        divActionBinder.divActionBeaconSender.sendTapActionBeacon(divAction, bindingContext.getExpressionResolver());
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker(), bindingContext.getExpressionResolver());
        overflowMenuWrapper.getOnMenuClickListener().onClick(view);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            divActionBinder.logger.logLongClick(bindingContext.getDivView(), bindingContext.getExpressionResolver(), view, (DivAction) it.next(), uuid);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindLongTapActions$lambda$11(Expression expression, BindingContext bindingContext, DivActionBinder divActionBinder, View view, List list, View view2) {
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker(), bindingContext.getExpressionResolver());
        divActionBinder.handleBulkActions$div_release(bindingContext, view, list, "long_click");
        return true;
    }

    private void clearLongClickListener(View target, boolean passLongTapsToChildren, boolean noClickAction) {
        boolean parentIsLongClickable;
        if (passLongTapsToChildren && !noClickAction) {
            parentIsLongClickable = DivActionBinderKt.parentIsLongClickable(target);
            if (parentIsLongClickable) {
                final Function1 function1 = this.passToParentLongClickListener;
                target.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$$ExternalSyntheticLambda7
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean clearLongClickListener$lambda$12;
                        clearLongClickListener$lambda$12 = DivActionBinder.clearLongClickListener$lambda$12(Function1.this, view);
                        return clearLongClickListener$lambda$12;
                    }
                });
                DivActionBinderKt.setPenetratingLongClickable$default(target, null, 1, null);
                return;
            } else {
                target.setOnLongClickListener(null);
                target.setLongClickable(false);
                DivActionBinderKt.setPenetratingLongClickable(target, null);
                return;
            }
        }
        target.setOnLongClickListener(null);
        target.setLongClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearLongClickListener$lambda$12(Function1 function1, View view) {
        return ((Boolean) function1.invoke(view)).booleanValue();
    }

    private void bindDoubleTapActions(final BindingContext context, final View target, DivGestureListener divGestureListener, final List<DivAction> actions, final Expression<Boolean> captureFocusOnAction) {
        Object obj = null;
        if (!actions.isEmpty()) {
            Iterator<T> it = actions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                List list = ((DivAction) next).menuItems;
                if (list != null && !list.isEmpty() && !this.shouldIgnoreActionMenuItems) {
                    obj = next;
                    break;
                }
            }
            final DivAction divAction = (DivAction) obj;
            if (divAction == null) {
                divGestureListener.setOnDoubleTapListener(new Function0() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDoubleTapActions$2
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
                        DivActionBinderKt.captureFocusIfNeeded(target, captureFocusOnAction, context.getDivView().getInputFocusTracker(), context.getExpressionResolver());
                        this.handleBulkActions$div_release(context, target, actions, "double_click");
                    }
                });
                return;
            }
            List list2 = divAction.menuItems;
            if (list2 == null) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable to bind empty menu action: " + divAction.logId);
                    return;
                }
                return;
            }
            final OverflowMenuWrapper overflowGravity = new OverflowMenuWrapper(target.getContext(), target, context.getDivView()).listener(new MenuWrapperListener(context, list2)).overflowGravity(53);
            Div2View divView = context.getDivView();
            divView.clearSubscriptions();
            divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowGravity));
            divGestureListener.setOnDoubleTapListener(new Function0() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDoubleTapActions$1$1
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
                    Div2Logger div2Logger;
                    DivActionBeaconSender divActionBeaconSender;
                    div2Logger = DivActionBinder.this.logger;
                    div2Logger.logDoubleClick(context.getDivView(), context.getExpressionResolver(), target, divAction);
                    divActionBeaconSender = DivActionBinder.this.divActionBeaconSender;
                    divActionBeaconSender.sendTapActionBeacon(divAction, context.getExpressionResolver());
                    DivActionBinderKt.captureFocusIfNeeded(target, captureFocusOnAction, context.getDivView().getInputFocusTracker(), context.getExpressionResolver());
                    overflowGravity.getOnMenuClickListener().onClick(target);
                }
            });
            return;
        }
        divGestureListener.setOnDoubleTapListener(null);
    }

    private void bindHoverActions(final BindingContext context, final View target, final List<DivAction> startActions, final List<DivAction> endActions) {
        if (!startActions.isEmpty() || !endActions.isEmpty()) {
            target.setOnHoverListener(new View.OnHoverListener() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$$ExternalSyntheticLambda1
                @Override // android.view.View.OnHoverListener
                public final boolean onHover(View view, MotionEvent motionEvent) {
                    boolean bindHoverActions$lambda$15;
                    bindHoverActions$lambda$15 = DivActionBinder.bindHoverActions$lambda$15(DivActionBinder.this, context, target, startActions, endActions, view, motionEvent);
                    return bindHoverActions$lambda$15;
                }
            });
        } else {
            target.setOnHoverListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindHoverActions$lambda$15(DivActionBinder divActionBinder, BindingContext bindingContext, View view, List list, List list2, View view2, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 9) {
            divActionBinder.handleBulkActions$div_release(bindingContext, view, list, "hover");
            return false;
        }
        if (action != 10) {
            return false;
        }
        divActionBinder.handleBulkActions$div_release(bindingContext, view, list2, "unhover");
        return false;
    }

    private Function2 createPressTouchListener(final BindingContext context, final View target, final List<DivAction> pressStartActions, final List<DivAction> pressEndActions) {
        if (pressStartActions.isEmpty() && pressEndActions.isEmpty()) {
            return null;
        }
        return new Function2() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$createPressTouchListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final Boolean invoke(@NotNull View view, @NotNull MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                boolean z = true;
                if (action == 0) {
                    DivActionBinder.this.handleBulkActions$div_release(context, target, pressStartActions, "press");
                } else if (action == 1 || action == 3) {
                    DivActionBinder.this.handleBulkActions$div_release(context, target, pressEndActions, "release");
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        };
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void attachTouchListeners(View view, Function2... function2Arr) {
        final List filterNotNull = ArraysKt.filterNotNull(function2Arr);
        if (!filterNotNull.isEmpty()) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean attachTouchListeners$lambda$17;
                    attachTouchListeners$lambda$17 = DivActionBinder.attachTouchListeners$lambda$17(filterNotNull, view2, motionEvent);
                    return attachTouchListeners$lambda$17;
                }
            });
        } else {
            view.setOnTouchListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean attachTouchListeners$lambda$17(List list, View view, MotionEvent motionEvent) {
        Iterator it = list.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (((Boolean) ((Function2) it.next()).invoke(view, motionEvent)).booleanValue() || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    public static /* synthetic */ void handleBulkActions$div_release$default(DivActionBinder divActionBinder, BindingContext bindingContext, View view, List list, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleBulkActions");
        }
        if ((i & 8) != 0) {
            str = "click";
        }
        divActionBinder.handleBulkActions$div_release(bindingContext, view, list, str);
    }

    public void handleBulkActions$div_release(@NotNull BindingContext context, @NotNull final View target, @NotNull final List<DivAction> actions, @NotNull final String actionLogType) {
        final Div2View divView = context.getDivView();
        final ExpressionResolver expressionResolver = context.getExpressionResolver();
        divView.bulkActions$div_release(new Function0() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$handleBulkActions$1
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

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            public final void invoke() {
                List<DivAction> onlyEnabled;
                Div2Logger div2Logger;
                Div2Logger div2Logger2;
                Div2Logger div2Logger3;
                Div2Logger div2Logger4;
                Div2Logger div2Logger5;
                Div2Logger div2Logger6;
                Div2Logger div2Logger7;
                Div2Logger div2Logger8;
                Div2Logger div2Logger9;
                DivActionBeaconSender divActionBeaconSender;
                String divActionReason;
                Div2Logger div2Logger10;
                String uuid = UUID.randomUUID().toString();
                onlyEnabled = DivActionBinderKt.onlyEnabled(actions, expressionResolver);
                String str = actionLogType;
                DivActionBinder divActionBinder = this;
                Div2View div2View = divView;
                ExpressionResolver expressionResolver2 = expressionResolver;
                View view = target;
                for (DivAction divAction : onlyEnabled) {
                    switch (str.hashCode()) {
                        case -338877947:
                            if (str.equals("long_click")) {
                                div2Logger = divActionBinder.logger;
                                div2Logger.logLongClick(div2View, expressionResolver2, view, divAction, uuid);
                                break;
                            }
                            Assert.fail("Please, add new logType");
                            break;
                        case -287575485:
                            if (str.equals("unhover")) {
                                div2Logger2 = divActionBinder.logger;
                                div2Logger2.logHoverChanged(div2View, expressionResolver2, view, divAction, false);
                                break;
                            }
                            Assert.fail("Please, add new logType");
                            break;
                        case 3027047:
                            if (str.equals("blur")) {
                                div2Logger3 = divActionBinder.logger;
                                div2Logger3.logFocusChanged(div2View, expressionResolver2, view, divAction, false);
                                break;
                            }
                            Assert.fail("Please, add new logType");
                            break;
                        case 94750088:
                            if (str.equals("click")) {
                                div2Logger4 = divActionBinder.logger;
                                div2Logger4.logClick(div2View, expressionResolver2, view, divAction, uuid);
                                break;
                            }
                            Assert.fail("Please, add new logType");
                            break;
                        case 96667352:
                            if (str.equals("enter")) {
                                div2Logger5 = divActionBinder.logger;
                                div2Logger5.logImeEnter(div2View, expressionResolver2, view, divAction);
                                break;
                            }
                            Assert.fail("Please, add new logType");
                            break;
                        case 97604824:
                            if (str.equals("focus")) {
                                div2Logger6 = divActionBinder.logger;
                                div2Logger6.logFocusChanged(div2View, expressionResolver2, view, divAction, true);
                                break;
                            }
                            Assert.fail("Please, add new logType");
                            break;
                        case 99469628:
                            if (str.equals("hover")) {
                                div2Logger7 = divActionBinder.logger;
                                div2Logger7.logHoverChanged(div2View, expressionResolver2, view, divAction, true);
                                break;
                            }
                            Assert.fail("Please, add new logType");
                            break;
                        case 106931267:
                            if (str.equals("press")) {
                                div2Logger8 = divActionBinder.logger;
                                div2Logger8.logPressChanged(div2View, expressionResolver2, view, divAction, true);
                                break;
                            }
                            Assert.fail("Please, add new logType");
                            break;
                        case 1090594823:
                            if (str.equals("release")) {
                                div2Logger9 = divActionBinder.logger;
                                div2Logger9.logPressChanged(div2View, expressionResolver2, view, divAction, false);
                                break;
                            }
                            Assert.fail("Please, add new logType");
                            break;
                        case 1374143386:
                            if (str.equals("double_click")) {
                                div2Logger10 = divActionBinder.logger;
                                div2Logger10.logDoubleClick(div2View, expressionResolver2, view, divAction, uuid);
                                break;
                            }
                            Assert.fail("Please, add new logType");
                            break;
                        default:
                            Assert.fail("Please, add new logType");
                            break;
                    }
                    divActionBeaconSender = divActionBinder.divActionBeaconSender;
                    divActionBeaconSender.sendTapActionBeacon(divAction, expressionResolver2);
                    divActionReason = divActionBinder.toDivActionReason(str);
                    DivActionBinder.handleActionWithoutEnableCheck$div_release$default(divActionBinder, div2View, expressionResolver2, divAction, divActionReason, uuid, null, 32, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toDivActionReason(String str) {
        switch (str.hashCode()) {
            case -338877947:
                return !str.equals("long_click") ? "external" : "long_click";
            case -287575485:
                if (str.equals("unhover")) {
                    return "unhover";
                }
                break;
            case 3027047:
                if (str.equals("blur")) {
                    return "blur";
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    return "click";
                }
                break;
            case 96667352:
                if (str.equals("enter")) {
                    return "enter";
                }
                break;
            case 97604824:
                if (str.equals("focus")) {
                    return "focus";
                }
                break;
            case 99469628:
                if (str.equals("hover")) {
                    return "hover";
                }
                break;
            case 106931267:
                if (str.equals("press")) {
                    return "press";
                }
                break;
            case 1090594823:
                if (str.equals("release")) {
                    return "release";
                }
                break;
            case 1374143386:
                if (str.equals("double_click")) {
                    return "double_click";
                }
                break;
        }
    }

    public static /* synthetic */ void handleActions$div_release$default(DivActionBinder divActionBinder, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, List list, String str, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleActions");
        }
        if ((i & 16) != 0) {
            function1 = null;
        }
        divActionBinder.handleActions$div_release(divViewFacade, expressionResolver, list, str, function1);
    }

    public void handleActions$div_release(@NotNull DivViewFacade divView, @NotNull ExpressionResolver resolver, @Nullable List<DivAction> actions, @NotNull String reason, @Nullable Function1 onEachEnabledAction) {
        List<DivAction> onlyEnabled;
        if (actions == null) {
            return;
        }
        onlyEnabled = DivActionBinderKt.onlyEnabled(actions, resolver);
        for (DivAction divAction : onlyEnabled) {
            handleActionWithoutEnableCheck$div_release$default(this, divView, resolver, divAction, reason, null, null, 48, null);
            if (onEachEnabledAction != null) {
                onEachEnabledAction.invoke(divAction);
            }
        }
    }

    public static /* synthetic */ boolean handleAction$div_release$default(DivActionBinder divActionBinder, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, DivAction divAction, String str, String str2, DivActionHandler divActionHandler, int i, Object obj) {
        DivActionHandler divActionHandler2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAction");
        }
        String str3 = (i & 16) != 0 ? null : str2;
        if ((i & 32) != 0) {
            Div2View div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            divActionHandler2 = div2View != null ? div2View.getActionHandler() : null;
        } else {
            divActionHandler2 = divActionHandler;
        }
        return divActionBinder.handleAction$div_release(divViewFacade, expressionResolver, divAction, str, str3, divActionHandler2);
    }

    public boolean handleAction$div_release(@NotNull DivViewFacade divView, @NotNull ExpressionResolver resolver, @NotNull DivAction action, @NotNull String reason, @Nullable String actionUid, @Nullable DivActionHandler viewActionHandler) {
        if (((Boolean) action.isEnabled.evaluate(resolver)).booleanValue()) {
            return handleActionWithoutEnableCheck$div_release(divView, resolver, action, reason, actionUid, viewActionHandler);
        }
        return false;
    }

    public static /* synthetic */ boolean handleActionWithoutEnableCheck$div_release$default(DivActionBinder divActionBinder, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, DivAction divAction, String str, String str2, DivActionHandler divActionHandler, int i, Object obj) {
        DivActionHandler divActionHandler2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleActionWithoutEnableCheck");
        }
        String str3 = (i & 16) != 0 ? null : str2;
        if ((i & 32) != 0) {
            Div2View div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            divActionHandler2 = div2View != null ? div2View.getActionHandler() : null;
        } else {
            divActionHandler2 = divActionHandler;
        }
        return divActionBinder.handleActionWithoutEnableCheck$div_release(divViewFacade, expressionResolver, divAction, str, str3, divActionHandler2);
    }

    @VisibleForTesting
    public boolean handleActionWithoutEnableCheck$div_release(@NotNull DivViewFacade divView, @NotNull ExpressionResolver resolver, @NotNull DivAction action, @NotNull String reason, @Nullable String actionUid, @Nullable DivActionHandler viewActionHandler) {
        if (this.actionHandler.getUseActionUid() && actionUid != null) {
            if (viewActionHandler == null || !viewActionHandler.handleActionWithReason(action, divView, resolver, actionUid, reason)) {
                return this.actionHandler.handleActionWithReason(action, divView, resolver, actionUid, reason);
            }
            return true;
        }
        if (viewActionHandler == null || !viewActionHandler.handleActionWithReason(action, divView, resolver, reason)) {
            return this.actionHandler.handleActionWithReason(action, divView, resolver, reason);
        }
        return true;
    }

    public void handleTapClick$div_release(@NotNull BindingContext context, @NotNull View target, @NotNull List<DivAction> actions) {
        List onlyEnabled;
        Object obj;
        ExpressionResolver expressionResolver = context.getExpressionResolver();
        onlyEnabled = DivActionBinderKt.onlyEnabled(actions, expressionResolver);
        Iterator it = onlyEnabled.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            List list = ((DivAction) obj).menuItems;
            if (!(list == null || list.isEmpty())) {
                break;
            }
        }
        DivAction divAction = (DivAction) obj;
        if (divAction == null) {
            handleBulkActions$div_release$default(this, context, target, onlyEnabled, null, 8, null);
            return;
        }
        List list2 = divAction.menuItems;
        if (list2 == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable to bind empty menu action: " + divAction.logId);
                return;
            }
            return;
        }
        OverflowMenuWrapper overflowGravity = new OverflowMenuWrapper(target.getContext(), target, context.getDivView()).listener(new MenuWrapperListener(context, list2)).overflowGravity(53);
        Div2View divView = context.getDivView();
        divView.clearSubscriptions();
        divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowGravity));
        this.logger.logClick(context.getDivView(), expressionResolver, target, divAction);
        this.divActionBeaconSender.sendTapActionBeacon(divAction, expressionResolver);
        overflowGravity.getOnMenuClickListener().onClick(target);
    }

    private void prepareMenu(View target, BindingContext context, DivAction action, Function1 onPrepared) {
        List list = action.menuItems;
        if (list == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable to bind empty menu action: " + action.logId);
                return;
            }
            return;
        }
        OverflowMenuWrapper overflowGravity = new OverflowMenuWrapper(target.getContext(), target, context.getDivView()).listener(new MenuWrapperListener(context, list)).overflowGravity(53);
        Div2View divView = context.getDivView();
        divView.clearSubscriptions();
        divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowGravity));
        onPrepared.invoke(overflowGravity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DivActionBinder.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivActionBinder$MenuWrapperListener;", "Lcom/yandex/div/internal/widget/menu/OverflowMenuWrapper$Listener$Simple;", "context", "Lcom/yandex/div/core/view2/BindingContext;", "items", "", "Lcom/yandex/div2/DivAction$MenuItem;", "(Lcom/yandex/div/core/view2/divs/DivActionBinder;Lcom/yandex/div/core/view2/BindingContext;Ljava/util/List;)V", "onMenuCreated", "", "popupMenu", "Landroidx/appcompat/widget/PopupMenu;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class MenuWrapperListener extends OverflowMenuWrapper.Listener.Simple {

        @NotNull
        private final BindingContext context;

        @NotNull
        private final List<DivAction.MenuItem> items;

        public MenuWrapperListener(@NotNull BindingContext bindingContext, @NotNull List<DivAction.MenuItem> list) {
            this.context = bindingContext;
            this.items = list;
        }

        @Override // com.yandex.div.internal.widget.menu.OverflowMenuWrapper.Listener.Simple, com.yandex.div.internal.widget.menu.OverflowMenuWrapper.Listener
        public void onMenuCreated(@NotNull PopupMenu popupMenu) {
            final Div2View divView = this.context.getDivView();
            final ExpressionResolver expressionResolver = this.context.getExpressionResolver();
            Menu menu = popupMenu.getMenu();
            for (final DivAction.MenuItem menuItem : this.items) {
                final int size = menu.size();
                MenuItem add = menu.add((CharSequence) menuItem.text.evaluate(expressionResolver));
                final DivActionBinder divActionBinder = DivActionBinder.this;
                add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$MenuWrapperListener$$ExternalSyntheticLambda0
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem2) {
                        boolean onMenuCreated$lambda$0;
                        onMenuCreated$lambda$0 = DivActionBinder.MenuWrapperListener.onMenuCreated$lambda$0(Div2View.this, menuItem, expressionResolver, divActionBinder, size, menuItem2);
                        return onMenuCreated$lambda$0;
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onMenuCreated$lambda$0(final Div2View div2View, final DivAction.MenuItem menuItem, final ExpressionResolver expressionResolver, final DivActionBinder divActionBinder, final int i, MenuItem menuItem2) {
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            div2View.bulkActions$div_release(new Function0() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$MenuWrapperListener$onMenuCreated$1$1
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
                    List<DivAction> onlyEnabled;
                    Div2Logger div2Logger;
                    DivActionBeaconSender divActionBeaconSender;
                    List list = DivAction.MenuItem.this.actions;
                    List list2 = list;
                    List list3 = null;
                    if (list2 == null || list2.isEmpty()) {
                        list = null;
                    }
                    if (list == null) {
                        DivAction divAction = DivAction.MenuItem.this.action;
                        if (divAction != null) {
                            list3 = kotlin.collections.CollectionsKt.listOf(divAction);
                        }
                    } else {
                        list3 = list;
                    }
                    List list4 = list3;
                    if (list4 != null && !list4.isEmpty()) {
                        onlyEnabled = DivActionBinderKt.onlyEnabled(list3, expressionResolver);
                        DivActionBinder divActionBinder2 = divActionBinder;
                        Div2View div2View2 = div2View;
                        ExpressionResolver expressionResolver2 = expressionResolver;
                        int i2 = i;
                        DivAction.MenuItem menuItem3 = DivAction.MenuItem.this;
                        for (DivAction divAction2 : onlyEnabled) {
                            div2Logger = divActionBinder2.logger;
                            div2Logger.logPopupMenuItemClick(div2View2, expressionResolver2, i2, (String) menuItem3.text.evaluate(expressionResolver2), divAction2);
                            divActionBeaconSender = divActionBinder2.divActionBeaconSender;
                            divActionBeaconSender.sendTapActionBeacon(divAction2, expressionResolver2);
                            DivActionBinder.handleActionWithoutEnableCheck$div_release$default(divActionBinder2, div2View2, expressionResolver2, divAction2, DivActionHandler.DivActionReason.MENU, null, null, 48, null);
                        }
                        ref$BooleanRef.element = true;
                        return;
                    }
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Menu item does not have any action");
                    }
                }
            });
            return ref$BooleanRef.element;
        }
    }

    /* compiled from: DivActionBinder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0081\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivActionBinder$LogType;", "", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    public @interface LogType {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @NotNull
        public static final String LOG_BLUR = "blur";

        @NotNull
        public static final String LOG_CLICK = "click";

        @NotNull
        public static final String LOG_DOUBLE_CLICK = "double_click";

        @NotNull
        public static final String LOG_ENTER = "enter";

        @NotNull
        public static final String LOG_FOCUS = "focus";

        @NotNull
        public static final String LOG_HOVER = "hover";

        @NotNull
        public static final String LOG_LONG_CLICK = "long_click";

        @NotNull
        public static final String LOG_PRESS = "press";

        @NotNull
        public static final String LOG_RELEASE = "release";

        @NotNull
        public static final String LOG_UNHOVER = "unhover";

        /* compiled from: DivActionBinder.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivActionBinder$LogType$Companion;", "", "()V", "LOG_BLUR", "", "LOG_CLICK", "LOG_DOUBLE_CLICK", "LOG_ENTER", "LOG_FOCUS", "LOG_HOVER", "LOG_LONG_CLICK", "LOG_PRESS", "LOG_RELEASE", "LOG_UNHOVER", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @NotNull
            public static final String LOG_BLUR = "blur";

            @NotNull
            public static final String LOG_CLICK = "click";

            @NotNull
            public static final String LOG_DOUBLE_CLICK = "double_click";

            @NotNull
            public static final String LOG_ENTER = "enter";

            @NotNull
            public static final String LOG_FOCUS = "focus";

            @NotNull
            public static final String LOG_HOVER = "hover";

            @NotNull
            public static final String LOG_LONG_CLICK = "long_click";

            @NotNull
            public static final String LOG_PRESS = "press";

            @NotNull
            public static final String LOG_RELEASE = "release";

            @NotNull
            public static final String LOG_UNHOVER = "unhover";

            private Companion() {
            }
        }
    }
}
