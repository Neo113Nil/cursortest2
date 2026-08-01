package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class bp extends g8 {
    public final /* synthetic */ int k;
    public final SideSheetBehavior l;

    public /* synthetic */ bp(SideSheetBehavior sideSheetBehavior, int i) {
        this.k = i;
        this.l = sideSheetBehavior;
    }

    @Override // defpackage.g8
    public final int B() {
        int i = this.k;
        SideSheetBehavior sideSheetBehavior = this.l;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.o);
        }
    }

    @Override // defpackage.g8
    public final int D() {
        int i = this.k;
        SideSheetBehavior sideSheetBehavior = this.l;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.g8
    public final int E() {
        int i = this.k;
        SideSheetBehavior sideSheetBehavior = this.l;
        switch (i) {
            case 0:
                return sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.g8
    public final int F() {
        switch (this.k) {
            case 0:
                return -this.l.l;
            default:
                return B();
        }
    }

    @Override // defpackage.g8
    public final int G(View view) {
        int i = this.k;
        SideSheetBehavior sideSheetBehavior = this.l;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.o;
            default:
                return view.getLeft() - sideSheetBehavior.o;
        }
    }

    @Override // defpackage.g8
    public final int K(CoordinatorLayout coordinatorLayout) {
        switch (this.k) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // defpackage.g8
    public final int L() {
        switch (this.k) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // defpackage.g8
    public final boolean S(float f) {
        switch (this.k) {
            case 0:
                if (f > 0.0f) {
                }
                break;
            default:
                if (f < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.g8
    public final boolean T(View view) {
        switch (this.k) {
            case 0:
                if (view.getRight() < (B() - D()) / 2) {
                    break;
                }
                break;
            default:
                if (view.getLeft() > (B() + this.l.m) / 2) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.g8
    public final boolean U(float f, float f2) {
        switch (this.k) {
            case 0:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500.0f) {
                }
                break;
            default:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500.0f) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.g8
    public final boolean g0(View view, float f) {
        int i = this.k;
        SideSheetBehavior sideSheetBehavior = this.l;
        switch (i) {
            case 0:
                if (Math.abs((f * sideSheetBehavior.k) + view.getLeft()) > 0.5f) {
                    break;
                }
                break;
            default:
                if (Math.abs((f * sideSheetBehavior.k) + view.getRight()) > 0.5f) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.g8
    public final int h(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.k) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.g8
    public final float i(int i) {
        switch (this.k) {
            case 0:
                float D = D();
                return (i - D) / (B() - D);
            default:
                float f = this.l.m;
                return (f - i) / (f - B());
        }
    }

    @Override // defpackage.g8
    public final void k0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.k;
        SideSheetBehavior sideSheetBehavior = this.l;
        switch (i3) {
            case 0:
                if (i <= sideSheetBehavior.m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i4 = sideSheetBehavior.m;
                if (i <= i4) {
                    marginLayoutParams.rightMargin = i4 - i;
                    break;
                }
                break;
        }
    }
}
