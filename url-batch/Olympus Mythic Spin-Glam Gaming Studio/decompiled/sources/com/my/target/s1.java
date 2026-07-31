package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.my.target.g2;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes12.dex */
public final class s1 extends LinearLayout implements View.OnClickListener {
    private final fh a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final Button f;
    private final FrameLayout g;
    private final hg h;
    private w2 i;
    private h2 j;
    final View.OnTouchListener k;
    private a l;
    private boolean m;
    private e2 n;
    private k8 o;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a(k8 k8Var, int i, n2 n2Var, View view);
    }

    public s1(Context context) {
        super(context);
        this.j = h2.a();
        this.k = new g2(new g2.a() { // from class: com.my.target.s1$$ExternalSyntheticLambda0
            @Override // com.my.target.g2.a
            public final void a(h2 h2Var) {
                s1.this.a(h2Var);
            }
        });
        this.m = false;
        hg a2 = hg.a(context);
        this.h = a2;
        this.i = w2.a(context);
        setOrientation(1);
        fh a3 = a(context);
        this.a = a3;
        FrameLayout e = e(context);
        this.g = e;
        e.addView(a3);
        TextView d = d(context);
        this.b = d;
        e.addView(d);
        TextView a4 = a(context, this.i.a(w2.s), false);
        this.c = a4;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(a2.a(hg.i));
        a4.setLayoutParams(layoutParams);
        LinearLayout f = f(context);
        f.addView(a4);
        TextView a5 = a(context, this.i.a(w2.v), true);
        this.d = a5;
        f.addView(a5);
        a5.setVisibility(8);
        addView(e);
        addView(f);
        TextView c = c(context);
        this.e = c;
        addView(c);
        Button b = b(context);
        this.f = b;
        addView(b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h2 h2Var) {
        this.j = h2Var;
    }

    private void b(View view) {
        k8 k8Var;
        int a2 = a(view);
        if (a2 == -1) {
            return;
        }
        t2 a3 = t2.a(a2, this.j);
        a aVar = this.l;
        if (aVar == null || (k8Var = this.o) == null) {
            return;
        }
        if (view == this.f) {
            aVar.a(k8Var, 2, a3, view);
        } else {
            aVar.a(k8Var, 1, a3, view);
        }
    }

    private void c() {
        if (this.n == null) {
            return;
        }
        setOnTouchListener(this.k);
        this.a.setOnTouchListener(this.k);
        this.c.setOnTouchListener(this.k);
        this.d.setOnTouchListener(this.k);
        this.e.setOnTouchListener(this.k);
        this.f.setOnTouchListener(this.k);
        e2 e2Var = this.n;
        if (e2Var.m) {
            setOnClickListener(this);
            this.f.setOnClickListener(this);
            this.a.setOnClickListener(this);
            this.e.setOnClickListener(this);
            this.c.setOnClickListener(this);
            this.d.setOnClickListener(this);
            return;
        }
        setOnClickListener(e2Var.l ? this : null);
        this.f.setOnClickListener(this.n.g ? this : null);
        this.a.setOnClickListener(this.n.d ? this : null);
        this.c.setOnClickListener(this.n.a ? this : null);
        this.d.setOnClickListener(this.n.a ? this : null);
        this.e.setOnClickListener(this.n.b ? this : null);
    }

    private void d() {
        e2 e2Var = this.n;
        if (e2Var == null) {
            return;
        }
        if (e2Var.m) {
            setOnClickListener(this);
            this.f.setOnClickListener(this);
            this.a.setOnClickListener(this);
            this.e.setOnClickListener(this);
            this.c.setOnClickListener(this);
            this.d.setOnClickListener(this);
            return;
        }
        setOnClickListener(e2Var.l ? this : null);
        this.f.setOnClickListener(this.n.g ? this : null);
        this.a.setOnClickListener(this.n.d ? this : null);
        this.c.setOnClickListener(this.n.a ? this : null);
        this.d.setOnClickListener(this.n.a ? this : null);
        this.e.setOnClickListener(this.n.b ? this : null);
    }

    private FrameLayout e(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(b());
        frameLayout.setClipToOutline(true);
        return frameLayout;
    }

    private void f() {
        LinearLayout.LayoutParams layoutParams;
        if (getContext().getResources().getConfiguration().orientation == 2) {
            layoutParams = new LinearLayout.LayoutParams(-2, -1);
            this.a.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.weight = 1.0f;
        this.g.setLayoutParams(layoutParams2);
        setLayoutParams(layoutParams);
    }

    public View a() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NonNull
    public Button getActionButton() {
        return this.f;
    }

    @NonNull
    public fh getAdImage() {
        return this.a;
    }

    @NonNull
    public TextView getDescriptionTextView() {
        return this.e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.m) {
            b(view);
        } else {
            c(view);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setCard(@NonNull k8 k8Var) {
        this.o = k8Var;
        e();
        this.m = k8Var.f().b();
        this.n = k8Var.i();
        if (k8Var.y() != null) {
            this.a.setImageBitmap(k8Var.y().getData());
        } else {
            this.a.setImageBitmap(null);
        }
        this.e.setText(k8Var.K());
        this.f.setText(k8Var.l());
        if (TextUtils.isEmpty(k8Var.C())) {
            this.c.setText(k8Var.D());
            this.d.setVisibility(8);
        } else {
            this.c.setText(k8Var.C());
            this.d.setText(k8Var.D());
            this.c.setVisibility(0);
            this.d.setVisibility(0);
        }
        if (TextUtils.isEmpty(k8Var.r())) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            this.b.setText(k8Var.r());
        }
        f();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnClickListeners(@NonNull a aVar) {
        this.l = aVar;
        if (this.m) {
            c();
        } else {
            d();
        }
    }

    private int a(View view) {
        if (view == this.f) {
            return 64;
        }
        if (view == this.c || view == this.d) {
            return 1;
        }
        if (view == this.e) {
            return 2;
        }
        if (view == this.a) {
            return 8;
        }
        return view == this ? 2048 : -1;
    }

    private void e() {
        w2 a2 = w2.a(getContext());
        this.i = a2;
        TextView textView = this.c;
        int i = w2.s;
        textView.setTextColor(a2.a(i));
        this.d.setTextColor(this.i.a(w2.v));
        this.e.setTextColor(this.i.a(i));
        Button button = this.f;
        w2 w2Var = this.i;
        button.setBackground(w2Var.a(w2Var.a(w2.w), this.i.a(w2.A), this.i.a(w2.E), this.h.a(hg.m)));
        this.f.setTextColor(this.i.a(w2.B));
    }

    private TextView a(Context context, int i, boolean z) {
        TextView textView = new TextView(context);
        textView.setTextSize(this.h.a(hg.Q));
        textView.setTextColor(i);
        textView.setTypeface(null, 1);
        if (z) {
            textView.setPaintFlags(textView.getPaintFlags() | 16);
        }
        return textView;
    }

    private fh a(Context context) {
        return new fh(context);
    }

    private Button b(Context context) {
        Button button = new Button(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        hg hgVar = this.h;
        int i = hg.g;
        int a2 = hgVar.a(i);
        layoutParams.setMargins(a2, a2, a2, a2);
        button.setLayoutParams(layoutParams);
        w2 w2Var = this.i;
        int a3 = w2Var.a(w2.w);
        int a4 = this.i.a(w2.A);
        int a5 = this.i.a(w2.E);
        hg hgVar2 = this.h;
        int i2 = hg.m;
        button.setBackground(w2Var.a(a3, a4, a5, hgVar2.a(i2)));
        button.setTextColor(this.i.a(w2.B));
        button.setTextSize(this.h.a(hg.Q));
        int a6 = this.h.a(i2);
        int a7 = this.h.a(i);
        button.setPadding(a6, a7, a6, a7);
        button.setTypeface(null, 1);
        return button;
    }

    private TextView d(Context context) {
        TextView textView = new TextView(context);
        int a2 = this.h.a(hg.g);
        textView.setPadding(a2, a2, a2, a2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.i.a(w2.i));
        gradientDrawable.setCornerRadius(this.h.a(hg.x));
        textView.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int a3 = this.h.a(hg.i);
        layoutParams.setMargins(a3, a3, 0, 0);
        textView.setLayoutParams(layoutParams);
        textView.setTextColor(-1);
        textView.setTypeface(null, 1);
        textView.setTextSize(this.h.a(hg.R));
        textView.setVisibility(8);
        return textView;
    }

    private LinearLayout f(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int a2 = this.h.a(hg.k);
        int a3 = this.h.a(hg.g);
        layoutParams.setMargins(a3, a2, a3, 0);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    private void c(View view) {
        k8 k8Var;
        a aVar = this.l;
        if (aVar == null || (k8Var = this.o) == null) {
            return;
        }
        if (view == this.f) {
            aVar.a(k8Var, 2, q2.a(), view);
        } else {
            aVar.a(k8Var, 1, q2.a(), view);
        }
    }

    private TextView c(Context context) {
        TextView textView = new TextView(context);
        textView.setTextSize(this.h.a(hg.R));
        textView.setTextColor(this.i.a(w2.s));
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int a2 = this.h.a(hg.g);
        layoutParams.setMargins(a2, a2 / 2, a2, a2);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private Drawable b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.i.a(w2.x));
        gradientDrawable.setStroke(this.h.a(hg.d), this.i.a(w2.k));
        gradientDrawable.setCornerRadius(this.h.a(hg.r));
        return gradientDrawable;
    }
}
