package io.bidmachine.util.viewabilityhandler;

import com.ironsource.X3;
import io.bidmachine.util.Error;
import io.bidmachine.util.viewabilitytracker.model.ActionEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewabilityHandlerListener.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/util/viewabilityhandler/ViewabilityHandlerListener;", "", "onViewabilityChanged", "", X3.i.o, "", "onViewabilityError", "actionEvent", "Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;", "error", "Lio/bidmachine/util/Error;", "onViewabilityEvent", "onViewabilityTracked", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public interface ViewabilityHandlerListener {
    void onViewabilityChanged(boolean isViewable);

    void onViewabilityError(@NotNull ActionEvent actionEvent, @NotNull Error error);

    void onViewabilityEvent(@NotNull ActionEvent actionEvent);

    void onViewabilityTracked();
}
