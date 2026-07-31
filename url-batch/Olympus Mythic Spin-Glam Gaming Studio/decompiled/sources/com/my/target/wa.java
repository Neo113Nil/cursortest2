package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
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
import com.my.target.va;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.internal.widget.DivLayoutParams;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public abstract class wa extends FrameLayout implements va, View.OnClickListener {
    private final h0 a;
    protected final LinearLayout b;
    private final l1 c;
    protected final va.a d;
    protected h2 e;
    protected boolean f;
    protected j3 g;
    protected final hg h;
    protected w2 i;
    private final LinearLayout j;
    protected int k;
    protected e2 l;
    private final we m;
    final View.OnTouchListener n;

    public wa(h0 h0Var, l1 l1Var, we weVar, va.a aVar, Context context) {
        super(context);
        this.e = h2.a();
        this.f = false;
        this.n = new g2(new g2.a() { // from class: com.my.target.wa$$ExternalSyntheticLambda0
            @Override // com.my.target.g2.a
            public final void a(h2 h2Var) {
                wa.this.a(h2Var);
            }
        });
        this.d = aVar;
        this.a = h0Var;
        this.c = l1Var;
        this.m = weVar;
        this.h = hg.a(context);
        this.i = w2.a(context);
        this.k = getContext().getResources().getConfiguration().orientation;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout a = a(context);
        this.b = a;
        qi.b(a, "content");
        addView(a);
        setBackgroundColor(this.i.a(w2.r));
        LinearLayout b = b(context);
        this.j = b;
        addView(b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h2 h2Var) {
        this.e = h2Var;
    }

    private void e() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int a = this.h.a(hg.k);
        layoutParams.setMargins(a, a, a, a);
        layoutParams.gravity = DivLayoutParams.DEFAULT_GRAVITY;
        this.a.setLayoutParams(layoutParams);
    }

    private GradientDrawable f() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1711276032, 1627389952, 1375731712, DivSeparatorView.DEFAULT_DIVIDER_COLOR, 83886080, 0});
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        return gradientDrawable;
    }

    private void g() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        this.c.setLayoutParams(layoutParams);
        this.c.getCloseButton().setOnClickListener(this);
        this.c.getAdChoicesButton().setOnClickListener(this);
    }

    private void setAdIcon(@Nullable ImageData imageData) {
        if (imageData == null || imageData.getData() == null) {
            this.a.getAdsIcon().setVisibility(8);
        } else {
            this.a.getAdsIcon().setImageBitmap(imageData.getData());
            this.a.getAdsIcon().setVisibility(0);
        }
    }

    private void setAgeRestrictions(@NonNull String str) {
        this.a.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        this.a.getAgeRestrictionsTextView().setText(str);
    }

    private void setDescription(@NonNull String str) {
        if (this.g != null) {
            if (TextUtils.isEmpty(str)) {
                this.g.getDescriptionTextView().setVisibility(8);
            } else {
                this.g.getDescriptionTextView().setText(str);
                this.g.getDescriptionTextView().setVisibility(0);
            }
        }
    }

    private void setTitle(@NonNull String str) {
        if (this.g != null) {
            if (TextUtils.isEmpty(str)) {
                this.g.getTitleTextView().setVisibility(8);
            } else {
                this.g.getTitleTextView().setText(str);
                this.g.getTitleTextView().setVisibility(0);
            }
        }
    }

    private void setTitleAction(@NonNull String str) {
        if (this.g != null) {
            if (TextUtils.isEmpty(str)) {
                this.g.getCtaButton().setVisibility(8);
            } else {
                this.g.getCtaButton().setText(str);
                this.g.getCtaButton().setVisibility(0);
            }
        }
    }

    @Override // com.my.target.va
    public void b() {
        this.c.getCloseButton().setVisibility(0);
        this.c.getSkipButton().setVisibility(8);
        this.c.getProgressFrame().setVisibility(8);
    }

    @Override // com.my.target.va
    public void c() {
        this.c.getProgressFrame().setVisibility(8);
    }

    @Override // com.my.target.va
    public void d() {
        this.c.getSkipButton().setVisibility(0);
        this.c.getCloseButton().setVisibility(8);
        this.c.getProgressFrame().setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.va
    @Nullable
    public LinearLayout getTopBar() {
        return this.j;
    }

    public void onClick(View view) {
        if (this.f) {
            b(view);
        } else {
            c(view);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.i = w2.a(getContext());
        int i = configuration.orientation;
        this.k = i;
        this.b.setOrientation((i != 2 || qi.f(getContext())) ? 1 : 0);
        LinearLayout linearLayout = this.b;
        w2 w2Var = this.i;
        int i2 = w2.r;
        linearLayout.setBackgroundColor(w2Var.a(i2));
        setBackgroundColor(this.i.a(i2));
        this.d.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setBanner(@NonNull d9 d9Var) {
        this.c.getAdChoicesButton().setVisibility(d9Var.a() == null ? 8 : 0);
        setIcon(d9Var.w());
        setAdIcon(d9Var.d0());
        setDomain(d9Var.B().equals("store") ? d9Var.h() : d9Var.s());
        setTitle(d9Var.K());
        setDescription(d9Var.n());
        setTitleAction(d9Var.l());
        setAgeRestrictions(d9Var.b());
        a(d9Var.f().b(), d9Var.i());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    protected void setClickAreaActual(@NonNull e2 e2Var) {
        this.b.setOnTouchListener(this.n);
        this.a.setOnTouchListener(this.n);
        j3 j3Var = this.g;
        if (j3Var != null) {
            j3Var.getTitleTextView().setOnTouchListener(this.n);
            this.g.getDescriptionTextView().setOnTouchListener(this.n);
            this.g.getCtaButton().setOnTouchListener(this.n);
            this.a.getAdsIcon().setOnTouchListener(this.n);
            if (this.g.getDomainTextView() != null && this.g.getLogoImageView() != null) {
                this.g.getLogoImageView().setOnTouchListener(this.n);
                this.g.getDomainTextView().setOnTouchListener(this.n);
            }
        }
        if (e2Var.m) {
            this.b.setOnClickListener(this);
            this.a.setOnClickListener(this);
            this.a.getAdsIcon().setOnClickListener(this);
            j3 j3Var2 = this.g;
            if (j3Var2 != null) {
                j3Var2.getTitleTextView().setOnClickListener(this);
                this.g.getDescriptionTextView().setOnClickListener(this);
                this.g.getCtaButton().setOnClickListener(this);
                if (this.g.getDomainTextView() == null || this.g.getLogoImageView() == null) {
                    return;
                }
                this.g.getLogoImageView().setOnClickListener(this);
                this.g.getDomainTextView().setOnClickListener(this);
                return;
            }
            return;
        }
        this.b.setOnClickListener(e2Var.l ? this : null);
        this.a.setOnClickListener((e2Var.h || e2Var.i) ? this : null);
        this.a.getAdsIcon().setOnClickListener(e2Var.c ? this : null);
        j3 j3Var3 = this.g;
        if (j3Var3 != null) {
            j3Var3.getCtaButton().setOnClickListener(e2Var.g ? this : null);
            this.g.getCtaButton().setEnabled(e2Var.g);
            this.g.getTitleTextView().setOnClickListener(e2Var.a ? this : null);
            this.g.getDescriptionTextView().setOnClickListener(e2Var.b ? this : null);
            if (this.g.getDomainTextView() == null || this.g.getLogoImageView() == null) {
                return;
            }
            this.g.getLogoImageView().setOnClickListener(e2Var.j ? this : null);
            this.g.getDomainTextView().setOnClickListener(e2Var.j ? this : null);
        }
    }

    protected void setClickAreaLegacy(@NonNull e2 e2Var) {
        if (e2Var.m) {
            setOnClickListener(this);
            j3 j3Var = this.g;
            if (j3Var != null) {
                j3Var.getCtaButton().setOnClickListener(this);
                return;
            }
            return;
        }
        this.b.setOnClickListener(e2Var.l ? this : null);
        this.a.setOnClickListener((e2Var.h || e2Var.i) ? this : null);
        this.a.getAdsIcon().setOnClickListener(e2Var.c ? this : null);
        j3 j3Var2 = this.g;
        if (j3Var2 != null) {
            j3Var2.getCtaButton().setOnClickListener(e2Var.g ? this : null);
            this.g.getCtaButton().setEnabled(e2Var.g);
            this.g.getTitleTextView().setOnClickListener(e2Var.a ? this : null);
            this.g.getDescriptionTextView().setOnClickListener(e2Var.b ? this : null);
            if (this.g.getDomainTextView() == null || this.g.getLogoImageView() == null) {
                return;
            }
            this.g.getLogoImageView().setOnClickListener(e2Var.j ? this : null);
            this.g.getDomainTextView().setOnClickListener(e2Var.j ? this : null);
        }
    }

    protected void setDomain(@NonNull String str) {
        j3 j3Var = this.g;
        if ((j3Var instanceof ah) || j3Var == null || j3Var.getDomainTextView() == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.g.getDomainTextView().setVisibility(8);
        } else {
            this.g.getDomainTextView().setText(str);
            this.g.getDomainTextView().setVisibility(0);
        }
    }

    public abstract /* synthetic */ void setDoubleBanners(@NonNull List list);

    protected void setIcon(@Nullable ImageData imageData) {
        if (imageData == null || imageData.getData() == null) {
            return;
        }
        j3 j3Var = this.g;
        if ((j3Var instanceof ah) || j3Var == null || j3Var.getLogoImageView() == null) {
            return;
        }
        this.g.getLogoImageView().setImageBitmap(h1.a(imageData.getData()));
        this.g.getLogoImageView().setVisibility(0);
    }

    @Override // com.my.target.va
    public void setRemainingAllowCloseDelay(int i) {
        this.c.getProgress().setText(String.valueOf(i));
    }

    protected int a(View view) {
        j3 j3Var = this.g;
        if (j3Var != null && view == j3Var.getCtaButton()) {
            return 64;
        }
        j3 j3Var2 = this.g;
        if (j3Var2 != null && view == j3Var2.getTitleTextView()) {
            return 1;
        }
        if (view == this.a.getAgeRestrictionsTextView()) {
            return 128;
        }
        j3 j3Var3 = this.g;
        return (j3Var3 == null || view != j3Var3.getDescriptionTextView()) ? 2048 : 2;
    }

    protected void c(View view) {
        if (this.d == null) {
            return;
        }
        if (view == this.c.getCloseButton()) {
            this.d.e();
            return;
        }
        if (this.c.getAdChoicesButton() == view) {
            this.d.a();
            return;
        }
        if (this.a.getAdsIcon() == view) {
            this.d.d();
            return;
        }
        j3 j3Var = this.g;
        if (j3Var != null && view == j3Var.getCtaButton() && this.g.getCtaButton().isEnabled()) {
            this.d.a(2, q2.a());
        } else {
            this.d.a(1, q2.a());
        }
    }

    @Override // com.my.target.va
    @NonNull
    public v5 getCloseButton() {
        return this.c.getCloseButton();
    }

    protected void b(View view) {
        if (this.d == null) {
            return;
        }
        if (view == this.c.getCloseButton()) {
            this.d.e();
            return;
        }
        if (this.a.getAdsIcon() == view) {
            this.d.d();
            return;
        }
        if (this.c.getAdChoicesButton() == view) {
            this.d.a();
            return;
        }
        j3 j3Var = this.g;
        if (j3Var != null && view == j3Var.getCtaButton() && this.g.getCtaButton().isEnabled()) {
            this.d.a(2, t2.a(64, this.e));
        } else {
            this.d.a(1, t2.a(a(view), this.e));
        }
    }

    private ViewGroup.LayoutParams a(double d) {
        if (qi.f(getContext())) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        if (this.k == 2) {
            if (this.g instanceof ig) {
                return new LinearLayout.LayoutParams(-1, -1);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            layoutParams.weight = 1.0f;
            return layoutParams;
        }
        if (this.g instanceof ah) {
            if (d > 0.699999988079071d) {
                return new LinearLayout.LayoutParams(-1, -1);
            }
            return new LinearLayout.LayoutParams(-1, -2);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.weight = 1.0f;
        return layoutParams2;
    }

    public void c(int i, int i2, double d) {
        j3 j3Var = this.g;
        if (j3Var != null) {
            this.b.removeView(j3Var);
        }
        j3 b = b(i, i2, d);
        this.g = b;
        if (b != null) {
            b.setLayoutParams(a(d));
            this.b.addView(this.g);
        }
    }

    private LinearLayout b(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, qi.a(112, context)));
        linearLayout.setOrientation(1);
        we weVar = this.m;
        if (weVar != null) {
            linearLayout.addView(weVar);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        e();
        qi.b(this.a, "age_restriction_view");
        frameLayout.addView(this.a);
        g();
        qi.b(this.c, "buttons_view");
        frameLayout.addView(this.c);
        linearLayout.addView(frameLayout);
        linearLayout.setBackground(f());
        return linearLayout;
    }

    private LinearLayout.LayoutParams a(int i, int i2, double d) {
        c(i, i2, d);
        if (qi.f(getContext())) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.weight = 1.0f;
            return layoutParams;
        }
        if (this.k == 2) {
            return new LinearLayout.LayoutParams(i, -1);
        }
        if (d > 0.699999988079071d) {
            return new LinearLayout.LayoutParams(-1, i2);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 1.0f;
        return layoutParams2;
    }

    private j3 b(int i, int i2, double d) {
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
        if (i2 > i6 && i2 < i7 && d > 0.699999988079071d) {
            return new f1(getContext());
        }
        if (i2 < i6) {
            return new f1(getContext());
        }
        return new ah(getContext());
    }

    protected LinearLayout.LayoutParams a(int i, int i2) {
        Point b = qi.b(getContext());
        int i3 = b.x;
        int i4 = b.y;
        double d = i / i2;
        if (d == 1.0d) {
            if (i3 >= i4) {
                i3 = (int) (i4 / d);
            }
            i4 = (int) (i3 / d);
        } else if (this.k == 2) {
            float a = qi.a(282, getContext());
            if (d > 1.0d) {
                float f = (i3 / 3.0f) * 2.0f;
                i3 = (int) (i4 * d);
                float f2 = i3;
                if (f2 < a) {
                    i3 = (int) a;
                } else if (f2 > f) {
                    i3 = (int) f;
                }
                i4 = (int) (i3 / d);
            } else {
                i3 = (int) (i4 * d);
                if (i3 < a) {
                    i3 = (int) a;
                }
            }
        } else {
            if (i2 > qi.a(698, getContext())) {
                float f3 = (i4 * 85.0f) / 100.0f;
                i4 = (int) f3;
                i3 = (int) (f3 * (i / f3));
            }
            i4 = (int) (i3 / d);
        }
        return a(i3, i4, d);
    }

    private LinearLayout a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(this.k == 2 ? 0 : 1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        return linearLayout;
    }

    private void a(boolean z, e2 e2Var) {
        this.f = z;
        this.l = e2Var;
        if (z) {
            setClickAreaActual(e2Var);
        } else {
            setClickAreaLegacy(e2Var);
        }
    }
}
