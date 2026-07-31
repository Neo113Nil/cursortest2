package com.monetization.ads.nativeads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.R$styleable;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.b30;
import yads.cw2;
import yads.gj3;
import yads.hj3;
import yads.ij;
import yads.j03;
import yads.zv2;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0001\"B+\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\rB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000eR*\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068\u0006@DX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0010\u0010\u0014R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R$\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R(\u0010!\u001a\u0004\u0018\u00010\u001c2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001c8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010)\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/monetization/ads/nativeads/CustomizableMediaView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "Lyads/hj3;", "videoScaleTypeXmlAttributeParserFactory", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILyads/hj3;)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "a", "I", "getVideoControlsLayoutId", "()I", "(I)V", "videoControlsLayoutId", "b", "getWidthMeasureSpec", "widthMeasureSpec", "c", "getHeightMeasureSpec", "heightMeasureSpec", "Lyads/gj3;", "d", "Lyads/gj3;", "getVideoScaleType", "()Lyads/gj3;", "videoScaleType", "Lyads/b30;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lyads/b30;", "getOnSizeChangedListener$mobileads_externalRelease", "()Lyads/b30;", "setOnSizeChangedListener$mobileads_externalRelease", "(Lyads/b30;)V", "onSizeChangedListener", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class CustomizableMediaView extends FrameLayout {
    private static final int f = R$layout.monetization_ads_internal_outstream_controls_default;

    /* renamed from: a, reason: from kotlin metadata */
    private int videoControlsLayoutId;

    /* renamed from: b, reason: from kotlin metadata */
    private int widthMeasureSpec;

    /* renamed from: c, reason: from kotlin metadata */
    private int heightMeasureSpec;

    /* renamed from: d, reason: from kotlin metadata */
    private final gj3 videoScaleType;

    /* renamed from: e, reason: from kotlin metadata */
    private b30 onSizeChangedListener;

    @SuppressLint({"CustomViewStyleable"})
    @VisibleForTesting
    public CustomizableMediaView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, @NotNull hj3 hj3Var) {
        super(context, attributeSet, i);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalMediaView);
            hj3Var.getClass();
            this.videoControlsLayoutId = obtainStyledAttributes.getResourceId(R$styleable.MonetizationAdsInternalMediaView_monetization_internal_video_controls_layout, f);
            this.videoScaleType = (gj3) ArraysKt.getOrNull(gj3.values(), obtainStyledAttributes.getInt(R$styleable.MonetizationAdsInternalMediaView_monetization_internal_video_scale_type, -1));
            obtainStyledAttributes.recycle();
        } else {
            this.videoControlsLayoutId = f;
            this.videoScaleType = null;
        }
        addOnAttachStateChangeListener(new ij(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.monetization.ads.nativeads.CustomizableMediaView$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                CustomizableMediaView.a(CustomizableMediaView.this);
            }
        }));
    }

    protected final void a(int i) {
        this.videoControlsLayoutId = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    public final int getHeightMeasureSpec() {
        return this.heightMeasureSpec;
    }

    @Nullable
    /* renamed from: getOnSizeChangedListener$mobileads_externalRelease, reason: from getter */
    public final b30 getOnSizeChangedListener() {
        return this.onSizeChangedListener;
    }

    public final int getVideoControlsLayoutId() {
        return this.videoControlsLayoutId;
    }

    @Nullable
    public final gj3 getVideoScaleType() {
        return this.videoScaleType;
    }

    public final int getWidthMeasureSpec() {
        return this.widthMeasureSpec;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.widthMeasureSpec = i;
        this.heightMeasureSpec = i2;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        cw2 cw2Var;
        super.onSizeChanged(i, i2, i3, i4);
        b30 b30Var = this.onSizeChangedListener;
        if (b30Var == null || (cw2Var = (cw2) ((zv2) b30Var).a.get()) == null) {
            return;
        }
        j03 j03Var = cw2Var.f;
        if (i < j03Var.b || i2 < j03Var.c) {
            cw2Var.i.setValue(cw2Var, cw2.k[2], cw2Var.e);
        }
    }

    public final void setOnSizeChangedListener$mobileads_externalRelease(@Nullable b30 b30Var) {
        this.onSizeChangedListener = b30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CustomizableMediaView customizableMediaView) {
        b30 b30Var = customizableMediaView.onSizeChangedListener;
        if (b30Var != null) {
            int width = customizableMediaView.getWidth();
            int height = customizableMediaView.getHeight();
            cw2 cw2Var = (cw2) ((zv2) b30Var).a.get();
            if (cw2Var != null) {
                j03 j03Var = cw2Var.f;
                if (width < j03Var.b || height < j03Var.c) {
                    cw2Var.i.setValue(cw2Var, cw2.k[2], cw2Var.e);
                }
            }
        }
    }

    public CustomizableMediaView(@NotNull Context context) {
        this(context, null);
    }

    public CustomizableMediaView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomizableMediaView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, new hj3());
    }
}
