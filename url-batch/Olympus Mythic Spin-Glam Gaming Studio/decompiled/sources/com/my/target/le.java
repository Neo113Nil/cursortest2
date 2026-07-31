package com.my.target;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.my.target.bf;
import com.my.target.common.models.ImageData;
import com.my.target.common.views.StarsRatingView;
import com.my.target.g2;
import com.my.target.nativeads.constants.NativeAdColor;
import com.my.target.nativeads.views.MediaAdView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class le extends ViewGroup {
    private final TextView a;
    private final ii b;
    private final TextView c;
    private final LinearLayout d;
    private final StarsRatingView e;
    private final TextView f;
    private final TextView g;
    private final Button h;
    private final fh i;
    private final qi j;
    private final View.OnTouchListener k;
    private final int l;
    private final int m;
    private final int n;
    private h2 o;
    private boolean p;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            le.this.c.setVisibility(8);
            le.this.a.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class b implements Animator.AnimatorListener {
        b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (le.this.d.isEnabled()) {
                le.this.d.setVisibility(8);
            }
            if (le.this.g.isEnabled()) {
                le.this.g.setVisibility(8);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public le(Context context, qi qiVar) {
        super(context);
        this.k = new g2(new g2.a() { // from class: com.my.target.le$$ExternalSyntheticLambda1
            @Override // com.my.target.g2.a
            public final void a(h2 h2Var) {
                le.this.a(h2Var);
            }
        });
        this.o = h2.a();
        this.p = false;
        this.j = qiVar;
        Button button = new Button(context);
        this.h = button;
        qi.b(button, "cta_button");
        fh fhVar = new fh(context);
        this.i = fhVar;
        qi.b(fhVar, ViewHierarchyConstants.ICON_BITMAP);
        this.b = new ii(context);
        TextView textView = new TextView(context);
        this.a = textView;
        qi.b(textView, "description_text");
        TextView textView2 = new TextView(context);
        this.c = textView2;
        qi.b(textView2, "disclaimer_text");
        this.d = new LinearLayout(context);
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.e = starsRatingView;
        qi.b(starsRatingView, "stars_view");
        TextView textView3 = new TextView(context);
        this.f = textView3;
        qi.b(textView3, "votes_text");
        TextView textView4 = new TextView(context);
        this.g = textView4;
        qi.b(textView4, "domain_text");
        this.l = qiVar.b(16);
        this.n = qiVar.b(8);
        this.m = qiVar.b(64);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h2 h2Var) {
        this.o = h2Var;
    }

    private void c(View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Button button = this.h;
        Property property = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(button, (Property<Button, Float>) property, 1.0f));
        Button button2 = this.h;
        Property property2 = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(button2, (Property<Button, Float>) property2, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.i, (Property<fh, Float>) property, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.i, (Property<fh, Float>) property2, 1.0f));
        TextView textView = this.a;
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<TextView, Float>) property3, 1.0f));
        if (this.d.isEnabled()) {
            arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<LinearLayout, Float>) property3, 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<le, Float>) property3, 1.0f));
        ii iiVar = this.b;
        Property property4 = View.TRANSLATION_X;
        arrayList.add(ObjectAnimator.ofFloat(iiVar, (Property<ii, Float>) property4, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<LinearLayout, Float>) property4, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.g, (Property<TextView, Float>) property4, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.a, (Property<TextView, Float>) property4, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<TextView, Float>) property4, 0.0f));
        Property property5 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<le, Float>) property5, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<Button, Float>) property5, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.i, (Property<fh, Float>) property5, 0.0f));
        for (View view : viewArr) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        }
        if (!TextUtils.isEmpty(this.c.getText().toString())) {
            this.c.setVisibility(0);
        }
        this.a.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new b());
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    private void d(View... viewArr) {
        a(0, viewArr);
    }

    public void b(View... viewArr) {
        if (getVisibility() == 0) {
            d(viewArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    void e(View... viewArr) {
        c(viewArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredHeight2 = this.i.getMeasuredHeight();
        int measuredWidth2 = this.i.getMeasuredWidth();
        int i5 = (measuredHeight - measuredHeight2) / 2;
        fh fhVar = this.i;
        int i6 = this.l;
        fhVar.layout(i6, i5, i6 + measuredWidth2, measuredHeight2 + i5);
        int measuredWidth3 = this.h.getMeasuredWidth();
        int measuredHeight3 = this.h.getMeasuredHeight();
        int i7 = (measuredHeight - measuredHeight3) / 2;
        int i8 = this.l;
        this.h.layout((measuredWidth - measuredWidth3) - i8, i7, measuredWidth - i8, measuredHeight3 + i7);
        int i9 = this.l;
        int i10 = measuredWidth2 + i9 + i9;
        ii iiVar = this.b;
        iiVar.layout(i10, this.n, iiVar.getMeasuredWidth() + i10, this.n + this.b.getMeasuredHeight());
        this.d.layout(i10, this.b.getBottom(), this.d.getMeasuredWidth() + i10, this.b.getBottom() + this.d.getMeasuredHeight());
        this.g.layout(i10, this.b.getBottom(), this.g.getMeasuredWidth() + i10, this.b.getBottom() + this.g.getMeasuredHeight());
        this.a.layout(i10, this.b.getBottom(), this.a.getMeasuredWidth() + i10, this.b.getBottom() + this.a.getMeasuredHeight());
        this.c.layout(i10, this.a.getBottom(), this.c.getMeasuredWidth() + i10, this.a.getBottom() + this.c.getMeasuredHeight());
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2) / 4;
        int i3 = size - (this.l * 2);
        int i4 = size2 - (this.n * 2);
        int min = Math.min(i4, this.m);
        this.i.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        this.h.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(min - (this.n * 2), 1073741824));
        int measuredWidth = ((i3 - this.i.getMeasuredWidth()) - this.h.getMeasuredWidth()) - (this.l * 2);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        this.g.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        this.a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4 - this.b.getMeasuredHeight(), Integer.MIN_VALUE));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        int measuredHeight = this.b.getMeasuredHeight() + Math.max(this.a.getMeasuredHeight(), this.d.getMeasuredHeight()) + (this.n * 2);
        if (this.c.getVisibility() == 0) {
            measuredHeight += this.c.getMeasuredHeight();
        }
        setMeasuredDimension(size, Math.max(this.h.getMeasuredHeight(), Math.max(this.i.getMeasuredHeight(), measuredHeight)) + (this.n * 2));
    }

    public void setBanner(@NonNull d9 d9Var) {
        this.b.getLeftText().setText(d9Var.K());
        this.a.setText(d9Var.n());
        String o = d9Var.o();
        this.p = d9Var.f().b();
        if (TextUtils.isEmpty(o)) {
            this.c.setVisibility(8);
        } else {
            this.c.setVisibility(0);
            this.c.setText(o);
        }
        ImageData w = d9Var.w();
        if (w != null) {
            this.i.setVisibility(0);
            this.i.setImageData(w);
        } else {
            this.i.setVisibility(8);
        }
        this.h.setText(d9Var.l());
        if ("".equals(d9Var.d())) {
            this.b.getRightBorderedView().setVisibility(8);
        } else {
            this.b.getRightBorderedView().setText(d9Var.d());
        }
        qi.b(this.h, -16733198, -16746839, this.j.b(2));
        this.h.setTextColor(-1);
        String B = d9Var.B();
        B.getClass();
        switch (B) {
            case "web":
            case "webform":
                String s = d9Var.s();
                if (TextUtils.isEmpty(s)) {
                    this.g.setEnabled(false);
                    this.g.setVisibility(8);
                } else {
                    this.g.setEnabled(true);
                    this.g.setText(s);
                }
                this.d.setEnabled(false);
                break;
            case "store":
                if (d9Var.Q() == 0 || d9Var.G() <= 0.0f) {
                    this.d.setEnabled(false);
                    this.d.setVisibility(8);
                } else {
                    this.d.setEnabled(true);
                    this.e.setRating(d9Var.G());
                    this.f.setText(String.valueOf(d9Var.Q()));
                }
                this.g.setEnabled(false);
                break;
        }
        if (d9Var.j0() == null || !d9Var.j0().v0()) {
            this.d.setVisibility(8);
            this.g.setVisibility(8);
        }
    }

    public void a() {
        setBackgroundColor(1711276032);
        this.a.setTextColor(-2236963);
        TextView textView = this.a;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.g.setTextColor(NativeAdColor.STANDARD_GREY);
        this.g.setVisibility(8);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(1, -3355444);
        this.c.setPadding(this.j.b(4), this.j.b(4), this.j.b(4), this.j.b(4));
        this.c.setBackground(gradientDrawable);
        this.c.setTextSize(2, 12.0f);
        this.c.setTextColor(-3355444);
        this.c.setVisibility(8);
        this.d.setOrientation(0);
        this.d.setGravity(16);
        this.d.setVisibility(8);
        this.f.setTextColor(NativeAdColor.STANDARD_GREY);
        this.f.setGravity(16);
        this.f.setTextSize(2, 14.0f);
        this.h.setPadding(this.j.b(15), 0, this.j.b(15), 0);
        this.h.setMinimumWidth(this.j.b(100));
        this.h.setTransformationMethod(null);
        this.h.setTextSize(2, 22.0f);
        this.h.setMaxEms(10);
        this.h.setSingleLine();
        this.h.setEllipsize(truncateAt);
        k1 rightBorderedView = this.b.getRightBorderedView();
        rightBorderedView.a(1, -7829368);
        rightBorderedView.setPadding(this.j.b(2), 0, 0, 0);
        rightBorderedView.setTextColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
        rightBorderedView.a(1, MediaAdView.COLOR_PLACEHOLDER_GRAY, this.j.b(3));
        rightBorderedView.setBackgroundColor(1711276032);
        this.e.setStarSize(this.j.b(12));
        this.d.addView(this.e);
        this.d.addView(this.f);
        this.d.setVisibility(8);
        this.g.setVisibility(8);
        addView(this.b);
        addView(this.d);
        addView(this.g);
        addView(this.a);
        addView(this.c);
        addView(this.i);
        addView(this.h);
    }

    private void b(e2 e2Var, final bf.a aVar) {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.my.target.le$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                le.this.a(aVar, view);
            }
        };
        setOnTouchListener(this.k);
        this.h.setOnTouchListener(this.k);
        this.b.getLeftText().setOnTouchListener(this.k);
        this.b.getRightBorderedView().setOnTouchListener(this.k);
        this.i.setOnTouchListener(this.k);
        this.a.setOnTouchListener(this.k);
        this.e.setOnTouchListener(this.k);
        this.f.setOnTouchListener(this.k);
        this.g.setOnTouchListener(this.k);
        if (!e2Var.g && !e2Var.m) {
            this.h.setEnabled(false);
        } else {
            this.h.setOnClickListener(onClickListener);
        }
        if (!e2Var.l && !e2Var.m) {
            setOnClickListener(null);
        } else {
            setOnClickListener(onClickListener);
        }
        if (!e2Var.a && !e2Var.m) {
            this.b.getLeftText().setOnClickListener(null);
        } else {
            this.b.getLeftText().setOnClickListener(onClickListener);
        }
        if (!e2Var.h && !e2Var.m) {
            this.b.getRightBorderedView().setOnClickListener(null);
        } else {
            this.b.getRightBorderedView().setOnClickListener(onClickListener);
        }
        if (!e2Var.c && !e2Var.m) {
            this.i.setOnClickListener(null);
        } else {
            this.i.setOnClickListener(onClickListener);
        }
        if (!e2Var.b && !e2Var.m) {
            this.a.setOnClickListener(null);
        } else {
            this.a.setOnClickListener(onClickListener);
        }
        if (!e2Var.e && !e2Var.m) {
            this.e.setOnClickListener(null);
        } else {
            this.e.setOnClickListener(onClickListener);
        }
        if (!e2Var.f && !e2Var.m) {
            this.f.setOnClickListener(null);
        } else {
            this.f.setOnClickListener(onClickListener);
        }
        if (!e2Var.j && !e2Var.m) {
            this.g.setOnClickListener(null);
        } else {
            this.g.setOnClickListener(onClickListener);
        }
    }

    private void c(e2 e2Var, final bf.a aVar) {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.my.target.le$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                le.this.b(aVar, view);
            }
        };
        if (e2Var.m) {
            setOnClickListener(onClickListener);
            this.h.setOnClickListener(onClickListener);
            return;
        }
        if (e2Var.g) {
            this.h.setOnClickListener(onClickListener);
        } else {
            this.h.setEnabled(false);
        }
        if (e2Var.l) {
            setOnClickListener(onClickListener);
        } else {
            setOnClickListener(null);
        }
        if (e2Var.a) {
            this.b.getLeftText().setOnClickListener(onClickListener);
        } else {
            this.b.getLeftText().setOnClickListener(null);
        }
        if (e2Var.h) {
            this.b.getRightBorderedView().setOnClickListener(onClickListener);
        } else {
            this.b.getRightBorderedView().setOnClickListener(null);
        }
        if (e2Var.c) {
            this.i.setOnClickListener(onClickListener);
        } else {
            this.i.setOnClickListener(null);
        }
        if (e2Var.b) {
            this.a.setOnClickListener(onClickListener);
        } else {
            this.a.setOnClickListener(null);
        }
        if (e2Var.e) {
            this.e.setOnClickListener(onClickListener);
        } else {
            this.e.setOnClickListener(null);
        }
        if (e2Var.f) {
            this.f.setOnClickListener(onClickListener);
        } else {
            this.f.setOnClickListener(null);
        }
        if (e2Var.j) {
            this.g.setOnClickListener(onClickListener);
        } else {
            this.g.setOnClickListener(null);
        }
    }

    public void a(e2 e2Var, bf.a aVar) {
        if (this.p) {
            b(e2Var, aVar);
        } else {
            c(e2Var, aVar);
        }
    }

    void a(View... viewArr) {
        if (getVisibility() == 0) {
            a(300, viewArr);
        }
    }

    private void a(int i, View... viewArr) {
        int height = this.i.getHeight();
        int height2 = getHeight();
        int width = this.h.getWidth();
        int height3 = this.h.getHeight();
        int width2 = this.i.getWidth();
        this.i.setPivotX(0.0f);
        this.i.setPivotY(height / 2.0f);
        this.h.setPivotX(width);
        this.h.setPivotY(height3 / 2.0f);
        float f = height2 * 0.3f;
        ArrayList arrayList = new ArrayList();
        Button button = this.h;
        Property property = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(button, (Property<Button, Float>) property, 0.7f));
        Button button2 = this.h;
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(button2, (Property<Button, Float>) property2, 0.7f));
        arrayList.add(ObjectAnimator.ofFloat(this.i, (Property<fh, Float>) property, 0.7f));
        arrayList.add(ObjectAnimator.ofFloat(this.i, (Property<fh, Float>) property2, 0.7f));
        TextView textView = this.a;
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<TextView, Float>) property3, 0.0f));
        if (this.d.isEnabled()) {
            arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<LinearLayout, Float>) property3, 1.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<le, Float>) property3, 0.6f));
        float f2 = -(width2 * 0.3f);
        ii iiVar = this.b;
        Property property4 = View.TRANSLATION_X;
        arrayList.add(ObjectAnimator.ofFloat(iiVar, (Property<ii, Float>) property4, f2));
        arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<LinearLayout, Float>) property4, f2));
        arrayList.add(ObjectAnimator.ofFloat(this.g, (Property<TextView, Float>) property4, f2));
        arrayList.add(ObjectAnimator.ofFloat(this.a, (Property<TextView, Float>) property4, f2));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<TextView, Float>) property4, f2));
        Property property5 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(this, (Property<le, Float>) property5, f));
        float f3 = (-f) / 2.0f;
        arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<Button, Float>) property5, f3));
        arrayList.add(ObjectAnimator.ofFloat(this.i, (Property<fh, Float>) property5, f3));
        for (View view : viewArr) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, f));
        }
        if (this.d.isEnabled()) {
            this.d.setVisibility(0);
        }
        if (this.g.isEnabled()) {
            this.g.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new a());
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(i);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(bf.a aVar, View view) {
        aVar.a(view, view == this.h ? 2 : 1, q2.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(bf.a aVar, View view) {
        aVar.a(view, view == this.h ? 2 : 1, t2.a(a(view), this.o));
    }

    private int a(View view) {
        if (view == this.h) {
            return 64;
        }
        if (view == this.b.getLeftText()) {
            return 1;
        }
        if (view == this.b.getRightBorderedView()) {
            return 128;
        }
        if (view == this.i) {
            return 4;
        }
        if (view == this.a) {
            return 2;
        }
        if (view == this.e) {
            return 16;
        }
        if (view == this.f) {
            return 32;
        }
        return view == this.g ? 512 : 2048;
    }
}
