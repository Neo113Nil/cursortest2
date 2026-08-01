package k;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import g.DialogInterfaceC0135f;

/* renamed from: k.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0169n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0179x {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC0155E f2712a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC0135f f2713b;

    /* renamed from: c, reason: collision with root package name */
    public C0164i f2714c;

    @Override // k.InterfaceC0179x
    public final void b(MenuC0168m menuC0168m, boolean z2) {
        DialogInterfaceC0135f dialogInterfaceC0135f;
        if ((z2 || menuC0168m == this.f2712a) && (dialogInterfaceC0135f = this.f2713b) != null) {
            dialogInterfaceC0135f.dismiss();
        }
    }

    @Override // k.InterfaceC0179x
    public final boolean f(MenuC0168m menuC0168m) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0164i c0164i = this.f2714c;
        if (c0164i.f2684f == null) {
            c0164i.f2684f = new C0163h(c0164i);
        }
        this.f2712a.q(c0164i.f2684f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f2714c.b(this.f2712a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0155E subMenuC0155E = this.f2712a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2713b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2713b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0155E.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0155E.performShortcut(i, keyEvent, 0);
    }
}
