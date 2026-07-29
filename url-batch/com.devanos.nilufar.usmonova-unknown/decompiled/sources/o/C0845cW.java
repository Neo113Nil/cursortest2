package o;

import android.view.MenuItem;
import android.view.Window;

/* renamed from: o.cW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0845cW implements InterfaceC0714aW, InterfaceC0694aC {
    public final /* synthetic */ C0911dW h;

    public /* synthetic */ C0845cW(C0911dW c0911dW) {
        this.h = c0911dW;
    }

    @Override // o.InterfaceC0694aC
    public boolean C(MenuC0825cC menuC0825cC, MenuItem menuItem) {
        return false;
    }

    @Override // o.InterfaceC0694aC
    public void Q(MenuC0825cC menuC0825cC) {
        C0911dW c0911dW = this.h;
        Window.Callback callback = c0911dW.b;
        if (c0911dW.a.a.o()) {
            callback.onPanelClosed(108, menuC0825cC);
        } else if (callback.onPreparePanel(0, null, menuC0825cC)) {
            callback.onMenuOpened(108, menuC0825cC);
        }
    }
}
