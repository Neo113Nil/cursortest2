package o;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

/* renamed from: o.Wc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0576Wc implements Provider {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentRegistrar b;

    public /* synthetic */ C0576Wc(ComponentRegistrar componentRegistrar, int i) {
        this.a = i;
        this.b = componentRegistrar;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        ComponentRegistrar lambda$toProviders$1;
        ComponentRegistrar lambda$addComponentRegistrar$0;
        switch (this.a) {
            case 0:
                lambda$toProviders$1 = ComponentRuntime.lambda$toProviders$1(this.b);
                return lambda$toProviders$1;
            default:
                lambda$addComponentRegistrar$0 = ComponentRuntime.Builder.lambda$addComponentRegistrar$0(this.b);
                return lambda$addComponentRegistrar$0;
        }
    }
}
