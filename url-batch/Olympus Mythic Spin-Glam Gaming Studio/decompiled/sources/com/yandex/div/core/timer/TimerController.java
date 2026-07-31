package com.yandex.div.core.timer;

import com.ironsource.sdk.controller.f;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTimer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TimerController.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013J\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\fJ\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\fJ\u0010\u0010 \u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\fJ\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0002J\u0006\u0010%\u001a\u00020\u001bJ\b\u0010&\u001a\u00020\u001bH\u0002J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020#H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/yandex/div/core/timer/TimerController;", "", "divTimer", "Lcom/yandex/div2/DivTimer;", "divActionBinder", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "expressionResolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "(Lcom/yandex/div2/DivTimer;Lcom/yandex/div/core/view2/divs/DivActionBinder;Lcom/yandex/div/core/view2/errors/ErrorCollector;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "div2View", "Lcom/yandex/div/core/view2/Div2View;", "getDivTimer", "()Lcom/yandex/div2/DivTimer;", "endActions", "", "Lcom/yandex/div2/DivAction;", "id", "", "savedForBackground", "", "tickActions", "ticker", "Lcom/yandex/div/core/timer/Ticker;", "valueVariable", "applyCommand", "", f.b.g, "isAttachedToView", "view", "onAttach", "onDetach", "onEnd", "time", "", "onTick", TimerController.RESET_COMMAND, "updateTimer", "updateTimerVariable", "value", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimerController {

    @NotNull
    public static final String CANCEL_COMMAND = "cancel";

    @NotNull
    public static final String PAUSE_COMMAND = "pause";

    @NotNull
    public static final String RESET_COMMAND = "reset";

    @NotNull
    public static final String RESUME_COMMAND = "resume";

    @NotNull
    public static final String START_COMMAND = "start";

    @NotNull
    public static final String STOP_COMMAND = "stop";

    @Nullable
    private Div2View div2View;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final DivTimer divTimer;

    @Nullable
    private final List<DivAction> endActions;

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final ExpressionResolver expressionResolver;

    @NotNull
    private final String id;
    private boolean savedForBackground;

    @Nullable
    private final List<DivAction> tickActions;

    @NotNull
    private final Ticker ticker;

    @Nullable
    private final String valueVariable;

    public TimerController(@NotNull DivTimer divTimer, @NotNull DivActionBinder divActionBinder, @NotNull ErrorCollector errorCollector, @NotNull ExpressionResolver expressionResolver) {
        this.divTimer = divTimer;
        this.divActionBinder = divActionBinder;
        this.errorCollector = errorCollector;
        this.expressionResolver = expressionResolver;
        String str = divTimer.id;
        this.id = str;
        this.valueVariable = divTimer.valueVariable;
        this.endActions = divTimer.endActions;
        this.tickActions = divTimer.tickActions;
        this.ticker = new Ticker(str, new TimerController$ticker$1(this), new TimerController$ticker$2(this), new TimerController$ticker$3(this), new TimerController$ticker$4(this), errorCollector);
        divTimer.duration.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.timer.TimerController.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                TimerController.this.updateTimer();
            }
        });
        Expression expression = divTimer.tickInterval;
        if (expression != null) {
            expression.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.timer.TimerController.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).longValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(long j) {
                    TimerController.this.updateTimer();
                }
            });
        }
    }

    @NotNull
    public final DivTimer getDivTimer() {
        return this.divTimer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimer() {
        Ticker ticker = this.ticker;
        long longValue = ((Number) this.divTimer.duration.evaluate(this.expressionResolver)).longValue();
        Expression expression = this.divTimer.tickInterval;
        ticker.update(longValue, expression != null ? (Long) expression.evaluate(this.expressionResolver) : null);
    }

    public final void onAttach(@NotNull Div2View view) {
        this.div2View = view;
        if (this.savedForBackground) {
            this.ticker.restoreState(true);
            this.savedForBackground = false;
        }
    }

    public final void onDetach(@Nullable Div2View view) {
        if (Intrinsics.areEqual(view, this.div2View)) {
            reset();
        }
    }

    public final void reset() {
        this.div2View = null;
        this.ticker.saveState();
        this.savedForBackground = true;
    }

    public final boolean isAttachedToView(@NotNull Div2View view) {
        return Intrinsics.areEqual(view, this.div2View);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public final void applyCommand(@NotNull String command) {
        switch (command.hashCode()) {
            case -1367724422:
                if (command.equals("cancel")) {
                    this.ticker.cancel();
                    return;
                }
                break;
            case -934426579:
                if (command.equals("resume")) {
                    this.ticker.resume();
                    return;
                }
                break;
            case 3540994:
                if (command.equals("stop")) {
                    this.ticker.stop();
                    return;
                }
                break;
            case 106440182:
                if (command.equals("pause")) {
                    this.ticker.pause();
                    return;
                }
                break;
            case 108404047:
                if (command.equals(RESET_COMMAND)) {
                    this.ticker.reset();
                    return;
                }
                break;
            case 109757538:
                if (command.equals("start")) {
                    this.ticker.start();
                    return;
                }
                break;
        }
        this.errorCollector.logError(new IllegalArgumentException(command + " is unsupported timer command!"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTick(long time) {
        updateTimerVariable(time);
        Div2View div2View = this.div2View;
        if (div2View != null) {
            DivActionBinder.handleActions$div_release$default(this.divActionBinder, div2View, div2View.getExpressionResolver(), this.tickActions, DivActionHandler.DivActionReason.TIMER, null, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEnd(long time) {
        updateTimerVariable(time);
        Div2View div2View = this.div2View;
        if (div2View != null) {
            DivActionBinder.handleActions$div_release$default(this.divActionBinder, div2View, div2View.getExpressionResolver(), this.endActions, DivActionHandler.DivActionReason.TIMER, null, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimerVariable(long value) {
        Div2View div2View;
        String str = this.valueVariable;
        if (str == null || (div2View = this.div2View) == null) {
            return;
        }
        div2View.setVariable(str, String.valueOf(value));
    }
}
