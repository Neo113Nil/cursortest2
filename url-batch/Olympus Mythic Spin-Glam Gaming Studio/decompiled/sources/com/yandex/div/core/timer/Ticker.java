package com.yandex.div.core.timer;

import android.os.SystemClock;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.timer.Ticker;
import com.yandex.div.core.view2.errors.ErrorCollector;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Ticker.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 >2\u00020\u0001:\u0002>?Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u0006\u0010%\u001a\u00020\u0007J\b\u0010&\u001a\u00020\u0007H\u0002J\b\u0010'\u001a\u00020\u0007H\u0002J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0003H\u0002J\u0006\u0010*\u001a\u00020\u0007J\u0006\u0010+\u001a\u00020\u0007J\b\u0010,\u001a\u00020\u0007H\u0002J\u000e\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020\u0007J\u0010\u00101\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u0010\u00102\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u0018\u00103\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\b\u00104\u001a\u00020\u0007H\u0002J\u0006\u00105\u001a\u00020\u0007J(\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000709H\u0002J\u0006\u0010:\u001a\u00020\u0007J\u0006\u0010;\u001a\u00020\u0007J\u001d\u0010<\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010=R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0013R\u0014\u0010\"\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0013R\u000e\u0010$\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/yandex/div/core/timer/Ticker;", "", "name", "", "onInterrupt", "Lkotlin/Function1;", "", "", "onStart", "onEnd", "onTick", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "currentDuration", "Ljava/lang/Long;", "currentInterval", "currentTime", "getCurrentTime", "()J", IronSourceConstants.EVENTS_DURATION, "interruptedAt", "interval", "startedAt", "state", "Lcom/yandex/div/core/timer/Ticker$State;", DivActionHandler.DivActionReason.TIMER, "Lcom/yandex/div/core/timer/FixedRateScheduler;", "getTimer", "()Lcom/yandex/div/core/timer/FixedRateScheduler;", "timer$delegate", "Lkotlin/Lazy;", "totalWorkTime", "getTotalWorkTime", "workTime", "getWorkTime", "workTimeFromPrevious", "cancel", "cleanTicker", "coercedTick", "onError", "message", "pause", TimerController.RESET_COMMAND, "resetTickerState", "restoreState", "fromPreviousPoint", "", "resume", "runCountDownTimer", "runEndlessTimer", "runTickTimer", "runTimer", "saveState", "setupTimer", "period", "initialDelay", "Lkotlin/Function0;", "start", "stop", "update", "(JLjava/lang/Long;)V", "Companion", "State", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Ticker {
    private static final long DEFAULT_VALUE = -1;

    @Nullable
    private Long currentDuration;

    @Nullable
    private Long currentInterval;

    @Nullable
    private Long duration;

    @Nullable
    private final ErrorCollector errorCollector;

    @Nullable
    private Long interval;

    @NotNull
    private final String name;

    @NotNull
    private final Function1 onEnd;

    @NotNull
    private final Function1 onInterrupt;

    @NotNull
    private final Function1 onStart;

    @NotNull
    private final Function1 onTick;
    private long workTimeFromPrevious;

    @NotNull
    private State state = State.STOPPED;
    private long startedAt = -1;
    private long interruptedAt = -1;

    /* renamed from: timer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timer = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.yandex.div.core.timer.Ticker$timer$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final FixedRateScheduler mo4828invoke() {
            return new FixedRateScheduler();
        }
    });

    /* compiled from: Ticker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/timer/Ticker$State;", "", "(Ljava/lang/String;I)V", "STOPPED", "WORKING", "PAUSED", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum State {
        STOPPED,
        WORKING,
        PAUSED
    }

    /* compiled from: Ticker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.WORKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Ticker(@NotNull String str, @NotNull Function1 function1, @NotNull Function1 function12, @NotNull Function1 function13, @NotNull Function1 function14, @Nullable ErrorCollector errorCollector) {
        this.name = str;
        this.onInterrupt = function1;
        this.onStart = function12;
        this.onEnd = function13;
        this.onTick = function14;
        this.errorCollector = errorCollector;
    }

    private final long getCurrentTime() {
        return SystemClock.elapsedRealtime();
    }

    private final FixedRateScheduler getTimer() {
        return (FixedRateScheduler) this.timer.getValue();
    }

    static /* synthetic */ void setupTimer$default(Ticker ticker, long j, long j2, Function0 function0, int i, Object obj) {
        ticker.setupTimer(j, (i & 2) != 0 ? j : j2, function0);
    }

    private final void setupTimer(long period, long initialDelay, Function0 onTick) {
        this.startedAt = getCurrentTime();
        getTimer().scheduleAtFixedRate(initialDelay, period, onTick);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanTicker() {
        getTimer().cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetTickerState() {
        this.startedAt = -1L;
        this.interruptedAt = -1L;
        this.workTimeFromPrevious = 0L;
    }

    public final void update(long duration, @Nullable Long interval) {
        this.interval = interval;
        this.duration = duration == 0 ? null : Long.valueOf(duration);
    }

    private final long getWorkTime() {
        if (this.startedAt == -1) {
            return 0L;
        }
        return getCurrentTime() - this.startedAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getTotalWorkTime() {
        return getWorkTime() + this.workTimeFromPrevious;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void coercedTick() {
        Long l = this.duration;
        if (l != null) {
            this.onTick.invoke(Long.valueOf(RangesKt.coerceAtMost(getTotalWorkTime(), l.longValue())));
        } else {
            this.onTick.invoke(Long.valueOf(getTotalWorkTime()));
        }
    }

    private final void runTimer() {
        Long l = this.currentInterval;
        Long l2 = this.currentDuration;
        if (l != null && this.interruptedAt != -1 && getCurrentTime() - this.interruptedAt > l.longValue()) {
            coercedTick();
        }
        if (l == null && l2 != null) {
            runCountDownTimer(l2.longValue());
            return;
        }
        if (l != null && l2 != null) {
            runTickTimer(l2.longValue(), l.longValue());
        } else {
            if (l == null || l2 != null) {
                return;
            }
            runEndlessTimer(l.longValue());
        }
    }

    private final void runCountDownTimer(final long duration) {
        long totalWorkTime = duration - getTotalWorkTime();
        if (totalWorkTime >= 0) {
            setupTimer$default(this, totalWorkTime, 0L, new Function0() { // from class: com.yandex.div.core.timer.Ticker$runCountDownTimer$1
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
                    Function1 function1;
                    Ticker.this.cleanTicker();
                    function1 = Ticker.this.onEnd;
                    function1.invoke(Long.valueOf(duration));
                    Ticker.this.state = Ticker.State.STOPPED;
                    Ticker.this.resetTickerState();
                }
            }, 2, null);
        } else {
            this.onEnd.invoke(Long.valueOf(duration));
            resetTickerState();
        }
    }

    private final void runTickTimer(final long duration, final long interval) {
        long totalWorkTime = interval - (getTotalWorkTime() % interval);
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = (duration / interval) - (getTotalWorkTime() / interval);
        final Function0 function0 = new Function0() { // from class: com.yandex.div.core.timer.Ticker$runTickTimer$processTick$1
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
                Function1 function1;
                Function1 function12;
                if (Ref$LongRef.this.element > 0) {
                    function12 = this.onTick;
                    function12.invoke(Long.valueOf(duration));
                }
                function1 = this.onEnd;
                function1.invoke(Long.valueOf(duration));
                this.cleanTicker();
                this.resetTickerState();
                this.state = Ticker.State.STOPPED;
            }
        };
        setupTimer(interval, totalWorkTime, new Function0() { // from class: com.yandex.div.core.timer.Ticker$runTickTimer$1
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
                long totalWorkTime2;
                long j = duration;
                totalWorkTime2 = this.getTotalWorkTime();
                long j2 = j - totalWorkTime2;
                this.coercedTick();
                Ref$LongRef ref$LongRef2 = ref$LongRef;
                ref$LongRef2.element--;
                if (1 > j2 || j2 >= interval) {
                    if (j2 <= 0) {
                        function0.mo4828invoke();
                    }
                } else {
                    this.cleanTicker();
                    Ticker ticker = this;
                    final Function0 function02 = function0;
                    Ticker.setupTimer$default(ticker, j2, 0L, new Function0() { // from class: com.yandex.div.core.timer.Ticker$runTickTimer$1.1
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
                            Function0.this.mo4828invoke();
                        }
                    }, 2, null);
                }
            }
        });
    }

    private final void runEndlessTimer(long interval) {
        setupTimer(interval, interval - (getTotalWorkTime() % interval), new Function0() { // from class: com.yandex.div.core.timer.Ticker$runEndlessTimer$1
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
                Ticker.this.coercedTick();
            }
        });
    }

    private final void onError(String message) {
        ErrorCollector errorCollector = this.errorCollector;
        if (errorCollector != null) {
            errorCollector.logError(new IllegalArgumentException(message));
        }
    }

    public final void saveState() {
        if (this.startedAt != -1) {
            this.workTimeFromPrevious += getCurrentTime() - this.startedAt;
            this.interruptedAt = getCurrentTime();
            this.startedAt = -1L;
        }
        cleanTicker();
    }

    public final void restoreState(boolean fromPreviousPoint) {
        if (!fromPreviousPoint) {
            this.interruptedAt = -1L;
        }
        runTimer();
    }

    public final void start() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i == 1) {
            cleanTicker();
            this.currentDuration = this.duration;
            this.currentInterval = this.interval;
            this.state = State.WORKING;
            this.onStart.invoke(Long.valueOf(getTotalWorkTime()));
            runTimer();
            return;
        }
        if (i == 2) {
            onError("The timer '" + this.name + "' already working!");
            return;
        }
        if (i != 3) {
            return;
        }
        onError("The timer '" + this.name + "' paused!");
    }

    public final void stop() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i == 1) {
            onError("The timer '" + this.name + "' already stopped!");
            return;
        }
        if (i == 2 || i == 3) {
            this.state = State.STOPPED;
            this.onEnd.invoke(Long.valueOf(getTotalWorkTime()));
            cleanTicker();
            resetTickerState();
        }
    }

    public final void pause() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i == 1) {
            onError("The timer '" + this.name + "' already stopped!");
            return;
        }
        if (i == 2) {
            this.state = State.PAUSED;
            this.onInterrupt.invoke(Long.valueOf(getTotalWorkTime()));
            saveState();
            this.startedAt = -1L;
            return;
        }
        if (i != 3) {
            return;
        }
        onError("The timer '" + this.name + "' already paused!");
    }

    public final void resume() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i == 1) {
            onError("The timer '" + this.name + "' is stopped!");
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            this.state = State.WORKING;
            restoreState(false);
            return;
        }
        onError("The timer '" + this.name + "' already working!");
    }

    public final void cancel() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i == 2 || i == 3) {
            this.state = State.STOPPED;
            cleanTicker();
            this.onInterrupt.invoke(Long.valueOf(getTotalWorkTime()));
            resetTickerState();
        }
    }

    public final void reset() {
        cancel();
        start();
    }
}
