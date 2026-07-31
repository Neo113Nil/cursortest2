package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.my.target.common.models.ImageData;
import com.my.target.g2;
import com.my.target.y0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.yandex.div.internal.widget.DivLayoutParams;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class pa extends FrameLayout implements View.OnClickListener, y0.a {
    private final oa a;
    private final h0 b;
    private final l1 c;
    private final y0 d;
    private final hg e;
    private boolean f;
    final View.OnTouchListener g;
    private h2 h;

    public pa(h0 h0Var, l1 l1Var, y0 y0Var, oa oaVar, Context context) {
        super(context);
        this.f = false;
        this.g = new g2(new g2.a() { // from class: com.my.target.pa$$ExternalSyntheticLambda0
            @Override // com.my.target.g2.a
            public final void a(h2 h2Var) {
                pa.this.a(h2Var);
            }
        });
        this.h = h2.a();
        this.a = oaVar;
        this.d = y0Var;
        this.b = h0Var;
        this.c = l1Var;
        this.e = hg.a(context);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        y0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setBackgroundColor(w2.a(context).a(w2.r));
        addView(y0Var);
        addView(a(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h2 h2Var) {
        this.h = h2Var;
    }

    private void c() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        this.c.setLayoutParams(layoutParams);
        this.c.getCloseButton().setOnClickListener(this);
        this.c.getAdChoicesButton().setOnClickListener(this);
    }

    @Override // com.my.target.y0.a
    public void b() {
        this.a.b();
    }

    public void d() {
        this.c.getProgressFrame().setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void e() {
        this.c.getCloseButton().setVisibility(0);
        this.c.getSkipButton().setVisibility(8);
        this.c.getProgressFrame().setVisibility(8);
    }

    @NonNull
    public v5 getCloseButton() {
        return this.c.getCloseButton();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.c.getCloseButton()) {
            this.a.e();
        } else if (this.c.getAdChoicesButton() == view) {
            this.a.a();
        } else if (this.b.getAdsIcon() == view) {
            this.a.d();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setHtmlSource(@NonNull p8 p8Var) {
        this.d.setBannerWebViewListener(this);
        String e0 = p8Var.e0();
        if (e0 == null) {
            this.a.a("failed to load, null source");
        } else {
            this.d.setData(e0);
            this.d.setForceMediaPlayback(p8Var.d0());
        }
    }

    public void setRemainingAllowCloseDelay(int i) {
        this.c.getProgress().setText(String.valueOf(i));
    }

    public void setShowingChoiceButton(boolean z) {
        this.c.getAdChoicesButton().setVisibility(z ? 0 : 8);
    }

    public void a(boolean z, e2 e2Var) {
        this.f = z;
        if (z) {
            setOnTouchListener(this.g);
            this.b.setOnTouchListener(this.g);
        }
        if (e2Var.m) {
            setOnClickListener(this);
            return;
        }
        setOnClickListener(e2Var.l ? this : null);
        this.b.setOnClickListener((e2Var.h || e2Var.i) ? this : null);
        this.b.getAdsIcon().setOnClickListener(e2Var.c ? this : null);
    }

    @Override // com.my.target.y0.a
    public void a(WebView webView, int i, String str, String str2) {
        this.a.a(str);
    }

    @Override // com.my.target.y0.a
    public void a(String str) {
        this.a.a(str, 1, a(a(this.d)));
    }

    @Override // com.my.target.y0.a
    public void a(WebView webView, String str) {
        this.a.a(webView);
    }

    private LinearLayout a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, qi.a(112, context)));
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        a();
        qi.b(this.b, "age_restriction_view");
        frameLayout.addView(this.b);
        c();
        qi.b(this.c, "buttons_view");
        frameLayout.addView(this.c);
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    public void a(ImageData imageData, String str) {
        this.b.setVisibility((imageData == null && TextUtils.isEmpty(str)) ? 8 : 0);
        this.b.getAgeRestrictionsTextView().setText(str);
        if (imageData != null) {
            this.b.getAdsIcon().setImageBitmap(imageData.getData());
        }
    }

    private n2 a(int i) {
        if (this.f) {
            return t2.a(i, this.h);
        }
        return q2.a();
    }

    private int a(View view) {
        return view == this.b.getAgeRestrictionsTextView() ? 128 : 2048;
    }

    private void a() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int a = this.e.a(hg.k);
        layoutParams.setMargins(a, a, a, a);
        layoutParams.gravity = DivLayoutParams.DEFAULT_GRAVITY;
        this.b.setLayoutParams(layoutParams);
    }
}
