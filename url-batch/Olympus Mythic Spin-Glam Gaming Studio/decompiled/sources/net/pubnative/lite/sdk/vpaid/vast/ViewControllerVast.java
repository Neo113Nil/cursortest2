package net.pubnative.lite.sdk.vpaid.vast;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import net.pubnative.lite.sdk.CountdownStyle;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.InterstitialActionBehaviour;
import net.pubnative.lite.sdk.R;
import net.pubnative.lite.sdk.models.CustomCTAData;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.models.LearnMoreData;
import net.pubnative.lite.sdk.models.LearnMoreLocation;
import net.pubnative.lite.sdk.models.LearnMoreSize;
import net.pubnative.lite.sdk.models.SkipOffset;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.ScreenDimensionsUtils;
import net.pubnative.lite.sdk.utils.SkipOffsetManager;
import net.pubnative.lite.sdk.utils.ViewUtils;
import net.pubnative.lite.sdk.viewability.baseom.BaseFriendlyObstructionPurpose;
import net.pubnative.lite.sdk.views.PNAPIContentInfoView;
import net.pubnative.lite.sdk.views.cta.HyBidCTAView;
import net.pubnative.lite.sdk.views.endcard.HyBidEndCardView;
import net.pubnative.lite.sdk.vpaid.AdCloseButtonListener;
import net.pubnative.lite.sdk.vpaid.CloseButtonListener;
import net.pubnative.lite.sdk.vpaid.HyBidActivityInteractor;
import net.pubnative.lite.sdk.vpaid.InvalidCTAUrlListener;
import net.pubnative.lite.sdk.vpaid.ReplayListener;
import net.pubnative.lite.sdk.vpaid.VideoAdController;
import net.pubnative.lite.sdk.vpaid.VideoAdView;
import net.pubnative.lite.sdk.vpaid.VideoVisibilityManager;
import net.pubnative.lite.sdk.vpaid.helpers.BitmapHelper;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import net.pubnative.lite.sdk.vpaid.utils.UrlClickSource;
import net.pubnative.lite.sdk.vpaid.utils.Utils;
import net.pubnative.lite.sdk.vpaid.widget.CountDownView;
import net.pubnative.lite.sdk.vpaid.widget.CountDownViewFactory;
import net.pubnative.lite.sdk.vpaid.widget.LinearCountDownView;

/* loaded from: classes15.dex */
public class ViewControllerVast implements View.OnClickListener {
    private static final CountdownStyle COUNTDOWN_STYLE_DEFAULT = CountdownStyle.PIE_CHART;
    private static final InterstitialActionBehaviour INTERSTITIAL_CLICK_BEHAVIOUR_DEFAULT = InterstitialActionBehaviour.HB_CREATIVE;
    private static final String LOG_TAG = "ViewControllerVast";
    private PNAPIContentInfoView contentInfoView;
    private HyBidCTAView ctaView;
    HyBidActivityInteractor interactor;
    private final VideoAdController mAdController;
    private VideoAdView mBannerView;
    private FrameLayout mControlsLayout;
    private CustomCTAData mCustomCTAData;
    private Integer mCustomCTADelay;
    private HyBidEndCardView mEndCardView;
    private final boolean mHasHiddenUx;
    private boolean mHasReducedCloseButton;
    private final boolean mIsBrandAd;
    private final boolean mIsFullscreen;
    private HyBidEndCardView mLastCustomEndCardView;
    private final LearnMoreData mLearnMoreData;
    private LinearCountDownView mLinearCountdownView;
    private boolean mMuteState;
    private ImageView mMuteView;
    private View mOpenUrlLayout;
    private final Integer mRemoteEndCardCloseDelay;
    private final ReplayListener mReplayListener;
    private CountDownView mSkipCountdownView;
    private View mSkipView;
    private Surface mSurface;
    private FrameLayout mUxLayout;
    private FrameLayout mVideoPlayerLayout;
    private TextureView mVideoPlayerLayoutTexture;
    AdCloseButtonListener mcloseButtonListener;
    private InterstitialActionBehaviour remoteConfigInterstitialClickBehaviour;
    private boolean mIsCustomCTA = false;
    private final Handler mUiHandler = new Handler(Looper.getMainLooper());
    private boolean mIsDestroyed = false;
    private final VideoAdView.VisibilityListener mCreateVisibilityListener = new VideoAdView.VisibilityListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast.1
        @Override // net.pubnative.lite.sdk.vpaid.VideoAdView.VisibilityListener
        public void onVisibilityChanged(int i) {
            try {
                if (i == 0) {
                    ViewControllerVast.this.mAdController.setVideoVisible(true);
                    ViewControllerVast.this.videoVisibilityManager.reportChange(VideoVisibilityManager.VideoAdStatus.RESUMED);
                } else {
                    ViewControllerVast.this.mAdController.setVideoVisible(false);
                    ViewControllerVast.this.videoVisibilityManager.reportChange(VideoVisibilityManager.VideoAdStatus.PAUSED);
                }
            } catch (Exception e) {
                HyBid.reportException(e);
                Logger.e(ViewControllerVast.LOG_TAG, "ViewControllerVast.createVisibilityListener: Log: " + Log.getStackTraceString(e));
            }
        }
    };
    private final TextureView.SurfaceTextureListener mCreateTextureListener = new TextureView.SurfaceTextureListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast.2
        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (ViewControllerVast.this.mIsDestroyed) {
                return;
            }
            if (ViewControllerVast.this.mSurface != null) {
                ViewControllerVast.this.mSurface.release();
            }
            ViewControllerVast.this.mSurface = new Surface(surfaceTexture);
            if (ViewControllerVast.this.mAdController.isVideoVisible()) {
                ViewControllerVast.this.mAdController.setVideoVisible(true);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (!ViewControllerVast.this.mIsDestroyed && ViewControllerVast.this.mSurface != null) {
                ViewControllerVast.this.mSurface.release();
                ViewControllerVast.this.mSurface = null;
            }
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    };
    VideoVisibilityManager videoVisibilityManager = VideoVisibilityManager.getInstance();

    /* renamed from: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$models$LearnMoreLocation;
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$models$LearnMoreSize;

        static {
            int[] iArr = new int[LearnMoreSize.values().length];
            $SwitchMap$net$pubnative$lite$sdk$models$LearnMoreSize = iArr;
            try {
                iArr[LearnMoreSize.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$models$LearnMoreSize[LearnMoreSize.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[LearnMoreLocation.values().length];
            $SwitchMap$net$pubnative$lite$sdk$models$LearnMoreLocation = iArr2;
            try {
                iArr2[LearnMoreLocation.BOTTOM_DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$models$LearnMoreLocation[LearnMoreLocation.BOTTOM_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ViewControllerVast(VideoAdController videoAdController, boolean z, Integer num, Boolean bool, boolean z2, AdCloseButtonListener adCloseButtonListener, ReplayListener replayListener, CustomCTAData customCTAData, Integer num2, boolean z3, boolean z4, LearnMoreData learnMoreData) {
        this.remoteConfigInterstitialClickBehaviour = null;
        this.mHasReducedCloseButton = false;
        this.mCustomCTAData = null;
        this.mCustomCTADelay = 0;
        this.mAdController = videoAdController;
        this.mIsFullscreen = z;
        this.mcloseButtonListener = adCloseButtonListener;
        this.mCustomCTAData = customCTAData;
        this.mCustomCTADelay = num2;
        this.mIsBrandAd = z3;
        this.mHasHiddenUx = z4;
        this.mLearnMoreData = learnMoreData;
        this.mRemoteEndCardCloseDelay = num;
        if (bool == null) {
            this.remoteConfigInterstitialClickBehaviour = InterstitialActionBehaviour.HB_CREATIVE;
        } else if (bool.booleanValue()) {
            this.remoteConfigInterstitialClickBehaviour = InterstitialActionBehaviour.HB_CREATIVE;
        } else {
            this.remoteConfigInterstitialClickBehaviour = InterstitialActionBehaviour.HB_ACTION_BUTTON;
        }
        this.mHasReducedCloseButton = z2;
        this.interactor = HyBidActivityInteractor.getInstance();
        this.mReplayListener = replayListener;
    }

    private void changeUxVisibility() {
        FrameLayout frameLayout = this.mUxLayout;
        if (frameLayout != null) {
            hideUx(frameLayout.getVisibility() == 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeSelf() {
        this.mAdController.closeSelf();
    }

    private void configLearnMore(Context context) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int dimensionPixelSize4;
        float dimension;
        if (this.mIsFullscreen && this.mIsBrandAd) {
            TextView textView = (TextView) this.mOpenUrlLayout.findViewById(R.id.openURL);
            ImageView imageView = (ImageView) this.mOpenUrlLayout.findViewById(R.id.openURLIcon);
            ImageView imageView2 = (ImageView) this.mOpenUrlLayout.findViewById(R.id.openURLOldIcon);
            LinearLayout linearLayout = (LinearLayout) this.mOpenUrlLayout.findViewById(R.id.openUrlLayout);
            Resources resources = context.getResources();
            LearnMoreLocation location = this.mLearnMoreData.getLocation();
            if (location != LearnMoreLocation.DEFAULT) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
                int i = AnonymousClass6.$SwitchMap$net$pubnative$lite$sdk$models$LearnMoreLocation[location.ordinal()];
                if (i == 1) {
                    layoutParams.bottomMargin = resources.getDimensionPixelSize(R.dimen.learn_more_bottom_down_margin_bottom);
                    layoutParams.setMarginEnd(resources.getDimensionPixelSize(R.dimen.learn_more_bottom_down_margin_end));
                } else if (i == 2) {
                    int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.learn_more_bottom_up_margin_end);
                    layoutParams.bottomMargin = resources.getDimensionPixelSize(R.dimen.learn_more_bottom_up_margin_bottom);
                    layoutParams.setMarginEnd(dimensionPixelSize5);
                }
                linearLayout.setLayoutParams(layoutParams);
            }
            LearnMoreSize size = this.mLearnMoreData.getSize();
            if (size != LearnMoreSize.DEFAULT) {
                int i2 = AnonymousClass6.$SwitchMap$net$pubnative$lite$sdk$models$LearnMoreSize[size.ordinal()];
                if (i2 == 1) {
                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.learn_more_medium_padding_start);
                    dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.learn_more_medium_padding_top);
                    dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.learn_more_medium_padding_end);
                    dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.learn_more_medium_padding_bottom);
                    dimension = resources.getDimension(R.dimen.learn_more_medium_text_size);
                } else if (i2 != 2) {
                    dimension = 0.0f;
                    dimensionPixelSize = 0;
                    dimensionPixelSize2 = 0;
                    dimensionPixelSize3 = 0;
                    dimensionPixelSize4 = 0;
                } else {
                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.learn_more_large_padding_start);
                    dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.learn_more_large_padding_top);
                    dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.learn_more_large_padding_end);
                    dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.learn_more_large_padding_bottom);
                    float dimension2 = resources.getDimension(R.dimen.learn_more_large_text_size);
                    imageView.setPadding(resources.getDimensionPixelSize(R.dimen.learn_more_icon_large_padding_start), resources.getDimensionPixelSize(R.dimen.learn_more_icon_large_padding_top), resources.getDimensionPixelSize(R.dimen.learn_more_icon_large_padding_end), resources.getDimensionPixelSize(R.dimen.learn_more_icon_large_padding_bottom));
                    dimension = dimension2;
                }
                imageView2.setVisibility(8);
                imageView.setVisibility(0);
                linearLayout.setBackground(resources.getDrawable(R.drawable.learn_more_background));
                textView.setTextColor(resources.getColor(R.color.learn_more_black));
                textView.setContentDescription(size.getSizeName() + "-" + location.getLocationName());
                textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
                textView.setTextSize(0, dimension);
                imageView.setContentDescription(size.getSizeName());
            }
        }
    }

    private SkipOffset getEndCardCloseDelay() {
        Integer num = this.mRemoteEndCardCloseDelay;
        return num != null ? num.intValue() > SkipOffsetManager.getMaximumEndcardCloseDelay().intValue() ? new SkipOffset(SkipOffsetManager.getMaximumEndcardCloseDelay().intValue(), true) : new SkipOffset(this.mRemoteEndCardCloseDelay.intValue(), true) : new SkipOffset(SkipOffsetManager.getDefaultEndcardSkipOffset().intValue(), false);
    }

    private boolean hasCTAExtension(AdParams adParams) {
        return (adParams == null || TextUtils.isEmpty(adParams.getCtaExtensionHtml())) ? false : true;
    }

    private void hideCountdown(boolean z) {
        CountDownView countDownView = this.mSkipCountdownView;
        if (countDownView == null || countDownView.getVisibility() == 8) {
            return;
        }
        if (z) {
            this.mSkipCountdownView.setVisibility(4);
        } else {
            this.mSkipCountdownView.setVisibility(0);
        }
    }

    private void hideMute(boolean z) {
        ImageView imageView = this.mMuteView;
        if (imageView == null || imageView.getVisibility() == 8) {
            return;
        }
        if (z) {
            this.mMuteView.setVisibility(4);
        } else {
            this.mMuteView.setVisibility(0);
        }
    }

    private void hideSkip(boolean z) {
        View view = this.mSkipView;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        if (z) {
            this.mSkipView.setVisibility(4);
            this.mSkipView.setClickable(false);
        } else {
            this.mSkipView.setVisibility(0);
            this.mSkipView.setClickable(true);
        }
    }

    private void initCustomCta(Context context) {
        this.ctaView = new HyBidCTAView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int asIntPixels = ViewUtils.asIntPixels(6.0f, context);
        int i = (new ScreenDimensionsUtils().getScreenDimensionsToPoint(context).y * 10) / 100;
        layoutParams.setMargins(asIntPixels, i, asIntPixels, i);
        layoutParams.gravity = 85;
        this.ctaView.setLayoutParams(layoutParams);
        this.ctaView.setContentDescription("ctaView");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$adjustLayoutParams$4(int i, int i2) {
        this.mVideoPlayerLayout.setLayoutParams(Utils.calculateNewLayoutParams((FrameLayout.LayoutParams) this.mVideoPlayerLayout.getLayoutParams(), i, i2, this.mBannerView.getWidth(), this.mBannerView.getHeight(), Utils.StretchOption.NO_STRETCH));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$adjustLayoutParams$5(final int i, final int i2, View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.mVideoPlayerLayout.post(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                ViewControllerVast.this.lambda$adjustLayoutParams$4(i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$buildVideoAdView$0(View view) {
        changeUxVisibility();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$buildVideoAdView$1(View view) {
        validateOpenURLClicked(null, UrlClickSource.VAST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showEndCard$6() {
        this.mEndCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showEndCard$7(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.mEndCardView.post(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                ViewControllerVast.this.lambda$showEndCard$6();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showHideLearnMore$3(View view) {
        validateOpenURLClicked(null, UrlClickSource.VAST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLastCustomEndCard$8() {
        this.mLastCustomEndCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLastCustomEndCard$9(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.mLastCustomEndCardView.post(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                ViewControllerVast.this.lambda$showLastCustomEndCard$8();
            }
        });
    }

    private void makeParentsVisible(View view, ViewGroup viewGroup) {
        Object parent = view.getParent();
        while ((parent instanceof View) && parent != viewGroup) {
            View view2 = (View) parent;
            if (view2.getVisibility() != 0) {
                view2.setVisibility(0);
            }
            parent = view2.getParent();
        }
    }

    private void setContentInfoVisible(boolean z) {
        if (this.contentInfoView == null) {
            ViewParent parent = this.mBannerView.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof FrameLayout) {
                        FrameLayout frameLayout = (FrameLayout) childAt;
                        int i2 = 0;
                        while (true) {
                            if (i2 < frameLayout.getChildCount()) {
                                View childAt2 = frameLayout.getChildAt(i2);
                                if (childAt2 instanceof PNAPIContentInfoView) {
                                    PNAPIContentInfoView pNAPIContentInfoView = (PNAPIContentInfoView) childAt2;
                                    this.contentInfoView = pNAPIContentInfoView;
                                    if (!this.mIsFullscreen) {
                                        makeParentsVisible(pNAPIContentInfoView, viewGroup);
                                    }
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                }
            }
        }
        PNAPIContentInfoView pNAPIContentInfoView2 = this.contentInfoView;
        if (pNAPIContentInfoView2 != null) {
            pNAPIContentInfoView2.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showHideLearnMore, reason: merged with bridge method [inline-methods] */
    public void lambda$buildVideoAdView$2(InterstitialActionBehaviour interstitialActionBehaviour) {
        if (interstitialActionBehaviour != InterstitialActionBehaviour.HB_CREATIVE) {
            View view = this.mOpenUrlLayout;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        this.mBannerView.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewControllerVast.this.lambda$showHideLearnMore$3(view2);
            }
        });
        View view2 = this.mOpenUrlLayout;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void skipEndCard() {
        this.mAdController.skipEndCard();
    }

    private void skipVideo() {
        this.mAdController.skipVideo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void validateOpenURLClicked(String str, UrlClickSource urlClickSource) {
        if (urlClickSource == UrlClickSource.VAST || urlClickSource == UrlClickSource.CUSTOM_CTA) {
            this.mAdController.getViewabilityAdSession().fireClick();
        }
        this.mAdController.openUrl(str, urlClickSource);
    }

    public void adjustLayoutParams(final int i, final int i2) {
        if (this.mControlsLayout == null) {
            Logger.e(LOG_TAG, "ViewControllerVast.adjustLayoutParams: Log: mControlsLayout is null");
            return;
        }
        this.mVideoPlayerLayout.setLayoutParams(Utils.calculateNewLayoutParams((FrameLayout.LayoutParams) this.mVideoPlayerLayout.getLayoutParams(), i, i2, this.mBannerView.getWidth(), this.mBannerView.getHeight(), Utils.StretchOption.NO_STRETCH));
        this.mVideoPlayerLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda9
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                ViewControllerVast.this.lambda$adjustLayoutParams$5(i, i2, view, i3, i4, i5, i6, i7, i8, i9, i10);
            }
        });
    }

    public void buildVideoAdView(VideoAdView videoAdView) {
        Context context = videoAdView.getContext();
        this.mBannerView = videoAdView;
        videoAdView.setVisibilityListener(this.mCreateVisibilityListener);
        videoAdView.removeAllViews();
        this.mControlsLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.controls, (ViewGroup) videoAdView, false);
        this.mOpenUrlLayout = LayoutInflater.from(context).inflate(R.layout.open_url, (ViewGroup) videoAdView, false);
        configLearnMore(context);
        this.mUxLayout = (FrameLayout) this.mControlsLayout.findViewById(R.id.uxLayout);
        initCustomCta(context);
        boolean z = this.mIsFullscreen;
        if (z && this.mIsBrandAd) {
            View view = this.mOpenUrlLayout;
            if (view != null) {
                view.setVisibility(0);
            }
            if (this.mHasHiddenUx) {
                this.mBannerView.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ViewControllerVast.this.lambda$buildVideoAdView$0(view2);
                    }
                });
                this.mUxLayout.setVisibility(4);
            }
        } else {
            final InterstitialActionBehaviour interstitialActionBehaviour = this.remoteConfigInterstitialClickBehaviour;
            if (interstitialActionBehaviour == null) {
                interstitialActionBehaviour = INTERSTITIAL_CLICK_BEHAVIOUR_DEFAULT;
            }
            if (this.mCustomCTAData == null || !z) {
                lambda$buildVideoAdView$2(interstitialActionBehaviour);
            } else {
                View view2 = this.mOpenUrlLayout;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                this.mBannerView.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        ViewControllerVast.this.lambda$buildVideoAdView$1(view3);
                    }
                });
                showCTAButton(this.mCustomCTAData, this.mCustomCTADelay, new InvalidCTAUrlListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda2
                    @Override // net.pubnative.lite.sdk.vpaid.InvalidCTAUrlListener
                    public final void invalidCTAUrl() {
                        ViewControllerVast.this.lambda$buildVideoAdView$2(interstitialActionBehaviour);
                    }
                });
            }
        }
        this.mVideoPlayerLayout = (FrameLayout) this.mControlsLayout.findViewById(R.id.videoPlayerLayout);
        if (hasCTAExtension(this.mAdController.getAdParams())) {
            RelativeLayout relativeLayout = new RelativeLayout(this.mVideoPlayerLayout.getContext());
            TextureView textureView = new TextureView(relativeLayout.getContext());
            this.mVideoPlayerLayoutTexture = textureView;
            textureView.setId(R.id.textureView);
            relativeLayout.addView(this.mVideoPlayerLayoutTexture, new RelativeLayout.LayoutParams(-1, -1));
            this.mVideoPlayerLayout.addView(relativeLayout, 0, new FrameLayout.LayoutParams(-1, -1));
        } else {
            TextureView textureView2 = new TextureView(this.mVideoPlayerLayout.getContext());
            this.mVideoPlayerLayoutTexture = textureView2;
            textureView2.setId(R.id.textureView);
            this.mVideoPlayerLayout.addView(this.mVideoPlayerLayoutTexture, 0, new FrameLayout.LayoutParams(-1, -1));
        }
        HyBidEndCardView hyBidEndCardView = new HyBidEndCardView(context, this.mHasReducedCloseButton, this.mReplayListener);
        this.mEndCardView = hyBidEndCardView;
        hyBidEndCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mEndCardView.setVisibility(8);
        HyBidEndCardView hyBidEndCardView2 = new HyBidEndCardView(context, this.mHasReducedCloseButton, this.mReplayListener);
        this.mLastCustomEndCardView = hyBidEndCardView2;
        hyBidEndCardView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mLastCustomEndCardView.setVisibility(8);
        this.mOpenUrlLayout.findViewById(R.id.openURL).setOnClickListener(this);
        this.mOpenUrlLayout.findViewById(R.id.openURLIcon).setOnClickListener(this);
        this.mOpenUrlLayout.findViewById(R.id.openURLOldIcon).setOnClickListener(this);
        CountDownView createCountdownView = new CountDownViewFactory().createCountdownView(context, COUNTDOWN_STYLE_DEFAULT, this.mControlsLayout);
        this.mSkipCountdownView = createCountdownView;
        this.mControlsLayout.addView(createCountdownView);
        this.mLinearCountdownView = new LinearCountDownView(this.mControlsLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388691;
        this.mLinearCountdownView.setLayoutParams(layoutParams);
        this.mUxLayout.addView(this.mLinearCountdownView);
        TextureView textureView3 = this.mVideoPlayerLayoutTexture;
        if (textureView3 != null) {
            textureView3.setSurfaceTextureListener(this.mCreateTextureListener);
        }
        ImageView imageView = (ImageView) this.mControlsLayout.findViewById(R.id.muteView);
        this.mMuteView = imageView;
        imageView.setOnClickListener(this);
        if (this.mIsBrandAd && this.mHasHiddenUx) {
            hideCountdown(true);
            hideMute(true);
        }
        this.mSkipView = this.mControlsLayout.findViewById(R.id.skipView);
        if (this.mHasReducedCloseButton) {
            int convertDpToPixel = (int) ViewUtils.convertDpToPixel(20.0f, context);
            int convertDpToPixel2 = (int) ViewUtils.convertDpToPixel(8.0f, context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(convertDpToPixel, convertDpToPixel);
            layoutParams2.setMargins(convertDpToPixel2, convertDpToPixel2, 0, 0);
            this.mSkipView.setId(R.id.skipView_small);
            this.mSkipView.setLayoutParams(layoutParams2);
            this.mSkipView.setPadding(0, 0, 0, 0);
            this.mSkipView.requestLayout();
        }
        Bitmap bitmap = BitmapHelper.toBitmap(this.mSkipView.getContext(), HyBid.getSkipXmlResource(), Integer.valueOf(R.mipmap.skip));
        if (bitmap != null) {
            ((ImageView) this.mSkipView).setImageBitmap(bitmap);
        } else {
            View view3 = this.mSkipView;
            ((ImageView) view3).setImageBitmap(BitmapHelper.decodeResource(view3.getContext(), Integer.valueOf(R.mipmap.skip)));
        }
        this.mSkipView.setOnClickListener(this);
        this.mAdController.addViewabilityFriendlyObstruction(this.mControlsLayout, BaseFriendlyObstructionPurpose.VIDEO_CONTROLS, "Video controls");
        videoAdView.addView(this.mControlsLayout);
        videoAdView.addView(this.mEndCardView);
        videoAdView.addView(this.mLastCustomEndCardView);
        videoAdView.addView(this.ctaView);
        videoAdView.addView(this.mOpenUrlLayout);
    }

    public void destroy() {
        this.mIsDestroyed = true;
        this.mUiHandler.removeCallbacksAndMessages(null);
        TextureView textureView = this.mVideoPlayerLayoutTexture;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
            this.mVideoPlayerLayoutTexture = null;
        }
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
            this.mSurface = null;
        }
        HyBidEndCardView hyBidEndCardView = this.mEndCardView;
        if (hyBidEndCardView != null) {
            hyBidEndCardView.destroy();
        }
        HyBidCTAView hyBidCTAView = this.ctaView;
        if (hyBidCTAView != null) {
            hyBidCTAView.destroy();
        }
        HyBidEndCardView hyBidEndCardView2 = this.mLastCustomEndCardView;
        if (hyBidEndCardView2 != null) {
            hyBidEndCardView2.destroy();
        }
    }

    public void dismiss() {
        this.mUiHandler.removeCallbacksAndMessages(null);
        VideoAdView videoAdView = this.mBannerView;
        if (videoAdView != null) {
            videoAdView.removeAllViews();
        }
    }

    public void endSkip(Boolean bool, Boolean bool2) {
        CountDownView countDownView = this.mSkipCountdownView;
        if (countDownView != null) {
            countDownView.setVisibility(8);
            if (bool.booleanValue()) {
                showCloseButton();
            } else if (bool2.booleanValue()) {
                showSkipButton();
            } else {
                showCloseButton();
            }
        }
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public TextureView getTexture() {
        return this.mVideoPlayerLayoutTexture;
    }

    public void hideEndcards() {
        HyBidEndCardView hyBidEndCardView = this.mEndCardView;
        if (hyBidEndCardView != null) {
            hyBidEndCardView.setVisibility(8);
        }
        HyBidEndCardView hyBidEndCardView2 = this.mLastCustomEndCardView;
        if (hyBidEndCardView2 != null) {
            hyBidEndCardView2.setVisibility(8);
        }
        View view = this.mOpenUrlLayout;
        boolean z = false;
        if (view != null && (this.remoteConfigInterstitialClickBehaviour != InterstitialActionBehaviour.HB_CREATIVE || this.mIsBrandAd)) {
            view.setVisibility(0);
        }
        HyBidCTAView hyBidCTAView = this.ctaView;
        if (hyBidCTAView != null && this.mIsCustomCTA) {
            hyBidCTAView.setVisibility(0);
        }
        LinearCountDownView linearCountDownView = this.mLinearCountdownView;
        if (linearCountDownView != null) {
            linearCountDownView.setVisibility(0);
        }
        setTimerVisible(true);
        if (this.mHasHiddenUx && this.mIsBrandAd) {
            z = true;
        }
        hideUx(z);
        setContentInfoVisible(true);
    }

    public void hideMuteButton() {
        ImageView imageView = this.mMuteView;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    public void hideSkipButton() {
        View view = this.mSkipView;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void hideUx(boolean z) {
        FrameLayout frameLayout = this.mUxLayout;
        if (frameLayout != null) {
            if (z) {
                frameLayout.setVisibility(4);
                hideCountdown(true);
                hideMute(true);
                hideSkip(true);
                return;
            }
            frameLayout.setVisibility(0);
            hideCountdown(false);
            hideMute(false);
            hideSkip(false);
        }
    }

    public boolean isEndCard() {
        HyBidEndCardView hyBidEndCardView = this.mEndCardView;
        return (hyBidEndCardView == null || hyBidEndCardView.getVisibility() == 8) ? false : true;
    }

    public boolean isMute() {
        return this.mMuteState;
    }

    public void muteVideo() {
        boolean z = !this.mMuteState;
        this.mMuteState = z;
        this.mAdController.setVolume(z);
        ImageView imageView = this.mMuteView;
        if (imageView != null) {
            if (this.mMuteState) {
                imageView.setImageResource(R.mipmap.mute);
                this.mMuteView.setContentDescription("muteButton");
            } else {
                imageView.setImageResource(R.mipmap.unmute);
                this.mMuteView.setContentDescription("unmuteButton");
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.close_view) {
            closeSelf();
            return;
        }
        if (view.getId() == R.id.skipView || view.getId() == R.id.progressSkipView || view.getId() == R.id.skipView_small) {
            skipVideo();
            return;
        }
        if (view.getId() == R.id.muteView) {
            muteVideo();
        } else if (view.getId() == R.id.openURL || view.getId() == R.id.openURLIcon || view.getId() == R.id.openURLOldIcon) {
            validateOpenURLClicked(null, UrlClickSource.VAST);
        }
    }

    public void pause() {
        HyBidCTAView hyBidCTAView = this.ctaView;
        if (hyBidCTAView != null) {
            hyBidCTAView.pause();
        }
    }

    public void pauseEndCardCloseButtonTimer() {
        HyBidEndCardView hyBidEndCardView = this.mEndCardView;
        if (hyBidEndCardView != null) {
            hyBidEndCardView.pause();
        }
        HyBidEndCardView hyBidEndCardView2 = this.mLastCustomEndCardView;
        if (hyBidEndCardView2 != null) {
            hyBidEndCardView2.pause();
        }
    }

    public void postDelayed(Runnable runnable, long j) {
        if (this.mBannerView == null || this.mIsDestroyed) {
            return;
        }
        this.mUiHandler.postDelayed(runnable, j);
    }

    public void recoverGoneCountdownView() {
        CountDownView countDownView = this.mSkipCountdownView;
        if (countDownView != null) {
            countDownView.setVisibility(4);
        }
    }

    public void resetProgress() {
        LinearCountDownView linearCountDownView = this.mLinearCountdownView;
        if (linearCountDownView != null) {
            linearCountDownView.reset();
        }
    }

    public void resume() {
        HyBidCTAView hyBidCTAView = this.ctaView;
        if (hyBidCTAView != null) {
            hyBidCTAView.resume();
        }
    }

    public void resumeEndCardCloseButtonTimer() {
        HyBidEndCardView hyBidEndCardView = this.mEndCardView;
        if (hyBidEndCardView != null) {
            hyBidEndCardView.resume();
        }
        HyBidEndCardView hyBidEndCardView2 = this.mLastCustomEndCardView;
        if (hyBidEndCardView2 != null) {
            hyBidEndCardView2.resume();
        }
    }

    public void setProgress(int i, int i2) {
        LinearCountDownView linearCountDownView = this.mLinearCountdownView;
        if (linearCountDownView != null) {
            linearCountDownView.setProgress(i2 - i, i2);
        }
    }

    public void setSkipProgress(int i, int i2) {
        CountDownView countDownView = this.mSkipCountdownView;
        if (countDownView != null) {
            countDownView.setProgress(i2 - i, i2);
        }
    }

    public void setTimerVisible(boolean z) {
        int i = z ? 0 : 4;
        LinearCountDownView linearCountDownView = this.mLinearCountdownView;
        if (linearCountDownView != null) {
            linearCountDownView.setVisibility(i);
        }
    }

    public void showCTAButton(CustomCTAData customCTAData, Integer num, final InvalidCTAUrlListener invalidCTAUrlListener) {
        if (this.ctaView == null || TextUtils.isEmpty(customCTAData.getIconURL())) {
            VideoAdController videoAdController = this.mAdController;
            if (videoAdController != null) {
                videoAdController.onCustomCTALoadFail();
                return;
            }
            return;
        }
        this.ctaView.setListener(new HyBidCTAView.CTAViewListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast.5
            @Override // net.pubnative.lite.sdk.views.cta.HyBidCTAView.CTAViewListener
            public void onClick() {
                if (ViewControllerVast.this.mAdController != null) {
                    ViewControllerVast.this.mAdController.onCustomCTAClick(ViewControllerVast.this.isEndCard());
                }
                if (ViewControllerVast.this.mAdController != null) {
                    ViewControllerVast.this.validateOpenURLClicked(null, UrlClickSource.CUSTOM_CTA);
                }
            }

            @Override // net.pubnative.lite.sdk.views.cta.HyBidCTAView.CTAViewListener
            public void onFail() {
                if (ViewControllerVast.this.mAdController != null) {
                    ViewControllerVast.this.mAdController.onCustomCTALoadFail();
                }
            }

            @Override // net.pubnative.lite.sdk.views.cta.HyBidCTAView.CTAViewListener
            public void onInvalidCTAIconUrl() {
                if (ViewControllerVast.this.mAdController != null) {
                    ViewControllerVast.this.mAdController.onCustomCTALoadFail();
                }
                InvalidCTAUrlListener invalidCTAUrlListener2 = invalidCTAUrlListener;
                if (invalidCTAUrlListener2 != null) {
                    invalidCTAUrlListener2.invalidCTAUrl();
                }
            }

            @Override // net.pubnative.lite.sdk.views.cta.HyBidCTAView.CTAViewListener
            public void onShow() {
                if (ViewControllerVast.this.mAdController != null) {
                    ViewControllerVast.this.mAdController.onCustomCTAShow();
                    ViewControllerVast.this.mIsCustomCTA = true;
                }
            }
        });
        if (customCTAData.getBitmap() != null) {
            this.ctaView.show(customCTAData.getBitmap(), customCTAData.getLabel(), num);
        } else {
            this.ctaView.show(customCTAData.getIconURL(), customCTAData.getLabel(), num);
        }
    }

    public void showCloseButton() {
        AdCloseButtonListener adCloseButtonListener = this.mcloseButtonListener;
        if (adCloseButtonListener != null) {
            adCloseButtonListener.showButton();
        }
    }

    public void showCountdownTimer() {
        CountDownView countDownView = this.mSkipCountdownView;
        if (countDownView != null) {
            countDownView.setVisibility(0);
        }
    }

    public void showEndCard(EndCardData endCardData, String str, Boolean bool, CloseButtonListener closeButtonListener) {
        HyBidEndCardView hyBidEndCardView = this.mEndCardView;
        if (hyBidEndCardView != null) {
            hyBidEndCardView.setEndCardViewListener(new HyBidEndCardView.EndCardViewListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast.3
                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onClick(String str2, Boolean bool2, String str3) {
                    if (bool2.booleanValue()) {
                        ViewControllerVast.this.validateOpenURLClicked(null, UrlClickSource.CUSTOM_END_CARD);
                        ViewControllerVast.this.mAdController.onCustomEndCardClick(str3);
                    } else {
                        ViewControllerVast.this.validateOpenURLClicked(str2, UrlClickSource.DEFAULT_END_CARD);
                        ViewControllerVast.this.mAdController.onDefaultEndCardClick(str3);
                    }
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onClose(Boolean bool2) {
                    if (ViewControllerVast.this.mAdController != null) {
                        ViewControllerVast.this.mAdController.onEndCardClosed(bool2);
                    }
                    ViewControllerVast.this.closeSelf();
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onLoadFail(Boolean bool2) {
                    if (ViewControllerVast.this.mAdController != null) {
                        ViewControllerVast.this.mAdController.onEndCardLoadFail(bool2);
                    }
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onLoadSuccess(Boolean bool2) {
                    if (ViewControllerVast.this.mAdController != null) {
                        ViewControllerVast.this.mAdController.onEndCardLoadSuccess(bool2);
                    }
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onShow(Boolean bool2, String str2) {
                    if (ViewControllerVast.this.mOpenUrlLayout != null) {
                        ViewControllerVast.this.mOpenUrlLayout.setVisibility(8);
                    }
                    if (!bool2.booleanValue()) {
                        ViewControllerVast.this.mAdController.onDefaultEndCardShow(str2);
                        if (ViewControllerVast.this.ctaView != null) {
                            ViewControllerVast.this.ctaView.show();
                            return;
                        }
                        return;
                    }
                    ViewControllerVast.this.mAdController.onCustomEndCardShow(str2);
                    ViewControllerVast.this.mEndCardView.bringToFront();
                    if (ViewControllerVast.this.ctaView != null) {
                        ViewControllerVast.this.ctaView.hide();
                    }
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onSkip() {
                    ViewControllerVast.this.skipEndCard();
                }
            });
            this.mEndCardView.setSkipOffset(getEndCardCloseDelay());
            this.mEndCardView.show(endCardData, str);
            this.mEndCardView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda4
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    ViewControllerVast.this.lambda$showEndCard$7(view, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
            if (this.mIsFullscreen) {
                if (bool.booleanValue()) {
                    this.mEndCardView.showCloseButton(closeButtonListener);
                } else {
                    this.mEndCardView.showSkipButton();
                }
            }
        }
    }

    public void showEndcards() {
        HyBidEndCardView hyBidEndCardView = this.mEndCardView;
        if (hyBidEndCardView != null) {
            hyBidEndCardView.setVisibility(0);
        }
        HyBidEndCardView hyBidEndCardView2 = this.mLastCustomEndCardView;
        if (hyBidEndCardView2 != null) {
            hyBidEndCardView2.setVisibility(0);
        }
        View view = this.mOpenUrlLayout;
        if (view != null) {
            view.setVisibility(8);
        }
        HyBidCTAView hyBidCTAView = this.ctaView;
        if (hyBidCTAView != null && this.mIsCustomCTA) {
            hyBidCTAView.setVisibility(8);
        }
        LinearCountDownView linearCountDownView = this.mLinearCountdownView;
        if (linearCountDownView != null) {
            linearCountDownView.setVisibility(8);
            resetProgress();
        }
        setTimerVisible(false);
        hideUx(true);
        setContentInfoVisible(false);
    }

    public void showLastCustomEndCard(EndCardData endCardData, String str, CloseButtonListener closeButtonListener) {
        HyBidEndCardView hyBidEndCardView = this.mLastCustomEndCardView;
        if (hyBidEndCardView != null) {
            hyBidEndCardView.setEndCardViewListener(new HyBidEndCardView.EndCardViewListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast.4
                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onClick(String str2, Boolean bool, String str3) {
                    if (bool.booleanValue()) {
                        ViewControllerVast.this.validateOpenURLClicked(null, UrlClickSource.CUSTOM_END_CARD);
                        ViewControllerVast.this.mAdController.onCustomEndCardClick(str3);
                    } else {
                        ViewControllerVast.this.validateOpenURLClicked(str2, UrlClickSource.DEFAULT_END_CARD);
                        ViewControllerVast.this.mAdController.onDefaultEndCardClick(str3);
                    }
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onClose(Boolean bool) {
                    if (ViewControllerVast.this.mAdController != null) {
                        ViewControllerVast.this.mAdController.onEndCardClosed(bool);
                    }
                    ViewControllerVast.this.closeSelf();
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onLoadFail(Boolean bool) {
                    if (ViewControllerVast.this.mAdController != null) {
                        ViewControllerVast.this.mAdController.onEndCardLoadFail(bool);
                    }
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onLoadSuccess(Boolean bool) {
                    if (ViewControllerVast.this.mAdController != null) {
                        ViewControllerVast.this.mAdController.onEndCardLoadSuccess(bool);
                    }
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onShow(Boolean bool, String str2) {
                    if (ViewControllerVast.this.mOpenUrlLayout != null) {
                        ViewControllerVast.this.mOpenUrlLayout.setVisibility(8);
                    }
                    if (!bool.booleanValue()) {
                        ViewControllerVast.this.mAdController.onDefaultEndCardShow(str2);
                        if (ViewControllerVast.this.ctaView != null) {
                            ViewControllerVast.this.ctaView.show();
                            return;
                        }
                        return;
                    }
                    ViewControllerVast.this.mAdController.onCustomEndCardShow(str2);
                    ViewControllerVast.this.mLastCustomEndCardView.bringToFront();
                    if (ViewControllerVast.this.ctaView != null) {
                        ViewControllerVast.this.ctaView.hide();
                    }
                }

                @Override // net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.EndCardViewListener
                public void onSkip() {
                    ViewControllerVast.this.skipEndCard();
                }
            });
            this.mLastCustomEndCardView.setSkipOffset(getEndCardCloseDelay());
            this.mEndCardView.hideSkipButton();
            this.mLastCustomEndCardView.show(endCardData, str);
            this.mLastCustomEndCardView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    ViewControllerVast.this.lambda$showLastCustomEndCard$9(view, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
            if (this.mIsFullscreen) {
                this.mLastCustomEndCardView.showCloseButton(closeButtonListener);
            }
        }
    }

    public void showSkipButton() {
        View view = this.mSkipView;
        if (view != null) {
            if (!this.mIsBrandAd) {
                view.setVisibility(0);
                this.mSkipView.setClickable(true);
            } else if (this.mUxLayout.getVisibility() == 0) {
                this.mSkipView.setVisibility(0);
                this.mSkipView.setClickable(true);
            } else {
                this.mSkipView.setVisibility(4);
                this.mSkipView.setClickable(false);
            }
        }
    }
}
