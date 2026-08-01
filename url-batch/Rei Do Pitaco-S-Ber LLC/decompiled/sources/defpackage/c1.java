package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class c1 extends xj {
    public final /* synthetic */ int o = 0;
    public final /* synthetic */ View p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.p = actionMenuItemView;
    }

    @Override // defpackage.xj
    public final b20 b() {
        e1 e1Var;
        int i = this.o;
        View view = this.p;
        switch (i) {
            case 0:
                d1 d1Var = ((ActionMenuItemView) view).r;
                if (d1Var == null || (e1Var = ((f1) d1Var).a.z) == null) {
                    return null;
                }
                return e1Var.a();
            default:
                e1 e1Var2 = ((h1) view).i.y;
                if (e1Var2 == null) {
                    return null;
                }
                return e1Var2.a();
        }
    }

    @Override // defpackage.xj
    public final boolean c() {
        b20 b;
        int i = this.o;
        View view = this.p;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                rs rsVar = actionMenuItemView.p;
                if (rsVar == null || !rsVar.a(actionMenuItemView.m) || (b = b()) == null || !b.b()) {
                }
                break;
            default:
                ((h1) view).i.n();
                break;
        }
        return true;
    }

    @Override // defpackage.xj
    public boolean d() {
        switch (this.o) {
            case 1:
                k1 k1Var = ((h1) this.p).i;
                if (k1Var.A != null) {
                    return false;
                }
                k1Var.d();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(h1 h1Var, h1 h1Var2) {
        super(h1Var2);
        this.p = h1Var;
    }
}
