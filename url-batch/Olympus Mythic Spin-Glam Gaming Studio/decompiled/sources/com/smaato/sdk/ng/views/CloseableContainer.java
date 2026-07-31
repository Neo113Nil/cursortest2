package com.smaato.sdk.ng.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.R;
import com.smaato.sdk.ng.utils.ViewUtils;
import com.smaato.sdk.ng.vpaid.helpers.BitmapHelper;
import com.yandex.div.internal.widget.DivLayoutParams;
import java.util.Random;

/* loaded from: classes13.dex */
public class CloseableContainer extends FrameLayout {
    private Integer a;
    private Integer b;
    private OnCloseListener c;
    private OnSkipListener d;
    private final ImageButton e;
    private final ImageButton f;
    private ClosePosition g;

    public enum ClosePosition {
        TOP_LEFT(DivLayoutParams.DEFAULT_GRAVITY),
        TOP_CENTER(49),
        TOP_RIGHT(8388661),
        CENTER(17),
        BOTTOM_LEFT(8388691),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(8388693),
        RANDOM(0);

        private final int a;

        ClosePosition(int i) {
            this.a = i;
        }

        public static ClosePosition getRandomPosition() {
            return values()[new Random().nextInt(values().length)];
        }

        int b() {
            return this.a;
        }
    }

    public interface OnCloseListener {
        void onClose();
    }

    public interface OnSkipListener {
        void onSkip();
    }

    public CloseableContainer(Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        playSoundEffect(0);
        OnCloseListener onCloseListener = this.c;
        if (onCloseListener != null) {
            onCloseListener.onClose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        playSoundEffect(0);
        OnSkipListener onSkipListener = this.d;
        if (onSkipListener != null) {
            onSkipListener.onSkip();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.v, this, me);
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

    public void setClosePosition(ClosePosition closePosition) {
        if (closePosition != null) {
            if (closePosition == ClosePosition.RANDOM) {
                this.g = ClosePosition.getRandomPosition();
                return;
            }
            if (closePosition != ClosePosition.TOP_LEFT) {
                this.g = closePosition;
                return;
            }
            int convertDpToPixel = (int) ViewUtils.convertDpToPixel(0.0f, getContext());
            int convertDpToPixel2 = (int) ViewUtils.convertDpToPixel(0.0f, getContext());
            this.g = closePosition;
            this.e.setPadding(convertDpToPixel2, convertDpToPixel2, convertDpToPixel, convertDpToPixel);
        }
    }

    public void setCloseSize(Integer num) {
        this.a = Integer.valueOf((int) ViewUtils.convertDpToPixel(num.floatValue(), getContext()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.a.intValue(), this.a.intValue());
        layoutParams.gravity = this.g.b();
        removeView(this.e);
        addView(this.e, layoutParams);
    }

    public void setCloseVisible(boolean z) {
        ImageButton imageButton = this.f;
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
        ImageButton imageButton2 = this.e;
        if (imageButton2 != null) {
            imageButton2.setVisibility(z ? 0 : 8);
            if (z) {
                a();
            }
        }
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
        this.c = onCloseListener;
    }

    public void setOnSkipListener(OnSkipListener onSkipListener) {
        this.d = onSkipListener;
    }

    public void setSkipSize(Integer num) {
        this.b = Integer.valueOf((int) ViewUtils.convertDpToPixel(num.floatValue(), getContext()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.b.intValue(), this.b.intValue());
        layoutParams.gravity = DivLayoutParams.DEFAULT_GRAVITY;
        removeView(this.f);
        addView(this.f, layoutParams);
    }

    public void setSkipVisible(boolean z) {
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
        ImageButton imageButton2 = this.f;
        if (imageButton2 != null) {
            imageButton2.setVisibility(z ? 0 : 8);
            if (z) {
                b();
            }
        }
    }

    public CloseableContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CloseableContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = null;
        this.b = null;
        this.g = ClosePosition.TOP_LEFT;
        int convertDpToPixel = (int) ViewUtils.convertDpToPixel(0.0f, context);
        int convertDpToPixel2 = (int) ViewUtils.convertDpToPixel(0.0f, context);
        ImageButton imageButton = new ImageButton(context);
        this.e = imageButton;
        ImageButton imageButton2 = new ImageButton(context);
        this.f = imageButton2;
        Bitmap bitmap = BitmapHelper.toBitmap(context, NextGen.getNormalCloseXmlResource(), Integer.valueOf(R.mipmap.close));
        Bitmap bitmap2 = BitmapHelper.toBitmap(context, NextGen.getNormalCloseXmlResource(), Integer.valueOf(R.mipmap.skip));
        if (bitmap != null) {
            imageButton.setImageBitmap(bitmap);
        } else {
            imageButton.setImageBitmap(BitmapHelper.decodeResource(imageButton.getContext(), Integer.valueOf(R.mipmap.close)));
        }
        if (bitmap2 != null) {
            imageButton2.setImageBitmap(bitmap2);
        } else {
            imageButton2.setImageBitmap(BitmapHelper.decodeResource(imageButton2.getContext(), Integer.valueOf(R.mipmap.skip)));
        }
        imageButton.setId(R.id.button_fullscreen_close);
        imageButton.setBackgroundColor(0);
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageButton.setScaleType(scaleType);
        imageButton.setPadding(convertDpToPixel, convertDpToPixel2, convertDpToPixel2, convertDpToPixel);
        imageButton2.setId(R.id.button_fullscreen_skip);
        imageButton2.setBackgroundColor(0);
        imageButton2.setScaleType(scaleType);
        imageButton2.setPadding(convertDpToPixel, convertDpToPixel2, convertDpToPixel2, convertDpToPixel);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.ng.views.CloseableContainer$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CloseableContainer.this.a(view);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.ng.views.CloseableContainer$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CloseableContainer.this.b(view);
            }
        });
    }

    private void a() {
        FrameLayout.LayoutParams layoutParams;
        if (this.a != null) {
            layoutParams = new FrameLayout.LayoutParams(this.a.intValue(), this.a.intValue());
            this.e.setId(R.id.button_fullscreen_close_small);
            int convertDpToPixel = (int) ViewUtils.convertDpToPixel(8.0f, getContext());
            layoutParams.setMargins(convertDpToPixel, convertDpToPixel, convertDpToPixel, convertDpToPixel);
        } else {
            int convertDpToPixel2 = (int) ViewUtils.convertDpToPixel(30.0f, getContext());
            layoutParams = new FrameLayout.LayoutParams(convertDpToPixel2, convertDpToPixel2);
        }
        layoutParams.gravity = this.g.b();
        View view = this.f;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.e;
        if (view2 != null) {
            removeView(view2);
            addView(this.e, layoutParams);
        }
    }

    private void b() {
        FrameLayout.LayoutParams layoutParams;
        if (this.b != null) {
            layoutParams = new FrameLayout.LayoutParams(this.b.intValue(), this.b.intValue());
            this.f.setId(R.id.button_fullscreen_skip_small);
            int convertDpToPixel = (int) ViewUtils.convertDpToPixel(8.0f, getContext());
            layoutParams.setMargins(convertDpToPixel, convertDpToPixel, convertDpToPixel, convertDpToPixel);
        } else {
            int convertDpToPixel2 = (int) ViewUtils.convertDpToPixel(30.0f, getContext());
            layoutParams = new FrameLayout.LayoutParams(convertDpToPixel2, convertDpToPixel2);
        }
        layoutParams.gravity = DivLayoutParams.DEFAULT_GRAVITY;
        View view = this.e;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f;
        if (view2 != null) {
            removeView(view2);
            addView(this.f, layoutParams);
        }
    }
}
