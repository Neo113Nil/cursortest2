package com.smaato.sdk.ng.vpaid.vast;

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
import com.smaato.sdk.ng.CountdownStyle;
import com.smaato.sdk.ng.InterstitialActionBehaviour;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.R;
import com.smaato.sdk.ng.models.CustomCTAData;
import com.smaato.sdk.ng.models.EndCardData;
import com.smaato.sdk.ng.models.LearnMoreData;
import com.smaato.sdk.ng.models.LearnMoreLocation;
import com.smaato.sdk.ng.models.LearnMoreSize;
import com.smaato.sdk.ng.models.SkipOffset;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.ScreenDimensionsUtils;
import com.smaato.sdk.ng.utils.SkipOffsetManager;
import com.smaato.sdk.ng.utils.ViewUtils;
import com.smaato.sdk.ng.viewability.baseom.BaseFriendlyObstructionPurpose;
import com.smaato.sdk.ng.views.NGSDKAPIContentInfoView;
import com.smaato.sdk.ng.views.cta.NextGenCTAView;
import com.smaato.sdk.ng.views.endcard.NextGenEndCardView;
import com.smaato.sdk.ng.vpaid.AdCloseButtonListener;
import com.smaato.sdk.ng.vpaid.CloseButtonListener;
import com.smaato.sdk.ng.vpaid.InvalidCTAUrlListener;
import com.smaato.sdk.ng.vpaid.NextGenActivityInteractor;
import com.smaato.sdk.ng.vpaid.ReplayListener;
import com.smaato.sdk.ng.vpaid.VideoAdController;
import com.smaato.sdk.ng.vpaid.VideoAdView;
import com.smaato.sdk.ng.vpaid.VideoVisibilityManager;
import com.smaato.sdk.ng.vpaid.helpers.BitmapHelper;
import com.smaato.sdk.ng.vpaid.response.AdParams;
import com.smaato.sdk.ng.vpaid.utils.UrlClickSource;
import com.smaato.sdk.ng.vpaid.utils.Utils;
import com.smaato.sdk.ng.vpaid.widget.CountDownView;
import com.smaato.sdk.ng.vpaid.widget.CountDownViewFactory;
import com.smaato.sdk.ng.vpaid.widget.LinearCountDownView;

/* loaded from: classes15.dex */
public class ViewControllerVast implements View.OnClickListener {
    private static final String a = "ViewControllerVast";
    private static final CountdownStyle b = CountdownStyle.PIE_CHART;
    private static final InterstitialActionBehaviour c = InterstitialActionBehaviour.HB_CREATIVE;
    private final ReplayListener A;
    NextGenActivityInteractor C;
    AdCloseButtonListener D;
    private InterstitialActionBehaviour E;
    private boolean F;
    private CustomCTAData G;
    private Integer H;
    private final VideoAdController d;
    private VideoAdView e;
    private CountDownView f;
    private LinearCountDownView g;
    private FrameLayout h;
    private TextureView i;
    private FrameLayout j;
    private View k;
    private FrameLayout l;
    private NextGenEndCardView m;
    private NextGenEndCardView n;
    private NextGenCTAView o;
    private NGSDKAPIContentInfoView p;
    private boolean q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final LearnMoreData v;
    private Surface w;
    private View x;
    private ImageView y;
    private final Integer z;
    private boolean u = false;
    private final Handler I = new Handler(Looper.getMainLooper());
    private boolean J = false;
    private final VideoAdView.VisibilityListener K = new a();
    private final TextureView.SurfaceTextureListener L = new b();
    VideoVisibilityManager B = VideoVisibilityManager.getInstance();

    class a implements VideoAdView.VisibilityListener {
        a() {
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdView.VisibilityListener
        public void onVisibilityChanged(int i) {
            try {
                if (i == 0) {
                    ViewControllerVast.this.d.setVideoVisible(true);
                    ViewControllerVast.this.B.reportChange(VideoVisibilityManager.VideoAdStatus.RESUMED);
                } else {
                    ViewControllerVast.this.d.setVideoVisible(false);
                    ViewControllerVast.this.B.reportChange(VideoVisibilityManager.VideoAdStatus.PAUSED);
                }
            } catch (Exception e) {
                NextGen.reportException(e);
                Logger.e(ViewControllerVast.a, "ViewControllerVast.createVisibilityListener: Log: " + Log.getStackTraceString(e));
            }
        }
    }

    class b implements TextureView.SurfaceTextureListener {
        b() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            ViewControllerVast viewControllerVast = ViewControllerVast.this;
            if (viewControllerVast.J) {
                return;
            }
            Surface surface = viewControllerVast.w;
            if (surface != null) {
                surface.release();
            }
            ViewControllerVast.this.w = new Surface(surfaceTexture);
            if (ViewControllerVast.this.d.isVideoVisible()) {
                ViewControllerVast.this.d.setVideoVisible(true);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Surface surface;
            ViewControllerVast viewControllerVast = ViewControllerVast.this;
            if (!viewControllerVast.J && (surface = viewControllerVast.w) != null) {
                surface.release();
                ViewControllerVast.this.w = null;
            }
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    class c implements NextGenEndCardView.EndCardViewListener {
        c() {
        }

        @Override // com.smaato.sdk.ng.views.endcard.NextGenEndCardView.EndCardViewListener
        public void onClick(String str, Boolean bool, String str2) {
            if (bool.booleanValue()) {
                ViewControllerVast.this.a((String) null, UrlClickSource.CUSTOM_END_CARD);
                ViewControllerVast.this.d.onCustomEndCardClick(str2);
            } else {
                ViewControllerVast.this.a(str, UrlClickSource.DEFAULT_END_CARD);
                ViewControllerVast.this.d.onDefaultEndCardClick(str2);
            }
        }

        @Override // com.smaato.sdk.ng.views.endcard.NextGenEndCardView.EndCardViewListener
        public void onClose(Boolean bool) {
            VideoAdController videoAdController = ViewControllerVast.this.d;
            if (videoAdController != null) {
                videoAdController.onEndCardClosed(bool);
            }
            ViewControllerVast.this.b();
        }

        @Override // com.smaato.sdk.ng.views.endcard.NextGenEndCardView.EndCardViewListener
        public void onLoadFail(Boolean bool) {
            VideoAdController videoAdController = ViewControllerVast.this.d;
            if (videoAdController != null) {
                videoAdController.onEndCardLoadFail(bool);
            }
        }

        @Override // com.smaato.sdk.ng.views.endcard.NextGenEndCardView.EndCardViewListener
        public void onLoadSuccess(Boolean bool) {
            VideoAdController videoAdController = ViewControllerVast.this.d;
            if (videoAdController != null) {
                videoAdController.onEndCardLoadSuccess(bool);
            }
        }

        @Override // com.smaato.sdk.ng.views.endcard.NextGenEndCardView.EndCardViewListener
        public void onShow(Boolean bool, String str) {
            View view = ViewControllerVast.this.k;
            if (view != null) {
                view.setVisibility(8);
            }
            if (!bool.booleanValue()) {
                ViewControllerVast.this.d.onDefaultEndCardShow(str);
                NextGenCTAView nextGenCTAView = ViewControllerVast.this.o;
                if (nextGenCTAView != null) {
                    nextGenCTAView.show();
                    return;
                }
                return;
            }
            ViewControllerVast.this.d.onCustomEndCardShow(str);
            ViewControllerVast.this.m.bringToFront();
            NextGenCTAView nextGenCTAView2 = ViewControllerVast.this.o;
            if (nextGenCTAView2 != null) {
                nextGenCTAView2.hide();
            }
        }

        @Override // com.smaato.sdk.ng.views.endcard.NextGenEndCardView.EndCardViewListener
        public void onSkip() {
            ViewControllerVast.this.f();
        }
    }

    class d implements NextGenEndCardView.EndCardViewListener {
        d() {
        }

        @Override // com.smaato.sdk.ng.views.endcard.NextGenEndCardView.EndCardViewListener
        public void onClick(String str, Boolean bool, String str2) {
            if (bool.booleanValue()) {
                ViewControllerVast.this.a((String) null, UrlClickSource.CUSTOM_END_CARD);
                ViewControllerVast.this.d.onCustomEndCardClick(str2);
            } else {
                ViewControllerVast.this.a(str, UrlClickSource.DEFAULT_END_CARD);
                ViewControllerVast.this.d.onDefaultEndCardClick(str2);
            }
        }

        @Override // com.smaato.sdk.ng.views.endcard.NextGenEndCardView.EndCardViewListener
        public void onClose(Boolean bool) {
            VideoAdController videoAdController = ViewControllerVast.this.d;
            if (videoAdController != null) {
                videoAdController.onEndCardClosed(bool);
            }
            ViewControllerVast.this.b();
        }

        @Override // com.smaato.sdk.ng.views.endcard.NextGenEndCardView.EndCardViewListener
        public void onLoadFail(Boolean bool) {
            VideoAdController videoAdController = ViewControllerVast.this.d;
            if (videoAdController != null) {
                videoAdController.onEndCardLoadFail(bool);
            }
        }

        @Override // com.smaato.sdk.ng.views.endcard.NextGenEndCardView.EndCardViewListener
        public void onLoadSuccess(Boolean bool) {
            VideoAdController videoAdController = ViewControllerVast.this.d;
            if (videoAdController != null) {
                videoAdController.onEndCardLoadSuccess(bool);
            }
        }

        @Override // com.smaato.sdk.ng.views.endcard.NextGenEndCardView.EndCardViewListener
        public void onShow(Boolean bool, String str) {
            View view = ViewControllerVast.this.k;
            if (view != null) {
                view.setVisibility(8);
            }
            if (!bool.booleanValue()) {
                ViewControllerVast.this.d.onDefaultEndCardShow(str);
                NextGenCTAView nextGenCTAView = ViewControllerVast.this.o;
                if (nextGenCTAView != null) {
                    nextGenCTAView.show();
                    return;
                }
                return;
            }
            ViewControllerVast.this.d.onCustomEndCardShow(str);
            ViewControllerVast.this.n.bringToFront();
            NextGenCTAView nextGenCTAView2 = ViewControllerVast.this.o;
            if (nextGenCTAView2 != null) {
                nextGenCTAView2.hide();
            }
        }

        @Override // com.smaato.sdk.ng.views.endcard.NextGenEndCardView.EndCardViewListener
        public void onSkip() {
            ViewControllerVast.this.f();
        }
    }

    class e implements NextGenCTAView.CTAViewListener {
        final /* synthetic */ InvalidCTAUrlListener a;

        e(InvalidCTAUrlListener invalidCTAUrlListener) {
            this.a = invalidCTAUrlListener;
        }

        @Override // com.smaato.sdk.ng.views.cta.NextGenCTAView.CTAViewListener
        public void onClick() {
            ViewControllerVast viewControllerVast = ViewControllerVast.this;
            VideoAdController videoAdController = viewControllerVast.d;
            if (videoAdController != null) {
                videoAdController.onCustomCTAClick(viewControllerVast.isEndCard());
            }
            ViewControllerVast viewControllerVast2 = ViewControllerVast.this;
            if (viewControllerVast2.d != null) {
                viewControllerVast2.a((String) null, UrlClickSource.CUSTOM_CTA);
            }
        }

        @Override // com.smaato.sdk.ng.views.cta.NextGenCTAView.CTAViewListener
        public void onFail() {
            VideoAdController videoAdController = ViewControllerVast.this.d;
            if (videoAdController != null) {
                videoAdController.onCustomCTALoadFail();
            }
        }

        @Override // com.smaato.sdk.ng.views.cta.NextGenCTAView.CTAViewListener
        public void onInvalidCTAIconUrl() {
            VideoAdController videoAdController = ViewControllerVast.this.d;
            if (videoAdController != null) {
                videoAdController.onCustomCTALoadFail();
            }
            InvalidCTAUrlListener invalidCTAUrlListener = this.a;
            if (invalidCTAUrlListener != null) {
                invalidCTAUrlListener.invalidCTAUrl();
            }
        }

        @Override // com.smaato.sdk.ng.views.cta.NextGenCTAView.CTAViewListener
        public void onShow() {
            VideoAdController videoAdController = ViewControllerVast.this.d;
            if (videoAdController != null) {
                videoAdController.onCustomCTAShow();
                ViewControllerVast.this.u = true;
            }
        }
    }

    static /* synthetic */ class f {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[LearnMoreSize.values().length];
            b = iArr;
            try {
                iArr[LearnMoreSize.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[LearnMoreSize.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[LearnMoreLocation.values().length];
            a = iArr2;
            try {
                iArr2[LearnMoreLocation.BOTTOM_DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[LearnMoreLocation.BOTTOM_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ViewControllerVast(VideoAdController videoAdController, boolean z, Integer num, Boolean bool, boolean z2, AdCloseButtonListener adCloseButtonListener, ReplayListener replayListener, CustomCTAData customCTAData, Integer num2, boolean z3, boolean z4, LearnMoreData learnMoreData) {
        this.E = null;
        this.F = false;
        this.G = null;
        this.H = 0;
        this.d = videoAdController;
        this.t = z;
        this.D = adCloseButtonListener;
        this.G = customCTAData;
        this.H = num2;
        this.r = z3;
        this.s = z4;
        this.v = learnMoreData;
        this.z = num;
        if (bool == null) {
            this.E = InterstitialActionBehaviour.HB_CREATIVE;
        } else if (bool.booleanValue()) {
            this.E = InterstitialActionBehaviour.HB_CREATIVE;
        } else {
            this.E = InterstitialActionBehaviour.HB_ACTION_BUTTON;
        }
        this.F = z2;
        this.C = NextGenActivityInteractor.getInstance();
        this.A = replayListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        a((String) null, UrlClickSource.VAST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        a((String) null, UrlClickSource.VAST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.m.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.n.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.d.skipEndCard();
    }

    private void g() {
        this.d.skipVideo();
    }

    public void adjustLayoutParams(final int i, final int i2) {
        if (this.j == null) {
            Logger.e(a, "ViewControllerVast.adjustLayoutParams: Log: mControlsLayout is null");
            return;
        }
        this.h.setLayoutParams(Utils.calculateNewLayoutParams((FrameLayout.LayoutParams) this.h.getLayoutParams(), i, i2, this.e.getWidth(), this.e.getHeight(), Utils.StretchOption.NO_STRETCH));
        this.h.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.smaato.sdk.ng.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda7
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                ViewControllerVast.this.a(i, i2, view, i3, i4, i5, i6, i7, i8, i9, i10);
            }
        });
    }

    public void buildVideoAdView(VideoAdView videoAdView) {
        Context context = videoAdView.getContext();
        this.e = videoAdView;
        videoAdView.setVisibilityListener(this.K);
        videoAdView.removeAllViews();
        this.j = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.controls, (ViewGroup) videoAdView, false);
        this.k = LayoutInflater.from(context).inflate(R.layout.open_url, (ViewGroup) videoAdView, false);
        a(context);
        this.l = (FrameLayout) this.j.findViewById(R.id.uxLayout);
        b(context);
        boolean z = this.t;
        if (z && this.r) {
            View view = this.k;
            if (view != null) {
                view.setVisibility(0);
            }
            if (this.s) {
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.ng.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ViewControllerVast.this.a(view2);
                    }
                });
                this.l.setVisibility(4);
            }
        } else {
            final InterstitialActionBehaviour interstitialActionBehaviour = this.E;
            if (interstitialActionBehaviour == null) {
                interstitialActionBehaviour = c;
            }
            if (this.G == null || !z) {
                a(interstitialActionBehaviour);
            } else {
                View view2 = this.k;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.ng.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        ViewControllerVast.this.b(view3);
                    }
                });
                showCTAButton(this.G, this.H, new InvalidCTAUrlListener() { // from class: com.smaato.sdk.ng.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda4
                    @Override // com.smaato.sdk.ng.vpaid.InvalidCTAUrlListener
                    public final void invalidCTAUrl() {
                        ViewControllerVast.this.a(interstitialActionBehaviour);
                    }
                });
            }
        }
        this.h = (FrameLayout) this.j.findViewById(R.id.videoPlayerLayout);
        if (a(this.d.getAdParams())) {
            RelativeLayout relativeLayout = new RelativeLayout(this.h.getContext());
            TextureView textureView = new TextureView(relativeLayout.getContext());
            this.i = textureView;
            textureView.setId(R.id.textureView);
            relativeLayout.addView(this.i, new RelativeLayout.LayoutParams(-1, -1));
            this.h.addView(relativeLayout, 0, new FrameLayout.LayoutParams(-1, -1));
        } else {
            TextureView textureView2 = new TextureView(this.h.getContext());
            this.i = textureView2;
            textureView2.setId(R.id.textureView);
            this.h.addView(this.i, 0, new FrameLayout.LayoutParams(-1, -1));
        }
        NextGenEndCardView nextGenEndCardView = new NextGenEndCardView(context, this.F, this.A);
        this.m = nextGenEndCardView;
        nextGenEndCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.m.setVisibility(8);
        NextGenEndCardView nextGenEndCardView2 = new NextGenEndCardView(context, this.F, this.A);
        this.n = nextGenEndCardView2;
        nextGenEndCardView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.n.setVisibility(8);
        this.k.findViewById(R.id.openURL).setOnClickListener(this);
        this.k.findViewById(R.id.openURLIcon).setOnClickListener(this);
        this.k.findViewById(R.id.openURLOldIcon).setOnClickListener(this);
        CountDownView createCountdownView = new CountDownViewFactory().createCountdownView(context, b, this.j);
        this.f = createCountdownView;
        this.j.addView(createCountdownView);
        this.g = new LinearCountDownView(this.j.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388691;
        this.g.setLayoutParams(layoutParams);
        this.l.addView(this.g);
        TextureView textureView3 = this.i;
        if (textureView3 != null) {
            textureView3.setSurfaceTextureListener(this.L);
        }
        ImageView imageView = (ImageView) this.j.findViewById(R.id.muteView);
        this.y = imageView;
        imageView.setOnClickListener(this);
        if (this.r && this.s) {
            a(true);
            b(true);
        }
        this.x = this.j.findViewById(R.id.skipView);
        if (this.F) {
            int convertDpToPixel = (int) ViewUtils.convertDpToPixel(20.0f, context);
            int convertDpToPixel2 = (int) ViewUtils.convertDpToPixel(8.0f, context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(convertDpToPixel, convertDpToPixel);
            layoutParams2.setMargins(convertDpToPixel2, convertDpToPixel2, 0, 0);
            this.x.setId(R.id.skipView_small);
            this.x.setLayoutParams(layoutParams2);
            this.x.setPadding(0, 0, 0, 0);
            this.x.requestLayout();
        }
        Bitmap bitmap = BitmapHelper.toBitmap(this.x.getContext(), NextGen.getSkipXmlResource(), Integer.valueOf(R.mipmap.skip));
        if (bitmap != null) {
            ((ImageView) this.x).setImageBitmap(bitmap);
        } else {
            View view3 = this.x;
            ((ImageView) view3).setImageBitmap(BitmapHelper.decodeResource(view3.getContext(), Integer.valueOf(R.mipmap.skip)));
        }
        this.x.setOnClickListener(this);
        this.d.addViewabilityFriendlyObstruction(this.j, BaseFriendlyObstructionPurpose.VIDEO_CONTROLS, "Video controls");
        videoAdView.addView(this.j);
        videoAdView.addView(this.m);
        videoAdView.addView(this.n);
        videoAdView.addView(this.o);
        videoAdView.addView(this.k);
    }

    public void destroy() {
        this.J = true;
        this.I.removeCallbacksAndMessages(null);
        TextureView textureView = this.i;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
            this.i = null;
        }
        Surface surface = this.w;
        if (surface != null) {
            surface.release();
            this.w = null;
        }
        NextGenEndCardView nextGenEndCardView = this.m;
        if (nextGenEndCardView != null) {
            nextGenEndCardView.destroy();
        }
        NextGenCTAView nextGenCTAView = this.o;
        if (nextGenCTAView != null) {
            nextGenCTAView.destroy();
        }
        NextGenEndCardView nextGenEndCardView2 = this.n;
        if (nextGenEndCardView2 != null) {
            nextGenEndCardView2.destroy();
        }
    }

    public void dismiss() {
        this.I.removeCallbacksAndMessages(null);
        VideoAdView videoAdView = this.e;
        if (videoAdView != null) {
            videoAdView.removeAllViews();
        }
    }

    public void endSkip(Boolean bool, Boolean bool2) {
        CountDownView countDownView = this.f;
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
        return this.w;
    }

    public TextureView getTexture() {
        return this.i;
    }

    public void hideEndcards() {
        NextGenEndCardView nextGenEndCardView = this.m;
        if (nextGenEndCardView != null) {
            nextGenEndCardView.setVisibility(8);
        }
        NextGenEndCardView nextGenEndCardView2 = this.n;
        if (nextGenEndCardView2 != null) {
            nextGenEndCardView2.setVisibility(8);
        }
        View view = this.k;
        boolean z = false;
        if (view != null && (this.E != InterstitialActionBehaviour.HB_CREATIVE || this.r)) {
            view.setVisibility(0);
        }
        NextGenCTAView nextGenCTAView = this.o;
        if (nextGenCTAView != null && this.u) {
            nextGenCTAView.setVisibility(0);
        }
        LinearCountDownView linearCountDownView = this.g;
        if (linearCountDownView != null) {
            linearCountDownView.setVisibility(0);
        }
        setTimerVisible(true);
        if (this.s && this.r) {
            z = true;
        }
        hideUx(z);
        d(true);
    }

    public void hideMuteButton() {
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    public void hideSkipButton() {
        View view = this.x;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void hideUx(boolean z) {
        FrameLayout frameLayout = this.l;
        if (frameLayout != null) {
            if (z) {
                frameLayout.setVisibility(4);
                a(true);
                b(true);
                c(true);
                return;
            }
            frameLayout.setVisibility(0);
            a(false);
            b(false);
            c(false);
        }
    }

    public boolean isEndCard() {
        NextGenEndCardView nextGenEndCardView = this.m;
        return (nextGenEndCardView == null || nextGenEndCardView.getVisibility() == 8) ? false : true;
    }

    public boolean isMute() {
        return this.q;
    }

    public void muteVideo() {
        boolean z = !this.q;
        this.q = z;
        this.d.setVolume(z);
        ImageView imageView = this.y;
        if (imageView != null) {
            if (this.q) {
                imageView.setImageResource(R.mipmap.mute);
                this.y.setContentDescription("muteButton");
            } else {
                imageView.setImageResource(R.mipmap.unmute);
                this.y.setContentDescription("unmuteButton");
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.close_view) {
            b();
            return;
        }
        if (view.getId() == R.id.skipView || view.getId() == R.id.progressSkipView || view.getId() == R.id.skipView_small) {
            g();
            return;
        }
        if (view.getId() == R.id.muteView) {
            muteVideo();
        } else if (view.getId() == R.id.openURL || view.getId() == R.id.openURLIcon || view.getId() == R.id.openURLOldIcon) {
            a((String) null, UrlClickSource.VAST);
        }
    }

    public void pause() {
        NextGenCTAView nextGenCTAView = this.o;
        if (nextGenCTAView != null) {
            nextGenCTAView.pause();
        }
    }

    public void pauseEndCardCloseButtonTimer() {
        NextGenEndCardView nextGenEndCardView = this.m;
        if (nextGenEndCardView != null) {
            nextGenEndCardView.pause();
        }
        NextGenEndCardView nextGenEndCardView2 = this.n;
        if (nextGenEndCardView2 != null) {
            nextGenEndCardView2.pause();
        }
    }

    public void postDelayed(Runnable runnable, long j) {
        if (this.e == null || this.J) {
            return;
        }
        this.I.postDelayed(runnable, j);
    }

    public void recoverGoneCountdownView() {
        CountDownView countDownView = this.f;
        if (countDownView != null) {
            countDownView.setVisibility(4);
        }
    }

    public void resetProgress() {
        LinearCountDownView linearCountDownView = this.g;
        if (linearCountDownView != null) {
            linearCountDownView.reset();
        }
    }

    public void resume() {
        NextGenCTAView nextGenCTAView = this.o;
        if (nextGenCTAView != null) {
            nextGenCTAView.resume();
        }
    }

    public void resumeEndCardCloseButtonTimer() {
        NextGenEndCardView nextGenEndCardView = this.m;
        if (nextGenEndCardView != null) {
            nextGenEndCardView.resume();
        }
        NextGenEndCardView nextGenEndCardView2 = this.n;
        if (nextGenEndCardView2 != null) {
            nextGenEndCardView2.resume();
        }
    }

    public void setProgress(int i, int i2) {
        LinearCountDownView linearCountDownView = this.g;
        if (linearCountDownView != null) {
            linearCountDownView.setProgress(i2 - i, i2);
        }
    }

    public void setSkipProgress(int i, int i2) {
        CountDownView countDownView = this.f;
        if (countDownView != null) {
            countDownView.setProgress(i2 - i, i2);
        }
    }

    public void setTimerVisible(boolean z) {
        int i = z ? 0 : 4;
        LinearCountDownView linearCountDownView = this.g;
        if (linearCountDownView != null) {
            linearCountDownView.setVisibility(i);
        }
    }

    public void showCTAButton(CustomCTAData customCTAData, Integer num, InvalidCTAUrlListener invalidCTAUrlListener) {
        if (this.o == null || TextUtils.isEmpty(customCTAData.getIconURL())) {
            VideoAdController videoAdController = this.d;
            if (videoAdController != null) {
                videoAdController.onCustomCTALoadFail();
                return;
            }
            return;
        }
        this.o.setListener(new e(invalidCTAUrlListener));
        if (customCTAData.getBitmap() != null) {
            this.o.show(customCTAData.getBitmap(), customCTAData.getLabel(), num);
        } else {
            this.o.show(customCTAData.getIconURL(), customCTAData.getLabel(), num);
        }
    }

    public void showCloseButton() {
        AdCloseButtonListener adCloseButtonListener = this.D;
        if (adCloseButtonListener != null) {
            adCloseButtonListener.showButton();
        }
    }

    public void showCountdownTimer() {
        CountDownView countDownView = this.f;
        if (countDownView != null) {
            countDownView.setVisibility(0);
        }
    }

    public void showEndCard(EndCardData endCardData, String str, Boolean bool, CloseButtonListener closeButtonListener) {
        NextGenEndCardView nextGenEndCardView = this.m;
        if (nextGenEndCardView != null) {
            nextGenEndCardView.setEndCardViewListener(new c());
            this.m.setSkipOffset(c());
            this.m.show(endCardData, str);
            this.m.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.smaato.sdk.ng.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda6
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    ViewControllerVast.this.a(view, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
            if (this.t) {
                if (bool.booleanValue()) {
                    this.m.showCloseButton(closeButtonListener);
                } else {
                    this.m.showSkipButton();
                }
            }
        }
    }

    public void showEndcards() {
        NextGenEndCardView nextGenEndCardView = this.m;
        if (nextGenEndCardView != null) {
            nextGenEndCardView.setVisibility(0);
        }
        NextGenEndCardView nextGenEndCardView2 = this.n;
        if (nextGenEndCardView2 != null) {
            nextGenEndCardView2.setVisibility(0);
        }
        View view = this.k;
        if (view != null) {
            view.setVisibility(8);
        }
        NextGenCTAView nextGenCTAView = this.o;
        if (nextGenCTAView != null && this.u) {
            nextGenCTAView.setVisibility(8);
        }
        LinearCountDownView linearCountDownView = this.g;
        if (linearCountDownView != null) {
            linearCountDownView.setVisibility(8);
            resetProgress();
        }
        setTimerVisible(false);
        hideUx(true);
        d(false);
    }

    public void showLastCustomEndCard(EndCardData endCardData, String str, CloseButtonListener closeButtonListener) {
        NextGenEndCardView nextGenEndCardView = this.n;
        if (nextGenEndCardView != null) {
            nextGenEndCardView.setEndCardViewListener(new d());
            this.n.setSkipOffset(c());
            this.m.hideSkipButton();
            this.n.show(endCardData, str);
            this.n.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.smaato.sdk.ng.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda8
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    ViewControllerVast.this.b(view, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
            if (this.t) {
                this.n.showCloseButton(closeButtonListener);
            }
        }
    }

    public void showSkipButton() {
        View view = this.x;
        if (view != null) {
            if (!this.r) {
                view.setVisibility(0);
                this.x.setClickable(true);
            } else if (this.l.getVisibility() == 0) {
                this.x.setVisibility(0);
                this.x.setClickable(true);
            } else {
                this.x.setVisibility(4);
                this.x.setClickable(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(InterstitialActionBehaviour interstitialActionBehaviour) {
        if (interstitialActionBehaviour != InterstitialActionBehaviour.HB_CREATIVE) {
            View view = this.k;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.ng.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewControllerVast.this.c(view2);
            }
        });
        View view2 = this.k;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    private void c(boolean z) {
        View view = this.x;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        if (z) {
            this.x.setVisibility(4);
            this.x.setClickable(false);
        } else {
            this.x.setVisibility(0);
            this.x.setClickable(true);
        }
    }

    private void d(boolean z) {
        if (this.p == null) {
            ViewParent parent = this.e.getParent();
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
                                if (childAt2 instanceof NGSDKAPIContentInfoView) {
                                    NGSDKAPIContentInfoView nGSDKAPIContentInfoView = (NGSDKAPIContentInfoView) childAt2;
                                    this.p = nGSDKAPIContentInfoView;
                                    if (!this.t) {
                                        a(nGSDKAPIContentInfoView, viewGroup);
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
        NGSDKAPIContentInfoView nGSDKAPIContentInfoView2 = this.p;
        if (nGSDKAPIContentInfoView2 != null) {
            nGSDKAPIContentInfoView2.setVisibility(z ? 0 : 8);
        }
    }

    private boolean a(AdParams adParams) {
        return (adParams == null || TextUtils.isEmpty(adParams.getCtaExtensionHtml())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, UrlClickSource urlClickSource) {
        if (urlClickSource == UrlClickSource.VAST || urlClickSource == UrlClickSource.CUSTOM_CTA) {
            this.d.getViewabilityAdSession().fireClick();
        }
        this.d.openUrl(str, urlClickSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final int i, final int i2, View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.h.post(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ViewControllerVast.this.a(i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i, int i2) {
        this.h.setLayoutParams(Utils.calculateNewLayoutParams((FrameLayout.LayoutParams) this.h.getLayoutParams(), i, i2, this.e.getWidth(), this.e.getHeight(), Utils.StretchOption.NO_STRETCH));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.m.post(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ViewControllerVast.this.d();
            }
        });
    }

    private void a(View view, ViewGroup viewGroup) {
        Object parent = view.getParent();
        while ((parent instanceof View) && parent != viewGroup) {
            View view2 = (View) parent;
            if (view2.getVisibility() != 0) {
                view2.setVisibility(0);
            }
            parent = view2.getParent();
        }
    }

    private void b(Context context) {
        this.o = new NextGenCTAView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int asIntPixels = ViewUtils.asIntPixels(6.0f, context);
        int i = (new ScreenDimensionsUtils().getScreenDimensionsToPoint(context).y * 10) / 100;
        layoutParams.setMargins(asIntPixels, i, asIntPixels, i);
        layoutParams.gravity = 85;
        this.o.setLayoutParams(layoutParams);
        this.o.setContentDescription("ctaView");
    }

    private SkipOffset c() {
        Integer num = this.z;
        if (num != null) {
            if (num.intValue() > SkipOffsetManager.getMaximumEndcardCloseDelay().intValue()) {
                return new SkipOffset(SkipOffsetManager.getMaximumEndcardCloseDelay().intValue(), true);
            }
            return new SkipOffset(this.z.intValue(), true);
        }
        return new SkipOffset(SkipOffsetManager.getDefaultEndcardSkipOffset().intValue(), false);
    }

    private void a(boolean z) {
        CountDownView countDownView = this.f;
        if (countDownView == null || countDownView.getVisibility() == 8) {
            return;
        }
        if (z) {
            this.f.setVisibility(4);
        } else {
            this.f.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.n.post(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.vast.ViewControllerVast$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                ViewControllerVast.this.e();
            }
        });
    }

    private void b(boolean z) {
        ImageView imageView = this.y;
        if (imageView == null || imageView.getVisibility() == 8) {
            return;
        }
        if (z) {
            this.y.setVisibility(4);
        } else {
            this.y.setVisibility(0);
        }
    }

    private void a() {
        FrameLayout frameLayout = this.l;
        if (frameLayout != null) {
            hideUx(frameLayout.getVisibility() == 0);
        }
    }

    private void a(Context context) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int dimensionPixelSize4;
        float dimension;
        if (this.t && this.r) {
            TextView textView = (TextView) this.k.findViewById(R.id.openURL);
            ImageView imageView = (ImageView) this.k.findViewById(R.id.openURLIcon);
            ImageView imageView2 = (ImageView) this.k.findViewById(R.id.openURLOldIcon);
            LinearLayout linearLayout = (LinearLayout) this.k.findViewById(R.id.openUrlLayout);
            Resources resources = context.getResources();
            LearnMoreLocation location = this.v.getLocation();
            if (location != LearnMoreLocation.DEFAULT) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
                int i = f.a[location.ordinal()];
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
            LearnMoreSize size = this.v.getSize();
            if (size != LearnMoreSize.DEFAULT) {
                int i2 = f.b[size.ordinal()];
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

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.d.closeSelf();
    }
}
