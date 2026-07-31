package com.pubmatic.sdk.appopenad.ui;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.appopenad.R;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.models.POBAppInfo;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0001MB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0004\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00112\b\b\u0003\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001aH\u0002¢\u0006\u0004\b\u0016\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u001e\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u0017\u0010!\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0011¢\u0006\u0004\b#\u0010\u0013J\r\u0010$\u001a\u00020\u0011¢\u0006\u0004\b$\u0010\u0013J\r\u0010%\u001a\u00020\u0011¢\u0006\u0004\b%\u0010\u0013J\u000f\u0010&\u001a\u00020\u0011H\u0014¢\u0006\u0004\b&\u0010\u0013R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u00101R$\u00108\u001a\u0002032\u0006\u00104\u001a\u0002038\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u001d\u00105\u001a\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u00104\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0018\u0010C\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0018\u0010K\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010E¨\u0006N"}, d2 = {"Lcom/pubmatic/sdk/appopenad/ui/POBAppOpenAdViewContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/ViewGroup;", "adViewContainer", "", CreativeInfo.B, "(Landroid/content/Context;Landroid/view/ViewGroup;Z)V", "", "b", "()V", "d", "animationResource", "a", "(I)V", "Landroid/animation/Animator;", "animator", "Lkotlin/Function0;", "onComplete", "(Landroid/animation/Animator;Lkotlin/jvm/functions/Function0;)V", EidRequestBuilder.REQUEST_FIELD_EMAIL, "c", "Lcom/pubmatic/sdk/appopenad/ui/POBAppOpenAdViewContainer$OnForwardClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnForwardClickListener", "(Lcom/pubmatic/sdk/appopenad/ui/POBAppOpenAdViewContainer$OnForwardClickListener;)V", "hideForwardButton", "showForwardButton", "cleanup", "onDetachedFromWindow", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "appIconView", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "appNameView", "Landroid/view/View;", "Landroid/view/View;", "forwardButton", "Landroid/widget/ProgressBar;", "Landroid/widget/ProgressBar;", "loadingSpinner", "Landroidx/cardview/widget/CardView;", "<set-?>", "Landroidx/cardview/widget/CardView;", "getContentContainer", "()Landroidx/cardview/widget/CardView;", "contentContainer", "Landroid/widget/RelativeLayout;", InneractiveMediationDefs.GENDER_FEMALE, "Landroid/widget/RelativeLayout;", "headerContainer", "g", "Landroid/view/ViewGroup;", "getAdViewContainer", "()Landroid/view/ViewGroup;", "h", "Lcom/pubmatic/sdk/appopenad/ui/POBAppOpenAdViewContainer$OnForwardClickListener;", "forwardClickListener", "i", "Z", "isSkipable", j.b, "spinnerStarted", CampaignEx.JSON_KEY_AD_K, "Landroid/animation/Animator;", "progressAnimator", "l", "OnForwardClickListener", "appopenad_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class POBAppOpenAdViewContainer extends LinearLayout {

    /* renamed from: a, reason: from kotlin metadata */
    private ImageView appIconView;

    /* renamed from: b, reason: from kotlin metadata */
    private TextView appNameView;

    /* renamed from: c, reason: from kotlin metadata */
    private View forwardButton;

    /* renamed from: d, reason: from kotlin metadata */
    private ProgressBar loadingSpinner;

    /* renamed from: e, reason: from kotlin metadata */
    private CardView contentContainer;

    /* renamed from: f, reason: from kotlin metadata */
    private RelativeLayout headerContainer;

    /* renamed from: g, reason: from kotlin metadata */
    private ViewGroup adViewContainer;

    /* renamed from: h, reason: from kotlin metadata */
    private OnForwardClickListener forwardClickListener;

    /* renamed from: i, reason: from kotlin metadata */
    private boolean isSkipable;

    /* renamed from: j, reason: from kotlin metadata */
    private boolean spinnerStarted;

    /* renamed from: k, reason: from kotlin metadata */
    private Animator progressAnimator;

    /* renamed from: l, reason: from kotlin metadata */
    private boolean isVideoAd;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/pubmatic/sdk/appopenad/ui/POBAppOpenAdViewContainer$OnForwardClickListener;", "", "onForwardClick", "", "appopenad_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnForwardClickListener {
        void onForwardClick();
    }

    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        public final void a() {
            POBAppOpenAdViewContainer.this.c();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POBAppOpenAdViewContainer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(POBAppOpenAdViewContainer this$0, View view) {
        OnForwardClickListener onForwardClickListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.isSkipable || (onForwardClickListener = this$0.forwardClickListener) == null) {
            return;
        }
        onForwardClickListener.onForwardClick();
    }

    private final void b() {
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.pob_app_open_ad_container, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.pob_app_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.pob_app_icon)");
        this.appIconView = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.pob_app_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.pob_app_name)");
        this.appNameView = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.pob_app_open_forward_btn);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.pob_app_open_forward_btn)");
        this.forwardButton = findViewById3;
        View findViewById4 = findViewById(R.id.pob_loading_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(R.id.pob_loading_indicator)");
        this.loadingSpinner = (ProgressBar) findViewById4;
        View findViewById5 = findViewById(R.id.pob_content_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(R.id.pob_content_container)");
        this.contentContainer = (CardView) findViewById5;
        View findViewById6 = findViewById(R.id.pob_header_container);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(R.id.pob_header_container)");
        this.headerContainer = (RelativeLayout) findViewById6;
        d();
        this.isSkipable = false;
        RelativeLayout relativeLayout = this.headerContainer;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerContainer");
            relativeLayout = null;
        }
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.pubmatic.sdk.appopenad.ui.POBAppOpenAdViewContainer$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                POBAppOpenAdViewContainer.a(POBAppOpenAdViewContainer.this, view);
            }
        });
        if (this.isVideoAd) {
            a(this, 0, 1, null);
        } else {
            showForwardButton();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        e();
        showForwardButton();
    }

    private final void d() {
        POBAppInfo appInfo = POBInstanceProvider.getAppInfo(getContext());
        Intrinsics.checkNotNullExpressionValue(appInfo, "getAppInfo(context)");
        Drawable appIcon = appInfo.getAppIcon();
        TextView textView = null;
        if (appIcon != null) {
            ImageView imageView = this.appIconView;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appIconView");
                imageView = null;
            }
            imageView.setImageDrawable(appIcon);
        }
        String appName = appInfo.getAppName();
        if (appName != null) {
            TextView textView2 = this.appNameView;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appNameView");
            } else {
                textView = textView2;
            }
            textView.setText(appName);
        }
    }

    private final void e() {
        ProgressBar progressBar = this.loadingSpinner;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingSpinner");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        a();
    }

    public final void cleanup() {
        a();
        this.spinnerStarted = false;
        this.isSkipable = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.F, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public final ViewGroup getAdViewContainer() {
        return this.adViewContainer;
    }

    @NotNull
    public final CardView getContentContainer() {
        CardView cardView = this.contentContainer;
        if (cardView != null) {
            return cardView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contentContainer");
        return null;
    }

    public final void hideForwardButton() {
        View view = this.forwardButton;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("forwardButton");
            view = null;
        }
        view.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cleanup();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setOnForwardClickListener(@Nullable OnForwardClickListener listener) {
        this.forwardClickListener = listener;
    }

    public final void showForwardButton() {
        View view = this.forwardButton;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("forwardButton");
            view = null;
        }
        view.setVisibility(0);
        this.isSkipable = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POBAppOpenAdViewContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        b();
    }

    static /* synthetic */ void a(POBAppOpenAdViewContainer pOBAppOpenAdViewContainer, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = R.animator.pob_progress_animator;
        }
        pOBAppOpenAdViewContainer.a(i);
    }

    private final synchronized void a(int animationResource) {
        Object m8023constructorimpl;
        try {
            if (!this.spinnerStarted) {
                this.spinnerStarted = true;
                ProgressBar progressBar = this.loadingSpinner;
                Unit unit = null;
                if (progressBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadingSpinner");
                    progressBar = null;
                }
                progressBar.setVisibility(0);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(AnimatorInflater.loadAnimator(getContext(), animationResource));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                    m8023constructorimpl = null;
                }
                Animator animator = (Animator) m8023constructorimpl;
                this.progressAnimator = animator;
                if (animator != null) {
                    a(animator, new a());
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    c();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POBAppOpenAdViewContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POBAppOpenAdViewContainer(@NotNull Context context, @NotNull ViewGroup adViewContainer, boolean z) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adViewContainer, "adViewContainer");
        this.adViewContainer = adViewContainer;
        this.isVideoAd = z;
        b();
        getContentContainer().addView(adViewContainer, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void a(Animator animator, final Function0 onComplete) {
        ProgressBar progressBar = this.loadingSpinner;
        ProgressBar progressBar2 = null;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingSpinner");
            progressBar = null;
        }
        progressBar.setLayerType(2, null);
        ProgressBar progressBar3 = this.loadingSpinner;
        if (progressBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingSpinner");
        } else {
            progressBar2 = progressBar3;
        }
        animator.setTarget(progressBar2);
        animator.addListener(new AnimatorListenerAdapter() { // from class: com.pubmatic.sdk.appopenad.ui.POBAppOpenAdViewContainer$startAnimator$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                ProgressBar progressBar4;
                Intrinsics.checkNotNullParameter(animation, "animation");
                progressBar4 = POBAppOpenAdViewContainer.this.loadingSpinner;
                if (progressBar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadingSpinner");
                    progressBar4 = null;
                }
                progressBar4.setLayerType(0, null);
                onComplete.mo4828invoke();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                ProgressBar progressBar4;
                Intrinsics.checkNotNullParameter(animation, "animation");
                progressBar4 = POBAppOpenAdViewContainer.this.loadingSpinner;
                if (progressBar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadingSpinner");
                    progressBar4 = null;
                }
                progressBar4.setLayerType(0, null);
                onComplete.mo4828invoke();
            }
        });
        animator.start();
    }

    private final void a() {
        Animator animator = this.progressAnimator;
        if (animator != null) {
            animator.cancel();
        }
        this.progressAnimator = null;
    }
}
