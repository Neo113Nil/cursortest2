package g0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: g0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0169w extends U.g {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0169w(AbstractC0139I abstractC0139I, int i) {
        super(abstractC0139I);
        this.d = i;
    }

    @Override // U.g
    public final int b(View view) {
        switch (this.d) {
            case 0:
                C0140J c0140j = (C0140J) view.getLayoutParams();
                ((AbstractC0139I) this.f1175b).getClass();
                return view.getRight() + ((C0140J) view.getLayoutParams()).f2790b.right + ((ViewGroup.MarginLayoutParams) c0140j).rightMargin;
            default:
                C0140J c0140j2 = (C0140J) view.getLayoutParams();
                ((AbstractC0139I) this.f1175b).getClass();
                return view.getBottom() + ((C0140J) view.getLayoutParams()).f2790b.bottom + ((ViewGroup.MarginLayoutParams) c0140j2).bottomMargin;
        }
    }

    @Override // U.g
    public final int c(View view) {
        switch (this.d) {
            case 0:
                C0140J c0140j = (C0140J) view.getLayoutParams();
                ((AbstractC0139I) this.f1175b).getClass();
                return AbstractC0139I.A(view) + ((ViewGroup.MarginLayoutParams) c0140j).leftMargin + ((ViewGroup.MarginLayoutParams) c0140j).rightMargin;
            default:
                C0140J c0140j2 = (C0140J) view.getLayoutParams();
                ((AbstractC0139I) this.f1175b).getClass();
                return AbstractC0139I.z(view) + ((ViewGroup.MarginLayoutParams) c0140j2).topMargin + ((ViewGroup.MarginLayoutParams) c0140j2).bottomMargin;
        }
    }

    @Override // U.g
    public final int d(View view) {
        switch (this.d) {
            case 0:
                C0140J c0140j = (C0140J) view.getLayoutParams();
                ((AbstractC0139I) this.f1175b).getClass();
                return AbstractC0139I.z(view) + ((ViewGroup.MarginLayoutParams) c0140j).topMargin + ((ViewGroup.MarginLayoutParams) c0140j).bottomMargin;
            default:
                C0140J c0140j2 = (C0140J) view.getLayoutParams();
                ((AbstractC0139I) this.f1175b).getClass();
                return AbstractC0139I.A(view) + ((ViewGroup.MarginLayoutParams) c0140j2).leftMargin + ((ViewGroup.MarginLayoutParams) c0140j2).rightMargin;
        }
    }

    @Override // U.g
    public final int e(View view) {
        switch (this.d) {
            case 0:
                C0140J c0140j = (C0140J) view.getLayoutParams();
                ((AbstractC0139I) this.f1175b).getClass();
                return (view.getLeft() - ((C0140J) view.getLayoutParams()).f2790b.left) - ((ViewGroup.MarginLayoutParams) c0140j).leftMargin;
            default:
                C0140J c0140j2 = (C0140J) view.getLayoutParams();
                ((AbstractC0139I) this.f1175b).getClass();
                return (view.getTop() - ((C0140J) view.getLayoutParams()).f2790b.top) - ((ViewGroup.MarginLayoutParams) c0140j2).topMargin;
        }
    }

    @Override // U.g
    public final int f() {
        switch (this.d) {
            case 0:
                return ((AbstractC0139I) this.f1175b).f2787n;
            default:
                return ((AbstractC0139I) this.f1175b).f2788o;
        }
    }

    @Override // U.g
    public final int g() {
        switch (this.d) {
            case 0:
                AbstractC0139I abstractC0139I = (AbstractC0139I) this.f1175b;
                return abstractC0139I.f2787n - abstractC0139I.F();
            default:
                AbstractC0139I abstractC0139I2 = (AbstractC0139I) this.f1175b;
                return abstractC0139I2.f2788o - abstractC0139I2.D();
        }
    }

    @Override // U.g
    public final int h() {
        switch (this.d) {
            case 0:
                return ((AbstractC0139I) this.f1175b).F();
            default:
                return ((AbstractC0139I) this.f1175b).D();
        }
    }

    @Override // U.g
    public final int i() {
        switch (this.d) {
            case 0:
                return ((AbstractC0139I) this.f1175b).f2785l;
            default:
                return ((AbstractC0139I) this.f1175b).f2786m;
        }
    }

    @Override // U.g
    public final int j() {
        switch (this.d) {
            case 0:
                return ((AbstractC0139I) this.f1175b).f2786m;
            default:
                return ((AbstractC0139I) this.f1175b).f2785l;
        }
    }

    @Override // U.g
    public final int k() {
        switch (this.d) {
            case 0:
                return ((AbstractC0139I) this.f1175b).E();
            default:
                return ((AbstractC0139I) this.f1175b).G();
        }
    }

    @Override // U.g
    public final int l() {
        switch (this.d) {
            case 0:
                AbstractC0139I abstractC0139I = (AbstractC0139I) this.f1175b;
                return (abstractC0139I.f2787n - abstractC0139I.E()) - abstractC0139I.F();
            default:
                AbstractC0139I abstractC0139I2 = (AbstractC0139I) this.f1175b;
                return (abstractC0139I2.f2788o - abstractC0139I2.G()) - abstractC0139I2.D();
        }
    }

    @Override // U.g
    public final int n(View view) {
        switch (this.d) {
            case 0:
                AbstractC0139I abstractC0139I = (AbstractC0139I) this.f1175b;
                Rect rect = (Rect) this.f1176c;
                abstractC0139I.K(view, rect);
                return rect.right;
            default:
                AbstractC0139I abstractC0139I2 = (AbstractC0139I) this.f1175b;
                Rect rect2 = (Rect) this.f1176c;
                abstractC0139I2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // U.g
    public final int o(View view) {
        switch (this.d) {
            case 0:
                AbstractC0139I abstractC0139I = (AbstractC0139I) this.f1175b;
                Rect rect = (Rect) this.f1176c;
                abstractC0139I.K(view, rect);
                return rect.left;
            default:
                AbstractC0139I abstractC0139I2 = (AbstractC0139I) this.f1175b;
                Rect rect2 = (Rect) this.f1176c;
                abstractC0139I2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // U.g
    public final void p(int i) {
        switch (this.d) {
            case 0:
                ((AbstractC0139I) this.f1175b).O(i);
                break;
            default:
                ((AbstractC0139I) this.f1175b).P(i);
                break;
        }
    }
}
