package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class z4 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ z4(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CharSequence convertSelectionToString;
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 0:
                b5 b5Var = (b5) obj;
                e5 e5Var = b5Var.L;
                e5Var.setSelection(i);
                if (e5Var.getOnItemClickListener() != null) {
                    e5Var.performItemClick(view, i, b5Var.I.getItemId(i));
                }
                b5Var.dismiss();
                break;
            default:
                jr jrVar = (jr) obj;
                jq jqVar = jrVar.j;
                convertSelectionToString = jrVar.convertSelectionToString(i < 0 ? !jqVar.E.isShowing() ? null : jqVar.h.getSelectedItem() : jrVar.getAdapter().getItem(i));
                jrVar.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = jrVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !jqVar.E.isShowing() ? null : jqVar.h.getSelectedView();
                        i = !jqVar.E.isShowing() ? -1 : jqVar.h.getSelectedItemPosition();
                        j = !jqVar.E.isShowing() ? Long.MIN_VALUE : jqVar.h.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(jqVar.h, view, i, j);
                }
                jqVar.dismiss();
                break;
        }
    }
}
