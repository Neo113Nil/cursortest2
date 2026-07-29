package o;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.local.IidStore;

/* renamed from: o.Uc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0524Uc implements Provider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0524Uc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        ComponentRegistrar instantiate;
        IidStore lambda$new$0;
        switch (this.a) {
            case 0:
                instantiate = ComponentDiscovery.instantiate((String) this.b);
                return instantiate;
            default:
                lambda$new$0 = FirebaseInstallations.lambda$new$0((FirebaseApp) this.b);
                return lambda$new$0;
        }
    }
}
