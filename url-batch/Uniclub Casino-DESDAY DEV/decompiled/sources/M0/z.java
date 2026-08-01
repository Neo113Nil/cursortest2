package M0;

import K.C0011l;
import K.S;
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
import com.fortuneodd.shadegrid.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import l.C0219d0;

/* loaded from: classes.dex */
public final class z extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f608a;

    /* renamed from: b, reason: collision with root package name */
    public final C0219d0 f609b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f610c;
    public final CheckableImageButton d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f611e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f612f;

    /* renamed from: g, reason: collision with root package name */
    public int f613g;
    public ImageView.ScaleType h;
    public View.OnLongClickListener i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f614j;

    public z(TextInputLayout textInputLayout, C0011l c0011l) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f608a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.d = checkableImageButton;
        C0219d0 c0219d0 = new C0219d0(getContext(), null);
        this.f609b = c0219d0;
        if (q1.d.C(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        q1.d.T(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        q1.d.T(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c0011l.f414c;
        if (typedArray.hasValue(69)) {
            this.f611e = q1.d.q(getContext(), c0011l, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f612f = D0.n.g(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(c0011l.h(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f613g) {
            this.f613g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType g2 = q1.d.g(typedArray.getInt(68, -1));
            this.h = g2;
            checkableImageButton.setScaleType(g2);
        }
        c0219d0.setVisibility(8);
        c0219d0.setId(R.id.textinput_prefix_text);
        c0219d0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = S.f360a;
        c0219d0.setAccessibilityLiveRegion(1);
        c0219d0.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c0219d0.setTextColor(c0011l.g(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f610c = TextUtils.isEmpty(text2) ? null : text2;
        c0219d0.setText(text2);
        e();
        addView(checkableImageButton);
        addView(c0219d0);
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.d;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = S.f360a;
        return this.f609b.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f611e;
            PorterDuff.Mode mode = this.f612f;
            TextInputLayout textInputLayout = this.f608a;
            q1.d.c(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            q1.d.L(textInputLayout, checkableImageButton, this.f611e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        q1.d.T(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        q1.d.T(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z2) {
        CheckableImageButton checkableImageButton = this.d;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            checkableImageButton.setVisibility(z2 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f608a.d;
        if (editText == null) {
            return;
        }
        if (this.d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = S.f360a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = S.f360a;
        this.f609b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.f610c == null || this.f614j) ? 8 : 0;
        setVisibility((this.d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f609b.setVisibility(i);
        this.f608a.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
