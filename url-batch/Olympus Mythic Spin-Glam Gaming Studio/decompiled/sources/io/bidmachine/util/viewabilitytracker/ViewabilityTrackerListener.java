package io.bidmachine.util.viewabilitytracker;

import io.bidmachine.util.Error;
import io.bidmachine.util.viewabilitytracker.model.ActionEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewabilityTrackerListener.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/util/viewabilitytracker/ViewabilityTrackerListener;", "", "onVerifyingFailed", "", "actionEvent", "Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;", "error", "Lio/bidmachine/util/Error;", "onVerifyingSuccess", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public interface ViewabilityTrackerListener {
    void onVerifyingFailed(@NotNull ActionEvent actionEvent, @NotNull Error error);

    void onVerifyingSuccess(@NotNull ActionEvent actionEvent);
}
