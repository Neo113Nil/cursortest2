package o;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: o.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1006f implements InterfaceC1008f00 {
    public int a;
    public boolean b;
    public final Object c;

    public C1006f(JR jr, int i, boolean z) {
        this.c = jr;
        this.a = i;
        this.b = z;
    }

    @Override // o.InterfaceC1008f00
    public void a() {
        if (this.b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.m = null;
        super/*android.view.View*/.setVisibility(this.a);
    }

    @Override // o.InterfaceC1008f00
    public void b() {
        this.b = true;
    }

    @Override // o.InterfaceC1008f00
    public void c() {
        super/*android.view.View*/.setVisibility(0);
        this.b = false;
    }

    public C1006f(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
        this.b = false;
    }
}
