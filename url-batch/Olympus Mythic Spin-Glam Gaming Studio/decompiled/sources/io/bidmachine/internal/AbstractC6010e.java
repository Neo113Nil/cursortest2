package io.bidmachine.internal;

import io.bidmachine.AdProcessCallback;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.util.SystemComponent;
import io.bidmachine.util.viewabilitytracker.model.ActionEvent;
import io.bidmachine.utils.BMError;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.bidmachine.internal.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC6010e implements UnifiedAdCallback {
    private final AdProcessCallback a;

    public AbstractC6010e(AdProcessCallback adProcessCallback) {
        Intrinsics.checkNotNullParameter(adProcessCallback, "adProcessCallback");
        this.a = adProcessCallback;
    }

    public final AdProcessCallback a() {
        return this.a;
    }

    @Override // io.bidmachine.unified.UnifiedAdCallback
    public void onAdClicked(SystemComponent systemComponent) {
        this.a.processClicked(systemComponent);
    }

    @Override // io.bidmachine.unified.UnifiedAdCallback
    public void onAdExpired() {
        this.a.processExpired();
    }

    @Override // io.bidmachine.unified.UnifiedAdCallback
    public void onAdLoadFailed(BMError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.processLoadFail(error);
    }

    @Override // io.bidmachine.unified.UnifiedAdCallback
    public void onAdShowFailed(BMError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.processShowFail(error);
    }

    @Override // io.bidmachine.unified.UnifiedAdCallback
    public void onAdShown() {
        this.a.processShown();
    }

    @Override // io.bidmachine.unified.UnifiedAdCallback
    public void onAdViewabilityEvent(ActionEvent actionEvent, BMError bMError) {
        Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
        this.a.onNetworkViewabilityEvent(actionEvent, bMError);
    }

    @Override // io.bidmachine.unified.UnifiedAdCallback
    public void onBrokenCreativeEvent(Map map) {
        this.a.onBrokenCreativeEvent(map);
    }

    @Override // io.bidmachine.unified.UnifiedAdCallback
    public void setVisibilitySource(VisibilitySource visibilitySource) {
        Intrinsics.checkNotNullParameter(visibilitySource, "visibilitySource");
        this.a.setVisibilitySource(visibilitySource);
    }
}
