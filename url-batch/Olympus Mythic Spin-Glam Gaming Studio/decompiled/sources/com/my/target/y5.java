package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.my.target.common.models.ImageData;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class y5 extends f4 {
    private final z5 o;

    public y5(Context context, g4 g4Var) {
        super(context, g4Var);
        this.o = h(getContext());
    }

    private void b(int i, int i2) {
        Size a = a(i, i2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a.getWidth(), a.getHeight());
        layoutParams.gravity = 17;
        this.o.getImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.o.getImageView().setLayoutParams(layoutParams);
    }

    private z5 h(Context context) {
        z5 z5Var = new z5(context);
        z5Var.setBackground(a(w2.a(context)));
        z5Var.setClipToOutline(true);
        return z5Var;
    }

    @Override // com.my.target.f4
    protected void a(e4 e4Var) {
        this.g.removeView(this.o);
        this.n.a(e4Var, this);
        final ImageData y = e4Var.a().y();
        this.g.addView(this.o, 0);
        if (y == null) {
            return;
        }
        this.o.getImageView().setImageBitmap(y.getBitmap());
        this.o.getImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.g.post(new Runnable() { // from class: com.my.target.y5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                y5.this.a(y);
            }
        });
    }

    @Override // com.my.target.f4, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.f4, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.my.target.f4
    @SuppressLint({"ClickableViewAccessibility"})
    protected void setClickAreaActual(@NonNull e2 e2Var) {
        super.setClickAreaActual(e2Var);
        this.o.setOnTouchListener(this.m);
        if (e2Var.m) {
            this.o.setOnClickListener(this);
        } else {
            this.o.setOnClickListener(e2Var.d ? this : null);
        }
    }

    @Override // com.my.target.f4
    protected void setClickAreaLegacy(@NonNull e2 e2Var) {
        super.setClickAreaLegacy(e2Var);
        if (e2Var.m) {
            this.o.setOnClickListener(this);
        } else {
            this.o.setOnClickListener(e2Var.d ? this : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ImageData imageData) {
        b(imageData.getWidth(), imageData.getHeight());
    }

    @Override // com.my.target.f4
    protected int a(View view) {
        if (view == this.o) {
            return 8;
        }
        return super.a(view);
    }
}
