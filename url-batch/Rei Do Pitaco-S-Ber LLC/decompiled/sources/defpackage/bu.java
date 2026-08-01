package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.BaselineLayout;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class bu extends FrameLayout implements eu {
    public static final int[] o0 = {R.attr.state_checked};
    public static final tg p0 = new tg(29);
    public static final au q0 = new au(29);
    public final TextView A;
    public final TextView B;
    public final BaselineLayout C;
    public final TextView D;
    public final TextView E;
    public BaselineLayout F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public ColorStateList L;
    public boolean M;
    public vs N;
    public ColorStateList O;
    public Drawable P;
    public Drawable Q;
    public ValueAnimator R;
    public tg S;
    public float T;
    public boolean U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public boolean c0;
    public int d0;
    public int e0;
    public boolean f;
    public z6 f0;
    public ColorStateList g;
    public int g0;
    public Drawable h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public boolean j0;
    public int k;
    public boolean k0;
    public int l;
    public boolean l0;
    public float m;
    public boolean m0;
    public float n;
    public Rect n0;
    public float o;
    public float p;
    public float q;
    public float r;
    public int s;
    public boolean t;
    public final LinearLayout u;
    public final LinearLayout v;
    public final View w;
    public final FrameLayout x;
    public final ImageView y;
    public final BaselineLayout z;

    public bu(Context context) {
        super(context);
        this.f = false;
        this.G = -1;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.M = false;
        this.S = p0;
        this.T = 0.0f;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.a0 = -2;
        this.b0 = 0;
        this.c0 = false;
        this.d0 = 0;
        this.e0 = 0;
        this.h0 = 0;
        this.i0 = 49;
        this.j0 = false;
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
        this.n0 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.u = (LinearLayout) findViewById(com.ionia.reidopitaco.libya.R.id.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.ionia.reidopitaco.libya.R.id.navigation_bar_item_inner_content_container);
        this.v = linearLayout;
        this.w = findViewById(com.ionia.reidopitaco.libya.R.id.navigation_bar_item_active_indicator_view);
        this.x = (FrameLayout) findViewById(com.ionia.reidopitaco.libya.R.id.navigation_bar_item_icon_container);
        this.y = (ImageView) findViewById(com.ionia.reidopitaco.libya.R.id.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(com.ionia.reidopitaco.libya.R.id.navigation_bar_item_labels_group);
        this.z = baselineLayout;
        TextView textView = (TextView) findViewById(com.ionia.reidopitaco.libya.R.id.navigation_bar_item_small_label_view);
        this.A = textView;
        TextView textView2 = (TextView) findViewById(com.ionia.reidopitaco.libya.R.id.navigation_bar_item_large_label_view);
        this.B = textView2;
        float dimension = getResources().getDimension(com.ionia.reidopitaco.libya.R.dimen.default_navigation_text_size);
        float dimension2 = getResources().getDimension(com.ionia.reidopitaco.libya.R.dimen.default_navigation_active_text_size);
        BaselineLayout baselineLayout2 = new BaselineLayout(getContext(), null, 0);
        baselineLayout2.f = -1;
        this.C = baselineLayout2;
        baselineLayout2.setVisibility(8);
        this.C.setDuplicateParentStateEnabled(true);
        this.C.setMeasurePaddingFromBaseline(this.l0);
        TextView textView3 = new TextView(getContext());
        this.D = textView3;
        textView3.setMaxLines(1);
        TextView textView4 = this.D;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.D.setDuplicateParentStateEnabled(true);
        this.D.setIncludeFontPadding(false);
        this.D.setGravity(16);
        this.D.setTextSize(dimension);
        TextView textView5 = new TextView(getContext());
        this.E = textView5;
        textView5.setMaxLines(1);
        this.E.setEllipsize(truncateAt);
        this.E.setDuplicateParentStateEnabled(true);
        this.E.setVisibility(4);
        this.E.setIncludeFontPadding(false);
        this.E.setGravity(16);
        this.E.setTextSize(dimension2);
        this.C.addView(this.D);
        this.C.addView(this.E);
        this.F = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.i = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.j = baselineLayout.getPaddingBottom();
        this.k = 0;
        this.l = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.D.setImportantForAccessibility(2);
        this.E.setImportantForAccessibility(2);
        setFocusable(true);
        a();
        this.b0 = getResources().getDimensionPixelSize(com.ionia.reidopitaco.libya.R.dimen.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new b9(1, (w7) this));
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof bu) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconWidth() {
        z6 z6Var = this.f0;
        int minimumWidth = z6Var == null ? 0 : z6Var.getMinimumWidth() - this.f0.j.b.B.intValue();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.x.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.y.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void i(View view, int i, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    public final void a() {
        float textSize = this.A.getTextSize();
        float textSize2 = this.B.getTextSize();
        this.m = textSize - textSize2;
        this.n = (textSize2 * 1.0f) / textSize;
        this.o = (textSize * 1.0f) / textSize2;
        float textSize3 = this.D.getTextSize();
        float textSize4 = this.E.getTextSize();
        this.p = textSize3 - textSize4;
        this.q = (textSize4 * 1.0f) / textSize3;
        this.r = (textSize3 * 1.0f) / textSize4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        Drawable drawable = this.h;
        boolean z = true;
        if (this.g != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.U && activeIndicatorDrawable != null) {
                RippleDrawable rippleDrawable = new RippleDrawable(d00.b(this.g), null, activeIndicatorDrawable);
                FocusRingDrawable.e(getContext(), rippleDrawable, activeIndicatorDrawable instanceof ls ? (ls) activeIndicatorDrawable : null);
                r3 = rippleDrawable;
                z = false;
            } else if (drawable == null) {
                ColorStateList colorStateList = this.g;
                int[] iArr = d00.d;
                int a = d00.a(colorStateList, d00.c);
                int[] iArr2 = d00.b;
                drawable = new RippleDrawable(new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{a, d00.a(colorStateList, iArr2), d00.a(colorStateList, d00.a)}), null, null);
                Context context = getContext();
                ColorDrawable colorDrawable = FocusRingDrawable.u;
                if (m60.S(context.getTheme(), com.ionia.reidopitaco.libya.R.attr.focusRingsEnabled, false)) {
                    drawable = new FocusRingDrawable(context, drawable);
                }
            }
        }
        FrameLayout frameLayout = this.x;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setForeground(r3);
        setBackground(drawable);
        setDefaultFocusHighlightEnabled(z);
    }

    @Override // defpackage.kt
    public final void c(vs vsVar) {
        this.N = vsVar;
        setCheckable(vsVar.isCheckable());
        setChecked(vsVar.isChecked());
        setEnabled(vsVar.isEnabled());
        setIcon(vsVar.getIcon());
        setTitle(vsVar.e);
        setId(vsVar.a);
        if (!TextUtils.isEmpty(vsVar.q)) {
            setContentDescription(vsVar.q);
        }
        s50.a(this, !TextUtils.isEmpty(vsVar.r) ? vsVar.r : vsVar.e);
        m();
        this.f = true;
    }

    public final void d(float f, float f2) {
        tg tgVar = this.S;
        tgVar.getClass();
        float a = y2.a(0.4f, 1.0f, f);
        View view = this.w;
        view.setScaleX(a);
        view.setScaleY(tgVar.i(f));
        view.setAlpha(y2.b(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        this.T = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.U) {
            this.x.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        int i = this.y.getLayoutParams().width > 0 ? this.l : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.C.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i : 0;
        }
    }

    public final void f(TextView textView, TextView textView2, float f, float f2) {
        i(this.u, this.g0 == 0 ? (int) (this.i + f2) : 0, 0, this.i0);
        int i = this.g0;
        i(this.v, i == 0 ? 0 : this.n0.top, i == 0 ? 0 : this.n0.bottom, i == 0 ? 17 : 8388627);
        int i2 = this.j;
        BaselineLayout baselineLayout = this.z;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), i2);
        this.F.setVisibility(0);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        textView.setVisibility(0);
        textView2.setScaleX(f);
        textView2.setScaleY(f);
        textView2.setVisibility(4);
    }

    public final void g() {
        int i = this.i;
        i(this.u, i, i, this.g0 == 0 ? 17 : this.i0);
        i(this.v, 0, 0, 17);
        BaselineLayout baselineLayout = this.z;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), 0);
        this.F.setVisibility(8);
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.w.getBackground();
    }

    public z6 getBadge() {
        return this.f0;
    }

    public BaselineLayout getExpandedLabelGroup() {
        return this.C;
    }

    public int getItemBackgroundResId() {
        return com.ionia.reidopitaco.libya.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // defpackage.kt
    public vs getItemData() {
        return this.N;
    }

    public int getItemDefaultMarginResId() {
        return com.ionia.reidopitaco.libya.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.G;
    }

    public BaselineLayout getLabelGroup() {
        return this.z;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        LinearLayout linearLayout = this.u;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        return linearLayout.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.g0 == 1) {
            LinearLayout linearLayout = this.v;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            return linearLayout.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        BaselineLayout baselineLayout = this.z;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), baselineLayout.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(TextView textView, int i) {
        int i2;
        if (this.m0) {
            textView.setTextAppearance(i);
            return;
        }
        textView.setTextAppearance(i);
        Context context = textView.getContext();
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, kx.v);
            TypedValue typedValue = new TypedValue();
            boolean value = obtainStyledAttributes.getValue(0, typedValue);
            obtainStyledAttributes.recycle();
            if (value) {
                int complexUnit = typedValue.getComplexUnit();
                int i3 = typedValue.data;
                i2 = complexUnit == 2 ? Math.round(TypedValue.complexToFloat(i3) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(i3, context.getResources().getDisplayMetrics());
                if (i2 == 0) {
                    textView.setTextSize(0, i2);
                    return;
                }
                return;
            }
        }
        i2 = 0;
        if (i2 == 0) {
        }
    }

    public final void j(View view) {
        if (this.f0 != null) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                z6 z6Var = this.f0;
                if (z6Var != null) {
                    if (z6Var.d() != null) {
                        z6Var.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(z6Var);
                    }
                }
            }
            this.f0 = null;
        }
    }

    public final void k(int i) {
        if (i > 0 || getVisibility() != 0) {
            int min = Math.min(this.V, i - (this.d0 * 2));
            int i2 = this.W;
            if (this.g0 == 1) {
                int i3 = i - (this.e0 * 2);
                int i4 = this.a0;
                if (i4 != -1) {
                    i3 = i4 == -2 ? this.u.getMeasuredWidth() : Math.min(i4, i3);
                }
                min = i3;
                i2 = Math.max(this.b0, this.v.getMeasuredHeight());
            }
            View view = this.w;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (this.c0 && this.s == 2) {
                i2 = min;
            }
            layoutParams.height = i2;
            layoutParams.width = Math.max(0, min);
            view.setLayoutParams(layoutParams);
        }
    }

    public final void l(TextView textView, int i) {
        if (textView == null) {
            return;
        }
        h(textView, i);
        a();
        textView.setMinimumHeight(oo.u(textView.getContext(), i));
        ColorStateList colorStateList = this.L;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        TextView textView2 = this.B;
        textView2.setTypeface(textView2.getTypeface(), this.M ? 1 : 0);
        TextView textView3 = this.E;
        textView3.setTypeface(textView3.getTypeface(), this.M ? 1 : 0);
    }

    public final void m() {
        vs vsVar = this.N;
        if (vsVar != null) {
            setVisibility((!vsVar.isVisible() || (!this.j0 && this.k0)) ? 8 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        vs vsVar = this.N;
        if (vsVar != null && vsVar.isCheckable() && this.N.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, o0);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z6 z6Var = this.f0;
        if (z6Var != null && z6Var.isVisible()) {
            vs vsVar = this.N;
            CharSequence charSequence = vsVar.e;
            if (!TextUtils.isEmpty(vsVar.q)) {
                charSequence = this.N.q;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) charSequence);
            sb.append(", ");
            z6 z6Var2 = this.f0;
            b7 b7Var = z6Var2.j;
            Object obj = null;
            if (z6Var2.isVisible()) {
                a7 a7Var = b7Var.b;
                if (a7Var.o != null) {
                    obj = a7Var.t;
                    if (obj == null) {
                        obj = z6Var2.j.b.o;
                    }
                } else if (!z6Var2.g()) {
                    obj = a7Var.u;
                } else if (a7Var.v != 0 && (context = (Context) z6Var2.f.get()) != null) {
                    if (z6Var2.m != -2) {
                        int e = z6Var2.e();
                        int i = z6Var2.m;
                        if (e > i) {
                            obj = context.getString(a7Var.w, Integer.valueOf(i));
                        }
                    }
                    obj = context.getResources().getQuantityString(a7Var.v, z6Var2.e(), Integer.valueOf(z6Var2.e()));
                }
            }
            sb.append(obj);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) j0.D(isSelected(), 0, 1, getItemVisiblePosition(), 1).g);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) d0.e.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.ionia.reidopitaco.libya.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new w8(i, 3, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.w.setBackground(drawable);
        b();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.U = z;
        b();
        this.w.setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i) {
        this.b0 = i;
        k(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i) {
        this.e0 = i;
        if (this.g0 == 1) {
            setPadding(i, 0, i, 0);
        }
        k(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(Rect rect) {
        this.n0 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i) {
        this.a0 = i;
        k(getWidth());
    }

    public void setActiveIndicatorHeight(int i) {
        this.W = i;
        k(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.k != i) {
            this.k = i;
            ((LinearLayout.LayoutParams) this.z.getLayoutParams()).topMargin = i;
            BaselineLayout baselineLayout = this.C;
            if (baselineLayout.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
                if (getLayoutDirection() == 1) {
                    i = 0;
                }
                layoutParams.leftMargin = i;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.d0 = i;
        k(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.c0 = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.V = i;
        k(getWidth());
    }

    public void setBadge(z6 z6Var) {
        z6 z6Var2 = this.f0;
        if (z6Var2 == z6Var) {
            return;
        }
        ImageView imageView = this.y;
        if (z6Var2 != null && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            j(imageView);
        }
        this.f0 = z6Var;
        int i = this.h0;
        b7 b7Var = z6Var.j;
        if (b7Var.l != i) {
            b7Var.l = i;
            z6Var.j();
        }
        if (imageView == null || this.f0 == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        z6 z6Var3 = this.f0;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        z6Var3.setBounds(rect);
        z6Var3.i(imageView, null);
        if (z6Var3.d() != null) {
            z6Var3.d().setForeground(z6Var3);
        } else {
            imageView.getOverlay().add(z6Var3);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.B;
        setLabelPivots(textView);
        TextView textView2 = this.A;
        setLabelPivots(textView2);
        TextView textView3 = this.E;
        setLabelPivots(textView3);
        TextView textView4 = this.D;
        setLabelPivots(textView4);
        float f = z ? 1.0f : 0.0f;
        if (this.U && this.f && isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.R;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.R = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T, f);
            this.R = ofFloat;
            ofFloat.addUpdateListener(new zt(this, f));
            this.R.setInterpolator(m60.U(getContext(), com.ionia.reidopitaco.libya.R.attr.motionEasingEmphasizedInterpolator, y2.b));
            this.R.setDuration(m60.T(getContext(), com.ionia.reidopitaco.libya.R.attr.motionDurationLong2, getResources().getInteger(com.ionia.reidopitaco.libya.R.integer.material_motion_duration_long_1)));
            this.R.start();
        } else {
            d(f, f);
        }
        float f2 = this.m;
        float f3 = this.n;
        float f4 = this.o;
        if (this.g0 == 1) {
            f2 = this.p;
            f3 = this.q;
            f4 = this.r;
            textView = textView3;
            textView2 = textView4;
        }
        int i = this.s;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        g();
                    }
                } else if (z) {
                    f(textView, textView2, f3, f2);
                } else {
                    f(textView2, textView, f4, 0.0f);
                }
            } else if (z) {
                f(textView, textView2, f3, 0.0f);
            } else {
                g();
            }
        } else if (this.t) {
            if (z) {
                f(textView, textView2, f3, 0.0f);
            } else {
                g();
            }
        } else if (z) {
            f(textView, textView2, f3, f2);
        } else {
            f(textView2, textView, f4, 0.0f);
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A.setEnabled(z);
        this.B.setEnabled(z);
        this.D.setEnabled(z);
        this.E.setEnabled(z);
        this.y.setEnabled(z);
    }

    @Override // defpackage.eu
    public void setExpanded(boolean z) {
        this.j0 = z;
        m();
    }

    public void setHorizontalTextAppearanceActive(int i) {
        this.J = i;
        if (i == 0) {
            i = this.H;
        }
        l(this.E, i);
    }

    public void setHorizontalTextAppearanceInactive(int i) {
        this.K = i;
        if (i == 0) {
            i = this.I;
        }
        TextView textView = this.D;
        if (textView == null) {
            return;
        }
        h(textView, i);
        a();
        textView.setMinimumHeight(oo.u(textView.getContext(), i));
        ColorStateList colorStateList = this.L;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.P) {
            return;
        }
        this.P = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.Q = drawable;
            ColorStateList colorStateList = this.O;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.y.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        if (this.l != i) {
            this.l = i;
            e();
            requestLayout();
        }
    }

    public void setIconSize(int i) {
        ImageView imageView = this.y;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
        e();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.O = colorStateList;
        if (this.N == null || (drawable = this.Q) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.Q.invalidateSelf();
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.h = drawable;
        b();
    }

    public void setItemGravity(int i) {
        this.i0 = i;
        requestLayout();
    }

    public void setItemIconGravity(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.g0 != i) {
            this.g0 = i;
            this.h0 = 0;
            BaselineLayout baselineLayout = this.z;
            this.F = baselineLayout;
            BaselineLayout baselineLayout2 = this.C;
            LinearLayout linearLayout = this.v;
            int i8 = 8;
            if (i == 1) {
                if (baselineLayout2.getParent() == null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    linearLayout.addView(baselineLayout2, layoutParams);
                    e();
                }
                Rect rect = this.n0;
                int i9 = rect.left;
                int i10 = rect.right;
                int i11 = rect.top;
                i2 = rect.bottom;
                this.h0 = 1;
                int i12 = this.e0;
                this.F = baselineLayout2;
                i6 = i11;
                i5 = i10;
                i4 = i9;
                i3 = i12;
                i7 = 0;
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 8;
                i8 = 0;
            }
            baselineLayout.setVisibility(i8);
            baselineLayout2.setVisibility(i7);
            ((FrameLayout.LayoutParams) this.u.getLayoutParams()).gravity = this.i0;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams2.leftMargin = i4;
            layoutParams2.rightMargin = i5;
            layoutParams2.topMargin = i6;
            layoutParams2.bottomMargin = i2;
            setPadding(i3, 0, i3, 0);
            k(getWidth());
            b();
        }
    }

    public void setItemPaddingBottom(int i) {
        if (this.j != i) {
            this.j = i;
            vs vsVar = this.N;
            if (vsVar != null) {
                setChecked(vsVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.i != i) {
            this.i = i;
            vs vsVar = this.N;
            if (vsVar != null) {
                setChecked(vsVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i) {
        this.G = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.g = colorStateList;
        b();
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.m0 = z;
        setTextAppearanceActive(this.H);
        setTextAppearanceInactive(this.I);
        setHorizontalTextAppearanceActive(this.J);
        setHorizontalTextAppearanceInactive(this.K);
    }

    public void setLabelMaxLines(int i) {
        TextView textView = this.A;
        textView.setMaxLines(i);
        TextView textView2 = this.B;
        textView2.setMaxLines(i);
        this.D.setMaxLines(i);
        this.E.setMaxLines(i);
        if (Build.VERSION.SDK_INT > 34) {
            textView.setGravity(17);
            textView2.setGravity(17);
        } else if (i > 1) {
            textView.setEllipsize(null);
            textView2.setEllipsize(null);
            textView.setGravity(17);
            textView2.setGravity(17);
        } else {
            textView.setGravity(16);
            textView2.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.s != i) {
            this.s = i;
            if (this.c0 && i == 2) {
                this.S = q0;
            } else {
                this.S = p0;
            }
            k(getWidth());
            vs vsVar = this.N;
            if (vsVar != null) {
                setChecked(vsVar.isChecked());
            }
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z) {
        this.l0 = z;
        this.z.setMeasurePaddingFromBaseline(z);
        this.A.setIncludeFontPadding(z);
        this.B.setIncludeFontPadding(z);
        this.C.setMeasurePaddingFromBaseline(z);
        this.D.setIncludeFontPadding(z);
        this.E.setIncludeFontPadding(z);
        requestLayout();
    }

    @Override // defpackage.eu
    public void setOnlyShowWhenExpanded(boolean z) {
        this.k0 = z;
        m();
    }

    public void setShifting(boolean z) {
        if (this.t != z) {
            this.t = z;
            vs vsVar = this.N;
            if (vsVar != null) {
                setChecked(vsVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        this.H = i;
        l(this.B, i);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        this.M = z;
        setTextAppearanceActive(this.H);
        setHorizontalTextAppearanceActive(this.J);
        TextView textView = this.B;
        textView.setTypeface(textView.getTypeface(), this.M ? 1 : 0);
        TextView textView2 = this.E;
        textView2.setTypeface(textView2.getTypeface(), this.M ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        this.I = i;
        TextView textView = this.A;
        if (textView == null) {
            return;
        }
        h(textView, i);
        a();
        textView.setMinimumHeight(oo.u(textView.getContext(), i));
        ColorStateList colorStateList = this.L;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.L = colorStateList;
        if (colorStateList != null) {
            this.A.setTextColor(colorStateList);
            this.B.setTextColor(colorStateList);
            this.D.setTextColor(colorStateList);
            this.E.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.A.setText(charSequence);
        this.B.setText(charSequence);
        this.D.setText(charSequence);
        this.E.setText(charSequence);
        vs vsVar = this.N;
        if (vsVar == null || TextUtils.isEmpty(vsVar.q)) {
            setContentDescription(charSequence);
        }
        vs vsVar2 = this.N;
        if (vsVar2 != null && !TextUtils.isEmpty(vsVar2.r)) {
            charSequence = this.N.r;
        }
        s50.a(this, charSequence);
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }
}
