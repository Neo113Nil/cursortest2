package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationSet;
import androidx.core.view.ViewGroupKt;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.util.DivTreeWalk;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.core.view2.animations.SceneRootWatcher;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.core.view2.state.DivStateTransitionHolder;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div.state.DivStateCache;
import com.yandex.div2.Div;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivContentAlignmentHorizontal;
import com.yandex.div2.DivContentAlignmentVertical;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTransitionTrigger;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivStateBinder.kt */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 ^2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001^B}\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!¢\u0006\u0002\u0010\"J(\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020*H\u0016J\"\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010(\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0002J\u001a\u00101\u001a\u0004\u0018\u0001022\u0006\u0010%\u001a\u00020&2\u0006\u00103\u001a\u000202H\u0002J@\u00104\u001a\u0004\u0018\u0001052\u0006\u0010%\u001a\u00020&2\u0006\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u0001082\b\u0010:\u001a\u0004\u0018\u00010,2\b\u0010;\u001a\u0004\u0018\u00010,H\u0002J8\u0010<\u001a\u0004\u0018\u0001052\u0006\u0010%\u001a\u00020&2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u0001082\b\u0010:\u001a\u0004\u0018\u00010,2\b\u0010;\u001a\u0004\u0018\u00010,H\u0002J<\u0010=\u001a\u0004\u0018\u0001052\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u0001082\u0006\u0010B\u001a\u0002002\u0006\u0010C\u001a\u000200H\u0002J\"\u0010D\u001a\u00020$2\b\u0010;\u001a\u0004\u0018\u00010,2\u0006\u0010E\u001a\u00020F2\u0006\u0010/\u001a\u000200H\u0002J6\u0010G\u001a\u00020$*\u00020\u00042\u0006\u0010%\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00032\b\u0010H\u001a\u0004\u0018\u00010\u00032\u0006\u0010I\u001a\u0002082\u0006\u0010)\u001a\u00020*H\u0002J\\\u0010J\u001a\u00020$*\u00020\u00042\u0006\u0010K\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010I\u001a\u0002082\b\u0010L\u001a\u0004\u0018\u00010\u00032\b\u0010M\u001a\u0004\u0018\u0001082\b\u0010H\u001a\u0004\u0018\u00010.2\u0006\u0010)\u001a\u00020*2\b\u0010N\u001a\u0004\u0018\u0001002\u0006\u0010O\u001a\u000202H\u0002J\f\u0010P\u001a\u00020$*\u00020,H\u0002J\u0016\u0010Q\u001a\u0004\u0018\u00010R*\u00020,2\u0006\u0010/\u001a\u000200H\u0002J\u0016\u0010S\u001a\u0004\u0018\u00010T*\u00020,2\u0006\u0010/\u001a\u000200H\u0002J&\u0010U\u001a\u00020$*\u00020\u00042\u0006\u0010(\u001a\u00020\u00032\b\u0010H\u001a\u0004\u0018\u00010\u00032\u0006\u0010/\u001a\u000200H\u0002J<\u0010V\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u000108\u0012\u0006\u0012\u0004\u0018\u0001080W*\u00020\u00032\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010O\u001a\u000202H\u0002J$\u0010X\u001a\u00020$*\u00020\u00042\u0006\u0010(\u001a\u00020\u00032\u0006\u0010K\u001a\u00020&2\u0006\u0010Y\u001a\u00020*H\u0002J*\u0010Z\u001a\u00020$*\u00020\u00042\u0006\u0010E\u001a\u00020F2\u0006\u0010/\u001a\u0002002\f\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006_"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivStateBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/Div$State;", "Lcom/yandex/div2/DivState;", "Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;", "baseBinder", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "viewCreator", "Lcom/yandex/div/core/view2/DivViewCreator;", "viewBinder", "Ljavax/inject/Provider;", "Lcom/yandex/div/core/view2/DivBinder;", "divStateCache", "Lcom/yandex/div/state/DivStateCache;", "temporaryStateCache", "Lcom/yandex/div/core/state/TemporaryDivStateCache;", "divActionBinder", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "divActionBeaconSender", "Lcom/yandex/div/core/view2/divs/DivActionBeaconSender;", "divPatchManager", "Lcom/yandex/div/core/downloader/DivPatchManager;", "divPatchCache", "Lcom/yandex/div/core/downloader/DivPatchCache;", "div2Logger", "Lcom/yandex/div/core/Div2Logger;", "divVisibilityActionTracker", "Lcom/yandex/div/core/view2/DivVisibilityActionTracker;", "errorCollectors", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "variableBinder", "Lcom/yandex/div/core/expression/variables/TwoWayStringVariableBinder;", "runtimeVisitor", "Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/view2/DivViewCreator;Ljavax/inject/Provider;Lcom/yandex/div/state/DivStateCache;Lcom/yandex/div/core/state/TemporaryDivStateCache;Lcom/yandex/div/core/view2/divs/DivActionBinder;Lcom/yandex/div/core/view2/divs/DivActionBeaconSender;Lcom/yandex/div/core/downloader/DivPatchManager;Lcom/yandex/div/core/downloader/DivPatchCache;Lcom/yandex/div/core/Div2Logger;Lcom/yandex/div/core/view2/DivVisibilityActionTracker;Lcom/yandex/div/core/view2/errors/ErrorCollectors;Lcom/yandex/div/core/expression/variables/TwoWayStringVariableBinder;Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;)V", "bindView", "", "context", "Lcom/yandex/div/core/view2/BindingContext;", "view", "div", "path", "Lcom/yandex/div/core/state/DivStatePath;", "getIncomingView", "Landroid/view/View;", "reusableIncomingView", "Lcom/yandex/div2/Div;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "getValueFromVariable", "", "variableName", "replaceViewsAnimated", "Landroidx/transition/Transition;", "divState", "incomingState", "Lcom/yandex/div2/DivState$State;", "outgoingState", "incoming", "outgoing", "setupAnimation", "setupTransitions", "transitionBuilder", "Lcom/yandex/div/core/view2/DivTransitionBuilder;", "transitionHolder", "Lcom/yandex/div/core/view2/state/DivStateTransitionHolder;", "incomingResolver", "outgoingResolver", "untrackRecursively", "divView", "Lcom/yandex/div/core/view2/Div2View;", "bind", "oldDiv", "newState", "bindState", "bindingContext", "oldDivState", "oldState", "oldResolver", "id", "createLayoutParams", "extractParentContentAlignmentHorizontal", "Lcom/yandex/div2/DivContentAlignmentHorizontal;", "extractParentContentAlignmentVertical", "Lcom/yandex/div2/DivContentAlignmentVertical;", "fixAlignment", "getStates", "Lkotlin/Pair;", "observeStateIdVariable", "divStatePath", "swipeOut", "actions", "", "Lcom/yandex/div2/DivAction;", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes12.dex */
public final class DivStateBinder extends DivViewBinder<Div.State, DivState, DivStateLayout> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAG = "DivStateBinder";

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final Div2Logger div2Logger;

    @NotNull
    private final DivActionBeaconSender divActionBeaconSender;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final DivPatchManager divPatchManager;

    @NotNull
    private final DivStateCache divStateCache;

    @NotNull
    private final DivVisibilityActionTracker divVisibilityActionTracker;

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final DivRuntimeVisitor runtimeVisitor;

    @NotNull
    private final TemporaryDivStateCache temporaryStateCache;

    @NotNull
    private final TwoWayStringVariableBinder variableBinder;

    @NotNull
    private final Provider viewBinder;

    @NotNull
    private final DivViewCreator viewCreator;

    public DivStateBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivViewCreator divViewCreator, @NotNull Provider provider, @NotNull DivStateCache divStateCache, @NotNull TemporaryDivStateCache temporaryDivStateCache, @NotNull DivActionBinder divActionBinder, @NotNull DivActionBeaconSender divActionBeaconSender, @NotNull DivPatchManager divPatchManager, @NotNull DivPatchCache divPatchCache, @NotNull Div2Logger div2Logger, @NotNull DivVisibilityActionTracker divVisibilityActionTracker, @NotNull ErrorCollectors errorCollectors, @NotNull TwoWayStringVariableBinder twoWayStringVariableBinder, @NotNull DivRuntimeVisitor divRuntimeVisitor) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.viewCreator = divViewCreator;
        this.viewBinder = provider;
        this.divStateCache = divStateCache;
        this.temporaryStateCache = temporaryDivStateCache;
        this.divActionBinder = divActionBinder;
        this.divActionBeaconSender = divActionBeaconSender;
        this.divPatchManager = divPatchManager;
        this.divPatchCache = divPatchCache;
        this.div2Logger = div2Logger;
        this.divVisibilityActionTracker = divVisibilityActionTracker;
        this.errorCollectors = errorCollectors;
        this.variableBinder = twoWayStringVariableBinder;
        this.runtimeVisitor = divRuntimeVisitor;
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bindView(@NotNull final BindingContext context, @NotNull DivStateLayout view, @NotNull Div.State div, @NotNull final DivStatePath path) {
        Div div2;
        DivState value = div.getValue();
        Div.State div3 = view.getDiv();
        BindingContext bindingContext = view.getBindingContext();
        ExpressionResolver expressionResolver = bindingContext != null ? bindingContext.getExpressionResolver() : null;
        String id$div_release = DivPathUtils.INSTANCE.getId$div_release(value, new Function0() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$bindView$id$1
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
                ErrorCollectors errorCollectors;
                errorCollectors = DivStateBinder.this.errorCollectors;
                errorCollectors.getOrCreate(context.getDivView().getDataTag(), context.getDivView().getDivData()).logError(ParsingExceptionKt.missingValue("id", path.toString()));
            }
        });
        Pair<DivState.State, DivState.State> states = getStates(value, context, view, path, id$div_release);
        DivState.State component1 = states.component1();
        DivState.State component2 = states.component2();
        if (component1 == null || component2 == null) {
            return;
        }
        Div activeStateDiv = view.getActiveStateDiv();
        if (div3 != div) {
            this.baseBinder.bindView(context, view, div, activeStateDiv);
            div2 = activeStateDiv;
            bind(view, context, value, div3 != null ? div3.getValue() : null, component2, path);
        } else {
            div2 = activeStateDiv;
        }
        bindState(view, context, value, component2, div3 != null ? div3.getValue() : null, component1, div2, path, expressionResolver, id$div_release);
    }

    private final Pair<DivState.State, DivState.State> getStates(DivState divState, BindingContext bindingContext, DivStateLayout divStateLayout, DivStatePath divStatePath, String str) {
        Object obj;
        String id = bindingContext.getDivView().getDivTag().getId();
        String str2 = divStatePath.getStatesString$div_release() + '/' + str;
        String state = this.temporaryStateCache.getState(id, str2);
        if (state == null) {
            state = this.divStateCache.getState(id, str2);
        }
        Object obj2 = null;
        if (state != null) {
            Function1 variableUpdater = divStateLayout.getVariableUpdater();
            if (variableUpdater != null) {
                variableUpdater.invoke(state);
            }
        } else {
            String str3 = divState.stateIdVariable;
            state = str3 != null ? getValueFromVariable(bindingContext, str3) : null;
        }
        Iterator it = divState.states.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((DivState.State) obj).stateId, divStateLayout.getStateId())) {
                break;
            }
        }
        DivState.State state2 = (DivState.State) obj;
        if (state2 == null) {
            state2 = DivUtilKt.getDefaultState(divState, bindingContext.getExpressionResolver());
        }
        Iterator it2 = divState.states.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.areEqual(((DivState.State) next).stateId, state)) {
                obj2 = next;
                break;
            }
        }
        DivState.State state3 = (DivState.State) obj2;
        if (state3 == null) {
            state3 = DivUtilKt.getDefaultState(divState, bindingContext.getExpressionResolver());
        }
        return new Pair<>(state2, state3);
    }

    private final void bind(final DivStateLayout divStateLayout, final BindingContext bindingContext, DivState divState, DivState divState2, DivState.State state, DivStatePath divStatePath) {
        DivStateLayout divStateLayout2;
        BaseDivViewExtensionsKt.applyDivActions(divStateLayout, bindingContext, divState.action, divState.actions, divState.longtapActions, divState.doubletapActions, divState.hoverStartActions, divState.hoverEndActions, divState.pressStartActions, divState.pressEndActions, divState.actionAnimation, divState.captureFocusOnAction);
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        fixAlignment(divStateLayout, divState, divState2, expressionResolver);
        observeStateIdVariable(divStateLayout, divState, bindingContext, divStatePath);
        Function0 function0 = null;
        BaseDivViewExtensionsKt.bindClipChildren(divStateLayout, divState.clipToBounds, divState2 != null ? divState2.clipToBounds : null, expressionResolver);
        final List list = state.swipeOutActions;
        if (list != null) {
            divStateLayout2 = divStateLayout;
            function0 = new Function0() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$bind$1$1
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
                    DivStateBinder.this.swipeOut(divStateLayout, bindingContext.getDivView(), expressionResolver, list);
                }
            };
        } else {
            divStateLayout2 = divStateLayout;
        }
        divStateLayout2.setSwipeOutCallback(function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindState(DivStateLayout divStateLayout, BindingContext bindingContext, DivState divState, DivState.State state, DivState divState2, DivState.State state2, Div div, DivStatePath divStatePath, ExpressionResolver expressionResolver, String str) {
        DivStatePath divStatePath2;
        Div div2;
        View view;
        ExpressionResolver expressionResolver2;
        Div2View div2View;
        ExpressionResolver expressionResolver3;
        DivStatePath divStatePath3;
        View view2;
        boolean z;
        View incomingView;
        Div div3;
        DivStatePath divStatePath4;
        DivState divState3;
        DivStatePath divStatePath5;
        DivStatePath divStatePath6;
        Div2View div2View2;
        ExpressionResolver expressionResolver4;
        final Div div4;
        Div2View div2View3;
        DivBase value;
        String id;
        View view3;
        Div div5;
        ReusableTokenList currentRebindReusableList$div_release;
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver5 = bindingContext.getExpressionResolver();
        Div div6 = state.div;
        DivBase value2 = div6 != null ? div6.value() : null;
        DivStatePath append$div_release = divStatePath.append$div_release(str, state, state.stateId);
        View childAt = divStateLayout.getChildCount() != 0 ? divStateLayout.getChildAt(0) : null;
        View uniqueViewForDiv = (div6 == null || (currentRebindReusableList$div_release = divView.getCurrentRebindReusableList$div_release()) == null) ? null : currentRebindReusableList$div_release.getUniqueViewForDiv(div6);
        if (Intrinsics.areEqual(divStateLayout.getStateId(), state.stateId)) {
            divStatePath2 = append$div_release;
            div2 = div6;
            view = childAt;
            if (value2 != null) {
                if (view == null || expressionResolver == null) {
                    expressionResolver2 = expressionResolver5;
                    div2View = divView;
                    expressionResolver3 = expressionResolver;
                    divStatePath3 = divStatePath;
                } else {
                    expressionResolver2 = expressionResolver5;
                    div2View = divView;
                    expressionResolver3 = expressionResolver;
                    divStatePath3 = divStatePath;
                    if (DivComparator.areDivsReplaceable$default(DivComparator.INSTANCE, div, div2, expressionResolver, expressionResolver2, null, 16, null)) {
                        z = true;
                        incomingView = !z ? view : getIncomingView(uniqueViewForDiv, div2, expressionResolver2);
                        if (!z) {
                            ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, div2View);
                            divStateLayout.addView(incomingView);
                        }
                        if (incomingView != null) {
                            ((DivBinder) this.viewBinder.get()).bind(bindingContext, incomingView, div2, divStatePath2);
                        }
                        view2 = incomingView;
                    }
                }
                z = false;
                if (!z) {
                }
                if (!z) {
                }
                if (incomingView != null) {
                }
                view2 = incomingView;
            } else {
                expressionResolver2 = expressionResolver5;
                div2View = divView;
                expressionResolver3 = expressionResolver;
                divStatePath3 = divStatePath;
                ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, div2View);
                view2 = null;
            }
        } else {
            View incomingView2 = div6 != null ? getIncomingView(uniqueViewForDiv, div6, expressionResolver5) : null;
            View view4 = childAt;
            divStatePath2 = append$div_release;
            div2 = div6;
            Transition replaceViewsAnimated = replaceViewsAnimated(bindingContext, divState, state, state2, incomingView2, view4);
            if (replaceViewsAnimated != null) {
                TransitionManager.endTransitions(divStateLayout);
                SceneRootWatcher.INSTANCE.watchFor(divStateLayout, replaceViewsAnimated);
                TransitionManager.beginDelayedTransition(divStateLayout, replaceViewsAnimated);
            }
            ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, divView);
            if (incomingView2 != null) {
                divStateLayout.addView(incomingView2);
                if (div2 != null) {
                    ((DivBinder) this.viewBinder.get()).bind(bindingContext, incomingView2, div2, divStatePath2);
                }
            }
            view = view4;
            if (view != null) {
                divView.getDivTransitionHandler().runTransitions(divStateLayout, false);
            }
            view2 = incomingView2;
            expressionResolver2 = expressionResolver5;
            div2View = divView;
            expressionResolver3 = expressionResolver;
            divStatePath3 = divStatePath;
        }
        if (view != null) {
            view.startAnimation(new AnimationSet(false));
            Div div7 = div2;
            divState3 = divState;
            if (!Intrinsics.areEqual(divState2, divState3) || !Intrinsics.areEqual(state, state2)) {
                div2View.unbindViewFromDiv$div_release(view);
                if (div != null && expressionResolver3 != null) {
                    divStatePath4 = divStatePath2;
                    div3 = div7;
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(this.divVisibilityActionTracker, div2View, expressionResolver, null, div, null, null, 48, null);
                    untrackRecursively(view, div2View, expressionResolver3);
                }
            }
            divStatePath4 = divStatePath2;
            div3 = div7;
        } else {
            div3 = div2;
            divStatePath4 = divStatePath2;
            divState3 = divState;
        }
        if (view2 == null || value2 == null || (value2.getVisibilityAction() == null && value2.getVisibilityActions() == null)) {
            divStatePath5 = divStatePath4;
            divStatePath6 = divStatePath3;
            div2View2 = div2View;
            expressionResolver4 = expressionResolver2;
            div4 = div3;
        } else {
            div4 = div3;
            div2View.bindViewToDiv$div_release(view2, div4);
            divStatePath5 = divStatePath4;
            final View view5 = view2;
            final Div2View div2View4 = div2View;
            divStatePath6 = divStatePath3;
            final ExpressionResolver expressionResolver6 = expressionResolver2;
            div2View2 = div2View;
            expressionResolver4 = expressionResolver2;
            view5.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$bindState$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view6, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    DivVisibilityActionTracker divVisibilityActionTracker;
                    view6.removeOnLayoutChangeListener(this);
                    divVisibilityActionTracker = DivStateBinder.this.divVisibilityActionTracker;
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(divVisibilityActionTracker, div2View4, expressionResolver6, view5, div4, null, null, 48, null);
                }
            });
        }
        if (div != null && (value = div.value()) != null && (id = value.getId()) != null) {
            List<View> buildViewsForId = this.divPatchManager.buildViewsForId(bindingContext, id);
            if (buildViewsForId != null) {
                if (buildViewsForId.size() > 1) {
                    KLog kLog = KLog.INSTANCE;
                    if (kLog.isAtLeast(Severity.ERROR)) {
                        kLog.print(6, TAG, "Unable to patch state because there is more than 1 div in the patch");
                    }
                } else {
                    view3 = (View) CollectionsKt.firstOrNull((List) buildViewsForId);
                    List<Div> patchDivListById = this.divPatchCache.getPatchDivListById(div2View2.getDataTag(), id);
                    div5 = patchDivListById != null ? (Div) CollectionsKt.firstOrNull((List) patchDivListById) : null;
                    if (view3 != null && div5 != null) {
                        div2View3 = div2View2;
                        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, div2View3);
                        divStateLayout.addView(view3);
                        if (DivUtilKt.getHasSightActions(div5.value())) {
                            div2View3.bindViewToDiv$div_release(view3, div5);
                        }
                        ((DivBinder) this.viewBinder.get()).bind(bindingContext, view3, div5, divStatePath5);
                        divStateLayout.setActiveStateDiv$div_release(div4);
                        divStateLayout.setPath(divStatePath5);
                        if (view != null) {
                            this.runtimeVisitor.createAndAttachRuntimesToState(div2View3, divState3, divStatePath6, expressionResolver4);
                            return;
                        }
                        return;
                    }
                }
            }
            view3 = null;
            List<Div> patchDivListById2 = this.divPatchCache.getPatchDivListById(div2View2.getDataTag(), id);
            div5 = patchDivListById2 != null ? (Div) CollectionsKt.firstOrNull((List) patchDivListById2) : null;
            if (view3 != null) {
                div2View3 = div2View2;
                ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(divStateLayout, div2View3);
                divStateLayout.addView(view3);
                if (DivUtilKt.getHasSightActions(div5.value())) {
                }
                ((DivBinder) this.viewBinder.get()).bind(bindingContext, view3, div5, divStatePath5);
                divStateLayout.setActiveStateDiv$div_release(div4);
                divStateLayout.setPath(divStatePath5);
                if (view != null) {
                }
            }
        }
        div2View3 = div2View2;
        divStateLayout.setActiveStateDiv$div_release(div4);
        divStateLayout.setPath(divStatePath5);
        if (view != null) {
        }
    }

    private final View getIncomingView(View reusableIncomingView, Div div, ExpressionResolver resolver) {
        if (reusableIncomingView != null) {
            return reusableIncomingView;
        }
        View create = this.viewCreator.create(div, resolver);
        createLayoutParams(create);
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void swipeOut(final DivStateLayout divStateLayout, final Div2View div2View, final ExpressionResolver expressionResolver, final List<DivAction> list) {
        div2View.bulkActions$div_release(new Function0() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$swipeOut$1
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
                DivActionBinder divActionBinder;
                divActionBinder = DivStateBinder.this.divActionBinder;
                final Div2View div2View2 = div2View;
                final ExpressionResolver expressionResolver2 = expressionResolver;
                List<DivAction> list2 = list;
                final DivStateBinder divStateBinder = DivStateBinder.this;
                final DivStateLayout divStateLayout2 = divStateLayout;
                divActionBinder.handleActions$div_release(div2View2, expressionResolver2, list2, DivActionHandler.DivActionReason.STATE_SWIPE_OUT, new Function1() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$swipeOut$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DivAction) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull DivAction divAction) {
                        Div2Logger div2Logger;
                        DivActionBeaconSender divActionBeaconSender;
                        div2Logger = DivStateBinder.this.div2Logger;
                        div2Logger.logSwipedAway(div2View2, expressionResolver2, divStateLayout2, divAction);
                        divActionBeaconSender = DivStateBinder.this.divActionBeaconSender;
                        divActionBeaconSender.sendSwipeOutActionBeacon(divAction, expressionResolver2);
                    }
                });
            }
        });
    }

    private final void fixAlignment(DivStateLayout divStateLayout, DivState divState, DivState divState2, ExpressionResolver expressionResolver) {
        DivAlignmentHorizontal alignmentHorizontal;
        DivAlignmentVertical divAlignmentVertical;
        Expression alignmentHorizontal2 = divState.getAlignmentHorizontal();
        Expression alignmentVertical = divState.getAlignmentVertical();
        DivAlignmentVertical divAlignmentVertical2 = null;
        if (Intrinsics.areEqual(alignmentHorizontal2, divState2 != null ? divState2.getAlignmentHorizontal() : null)) {
            if (Intrinsics.areEqual(alignmentVertical, divState2 != null ? divState2.getAlignmentVertical() : null)) {
                return;
            }
        }
        if (alignmentHorizontal2 == null || (alignmentHorizontal = (DivAlignmentHorizontal) alignmentHorizontal2.evaluate(expressionResolver)) == null) {
            DivContentAlignmentHorizontal extractParentContentAlignmentHorizontal = extractParentContentAlignmentHorizontal(divStateLayout, expressionResolver);
            alignmentHorizontal = extractParentContentAlignmentHorizontal != null ? DivUtilKt.toAlignmentHorizontal(extractParentContentAlignmentHorizontal) : null;
        }
        if (alignmentVertical == null || (divAlignmentVertical = (DivAlignmentVertical) alignmentVertical.evaluate(expressionResolver)) == null) {
            DivContentAlignmentVertical extractParentContentAlignmentVertical = extractParentContentAlignmentVertical(divStateLayout, expressionResolver);
            if (extractParentContentAlignmentVertical != null) {
                divAlignmentVertical2 = DivUtilKt.toAlignmentVertical(extractParentContentAlignmentVertical);
            }
        } else {
            divAlignmentVertical2 = divAlignmentVertical;
        }
        BaseDivViewExtensionsKt.applyAlignment(divStateLayout, alignmentHorizontal, divAlignmentVertical2);
    }

    private final DivContentAlignmentVertical extractParentContentAlignmentVertical(View view, ExpressionResolver expressionResolver) {
        ViewParent parent = view.getParent();
        DivHolderView divHolderView = parent instanceof DivHolderView ? (DivHolderView) parent : null;
        Div div = divHolderView != null ? divHolderView.getDiv() : null;
        Div.Container container = div instanceof Div.Container ? (Div.Container) div : null;
        if (container == null) {
            return null;
        }
        return (DivContentAlignmentVertical) container.getValue().contentAlignmentVertical.evaluate(expressionResolver);
    }

    private final DivContentAlignmentHorizontal extractParentContentAlignmentHorizontal(View view, ExpressionResolver expressionResolver) {
        ViewParent parent = view.getParent();
        DivHolderView divHolderView = parent instanceof DivHolderView ? (DivHolderView) parent : null;
        Div div = divHolderView != null ? divHolderView.getDiv() : null;
        Div.Container container = div instanceof Div.Container ? (Div.Container) div : null;
        if (container == null) {
            return null;
        }
        return (DivContentAlignmentHorizontal) container.getValue().contentAlignmentHorizontal.evaluate(expressionResolver);
    }

    private final String getValueFromVariable(BindingContext context, String variableName) {
        Variable mutableVariable;
        Object value;
        VariableController variableController = UtilsKt.getVariableController(context.getExpressionResolver());
        if (variableController == null || (mutableVariable = variableController.getMutableVariable(variableName)) == null || (value = mutableVariable.getValue()) == null) {
            return null;
        }
        return value.toString();
    }

    private final void observeStateIdVariable(final DivStateLayout divStateLayout, final DivState divState, final BindingContext bindingContext, final DivStatePath divStatePath) {
        String str = divState.stateIdVariable;
        if (str == null) {
            return;
        }
        divStateLayout.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayStringVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$observeStateIdVariable$subscription$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable String value) {
                Object obj;
                if (value == null || DivStateLayout.this.getStateId() == null || Intrinsics.areEqual(value, DivStateLayout.this.getStateId())) {
                    return;
                }
                Iterator it = divState.states.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (Intrinsics.areEqual(((DivState.State) obj).stateId, value)) {
                            break;
                        }
                    }
                }
                bindingContext.getDivView().switchToState(divStatePath.append$div_release(DivPathUtils.getId$div_release$default(DivPathUtils.INSTANCE, divState, null, 1, null), (DivState.State) obj, value), true);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull Function1 valueUpdater) {
                DivStateLayout.this.setVariableUpdater(valueUpdater);
            }
        }, divStatePath));
    }

    private final void untrackRecursively(View outgoing, Div2View divView, ExpressionResolver resolver) {
        if (outgoing instanceof ViewGroup) {
            for (View view : ViewGroupKt.getChildren((ViewGroup) outgoing)) {
                Div unbindViewFromDiv$div_release = divView.unbindViewFromDiv$div_release(view);
                if (unbindViewFromDiv$div_release != null) {
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(this.divVisibilityActionTracker, divView, resolver, null, unbindViewFromDiv$div_release, null, null, 48, null);
                }
                untrackRecursively(view, divView, resolver);
            }
        }
    }

    private final Transition replaceViewsAnimated(BindingContext context, DivState divState, DivState.State incomingState, DivState.State outgoingState, View incoming, View outgoing) {
        BindingContext bindingContext;
        ExpressionResolver expressionResolver;
        Div div;
        Div div2;
        if (outgoing == null || (bindingContext = BaseDivViewExtensionsKt.getBindingContext(outgoing)) == null || (expressionResolver = bindingContext.getExpressionResolver()) == null) {
            return setupAnimation(context, incomingState, outgoingState, incoming, outgoing);
        }
        ExpressionResolver expressionResolver2 = context.getExpressionResolver();
        if (DivTransitionsKt.allowsTransitionsOnStateChange(divState, expressionResolver2) && ((outgoingState != null && (div2 = outgoingState.div) != null && DivUtilKt.containsStateInnerTransitions(div2, expressionResolver)) || ((div = incomingState.div) != null && DivUtilKt.containsStateInnerTransitions(div, expressionResolver2)))) {
            return setupTransitions(context.getDivView().getViewComponent().getTransitionBuilder(), context.getDivView().getViewComponent().getStateTransitionHolder(), incomingState, outgoingState, expressionResolver2, expressionResolver);
        }
        return setupAnimation(context, incomingState, outgoingState, incoming, outgoing);
    }

    private final void createLayoutParams(View view) {
        view.setLayoutParams(new DivLayoutParams(-1, -2));
    }

    private final Transition setupTransitions(DivTransitionBuilder transitionBuilder, DivStateTransitionHolder transitionHolder, DivState.State incomingState, DivState.State outgoingState, ExpressionResolver incomingResolver, ExpressionResolver outgoingResolver) {
        DivTreeWalk walk;
        DivTreeWalk onEnter;
        Div div;
        DivTreeWalk walk2;
        DivTreeWalk onEnter2;
        Sequence sequence = null;
        if (Intrinsics.areEqual(incomingState, outgoingState)) {
            return null;
        }
        Sequence filter = (outgoingState == null || (div = outgoingState.div) == null || (walk2 = DivTreeWalkKt.walk(div, outgoingResolver)) == null || (onEnter2 = walk2.onEnter(new Function1() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Div div2) {
                return Boolean.valueOf(!(div2 instanceof Div.State));
            }
        })) == null) ? null : SequencesKt.filter(onEnter2, new Function1() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DivItemBuilderResult divItemBuilderResult) {
                List transitionTriggers = divItemBuilderResult.getDiv().value().getTransitionTriggers();
                return Boolean.valueOf(transitionTriggers != null ? DivTransitionsKt.allowsTransitionsOnStateChange((List<? extends DivTransitionTrigger>) transitionTriggers) : true);
            }
        });
        Div div2 = incomingState.div;
        if (div2 != null && (walk = DivTreeWalkKt.walk(div2, incomingResolver)) != null && (onEnter = walk.onEnter(new Function1() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$3
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Div div3) {
                return Boolean.valueOf(!(div3 instanceof Div.State));
            }
        })) != null) {
            sequence = SequencesKt.filter(onEnter, new Function1() { // from class: com.yandex.div.core.view2.divs.DivStateBinder$setupTransitions$transition$4
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DivItemBuilderResult divItemBuilderResult) {
                    List transitionTriggers = divItemBuilderResult.getDiv().value().getTransitionTriggers();
                    return Boolean.valueOf(transitionTriggers != null ? DivTransitionsKt.allowsTransitionsOnStateChange((List<? extends DivTransitionTrigger>) transitionTriggers) : true);
                }
            });
        }
        TransitionSet buildTransitions = transitionBuilder.buildTransitions(filter, sequence, outgoingResolver, incomingResolver);
        transitionHolder.append(buildTransitions);
        return buildTransitions;
    }

    private final Transition setupAnimation(BindingContext context, DivState.State incomingState, DivState.State outgoingState, View incoming, View outgoing) {
        List<DivAnimation> list;
        Transition transition;
        BindingContext bindingContext;
        List<DivAnimation> list2;
        Transition transition2;
        ExpressionResolver expressionResolver = context.getExpressionResolver();
        DivAnimation divAnimation = incomingState.animationIn;
        ExpressionResolver expressionResolver2 = null;
        DivAnimation divAnimation2 = outgoingState != null ? outgoingState.animationOut : null;
        if (divAnimation == null && divAnimation2 == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (divAnimation != null && incoming != null) {
            if (divAnimation.name.evaluate(expressionResolver) != DivAnimation.Name.SET) {
                list2 = CollectionsKt.listOf(divAnimation);
            } else {
                list2 = divAnimation.items;
                if (list2 == null) {
                    list2 = CollectionsKt.emptyList();
                }
            }
            for (DivAnimation divAnimation3 : list2) {
                transition2 = DivStateBinderKt.toTransition(divAnimation3, true, expressionResolver);
                if (transition2 != null) {
                    transitionSet.addTransition(transition2.addTarget(incoming).setDuration(((Number) divAnimation3.duration.evaluate(expressionResolver)).longValue()).setStartDelay(((Number) divAnimation3.startDelay.evaluate(expressionResolver)).longValue()).setInterpolator(DivUtilKt.getAndroidInterpolator((DivAnimationInterpolator) divAnimation3.interpolator.evaluate(expressionResolver))));
                }
            }
        }
        if (outgoing != null && (bindingContext = BaseDivViewExtensionsKt.getBindingContext(outgoing)) != null) {
            expressionResolver2 = bindingContext.getExpressionResolver();
        }
        if (divAnimation2 != null && expressionResolver2 != null) {
            if (divAnimation2.name.evaluate(expressionResolver2) != DivAnimation.Name.SET) {
                list = CollectionsKt.listOf(divAnimation2);
            } else {
                list = divAnimation2.items;
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
            }
            for (DivAnimation divAnimation4 : list) {
                transition = DivStateBinderKt.toTransition(divAnimation4, false, expressionResolver2);
                if (transition != null) {
                    transitionSet.addTransition(transition.addTarget(outgoing).setDuration(((Number) divAnimation4.duration.evaluate(expressionResolver2)).longValue()).setStartDelay(((Number) divAnimation4.startDelay.evaluate(expressionResolver2)).longValue()).setInterpolator(DivUtilKt.getAndroidInterpolator((DivAnimationInterpolator) divAnimation4.interpolator.evaluate(expressionResolver2))));
                }
            }
        }
        if (outgoing != null) {
            outgoing.clearAnimation();
        }
        return transitionSet;
    }

    /* compiled from: DivStateBinder.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivStateBinder$Companion;", "", "()V", "TAG", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
