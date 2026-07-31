package com.smaato.sdk.ng.views.endcard;

import android.annotation.SuppressLint;
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
import com.smaato.sdk.ng.CountdownStyle;
import com.smaato.sdk.ng.R;
import com.smaato.sdk.ng.models.EndCardData;
import com.smaato.sdk.ng.models.SkipOffset;
import com.smaato.sdk.ng.mraid.MRAIDBanner;
import com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener;
import com.smaato.sdk.ng.mraid.MRAIDView;
import com.smaato.sdk.ng.mraid.MRAIDViewListener;
import com.smaato.sdk.ng.network.NGSDKHttpClient;
import com.smaato.sdk.ng.utils.SkipOffsetManager;
import com.smaato.sdk.ng.utils.ViewUtils;
import com.smaato.sdk.ng.views.CustomImageView;
import com.smaato.sdk.ng.views.endcard.NextGenEndCardView;
import com.smaato.sdk.ng.vpaid.CloseButtonListener;
import com.smaato.sdk.ng.vpaid.ReplayListener;
import com.smaato.sdk.ng.vpaid.helpers.SimpleTimer;
import com.smaato.sdk.ng.vpaid.utils.ImageUtils;
import com.smaato.sdk.ng.vpaid.widget.CountDownView;
import com.smaato.sdk.ng.vpaid.widget.CountDownViewFactory;
import com.yandex.div.internal.widget.DivLayoutParams;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class NextGenEndCardView extends FrameLayout {
    private static final CountdownStyle t = CountdownStyle.PIE_CHART;
    private ImageView a;
    private FrameLayout b;
    private MRAIDBanner c;
    private ImageView d;
    private ImageView e;
    private SimpleTimer f;
    private SimpleTimer g;
    private EndCardViewListener h;
    private boolean i;
    private boolean j;
    private String k;
    private GestureDetector l;
    private ReplayListener m;
    private SkipOffset n;
    private Boolean o;
    private boolean p;
    private CountDownView q;
    private final MRAIDViewListener r;
    private MRAIDNativeFeatureListener s;

    public interface EndCardViewListener {
        void onClick(String str, Boolean bool, String str2);

        void onClose(Boolean bool);

        void onLoadFail(Boolean bool);

        void onLoadSuccess(Boolean bool);

        void onShow(Boolean bool, String str);

        void onSkip();
    }

    class a implements MRAIDViewListener {

        /* renamed from: com.smaato.sdk.ng.views.endcard.NextGenEndCardView$a$a, reason: collision with other inner class name */
        class ViewTreeObserverOnDrawListenerC1699a implements ViewTreeObserver.OnDrawListener {
            ViewTreeObserverOnDrawListenerC1699a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void a() {
                FrameLayout frameLayout = NextGenEndCardView.this.b;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnDrawListener(this);
                }
            }

            @Override // android.view.ViewTreeObserver.OnDrawListener
            public void onDraw() {
                FrameLayout frameLayout = NextGenEndCardView.this.b;
                if (frameLayout != null) {
                    frameLayout.post(new Runnable() { // from class: com.smaato.sdk.ng.views.endcard.NextGenEndCardView$a$a$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            NextGenEndCardView.a.ViewTreeObserverOnDrawListenerC1699a.this.a();
                        }
                    });
                }
                MRAIDBanner mRAIDBanner = NextGenEndCardView.this.c;
                if (mRAIDBanner == null || mRAIDBanner.getMeasuredHeight() >= 50) {
                    return;
                }
                NextGenEndCardView.this.c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            }
        }

        a() {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
        public void mraidHideCloseButton() {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
        public void mraidHideSkipButton() {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
        public void mraidShowCloseButton() {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
        public void mraidShowSkipButton() {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
        public void mraidViewClose(MRAIDView mRAIDView) {
            NextGenEndCardView nextGenEndCardView = NextGenEndCardView.this;
            EndCardViewListener endCardViewListener = nextGenEndCardView.h;
            if (endCardViewListener != null) {
                endCardViewListener.onClose(nextGenEndCardView.o);
            }
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
        public void mraidViewError(MRAIDView mRAIDView) {
            NextGenEndCardView nextGenEndCardView = NextGenEndCardView.this;
            nextGenEndCardView.h.onLoadFail(nextGenEndCardView.o);
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
        public void mraidViewExpand(MRAIDView mRAIDView) {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
        public void mraidViewLoaded(MRAIDView mRAIDView) {
            NextGenEndCardView nextGenEndCardView = NextGenEndCardView.this;
            EndCardViewListener endCardViewListener = nextGenEndCardView.h;
            if (endCardViewListener != null) {
                endCardViewListener.onLoadSuccess(nextGenEndCardView.o);
                NextGenEndCardView nextGenEndCardView2 = NextGenEndCardView.this;
                nextGenEndCardView2.h.onShow(nextGenEndCardView2.o, nextGenEndCardView2.k);
            }
            NextGenEndCardView.this.c.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC1699a());
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
        public boolean mraidViewResize(MRAIDView mRAIDView, int i, int i2, int i3, int i4) {
            return false;
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
        public void onCustomCTAClick() {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
        public void onCustomCTALoadFail() {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
        public void onCustomCTAShow() {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
        public void onCustomEndCardClicked() {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
        public void onCustomEndCardClosed() {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
        public void onCustomEndCardLoadFail() {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
        public void onCustomEndCardLoadSuccess() {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
        public void onCustomEndCardShow(String str) {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
        public void onExpandedAdClosed() {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
        public void onReplayClicked() {
            ReplayListener replayListener = NextGenEndCardView.this.m;
            if (replayListener != null) {
                replayListener.replayVast();
            }
        }
    }

    class b implements MRAIDNativeFeatureListener {
        b() {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
        public void mraidNativeFeatureCallTel(String str) {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
        public void mraidNativeFeatureCreateCalendarEvent(String str) {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
        public void mraidNativeFeatureOpenBrowser(String str) {
            NextGenEndCardView nextGenEndCardView = NextGenEndCardView.this;
            EndCardViewListener endCardViewListener = nextGenEndCardView.h;
            if (endCardViewListener != null) {
                endCardViewListener.onClick(str, nextGenEndCardView.o, nextGenEndCardView.k);
            }
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
        public void mraidNativeFeaturePlayVideo(String str) {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
        public void mraidNativeFeatureSendSms(String str) {
        }

        @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
        public void mraidNativeFeatureStorePicture(String str) {
        }
    }

    class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return true;
        }
    }

    class d implements NGSDKHttpClient.Listener {
        final /* synthetic */ EndCardData a;

        d(EndCardData endCardData) {
            this.a = endCardData;
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onFailure(Throwable th) {
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onSuccess(String str, Map<String, List<String>> map) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            NextGenEndCardView.this.a(str, this.a.isCustom().booleanValue());
        }
    }

    class e implements SimpleTimer.Listener {
        final /* synthetic */ Runnable a;
        final /* synthetic */ int b;

        e(Runnable runnable, int i) {
            this.a = runnable;
            this.b = i;
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.SimpleTimer.Listener
        public void onFinish() {
            CountDownView countDownView = NextGenEndCardView.this.q;
            if (countDownView != null) {
                countDownView.setVisibility(8);
            }
            Runnable runnable = this.a;
            if (runnable != null) {
                runnable.run();
            }
            SimpleTimer simpleTimer = NextGenEndCardView.this.f;
            if (simpleTimer != null) {
                simpleTimer.cancel();
                NextGenEndCardView.this.f = null;
            }
            NextGenEndCardView.this.j = false;
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.SimpleTimer.Listener
        public void onTick(long j) {
            CountDownView countDownView = NextGenEndCardView.this.q;
            if (countDownView != null) {
                int i = this.b;
                countDownView.setProgress((int) (i - j), i);
            }
        }
    }

    class f implements SimpleTimer.Listener {
        final /* synthetic */ Runnable a;
        final /* synthetic */ int b;

        f(Runnable runnable, int i) {
            this.a = runnable;
            this.b = i;
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.SimpleTimer.Listener
        public void onFinish() {
            CountDownView countDownView = NextGenEndCardView.this.q;
            if (countDownView != null) {
                countDownView.setVisibility(8);
            }
            Runnable runnable = this.a;
            if (runnable != null) {
                runnable.run();
            }
            SimpleTimer simpleTimer = NextGenEndCardView.this.g;
            if (simpleTimer != null) {
                simpleTimer.cancel();
                NextGenEndCardView.this.g = null;
            }
            NextGenEndCardView.this.i = false;
        }

        @Override // com.smaato.sdk.ng.vpaid.helpers.SimpleTimer.Listener
        public void onTick(long j) {
            CountDownView countDownView = NextGenEndCardView.this.q;
            if (countDownView != null) {
                int i = this.b;
                countDownView.setProgress((int) (i - j), i);
            }
        }
    }

    public NextGenEndCardView(Context context) {
        super(context);
        this.i = false;
        this.j = false;
        this.k = "";
        this.n = new SkipOffset(SkipOffsetManager.getDefaultEndcardSkipOffset().intValue(), false);
        this.o = Boolean.FALSE;
        this.p = false;
        this.r = new a();
        this.s = new b();
        a(context);
    }

    private void a(Context context) {
        e();
        b(context);
    }

    private void b(Context context) {
        if (!f()) {
            EndCardViewListener endCardViewListener = this.h;
            if (endCardViewListener != null) {
                endCardViewListener.onLoadFail(this.o);
                return;
            }
            return;
        }
        int convertDpToPixel = (int) ViewUtils.convertDpToPixel(30.0f, getContext());
        if (this.p) {
            convertDpToPixel = (int) ViewUtils.convertDpToPixel(20.0f, getContext());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(convertDpToPixel, convertDpToPixel);
        layoutParams.gravity = 8388611;
        int convertDpToPixel2 = (int) ViewUtils.convertDpToPixel(8.0f, getContext());
        layoutParams.setMargins(convertDpToPixel2, convertDpToPixel2, 0, 0);
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        if (this.p) {
            imageView.setId(R.id.end_card_skip_view_small);
        } else {
            imageView.setId(R.id.end_card_skip_view);
        }
        this.d.setLayoutParams(layoutParams);
        this.d.setImageResource(R.mipmap.skip);
        this.d.setVisibility(8);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.ng.views.endcard.NextGenEndCardView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NextGenEndCardView.this.b(view);
            }
        });
        ImageView imageView2 = new ImageView(getContext());
        this.e = imageView2;
        if (this.p) {
            imageView2.setId(R.id.button_fullscreen_close_small);
        } else {
            imageView2.setId(R.id.button_fullscreen_close);
        }
        CountDownView createCountdownView = new CountDownViewFactory().createCountdownView(context, t, this);
        this.q = createCountdownView;
        createCountdownView.setId(R.id.endcard_close_countdown_view);
        int convertDpToPixel3 = (int) ViewUtils.convertDpToPixel(this.p ? 60.0f : 80.0f, context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(convertDpToPixel3, convertDpToPixel3);
        layoutParams2.gravity = DivLayoutParams.DEFAULT_GRAVITY;
        layoutParams2.setMargins(convertDpToPixel2, convertDpToPixel2, convertDpToPixel2, convertDpToPixel2);
        this.q.setLayoutParams(layoutParams2);
        this.q.setVisibility(8);
        this.e.setLayoutParams(layoutParams);
        this.e.setImageResource(R.mipmap.close);
        this.e.setVisibility(8);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.ng.views.endcard.NextGenEndCardView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NextGenEndCardView.this.c(view);
            }
        });
        addView(this.d);
        addView(this.e);
        addView(this.q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        EndCardViewListener endCardViewListener = this.h;
        if (endCardViewListener != null) {
            endCardViewListener.onClose(this.o);
        }
    }

    private void d() {
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.bringToFront();
        }
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.bringToFront();
        }
        CountDownView countDownView = this.q;
        if (countDownView != null) {
            countDownView.bringToFront();
        }
        postInvalidateOnAnimation();
    }

    private void e() {
        if (f()) {
            setVisibility(8);
            setBackgroundColor(0);
            try {
                this.l = new GestureDetector(getContext(), new c());
                return;
            } catch (Exception unused) {
                return;
            }
        }
        EndCardViewListener endCardViewListener = this.h;
        if (endCardViewListener != null) {
            endCardViewListener.onLoadFail(this.o);
        }
    }

    private boolean f() {
        return getContext() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.d.setVisibility(0);
        this.d.bringToFront();
    }

    private void h() {
        ImageView imageView = this.a;
        if (imageView != null) {
            removeView(imageView);
            this.a = null;
        }
        FrameLayout frameLayout = this.b;
        if (frameLayout != null) {
            removeView(frameLayout);
            this.b = null;
        }
    }

    public void destroy() {
        SimpleTimer simpleTimer = this.f;
        if (simpleTimer != null) {
            simpleTimer.cancel();
        }
        SimpleTimer simpleTimer2 = this.g;
        if (simpleTimer2 != null) {
            simpleTimer2.cancel();
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.v, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void hide() {
        a();
        setVisibility(8);
    }

    public void hideSkipButton() {
        this.d.setVisibility(8);
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
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.l;
        if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void pause() {
        SimpleTimer simpleTimer = this.f;
        if (simpleTimer != null) {
            simpleTimer.pause();
        }
        SimpleTimer simpleTimer2 = this.g;
        if (simpleTimer2 != null) {
            simpleTimer2.pause();
        }
        MRAIDBanner mRAIDBanner = this.c;
        if (mRAIDBanner != null) {
            mRAIDBanner.pause();
        }
    }

    public void resume() {
        SimpleTimer simpleTimer = this.f;
        if (simpleTimer != null) {
            simpleTimer.resume();
        }
        SimpleTimer simpleTimer2 = this.g;
        if (simpleTimer2 != null) {
            simpleTimer2.resume();
        }
        MRAIDBanner mRAIDBanner = this.c;
        if (mRAIDBanner != null) {
            mRAIDBanner.resume();
        }
    }

    public void setEndCardViewListener(EndCardViewListener endCardViewListener) {
        this.h = endCardViewListener;
    }

    public void setSkipOffset(SkipOffset skipOffset) {
        this.n = skipOffset;
    }

    public void show(EndCardData endCardData, String str) {
        EndCardViewListener endCardViewListener;
        h();
        setVisibility(0);
        if (endCardData != null) {
            this.o = endCardData.isCustom();
            a(endCardData);
            a();
            if (endCardData.getType() == EndCardData.Type.STATIC_RESOURCE) {
                ImageView c2 = c();
                this.a = c2;
                if (c2 == null) {
                    EndCardViewListener endCardViewListener2 = this.h;
                    if (endCardViewListener2 != null) {
                        endCardViewListener2.onLoadFail(this.o);
                        return;
                    }
                    return;
                }
                addView(c2);
                this.a.setVisibility(0);
                ImageUtils.setScaledImage(this.a, str);
                d();
                EndCardViewListener endCardViewListener3 = this.h;
                if (endCardViewListener3 != null) {
                    endCardViewListener3.onLoadSuccess(this.o);
                    this.h.onShow(endCardData.isCustom(), this.k);
                }
                this.k = "static";
                return;
            }
            if (TextUtils.isEmpty(endCardData.getContent())) {
                return;
            }
            FrameLayout b2 = b();
            this.b = b2;
            if (b2 == null) {
                EndCardViewListener endCardViewListener4 = this.h;
                if (endCardViewListener4 != null) {
                    endCardViewListener4.onLoadFail(this.o);
                    return;
                }
                return;
            }
            addView(b2);
            this.b.setVisibility(0);
            d();
            if (endCardData.getType() != EndCardData.Type.IFRAME_RESOURCE) {
                this.k = "html";
                a(endCardData.getContent(), endCardData.isCustom().booleanValue());
                return;
            }
            this.k = "iframe";
            if (!f() && (endCardViewListener = this.h) != null) {
                endCardViewListener.onLoadFail(this.o);
            }
            NGSDKHttpClient.makeRequest(getContext(), endCardData.getContent(), null, null, true, new d(endCardData));
        }
    }

    public synchronized void showCloseButton(final CloseButtonListener closeButtonListener) {
        if (this.i) {
            return;
        }
        this.d.setVisibility(8);
        startCloseTimer(new Runnable() { // from class: com.smaato.sdk.ng.views.endcard.NextGenEndCardView$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                NextGenEndCardView.this.a(closeButtonListener);
            }
        });
        this.i = true;
    }

    public synchronized void showSkipButton() {
        if (this.j) {
            return;
        }
        this.e.setVisibility(4);
        startSkipOffsetTimer(new Runnable() { // from class: com.smaato.sdk.ng.views.endcard.NextGenEndCardView$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                NextGenEndCardView.this.g();
            }
        });
        this.j = true;
    }

    public synchronized void startCloseTimer(Runnable runnable) {
        try {
            int offset = this.n.getOffset() * 1000;
            if (offset < 0) {
                runnable.run();
                return;
            }
            CountDownView countDownView = this.q;
            if (countDownView != null) {
                countDownView.setVisibility(0);
                d();
            }
            SimpleTimer simpleTimer = new SimpleTimer(offset, new f(runnable, offset), 50L);
            this.g = simpleTimer;
            simpleTimer.start();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void startSkipOffsetTimer(Runnable runnable) {
        try {
            int offset = this.n.getOffset() * 1000;
            if (offset < 0) {
                runnable.run();
                return;
            }
            CountDownView countDownView = this.q;
            if (countDownView != null) {
                countDownView.setVisibility(0);
                d();
            }
            SimpleTimer simpleTimer = new SimpleTimer(offset, new e(runnable, offset), 50L);
            this.f = simpleTimer;
            simpleTimer.start();
        } catch (Throwable th) {
            throw th;
        }
    }

    private ImageView c() {
        if (!f()) {
            return null;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        CustomImageView customImageView = new CustomImageView(getContext());
        customImageView.setLayoutParams(layoutParams);
        customImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        customImageView.setVisibility(8);
        customImageView.setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.ng.views.endcard.NextGenEndCardView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NextGenEndCardView.this.a(view);
            }
        });
        this.k = "static";
        return customImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        EndCardViewListener endCardViewListener = this.h;
        if (endCardViewListener != null) {
            endCardViewListener.onClick(null, this.o, this.k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z) {
        if (!f()) {
            this.h.onLoadFail(this.o);
            return;
        }
        Context context = getContext();
        Boolean bool = Boolean.FALSE;
        MRAIDBanner mRAIDBanner = new MRAIDBanner(context, "", str, bool, bool, new String[0], this.r, this.s, null);
        this.c = mRAIDBanner;
        mRAIDBanner.setSkipOffset(Integer.valueOf(this.n.getOffset()));
        this.c.setUseCustomClose(Boolean.TRUE);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.gravity = 16;
        this.c.setLayoutParams(layoutParams);
        FrameLayout frameLayout = this.b;
        if (frameLayout != null) {
            frameLayout.addView(this.c);
            d();
            EndCardViewListener endCardViewListener = this.h;
            if (endCardViewListener != null) {
                endCardViewListener.onLoadSuccess(this.o);
                this.h.onShow(this.o, this.k);
                return;
            }
            return;
        }
        EndCardViewListener endCardViewListener2 = this.h;
        if (endCardViewListener2 != null) {
            endCardViewListener2.onLoadFail(this.o);
        }
    }

    private void a(EndCardData endCardData) {
        if (endCardData == null) {
            return;
        }
        if (endCardData.isCustom().booleanValue()) {
            setBackgroundColor(0);
        } else {
            setBackgroundColor(-16777216);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(CloseButtonListener closeButtonListener) {
        this.e.setVisibility(0);
        this.e.bringToFront();
        if (closeButtonListener != null) {
            closeButtonListener.onCloseButtonVisible();
        }
    }

    private void a() {
        FrameLayout frameLayout = this.b;
        if (frameLayout != null) {
            removeView(frameLayout);
            this.b = null;
        }
        ImageView imageView = this.a;
        if (imageView != null) {
            removeView(imageView);
            this.a.setImageDrawable(null);
            this.a = null;
            MRAIDBanner mRAIDBanner = this.c;
            if (mRAIDBanner != null) {
                mRAIDBanner.destroy();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        EndCardViewListener endCardViewListener = this.h;
        if (endCardViewListener != null) {
            endCardViewListener.onSkip();
        }
    }

    public void show(String str) {
        a();
        ImageView c2 = c();
        this.a = c2;
        if (c2 == null) {
            this.h.onLoadFail(this.o);
            return;
        }
        addView(c2);
        this.a.setVisibility(0);
        ImageUtils.setScaledImage(this.a, str);
    }

    private FrameLayout b() {
        if (!f()) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setVisibility(8);
        frameLayout.setBackgroundColor(0);
        return frameLayout;
    }

    public NextGenEndCardView(Context context, boolean z, ReplayListener replayListener) {
        super(context);
        this.i = false;
        this.j = false;
        this.k = "";
        this.n = new SkipOffset(SkipOffsetManager.getDefaultEndcardSkipOffset().intValue(), false);
        this.o = Boolean.FALSE;
        this.p = false;
        this.r = new a();
        this.s = new b();
        this.p = z;
        this.m = replayListener;
        a(context);
    }

    public NextGenEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = false;
        this.j = false;
        this.k = "";
        this.n = new SkipOffset(SkipOffsetManager.getDefaultEndcardSkipOffset().intValue(), false);
        this.o = Boolean.FALSE;
        this.p = false;
        this.r = new a();
        this.s = new b();
        a(context);
    }

    public NextGenEndCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = false;
        this.j = false;
        this.k = "";
        this.n = new SkipOffset(SkipOffsetManager.getDefaultEndcardSkipOffset().intValue(), false);
        this.o = Boolean.FALSE;
        this.p = false;
        this.r = new a();
        this.s = new b();
        a(context);
    }
}
