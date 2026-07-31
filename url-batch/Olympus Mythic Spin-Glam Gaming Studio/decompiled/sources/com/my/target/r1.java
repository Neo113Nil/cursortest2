package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;
import com.my.target.q1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class r1 extends LinearLayout implements View.OnTouchListener, q1 {
    private final fh a;
    private final TextView b;
    private final TextView c;
    private final Button d;
    private final gg e;
    private final Set f;
    private final int g;
    private final int h;
    private final int i;
    private q1.a j;
    private ImageData k;
    private boolean l;
    private boolean m;

    public r1(Context context, lf lfVar, gg ggVar) {
        super(context);
        this.f = new HashSet();
        this.m = false;
        setOrientation(1);
        this.e = ggVar;
        this.a = new fh(context);
        this.b = new TextView(context);
        this.c = new TextView(context);
        this.d = new Button(context);
        this.g = ggVar.a(gg.T);
        this.h = ggVar.a(gg.i);
        this.i = ggVar.a(gg.H);
        a(lfVar);
    }

    private boolean b(View view, MotionEvent motionEvent) {
        boolean contains;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                setBackgroundColor(0);
                this.d.setPressed(false);
                if (this.j != null) {
                    int i = 2;
                    if (!this.l) {
                        contains = this.f.contains(view);
                        if (!contains || view != this.d) {
                            i = 1;
                        }
                    } else if (view == this.d) {
                        contains = true;
                    } else {
                        contains = true;
                        i = 1;
                    }
                    this.j.a(contains, i, q2.a());
                }
            } else if (action == 3) {
                setBackgroundColor(0);
                this.d.setPressed(false);
            }
        } else if (this.l || this.f.contains(view)) {
            Button button = this.d;
            if (view == button) {
                button.setPressed(true);
            } else {
                setBackgroundColor(-13421773);
            }
        }
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setClickArea(@NonNull e2 e2Var) {
        setOnTouchListener(this);
        this.a.setOnTouchListener(this);
        this.b.setOnTouchListener(this);
        this.c.setOnTouchListener(this);
        this.d.setOnTouchListener(this);
        this.f.clear();
        if (e2Var.m) {
            this.l = true;
            return;
        }
        if (e2Var.g) {
            this.f.add(this.d);
        } else {
            this.d.setEnabled(false);
            this.f.remove(this.d);
        }
        if (e2Var.l) {
            this.f.add(this);
        } else {
            this.f.remove(this);
        }
        if (e2Var.a) {
            this.f.add(this.b);
        } else {
            this.f.remove(this.b);
        }
        if (e2Var.b) {
            this.f.add(this.c);
        } else {
            this.f.remove(this.c);
        }
        if (e2Var.d) {
            this.f.add(this.a);
        } else {
            this.f.remove(this.a);
        }
    }

    @Override // com.my.target.q1
    public View a() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        a(i, i2);
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0 && getMeasuredWidth() == size) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        int measuredWidth = this.a.getMeasuredWidth();
        int measuredHeight = this.a.getMeasuredHeight();
        if (size > size2) {
            setMeasuredDimension(measuredWidth, measuredHeight);
            return;
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            int measuredHeight2 = paddingBottom + childAt.getMeasuredHeight() + childAt.getPaddingTop() + childAt.getPaddingBottom();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            paddingBottom = measuredHeight2 + layoutParams.topMargin + layoutParams.bottomMargin;
        }
        setMeasuredDimension(measuredWidth, paddingBottom);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.m ? a(view, motionEvent) : b(view, motionEvent);
    }

    @Override // com.my.target.q1
    public void setBanner(@Nullable k8 k8Var) {
        if (k8Var == null) {
            this.f.clear();
            ImageData imageData = this.k;
            if (imageData != null) {
                b6.a(imageData, this.a);
            }
            this.a.setPlaceholderDimensions(0, 0);
            this.b.setVisibility(8);
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            return;
        }
        this.m = k8Var.f().b();
        ImageData y = k8Var.y();
        this.k = y;
        if (y != null) {
            this.a.setPlaceholderDimensions(y.getWidth(), this.k.getHeight());
            b6.b(this.k, this.a);
        }
        if (k8Var.X()) {
            this.b.setVisibility(8);
            this.c.setVisibility(8);
            this.d.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            this.c.setVisibility(0);
            this.d.setVisibility(0);
            this.b.setText(k8Var.K());
            this.c.setText(k8Var.n());
            this.d.setText(k8Var.l());
        }
        setClickArea(k8Var.i());
    }

    @Override // com.my.target.q1
    public void setListener(@Nullable q1.a aVar) {
        this.j = aVar;
    }

    private void a(lf lfVar) {
        this.d.setTransformationMethod(null);
        this.d.setSingleLine();
        this.d.setTextSize(1, this.e.a(gg.w));
        Button button = this.d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button.setEllipsize(truncateAt);
        this.d.setGravity(17);
        this.d.setIncludeFontPadding(false);
        Button button2 = this.d;
        int i = this.h;
        button2.setPadding(i, 0, i, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        gg ggVar = this.e;
        int i2 = gg.P;
        layoutParams.leftMargin = ggVar.a(i2);
        layoutParams.rightMargin = this.e.a(i2);
        layoutParams.topMargin = this.i;
        layoutParams.gravity = 1;
        this.d.setLayoutParams(layoutParams);
        qi.b(this.d, lfVar.d(), lfVar.f(), this.e.a(gg.o));
        this.d.setTextColor(lfVar.e());
        this.b.setTextSize(1, this.e.a(gg.Q));
        this.b.setTextColor(lfVar.k());
        this.b.setIncludeFontPadding(false);
        TextView textView = this.b;
        gg ggVar2 = this.e;
        int i3 = gg.O;
        textView.setPadding(ggVar2.a(i3), 0, this.e.a(i3), 0);
        this.b.setTypeface(null, 1);
        this.b.setLines(this.e.a(gg.D));
        this.b.setEllipsize(truncateAt);
        this.b.setGravity(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = this.h;
        this.b.setLayoutParams(layoutParams2);
        this.c.setTextColor(lfVar.j());
        this.c.setIncludeFontPadding(false);
        this.c.setLines(this.e.a(gg.E));
        this.c.setTextSize(1, this.e.a(gg.R));
        this.c.setEllipsize(truncateAt);
        this.c.setPadding(this.e.a(i3), 0, this.e.a(i3), 0);
        this.c.setGravity(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        this.c.setLayoutParams(layoutParams3);
        qi.b(this, "card_view");
        qi.b(this.b, "card_title_text");
        qi.b(this.c, "card_description_text");
        qi.b(this.d, "card_cta_button");
        qi.b(this.a, "card_image");
        addView(this.a);
        addView(this.b);
        addView(this.c);
        addView(this.d);
    }

    private void a(int i, int i2) {
        this.a.measure(i, i2);
        if (this.b.getVisibility() == 0) {
            this.b.measure(i, i2);
        }
        if (this.c.getVisibility() == 0) {
            this.c.measure(i, i2);
        }
        if (this.d.getVisibility() == 0) {
            qi.a(this.d, this.a.getMeasuredWidth() - (this.e.a(gg.P) * 2), this.g, 1073741824);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x003a, code lost:
    
        if (r5 == r4.d) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(View view, MotionEvent motionEvent) {
        boolean contains;
        int i;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                setBackgroundColor(0);
                this.d.setPressed(false);
                if (this.j != null) {
                    if (this.l) {
                        if (view == this.d) {
                            contains = true;
                            i = 2;
                        } else {
                            contains = true;
                            i = 1;
                        }
                    } else {
                        contains = this.f.contains(view);
                        if (contains) {
                        }
                        i = 1;
                    }
                    h2 a = j2.a(view).a(motionEvent);
                    if (a == null) {
                        a = h2.a();
                    }
                    t2 a2 = t2.a(a(view), a);
                    q1.a aVar = this.j;
                    if (aVar != null) {
                        aVar.a(contains, i, a2);
                    }
                }
            } else if (action == 3) {
                setBackgroundColor(0);
                this.d.setPressed(false);
            }
        } else if (this.l || this.f.contains(view)) {
            Button button = this.d;
            if (view == button) {
                button.setPressed(true);
            } else {
                setBackgroundColor(-13421773);
            }
        }
        return true;
    }

    private int a(View view) {
        if (view == this.d) {
            return 64;
        }
        if (view == this.b) {
            return 1;
        }
        if (view == this.c) {
            return 2;
        }
        return view == this.a ? 8 : 2048;
    }
}
