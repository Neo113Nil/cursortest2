package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;
import com.my.target.g2;
import com.my.target.mf;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class nf extends ViewGroup implements mf, View.OnClickListener {
    final int A;
    final int B;
    final int C;
    final int D;
    final int E;
    final int F;
    final int G;
    final int H;
    final int I;
    final int J;
    private final int K;
    View L;
    int M;
    int N;
    int O;
    int P;
    h2 Q;
    boolean R;
    final v5 a;
    final gg b;
    final v5 c;
    final View d;
    final View e;
    final mf.a f;
    final x4 g;
    final Button h;
    final fh i;
    final fh j;
    final m k;
    final ProgressBar l;
    final View m;
    final View n;
    final View o;
    final Button p;
    final TextView q;
    final TextView r;
    final TextView s;
    final ij t;
    final Bitmap u;
    final Bitmap v;
    final Bitmap w;
    final Bitmap x;
    final Bitmap y;
    final View.OnTouchListener z;

    public nf(View view, View view2, mf.a aVar, View view3, gg ggVar, Context context) {
        super(context);
        this.z = new g2(new g2.a() { // from class: com.my.target.nf$$ExternalSyntheticLambda0
            @Override // com.my.target.g2.a
            public final void a(h2 h2Var) {
                nf.this.a(h2Var);
            }
        });
        this.Q = h2.a();
        this.R = false;
        this.f = aVar;
        this.L = view3;
        this.e = view2;
        this.d = view;
        this.b = ggVar;
        int a = ggVar.a(gg.j);
        this.E = a;
        int a2 = ggVar.a(gg.V);
        this.K = a2;
        this.H = ggVar.a(gg.T);
        this.I = ggVar.a(gg.H);
        this.J = ggVar.a(gg.W);
        this.F = ggVar.a(gg.Y);
        v5 v5Var = new v5(context);
        this.c = v5Var;
        v5Var.setVisibility(8);
        v5Var.setOnClickListener(this);
        v5Var.setPadding(a);
        x4 x4Var = new x4(context);
        this.g = x4Var;
        x4Var.setVisibility(8);
        x4Var.setOnClickListener(this);
        qi.a(x4Var, -2013265920, -1, -1, ggVar.a(gg.e), ggVar.a(gg.f));
        Button button = new Button(context);
        this.h = button;
        button.setTextColor(-1);
        button.setLines(ggVar.a(gg.g));
        button.setTextSize(1, ggVar.a(gg.h));
        button.setMaxWidth(ggVar.a(gg.d));
        button.setOnClickListener(this);
        button.setBackgroundColor(0);
        button.setIncludeFontPadding(false);
        int a3 = ggVar.a(gg.i);
        this.A = a3;
        this.B = ggVar.a(gg.m);
        this.C = ggVar.a(gg.n);
        int a4 = ggVar.a(gg.r);
        this.D = a4;
        this.O = ggVar.a(gg.o);
        this.G = ggVar.a(gg.p);
        m mVar = new m(context);
        this.k = mVar;
        mVar.setFixedHeight(a4);
        this.w = f9.c(context);
        this.x = f9.j(context);
        this.y = f9.b(context);
        this.u = f9.l(context);
        this.v = f9.k(context);
        fh fhVar = new fh(context);
        this.i = fhVar;
        ProgressBar progressBar = new ProgressBar(context, null, android.R.attr.progressBarStyleLarge);
        this.l = progressBar;
        progressBar.setVisibility(8);
        View view4 = new View(context);
        this.m = view4;
        view4.setBackgroundColor(-1728053248);
        view4.setVisibility(8);
        View view5 = new View(context);
        this.o = view5;
        View view6 = new View(context);
        this.n = view6;
        TextView textView = new TextView(context);
        this.q = textView;
        textView.setTextSize(1, ggVar.a(gg.s));
        textView.setTextColor(-1);
        textView.setMaxLines(ggVar.a(gg.t));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        TextView textView2 = new TextView(context);
        this.r = textView2;
        textView2.setTextSize(1, ggVar.a(gg.u));
        textView2.setTextColor(-1);
        textView2.setMaxLines(ggVar.a(gg.v));
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        Button button2 = new Button(context);
        this.p = button2;
        button2.setLines(1);
        button2.setTextSize(1, ggVar.a(gg.w));
        button2.setEllipsize(truncateAt);
        button2.setIncludeFontPadding(false);
        button2.setMinimumWidth(a2);
        button2.setPadding(a3, 0, a3, 0);
        TextView textView3 = new TextView(context);
        this.s = textView3;
        textView3.setPadding(ggVar.a(gg.y), 0, 0, 0);
        textView3.setTextColor(-1);
        textView3.setMaxLines(ggVar.a(gg.B));
        textView3.setIncludeFontPadding(false);
        textView3.setTextSize(1, ggVar.a(gg.X));
        ij ijVar = new ij(context);
        this.t = ijVar;
        v5 v5Var2 = new v5(context);
        this.a = v5Var2;
        v5Var2.setPadding(a);
        fh fhVar2 = new fh(context);
        this.j = fhVar2;
        qi.a(this, "ad_view");
        qi.a(textView, "title");
        qi.a(textView2, "description");
        qi.a(fhVar, "image");
        qi.a(button2, "cta");
        qi.a(v5Var, "dismiss");
        qi.a(x4Var, "play");
        qi.a(fhVar2, "ads_logo");
        qi.a(view4, "media_dim");
        qi.a(view6, "top_dim");
        qi.a(view5, "bot_dim");
        qi.a(textView3, "age_bordering");
        qi.a(mVar, "ad_choices");
        qi.b(v5Var2, "sound_button");
        if (view3 != null) {
            addView(view3);
        }
        addView(fhVar);
        addView(view4);
        addView(view5);
        addView(view6);
        addView(view);
        addView(v5Var);
        addView(textView);
        addView(textView2);
        addView(button2);
        addView(textView3);
        addView(fhVar2);
        addView(mVar);
        addView(ijVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h2 h2Var) {
        this.Q = h2Var;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setClickArea(@NonNull e2 e2Var) {
        setOnTouchListener(this.z);
        this.p.setOnTouchListener(this.z);
        this.q.setOnTouchListener(this.z);
        this.s.setOnTouchListener(this.z);
        this.r.setOnTouchListener(this.z);
        this.i.setOnTouchListener(this.z);
        if (e2Var.m) {
            setOnClickListener(this);
            this.p.setOnClickListener(this);
            this.q.setOnClickListener(this);
            this.s.setOnClickListener(this);
            this.r.setOnClickListener(this);
            this.i.setOnClickListener(this);
            return;
        }
        setOnClickListener(e2Var.l ? this : null);
        this.p.setEnabled(e2Var.g);
        this.p.setOnClickListener(e2Var.g ? this : null);
        this.q.setOnClickListener(e2Var.a ? this : null);
        this.s.setOnClickListener((e2Var.h || e2Var.i) ? this : null);
        this.r.setOnClickListener(e2Var.b ? this : null);
        this.i.setOnClickListener(e2Var.d ? this : null);
    }

    private void setClickAreaLegacy(@NonNull e2 e2Var) {
        if (e2Var.m) {
            setOnClickListener(this);
            this.p.setOnClickListener(this);
            return;
        }
        setOnClickListener(e2Var.l ? this : null);
        this.p.setEnabled(e2Var.g);
        this.p.setOnClickListener(e2Var.g ? this : null);
        this.q.setOnClickListener(e2Var.a ? this : null);
        this.s.setOnClickListener((e2Var.h || e2Var.i) ? this : null);
        this.r.setOnClickListener(e2Var.b ? this : null);
        this.i.setOnClickListener(e2Var.d ? this : null);
    }

    @Override // com.my.target.mf
    public View a() {
        return this;
    }

    @Override // com.my.target.mf
    public void b() {
        this.c.setVisibility(0);
        this.t.setVisibility(8);
    }

    @Override // com.my.target.mf
    public void c(boolean z) {
        this.l.setVisibility(z ? 0 : 8);
    }

    @Override // com.my.target.mf
    public void d() {
        this.g.setVisibility(8);
        this.h.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.mf
    public void e() {
        this.a.setVisibility(8);
    }

    @Override // com.my.target.mf
    @NonNull
    public View getCloseButton() {
        return this.c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.R) {
            b(view);
        } else {
            c(view);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.my.target.mf
    public void setBackgroundImage(@Nullable ImageData imageData) {
        this.i.setImageData(imageData);
    }

    @Override // com.my.target.mf
    public void setBanner(@NonNull d9 d9Var) {
        lf h0 = d9Var.h0();
        setBackgroundColor(h0.a());
        int j = h0.j();
        this.q.setTextColor(h0.k());
        this.r.setTextColor(j);
        this.R = d9Var.f().b();
        if (TextUtils.isEmpty(d9Var.d()) && TextUtils.isEmpty(d9Var.c())) {
            this.s.setVisibility(8);
        } else {
            String c = d9Var.c();
            if (!TextUtils.isEmpty(d9Var.d()) && !TextUtils.isEmpty(d9Var.c())) {
                c = c + " ";
            }
            String str = c + d9Var.d();
            this.s.setVisibility(0);
            this.s.setText(str);
        }
        ImageData Z = d9Var.Z();
        if (Z == null || Z.getData() == null) {
            Bitmap a = a1.a(this.b.a(gg.r));
            if (a != null) {
                this.c.a(a, false);
            }
        } else {
            this.c.a(Z.getData(), true);
        }
        qi.b(this.p, h0.d(), h0.f(), this.O);
        this.p.setTextColor(h0.j());
        this.p.setText(d9Var.l());
        this.q.setText(d9Var.K());
        this.r.setText(d9Var.n());
        ImageData d0 = d9Var.d0();
        if (d0 != null && d0.getBitmap() != null) {
            this.j.setImageData(d0);
            this.j.setOnClickListener(this);
        }
        e a2 = d9Var.a();
        if (a2 != null) {
            this.k.setImageBitmap(a2.g().getBitmap());
            this.k.setOnClickListener(this);
        } else {
            this.k.setVisibility(8);
        }
        if (this.R) {
            setClickArea(d9Var.i());
        } else {
            setClickAreaLegacy(d9Var.i());
        }
    }

    @Override // com.my.target.mf
    public void setPanelColor(int i) {
        this.o.setBackgroundColor(i);
        this.n.setBackgroundColor(i);
    }

    @Override // com.my.target.mf
    public void setSoundState(boolean z) {
        if (z) {
            this.a.a(this.u, false);
            this.a.setContentDescription("sound_on");
        } else {
            this.a.a(this.v, false);
            this.a.setContentDescription("sound_off");
        }
    }

    @Override // com.my.target.mf
    public void c() {
        this.t.setVisibility(8);
    }

    private void c(View view) {
        if (view == this.c) {
            this.f.k();
            return;
        }
        if (view == this.a) {
            this.f.e();
            return;
        }
        if (view != this.g && view != this.h) {
            if (view == this.L) {
                this.f.a(h2.a());
                return;
            }
            if (view == this.m) {
                this.f.b(h2.a());
                return;
            }
            if (view == this.j) {
                this.f.d();
                return;
            }
            if (view == this.k) {
                this.f.a();
                return;
            }
            Button button = this.p;
            if (view == button && button.isEnabled()) {
                this.f.a(null, 2, q2.a());
                return;
            } else {
                this.f.a(null, 1, q2.a());
                return;
            }
        }
        this.f.b(this.P);
    }

    @Override // com.my.target.mf
    public void a(int i, String str) {
        this.g.setVisibility(0);
        if (i == 1) {
            this.g.setImageBitmap(this.y);
            this.P = 1;
        } else if (i == 2) {
            this.g.setImageBitmap(this.x);
            this.P = 2;
        } else {
            this.g.setImageBitmap(this.w);
            this.P = 0;
        }
        if (str != null) {
            this.h.setVisibility(0);
            this.h.setText(str);
        } else {
            this.h.setVisibility(8);
        }
    }

    @Override // com.my.target.mf
    public void b(boolean z) {
        this.m.setVisibility(z ? 0 : 8);
    }

    private void b(View view) {
        if (view == this.c) {
            this.f.k();
            return;
        }
        if (view == this.a) {
            this.f.e();
            return;
        }
        if (view != this.g && view != this.h) {
            if (view == this.L) {
                this.f.a(this.Q);
                return;
            }
            if (view == this.m) {
                this.f.b(this.Q);
                return;
            }
            if (view == this.j) {
                this.f.d();
                return;
            }
            if (view == this.k) {
                this.f.a();
                return;
            }
            Button button = this.p;
            if (view == button && button.isEnabled()) {
                this.f.a(null, 2, t2.a(64, this.Q));
                return;
            } else {
                this.f.a(null, 1, t2.a(a(view), this.Q));
                return;
            }
        }
        this.f.b(this.P);
    }

    @Override // com.my.target.mf
    public void a(boolean z) {
        this.i.setVisibility(z ? 0 : 4);
    }

    @Override // com.my.target.mf
    public void a(int i, float f) {
        this.t.setDigit(i);
        this.t.setProgress(f);
    }

    protected boolean a(int i) {
        View view = this.L;
        return ((double) qi.a(view != null ? view.getMeasuredWidth() : 0, this.i.getMeasuredWidth())) * 1.6d <= ((double) i);
    }

    private int a(View view) {
        if (view == this.p) {
            return 64;
        }
        if (view == this.q) {
            return 1;
        }
        if (view == this.s) {
            return 128;
        }
        if (view == this.r) {
            return 2;
        }
        return view == this.i ? 8 : 2048;
    }
}
