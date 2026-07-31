package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.my.target.common.NavigationType;
import com.my.target.ff;
import com.my.target.g2;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class gf extends ViewGroup implements ff, View.OnClickListener {
    private final fh a;
    private final xg b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final Button h;
    private final ff.a i;
    private final View.OnTouchListener j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final gg r;
    private final int s;
    private final int t;
    private final int u;
    private b v;
    private boolean w;
    private h2 x;
    private boolean y;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.PORTRAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.LANDSCAPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private enum b {
        PORTRAIT,
        LANDSCAPE,
        SQUARE
    }

    public gf(gg ggVar, Context context, ff.a aVar) {
        super(context);
        this.j = new g2(new g2.a() { // from class: com.my.target.gf$$ExternalSyntheticLambda0
            @Override // com.my.target.g2.a
            public final void a(h2 h2Var) {
                gf.this.a(h2Var);
            }
        });
        this.v = b.PORTRAIT;
        this.x = h2.a();
        this.y = false;
        this.i = aVar;
        this.r = ggVar;
        this.k = ggVar.a(gg.F);
        this.l = ggVar.a(gg.G);
        this.u = ggVar.a(gg.H);
        this.m = ggVar.a(gg.I);
        this.n = ggVar.a(gg.o);
        this.o = ggVar.a(gg.n);
        int a2 = ggVar.a(gg.N);
        this.s = a2;
        int a3 = ggVar.a(gg.U);
        this.p = a3;
        this.q = ggVar.a(gg.T);
        this.t = qi.a(a2, context);
        fh fhVar = new fh(context);
        this.a = fhVar;
        xg xgVar = new xg(context);
        this.b = xgVar;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setMaxLines(1);
        textView.setTextSize(1, ggVar.a(gg.J));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setIncludeFontPadding(false);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, ggVar.a(gg.L));
        textView2.setMaxLines(ggVar.a(gg.M));
        textView2.setEllipsize(truncateAt);
        textView2.setIncludeFontPadding(false);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        float f = a2;
        textView3.setTextSize(1, f);
        textView3.setEllipsize(truncateAt);
        textView3.setLines(1);
        textView3.setIncludeFontPadding(false);
        TextView textView4 = new TextView(context);
        this.f = textView4;
        textView4.setTextSize(1, f);
        textView4.setIncludeFontPadding(false);
        Button button = new Button(context);
        this.h = button;
        button.setLines(1);
        button.setTextSize(1, ggVar.a(gg.w));
        button.setEllipsize(truncateAt);
        button.setMinimumWidth(a3);
        button.setIncludeFontPadding(false);
        int a4 = ggVar.a(gg.x);
        int i = a4 * 2;
        button.setPadding(i, a4, i, a4);
        TextView textView5 = new TextView(context);
        this.g = textView5;
        textView5.setPadding(ggVar.a(gg.y), 0, 0, 0);
        textView5.setTextColor(-1);
        textView5.setMaxLines(ggVar.a(gg.B));
        textView5.setIncludeFontPadding(false);
        textView5.setTextSize(1, ggVar.a(gg.C));
        qi.a(fhVar, "panel_icon");
        qi.a(textView, "panel_title");
        qi.a(textView2, "panel_description");
        qi.a(textView3, "panel_domain");
        qi.a(textView4, "panel_rating");
        qi.a(button, "panel_cta");
        qi.a(textView5, "age_bordering");
        addView(fhVar);
        addView(xgVar);
        addView(textView);
        addView(textView2);
        addView(textView3);
        addView(textView4);
        addView(button);
        addView(textView5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h2 h2Var) {
        this.x = h2Var;
    }

    private void b(int i, int i2, int i3) {
        this.c.setGravity(8388611);
        this.d.setVisibility(8);
        this.h.setVisibility(0);
        this.c.setTextSize(this.r.a(gg.K));
        this.g.setVisibility(0);
        TextView textView = this.c;
        textView.setTypeface(textView.getTypeface(), 1);
        this.c.setTextSize(1, this.r.a(gg.J));
        this.h.measure(View.MeasureSpec.makeMeasureSpec(i2 / 3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.q, 1073741824));
        qi.a(this.g, i2, i3, Integer.MIN_VALUE);
        int measuredWidth = i2 - ((((this.a.getMeasuredWidth() + this.h.getMeasuredWidth()) + (this.l * 2)) + this.g.getMeasuredWidth()) + this.m);
        qi.a(this.c, measuredWidth, i3, Integer.MIN_VALUE);
        qi.a(this.e, measuredWidth, i3, Integer.MIN_VALUE);
        int measuredHeight = this.h.getMeasuredHeight() + (this.u * 2);
        if (this.w) {
            measuredHeight += this.o;
        }
        setMeasuredDimension(i, measuredHeight);
    }

    private void c(int i, int i2, int i3) {
        this.c.setGravity(8388611);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.g.setVisibility(0);
        TextView textView = this.c;
        textView.setTypeface(textView.getTypeface(), 1);
        this.c.setTextSize(1, this.r.a(gg.J));
        qi.a(this.g, i2, i3, Integer.MIN_VALUE);
        qi.a(this.c, ((i2 - this.a.getMeasuredWidth()) - (this.l * 2)) - this.g.getMeasuredWidth(), this.a.getMeasuredHeight() - (this.m * 2), Integer.MIN_VALUE);
        setMeasuredDimension(i, qi.a(this.a.getMeasuredHeight() + (this.l * 2), this.c.getMeasuredHeight() + qi.a(this.s, this.e.getMeasuredHeight()) + this.l));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setClickArea(@NonNull e2 e2Var) {
        setOnTouchListener(this.j);
        this.h.setOnTouchListener(this.j);
        this.c.setOnTouchListener(this.j);
        this.a.setOnTouchListener(this.j);
        this.d.setOnTouchListener(this.j);
        this.f.setOnTouchListener(this.j);
        this.b.setOnTouchListener(this.j);
        this.e.setOnTouchListener(this.j);
        this.g.setOnTouchListener(this.j);
        if (e2Var.m) {
            setOnClickListener(this);
            this.h.setOnClickListener(this);
            this.c.setOnClickListener(this);
            this.a.setOnClickListener(this);
            this.d.setOnClickListener(this);
            this.f.setOnClickListener(this);
            this.b.setOnClickListener(this);
            this.e.setOnClickListener(this);
            this.g.setOnClickListener(this);
            return;
        }
        if (e2Var.g) {
            this.h.setOnClickListener(this);
        } else {
            this.h.setEnabled(false);
        }
        if (e2Var.l) {
            setOnClickListener(this);
        } else {
            setOnClickListener(null);
        }
        if (e2Var.a) {
            this.c.setOnClickListener(this);
        } else {
            this.c.setOnClickListener(null);
        }
        if (e2Var.c) {
            this.a.setOnClickListener(this);
        } else {
            this.a.setOnClickListener(null);
        }
        if (e2Var.b) {
            this.d.setOnClickListener(this);
        } else {
            this.d.setOnClickListener(null);
        }
        if (e2Var.e) {
            this.f.setOnClickListener(this);
            this.b.setOnClickListener(this);
        } else {
            this.f.setOnClickListener(null);
            this.b.setOnClickListener(null);
        }
        if (e2Var.j) {
            this.e.setOnClickListener(this);
        } else {
            this.e.setOnClickListener(null);
        }
        if (e2Var.h) {
            this.g.setOnClickListener(this);
        } else {
            this.g.setOnClickListener(null);
        }
    }

    private void setClickAreaLegacy(@NonNull e2 e2Var) {
        if (e2Var.m) {
            setOnClickListener(this);
            this.h.setOnClickListener(this);
            return;
        }
        if (e2Var.g) {
            this.h.setOnClickListener(this);
        } else {
            this.h.setEnabled(false);
        }
        if (e2Var.l) {
            setOnClickListener(this);
        } else {
            setOnClickListener(null);
        }
        if (e2Var.a) {
            this.c.setOnClickListener(this);
        } else {
            this.c.setOnClickListener(null);
        }
        if (e2Var.c) {
            this.a.setOnClickListener(this);
        } else {
            this.a.setOnClickListener(null);
        }
        if (e2Var.b) {
            this.d.setOnClickListener(this);
        } else {
            this.d.setOnClickListener(null);
        }
        if (e2Var.e) {
            this.f.setOnClickListener(this);
            this.b.setOnClickListener(this);
        } else {
            this.f.setOnClickListener(null);
            this.b.setOnClickListener(null);
        }
        if (e2Var.j) {
            this.e.setOnClickListener(this);
        } else {
            this.e.setOnClickListener(null);
        }
        if (e2Var.h) {
            this.g.setOnClickListener(this);
        } else {
            this.g.setOnClickListener(null);
        }
    }

    @Override // com.my.target.ff
    public View a() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.y) {
            b(view);
        } else {
            c(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = this.e.getMeasuredHeight();
        int measuredHeight2 = this.b.getMeasuredHeight();
        int i5 = a.a[this.v.ordinal()];
        if (i5 == 1) {
            a(i, i2, i3, i4);
        } else if (i5 != 3) {
            a(i2, measuredHeight, measuredHeight2);
        } else {
            a(i, i2, i3, i4, measuredHeight, measuredHeight2);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.l * 2;
        int i4 = size - i3;
        int i5 = size2 - i3;
        if (i4 == i5) {
            this.v = b.SQUARE;
        } else if (i4 > i5) {
            this.v = b.LANDSCAPE;
        } else {
            this.v = b.PORTRAIT;
        }
        fh fhVar = this.a;
        int i6 = this.k;
        qi.a(fhVar, i6, i6, 1073741824);
        if (this.f.getVisibility() != 8) {
            qi.a(this.f, (i4 - this.a.getMeasuredWidth()) - this.m, i5, Integer.MIN_VALUE);
            xg xgVar = this.b;
            int i7 = this.t;
            qi.a(xgVar, i7, i7, 1073741824);
        }
        if (this.e.getVisibility() != 8) {
            qi.a(this.e, (i4 - this.a.getMeasuredWidth()) - (this.l * 2), i5, Integer.MIN_VALUE);
        }
        b bVar = this.v;
        if (bVar == b.SQUARE) {
            int i8 = this.u * 2;
            a(size - i8, i4 - i8);
        } else if (bVar == b.LANDSCAPE) {
            b(size, i4, i5);
        } else {
            c(size, i4, i5);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (r2.equals("store") == false) goto L8;
     */
    @Override // com.my.target.ff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setBanner(@NonNull d9 d9Var) {
        char c = 1;
        lf h0 = d9Var.h0();
        int j = h0.j();
        this.c.setTextColor(h0.k());
        this.d.setTextColor(j);
        this.e.setTextColor(j);
        this.f.setTextColor(j);
        this.b.setColor(j);
        this.w = d9Var.j0() != null;
        this.a.setImageData(d9Var.w());
        this.c.setText(d9Var.K());
        this.d.setText(d9Var.n());
        this.y = d9Var.f().b();
        String B = d9Var.B();
        B.getClass();
        switch (B.hashCode()) {
            case 117588:
                if (B.equals("web")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 109770977:
                break;
            case 1223953944:
                if (B.equals(NavigationType.WEBFORM)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 2:
                this.f.setVisibility(8);
                this.e.setVisibility(0);
                this.e.setText(d9Var.s());
                this.e.setTextColor(h0.g());
                break;
            case 1:
                this.e.setVisibility(8);
                if (d9Var.G() <= 0.0f) {
                    this.f.setVisibility(8);
                    break;
                } else {
                    this.f.setVisibility(0);
                    String valueOf = String.valueOf(d9Var.G());
                    if (valueOf.length() > 3) {
                        valueOf = valueOf.substring(0, 3);
                    }
                    this.f.setText(valueOf);
                    break;
                }
        }
        this.h.setText(d9Var.l());
        qi.b(this.h, h0.d(), h0.f(), this.n);
        this.h.setTextColor(h0.j());
        this.g.setText(d9Var.d());
        if (this.y) {
            setClickArea(d9Var.i());
        } else {
            setClickAreaLegacy(d9Var.i());
        }
    }

    private void a(int i, int i2) {
        this.c.setGravity(1);
        this.d.setGravity(1);
        this.d.setVisibility(0);
        this.h.setVisibility(0);
        this.g.setVisibility(8);
        this.c.setTypeface(Typeface.defaultFromStyle(0));
        this.c.setTextSize(1, this.r.a(gg.K));
        this.h.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.q, 1073741824));
        qi.a(this.c, i2, i2, Integer.MIN_VALUE);
        qi.a(this.d, i2, i2, Integer.MIN_VALUE);
        setMeasuredDimension(i, i);
    }

    private void a(int i, int i2, int i3, int i4, int i5, int i6) {
        fh fhVar = this.a;
        int i7 = i4 - i2;
        int i8 = this.u;
        qi.e(fhVar, i7 - i8, i8);
        Button button = this.h;
        int i9 = this.u;
        qi.d(button, i7 - i9, (i3 - i) - i9);
        int right = this.a.getRight() + this.l;
        int a2 = qi.a(this.f.getMeasuredHeight(), i6, i5);
        int a3 = qi.a(this.a.getTop(), this.m) + ((((this.a.getMeasuredHeight() - this.c.getMeasuredHeight()) - this.m) - a2) / 2);
        TextView textView = this.c;
        textView.layout(right, a3, textView.getMeasuredWidth() + right, this.c.getMeasuredHeight() + a3);
        qi.a(this.c.getBottom() + this.m, right, this.c.getBottom() + this.m + a2, this.l / 4, this.b, this.f, this.e);
        qi.e(this.g, this.c.getBottom(), this.c.getRight() + (this.l / 2));
    }

    private void c(View view) {
        this.i.a(null, 1, q2.a());
    }

    public void b(View view) {
        if (view == this.h) {
            this.i.a(null, 2, t2.a(64, this.x));
        } else {
            this.i.a(null, 1, t2.a(a(view), this.x));
        }
    }

    private void a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int measuredHeight = this.a.getMeasuredHeight();
        if (measuredHeight > 0) {
            i6 = 1;
            i5 = measuredHeight;
        } else {
            i5 = 0;
            i6 = 0;
        }
        int measuredHeight2 = this.c.getMeasuredHeight();
        if (measuredHeight2 > 0) {
            i6++;
            i5 += measuredHeight2;
        }
        int measuredHeight3 = this.d.getMeasuredHeight();
        if (measuredHeight3 > 0) {
            i6++;
            i5 += measuredHeight3;
        }
        int max = Math.max(this.b.getMeasuredHeight(), this.e.getMeasuredHeight());
        if (max > 0) {
            i6++;
            i5 += max;
        }
        int measuredHeight4 = this.h.getMeasuredHeight();
        if (measuredHeight4 > 0) {
            i6++;
            i5 += measuredHeight4;
        }
        int i7 = (i4 - i2) - i5;
        int a2 = qi.a(this.m, this.l, i7 / i6);
        int i8 = (i7 - (i6 * a2)) / 2;
        int i9 = i3 - i;
        qi.a(this.a, 0, i8, i9, measuredHeight + i8);
        int a3 = qi.a(i8, this.a.getBottom() + a2);
        qi.a(this.c, 0, a3, i9, measuredHeight2 + a3);
        int a4 = qi.a(a3, this.c.getBottom() + a2);
        qi.a(this.d, 0, a4, i9, measuredHeight3 + a4);
        int a5 = qi.a(a4, this.d.getBottom() + a2);
        int measuredWidth = ((i9 - this.f.getMeasuredWidth()) - this.b.getMeasuredWidth()) - this.e.getMeasuredWidth();
        int i10 = this.m;
        qi.a(a5, (measuredWidth - (i10 * 2)) / 2, max + a5, i10, this.b, this.f, this.e);
        int a6 = qi.a(a5, this.e.getBottom(), this.b.getBottom()) + a2;
        qi.a(this.h, 0, a6, i9, measuredHeight4 + a6);
    }

    private void a(int i, int i2, int i3) {
        fh fhVar = this.a;
        int i4 = this.l;
        qi.c(fhVar, i4, i4);
        int right = this.a.getRight() + (this.l / 2);
        int a2 = qi.a(this.f.getMeasuredHeight(), i3, i2);
        int a3 = qi.a(i + this.l, this.a.getTop());
        if (this.a.getMeasuredHeight() > 0) {
            a3 += (((this.a.getMeasuredHeight() - this.c.getMeasuredHeight()) - this.m) - a2) / 2;
        }
        TextView textView = this.c;
        textView.layout(right, a3, textView.getMeasuredWidth() + right, this.c.getMeasuredHeight() + a3);
        qi.a(this.c.getBottom() + this.m, right, this.c.getBottom() + this.m + a2, this.l / 4, this.b, this.f, this.e);
        qi.e(this.g, this.c.getBottom(), this.c.getRight() + this.m);
    }

    private int a(View view) {
        if (view == this.h) {
            return 64;
        }
        if (view == this.c) {
            return 1;
        }
        if (view == this.a) {
            return 4;
        }
        if (view == this.d) {
            return 2;
        }
        if (view == this.f) {
            return 32;
        }
        if (view == this.b) {
            return 16;
        }
        if (view == this.e) {
            return 512;
        }
        return view == this.g ? 128 : 2048;
    }
}
