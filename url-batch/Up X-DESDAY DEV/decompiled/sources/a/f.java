package a;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0069l;
import androidx.lifecycle.InterfaceC0073p;
import g.AbstractActivityC0126i;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0073p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f1041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0126i f1042b;

    public /* synthetic */ f(x xVar, AbstractActivityC0126i abstractActivityC0126i) {
        this.f1041a = xVar;
        this.f1042b = abstractActivityC0126i;
    }

    @Override // androidx.lifecycle.InterfaceC0073p
    public final void e(androidx.lifecycle.r rVar, EnumC0069l enumC0069l) {
        x xVar = this.f1041a;
        AbstractActivityC0126i abstractActivityC0126i = this.f1042b;
        if (enumC0069l == EnumC0069l.ON_CREATE) {
            OnBackInvokedDispatcher a2 = g.f1043a.a(abstractActivityC0126i);
            X0.e.e(a2, "invoker");
            xVar.f1100e = a2;
            xVar.c(xVar.f1102g);
        }
    }
}
