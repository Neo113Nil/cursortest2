package k;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import g.DialogInterfaceC0105f;

/* renamed from: k.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0165n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0175x {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC0151E f2777a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC0105f f2778b;

    /* renamed from: c, reason: collision with root package name */
    public C0160i f2779c;

    @Override // k.InterfaceC0175x
    public final void b(MenuC0164m menuC0164m, boolean z2) {
        DialogInterfaceC0105f dialogInterfaceC0105f;
        if ((z2 || menuC0164m == this.f2777a) && (dialogInterfaceC0105f = this.f2778b) != null) {
            dialogInterfaceC0105f.dismiss();
        }
    }

    @Override // k.InterfaceC0175x
    public final boolean g(MenuC0164m menuC0164m) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0160i c0160i = this.f2779c;
        if (c0160i.f2749f == null) {
            c0160i.f2749f = new C0159h(c0160i);
        }
        this.f2777a.q(c0160i.f2749f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f2779c.b(this.f2777a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0151E subMenuC0151E = this.f2777a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2778b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2778b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0151E.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0151E.performShortcut(i, keyEvent, 0);
    }
}
