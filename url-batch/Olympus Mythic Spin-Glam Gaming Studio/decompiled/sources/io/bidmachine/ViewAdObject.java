package io.bidmachine;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.AdRequest;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.internal.AbstractC6010e;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedBannerAdCallback;
import io.bidmachine.unified.UnifiedViewAd;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ViewHelper;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class ViewAdObject<AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, UnifiedAdType extends UnifiedViewAd<UnifiedBannerAdCallback, UnifiedAdRequestParamsType>, UnifiedAdRequestParamsType extends UnifiedAdRequestParams> extends AdObjectImpl<AdRequestType, AdObjectParams, UnifiedAdType, UnifiedBannerAdCallback, UnifiedAdRequestParamsType> {

    @Nullable
    @VisibleForTesting
    View adView;
    private int height;

    @NonNull
    private MeasureMode heightMeasureMode;
    private int width;

    @NonNull
    private MeasureMode widthMeasureMode;

    public enum MeasureMode {
        Match,
        Wrap,
        Direct;

        int getSize(@NonNull Context context, int i) {
            int i2 = a.a[ordinal()];
            return i2 != 1 ? i2 != 2 ? -1 : -2 : Math.round(i * Utils.getScreenDensity(context));
        }
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MeasureMode.values().length];
            a = iArr;
            try {
                iArr[MeasureMode.Direct.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MeasureMode.Wrap.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static final class b extends AbstractC6010e implements UnifiedBannerAdCallback {
        private final WeakReference b;

        b(ViewAdObject viewAdObject, AdProcessCallback adProcessCallback) {
            super(adProcessCallback);
            this.b = new WeakReference(viewAdObject);
        }

        @Override // io.bidmachine.unified.UnifiedBannerAdCallback
        public void onAdLoaded(View view) {
            ViewAdObject viewAdObject = (ViewAdObject) this.b.get();
            if (viewAdObject == null) {
                a().processLoadFail(BMError.internal("ViewAdObject is null"));
            } else {
                viewAdObject.setAdView(view);
                a().processLoadSuccess();
            }
        }
    }

    public ViewAdObject(@NonNull ContextProvider contextProvider, @NonNull AdProcessCallback adProcessCallback, @NonNull AdRequestType adrequesttype, @NonNull AdObjectParams adObjectParams, @NonNull UnifiedAdType unifiedadtype) {
        super(contextProvider, adProcessCallback, adrequesttype, adObjectParams, unifiedadtype);
        MeasureMode measureMode = MeasureMode.Direct;
        this.widthMeasureMode = measureMode;
        this.heightMeasureMode = measureMode;
    }

    private int getScaledHeight(@NonNull Context context) {
        return this.heightMeasureMode.getSize(context, getHeight());
    }

    private int getScaledWidth(@NonNull Context context) {
        return this.widthMeasureMode.getSize(context, getWidth());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdView(@Nullable View view) {
        hide();
        this.adView = view;
    }

    public int getHeight() {
        return this.height;
    }

    @NonNull
    public MeasureMode getHeightMeasureMode() {
        return this.heightMeasureMode;
    }

    public int getWidth() {
        return this.width;
    }

    @NonNull
    public MeasureMode getWidthMeasureMode() {
        return this.widthMeasureMode;
    }

    @Override // io.bidmachine.AdObjectImpl, io.bidmachine.models.AdObject
    public void hide() {
        super.hide();
        stopViewabilityTracker();
        ViewHelper.removeViewFromParent(this.adView);
    }

    @Override // io.bidmachine.AdObjectImpl, io.bidmachine.models.AdObject
    public void onDestroy() {
        hide();
        super.onDestroy();
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setHeightMeasureMode(@NonNull MeasureMode measureMode) {
        this.heightMeasureMode = measureMode;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public void setWidthMeasureMode(@NonNull MeasureMode measureMode) {
        this.widthMeasureMode = measureMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void show(@Nullable ViewGroup viewGroup, @Nullable RendererConfiguration rendererConfiguration) {
        if (viewGroup == null) {
            getUnifiedAdCallback().onAdShowFailed(BMError.notFound("Target container"));
            return;
        }
        View view = this.adView;
        if (view == null) {
            getUnifiedAdCallback().onAdShowFailed(BMError.internal("Ad view is null"));
            return;
        }
        MeasureMode widthMeasureMode = getWidthMeasureMode();
        MeasureMode measureMode = MeasureMode.Direct;
        if ((widthMeasureMode == measureMode && getWidth() == 0) || (getHeightMeasureMode() == measureMode && getHeight() == 0)) {
            getUnifiedAdCallback().onAdShowFailed(BMError.incorrectContent("Width or height are not provided"));
            return;
        }
        Context context = viewGroup.getContext();
        ViewGroup.LayoutParams layoutParams = viewGroup instanceof FrameLayout ? new FrameLayout.LayoutParams(getScaledWidth(context), getScaledHeight(context), 17) : new ViewGroup.LayoutParams(getScaledWidth(context), getScaledHeight(context));
        startViewabilityTracker(view);
        ViewHelper.safeAddSingleView(viewGroup, view, layoutParams);
        getAdProcessCallback().processFillAd();
        try {
            ((UnifiedViewAd) getUnifiedAd()).prepareToShow(rendererConfiguration);
        } catch (Throwable th) {
            Logger.w(th);
        }
    }

    @Override // io.bidmachine.models.AdObject
    @NonNull
    public UnifiedBannerAdCallback createUnifiedCallback(@NonNull AdProcessCallback adProcessCallback) {
        return new b(this, adProcessCallback);
    }
}
