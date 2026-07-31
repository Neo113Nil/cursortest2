package io.bidmachine.nativead;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.AdObjectImpl;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.ContextProvider;
import io.bidmachine.Executable;
import io.bidmachine.ImageData;
import io.bidmachine.ImageDataImpl;
import io.bidmachine.LabelData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.PrivacySheetData;
import io.bidmachine.RendererConfiguration;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.internal.AbstractC6010e;
import io.bidmachine.internal.C6012g;
import io.bidmachine.internal.C6016k;
import io.bidmachine.internal.C6017l;
import io.bidmachine.internal.U;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.nativead.utils.ImageHelper;
import io.bidmachine.nativead.view.MediaView;
import io.bidmachine.nativead.view.NativeMediaView;
import io.bidmachine.rendering.Rendering;
import io.bidmachine.rendering.Repository;
import io.bidmachine.rendering.utils.UrlHandler;
import io.bidmachine.rendering.view.WatermarkView;
import io.bidmachine.unified.UnifiedNativeAd;
import io.bidmachine.unified.UnifiedNativeAdCallback;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;
import io.bidmachine.util.ProcessUrlResult;
import io.bidmachine.util.SafeExecutable;
import io.bidmachine.util.Tag;
import io.bidmachine.util.ViewUtils;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ViewHelper;
import io.bidmachine.utils.lazy.LazyCachedValue;
import io.bidmachine.utils.lazy.LazyValue;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class NativeAdObject extends AdObjectImpl<NativeRequest, AdObjectParams, UnifiedNativeAd, UnifiedNativeAdCallback, UnifiedNativeAdRequestParams> implements NativeData, NativeMediaPrivateData, NativeContainer, NativeInteractor, View.OnClickListener {
    static final float DEFAULT_RATING = -1.0f;
    private static final int ICON_VIEW_ID = 100;
    private static final String INSTALL = "Install";
    private static final int MEDIA_VIEW_ID = 200;

    @NonNull
    private static final WeakHashMap<ViewGroup, WeakHashMap<View, View.OnClickListener>> clickStorage = new WeakHashMap<>(3);

    @Nullable
    private ViewGroup container;

    @Nullable
    private C6017l disclaimerTextView;

    @Nullable
    private ImageDataImpl iconImageData;

    @Nullable
    private ImageDataImpl mainImageData;

    @Nullable
    private MediaView mediaView;

    @Nullable
    private NativeNetworkAdapter nativeNetworkAdapter;

    @Nullable
    private ProgressDialog progressDialog;

    @Nullable
    private Handler progressDialogCanceller;

    @Nullable
    private Runnable progressRunnable;

    @Nullable
    private View providerView;

    @NonNull
    private final LazyCachedValue<Repository> repository;

    @NonNull
    private final Tag tag;

    @Nullable
    private VastRequest vastRequest;

    @Nullable
    private Uri videoUri;
    private boolean viewRegistered;

    @Nullable
    private View.OnLayoutChangeListener watermarkAutoLayoutListener;

    @Nullable
    private View watermarkView;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            NativeAdObject.this.hideProgressDialog();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeAdObject.this.hideProgressDialog();
        }
    }

    private static class c implements View.OnLayoutChangeListener {
        private final WeakReference a;
        private int b;
        private int c;

        public c(View view) {
            this.a = new WeakReference(view);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            View view2;
            if (view == null) {
                return;
            }
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if ((i9 == this.b && i10 == this.c) || (view2 = (View) this.a.get()) == null) {
                return;
            }
            this.b = i9;
            this.c = i10;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                view2.setLayoutParams(new ViewGroup.LayoutParams(i9, i10));
                return;
            }
            layoutParams.width = i9;
            layoutParams.height = i10;
            view2.requestLayout();
        }
    }

    private class d implements SafeExecutable {
        private d() {
        }

        @Override // io.bidmachine.util.SafeExecutable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onExecute(ProcessUrlResult processUrlResult) {
            if (processUrlResult.getIsSuccess()) {
                NativeAdObject.this.getAdProcessCallback().processClickVerified(processUrlResult.getSystemComponent());
            }
            NativeAdObject.this.hideProgressDialog();
        }

        /* synthetic */ d(NativeAdObject nativeAdObject, a aVar) {
            this();
        }
    }

    private final class e extends AbstractC6010e implements UnifiedNativeAdCallback {
        e(AdProcessCallback adProcessCallback) {
            super(adProcessCallback);
        }

        @Override // io.bidmachine.unified.UnifiedNativeAdCallback
        public void onAdLoaded(NativeNetworkAdapter nativeNetworkAdapter) {
            try {
                NativeAdObject.this.setNativeNetworkAdapter(nativeNetworkAdapter);
                if (NativeAdObject.this.getAdRequest().getAdRequestParameters().getIsValidateAssets() && !nativeNetworkAdapter.isValid()) {
                    a().processLoadFail(BMError.incorrectContent("Native ad does not contain all required assets"));
                } else if (nativeNetworkAdapter.getIsNetworkControlLoadingAssets()) {
                    a().processLoadSuccess();
                } else {
                    NativeAdObject nativeAdObject = NativeAdObject.this;
                    nativeAdObject.loadAsset(nativeAdObject.getApplicationContext(), nativeNetworkAdapter);
                }
            } catch (Exception e) {
                Logger.w(NativeAdObject.this.tag, e);
                a().processLoadFail(BMError.throwable("Exception loading native ad assets", e));
            }
        }
    }

    NativeAdObject(@NonNull final ContextProvider contextProvider, @NonNull AdProcessCallback adProcessCallback, @NonNull NativeRequest nativeRequest, @NonNull AdObjectParams adObjectParams, @NonNull UnifiedNativeAd unifiedNativeAd) {
        super(contextProvider, adProcessCallback, nativeRequest, adObjectParams, unifiedNativeAd);
        this.tag = new Tag("NativeAdObject");
        this.repository = new LazyCachedValue<>(new LazyValue() { // from class: io.bidmachine.nativead.NativeAdObject$$ExternalSyntheticLambda0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                Repository lambda$new$0;
                lambda$new$0 = NativeAdObject.lambda$new$0(ContextProvider.this);
                return lambda$new$0;
            }
        });
    }

    private void configureClickableView(@NonNull ViewGroup viewGroup, @Nullable Set<View> set) {
        deConfigureClickableView(viewGroup);
        if (set == null || set.isEmpty()) {
            return;
        }
        WeakHashMap<View, View.OnClickListener> weakHashMap = new WeakHashMap<>();
        clickStorage.put(viewGroup, weakHashMap);
        for (View view : set) {
            if (view != null) {
                view.setOnClickListener(this);
                weakHashMap.put(view, this);
            }
        }
    }

    private void configureDisclaimer(@Nullable RelativeLayout relativeLayout) {
        C6016k disclaimerData;
        destroyDisclaimerTextView();
        if (relativeLayout == null || (disclaimerData = getDisclaimerData()) == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        C6017l a2 = U.a(relativeLayout.getContext(), disclaimerData, relativeLayout);
        a2.setLayoutParams(layoutParams);
        this.disclaimerTextView = a2;
        relativeLayout.addView(a2);
    }

    @Nullable
    private ImageView configureIconView(@Nullable View view) {
        ImageView imageView;
        if (view instanceof ImageView) {
            imageView = (ImageView) view;
        } else if (view instanceof ViewGroup) {
            ImageView imageView2 = new ImageView(view.getContext());
            imageView2.setId(100);
            imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.removeAllViews();
            viewGroup.addView(imageView2, ViewUtils.createMatchParentParams());
            imageView = imageView2;
        } else {
            imageView = null;
        }
        if (imageView != null && this.iconImageData != null) {
            ImageHelper.fillImageView(imageView.getContext(), imageView, this.iconImageData.getLocalUri(), this.iconImageData.getImage());
        }
        return imageView;
    }

    private void configureMediaView(@Nullable NativeMediaView nativeMediaView) {
        if (nativeMediaView == null) {
            return;
        }
        View createMediaView = createMediaView(nativeMediaView.getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        ViewUtils.addSingleViewSafely(nativeMediaView, createMediaView, layoutParams);
    }

    private void configureWatermark(@NonNull ViewGroup viewGroup, @Nullable RendererConfiguration rendererConfiguration) {
        Drawable watermarkDrawable;
        removeWatermarkAutoLayout(viewGroup);
        removeWatermark();
        if (rendererConfiguration == null || (watermarkDrawable = rendererConfiguration.getWatermarkDrawable(getApplicationContext())) == null) {
            return;
        }
        WatermarkView watermarkView = new WatermarkView(viewGroup.getContext().getApplicationContext());
        watermarkView.setLayoutParams(ViewUtils.createMatchParentParams());
        watermarkView.setWatermark(watermarkDrawable);
        this.watermarkView = watermarkView;
        View.OnLayoutChangeListener cVar = new c(watermarkView);
        this.watermarkAutoLayoutListener = cVar;
        viewGroup.addOnLayoutChangeListener(cVar);
        viewGroup.addView(watermarkView);
    }

    @NonNull
    private View createMediaView(@NonNull Context context) {
        View createCustomMediaView;
        NativeNetworkAdapter nativeNetworkAdapter = this.nativeNetworkAdapter;
        if (nativeNetworkAdapter != null && (createCustomMediaView = nativeNetworkAdapter.createCustomMediaView(context)) != null) {
            return createCustomMediaView;
        }
        MediaView mediaView = new MediaView(context);
        mediaView.setId(200);
        NativeAdRequestParameters adRequestParameters = getAdRequest().getAdRequestParameters();
        if (adRequestParameters.containsAssetType(MediaAssetType.Image) || adRequestParameters.containsAssetType(MediaAssetType.Video)) {
            mediaView.setNativeAdObject(this);
        }
        this.mediaView = mediaView;
        return mediaView;
    }

    private void deConfigureClickableView(@NonNull ViewGroup viewGroup) {
        WeakHashMap<View, View.OnClickListener> weakHashMap = clickStorage.get(viewGroup);
        if (weakHashMap != null) {
            for (Map.Entry<View, View.OnClickListener> entry : weakHashMap.entrySet()) {
                if (entry != null && entry.getKey() != null) {
                    entry.getKey().setOnClickListener(null);
                }
            }
            clickStorage.remove(viewGroup);
        }
    }

    private void destroyDisclaimerTextView() {
        C6017l c6017l = this.disclaimerTextView;
        if (c6017l == null) {
            return;
        }
        c6017l.a();
        this.disclaimerTextView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideProgressDialog() {
        Handler handler;
        ProgressDialog progressDialog = this.progressDialog;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.progressDialog.dismiss();
            this.progressDialog = null;
        }
        Runnable runnable = this.progressRunnable;
        if (runnable == null || (handler = this.progressDialogCanceller) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
        this.progressDialogCanceller = null;
        this.progressRunnable = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Repository lambda$new$0(ContextProvider contextProvider) {
        return Rendering.INSTANCE.createRepository(C6012g.a(contextProvider.getApplicationContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAsset(@NonNull Context context, @NonNull NativeData nativeData) {
        new AssetLoader(context, this.tag, getAdRequest().getAdRequestParameters(), getAdProcessCallback(), nativeData, this).downloadNativeAdsImages(context);
    }

    private boolean mayShowProgressDialog() {
        ProgressDialog progressDialog = this.progressDialog;
        return progressDialog == null || !progressDialog.isShowing();
    }

    private void removeWatermark() {
        View view = this.watermarkView;
        if (view != null) {
            ViewUtils.removeFromParent(view);
            this.watermarkView = null;
        }
    }

    private void removeWatermarkAutoLayout(@NonNull ViewGroup viewGroup) {
        View.OnLayoutChangeListener onLayoutChangeListener = this.watermarkAutoLayoutListener;
        if (onLayoutChangeListener != null) {
            viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
            this.watermarkAutoLayoutListener = null;
        }
    }

    private void showProgressDialog(@Nullable Activity activity) {
        if (this.container != null && mayShowProgressDialog() && Utils.canAddWindowToActivity(activity)) {
            this.container.addOnAttachStateChangeListener(new a());
            ProgressDialog show = ProgressDialog.show(activity, "", "Loading...");
            this.progressDialog = show;
            show.setProgressStyle(0);
            this.progressDialog.setCancelable(false);
            this.progressRunnable = new b();
            Handler handler = new Handler(Looper.getMainLooper());
            this.progressDialogCanceller = handler;
            handler.postDelayed(this.progressRunnable, 5000L);
        }
    }

    @Override // io.bidmachine.nativead.NativeInteractor
    public void dispatchClick() {
        getAdProcessCallback().processClicked(null);
    }

    @Override // io.bidmachine.nativead.NativeInteractor
    public void dispatchFillAd() {
        getAdProcessCallback().processFillAd();
    }

    @Override // io.bidmachine.nativead.NativeInteractor
    public void dispatchShown() {
        getAdProcessCallback().processVisibilityTrackerShown();
    }

    @Override // io.bidmachine.nativead.NativeInteractor
    public void dispatchVideoPlayFinished() {
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public LabelData getAdLabelData() {
        NativeNetworkAdapter nativeNetworkAdapter = this.nativeNetworkAdapter;
        if (nativeNetworkAdapter != null) {
            return nativeNetworkAdapter.getAdLabelData();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @NonNull
    public String getCallToAction() {
        NativeNetworkAdapter nativeNetworkAdapter = this.nativeNetworkAdapter;
        String callToAction = nativeNetworkAdapter != null ? nativeNetworkAdapter.getCallToAction() : null;
        return TextUtils.isEmpty(callToAction) ? INSTALL : callToAction;
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public String getClickUrl() {
        NativeNetworkAdapter nativeNetworkAdapter = this.nativeNetworkAdapter;
        if (nativeNetworkAdapter != null) {
            return nativeNetworkAdapter.getClickUrl();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    public String getDescription() {
        NativeNetworkAdapter nativeNetworkAdapter = this.nativeNetworkAdapter;
        if (nativeNetworkAdapter != null) {
            return nativeNetworkAdapter.getDescription();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public C6016k getDisclaimerData() {
        NativeNetworkAdapter nativeNetworkAdapter = this.nativeNetworkAdapter;
        if (nativeNetworkAdapter != null) {
            return nativeNetworkAdapter.getDisclaimerData();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    /* renamed from: getIcon */
    public ImageData getIconImageData() {
        return this.iconImageData;
    }

    @Override // io.bidmachine.nativead.NativeMediaPublicData
    @Nullable
    public Drawable getIconDrawable() {
        ImageDataImpl imageDataImpl = this.iconImageData;
        if (imageDataImpl != null) {
            return imageDataImpl.getImage();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativeMediaPublicData
    @Nullable
    public Uri getIconUri() {
        ImageDataImpl imageDataImpl = this.iconImageData;
        if (imageDataImpl != null) {
            return imageDataImpl.getLocalUri();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativeMediaPublicData
    @Nullable
    public Drawable getImageDrawable() {
        ImageDataImpl imageDataImpl = this.mainImageData;
        if (imageDataImpl != null) {
            return imageDataImpl.getImage();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativeMediaPublicData
    @Nullable
    public Uri getImageUri() {
        ImageDataImpl imageDataImpl = this.mainImageData;
        if (imageDataImpl != null) {
            return imageDataImpl.getLocalUri();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    /* renamed from: getMainImage */
    public ImageData getMainImageData() {
        return this.mainImageData;
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public PrivacySheetData getPrivacySheetData() {
        NativeNetworkAdapter nativeNetworkAdapter = this.nativeNetworkAdapter;
        if (nativeNetworkAdapter != null) {
            return nativeNetworkAdapter.getPrivacySheetData();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativeContainer
    @Nullable
    public View getProviderView(@NonNull Context context) {
        NativeNetworkAdapter nativeNetworkAdapter;
        if (this.providerView == null && (nativeNetworkAdapter = this.nativeNetworkAdapter) != null) {
            this.providerView = nativeNetworkAdapter.createProviderView(context);
        }
        return this.providerView;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    public float getRating() {
        NativeNetworkAdapter nativeNetworkAdapter = this.nativeNetworkAdapter;
        if (nativeNetworkAdapter != null) {
            return nativeNetworkAdapter.getRating();
        }
        return -1.0f;
    }

    @NonNull
    public Tag getTag() {
        return this.tag;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    @Nullable
    public String getTitle() {
        NativeNetworkAdapter nativeNetworkAdapter = this.nativeNetworkAdapter;
        if (nativeNetworkAdapter != null) {
            return nativeNetworkAdapter.getTitle();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativeMediaPrivateData
    @Nullable
    public VastRequest getVastRequest() {
        return this.vastRequest;
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public String getVideoAdm() {
        NativeNetworkAdapter nativeNetworkAdapter = this.nativeNetworkAdapter;
        if (nativeNetworkAdapter != null) {
            return nativeNetworkAdapter.getVideoAdm();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativeMediaPublicData
    @Nullable
    public Uri getVideoUri() {
        return this.videoUri;
    }

    @Override // io.bidmachine.nativead.NativeData
    @Nullable
    public String getVideoUrl() {
        NativeNetworkAdapter nativeNetworkAdapter = this.nativeNetworkAdapter;
        if (nativeNetworkAdapter != null) {
            return nativeNetworkAdapter.getVideoUrl();
        }
        return null;
    }

    @Override // io.bidmachine.nativead.NativePublicData
    /* renamed from: hasVideo */
    public boolean getHasVideo() {
        NativeNetworkAdapter nativeNetworkAdapter;
        return this.videoUri != null || ((nativeNetworkAdapter = this.nativeNetworkAdapter) != null && nativeNetworkAdapter.getHasVideo());
    }

    @VisibleForTesting
    boolean isNativeAdViewValid(@Nullable ViewGroup viewGroup, @Nullable View view, @Nullable NativeMediaView nativeMediaView) {
        if (viewGroup == null) {
            Logger.d(this.tag, "NativeAdView cannot be null. NativeAd is NOT registered");
            return false;
        }
        if (view == null && nativeMediaView == null) {
            Logger.d(this.tag, "ImageView or NativeMediaView cannot be null. NativeAd is NOT registered");
            return false;
        }
        if (view != null && !ViewHelper.belongTo(viewGroup, view)) {
            Logger.d(this.tag, "ImageView should belong to NativeAdView");
        }
        if (nativeMediaView == null || ViewHelper.belongTo(viewGroup, nativeMediaView)) {
            return true;
        }
        Logger.d(this.tag, "NativeMediaView should belong to NativeAdView");
        return true;
    }

    @Override // io.bidmachine.nativead.NativeContainer
    public boolean isViewRegistered() {
        return this.viewRegistered;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        dispatchClick();
    }

    @Override // io.bidmachine.AdObjectImpl, io.bidmachine.models.AdObject
    public Boolean onClicked() {
        super.onClicked();
        String clickUrl = getClickUrl();
        if (TextUtils.isEmpty(clickUrl)) {
            return Boolean.FALSE;
        }
        showProgressDialog(getActivity());
        UrlHandler.openUrl(getApplicationContext(), clickUrl, new d(this, null));
        return Boolean.TRUE;
    }

    @Override // io.bidmachine.AdObjectImpl, io.bidmachine.models.AdObject
    public void onDestroy() {
        try {
            super.onDestroy();
            unregisterView();
            Utils.ifNotNull(this.iconImageData, new Executable() { // from class: io.bidmachine.nativead.NativeAdObject$$ExternalSyntheticLambda1
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((ImageDataImpl) obj).destroy();
                }
            });
            Utils.ifNotNull(this.mainImageData, new Executable() { // from class: io.bidmachine.nativead.NativeAdObject$$ExternalSyntheticLambda1
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((ImageDataImpl) obj).destroy();
                }
            });
            Utils.ifNotNull(this.nativeNetworkAdapter, new Executable() { // from class: io.bidmachine.nativead.NativeAdObject$$ExternalSyntheticLambda2
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((NativeNetworkAdapter) obj).destroy();
                }
            });
            this.iconImageData = null;
            this.mainImageData = null;
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // io.bidmachine.nativead.NativeContainer
    public void registerView(@NonNull ViewGroup viewGroup, @Nullable View view, @Nullable NativeMediaView nativeMediaView, @Nullable Set<View> set) {
        registerView(viewGroup, view, nativeMediaView, set, null);
    }

    @Override // io.bidmachine.nativead.NativeMediaPrivateData
    public void setIconBitmap(@Nullable Bitmap bitmap) {
        ImageDataImpl imageDataImpl = this.iconImageData;
        if (imageDataImpl != null) {
            imageDataImpl.setImage(new BitmapDrawable(getApplicationContext().getResources(), bitmap));
        }
    }

    @Override // io.bidmachine.nativead.NativeMediaPrivateData
    public void setIconUri(@Nullable Uri uri) {
        ImageDataImpl imageDataImpl = this.iconImageData;
        if (imageDataImpl != null) {
            imageDataImpl.setLocalUri(uri);
        }
    }

    @Override // io.bidmachine.nativead.NativeMediaPrivateData
    public void setImageBitmap(@Nullable Bitmap bitmap) {
        ImageDataImpl imageDataImpl = this.mainImageData;
        if (imageDataImpl != null) {
            imageDataImpl.setImage(new BitmapDrawable(getApplicationContext().getResources(), bitmap));
        }
    }

    @Override // io.bidmachine.nativead.NativeMediaPrivateData
    public void setImageUri(@Nullable Uri uri) {
        ImageDataImpl imageDataImpl = this.mainImageData;
        if (imageDataImpl != null) {
            imageDataImpl.setLocalUri(uri);
        }
    }

    public void setNativeNetworkAdapter(@Nullable NativeNetworkAdapter nativeNetworkAdapter) {
        this.nativeNetworkAdapter = nativeNetworkAdapter;
        if (nativeNetworkAdapter != null) {
            this.iconImageData = new ImageDataImpl(nativeNetworkAdapter.getIconImageData());
            this.mainImageData = new ImageDataImpl(nativeNetworkAdapter.getMainImageData());
        }
    }

    @Override // io.bidmachine.nativead.NativeMediaPrivateData
    public void setVastRequest(@Nullable VastRequest vastRequest) {
        this.vastRequest = vastRequest;
    }

    @Override // io.bidmachine.nativead.NativeMediaPrivateData
    public void setVideoUri(@Nullable Uri uri) {
        this.videoUri = uri;
    }

    @Override // io.bidmachine.nativead.NativeContainer
    public void unregisterView() {
        try {
            stopViewabilityTracker();
            ViewGroup viewGroup = this.container;
            if (viewGroup != null) {
                removeWatermarkAutoLayout(viewGroup);
                deConfigureClickableView(this.container);
                this.container = null;
            }
            MediaView mediaView = this.mediaView;
            if (mediaView != null) {
                mediaView.stopVideoVisibilityCheckerTimer();
                this.mediaView.release();
                this.mediaView = null;
            }
            NativeNetworkAdapter nativeNetworkAdapter = this.nativeNetworkAdapter;
            if (nativeNetworkAdapter != null) {
                nativeNetworkAdapter.unregisterNative();
            }
            destroyDisclaimerTextView();
            removeWatermark();
            this.viewRegistered = false;
        } catch (Throwable th) {
            Logger.w(this.tag, th);
        }
    }

    @Override // io.bidmachine.models.AdObject
    @NonNull
    public UnifiedNativeAdCallback createUnifiedCallback(@NonNull AdProcessCallback adProcessCallback) {
        return new e(adProcessCallback);
    }

    void registerView(@NonNull ViewGroup viewGroup, @Nullable View view, @Nullable NativeMediaView nativeMediaView, @Nullable Set<View> set, @Nullable RendererConfiguration rendererConfiguration) {
        try {
            if (!isNativeAdViewValid(viewGroup, view, nativeMediaView)) {
                getAdProcessCallback().processShowFail(BMError.internal("Native ad views are invalid"));
                return;
            }
            configureClickableView(viewGroup, set);
            ImageView configureIconView = configureIconView(view);
            configureMediaView(nativeMediaView);
            this.container = viewGroup;
            startViewabilityTracker(viewGroup);
            dispatchFillAd();
            MediaView mediaView = this.mediaView;
            if (mediaView != null) {
                mediaView.onViewAppearOnScreen();
                this.mediaView.startVideoVisibilityCheckerTimer();
            }
            NativeNetworkAdapter nativeNetworkAdapter = this.nativeNetworkAdapter;
            if (nativeNetworkAdapter != null) {
                nativeNetworkAdapter.registerNative(viewGroup, configureIconView, nativeMediaView, set);
            }
            configureDisclaimer(nativeMediaView);
            C6017l c6017l = this.disclaimerTextView;
            if (c6017l != null) {
                c6017l.bringToFront();
            }
            configureWatermark(viewGroup, rendererConfiguration);
            View view2 = this.watermarkView;
            if (view2 != null) {
                view2.bringToFront();
            }
            this.viewRegistered = true;
        } catch (Throwable th) {
            Logger.w(this.tag, th);
            unregisterView();
            getAdProcessCallback().processShowFail(BMError.throwable("Exception registering view for native ad object", th));
        }
    }
}
