package P0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class a extends A.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f602e;

    /* renamed from: f, reason: collision with root package name */
    public final SideSheetBehavior f603f;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f602e = i;
        this.f603f = sideSheetBehavior;
    }

    @Override // A.c
    public final boolean B0(View view, float f2) {
        switch (this.f602e) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f603f;
                float abs = Math.abs((f2 * sideSheetBehavior.f1975k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f603f;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f1975k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // A.c
    public final void C0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f602e) {
            case 0:
                if (i <= this.f603f.f1977m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f603f.f1977m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }

    @Override // A.c
    public final int L() {
        switch (this.f602e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f603f;
                return Math.max(0, sideSheetBehavior.f1978n + sideSheetBehavior.f1979o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f603f;
                return Math.max(0, (sideSheetBehavior2.f1977m - sideSheetBehavior2.f1976l) - sideSheetBehavior2.f1979o);
        }
    }

    @Override // A.c
    public final int M() {
        switch (this.f602e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f603f;
                return (-sideSheetBehavior.f1976l) - sideSheetBehavior.f1979o;
            default:
                return this.f603f.f1977m;
        }
    }

    @Override // A.c
    public final int O() {
        switch (this.f602e) {
            case 0:
                return this.f603f.f1979o;
            default:
                return this.f603f.f1977m;
        }
    }

    @Override // A.c
    public final int P() {
        switch (this.f602e) {
            case 0:
                return -this.f603f.f1976l;
            default:
                return L();
        }
    }

    @Override // A.c
    public final int Q(View view) {
        switch (this.f602e) {
            case 0:
                return view.getRight() + this.f603f.f1979o;
            default:
                return view.getLeft() - this.f603f.f1979o;
        }
    }

    @Override // A.c
    public final int R(CoordinatorLayout coordinatorLayout) {
        switch (this.f602e) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // A.c
    public final int S() {
        switch (this.f602e) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // A.c
    public final boolean Z(float f2) {
        switch (this.f602e) {
            case 0:
                if (f2 > RecyclerView.f1570A0) {
                }
                break;
            default:
                if (f2 < RecyclerView.f1570A0) {
                }
                break;
        }
        return false;
    }

    @Override // A.c
    public final boolean c0(View view) {
        switch (this.f602e) {
            case 0:
                if (view.getRight() < (L() - M()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (L() + this.f603f.f1977m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // A.c
    public final boolean d0(float f2, float f3) {
        switch (this.f602e) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f603f.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f603f.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // A.c
    public final int g(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f602e) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // A.c
    public final float h(int i) {
        switch (this.f602e) {
            case 0:
                float M2 = M();
                return (i - M2) / (L() - M2);
            default:
                float f2 = this.f603f.f1977m;
                return (f2 - i) / (f2 - L());
        }
    }
}
