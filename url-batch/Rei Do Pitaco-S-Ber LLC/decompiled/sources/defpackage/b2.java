package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class b2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ f2 f;
    public final /* synthetic */ c2 g;

    public b2(c2 c2Var, f2 f2Var) {
        this.g = c2Var;
        this.f = f2Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        c2 c2Var = this.g;
        DialogInterface.OnClickListener onClickListener = c2Var.h;
        f2 f2Var = this.f;
        onClickListener.onClick(f2Var.b, i);
        if (c2Var.i) {
            return;
        }
        f2Var.b.dismiss();
    }
}
