package io.bidmachine.unified;

import com.ironsource.Zf;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.util.SystemComponent;
import io.bidmachine.util.viewabilitytracker.model.ActionEvent;
import io.bidmachine.utils.BMError;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0014\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\tH&J\u001e\u0010\u0010\u001a\u00020\u00032\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lio/bidmachine/unified/UnifiedAdCallback;", "", Zf.f, "", "systemComponent", "Lio/bidmachine/util/SystemComponent;", "onAdExpired", Zf.b, "error", "Lio/bidmachine/utils/BMError;", Zf.e, "onAdShown", "onAdViewabilityEvent", "actionEvent", "Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;", "bmError", "onBrokenCreativeEvent", "params", "", "", "setVisibilitySource", "visibilitySource", "Lio/bidmachine/core/VisibilitySource;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public interface UnifiedAdCallback {
    static /* synthetic */ void onAdClicked$default(UnifiedAdCallback unifiedAdCallback, SystemComponent systemComponent, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAdClicked");
        }
        if ((i & 1) != 0) {
            systemComponent = null;
        }
        unifiedAdCallback.onAdClicked(systemComponent);
    }

    default void onAdClicked() {
        onAdClicked(null);
    }

    void onAdClicked(@Nullable SystemComponent systemComponent);

    void onAdExpired();

    void onAdLoadFailed(@NotNull BMError error);

    void onAdShowFailed(@NotNull BMError error);

    void onAdShown();

    void onAdViewabilityEvent(@NotNull ActionEvent actionEvent, @Nullable BMError bmError);

    void onBrokenCreativeEvent(@Nullable Map<String, ? extends Object> params);

    void setVisibilitySource(@NotNull VisibilitySource visibilitySource);
}
