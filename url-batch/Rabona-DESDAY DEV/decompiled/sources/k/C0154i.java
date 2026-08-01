package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0119b;
import g.DialogInterfaceC0123f;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154i implements InterfaceC0170y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f2677a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f2678b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0158m f2679c;
    public ExpandedMenuView d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0169x f2680e;

    /* renamed from: f, reason: collision with root package name */
    public C0153h f2681f;

    public C0154i(ContextWrapper contextWrapper) {
        this.f2677a = contextWrapper;
        this.f2678b = LayoutInflater.from(contextWrapper);
    }

    @Override // k.InterfaceC0170y
    public final void b(MenuC0158m menuC0158m, boolean z2) {
        InterfaceC0169x interfaceC0169x = this.f2680e;
        if (interfaceC0169x != null) {
            interfaceC0169x.b(menuC0158m, z2);
        }
    }

    @Override // k.InterfaceC0170y
    public final void c() {
        C0153h c0153h = this.f2681f;
        if (c0153h != null) {
            c0153h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0170y
    public final boolean d(C0160o c0160o) {
        return false;
    }

    @Override // k.InterfaceC0170y
    public final boolean e(SubMenuC0145E subMenuC0145E) {
        if (!subMenuC0145E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0159n dialogInterfaceOnKeyListenerC0159n = new DialogInterfaceOnKeyListenerC0159n();
        dialogInterfaceOnKeyListenerC0159n.f2709a = subMenuC0145E;
        Context context = subMenuC0145E.f2688a;
        H.j jVar = new H.j(context);
        C0119b c0119b = (C0119b) jVar.f228b;
        C0154i c0154i = new C0154i(c0119b.f2291a);
        dialogInterfaceOnKeyListenerC0159n.f2711c = c0154i;
        c0154i.f2680e = dialogInterfaceOnKeyListenerC0159n;
        subMenuC0145E.b(c0154i, context);
        C0154i c0154i2 = dialogInterfaceOnKeyListenerC0159n.f2711c;
        if (c0154i2.f2681f == null) {
            c0154i2.f2681f = new C0153h(c0154i2);
        }
        c0119b.f2296g = c0154i2.f2681f;
        c0119b.h = dialogInterfaceOnKeyListenerC0159n;
        View view = subMenuC0145E.f2699o;
        if (view != null) {
            c0119b.f2294e = view;
        } else {
            c0119b.f2293c = subMenuC0145E.f2698n;
            c0119b.d = subMenuC0145E.f2697m;
        }
        c0119b.f2295f = dialogInterfaceOnKeyListenerC0159n;
        DialogInterfaceC0123f a2 = jVar.a();
        dialogInterfaceOnKeyListenerC0159n.f2710b = a2;
        a2.setOnDismissListener(dialogInterfaceOnKeyListenerC0159n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0159n.f2710b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0159n.f2710b.show();
        InterfaceC0169x interfaceC0169x = this.f2680e;
        if (interfaceC0169x == null) {
            return true;
        }
        interfaceC0169x.f(subMenuC0145E);
        return true;
    }

    @Override // k.InterfaceC0170y
    public final void g(InterfaceC0169x interfaceC0169x) {
        throw null;
    }

    @Override // k.InterfaceC0170y
    public final boolean h(C0160o c0160o) {
        return false;
    }

    @Override // k.InterfaceC0170y
    public final void j(Context context, MenuC0158m menuC0158m) {
        if (this.f2677a != null) {
            this.f2677a = context;
            if (this.f2678b == null) {
                this.f2678b = LayoutInflater.from(context);
            }
        }
        this.f2679c = menuC0158m;
        C0153h c0153h = this.f2681f;
        if (c0153h != null) {
            c0153h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0170y
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.f2679c.q(this.f2681f.getItem(i), this, 0);
    }
}
