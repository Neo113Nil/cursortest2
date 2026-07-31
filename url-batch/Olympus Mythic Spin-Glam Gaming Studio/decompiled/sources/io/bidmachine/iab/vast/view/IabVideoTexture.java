package io.bidmachine.iab.vast.view;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes5.dex */
public class IabVideoTexture extends TextureView {
    private int a;
    private int b;

    public IabVideoTexture(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r1 > r6) goto L27;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        int i3;
        int defaultSize = View.getDefaultSize(this.a, i);
        int defaultSize2 = View.getDefaultSize(this.b, i2);
        if (this.a > 0 && this.b > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i4 = this.a;
                int i5 = i4 * size2;
                int i6 = this.b;
                int i7 = size * i6;
                if (i5 < i7) {
                    defaultSize = i5 / i6;
                    defaultSize2 = size2;
                } else {
                    if (i5 > i7) {
                        defaultSize2 = i7 / i4;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            } else if (mode == 1073741824) {
                int i8 = (this.b * size) / this.a;
                if (mode2 != Integer.MIN_VALUE || i8 <= size2) {
                    defaultSize2 = i8;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i3 = (this.a * size2) / this.b;
                    if (mode == Integer.MIN_VALUE) {
                    }
                } else {
                    int i9 = this.a;
                    int i10 = this.b;
                    if (mode2 != Integer.MIN_VALUE || i10 <= size2) {
                        i3 = i9;
                        size2 = i10;
                    } else {
                        i3 = (size2 * i9) / i10;
                    }
                    if (mode == Integer.MIN_VALUE && i3 > size) {
                        defaultSize2 = (i10 * size) / i9;
                        defaultSize = size;
                    }
                }
                defaultSize = i3;
                defaultSize2 = size2;
            }
        }
        Log.e("Size", defaultSize + "/" + defaultSize2);
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    public void setVideoSize(int i, int i2) {
        this.a = i;
        this.b = i2;
        requestLayout();
    }
}
