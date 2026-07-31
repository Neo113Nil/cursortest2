package io.intercom.android.sdk.views;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import io.intercom.android.sdk.utilities.ImageUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* loaded from: classes8.dex */
public class ResizableImageView extends AppCompatImageView {
    private int imageHeight;
    private int imageWidth;
    private int totalViewPadding;

    public ResizableImageView(Context context) {
        this(context, null);
    }

    public ResizableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ResizableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setDisplayImageDimensions(int i, int i2) {
        this.imageHeight = i2;
        this.imageWidth = i;
    }

    public void setTotalViewPadding(int i) {
        this.totalViewPadding = i;
    }

    public Point getImageDimens() {
        double aspectRatio = ImageUtils.getAspectRatio(this.imageWidth, this.imageHeight);
        int min = Math.min(this.imageWidth, calculateContainerWidth() - this.totalViewPadding);
        return new Point(min, ImageUtils.getAspectHeight(min, aspectRatio));
    }

    private int calculateContainerWidth() {
        return ScreenUtils.getScreenDimensions(getContext()).x;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        Point imageDimens = getImageDimens();
        if (this.imageWidth > 0 && this.imageHeight > 0) {
            setMeasuredDimension(imageDimens.x, imageDimens.y);
        } else {
            super.onMeasure(i, i2);
        }
    }
}
