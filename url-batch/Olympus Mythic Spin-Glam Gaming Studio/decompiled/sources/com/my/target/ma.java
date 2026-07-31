package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;
import com.my.target.va;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class ma extends wa implements View.OnClickListener {
    private final z5 o;

    public ma(h0 h0Var, l1 l1Var, z5 z5Var, we weVar, va.a aVar, Context context) {
        super(h0Var, l1Var, weVar, aVar, context);
        this.o = z5Var;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setBackgroundColor(this.i.a(w2.r));
        this.b.addView(z5Var, 0);
    }

    @Override // com.my.target.va
    public View a() {
        return this;
    }

    @Override // com.my.target.wa, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.wa, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.o.setBackgroundColor(this.i.a(w2.x));
    }

    @Override // com.my.target.wa, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.my.target.wa, com.my.target.va
    public void setBanner(@NonNull d9 d9Var) {
        Bitmap data;
        ImageData y = d9Var.y();
        if (y != null && (data = y.getData()) != null) {
            this.o.getImageView().setImageBitmap(data);
            this.o.setLayoutParams(a(data.getWidth(), data.getHeight()));
            this.o.requestLayout();
        }
        super.setBanner(d9Var);
    }

    @Override // com.my.target.wa
    @SuppressLint({"ClickableViewAccessibility"})
    protected void setClickAreaActual(@NonNull e2 e2Var) {
        super.setClickAreaActual(e2Var);
        this.o.getImageView().setOnTouchListener(this.n);
        this.o.getLogoImageView().setOnTouchListener(this.n);
        this.o.getDomainTextView().setOnTouchListener(this.n);
        if (e2Var.m) {
            this.o.getImageView().setOnClickListener(this);
            this.o.getLogoImageView().setOnClickListener(this);
            this.o.getDomainTextView().setOnClickListener(this);
        } else {
            this.o.getImageView().setOnClickListener(e2Var.d ? this : null);
            this.o.getLogoImageView().setOnClickListener(e2Var.c ? this : null);
            this.o.getDomainTextView().setOnClickListener(e2Var.j ? this : null);
        }
    }

    @Override // com.my.target.wa
    protected void setClickAreaLegacy(@NonNull e2 e2Var) {
        super.setClickAreaLegacy(e2Var);
        this.o.getImageView().setOnClickListener(e2Var.d ? this : null);
        this.o.getLogoImageView().setOnClickListener(e2Var.c ? this : null);
        this.o.getDomainTextView().setOnClickListener(e2Var.j ? this : null);
    }

    @Override // com.my.target.wa
    protected void setDomain(@NonNull String str) {
        super.setDomain(str);
        j3 j3Var = this.g;
        if (j3Var instanceof ah) {
            if (TextUtils.isEmpty(str)) {
                this.o.getDomainTextView().setVisibility(8);
            } else {
                this.o.getDomainTextView().setText(str);
                this.o.getDomainTextView().setVisibility(0);
            }
            this.o.getDomainContainer().setVisibility(0);
            return;
        }
        if (j3Var == null || j3Var.getDomainTextView() == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.o.getDomainContainer().setVisibility(8);
    }

    @Override // com.my.target.wa, com.my.target.va
    public void setDoubleBanners(@NonNull List<e4> list) {
    }

    @Override // com.my.target.wa
    protected void setIcon(@Nullable ImageData imageData) {
        super.setIcon(imageData);
        if (imageData == null || imageData.getData() == null || !(this.g instanceof ah)) {
            return;
        }
        this.o.getLogoImageView().setImageBitmap(h1.a(imageData.getData()));
    }

    @Override // com.my.target.wa
    protected int a(View view) {
        if (view == this.o.getImageView()) {
            return 8;
        }
        return super.a(view);
    }
}
