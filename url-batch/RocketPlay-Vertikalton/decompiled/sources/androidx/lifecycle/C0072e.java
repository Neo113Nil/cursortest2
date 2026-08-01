package androidx.lifecycle;

import U.AbstractC0038b;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072e implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1892a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1893b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1894c;

    public /* synthetic */ C0072e(Object obj, int i, Object obj2) {
        this.f1892a = i;
        this.f1893b = obj;
        this.f1894c = obj2;
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, EnumC0079l enumC0079l) {
        switch (this.f1892a) {
            case 0:
                int i = AbstractC0071d.f1891a[enumC0079l.ordinal()];
                U.k kVar = (U.k) this.f1893b;
                if (i == 3) {
                    kVar.f1186b.getClass();
                    (Build.VERSION.SDK_INT >= 28 ? AbstractC0038b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new U.n(), 500L);
                    kVar.f1185a.f(kVar);
                } else if (i == 7) {
                    throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                r rVar = (r) this.f1894c;
                if (rVar != null) {
                    rVar.a(tVar, enumC0079l);
                    return;
                }
                return;
            case 1:
                if (enumC0079l == EnumC0079l.ON_START) {
                    ((v) this.f1893b).f(this);
                    ((i0.d) this.f1894c).f();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0068a) this.f1894c).f1884a;
                List list = (List) hashMap.get(enumC0079l);
                InterfaceC0085s interfaceC0085s = (InterfaceC0085s) this.f1893b;
                C0068a.a(list, tVar, enumC0079l, interfaceC0085s);
                C0068a.a((List) hashMap.get(EnumC0079l.ON_ANY), tVar, enumC0079l, interfaceC0085s);
                return;
        }
    }

    public C0072e(InterfaceC0085s interfaceC0085s) {
        this.f1892a = 2;
        this.f1893b = interfaceC0085s;
        C0070c c0070c = C0070c.f1888c;
        Class<?> cls = interfaceC0085s.getClass();
        C0068a c0068a = (C0068a) c0070c.f1889a.get(cls);
        this.f1894c = c0068a == null ? c0070c.a(cls, null) : c0068a;
    }
}
