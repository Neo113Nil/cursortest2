package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.AbstractC0267Ke;
import o.AbstractC0868ct;
import o.C0860cl;
import o.InterfaceC1315jh;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC1315jh
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        Component build = Component.builder(Qualified.qualified(Background.class, AbstractC0267Ke.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Background.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC0267Ke create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Background.class, Executor.class));
                AbstractC0048Bt.m(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0860cl((Executor) obj);
            }
        }).build();
        AbstractC0048Bt.m(build, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component build2 = Component.builder(Qualified.qualified(Lightweight.class, AbstractC0267Ke.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Lightweight.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC0267Ke create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Lightweight.class, Executor.class));
                AbstractC0048Bt.m(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0860cl((Executor) obj);
            }
        }).build();
        AbstractC0048Bt.m(build2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component build3 = Component.builder(Qualified.qualified(Blocking.class, AbstractC0267Ke.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Blocking.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC0267Ke create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Blocking.class, Executor.class));
                AbstractC0048Bt.m(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0860cl((Executor) obj);
            }
        }).build();
        AbstractC0048Bt.m(build3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component build4 = Component.builder(Qualified.qualified(UiThread.class, AbstractC0267Ke.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(UiThread.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC0267Ke create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(UiThread.class, Executor.class));
                AbstractC0048Bt.m(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0860cl((Executor) obj);
            }
        }).build();
        AbstractC0048Bt.m(build4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return AbstractC0868ct.K(build, build2, build3, build4);
    }
}
