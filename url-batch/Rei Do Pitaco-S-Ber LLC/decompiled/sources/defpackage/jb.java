package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class jb implements v00 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.v00
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                nb nbVar = ((b3) obj).m;
                nbVar.getClass();
                LinkedHashMap linkedHashMap = nbVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(nbVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(nbVar.g));
                return bundle;
            case 1:
                b3 b3Var = (b3) obj;
                while (b3.k(((fk) b3Var.z.g).x)) {
                }
                b3Var.A.d(fp.ON_STOP);
                return new Bundle();
            default:
                return ((sk) obj).T();
        }
    }
}
