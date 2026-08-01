package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class c8 implements d90 {
    public final boolean f;
    public final Object g;

    public c8(tg tgVar, boolean z) {
        this.g = tgVar;
        this.f = z;
    }

    public boolean a() {
        return this.f;
    }

    public boolean b(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (((tg) this.g) == null) {
            return a();
        }
        char c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            c8 c8Var = q40.a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c = 2;
                            break;
                    }
                }
                c = 0;
            }
            c = 1;
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return a();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    @Override // defpackage.d90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public db0 e(View view, db0 db0Var, e90 e90Var) {
        boolean z;
        boolean z2;
        ab0 ab0Var = db0Var.a;
        io h = ab0Var.h(519);
        io h2 = ab0Var.h(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.g;
        boolean z3 = bottomSheetBehavior.p;
        int i = h.b;
        int i2 = h.c;
        int i3 = h.a;
        bottomSheetBehavior.x = i;
        boolean z4 = true;
        boolean z5 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (z3) {
            int a = db0Var.a();
            bottomSheetBehavior.w = a;
            paddingBottom = a + e90Var.d;
        }
        if (bottomSheetBehavior.q) {
            paddingLeft = (z5 ? e90Var.c : e90Var.a) + i3;
        }
        if (bottomSheetBehavior.r) {
            paddingRight = (z5 ? e90Var.a : e90Var.c) + i2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.t || marginLayoutParams.leftMargin == i3) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i3;
            z = true;
        }
        if (bottomSheetBehavior.u && marginLayoutParams.rightMargin != i2) {
            marginLayoutParams.rightMargin = i2;
            z = true;
        }
        if (bottomSheetBehavior.v) {
            int i4 = marginLayoutParams.topMargin;
            int i5 = h.b;
            if (i4 != i5) {
                marginLayoutParams.topMargin = i5;
                if (z4) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z2 = this.f;
                if (z2) {
                    bottomSheetBehavior.n = h2.d;
                }
                if (z3 && !z2) {
                    return db0Var;
                }
                bottomSheetBehavior.L();
                return db0Var;
            }
        }
        z4 = z;
        if (z4) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z2 = this.f;
        if (z2) {
        }
        if (z3) {
        }
        bottomSheetBehavior.L();
        return db0Var;
    }

    public c8(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.g = bottomSheetBehavior;
        this.f = z;
    }
}
