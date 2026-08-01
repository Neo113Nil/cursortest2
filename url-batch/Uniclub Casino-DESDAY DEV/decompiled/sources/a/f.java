package a;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0068l;
import androidx.lifecycle.InterfaceC0072p;
import g.AbstractActivityC0138i;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0072p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f1043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0138i f1044b;

    public /* synthetic */ f(x xVar, AbstractActivityC0138i abstractActivityC0138i) {
        this.f1043a = xVar;
        this.f1044b = abstractActivityC0138i;
    }

    @Override // androidx.lifecycle.InterfaceC0072p
    public final void e(androidx.lifecycle.r rVar, EnumC0068l enumC0068l) {
        x xVar = this.f1043a;
        AbstractActivityC0138i abstractActivityC0138i = this.f1044b;
        if (enumC0068l == EnumC0068l.ON_CREATE) {
            OnBackInvokedDispatcher a2 = g.f1045a.a(abstractActivityC0138i);
            X0.d.e(a2, "invoker");
            xVar.f1102e = a2;
            xVar.c(xVar.f1104g);
        }
    }
}
