package com.monetization.ads.fullscreen.template.view;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.compose.ui.graphics.BlendModeColorFilterHelper$$ExternalSyntheticApiModelOutline0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.zl2;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/monetization/ads/fullscreen/template/view/ColorizedRatingView;", "Lyads/zl2;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "", "setProgressDrawable", "(Landroid/graphics/drawable/Drawable;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ColorizedRatingView extends zl2 {
    private static final int a = Color.parseColor("#FFF4C900");

    public ColorizedRatingView(@NotNull Context context) {
        super(context);
    }

    @Override // yads.zl2, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // yads.zl2, android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@Nullable Drawable drawable) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        super.setProgressDrawable(drawable);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
            if (layerDrawable.getNumberOfLayers() >= 3) {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    blendMode3 = BlendMode.SRC_ATOP;
                    drawable2.setColorFilter(BlendModeColorFilterHelper$$ExternalSyntheticApiModelOutline0.m(-3355444, blendMode3));
                } else {
                    drawable2.setColorFilter(-3355444, PorterDuff.Mode.SRC_ATOP);
                }
                Drawable drawable3 = layerDrawable.getDrawable(1);
                int i2 = a;
                if (i >= 29) {
                    blendMode2 = BlendMode.SRC_ATOP;
                    drawable3.setColorFilter(BlendModeColorFilterHelper$$ExternalSyntheticApiModelOutline0.m(i2, blendMode2));
                } else {
                    drawable3.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
                }
                Drawable drawable4 = layerDrawable.getDrawable(2);
                if (i < 29) {
                    drawable4.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
                } else {
                    blendMode = BlendMode.SRC_ATOP;
                    drawable4.setColorFilter(BlendModeColorFilterHelper$$ExternalSyntheticApiModelOutline0.m(i2, blendMode));
                }
            }
        }
    }

    public ColorizedRatingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ColorizedRatingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
