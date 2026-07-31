package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.lb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4753lb extends FrameLayout implements NativeAdViewBinderInterface {

    @NotNull
    private final NativeAdViewHolder a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4753lb(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = new NativeAdViewHolder();
    }

    public final void a(@NotNull C4700ib nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        List<View> a = a(this);
        removeAllViews();
        FrameLayout frameLayout = new FrameLayout(getContext());
        a(frameLayout, a);
        AdapterNativeAdViewBinder f = nativeAd.f();
        if (f != null) {
            f.setBodyView(this.a.getBodyView());
            f.setMediaView(this.a.getMediaView());
            f.setCallToActionView(this.a.getCallToActionView());
            f.setTitleView(this.a.getTitleView());
            f.setIconView(this.a.getIconView());
            f.setAdvertiserView(this.a.getAdvertiserView());
            f.setNativeAdView(frameLayout);
            addView(f.getNetworkNativeAdView());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(@Nullable View view) {
        this.a.setAdvertiserView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(@Nullable View view) {
        this.a.setBodyView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(@Nullable View view) {
        this.a.setCallToActionView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(@Nullable View view) {
        this.a.setIconView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(@Nullable LevelPlayMediaView levelPlayMediaView) {
        this.a.setMediaView(levelPlayMediaView);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(@Nullable View view) {
        this.a.setTitleView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4753lb(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = new NativeAdViewHolder();
    }

    private final void a(ViewGroup viewGroup, List<? extends View> list) {
        Iterator<? extends View> it = list.iterator();
        while (it.hasNext()) {
            viewGroup.addView(it.next());
        }
    }

    private final List<View> a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(child, "child");
            arrayList.add(child);
        }
        return arrayList;
    }
}
