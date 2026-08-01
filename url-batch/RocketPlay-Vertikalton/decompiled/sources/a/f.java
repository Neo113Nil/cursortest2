package a;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0079l;
import g.AbstractActivityC0129i;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f1567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0129i f1568b;

    public /* synthetic */ f(x xVar, AbstractActivityC0129i abstractActivityC0129i) {
        this.f1567a = xVar;
        this.f1568b = abstractActivityC0129i;
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, EnumC0079l enumC0079l) {
        x xVar = this.f1567a;
        AbstractActivityC0129i abstractActivityC0129i = this.f1568b;
        if (enumC0079l == EnumC0079l.ON_CREATE) {
            OnBackInvokedDispatcher a2 = g.f1569a.a(abstractActivityC0129i);
            i1.f.e(a2, "invoker");
            xVar.f1623e = a2;
            xVar.c(xVar.f1625g);
        }
    }
}
