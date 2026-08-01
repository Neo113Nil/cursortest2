package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class sm extends m60 {
    public final /* synthetic */ int u;

    @Override // defpackage.m60
    public final int A(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i;
        switch (this.u) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // defpackage.m60
    public final int C() {
        switch (this.u) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // defpackage.m60
    public final ViewPropertyAnimator D(View view, int i) {
        switch (this.u) {
            case 0:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }
}
