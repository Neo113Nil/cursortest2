package k;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import g.DialogInterfaceC0126f;

/* renamed from: k.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0203n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0213x {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC0189E f3208a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC0126f f3209b;

    /* renamed from: c, reason: collision with root package name */
    public C0198i f3210c;

    @Override // k.InterfaceC0213x
    public final void b(MenuC0202m menuC0202m, boolean z2) {
        DialogInterfaceC0126f dialogInterfaceC0126f;
        if ((z2 || menuC0202m == this.f3208a) && (dialogInterfaceC0126f = this.f3209b) != null) {
            dialogInterfaceC0126f.dismiss();
        }
    }

    @Override // k.InterfaceC0213x
    public final boolean f(MenuC0202m menuC0202m) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0198i c0198i = this.f3210c;
        if (c0198i.f3180f == null) {
            c0198i.f3180f = new C0197h(c0198i);
        }
        this.f3208a.q(c0198i.f3180f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f3210c.b(this.f3208a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0189E subMenuC0189E = this.f3208a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f3209b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f3209b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0189E.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0189E.performShortcut(i, keyEvent, 0);
    }
}
