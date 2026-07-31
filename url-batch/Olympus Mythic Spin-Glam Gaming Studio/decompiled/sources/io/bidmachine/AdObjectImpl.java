package io.bidmachine;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdRequest;
import io.bidmachine.core.Logger;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.models.AdObject;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedAd;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.util.Error;
import io.bidmachine.util.viewabilityhandler.ViewabilityHandler;
import io.bidmachine.util.viewabilityhandler.ViewabilityHandlerListener;
import io.bidmachine.util.viewabilitytracker.model.ActionEvent;
import io.bidmachine.util.visibilitytracking.VisibilityParams;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class AdObjectImpl<AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, AdObjectParamsType extends AdObjectParams, UnifiedAdType extends UnifiedAd<UnifiedAdCallbackType, UnifiedAdRequestParamsType>, UnifiedAdCallbackType extends UnifiedAdCallback, UnifiedAdRequestParamsType extends UnifiedAdRequestParams> implements AdObject<AdObjectParamsType, UnifiedAdRequestParamsType, UnifiedAdCallbackType> {

    @NonNull
    private final AdObjectParamsType adObjectParams;

    @NonNull
    private final AdProcessCallback adProcessCallback;

    @NonNull
    private final AdRequestType adRequest;

    @NonNull
    private final ContextProvider contextProvider;

    @NonNull
    private final UnifiedAdType unifiedAd;

    @NonNull
    private final UnifiedAdCallbackType unifiedAdCallback;

    @NonNull
    private final ViewabilityHandler viewabilityHandler;

    final class a implements ViewabilityHandlerListener {
        a() {
        }

        @Override // io.bidmachine.util.viewabilityhandler.ViewabilityHandlerListener
        public void onViewabilityChanged(boolean z) {
            AdObjectImpl.this.getUnifiedAd().onViewabilityChanged(z);
        }

        @Override // io.bidmachine.util.viewabilityhandler.ViewabilityHandlerListener
        public void onViewabilityError(ActionEvent actionEvent, Error error) {
            AdObjectImpl.this.getAdProcessCallback().onVisibilityTrackerViewabilityEvent(actionEvent, new BMError(108, error.getMessage()));
        }

        @Override // io.bidmachine.util.viewabilityhandler.ViewabilityHandlerListener
        public void onViewabilityEvent(ActionEvent actionEvent) {
            AdObjectImpl.this.getAdProcessCallback().onVisibilityTrackerViewabilityEvent(actionEvent, null);
        }

        @Override // io.bidmachine.util.viewabilityhandler.ViewabilityHandlerListener
        public void onViewabilityTracked() {
        }
    }

    public AdObjectImpl(@NonNull ContextProvider contextProvider, @NonNull AdProcessCallback adProcessCallback, @NonNull AdRequestType adrequesttype, @NonNull AdObjectParamsType adobjectparamstype, @NonNull UnifiedAdType unifiedadtype) {
        this.contextProvider = contextProvider;
        this.adProcessCallback = adProcessCallback;
        this.adRequest = adrequesttype;
        this.adObjectParams = adobjectparamstype;
        this.unifiedAd = unifiedadtype;
        this.unifiedAdCallback = createUnifiedCallback(adProcessCallback);
        this.viewabilityHandler = new ViewabilityHandler(adobjectparamstype.viewabilityTrackerParams, VisibilityParams.INSTANCE.getDefault(), new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$startViewabilityTracker$0(AdResponse adResponse) {
        return String.format("Can't start viewability tracker! Check ad settings! (%s)", adResponse);
    }

    @Nullable
    public Activity getActivity() {
        return this.contextProvider.getActivity();
    }

    @NonNull
    public AdProcessCallback getAdProcessCallback() {
        return this.adProcessCallback;
    }

    @NonNull
    public AdRequestType getAdRequest() {
        return this.adRequest;
    }

    @NonNull
    public Context getApplicationContext() {
        return this.contextProvider.getApplicationContext();
    }

    @Override // io.bidmachine.models.AdObject
    @Nullable
    public Map<String, Object> getCustomParams() {
        return getUnifiedAd().getCustomParams();
    }

    @Override // io.bidmachine.models.AdObject
    @NonNull
    public AdObjectParamsType getParams() {
        return this.adObjectParams;
    }

    @NonNull
    public UnifiedAdType getUnifiedAd() {
        return this.unifiedAd;
    }

    @NonNull
    public UnifiedAdCallbackType getUnifiedAdCallback() {
        return this.unifiedAdCallback;
    }

    @Override // io.bidmachine.models.AdObject
    public void hide() {
    }

    @Override // io.bidmachine.models.AdObject
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        this.unifiedAd.load(contextProvider, this.unifiedAdCallback, unifiedadrequestparamstype, this.adObjectParams.getMediationParams(), networkAdUnit);
    }

    @Override // io.bidmachine.models.AdObject
    @Nullable
    @CallSuper
    public Boolean onClicked() {
        getUnifiedAd().onClicked();
        return null;
    }

    @Override // io.bidmachine.models.AdObject
    @CallSuper
    public void onClosed(boolean z) {
        UnifiedAdType unifiedAd = getUnifiedAd();
        if (unifiedAd instanceof UnifiedFullscreenAd) {
            ((UnifiedFullscreenAd) unifiedAd).onClosed(z);
        }
    }

    @Override // io.bidmachine.models.AdObject
    @CallSuper
    public void onDestroy() {
        getUnifiedAd().onDestroy();
        this.viewabilityHandler.destroy();
    }

    @Override // io.bidmachine.models.AdObject
    public void onExpired() {
        getUnifiedAd().onExpired();
    }

    @Override // io.bidmachine.models.AdObject
    @CallSuper
    public void onFinished() {
        UnifiedAdType unifiedAd = getUnifiedAd();
        if (unifiedAd instanceof UnifiedFullscreenAd) {
            ((UnifiedFullscreenAd) unifiedAd).onFinished();
        }
    }

    @Override // io.bidmachine.models.AdObject
    @CallSuper
    public void onShowFailed() {
        getUnifiedAd().onShowFailed();
    }

    @Override // io.bidmachine.models.AdObject
    @CallSuper
    public void onShown() {
        getUnifiedAd().onShown();
    }

    public void startViewabilityTracker(@NonNull View view) {
        final AdResponse adResponse = getAdRequest().getAdResponse();
        VisibilitySource visibilitySource = adResponse != null ? adResponse.getVisibilitySource() : null;
        if (visibilitySource == VisibilitySource.BidMachine || visibilitySource == VisibilitySource.All) {
            this.viewabilityHandler.start(view);
            if (this.adObjectParams.viewabilityTrackerParams == null) {
                Logger.e(this.adRequest.getAdsType(), (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdObjectImpl$$ExternalSyntheticLambda0
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String lambda$startViewabilityTracker$0;
                        lambda$startViewabilityTracker$0 = AdObjectImpl.lambda$startViewabilityTracker$0(AdResponse.this);
                        return lambda$startViewabilityTracker$0;
                    }
                });
            }
        }
    }

    public void stopViewabilityTracker() {
        this.viewabilityHandler.stop();
    }
}
