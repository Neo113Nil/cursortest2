package com.google.android.material.chip;

import B0.b;
import B0.c;
import B0.d;
import B0.e;
import B0.f;
import F1.l;
import G0.g;
import G0.m;
import I.h;
import I.i;
import K.H;
import K.T;
import M0.k;
import M0.v;
import R0.a;
import a1.AbstractC0067d;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import l.C0275s;
import s0.AbstractC0363a;
import t0.C0370b;

/* loaded from: classes.dex */
public class Chip extends C0275s implements e, v, Checkable {

    /* renamed from: w, reason: collision with root package name */
    public static final Rect f2219w = new Rect();

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f2220x = {R.attr.state_selected};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2221y = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public f f2222e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f2223f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f2224g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2225j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2226k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2227l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2228m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2229n;

    /* renamed from: o, reason: collision with root package name */
    public int f2230o;

    /* renamed from: p, reason: collision with root package name */
    public int f2231p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2232q;

    /* renamed from: r, reason: collision with root package name */
    public final d f2233r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2234s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f2235t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f2236u;

    /* renamed from: v, reason: collision with root package name */
    public final b f2237v;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.luckycounter.drinkwater.R.attr.chipStyle, com.luckycounter.drinkwater.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.luckycounter.drinkwater.R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f2235t = new Rect();
        this.f2236u = new RectF();
        this.f2237v = new b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        f fVar = new f(context2, attributeSet);
        int[] iArr = AbstractC0363a.f4096c;
        TypedArray f2 = m.f(fVar.f136e0, attributeSet, iArr, com.luckycounter.drinkwater.R.attr.chipStyle, com.luckycounter.drinkwater.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        fVar.f111E0 = f2.hasValue(37);
        Context context3 = fVar.f136e0;
        ColorStateList z2 = l.z(context3, f2, 24);
        if (fVar.f153x != z2) {
            fVar.f153x = z2;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList z3 = l.z(context3, f2, 11);
        if (fVar.f155y != z3) {
            fVar.f155y = z3;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = f2.getDimension(19, RecyclerView.f1949A0);
        if (fVar.f157z != dimension) {
            fVar.f157z = dimension;
            fVar.invalidateSelf();
            fVar.u();
        }
        if (f2.hasValue(12)) {
            fVar.A(f2.getDimension(12, RecyclerView.f1949A0));
        }
        fVar.F(l.z(context3, f2, 22));
        fVar.G(f2.getDimension(23, RecyclerView.f1949A0));
        fVar.P(l.z(context3, f2, 36));
        String text = f2.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(fVar.f110E, text)) {
            fVar.f110E = text;
            fVar.f142k0.d = true;
            fVar.invalidateSelf();
            fVar.u();
        }
        J0.d dVar = (!f2.hasValue(0) || (resourceId3 = f2.getResourceId(0, 0)) == 0) ? null : new J0.d(context3, resourceId3);
        dVar.f606k = f2.getDimension(1, dVar.f606k);
        fVar.Q(dVar);
        int i = f2.getInt(3, 0);
        if (i == 1) {
            fVar.f106B0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            fVar.f106B0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            fVar.f106B0 = TextUtils.TruncateAt.END;
        }
        fVar.E(f2.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.E(f2.getBoolean(15, false));
        }
        fVar.B(l.C(context3, f2, 14));
        if (f2.hasValue(17)) {
            fVar.D(l.z(context3, f2, 17));
        }
        fVar.C(f2.getDimension(16, -1.0f));
        fVar.M(f2.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.M(f2.getBoolean(26, false));
        }
        fVar.H(l.C(context3, f2, 25));
        fVar.L(l.z(context3, f2, 30));
        fVar.J(f2.getDimension(28, RecyclerView.f1949A0));
        fVar.w(f2.getBoolean(6, false));
        fVar.z(f2.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.z(f2.getBoolean(8, false));
        }
        fVar.x(l.C(context3, f2, 7));
        if (f2.hasValue(9)) {
            fVar.y(l.z(context3, f2, 9));
        }
        fVar.f126U = (!f2.hasValue(39) || (resourceId2 = f2.getResourceId(39, 0)) == 0) ? null : C0370b.a(context3, resourceId2);
        fVar.f127V = (!f2.hasValue(33) || (resourceId = f2.getResourceId(33, 0)) == 0) ? null : C0370b.a(context3, resourceId);
        float dimension2 = f2.getDimension(21, RecyclerView.f1949A0);
        if (fVar.f128W != dimension2) {
            fVar.f128W = dimension2;
            fVar.invalidateSelf();
            fVar.u();
        }
        fVar.O(f2.getDimension(35, RecyclerView.f1949A0));
        fVar.N(f2.getDimension(34, RecyclerView.f1949A0));
        float dimension3 = f2.getDimension(41, RecyclerView.f1949A0);
        if (fVar.f131Z != dimension3) {
            fVar.f131Z = dimension3;
            fVar.invalidateSelf();
            fVar.u();
        }
        float dimension4 = f2.getDimension(40, RecyclerView.f1949A0);
        if (fVar.f132a0 != dimension4) {
            fVar.f132a0 = dimension4;
            fVar.invalidateSelf();
            fVar.u();
        }
        fVar.K(f2.getDimension(29, RecyclerView.f1949A0));
        fVar.I(f2.getDimension(27, RecyclerView.f1949A0));
        float dimension5 = f2.getDimension(13, RecyclerView.f1949A0);
        if (fVar.f135d0 != dimension5) {
            fVar.f135d0 = dimension5;
            fVar.invalidateSelf();
            fVar.u();
        }
        fVar.f109D0 = f2.getDimensionPixelSize(4, Integer.MAX_VALUE);
        f2.recycle();
        m.a(context2, attributeSet, com.luckycounter.drinkwater.R.attr.chipStyle, com.luckycounter.drinkwater.R.style.Widget_MaterialComponents_Chip_Action);
        m.b(context2, attributeSet, iArr, com.luckycounter.drinkwater.R.attr.chipStyle, com.luckycounter.drinkwater.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.luckycounter.drinkwater.R.attr.chipStyle, com.luckycounter.drinkwater.R.style.Widget_MaterialComponents_Chip_Action);
        this.f2229n = obtainStyledAttributes.getBoolean(32, false);
        this.f2231p = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        fVar.i(H.i(this));
        m.a(context2, attributeSet, com.luckycounter.drinkwater.R.attr.chipStyle, com.luckycounter.drinkwater.R.style.Widget_MaterialComponents_Chip_Action);
        m.b(context2, attributeSet, iArr, com.luckycounter.drinkwater.R.attr.chipStyle, com.luckycounter.drinkwater.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.luckycounter.drinkwater.R.attr.chipStyle, com.luckycounter.drinkwater.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f2233r = new d(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.f2225j);
        setText(fVar.f110E);
        setEllipsize(fVar.f106B0);
        h();
        if (!this.f2222e.C0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f2229n) {
            setMinHeight(this.f2231p);
        }
        this.f2230o = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: B0.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z4);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f2236u;
        rectF.setEmpty();
        if (c() && this.h != null) {
            f fVar = this.f2222e;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.T()) {
                float f2 = fVar.f135d0 + fVar.f134c0 + fVar.f120O + fVar.f133b0 + fVar.f132a0;
                if (D.b.a(fVar) == 0) {
                    float f3 = bounds.right;
                    rectF.right = f3;
                    rectF.left = f3 - f2;
                } else {
                    float f4 = bounds.left;
                    rectF.left = f4;
                    rectF.right = f4 + f2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f2235t;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private J0.d getTextAppearance() {
        f fVar = this.f2222e;
        if (fVar != null) {
            return fVar.f142k0.f511f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f2227l != z2) {
            this.f2227l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f2226k != z2) {
            this.f2226k = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.f2231p = i;
        if (!this.f2229n) {
            InsetDrawable insetDrawable = this.f2223f;
            if (insetDrawable == null) {
                int[] iArr = K0.a.f730a;
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f2223f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = K0.a.f730a;
                    f();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.f2222e.f157z));
        int max2 = Math.max(0, i - this.f2222e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f2223f;
            if (insetDrawable2 == null) {
                int[] iArr3 = K0.a.f730a;
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f2223f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = K0.a.f730a;
                    f();
                    return;
                }
                return;
            }
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.f2223f != null) {
            Rect rect = new Rect();
            this.f2223f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = K0.a.f730a;
                f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f2223f = new InsetDrawable((Drawable) this.f2222e, i2, i3, i2, i3);
        int[] iArr6 = K0.a.f730a;
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        f fVar = this.f2222e;
        if (fVar != null) {
            Object obj = fVar.f117L;
            if (obj != null) {
                if (obj instanceof D.d) {
                }
                if (obj == null) {
                    return true;
                }
            }
            obj = null;
            if (obj == null) {
            }
        }
        return false;
    }

    public final boolean d() {
        f fVar = this.f2222e;
        return fVar != null && fVar.f122Q;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f2234s) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.f2233r;
        AccessibilityManager accessibilityManager = dVar.h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                Chip chip = dVar.f100q;
                int i2 = (chip.c() && chip.getCloseIconTouchBounds().contains(x2, y2)) ? 1 : 0;
                int i3 = dVar.f1111m;
                if (i3 != i2) {
                    dVar.f1111m = i2;
                    dVar.q(i2, 128);
                    dVar.q(i3, 256);
                }
                if (i2 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i = dVar.f1111m) != Integer.MIN_VALUE) {
                if (i == Integer.MIN_VALUE) {
                    return true;
                }
                dVar.f1111m = Integer.MIN_VALUE;
                dVar.q(i, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f2234s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f2233r;
        dVar.getClass();
        boolean z2 = false;
        int i = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z3 = false;
                                while (i < repeatCount && dVar.m(i2, null)) {
                                    i++;
                                    z3 = true;
                                }
                                z2 = z3;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = dVar.f1110l;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = dVar.f100q;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.h;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f2234s) {
                                chip.f2233r.q(1, 1);
                            }
                        }
                    }
                    z2 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z2 = dVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z2 = dVar.m(1, null);
            }
        }
        if (!z2 || dVar.f1110l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // l.C0275s, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        f fVar = this.f2222e;
        boolean z2 = false;
        if (fVar != null && f.t(fVar.f117L)) {
            f fVar2 = this.f2222e;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.f2228m) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.f2227l) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f2226k) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f2228m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f2227l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f2226k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(fVar2.f156y0, iArr)) {
                fVar2.f156y0 = iArr;
                if (fVar2.T()) {
                    z2 = fVar2.v(fVar2.getState(), iArr);
                }
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public final void e() {
        f fVar;
        if (!c() || (fVar = this.f2222e) == null || !fVar.f116K || this.h == null) {
            T.l(this, null);
            this.f2234s = false;
        } else {
            T.l(this, this.f2233r);
            this.f2234s = true;
        }
    }

    public final void f() {
        this.f2224g = new RippleDrawable(K0.a.a(this.f2222e.f108D), getBackgroundDrawable(), null);
        this.f2222e.getClass();
        RippleDrawable rippleDrawable = this.f2224g;
        WeakHashMap weakHashMap = T.f633a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.f2222e) == null) {
            return;
        }
        int q2 = (int) (fVar.q() + fVar.f135d0 + fVar.f132a0);
        f fVar2 = this.f2222e;
        int p2 = (int) (fVar2.p() + fVar2.f128W + fVar2.f131Z);
        if (this.f2223f != null) {
            Rect rect = new Rect();
            this.f2223f.getPadding(rect);
            p2 += rect.left;
            q2 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = T.f633a;
        setPaddingRelative(p2, paddingTop, q2, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f2232q)) {
            return this.f2232q;
        }
        if (!d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f2223f;
        return insetDrawable == null ? this.f2222e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f2222e;
        if (fVar != null) {
            return fVar.f124S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f2222e;
        if (fVar != null) {
            return fVar.f125T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f2222e;
        if (fVar != null) {
            return fVar.f155y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f2222e;
        return fVar != null ? Math.max(RecyclerView.f1949A0, fVar.r()) : RecyclerView.f1949A0;
    }

    public Drawable getChipDrawable() {
        return this.f2222e;
    }

    public float getChipEndPadding() {
        f fVar = this.f2222e;
        return fVar != null ? fVar.f135d0 : RecyclerView.f1949A0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f2222e;
        if (fVar == null || (drawable = fVar.f112G) == 0) {
            return null;
        }
        boolean z2 = drawable instanceof D.d;
        Drawable drawable2 = drawable;
        if (z2) {
            drawable2 = null;
        }
        return drawable2;
    }

    public float getChipIconSize() {
        f fVar = this.f2222e;
        return fVar != null ? fVar.f114I : RecyclerView.f1949A0;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f2222e;
        if (fVar != null) {
            return fVar.f113H;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f2222e;
        return fVar != null ? fVar.f157z : RecyclerView.f1949A0;
    }

    public float getChipStartPadding() {
        f fVar = this.f2222e;
        return fVar != null ? fVar.f128W : RecyclerView.f1949A0;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f2222e;
        if (fVar != null) {
            return fVar.f105B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f2222e;
        return fVar != null ? fVar.f107C : RecyclerView.f1949A0;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f2222e;
        if (fVar == null || (drawable = fVar.f117L) == 0) {
            return null;
        }
        boolean z2 = drawable instanceof D.d;
        Drawable drawable2 = drawable;
        if (z2) {
            drawable2 = null;
        }
        return drawable2;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f2222e;
        if (fVar != null) {
            return fVar.f121P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f2222e;
        return fVar != null ? fVar.f134c0 : RecyclerView.f1949A0;
    }

    public float getCloseIconSize() {
        f fVar = this.f2222e;
        return fVar != null ? fVar.f120O : RecyclerView.f1949A0;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f2222e;
        return fVar != null ? fVar.f133b0 : RecyclerView.f1949A0;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f2222e;
        if (fVar != null) {
            return fVar.f119N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f2222e;
        if (fVar != null) {
            return fVar.f106B0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f2234s) {
            d dVar = this.f2233r;
            if (dVar.f1110l == 1 || dVar.f1109k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0370b getHideMotionSpec() {
        f fVar = this.f2222e;
        if (fVar != null) {
            return fVar.f127V;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f2222e;
        return fVar != null ? fVar.f130Y : RecyclerView.f1949A0;
    }

    public float getIconStartPadding() {
        f fVar = this.f2222e;
        return fVar != null ? fVar.f129X : RecyclerView.f1949A0;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f2222e;
        if (fVar != null) {
            return fVar.f108D;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f2222e.f828a.f814a;
    }

    public C0370b getShowMotionSpec() {
        f fVar = this.f2222e;
        if (fVar != null) {
            return fVar.f126U;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f2222e;
        return fVar != null ? fVar.f132a0 : RecyclerView.f1949A0;
    }

    public float getTextStartPadding() {
        f fVar = this.f2222e;
        return fVar != null ? fVar.f131Z : RecyclerView.f1949A0;
    }

    public final void h() {
        TextPaint paint = getPaint();
        f fVar = this.f2222e;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        J0.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f2237v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        F1.d.m0(this, this.f2222e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2220x);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f2221y);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.f2234s) {
            d dVar = this.f2233r;
            int i2 = dVar.f1110l;
            if (i2 != Integer.MIN_VALUE) {
                dVar.j(i2);
            }
            if (z2) {
                dVar.m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f2230o != i) {
            this.f2230o = i;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f2226k) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z2 = true;
                    }
                }
                z2 = false;
            } else if (this.f2226k) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.h;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f2234s) {
                    this.f2233r.q(1, 1);
                }
                z2 = true;
                setCloseIconPressed(false);
            }
            z2 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z2 = true;
            }
            z2 = false;
        }
        return z2 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f2232q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2224g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // l.C0275s, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2224g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // l.C0275s, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.w(z2);
        }
    }

    public void setCheckableResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.w(fVar.f136e0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        f fVar = this.f2222e;
        if (fVar == null) {
            this.f2225j = z2;
        } else if (fVar.f122Q) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.x(AbstractC0067d.k(fVar.f136e0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.y(F1.d.D(fVar.f136e0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.z(fVar.f136e0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f2222e;
        if (fVar == null || fVar.f155y == colorStateList) {
            return;
        }
        fVar.f155y = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList D2;
        f fVar = this.f2222e;
        if (fVar == null || fVar.f155y == (D2 = F1.d.D(fVar.f136e0, i))) {
            return;
        }
        fVar.f155y = D2;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.A(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.A(fVar.f136e0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f2222e;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f104A0 = new WeakReference(null);
            }
            this.f2222e = fVar;
            fVar.C0 = false;
            fVar.f104A0 = new WeakReference(this);
            b(this.f2231p);
        }
    }

    public void setChipEndPadding(float f2) {
        f fVar = this.f2222e;
        if (fVar == null || fVar.f135d0 == f2) {
            return;
        }
        fVar.f135d0 = f2;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setChipEndPaddingResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            float dimension = fVar.f136e0.getResources().getDimension(i);
            if (fVar.f135d0 != dimension) {
                fVar.f135d0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.B(AbstractC0067d.k(fVar.f136e0, i));
        }
    }

    public void setChipIconSize(float f2) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.C(f2);
        }
    }

    public void setChipIconSizeResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.C(fVar.f136e0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.D(F1.d.D(fVar.f136e0, i));
        }
    }

    public void setChipIconVisible(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.E(fVar.f136e0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f2) {
        f fVar = this.f2222e;
        if (fVar == null || fVar.f157z == f2) {
            return;
        }
        fVar.f157z = f2;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setChipMinHeightResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            float dimension = fVar.f136e0.getResources().getDimension(i);
            if (fVar.f157z != dimension) {
                fVar.f157z = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        f fVar = this.f2222e;
        if (fVar == null || fVar.f128W == f2) {
            return;
        }
        fVar.f128W = f2;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setChipStartPaddingResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            float dimension = fVar.f136e0.getResources().getDimension(i);
            if (fVar.f128W != dimension) {
                fVar.f128W = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.F(F1.d.D(fVar.f136e0, i));
        }
    }

    public void setChipStrokeWidth(float f2) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.G(f2);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.G(fVar.f136e0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.H(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.f2222e;
        if (fVar == null || fVar.f121P == charSequence) {
            return;
        }
        String str = I.b.f574b;
        I.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? I.b.f576e : I.b.d;
        bVar.getClass();
        h hVar = i.f584a;
        fVar.f121P = bVar.c(charSequence);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f2) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.I(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.I(fVar.f136e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.H(AbstractC0067d.k(fVar.f136e0, i));
        }
        e();
    }

    public void setCloseIconSize(float f2) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.J(f2);
        }
    }

    public void setCloseIconSizeResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.J(fVar.f136e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.K(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.K(fVar.f136e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.L(F1.d.D(fVar.f136e0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // l.C0275s, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // l.C0275s, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.i(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f2222e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.f106B0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f2229n = z2;
        b(this.f2231p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C0370b c0370b) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.f127V = c0370b;
        }
    }

    public void setHideMotionSpecResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.f127V = C0370b.a(fVar.f136e0, i);
        }
    }

    public void setIconEndPadding(float f2) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.N(f2);
        }
    }

    public void setIconEndPaddingResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.N(fVar.f136e0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f2) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.O(f2);
        }
    }

    public void setIconStartPaddingResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.O(fVar.f136e0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(g gVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f2222e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.f109D0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.P(colorStateList);
        }
        this.f2222e.getClass();
        f();
    }

    public void setRippleColorResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.P(F1.d.D(fVar.f136e0, i));
            this.f2222e.getClass();
            f();
        }
    }

    @Override // M0.v
    public void setShapeAppearanceModel(k kVar) {
        this.f2222e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C0370b c0370b) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.f126U = c0370b;
        }
    }

    public void setShowMotionSpecResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.f126U = C0370b.a(fVar.f136e0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.f2222e;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.C0 ? null : charSequence, bufferType);
        f fVar2 = this.f2222e;
        if (fVar2 == null || TextUtils.equals(fVar2.f110E, charSequence)) {
            return;
        }
        fVar2.f110E = charSequence;
        fVar2.f142k0.d = true;
        fVar2.invalidateSelf();
        fVar2.u();
    }

    public void setTextAppearance(J0.d dVar) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.Q(dVar);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f2) {
        f fVar = this.f2222e;
        if (fVar == null || fVar.f132a0 == f2) {
            return;
        }
        fVar.f132a0 = f2;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setTextEndPaddingResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            float dimension = fVar.f136e0.getResources().getDimension(i);
            if (fVar.f132a0 != dimension) {
                fVar.f132a0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        super.setTextSize(i, f2);
        f fVar = this.f2222e;
        if (fVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics());
            G0.k kVar = fVar.f142k0;
            J0.d dVar = kVar.f511f;
            if (dVar != null) {
                dVar.f606k = applyDimension;
                kVar.f507a.setTextSize(applyDimension);
                fVar.u();
                fVar.invalidateSelf();
            }
        }
        h();
    }

    public void setTextStartPadding(float f2) {
        f fVar = this.f2222e;
        if (fVar == null || fVar.f131Z == f2) {
            return;
        }
        fVar.f131Z = f2;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setTextStartPaddingResource(int i) {
        f fVar = this.f2222e;
        if (fVar != null) {
            float dimension = fVar.f136e0.getResources().getDimension(i);
            if (fVar.f131Z != dimension) {
                fVar.f131Z = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.M(z2);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z2) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.z(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.E(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.Q(new J0.d(fVar.f136e0, i));
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        f fVar = this.f2222e;
        if (fVar != null) {
            fVar.Q(new J0.d(fVar.f136e0, i));
        }
        h();
    }
}
