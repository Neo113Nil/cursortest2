package io.bidmachine.ads.networks.gam;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import io.bidmachine.AdsFormat;
import io.bidmachine.ExpirationHandler;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public abstract class InternalGAMAd implements ExpirationHandler.Listener {

    @NonNull
    private final AdsFormat adsFormat;

    @NonNull
    private final ExpirationHandler expirationHandler;

    @NonNull
    private final GAMLoader gamLoader;

    @NonNull
    private final GAMUnitData gamUnitData;

    @Nullable
    private volatile Status status = Status.Idle;

    @NonNull
    private final Tag tag;

    @Nullable
    private WeakReference<InternalGAMAdPresentListener> weakAdPresentListener;

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

    InternalGAMAd(@NonNull GAMLoader gAMLoader, @NonNull AdsFormat adsFormat, @NonNull GAMUnitData gAMUnitData) {
        this.tag = new Tag(gAMLoader.getNetworkName() + "Ad");
        this.gamLoader = gAMLoader;
        this.adsFormat = adsFormat;
        this.gamUnitData = gAMUnitData;
        this.expirationHandler = new ExpirationHandler(gAMLoader.getExpirationTimeMs(), this);
    }

    @NonNull
    public GAMLoader getGamLoader() {
        return this.gamLoader;
    }

    @NonNull
    public AdsFormat getAdsFormat() {
        return this.adsFormat;
    }

    @NonNull
    public GAMUnitData getGamUnitData() {
        return this.gamUnitData;
    }

    @NonNull
    public String getAdUnitId() {
        return getGamUnitData().getAdUnitId();
    }

    public float getScope() {
        return getGamUnitData().getScore();
    }

    @Nullable
    public InternalGAMAdPresentListener getAdPresentListener() {
        WeakReference<InternalGAMAdPresentListener> weakReference = this.weakAdPresentListener;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void setAdPresentListener(@Nullable InternalGAMAdPresentListener internalGAMAdPresentListener) {
        this.weakAdPresentListener = new WeakReference<>(internalGAMAdPresentListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onAdLoaded$0() {
        return String.format("onAdLoaded (%s)", this.gamUnitData);
    }

    public void onAdLoaded() {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam.InternalGAMAd$$ExternalSyntheticLambda3
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$onAdLoaded$0;
                lambda$onAdLoaded$0 = InternalGAMAd.this.lambda$onAdLoaded$0();
                return lambda$onAdLoaded$0;
            }
        });
        setStatus(Status.Loaded);
        this.expirationHandler.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onAdShown$1() {
        return String.format("onAdShown (%s)", this.gamUnitData);
    }

    public void onAdShown() {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam.InternalGAMAd$$ExternalSyntheticLambda0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$onAdShown$1;
                lambda$onAdShown$1 = InternalGAMAd.this.lambda$onAdShown$1();
                return lambda$onAdShown$1;
            }
        });
        this.gamLoader.onGAMAdShown(this);
        setStatus(Status.Shown);
        this.expirationHandler.stop();
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        if (isShown()) {
            return;
        }
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam.InternalGAMAd$$ExternalSyntheticLambda1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$onExpired$2;
                lambda$onExpired$2 = InternalGAMAd.this.lambda$onExpired$2();
                return lambda$onExpired$2;
            }
        });
        setStatus(Status.Expired);
        InternalGAMAdPresentListener adPresentListener = getAdPresentListener();
        if (adPresentListener != null) {
            adPresentListener.onAdExpired();
        }
        destroy(true);
        this.gamLoader.load(this.adsFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onExpired$2() {
        return String.format("onExpired (%s)", this.gamUnitData);
    }

    public void destroy() {
        destroy(isShown());
    }

    private void destroy(boolean z) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam.InternalGAMAd$$ExternalSyntheticLambda2
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$destroy$3;
                lambda$destroy$3 = InternalGAMAd.this.lambda$destroy$3();
                return lambda$destroy$3;
            }
        });
        WeakReference<InternalGAMAdPresentListener> weakReference = this.weakAdPresentListener;
        if (weakReference != null) {
            weakReference.clear();
            this.weakAdPresentListener = null;
        }
        this.expirationHandler.stop();
        this.gamLoader.onGAMAdDestroy(this, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$destroy$3() {
        return String.format("destroy (%s)", this.gamUnitData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$load$4() {
        return String.format("load (%s)", this.gamUnitData);
    }

    final void load(@NonNull Context context, @NonNull final InternalLoadListener internalLoadListener) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.gam.InternalGAMAd$$ExternalSyntheticLambda4
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$load$4;
                lambda$load$4 = InternalGAMAd.this.lambda$load$4();
                return lambda$load$4;
            }
        });
        final Context applicationContext = context.getApplicationContext();
        Utils.onUiThread(new Runnable() { // from class: io.bidmachine.ads.networks.gam.InternalGAMAd$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                InternalGAMAd.this.lambda$load$5(applicationContext, internalLoadListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$5(Context context, InternalLoadListener internalLoadListener) {
        try {
            setStatus(Status.Loading);
            loadAd(context, internalLoadListener);
        } catch (Throwable th) {
            Logger.w(th);
            internalLoadListener.onAdLoadFailed(this, BMError.throwable("Exception loading InternalGAM object", th));
        }
    }

    final void release() {
        Utils.onUiThread(new Runnable() { // from class: io.bidmachine.ads.networks.gam.InternalGAMAd$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                InternalGAMAd.this.lambda$release$6();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$6() {
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
        return this.tag + ", " + getGamUnitData();
    }
}
