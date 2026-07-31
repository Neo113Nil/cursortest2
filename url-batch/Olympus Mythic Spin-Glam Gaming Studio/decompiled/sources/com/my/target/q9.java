package com.my.target;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.my.target.common.models.ImageData;
import com.my.target.nativeads.views.MediaAdView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class q9 extends RelativeLayout {
    private static final int i = qi.c();
    private final w5 a;
    private final RelativeLayout.LayoutParams b;
    private final fh c;
    private final k1 d;
    private final qi e;
    private final m f;
    private ImageData g;
    private ImageData h;

    public q9(Context context) {
        super(context);
        setBackgroundColor(0);
        qi g = qi.g(context);
        this.e = g;
        fh fhVar = new fh(context);
        this.c = fhVar;
        int i2 = i;
        fhVar.setId(i2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        fhVar.setLayoutParams(layoutParams);
        qi.b(fhVar, "image_view");
        addView(fhVar);
        w5 w5Var = new w5(context);
        this.a = w5Var;
        w5Var.a(a1.a((int) TypedValue.applyDimension(1, 28.0f, context.getResources().getDisplayMetrics())), false);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        this.b = layoutParams2;
        layoutParams2.addRule(7, i2);
        layoutParams2.addRule(6, i2);
        w5Var.setLayoutParams(layoutParams2);
        k1 k1Var = new k1(context);
        this.d = k1Var;
        m mVar = new m(context);
        this.f = mVar;
        mVar.setVisibility(8);
        int b = g.b(10);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = b;
        layoutParams3.gravity = 16;
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.setMargins(b, b, b, b);
        layoutParams4.addRule(5, i2);
        layoutParams4.addRule(6, i2);
        linearLayout.setOrientation(0);
        linearLayout.addView(k1Var);
        linearLayout.addView(mVar, layoutParams3);
        qi.b(w5Var, "close_button");
        addView(w5Var);
        qi.b(k1Var, "age_bordering");
        addView(linearLayout, layoutParams4);
    }

    public void a(ImageData imageData, ImageData imageData2, ImageData imageData3) {
        this.h = imageData;
        this.g = imageData2;
        Bitmap bitmap = imageData3 != null ? imageData3.getBitmap() : null;
        if (bitmap != null) {
            this.a.a(bitmap, true);
            this.b.leftMargin = -this.a.getMeasuredWidth();
            RelativeLayout.LayoutParams layoutParams = this.b;
            layoutParams.bottomMargin = layoutParams.leftMargin;
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NonNull
    public w5 getCloseButton() {
        return this.a;
    }

    @NonNull
    public ImageView getImageView() {
        return this.c;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setAgeRestrictions(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            this.d.setVisibility(8);
            return;
        }
        this.d.a(1, -7829368);
        this.d.setPadding(this.e.b(2), 0, 0, 0);
        this.d.setTextColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
        this.d.a(1, MediaAdView.COLOR_PLACEHOLDER_GRAY, this.e.b(3));
        this.d.setBackgroundColor(1711276032);
        this.d.setText(str);
    }

    public void a(e eVar, View.OnClickListener onClickListener) {
        this.f.setVisibility(0);
        this.f.setImageBitmap(eVar.g().getBitmap());
        this.f.setOnClickListener(onClickListener);
    }

    private void a() {
        Point c = qi.c(getContext());
        int i2 = c.x;
        int i3 = c.y;
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        ImageData imageData = ((float) i2) / ((float) i3) > 1.0f ? this.h : this.g;
        if (imageData == null && (imageData = this.h) == null) {
            imageData = this.g;
        }
        if (imageData == null) {
            return;
        }
        this.c.setImageData(imageData);
    }
}
