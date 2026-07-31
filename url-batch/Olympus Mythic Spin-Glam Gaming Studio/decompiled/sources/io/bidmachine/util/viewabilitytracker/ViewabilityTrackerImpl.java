package io.bidmachine.util.viewabilitytracker;

import android.view.View;
import android.view.ViewTreeObserver;
import io.bidmachine.util.Error;
import io.bidmachine.util.ViewUtilsKt;
import io.bidmachine.util.log.LoggerInstance;
import io.bidmachine.util.log.TagLogger;
import io.bidmachine.util.viewabilitytracker.checker.ViewabilityChecker;
import io.bidmachine.util.viewabilitytracker.checker.ViewabilityCheckerImpl;
import io.bidmachine.util.viewabilitytracker.checker.ViewabilityCheckerListener;
import io.bidmachine.util.viewabilitytracker.model.ActionEvent;
import io.bidmachine.util.viewabilitytracker.model.ViewabilityRule;
import io.bidmachine.util.viewabilitytracker.model.ViewabilityTrackerParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewabilityTrackerImpl.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002+,B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001d\u001a\u00020\bH\u0016J \u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010$\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u0019H\u0016J\b\u0010*\u001a\u00020\u001bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lio/bidmachine/util/viewabilitytracker/ViewabilityTrackerImpl;", "Lio/bidmachine/util/viewabilitytracker/ViewabilityTracker;", "viewabilityTrackerParams", "Lio/bidmachine/util/viewabilitytracker/model/ViewabilityTrackerParams;", "viewabilityTrackerListener", "Lio/bidmachine/util/viewabilitytracker/ViewabilityTrackerListener;", "(Lio/bidmachine/util/viewabilitytracker/model/ViewabilityTrackerParams;Lio/bidmachine/util/viewabilitytracker/ViewabilityTrackerListener;)V", "isBillableCheckPassed", "", "isCheckerStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isStarted", "lock", "", "logger", "Lio/bidmachine/util/log/TagLogger;", "notTrackedCheckerList", "", "Lio/bidmachine/util/viewabilitytracker/checker/ViewabilityChecker;", "onPreDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "viewabilityCheckerList", "", "weakView", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "destroy", "", "getView", "isTracked", "processCheckFailed", "viewabilityChecker", "actionEvent", "Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;", "error", "Lio/bidmachine/util/Error;", "processCheckPassed", "processOnPreDraw", "delayMs", "", "start", "view", "stop", "CheckerListener", "ViewPreDrawListener", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class ViewabilityTrackerImpl implements ViewabilityTracker {
    private volatile boolean isBillableCheckPassed;

    @NotNull
    private final AtomicBoolean isCheckerStarted;

    @NotNull
    private final AtomicBoolean isStarted;

    @NotNull
    private final Object lock;

    @NotNull
    private final TagLogger logger;

    @NotNull
    private final List<ViewabilityChecker> notTrackedCheckerList;

    @NotNull
    private final ViewTreeObserver.OnPreDrawListener onPreDrawListener;

    @NotNull
    private final List<ViewabilityChecker> viewabilityCheckerList;

    @NotNull
    private final ViewabilityTrackerListener viewabilityTrackerListener;

    @Nullable
    private WeakReference<View> weakView;

    public ViewabilityTrackerImpl(@NotNull ViewabilityTrackerParams viewabilityTrackerParams, @NotNull ViewabilityTrackerListener viewabilityTrackerListener) {
        Intrinsics.checkNotNullParameter(viewabilityTrackerParams, "viewabilityTrackerParams");
        Intrinsics.checkNotNullParameter(viewabilityTrackerListener, "viewabilityTrackerListener");
        this.viewabilityTrackerListener = viewabilityTrackerListener;
        this.logger = new TagLogger("ViewabilityTracker", null, 2, null);
        this.lock = new Object();
        List<ViewabilityRule> viewabilityRuleList = viewabilityTrackerParams.getViewabilityRuleList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(viewabilityRuleList, 10));
        Iterator<T> it = viewabilityRuleList.iterator();
        while (it.hasNext()) {
            arrayList.add(new ViewabilityCheckerImpl((ViewabilityRule) it.next(), new CheckerListener()));
        }
        this.viewabilityCheckerList = arrayList;
        this.onPreDrawListener = new ViewPreDrawListener();
        this.isStarted = new AtomicBoolean(false);
        this.isCheckerStarted = new AtomicBoolean(false);
        this.notTrackedCheckerList = new CopyOnWriteArrayList(arrayList);
    }

    @Override // io.bidmachine.util.viewabilitytracker.ViewabilityTracker
    /* renamed from: isTracked, reason: from getter */
    public boolean getIsBillableCheckPassed() {
        return this.isBillableCheckPassed;
    }

    @Override // io.bidmachine.util.viewabilitytracker.ViewabilityTracker
    public void start(@NotNull final View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!this.notTrackedCheckerList.isEmpty() && this.isStarted.compareAndSet(false, true)) {
            synchronized (this.lock) {
                LoggerInstance.d$default(this.logger, null, new Function0() { // from class: io.bidmachine.util.viewabilitytracker.ViewabilityTrackerImpl$start$1$1
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
                ViewUtilsKt.addOnPreDrawListenerSafely(view, this.onPreDrawListener);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // io.bidmachine.util.viewabilitytracker.ViewabilityTracker
    public void stop() {
        synchronized (this.lock) {
            try {
                this.isStarted.set(false);
                final View view = getView();
                if (view != null) {
                    LoggerInstance.d$default(this.logger, null, new Function0() { // from class: io.bidmachine.util.viewabilitytracker.ViewabilityTrackerImpl$stop$1$1
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
                    ViewUtilsKt.removeOnPreDrawListenerSafely(view, this.onPreDrawListener);
                }
                Iterator<T> it = this.viewabilityCheckerList.iterator();
                while (it.hasNext()) {
                    ((ViewabilityChecker) it.next()).stop();
                }
                this.isCheckerStarted.set(false);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.bidmachine.util.viewabilitytracker.ViewabilityTracker
    public void destroy() {
        stop();
        WeakReference<View> weakReference = this.weakView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.weakView = null;
        Iterator<T> it = this.viewabilityCheckerList.iterator();
        while (it.hasNext()) {
            ((ViewabilityChecker) it.next()).destroy();
        }
    }

    private final View getView() {
        WeakReference<View> weakReference = this.weakView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processOnPreDraw(long delayMs) {
        if (this.isCheckerStarted.compareAndSet(false, true)) {
            View view = getView();
            if (view == null) {
                stop();
                return;
            }
            Iterator<T> it = this.notTrackedCheckerList.iterator();
            while (it.hasNext()) {
                ((ViewabilityChecker) it.next()).start(view, delayMs);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processCheckPassed(ViewabilityChecker viewabilityChecker, ActionEvent actionEvent) {
        if (this.notTrackedCheckerList.contains(viewabilityChecker)) {
            if (actionEvent.getIsBillable()) {
                this.isBillableCheckPassed = true;
            }
            this.notTrackedCheckerList.remove(viewabilityChecker);
            this.viewabilityTrackerListener.onVerifyingSuccess(actionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processCheckFailed(ViewabilityChecker viewabilityChecker, ActionEvent actionEvent, Error error) {
        if (this.notTrackedCheckerList.contains(viewabilityChecker)) {
            this.viewabilityTrackerListener.onVerifyingFailed(actionEvent, error);
        }
    }

    /* compiled from: ViewabilityTrackerImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lio/bidmachine/util/viewabilitytracker/ViewabilityTrackerImpl$ViewPreDrawListener;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "(Lio/bidmachine/util/viewabilitytracker/ViewabilityTrackerImpl;)V", "onPreDraw", "", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private final class ViewPreDrawListener implements ViewTreeObserver.OnPreDrawListener {
        public ViewPreDrawListener() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewabilityTrackerImpl.this.processOnPreDraw(0L);
            return true;
        }
    }

    /* compiled from: ViewabilityTrackerImpl.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lio/bidmachine/util/viewabilitytracker/ViewabilityTrackerImpl$CheckerListener;", "Lio/bidmachine/util/viewabilitytracker/checker/ViewabilityCheckerListener;", "(Lio/bidmachine/util/viewabilitytracker/ViewabilityTrackerImpl;)V", "onCheckFailed", "", "viewabilityChecker", "Lio/bidmachine/util/viewabilitytracker/checker/ViewabilityChecker;", "actionEvent", "Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;", "error", "Lio/bidmachine/util/Error;", "onCheckPassed", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private final class CheckerListener implements ViewabilityCheckerListener {
        public CheckerListener() {
        }

        @Override // io.bidmachine.util.viewabilitytracker.checker.ViewabilityCheckerListener
        public void onCheckPassed(@NotNull ViewabilityChecker viewabilityChecker, @NotNull ActionEvent actionEvent) {
            Intrinsics.checkNotNullParameter(viewabilityChecker, "viewabilityChecker");
            Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
            ViewabilityTrackerImpl.this.processCheckPassed(viewabilityChecker, actionEvent);
        }

        @Override // io.bidmachine.util.viewabilitytracker.checker.ViewabilityCheckerListener
        public void onCheckFailed(@NotNull ViewabilityChecker viewabilityChecker, @NotNull ActionEvent actionEvent, @NotNull Error error) {
            Intrinsics.checkNotNullParameter(viewabilityChecker, "viewabilityChecker");
            Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
            Intrinsics.checkNotNullParameter(error, "error");
            ViewabilityTrackerImpl.this.processCheckFailed(viewabilityChecker, actionEvent, error);
        }
    }
}
