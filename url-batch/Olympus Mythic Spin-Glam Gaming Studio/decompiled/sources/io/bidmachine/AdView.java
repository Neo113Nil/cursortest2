package io.bidmachine;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.AdView;
import io.bidmachine.ViewAd;
import io.bidmachine.ViewAdObject;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.utils.BMError;

/* loaded from: classes5.dex */
public abstract class AdView<SelfType extends AdView<SelfType, AdType, AdRequestType, AdObjectType, ExternalAdListenerType>, AdType extends ViewAd<AdType, AdRequestType, AdObjectType, ?, AdListener<AdType>>, AdRequestType extends AdRequest<AdRequestType, ?, ?>, AdObjectType extends ViewAdObject<AdRequestType, ?, ?>, ExternalAdListenerType extends AdListener<SelfType>> extends FrameLayout implements IAd<SelfType, AdRequestType> {
    private final AdListener<AdType> adListener;

    @Nullable
    private AdType currentAd;

    @Nullable
    private ExternalAdListenerType externalListener;
    private boolean isAttachedToWindow;
    private boolean isShowPending;

    @Nullable
    private AdType pendingAd;

    @Nullable
    private RendererConfiguration rendererConfiguration;

    class a implements AdListener {
        a() {
        }

        @Override // io.bidmachine.AdListener
        public void onAdClicked(ViewAd viewAd) {
            if (AdView.this.externalListener != null) {
                AdView.this.externalListener.onAdClicked(AdView.this);
            }
        }

        @Override // io.bidmachine.AdListener
        public void onAdExpired(ViewAd viewAd) {
            if (AdView.this.externalListener != null) {
                AdView.this.externalListener.onAdExpired(AdView.this);
            }
        }

        @Override // io.bidmachine.AdListener
        public void onAdImpression(ViewAd viewAd) {
            if (AdView.this.externalListener != null) {
                AdView.this.externalListener.onAdImpression(AdView.this);
            }
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoadFailed(ViewAd viewAd, BMError bMError) {
            if (AdView.this.externalListener != null) {
                AdView.this.externalListener.onAdLoadFailed(AdView.this, bMError);
            }
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoaded(ViewAd viewAd) {
            if (AdView.this.externalListener != null) {
                AdView.this.externalListener.onAdLoaded(AdView.this);
            }
            AdView.this.performShow();
        }

        @Override // io.bidmachine.AdListener
        public void onAdShowFailed(ViewAd viewAd, BMError bMError) {
            if (AdView.this.externalListener != null) {
                AdView.this.externalListener.onAdShowFailed(AdView.this, bMError);
            }
        }
    }

    public AdView(@NonNull Context context) {
        this(context, null);
    }

    private boolean canPerformShow() {
        return this.isAttachedToWindow && this.isShowPending && getVisibility() != 8;
    }

    private void performHide() {
        AdType adtype = this.currentAd;
        if (adtype != null) {
            adtype.hide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performShow() {
        if (canPerformShow()) {
            prepareDisplayRequest();
            AdType adtype = this.currentAd;
            if (adtype != null) {
                adtype.setRendererConfiguration(this.rendererConfiguration);
                this.currentAd.show(this);
                this.isShowPending = false;
            }
        }
    }

    private void prepareDisplayRequest() {
        AdType adtype;
        if (this.currentAd == null || ((adtype = this.pendingAd) != null && adtype.isLoaded())) {
            AdType adtype2 = this.currentAd;
            if (adtype2 != null) {
                adtype2.destroy();
            }
            this.currentAd = this.pendingAd;
            this.pendingAd = null;
        }
    }

    @Override // io.bidmachine.IAd
    public boolean canShow() {
        return canShow(this.currentAd) || canShow(this.pendingAd);
    }

    protected abstract AdType createAd(Context context);

    @Override // io.bidmachine.IAd
    public void destroy() {
        AdType adtype = this.currentAd;
        if (adtype != null) {
            adtype.destroy();
            this.currentAd = null;
        }
        AdType adtype2 = this.pendingAd;
        if (adtype2 != null) {
            adtype2.destroy();
            this.pendingAd = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    protected AdType getAd() {
        AdType adtype = this.currentAd;
        return adtype != null ? adtype : this.pendingAd;
    }

    @Override // io.bidmachine.IAd
    @Nullable
    public AuctionResult getAuctionResult() {
        AdType adtype = this.currentAd;
        if (adtype != null) {
            return adtype.getAuctionResult();
        }
        AdType adtype2 = this.pendingAd;
        if (adtype2 != null) {
            return adtype2.getAuctionResult();
        }
        return null;
    }

    @Nullable
    protected AdType getCurrentAd() {
        return this.currentAd;
    }

    @Nullable
    protected AdType getPendingAd() {
        return this.pendingAd;
    }

    @Override // io.bidmachine.IAd
    public boolean isDestroyed() {
        AdType adtype = this.pendingAd;
        if (adtype != null) {
            return adtype.isDestroyed();
        }
        AdType adtype2 = this.currentAd;
        return adtype2 != null && adtype2.isDestroyed();
    }

    @Override // io.bidmachine.IAd
    public boolean isExpired() {
        AdType adtype = this.pendingAd;
        if (adtype != null) {
            return adtype.isExpired();
        }
        AdType adtype2 = this.currentAd;
        return adtype2 != null && adtype2.isExpired();
    }

    @Override // io.bidmachine.IAd
    public boolean isLoaded() {
        return isLoaded(this.currentAd) || isLoaded(this.pendingAd);
    }

    @Override // io.bidmachine.IAd
    public boolean isLoading() {
        AdType adtype = this.pendingAd;
        return adtype != null && adtype.isLoading();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.bidmachine.IAd
    @NonNull
    public /* bridge */ /* synthetic */ IAd load(AdRequest adRequest) {
        return load((AdView<SelfType, AdType, AdRequestType, AdObjectType, ExternalAdListenerType>) adRequest);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        performShow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        this.isShowPending = true;
        performHide();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @NonNull
    public SelfType setListener(ExternalAdListenerType externaladlistenertype) {
        this.externalListener = externaladlistenertype;
        return this;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (getVisibility() == 0) {
            performShow();
        }
    }

    public AdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean canShow(@Nullable AdType adtype) {
        return adtype != null && adtype.canShow();
    }

    private boolean isLoaded(@Nullable AdType adtype) {
        return adtype != null && adtype.isLoaded();
    }

    @Override // io.bidmachine.IAd
    @NonNull
    public SelfType load(AdRequestType adrequesttype) {
        this.isShowPending = true;
        AdType adtype = this.pendingAd;
        if (adtype != null) {
            adtype.destroy();
        }
        AdType createAd = createAd(getContext());
        this.pendingAd = createAd;
        createAd.setListener(this.adListener);
        this.pendingAd.load(adrequesttype);
        return this;
    }

    @Override // io.bidmachine.IAd
    @NonNull
    public SelfType setRendererConfiguration(@Nullable RendererConfiguration rendererConfiguration) {
        this.rendererConfiguration = rendererConfiguration;
        return this;
    }

    public AdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isShowPending = false;
        this.isAttachedToWindow = false;
        this.adListener = new a();
    }
}
