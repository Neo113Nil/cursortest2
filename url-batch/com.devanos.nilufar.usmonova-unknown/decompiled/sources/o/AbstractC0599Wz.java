package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* renamed from: o.Wz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0599Wz extends ViewGroup {
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public float n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f127o;
    public int[] p;
    public int[] q;
    public Drawable r;
    public int s;
    public int t;
    public int u;
    public int v;

    public AbstractC0599Wz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.h = true;
        this.i = -1;
        this.j = 0;
        this.l = 8388659;
        int[] iArr = AbstractC1886sL.n;
        C0950e6 F = C0950e6.F(context, attributeSet, iArr, 0);
        AZ.g(this, context, iArr, attributeSet, (TypedArray) F.i, 0);
        TypedArray typedArray = (TypedArray) F.i;
        int i = typedArray.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i2 = typedArray.getInt(0, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.n = typedArray.getFloat(4, -1.0f);
        this.i = typedArray.getInt(3, -1);
        this.f127o = typedArray.getBoolean(7, false);
        setDividerDrawable(F.x(5));
        this.u = typedArray.getInt(8, 0);
        this.v = typedArray.getDimensionPixelSize(6, 0);
        F.L();
    }

    public final void c(Canvas canvas, int i) {
        this.r.setBounds(getPaddingLeft() + this.v, i, (getWidth() - getPaddingRight()) - this.v, this.t + i);
        this.r.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0573Vz;
    }

    public final void d(Canvas canvas, int i) {
        this.r.setBounds(i, getPaddingTop() + this.v, this.s + i, (getHeight() - getPaddingBottom()) - this.v);
        this.r.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C0573Vz generateDefaultLayoutParams() {
        int i = this.k;
        if (i == 0) {
            return new C0573Vz(-2, -2);
        }
        if (i == 1) {
            return new C0573Vz(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0573Vz generateLayoutParams(AttributeSet attributeSet) {
        return new C0573Vz(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0573Vz generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0573Vz ? new C0573Vz((C0573Vz) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0573Vz((ViewGroup.MarginLayoutParams) layoutParams) : new C0573Vz(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.i < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.i;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.i == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.j;
        if (this.k == 1 && (i = this.l & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.m) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.m;
            }
        }
        return i3 + ((LinearLayout.LayoutParams) ((C0573Vz) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.i;
    }

    public Drawable getDividerDrawable() {
        return this.r;
    }

    public int getDividerPadding() {
        return this.v;
    }

    public int getDividerWidth() {
        return this.s;
    }

    public int getGravity() {
        return this.l;
    }

    public int getOrientation() {
        return this.k;
    }

    public int getShowDividers() {
        return this.u;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.n;
    }

    public final boolean h(int i) {
        if (i == 0) {
            return (this.u & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.u & 4) != 0;
        }
        if ((this.u & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.r == null) {
            return;
        }
        int i2 = 0;
        if (this.k == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && h(i2)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0573Vz) childAt.getLayoutParams())).topMargin) - this.t);
                }
                i2++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.t : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0573Vz) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = AbstractC1468m00.a;
        boolean z2 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i2)) {
                C0573Vz c0573Vz = (C0573Vz) childAt3.getLayoutParams();
                d(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0573Vz).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0573Vz).leftMargin) - this.s);
            }
            i2++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0573Vz c0573Vz2 = (C0573Vz) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0573Vz2).leftMargin;
                    i = this.s;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0573Vz2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.s;
                right = left - i;
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0191  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char c;
        int i14;
        int i15;
        int i16;
        int i17 = 8;
        char c2 = 2;
        if (this.k == 1) {
            int paddingLeft = getPaddingLeft();
            int i18 = i3 - i;
            int paddingRight = i18 - getPaddingRight();
            int paddingRight2 = (i18 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i19 = this.l;
            int i20 = i19 & 112;
            int i21 = 8388615 & i19;
            int paddingTop = i20 != 16 ? i20 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.m : getPaddingTop() + (((i4 - i2) - this.m) / 2);
            int i22 = 0;
            while (i22 < virtualChildCount) {
                View childAt = getChildAt(i22);
                if (childAt == null || childAt.getVisibility() == i17) {
                    c = c2;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    C0573Vz c0573Vz = (C0573Vz) childAt.getLayoutParams();
                    c = c2;
                    int i23 = ((LinearLayout.LayoutParams) c0573Vz).gravity;
                    if (i23 < 0) {
                        i23 = i21;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i23, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c0573Vz).leftMargin;
                        i15 = ((LinearLayout.LayoutParams) c0573Vz).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i16 = ((LinearLayout.LayoutParams) c0573Vz).leftMargin + paddingLeft;
                        if (h(i22)) {
                            paddingTop += this.t;
                        }
                        int i24 = paddingTop + ((LinearLayout.LayoutParams) c0573Vz).topMargin;
                        childAt.layout(i16, i24, measuredWidth + i16, i24 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) c0573Vz).bottomMargin + i24;
                    } else {
                        i14 = paddingRight - measuredWidth;
                        i15 = ((LinearLayout.LayoutParams) c0573Vz).rightMargin;
                    }
                    i16 = i14 - i15;
                    if (h(i22)) {
                    }
                    int i242 = paddingTop + ((LinearLayout.LayoutParams) c0573Vz).topMargin;
                    childAt.layout(i16, i242, measuredWidth + i16, i242 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) c0573Vz).bottomMargin + i242;
                }
                i22++;
                c2 = c;
                i17 = 8;
            }
            return;
        }
        boolean z2 = AbstractC1468m00.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i25 = i4 - i2;
        int paddingBottom = i25 - getPaddingBottom();
        int paddingBottom2 = (i25 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i26 = this.l;
        int i27 = 8388615 & i26;
        int i28 = i26 & 112;
        boolean z4 = this.h;
        int[] iArr = this.p;
        int[] iArr2 = this.q;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i27, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.m : getPaddingLeft() + (((i3 - i) - this.m) / 2);
        if (z3) {
            i6 = virtualChildCount2 - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i29 = 0;
        while (i29 < virtualChildCount2) {
            int i30 = (i5 * i29) + i6;
            View childAt2 = getChildAt(i30);
            if (childAt2 == null) {
                i7 = i6;
            } else {
                i7 = i6;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    C0573Vz c0573Vz2 = (C0573Vz) childAt2.getLayoutParams();
                    int i31 = paddingLeft2;
                    if (z4) {
                        i8 = paddingTop2;
                        if (((LinearLayout.LayoutParams) c0573Vz2).height != -1) {
                            i9 = childAt2.getBaseline();
                            i10 = ((LinearLayout.LayoutParams) c0573Vz2).gravity;
                            if (i10 < 0) {
                                i10 = i28;
                            }
                            i11 = i10 & 112;
                            if (i11 == 16) {
                                if (i11 == 48) {
                                    i12 = i8 + ((LinearLayout.LayoutParams) c0573Vz2).topMargin;
                                    if (i9 != -1) {
                                        i12 = (iArr[1] - i9) + i12;
                                    }
                                } else if (i11 != 80) {
                                    i12 = i8;
                                } else {
                                    i12 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) c0573Vz2).bottomMargin;
                                    if (i9 != -1) {
                                        i13 = iArr2[2] - (childAt2.getMeasuredHeight() - i9);
                                    }
                                }
                                int i32 = (h(i30) ? i31 + this.s : i31) + ((LinearLayout.LayoutParams) c0573Vz2).leftMargin;
                                childAt2.layout(i32, i12, i32 + measuredWidth2, i12 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c0573Vz2).rightMargin + i32;
                                i29++;
                                i6 = i7;
                                paddingTop2 = i8;
                            } else {
                                i12 = ((paddingBottom2 - measuredHeight2) / 2) + i8 + ((LinearLayout.LayoutParams) c0573Vz2).topMargin;
                                i13 = ((LinearLayout.LayoutParams) c0573Vz2).bottomMargin;
                            }
                            i12 -= i13;
                            int i322 = (h(i30) ? i31 + this.s : i31) + ((LinearLayout.LayoutParams) c0573Vz2).leftMargin;
                            childAt2.layout(i322, i12, i322 + measuredWidth2, i12 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c0573Vz2).rightMargin + i322;
                            i29++;
                            i6 = i7;
                            paddingTop2 = i8;
                        }
                    } else {
                        i8 = paddingTop2;
                    }
                    i9 = -1;
                    i10 = ((LinearLayout.LayoutParams) c0573Vz2).gravity;
                    if (i10 < 0) {
                    }
                    i11 = i10 & 112;
                    if (i11 == 16) {
                    }
                    i12 -= i13;
                    int i3222 = (h(i30) ? i31 + this.s : i31) + ((LinearLayout.LayoutParams) c0573Vz2).leftMargin;
                    childAt2.layout(i3222, i12, i3222 + measuredWidth2, i12 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c0573Vz2).rightMargin + i3222;
                    i29++;
                    i6 = i7;
                    paddingTop2 = i8;
                }
            }
            i8 = paddingTop2;
            i29++;
            i6 = i7;
            paddingTop2 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        int baseline;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        boolean z2;
        boolean z3;
        C0573Vz c0573Vz;
        int i13;
        int[] iArr2;
        int i14;
        View view;
        int i15;
        boolean z4;
        boolean z5;
        int max;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z6;
        int i24;
        int i25;
        int i26;
        View view2;
        boolean z7;
        boolean z8;
        AbstractC0599Wz abstractC0599Wz = this;
        int i27 = -2;
        int i28 = 0;
        int i29 = 1073741824;
        int i30 = 8;
        if (abstractC0599Wz.k == 1) {
            abstractC0599Wz.m = 0;
            int virtualChildCount = abstractC0599Wz.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i31 = abstractC0599Wz.i;
            boolean z9 = abstractC0599Wz.f127o;
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            boolean z10 = false;
            int i35 = 0;
            boolean z11 = false;
            boolean z12 = true;
            float f = 0.0f;
            int i36 = 0;
            while (i32 < virtualChildCount) {
                int i37 = mode;
                View childAt = abstractC0599Wz.getChildAt(i32);
                if (childAt == null) {
                    abstractC0599Wz.m = abstractC0599Wz.m;
                } else if (childAt.getVisibility() != i30) {
                    if (abstractC0599Wz.h(i32)) {
                        abstractC0599Wz.m += abstractC0599Wz.t;
                    }
                    C0573Vz c0573Vz2 = (C0573Vz) childAt.getLayoutParams();
                    float f2 = ((LinearLayout.LayoutParams) c0573Vz2).weight;
                    f += f2;
                    if (mode2 == i29 && ((LinearLayout.LayoutParams) c0573Vz2).height == 0 && f2 > 0.0f) {
                        int i38 = abstractC0599Wz.m;
                        abstractC0599Wz.m = Math.max(i38, ((LinearLayout.LayoutParams) c0573Vz2).topMargin + i38 + ((LinearLayout.LayoutParams) c0573Vz2).bottomMargin);
                        view2 = childAt;
                        i23 = mode2;
                        i24 = i31;
                        z6 = z9;
                        i25 = i32;
                        z10 = true;
                        i26 = i37;
                    } else {
                        if (((LinearLayout.LayoutParams) c0573Vz2).height != 0 || f2 <= 0.0f) {
                            i20 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c0573Vz2).height = i27;
                            i20 = 0;
                        }
                        if (f == 0.0f) {
                            i21 = i32;
                            i22 = abstractC0599Wz.m;
                        } else {
                            i21 = i32;
                            i22 = 0;
                        }
                        i23 = mode2;
                        z6 = z9;
                        i24 = i31;
                        i25 = i21;
                        i26 = i37;
                        abstractC0599Wz.measureChildWithMargins(childAt, i, 0, i2, i22);
                        if (i20 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c0573Vz2).height = i20;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i39 = abstractC0599Wz.m;
                        view2 = childAt;
                        abstractC0599Wz.m = Math.max(i39, i39 + measuredHeight + ((LinearLayout.LayoutParams) c0573Vz2).topMargin + ((LinearLayout.LayoutParams) c0573Vz2).bottomMargin);
                        if (z6) {
                            i36 = Math.max(measuredHeight, i36);
                        }
                    }
                    if (i24 >= 0 && i24 == i25 + 1) {
                        abstractC0599Wz.j = abstractC0599Wz.m;
                    }
                    if (i25 < i24 && ((LinearLayout.LayoutParams) c0573Vz2).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i26 == 1073741824 || ((LinearLayout.LayoutParams) c0573Vz2).width != -1) {
                        z7 = false;
                    } else {
                        z7 = true;
                        z11 = true;
                    }
                    int i40 = ((LinearLayout.LayoutParams) c0573Vz2).leftMargin + ((LinearLayout.LayoutParams) c0573Vz2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i40;
                    i28 = Math.max(i28, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z13 = z7;
                    int combineMeasuredStates = View.combineMeasuredStates(i35, measuredState);
                    if (z12) {
                        i35 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) c0573Vz2).width == -1) {
                            z8 = true;
                            if (((LinearLayout.LayoutParams) c0573Vz2).weight <= 0.0f) {
                                if (!z13) {
                                    i40 = measuredWidth;
                                }
                                i34 = Math.max(i34, i40);
                            } else {
                                if (!z13) {
                                    i40 = measuredWidth;
                                }
                                i33 = Math.max(i33, i40);
                            }
                            z12 = z8;
                            i32 = i25 + 1;
                            i31 = i24;
                            mode = i26;
                            z9 = z6;
                            mode2 = i23;
                            i27 = -2;
                            i29 = 1073741824;
                            i30 = 8;
                        }
                    } else {
                        i35 = combineMeasuredStates;
                    }
                    z8 = false;
                    if (((LinearLayout.LayoutParams) c0573Vz2).weight <= 0.0f) {
                    }
                    z12 = z8;
                    i32 = i25 + 1;
                    i31 = i24;
                    mode = i26;
                    z9 = z6;
                    mode2 = i23;
                    i27 = -2;
                    i29 = 1073741824;
                    i30 = 8;
                }
                i23 = mode2;
                i24 = i31;
                z6 = z9;
                i25 = i32;
                i26 = i37;
                i32 = i25 + 1;
                i31 = i24;
                mode = i26;
                z9 = z6;
                mode2 = i23;
                i27 = -2;
                i29 = 1073741824;
                i30 = 8;
            }
            int i41 = mode;
            int i42 = mode2;
            boolean z14 = z9;
            int i43 = i35;
            int i44 = i2;
            if (abstractC0599Wz.m > 0 && abstractC0599Wz.h(virtualChildCount)) {
                abstractC0599Wz.m += abstractC0599Wz.t;
            }
            if (z14 && (i42 == Integer.MIN_VALUE || i42 == 0)) {
                abstractC0599Wz.m = 0;
                for (int i45 = 0; i45 < virtualChildCount; i45++) {
                    View childAt2 = abstractC0599Wz.getChildAt(i45);
                    if (childAt2 == null) {
                        abstractC0599Wz.m = abstractC0599Wz.m;
                    } else if (childAt2.getVisibility() != 8) {
                        C0573Vz c0573Vz3 = (C0573Vz) childAt2.getLayoutParams();
                        int i46 = abstractC0599Wz.m;
                        abstractC0599Wz.m = Math.max(i46, i46 + i36 + ((LinearLayout.LayoutParams) c0573Vz3).topMargin + ((LinearLayout.LayoutParams) c0573Vz3).bottomMargin);
                    }
                }
            }
            int paddingBottom = abstractC0599Wz.getPaddingBottom() + abstractC0599Wz.getPaddingTop() + abstractC0599Wz.m;
            abstractC0599Wz.m = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, abstractC0599Wz.getSuggestedMinimumHeight()), i44, 0);
            int i47 = (resolveSizeAndState & 16777215) - abstractC0599Wz.m;
            if (z10 || (i47 != 0 && f > 0.0f)) {
                float f3 = abstractC0599Wz.n;
                if (f3 > 0.0f) {
                    f = f3;
                }
                abstractC0599Wz.m = 0;
                int i48 = i43;
                int i49 = 0;
                while (i49 < virtualChildCount) {
                    View childAt3 = abstractC0599Wz.getChildAt(i49);
                    if (childAt3.getVisibility() == 8) {
                        i17 = i49;
                    } else {
                        C0573Vz c0573Vz4 = (C0573Vz) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) c0573Vz4).weight;
                        if (f4 > 0.0f) {
                            int i50 = (int) ((i47 * f4) / f);
                            f -= f4;
                            i47 -= i50;
                            i17 = i49;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, abstractC0599Wz.getPaddingRight() + abstractC0599Wz.getPaddingLeft() + ((LinearLayout.LayoutParams) c0573Vz4).leftMargin + ((LinearLayout.LayoutParams) c0573Vz4).rightMargin, ((LinearLayout.LayoutParams) c0573Vz4).width);
                            if (((LinearLayout.LayoutParams) c0573Vz4).height == 0) {
                                i19 = 1073741824;
                                if (i42 == 1073741824) {
                                    if (i50 <= 0) {
                                        i50 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i50, 1073741824));
                                    i48 = View.combineMeasuredStates(i48, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i19 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i50;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i19));
                            i48 = View.combineMeasuredStates(i48, childAt3.getMeasuredState() & (-256));
                        } else {
                            i17 = i49;
                        }
                        int i51 = ((LinearLayout.LayoutParams) c0573Vz4).leftMargin + ((LinearLayout.LayoutParams) c0573Vz4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i51;
                        i28 = Math.max(i28, measuredWidth2);
                        if (i41 != 1073741824) {
                            i18 = -1;
                            if (((LinearLayout.LayoutParams) c0573Vz4).width == -1) {
                                measuredWidth2 = i51;
                            }
                        } else {
                            i18 = -1;
                        }
                        i33 = Math.max(i33, measuredWidth2);
                        boolean z15 = z12 && ((LinearLayout.LayoutParams) c0573Vz4).width == i18;
                        int i52 = abstractC0599Wz.m;
                        abstractC0599Wz.m = Math.max(i52, childAt3.getMeasuredHeight() + i52 + ((LinearLayout.LayoutParams) c0573Vz4).topMargin + ((LinearLayout.LayoutParams) c0573Vz4).bottomMargin);
                        z12 = z15;
                    }
                    i49 = i17 + 1;
                }
                abstractC0599Wz.m = abstractC0599Wz.getPaddingBottom() + abstractC0599Wz.getPaddingTop() + abstractC0599Wz.m;
                i43 = i48;
            } else {
                i33 = Math.max(i33, i34);
                if (z14 && i42 != 1073741824) {
                    for (int i53 = 0; i53 < virtualChildCount; i53++) {
                        View childAt4 = abstractC0599Wz.getChildAt(i53);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0573Vz) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i36, 1073741824));
                        }
                    }
                }
            }
            if (z12 || i41 == 1073741824) {
                i33 = i28;
            }
            abstractC0599Wz.setMeasuredDimension(View.resolveSizeAndState(Math.max(abstractC0599Wz.getPaddingRight() + abstractC0599Wz.getPaddingLeft() + i33, abstractC0599Wz.getSuggestedMinimumWidth()), i, i43), resolveSizeAndState);
            if (z11) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(abstractC0599Wz.getMeasuredWidth(), 1073741824);
                int i54 = 0;
                while (i54 < virtualChildCount) {
                    View childAt5 = abstractC0599Wz.getChildAt(i54);
                    if (childAt5.getVisibility() != 8) {
                        C0573Vz c0573Vz5 = (C0573Vz) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c0573Vz5).width == -1) {
                            int i55 = ((LinearLayout.LayoutParams) c0573Vz5).height;
                            ((LinearLayout.LayoutParams) c0573Vz5).height = childAt5.getMeasuredHeight();
                            abstractC0599Wz.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i44, 0);
                            ((LinearLayout.LayoutParams) c0573Vz5).height = i55;
                        }
                    }
                    i54++;
                    i44 = i2;
                }
                return;
            }
            return;
        }
        int i56 = i;
        abstractC0599Wz.m = 0;
        int virtualChildCount2 = abstractC0599Wz.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i56);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (abstractC0599Wz.p == null || abstractC0599Wz.q == null) {
            abstractC0599Wz.p = new int[4];
            abstractC0599Wz.q = new int[4];
        }
        int[] iArr3 = abstractC0599Wz.p;
        int[] iArr4 = abstractC0599Wz.q;
        iArr3[3] = -1;
        char c = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z16 = abstractC0599Wz.h;
        boolean z17 = abstractC0599Wz.f127o;
        boolean z18 = mode3 == 1073741824;
        float f5 = 0.0f;
        boolean z19 = true;
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        boolean z20 = false;
        boolean z21 = false;
        while (i57 < virtualChildCount2) {
            char c2 = c;
            View childAt6 = abstractC0599Wz.getChildAt(i57);
            if (childAt6 == null) {
                abstractC0599Wz.m = abstractC0599Wz.m;
                i12 = i57;
                i16 = i59;
                iArr2 = iArr3;
                iArr = iArr4;
                z2 = z16;
                z3 = z17;
            } else {
                int i63 = i58;
                if (childAt6.getVisibility() == 8) {
                    i56 = i;
                    i12 = i57;
                    i16 = i59;
                    iArr = iArr4;
                    z2 = z16;
                    z3 = z17;
                    i58 = i63;
                    iArr2 = iArr3;
                } else {
                    if (abstractC0599Wz.h(i57)) {
                        abstractC0599Wz.m += abstractC0599Wz.s;
                    }
                    C0573Vz c0573Vz6 = (C0573Vz) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) c0573Vz6).weight;
                    f5 += f6;
                    int i64 = i57;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c0573Vz6).width == 0 && f6 > 0.0f) {
                        if (z18) {
                            abstractC0599Wz.m = ((LinearLayout.LayoutParams) c0573Vz6).leftMargin + ((LinearLayout.LayoutParams) c0573Vz6).rightMargin + abstractC0599Wz.m;
                        } else {
                            int i65 = abstractC0599Wz.m;
                            abstractC0599Wz.m = Math.max(i65, ((LinearLayout.LayoutParams) c0573Vz6).leftMargin + i65 + ((LinearLayout.LayoutParams) c0573Vz6).rightMargin);
                        }
                        if (z16) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z2 = z16;
                            z3 = z17;
                            i13 = i63;
                            i12 = i64;
                            c0573Vz = c0573Vz6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i56 = i;
                            i14 = i59;
                            i11 = i60;
                        } else {
                            view = childAt6;
                            z2 = z16;
                            z3 = z17;
                            z21 = true;
                            i13 = i63;
                            i12 = i64;
                            i15 = 1073741824;
                            c0573Vz = c0573Vz6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i56 = i;
                            i14 = i59;
                            i11 = i60;
                            if (mode4 == i15 && ((LinearLayout.LayoutParams) c0573Vz).height == -1) {
                                z4 = true;
                                z20 = true;
                            } else {
                                z4 = false;
                            }
                            int i66 = ((LinearLayout.LayoutParams) c0573Vz).topMargin + ((LinearLayout.LayoutParams) c0573Vz).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i66;
                            i62 = View.combineMeasuredStates(i62, view.getMeasuredState());
                            if (z2) {
                                z5 = z4;
                            } else {
                                int baseline2 = view.getBaseline();
                                z5 = z4;
                                if (baseline2 != -1) {
                                    int i67 = ((LinearLayout.LayoutParams) c0573Vz).gravity;
                                    if (i67 < 0) {
                                        i67 = abstractC0599Wz.l;
                                    }
                                    int i68 = (((i67 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i68] = Math.max(iArr2[i68], baseline2);
                                    iArr[i68] = Math.max(iArr[i68], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i13, measuredHeight3);
                            boolean z22 = !z19 && ((LinearLayout.LayoutParams) c0573Vz).height == -1;
                            if (((LinearLayout.LayoutParams) c0573Vz).weight <= 0.0f) {
                                if (!z5) {
                                    i66 = measuredHeight3;
                                }
                                i60 = Math.max(i11, i66);
                                max = i14;
                            } else {
                                if (!z5) {
                                    i66 = measuredHeight3;
                                }
                                max = Math.max(i14, i66);
                                i60 = i11;
                            }
                            int i69 = max;
                            i58 = max2;
                            i16 = i69;
                            z19 = z22;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) c0573Vz6).width != 0 || f6 <= 0.0f) {
                            i10 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c0573Vz6).width = -2;
                            i10 = 0;
                        }
                        iArr = iArr4;
                        i11 = i60;
                        i12 = i64;
                        z2 = z16;
                        z3 = z17;
                        int i70 = i10;
                        c0573Vz = c0573Vz6;
                        i13 = i63;
                        i56 = i;
                        iArr2 = iArr3;
                        i14 = i59;
                        abstractC0599Wz.measureChildWithMargins(childAt6, i56, f5 == 0.0f ? abstractC0599Wz.m : 0, i2, 0);
                        if (i70 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c0573Vz).width = i70;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z18) {
                            view = childAt6;
                            abstractC0599Wz.m = ((LinearLayout.LayoutParams) c0573Vz).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) c0573Vz).rightMargin + abstractC0599Wz.m;
                        } else {
                            view = childAt6;
                            int i71 = abstractC0599Wz.m;
                            abstractC0599Wz.m = Math.max(i71, i71 + measuredWidth3 + ((LinearLayout.LayoutParams) c0573Vz).leftMargin + ((LinearLayout.LayoutParams) c0573Vz).rightMargin);
                        }
                        if (z3) {
                            i61 = Math.max(measuredWidth3, i61);
                        }
                    }
                    i15 = 1073741824;
                    if (mode4 == i15) {
                    }
                    z4 = false;
                    int i662 = ((LinearLayout.LayoutParams) c0573Vz).topMargin + ((LinearLayout.LayoutParams) c0573Vz).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i662;
                    i62 = View.combineMeasuredStates(i62, view.getMeasuredState());
                    if (z2) {
                    }
                    int max22 = Math.max(i13, measuredHeight32);
                    if (z19) {
                    }
                    if (((LinearLayout.LayoutParams) c0573Vz).weight <= 0.0f) {
                    }
                    int i692 = max;
                    i58 = max22;
                    i16 = i692;
                    z19 = z22;
                }
            }
            i59 = i16;
            i57 = i12 + 1;
            c = c2;
            iArr3 = iArr2;
            iArr4 = iArr;
            z16 = z2;
            z17 = z3;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c3 = c;
        boolean z23 = z16;
        boolean z24 = z17;
        int i72 = i58;
        int i73 = i59;
        int i74 = i60;
        if (abstractC0599Wz.m > 0 && abstractC0599Wz.h(virtualChildCount2)) {
            abstractC0599Wz.m += abstractC0599Wz.s;
        }
        int i75 = iArr5[1];
        int max3 = (i75 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) ? i72 : Math.max(i72, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i75, iArr5[c3]))));
        if (z24 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            abstractC0599Wz.m = 0;
            for (int i76 = 0; i76 < virtualChildCount2; i76++) {
                View childAt7 = abstractC0599Wz.getChildAt(i76);
                if (childAt7 == null) {
                    abstractC0599Wz.m = abstractC0599Wz.m;
                } else if (childAt7.getVisibility() != 8) {
                    C0573Vz c0573Vz7 = (C0573Vz) childAt7.getLayoutParams();
                    if (z18) {
                        abstractC0599Wz.m = ((LinearLayout.LayoutParams) c0573Vz7).leftMargin + i61 + ((LinearLayout.LayoutParams) c0573Vz7).rightMargin + abstractC0599Wz.m;
                    } else {
                        int i77 = abstractC0599Wz.m;
                        abstractC0599Wz.m = Math.max(i77, i77 + i61 + ((LinearLayout.LayoutParams) c0573Vz7).leftMargin + ((LinearLayout.LayoutParams) c0573Vz7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = abstractC0599Wz.getPaddingRight() + abstractC0599Wz.getPaddingLeft() + abstractC0599Wz.m;
        abstractC0599Wz.m = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, abstractC0599Wz.getSuggestedMinimumWidth()), i56, 0);
        int i78 = (resolveSizeAndState2 & 16777215) - abstractC0599Wz.m;
        if (z21 || (i78 != 0 && f5 > 0.0f)) {
            float f7 = abstractC0599Wz.n;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr5[3] = -1;
            iArr5[c3] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c3] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            abstractC0599Wz.m = 0;
            max3 = -1;
            int i79 = 0;
            while (i79 < virtualChildCount2) {
                View childAt8 = abstractC0599Wz.getChildAt(i79);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i7 = resolveSizeAndState2;
                } else {
                    C0573Vz c0573Vz8 = (C0573Vz) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) c0573Vz8).weight;
                    if (f8 > 0.0f) {
                        int i80 = (int) ((i78 * f8) / f5);
                        f5 -= f8;
                        i78 -= i80;
                        i7 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, abstractC0599Wz.getPaddingBottom() + abstractC0599Wz.getPaddingTop() + ((LinearLayout.LayoutParams) c0573Vz8).topMargin + ((LinearLayout.LayoutParams) c0573Vz8).bottomMargin, ((LinearLayout.LayoutParams) c0573Vz8).height);
                        if (((LinearLayout.LayoutParams) c0573Vz8).width == 0) {
                            i9 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i80 <= 0) {
                                    i80 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i80, 1073741824), childMeasureSpec2);
                                i62 = View.combineMeasuredStates(i62, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i9 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i80;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i9), childMeasureSpec2);
                        i62 = View.combineMeasuredStates(i62, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i7 = resolveSizeAndState2;
                    }
                    if (z18) {
                        abstractC0599Wz.m = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0573Vz8).leftMargin + ((LinearLayout.LayoutParams) c0573Vz8).rightMargin + abstractC0599Wz.m;
                    } else {
                        int i81 = abstractC0599Wz.m;
                        abstractC0599Wz.m = Math.max(i81, childAt8.getMeasuredWidth() + i81 + ((LinearLayout.LayoutParams) c0573Vz8).leftMargin + ((LinearLayout.LayoutParams) c0573Vz8).rightMargin);
                    }
                    boolean z25 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c0573Vz8).height == -1;
                    int i82 = ((LinearLayout.LayoutParams) c0573Vz8).topMargin + ((LinearLayout.LayoutParams) c0573Vz8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i82;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z25) {
                        i82 = measuredHeight4;
                    }
                    int max4 = Math.max(i73, i82);
                    if (z19) {
                        i8 = -1;
                        if (((LinearLayout.LayoutParams) c0573Vz8).height == -1) {
                            z = true;
                            if (!z23 && (baseline = childAt8.getBaseline()) != i8) {
                                int i83 = ((LinearLayout.LayoutParams) c0573Vz8).gravity;
                                if (i83 < 0) {
                                    i83 = abstractC0599Wz.l;
                                }
                                int i84 = (((i83 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i84] = Math.max(iArr5[i84], baseline);
                                iArr6[i84] = Math.max(iArr6[i84], measuredHeight4 - baseline);
                            }
                            z19 = z;
                            i73 = max4;
                        }
                    } else {
                        i8 = -1;
                    }
                    z = false;
                    if (!z23) {
                    }
                    z19 = z;
                    i73 = max4;
                }
                i79++;
                resolveSizeAndState2 = i7;
            }
            i3 = resolveSizeAndState2;
            i4 = -16777216;
            abstractC0599Wz.m = abstractC0599Wz.getPaddingRight() + abstractC0599Wz.getPaddingLeft() + abstractC0599Wz.m;
            int i85 = iArr5[1];
            if (i85 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                max3 = Math.max(max3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i85, iArr5[c3]))));
            }
            i6 = i73;
        } else {
            i6 = Math.max(i73, i74);
            if (z24 && mode3 != 1073741824) {
                for (int i86 = 0; i86 < virtualChildCount2; i86++) {
                    View childAt9 = abstractC0599Wz.getChildAt(i86);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0573Vz) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i61, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = resolveSizeAndState2;
            i4 = -16777216;
            i5 = 0;
        }
        if (!z19 && mode4 != 1073741824) {
            max3 = i6;
        }
        abstractC0599Wz.setMeasuredDimension(i3 | (i62 & i4), View.resolveSizeAndState(Math.max(abstractC0599Wz.getPaddingBottom() + abstractC0599Wz.getPaddingTop() + max3, abstractC0599Wz.getSuggestedMinimumHeight()), i2, i62 << 16));
        if (z20) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(abstractC0599Wz.getMeasuredHeight(), 1073741824);
            int i87 = i5;
            while (i87 < virtualChildCount2) {
                View childAt10 = abstractC0599Wz.getChildAt(i87);
                if (childAt10.getVisibility() != 8) {
                    C0573Vz c0573Vz9 = (C0573Vz) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c0573Vz9).height == -1) {
                        int i88 = ((LinearLayout.LayoutParams) c0573Vz9).width;
                        ((LinearLayout.LayoutParams) c0573Vz9).width = childAt10.getMeasuredWidth();
                        abstractC0599Wz.measureChildWithMargins(childAt10, i56, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) c0573Vz9).width = i88;
                    }
                }
                i87++;
                abstractC0599Wz = this;
                i56 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.h = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.i = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.r) {
            return;
        }
        this.r = drawable;
        if (drawable != null) {
            this.s = drawable.getIntrinsicWidth();
            this.t = drawable.getIntrinsicHeight();
        } else {
            this.s = 0;
            this.t = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.v = i;
    }

    public void setGravity(int i) {
        if (this.l != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.l = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.l;
        if ((8388615 & i3) != i2) {
            this.l = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f127o = z;
    }

    public void setOrientation(int i) {
        if (this.k != i) {
            this.k = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.u) {
            requestLayout();
        }
        this.u = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.l;
        if ((i3 & 112) != i2) {
            this.l = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.n = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
