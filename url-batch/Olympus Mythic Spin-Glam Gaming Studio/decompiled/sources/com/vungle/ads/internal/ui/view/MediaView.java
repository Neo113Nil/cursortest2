package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.r1;
import com.vungle.ads.nativead.NativeVideoListener;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\b¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MediaView;", "Landroid/widget/RelativeLayout;", "Lcom/vungle/ads/nativead/a;", "getVideoControl", "Lcom/vungle/ads/nativead/NativeVideoListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setNativeVideoListener", "", "getDuration", "getCurrentTime", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes8.dex */
public final class MediaView extends RelativeLayout {
    public NativeVideoListener a;
    public e b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MediaView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final com.vungle.ads.nativead.a getVideoControl() {
        ViewParent viewParent = this.b;
        if (viewParent instanceof com.vungle.ads.nativead.a) {
            return (com.vungle.ads.nativead.a) viewParent;
        }
        return null;
    }

    public final void a(r1 internal2) {
        Intrinsics.checkNotNullParameter(internal2, "internal");
        if (internal2.s()) {
            if (this.b == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                n nVar = new n(context, internal2);
                nVar.setNativeVideoListener(this.a);
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.NATIVE_PLAY_ASSET_TYPE);
                m2Var.a((Long) 1L);
                AnalyticsClient.a(analyticsClient, m2Var, internal2.e(), 4);
                this.b = nVar;
            }
        } else if (this.b == null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            e eVar = new e(context2, internal2);
            AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
            m2 m2Var2 = new m2(Sdk.SDKMetric.SDKMetricType.NATIVE_PLAY_ASSET_TYPE);
            m2Var2.a((Long) 2L);
            AnalyticsClient.a(analyticsClient2, m2Var2, internal2.e(), 4);
            this.b = eVar;
        }
        e eVar2 = this.b;
        if (eVar2 != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            eVar2.setLayoutParams(layoutParams);
            if (!Intrinsics.areEqual(eVar2.getParent(), this)) {
                ViewGroup viewGroup = (ViewGroup) eVar2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(eVar2);
                }
                addView(eVar2);
            }
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            eVar2.a(context3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.d, this, me);
        return super.dispatchTouchEvent(me);
    }

    public final int getCurrentTime() {
        com.vungle.ads.nativead.a videoControl = getVideoControl();
        return (videoControl != null ? ((n) videoControl).getCurrentTime() : 0) / 1000;
    }

    public final int getDuration() {
        com.vungle.ads.nativead.a videoControl = getVideoControl();
        return (videoControl != null ? ((n) videoControl).getDuration() : 0) / 1000;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setNativeVideoListener(@NotNull NativeVideoListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = listener;
        e eVar = this.b;
        n nVar = eVar instanceof n ? (n) eVar : null;
        if (nVar == null) {
            return;
        }
        nVar.setNativeVideoListener(listener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
