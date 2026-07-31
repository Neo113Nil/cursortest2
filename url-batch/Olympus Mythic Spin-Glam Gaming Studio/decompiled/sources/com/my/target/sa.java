package com.my.target;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;
import com.my.target.g2;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.yandex.div.internal.widget.DivLayoutParams;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class sa extends FrameLayout implements View.OnClickListener {
    private final h0 a;
    private final LinearLayout b;
    private final l1 c;
    private h2 d;
    private boolean e;
    private j3 f;
    private final hg g;
    private w2 h;
    private ImageData i;
    private ImageData j;
    private final z5 k;
    protected int l;
    private final ra m;
    final View.OnTouchListener n;

    public sa(h0 h0Var, l1 l1Var, z5 z5Var, ra raVar, Context context) {
        super(context);
        this.d = h2.a();
        this.e = false;
        this.n = new g2(new g2.a() { // from class: com.my.target.sa$$ExternalSyntheticLambda0
            @Override // com.my.target.g2.a
            public final void a(h2 h2Var) {
                sa.this.a(h2Var);
            }
        });
        this.k = z5Var;
        this.m = raVar;
        this.a = h0Var;
        this.c = l1Var;
        this.g = hg.a(context);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.h = w2.a(context);
        this.l = context.getResources().getConfiguration().orientation;
        LinearLayout a = a(context);
        this.b = a;
        qi.b(a, "content");
        addView(a);
        a.addView(z5Var, 0);
        setBackgroundColor(this.h.a(w2.r));
        addView(b(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h2 h2Var) {
        this.d = h2Var;
    }

    private void c() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        this.c.setLayoutParams(layoutParams);
        this.c.getCloseButton().setOnClickListener(this);
        this.c.getAdChoicesButton().setOnClickListener(this);
    }

    private ViewGroup.LayoutParams d() {
        if (qi.f(getContext())) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        if (this.l == 2) {
            if (this.f instanceof ig) {
                return new LinearLayout.LayoutParams(-1, -1);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            layoutParams.weight = 1.0f;
            return layoutParams;
        }
        if (this.f instanceof ah) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.weight = 1.0f;
        return layoutParams2;
    }

    public void b(ImageData imageData, String str) {
        j3 j3Var = this.f;
        if (j3Var instanceof ah) {
            if (TextUtils.isEmpty(str) && imageData == null) {
                this.k.getDomainContainer().setVisibility(8);
                return;
            }
            this.k.getDomainTextView().setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
            this.k.getDomainTextView().setText(str);
            this.k.getLogoImageView().setVisibility(imageData == null ? 8 : 0);
            this.k.getLogoImageView().setImageData(imageData);
            return;
        }
        if (j3Var != null) {
            if (j3Var.getDomainTextView() != null) {
                this.f.getDomainTextView().setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
                this.f.getDomainTextView().setText(str);
            }
            if (this.f.getLogoImageView() != null) {
                this.f.getLogoImageView().setVisibility(imageData == null ? 8 : 0);
                this.f.getLogoImageView().setImageData(imageData);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void e() {
        this.c.getProgressFrame().setVisibility(8);
    }

    public void f() {
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
            this.m.e();
            return;
        }
        if (this.c.getAdChoicesButton() == view) {
            this.m.a();
            return;
        }
        if (this.a.getAdsIcon() == view) {
            this.m.d();
            return;
        }
        j3 j3Var = this.f;
        if (j3Var != null && view == j3Var.getCtaButton() && this.f.getCtaButton().isEnabled()) {
            this.m.a(null, 2, a(64));
        } else {
            this.m.a(null, 1, a(a(view)));
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        this.l = i;
        this.b.setOrientation((i != 2 || qi.f(getContext())) ? 1 : 0);
        this.m.b();
        w2 a = w2.a(getContext());
        this.h = a;
        setBackgroundColor(a.a(w2.r));
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setDescription(@NonNull String str) {
        if (this.f != null) {
            if (TextUtils.isEmpty(str)) {
                this.f.getDescriptionTextView().setVisibility(8);
            } else {
                this.f.getDescriptionTextView().setText(str);
                this.f.getDescriptionTextView().setVisibility(0);
            }
        }
    }

    protected void setIcon(@Nullable ImageData imageData) {
        if (imageData == null || imageData.getData() == null) {
            return;
        }
        j3 j3Var = this.f;
        if ((j3Var instanceof ah) || j3Var == null || j3Var.getLogoImageView() == null) {
            return;
        }
        this.f.getLogoImageView().setImageBitmap(h1.a(imageData.getData()));
        this.f.getLogoImageView().setVisibility(0);
    }

    public void setRemainingAllowCloseDelay(int i) {
        this.c.getProgress().setText(String.valueOf(i));
    }

    public void setShowingChoiceButton(boolean z) {
        this.c.getAdChoicesButton().setVisibility(z ? 0 : 8);
    }

    public void setTitle(@NonNull String str) {
        if (this.f != null) {
            if (TextUtils.isEmpty(str)) {
                this.f.getTitleTextView().setVisibility(8);
            } else {
                this.f.getTitleTextView().setText(str);
                this.f.getTitleTextView().setVisibility(0);
            }
        }
    }

    public void setTitleAction(@NonNull String str) {
        if (this.f != null) {
            if (TextUtils.isEmpty(str)) {
                this.f.getCtaButton().setVisibility(8);
            } else {
                this.f.getCtaButton().setText(str);
                this.f.getCtaButton().setVisibility(0);
            }
        }
    }

    public void a(ImageData imageData, ImageData imageData2) {
        this.j = imageData;
        this.i = imageData2;
        a();
    }

    private n2 a(int i) {
        if (this.e) {
            return t2.a(i, this.d);
        }
        return q2.a();
    }

    private j3 c(int i, int i2) {
        Point c = qi.c(getContext());
        int i3 = c.x;
        int i4 = c.y;
        if (i3 <= 0 || i4 <= 0) {
            return null;
        }
        int i5 = getContext().getResources().getConfiguration().orientation;
        if (qi.f(getContext())) {
            return new ah(getContext());
        }
        if (i5 == 2) {
            if (i < (i3 / 3) * 2) {
                return new f1(getContext());
            }
            return new ig(getContext());
        }
        int i6 = i4 / 2;
        int i7 = (i4 / 4) * 3;
        if (i2 > i6 && i2 < i7) {
            return new f1(getContext());
        }
        if (i2 < i6) {
            return new f1(getContext());
        }
        return new ah(getContext());
    }

    private int a(View view) {
        j3 j3Var = this.f;
        if (j3Var != null && view == j3Var.getCtaButton()) {
            return 64;
        }
        j3 j3Var2 = this.f;
        if (j3Var2 != null && view == j3Var2.getTitleTextView()) {
            return 1;
        }
        if (view == this.a.getAgeRestrictionsTextView()) {
            return 128;
        }
        j3 j3Var3 = this.f;
        return (j3Var3 == null || view != j3Var3.getDescriptionTextView()) ? 2048 : 2;
    }

    private void a() {
        Point c = qi.c(getContext());
        int i = c.x;
        int i2 = c.y;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        ImageData imageData = ((float) i) / ((float) i2) > 1.0f ? this.j : this.i;
        if (imageData == null && (imageData = this.j) == null) {
            imageData = this.i;
        }
        if (imageData == null) {
            return;
        }
        this.k.getImageView().setImageData(imageData);
        this.k.setLayoutParams(a(imageData.getWidth(), imageData.getHeight()));
    }

    private LinearLayout.LayoutParams b(int i, int i2) {
        d(i, i2);
        if (qi.f(getContext())) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.weight = 1.0f;
            return layoutParams;
        }
        if (this.l == 2) {
            return new LinearLayout.LayoutParams(i, -1);
        }
        return new LinearLayout.LayoutParams(-1, i2);
    }

    public void d(int i, int i2) {
        j3 j3Var = this.f;
        if (j3Var != null) {
            this.b.removeView(j3Var);
        }
        j3 c = c(i, i2);
        this.f = c;
        if (c != null) {
            c.setLayoutParams(d());
            this.b.addView(this.f);
        }
    }

    private void b() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int a = this.g.a(hg.k);
        layoutParams.setMargins(a, a, a, a);
        layoutParams.gravity = DivLayoutParams.DEFAULT_GRAVITY;
        this.a.setLayoutParams(layoutParams);
    }

    public void a(boolean z, e2 e2Var) {
        this.e = z;
        if (z) {
            setOnTouchListener(this.n);
            this.a.setOnTouchListener(this.n);
            j3 j3Var = this.f;
            if (j3Var != null) {
                j3Var.getTitleTextView().setOnTouchListener(this.n);
                this.f.getDescriptionTextView().setOnTouchListener(this.n);
                this.f.getCtaButton().setOnTouchListener(this.n);
                this.a.getAdsIcon().setOnTouchListener(this.n);
                if (this.f.getDomainTextView() != null && this.f.getLogoImageView() != null) {
                    this.f.getLogoImageView().setOnTouchListener(this.n);
                    this.f.getDomainTextView().setOnTouchListener(this.n);
                }
            }
        }
        if (e2Var.m) {
            setOnClickListener(this);
            this.a.setOnClickListener(this);
            this.a.getAdsIcon().setOnClickListener(this);
            j3 j3Var2 = this.f;
            if (j3Var2 != null) {
                j3Var2.getTitleTextView().setOnClickListener(this);
                this.f.getDescriptionTextView().setOnClickListener(this);
                this.f.getCtaButton().setOnClickListener(this);
                if (this.f.getDomainTextView() == null || this.f.getLogoImageView() == null) {
                    return;
                }
                this.f.getLogoImageView().setOnClickListener(this);
                this.f.getDomainTextView().setOnClickListener(this);
                return;
            }
            return;
        }
        setOnClickListener(e2Var.l ? this : null);
        this.a.setOnClickListener((e2Var.h || e2Var.i) ? this : null);
        this.a.getAdsIcon().setOnClickListener(e2Var.c ? this : null);
        j3 j3Var3 = this.f;
        if (j3Var3 != null) {
            j3Var3.getCtaButton().setOnClickListener(e2Var.g ? this : null);
            this.f.getCtaButton().setEnabled(e2Var.g);
            this.f.getTitleTextView().setOnClickListener(e2Var.a ? this : null);
            this.f.getDescriptionTextView().setOnClickListener(e2Var.b ? this : null);
            if (this.f.getDomainTextView() == null || this.f.getLogoImageView() == null) {
                return;
            }
            this.f.getLogoImageView().setOnClickListener(e2Var.j ? this : null);
            this.f.getDomainTextView().setOnClickListener(e2Var.j ? this : null);
        }
    }

    private LinearLayout b(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, qi.a(112, context)));
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        b();
        qi.b(this.a, "age_restriction_view");
        frameLayout.addView(this.a);
        c();
        qi.b(this.c, "buttons_view");
        frameLayout.addView(this.c);
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r1 < r7) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected LinearLayout.LayoutParams a(int i, int i2) {
        float a;
        int i3;
        Point b = qi.b(getContext());
        int i4 = b.x;
        int i5 = b.y;
        float f = i;
        float f2 = f / i2;
        if (f2 == 1.0f) {
            if (i4 >= i5) {
                a = i5 / f2;
                i4 = (int) a;
            }
            i5 = (int) (i4 / f2);
        } else if (this.l == 2) {
            a = qi.a(282, getContext());
            if (f2 > 1.0f) {
                float f3 = (i4 / 3.0f) * 2.0f;
                i4 = (int) (i5 * f2);
                float f4 = i4;
                if (f4 < a) {
                    i3 = (int) a;
                } else if (f4 > f3) {
                    i3 = (int) f3;
                }
                i5 = (int) (i3 / f2);
                i4 = i3;
            } else {
                i4 = (int) (i5 * f2);
            }
        } else {
            if (i2 > qi.a(693, getContext())) {
                float f5 = (i5 * 85.0f) / 100.0f;
                i5 = (int) f5;
                i4 = (int) (f5 * (f / f5));
            }
            i5 = (int) (i4 / f2);
        }
        return b(i4, i5);
    }

    public void a(ImageData imageData, String str) {
        this.a.setVisibility((imageData == null && TextUtils.isEmpty(str)) ? 8 : 0);
        this.a.getAgeRestrictionsTextView().setText(str);
        if (imageData != null) {
            this.a.getAdsIcon().setImageBitmap(imageData.getData());
        }
    }

    private LinearLayout a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(this.l == 2 ? 0 : 1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        return linearLayout;
    }
}
