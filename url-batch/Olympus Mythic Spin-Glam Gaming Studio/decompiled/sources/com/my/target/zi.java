package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.my.target.bf;
import com.my.target.g2;
import com.my.target.nativeads.constants.NativeAdColor;
import com.my.target.nativeads.views.MediaAdView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class zi extends RelativeLayout {
    private static final int j = qi.c();
    private static final int k = qi.c();
    private final j1 a;
    private final Button b;
    private final k1 c;
    private final w4 d;
    private final qi e;
    private final boolean f;
    private final View.OnTouchListener g;
    private h2 h;
    private boolean i;

    public zi(Context context, qi qiVar, boolean z) {
        super(context);
        this.g = new g2(new g2.a() { // from class: com.my.target.zi$$ExternalSyntheticLambda4
            @Override // com.my.target.g2.a
            public final void a(h2 h2Var) {
                zi.this.a(h2Var);
            }
        });
        this.h = h2.a();
        this.i = false;
        this.e = qiVar;
        this.f = z;
        w4 w4Var = new w4(context, qiVar, z);
        this.d = w4Var;
        qi.b(w4Var, "footer_layout");
        j1 j1Var = new j1(context, qiVar, z);
        this.a = j1Var;
        qi.b(j1Var, "body_layout");
        Button button = new Button(context);
        this.b = button;
        qi.b(button, "cta_button");
        k1 k1Var = new k1(context);
        this.c = k1Var;
        qi.b(k1Var, "age_bordering");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h2 h2Var) {
        this.h = h2Var;
    }

    private void b(e2 e2Var, final bf.a aVar) {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.my.target.zi$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zi.this.a(aVar, view);
            }
        };
        this.a.a(e2Var, new bf.b() { // from class: com.my.target.zi$$ExternalSyntheticLambda6
            @Override // com.my.target.bf.b
            public final void a(View view, n2 n2Var) {
                bf.a.this.a(view, 1, n2Var);
            }
        });
        if (e2Var.m) {
            this.b.setOnTouchListener(this.g);
            this.b.setOnClickListener(onClickListener);
            a(true, onClickListener);
            return;
        }
        this.b.setOnTouchListener(this.g);
        if (e2Var.g) {
            this.b.setOnClickListener(onClickListener);
            this.b.setEnabled(true);
        } else {
            this.b.setOnClickListener(null);
            this.b.setEnabled(false);
        }
        a(e2Var.h, onClickListener);
    }

    private void c(final e2 e2Var, final bf.a aVar) {
        final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.my.target.zi$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zi.this.b(aVar, view);
            }
        };
        this.a.a(e2Var, new bf.b() { // from class: com.my.target.zi$$ExternalSyntheticLambda2
            @Override // com.my.target.bf.b
            public final void a(View view, n2 n2Var) {
                onClickListener.onClick(view);
            }
        });
        if (e2Var.m) {
            this.b.setOnClickListener(onClickListener);
            return;
        }
        if (e2Var.g) {
            this.b.setOnClickListener(onClickListener);
            this.b.setEnabled(true);
        } else {
            this.b.setOnClickListener(null);
            this.b.setEnabled(false);
        }
        this.c.setOnTouchListener(new View.OnTouchListener() { // from class: com.my.target.zi$$ExternalSyntheticLambda3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean a;
                a = zi.this.a(e2Var, onClickListener, view, motionEvent);
                return a;
            }
        });
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

    public void setBanner(@NonNull d9 d9Var) {
        this.a.setBanner(d9Var);
        this.b.setText(d9Var.l());
        this.d.setBackgroundColor(-39322);
        this.i = d9Var.f().b();
        if (TextUtils.isEmpty(d9Var.d())) {
            this.c.setVisibility(8);
        } else {
            this.c.setText(d9Var.d());
        }
        qi.b(this.b, -16733198, -16746839, this.e.b(2));
        this.b.setTextColor(-1);
    }

    public void a(int i, int i2, boolean z) {
        int max = Math.max(i2, i) / 8;
        this.a.a(z);
        this.d.a();
        View view = new View(getContext());
        view.setBackgroundColor(-5592406);
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, 1));
        w4 w4Var = this.d;
        int i3 = j;
        w4Var.setId(i3);
        this.d.a(max, z);
        this.b.setPadding(this.e.b(15), 0, this.e.b(15), 0);
        this.b.setMinimumWidth(this.e.b(100));
        this.b.setTransformationMethod(null);
        this.b.setSingleLine();
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.c.a(1, -7829368);
        this.c.setPadding(this.e.b(2), 0, 0, 0);
        this.c.setTextColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
        this.c.setMaxEms(5);
        this.c.a(1, MediaAdView.COLOR_PLACEHOLDER_GRAY, this.e.b(3));
        this.c.setBackgroundColor(1711276032);
        j1 j1Var = this.a;
        int i4 = k;
        j1Var.setId(i4);
        if (z) {
            this.a.setPadding(this.e.b(4), this.e.b(4), this.e.b(4), this.e.b(4));
        } else {
            this.a.setPadding(this.e.b(16), this.e.b(16), this.e.b(16), this.e.b(16));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(2, i3);
        this.a.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(this.e.b(16), z ? this.e.b(8) : this.e.b(16), this.e.b(16), this.e.b(4));
        layoutParams2.addRule(21, -1);
        this.c.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, this.f ? this.e.b(64) : this.e.b(52));
        layoutParams3.addRule(14, -1);
        layoutParams3.addRule(8, i4);
        if (z) {
            layoutParams3.bottomMargin = (int) ((-this.e.b(52)) / 1.5d);
        } else {
            layoutParams3.bottomMargin = (-this.e.b(52)) / 2;
        }
        this.b.setLayoutParams(layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, max);
        layoutParams4.addRule(12, -1);
        this.d.setLayoutParams(layoutParams4);
        addView(this.a);
        addView(view);
        addView(this.c);
        addView(this.d);
        addView(this.b);
        setClickable(true);
        if (this.f) {
            this.b.setTextSize(2, 32.0f);
        } else {
            this.b.setTextSize(2, 22.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(bf.a aVar, View view) {
        aVar.a(view, view == this.b ? 2 : 1, q2.a());
    }

    public void a(e2 e2Var, bf.a aVar) {
        if (this.i) {
            b(e2Var, aVar);
        } else {
            c(e2Var, aVar);
        }
    }

    private int a(View view) {
        if (view == this.b) {
            return 64;
        }
        return view == this.c ? 128 : 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(bf.a aVar, View view) {
        aVar.a(view, view == this.b ? 2 : 1, t2.a(a(view), this.h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(e2 e2Var, View.OnClickListener onClickListener, View view, MotionEvent motionEvent) {
        if (!e2Var.h) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a.setBackgroundColor(NativeAdColor.BACKGROUND_TOUCH);
        } else if (action == 1) {
            this.a.setBackgroundColor(-1);
            onClickListener.onClick(view);
        } else if (action == 3) {
            setBackgroundColor(-1);
        }
        return true;
    }

    private void a(final boolean z, final View.OnClickListener onClickListener) {
        this.c.setOnTouchListener(new View.OnTouchListener() { // from class: com.my.target.zi$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean a;
                a = zi.this.a(z, onClickListener, view, motionEvent);
                return a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(boolean z, View.OnClickListener onClickListener, View view, MotionEvent motionEvent) {
        if (!z) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a.setBackgroundColor(NativeAdColor.BACKGROUND_TOUCH);
        } else if (action == 1) {
            this.a.setBackgroundColor(-1);
            h2 a = j2.a(view).a(motionEvent);
            if (a == null) {
                a = h2.a();
            }
            this.h = a;
            onClickListener.onClick(view);
        } else if (action == 3) {
            setBackgroundColor(-1);
        }
        return true;
    }
}
