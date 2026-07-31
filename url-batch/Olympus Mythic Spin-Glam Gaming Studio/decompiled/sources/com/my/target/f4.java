package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.my.target.common.models.ImageData;
import com.my.target.g2;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.yandex.div.internal.widget.DivLayoutParams;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class f4 extends LinearLayout implements View.OnClickListener {
    protected final hg a;
    private final TextView b;
    private final TextView c;
    protected final Button d;
    private final fh e;
    private final TextView f;
    protected final FrameLayout g;
    private final h0 h;
    protected final v5 i;
    private boolean j;
    protected e4 k;
    protected h2 l;
    protected final View.OnTouchListener m;
    protected final g4 n;

    public f4(Context context, g4 g4Var) {
        super(context);
        this.l = h2.a();
        this.m = new g2(new g2.a() { // from class: com.my.target.f4$$ExternalSyntheticLambda0
            @Override // com.my.target.g2.a
            public final void a(h2 h2Var) {
                f4.this.a(h2Var);
            }
        });
        this.n = g4Var;
        hg a = hg.a(context);
        this.a = a;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.g = frameLayout;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        frameLayout.setLayoutParams(layoutParams);
        h0 c = c(context);
        this.h = c;
        frameLayout.addView(c);
        v5 b = b(context);
        this.i = b;
        frameLayout.addView(b);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int a2 = a.a(hg.r);
        linearLayout.setPadding(0, a2, 0, a2);
        linearLayout.setLayoutParams(layoutParams2);
        addView(linearLayout);
        TextView g = g(context);
        this.b = g;
        linearLayout.addView(g);
        TextView d = d(context);
        this.c = d;
        linearLayout.addView(d);
        LinearLayout linearLayout2 = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.setMargins(0, a.a(hg.n), 0, 0);
        linearLayout2.setLayoutParams(layoutParams3);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        Button a3 = a(context);
        this.d = a3;
        linearLayout2.addView(a3);
        fh f = f(context);
        this.e = f;
        linearLayout2.addView(f);
        TextView e = e(context);
        this.f = e;
        linearLayout2.addView(e);
        linearLayout.addView(linearLayout2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h2 h2Var) {
        this.l = h2Var;
    }

    private TextView d(Context context) {
        TextView textView = new TextView(context);
        textView.setTextSize(this.a.a(hg.O));
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, this.a.a(hg.g), 0, 0);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private TextView e(Context context) {
        TextView textView = new TextView(context);
        textView.setTextSize(this.a.a(hg.O));
        return textView;
    }

    private fh f(Context context) {
        fh fhVar = new fh(context);
        int a = this.a.a(hg.u);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a, a);
        layoutParams.setMarginEnd(this.a.a(hg.k));
        fhVar.setLayoutParams(layoutParams);
        int a2 = this.a.a(hg.d);
        fhVar.setPadding(a2, a2, a2, a2);
        return fhVar;
    }

    private TextView g(Context context) {
        TextView textView = new TextView(context);
        textView.setTypeface(null, 1);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(this.a.a(hg.N));
        return textView;
    }

    protected abstract void a(e4 e4Var);

    protected void b(View view) {
        int a = a(view);
        if (a == -1) {
            return;
        }
        t2 a2 = t2.a(a, this.l);
        e4 e4Var = this.k;
        if (e4Var == null) {
            return;
        }
        d9 a3 = e4Var.a();
        if (view == this.i) {
            this.n.a(a3, getContext());
        } else if (view == this.d) {
            this.n.a(a3, 2, a2, this);
        } else {
            this.n.a(a3, 1, a2, this);
        }
    }

    protected void c(View view) {
        e4 e4Var = this.k;
        if (e4Var == null) {
            return;
        }
        d9 a = e4Var.a();
        if (view == this.i) {
            this.n.a(a, getContext());
        } else if (view == this.d) {
            this.n.a(a, 2, q2.a(), this);
        } else {
            this.n.a(a, 1, q2.a(), this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.k == null) {
            return;
        }
        if (this.j) {
            b(view);
        } else {
            c(view);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setBannerData(@NonNull e4 e4Var) {
        LinearLayout.LayoutParams layoutParams;
        a();
        this.k = e4Var;
        this.n.b(e4Var.a(), getContext());
        this.j = e4Var.a().f().b();
        a(e4Var);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            int a = (qi.b(getContext()).x - (this.a.a(hg.r) * 3)) / 2;
            layoutParams = new LinearLayout.LayoutParams(a, -1);
            setMinimumWidth(a);
        } else {
            int a2 = (qi.b(getContext()).y - ((this.a.a(hg.r) * 2) + this.a.a(hg.D))) / 2;
            layoutParams = new LinearLayout.LayoutParams(-1, a2);
            setMinimumHeight(a2);
        }
        d9 a3 = e4Var.a();
        setLayoutParams(layoutParams);
        this.b.setText(a3.K());
        this.c.setText(a3.n());
        this.d.setText(a3.l());
        ImageData w = a3.w();
        if (w != null) {
            this.e.setImageBitmap(h1.a(w.getData()));
        }
        this.f.setText(a3.B().equals("store") ? a3.h() : a3.s());
        ImageData d0 = a3.d0();
        String b = a3.b();
        if (d0 == null && TextUtils.isEmpty(b)) {
            this.h.setVisibility(4);
        } else {
            if (d0 != null) {
                this.h.getAdsIcon().setImageBitmap(d0.getBitmap());
            }
            this.h.getAgeRestrictionsTextView().setText(b);
            this.h.setVisibility(0);
        }
        a(a3.f().b(), a3.i());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    protected void setClickAreaActual(@NonNull e2 e2Var) {
        setOnTouchListener(this.m);
        this.c.setOnTouchListener(this.m);
        this.d.setOnTouchListener(this.m);
        if (e2Var.m) {
            setOnClickListener(this);
            this.d.setOnClickListener(this);
            this.c.setOnClickListener(this);
        } else {
            setOnClickListener(e2Var.l ? this : null);
            this.d.setOnClickListener(e2Var.g ? this : null);
            this.c.setOnClickListener(e2Var.b ? this : null);
        }
    }

    protected void setClickAreaLegacy(@NonNull e2 e2Var) {
        if (e2Var.m) {
            setOnClickListener(this);
            this.d.setOnClickListener(this);
        } else {
            setOnClickListener(e2Var.l ? this : null);
            this.d.setOnClickListener(e2Var.g ? this : null);
            this.c.setOnClickListener(e2Var.b ? this : null);
        }
    }

    protected Drawable a(w2 w2Var) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(w2Var.a(w2.x));
        gradientDrawable.setCornerRadius(this.a.a(hg.r));
        return gradientDrawable;
    }

    private void a() {
        w2 a = w2.a(getContext());
        this.g.setBackground(a(a));
        this.b.setTextColor(a.a(w2.s));
        this.c.setTextColor(a.a(w2.t));
        Button button = this.d;
        int a2 = a.a(w2.B);
        int i = w2.y;
        button.setBackground(a.a(a2, a.a(i), a.a(w2.C), this.a.a(hg.n)));
        this.d.setTextColor(a.a(i));
        this.e.setBackground(a.a(this.a.a(hg.d) / 2.0f));
        this.f.setTextColor(a.a(w2.z));
    }

    private v5 b(Context context) {
        v5 v5Var = new v5(context);
        v5Var.setOnClickListener(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.a.a(hg.C), this.a.a(hg.D));
        layoutParams.gravity = 8388661;
        v5Var.setLayoutParams(layoutParams);
        int a = this.a.a(hg.k);
        v5Var.setPadding(a, a, a / 2, a);
        v5Var.a(a1.a(this.a.a(hg.w), true, getContext()), false);
        return v5Var;
    }

    private h0 c(Context context) {
        h0 h0Var = new h0(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int a = this.a.a(hg.k);
        layoutParams.setMargins(a, a, 0, 0);
        layoutParams.gravity = DivLayoutParams.DEFAULT_GRAVITY;
        h0Var.setLayoutParams(layoutParams);
        return h0Var;
    }

    private Button a(Context context) {
        Button button = new Button(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        hg hgVar = this.a;
        int i = hg.r;
        layoutParams.setMarginEnd(hgVar.a(i));
        button.setLayoutParams(layoutParams);
        int a = this.a.a(i);
        int a2 = this.a.a(hg.m);
        button.setPadding(a, a2, a, a2);
        button.setTextSize(this.a.a(hg.O));
        button.setTypeface(null, 1);
        return button;
    }

    private void a(boolean z, e2 e2Var) {
        this.j = z;
        if (z) {
            setClickAreaActual(e2Var);
        } else {
            setClickAreaLegacy(e2Var);
        }
    }

    protected Size a(int i, int i2) {
        float f;
        int height = this.g.getHeight();
        int width = this.g.getWidth();
        float f2 = i / i2;
        if (f2 == 1.0f) {
            if (width < height) {
                height = (int) (width / f2);
            } else {
                f = height / f2;
                width = (int) f;
            }
        } else if (f2 > 1.0f) {
            int i3 = (int) (width / f2);
            if (i3 > height) {
                f = height * f2;
                width = (int) f;
            } else {
                height = i3;
            }
        } else {
            int i4 = (int) (height * f2);
            if (i4 > width) {
                height = i4;
            } else {
                width = i4;
            }
        }
        return new Size(width, height);
    }

    protected int a(View view) {
        if (view == this.d) {
            return 64;
        }
        if (view == this.c) {
            return 2;
        }
        return view == this ? 2048 : -1;
    }
}
