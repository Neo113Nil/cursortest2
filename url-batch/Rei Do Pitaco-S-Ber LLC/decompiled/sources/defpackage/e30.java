package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class e30 extends LinearLayout {
    public final TextInputLayout f;
    public final p5 g;
    public CharSequence h;
    public final CheckableImageButton i;
    public ColorStateList j;
    public PorterDuff.Mode k;
    public int l;
    public ImageView.ScaleType m;
    public View.OnLongClickListener n;
    public boolean o;

    public e30(TextInputLayout textInputLayout, y5 y5Var) {
        super(textInputLayout.getContext());
        this.f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.i = checkableImageButton;
        p5 p5Var = new p5(getContext(), null);
        this.g = p5Var;
        if (oo.v(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.n;
        checkableImageButton.setOnClickListener(null);
        m60.X(checkableImageButton, onLongClickListener);
        this.n = null;
        checkableImageButton.setOnLongClickListener(null);
        m60.X(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) y5Var.a;
        if (typedArray.hasValue(70)) {
            this.j = oo.n(getContext(), y5Var, 70);
        }
        if (typedArray.hasValue(71)) {
            this.k = g90.b(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            c(y5Var.f(67));
            if (typedArray.hasValue(66)) {
                b(typedArray.getText(66));
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            l8.l("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.l) {
            this.l = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType q = m60.q(typedArray.getInt(69, -1));
            this.m = q;
            checkableImageButton.setScaleType(q);
        }
        p5Var.setVisibility(8);
        p5Var.setId(R.id.textinput_prefix_text);
        p5Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        p5Var.setAccessibilityLiveRegion(1);
        p5Var.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            p5Var.setTextColor(y5Var.e(62));
        }
        CharSequence text = typedArray.getText(60);
        this.h = TextUtils.isEmpty(text) ? null : text;
        p5Var.setText(text);
        f();
        addView(checkableImageButton);
        addView(p5Var);
        checkableImageButton.setOnFocusableChangedListener(new h(6, this));
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.i;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        return this.g.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.i;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            m60.c0(checkableImageButton, charSequence);
        }
    }

    public final void c(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.j;
            PorterDuff.Mode mode = this.k;
            TextInputLayout textInputLayout = this.f;
            m60.f(textInputLayout, checkableImageButton, colorStateList, mode);
            d(true);
            m60.Q(textInputLayout, checkableImageButton, this.j);
            return;
        }
        d(false);
        View.OnLongClickListener onLongClickListener = this.n;
        checkableImageButton.setOnClickListener(null);
        m60.X(checkableImageButton, onLongClickListener);
        this.n = null;
        checkableImageButton.setOnLongClickListener(null);
        m60.X(checkableImageButton, null);
        b(null);
    }

    public final void d(boolean z) {
        EditText editText;
        CheckableImageButton checkableImageButton = this.i;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            if (!z && checkableImageButton.hasFocus() && (editText = this.f.getEditText()) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            e();
            f();
        }
    }

    public final void e() {
        EditText editText = this.f.j;
        if (editText == null) {
            return;
        }
        this.g.setPaddingRelative(this.i.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void f() {
        int i = (this.h == null || this.o) ? 8 : 0;
        setVisibility((this.i.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.g.setVisibility(i);
        this.f.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        e();
    }
}
