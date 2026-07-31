package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.AdsFormat;
import io.bidmachine.ExpirationHandler;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ProtoUtils;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes13.dex */
public abstract class InternalAd implements InternalAdData, ExpirationHandler.Listener {

    @NonNull
    private final Waterfall.Configuration.AdUnit adUnit;

    @NonNull
    private final AdsFormat adsFormat;

    @NonNull
    private final ExpirationHandler expirationHandler;

    @NonNull
    private final InternalAdListener internalAdListener;

    @Nullable
    private InternalAdLoadData internalAdLoadData;

    @NonNull
    private final Tag tag;

    @NonNull
    private final TaskExecutor taskExecutor;

    @Nullable
    private WeakReference<InternalAdPresentListener> weakAdPresentListener;

    @Nullable
    private volatile Status status = Status.Idle;

    @NonNull
    private final Map<String, Object> customParamsMap = new ConcurrentHashMap();

    enum Status {
        Idle,
        Loading,
        Loaded,
        Showing,
        Shown,
        Expired
    }

    @UiThread
    protected abstract void destroyAd() throws Throwable;

    @UiThread
    protected abstract void loadAd(@NonNull Context context, @NonNull InternalLoadListener internalLoadListener) throws Throwable;

    InternalAd(@NonNull NetworkParams networkParams, @NonNull TaskExecutor taskExecutor, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull InternalAdListener internalAdListener) {
        this.tag = new Tag(networkParams.getNetworkName() + "Ad");
        this.taskExecutor = taskExecutor;
        this.adsFormat = adsFormat;
        this.adUnit = adUnit;
        this.internalAdListener = internalAdListener;
        this.expirationHandler = new ExpirationHandler(adUnit.getExpirationTime(), this);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdData
    @NonNull
    public String getAdUnitId() {
        return getAdUnit().getAdUnitId();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdData
    public double getPrice() {
        return getAdUnit().getPrice();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdData
    @NonNull
    public Map<String, Object> getCustomParamsMap() {
        return this.customParamsMap;
    }

    @NonNull
    public AdsFormat getAdsFormat() {
        return this.adsFormat;
    }

    @NonNull
    public Waterfall.Configuration.AdUnit getAdUnit() {
        return this.adUnit;
    }

    @Nullable
    public InternalAdPresentListener getAdPresentListener() {
        WeakReference<InternalAdPresentListener> weakReference = this.weakAdPresentListener;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void setAdPresentListener(@Nullable InternalAdPresentListener internalAdPresentListener) {
        this.weakAdPresentListener = new WeakReference<>(internalAdPresentListener);
    }

    @Nullable
    public InternalAdLoadData getInternalAdLoadData() {
        return this.internalAdLoadData;
    }

    public void setCustomParam(@NonNull String str, @NonNull Object obj) {
        this.customParamsMap.put(str, obj);
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        if (isShown()) {
            return;
        }
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.InternalAd$$ExternalSyntheticLambda5
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$onExpired$0;
                lambda$onExpired$0 = InternalAd.this.lambda$onExpired$0();
                return lambda$onExpired$0;
            }
        });
        this.internalAdListener.onAdExpired(this);
        setStatus(Status.Expired);
        InternalAdPresentListener adPresentListener = getAdPresentListener();
        if (adPresentListener != null) {
            adPresentListener.onAdExpired();
        }
        destroy(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onExpired$0() {
        return String.format("onExpired (%s)", GAMUtils.toString(this.adUnit));
    }

    public void onAdLoaded(@Nullable InternalAdLoadData internalAdLoadData) {
        this.internalAdLoadData = internalAdLoadData;
        final Waterfall.Result.EstimatedPrice price = internalAdLoadData != null ? internalAdLoadData.getPrice() : null;
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.InternalAd$$ExternalSyntheticLambda2
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$onAdLoaded$1;
                lambda$onAdLoaded$1 = InternalAd.this.lambda$onAdLoaded$1(price);
                return lambda$onAdLoaded$1;
            }
        });
        String encodeToString = ProtoUtils.encodeToString(price);
        if (encodeToString != null) {
            setCustomParam("gam_estimated_price", encodeToString);
        }
        setStatus(Status.Loaded);
        this.expirationHandler.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onAdLoaded$1(Waterfall.Result.EstimatedPrice estimatedPrice) {
        return String.format("onAdLoaded (%s, %s)", GAMUtils.toString(this.adUnit), GAMUtils.toString(estimatedPrice));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onAdShown$2() {
        return String.format("onAdShown (%s)", GAMUtils.toString(this.adUnit));
    }

    public void onAdShown() {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.InternalAd$$ExternalSyntheticLambda7
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$onAdShown$2;
                lambda$onAdShown$2 = InternalAd.this.lambda$onAdShown$2();
                return lambda$onAdShown$2;
            }
        });
        this.internalAdListener.onAdShown(this);
        setStatus(Status.Shown);
        this.expirationHandler.stop();
    }

    public void onPaidEvent(@NonNull final Waterfall.Result.EstimatedPrice estimatedPrice) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.InternalAd$$ExternalSyntheticLambda1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$onPaidEvent$3;
                lambda$onPaidEvent$3 = InternalAd.this.lambda$onPaidEvent$3(estimatedPrice);
                return lambda$onPaidEvent$3;
            }
        });
        String encodeToString = ProtoUtils.encodeToString(estimatedPrice);
        if (encodeToString != null) {
            setCustomParam("gam_estimated_price", encodeToString);
        }
        this.internalAdListener.onPaidEvent(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onPaidEvent$3(Waterfall.Result.EstimatedPrice estimatedPrice) {
        return String.format("onPaidEvent (%s, %s)", GAMUtils.toString(this.adUnit), GAMUtils.toString(estimatedPrice));
    }

    public void destroy() {
        destroy(isShown());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$destroy$4() {
        return String.format("destroy (%s)", GAMUtils.toString(this.adUnit));
    }

    @VisibleForTesting
    void destroy(boolean z) {
        try {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.InternalAd$$ExternalSyntheticLambda6
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$destroy$4;
                    lambda$destroy$4 = InternalAd.this.lambda$destroy$4();
                    return lambda$destroy$4;
                }
            });
            WeakReference<InternalAdPresentListener> weakReference = this.weakAdPresentListener;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.weakAdPresentListener = null;
            if (z) {
                release();
            }
            this.internalAdListener.onAdDestroyed(this, z);
        } catch (Throwable th) {
            Logger.w(th);
        }
    }

    protected void onBackground(@NonNull Runnable runnable) {
        this.taskExecutor.execute(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$load$5() {
        return String.format("load (%s)", GAMUtils.toString(this.adUnit));
    }

    final void load(@NonNull Context context, @NonNull final InternalLoadListener internalLoadListener) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.InternalAd$$ExternalSyntheticLambda3
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$load$5;
                lambda$load$5 = InternalAd.this.lambda$load$5();
                return lambda$load$5;
            }
        });
        final Context applicationContext = context.getApplicationContext();
        Utils.onUiThread(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.InternalAd$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                InternalAd.this.lambda$load$6(applicationContext, internalLoadListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$6(Context context, InternalLoadListener internalLoadListener) {
        try {
            setStatus(Status.Loading);
            loadAd(context, internalLoadListener);
        } catch (Throwable th) {
            Logger.w(th);
            internalLoadListener.onAdLoadFailed(this, BMError.throwable("Exception loading InternalAd object", th));
        }
    }

    @VisibleForTesting
    void release() {
        this.expirationHandler.stop();
        Utils.onUiThread(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.InternalAd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                InternalAd.this.lambda$release$7();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$7() {
        try {
            destroyAd();
        } catch (Throwable th) {
            Logger.w(th);
        }
    }

    void setStatus(@NonNull Status status) {
        this.status = status;
    }

    boolean isLoaded() {
        return this.status == Status.Loaded;
    }

    boolean isShown() {
        Status status = this.status;
        return status != null && status.ordinal() >= Status.Shown.ordinal();
    }

    boolean isExpired() {
        return this.status == Status.Expired;
    }

    @NonNull
    public String toString() {
        return this.tag + ", " + GAMUtils.toString(this.adUnit);
    }
}
