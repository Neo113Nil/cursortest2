package com.meta.analytics.dsp.uinode;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$DecorView;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.google.android.material.card.MaterialCardViewHelper;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.3h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01233h extends ViewGroup {
    public static byte[] A0s;
    public static String[] A0t = {"Pb5dMBpLoD8olSqqN3M1wt71s6WfJWWx", "mawes8eGWKEfT5kg0DwbKE", "yCX0UAcI", "nBGVAWTalDrx8Q3Q0HTp4hPpqgaJoZ5h", "", "", "gKpLqM1fc4CgqUT7jB7tIrf4xsKdVFyY", "wKHjR3FqXT8StRIGs0zAAfuJmbbhub4H"};
    public static final int[] A0u;
    public static final Interpolator A0v;
    public static final C01223g A0w;
    public static final Comparator<C3Z> A0x;
    public int A00;
    public C3E A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public Drawable A0S;
    public Parcelable A0T;
    public VelocityTracker A0U;
    public EdgeEffect A0V;
    public EdgeEffect A0W;
    public Scroller A0X;
    public InterfaceC01183c A0Y;
    public C01203e A0Z;
    public ClassLoader A0a;
    public ArrayList<View> A0b;
    public List<ViewPager.OnAdapterChangeListener> A0c;
    public List<InterfaceC01183c> A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public final Rect A0o;
    public final C3Z A0p;
    public final Runnable A0q;
    public final ArrayList<C3Z> A0r;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private C3Z A03() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f = clientWidth > 0 ? this.A0M / clientWidth : 0.0f;
        int i = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean z = true;
        C3Z c3z = null;
        int i2 = 0;
        while (i2 < this.A0r.size()) {
            C3Z c3z2 = this.A0r.get(i2);
            if (!z && c3z2.A02 != i + 1) {
                c3z2 = this.A0p;
                c3z2.A00 = f2 + f3 + f;
                c3z2.A02 = i + 1;
                c3z2.A01 = this.A01.A00(c3z2.A02);
                i2--;
            }
            f2 = c3z2.A00;
            float f4 = c3z2.A01 + f2 + f;
            if (!z) {
                String[] strArr = A0t;
                if (strArr[4].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0t;
                strArr2[3] = "VrUwTTzuyHD2SkMMCenWDHvarMqbXCCI";
                strArr2[6] = "LX2NnyEsDXWEx3dFbPH8p7fzI1U1dTZ8";
                if (scrollX < f2) {
                    return c3z;
                }
            }
            if (scrollX >= f4) {
                int size = this.A0r.size() - 1;
                String[] strArr3 = A0t;
                if (strArr3[3].charAt(15) != strArr3[6].charAt(15)) {
                    A0t[2] = "sbP3P6ChvdnfvWI";
                    if (i2 != size) {
                        z = false;
                        i = c3z2.A02;
                        f3 = c3z2.A01;
                        c3z = c3z2;
                        i2++;
                    }
                } else {
                    A0t[1] = "kvGf4Zg53U8bz7GLeUNnCLzy4o";
                    if (i2 != size) {
                        z = false;
                        i = c3z2.A02;
                        f3 = c3z2.A01;
                        c3z = c3z2;
                        i2++;
                    }
                }
            }
            return c3z2;
        }
        return c3z;
    }

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0s, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0s = new byte[]{-99, -70, -69, -99, -62, -14, 3, 9, 7, Ascii.DC4, -62, 5, Ascii.SO, 3, Ascii.NAK, Ascii.NAK, -36, -62, -48, 0, 17, Ascii.ETB, Ascii.NAK, 34, -48, Ascii.EM, Ascii.DC4, -22, -48, -34, Ascii.SO, 48, 45, 32, 42, 35, 43, Ascii.US, 50, 39, 33, -34, Ascii.US, 34, Ascii.US, 46, 50, 35, 48, -8, -34, -30, 54, 49, 49, -30, 53, 47, 35, 46, 46, -3, -30, 38, 39, 40, 35, 55, 46, 54, 43, 48, 41, -30, 54, 49, -30, -66, -78, -8, 1, 7, 0, -10, -52, -78, -69, -39, -26, -26, -25, -20, -104, -39, -36, -36, -104, -24, -39, -33, -35, -22, -104, -36, -35, -37, -25, -22, -104, -18, -31, -35, -17, -104, -36, -19, -22, -31, -26, -33, -104, -28, -39, -15, -25, -19, -20, -10, 9, Ascii.NAK, Ascii.EM, 9, Ascii.ETB, Ascii.CAN, 9, 8, -60, 19, 10, 10, Ascii.ETB, 7, Ascii.SYN, 9, 9, Ascii.DC2, -60, Ascii.DC4, 5, Ascii.VT, 9, -60, 16, Ascii.CR, 17, Ascii.CR, Ascii.CAN, -60, -10, 10, 7, -62, 3, Ascii.DC2, Ascii.DC2, Ascii.SO, Ascii.VT, 5, 3, Ascii.SYN, Ascii.VT, 17, 16, -55, Ascii.NAK, -62, -14, 3, 9, 7, Ascii.DC4, -29, 6, 3, Ascii.DC2, Ascii.SYN, 7, Ascii.DC4, -62, 5, 10, 3, 16, 9, 7, 6, -62, Ascii.SYN, 10, 7, -62, 3, 6, 3, Ascii.DC2, Ascii.SYN, 7, Ascii.DC4, -55, Ascii.NAK, -62, 5, 17, 16, Ascii.SYN, 7, 16, Ascii.SYN, Ascii.NAK, -62, Ascii.EM, Ascii.VT, Ascii.SYN, 10, 17, Ascii.ETB, Ascii.SYN, -62, 5, 3, Ascii.SO, Ascii.SO, Ascii.VT, 16, 9, -62, -14, 3, 9, 7, Ascii.DC4, -29, 6, 3, Ascii.DC2, Ascii.SYN, 7, Ascii.DC4, -59, 16, 17, Ascii.SYN, Ascii.VT, 8, Ascii.ESC, -26, 3, Ascii.SYN, 3, -11, 7, Ascii.SYN, -27, 10, 3, 16, 9, 7, 6, -61, -62, -25, Ascii.SUB, Ascii.DC2, 7, 5, Ascii.SYN, 7, 6, -62, 3, 6, 3, Ascii.DC2, Ascii.SYN, 7, Ascii.DC4, -62, Ascii.VT, Ascii.SYN, 7, Ascii.SI, -62, 5, 17, Ascii.ETB, 16, Ascii.SYN, -36, -62, -19, 0, -4, Ascii.SO, -25, -8, -2, -4, 9, Ascii.EM, 42, 42, 39, 47, Ascii.VT, Ascii.ESC, 42, 39, 36, 36, -40, 44, 42, 33, Ascii.GS, Ascii.FS, -40, 44, 39, -40, Ascii.RS, 33, 38, Ascii.FS, -40, Ascii.RS, 39, Ascii.ESC, 45, 43, -40, Ascii.SUB, Ascii.EM, 43, Ascii.GS, Ascii.FS, -40, 39, 38, -40, 38, 39, 38, -27, Ascii.ESC, 32, 33, 36, Ascii.FS, -40, Ascii.ESC, 45, 42, 42, Ascii.GS, 38, 44, -40, Ascii.RS, 39, Ascii.ESC, 45, 43, Ascii.GS, Ascii.FS, -40, 46, 33, Ascii.GS, 47, -40, 76, 75, Ascii.RS, 65, 62, 77, 81, 66, 79, 32, 69, 62, 75, 68, 66, 65, 19, Ascii.DC2, -12, 5, Ascii.VT, 9, -9, 7, Ascii.SYN, 19, 16, 16, 9, 8, -60, 8, Ascii.CR, 8, -60, Ascii.DC2, 19, Ascii.CAN, -60, 7, 5, 16, 16, -60, Ascii.ETB, Ascii.EM, Ascii.DC4, 9, Ascii.SYN, 7, 16, 5, Ascii.ETB, Ascii.ETB, -60, Ascii.CR, 17, Ascii.DC4, 16, 9, 17, 9, Ascii.DC2, Ascii.CAN, 5, Ascii.CAN, Ascii.CR, 19, Ascii.DC2, 85, 83, 66, 79, 84, 71, 80, 83, 78, 49, 66, 72, 70};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final void A0J(int i, int i2, int i3) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.A0X;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.A0j ? this.A0X.getCurrX() : this.A0X.getStartX();
            this.A0X.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            A0R(false);
            A0f();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float A00 = i6 + (i6 * A00(Math.min(1.0f, (Math.abs(i4) * 1.0f) / clientWidth)));
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            float f = A00 / abs2;
            if (A0t[1].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0t;
            strArr[4] = "";
            strArr[5] = "";
            abs = Math.round(Math.abs(f) * 1000.0f) * 4;
        } else {
            abs = (int) ((1.0f + (Math.abs(i4) / (this.A0M + (clientWidth * this.A01.A00(this.A00))))) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.A0j = false;
        this.A0X.startScroll(scrollX, scrollY, i4, i5, min);
        C3T.A07(this);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        C3Z A07;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (A07 = A07(childAt)) != null && A07.A02 == this.A00) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C01163a c01163a;
        int i3;
        int i4;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.A0I = Math.min(measuredWidth / 10, this.A0E);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                this.A0B = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
                this.A0A = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                this.A0h = true;
                A0f();
                this.A0h = false;
                int childCount2 = getChildCount();
                for (int i6 = 0; i6 < childCount2; i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8 && ((c01163a = (C01163a) childAt.getLayoutParams()) == null || !c01163a.A05)) {
                        float f = paddingLeft;
                        String[] strArr = A0t;
                        if (strArr[4].length() == strArr[5].length()) {
                            A0t[1] = "11cm9STM7FlxGR3";
                            childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c01163a.A00), 1073741824), this.A0A);
                        }
                    }
                }
                return;
            }
            View childAt2 = getChildAt(i5);
            if (childAt2.getVisibility() != 8) {
                C01163a c01163a2 = (C01163a) childAt2.getLayoutParams();
                if (A0t[1].length() == 12) {
                    break;
                }
                String[] strArr2 = A0t;
                strArr2[4] = "";
                strArr2[5] = "";
                if (c01163a2 != null && c01163a2.A05) {
                    int i7 = c01163a2.A04 & 7;
                    int i8 = c01163a2.A04 & 112;
                    int i9 = Integer.MIN_VALUE;
                    int i10 = Integer.MIN_VALUE;
                    boolean z = i8 == 48 || i8 == 80;
                    boolean z2 = i7 == 3 || i7 == 5;
                    if (z) {
                        i9 = 1073741824;
                    } else if (z2) {
                        i10 = 1073741824;
                    }
                    if (c01163a2.width != -2) {
                        i9 = 1073741824;
                        i3 = c01163a2.width != -1 ? c01163a2.width : paddingLeft;
                    } else {
                        i3 = paddingLeft;
                    }
                    if (c01163a2.height != -2) {
                        i10 = 1073741824;
                        if (c01163a2.height != -1) {
                            i4 = c01163a2.height;
                            if (A0t[1].length() != 12) {
                                A0t[1] = "VKsSzAx6pk9J5wmYrW5ACp";
                            }
                        } else {
                            i4 = measuredHeight;
                        }
                    } else {
                        i4 = measuredHeight;
                    }
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i3, i9), View.MeasureSpec.makeMeasureSpec(i4, i10));
                    if (z) {
                        measuredHeight -= childAt2.getMeasuredHeight();
                    } else if (z2) {
                        paddingLeft -= childAt2.getMeasuredWidth();
                    }
                }
            }
            i5++;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C3E c3e;
        if (this.A0f) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (c3e = this.A01) == null || c3e.A01() == 0) {
            return false;
        }
        if (this.A0U == null) {
            this.A0U = VelocityTracker.obtain();
        }
        this.A0U.addMovement(motionEvent);
        boolean z = false;
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.A0X.abortAnimation();
                this.A0m = false;
                A0f();
                float x = motionEvent.getX();
                this.A03 = x;
                this.A05 = x;
                float y = motionEvent.getY();
                this.A04 = y;
                this.A06 = y;
                this.A08 = motionEvent.getPointerId(0);
                break;
            case 1:
                if (this.A0i) {
                    VelocityTracker velocityTracker = this.A0U;
                    velocityTracker.computeCurrentVelocity(1000, this.A0J);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.A08);
                    this.A0m = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    C3Z A03 = A03();
                    A0O(A01(A03.A02, ((scrollX / clientWidth) - A03.A00) / (A03.A01 + (this.A0M / clientWidth)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.A08)) - this.A03)), true, true, xVelocity);
                    z = A0U();
                    break;
                }
                break;
            case 2:
                if (!this.A0i) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.A08);
                    if (findPointerIndex == -1) {
                        z = A0U();
                        break;
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.A05);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.A06);
                        if (abs > this.A0R && abs > abs2) {
                            this.A0i = true;
                            A0T(true);
                            float f = this.A03;
                            this.A05 = x2 - f > 0.0f ? f + this.A0R : f - this.A0R;
                            this.A06 = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.A0i) {
                    z = false | A0X(motionEvent.getX(motionEvent.findPointerIndex(this.A08)));
                    break;
                }
                break;
            case 3:
                if (this.A0i) {
                    A0M(this.A00, true, 0, false);
                    z = A0U();
                    break;
                }
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.A05 = motionEvent.getX(actionIndex);
                this.A08 = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                A0P(motionEvent);
                this.A05 = motionEvent.getX(motionEvent.findPointerIndex(this.A08));
                break;
        }
        if (z) {
            C3T.A07(this);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.ads.redexgen.X.3g] */
    static {
        A0C();
        A0u = new int[]{R.attr.layout_gravity};
        A0x = new Comparator<C3Z>() { // from class: com.facebook.ads.redexgen.X.3V
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(C3Z c3z, C3Z c3z2) {
                return c3z.A02 - c3z2.A02;
            }
        };
        A0v = new Interpolator() { // from class: com.facebook.ads.redexgen.X.3W
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
        A0w = new Comparator<View>() { // from class: com.facebook.ads.redexgen.X.3g
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(View view, View view2) {
                C01163a c01163a = (C01163a) view.getLayoutParams();
                C01163a c01163a2 = (C01163a) view2.getLayoutParams();
                if (c01163a.A05 != c01163a2.A05) {
                    return c01163a.A05 ? 1 : -1;
                }
                return c01163a.A02 - c01163a2.A02;
            }
        };
    }

    public C01233h(Context context) {
        super(context);
        this.A0r = new ArrayList<>();
        this.A0p = new C3Z();
        this.A0o = new Rect();
        this.A0O = -1;
        this.A0T = null;
        this.A0a = null;
        this.A02 = -3.4028235E38f;
        this.A07 = Float.MAX_VALUE;
        this.A0L = 1;
        this.A08 = -1;
        this.A0g = true;
        this.A0l = false;
        this.A0q = new Runnable() { // from class: com.facebook.ads.redexgen.X.3X
            @Override // java.lang.Runnable
            public final void run() {
                C01233h.this.setScrollState(0);
                C01233h.this.A0f();
            }
        };
        this.A0P = 0;
        A0D();
    }

    private final float A00(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private int A01(int i, float f, int i2, int i3) {
        if (Math.abs(i3) > this.A0H && Math.abs(i2) > this.A0K) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            int targetPage = this.A00;
            float truncator = i >= targetPage ? 0.4f : 0.6f;
            i = ((int) (f + truncator)) + i;
        }
        int targetPage2 = this.A0r.size();
        if (targetPage2 > 0) {
            C3Z lastItem = this.A0r.get(0);
            ArrayList<C3Z> arrayList = this.A0r;
            int targetPage3 = arrayList.size();
            C3Z c3z = arrayList.get(targetPage3 - 1);
            int i4 = lastItem.A02;
            int targetPage4 = c3z.A02;
            return Math.max(i4, Math.min(i, targetPage4));
        }
        return i;
    }

    private Rect A02(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C3Z A04(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            C3Z ii = this.A0r.get(i2);
            int i3 = ii.A02;
            if (i3 == i) {
                return ii;
            }
        }
        return null;
    }

    private final C3Z A05(int i, int i2) {
        C3Z c3z = new C3Z();
        c3z.A02 = i;
        c3z.A03 = this.A01.A04(this, i);
        c3z.A01 = this.A01.A00(i);
        if (i2 < 0 || i2 >= this.A0r.size()) {
            this.A0r.add(c3z);
        } else {
            this.A0r.add(i2, c3z);
        }
        return c3z;
    }

    private final C3Z A06(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return A07(view);
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C3Z A07(View view) {
        for (int i = 0; i < i; i++) {
            C3Z c3z = this.A0r.get(i);
            if (this.A01.A08(view, c3z.A03)) {
                return c3z;
            }
        }
        String[] strArr = A0t;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A0t[1] = "T6ty";
        return null;
    }

    private void A09() {
        this.A0i = false;
        this.A0k = false;
        VelocityTracker velocityTracker = this.A0U;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            String[] strArr = A0t;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0t[1] = "yoRarqzFlsm2scdQtgnfRphmjo";
            this.A0U = null;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0A() {
        int i = 0;
        while (i < i) {
            if (!((C01163a) getChildAt(i).getLayoutParams()).A05) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private void A0B() {
        if (this.A0F != 0) {
            ArrayList<View> arrayList = this.A0b;
            if (arrayList == null) {
                this.A0b = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.A0b.add(getChildAt(i));
            }
            Collections.sort(this.A0b, A0w);
        }
    }

    private final void A0D() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.A0X = new Scroller(context, A0v);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.A0R = viewConfiguration.getScaledPagingTouchSlop();
        this.A0K = (int) (400.0f * f);
        this.A0J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0V = new EdgeEffect(context);
        this.A0W = new EdgeEffect(context);
        this.A0H = (int) (25.0f * f);
        this.A0C = (int) (2.0f * f);
        this.A0E = (int) (16.0f * f);
        C3T.A0B(this, new C0925Zz(this));
        if (C3T.A00(this) == 0) {
            C3T.A09(this, 1);
        }
        C3T.A0C(this, new C0926a0(this));
    }

    private void A0E(int i) {
        List<InterfaceC01183c> list = this.A0d;
        if (list != null) {
            int i2 = list.size();
            for (int i3 = 0; i3 < i2; i3++) {
                this.A0d.get(i3);
            }
        }
    }

    private void A0F(int i) {
        List<InterfaceC01183c> list = this.A0d;
        if (list != null) {
            int i2 = list.size();
            for (int i3 = 0; i3 < i2; i3++) {
                this.A0d.get(i3);
            }
        }
    }

    private final void A0G(int i) {
        String hexString;
        C3Z c3z;
        C3Z c3z2;
        float f;
        C3Z ii;
        float leftWidthNeeded;
        C3Z curItem = null;
        int i2 = this.A00;
        if (i2 != i) {
            curItem = A04(i2);
            this.A00 = i;
        }
        if (this.A01 == null) {
            A0B();
            return;
        }
        if (this.A0m) {
            A0B();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i3 = this.A0L;
        int pos = Math.max(0, this.A00 - i3);
        int startPos = this.A01.A01();
        int endPos = Math.min(startPos - 1, this.A00 + i3);
        if (startPos == this.A0G) {
            C3Z c3z3 = null;
            if (A0t[2].length() != 14) {
                A0t[1] = "Tot0RAE";
                int pageLimit = 0;
                while (true) {
                    int curIndex = this.A0r.size();
                    if (pageLimit >= curIndex) {
                        break;
                    }
                    C3Z c3z4 = this.A0r.get(pageLimit);
                    int i4 = c3z4.A02;
                    int curIndex2 = this.A00;
                    if (i4 >= curIndex2) {
                        int i5 = c3z4.A02;
                        int curIndex3 = this.A00;
                        if (i5 == curIndex3) {
                            c3z3 = c3z4;
                        }
                    } else {
                        pageLimit++;
                    }
                }
                if (c3z3 == null && startPos > 0) {
                    int N = this.A00;
                    if (A0t[1].length() != 12) {
                        A0t[2] = "0";
                        c3z3 = A05(N, pageLimit);
                    } else {
                        String[] strArr = A0t;
                        strArr[4] = "";
                        strArr[5] = "";
                        c3z3 = A05(N, pageLimit);
                    }
                }
                if (c3z3 != null) {
                    float f2 = 0.0f;
                    int i6 = pageLimit - 1;
                    if (i6 >= 0) {
                        C3Z c3z5 = this.A0r.get(i6);
                        String[] strArr2 = A0t;
                        String str = strArr2[3];
                        String str2 = strArr2[6];
                        int charAt = str.charAt(15);
                        int curIndex4 = str2.charAt(15);
                        if (charAt != curIndex4) {
                            A0t[1] = "VNMCyWdkMCax4jTa2KYBa9F64T8dlp";
                            c3z2 = c3z5;
                        }
                    } else {
                        c3z2 = null;
                    }
                    int clientWidth = getClientWidth();
                    if (clientWidth <= 0) {
                        f = 0.0f;
                    } else {
                        float f3 = 2.0f - c3z3.A01;
                        int curIndex5 = getPaddingLeft();
                        f = f3 + (curIndex5 / clientWidth);
                    }
                    int curIndex6 = this.A00;
                    for (int itemIndex = curIndex6 - 1; itemIndex >= 0; itemIndex--) {
                        if (f2 >= f && itemIndex < pos) {
                            if (c3z2 == null) {
                                break;
                            }
                            int curIndex7 = c3z2.A02;
                            if (itemIndex == curIndex7 && !c3z2.A04) {
                                this.A0r.remove(i6);
                                this.A01.A07(this, itemIndex, c3z2.A03);
                                i6--;
                                pageLimit--;
                                c3z2 = i6 >= 0 ? this.A0r.get(i6) : null;
                            }
                        } else if (c3z2 != null && itemIndex == c3z2.A02) {
                            f2 += c3z2.A01;
                            String[] strArr3 = A0t;
                            if (strArr3[7].charAt(10) == strArr3[0].charAt(10)) {
                                String[] strArr4 = A0t;
                                strArr4[4] = "";
                                strArr4[5] = "";
                                i6--;
                                c3z2 = i6 >= 0 ? this.A0r.get(i6) : null;
                            }
                        } else {
                            f2 += A05(itemIndex, i6 + 1).A01;
                            pageLimit++;
                            c3z2 = i6 >= 0 ? this.A0r.get(i6) : null;
                        }
                    }
                    float f4 = c3z3.A01;
                    int i7 = pageLimit + 1;
                    if (f4 < 2.0f) {
                        int curIndex8 = this.A0r.size();
                        if (i7 < curIndex8) {
                            ii = this.A0r.get(i7);
                        } else {
                            ii = null;
                        }
                        if (clientWidth <= 0) {
                            leftWidthNeeded = 0.0f;
                        } else {
                            int curIndex9 = getPaddingRight();
                            float f5 = curIndex9;
                            float rightWidthNeeded = clientWidth;
                            String[] strArr5 = A0t;
                            String str3 = strArr5[4];
                            String str4 = strArr5[5];
                            int length = str3.length();
                            int curIndex10 = str4.length();
                            if (length != curIndex10) {
                                throw new RuntimeException();
                            }
                            String[] strArr6 = A0t;
                            strArr6[4] = "";
                            strArr6[5] = "";
                            leftWidthNeeded = (f5 / rightWidthNeeded) + 2.0f;
                        }
                        int curIndex11 = this.A00;
                        for (int i8 = curIndex11 + 1; i8 < startPos; i8++) {
                            if (f4 >= leftWidthNeeded && i8 > endPos) {
                                if (ii == null) {
                                    break;
                                }
                                int curIndex12 = ii.A02;
                                if (i8 == curIndex12 && !ii.A04) {
                                    this.A0r.remove(i7);
                                    this.A01.A07(this, i8, ii.A03);
                                    int curIndex13 = this.A0r.size();
                                    if (i7 < curIndex13) {
                                        C3Z ii2 = this.A0r.get(i7);
                                        ii = ii2;
                                    } else {
                                        ii = null;
                                    }
                                }
                            } else {
                                if (ii != null) {
                                    int curIndex14 = ii.A02;
                                    if (i8 == curIndex14) {
                                        f4 += ii.A01;
                                        i7++;
                                        int curIndex15 = this.A0r.size();
                                        if (i7 < curIndex15) {
                                            C3Z ii3 = this.A0r.get(i7);
                                            ii = ii3;
                                        } else {
                                            ii = null;
                                        }
                                    }
                                }
                                C3Z A05 = A05(i8, i7);
                                i7++;
                                f4 += A05.A01;
                                int curIndex16 = this.A0r.size();
                                if (i7 < curIndex16) {
                                    C3Z ii4 = this.A0r.get(i7);
                                    ii = ii4;
                                } else {
                                    ii = null;
                                }
                            }
                        }
                    }
                    A0Q(c3z3, pageLimit, curItem);
                }
                int N2 = getChildCount();
                for (int i9 = 0; i9 < N2; i9++) {
                    View childAt = getChildAt(i9);
                    C01163a c01163a = (C01163a) childAt.getLayoutParams();
                    c01163a.A01 = i9;
                    if (!c01163a.A05 && c01163a.A00 == 0.0f) {
                        C3Z A07 = A07(childAt);
                        String[] strArr7 = A0t;
                        String str5 = strArr7[7];
                        String str6 = strArr7[0];
                        int charAt2 = str5.charAt(10);
                        int curIndex17 = str6.charAt(10);
                        if (charAt2 != curIndex17) {
                            if (A07 == null) {
                            }
                            c01163a.A00 = A07.A01;
                            int curIndex18 = A07.A02;
                            c01163a.A02 = curIndex18;
                        } else {
                            A0t[1] = "EEa7ILjnbFiKaMBJBW0FEjvS9loAIL";
                            if (A07 == null) {
                            }
                            c01163a.A00 = A07.A01;
                            int curIndex182 = A07.A02;
                            c01163a.A02 = curIndex182;
                        }
                    }
                }
                A0B();
                String[] strArr8 = A0t;
                String str7 = strArr8[4];
                String resName = strArr8[5];
                if (str7.length() != resName.length()) {
                    throw new RuntimeException();
                }
                String[] strArr9 = A0t;
                strArr9[7] = "fAvJTe45YQ8jwRLJzle6w88GhXZAW5fe";
                strArr9[0] = "XHTmtVqtTM8ykl9XiQ4ZuPNQzfhQsr72";
                if (hasFocus()) {
                    View currentFocused = findFocus();
                    String[] strArr10 = A0t;
                    if (strArr10[3].charAt(15) == strArr10[6].charAt(15)) {
                        throw new RuntimeException();
                    }
                    String[] strArr11 = A0t;
                    strArr11[3] = "98nQxxcA6vj5924MyChW7mkeiNJnWKv2";
                    strArr11[6] = "ju5RZqhAYuaQhiOPGNIJcLOaoEeV3OP8";
                    if (currentFocused != null) {
                        c3z = A06(currentFocused);
                    } else {
                        c3z = null;
                    }
                    if (c3z == null || c3z.A02 != this.A00) {
                        for (int i10 = 0; i10 < getChildCount(); i10++) {
                            View childAt2 = getChildAt(i10);
                            C3Z A072 = A07(childAt2);
                            if (A072 != null && A072.A02 == this.A00 && childAt2.requestFocus(2)) {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            try {
                Resources resources = getResources();
                int curIndex19 = getId();
                hexString = resources.getResourceName(curIndex19);
            } catch (Resources.NotFoundException unused) {
                int curIndex20 = getId();
                hexString = Integer.toHexString(curIndex20);
                if (A0t[2].length() != 14) {
                    A0t[2] = "3cJ8G";
                }
            }
            StringBuilder sb = new StringBuilder();
            String resName2 = A08(158, Opcodes.D2I, 58);
            StringBuilder append = sb.append(resName2).append(this.A0G);
            String resName3 = A08(77, 9, 42);
            StringBuilder append2 = append.append(resName3).append(startPos);
            String resName4 = A08(18, 11, 72);
            StringBuilder append3 = append2.append(resName4).append(hexString);
            String resName5 = A08(4, 14, 58);
            StringBuilder append4 = append3.append(resName5).append(getClass());
            String resName6 = A08(29, 22, 86);
            throw new IllegalStateException(append4.append(resName6).append(this.A01.getClass()).toString());
        }
        throw new RuntimeException();
    }

    private void A0H(int i, float f, int i2) {
        List<InterfaceC01183c> list = this.A0d;
        if (list != null) {
            int i3 = list.size();
            for (int i4 = 0; i4 < i3; i4++) {
                this.A0d.get(i4);
            }
        }
    }

    private final void A0I(int childLeft, float f, int i) {
        int max;
        if (this.A0D > 0) {
            int hgrav = getScrollX();
            int width = getPaddingLeft();
            int paddingRight = getPaddingRight();
            if (A0t[1].length() != 12) {
                String[] strArr = A0t;
                strArr[3] = "hSwONVQ9BwzgmNPK4tziO3X6uj4eQvsQ";
                strArr[6] = "gKhZoL4mhYlFRC9fFMXnjqdiW6EOuKfZ";
                int paddingLeft = getWidth();
                int scrollX = getChildCount();
                for (int childCount = 0; childCount < scrollX; childCount++) {
                    View childAt = getChildAt(childCount);
                    C01163a c01163a = (C01163a) childAt.getLayoutParams();
                    if (c01163a.A05) {
                        int paddingRight2 = c01163a.A04;
                        switch (paddingRight2 & 7) {
                            case 1:
                                int paddingRight3 = childAt.getMeasuredWidth();
                                max = Math.max((paddingLeft - paddingRight3) / 2, width);
                                break;
                            case 2:
                            case 4:
                            default:
                                max = width;
                                break;
                            case 3:
                                max = width;
                                int paddingRight4 = childAt.getWidth();
                                width += paddingRight4;
                                break;
                            case 5:
                                int paddingRight5 = childAt.getMeasuredWidth();
                                max = (paddingLeft - paddingRight) - paddingRight5;
                                int paddingRight6 = childAt.getMeasuredWidth();
                                paddingRight += paddingRight6;
                                break;
                        }
                        int paddingRight7 = childAt.getLeft();
                        int i2 = (max + hgrav) - paddingRight7;
                        if (i2 != 0) {
                            childAt.offsetLeftAndRight(i2);
                        }
                    }
                }
            } else {
                throw new RuntimeException();
            }
        }
        A0H(childLeft, f, i);
        if (0 != 0) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt2 = getChildAt(i3);
                if (!((C01163a) childAt2.getLayoutParams()).A05) {
                    childAt2.getLeft();
                    getClientWidth();
                    throw new NullPointerException(A08(450, 13, 121));
                }
            }
        }
        this.A0e = true;
    }

    private void A0K(int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            ArrayList<C3Z> arrayList = this.A0r;
            String[] strArr = A0t;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0t[1] = "xS6wP2kv8Ukjp2mlI4OFB7EI";
            if (!arrayList.isEmpty()) {
                boolean isFinished = this.A0X.isFinished();
                if (A0t[1].length() == 12) {
                    throw new RuntimeException();
                }
                A0t[2] = "M3IvNYMGgF0qb538wmgDMK0nNkgqAt";
                if (!isFinished) {
                    this.A0X.setFinalX(getCurrentItem() * getClientWidth());
                    return;
                }
                int paddingLeft = ((i - getPaddingLeft()) - getPaddingRight()) + i3;
                int widthWithMargin = getPaddingLeft();
                int i5 = i2 - widthWithMargin;
                int widthWithMargin2 = getPaddingRight();
                int i6 = (i5 - widthWithMargin2) + i4;
                int widthWithMargin3 = getScrollX();
                int oldWidthWithMargin = (int) (paddingLeft * (widthWithMargin3 / i6));
                int widthWithMargin4 = getScrollY();
                scrollTo(oldWidthWithMargin, widthWithMargin4);
                return;
            }
        }
        C3Z ii = A04(this.A00);
        float scrollOffset = ii != null ? Math.min(ii.A00, this.A07) : 0.0f;
        int paddingLeft2 = (int) (((i - getPaddingLeft()) - getPaddingRight()) * scrollOffset);
        if (paddingLeft2 != getScrollX()) {
            A0R(false);
            scrollTo(paddingLeft2, getScrollY());
        }
    }

    private final void A0L(int i, boolean z) {
        this.A0m = false;
        A0N(i, z, false);
    }

    private void A0M(int i, boolean z, int i2, boolean z2) {
        C3Z A04 = A04(i);
        int i3 = 0;
        if (A04 != null) {
            i3 = (int) (getClientWidth() * Math.max(this.A02, Math.min(A04.A00, this.A07)));
        }
        int destX = A0t[2].length();
        if (destX == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A0t;
        strArr[3] = "qWyJthdIKprwmupmlWytZXkwKuTz6nwm";
        strArr[6] = "fDmSwMvEmt93O90vXMKXMmFP8biUMO95";
        if (z) {
            A0J(i3, 0, i2);
            if (z2) {
                A0E(i);
                return;
            }
            return;
        }
        if (z2) {
            A0E(i);
        }
        A0R(false);
        scrollTo(i3, 0);
        A0Z(i3);
    }

    private final void A0N(int i, boolean z, boolean z2) {
        A0O(i, z, z2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r7 < r5) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void A0O(int i, boolean z, boolean z2, int i2) {
        C3E c3e = this.A01;
        if (c3e == null || c3e.A01() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.A00 == i && this.A0r.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.A01.A01()) {
            i = this.A01.A01() - 1;
        }
        int i3 = this.A0L;
        int i4 = this.A00;
        if (i <= i4 + i3) {
            int i5 = i4 - i3;
            String[] strArr = A0t;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0t;
            strArr2[3] = "HdD8kb8A1NTv0LjA3C8pNf8B8Uhf5Rjf";
            strArr2[6] = "hEPxY7plOgAB5ujpSYVhyDABeqG0KedF";
        }
        for (int i6 = 0; i6 < this.A0r.size(); i6++) {
            this.A0r.get(i6).A04 = true;
        }
        boolean z3 = this.A00 != i;
        boolean dispatchSelected = this.A0g;
        if (dispatchSelected) {
            this.A00 = i;
            if (z3) {
                A0E(i);
            }
            requestLayout();
            return;
        }
        A0G(i);
        A0M(i, z, i2, z3);
    }

    private void A0P(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int pointerIndex = this.A08;
        if (pointerId == pointerIndex) {
            int i = actionIndex == 0 ? 1 : 0;
            this.A05 = motionEvent.getX(i);
            String[] strArr = A0t;
            String str = strArr[4];
            String str2 = strArr[5];
            int pointerId2 = str.length();
            int pointerIndex2 = str2.length();
            if (pointerId2 != pointerIndex2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0t;
            strArr2[4] = "";
            strArr2[5] = "";
            int pointerIndex3 = motionEvent.getPointerId(i);
            this.A08 = pointerIndex3;
            VelocityTracker velocityTracker = this.A0U;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:21:0x0051 */
    /* JADX WARN: Incorrect condition in loop: B:38:0x0095 */
    /* JADX WARN: Incorrect condition in loop: B:72:0x011f */
    /* JADX WARN: Incorrect condition in loop: B:86:0x015e */
    /* JADX WARN: Incorrect condition in loop: B:9:0x0024 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0Q(C3Z c3z, int i, C3Z c3z2) {
        float f;
        float f2;
        C3Z c3z3;
        C3Z c3z4;
        int A01 = this.A01.A01();
        int width = getClientWidth();
        if (width > 0) {
            int N = this.A0M;
            f = N / width;
        } else {
            f = 0.0f;
        }
        if (c3z2 != null) {
            int width2 = c3z2.A02;
            int N2 = c3z.A02;
            if (width2 < N2) {
                int i2 = 0;
                float f3 = c3z2.A00 + c3z2.A01 + f;
                int i3 = width2 + 1;
                while (i3 <= N) {
                    int N3 = this.A0r.size();
                    if (i2 >= N3) {
                        break;
                    }
                    C3Z c3z5 = this.A0r.get(i2);
                    while (true) {
                        c3z4 = c3z5;
                        int N4 = c3z4.A02;
                        if (i3 <= N4) {
                            break;
                        }
                        int N5 = this.A0r.size();
                        if (i2 >= N5 - 1) {
                            break;
                        }
                        i2++;
                        c3z5 = this.A0r.get(i2);
                    }
                    while (i3 < N) {
                        C3E c3e = this.A01;
                        if (A0t[2].length() == 14) {
                            throw new RuntimeException();
                        }
                        A0t[2] = "unjnr1JPHveRA3A";
                        f3 += c3e.A00(i3) + f;
                        i3++;
                    }
                    c3z4.A00 = f3;
                    f3 += c3z4.A01 + f;
                    i3++;
                }
            } else {
                int N6 = c3z.A02;
                if (width2 > N6) {
                    int N7 = this.A0r.size();
                    int i4 = N7 - 1;
                    float f4 = c3z2.A00;
                    int i5 = width2 - 1;
                    while (i5 >= N && i4 >= 0) {
                        C3Z c3z6 = this.A0r.get(i4);
                        while (true) {
                            c3z3 = c3z6;
                            int N8 = c3z3.A02;
                            if (i5 >= N8 || i4 <= 0) {
                                break;
                            }
                            i4--;
                            c3z6 = this.A0r.get(i4);
                        }
                        while (true) {
                            int i6 = c3z3.A02;
                            String[] strArr = A0t;
                            String str = strArr[4];
                            String str2 = strArr[5];
                            int width3 = str.length();
                            int N9 = str2.length();
                            if (width3 != N9) {
                                A0t[1] = "tUoZSKhLB59JJ";
                                if (i5 > i6) {
                                    f4 -= this.A01.A00(i5) + f;
                                    i5--;
                                }
                            } else {
                                A0t[2] = "eK1wjFwqyv9CJUk";
                                if (i5 > i6) {
                                    f4 -= this.A01.A00(i5) + f;
                                    i5--;
                                }
                            }
                        }
                        f4 -= c3z3.A01 + f;
                        c3z3.A00 = f4;
                        i5--;
                    }
                }
            }
        }
        int i7 = this.A0r.size();
        float offset = c3z.A00;
        int N10 = c3z.A02;
        int pos = N10 - 1;
        int N11 = c3z.A02;
        this.A02 = N11 == 0 ? c3z.A00 : -3.4028235E38f;
        int N12 = A01 - 1;
        if (c3z.A02 == N12) {
            f2 = (c3z.A00 + c3z.A01) - 1.0f;
        } else {
            f2 = Float.MAX_VALUE;
        }
        this.A07 = f2;
        int i8 = i - 1;
        while (i8 >= 0) {
            C3Z c3z7 = this.A0r.get(i8);
            while (pos > N) {
                offset -= this.A01.A00(pos) + f;
                pos--;
            }
            offset -= c3z7.A01 + f;
            c3z7.A00 = offset;
            int N13 = c3z7.A02;
            if (N13 == 0) {
                this.A02 = offset;
            }
            i8--;
            pos--;
        }
        float offset2 = c3z.A00;
        float offset3 = offset2 + c3z.A01 + f;
        int N14 = c3z.A02;
        int i9 = N14 + 1;
        int i10 = i + 1;
        while (i10 < i7) {
            C3Z c3z8 = this.A0r.get(i10);
            while (i9 < N) {
                offset3 += this.A01.A00(i9) + f;
                i9++;
            }
            int i11 = c3z8.A02;
            if (A0t[2].length() != 14) {
                String[] strArr2 = A0t;
                strArr2[3] = "LKMrFShf3NXE5XfaxsCGHUW3hns0S8Wh";
                strArr2[6] = "xptjAJKkekqR5TDnJjimQZvUd22mQJJ9";
                int N15 = A01 - 1;
                if (i11 != N15) {
                    c3z8.A00 = offset3;
                    offset3 += c3z8.A01 + f;
                    i10++;
                    i9++;
                }
                this.A07 = (c3z8.A01 + offset3) - 1.0f;
                c3z8.A00 = offset3;
                offset3 += c3z8.A01 + f;
                i10++;
                i9++;
            } else {
                int N16 = A01 - 1;
                if (i11 != N16) {
                    c3z8.A00 = offset3;
                    offset3 += c3z8.A01 + f;
                    i10++;
                    i9++;
                }
                this.A07 = (c3z8.A01 + offset3) - 1.0f;
                c3z8.A00 = offset3;
                offset3 += c3z8.A01 + f;
                i10++;
                i9++;
            }
        }
        this.A0l = false;
    }

    private void A0R(boolean z) {
        boolean z2 = this.A0P == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            boolean needPopulate = this.A0X.isFinished();
            if (!needPopulate) {
                this.A0X.abortAnimation();
                if (A0t[1].length() == 12) {
                    throw new RuntimeException();
                }
                A0t[1] = "La7";
                int scrollX = getScrollX();
                int oldX = getScrollY();
                int currX = this.A0X.getCurrX();
                int currY = this.A0X.getCurrY();
                if (scrollX != currX || oldX != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A0Z(currX);
                    }
                }
            }
        }
        this.A0m = false;
        for (int i = 0; i < this.A0r.size(); i++) {
            C3Z c3z = this.A0r.get(i);
            boolean needPopulate2 = c3z.A04;
            if (needPopulate2) {
                z2 = true;
                c3z.A04 = false;
            }
        }
        if (z2) {
            if (z) {
                C3T.A0D(this, this.A0q);
            } else {
                this.A0q.run();
            }
        }
    }

    private void A0S(boolean z) {
        int layerType;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (z) {
                layerType = this.A0N;
            } else {
                layerType = 0;
            }
            getChildAt(i).setLayerType(layerType, null);
        }
    }

    private void A0T(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean A0U() {
        this.A08 = -1;
        A09();
        this.A0V.onRelease();
        this.A0W.onRelease();
        return this.A0V.isFinished() || this.A0W.isFinished();
    }

    private final boolean A0V() {
        int i = this.A00;
        if (i > 0) {
            A0L(i - 1, true);
            return true;
        }
        return false;
    }

    private final boolean A0W() {
        C3E c3e = this.A01;
        if (c3e != null && this.A00 < c3e.A01() - 1) {
            A0L(this.A00 + 1, true);
            return true;
        }
        if (A0t[2].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A0t;
        strArr[7] = "AXA5EDUbYu85ntxkUdYhY3hIIlQIUQar";
        strArr[0] = "7HhQN1X94o8BEMOAnE9vO9t08zapWTmy";
        return false;
    }

    private boolean A0X(float f) {
        boolean z = false;
        float f2 = this.A05 - f;
        this.A05 = f;
        float scrollX = getScrollX() + f2;
        int clientWidth = getClientWidth();
        float f3 = clientWidth * this.A02;
        float deltaX = clientWidth;
        float deltaX2 = deltaX * this.A07;
        boolean rightAbsolute = true;
        boolean leftAbsolute = true;
        C3Z c3z = this.A0r.get(0);
        C3Z c3z2 = this.A0r.get(r1.size() - 1);
        if (c3z.A02 != 0) {
            rightAbsolute = false;
            float f4 = c3z.A00;
            if (A0t[1].length() == 12) {
                throw new RuntimeException();
            }
            A0t[1] = "a";
            f3 = f4 * clientWidth;
        }
        if (c3z2.A02 != this.A01.A01() - 1) {
            leftAbsolute = false;
            float deltaX3 = c3z2.A00;
            deltaX2 = deltaX3 * clientWidth;
        }
        if (scrollX < f3) {
            if (rightAbsolute) {
                this.A0V.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z = true;
            }
            scrollX = f3;
        } else if (scrollX > deltaX2) {
            if (leftAbsolute) {
                EdgeEffect edgeEffect = this.A0W;
                float abs = Math.abs(scrollX - deltaX2);
                float scrollX2 = clientWidth;
                String[] strArr = A0t;
                if (strArr[4].length() != strArr[5].length()) {
                    edgeEffect.onPull(abs / scrollX2);
                    z = true;
                } else {
                    A0t[1] = "TwKB2lBmR";
                    edgeEffect.onPull(abs / scrollX2);
                    z = true;
                }
            }
            scrollX = deltaX2;
        }
        this.A05 += scrollX - ((int) scrollX);
        scrollTo((int) scrollX, getScrollY());
        A0Z((int) scrollX);
        return z;
    }

    private final boolean A0Y(float f, float f2) {
        if (f >= this.A0I || f2 <= 0.0f) {
            if (f > getWidth() - this.A0I) {
                if (A0t[2].length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A0t;
                strArr[3] = "LoLbwLodEQ0RZhoADzk4YxqyeMxGbPNe";
                strArr[6] = "uXFtlpuRRgamX4n9Zkql1HjWorEkSQ7b";
                if (f2 < 0.0f) {
                }
            }
            return false;
        }
        return true;
    }

    private boolean A0Z(int i) {
        int size = this.A0r.size();
        String A08 = A08(397, 53, 60);
        if (size == 0) {
            if (this.A0g) {
                return false;
            }
            this.A0e = false;
            A0I(0, 0.0f, 0);
            String[] strArr = A0t;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0t[2] = "c3ramapljB1reDSufYjA";
            if (this.A0e) {
                return false;
            }
            throw new IllegalStateException(A08);
        }
        C3Z A03 = A03();
        int clientWidth = getClientWidth();
        int i2 = this.A0M;
        int currentPage = clientWidth + i2;
        int i3 = A03.A02;
        float f = ((i / clientWidth) - A03.A00) / (A03.A01 + (i2 / clientWidth));
        this.A0e = false;
        A0I(i3, f, (int) (currentPage * f));
        if (this.A0e) {
            return true;
        }
        throw new IllegalStateException(A08);
    }

    private final boolean A0a(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        } else if (findFocus != null) {
            boolean z = false;
            ViewParent parent = findFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent == this) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(A08(0, 4, 21)).append(parent2.getClass().getSimpleName());
                }
                Log.e(A08(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, 9, 47), A08(309, 72, 80) + sb.toString());
                findFocus = null;
            }
        }
        boolean z2 = false;
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        if (nextFocused != null && nextFocused != findFocus) {
            if (i == 17) {
                z2 = (findFocus == null || A02(this.A0o, nextFocused).left < A02(this.A0o, findFocus).left) ? nextFocused.requestFocus() : A0V();
            } else if (i == 66) {
                z2 = (findFocus == null || A02(this.A0o, nextFocused).left > A02(this.A0o, findFocus).left) ? nextFocused.requestFocus() : A0W();
            }
        } else if (i == 17 || i == 1) {
            z2 = A0V();
        } else if (i == 66 || i == 2) {
            z2 = A0W();
        }
        if (z2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z2;
    }

    private final boolean A0b(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                boolean handled = keyEvent.hasModifiers(2);
                if (handled) {
                    return A0V();
                }
                return A0a(17);
            case 22:
                boolean hasModifiers = keyEvent.hasModifiers(2);
                String[] strArr = A0t;
                if (strArr[4].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                A0t[1] = "lC1XoLB2bpdljamdt6Vm";
                if (hasModifiers) {
                    return A0W();
                }
                return A0a(66);
            case 61:
                boolean handled2 = keyEvent.hasNoModifiers();
                if (handled2) {
                    return A0a(2);
                }
                boolean handled3 = keyEvent.hasModifiers(1);
                if (!handled3) {
                    return false;
                }
                return A0a(1);
            default:
                return false;
        }
    }

    public static boolean A0c(View view) {
        return view.getClass().getAnnotation(ViewPager$DecorView.class) != null;
    }

    private final boolean A0d(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i4 = view.getScrollX();
            int count = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + i4 >= childAt.getLeft() && i2 + i4 < childAt.getRight() && i3 + count >= childAt.getTop() && i3 + count < childAt.getBottom()) {
                    int left = (i2 + i4) - childAt.getLeft();
                    int i5 = i3 + count;
                    if (A0t[1].length() == 12) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0t;
                    strArr[4] = "";
                    strArr[5] = "";
                    if (A0d(childAt, true, i, left, i5 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x002a */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0e() {
        boolean z;
        int newCurrItem;
        int adapterCount;
        int A01 = this.A01.A01();
        this.A0G = A01;
        int size = this.A0r.size();
        int adapterCount2 = this.A0L;
        if (size < (adapterCount2 * 2) + 1) {
            int adapterCount3 = this.A0r.size();
            if (adapterCount3 < A01) {
                z = true;
                int i = this.A00;
                boolean z2 = false;
                newCurrItem = 0;
                while (newCurrItem < adapterCount) {
                    C3Z c3z = this.A0r.get(newCurrItem);
                    int A02 = this.A01.A02(c3z.A03);
                    if (A02 != -1) {
                        if (A02 == -2) {
                            this.A0r.remove(newCurrItem);
                            newCurrItem--;
                            if (!z2) {
                                z2 = true;
                            }
                            this.A01.A07(this, c3z.A02, c3z.A03);
                            z = true;
                            int i2 = this.A00;
                            int adapterCount4 = c3z.A02;
                            if (i2 == adapterCount4) {
                                int adapterCount5 = A01 - 1;
                                i = Math.max(0, Math.min(this.A00, adapterCount5));
                                z = true;
                            }
                        } else {
                            int adapterCount6 = c3z.A02;
                            if (adapterCount6 != A02) {
                                int i3 = c3z.A02;
                                int adapterCount7 = this.A00;
                                if (i3 == adapterCount7) {
                                    i = A02;
                                }
                                c3z.A02 = A02;
                                z = true;
                            }
                        }
                    }
                    newCurrItem++;
                }
                Collections.sort(this.A0r, A0x);
                if (!z) {
                    int childCount = getChildCount();
                    for (int newCurrItem2 = 0; newCurrItem2 < childCount; newCurrItem2++) {
                        C01163a c01163a = (C01163a) getChildAt(newCurrItem2).getLayoutParams();
                        if (!c01163a.A05) {
                            c01163a.A00 = 0.0f;
                        }
                    }
                    A0N(i, false, true);
                    if (A0t[2].length() == 14) {
                        throw new RuntimeException();
                    }
                    A0t[2] = "iBz2AIJ6C";
                    requestLayout();
                    return;
                }
                return;
            }
        }
        z = false;
        int i4 = this.A00;
        boolean z22 = false;
        newCurrItem = 0;
        while (newCurrItem < adapterCount) {
        }
        Collections.sort(this.A0r, A0x);
        if (!z) {
        }
    }

    public final void A0f() {
        A0G(this.A00);
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0011 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C3Z A07;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < focusableCount; i3++) {
                View childAt = getChildAt(i3);
                int focusableCount = childAt.getVisibility();
                if (focusableCount == 0 && (A07 = A07(childAt)) != null) {
                    int descendantFocusability2 = A07.A02;
                    int focusableCount2 = this.A00;
                    if (descendantFocusability2 == focusableCount2) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if (descendantFocusability == 262144) {
            int focusableCount3 = arrayList.size();
            if (size != focusableCount3) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        int descendantFocusability3 = i2 & 1;
        if ((descendantFocusability3 != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C01163a c01163a = (C01163a) layoutParams;
        c01163a.A05 |= A0c(view);
        if (this.A0h) {
            if (c01163a == null || !c01163a.A05) {
                c01163a.A03 = true;
                if (A0t[2].length() == 14) {
                    throw new RuntimeException();
                }
                A0t[1] = "XL6oa3uLuKs2IOpHyjfCXdHiJnTalh";
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new IllegalStateException(A08(86, 41, 16));
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.A01 == null) {
            return false;
        }
        int width = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) width) * this.A02)) : i > 0 && scrollX < ((int) (((float) width) * this.A07));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C01163a) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.A0j = true;
        if (!this.A0X.isFinished() && this.A0X.computeScrollOffset()) {
            int scrollX = getScrollX();
            int y = getScrollY();
            int x = this.A0X.getCurrX();
            int oldY = this.A0X.getCurrY();
            if (scrollX != x || y != oldY) {
                scrollTo(x, oldY);
                if (!A0Z(x)) {
                    this.A0X.abortAnimation();
                    scrollTo(0, oldY);
                }
            }
            C3T.A07(this);
            return;
        }
        A0R(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || A0b(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C3Z A07;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int childCount2 = childAt.getVisibility();
            if (childCount2 == 0 && (A07 = A07(childAt)) != null) {
                int i2 = A07.A02;
                String[] strArr = A0t;
                String str = strArr[7];
                String str2 = strArr[0];
                int i3 = str.charAt(10);
                int childCount3 = str2.charAt(10);
                if (i3 != childCount3) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0t;
                strArr2[4] = "";
                strArr2[5] = "";
                int childCount4 = this.A00;
                if (i2 == childCount4 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r3.A01() > 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r3 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        r5 = r8.save();
        r4 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        r3 = getWidth();
        r8.rotate(270.0f);
        r1 = -r4;
        r8.translate(r1 + getPaddingTop(), r7.A02 * r3);
        r7.A0V.setSize(r4, r3);
        r0 = r7.A0V.draw(r8);
        r6 = false | r0;
        r8.restoreToCount(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        r0 = r7.A0W.isFinished();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        if (r0 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        r3 = r8.save();
        r5 = getWidth();
        r4 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        r8.rotate(90.0f);
        r8.translate(-getPaddingTop(), (-(r7.A07 + 1.0f)) * r5);
        r7.A0W.setSize(r4, r5);
        r0 = r7.A0W.draw(r8);
        r6 = r6 | r0;
        r8.restoreToCount(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e1, code lost:
    
        if (r3 == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z = false;
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            if (overScrollMode == 1) {
                C3E c3e = this.A01;
                String[] strArr = A0t;
                String str = strArr[7];
                String str2 = strArr[0];
                int overScrollMode2 = str.charAt(10);
                if (overScrollMode2 != str2.charAt(10)) {
                    throw new RuntimeException();
                }
                A0t[1] = "uCo1AgFx4bPu4bwpitwpleYcuNfeFds";
                if (c3e != null) {
                }
            }
            this.A0V.finish();
            this.A0W.finish();
            if (!z) {
                C3T.A07(this);
                return;
            }
            return;
        }
        boolean isFinished = this.A0V.isFinished();
        int overScrollMode3 = A0t[1].length();
        if (overScrollMode3 != 12) {
            A0t[1] = "sR19g1oBfMrUqPxbyG4ArbsnA";
        } else {
            String[] strArr2 = A0t;
            strArr2[4] = "";
            strArr2[5] = "";
        }
        if (!z) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0S;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C01163a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C01163a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C3E getAdapter() {
        return this.A01;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int result = this.A0F == 2 ? (i - 1) - i2 : i2;
        int index = ((C01163a) this.A0b.get(result).getLayoutParams()).A01;
        return index;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public int getCurrentItem() {
        return this.A00;
    }

    public int getOffscreenPageLimit() {
        return this.A0L;
    }

    public int getPageMargin() {
        return this.A0M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0g = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.A0q);
        Scroller scroller = this.A0X;
        if (scroller != null && !scroller.isFinished()) {
            this.A0X.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.A0M > 0 && this.A0S != null && this.A0r.size() > 0 && this.A01 != null) {
            int lastPos = getScrollX();
            int firstPos = getWidth();
            float f2 = this.A0M / firstPos;
            int i = 0;
            C3Z c3z = this.A0r.get(0);
            float f3 = c3z.A00;
            int size = this.A0r.size();
            int i2 = this.A0r.get(size - 1).A02;
            loop0: for (int itemIndex = c3z.A02; itemIndex < i2; itemIndex++) {
                while (itemIndex > c3z.A02 && i < size) {
                    i++;
                    C3Z c3z2 = this.A0r.get(i);
                    String[] strArr = A0t;
                    String str = strArr[7];
                    String str2 = strArr[0];
                    int scrollX = str.charAt(10);
                    if (scrollX != str2.charAt(10)) {
                        break loop0;
                    }
                    A0t[2] = "Qpfq";
                    c3z = c3z2;
                }
                if (itemIndex == c3z.A02) {
                    f = (c3z.A00 + c3z.A01) * firstPos;
                    f3 = c3z.A00 + c3z.A01 + f2;
                } else {
                    float A00 = this.A01.A00(itemIndex);
                    f = (f3 + A00) * firstPos;
                    f3 += A00 + f2;
                }
                if (this.A0M + f > lastPos) {
                    Drawable drawable = this.A0S;
                    int round = Math.round(f);
                    int i3 = this.A0Q;
                    int scrollX2 = Math.round(this.A0M + f);
                    drawable.setBounds(round, i3, scrollX2, this.A09);
                    Drawable drawable2 = this.A0S;
                    String[] strArr2 = A0t;
                    String str3 = strArr2[7];
                    String str4 = strArr2[0];
                    int scrollX3 = str3.charAt(10);
                    if (scrollX3 != str4.charAt(10)) {
                        A0t[1] = "";
                        drawable2.draw(canvas);
                    } else {
                        String[] strArr3 = A0t;
                        strArr3[4] = "";
                        strArr3[5] = "";
                        drawable2.draw(canvas);
                    }
                }
                int i4 = lastPos + firstPos;
                int scrollX4 = A0t[1].length();
                if (scrollX4 == 12) {
                    throw new RuntimeException();
                }
                A0t[1] = "DrXdt";
                if (f > i4) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            A0U();
            String[] strArr = A0t;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0t[2] = "iW5W";
            return false;
        }
        if (action != 0) {
            if (this.A0i) {
                return true;
            }
            if (this.A0k) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                this.A03 = x;
                this.A05 = x;
                float y = motionEvent.getY();
                this.A04 = y;
                this.A06 = y;
                this.A08 = motionEvent.getPointerId(0);
                this.A0k = false;
                this.A0j = true;
                this.A0X.computeScrollOffset();
                if (this.A0P != 2 || Math.abs(this.A0X.getFinalX() - this.A0X.getCurrX()) <= this.A0C) {
                    A0R(false);
                    this.A0i = false;
                    break;
                } else {
                    this.A0X.abortAnimation();
                    this.A0m = false;
                    A0f();
                    this.A0i = true;
                    A0T(true);
                    setScrollState(1);
                    break;
                }
                break;
            case 2:
                int i = this.A08;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float f2 = x2 - this.A05;
                    float abs = Math.abs(f2);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float y3 = Math.abs(y2 - this.A04);
                    if (f2 != 0.0f && !A0Y(this.A05, f2) && A0d(this, false, (int) f2, (int) x2, (int) y2)) {
                        this.A05 = x2;
                        this.A06 = y2;
                        this.A0k = true;
                        return false;
                    }
                    int i2 = this.A0R;
                    if (abs > i2 && 0.5f * abs > y3) {
                        this.A0i = true;
                        A0T(true);
                        setScrollState(1);
                        if (f2 <= 0.0f) {
                            f = this.A03 - this.A0R;
                        } else {
                            float f3 = this.A03;
                            int i3 = this.A0R;
                            String[] strArr2 = A0t;
                            if (strArr2[7].charAt(10) != strArr2[0].charAt(10)) {
                                f = f3 + i3;
                            } else {
                                String[] strArr3 = A0t;
                                strArr3[7] = "WpQimEPBWZ8vG05HKhTxshBMY3NNEur0";
                                strArr3[0] = "BEtp4ufX6D8x3OZlDxdpMoFh1oKQqP0t";
                                f = f3 + i3;
                            }
                        }
                        this.A05 = f;
                        this.A06 = y2;
                        setScrollingCacheEnabled(true);
                    } else if (y3 > i2) {
                        this.A0k = true;
                    }
                    if (this.A0i && A0X(x2)) {
                        C3T.A07(this);
                        break;
                    }
                }
                break;
            case 6:
                A0P(motionEvent);
                break;
        }
        VelocityTracker velocityTracker = this.A0U;
        if (A0t[2].length() != 14) {
            String[] strArr4 = A0t;
            strArr4[3] = "qZEBvpK5WM51NnTYZj9Wv9V85vPNkfCF";
            strArr4[6] = "8DoAZte0LwUXg2aXlHvSBWFBy3vUeqDy";
            if (velocityTracker == null) {
                this.A0U = VelocityTracker.obtain();
            }
            this.A0U.addMovement(motionEvent);
            return this.A0i;
        }
        throw new RuntimeException();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C3Z A07;
        int max;
        int count;
        int paddingLeft = getChildCount();
        int paddingRight = i3 - i;
        int i5 = i4 - i2;
        int scrollX = getPaddingLeft();
        int decorCount = getPaddingTop();
        int childLeft = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int hgrav = getScrollX();
        int paddingBottom2 = 0;
        int i6 = 0;
        while (true) {
            int i7 = 8;
            String[] strArr = A0t;
            String str = strArr[4];
            String str2 = strArr[5];
            int count2 = str.length();
            if (count2 == str2.length()) {
                A0t[1] = "";
                if (i6 < paddingLeft) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8) {
                        C01163a c01163a = (C01163a) childAt.getLayoutParams();
                        if (c01163a.A05) {
                            int count3 = c01163a.A04 & 7;
                            int childTop = c01163a.A04 & 112;
                            switch (count3) {
                                case 1:
                                    max = Math.max((paddingRight - childAt.getMeasuredWidth()) / 2, scrollX);
                                    break;
                                case 2:
                                case 4:
                                default:
                                    max = scrollX;
                                    break;
                                case 3:
                                    max = scrollX;
                                    scrollX += childAt.getMeasuredWidth();
                                    break;
                                case 5:
                                    int i8 = paddingRight - childLeft;
                                    int measuredWidth = childAt.getMeasuredWidth();
                                    String[] strArr2 = A0t;
                                    String str3 = strArr2[7];
                                    String str4 = strArr2[0];
                                    int count4 = str3.charAt(10);
                                    if (count4 == str4.charAt(10)) {
                                        A0t[1] = "51Hkg";
                                        max = i8 - measuredWidth;
                                        childLeft += childAt.getMeasuredWidth();
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                            switch (childTop) {
                                case 16:
                                    count = Math.max((i5 - childAt.getMeasuredHeight()) / 2, decorCount);
                                    break;
                                case 48:
                                    count = decorCount;
                                    decorCount += childAt.getMeasuredHeight();
                                    break;
                                case 80:
                                    int count5 = i5 - paddingBottom;
                                    count = count5 - childAt.getMeasuredHeight();
                                    paddingBottom += childAt.getMeasuredHeight();
                                    break;
                                default:
                                    count = decorCount;
                                    break;
                            }
                            int i9 = max + hgrav;
                            int width = i9 + childAt.getMeasuredWidth();
                            childAt.layout(i9, count, width, childAt.getMeasuredHeight() + count);
                            paddingBottom2++;
                        } else {
                            continue;
                        }
                    }
                    i6++;
                } else {
                    int paddingRight2 = (paddingRight - scrollX) - childLeft;
                    int i10 = 0;
                    while (i10 < paddingLeft) {
                        View childAt2 = getChildAt(i10);
                        if (childAt2.getVisibility() != i7) {
                            C01163a c01163a2 = (C01163a) childAt2.getLayoutParams();
                            if (!c01163a2.A05 && (A07 = A07(childAt2)) != null) {
                                int childWidth = scrollX + ((int) (paddingRight2 * A07.A00));
                                if (c01163a2.A03) {
                                    c01163a2.A03 = false;
                                    int widthSpec = View.MeasureSpec.makeMeasureSpec((int) (paddingRight2 * c01163a2.A00), 1073741824);
                                    childAt2.measure(widthSpec, View.MeasureSpec.makeMeasureSpec((i5 - decorCount) - paddingBottom, 1073741824));
                                }
                                int heightSpec = childAt2.getMeasuredWidth();
                                int widthSpec2 = childAt2.getMeasuredHeight();
                                int i11 = decorCount;
                                childAt2.layout(childWidth, i11, heightSpec + childWidth, widthSpec2 + i11);
                            }
                        }
                        i10++;
                        i7 = 8;
                    }
                    this.A0Q = decorCount;
                    this.A09 = i5 - paddingBottom;
                    this.A0D = paddingBottom2;
                    if (this.A0g) {
                        int i12 = this.A00;
                        z2 = false;
                        String[] strArr3 = A0t;
                        if (strArr3[4].length() != strArr3[5].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr4 = A0t;
                        strArr4[4] = "";
                        strArr4[5] = "";
                        A0M(i12, false, 0, false);
                    } else {
                        z2 = false;
                    }
                    this.A0g = z2;
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int end;
        int i2;
        C3Z A07;
        int i3 = getChildCount();
        int count = i & 2;
        if (count != 0) {
            end = 0;
            i2 = 1;
        } else {
            end = i3 - 1;
            i2 = -1;
            i3 = -1;
        }
        while (end != i3) {
            View child = getChildAt(end);
            int index = A0t[2].length();
            if (index == 14) {
                throw new RuntimeException();
            }
            String[] strArr = A0t;
            strArr[3] = "wvs0VrXDMEHK1ZrgMliCmQkmYIqFRPYZ";
            strArr[6] = "yeuyy9yC0QSIfk9tyj8D1No5khczL5F7";
            int count2 = child.getVisibility();
            if (count2 == 0 && (A07 = A07(child)) != null) {
                int index2 = A07.A02;
                int count3 = this.A00;
                if (index2 == count3 && child.requestFocus(i, rect)) {
                    return true;
                }
            }
            end += i2;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            Context context = getContext();
            String[] strArr = A0t;
            if (strArr[3].charAt(15) == strArr[6].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0t;
            strArr2[7] = "Ly8LvMv3iU8o2fiJAVqvd6K7Aqz3gZKY";
            strArr2[0] = "HcNmsPXina8Ul250FP3kUGj1pgK53N1r";
            classLoader = context.getClassLoader();
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(state instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState) state;
        super.onRestoreInstanceState(viewPager$SavedState.A02());
        if (this.A01 != null) {
            A0N(viewPager$SavedState.A00, false, true);
            return;
        }
        this.A0O = viewPager$SavedState.A00;
        this.A0T = viewPager$SavedState.A01;
        this.A0a = viewPager$SavedState.A02;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();
        ViewPager$SavedState ss = new ViewPager$SavedState(superState);
        ss.A00 = this.A00;
        C3E c3e = this.A01;
        if (c3e != null) {
            Parcelable superState2 = c3e.A03();
            ss.A01 = superState2;
        }
        Parcelable superState3 = new WrappedParcelable(ss);
        return superState3;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.A0M;
            A0K(i, i3, i5, i5);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.A0h) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0010 */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.facebook.ads.redexgen.X.3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAdapter(C3E c3e) {
        C3E c3e2 = this.A01;
        if (c3e2 != null) {
            c3e2.A06(null);
            for (int i = 0; i < i; i++) {
                C3Z c3z = this.A0r.get(i);
                this.A01.A07(this, c3z.A02, c3z.A03);
            }
            this.A0r.clear();
            A0A();
            this.A00 = 0;
            scrollTo(0, 0);
        }
        this.A01 = c3e;
        this.A0G = 0;
        if (c3e != null) {
            if (this.A0Z == null) {
                this.A0Z = new DataSetObserver() { // from class: com.facebook.ads.redexgen.X.3e
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        C01233h.this.A0e();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        C01233h.this.A0e();
                    }
                };
            }
            this.A01.A06(this.A0Z);
            this.A0m = false;
            boolean z = this.A0g;
            this.A0g = true;
            C3E oldAdapter = this.A01;
            this.A0G = oldAdapter.A01();
            if (this.A0O >= 0) {
                A0N(this.A0O, false, true);
                this.A0O = -1;
                this.A0T = null;
                this.A0a = null;
            } else if (!z) {
                A0f();
            } else {
                requestLayout();
            }
        }
        List<ViewPager.OnAdapterChangeListener> list = this.A0c;
        if (list != null && !list.isEmpty() && 0 < this.A0c.size()) {
            this.A0c.get(0);
            throw new NullPointerException(A08(381, 16, 117));
        }
    }

    public void setCurrentItem(int i) {
        this.A0m = false;
        A0N(i, !this.A0g, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w(A08(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, 9, 47), A08(127, 31, 60) + i + A08(51, 26, 90) + 1);
            i = 1;
        }
        if (i != this.A0L) {
            this.A0L = i;
            A0f();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC01183c interfaceC01183c) {
        this.A0Y = interfaceC01183c;
    }

    public void setPageMargin(int i) {
        int width = this.A0M;
        this.A0M = i;
        int oldMargin = getWidth();
        A0K(oldMargin, oldMargin, i, width);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(AbstractC01002k.A00(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.A0S = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.A0P == i) {
            return;
        }
        this.A0P = i;
        if (0 != 0) {
            A0S(i != 0);
        }
        A0F(i);
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.A0n != z) {
            this.A0n = z;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0S;
    }
}
