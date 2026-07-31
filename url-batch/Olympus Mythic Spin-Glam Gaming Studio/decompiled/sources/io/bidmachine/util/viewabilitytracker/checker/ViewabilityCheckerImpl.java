package io.bidmachine.util.viewabilitytracker.checker;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.yandex.div.core.timer.TimerController;
import io.bidmachine.util.Error;
import io.bidmachine.util.log.LoggerInstance;
import io.bidmachine.util.log.TagLogger;
import io.bidmachine.util.viewabilitytracker.metric.Metric;
import io.bidmachine.util.viewabilitytracker.model.ViewabilityRule;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewabilityCheckerImpl.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0019H\u0007J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0019H\u0007J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0007J\b\u0010#\u001a\u00020\u001eH\u0007J\b\u0010$\u001a\u00020\u001eH\u0007J\b\u0010%\u001a\u00020\u001eH\u0007J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020(H\u0007J\u0018\u0010)\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020(H\u0007J\b\u0010+\u001a\u00020\u001eH\u0016J\b\u0010,\u001a\u00020\u001eH\u0007R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lio/bidmachine/util/viewabilitytracker/checker/ViewabilityCheckerImpl;", "Lio/bidmachine/util/viewabilitytracker/checker/ViewabilityChecker;", "viewabilityRule", "Lio/bidmachine/util/viewabilitytracker/model/ViewabilityRule;", "viewabilityCheckerListener", "Lio/bidmachine/util/viewabilitytracker/checker/ViewabilityCheckerListener;", "(Lio/bidmachine/util/viewabilitytracker/model/ViewabilityRule;Lio/bidmachine/util/viewabilitytracker/checker/ViewabilityCheckerListener;)V", "checkCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "getCheckCount$annotations", "()V", "getCheckCount", "()Ljava/util/concurrent/atomic/AtomicInteger;", "isStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isStarted$annotations", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "lock", "", "logger", "Lio/bidmachine/util/log/TagLogger;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "weakView", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "check", "", "view", "destroy", "", "getView", "notifyCheckFailed", "error", "Lio/bidmachine/util/Error;", "notifyCheckSuccessful", "processCheckFail", TimerController.RESET_COMMAND, "scheduleCheck", "delayMs", "", "start", "startCheck", "stop", "stopCheck", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class ViewabilityCheckerImpl implements ViewabilityChecker {

    @NotNull
    private final AtomicInteger checkCount;

    @NotNull
    private final AtomicBoolean isStarted;

    @NotNull
    private final Object lock;

    @NotNull
    private final TagLogger logger;

    @NotNull
    private final CoroutineScope uiScope;

    @NotNull
    private final ViewabilityCheckerListener viewabilityCheckerListener;

    @NotNull
    private final ViewabilityRule viewabilityRule;

    @Nullable
    private WeakReference<View> weakView;

    @VisibleForTesting
    public static /* synthetic */ void getCheckCount$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void isStarted$annotations() {
    }

    public ViewabilityCheckerImpl(@NotNull ViewabilityRule viewabilityRule, @NotNull ViewabilityCheckerListener viewabilityCheckerListener) {
        Intrinsics.checkNotNullParameter(viewabilityRule, "viewabilityRule");
        Intrinsics.checkNotNullParameter(viewabilityCheckerListener, "viewabilityCheckerListener");
        this.viewabilityRule = viewabilityRule;
        this.viewabilityCheckerListener = viewabilityCheckerListener;
        this.logger = new TagLogger("ViewabilityChecker", null, 2, null);
        this.lock = new Object();
        this.isStarted = new AtomicBoolean(false);
        this.checkCount = new AtomicInteger(0);
        this.uiScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate()));
    }

    @NotNull
    /* renamed from: isStarted, reason: from getter */
    public final AtomicBoolean getIsStarted() {
        return this.isStarted;
    }

    @NotNull
    public final AtomicInteger getCheckCount() {
        return this.checkCount;
    }

    @Override // io.bidmachine.util.viewabilitytracker.checker.ViewabilityChecker
    public void start(@NotNull final View view, long delayMs) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.isStarted.compareAndSet(false, true)) {
            synchronized (this.lock) {
                LoggerInstance.d$default(this.logger, null, new Function0() { // from class: io.bidmachine.util.viewabilitytracker.checker.ViewabilityCheckerImpl$start$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final String mo4828invoke() {
                        return "Start tracking - " + view;
                    }
                }, 1, null);
                this.weakView = new WeakReference<>(view);
                startCheck(delayMs);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // io.bidmachine.util.viewabilitytracker.checker.ViewabilityChecker
    public void stop() {
        synchronized (this.lock) {
            try {
                this.isStarted.set(false);
                final View view = getView();
                if (view != null) {
                    LoggerInstance.d$default(this.logger, null, new Function0() { // from class: io.bidmachine.util.viewabilitytracker.checker.ViewabilityCheckerImpl$stop$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* renamed from: invoke */
                        public final String mo4828invoke() {
                            return "Stop tracking - " + view;
                        }
                    }, 1, null);
                }
                stopCheck();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.bidmachine.util.viewabilitytracker.checker.ViewabilityChecker
    public void destroy() {
        stop();
        WeakReference<View> weakReference = this.weakView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.weakView = null;
    }

    @VisibleForTesting
    @Nullable
    public final View getView() {
        WeakReference<View> weakReference = this.weakView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @VisibleForTesting
    public final boolean check(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Iterator<T> it = this.viewabilityRule.getMetrics().iterator();
        while (it.hasNext()) {
            if (!((Metric) it.next()).check(view)) {
                return false;
            }
            Unit unit = Unit.INSTANCE;
        }
        return true;
    }

    @VisibleForTesting
    public final void startCheck(long delayMs) {
        reset();
        scheduleCheck(delayMs);
    }

    @VisibleForTesting
    public final void stopCheck() {
        JobKt__JobKt.cancelChildren$default(this.uiScope.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    @VisibleForTesting
    public final void scheduleCheck(long delayMs) {
        stopCheck();
        BuildersKt__Builders_commonKt.launch$default(this.uiScope, Dispatchers.getMain().getImmediate(), null, new ViewabilityCheckerImpl$scheduleCheck$1(delayMs, this, null), 2, null);
    }

    @VisibleForTesting
    public final void processCheckFail() {
        Long failureTimeoutMs = this.viewabilityRule.getViewabilityMeasurement().getFailureTimeoutMs();
        if (failureTimeoutMs != null && failureTimeoutMs.longValue() > 0) {
            startCheck(failureTimeoutMs.longValue());
            return;
        }
        Error error = new Error("Can't restart check - failureTimeoutMs must be greater than 0");
        LoggerInstance.e$default(this.logger, (Object) null, error, 1, (Object) null);
        notifyCheckFailed(error);
    }

    @VisibleForTesting
    public final void notifyCheckSuccessful() {
        this.viewabilityCheckerListener.onCheckPassed(this, this.viewabilityRule.getActionEvent());
    }

    @VisibleForTesting
    public final void notifyCheckFailed(@NotNull Error error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.viewabilityCheckerListener.onCheckFailed(this, this.viewabilityRule.getActionEvent(), error);
    }

    @VisibleForTesting
    public final void reset() {
        this.checkCount.set(0);
    }
}
