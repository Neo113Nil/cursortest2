package io.bidmachine;

import io.bidmachine.core.VisibilitySource;
import io.bidmachine.util.SystemComponent;
import io.bidmachine.util.viewabilitytracker.model.ActionEvent;
import io.bidmachine.utils.BMError;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001fH\u0016¨\u0006 "}, d2 = {"Lio/bidmachine/SimpleAdProcessCallback;", "Lio/bidmachine/AdProcessCallback;", "()V", "onBrokenCreativeEvent", "", "params", "", "", "", "onNetworkViewabilityEvent", "actionEvent", "Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;", "bmError", "Lio/bidmachine/utils/BMError;", "onVisibilityTrackerViewabilityEvent", "processClickVerified", "systemComponent", "Lio/bidmachine/util/SystemComponent;", "processClicked", "processClosed", "processDestroy", "processExpired", "processFillAd", "processFinished", "processLoadFail", "processLoadSuccess", "processShowFail", "processShown", "processVisibilityTrackerShown", "setVisibilitySource", "visibilitySource", "Lio/bidmachine/core/VisibilitySource;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public class SimpleAdProcessCallback implements AdProcessCallback {
    @Override // io.bidmachine.AdProcessCallback
    public void onBrokenCreativeEvent(@Nullable Map<String, ? extends Object> params) {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void onNetworkViewabilityEvent(@NotNull ActionEvent actionEvent, @Nullable BMError bmError) {
        Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
    }

    @Override // io.bidmachine.AdProcessCallback
    public void onVisibilityTrackerViewabilityEvent(@NotNull ActionEvent actionEvent, @Nullable BMError bmError) {
        Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processClickVerified(@Nullable SystemComponent systemComponent) {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processClicked(@Nullable SystemComponent systemComponent) {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processClosed() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processDestroy() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processExpired() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processFillAd() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processFinished() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processLoadFail(@NotNull BMError bmError) {
        Intrinsics.checkNotNullParameter(bmError, "bmError");
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processLoadSuccess() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processShowFail(@NotNull BMError bmError) {
        Intrinsics.checkNotNullParameter(bmError, "bmError");
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processShown() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processVisibilityTrackerShown() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void setVisibilitySource(@NotNull VisibilitySource visibilitySource) {
        Intrinsics.checkNotNullParameter(visibilitySource, "visibilitySource");
    }
}
