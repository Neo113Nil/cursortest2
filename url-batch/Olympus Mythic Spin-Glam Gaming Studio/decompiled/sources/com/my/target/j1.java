package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.my.target.bf;
import com.my.target.common.views.StarsRatingView;
import com.my.target.nativeads.constants.NativeAdColor;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class j1 extends FrameLayout implements View.OnTouchListener {
    private final TextView a;
    private final TextView b;
    private final TextView c;
    private final LinearLayout d;
    private final LinearLayout e;
    private final TextView f;
    private final StarsRatingView g;
    private final TextView h;
    private final qi i;
    private final boolean j;
    private final HashMap k;
    private String l;
    private bf.b m;
    private boolean n;

    public j1(Context context, qi qiVar, boolean z) {
        super(context);
        this.k = new HashMap();
        this.n = false;
        TextView textView = new TextView(context);
        this.a = textView;
        this.b = new TextView(context);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        this.d = new LinearLayout(context);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.g = starsRatingView;
        TextView textView4 = new TextView(context);
        this.h = textView4;
        this.e = new LinearLayout(context);
        qi.b(textView, "title_text");
        qi.b(textView2, "description_text");
        qi.b(textView3, "disclaimer_text");
        qi.b(starsRatingView, "stars_view");
        qi.b(textView4, "votes_text");
        this.i = qiVar;
        this.j = z;
    }

    private boolean b(View view, MotionEvent motionEvent) {
        if (!this.k.containsKey(view)) {
            return false;
        }
        if (!((Boolean) this.k.get(view)).booleanValue()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setBackgroundColor(NativeAdColor.BACKGROUND_TOUCH);
        } else if (action == 1) {
            setBackgroundColor(-1);
            bf.b bVar = this.m;
            if (bVar != null) {
                bVar.a(view, q2.a());
            }
        } else if (action == 3) {
            setBackgroundColor(-1);
        }
        return true;
    }

    private void c(e2 e2Var, final bf.b bVar) {
        if (e2Var.m) {
            setOnClickListener(new View.OnClickListener() { // from class: com.my.target.j1$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j1.a(bf.b.this, view);
                }
            });
            qi.a(this, -1, NativeAdColor.BACKGROUND_TOUCH);
            return;
        }
        this.m = bVar;
        this.a.setOnTouchListener(this);
        this.b.setOnTouchListener(this);
        this.c.setOnTouchListener(this);
        this.g.setOnTouchListener(this);
        this.h.setOnTouchListener(this);
        setOnTouchListener(this);
        this.k.put(this.a, Boolean.valueOf(e2Var.a));
        String str = this.l;
        if (str == null) {
            str = "";
        }
        switch (str) {
            case "web":
            case "webform":
                this.k.put(this.b, Boolean.valueOf(e2Var.j));
                break;
            case "store":
                this.k.put(this.b, Boolean.valueOf(e2Var.k));
                break;
        }
        this.k.put(this.c, Boolean.valueOf(e2Var.b));
        this.k.put(this.g, Boolean.valueOf(e2Var.e));
        this.k.put(this.h, Boolean.valueOf(e2Var.f));
        this.k.put(this, Boolean.valueOf(e2Var.l));
    }

    public void a(e2 e2Var, bf.b bVar) {
        if (this.n) {
            b(e2Var, bVar);
        } else {
            c(e2Var, bVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.n ? a(view, motionEvent) : b(view, motionEvent);
    }

    public void setBanner(@NonNull d9 d9Var) {
        this.l = d9Var.B();
        this.a.setText(d9Var.K());
        this.c.setText(d9Var.n());
        this.g.setRating(d9Var.G());
        this.h.setText(String.valueOf(d9Var.Q()));
        this.n = d9Var.f().b();
        String B = d9Var.B();
        B.getClass();
        switch (B) {
            case "web":
            case "webform":
                qi.b(this.b, "domain_text");
                this.d.setVisibility(8);
                this.b.setText(d9Var.s());
                this.d.setVisibility(8);
                this.b.setTextColor(-16733198);
                break;
            case "store":
                qi.b(this.b, "category_text");
                String h = d9Var.h();
                String J = d9Var.J();
                String str = "";
                if (!TextUtils.isEmpty(h)) {
                    str = "" + h;
                }
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(J)) {
                    str = str + ", ";
                }
                if (!TextUtils.isEmpty(J)) {
                    str = str + J;
                }
                if (TextUtils.isEmpty(str)) {
                    this.b.setVisibility(8);
                } else {
                    this.b.setText(str);
                    this.b.setVisibility(0);
                }
                this.d.setVisibility(0);
                this.d.setGravity(16);
                if (d9Var.G() > 0.0f) {
                    this.g.setVisibility(0);
                    if (d9Var.Q() > 0) {
                        this.h.setVisibility(0);
                    } else {
                        this.h.setVisibility(8);
                    }
                } else {
                    this.g.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.b.setTextColor(-3355444);
                break;
        }
        if (TextUtils.isEmpty(d9Var.o())) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
            this.f.setText(d9Var.o());
        }
        if (this.j) {
            this.a.setTextSize(2, 32.0f);
            this.c.setTextSize(2, 24.0f);
            this.f.setTextSize(2, 18.0f);
            this.b.setTextSize(2, 18.0f);
            return;
        }
        this.a.setTextSize(2, 20.0f);
        this.c.setTextSize(2, 16.0f);
        this.f.setTextSize(2, 14.0f);
        this.b.setTextSize(2, 16.0f);
    }

    void a(boolean z) {
        this.e.setOrientation(1);
        this.e.setGravity(1);
        this.a.setGravity(1);
        this.a.setTextColor(-16777216);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.leftMargin = this.i.b(8);
        layoutParams.rightMargin = this.i.b(8);
        this.a.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        this.b.setLayoutParams(layoutParams2);
        this.b.setLines(1);
        this.b.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.c.setGravity(1);
        this.c.setTextColor(-16777216);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        if (z) {
            this.c.setTextSize(2, 12.0f);
            this.c.setLines(2);
            this.c.setEllipsize(TextUtils.TruncateAt.END);
            layoutParams3.topMargin = 0;
            layoutParams3.leftMargin = this.i.b(4);
            layoutParams3.rightMargin = this.i.b(4);
        } else {
            this.c.setTextSize(2, 16.0f);
            layoutParams3.topMargin = this.i.b(8);
            layoutParams3.leftMargin = this.i.b(16);
            layoutParams3.rightMargin = this.i.b(16);
        }
        layoutParams3.gravity = 1;
        this.c.setLayoutParams(layoutParams3);
        this.d.setOrientation(0);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        this.d.setLayoutParams(layoutParams4);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(this.i.b(73), this.i.b(12));
        layoutParams5.topMargin = this.i.b(4);
        layoutParams5.rightMargin = this.i.b(4);
        this.g.setLayoutParams(layoutParams5);
        this.h.setTextColor(NativeAdColor.STANDARD_GREY);
        this.h.setTextSize(2, 14.0f);
        this.f.setTextColor(NativeAdColor.STANDARD_GREY);
        this.f.setGravity(1);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 1;
        if (z) {
            layoutParams6.leftMargin = this.i.b(4);
            layoutParams6.rightMargin = this.i.b(4);
        } else {
            layoutParams6.leftMargin = this.i.b(16);
            layoutParams6.rightMargin = this.i.b(16);
        }
        layoutParams6.gravity = 1;
        this.f.setLayoutParams(layoutParams6);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams7.gravity = 17;
        addView(this.e, layoutParams7);
        this.e.addView(this.a);
        this.e.addView(this.b);
        this.e.addView(this.d);
        this.e.addView(this.c);
        this.e.addView(this.f);
        this.d.addView(this.g);
        this.d.addView(this.h);
    }

    private void b(e2 e2Var, bf.b bVar) {
        this.m = bVar;
        this.a.setOnTouchListener(this);
        this.b.setOnTouchListener(this);
        this.c.setOnTouchListener(this);
        this.g.setOnTouchListener(this);
        this.h.setOnTouchListener(this);
        setOnTouchListener(this);
        if (e2Var.m) {
            HashMap hashMap = this.k;
            TextView textView = this.a;
            Boolean bool = Boolean.TRUE;
            hashMap.put(textView, bool);
            this.k.put(this.c, bool);
            this.k.put(this.g, bool);
            this.k.put(this.h, bool);
            this.k.put(this.b, bool);
            this.k.put(this, bool);
            qi.a(this, -1, NativeAdColor.BACKGROUND_TOUCH);
            return;
        }
        this.k.put(this.a, Boolean.valueOf(e2Var.a));
        String str = this.l;
        if (str == null) {
            str = "";
        }
        switch (str) {
            case "web":
            case "webform":
                this.k.put(this.b, Boolean.valueOf(e2Var.j));
                break;
            case "store":
                this.k.put(this.b, Boolean.valueOf(e2Var.k));
                break;
        }
        this.k.put(this.c, Boolean.valueOf(e2Var.b));
        this.k.put(this.g, Boolean.valueOf(e2Var.e));
        this.k.put(this.h, Boolean.valueOf(e2Var.f));
        this.k.put(this, Boolean.valueOf(e2Var.l));
    }

    private boolean a(View view, MotionEvent motionEvent) {
        if (!this.k.containsKey(view)) {
            return false;
        }
        if (!((Boolean) this.k.get(view)).booleanValue()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setBackgroundColor(NativeAdColor.BACKGROUND_TOUCH);
        } else if (action == 1) {
            setBackgroundColor(-1);
            h2 a = j2.a(view).a(motionEvent);
            if (a == null) {
                a = h2.a();
            }
            t2 a2 = t2.a(a(view), a);
            bf.b bVar = this.m;
            if (bVar != null) {
                bVar.a(view, a2);
            }
        } else if (action == 3) {
            setBackgroundColor(-1);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(bf.b bVar, View view) {
        bVar.a(view, q2.a());
    }

    private int a(View view) {
        if (view == this.a) {
            return 1;
        }
        if (view == this.b) {
            return Objects.equals(this.l, "store") ? 1024 : 512;
        }
        if (view == this.c) {
            return 2;
        }
        if (view == this.g) {
            return 16;
        }
        return view == this.h ? 32 : 2048;
    }
}
