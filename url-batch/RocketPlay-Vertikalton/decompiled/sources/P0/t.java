package P0;

import K.T;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.luckycounter.drinkwater.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0244c0;
import t0.AbstractC0369a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f987A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f988B;

    /* renamed from: a, reason: collision with root package name */
    public final int f989a;

    /* renamed from: b, reason: collision with root package name */
    public final int f990b;

    /* renamed from: c, reason: collision with root package name */
    public final int f991c;
    public final TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f992e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f993f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f994g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f995j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f996k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f997l;

    /* renamed from: m, reason: collision with root package name */
    public final float f998m;

    /* renamed from: n, reason: collision with root package name */
    public int f999n;

    /* renamed from: o, reason: collision with root package name */
    public int f1000o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1001p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1002q;

    /* renamed from: r, reason: collision with root package name */
    public C0244c0 f1003r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f1004s;

    /* renamed from: t, reason: collision with root package name */
    public int f1005t;

    /* renamed from: u, reason: collision with root package name */
    public int f1006u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f1007v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f1008w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1009x;

    /* renamed from: y, reason: collision with root package name */
    public C0244c0 f1010y;

    /* renamed from: z, reason: collision with root package name */
    public int f1011z;

    public t(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f994g = context;
        this.h = textInputLayout;
        this.f998m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f989a = F1.d.d0(context, R.attr.motionDurationShort4, 217);
        this.f990b = F1.d.d0(context, R.attr.motionDurationMedium4, 167);
        this.f991c = F1.d.d0(context, R.attr.motionDurationShort4, 167);
        this.d = F1.d.e0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0369a.d);
        LinearInterpolator linearInterpolator = AbstractC0369a.f4162a;
        this.f992e = F1.d.e0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f993f = F1.d.e0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0244c0 c0244c0, int i) {
        if (this.i == null && this.f996k == null) {
            Context context = this.f994g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f996k = new FrameLayout(context);
            this.i.addView(this.f996k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f996k.setVisibility(0);
            this.f996k.addView(c0244c0);
        } else {
            this.i.addView(c0244c0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f995j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f994g;
                boolean Q2 = F1.l.Q(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = T.f633a;
                int paddingStart = editText.getPaddingStart();
                if (Q2) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (Q2) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (Q2) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f997l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0244c0 c0244c0, int i, int i2, int i3) {
        if (c0244c0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0244c0, (Property<C0244c0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f991c;
            ofFloat.setDuration(z3 ? this.f990b : i4);
            ofFloat.setInterpolator(z3 ? this.f992e : this.f993f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0244c0, (Property<C0244c0, Float>) View.TRANSLATION_Y, -this.f998m, RecyclerView.f1949A0);
            ofFloat2.setDuration(this.f989a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f1003r;
        }
        if (i != 2) {
            return null;
        }
        return this.f1010y;
    }

    public final void f() {
        this.f1001p = null;
        c();
        if (this.f999n == 1) {
            if (!this.f1009x || TextUtils.isEmpty(this.f1008w)) {
                this.f1000o = 0;
            } else {
                this.f1000o = 2;
            }
        }
        i(this.f999n, this.f1000o, h(this.f1003r, ""));
    }

    public final void g(C0244c0 c0244c0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f996k) != null) {
            frameLayout.removeView(c0244c0);
        } else {
            linearLayout.removeView(c0244c0);
        }
        int i2 = this.f995j - 1;
        this.f995j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0244c0 c0244c0, CharSequence charSequence) {
        WeakHashMap weakHashMap = T.f633a;
        TextInputLayout textInputLayout = this.h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f1000o == this.f999n && c0244c0 != null && TextUtils.equals(c0244c0.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z2) {
        TextView e2;
        TextView e3;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f997l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f1009x, this.f1010y, 2, i, i2);
            d(arrayList, this.f1002q, this.f1003r, 1, i, i2);
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
            animatorSet.addListener(new r(this, i2, e(i), i, e(i2)));
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
            this.f999n = i2;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}
