package com.google.android.material.chip;

import D0.j;
import D0.n;
import I.g;
import I.h;
import J0.k;
import J0.v;
import K.G;
import K.S;
import O0.a;
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
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import l.C0248s;
import p0.AbstractC0279a;
import q0.C0289b;
import q1.l;
import y0.b;
import y0.c;
import y0.d;
import y0.e;

/* loaded from: classes.dex */
public class Chip extends C0248s implements d, v, Checkable {

    /* renamed from: w, reason: collision with root package name */
    public static final Rect f1625w = new Rect();

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f1626x = {R.attr.state_selected};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f1627y = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public e f1628e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f1629f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f1630g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1631j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1632k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1633l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1634m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1635n;

    /* renamed from: o, reason: collision with root package name */
    public int f1636o;

    /* renamed from: p, reason: collision with root package name */
    public int f1637p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f1638q;

    /* renamed from: r, reason: collision with root package name */
    public final c f1639r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1640s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f1641t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f1642u;

    /* renamed from: v, reason: collision with root package name */
    public final j f1643v;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.fortuneodd.shadegrid.R.attr.chipStyle, com.fortuneodd.shadegrid.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.fortuneodd.shadegrid.R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f1641t = new Rect();
        this.f1642u = new RectF();
        this.f1643v = new j(1, this);
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
        e eVar = new e(context2, attributeSet);
        int[] iArr = AbstractC0279a.f3381c;
        TypedArray f2 = n.f(eVar.f4183e0, attributeSet, iArr, com.fortuneodd.shadegrid.R.attr.chipStyle, com.fortuneodd.shadegrid.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        eVar.E0 = f2.hasValue(37);
        Context context3 = eVar.f4183e0;
        ColorStateList r2 = q1.d.r(context3, f2, 24);
        if (eVar.f4201x != r2) {
            eVar.f4201x = r2;
            eVar.onStateChange(eVar.getState());
        }
        ColorStateList r3 = q1.d.r(context3, f2, 11);
        if (eVar.f4203y != r3) {
            eVar.f4203y = r3;
            eVar.onStateChange(eVar.getState());
        }
        float dimension = f2.getDimension(19, 0.0f);
        if (eVar.f4205z != dimension) {
            eVar.f4205z = dimension;
            eVar.invalidateSelf();
            eVar.u();
        }
        if (f2.hasValue(12)) {
            eVar.A(f2.getDimension(12, 0.0f));
        }
        eVar.F(q1.d.r(context3, f2, 22));
        eVar.G(f2.getDimension(23, 0.0f));
        eVar.P(q1.d.r(context3, f2, 36));
        String text = f2.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(eVar.f4158E, text)) {
            eVar.f4158E = text;
            eVar.f4188k0.d = true;
            eVar.invalidateSelf();
            eVar.u();
        }
        G0.d dVar = (!f2.hasValue(0) || (resourceId3 = f2.getResourceId(0, 0)) == 0) ? null : new G0.d(context3, resourceId3);
        dVar.f193k = f2.getDimension(1, dVar.f193k);
        eVar.Q(dVar);
        int i = f2.getInt(3, 0);
        if (i == 1) {
            eVar.f4153B0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            eVar.f4153B0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            eVar.f4153B0 = TextUtils.TruncateAt.END;
        }
        eVar.E(f2.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            eVar.E(f2.getBoolean(15, false));
        }
        eVar.B(q1.d.v(context3, f2, 14));
        if (f2.hasValue(17)) {
            eVar.D(q1.d.r(context3, f2, 17));
        }
        eVar.C(f2.getDimension(16, -1.0f));
        eVar.M(f2.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            eVar.M(f2.getBoolean(26, false));
        }
        eVar.H(q1.d.v(context3, f2, 25));
        eVar.L(q1.d.r(context3, f2, 30));
        eVar.J(f2.getDimension(28, 0.0f));
        eVar.w(f2.getBoolean(6, false));
        eVar.z(f2.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            eVar.z(f2.getBoolean(8, false));
        }
        eVar.x(q1.d.v(context3, f2, 7));
        if (f2.hasValue(9)) {
            eVar.y(q1.d.r(context3, f2, 9));
        }
        eVar.f4173U = (!f2.hasValue(39) || (resourceId2 = f2.getResourceId(39, 0)) == 0) ? null : C0289b.a(context3, resourceId2);
        eVar.f4174V = (!f2.hasValue(33) || (resourceId = f2.getResourceId(33, 0)) == 0) ? null : C0289b.a(context3, resourceId);
        float dimension2 = f2.getDimension(21, 0.0f);
        if (eVar.f4175W != dimension2) {
            eVar.f4175W = dimension2;
            eVar.invalidateSelf();
            eVar.u();
        }
        eVar.O(f2.getDimension(35, 0.0f));
        eVar.N(f2.getDimension(34, 0.0f));
        float dimension3 = f2.getDimension(41, 0.0f);
        if (eVar.f4178Z != dimension3) {
            eVar.f4178Z = dimension3;
            eVar.invalidateSelf();
            eVar.u();
        }
        float dimension4 = f2.getDimension(40, 0.0f);
        if (eVar.f4179a0 != dimension4) {
            eVar.f4179a0 = dimension4;
            eVar.invalidateSelf();
            eVar.u();
        }
        eVar.K(f2.getDimension(29, 0.0f));
        eVar.I(f2.getDimension(27, 0.0f));
        float dimension5 = f2.getDimension(13, 0.0f);
        if (eVar.f4182d0 != dimension5) {
            eVar.f4182d0 = dimension5;
            eVar.invalidateSelf();
            eVar.u();
        }
        eVar.f4157D0 = f2.getDimensionPixelSize(4, Integer.MAX_VALUE);
        f2.recycle();
        n.a(context2, attributeSet, com.fortuneodd.shadegrid.R.attr.chipStyle, com.fortuneodd.shadegrid.R.style.Widget_MaterialComponents_Chip_Action);
        n.b(context2, attributeSet, iArr, com.fortuneodd.shadegrid.R.attr.chipStyle, com.fortuneodd.shadegrid.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.fortuneodd.shadegrid.R.attr.chipStyle, com.fortuneodd.shadegrid.R.style.Widget_MaterialComponents_Chip_Action);
        this.f1635n = obtainStyledAttributes.getBoolean(32, false);
        this.f1637p = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(eVar);
        eVar.i(G.i(this));
        n.a(context2, attributeSet, com.fortuneodd.shadegrid.R.attr.chipStyle, com.fortuneodd.shadegrid.R.style.Widget_MaterialComponents_Chip_Action);
        n.b(context2, attributeSet, iArr, com.fortuneodd.shadegrid.R.attr.chipStyle, com.fortuneodd.shadegrid.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.fortuneodd.shadegrid.R.attr.chipStyle, com.fortuneodd.shadegrid.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f1639r = new c(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new b(this));
        }
        setChecked(this.f1631j);
        setText(eVar.f4158E);
        setEllipsize(eVar.f4153B0);
        h();
        if (!this.f1628e.f4155C0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f1635n) {
            setMinHeight(this.f1637p);
        }
        this.f1636o = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: y0.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f1642u;
        rectF.setEmpty();
        if (c() && this.h != null) {
            e eVar = this.f1628e;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.T()) {
                float f2 = eVar.f4182d0 + eVar.f4181c0 + eVar.f4167O + eVar.f4180b0 + eVar.f4179a0;
                if (D.b.a(eVar) == 0) {
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
        Rect rect = this.f1641t;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private G0.d getTextAppearance() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4188k0.f159f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f1633l != z2) {
            this.f1633l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f1632k != z2) {
            this.f1632k = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.f1637p = i;
        if (!this.f1635n) {
            InsetDrawable insetDrawable = this.f1629f;
            if (insetDrawable == null) {
                int[] iArr = H0.a.f230a;
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f1629f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = H0.a.f230a;
                    f();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.f1628e.f4205z));
        int max2 = Math.max(0, i - this.f1628e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f1629f;
            if (insetDrawable2 == null) {
                int[] iArr3 = H0.a.f230a;
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f1629f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = H0.a.f230a;
                    f();
                    return;
                }
                return;
            }
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.f1629f != null) {
            Rect rect = new Rect();
            this.f1629f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = H0.a.f230a;
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
        this.f1629f = new InsetDrawable((Drawable) this.f1628e, i2, i3, i2, i3);
        int[] iArr6 = H0.a.f230a;
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        e eVar = this.f1628e;
        if (eVar != null) {
            Object obj = eVar.f4164L;
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
        e eVar = this.f1628e;
        return eVar != null && eVar.f4169Q;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f1640s) {
            return super.dispatchHoverEvent(motionEvent);
        }
        c cVar = this.f1639r;
        AccessibilityManager accessibilityManager = cVar.h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                Chip chip = cVar.f4147q;
                int i2 = (chip.c() && chip.getCloseIconTouchBounds().contains(x2, y2)) ? 1 : 0;
                int i3 = cVar.f685m;
                if (i3 != i2) {
                    cVar.f685m = i2;
                    cVar.q(i2, 128);
                    cVar.q(i3, 256);
                }
                if (i2 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i = cVar.f685m) != Integer.MIN_VALUE) {
                if (i == Integer.MIN_VALUE) {
                    return true;
                }
                cVar.f685m = Integer.MIN_VALUE;
                cVar.q(i, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f1640s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        c cVar = this.f1639r;
        cVar.getClass();
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
                                while (i < repeatCount && cVar.m(i2, null)) {
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
                    int i3 = cVar.f684l;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = cVar.f4147q;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.h;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f1640s) {
                                chip.f1639r.q(1, 1);
                            }
                        }
                    }
                    z2 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z2 = cVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z2 = cVar.m(1, null);
            }
        }
        if (!z2 || cVar.f684l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // l.C0248s, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        e eVar = this.f1628e;
        boolean z2 = false;
        if (eVar != null && e.t(eVar.f4164L)) {
            e eVar2 = this.f1628e;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.f1634m) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.f1633l) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f1632k) {
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
            if (this.f1634m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f1633l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f1632k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(eVar2.f4204y0, iArr)) {
                eVar2.f4204y0 = iArr;
                if (eVar2.T()) {
                    z2 = eVar2.v(eVar2.getState(), iArr);
                }
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public final void e() {
        e eVar;
        if (!c() || (eVar = this.f1628e) == null || !eVar.f4163K || this.h == null) {
            S.l(this, null);
            this.f1640s = false;
        } else {
            S.l(this, this.f1639r);
            this.f1640s = true;
        }
    }

    public final void f() {
        this.f1630g = new RippleDrawable(H0.a.a(this.f1628e.f4156D), getBackgroundDrawable(), null);
        this.f1628e.getClass();
        RippleDrawable rippleDrawable = this.f1630g;
        WeakHashMap weakHashMap = S.f360a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        e eVar;
        if (TextUtils.isEmpty(getText()) || (eVar = this.f1628e) == null) {
            return;
        }
        int q2 = (int) (eVar.q() + eVar.f4182d0 + eVar.f4179a0);
        e eVar2 = this.f1628e;
        int p2 = (int) (eVar2.p() + eVar2.f4175W + eVar2.f4178Z);
        if (this.f1629f != null) {
            Rect rect = new Rect();
            this.f1629f.getPadding(rect);
            p2 += rect.left;
            q2 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = S.f360a;
        setPaddingRelative(p2, paddingTop, q2, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f1638q)) {
            return this.f1638q;
        }
        if (!d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1629f;
        return insetDrawable == null ? this.f1628e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4171S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4172T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4203y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return Math.max(0.0f, eVar.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f1628e;
    }

    public float getChipEndPadding() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4182d0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        e eVar = this.f1628e;
        if (eVar == null || (drawable = eVar.f4159G) == 0) {
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
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4161I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4160H;
        }
        return null;
    }

    public float getChipMinHeight() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4205z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4175W;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4152B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4154C;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        e eVar = this.f1628e;
        if (eVar == null || (drawable = eVar.f4164L) == 0) {
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
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4168P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4181c0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4167O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4180b0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4166N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4153B0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f1640s) {
            c cVar = this.f1639r;
            if (cVar.f684l == 1 || cVar.f683k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0289b getHideMotionSpec() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4174V;
        }
        return null;
    }

    public float getIconEndPadding() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4177Y;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4176X;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4156D;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f1628e.f280a.f266a;
    }

    public C0289b getShowMotionSpec() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4173U;
        }
        return null;
    }

    public float getTextEndPadding() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4179a0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        e eVar = this.f1628e;
        if (eVar != null) {
            return eVar.f4178Z;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        e eVar = this.f1628e;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        G0.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f1643v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.q0(this, this.f1628e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1626x);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f1627y);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.f1640s) {
            c cVar = this.f1639r;
            int i2 = cVar.f684l;
            if (i2 != Integer.MIN_VALUE) {
                cVar.j(i2);
            }
            if (z2) {
                cVar.m(i, rect);
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
        if (this.f1636o != i) {
            this.f1636o = i;
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
                    if (this.f1632k) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z2 = true;
                    }
                }
                z2 = false;
            } else if (this.f1632k) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.h;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f1640s) {
                    this.f1639r.q(1, 1);
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
        this.f1638q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1630g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // l.C0248s, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1630g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // l.C0248s, android.view.View
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
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.w(z2);
        }
    }

    public void setCheckableResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.w(eVar.f4183e0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        e eVar = this.f1628e;
        if (eVar == null) {
            this.f1631j = z2;
        } else if (eVar.f4169Q) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.x(drawable);
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
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.x(q1.d.u(eVar.f4183e0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.y(q1.d.p(eVar.f4183e0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.z(eVar.f4183e0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        e eVar = this.f1628e;
        if (eVar == null || eVar.f4203y == colorStateList) {
            return;
        }
        eVar.f4203y = colorStateList;
        eVar.onStateChange(eVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList p2;
        e eVar = this.f1628e;
        if (eVar == null || eVar.f4203y == (p2 = q1.d.p(eVar.f4183e0, i))) {
            return;
        }
        eVar.f4203y = p2;
        eVar.onStateChange(eVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.A(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.A(eVar.f4183e0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(e eVar) {
        e eVar2 = this.f1628e;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.f4151A0 = new WeakReference(null);
            }
            this.f1628e = eVar;
            eVar.f4155C0 = false;
            eVar.f4151A0 = new WeakReference(this);
            b(this.f1637p);
        }
    }

    public void setChipEndPadding(float f2) {
        e eVar = this.f1628e;
        if (eVar == null || eVar.f4182d0 == f2) {
            return;
        }
        eVar.f4182d0 = f2;
        eVar.invalidateSelf();
        eVar.u();
    }

    public void setChipEndPaddingResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            float dimension = eVar.f4183e0.getResources().getDimension(i);
            if (eVar.f4182d0 != dimension) {
                eVar.f4182d0 = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.B(drawable);
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
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.B(q1.d.u(eVar.f4183e0, i));
        }
    }

    public void setChipIconSize(float f2) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.C(f2);
        }
    }

    public void setChipIconSizeResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.C(eVar.f4183e0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.D(q1.d.p(eVar.f4183e0, i));
        }
    }

    public void setChipIconVisible(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.E(eVar.f4183e0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f2) {
        e eVar = this.f1628e;
        if (eVar == null || eVar.f4205z == f2) {
            return;
        }
        eVar.f4205z = f2;
        eVar.invalidateSelf();
        eVar.u();
    }

    public void setChipMinHeightResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            float dimension = eVar.f4183e0.getResources().getDimension(i);
            if (eVar.f4205z != dimension) {
                eVar.f4205z = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        e eVar = this.f1628e;
        if (eVar == null || eVar.f4175W == f2) {
            return;
        }
        eVar.f4175W = f2;
        eVar.invalidateSelf();
        eVar.u();
    }

    public void setChipStartPaddingResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            float dimension = eVar.f4183e0.getResources().getDimension(i);
            if (eVar.f4175W != dimension) {
                eVar.f4175W = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.F(q1.d.p(eVar.f4183e0, i));
        }
    }

    public void setChipStrokeWidth(float f2) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.G(f2);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.G(eVar.f4183e0.getResources().getDimension(i));
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
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.H(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        e eVar = this.f1628e;
        if (eVar == null || eVar.f4168P == charSequence) {
            return;
        }
        String str = I.b.f236b;
        I.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? I.b.f238e : I.b.d;
        bVar.getClass();
        g gVar = h.f246a;
        eVar.f4168P = bVar.c(charSequence);
        eVar.invalidateSelf();
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
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.I(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.I(eVar.f4183e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.H(q1.d.u(eVar.f4183e0, i));
        }
        e();
    }

    public void setCloseIconSize(float f2) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.J(f2);
        }
    }

    public void setCloseIconSizeResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.J(eVar.f4183e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.K(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.K(eVar.f4183e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.L(q1.d.p(eVar.f4183e0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // l.C0248s, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // l.C0248s, android.widget.TextView
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
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.i(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1628e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.f4153B0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f1635n = z2;
        b(this.f1637p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C0289b c0289b) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.f4174V = c0289b;
        }
    }

    public void setHideMotionSpecResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.f4174V = C0289b.a(eVar.f4183e0, i);
        }
    }

    public void setIconEndPadding(float f2) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.N(f2);
        }
    }

    public void setIconEndPaddingResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.N(eVar.f4183e0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f2) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.O(f2);
        }
    }

    public void setIconStartPaddingResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.O(eVar.f4183e0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(D0.g gVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f1628e == null) {
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
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.f4157D0 = i;
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
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.P(colorStateList);
        }
        this.f1628e.getClass();
        f();
    }

    public void setRippleColorResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.P(q1.d.p(eVar.f4183e0, i));
            this.f1628e.getClass();
            f();
        }
    }

    @Override // J0.v
    public void setShapeAppearanceModel(k kVar) {
        this.f1628e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C0289b c0289b) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.f4173U = c0289b;
        }
    }

    public void setShowMotionSpecResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.f4173U = C0289b.a(eVar.f4183e0, i);
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
        e eVar = this.f1628e;
        if (eVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(eVar.f4155C0 ? null : charSequence, bufferType);
        e eVar2 = this.f1628e;
        if (eVar2 == null || TextUtils.equals(eVar2.f4158E, charSequence)) {
            return;
        }
        eVar2.f4158E = charSequence;
        eVar2.f4188k0.d = true;
        eVar2.invalidateSelf();
        eVar2.u();
    }

    public void setTextAppearance(G0.d dVar) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.Q(dVar);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f2) {
        e eVar = this.f1628e;
        if (eVar == null || eVar.f4179a0 == f2) {
            return;
        }
        eVar.f4179a0 = f2;
        eVar.invalidateSelf();
        eVar.u();
    }

    public void setTextEndPaddingResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            float dimension = eVar.f4183e0.getResources().getDimension(i);
            if (eVar.f4179a0 != dimension) {
                eVar.f4179a0 = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        super.setTextSize(i, f2);
        e eVar = this.f1628e;
        if (eVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics());
            D0.l lVar = eVar.f4188k0;
            G0.d dVar = lVar.f159f;
            if (dVar != null) {
                dVar.f193k = applyDimension;
                lVar.f155a.setTextSize(applyDimension);
                eVar.u();
                eVar.invalidateSelf();
            }
        }
        h();
    }

    public void setTextStartPadding(float f2) {
        e eVar = this.f1628e;
        if (eVar == null || eVar.f4178Z == f2) {
            return;
        }
        eVar.f4178Z = f2;
        eVar.invalidateSelf();
        eVar.u();
    }

    public void setTextStartPaddingResource(int i) {
        e eVar = this.f1628e;
        if (eVar != null) {
            float dimension = eVar.f4183e0.getResources().getDimension(i);
            if (eVar.f4178Z != dimension) {
                eVar.f4178Z = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.M(z2);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z2) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.z(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.E(z2);
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
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.Q(new G0.d(eVar.f4183e0, i));
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        e eVar = this.f1628e;
        if (eVar != null) {
            eVar.Q(new G0.d(eVar.f4183e0, i));
        }
        h();
    }
}
