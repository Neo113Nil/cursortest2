package g0;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: g0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0139I f2773b;

    public /* synthetic */ C0137G(AbstractC0139I abstractC0139I, int i) {
        this.f2772a = i;
        this.f2773b = abstractC0139I;
    }

    public final int a(View view) {
        switch (this.f2772a) {
            case 0:
                C0140J c0140j = (C0140J) view.getLayoutParams();
                this.f2773b.getClass();
                return view.getRight() + ((C0140J) view.getLayoutParams()).f2790b.right + ((ViewGroup.MarginLayoutParams) c0140j).rightMargin;
            default:
                C0140J c0140j2 = (C0140J) view.getLayoutParams();
                this.f2773b.getClass();
                return view.getBottom() + ((C0140J) view.getLayoutParams()).f2790b.bottom + ((ViewGroup.MarginLayoutParams) c0140j2).bottomMargin;
        }
    }

    public final int b(View view) {
        switch (this.f2772a) {
            case 0:
                C0140J c0140j = (C0140J) view.getLayoutParams();
                this.f2773b.getClass();
                return (view.getLeft() - ((C0140J) view.getLayoutParams()).f2790b.left) - ((ViewGroup.MarginLayoutParams) c0140j).leftMargin;
            default:
                C0140J c0140j2 = (C0140J) view.getLayoutParams();
                this.f2773b.getClass();
                return (view.getTop() - ((C0140J) view.getLayoutParams()).f2790b.top) - ((ViewGroup.MarginLayoutParams) c0140j2).topMargin;
        }
    }

    public final int c() {
        switch (this.f2772a) {
            case 0:
                AbstractC0139I abstractC0139I = this.f2773b;
                return abstractC0139I.f2787n - abstractC0139I.F();
            default:
                AbstractC0139I abstractC0139I2 = this.f2773b;
                return abstractC0139I2.f2788o - abstractC0139I2.D();
        }
    }

    public final int d() {
        switch (this.f2772a) {
            case 0:
                return this.f2773b.E();
            default:
                return this.f2773b.G();
        }
    }
}
