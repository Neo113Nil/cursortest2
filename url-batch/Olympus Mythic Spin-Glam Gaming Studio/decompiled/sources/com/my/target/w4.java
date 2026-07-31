package com.my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes9.dex */
public class w4 extends RelativeLayout {
    private final RelativeLayout a;
    private final ImageView b;
    private final ImageView c;
    private final qi d;
    private final boolean e;
    private final View.OnClickListener f;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class a implements View.OnClickListener {
        private final Context a;

        private a(Context context) {
            this.a = context;
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.r);
            p0.startActivity(p1);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://target.my.com/"));
                if (!(this.a instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.a, intent);
            } catch (Throwable th) {
                mi.a("FooterView$GoToMyTargetClickListener: Error - " + th.getMessage());
            }
        }
    }

    public w4(Context context, qi qiVar, boolean z) {
        super(context);
        this.a = new RelativeLayout(context);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        qi.b(imageView, "logo_image");
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        qi.b(imageView2, "store_image");
        this.d = qiVar;
        this.e = z;
        this.f = new a(context);
    }

    void a() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        this.a.setLayoutParams(layoutParams);
        this.b.setImageBitmap(f9.a(getContext()));
        this.a.addView(this.b);
        this.a.addView(this.c);
        addView(this.a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    void a(int i, boolean z) {
        int i2 = i / 3;
        if (this.e) {
            i2 = i / 5;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, i2);
        if (z) {
            layoutParams.setMargins(this.d.b(24), this.d.b(4), this.d.b(24), this.d.b(8));
        } else {
            layoutParams.setMargins(this.d.b(24), this.d.b(16), this.d.b(24), this.d.b(16));
        }
        layoutParams.addRule(15, -1);
        layoutParams.addRule(20);
        this.c.setScaleType(ImageView.ScaleType.FIT_START);
        this.c.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, i2);
        if (z) {
            layoutParams2.setMargins(this.d.b(8), this.d.b(4), this.d.b(8), this.d.b(8));
        } else {
            layoutParams2.setMargins(this.d.b(24), this.d.b(16), this.d.b(24), this.d.b(16));
        }
        layoutParams2.addRule(15, -1);
        layoutParams2.addRule(21);
        this.b.setScaleType(ImageView.ScaleType.FIT_END);
        this.b.setLayoutParams(layoutParams2);
        this.b.setOnClickListener(this.f);
    }
}
