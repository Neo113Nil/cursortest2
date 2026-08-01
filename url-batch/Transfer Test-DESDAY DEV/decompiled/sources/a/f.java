package a;

import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.EnumC0071l;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f1188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f1189b;

    public /* synthetic */ f(w wVar, ComponentActivity componentActivity) {
        this.f1188a = wVar;
        this.f1189b = componentActivity;
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, EnumC0071l enumC0071l) {
        int i = ComponentActivity.f1237r;
        w wVar = this.f1188a;
        ComponentActivity componentActivity = this.f1189b;
        g1.f.e(componentActivity, "this$0");
        if (enumC0071l == EnumC0071l.ON_CREATE) {
            OnBackInvokedDispatcher a2 = g.f1190a.a(componentActivity);
            g1.f.e(a2, "invoker");
            wVar.f1229e = a2;
            wVar.c(wVar.f1231g);
        }
    }
}
