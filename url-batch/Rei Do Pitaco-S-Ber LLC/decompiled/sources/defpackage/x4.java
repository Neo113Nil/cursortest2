package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class x4 implements d5, DialogInterface.OnClickListener {
    public h2 f;
    public y4 g;
    public CharSequence h;
    public final /* synthetic */ e5 i;

    public x4(e5 e5Var) {
        this.i = e5Var;
    }

    @Override // defpackage.d5
    public final boolean b() {
        h2 h2Var = this.f;
        if (h2Var != null) {
            return h2Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.d5
    public final int c() {
        return 0;
    }

    @Override // defpackage.d5
    public final void dismiss() {
        h2 h2Var = this.f;
        if (h2Var != null) {
            h2Var.dismiss();
            this.f = null;
        }
    }

    @Override // defpackage.d5
    public final Drawable e() {
        return null;
    }

    @Override // defpackage.d5
    public final void f(CharSequence charSequence) {
        this.h = charSequence;
    }

    @Override // defpackage.d5
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.d5
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.d5
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.d5
    public final void m(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.d5
    public final void n(int i, int i2) {
        if (this.g == null) {
            return;
        }
        e5 e5Var = this.i;
        g2 g2Var = new g2(e5Var.getPopupContext());
        c2 c2Var = (c2) g2Var.g;
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            c2Var.d = charSequence;
        }
        y4 y4Var = this.g;
        int selectedItemPosition = e5Var.getSelectedItemPosition();
        c2Var.g = y4Var;
        c2Var.h = this;
        c2Var.j = selectedItemPosition;
        c2Var.i = true;
        h2 b = g2Var.b();
        this.f = b;
        AlertController$RecycleListView alertController$RecycleListView = b.l.e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f.show();
    }

    @Override // defpackage.d5
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        e5 e5Var = this.i;
        e5Var.setSelection(i);
        if (e5Var.getOnItemClickListener() != null) {
            e5Var.performItemClick(null, i, this.g.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.d5
    public final CharSequence p() {
        return this.h;
    }

    @Override // defpackage.d5
    public final void q(ListAdapter listAdapter) {
        this.g = (y4) listAdapter;
    }
}
