package M0;

import K.S;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fortuneodd.shadegrid.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0219d0;
import q0.AbstractC0288a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f569A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f570B;

    /* renamed from: a, reason: collision with root package name */
    public final int f571a;

    /* renamed from: b, reason: collision with root package name */
    public final int f572b;

    /* renamed from: c, reason: collision with root package name */
    public final int f573c;
    public final TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f574e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f575f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f576g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f577j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f578k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f579l;

    /* renamed from: m, reason: collision with root package name */
    public final float f580m;

    /* renamed from: n, reason: collision with root package name */
    public int f581n;

    /* renamed from: o, reason: collision with root package name */
    public int f582o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f583p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f584q;

    /* renamed from: r, reason: collision with root package name */
    public C0219d0 f585r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f586s;

    /* renamed from: t, reason: collision with root package name */
    public int f587t;

    /* renamed from: u, reason: collision with root package name */
    public int f588u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f589v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f590w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f591x;

    /* renamed from: y, reason: collision with root package name */
    public C0219d0 f592y;

    /* renamed from: z, reason: collision with root package name */
    public int f593z;

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f576g = context;
        this.h = textInputLayout;
        this.f580m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f571a = q1.l.m0(context, R.attr.motionDurationShort4, 217);
        this.f572b = q1.l.m0(context, R.attr.motionDurationMedium4, 167);
        this.f573c = q1.l.m0(context, R.attr.motionDurationShort4, 167);
        this.d = q1.l.n0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0288a.d);
        LinearInterpolator linearInterpolator = AbstractC0288a.f3550a;
        this.f574e = q1.l.n0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f575f = q1.l.n0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0219d0 c0219d0, int i) {
        if (this.i == null && this.f578k == null) {
            Context context = this.f576g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f578k = new FrameLayout(context);
            this.i.addView(this.f578k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f578k.setVisibility(0);
            this.f578k.addView(c0219d0);
        } else {
            this.i.addView(c0219d0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f577j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f576g;
                boolean C2 = q1.d.C(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = S.f360a;
                int paddingStart = editText.getPaddingStart();
                if (C2) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (C2) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (C2) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f579l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0219d0 c0219d0, int i, int i2, int i3) {
        if (c0219d0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0219d0, (Property<C0219d0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f573c;
            ofFloat.setDuration(z3 ? this.f572b : i4);
            ofFloat.setInterpolator(z3 ? this.f574e : this.f575f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0219d0, (Property<C0219d0, Float>) View.TRANSLATION_Y, -this.f580m, 0.0f);
            ofFloat2.setDuration(this.f571a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f585r;
        }
        if (i != 2) {
            return null;
        }
        return this.f592y;
    }

    public final void f() {
        this.f583p = null;
        c();
        if (this.f581n == 1) {
            if (!this.f591x || TextUtils.isEmpty(this.f590w)) {
                this.f582o = 0;
            } else {
                this.f582o = 2;
            }
        }
        i(this.f581n, this.f582o, h(this.f585r, ""));
    }

    public final void g(C0219d0 c0219d0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f578k) != null) {
            frameLayout.removeView(c0219d0);
        } else {
            linearLayout.removeView(c0219d0);
        }
        int i2 = this.f577j - 1;
        this.f577j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0219d0 c0219d0, CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f360a;
        TextInputLayout textInputLayout = this.h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f582o == this.f581n && c0219d0 != null && TextUtils.equals(c0219d0.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z2) {
        TextView e2;
        TextView e3;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f579l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f591x, this.f592y, 2, i, i2);
            d(arrayList, this.f584q, this.f585r, 1, i, i2);
            int size = arrayList.size();
            long j2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j2);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new s(this, i2, e(i), i, e(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (e3 = e(i2)) != null) {
                e3.setVisibility(0);
                e3.setAlpha(1.0f);
            }
            if (i != 0 && (e2 = e(i)) != null) {
                e2.setVisibility(4);
                if (i == 1) {
                    e2.setText((CharSequence) null);
                }
            }
            this.f581n = i2;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}
