package a;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f1087a = new t();

    public final OnBackInvokedCallback a(W0.l lVar, W0.l lVar2, W0.a aVar, W0.a aVar2) {
        X0.e.e(lVar, "onBackStarted");
        X0.e.e(lVar2, "onBackProgressed");
        X0.e.e(aVar, "onBackInvoked");
        X0.e.e(aVar2, "onBackCancelled");
        return new s(lVar, lVar2, aVar, aVar2);
    }
}
