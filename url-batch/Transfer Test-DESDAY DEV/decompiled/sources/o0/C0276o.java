package o0;

import java.util.ArrayList;

/* renamed from: o0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276o extends AbstractC0275n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.b f3261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC0277p f3262b;

    public C0276o(ViewTreeObserverOnPreDrawListenerC0277p viewTreeObserverOnPreDrawListenerC0277p, o.b bVar) {
        this.f3262b = viewTreeObserverOnPreDrawListenerC0277p;
        this.f3261a = bVar;
    }

    @Override // o0.InterfaceC0272k
    public final void d(AbstractC0274m abstractC0274m) {
        ((ArrayList) this.f3261a.getOrDefault(this.f3262b.f3264b, null)).remove(abstractC0274m);
        abstractC0274m.x(this);
    }
}
