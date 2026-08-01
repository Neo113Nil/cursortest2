package a;

import android.window.OnBackInvokedCallback;
import h1.InterfaceC0173a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f1613a = new t();

    public final OnBackInvokedCallback a(h1.l lVar, h1.l lVar2, InterfaceC0173a interfaceC0173a, InterfaceC0173a interfaceC0173a2) {
        i1.f.e(lVar, "onBackStarted");
        i1.f.e(lVar2, "onBackProgressed");
        i1.f.e(interfaceC0173a, "onBackInvoked");
        i1.f.e(interfaceC0173a2, "onBackCancelled");
        return new s(lVar, lVar2, interfaceC0173a, interfaceC0173a2);
    }
}
