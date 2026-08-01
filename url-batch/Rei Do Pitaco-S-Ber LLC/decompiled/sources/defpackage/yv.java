package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class yv extends xg {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yv(ny nyVar, int i) {
        super(nyVar);
        this.d = i;
    }

    @Override // defpackage.xg
    public final int b(View view) {
        int right;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                oy oyVar = (oy) view.getLayoutParams();
                ((ny) obj).getClass();
                right = view.getRight() + ((oy) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) oyVar).rightMargin;
                break;
            default:
                oy oyVar2 = (oy) view.getLayoutParams();
                ((ny) obj).getClass();
                right = view.getBottom() + ((oy) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) oyVar2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // defpackage.xg
    public final int c(View view) {
        int A;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                oy oyVar = (oy) view.getLayoutParams();
                ((ny) obj).getClass();
                A = ny.A(view) + ((ViewGroup.MarginLayoutParams) oyVar).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) oyVar).rightMargin;
                break;
            default:
                oy oyVar2 = (oy) view.getLayoutParams();
                ((ny) obj).getClass();
                A = ny.z(view) + ((ViewGroup.MarginLayoutParams) oyVar2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) oyVar2).bottomMargin;
                break;
        }
        return A + i;
    }

    @Override // defpackage.xg
    public final int d(View view) {
        int z;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                oy oyVar = (oy) view.getLayoutParams();
                ((ny) obj).getClass();
                z = ny.z(view) + ((ViewGroup.MarginLayoutParams) oyVar).topMargin;
                i = ((ViewGroup.MarginLayoutParams) oyVar).bottomMargin;
                break;
            default:
                oy oyVar2 = (oy) view.getLayoutParams();
                ((ny) obj).getClass();
                z = ny.A(view) + ((ViewGroup.MarginLayoutParams) oyVar2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) oyVar2).rightMargin;
                break;
        }
        return z + i;
    }

    @Override // defpackage.xg
    public final int e(View view) {
        int left;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                oy oyVar = (oy) view.getLayoutParams();
                ((ny) obj).getClass();
                left = view.getLeft() - ((oy) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) oyVar).leftMargin;
                break;
            default:
                oy oyVar2 = (oy) view.getLayoutParams();
                ((ny) obj).getClass();
                left = view.getTop() - ((oy) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) oyVar2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // defpackage.xg
    public final int f() {
        switch (this.d) {
            case 0:
                return ((ny) this.b).n;
            default:
                return ((ny) this.b).o;
        }
    }

    @Override // defpackage.xg
    public final int g() {
        int i;
        int E;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ny nyVar = (ny) obj;
                i = nyVar.n;
                E = nyVar.E();
                break;
            default:
                ny nyVar2 = (ny) obj;
                i = nyVar2.o;
                E = nyVar2.C();
                break;
        }
        return i - E;
    }

    @Override // defpackage.xg
    public final int h() {
        switch (this.d) {
            case 0:
                return ((ny) this.b).E();
            default:
                return ((ny) this.b).C();
        }
    }

    @Override // defpackage.xg
    public final int i() {
        switch (this.d) {
            case 0:
                return ((ny) this.b).l;
            default:
                return ((ny) this.b).m;
        }
    }

    @Override // defpackage.xg
    public final int j() {
        switch (this.d) {
            case 0:
                return ((ny) this.b).m;
            default:
                return ((ny) this.b).l;
        }
    }

    @Override // defpackage.xg
    public final int k() {
        switch (this.d) {
            case 0:
                return ((ny) this.b).D();
            default:
                return ((ny) this.b).F();
        }
    }

    @Override // defpackage.xg
    public final int l() {
        int D;
        int E;
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                ny nyVar = (ny) obj;
                D = nyVar.n - nyVar.D();
                E = nyVar.E();
                break;
            default:
                ny nyVar2 = (ny) obj;
                D = nyVar2.o - nyVar2.F();
                E = nyVar2.C();
                break;
        }
        return D - E;
    }

    @Override // defpackage.xg
    public final int m(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((ny) obj2).J(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((ny) obj2).J(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // defpackage.xg
    public final int n(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((ny) obj2).J(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((ny) obj2).J(view, rect2);
                return rect2.top;
        }
    }

    @Override // defpackage.xg
    public final void o(int i) {
        switch (this.d) {
            case 0:
                ((ny) this.b).O(i);
                break;
            default:
                ((ny) this.b).P(i);
                break;
        }
    }
}
