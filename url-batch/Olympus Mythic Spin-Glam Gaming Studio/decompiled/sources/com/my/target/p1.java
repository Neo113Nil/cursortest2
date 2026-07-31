package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.my.target.common.views.StarsRatingView;
import com.my.target.nativeads.constants.NativeAdColor;
import com.my.target.z1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.HashMap;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class p1 extends ViewGroup implements View.OnTouchListener {
    private final fh a;
    private final TextView b;
    private final TextView c;
    private final Button d;
    private final qi e;
    private final StarsRatingView f;
    private final TextView g;
    private final HashMap h;
    private final boolean i;
    private z1.c j;
    private z1.c k;
    private int l;
    private int m;
    private int n;
    private boolean o;

    public p1(boolean z, Context context) {
        super(context);
        this.h = new HashMap();
        this.o = false;
        this.i = z;
        this.e = qi.g(context);
        this.a = new fh(context);
        this.b = new TextView(context);
        this.c = new TextView(context);
        this.d = new Button(context);
        this.f = new StarsRatingView(context);
        this.g = new TextView(context);
        a();
    }

    private boolean b(View view, MotionEvent motionEvent) {
        if (!this.h.containsKey(view)) {
            return false;
        }
        boolean booleanValue = ((Boolean) this.h.get(view)).booleanValue();
        view.setClickable(booleanValue);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if (this.j != null) {
                    boolean equals = Boolean.TRUE.equals(this.h.get(this.d));
                    z1.c cVar = this.k;
                    if (cVar != null && view == this.d && equals) {
                        cVar.a(view, q2.a());
                    } else {
                        this.j.a(view, q2.a());
                    }
                }
                if (booleanValue) {
                    Button button = this.d;
                    if (view == button) {
                        button.setPressed(false);
                    } else {
                        qi.a(this, 0, 0, -3355444, this.e.b(1), 0);
                    }
                }
            } else if (action == 3 && booleanValue) {
                Button button2 = this.d;
                if (view == button2) {
                    button2.setPressed(false);
                } else {
                    qi.a(this, 0, 0, -3355444, this.e.b(1), 0);
                }
            }
        } else if (booleanValue) {
            Button button3 = this.d;
            if (view == button3) {
                button3.setPressed(true);
            } else {
                setBackgroundColor(NativeAdColor.BACKGROUND_TOUCH);
            }
        }
        return true;
    }

    public void a(z1.c cVar, e2 e2Var, z1.c cVar2) {
        this.j = cVar;
        this.k = cVar2;
        if (cVar == null || e2Var == null) {
            super.setOnClickListener(null);
            this.d.setOnClickListener(null);
            return;
        }
        setOnTouchListener(this);
        this.a.setOnTouchListener(this);
        this.b.setOnTouchListener(this);
        this.c.setOnTouchListener(this);
        this.f.setOnTouchListener(this);
        this.g.setOnTouchListener(this);
        this.d.setOnTouchListener(this);
        boolean z = true;
        this.h.put(this.a, Boolean.valueOf(e2Var.d || e2Var.m));
        this.h.put(this, Boolean.valueOf(e2Var.l || e2Var.m));
        this.h.put(this.b, Boolean.valueOf(e2Var.a || e2Var.m));
        this.h.put(this.c, Boolean.valueOf(e2Var.b || e2Var.m));
        this.h.put(this.f, Boolean.valueOf(e2Var.e || e2Var.m));
        this.h.put(this.g, Boolean.valueOf(e2Var.j || e2Var.m));
        HashMap hashMap = this.h;
        Button button = this.d;
        if (!e2Var.g && !e2Var.m) {
            z = false;
        }
        hashMap.put(button, Boolean.valueOf(z));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NonNull
    public Button getCtaButtonView() {
        return this.d;
    }

    @NonNull
    public TextView getDescriptionTextView() {
        return this.c;
    }

    @NonNull
    public TextView getDomainTextView() {
        return this.g;
    }

    @NonNull
    public StarsRatingView getRatingView() {
        return this.f;
    }

    @NonNull
    public fh getSmartImageView() {
        return this.a;
    }

    @NonNull
    public TextView getTitleTextView() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = (i3 - i) - (this.m * 2);
        boolean z2 = !this.i && getResources().getConfiguration().orientation == 2;
        fh fhVar = this.a;
        fhVar.layout(0, 0, fhVar.getMeasuredWidth(), this.a.getMeasuredHeight());
        if (z2) {
            this.b.setTypeface(null, 1);
            this.b.layout(0, this.a.getBottom(), i5, this.a.getBottom() + this.b.getMeasuredHeight());
            qi.a(this, 0, 0);
            this.c.layout(0, 0, 0, 0);
            this.d.layout(0, 0, 0, 0);
            this.f.layout(0, 0, 0, 0);
            this.g.layout(0, 0, 0, 0);
            return;
        }
        this.b.setTypeface(null, 0);
        qi.a(this, 0, 0, -3355444, this.e.b(1), 0);
        this.b.layout(this.m + this.n, this.a.getBottom(), this.b.getMeasuredWidth() + this.m + this.n, this.a.getBottom() + this.b.getMeasuredHeight());
        this.c.layout(this.m + this.n, this.b.getBottom(), this.c.getMeasuredWidth() + this.m + this.n, this.b.getBottom() + this.c.getMeasuredHeight());
        int measuredWidth = (i5 - this.d.getMeasuredWidth()) / 2;
        Button button = this.d;
        button.layout(measuredWidth, (i4 - button.getMeasuredHeight()) - this.n, this.d.getMeasuredWidth() + measuredWidth, i4 - this.n);
        int measuredWidth2 = (i5 - this.f.getMeasuredWidth()) / 2;
        this.f.layout(measuredWidth2, (this.d.getTop() - this.n) - this.f.getMeasuredHeight(), this.f.getMeasuredWidth() + measuredWidth2, this.d.getTop() - this.n);
        int measuredWidth3 = (i5 - this.g.getMeasuredWidth()) / 2;
        this.g.layout(measuredWidth3, (this.d.getTop() - this.g.getMeasuredHeight()) - this.n, this.g.getMeasuredWidth() + measuredWidth3, this.d.getTop() - this.n);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        int measuredHeight2;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z = !this.i && getResources().getConfiguration().orientation == 2;
        a(size, size2, z, size != 0 ? Integer.MIN_VALUE : 0);
        if (z) {
            measuredHeight = size2 - this.b.getMeasuredHeight();
            measuredHeight2 = this.m;
        } else {
            measuredHeight = (((size2 - this.d.getMeasuredHeight()) - (this.l * 2)) - Math.max(this.f.getMeasuredHeight(), this.g.getMeasuredHeight())) - this.c.getMeasuredHeight();
            measuredHeight2 = this.b.getMeasuredHeight();
        }
        int i3 = measuredHeight - measuredHeight2;
        if (i3 <= size) {
            size = i3;
        }
        this.a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.o ? a(view, motionEvent) : b(view, motionEvent);
    }

    public void setIsHitMapEnabled(boolean z) {
        this.o = z;
    }

    private void a() {
        qi.a(this, 0, 0, -3355444, this.e.b(1), 0);
        this.m = this.e.b(2);
        this.n = this.e.b(12);
        this.d.setPadding(this.e.b(15), this.e.b(10), this.e.b(15), this.e.b(10));
        this.d.setMinimumWidth(this.e.b(100));
        this.d.setTransformationMethod(null);
        this.d.setSingleLine();
        if (this.i) {
            this.d.setTextSize(20.0f);
        } else {
            this.d.setTextSize(18.0f);
        }
        Button button = this.d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button.setEllipsize(truncateAt);
        this.d.setElevation(this.e.b(2));
        this.l = this.e.b(12);
        qi.b(this.d, -16733198, -16746839, this.e.b(2));
        this.d.setTextColor(-1);
        if (this.i) {
            this.b.setTextSize(20.0f);
        } else {
            this.b.setTextSize(18.0f);
        }
        this.b.setTextColor(-16777216);
        this.b.setTypeface(null, 1);
        this.b.setLines(1);
        this.b.setEllipsize(truncateAt);
        this.c.setTextColor(-7829368);
        this.c.setLines(2);
        if (this.i) {
            this.c.setTextSize(20.0f);
        } else {
            this.c.setTextSize(18.0f);
        }
        this.c.setEllipsize(truncateAt);
        if (this.i) {
            this.f.setStarSize(this.e.b(24));
        } else {
            this.f.setStarSize(this.e.b(18));
        }
        this.f.setStarsPadding(this.e.b(4));
        qi.b(this, "card_view");
        qi.b(this.b, "card_title_text");
        qi.b(this.c, "card_description_text");
        qi.b(this.g, "card_domain_text");
        qi.b(this.d, "card_cta_button");
        qi.b(this.f, "card_stars_view");
        qi.b(this.a, "card_image");
        addView(this.a);
        addView(this.c);
        addView(this.b);
        addView(this.d);
        addView(this.f);
        addView(this.g);
    }

    private void a(int i, int i2, boolean z, int i3) {
        int i4 = this.m * 2;
        int i5 = i2 - i4;
        int i6 = i - i4;
        if (z) {
            this.b.measure(View.MeasureSpec.makeMeasureSpec(i, i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
            this.c.measure(0, 0);
            this.f.measure(0, 0);
            this.g.measure(0, 0);
            this.d.measure(0, 0);
            return;
        }
        this.b.measure(View.MeasureSpec.makeMeasureSpec(i6 - (this.n * 2), i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(i6 - (this.n * 2), i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(i6, i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.g.measure(View.MeasureSpec.makeMeasureSpec(i6, i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(i6 - (this.n * 2), i3), View.MeasureSpec.makeMeasureSpec(i5 - (this.n * 2), Integer.MIN_VALUE));
    }

    private boolean a(View view, MotionEvent motionEvent) {
        if (!this.h.containsKey(view)) {
            return false;
        }
        boolean booleanValue = ((Boolean) this.h.get(view)).booleanValue();
        view.setClickable(booleanValue);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if (this.j != null) {
                    boolean equals = Boolean.TRUE.equals(this.h.get(this.d));
                    h2 a = j2.a(view).a(motionEvent);
                    if (a == null) {
                        a = h2.a();
                    }
                    t2 a2 = t2.a(a(view), a);
                    z1.c cVar = this.k;
                    if (cVar != null && view == this.d && equals) {
                        cVar.a(view, a2);
                    } else {
                        z1.c cVar2 = this.j;
                        if (cVar2 != null) {
                            cVar2.a(view, a2);
                        }
                    }
                }
                if (booleanValue) {
                    Button button = this.d;
                    if (view == button) {
                        button.setPressed(false);
                    } else {
                        qi.a(this, 0, 0, -3355444, this.e.b(1), 0);
                    }
                }
            } else if (action == 3 && booleanValue) {
                Button button2 = this.d;
                if (view == button2) {
                    button2.setPressed(false);
                } else {
                    qi.a(this, 0, 0, -3355444, this.e.b(1), 0);
                }
            }
        } else if (booleanValue) {
            Button button3 = this.d;
            if (view == button3) {
                button3.setPressed(true);
            } else {
                setBackgroundColor(NativeAdColor.BACKGROUND_TOUCH);
            }
        }
        return true;
    }

    private int a(View view) {
        if (view == this.d) {
            return 64;
        }
        if (view == this.a) {
            return 8;
        }
        if (view == this.b) {
            return 1;
        }
        if (view == this.c) {
            return 2;
        }
        if (view == this.f) {
            return 16;
        }
        return view == this.g ? 512 : 2048;
    }
}
