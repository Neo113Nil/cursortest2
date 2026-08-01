package l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.InterfaceC0162k;
import k.MenuC0164m;

/* loaded from: classes.dex */
public final class V0 implements InterfaceC0224n, InterfaceC0162k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2950a;

    public /* synthetic */ V0(Toolbar toolbar) {
        this.f2950a = toolbar;
    }

    @Override // k.InterfaceC0162k
    public void p(MenuC0164m menuC0164m) {
        Toolbar toolbar = this.f2950a;
        C0218k c0218k = toolbar.f1373a.f1334t;
        if (c0218k == null || !c0218k.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1362G.f425b).iterator();
            while (it.hasNext()) {
                ((Y.B) it.next()).f940a.s();
            }
        }
    }

    @Override // k.InterfaceC0162k
    public boolean q(MenuC0164m menuC0164m, MenuItem menuItem) {
        this.f2950a.getClass();
        return false;
    }
}
