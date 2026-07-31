package io.bidmachine.util.viewabilityhandler;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C4643f8;
import com.ironsource.X3;
import io.bidmachine.util.Error;
import io.bidmachine.util.viewabilitytracker.ViewabilityTracker;
import io.bidmachine.util.viewabilitytracker.ViewabilityTrackerImpl;
import io.bidmachine.util.viewabilitytracker.ViewabilityTrackerListener;
import io.bidmachine.util.viewabilitytracker.model.ActionEvent;
import io.bidmachine.util.viewabilitytracker.model.ViewabilityTrackerParams;
import io.bidmachine.util.visibilitytracking.VisibilityParams;
import io.bidmachine.util.visibilitytracking.VisibilityTracker;
import io.bidmachine.util.visibilitytracking.VisibilityTrackerImpl;
import io.bidmachine.util.visibilitytracking.VisibilityTrackerListener;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewabilityHandler.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002!\"B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\t\u001a\u00020\u0012J\u0006\u0010\u000b\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0012H\u0007J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u0010\u001a\u001a\u00020\u0011H\u0007J\b\u0010\u001b\u001a\u00020\u0011H\u0007J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u000e\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lio/bidmachine/util/viewabilityhandler/ViewabilityHandler;", "", "viewabilityTrackerParams", "Lio/bidmachine/util/viewabilitytracker/model/ViewabilityTrackerParams;", C4643f8.s, "Lio/bidmachine/util/visibilitytracking/VisibilityParams;", "viewabilityHandlerListener", "Lio/bidmachine/util/viewabilityhandler/ViewabilityHandlerListener;", "(Lio/bidmachine/util/viewabilitytracker/model/ViewabilityTrackerParams;Lio/bidmachine/util/visibilitytracking/VisibilityParams;Lio/bidmachine/util/viewabilityhandler/ViewabilityHandlerListener;)V", "isViewabilityTracked", "Ljava/util/concurrent/atomic/AtomicBoolean;", X3.i.o, "viewabilityTracker", "Lio/bidmachine/util/viewabilitytracker/ViewabilityTracker;", "visibilityTracker", "Lio/bidmachine/util/visibilitytracking/VisibilityTracker;", "destroy", "", "", "notifyOnVerifyingFailed", "actionEvent", "Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;", "error", "Lio/bidmachine/util/Error;", "notifyOnViewabilityChanged", "notifyOnViewabilityEvent", "notifyOnViewabilityTracked", "processOnViewOnScreen", "processOnViewabilityEvent", "start", "view", "Landroid/view/View;", "stop", "ViewabilityListener", "VisibilityListener", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class ViewabilityHandler {

    @NotNull
    private final AtomicBoolean isViewabilityTracked;

    @NotNull
    private final AtomicBoolean isViewable;

    @NotNull
    private final ViewabilityHandlerListener viewabilityHandlerListener;

    @Nullable
    private final ViewabilityTracker viewabilityTracker;

    @NotNull
    private final VisibilityTracker visibilityTracker;

    public ViewabilityHandler(@Nullable ViewabilityTrackerParams viewabilityTrackerParams, @NotNull VisibilityParams visibilityParams, @NotNull ViewabilityHandlerListener viewabilityHandlerListener) {
        Intrinsics.checkNotNullParameter(visibilityParams, "visibilityParams");
        Intrinsics.checkNotNullParameter(viewabilityHandlerListener, "viewabilityHandlerListener");
        this.viewabilityHandlerListener = viewabilityHandlerListener;
        this.viewabilityTracker = viewabilityTrackerParams != null ? new ViewabilityTrackerImpl(viewabilityTrackerParams, new ViewabilityListener()) : null;
        this.visibilityTracker = new VisibilityTrackerImpl(visibilityParams, new VisibilityListener());
        this.isViewabilityTracked = new AtomicBoolean(false);
        this.isViewable = new AtomicBoolean(false);
    }

    public final boolean isViewabilityTracked() {
        return this.isViewabilityTracked.get();
    }

    public final boolean isViewable() {
        return this.isViewable.get();
    }

    public final void start(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewabilityTracker viewabilityTracker = this.viewabilityTracker;
        if (viewabilityTracker != null) {
            viewabilityTracker.start(view);
        }
        this.visibilityTracker.start(view);
    }

    public final void stop() {
        ViewabilityTracker viewabilityTracker = this.viewabilityTracker;
        if (viewabilityTracker != null) {
            viewabilityTracker.stop();
        }
        this.visibilityTracker.stop();
        this.isViewable.set(false);
    }

    public final void destroy() {
        ViewabilityTracker viewabilityTracker = this.viewabilityTracker;
        if (viewabilityTracker != null) {
            viewabilityTracker.destroy();
        }
        this.visibilityTracker.destroy();
    }

    @VisibleForTesting
    public final void processOnViewabilityEvent(@NotNull ActionEvent actionEvent) {
        Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
        notifyOnViewabilityEvent(actionEvent);
        if (actionEvent.getIsBillable()) {
            notifyOnViewabilityTracked();
            notifyOnViewabilityChanged(true);
        }
    }

    @VisibleForTesting
    public final void processOnViewOnScreen() {
        if (this.viewabilityTracker == null) {
            notifyOnViewabilityTracked();
        }
        notifyOnViewabilityChanged(true);
    }

    @VisibleForTesting
    public final void notifyOnViewabilityTracked() {
        if (this.isViewabilityTracked.compareAndSet(false, true)) {
            this.viewabilityHandlerListener.onViewabilityTracked();
        }
    }

    @VisibleForTesting
    public final void notifyOnViewabilityEvent(@NotNull ActionEvent actionEvent) {
        Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
        this.viewabilityHandlerListener.onViewabilityEvent(actionEvent);
    }

    @VisibleForTesting
    public final void notifyOnViewabilityChanged(boolean isViewable) {
        if (this.isViewabilityTracked.get() && this.isViewable.compareAndSet(!isViewable, isViewable)) {
            this.viewabilityHandlerListener.onViewabilityChanged(isViewable);
        }
    }

    public final void notifyOnVerifyingFailed(@NotNull ActionEvent actionEvent, @NotNull Error error) {
        Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
        Intrinsics.checkNotNullParameter(error, "error");
        this.viewabilityHandlerListener.onViewabilityError(actionEvent, error);
    }

    /* compiled from: ViewabilityHandler.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lio/bidmachine/util/viewabilityhandler/ViewabilityHandler$ViewabilityListener;", "Lio/bidmachine/util/viewabilitytracker/ViewabilityTrackerListener;", "(Lio/bidmachine/util/viewabilityhandler/ViewabilityHandler;)V", "onVerifyingFailed", "", "actionEvent", "Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;", "error", "Lio/bidmachine/util/Error;", "onVerifyingSuccess", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @VisibleForTesting
    public final class ViewabilityListener implements ViewabilityTrackerListener {
        public ViewabilityListener() {
        }

        @Override // io.bidmachine.util.viewabilitytracker.ViewabilityTrackerListener
        public void onVerifyingSuccess(@NotNull ActionEvent actionEvent) {
            Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
            ViewabilityHandler.this.processOnViewabilityEvent(actionEvent);
        }

        @Override // io.bidmachine.util.viewabilitytracker.ViewabilityTrackerListener
        public void onVerifyingFailed(@NotNull ActionEvent actionEvent, @NotNull Error error) {
            Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
            Intrinsics.checkNotNullParameter(error, "error");
            ViewabilityHandler.this.notifyOnVerifyingFailed(actionEvent, error);
        }
    }

    /* compiled from: ViewabilityHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lio/bidmachine/util/viewabilityhandler/ViewabilityHandler$VisibilityListener;", "Lio/bidmachine/util/visibilitytracking/VisibilityTrackerListener;", "(Lio/bidmachine/util/viewabilityhandler/ViewabilityHandler;)V", "onViewOnScreen", "", "onViewOutOfScreen", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @VisibleForTesting
    public final class VisibilityListener implements VisibilityTrackerListener {
        public VisibilityListener() {
        }

        @Override // io.bidmachine.util.visibilitytracking.VisibilityTrackerListener
        public void onViewOnScreen() {
            ViewabilityHandler.this.processOnViewOnScreen();
        }

        @Override // io.bidmachine.util.visibilitytracking.VisibilityTrackerListener
        public void onViewOutOfScreen() {
            ViewabilityHandler.this.notifyOnViewabilityChanged(false);
        }
    }
}
