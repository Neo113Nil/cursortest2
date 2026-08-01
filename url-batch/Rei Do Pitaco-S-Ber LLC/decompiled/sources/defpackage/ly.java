package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ly {
    public final /* synthetic */ int a;
    public final /* synthetic */ ny b;

    public /* synthetic */ ly(ny nyVar, int i) {
        this.a = i;
        this.b = nyVar;
    }

    public final int a(View view) {
        int right;
        int i;
        switch (this.a) {
            case 0:
                oy oyVar = (oy) view.getLayoutParams();
                right = view.getRight() + ((oy) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) oyVar).rightMargin;
                break;
            default:
                oy oyVar2 = (oy) view.getLayoutParams();
                right = view.getBottom() + ((oy) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) oyVar2).bottomMargin;
                break;
        }
        return right + i;
    }

    public final int b(View view) {
        int left;
        int i;
        switch (this.a) {
            case 0:
                oy oyVar = (oy) view.getLayoutParams();
                left = view.getLeft() - ((oy) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) oyVar).leftMargin;
                break;
            default:
                oy oyVar2 = (oy) view.getLayoutParams();
                left = view.getTop() - ((oy) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) oyVar2).topMargin;
                break;
        }
        return left - i;
    }

    public final int c() {
        int i;
        int E;
        int i2 = this.a;
        ny nyVar = this.b;
        switch (i2) {
            case 0:
                i = nyVar.n;
                E = nyVar.E();
                break;
            default:
                i = nyVar.o;
                E = nyVar.C();
                break;
        }
        return i - E;
    }

    public final int d() {
        int i = this.a;
        ny nyVar = this.b;
        switch (i) {
            case 0:
                return nyVar.D();
            default:
                return nyVar.F();
        }
    }
}
