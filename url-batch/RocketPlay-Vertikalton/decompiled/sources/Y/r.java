package Y;

import android.os.Bundle;
import androidx.lifecycle.EnumC0079l;
import g.AbstractActivityC0129i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements i0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1523b;

    public /* synthetic */ r(int i, Object obj) {
        this.f1522a = i;
        this.f1523b = obj;
    }

    @Override // i0.c
    public final Bundle a() {
        switch (this.f1522a) {
            case 0:
                AbstractActivityC0129i abstractActivityC0129i = (AbstractActivityC0129i) this.f1523b;
                while (AbstractActivityC0129i.n(((C0058u) abstractActivityC0129i.f2674s.f38b).d)) {
                }
                abstractActivityC0129i.f2675t.d(EnumC0079l.ON_STOP);
                return new Bundle();
            case 1:
                AbstractActivityC0129i abstractActivityC0129i2 = (AbstractActivityC0129i) this.f1523b;
                Bundle bundle = new Bundle();
                a.j jVar = abstractActivityC0129i2.h;
                jVar.getClass();
                LinkedHashMap linkedHashMap = jVar.f1575b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.f1579g));
                return bundle;
            default:
                return ((I) this.f1523b).R();
        }
    }
}
