package X;

import android.os.Bundle;
import androidx.lifecycle.EnumC0069l;
import g.AbstractActivityC0126i;
import h0.InterfaceC0132c;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements InterfaceC0132c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f989b;

    public /* synthetic */ r(int i, Object obj) {
        this.f988a = i;
        this.f989b = obj;
    }

    @Override // h0.InterfaceC0132c
    public final Bundle a() {
        switch (this.f988a) {
            case 0:
                AbstractActivityC0126i abstractActivityC0126i = (AbstractActivityC0126i) this.f989b;
                while (AbstractActivityC0126i.n(((C0052u) abstractActivityC0126i.f2321s.f59b).h)) {
                }
                abstractActivityC0126i.f2322t.d(EnumC0069l.ON_STOP);
                return new Bundle();
            case 1:
                AbstractActivityC0126i abstractActivityC0126i2 = (AbstractActivityC0126i) this.f989b;
                Bundle bundle = new Bundle();
                a.j jVar = abstractActivityC0126i2.h;
                jVar.getClass();
                LinkedHashMap linkedHashMap = jVar.f1049b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.f1053g));
                return bundle;
            default:
                return ((I) this.f989b).R();
        }
    }
}
