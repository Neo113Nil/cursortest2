package N0;

import F1.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f896e;

    /* renamed from: f, reason: collision with root package name */
    public final SideSheetBehavior f897f;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f896e = i;
        this.f897f = sideSheetBehavior;
    }

    @Override // F1.l
    public final int D() {
        switch (this.f896e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f897f;
                return Math.max(0, sideSheetBehavior.f2345n + sideSheetBehavior.f2346o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f897f;
                return Math.max(0, (sideSheetBehavior2.f2344m - sideSheetBehavior2.f2343l) - sideSheetBehavior2.f2346o);
        }
    }

    @Override // F1.l
    public final int E() {
        switch (this.f896e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f897f;
                return (-sideSheetBehavior.f2343l) - sideSheetBehavior.f2346o;
            default:
                return this.f897f.f2344m;
        }
    }

    @Override // F1.l
    public final int F() {
        switch (this.f896e) {
            case 0:
                return this.f897f.f2346o;
            default:
                return this.f897f.f2344m;
        }
    }

    @Override // F1.l
    public final int G() {
        switch (this.f896e) {
            case 0:
                return -this.f897f.f2343l;
            default:
                return D();
        }
    }

    @Override // F1.l
    public final int H(View view) {
        switch (this.f896e) {
            case 0:
                return view.getRight() + this.f897f.f2346o;
            default:
                return view.getLeft() - this.f897f.f2346o;
        }
    }

    @Override // F1.l
    public final int I(CoordinatorLayout coordinatorLayout) {
        switch (this.f896e) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // F1.l
    public final int J() {
        switch (this.f896e) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // F1.l
    public final boolean P(float f2) {
        switch (this.f896e) {
            case 0:
                if (f2 > RecyclerView.f1949A0) {
                }
                break;
            default:
                if (f2 < RecyclerView.f1949A0) {
                }
                break;
        }
        return false;
    }

    @Override // F1.l
    public final boolean R(View view) {
        switch (this.f896e) {
            case 0:
                if (view.getRight() < (D() - E()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (D() + this.f897f.f2344m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // F1.l
    public final boolean S(float f2, float f3) {
        switch (this.f896e) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f897f.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f897f.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // F1.l
    public final int e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f896e) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // F1.l
    public final float f(int i) {
        switch (this.f896e) {
            case 0:
                float E2 = E();
                return (i - E2) / (D() - E2);
            default:
                float f2 = this.f897f.f2344m;
                return (f2 - i) / (f2 - D());
        }
    }

    @Override // F1.l
    public final boolean m0(View view, float f2) {
        switch (this.f896e) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f897f;
                float abs = Math.abs((f2 * sideSheetBehavior.f2342k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f897f;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f2342k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // F1.l
    public final void q0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f896e) {
            case 0:
                if (i <= this.f897f.f2344m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f897f.f2344m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }
}
