package g0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: g0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134x extends U.g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0134x(I i, int i2) {
        super(i);
        this.d = i2;
    }

    @Override // U.g
    public final int b(View view) {
        switch (this.d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f817b).getClass();
                return view.getRight() + ((J) view.getLayoutParams()).f2352b.right + ((ViewGroup.MarginLayoutParams) j2).rightMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f817b).getClass();
                return view.getBottom() + ((J) view.getLayoutParams()).f2352b.bottom + ((ViewGroup.MarginLayoutParams) j3).bottomMargin;
        }
    }

    @Override // U.g
    public final int c(View view) {
        switch (this.d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f817b).getClass();
                return I.A(view) + ((ViewGroup.MarginLayoutParams) j2).leftMargin + ((ViewGroup.MarginLayoutParams) j2).rightMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f817b).getClass();
                return I.z(view) + ((ViewGroup.MarginLayoutParams) j3).topMargin + ((ViewGroup.MarginLayoutParams) j3).bottomMargin;
        }
    }

    @Override // U.g
    public final int d(View view) {
        switch (this.d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f817b).getClass();
                return I.z(view) + ((ViewGroup.MarginLayoutParams) j2).topMargin + ((ViewGroup.MarginLayoutParams) j2).bottomMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f817b).getClass();
                return I.A(view) + ((ViewGroup.MarginLayoutParams) j3).leftMargin + ((ViewGroup.MarginLayoutParams) j3).rightMargin;
        }
    }

    @Override // U.g
    public final int e(View view) {
        switch (this.d) {
            case 0:
                J j2 = (J) view.getLayoutParams();
                ((I) this.f817b).getClass();
                return (view.getLeft() - ((J) view.getLayoutParams()).f2352b.left) - ((ViewGroup.MarginLayoutParams) j2).leftMargin;
            default:
                J j3 = (J) view.getLayoutParams();
                ((I) this.f817b).getClass();
                return (view.getTop() - ((J) view.getLayoutParams()).f2352b.top) - ((ViewGroup.MarginLayoutParams) j3).topMargin;
        }
    }

    @Override // U.g
    public final int f() {
        switch (this.d) {
            case 0:
                return ((I) this.f817b).f2349n;
            default:
                return ((I) this.f817b).f2350o;
        }
    }

    @Override // U.g
    public final int g() {
        switch (this.d) {
            case 0:
                I i = (I) this.f817b;
                return i.f2349n - i.F();
            default:
                I i2 = (I) this.f817b;
                return i2.f2350o - i2.D();
        }
    }

    @Override // U.g
    public final int h() {
        switch (this.d) {
            case 0:
                return ((I) this.f817b).F();
            default:
                return ((I) this.f817b).D();
        }
    }

    @Override // U.g
    public final int i() {
        switch (this.d) {
            case 0:
                return ((I) this.f817b).f2347l;
            default:
                return ((I) this.f817b).f2348m;
        }
    }

    @Override // U.g
    public final int j() {
        switch (this.d) {
            case 0:
                return ((I) this.f817b).f2348m;
            default:
                return ((I) this.f817b).f2347l;
        }
    }

    @Override // U.g
    public final int k() {
        switch (this.d) {
            case 0:
                return ((I) this.f817b).E();
            default:
                return ((I) this.f817b).G();
        }
    }

    @Override // U.g
    public final int l() {
        switch (this.d) {
            case 0:
                I i = (I) this.f817b;
                return (i.f2349n - i.E()) - i.F();
            default:
                I i2 = (I) this.f817b;
                return (i2.f2350o - i2.G()) - i2.D();
        }
    }

    @Override // U.g
    public final int n(View view) {
        switch (this.d) {
            case 0:
                I i = (I) this.f817b;
                Rect rect = (Rect) this.f818c;
                i.K(view, rect);
                return rect.right;
            default:
                I i2 = (I) this.f817b;
                Rect rect2 = (Rect) this.f818c;
                i2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // U.g
    public final int o(View view) {
        switch (this.d) {
            case 0:
                I i = (I) this.f817b;
                Rect rect = (Rect) this.f818c;
                i.K(view, rect);
                return rect.left;
            default:
                I i2 = (I) this.f817b;
                Rect rect2 = (Rect) this.f818c;
                i2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // U.g
    public final void p(int i) {
        switch (this.d) {
            case 0:
                ((I) this.f817b).O(i);
                break;
            default:
                ((I) this.f817b).P(i);
                break;
        }
    }
}
