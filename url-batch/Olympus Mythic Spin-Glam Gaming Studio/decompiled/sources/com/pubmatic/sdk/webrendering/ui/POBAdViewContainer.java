package com.pubmatic.sdk.webrendering.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.pubmatic.sdk.common.R;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/pubmatic/sdk/webrendering/ui/POBAdViewContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lcom/pubmatic/sdk/common/view/POBWebView;", "adView", "<init>", "(Landroid/content/Context;Lcom/pubmatic/sdk/common/view/POBWebView;)V", "", "encodedWatermarkImage", "", "addWatermark", "(Ljava/lang/String;)V", "", "isExpanded", "resizeAdInfoIcon", "(Z)V", "isFullScreen", "isVideo", "Landroid/view/View$OnClickListener;", "clickListener", "addAdInfoIcon", "(ZZLandroid/view/View$OnClickListener;)V", "a", "Landroid/content/Context;", "b", "Lcom/pubmatic/sdk/common/view/POBWebView;", "getAdView", "()Lcom/pubmatic/sdk/common/view/POBWebView;", "Landroid/widget/ImageButton;", "c", "Landroid/widget/ImageButton;", "getAdInfoIcon", "()Landroid/widget/ImageButton;", "setAdInfoIcon", "(Landroid/widget/ImageButton;)V", "adInfoIcon", "Landroid/widget/ImageView;", "d", "Landroid/widget/ImageView;", "getWatermarkView", "()Landroid/widget/ImageView;", "setWatermarkView", "(Landroid/widget/ImageView;)V", "watermarkView", "webrendering_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class POBAdViewContainer extends FrameLayout {

    /* renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: from kotlin metadata */
    private final POBWebView adView;

    /* renamed from: c, reason: from kotlin metadata */
    private ImageButton adInfoIcon;

    /* renamed from: d, reason: from kotlin metadata */
    private ImageView watermarkView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POBAdViewContainer(@NotNull Context context, @NotNull POBWebView adView) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adView, "adView");
        this.context = context;
        this.adView = adView;
        addView(adView);
    }

    public final void addAdInfoIcon(boolean isFullScreen, boolean isVideo, @Nullable View.OnClickListener clickListener) {
        ImageButton createAdInfoIconButton = POBUIUtil.createAdInfoIconButton(this.context, R.id.pob_ad_info_icon_btn, R.drawable.pob_ad_info_icon, isFullScreen, isFullScreen && !isVideo);
        this.adInfoIcon = createAdInfoIconButton;
        if (createAdInfoIconButton != null) {
            createAdInfoIconButton.setOnClickListener(clickListener);
        }
        addView(this.adInfoIcon);
    }

    public final void addWatermark(@NotNull String encodedWatermarkImage) {
        Intrinsics.checkNotNullParameter(encodedWatermarkImage, "encodedWatermarkImage");
        ImageView createWatermarkView = POBUIUtil.createWatermarkView(this.context, encodedWatermarkImage);
        this.watermarkView = createWatermarkView;
        if (createWatermarkView != null) {
            addView(createWatermarkView);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.F, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public final ImageButton getAdInfoIcon() {
        return this.adInfoIcon;
    }

    @NotNull
    public final POBWebView getAdView() {
        return this.adView;
    }

    @Nullable
    public final ImageView getWatermarkView() {
        return this.watermarkView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void resizeAdInfoIcon(boolean isExpanded) {
        ImageButton imageButton = this.adInfoIcon;
        if (imageButton != null) {
            POBUIUtil.resizeAdInfoIconBtn(this.context, imageButton, isExpanded);
        }
    }

    public final void setAdInfoIcon(@Nullable ImageButton imageButton) {
        this.adInfoIcon = imageButton;
    }

    public final void setWatermarkView(@Nullable ImageView imageView) {
        this.watermarkView = imageView;
    }
}
