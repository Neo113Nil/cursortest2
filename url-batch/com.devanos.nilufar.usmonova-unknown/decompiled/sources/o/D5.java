package o;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public final class D5 implements J5, DialogInterface.OnClickListener {
    public DialogInterfaceC1209i2 h;
    public E5 i;
    public CharSequence j;
    public final /* synthetic */ K5 k;

    public D5(K5 k5) {
        this.k = k5;
    }

    @Override // o.J5
    public final boolean a() {
        DialogInterfaceC1209i2 dialogInterfaceC1209i2 = this.h;
        if (dialogInterfaceC1209i2 != null) {
            return dialogInterfaceC1209i2.isShowing();
        }
        return false;
    }

    @Override // o.J5
    public final int b() {
        return 0;
    }

    @Override // o.J5
    public final void dismiss() {
        DialogInterfaceC1209i2 dialogInterfaceC1209i2 = this.h;
        if (dialogInterfaceC1209i2 != null) {
            dialogInterfaceC1209i2.dismiss();
            this.h = null;
        }
    }

    @Override // o.J5
    public final Drawable e() {
        return null;
    }

    @Override // o.J5
    public final void g(CharSequence charSequence) {
        this.j = charSequence;
    }

    @Override // o.J5
    public final void h(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // o.J5
    public final void i(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // o.J5
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // o.J5
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // o.J5
    public final void m(int i, int i2) {
        if (this.i == null) {
            return;
        }
        K5 k5 = this.k;
        C1143h2 c1143h2 = new C1143h2(k5.getPopupContext());
        C0880d2 c0880d2 = (C0880d2) c1143h2.i;
        CharSequence charSequence = this.j;
        if (charSequence != null) {
            c0880d2.d = charSequence;
        }
        E5 e5 = this.i;
        int selectedItemPosition = k5.getSelectedItemPosition();
        c0880d2.g = e5;
        c0880d2.h = this;
        c0880d2.j = selectedItemPosition;
        c0880d2.i = true;
        DialogInterfaceC1209i2 g = c1143h2.g();
        this.h = g;
        AlertController$RecycleListView alertController$RecycleListView = g.m.e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.h.show();
    }

    @Override // o.J5
    public final int n() {
        return 0;
    }

    @Override // o.J5
    public final CharSequence o() {
        return this.j;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        K5 k5 = this.k;
        k5.setSelection(i);
        if (k5.getOnItemClickListener() != null) {
            k5.performItemClick(null, i, this.i.getItemId(i));
        }
        dismiss();
    }

    @Override // o.J5
    public final void p(ListAdapter listAdapter) {
        this.i = (E5) listAdapter;
    }
}
