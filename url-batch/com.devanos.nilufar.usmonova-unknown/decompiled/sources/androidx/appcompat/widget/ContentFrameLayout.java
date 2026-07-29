package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import o.C0942e00;
import o.C1108gW;
import o.C1864s1;
import o.C2128w1;
import o.InterfaceC1248ie;
import o.InterfaceC1644og;
import o.LayoutInflaterFactory2C1213i5;
import o.MenuC0825cC;
import o.X4;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue h;
    public TypedValue i;
    public TypedValue j;
    public TypedValue k;
    public TypedValue l;
    public TypedValue m;
    public final Rect n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1248ie f5o;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.n = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.l == null) {
            this.l = new TypedValue();
        }
        return this.l;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.m == null) {
            this.m = new TypedValue();
        }
        return this.m;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.j == null) {
            this.j = new TypedValue();
        }
        return this.j;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.k == null) {
            this.k = new TypedValue();
        }
        return this.k;
    }

    public TypedValue getMinWidthMajor() {
        if (this.h == null) {
            this.h = new TypedValue();
        }
        return this.h;
    }

    public TypedValue getMinWidthMinor() {
        if (this.i == null) {
            this.i = new TypedValue();
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1248ie interfaceC1248ie = this.f5o;
        if (interfaceC1248ie != null) {
            interfaceC1248ie.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C2128w1 c2128w1;
        super.onDetachedFromWindow();
        InterfaceC1248ie interfaceC1248ie = this.f5o;
        if (interfaceC1248ie != null) {
            LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = ((X4) interfaceC1248ie).i;
            InterfaceC1644og interfaceC1644og = layoutInflaterFactory2C1213i5.y;
            if (interfaceC1644og != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1644og;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((C1108gW) actionBarOverlayLayout.l).a.h;
                if (actionMenuView != null && (c2128w1 = actionMenuView.A) != null) {
                    c2128w1.d();
                    C1864s1 c1864s1 = c2128w1.A;
                    if (c1864s1 != null && c1864s1.b()) {
                        c1864s1.i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C1213i5.D != null) {
                layoutInflaterFactory2C1213i5.s.getDecorView().removeCallbacks(layoutInflaterFactory2C1213i5.E);
                if (layoutInflaterFactory2C1213i5.D.isShowing()) {
                    try {
                        layoutInflaterFactory2C1213i5.D.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C1213i5.D = null;
            }
            C0942e00 c0942e00 = layoutInflaterFactory2C1213i5.F;
            if (c0942e00 != null) {
                c0942e00.b();
            }
            MenuC0825cC menuC0825cC = layoutInflaterFactory2C1213i5.y(0).h;
            if (menuC0825cC != null) {
                menuC0825cC.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int measuredWidth;
        TypedValue typedValue;
        int i5;
        int i6;
        float fraction;
        int i7;
        int i8;
        float fraction2;
        int i9;
        int i10;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Rect rect = this.n;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z3 ? this.k : this.j;
            if (typedValue2 != null && (i9 = typedValue2.type) != 0) {
                if (i9 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i9 == 6) {
                    int i11 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i11, i11);
                } else {
                    i10 = 0;
                    if (i10 > 0) {
                        i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i10 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z3 ? this.l : this.m;
                            if (typedValue3 != null && (i7 = typedValue3.type) != 0) {
                                if (i7 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i7 == 6) {
                                    int i12 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i12, i12);
                                } else {
                                    i8 = 0;
                                    if (i8 > 0) {
                                        i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                                        super.onMeasure(i3, i4);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z && mode == Integer.MIN_VALUE) {
                                            typedValue = !z3 ? this.i : this.h;
                                            if (typedValue != null && (i5 = typedValue.type) != 0) {
                                                if (i5 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i5 == 6) {
                                                    int i13 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i13, i13);
                                                } else {
                                                    i6 = 0;
                                                    if (i6 > 0) {
                                                        i6 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i6) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                                                        if (z2) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i4);
                                                        return;
                                                    }
                                                }
                                                i6 = (int) fraction;
                                                if (i6 > 0) {
                                                }
                                                if (measuredWidth < i6) {
                                                }
                                            }
                                        }
                                        z2 = false;
                                        if (z2) {
                                        }
                                    }
                                }
                                i8 = (int) fraction2;
                                if (i8 > 0) {
                                }
                            }
                        }
                        i4 = i2;
                        super.onMeasure(i3, i4);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z) {
                            if (!z3) {
                            }
                            if (typedValue != null) {
                                if (i5 != 5) {
                                }
                                i6 = (int) fraction;
                                if (i6 > 0) {
                                }
                                if (measuredWidth < i6) {
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                        }
                    }
                }
                i10 = (int) fraction3;
                if (i10 > 0) {
                }
            }
        }
        i3 = i;
        z = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i4 = i2;
        super.onMeasure(i3, i4);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z) {
        }
        z2 = false;
        if (z2) {
        }
    }

    public void setAttachListener(InterfaceC1248ie interfaceC1248ie) {
        this.f5o = interfaceC1248ie;
    }
}
