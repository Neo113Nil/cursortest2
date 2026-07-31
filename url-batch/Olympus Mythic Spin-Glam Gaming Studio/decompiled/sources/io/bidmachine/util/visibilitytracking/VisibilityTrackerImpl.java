package io.bidmachine.util.visibilitytracking;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C4643f8;
import io.bidmachine.util.ViewUtilsKt;
import io.bidmachine.util.log.LoggerInstance;
import io.bidmachine.util.log.TagLogger;
import io.bidmachine.util.viewabilitytracker.metric.Metric;
import io.bidmachine.util.viewabilitytracker.metric.ViewabilityGeometryMetric;
import io.bidmachine.util.viewabilitytracker.metric.ViewabilityLifecycleMetric;
import io.bidmachine.util.viewabilitytracker.metric.ViewabilityOverlapMetric;
import io.bidmachine.util.viewabilitytracker.metric.ViewabilityVisibilityMetric;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: VisibilityTrackerImpl.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 ,2\u00020\u0001:\u0002,-B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0018H\u0002J\b\u0010\"\u001a\u00020#H\u0016J\n\u0010$\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010%\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020#H\u0002J\b\u0010'\u001a\u00020#H\u0002J\b\u0010(\u001a\u00020#H\u0002J\u0010\u0010)\u001a\u00020#2\u0006\u0010!\u001a\u00020\u0018H\u0016J\b\u0010*\u001a\u00020#H\u0016J\b\u0010+\u001a\u00020#H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lio/bidmachine/util/visibilitytracking/VisibilityTrackerImpl;", "Lio/bidmachine/util/visibilitytracking/VisibilityTracker;", C4643f8.s, "Lio/bidmachine/util/visibilitytracking/VisibilityParams;", "visibilityTrackerListener", "Lio/bidmachine/util/visibilitytracking/VisibilityTrackerListener;", "(Lio/bidmachine/util/visibilitytracking/VisibilityParams;Lio/bidmachine/util/visibilitytracking/VisibilityTrackerListener;)V", "isCheckerScheduled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isStarted", "isViewOnScreen", "lock", "", "logger", "Lio/bidmachine/util/log/TagLogger;", "metricList", "", "Lio/bidmachine/util/viewabilitytracker/metric/Metric;", "onPreDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "weakView", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "getWeakView$annotations", "()V", "getWeakView", "()Ljava/lang/ref/WeakReference;", "setWeakView", "(Ljava/lang/ref/WeakReference;)V", "check", "", "view", "destroy", "", "getView", "isOnScreen", "notifyViewOnScreen", "notifyViewOutOfScreen", "processOnPreDraw", "start", "stop", "stopCheck", "Companion", "ViewPreDrawListener", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class VisibilityTrackerImpl implements VisibilityTracker {
    private static final long CHECK_DELAY = 100;

    @NotNull
    private final AtomicBoolean isCheckerScheduled;

    @NotNull
    private final AtomicBoolean isStarted;

    @NotNull
    private final AtomicBoolean isViewOnScreen;

    @NotNull
    private final Object lock;

    @NotNull
    private final TagLogger logger;

    @NotNull
    private final Collection<Metric> metricList;

    @NotNull
    private final ViewTreeObserver.OnPreDrawListener onPreDrawListener;

    @NotNull
    private final CoroutineScope uiScope;

    @NotNull
    private final VisibilityTrackerListener visibilityTrackerListener;

    @Nullable
    private WeakReference<View> weakView;

    @VisibleForTesting
    public static /* synthetic */ void getWeakView$annotations() {
    }

    public VisibilityTrackerImpl(@NotNull VisibilityParams visibilityParams, @NotNull VisibilityTrackerListener visibilityTrackerListener) {
        Intrinsics.checkNotNullParameter(visibilityParams, "visibilityParams");
        Intrinsics.checkNotNullParameter(visibilityTrackerListener, "visibilityTrackerListener");
        this.visibilityTrackerListener = visibilityTrackerListener;
        this.logger = new TagLogger("VisibilityTracker", null, 2, null);
        this.lock = new Object();
        this.onPreDrawListener = new ViewPreDrawListener();
        this.isStarted = new AtomicBoolean(false);
        this.isCheckerScheduled = new AtomicBoolean(false);
        this.isViewOnScreen = new AtomicBoolean(false);
        this.uiScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate()));
        ArrayList arrayList = new ArrayList();
        Float valueOf = Float.valueOf(1.0f);
        arrayList.add(new ViewabilityGeometryMetric(true, valueOf, valueOf, valueOf));
        if (!visibilityParams.getIsIgnoreWindowFocus()) {
            arrayList.add(new ViewabilityLifecycleMetric(CollectionsKt.listOf(ViewabilityLifecycleMetric.State.HAS_WINDOW_FOCUS)));
        }
        arrayList.add(new ViewabilityVisibilityMetric(ViewabilityVisibilityMetric.Scope.PARENT_VIEW, visibilityParams.getMinVisiblePercentage()));
        if (!visibilityParams.getIsIgnoreOverlap()) {
            arrayList.add(new ViewabilityOverlapMetric(ViewabilityOverlapMetric.Scope.VIEW_SIBLINGS, visibilityParams.getMinVisiblePercentage()));
        }
        this.metricList = arrayList;
    }

    @Nullable
    public final WeakReference<View> getWeakView() {
        return this.weakView;
    }

    public final void setWeakView(@Nullable WeakReference<View> weakReference) {
        this.weakView = weakReference;
    }

    @Override // io.bidmachine.util.visibilitytracking.VisibilityTracker
    public boolean isOnScreen() {
        return this.isViewOnScreen.get();
    }

    @Override // io.bidmachine.util.visibilitytracking.VisibilityTracker
    public void start(@NotNull final View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.isStarted.compareAndSet(false, true)) {
            synchronized (this.lock) {
                LoggerInstance.d$default(this.logger, null, new Function0() { // from class: io.bidmachine.util.visibilitytracking.VisibilityTrackerImpl$start$1$1
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

    @Override // io.bidmachine.util.visibilitytracking.VisibilityTracker
    public void stop() {
        synchronized (this.lock) {
            try {
                this.isStarted.set(false);
                final View view = getView();
                if (view != null) {
                    LoggerInstance.d$default(this.logger, null, new Function0() { // from class: io.bidmachine.util.visibilitytracking.VisibilityTrackerImpl$stop$1$1
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
                stopCheck();
                this.isCheckerScheduled.set(false);
                this.isViewOnScreen.set(false);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.bidmachine.util.visibilitytracking.VisibilityTracker
    public void destroy() {
        stop();
        WeakReference<View> weakReference = this.weakView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.weakView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getView() {
        WeakReference<View> weakReference = this.weakView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean check(View view) {
        Iterator<T> it = this.metricList.iterator();
        while (it.hasNext()) {
            if (!((Metric) it.next()).check(view)) {
                return false;
            }
            Unit unit = Unit.INSTANCE;
        }
        return true;
    }

    private final void stopCheck() {
        JobKt__JobKt.cancelChildren$default(this.uiScope.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processOnPreDraw() {
        View view = getView();
        if (view != null) {
            ViewUtilsKt.removeOnPreDrawListenerSafely(view, this.onPreDrawListener);
        }
        if (!this.isStarted.get() || this.isCheckerScheduled.compareAndSet(false, true)) {
            stopCheck();
            BuildersKt__Builders_commonKt.launch$default(this.uiScope, Dispatchers.getMain().getImmediate(), null, new VisibilityTrackerImpl$processOnPreDraw$1(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyViewOnScreen() {
        if (this.isViewOnScreen.compareAndSet(false, true)) {
            this.visibilityTrackerListener.onViewOnScreen();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyViewOutOfScreen() {
        if (this.isViewOnScreen.compareAndSet(true, false)) {
            this.visibilityTrackerListener.onViewOutOfScreen();
        }
    }

    /* compiled from: VisibilityTrackerImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lio/bidmachine/util/visibilitytracking/VisibilityTrackerImpl$ViewPreDrawListener;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "(Lio/bidmachine/util/visibilitytracking/VisibilityTrackerImpl;)V", "onPreDraw", "", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private final class ViewPreDrawListener implements ViewTreeObserver.OnPreDrawListener {
        public ViewPreDrawListener() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            VisibilityTrackerImpl.this.processOnPreDraw();
            return true;
        }
    }
}
