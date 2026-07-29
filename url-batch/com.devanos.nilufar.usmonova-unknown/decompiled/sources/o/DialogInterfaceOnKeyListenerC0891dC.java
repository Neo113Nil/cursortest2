package o;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: o.dC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0891dC implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC2075vC {
    public SubMenuC0909dU h;
    public DialogInterfaceC1209i2 i;
    public C1282jA j;

    @Override // o.InterfaceC2075vC
    public final void b(MenuC0825cC menuC0825cC, boolean z) {
        DialogInterfaceC1209i2 dialogInterfaceC1209i2;
        if ((z || menuC0825cC == this.h) && (dialogInterfaceC1209i2 = this.i) != null) {
            dialogInterfaceC1209i2.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        SubMenuC0909dU subMenuC0909dU = this.h;
        C1282jA c1282jA = this.j;
        if (c1282jA.m == null) {
            c1282jA.m = new C1218iA(c1282jA);
        }
        subMenuC0909dU.q(c1282jA.m.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.j.b(this.h, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0909dU subMenuC0909dU = this.h;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.i.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.i.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0909dU.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0909dU.performShortcut(i, keyEvent, 0);
    }

    @Override // o.InterfaceC2075vC
    public final boolean z(MenuC0825cC menuC0825cC) {
        return false;
    }
}
