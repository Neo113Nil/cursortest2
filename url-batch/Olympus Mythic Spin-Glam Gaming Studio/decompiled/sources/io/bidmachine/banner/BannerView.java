package io.bidmachine.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.AdView;
import io.bidmachine.BannerAdSize;
import io.bidmachine.ViewAdObject;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;

/* loaded from: classes3.dex */
public class BannerView extends AdView<BannerView, a, BannerRequest, ViewAdObject<BannerRequest, UnifiedBannerAd, UnifiedBannerAdRequestParams>, BannerListener> {
    public BannerView(@NonNull Context context) {
        super(context);
    }

    @Override // io.bidmachine.AdView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public BannerAdSize getAdSize() {
        a ad = getAd();
        if (ad != null) {
            return ad.a();
        }
        return null;
    }

    @Override // io.bidmachine.AdView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public BannerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.AdView
    public a createAd(Context context) {
        return new a(context);
    }

    public BannerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
