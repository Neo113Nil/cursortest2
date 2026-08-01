package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0131b;
import g.DialogInterfaceC0135f;

/* renamed from: l.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0205L implements InterfaceC0210Q, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0135f f2900a;

    /* renamed from: b, reason: collision with root package name */
    public C0206M f2901b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2902c;
    public final /* synthetic */ C0211S d;

    public DialogInterfaceOnClickListenerC0205L(C0211S c0211s) {
        this.d = c0211s;
    }

    @Override // l.InterfaceC0210Q
    public final boolean a() {
        DialogInterfaceC0135f dialogInterfaceC0135f = this.f2900a;
        if (dialogInterfaceC0135f != null) {
            return dialogInterfaceC0135f.isShowing();
        }
        return false;
    }

    @Override // l.InterfaceC0210Q
    public final CharSequence b() {
        return this.f2902c;
    }

    @Override // l.InterfaceC0210Q
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0210Q
    public final int d() {
        return 0;
    }

    @Override // l.InterfaceC0210Q
    public final void dismiss() {
        DialogInterfaceC0135f dialogInterfaceC0135f = this.f2900a;
        if (dialogInterfaceC0135f != null) {
            dialogInterfaceC0135f.dismiss();
            this.f2900a = null;
        }
    }

    @Override // l.InterfaceC0210Q
    public final void g(int i, int i2) {
        if (this.f2901b == null) {
            return;
        }
        C0211S c0211s = this.d;
        H.j jVar = new H.j(c0211s.getPopupContext());
        CharSequence charSequence = this.f2902c;
        C0131b c0131b = (C0131b) jVar.f221b;
        if (charSequence != null) {
            c0131b.d = charSequence;
        }
        C0206M c0206m = this.f2901b;
        int selectedItemPosition = c0211s.getSelectedItemPosition();
        c0131b.f2299g = c0206m;
        c0131b.h = this;
        c0131b.f2300j = selectedItemPosition;
        c0131b.i = true;
        DialogInterfaceC0135f a2 = jVar.a();
        this.f2900a = a2;
        AlertController$RecycleListView alertController$RecycleListView = a2.f2323f.f2305e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f2900a.show();
    }

    @Override // l.InterfaceC0210Q
    public final void h(CharSequence charSequence) {
        this.f2902c = charSequence;
    }

    @Override // l.InterfaceC0210Q
    public final int j() {
        return 0;
    }

    @Override // l.InterfaceC0210Q
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0210Q
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0210Q
    public final Drawable m() {
        return null;
    }

    @Override // l.InterfaceC0210Q
    public final void n(ListAdapter listAdapter) {
        this.f2901b = (C0206M) listAdapter;
    }

    @Override // l.InterfaceC0210Q
    public final void o(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0211S c0211s = this.d;
        c0211s.setSelection(i);
        if (c0211s.getOnItemClickListener() != null) {
            c0211s.performItemClick(null, i, this.f2901b.getItemId(i));
        }
        dismiss();
    }
}
