package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0101b;
import g.DialogInterfaceC0105f;

/* renamed from: l.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0188J implements InterfaceC0193O, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0105f f2901a;

    /* renamed from: b, reason: collision with root package name */
    public C0189K f2902b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2903c;
    public final /* synthetic */ C0194P d;

    public DialogInterfaceOnClickListenerC0188J(C0194P c0194p) {
        this.d = c0194p;
    }

    @Override // l.InterfaceC0193O
    public final boolean a() {
        DialogInterfaceC0105f dialogInterfaceC0105f = this.f2901a;
        if (dialogInterfaceC0105f != null) {
            return dialogInterfaceC0105f.isShowing();
        }
        return false;
    }

    @Override // l.InterfaceC0193O
    public final CharSequence b() {
        return this.f2903c;
    }

    @Override // l.InterfaceC0193O
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0193O
    public final int d() {
        return 0;
    }

    @Override // l.InterfaceC0193O
    public final void dismiss() {
        DialogInterfaceC0105f dialogInterfaceC0105f = this.f2901a;
        if (dialogInterfaceC0105f != null) {
            dialogInterfaceC0105f.dismiss();
            this.f2901a = null;
        }
    }

    @Override // l.InterfaceC0193O
    public final void g(int i, int i2) {
        if (this.f2902b == null) {
            return;
        }
        C0194P c0194p = this.d;
        H.j jVar = new H.j(c0194p.getPopupContext());
        CharSequence charSequence = this.f2903c;
        C0101b c0101b = (C0101b) jVar.f236b;
        if (charSequence != null) {
            c0101b.d = charSequence;
        }
        C0189K c0189k = this.f2902b;
        int selectedItemPosition = c0194p.getSelectedItemPosition();
        c0101b.f2212g = c0189k;
        c0101b.h = this;
        c0101b.f2213j = selectedItemPosition;
        c0101b.i = true;
        DialogInterfaceC0105f b2 = jVar.b();
        this.f2901a = b2;
        AlertController$RecycleListView alertController$RecycleListView = b2.f2236f.f2218e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f2901a.show();
    }

    @Override // l.InterfaceC0193O
    public final void h(CharSequence charSequence) {
        this.f2903c = charSequence;
    }

    @Override // l.InterfaceC0193O
    public final int j() {
        return 0;
    }

    @Override // l.InterfaceC0193O
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0193O
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0193O
    public final Drawable m() {
        return null;
    }

    @Override // l.InterfaceC0193O
    public final void n(ListAdapter listAdapter) {
        this.f2902b = (C0189K) listAdapter;
    }

    @Override // l.InterfaceC0193O
    public final void o(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0194P c0194p = this.d;
        c0194p.setSelection(i);
        if (c0194p.getOnItemClickListener() != null) {
            c0194p.performItemClick(null, i, this.f2902b.getItemId(i));
        }
        dismiss();
    }
}
