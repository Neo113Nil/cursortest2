package yads;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.explorestack.protobuf.openrtb.LossReason;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.vungle.ads.internal.protos.Sdk;
import com.yandex.div.internal.widget.DivLayoutParams;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class np1 extends ViewGroup {
    public final yg0 a;
    public final FrameLayout b;
    public final ImageView c;
    public final TextView d;
    public final ImageView e;
    public final Button f;
    public final TextView g;
    public final ImageView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    public np1(@NotNull Context context) {
        super(context);
        this.a = new yg0();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(View.generateViewId());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-16777216);
        gradientDrawable.setCornerRadius(yg0.a(getContext(), 4.0f));
        frameLayout.setBackground(gradientDrawable);
        frameLayout.setClipToOutline(true);
        this.b = frameLayout;
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setBackgroundColor(-16777216);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.c = imageView;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        textView.setTextSize(2, 11.0f);
        textView.setTextColor(-16777216);
        textView.setPadding(yg0.a(getContext(), 4.0f), yg0.a(getContext(), 0.0f), yg0.a(getContext(), 4.0f), yg0.a(getContext(), 0.0f));
        textView.setGravity(17);
        textView.setMaxLines(1);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(Color.argb(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE));
        gradientDrawable2.setCornerRadius(yg0.a(getContext(), 5.0f));
        textView.setBackground(gradientDrawable2);
        textView.setElevation(999.0f);
        textView.setVisibility(8);
        this.d = textView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(View.generateViewId());
        imageView2.setVisibility(8);
        this.e = imageView2;
        Button button = new Button(context, null, R.attr.borderlessButtonStyle);
        button.setId(View.generateViewId());
        button.setTextSize(2, 12.0f);
        button.setTextColor(-16745729);
        button.setTypeface(null, 1);
        button.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button.setEllipsize(truncateAt);
        button.setGravity(17);
        button.setAllCaps(false);
        button.setPadding(0, 0, 0, 0);
        button.setMinWidth(0);
        button.setMinimumWidth(0);
        button.setMinHeight(0);
        button.setMinimumHeight(0);
        button.setIncludeFontPadding(false);
        this.f = button;
        TextView textView2 = new TextView(context);
        textView2.setId(View.generateViewId());
        textView2.setTextSize(2, 10.0f);
        textView2.setTextColor(-7434605);
        textView2.setVisibility(8);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        textView2.setIncludeFontPadding(false);
        this.g = textView2;
        ImageView imageView3 = new ImageView(context);
        imageView3.setId(View.generateViewId());
        imageView3.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView3.setVisibility(8);
        this.h = imageView3;
        TextView textView3 = new TextView(context);
        textView3.setId(View.generateViewId());
        textView3.setTextSize(2, 11.0f);
        textView3.setTextColor(-16777216);
        textView3.setMaxLines(2);
        textView3.setVisibility(8);
        this.i = textView3;
        TextView textView4 = new TextView(context);
        textView4.setId(View.generateViewId());
        textView4.setTextSize(2, 12.0f);
        textView4.setTypeface(null, 1);
        textView4.setTextColor(-16777216);
        textView4.setMaxLines(2);
        textView4.setEllipsize(truncateAt);
        textView4.setIncludeFontPadding(false);
        textView4.setGravity(DivLayoutParams.DEFAULT_GRAVITY);
        this.j = textView4;
        TextView textView5 = new TextView(context);
        textView5.setId(View.generateViewId());
        textView5.setTextSize(2, 12.0f);
        textView5.setTextColor(-7434605);
        textView5.setMaxLines(1);
        textView5.setEllipsize(truncateAt);
        textView5.setVisibility(8);
        textView5.setIncludeFontPadding(false);
        textView5.setGravity(8388627);
        this.k = textView5;
        setBackgroundColor(-1);
        setMinimumHeight(yg0.a(getContext(), 50.0f));
        addView(frameLayout);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(textView);
        addView(imageView2);
        addView(button);
        addView(textView2);
        addView(imageView3);
        addView(textView3);
        addView(textView4);
        addView(textView5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        FrameLayout frameLayout = this.b;
        int a = mp1.a(this, this.a, 1.0f);
        int a2 = mp1.a(this, this.a, 1.0f);
        int a3 = mp1.a(this, this.a, 1.0f) + this.l;
        yg0 yg0Var = this.a;
        Context context = getContext();
        yg0Var.getClass();
        frameLayout.layout(a, a2, a3, i8 - yg0.a(context, 1.0f));
        if (this.u) {
            ImageView imageView = this.e;
            yg0 yg0Var2 = this.a;
            Context context2 = getContext();
            yg0Var2.getClass();
            int a4 = (i7 - yg0.a(context2, 4.0f)) - this.e.getMeasuredWidth();
            int a5 = mp1.a(this, this.a, 4.0f);
            yg0 yg0Var3 = this.a;
            Context context3 = getContext();
            yg0Var3.getClass();
            imageView.layout(a4, a5, i7 - yg0.a(context3, 4.0f), this.e.getMeasuredHeight() + mp1.a(this, this.a, 4.0f));
        }
        yg0 yg0Var4 = this.a;
        Context context4 = getContext();
        yg0Var4.getClass();
        int a6 = (yg0.a(context4, 4.0f) + (i8 / 2)) - (this.f.getMeasuredHeight() / 2);
        int a7 = mp1.a(this, this.a, 1.0f);
        Button button = this.f;
        int i9 = i7 - a7;
        button.layout(i9 - button.getMeasuredWidth(), a6, i9, this.f.getMeasuredHeight() + a6);
        if (this.v) {
            TextView textView = this.g;
            int i10 = this.m;
            yg0 yg0Var5 = this.a;
            Context context5 = getContext();
            yg0Var5.getClass();
            int a8 = yg0.a(context5, 3.0f) + i10;
            int measuredHeight = i8 - this.g.getMeasuredHeight();
            yg0 yg0Var6 = this.a;
            Context context6 = getContext();
            yg0Var6.getClass();
            int a9 = measuredHeight - yg0.a(context6, 1.0f);
            yg0 yg0Var7 = this.a;
            Context context7 = getContext();
            yg0Var7.getClass();
            textView.layout(a8, a9, i7, i8 - yg0.a(context7, 1.0f));
        }
        if (this.w) {
            if (this.x) {
                int measuredWidth = this.h.getMeasuredWidth();
                yg0 yg0Var8 = this.a;
                Context context8 = getContext();
                yg0Var8.getClass();
                i6 = yg0.a(context8, 3.0f) + measuredWidth;
            } else {
                i6 = 0;
            }
            if (this.x) {
                ImageView imageView2 = this.h;
                int i11 = this.m;
                yg0 yg0Var9 = this.a;
                Context context9 = getContext();
                yg0Var9.getClass();
                int a10 = yg0.a(context9, 4.0f) + i11;
                int i12 = this.p;
                int i13 = this.m;
                yg0 yg0Var10 = this.a;
                Context context10 = getContext();
                yg0Var10.getClass();
                imageView2.layout(a10, i12, this.h.getMeasuredWidth() + yg0.a(context10, 4.0f) + i13, this.h.getMeasuredHeight() + this.p);
            }
            TextView textView2 = this.i;
            int i14 = this.m;
            yg0 yg0Var11 = this.a;
            Context context11 = getContext();
            yg0Var11.getClass();
            int a11 = yg0.a(context11, 4.0f) + i14 + i6;
            int i15 = this.p;
            int i16 = this.m;
            yg0 yg0Var12 = this.a;
            Context context12 = getContext();
            yg0Var12.getClass();
            textView2.layout(a11, i15, this.i.getMeasuredWidth() + yg0.a(context12, 4.0f) + i16 + i6, this.i.getMeasuredHeight() + this.p);
        }
        int i17 = this.p + (this.w ? this.t : 0);
        TextView textView3 = this.j;
        int i18 = this.m;
        yg0 yg0Var13 = this.a;
        Context context13 = getContext();
        yg0Var13.getClass();
        int a12 = yg0.a(context13, 4.0f) + i18;
        int i19 = this.m;
        yg0 yg0Var14 = this.a;
        Context context14 = getContext();
        yg0Var14.getClass();
        textView3.layout(a12, i17, this.j.getMeasuredWidth() + yg0.a(context14, 4.0f) + i19, this.j.getMeasuredHeight() + i17);
        int measuredHeight2 = this.j.getMeasuredHeight() + i17;
        if (this.y && this.k.getVisibility() == 0) {
            int i20 = measuredHeight2 + this.r;
            if (this.v) {
                i8 -= this.g.getMeasuredHeight();
                i5 = this.s;
            } else {
                i5 = this.s;
            }
            int i21 = i8 - i5;
            int measuredHeight3 = this.k.getMeasuredHeight();
            int coerceAtLeast = RangesKt.coerceAtLeast((int) (((RangesKt.coerceAtLeast(i21 - i20, 0) - measuredHeight3) / 2.0f) + i20), i20);
            int i22 = this.m;
            yg0 yg0Var15 = this.a;
            Context context15 = getContext();
            yg0Var15.getClass();
            int a13 = yg0.a(context15, 4.0f) + i22;
            TextView textView4 = this.k;
            textView4.layout(a13, coerceAtLeast, textView4.getMeasuredWidth() + a13, measuredHeight3 + coerceAtLeast);
        }
        if (Intrinsics.areEqual(this.d.getParent(), this.b)) {
            int measuredWidth2 = this.d.getMeasuredWidth();
            int i23 = this.l;
            yg0 yg0Var16 = this.a;
            Context context16 = getContext();
            yg0Var16.getClass();
            int coerceAtMost = RangesKt.coerceAtMost(measuredWidth2, i23 - yg0.a(context16, 6.0f));
            TextView textView5 = this.d;
            int a14 = mp1.a(this, this.a, 3.0f);
            int a15 = mp1.a(this, this.a, 3.0f);
            yg0 yg0Var17 = this.a;
            Context context17 = getContext();
            yg0Var17.getClass();
            textView5.layout(a14, a15, yg0.a(context17, 3.0f) + coerceAtMost, this.d.getMeasuredHeight() + mp1.a(this, this.a, 3.0f));
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int coerceAtLeast;
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (size <= 0) {
            size = mp1.a(this, this.a, 320.0f);
        }
        if (size2 <= 0) {
            size2 = (size < mp1.a(this, this.a, 320.0f) || mode == 1073741824) ? mp1.a(this, this.a, 50.0f) : mp1.a(this, this.a, 250.0f);
        }
        float f = size2;
        float f2 = f / getContext().getResources().getDisplayMetrics().density;
        float f3 = size;
        float f4 = f3 / getContext().getResources().getDisplayMetrics().density;
        boolean z = f2 > 180.0f;
        boolean z2 = f4 < 320.0f;
        if (z) {
            coerceAtLeast = (int) (f3 * (z2 ? 0.42f : 0.48f));
        } else {
            yg0 yg0Var = this.a;
            Context context = getContext();
            yg0Var.getClass();
            coerceAtLeast = RangesKt.coerceAtLeast(size2 - yg0.a(context, 2.0f), 0);
        }
        this.l = coerceAtLeast;
        yg0 yg0Var2 = this.a;
        Context context2 = getContext();
        yg0Var2.getClass();
        this.m = yg0.a(context2, 1.0f) + coerceAtLeast;
        this.n = size;
        this.o = size2;
        yg0 yg0Var3 = this.a;
        Context context3 = getContext();
        yg0Var3.getClass();
        this.b.measure(View.MeasureSpec.makeMeasureSpec(this.l, 1073741824), View.MeasureSpec.makeMeasureSpec(RangesKt.coerceAtLeast(size2 - yg0.a(context3, 2.0f), 0), 1073741824));
        int a = mp1.a(this, this.a, 15.0f);
        this.e.measure(View.MeasureSpec.makeMeasureSpec(a, 1073741824), View.MeasureSpec.makeMeasureSpec(a, 1073741824));
        int a2 = mp1.a(this, this.a, 84.0f);
        int i5 = size - this.m;
        yg0 yg0Var4 = this.a;
        Context context4 = getContext();
        yg0Var4.getClass();
        this.f.measure(View.MeasureSpec.makeMeasureSpec(Math.min(RangesKt.coerceAtLeast(i5 - yg0.a(context4, 2.0f), 0), a2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        float f5 = f / getContext().getResources().getDisplayMetrics().density;
        int a3 = mp1.a(this, this.a, f5 >= 80.0f ? 24.0f : 12.0f);
        int i6 = f5 >= 80.0f ? 2 : 1;
        if (this.g.getMaxLines() != i6) {
            this.g.setMaxLines(i6);
        }
        int i7 = size - this.m;
        yg0 yg0Var5 = this.a;
        Context context5 = getContext();
        yg0Var5.getClass();
        this.g.measure(View.MeasureSpec.makeMeasureSpec(RangesKt.coerceAtLeast(i7 - yg0.a(context5, 3.0f), 0), 1073741824), View.MeasureSpec.makeMeasureSpec(a3, Integer.MIN_VALUE));
        int measuredWidth = this.f.getMeasuredWidth();
        int i8 = this.n;
        float f6 = this.o / getContext().getResources().getDisplayMetrics().density;
        int a4 = mp1.a(this, this.a, 12.0f);
        this.h.measure(View.MeasureSpec.makeMeasureSpec(a4, 1073741824), View.MeasureSpec.makeMeasureSpec(a4, 1073741824));
        int a5 = mp1.a(this, this.a, 15.0f);
        if (this.x) {
            yg0 yg0Var6 = this.a;
            Context context6 = getContext();
            yg0Var6.getClass();
            i3 = yg0.a(context6, 3.0f) + a4;
        } else {
            i3 = 0;
        }
        if (this.u) {
            yg0 yg0Var7 = this.a;
            Context context7 = getContext();
            yg0Var7.getClass();
            i8 = (i8 - yg0.a(context7, 4.0f)) - a5;
        }
        int i9 = f6 < 60.0f ? 1 : 2;
        if (this.i.getMaxLines() != i9) {
            this.i.setMaxLines(i9);
        }
        TextView textView = this.i;
        int i10 = i8 - this.m;
        yg0 yg0Var8 = this.a;
        Context context8 = getContext();
        yg0Var8.getClass();
        textView.measure(View.MeasureSpec.makeMeasureSpec(RangesKt.coerceAtLeast((i10 - yg0.a(context8, 4.0f)) - i3, 0), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        boolean z3 = ((float) this.o) / getContext().getResources().getDisplayMetrics().density < 60.0f;
        this.p = z3 ? mp1.a(this, this.a, 1.0f) : this.w ? mp1.a(this, this.a, 4.0f) : mp1.a(this, this.a, 2.0f);
        this.q = mp1.a(this, this.a, z3 ? 1.0f : 2.0f);
        this.r = mp1.a(this, this.a, z3 ? 1.0f : 2.0f);
        this.s = mp1.a(this, this.a, z3 ? 1.0f : 3.0f);
        if (this.w) {
            i4 = (z3 ? this.i.getMeasuredHeight() : Math.max(this.h.getMeasuredHeight(), this.i.getMeasuredHeight())) + this.q;
        } else {
            i4 = 0;
        }
        this.t = i4;
        int i11 = this.n;
        int i12 = this.o;
        float f7 = i12 / getContext().getResources().getDisplayMetrics().density;
        int a6 = mp1.a(this, this.a, 1.0f);
        int i13 = i11 - this.m;
        yg0 yg0Var9 = this.a;
        Context context9 = getContext();
        yg0Var9.getClass();
        int coerceAtLeast2 = RangesKt.coerceAtLeast(((i13 - yg0.a(context9, 4.0f)) - measuredWidth) - a6, 0);
        int measuredHeight = this.v ? this.g.getMeasuredHeight() : 0;
        int i14 = this.p + this.t;
        if (this.v) {
            i12 -= measuredHeight;
        }
        int coerceAtLeast3 = RangesKt.coerceAtLeast((i12 - this.s) - i14, 0);
        this.k.setSingleLine(false);
        if (this.k.getMaxLines() != 1) {
            this.k.setMaxLines(1);
        }
        this.k.measure(View.MeasureSpec.makeMeasureSpec(RangesKt.coerceAtLeast(coerceAtLeast2, 0), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight2 = this.k.getMeasuredHeight();
        if (this.j.getMaxLines() != 1) {
            this.j.setMaxLines(1);
        }
        this.j.measure(View.MeasureSpec.makeMeasureSpec(coerceAtLeast2, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int coerceAtLeast4 = RangesKt.coerceAtLeast(coerceAtLeast3 - (this.y ? this.r + measuredHeight2 : 0), this.j.getMeasuredHeight());
        int i15 = f7 >= 80.0f ? 3 : f7 >= 60.0f ? 2 : 1;
        if (this.j.getMaxLines() != i15) {
            this.j.setMaxLines(i15);
        }
        this.j.measure(View.MeasureSpec.makeMeasureSpec(coerceAtLeast2, 1073741824), View.MeasureSpec.makeMeasureSpec(coerceAtLeast4, Integer.MIN_VALUE));
        int coerceAtLeast5 = RangesKt.coerceAtLeast((coerceAtLeast3 - this.j.getMeasuredHeight()) - this.r, 0);
        boolean z4 = coerceAtLeast5 >= measuredHeight2;
        boolean z5 = this.y;
        this.k.setVisibility((z5 && z5 && z4) ? 0 : 8);
        boolean z6 = this.y;
        if (z6 && z4 && measuredHeight2 > 0) {
            int coerceAtLeast6 = RangesKt.coerceAtLeast(coerceAtLeast5 / measuredHeight2, 1);
            this.k.setSingleLine(false);
            if (this.k.getMaxLines() != coerceAtLeast6) {
                this.k.setMaxLines(coerceAtLeast6);
            }
            this.k.measure(View.MeasureSpec.makeMeasureSpec(RangesKt.coerceAtLeast(coerceAtLeast2, 0), 1073741824), View.MeasureSpec.makeMeasureSpec(coerceAtLeast5, Integer.MIN_VALUE));
        } else {
            if (z6) {
                this.k.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            }
            if (this.y && !z4) {
                this.j.measure(View.MeasureSpec.makeMeasureSpec(coerceAtLeast2, 1073741824), View.MeasureSpec.makeMeasureSpec(coerceAtLeast3, Integer.MIN_VALUE));
            }
        }
        TextView textView2 = this.d;
        int i16 = this.l;
        yg0 yg0Var10 = this.a;
        Context context10 = getContext();
        yg0Var10.getClass();
        textView2.measure(View.MeasureSpec.makeMeasureSpec(i16 - yg0.a(context10, 6.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int resolveSize = View.resolveSize(this.n, i);
        int resolveSize2 = View.resolveSize(this.o, i2);
        yg0 yg0Var11 = this.a;
        Context context11 = getContext();
        yg0Var11.getClass();
        setMeasuredDimension(resolveSize, RangesKt.coerceAtLeast(resolveSize2, yg0.a(context11, 50.0f)));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
