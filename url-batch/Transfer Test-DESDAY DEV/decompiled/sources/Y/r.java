package Y;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.EnumC0071l;
import i0.InterfaceC0140c;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements InterfaceC0140c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1142b;

    public /* synthetic */ r(int i, Object obj) {
        this.f1141a = i;
        this.f1142b = obj;
    }

    @Override // i0.InterfaceC0140c
    public final Bundle a() {
        FragmentActivity fragmentActivity;
        Object obj = this.f1142b;
        switch (this.f1141a) {
            case 0:
                int i = FragmentActivity.f1477x;
                do {
                    fragmentActivity = (FragmentActivity) obj;
                } while (FragmentActivity.k(((C0052u) fragmentActivity.f1478s.f30b).d));
                fragmentActivity.f1479t.d(EnumC0071l.ON_STOP);
                return new Bundle();
            case 1:
                return ((I) obj).R();
            default:
                int i2 = ComponentActivity.f1237r;
                ComponentActivity componentActivity = (ComponentActivity) obj;
                g1.f.e(componentActivity, "this$0");
                Bundle bundle = new Bundle();
                a.j jVar = componentActivity.h;
                jVar.getClass();
                LinkedHashMap linkedHashMap = jVar.f1196b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.f1200g));
                return bundle;
        }
    }
}
