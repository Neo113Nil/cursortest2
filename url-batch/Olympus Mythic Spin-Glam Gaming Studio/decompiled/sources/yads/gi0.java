package yads;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.yandex.div.core.view2.Div2View;
import com.yandex.mobile.ads.R$style;

/* loaded from: classes4.dex */
public final class gi0 {
    public static boolean d;
    public final ug0 a;
    public final fi0 b;
    public final xg0 c;

    public gi0() {
        ug0 ug0Var = new ug0();
        fi0 fi0Var = new fi0(new di0(ug0Var));
        xg0 xg0Var = new xg0();
        this.a = ug0Var;
        this.b = fi0Var;
        this.c = xg0Var;
    }

    public final void a(Div2View div2View, final zb zbVar) {
        xg0 xg0Var = this.c;
        Context context = div2View.getContext();
        int i = R$style.MonetizationAdsInternal_FullscreenDialog;
        xg0Var.getClass();
        Dialog dialog = new Dialog(context, i);
        this.a.a(dialog);
        dialog.setContentView(div2View);
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: yads.gi0$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                gi0.a(zb.this, dialogInterface);
            }
        });
        wg0.a(dialog);
        d = true;
        if (zbVar != null) {
            zbVar.a(true);
        }
        dialog.show();
    }

    public static final void a(zb zbVar, DialogInterface dialogInterface) {
        d = false;
        if (zbVar != null) {
            zbVar.a(false);
        }
    }
}
