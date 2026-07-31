package com.yandex.div.core.expression.triggers;

import com.ironsource.X3;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.downloader.PersistentDivDataObserver;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTrigger;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TriggersController.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001BS\u0012\u0010\u0010\u0002\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0016H\u0002J\b\u0010$\u001a\u00020\u001bH\u0002J\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0016J\u0010\u0010'\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010\u0016J\b\u0010(\u001a\u00020\u001bH\u0002J\b\u0010)\u001a\u00020\u001bH\u0002J\b\u0010*\u001a\u00020\u001bH\u0002J\u0010\u0010*\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u0016H\u0002J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020-H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/yandex/div/core/expression/triggers/TriggerExecutor;", "", "expression", "Lcom/yandex/div/json/expressions/Expression$MutableExpression;", "", "actions", "", "Lcom/yandex/div2/DivAction;", X3.a.t, "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivTrigger$Mode;", "resolver", "Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "logger", "Lcom/yandex/div/core/Div2Logger;", "divActionBinder", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "(Lcom/yandex/div/json/expressions/Expression$MutableExpression;Ljava/util/List;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/core/expression/ExpressionResolverImpl;Lcom/yandex/div/core/view2/errors/ErrorCollector;Lcom/yandex/div/core/Div2Logger;Lcom/yandex/div/core/view2/divs/DivActionBinder;)V", "attachedViews", "", "Lcom/yandex/div/core/DivViewFacade;", "bindCompletionDisposable", "Lcom/yandex/div/core/Disposable;", "changeTrigger", "Lkotlin/Function1;", "", "currentMode", "modeObserver", "observersDisposable", "removingDisposable", "wasConditionSatisfied", "Ljava/util/WeakHashMap;", "conditionSatisfied", "viewFacade", "invalidateObservation", "onAttach", "view", "onDetach", "startObserving", "stopObserving", "tryTriggerActions", "tryTriggerActionsAfterBind", "div2View", "Lcom/yandex/div/core/view2/Div2View;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
final class TriggerExecutor {

    @NotNull
    private final List<DivAction> actions;

    @NotNull
    private final Set<DivViewFacade> attachedViews;

    @NotNull
    private Disposable bindCompletionDisposable;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final Expression.MutableExpression<?, Boolean> expression;

    @NotNull
    private final Div2Logger logger;

    @NotNull
    private final Expression<DivTrigger.Mode> mode;

    @NotNull
    private Disposable modeObserver;

    @NotNull
    private Disposable observersDisposable;

    @NotNull
    private Disposable removingDisposable;

    @NotNull
    private final ExpressionResolverImpl resolver;

    @NotNull
    private final Function1 changeTrigger = new Function1() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$changeTrigger$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            TriggerExecutor.this.tryTriggerActions();
        }
    };

    @NotNull
    private DivTrigger.Mode currentMode = DivTrigger.Mode.ON_CONDITION;

    @NotNull
    private WeakHashMap<DivViewFacade, Boolean> wasConditionSatisfied = new WeakHashMap<>();

    public TriggerExecutor(@NotNull Expression.MutableExpression<?, Boolean> mutableExpression, @NotNull List<DivAction> list, @NotNull Expression<DivTrigger.Mode> expression, @NotNull ExpressionResolverImpl expressionResolverImpl, @NotNull ErrorCollector errorCollector, @NotNull Div2Logger div2Logger, @NotNull DivActionBinder divActionBinder) {
        this.expression = mutableExpression;
        this.actions = list;
        this.mode = expression;
        this.resolver = expressionResolverImpl;
        this.errorCollector = errorCollector;
        this.logger = div2Logger;
        this.divActionBinder = divActionBinder;
        this.modeObserver = expression.observeAndGet(expressionResolverImpl, new Function1() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$modeObserver$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DivTrigger.Mode) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull DivTrigger.Mode mode) {
                TriggerExecutor.this.currentMode = mode;
            }
        });
        Disposable disposable = Disposable.NULL;
        this.observersDisposable = disposable;
        this.removingDisposable = disposable;
        this.bindCompletionDisposable = disposable;
        this.attachedViews = new LinkedHashSet();
    }

    public final void onAttach(@NotNull DivViewFacade view) {
        this.attachedViews.add(view);
        invalidateObservation();
    }

    public final void onDetach(@Nullable DivViewFacade view) {
        TypeIntrinsics.asMutableCollection(this.attachedViews).remove(view);
        invalidateObservation();
    }

    private final void invalidateObservation() {
        if (this.attachedViews.isEmpty()) {
            stopObserving();
        } else {
            startObserving();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopObserving() {
        this.modeObserver.close();
        this.observersDisposable.close();
        this.removingDisposable.close();
        this.bindCompletionDisposable.close();
    }

    private final void startObserving() {
        this.modeObserver.close();
        this.observersDisposable = this.expression.observe(this.resolver, this.changeTrigger);
        this.removingDisposable = this.resolver.getVariableController().subscribeToVariablesUndeclared(this.expression.getVariablesName(this.resolver), new Function1() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$startObserving$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Variable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Variable variable) {
                TriggerExecutor.this.stopObserving();
            }
        });
        this.modeObserver = this.mode.observeAndGet(this.resolver, new Function1() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$startObserving$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DivTrigger.Mode) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull DivTrigger.Mode mode) {
                TriggerExecutor.this.currentMode = mode;
            }
        });
        tryTriggerActions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryTriggerActions() {
        Assert.assertMainThread();
        Iterator<T> it = this.attachedViews.iterator();
        while (it.hasNext()) {
            tryTriggerActions((DivViewFacade) it.next());
        }
    }

    private final void tryTriggerActions(DivViewFacade viewFacade) {
        boolean z = viewFacade instanceof Div2View;
        Div2View div2View = z ? (Div2View) viewFacade : null;
        if (div2View != null) {
            if (!div2View.getInMiddleOfBind()) {
                div2View = null;
            }
            if (div2View != null) {
                tryTriggerActionsAfterBind(div2View);
                return;
            }
        }
        if (conditionSatisfied(viewFacade)) {
            for (DivAction divAction : this.actions) {
                Div2View div2View2 = z ? (Div2View) viewFacade : null;
                if (div2View2 != null) {
                    this.logger.logTrigger(div2View2, divAction);
                }
            }
            DivActionBinder.handleActions$div_release$default(this.divActionBinder, viewFacade, this.resolver, this.actions, DivActionHandler.DivActionReason.TRIGGER, null, 16, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.yandex.div.core.downloader.PersistentDivDataObserver, com.yandex.div.core.expression.triggers.TriggerExecutor$tryTriggerActionsAfterBind$observer$1] */
    private final void tryTriggerActionsAfterBind(final Div2View div2View) {
        this.bindCompletionDisposable.close();
        final ?? r0 = new PersistentDivDataObserver() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$tryTriggerActionsAfterBind$observer$1
            @Override // com.yandex.div.core.downloader.PersistentDivDataObserver
            public void onAfterDivDataChanged() {
                Div2View.this.removePersistentDivDataObserver$div_release(this);
                this.tryTriggerActions();
            }
        };
        this.bindCompletionDisposable = new Disposable() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$$ExternalSyntheticLambda0
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                Div2View.this.removePersistentDivDataObserver$div_release(r0);
            }
        };
        div2View.addPersistentDivDataObserver$div_release(r0);
    }

    private final boolean conditionSatisfied(DivViewFacade viewFacade) {
        RuntimeException runtimeException;
        try {
            Boolean evaluate = this.expression.evaluate(this.resolver);
            boolean booleanValue = evaluate.booleanValue();
            Boolean bool = this.wasConditionSatisfied.get(viewFacade);
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            boolean booleanValue2 = bool.booleanValue();
            this.wasConditionSatisfied.put(viewFacade, evaluate);
            if (booleanValue) {
                return (this.currentMode == DivTrigger.Mode.ON_CONDITION && booleanValue2) ? false : true;
            }
            return false;
        } catch (Exception e) {
            if (e instanceof ClassCastException) {
                runtimeException = new RuntimeException("Condition evaluated in non-boolean result! (expression: '" + this.expression.getRawValue() + "')", e);
            } else if (e instanceof EvaluableException) {
                runtimeException = new RuntimeException("Condition evaluation failed! (expression: '" + this.expression.getRawValue() + "')", e);
            } else {
                throw e;
            }
            this.errorCollector.logError(runtimeException);
            return false;
        }
    }
}
