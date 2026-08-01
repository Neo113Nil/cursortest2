package defpackage;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class v0 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ v0(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                ((o1) obj).a();
                break;
            case 1:
                f2 f2Var = (f2) obj;
                f2Var.v.obtainMessage(1, f2Var.b).sendToTarget();
                break;
            case 2:
                as asVar = (as) obj;
                int i2 = asVar.c0;
                if (i2 == 2) {
                    asVar.J(1);
                } else if (i2 == 1) {
                    asVar.J(2);
                }
                asVar.K(asVar.J);
                break;
            case 3:
                vs itemData = ((bu) view).getItemData();
                x7 x7Var = (x7) obj;
                boolean q = x7Var.R.a.q(itemData, x7Var.Q, 0);
                if (itemData != null && itemData.isCheckable()) {
                    if (!q || itemData.isChecked()) {
                        x7Var.setCheckedItem(itemData);
                        break;
                    }
                }
                break;
            default:
                m50 m50Var = ((Toolbar) obj).Q;
                vs vsVar = m50Var == null ? null : m50Var.g;
                if (vsVar != null) {
                    vsVar.collapseActionView();
                    break;
                }
                break;
        }
    }
}
