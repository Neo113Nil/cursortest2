package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0122b;
import g.DialogInterfaceC0126f;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198i implements InterfaceC0214y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f3176a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f3177b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0202m f3178c;
    public ExpandedMenuView d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0213x f3179e;

    /* renamed from: f, reason: collision with root package name */
    public C0197h f3180f;

    public C0198i(ContextWrapper contextWrapper) {
        this.f3176a = contextWrapper;
        this.f3177b = LayoutInflater.from(contextWrapper);
    }

    @Override // k.InterfaceC0214y
    public final void b(MenuC0202m menuC0202m, boolean z2) {
        InterfaceC0213x interfaceC0213x = this.f3179e;
        if (interfaceC0213x != null) {
            interfaceC0213x.b(menuC0202m, z2);
        }
    }

    @Override // k.InterfaceC0214y
    public final void c() {
        C0197h c0197h = this.f3180f;
        if (c0197h != null) {
            c0197h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0214y
    public final boolean d(C0204o c0204o) {
        return false;
    }

    @Override // k.InterfaceC0214y
    public final boolean e(SubMenuC0189E subMenuC0189E) {
        if (!subMenuC0189E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0203n dialogInterfaceOnKeyListenerC0203n = new DialogInterfaceOnKeyListenerC0203n();
        dialogInterfaceOnKeyListenerC0203n.f3208a = subMenuC0189E;
        Context context = subMenuC0189E.f3187a;
        B1.p pVar = new B1.p(context);
        C0122b c0122b = (C0122b) pVar.f223b;
        C0198i c0198i = new C0198i(c0122b.f2630a);
        dialogInterfaceOnKeyListenerC0203n.f3210c = c0198i;
        c0198i.f3179e = dialogInterfaceOnKeyListenerC0203n;
        subMenuC0189E.b(c0198i, context);
        C0198i c0198i2 = dialogInterfaceOnKeyListenerC0203n.f3210c;
        if (c0198i2.f3180f == null) {
            c0198i2.f3180f = new C0197h(c0198i2);
        }
        c0122b.f2637k = c0198i2.f3180f;
        c0122b.f2638l = dialogInterfaceOnKeyListenerC0203n;
        View view = subMenuC0189E.f3198o;
        if (view != null) {
            c0122b.f2633e = view;
        } else {
            c0122b.f2632c = subMenuC0189E.f3197n;
            c0122b.d = subMenuC0189E.f3196m;
        }
        c0122b.f2636j = dialogInterfaceOnKeyListenerC0203n;
        DialogInterfaceC0126f a2 = pVar.a();
        dialogInterfaceOnKeyListenerC0203n.f3209b = a2;
        a2.setOnDismissListener(dialogInterfaceOnKeyListenerC0203n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0203n.f3209b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0203n.f3209b.show();
        InterfaceC0213x interfaceC0213x = this.f3179e;
        if (interfaceC0213x == null) {
            return true;
        }
        interfaceC0213x.f(subMenuC0189E);
        return true;
    }

    @Override // k.InterfaceC0214y
    public final void g(InterfaceC0213x interfaceC0213x) {
        throw null;
    }

    @Override // k.InterfaceC0214y
    public final boolean h(C0204o c0204o) {
        return false;
    }

    @Override // k.InterfaceC0214y
    public final void j(Context context, MenuC0202m menuC0202m) {
        if (this.f3176a != null) {
            this.f3176a = context;
            if (this.f3177b == null) {
                this.f3177b = LayoutInflater.from(context);
            }
        }
        this.f3178c = menuC0202m;
        C0197h c0197h = this.f3180f;
        if (c0197h != null) {
            c0197h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0214y
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.f3178c.q(this.f3180f.getItem(i), this, 0);
    }
}
