package net.pubnative.lite.sdk.views.endcard;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.internal.widget.DivLayoutParams;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.CountdownStyle;
import net.pubnative.lite.sdk.R;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.models.SkipOffset;
import net.pubnative.lite.sdk.mraid.MRAIDBanner;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener;
import net.pubnative.lite.sdk.mraid.MRAIDView;
import net.pubnative.lite.sdk.mraid.MRAIDViewListener;
import net.pubnative.lite.sdk.network.PNHttpClient;
import net.pubnative.lite.sdk.utils.SkipOffsetManager;
import net.pubnative.lite.sdk.utils.ViewUtils;
import net.pubnative.lite.sdk.views.CustomImageView;
import net.pubnative.lite.sdk.views.endcard.HyBidEndCardView;
import net.pubnative.lite.sdk.vpaid.CloseButtonListener;
import net.pubnative.lite.sdk.vpaid.ReplayListener;
import net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer;
import net.pubnative.lite.sdk.vpaid.utils.ImageUtils;
import net.pubnative.lite.sdk.vpaid.widget.CountDownView;
import net.pubnative.lite.sdk.vpaid.widget.CountDownViewFactory;

/* loaded from: classes12.dex */
public class HyBidEndCardView extends FrameLayout {
    private static final CountdownStyle COUNTDOWN_STYLE_DEFAULT = CountdownStyle.PIE_CHART;
    private String endCardType;
    private EndCardViewListener endcardViewListener;
    private GestureDetector gestureDetector;
    private boolean hasReducedClose;
    private FrameLayout htmlEndCardContainer;
    private Boolean isCustomEndCard;
    private boolean isViewShowingCloseButton;
    private boolean isViewShowingSkipButton;
    private CountDownView mCloseCountdownView;
    private SimpleTimer mCloseEndcardTimer;
    private ImageView mCloseView;
    private MRAIDBanner mHtmlEndCardView;
    private SimpleTimer mSkipEndcardTimer;
    private ImageView mSkipView;
    private MRAIDNativeFeatureListener mraidNativeFeatureListener;
    private final MRAIDViewListener mraidViewListener;
    private ReplayListener replayListener;
    private SkipOffset skipOffset;
    private ImageView staticEndCardView;

    public interface EndCardViewListener {
        void onClick(String str, Boolean bool, String str2);

        void onClose(Boolean bool);

        void onLoadFail(Boolean bool);

        void onLoadSuccess(Boolean bool);

        void onShow(Boolean bool, String str);

        void onSkip();
    }

    public HyBidEndCardView(Context context) {
        super(context);
        this.isViewShowingCloseButton = false;
        this.isViewShowingSkipButton = false;
        this.endCardType = "";
        this.skipOffset = new SkipOffset(SkipOffsetManager.getDefaultEndcardSkipOffset().intValue(), false);
        this.isCustomEndCard = Boolean.FALSE;
        this.hasReducedClose = false;
        this.mraidViewListener = new MRAIDViewListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.1

            /* renamed from: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView$1$1, reason: invalid class name and collision with other inner class name */
            class ViewTreeObserverOnDrawListenerC18191 implements ViewTreeObserver.OnDrawListener {
                ViewTreeObserverOnDrawListenerC18191() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$onDraw$0() {
                    if (HyBidEndCardView.this.htmlEndCardContainer != null) {
                        HyBidEndCardView.this.htmlEndCardContainer.getViewTreeObserver().removeOnDrawListener(this);
                    }
                }

                @Override // android.view.ViewTreeObserver.OnDrawListener
                public void onDraw() {
                    if (HyBidEndCardView.this.htmlEndCardContainer != null) {
                        HyBidEndCardView.this.htmlEndCardContainer.post(new Runnable() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView$1$1$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                HyBidEndCardView.AnonymousClass1.ViewTreeObserverOnDrawListenerC18191.this.lambda$onDraw$0();
                            }
                        });
                    }
                    if (HyBidEndCardView.this.mHtmlEndCardView == null || HyBidEndCardView.this.mHtmlEndCardView.getMeasuredHeight() >= 50) {
                        return;
                    }
                    HyBidEndCardView.this.mHtmlEndCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidHideCloseButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidHideSkipButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidShowCloseButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidShowSkipButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewClose(MRAIDView mRAIDView) {
                if (HyBidEndCardView.this.endcardViewListener != null) {
                    HyBidEndCardView.this.endcardViewListener.onClose(HyBidEndCardView.this.isCustomEndCard);
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewError(MRAIDView mRAIDView) {
                HyBidEndCardView.this.endcardViewListener.onLoadFail(HyBidEndCardView.this.isCustomEndCard);
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewExpand(MRAIDView mRAIDView) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewLoaded(MRAIDView mRAIDView) {
                if (HyBidEndCardView.this.endcardViewListener != null) {
                    HyBidEndCardView.this.endcardViewListener.onLoadSuccess(HyBidEndCardView.this.isCustomEndCard);
                    HyBidEndCardView.this.endcardViewListener.onShow(HyBidEndCardView.this.isCustomEndCard, HyBidEndCardView.this.endCardType);
                }
                HyBidEndCardView.this.mHtmlEndCardView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC18191());
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public boolean mraidViewResize(MRAIDView mRAIDView, int i, int i2, int i3, int i4) {
                return false;
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTAClick() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTALoadFail() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTAShow() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardClicked() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardClosed() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardLoadFail() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardLoadSuccess() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardShow(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onExpandedAdClosed() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onReplayClicked() {
                if (HyBidEndCardView.this.replayListener != null) {
                    HyBidEndCardView.this.replayListener.replayVast();
                }
            }
        };
        this.mraidNativeFeatureListener = new MRAIDNativeFeatureListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.2
            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureCallTel(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureCreateCalendarEvent(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureOpenBrowser(String str) {
                if (HyBidEndCardView.this.endcardViewListener != null) {
                    HyBidEndCardView.this.endcardViewListener.onClick(str, HyBidEndCardView.this.isCustomEndCard, HyBidEndCardView.this.endCardType);
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeaturePlayVideo(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureSendSms(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureStorePicture(String str) {
            }
        };
        init(context);
    }

    private void clearEndCardViews() {
        FrameLayout frameLayout = this.htmlEndCardContainer;
        if (frameLayout != null) {
            removeView(frameLayout);
            this.htmlEndCardContainer = null;
        }
        ImageView imageView = this.staticEndCardView;
        if (imageView != null) {
            removeView(imageView);
            this.staticEndCardView.setImageDrawable(null);
            this.staticEndCardView = null;
            MRAIDBanner mRAIDBanner = this.mHtmlEndCardView;
            if (mRAIDBanner != null) {
                mRAIDBanner.destroy();
            }
        }
    }

    private void configUi(EndCardData endCardData) {
        if (endCardData == null) {
            return;
        }
        if (endCardData.isCustom().booleanValue()) {
            setBackgroundColor(0);
        } else {
            setBackgroundColor(-16777216);
        }
    }

    private FrameLayout createHtmlEndCardContainer() {
        if (!isValidContext()) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setVisibility(8);
        frameLayout.setBackgroundColor(0);
        return frameLayout;
    }

    private ImageView createStaticEndCardView() {
        if (!isValidContext()) {
            return null;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        CustomImageView customImageView = new CustomImageView(getContext());
        customImageView.setLayoutParams(layoutParams);
        customImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        customImageView.setVisibility(8);
        customImageView.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HyBidEndCardView.this.lambda$createStaticEndCardView$2(view);
            }
        });
        this.endCardType = "static";
        return customImageView;
    }

    private void ensureOverlayOrder() {
        ImageView imageView = this.mSkipView;
        if (imageView != null) {
            imageView.bringToFront();
        }
        ImageView imageView2 = this.mCloseView;
        if (imageView2 != null) {
            imageView2.bringToFront();
        }
        CountDownView countDownView = this.mCloseCountdownView;
        if (countDownView != null) {
            countDownView.bringToFront();
        }
        postInvalidateOnAnimation();
    }

    private void init(Context context) {
        initUi();
        initControlViews(context);
    }

    private void initControlViews(Context context) {
        if (!isValidContext()) {
            EndCardViewListener endCardViewListener = this.endcardViewListener;
            if (endCardViewListener != null) {
                endCardViewListener.onLoadFail(this.isCustomEndCard);
                return;
            }
            return;
        }
        int convertDpToPixel = (int) ViewUtils.convertDpToPixel(30.0f, getContext());
        if (this.hasReducedClose) {
            convertDpToPixel = (int) ViewUtils.convertDpToPixel(20.0f, getContext());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(convertDpToPixel, convertDpToPixel);
        layoutParams.gravity = 8388611;
        int convertDpToPixel2 = (int) ViewUtils.convertDpToPixel(8.0f, getContext());
        layoutParams.setMargins(convertDpToPixel2, convertDpToPixel2, 0, 0);
        ImageView imageView = new ImageView(getContext());
        this.mSkipView = imageView;
        if (this.hasReducedClose) {
            imageView.setId(R.id.end_card_skip_view_small);
        } else {
            imageView.setId(R.id.end_card_skip_view);
        }
        this.mSkipView.setLayoutParams(layoutParams);
        this.mSkipView.setImageResource(R.mipmap.skip);
        this.mSkipView.setVisibility(8);
        this.mSkipView.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HyBidEndCardView.this.lambda$initControlViews$0(view);
            }
        });
        ImageView imageView2 = new ImageView(getContext());
        this.mCloseView = imageView2;
        if (this.hasReducedClose) {
            imageView2.setId(R.id.button_fullscreen_close_small);
        } else {
            imageView2.setId(R.id.button_fullscreen_close);
        }
        CountDownView createCountdownView = new CountDownViewFactory().createCountdownView(context, COUNTDOWN_STYLE_DEFAULT, this);
        this.mCloseCountdownView = createCountdownView;
        createCountdownView.setId(R.id.endcard_close_countdown_view);
        int convertDpToPixel3 = (int) ViewUtils.convertDpToPixel(this.hasReducedClose ? 60.0f : 80.0f, context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(convertDpToPixel3, convertDpToPixel3);
        layoutParams2.gravity = DivLayoutParams.DEFAULT_GRAVITY;
        layoutParams2.setMargins(convertDpToPixel2, convertDpToPixel2, convertDpToPixel2, convertDpToPixel2);
        this.mCloseCountdownView.setLayoutParams(layoutParams2);
        this.mCloseCountdownView.setVisibility(8);
        this.mCloseView.setLayoutParams(layoutParams);
        this.mCloseView.setImageResource(R.mipmap.close);
        this.mCloseView.setVisibility(8);
        this.mCloseView.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HyBidEndCardView.this.lambda$initControlViews$1(view);
            }
        });
        addView(this.mSkipView);
        addView(this.mCloseView);
        addView(this.mCloseCountdownView);
    }

    private void initUi() {
        if (isValidContext()) {
            setVisibility(8);
            setBackgroundColor(0);
            try {
                this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.3
                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                        return true;
                    }
                });
                return;
            } catch (Exception unused) {
                return;
            }
        }
        EndCardViewListener endCardViewListener = this.endcardViewListener;
        if (endCardViewListener != null) {
            endCardViewListener.onLoadFail(this.isCustomEndCard);
        }
    }

    private boolean isValidContext() {
        return getContext() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createStaticEndCardView$2(View view) {
        EndCardViewListener endCardViewListener = this.endcardViewListener;
        if (endCardViewListener != null) {
            endCardViewListener.onClick(null, this.isCustomEndCard, this.endCardType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initControlViews$0(View view) {
        EndCardViewListener endCardViewListener = this.endcardViewListener;
        if (endCardViewListener != null) {
            endCardViewListener.onSkip();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initControlViews$1(View view) {
        EndCardViewListener endCardViewListener = this.endcardViewListener;
        if (endCardViewListener != null) {
            endCardViewListener.onClose(this.isCustomEndCard);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showCloseButton$4(CloseButtonListener closeButtonListener) {
        this.mCloseView.setVisibility(0);
        this.mCloseView.bringToFront();
        if (closeButtonListener != null) {
            closeButtonListener.onCloseButtonVisible();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showSkipButton$3() {
        this.mSkipView.setVisibility(0);
        this.mSkipView.bringToFront();
    }

    private void removeExistingEndcardViews() {
        ImageView imageView = this.staticEndCardView;
        if (imageView != null) {
            removeView(imageView);
            this.staticEndCardView = null;
        }
        FrameLayout frameLayout = this.htmlEndCardContainer;
        if (frameLayout != null) {
            removeView(frameLayout);
            this.htmlEndCardContainer = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderHtmlEndcard(String str, boolean z) {
        if (!isValidContext()) {
            this.endcardViewListener.onLoadFail(this.isCustomEndCard);
            return;
        }
        Context context = getContext();
        Boolean bool = Boolean.FALSE;
        MRAIDBanner mRAIDBanner = new MRAIDBanner(context, "", str, bool, bool, new String[0], this.mraidViewListener, this.mraidNativeFeatureListener, null);
        this.mHtmlEndCardView = mRAIDBanner;
        mRAIDBanner.setSkipOffset(Integer.valueOf(this.skipOffset.getOffset()));
        this.mHtmlEndCardView.setUseCustomClose(Boolean.TRUE);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.gravity = 16;
        this.mHtmlEndCardView.setLayoutParams(layoutParams);
        FrameLayout frameLayout = this.htmlEndCardContainer;
        if (frameLayout == null) {
            EndCardViewListener endCardViewListener = this.endcardViewListener;
            if (endCardViewListener != null) {
                endCardViewListener.onLoadFail(this.isCustomEndCard);
                return;
            }
            return;
        }
        frameLayout.addView(this.mHtmlEndCardView);
        ensureOverlayOrder();
        EndCardViewListener endCardViewListener2 = this.endcardViewListener;
        if (endCardViewListener2 != null) {
            endCardViewListener2.onLoadSuccess(this.isCustomEndCard);
            this.endcardViewListener.onShow(this.isCustomEndCard, this.endCardType);
        }
    }

    public void destroy() {
        SimpleTimer simpleTimer = this.mSkipEndcardTimer;
        if (simpleTimer != null) {
            simpleTimer.cancel();
        }
        SimpleTimer simpleTimer2 = this.mCloseEndcardTimer;
        if (simpleTimer2 != null) {
            simpleTimer2.cancel();
        }
        clearEndCardViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.C, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void hide() {
        clearEndCardViews();
        setVisibility(8);
    }

    public void hideSkipButton() {
        this.mSkipView.setVisibility(8);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.gestureDetector;
        if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void pause() {
        SimpleTimer simpleTimer = this.mSkipEndcardTimer;
        if (simpleTimer != null) {
            simpleTimer.pause();
        }
        SimpleTimer simpleTimer2 = this.mCloseEndcardTimer;
        if (simpleTimer2 != null) {
            simpleTimer2.pause();
        }
        MRAIDBanner mRAIDBanner = this.mHtmlEndCardView;
        if (mRAIDBanner != null) {
            mRAIDBanner.pause();
        }
    }

    public void resume() {
        SimpleTimer simpleTimer = this.mSkipEndcardTimer;
        if (simpleTimer != null) {
            simpleTimer.resume();
        }
        SimpleTimer simpleTimer2 = this.mCloseEndcardTimer;
        if (simpleTimer2 != null) {
            simpleTimer2.resume();
        }
        MRAIDBanner mRAIDBanner = this.mHtmlEndCardView;
        if (mRAIDBanner != null) {
            mRAIDBanner.resume();
        }
    }

    public void setEndCardViewListener(EndCardViewListener endCardViewListener) {
        this.endcardViewListener = endCardViewListener;
    }

    public void setSkipOffset(SkipOffset skipOffset) {
        this.skipOffset = skipOffset;
    }

    public void show(final EndCardData endCardData, String str) {
        EndCardViewListener endCardViewListener;
        removeExistingEndcardViews();
        setVisibility(0);
        if (endCardData != null) {
            this.isCustomEndCard = endCardData.isCustom();
            configUi(endCardData);
            clearEndCardViews();
            if (endCardData.getType() == EndCardData.Type.STATIC_RESOURCE) {
                ImageView createStaticEndCardView = createStaticEndCardView();
                this.staticEndCardView = createStaticEndCardView;
                if (createStaticEndCardView == null) {
                    EndCardViewListener endCardViewListener2 = this.endcardViewListener;
                    if (endCardViewListener2 != null) {
                        endCardViewListener2.onLoadFail(this.isCustomEndCard);
                        return;
                    }
                    return;
                }
                addView(createStaticEndCardView);
                this.staticEndCardView.setVisibility(0);
                ImageUtils.setScaledImage(this.staticEndCardView, str);
                ensureOverlayOrder();
                EndCardViewListener endCardViewListener3 = this.endcardViewListener;
                if (endCardViewListener3 != null) {
                    endCardViewListener3.onLoadSuccess(this.isCustomEndCard);
                    this.endcardViewListener.onShow(endCardData.isCustom(), this.endCardType);
                }
                this.endCardType = "static";
                return;
            }
            if (TextUtils.isEmpty(endCardData.getContent())) {
                return;
            }
            FrameLayout createHtmlEndCardContainer = createHtmlEndCardContainer();
            this.htmlEndCardContainer = createHtmlEndCardContainer;
            if (createHtmlEndCardContainer == null) {
                EndCardViewListener endCardViewListener4 = this.endcardViewListener;
                if (endCardViewListener4 != null) {
                    endCardViewListener4.onLoadFail(this.isCustomEndCard);
                    return;
                }
                return;
            }
            addView(createHtmlEndCardContainer);
            this.htmlEndCardContainer.setVisibility(0);
            ensureOverlayOrder();
            if (endCardData.getType() != EndCardData.Type.IFRAME_RESOURCE) {
                this.endCardType = "html";
                renderHtmlEndcard(endCardData.getContent(), endCardData.isCustom().booleanValue());
                return;
            }
            this.endCardType = "iframe";
            if (!isValidContext() && (endCardViewListener = this.endcardViewListener) != null) {
                endCardViewListener.onLoadFail(this.isCustomEndCard);
            }
            PNHttpClient.makeRequest(getContext(), endCardData.getContent(), null, null, true, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.4
                @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                public void onFailure(Throwable th) {
                }

                @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                public void onSuccess(String str2, Map<String, List<String>> map) {
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    HyBidEndCardView.this.renderHtmlEndcard(str2, endCardData.isCustom().booleanValue());
                }
            });
        }
    }

    public synchronized void showCloseButton(final CloseButtonListener closeButtonListener) {
        if (this.isViewShowingCloseButton) {
            return;
        }
        this.mSkipView.setVisibility(8);
        startCloseTimer(new Runnable() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                HyBidEndCardView.this.lambda$showCloseButton$4(closeButtonListener);
            }
        });
        this.isViewShowingCloseButton = true;
    }

    public synchronized void showSkipButton() {
        if (this.isViewShowingSkipButton) {
            return;
        }
        this.mCloseView.setVisibility(4);
        startSkipOffsetTimer(new Runnable() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                HyBidEndCardView.this.lambda$showSkipButton$3();
            }
        });
        this.isViewShowingSkipButton = true;
    }

    public synchronized void startCloseTimer(final Runnable runnable) {
        try {
            final int offset = this.skipOffset.getOffset() * 1000;
            if (offset < 0) {
                runnable.run();
                return;
            }
            CountDownView countDownView = this.mCloseCountdownView;
            if (countDownView != null) {
                countDownView.setVisibility(0);
                ensureOverlayOrder();
            }
            SimpleTimer simpleTimer = new SimpleTimer(offset, new SimpleTimer.Listener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.6
                @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
                public void onFinish() {
                    if (HyBidEndCardView.this.mCloseCountdownView != null) {
                        HyBidEndCardView.this.mCloseCountdownView.setVisibility(8);
                    }
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    if (HyBidEndCardView.this.mCloseEndcardTimer != null) {
                        HyBidEndCardView.this.mCloseEndcardTimer.cancel();
                        HyBidEndCardView.this.mCloseEndcardTimer = null;
                    }
                    HyBidEndCardView.this.isViewShowingCloseButton = false;
                }

                @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
                public void onTick(long j) {
                    if (HyBidEndCardView.this.mCloseCountdownView != null) {
                        HyBidEndCardView.this.mCloseCountdownView.setProgress((int) (offset - j), offset);
                    }
                }
            }, 50L);
            this.mCloseEndcardTimer = simpleTimer;
            simpleTimer.start();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void startSkipOffsetTimer(final Runnable runnable) {
        try {
            final int offset = this.skipOffset.getOffset() * 1000;
            if (offset < 0) {
                runnable.run();
                return;
            }
            CountDownView countDownView = this.mCloseCountdownView;
            if (countDownView != null) {
                countDownView.setVisibility(0);
                ensureOverlayOrder();
            }
            SimpleTimer simpleTimer = new SimpleTimer(offset, new SimpleTimer.Listener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.5
                @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
                public void onFinish() {
                    if (HyBidEndCardView.this.mCloseCountdownView != null) {
                        HyBidEndCardView.this.mCloseCountdownView.setVisibility(8);
                    }
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    if (HyBidEndCardView.this.mSkipEndcardTimer != null) {
                        HyBidEndCardView.this.mSkipEndcardTimer.cancel();
                        HyBidEndCardView.this.mSkipEndcardTimer = null;
                    }
                    HyBidEndCardView.this.isViewShowingSkipButton = false;
                }

                @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
                public void onTick(long j) {
                    if (HyBidEndCardView.this.mCloseCountdownView != null) {
                        HyBidEndCardView.this.mCloseCountdownView.setProgress((int) (offset - j), offset);
                    }
                }
            }, 50L);
            this.mSkipEndcardTimer = simpleTimer;
            simpleTimer.start();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void show(String str) {
        clearEndCardViews();
        ImageView createStaticEndCardView = createStaticEndCardView();
        this.staticEndCardView = createStaticEndCardView;
        if (createStaticEndCardView == null) {
            this.endcardViewListener.onLoadFail(this.isCustomEndCard);
            return;
        }
        addView(createStaticEndCardView);
        this.staticEndCardView.setVisibility(0);
        ImageUtils.setScaledImage(this.staticEndCardView, str);
    }

    public HyBidEndCardView(Context context, boolean z, ReplayListener replayListener) {
        super(context);
        this.isViewShowingCloseButton = false;
        this.isViewShowingSkipButton = false;
        this.endCardType = "";
        this.skipOffset = new SkipOffset(SkipOffsetManager.getDefaultEndcardSkipOffset().intValue(), false);
        this.isCustomEndCard = Boolean.FALSE;
        this.hasReducedClose = false;
        this.mraidViewListener = new MRAIDViewListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.1

            /* renamed from: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView$1$1, reason: invalid class name and collision with other inner class name */
            class ViewTreeObserverOnDrawListenerC18191 implements ViewTreeObserver.OnDrawListener {
                ViewTreeObserverOnDrawListenerC18191() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$onDraw$0() {
                    if (HyBidEndCardView.this.htmlEndCardContainer != null) {
                        HyBidEndCardView.this.htmlEndCardContainer.getViewTreeObserver().removeOnDrawListener(this);
                    }
                }

                @Override // android.view.ViewTreeObserver.OnDrawListener
                public void onDraw() {
                    if (HyBidEndCardView.this.htmlEndCardContainer != null) {
                        HyBidEndCardView.this.htmlEndCardContainer.post(new Runnable() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView$1$1$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                HyBidEndCardView.AnonymousClass1.ViewTreeObserverOnDrawListenerC18191.this.lambda$onDraw$0();
                            }
                        });
                    }
                    if (HyBidEndCardView.this.mHtmlEndCardView == null || HyBidEndCardView.this.mHtmlEndCardView.getMeasuredHeight() >= 50) {
                        return;
                    }
                    HyBidEndCardView.this.mHtmlEndCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidHideCloseButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidHideSkipButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidShowCloseButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidShowSkipButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewClose(MRAIDView mRAIDView) {
                if (HyBidEndCardView.this.endcardViewListener != null) {
                    HyBidEndCardView.this.endcardViewListener.onClose(HyBidEndCardView.this.isCustomEndCard);
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewError(MRAIDView mRAIDView) {
                HyBidEndCardView.this.endcardViewListener.onLoadFail(HyBidEndCardView.this.isCustomEndCard);
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewExpand(MRAIDView mRAIDView) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewLoaded(MRAIDView mRAIDView) {
                if (HyBidEndCardView.this.endcardViewListener != null) {
                    HyBidEndCardView.this.endcardViewListener.onLoadSuccess(HyBidEndCardView.this.isCustomEndCard);
                    HyBidEndCardView.this.endcardViewListener.onShow(HyBidEndCardView.this.isCustomEndCard, HyBidEndCardView.this.endCardType);
                }
                HyBidEndCardView.this.mHtmlEndCardView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC18191());
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public boolean mraidViewResize(MRAIDView mRAIDView, int i, int i2, int i3, int i4) {
                return false;
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTAClick() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTALoadFail() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTAShow() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardClicked() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardClosed() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardLoadFail() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardLoadSuccess() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardShow(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onExpandedAdClosed() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onReplayClicked() {
                if (HyBidEndCardView.this.replayListener != null) {
                    HyBidEndCardView.this.replayListener.replayVast();
                }
            }
        };
        this.mraidNativeFeatureListener = new MRAIDNativeFeatureListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.2
            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureCallTel(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureCreateCalendarEvent(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureOpenBrowser(String str) {
                if (HyBidEndCardView.this.endcardViewListener != null) {
                    HyBidEndCardView.this.endcardViewListener.onClick(str, HyBidEndCardView.this.isCustomEndCard, HyBidEndCardView.this.endCardType);
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeaturePlayVideo(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureSendSms(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureStorePicture(String str) {
            }
        };
        this.hasReducedClose = z;
        this.replayListener = replayListener;
        init(context);
    }

    public HyBidEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isViewShowingCloseButton = false;
        this.isViewShowingSkipButton = false;
        this.endCardType = "";
        this.skipOffset = new SkipOffset(SkipOffsetManager.getDefaultEndcardSkipOffset().intValue(), false);
        this.isCustomEndCard = Boolean.FALSE;
        this.hasReducedClose = false;
        this.mraidViewListener = new MRAIDViewListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.1

            /* renamed from: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView$1$1, reason: invalid class name and collision with other inner class name */
            class ViewTreeObserverOnDrawListenerC18191 implements ViewTreeObserver.OnDrawListener {
                ViewTreeObserverOnDrawListenerC18191() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$onDraw$0() {
                    if (HyBidEndCardView.this.htmlEndCardContainer != null) {
                        HyBidEndCardView.this.htmlEndCardContainer.getViewTreeObserver().removeOnDrawListener(this);
                    }
                }

                @Override // android.view.ViewTreeObserver.OnDrawListener
                public void onDraw() {
                    if (HyBidEndCardView.this.htmlEndCardContainer != null) {
                        HyBidEndCardView.this.htmlEndCardContainer.post(new Runnable() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView$1$1$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                HyBidEndCardView.AnonymousClass1.ViewTreeObserverOnDrawListenerC18191.this.lambda$onDraw$0();
                            }
                        });
                    }
                    if (HyBidEndCardView.this.mHtmlEndCardView == null || HyBidEndCardView.this.mHtmlEndCardView.getMeasuredHeight() >= 50) {
                        return;
                    }
                    HyBidEndCardView.this.mHtmlEndCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidHideCloseButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidHideSkipButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidShowCloseButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidShowSkipButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewClose(MRAIDView mRAIDView) {
                if (HyBidEndCardView.this.endcardViewListener != null) {
                    HyBidEndCardView.this.endcardViewListener.onClose(HyBidEndCardView.this.isCustomEndCard);
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewError(MRAIDView mRAIDView) {
                HyBidEndCardView.this.endcardViewListener.onLoadFail(HyBidEndCardView.this.isCustomEndCard);
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewExpand(MRAIDView mRAIDView) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewLoaded(MRAIDView mRAIDView) {
                if (HyBidEndCardView.this.endcardViewListener != null) {
                    HyBidEndCardView.this.endcardViewListener.onLoadSuccess(HyBidEndCardView.this.isCustomEndCard);
                    HyBidEndCardView.this.endcardViewListener.onShow(HyBidEndCardView.this.isCustomEndCard, HyBidEndCardView.this.endCardType);
                }
                HyBidEndCardView.this.mHtmlEndCardView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC18191());
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public boolean mraidViewResize(MRAIDView mRAIDView, int i, int i2, int i3, int i4) {
                return false;
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTAClick() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTALoadFail() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTAShow() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardClicked() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardClosed() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardLoadFail() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardLoadSuccess() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardShow(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onExpandedAdClosed() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onReplayClicked() {
                if (HyBidEndCardView.this.replayListener != null) {
                    HyBidEndCardView.this.replayListener.replayVast();
                }
            }
        };
        this.mraidNativeFeatureListener = new MRAIDNativeFeatureListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.2
            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureCallTel(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureCreateCalendarEvent(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureOpenBrowser(String str) {
                if (HyBidEndCardView.this.endcardViewListener != null) {
                    HyBidEndCardView.this.endcardViewListener.onClick(str, HyBidEndCardView.this.isCustomEndCard, HyBidEndCardView.this.endCardType);
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeaturePlayVideo(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureSendSms(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureStorePicture(String str) {
            }
        };
        init(context);
    }

    public HyBidEndCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isViewShowingCloseButton = false;
        this.isViewShowingSkipButton = false;
        this.endCardType = "";
        this.skipOffset = new SkipOffset(SkipOffsetManager.getDefaultEndcardSkipOffset().intValue(), false);
        this.isCustomEndCard = Boolean.FALSE;
        this.hasReducedClose = false;
        this.mraidViewListener = new MRAIDViewListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.1

            /* renamed from: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView$1$1, reason: invalid class name and collision with other inner class name */
            class ViewTreeObserverOnDrawListenerC18191 implements ViewTreeObserver.OnDrawListener {
                ViewTreeObserverOnDrawListenerC18191() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$onDraw$0() {
                    if (HyBidEndCardView.this.htmlEndCardContainer != null) {
                        HyBidEndCardView.this.htmlEndCardContainer.getViewTreeObserver().removeOnDrawListener(this);
                    }
                }

                @Override // android.view.ViewTreeObserver.OnDrawListener
                public void onDraw() {
                    if (HyBidEndCardView.this.htmlEndCardContainer != null) {
                        HyBidEndCardView.this.htmlEndCardContainer.post(new Runnable() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView$1$1$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                HyBidEndCardView.AnonymousClass1.ViewTreeObserverOnDrawListenerC18191.this.lambda$onDraw$0();
                            }
                        });
                    }
                    if (HyBidEndCardView.this.mHtmlEndCardView == null || HyBidEndCardView.this.mHtmlEndCardView.getMeasuredHeight() >= 50) {
                        return;
                    }
                    HyBidEndCardView.this.mHtmlEndCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidHideCloseButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidHideSkipButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidShowCloseButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidShowSkipButton() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewClose(MRAIDView mRAIDView) {
                if (HyBidEndCardView.this.endcardViewListener != null) {
                    HyBidEndCardView.this.endcardViewListener.onClose(HyBidEndCardView.this.isCustomEndCard);
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewError(MRAIDView mRAIDView) {
                HyBidEndCardView.this.endcardViewListener.onLoadFail(HyBidEndCardView.this.isCustomEndCard);
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewExpand(MRAIDView mRAIDView) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void mraidViewLoaded(MRAIDView mRAIDView) {
                if (HyBidEndCardView.this.endcardViewListener != null) {
                    HyBidEndCardView.this.endcardViewListener.onLoadSuccess(HyBidEndCardView.this.isCustomEndCard);
                    HyBidEndCardView.this.endcardViewListener.onShow(HyBidEndCardView.this.isCustomEndCard, HyBidEndCardView.this.endCardType);
                }
                HyBidEndCardView.this.mHtmlEndCardView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC18191());
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public boolean mraidViewResize(MRAIDView mRAIDView, int i2, int i22, int i3, int i4) {
                return false;
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTAClick() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTALoadFail() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomCTAShow() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardClicked() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardClosed() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardLoadFail() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardLoadSuccess() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onCustomEndCardShow(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onExpandedAdClosed() {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
            public void onReplayClicked() {
                if (HyBidEndCardView.this.replayListener != null) {
                    HyBidEndCardView.this.replayListener.replayVast();
                }
            }
        };
        this.mraidNativeFeatureListener = new MRAIDNativeFeatureListener() { // from class: net.pubnative.lite.sdk.views.endcard.HyBidEndCardView.2
            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureCallTel(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureCreateCalendarEvent(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureOpenBrowser(String str) {
                if (HyBidEndCardView.this.endcardViewListener != null) {
                    HyBidEndCardView.this.endcardViewListener.onClick(str, HyBidEndCardView.this.isCustomEndCard, HyBidEndCardView.this.endCardType);
                }
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeaturePlayVideo(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureSendSms(String str) {
            }

            @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
            public void mraidNativeFeatureStorePicture(String str) {
            }
        };
        init(context);
    }
}
