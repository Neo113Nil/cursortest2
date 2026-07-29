package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import o.C0855cg;
import o.C1479m9;
import o.C2293yW;
import o.InterfaceC2161wW;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC2161wW lambda$getComponents$0(ComponentContainer componentContainer) {
        C2293yW.b((Context) componentContainer.get(Context.class));
        return C2293yW.a().c(C1479m9.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC2161wW lambda$getComponents$1(ComponentContainer componentContainer) {
        C2293yW.b((Context) componentContainer.get(Context.class));
        return C2293yW.a().c(C1479m9.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC2161wW lambda$getComponents$2(ComponentContainer componentContainer) {
        C2293yW.b((Context) componentContainer.get(Context.class));
        return C2293yW.a().c(C1479m9.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(InterfaceC2161wW.class).name(LIBRARY_NAME).add(Dependency.required((Class<?>) Context.class)).factory(new C0855cg(7)).build(), Component.builder(Qualified.qualified(LegacyTransportBackend.class, InterfaceC2161wW.class)).add(Dependency.required((Class<?>) Context.class)).factory(new C0855cg(8)).build(), Component.builder(Qualified.qualified(TransportBackend.class, InterfaceC2161wW.class)).add(Dependency.required((Class<?>) Context.class)).factory(new C0855cg(9)).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
