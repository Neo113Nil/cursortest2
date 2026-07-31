package io.bidmachine;

import io.bidmachine.core.VisibilitySource;
import io.bidmachine.util.SystemComponent;
import io.bidmachine.util.viewabilitytracker.model.ActionEvent;
import io.bidmachine.utils.BMError;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H&J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/AdProcessCallback;", "", "onBrokenCreativeEvent", "", "params", "", "", "onNetworkViewabilityEvent", "actionEvent", "Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;", "bmError", "Lio/bidmachine/utils/BMError;", "onVisibilityTrackerViewabilityEvent", "processClickVerified", "systemComponent", "Lio/bidmachine/util/SystemComponent;", "processClicked", "processClosed", "processDestroy", "processExpired", "processFillAd", "processFinished", "processLoadFail", "processLoadSuccess", "processShowFail", "processShown", "processVisibilityTrackerShown", "setVisibilitySource", "visibilitySource", "Lio/bidmachine/core/VisibilitySource;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public interface AdProcessCallback {
    void onBrokenCreativeEvent(@Nullable Map<String, ? extends Object> params);

    void onNetworkViewabilityEvent(@NotNull ActionEvent actionEvent, @Nullable BMError bmError);

    void onVisibilityTrackerViewabilityEvent(@NotNull ActionEvent actionEvent, @Nullable BMError bmError);

    void processClickVerified(@Nullable SystemComponent systemComponent);

    void processClicked(@Nullable SystemComponent systemComponent);

    void processClosed();

    void processDestroy();

    void processExpired();

    void processFillAd();

    void processFinished();

    void processLoadFail(@NotNull BMError bmError);

    void processLoadSuccess();

    void processShowFail(@NotNull BMError bmError);

    void processShown();

    void processVisibilityTrackerShown();

    void setVisibilitySource(@NotNull VisibilitySource visibilitySource);
}
