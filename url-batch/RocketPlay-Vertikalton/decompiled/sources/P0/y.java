package P0;

import K.C0019l;
import K.T;
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
import com.luckycounter.drinkwater.R;
import java.util.WeakHashMap;
import l.C0244c0;

/* loaded from: classes.dex */
public final class y extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f1026a;

    /* renamed from: b, reason: collision with root package name */
    public final C0244c0 f1027b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f1028c;
    public final CheckableImageButton d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f1029e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f1030f;

    /* renamed from: g, reason: collision with root package name */
    public int f1031g;
    public ImageView.ScaleType h;
    public View.OnLongClickListener i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1032j;

    public y(TextInputLayout textInputLayout, C0019l c0019l) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f1026a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.d = checkableImageButton;
        C0244c0 c0244c0 = new C0244c0(getContext(), null);
        this.f1027b = c0244c0;
        if (F1.l.Q(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        F1.d.j0(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        F1.d.j0(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c0019l.f684b;
        if (typedArray.hasValue(69)) {
            this.f1029e = F1.l.y(getContext(), c0019l, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f1030f = G0.m.g(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(c0019l.c(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f1031g) {
            this.f1031g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType r2 = F1.d.r(typedArray.getInt(68, -1));
            this.h = r2;
            checkableImageButton.setScaleType(r2);
        }
        c0244c0.setVisibility(8);
        c0244c0.setId(R.id.textinput_prefix_text);
        c0244c0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = T.f633a;
        c0244c0.setAccessibilityLiveRegion(1);
        c0244c0.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c0244c0.setTextColor(c0019l.b(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f1028c = TextUtils.isEmpty(text2) ? null : text2;
        c0244c0.setText(text2);
        e();
        addView(checkableImageButton);
        addView(c0244c0);
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.d;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = T.f633a;
        return this.f1027b.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f1029e;
            PorterDuff.Mode mode = this.f1030f;
            TextInputLayout textInputLayout = this.f1026a;
            F1.d.l(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            F1.d.Z(textInputLayout, checkableImageButton, this.f1029e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        F1.d.j0(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        F1.d.j0(checkableImageButton, null);
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
        EditText editText = this.f1026a.d;
        if (editText == null) {
            return;
        }
        if (this.d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = T.f633a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = T.f633a;
        this.f1027b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.f1028c == null || this.f1032j) ? 8 : 0;
        setVisibility((this.d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f1027b.setVisibility(i);
        this.f1026a.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
