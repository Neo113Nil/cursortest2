package com.pubmatic.sdk.nativead.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.pubmatic.sdk.nativead.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes5.dex */
public class POBNativeAdMediumTemplateView extends POBNativeTemplateView {

    @Nullable
    protected ImageView iconImage;

    public POBNativeAdMediumTemplateView(@NonNull Context context) {
        super(context, R.layout.pob_medium_template);
        this.iconImage = null;
        this.iconImage = (ImageView) findViewById(R.id.pob_icon_image);
    }

    @Override // com.pubmatic.sdk.nativead.views.POBNativeTemplateView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.F, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public ImageView getIconImage() {
        return this.iconImage;
    }

    @Override // com.pubmatic.sdk.nativead.views.POBNativeTemplateView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImageView imageView = this.iconImage;
        if (imageView != null) {
            imageView.setTag(2);
        }
    }

    @Override // com.pubmatic.sdk.nativead.views.POBNativeTemplateView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setIconImage(@Nullable ImageView imageView) {
        this.iconImage = imageView;
    }

    @Override // com.pubmatic.sdk.nativead.views.POBNativeTemplateView, android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        ImageView imageView = this.iconImage;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public POBNativeAdMediumTemplateView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.iconImage = null;
    }

    public POBNativeAdMediumTemplateView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.iconImage = null;
    }

    @RequiresApi
    public POBNativeAdMediumTemplateView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.iconImage = null;
    }
}
