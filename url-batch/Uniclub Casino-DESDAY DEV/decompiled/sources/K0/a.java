package K0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import q1.l;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f457a;

    /* renamed from: b, reason: collision with root package name */
    public final SideSheetBehavior f458b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f457a = i;
        this.f458b = sideSheetBehavior;
    }

    @Override // q1.l
    public final int E() {
        switch (this.f457a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f458b;
                return Math.max(0, sideSheetBehavior.f1753n + sideSheetBehavior.f1754o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f458b;
                return Math.max(0, (sideSheetBehavior2.f1752m - sideSheetBehavior2.f1751l) - sideSheetBehavior2.f1754o);
        }
    }

    @Override // q1.l
    public final int F() {
        switch (this.f457a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f458b;
                return (-sideSheetBehavior.f1751l) - sideSheetBehavior.f1754o;
            default:
                return this.f458b.f1752m;
        }
    }

    @Override // q1.l
    public final int J() {
        switch (this.f457a) {
            case 0:
                return this.f458b.f1754o;
            default:
                return this.f458b.f1752m;
        }
    }

    @Override // q1.l
    public final int K() {
        switch (this.f457a) {
            case 0:
                return -this.f458b.f1751l;
            default:
                return E();
        }
    }

    @Override // q1.l
    public final int L(View view) {
        switch (this.f457a) {
            case 0:
                return view.getRight() + this.f458b.f1754o;
            default:
                return view.getLeft() - this.f458b.f1754o;
        }
    }

    @Override // q1.l
    public final int M(CoordinatorLayout coordinatorLayout) {
        switch (this.f457a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // q1.l
    public final int O() {
        switch (this.f457a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // q1.l
    public final boolean T(float f2) {
        switch (this.f457a) {
            case 0:
                if (f2 > 0.0f) {
                }
                break;
            default:
                if (f2 < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // q1.l
    public final boolean V(View view) {
        switch (this.f457a) {
            case 0:
                if (view.getRight() < (E() - F()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (E() + this.f458b.f1752m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // q1.l
    public final boolean W(float f2, float f3) {
        switch (this.f457a) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f458b.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f458b.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // q1.l
    public final int j(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f457a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // q1.l
    public final float k(int i) {
        switch (this.f457a) {
            case 0:
                float F = F();
                return (i - F) / (E() - F);
            default:
                float f2 = this.f458b.f1752m;
                return (f2 - i) / (f2 - E());
        }
    }

    @Override // q1.l
    public final boolean s0(View view, float f2) {
        switch (this.f457a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f458b;
                float abs = Math.abs((f2 * sideSheetBehavior.f1750k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f458b;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f1750k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // q1.l
    public final void v0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f457a) {
            case 0:
                if (i <= this.f458b.f1752m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f458b.f1752m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }
}
