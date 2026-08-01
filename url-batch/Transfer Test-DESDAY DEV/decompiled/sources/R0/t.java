package R0;

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
import com.football.transfertrivia.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0201b0;
import v0.AbstractC0341a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f721A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f722B;

    /* renamed from: a, reason: collision with root package name */
    public final int f723a;

    /* renamed from: b, reason: collision with root package name */
    public final int f724b;

    /* renamed from: c, reason: collision with root package name */
    public final int f725c;
    public final TimeInterpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f726e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f727f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f728g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f729j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f730k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f731l;

    /* renamed from: m, reason: collision with root package name */
    public final float f732m;

    /* renamed from: n, reason: collision with root package name */
    public int f733n;

    /* renamed from: o, reason: collision with root package name */
    public int f734o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f735p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f736q;

    /* renamed from: r, reason: collision with root package name */
    public C0201b0 f737r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f738s;

    /* renamed from: t, reason: collision with root package name */
    public int f739t;

    /* renamed from: u, reason: collision with root package name */
    public int f740u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f741v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f742w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f743x;

    /* renamed from: y, reason: collision with root package name */
    public C0201b0 f744y;

    /* renamed from: z, reason: collision with root package name */
    public int f745z;

    public t(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f728g = context;
        this.h = textInputLayout;
        this.f732m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f723a = A.c.p0(context, R.attr.motionDurationShort4, 217);
        this.f724b = A.c.p0(context, R.attr.motionDurationMedium4, 167);
        this.f725c = A.c.p0(context, R.attr.motionDurationShort4, 167);
        this.d = A.c.q0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0341a.d);
        LinearInterpolator linearInterpolator = AbstractC0341a.f4037a;
        this.f726e = A.c.q0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f727f = A.c.q0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0201b0 c0201b0, int i) {
        if (this.i == null && this.f730k == null) {
            Context context = this.f728g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f730k = new FrameLayout(context);
            this.i.addView(this.f730k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f730k.setVisibility(0);
            this.f730k.addView(c0201b0);
        } else {
            this.i.addView(c0201b0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f729j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f728g;
                boolean a02 = A.c.a0(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = T.f372a;
                int paddingStart = editText.getPaddingStart();
                if (a02) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (a02) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (a02) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f731l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0201b0 c0201b0, int i, int i2, int i3) {
        if (c0201b0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0201b0, (Property<C0201b0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f725c;
            ofFloat.setDuration(z3 ? this.f724b : i4);
            ofFloat.setInterpolator(z3 ? this.f726e : this.f727f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0201b0, (Property<C0201b0, Float>) View.TRANSLATION_Y, -this.f732m, RecyclerView.f1570A0);
            ofFloat2.setDuration(this.f723a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f737r;
        }
        if (i != 2) {
            return null;
        }
        return this.f744y;
    }

    public final void f() {
        this.f735p = null;
        c();
        if (this.f733n == 1) {
            if (!this.f743x || TextUtils.isEmpty(this.f742w)) {
                this.f734o = 0;
            } else {
                this.f734o = 2;
            }
        }
        i(this.f733n, this.f734o, h(this.f737r, ""));
    }

    public final void g(C0201b0 c0201b0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f730k) != null) {
            frameLayout.removeView(c0201b0);
        } else {
            linearLayout.removeView(c0201b0);
        }
        int i2 = this.f729j - 1;
        this.f729j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0201b0 c0201b0, CharSequence charSequence) {
        WeakHashMap weakHashMap = T.f372a;
        TextInputLayout textInputLayout = this.h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f734o == this.f733n && c0201b0 != null && TextUtils.equals(c0201b0.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z2) {
        TextView e2;
        TextView e3;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f731l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f743x, this.f744y, 2, i, i2);
            d(arrayList, this.f736q, this.f737r, 1, i, i2);
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
            this.f733n = i2;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}
