package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC01554o {
    public static byte[] A0I;
    public static String[] A0J = {"NGwI4w5wjKKwr8vIXUEBgcadgt82Mvhc", "UEWVJJvMFTFlt7hH7ERCIJOXwkHPD", "VrTEPZjwbsMyuvHOm", "2WwBzOWctlsBfaK16SO", "SN9IkStz5", "kDHla2kaeJhueA2usdy0jZceB2KGO", "Oz8ehwpCKAgd43CqPtwSSE9zN5", "pRsAYaXPUkY6EiG3qKZOmbtQ8"};
    public int A00;
    public C4C A01;
    public AnonymousClass51 A02;
    public C0372Eb A03;
    public C5B A04;
    public C5B A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public boolean A0E;
    public boolean A0F;
    public final AnonymousClass59 A0G;
    public final AnonymousClass59 A0H;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        byte[] bArr = {-2, 33, 33, 34, 33, -35, 19, 38, 34, 52, -35, 37, Ascii.RS, 48, -35, Ascii.SI, 34, 32, 54, 32, 41, 34, 47, 19, 38, 34, 52, -35, Ascii.RS, 48, -35, 45, Ascii.RS, 47, 34, 43, 49, -35, Ascii.US, 50, 49, -35, 51, 38, 34, 52, -35, 38, 48, -35, 43, 44, 49, -35, Ascii.RS, -35, 47, 34, Ascii.RS, 41, -35, 32, 37, 38, 41, 33, -21, -35, Ascii.DC2, 43, 35, 38, 41, 49, 34, 47, 34, 33, -35, 38, 43, 33, 34, 53, -9, -35, -5, 8, 8, 9, Ascii.SO, -70, 7, 9, 16, -1, -70, -5, -70, -3, 2, 3, 6, -2, -70, 0, Ascii.FF, 9, 7, -70, 8, 9, 8, -57, -1, Ascii.DC2, 3, Ascii.CR, Ascii.SO, 3, 8, 1, -70, 3, 8, -2, -1, Ascii.DC2, -44};
        String[] strArr = A0J;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0J[6] = "kyP20liVKsmkdJ";
        A0I = bArr;
    }

    public abstract int A1d(int i, C01624w c01624w, AnonymousClass53 anonymousClass53);

    public abstract int A1e(int i, C01624w c01624w, AnonymousClass53 anonymousClass53);

    public abstract int A1f(AnonymousClass53 anonymousClass53);

    public abstract int A1g(AnonymousClass53 anonymousClass53);

    public abstract int A1h(AnonymousClass53 anonymousClass53);

    public abstract int A1i(AnonymousClass53 anonymousClass53);

    public abstract int A1j(AnonymousClass53 anonymousClass53);

    public abstract int A1k(AnonymousClass53 anonymousClass53);

    public abstract Parcelable A1l();

    public abstract View A1n(View view, int i, C01624w c01624w, AnonymousClass53 anonymousClass53);

    public abstract C01564p A1o();

    public abstract void A1p(int i);

    public abstract void A1q(int i, int i2, AnonymousClass53 anonymousClass53, InterfaceC01534m interfaceC01534m);

    public abstract void A1r(int i, InterfaceC01534m interfaceC01534m);

    public abstract void A1s(Parcelable parcelable);

    public abstract void A1u(C01624w c01624w, AnonymousClass53 anonymousClass53);

    public abstract void A1x(C0372Eb c0372Eb, AnonymousClass53 anonymousClass53, int i);

    public abstract boolean A1z();

    public abstract boolean A20();

    public abstract boolean A21();

    public abstract boolean A22();

    static {
        A08();
    }

    public AbstractC01554o() {
        C0907Zg c0907Zg = new C0907Zg(this);
        this.A0G = c0907Zg;
        C0906Zf c0906Zf = new C0906Zf(this);
        this.A0H = c0906Zf;
        this.A04 = new C5B(c0907Zg);
        this.A05 = new C5B(c0906Zf);
        this.A09 = false;
        this.A07 = false;
        this.A06 = false;
        this.A0F = true;
        this.A0E = true;
    }

    public static int A00(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        switch (mode) {
            case Integer.MIN_VALUE:
                int mode2 = Math.max(i2, i3);
                return Math.min(size, mode2);
            case 1073741824:
                return size;
            default:
                int mode3 = Math.max(i2, i3);
                return mode3;
        }
    }

    public static int A01(int i, int i2, int i3, int i4, boolean z) {
        int max = Math.max(0, i - i3);
        int i5 = 0;
        int resultMode = 0;
        if (z) {
            if (i4 >= 0) {
                i5 = i4;
                String[] strArr = A0J;
                String str = strArr[5];
                String str2 = strArr[1];
                int resultSize = str.length();
                int size = str2.length();
                if (resultSize != size) {
                    throw new RuntimeException();
                }
                A0J[6] = "ru0BYCJI67FO4KgBABZqajada";
                resultMode = 1073741824;
            } else if (i4 == -1) {
                switch (i2) {
                    case Integer.MIN_VALUE:
                    case 1073741824:
                        i5 = max;
                        resultMode = i2;
                        break;
                    case 0:
                        i5 = 0;
                        int resultSize2 = A0J[3].length();
                        if (resultSize2 == 28) {
                            resultMode = 0;
                            break;
                        } else {
                            A0J[7] = "Nw";
                            resultMode = 0;
                            break;
                        }
                }
            } else if (i4 == -2) {
                i5 = 0;
                resultMode = 0;
            }
        } else if (i4 >= 0) {
            i5 = i4;
            resultMode = 1073741824;
        } else if (i4 == -1) {
            i5 = max;
            resultMode = i2;
        } else if (i4 == -2) {
            i5 = max;
            resultMode = (i2 == Integer.MIN_VALUE || i2 == 1073741824) ? Integer.MIN_VALUE : 0;
        }
        int size2 = View.MeasureSpec.makeMeasureSpec(i5, resultMode);
        return size2;
    }

    private final int A02(View view) {
        return ((C01564p) view.getLayoutParams()).A03.bottom;
    }

    private final int A03(View view) {
        return ((C01564p) view.getLayoutParams()).A03.left;
    }

    private final int A04(View view) {
        return ((C01564p) view.getLayoutParams()).A03.right;
    }

    private final int A05(View view) {
        return ((C01564p) view.getLayoutParams()).A03.top;
    }

    private final int A06(C01624w c01624w, AnonymousClass53 anonymousClass53) {
        return 0;
    }

    private final void A09(int i) {
        A0C(i, A0t(i));
    }

    private final void A0A(int i) {
        View child = A0t(i);
        if (child != null) {
            this.A01.A0D(i);
        }
    }

    private final void A0B(int i, int i2) {
        View view = A0t(i);
        if (view != null) {
            A09(i);
            A0E(view, i2);
            return;
        }
        throw new IllegalArgumentException(A07(85, 44, 79) + i + this.A03.toString());
    }

    private void A0C(int i, View view) {
        this.A01.A0C(i);
    }

    private final void A0D(View view) {
        this.A01.A0F(view);
    }

    private final void A0E(View view, int i) {
        A0F(view, i, (C01564p) view.getLayoutParams());
    }

    private final void A0F(View view, int i, C01564p c01564p) {
        AnonymousClass56 A0F = C0372Eb.A0F(view);
        if (A0F.A0a()) {
            this.A03.A0t.A09(A0F);
        } else {
            C5E c5e = this.A03.A0t;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[0] = "mtQ3Ck4zhf6OC1ISSa3eadAcnNcPftbe";
            c5e.A0A(A0F);
        }
        this.A01.A0H(view, i, c01564p, A0F.A0a());
    }

    private void A0G(View view, int i, boolean z) {
        AnonymousClass56 A0F = C0372Eb.A0F(view);
        if (z || A0F.A0a()) {
            this.A03.A0t.A09(A0F);
        } else {
            this.A03.A0t.A0A(A0F);
        }
        C01564p c01564p = (C01564p) view.getLayoutParams();
        if (A0F.A0g() || A0F.A0b()) {
            if (A0F.A0b()) {
                A0F.A0S();
            } else {
                A0F.A0O();
            }
            this.A01.A0H(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            C0372Eb c0372Eb = this.A03;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[7] = "5ABI9jSeQ";
            if (parent == c0372Eb) {
                int currentIndex = this.A01.A07(view);
                if (i == -1) {
                    i = this.A01.A05();
                }
                if (currentIndex != -1) {
                    if (currentIndex != i) {
                        this.A03.A06.A0B(currentIndex, i);
                    }
                } else {
                    throw new IllegalStateException(A07(0, 85, 114) + this.A03.indexOfChild(view) + this.A03.A1H());
                }
            } else {
                this.A01.A0I(view, i, false);
                c01564p.A01 = true;
                AnonymousClass51 anonymousClass51 = this.A02;
                if (anonymousClass51 != null && anonymousClass51.A0F()) {
                    this.A02.A0C(view);
                }
            }
        }
        if (c01564p.A02) {
            A0F.A0H.invalidate();
            c01564p.A02 = false;
        }
    }

    private final void A0H(View view, Rect rect) {
        C0372Eb.A0o(view, rect);
    }

    private void A0J(C01624w c01624w, int i, View view) {
        AnonymousClass56 A0F = C0372Eb.A0F(view);
        if (A0F.A0f()) {
            return;
        }
        if (A0F.A0Z() && !A0F.A0a() && !this.A03.A04.A0A()) {
            A0A(i);
            c01624w.A0X(A0F);
        } else {
            A09(i);
            c01624w.A0S(view);
            this.A03.A0t.A0C(A0F);
        }
    }

    private final void A0K(C01624w c01624w, AnonymousClass53 anonymousClass53, AccessibilityEvent accessibilityEvent) {
        C0372Eb c0372Eb = this.A03;
        if (c0372Eb == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (A0J[6].length() == 1) {
            throw new RuntimeException();
        }
        String[] strArr = A0J;
        strArr[2] = "A1LbQwkKC8kdEmdjm";
        strArr[4] = "mpAFCzQjd";
        if (!c0372Eb.canScrollVertically(1) && !this.A03.canScrollVertically(-1) && !this.A03.canScrollHorizontally(-1) && !this.A03.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        if (A0J[7].length() != 8) {
            A0J[0] = "LKoEdNrfwYhRE769hHSL4lsoF7TmWWKx";
            if (this.A03.A04 == null) {
                return;
            }
        } else if (this.A03.A04 == null) {
            return;
        }
        accessibilityEvent.setItemCount(this.A03.A04.A0E());
    }

    private final void A0L(C01624w c01624w, AnonymousClass53 anonymousClass53, C01343s c01343s) {
        if (this.A03.canScrollVertically(-1) || this.A03.canScrollHorizontally(-1)) {
            c01343s.A0N(8192);
            c01343s.A0R(true);
        }
        if (this.A03.canScrollVertically(1) || this.A03.canScrollHorizontally(1)) {
            c01343s.A0N(4096);
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[2] = "WKK7ZU1nOyoZ4isR3";
            strArr2[4] = "S1xUaVTVF";
            c01343s.A0R(true);
        }
        C01313p collectionInfo = C01313p.A00(A0r(c01624w, anonymousClass53), A0q(c01624w, anonymousClass53), A0P(c01624w, anonymousClass53), A06(c01624w, anonymousClass53));
        c01343s.A0P(collectionInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(AnonymousClass51 anonymousClass51) {
        if (this.A02 == anonymousClass51) {
            this.A02 = null;
        }
    }

    private final boolean A0N() {
        AnonymousClass51 anonymousClass51 = this.A02;
        return anonymousClass51 != null && anonymousClass51.A0F();
    }

    public static boolean A0O(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        switch (mode) {
            case Integer.MIN_VALUE:
                if (size >= i) {
                }
                break;
            case 0:
                break;
            case 1073741824:
                if (size == i) {
                }
                break;
        }
        return false;
    }

    private final boolean A0P(C01624w c01624w, AnonymousClass53 anonymousClass53) {
        return false;
    }

    private final boolean A0Q(C01624w c01624w, AnonymousClass53 anonymousClass53, int i, Bundle bundle) {
        C0372Eb c0372Eb = this.A03;
        if (c0372Eb == null) {
            return false;
        }
        int i2 = 0;
        int i3 = 0;
        switch (i) {
            case 4096:
                if (c0372Eb.canScrollVertically(1)) {
                    i2 = (A0X() - A0g()) - A0d();
                }
                if (this.A03.canScrollHorizontally(1)) {
                    i3 = (A0h() - A0e()) - A0f();
                    break;
                }
                break;
            case 8192:
                if (c0372Eb.canScrollVertically(-1)) {
                    i2 = -((A0X() - A0g()) - A0d());
                }
                if (this.A03.canScrollHorizontally(-1)) {
                    i3 = -((A0h() - A0e()) - A0f());
                    break;
                }
                break;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        C0372Eb c0372Eb2 = this.A03;
        if (A0J[7].length() == 8) {
            throw new RuntimeException();
        }
        A0J[7] = "6TTpYbQ6a4";
        c0372Eb2.scrollBy(i3, i2);
        return true;
    }

    private final boolean A0R(C01624w c01624w, AnonymousClass53 anonymousClass53, View view, int i, Bundle bundle) {
        return false;
    }

    private boolean A0S(C0372Eb c0372Eb, int i, int i2) {
        View focusedChild = c0372Eb.getFocusedChild();
        if (focusedChild == null) {
            return false;
        }
        int parentBottom = A0e();
        int parentRight = A0g();
        int parentTop = A0h();
        int parentTop2 = parentTop - A0f();
        int parentLeft = A0X();
        int parentLeft2 = parentLeft - A0d();
        Rect rect = this.A03.A0p;
        A0H(focusedChild, rect);
        if (rect.left - i >= parentTop2 || rect.right - i <= parentBottom || rect.top - i2 >= parentLeft2 || rect.bottom - i2 <= parentRight) {
            return false;
        }
        if (A0J[3].length() == 28) {
            throw new RuntimeException();
        }
        A0J[0] = "D1nd79aIos3YYe4Hq7EzCaafqnQh2NEe";
        return true;
    }

    @Deprecated
    private final boolean A0T(C0372Eb c0372Eb, View view, View view2) {
        return A0N() || c0372Eb.A1q();
    }

    private int[] A0U(View view, Rect rect) {
        int[] iArr = new int[2];
        int offScreenRight = A0e();
        int offScreenTop = A0g();
        int dy = A0h() - A0f();
        int offScreenLeft = A0X() - A0d();
        int childBottom = (view.getLeft() + rect.left) - view.getScrollX();
        int childRight = (view.getTop() + rect.top) - view.getScrollY();
        int childTop = rect.width() + childBottom;
        int parentLeft = rect.height();
        int childLeft = Math.min(0, childBottom - offScreenRight);
        int parentBottom = Math.min(0, childRight - offScreenTop);
        int parentTop = Math.max(0, childTop - dy);
        int parentLeft2 = Math.max(0, (parentLeft + childRight) - offScreenLeft);
        if (A0a() == 1) {
            if (parentTop == 0) {
                parentTop = Math.max(childLeft, childTop - dy);
            }
        } else {
            parentTop = childLeft != 0 ? childLeft : Math.min(childBottom - offScreenRight, parentTop);
        }
        if (parentBottom == 0) {
            parentBottom = Math.min(childRight - offScreenTop, parentLeft2);
        }
        iArr[0] = parentTop;
        iArr[1] = parentBottom;
        if (A0J[0].charAt(31) == 'p') {
            throw new RuntimeException();
        }
        A0J[0] = "97vXAXgJ0WxvI5IvBZpOR2Ky1DZNuVnu";
        return iArr;
    }

    public final int A0V() {
        return -1;
    }

    public final int A0W() {
        C4C c4c = this.A01;
        if (c4c != null) {
            return c4c.A05();
        }
        return 0;
    }

    public final int A0X() {
        return this.A0A;
    }

    public final int A0Y() {
        return this.A0B;
    }

    public final int A0Z() {
        C0372Eb c0372Eb = this.A03;
        AbstractC01434c a = c0372Eb != null ? c0372Eb.getAdapter() : null;
        if (a != null) {
            return a.A0E();
        }
        return 0;
    }

    public final int A0a() {
        return C3T.A01(this.A03);
    }

    public final int A0b() {
        return C3T.A02(this.A03);
    }

    public final int A0c() {
        return C3T.A03(this.A03);
    }

    public final int A0d() {
        C0372Eb c0372Eb = this.A03;
        if (c0372Eb != null) {
            return c0372Eb.getPaddingBottom();
        }
        return 0;
    }

    public final int A0e() {
        C0372Eb c0372Eb = this.A03;
        if (c0372Eb != null) {
            return c0372Eb.getPaddingLeft();
        }
        return 0;
    }

    public final int A0f() {
        C0372Eb c0372Eb = this.A03;
        if (c0372Eb != null) {
            return c0372Eb.getPaddingRight();
        }
        return 0;
    }

    public final int A0g() {
        C0372Eb c0372Eb = this.A03;
        if (c0372Eb != null) {
            return c0372Eb.getPaddingTop();
        }
        return 0;
    }

    public final int A0h() {
        return this.A0C;
    }

    public final int A0i() {
        return this.A0D;
    }

    public final int A0j(View view) {
        return view.getBottom() + A02(view);
    }

    public final int A0k(View view) {
        return view.getLeft() - A03(view);
    }

    public final int A0l(View view) {
        Rect rect = ((C01564p) view.getLayoutParams()).A03;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int A0m(View view) {
        Rect rect = ((C01564p) view.getLayoutParams()).A03;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public final int A0n(View view) {
        return view.getRight() + A04(view);
    }

    public final int A0o(View view) {
        return view.getTop() - A05(view);
    }

    public final int A0p(View view) {
        return ((C01564p) view.getLayoutParams()).A00();
    }

    public int A0q(C01624w c01624w, AnonymousClass53 anonymousClass53) {
        C0372Eb c0372Eb = this.A03;
        if (c0372Eb == null || c0372Eb.A04 == null || !A20()) {
            return 1;
        }
        return this.A03.A04.A0E();
    }

    public int A0r(C01624w c01624w, AnonymousClass53 anonymousClass53) {
        C0372Eb c0372Eb = this.A03;
        if (c0372Eb == null || c0372Eb.A04 == null || !A21()) {
            return 1;
        }
        return this.A03.A04.A0E();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View A0s() {
        C0372Eb c0372Eb = this.A03;
        if (c0372Eb == null) {
            return null;
        }
        View focusedChild = c0372Eb.getFocusedChild();
        String[] strArr = A0J;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A0J[3] = "iiKud1wfkCloFGZ1U";
        if (focusedChild != null) {
            C4C c4c = this.A01;
            String[] strArr2 = A0J;
            if (strArr2[5].length() != strArr2[1].length()) {
                A0J[0] = "7ET4ZuKdeEmot2qkcvXky1gJdqYIXUUX";
                if (!c4c.A0K(focusedChild)) {
                    return focusedChild;
                }
            } else {
                A0J[7] = "xPYIlKgRfeB9qWlMIQGlIgoODb";
                if (c4c.A0K(focusedChild)) {
                }
            }
        }
        return null;
    }

    public final View A0t(int i) {
        C4C c4c = this.A01;
        if (c4c != null) {
            return c4c.A09(i);
        }
        return null;
    }

    public final View A0u(View view, int i) {
        return null;
    }

    public C01564p A0v(Context context, AttributeSet attributeSet) {
        return new C01564p(context, attributeSet);
    }

    public C01564p A0w(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C01564p) {
            return new C01564p((C01564p) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C01564p((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C01564p(layoutParams);
    }

    public final void A0x() {
        AnonymousClass51 anonymousClass51 = this.A02;
        if (anonymousClass51 != null) {
            anonymousClass51.A09();
        }
    }

    public final void A0y() {
        C0372Eb c0372Eb = this.A03;
        if (c0372Eb != null) {
            c0372Eb.requestLayout();
        }
    }

    public final void A0z(int i) {
        C0372Eb c0372Eb = this.A03;
        if (c0372Eb != null) {
            c0372Eb.A1T(i);
        }
    }

    public final void A10(int i) {
        C0372Eb c0372Eb = this.A03;
        if (c0372Eb != null) {
            c0372Eb.A1U(i);
        }
    }

    public final void A11(int i, int i2) {
        this.A0C = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.A0D = mode;
        if (mode == 0 && !C0372Eb.A1B) {
            this.A0C = 0;
        }
        this.A0A = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.A0B = mode2;
        if (mode2 == 0 && !C0372Eb.A1B) {
            this.A0A = 0;
        }
    }

    public final void A12(int i, int i2) {
        int A0W = A0W();
        if (A0W == 0) {
            this.A03.A1a(i, i2);
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int maxX = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < A0W; i5++) {
            View A0t = A0t(i5);
            Rect rect = this.A03.A0p;
            A0H(A0t, rect);
            int count = rect.left;
            if (count < i3) {
                i3 = rect.left;
            }
            int count2 = rect.right;
            if (count2 > maxY) {
                maxY = rect.right;
            }
            int count3 = rect.top;
            if (count3 < i4) {
                i4 = rect.top;
            }
            int count4 = rect.bottom;
            if (count4 > maxX) {
                maxX = rect.bottom;
            }
        }
        this.A03.A0p.set(i3, i4, maxY, maxX);
        String[] strArr = A0J;
        String str = strArr[2];
        String str2 = strArr[4];
        int minX = str.length();
        int count5 = str2.length();
        if (minX == count5) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[2] = "hT857kPIBtMq0qM94";
        strArr2[4] = "qfhhOTku3";
        A15(this.A03.A0p, i, i2);
    }

    public final void A13(int i, int i2) {
        this.A03.setMeasuredDimension(i, i2);
    }

    public final void A14(int i, C01624w c01624w) {
        View view = A0t(i);
        A0A(i);
        c01624w.A0T(view);
    }

    public void A15(Rect rect, int i, int i2) {
        int usedHeight = rect.width() + A0e() + A0f();
        int height = rect.height();
        int usedWidth = A0g();
        int i3 = height + usedWidth;
        int usedWidth2 = A0d();
        int width = i3 + usedWidth2;
        int usedWidth3 = A0c();
        int usedHeight2 = A00(i, usedHeight, usedWidth3);
        int usedWidth4 = A0b();
        A13(usedHeight2, A00(i2, width, usedWidth4));
    }

    public final void A16(View view) {
        A18(view, -1);
    }

    public final void A17(View view) {
        A19(view, -1);
    }

    public final void A18(View view, int i) {
        A0G(view, i, true);
    }

    public final void A19(View view, int i) {
        A0G(view, i, false);
    }

    public final void A1A(View view, int i, int i2) {
        C01564p c01564p = (C01564p) view.getLayoutParams();
        Rect A1D = this.A03.A1D(view);
        int i3 = i + A1D.left + A1D.right;
        int i4 = i2 + A1D.top + A1D.bottom;
        int A01 = A01(A0h(), A0i(), A0e() + A0f() + c01564p.leftMargin + c01564p.rightMargin + i3, c01564p.width, A20());
        int A0X = A0X();
        int A0Y = A0Y();
        int widthSpec = A0g();
        int A012 = A01(A0X, A0Y, widthSpec + A0d() + c01564p.topMargin + c01564p.bottomMargin + i4, c01564p.height, A21());
        if (A1W(view, A01, A012, c01564p)) {
            view.measure(A01, A012);
        }
    }

    public final void A1B(View view, int i, int i2, int i3, int i4) {
        C01564p c01564p = (C01564p) view.getLayoutParams();
        Rect rect = c01564p.A03;
        view.layout(rect.left + i + c01564p.leftMargin, rect.top + i2 + c01564p.topMargin, (i3 - rect.right) - c01564p.rightMargin, (i4 - rect.bottom) - c01564p.bottomMargin);
    }

    public final void A1C(View view, C01343s c01343s) {
        AnonymousClass56 A0F = C0372Eb.A0F(view);
        if (A0F != null && !A0F.A0a() && !this.A01.A0K(A0F.A0H)) {
            A1K(this.A03.A0r, this.A03.A0s, view, c01343s);
        }
    }

    public final void A1D(View view, C01624w c01624w) {
        A0D(view);
        c01624w.A0T(view);
    }

    public final void A1E(View view, boolean z, Rect rect) {
        Matrix matrix;
        if (z) {
            Rect rect2 = ((C01564p) view.getLayoutParams()).A03;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.A03 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.A03.A0q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            int floor = (int) Math.floor(rectF.left);
            int floor2 = (int) Math.floor(rectF.top);
            float f = rectF.right;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[7] = "WbBFuKAltYM";
            rect.set(floor, floor2, (int) Math.ceil(f), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void A1F(C01343s c01343s) {
        A0L(this.A03.A0r, this.A03.A0s, c01343s);
    }

    public final void A1G(C01624w c01624w) {
        int A0E = c01624w.A0E();
        for (int i = A0E - 1; i >= 0; i--) {
            View A0F = c01624w.A0F(i);
            AnonymousClass56 A0F2 = C0372Eb.A0F(A0F);
            if (!A0F2.A0f()) {
                A0F2.A0X(false);
                if (A0F2.A0c()) {
                    this.A03.removeDetachedView(A0F, false);
                }
                if (this.A03.A05 != null) {
                    this.A03.A05.A0K(A0F2);
                }
                A0F2.A0X(true);
                c01624w.A0R(A0F);
            }
        }
        c01624w.A0L();
        if (A0E > 0) {
            this.A03.invalidate();
        }
    }

    public final void A1H(C01624w c01624w) {
        int childCount = A0W();
        for (int i = childCount - 1; i >= 0; i--) {
            A0J(c01624w, i, A0t(i));
        }
    }

    public final void A1I(C01624w c01624w) {
        for (int A0W = A0W() - 1; A0W >= 0; A0W--) {
            if (!C0372Eb.A0F(A0t(A0W)).A0f()) {
                A14(A0W, c01624w);
            }
        }
    }

    public void A1J(C01624w c01624w, AnonymousClass53 anonymousClass53, int i, int i2) {
        this.A03.A1a(i, i2);
    }

    public void A1K(C01624w c01624w, AnonymousClass53 anonymousClass53, View view, C01343s c01343s) {
        int A0p = A21() ? A0p(view) : 0;
        int A0p2 = A20() ? A0p(view) : 0;
        String[] strArr = A0J;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A0J[3] = "h476R5jl";
        C01323q itemInfo = C01323q.A00(A0p, 1, A0p2, 1, false, false);
        c01343s.A0Q(itemInfo);
    }

    public final void A1L(AnonymousClass51 anonymousClass51) {
        AnonymousClass51 anonymousClass512 = this.A02;
        if (anonymousClass512 != null && anonymousClass51 != anonymousClass512 && anonymousClass512.A0F()) {
            this.A02.A09();
        }
        this.A02 = anonymousClass51;
        anonymousClass51.A0D(this.A03, this);
    }

    public void A1M(C0372Eb c0372Eb) {
    }

    public final void A1N(C0372Eb c0372Eb) {
        this.A07 = true;
    }

    public final void A1O(C0372Eb c0372Eb) {
        A11(View.MeasureSpec.makeMeasureSpec(c0372Eb.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c0372Eb.getHeight(), 1073741824));
    }

    public final void A1P(C0372Eb c0372Eb) {
        if (c0372Eb == null) {
            this.A03 = null;
            this.A01 = null;
            this.A0C = 0;
            this.A0A = 0;
        } else {
            this.A03 = c0372Eb;
            this.A01 = c0372Eb.A01;
            this.A0C = c0372Eb.getWidth();
            this.A0A = c0372Eb.getHeight();
        }
        this.A0D = 1073741824;
        this.A0B = 1073741824;
    }

    public final void A1Q(C0372Eb c0372Eb, C01624w c01624w) {
        this.A07 = false;
        A1w(c0372Eb, c01624w);
    }

    public final void A1R(boolean z) {
        this.A06 = z;
    }

    public final boolean A1S() {
        int A0W = A0W();
        for (int i = 0; i < A0W; i++) {
            ViewGroup.LayoutParams layoutParams = A0t(i).getLayoutParams();
            int childCount = layoutParams.width;
            if (childCount < 0) {
                int childCount2 = layoutParams.height;
                if (childCount2 < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A1T() {
        C0372Eb c0372Eb = this.A03;
        return c0372Eb != null && c0372Eb.A0B;
    }

    public final boolean A1U() {
        return this.A0E;
    }

    public final boolean A1V(int i, Bundle bundle) {
        return A0Q(this.A03.A0r, this.A03.A0s, i, bundle);
    }

    public final boolean A1W(View view, int i, int i2, C01564p c01564p) {
        return (!view.isLayoutRequested() && this.A0F && A0O(view.getWidth(), i, c01564p.width) && A0O(view.getHeight(), i2, c01564p.height)) ? false : true;
    }

    public final boolean A1X(View view, int i, Bundle bundle) {
        return A0R(this.A03.A0r, this.A03.A0s, view, i, bundle);
    }

    public boolean A1Y(C01564p c01564p) {
        return c01564p != null;
    }

    public final boolean A1Z(C0372Eb c0372Eb, View view, Rect rect, boolean z) {
        return A1a(c0372Eb, view, rect, z, false);
    }

    public final boolean A1a(C0372Eb c0372Eb, View view, Rect rect, boolean z, boolean z2) {
        int[] scrollAmount = A0U(view, rect);
        int i = scrollAmount[0];
        int i2 = scrollAmount[1];
        if ((z2 && !A0S(c0372Eb, i, i2)) || (i == 0 && i2 == 0)) {
            return false;
        }
        if (z) {
            c0372Eb.scrollBy(i, i2);
        } else {
            c0372Eb.A1c(i, i2);
        }
        return true;
    }

    public final boolean A1b(C0372Eb c0372Eb, AnonymousClass53 anonymousClass53, View view, View view2) {
        return A0T(c0372Eb, view, view2);
    }

    public final boolean A1c(C0372Eb c0372Eb, ArrayList<View> views, int i, int i2) {
        return false;
    }

    public View A1m(int i) {
        int A0W = A0W();
        for (int i2 = 0; i2 < A0W; i2++) {
            View child = A0t(i2);
            AnonymousClass56 A0F = C0372Eb.A0F(child);
            if (A0F != null) {
                int childCount = A0F.A0I();
                if (childCount == i && !A0F.A0f() && (this.A03.A0s.A07() || !A0F.A0a())) {
                    return child;
                }
            }
        }
        return null;
    }

    public void A1t(AccessibilityEvent accessibilityEvent) {
        A0K(this.A03.A0r, this.A03.A0s, accessibilityEvent);
    }

    public void A1v(AnonymousClass53 anonymousClass53) {
    }

    public void A1w(C0372Eb c0372Eb, C01624w c01624w) {
    }

    public void A1y(String str) {
        C0372Eb c0372Eb = this.A03;
        if (c0372Eb != null) {
            c0372Eb.A1l(str);
        }
    }
}
