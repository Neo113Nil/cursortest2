package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0122b;
import g.DialogInterfaceC0126f;

/* renamed from: l.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0231K implements InterfaceC0236P, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0126f f3328a;

    /* renamed from: b, reason: collision with root package name */
    public C0232L f3329b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f3330c;
    public final /* synthetic */ C0237Q d;

    public DialogInterfaceOnClickListenerC0231K(C0237Q c0237q) {
        this.d = c0237q;
    }

    @Override // l.InterfaceC0236P
    public final boolean a() {
        DialogInterfaceC0126f dialogInterfaceC0126f = this.f3328a;
        if (dialogInterfaceC0126f != null) {
            return dialogInterfaceC0126f.isShowing();
        }
        return false;
    }

    @Override // l.InterfaceC0236P
    public final CharSequence b() {
        return this.f3330c;
    }

    @Override // l.InterfaceC0236P
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0236P
    public final int d() {
        return 0;
    }

    @Override // l.InterfaceC0236P
    public final void dismiss() {
        DialogInterfaceC0126f dialogInterfaceC0126f = this.f3328a;
        if (dialogInterfaceC0126f != null) {
            dialogInterfaceC0126f.dismiss();
            this.f3328a = null;
        }
    }

    @Override // l.InterfaceC0236P
    public final void g(int i, int i2) {
        if (this.f3329b == null) {
            return;
        }
        C0237Q c0237q = this.d;
        B1.p pVar = new B1.p(c0237q.getPopupContext());
        CharSequence charSequence = this.f3330c;
        C0122b c0122b = (C0122b) pVar.f223b;
        if (charSequence != null) {
            c0122b.d = charSequence;
        }
        C0232L c0232l = this.f3329b;
        int selectedItemPosition = c0237q.getSelectedItemPosition();
        c0122b.f2637k = c0232l;
        c0122b.f2638l = this;
        c0122b.f2640n = selectedItemPosition;
        c0122b.f2639m = true;
        DialogInterfaceC0126f a2 = pVar.a();
        this.f3328a = a2;
        AlertController$RecycleListView alertController$RecycleListView = a2.f2670f.f2650f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f3328a.show();
    }

    @Override // l.InterfaceC0236P
    public final void h(CharSequence charSequence) {
        this.f3330c = charSequence;
    }

    @Override // l.InterfaceC0236P
    public final int j() {
        return 0;
    }

    @Override // l.InterfaceC0236P
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0236P
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0236P
    public final Drawable m() {
        return null;
    }

    @Override // l.InterfaceC0236P
    public final void n(ListAdapter listAdapter) {
        this.f3329b = (C0232L) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0237Q c0237q = this.d;
        c0237q.setSelection(i);
        if (c0237q.getOnItemClickListener() != null) {
            c0237q.performItemClick(null, i, this.f3329b.getItemId(i));
        }
        dismiss();
    }

    @Override // l.InterfaceC0236P
    public final void p(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
