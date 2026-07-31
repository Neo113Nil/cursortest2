package com.yandex.div.core.view2.divs;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div2.DivVideoScale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivVideoBinder.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\f\u0010\u000f\u001a\u00020\u000b*\u00020\u000bH\u0002¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/view2/divs/PreviewImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "setImageBitmap", "", "bm", "Landroid/graphics/Bitmap;", "setImageDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "setScale", "scale", "Lcom/yandex/div2/DivVideoScale;", "tryScaleAccordingToDensity", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PreviewImageView extends AppCompatImageView {

    @NotNull
    private static final ImageView.ScaleType NO_SCALE = ImageView.ScaleType.CENTER;

    @NotNull
    private static final ImageView.ScaleType FIT = ImageView.ScaleType.FIT_CENTER;

    @NotNull
    private static final ImageView.ScaleType FILL = ImageView.ScaleType.CENTER_CROP;

    /* compiled from: DivVideoBinder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivVideoScale.values().length];
            try {
                iArr[DivVideoScale.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivVideoScale.NO_SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivVideoScale.FIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public PreviewImageView(@NotNull Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
        setVisibility(4);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable != null ? tryScaleAccordingToDensity(drawable) : null);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(@Nullable Bitmap bm) {
        if (getScaleType() == NO_SCALE && bm != null) {
            bm.setDensity(160);
        }
        super.setImageBitmap(bm);
    }

    public final void setScale(@NotNull DivVideoScale scale) {
        ImageView.ScaleType scaleType;
        int i = WhenMappings.$EnumSwitchMapping$0[scale.ordinal()];
        if (i == 1) {
            scaleType = FILL;
        } else if (i == 2) {
            scaleType = NO_SCALE;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            scaleType = FIT;
        }
        setScaleType(scaleType);
    }

    private final Drawable tryScaleAccordingToDensity(Drawable drawable) {
        if (getScaleType() == NO_SCALE && (drawable instanceof BitmapDrawable)) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (bitmap != null) {
                bitmap.setDensity(160);
            }
            bitmapDrawable.setTargetDensity(getContext().getResources().getDisplayMetrics());
        }
        return drawable;
    }
}
