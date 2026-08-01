package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0119b;
import g.DialogInterfaceC0123f;

/* renamed from: l.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0216L implements InterfaceC0221Q, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0123f f2897a;

    /* renamed from: b, reason: collision with root package name */
    public C0217M f2898b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2899c;
    public final /* synthetic */ C0222S d;

    public DialogInterfaceOnClickListenerC0216L(C0222S c0222s) {
        this.d = c0222s;
    }

    @Override // l.InterfaceC0221Q
    public final boolean a() {
        DialogInterfaceC0123f dialogInterfaceC0123f = this.f2897a;
        if (dialogInterfaceC0123f != null) {
            return dialogInterfaceC0123f.isShowing();
        }
        return false;
    }

    @Override // l.InterfaceC0221Q
    public final CharSequence b() {
        return this.f2899c;
    }

    @Override // l.InterfaceC0221Q
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0221Q
    public final int d() {
        return 0;
    }

    @Override // l.InterfaceC0221Q
    public final void dismiss() {
        DialogInterfaceC0123f dialogInterfaceC0123f = this.f2897a;
        if (dialogInterfaceC0123f != null) {
            dialogInterfaceC0123f.dismiss();
            this.f2897a = null;
        }
    }

    @Override // l.InterfaceC0221Q
    public final void g(int i, int i2) {
        if (this.f2898b == null) {
            return;
        }
        C0222S c0222s = this.d;
        H.j jVar = new H.j(c0222s.getPopupContext());
        CharSequence charSequence = this.f2899c;
        C0119b c0119b = (C0119b) jVar.f228b;
        if (charSequence != null) {
            c0119b.d = charSequence;
        }
        C0217M c0217m = this.f2898b;
        int selectedItemPosition = c0222s.getSelectedItemPosition();
        c0119b.f2296g = c0217m;
        c0119b.h = this;
        c0119b.f2297j = selectedItemPosition;
        c0119b.i = true;
        DialogInterfaceC0123f a2 = jVar.a();
        this.f2897a = a2;
        AlertController$RecycleListView alertController$RecycleListView = a2.f2320f.f2302e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f2897a.show();
    }

    @Override // l.InterfaceC0221Q
    public final void h(CharSequence charSequence) {
        this.f2899c = charSequence;
    }

    @Override // l.InterfaceC0221Q
    public final int j() {
        return 0;
    }

    @Override // l.InterfaceC0221Q
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0221Q
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0221Q
    public final Drawable m() {
        return null;
    }

    @Override // l.InterfaceC0221Q
    public final void n(ListAdapter listAdapter) {
        this.f2898b = (C0217M) listAdapter;
    }

    @Override // l.InterfaceC0221Q
    public final void o(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0222S c0222s = this.d;
        c0222s.setSelection(i);
        if (c0222s.getOnItemClickListener() != null) {
            c0222s.performItemClick(null, i, this.f2898b.getItemId(i));
        }
        dismiss();
    }
}
