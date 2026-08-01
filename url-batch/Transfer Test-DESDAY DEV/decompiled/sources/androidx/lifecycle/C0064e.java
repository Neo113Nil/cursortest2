package androidx.lifecycle;

import U.AbstractC0032b;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import i0.C0141d;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064e implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1513a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1514b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1515c;

    public /* synthetic */ C0064e(Object obj, int i, Object obj2) {
        this.f1513a = i;
        this.f1514b = obj;
        this.f1515c = obj2;
    }

    @Override // androidx.lifecycle.r
    public final void a(t tVar, EnumC0071l enumC0071l) {
        switch (this.f1513a) {
            case 0:
                int i = AbstractC0063d.f1512a[enumC0071l.ordinal()];
                U.k kVar = (U.k) this.f1514b;
                if (i == 3) {
                    kVar.f828b.getClass();
                    (Build.VERSION.SDK_INT >= 28 ? AbstractC0032b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new U.n(), 500L);
                    kVar.f827a.f(kVar);
                } else if (i == 7) {
                    throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                r rVar = (r) this.f1515c;
                if (rVar != null) {
                    rVar.a(tVar, enumC0071l);
                    return;
                }
                return;
            case 1:
                if (enumC0071l == EnumC0071l.ON_START) {
                    ((v) this.f1514b).f(this);
                    ((C0141d) this.f1515c).f();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0060a) this.f1515c).f1505a;
                List list = (List) hashMap.get(enumC0071l);
                InterfaceC0077s interfaceC0077s = (InterfaceC0077s) this.f1514b;
                C0060a.a(list, tVar, enumC0071l, interfaceC0077s);
                C0060a.a((List) hashMap.get(EnumC0071l.ON_ANY), tVar, enumC0071l, interfaceC0077s);
                return;
        }
    }

    public C0064e(InterfaceC0077s interfaceC0077s) {
        this.f1513a = 2;
        this.f1514b = interfaceC0077s;
        C0062c c0062c = C0062c.f1509c;
        Class<?> cls = interfaceC0077s.getClass();
        C0060a c0060a = (C0060a) c0062c.f1510a.get(cls);
        this.f1515c = c0060a == null ? c0062c.a(cls, null) : c0060a;
    }
}
