package X;

import android.os.Bundle;
import androidx.lifecycle.EnumC0068l;
import g.AbstractActivityC0138i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements h0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f993b;

    public /* synthetic */ r(int i, Object obj) {
        this.f992a = i;
        this.f993b = obj;
    }

    @Override // h0.c
    public final Bundle a() {
        switch (this.f992a) {
            case 0:
                AbstractActivityC0138i abstractActivityC0138i = (AbstractActivityC0138i) this.f993b;
                while (AbstractActivityC0138i.n(((C0051u) abstractActivityC0138i.f2327s.f62b).d)) {
                }
                abstractActivityC0138i.f2328t.d(EnumC0068l.ON_STOP);
                return new Bundle();
            case 1:
                AbstractActivityC0138i abstractActivityC0138i2 = (AbstractActivityC0138i) this.f993b;
                Bundle bundle = new Bundle();
                a.j jVar = abstractActivityC0138i2.h;
                jVar.getClass();
                LinkedHashMap linkedHashMap = jVar.f1051b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.f1055g));
                return bundle;
            default:
                return ((I) this.f993b).R();
        }
    }
}
