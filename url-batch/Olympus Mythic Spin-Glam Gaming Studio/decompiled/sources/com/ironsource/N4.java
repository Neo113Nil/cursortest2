package com.ironsource;

import com.ironsource.InterfaceC4839q7;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public final class N4 implements InterfaceC4839q7, InterfaceC4839q7.a {

    @NotNull
    private final ConcurrentHashMap<String, K4> a = new ConcurrentHashMap<>();

    @Override // com.ironsource.InterfaceC4839q7
    @NotNull
    public G3 a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        K4 k4 = this.a.get(identifier);
        return (k4 == null || k4.a()) ? new G3(false, null, 2, null) : new G3(true, I3.Delivery);
    }

    @Override // com.ironsource.InterfaceC4839q7.a
    public void b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
    }

    @Override // com.ironsource.InterfaceC4839q7.a
    @NotNull
    public Object a(@NotNull String identifier, @NotNull I3 cappingType, @NotNull InterfaceC4803o7 cappingConfig) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object a = cappingConfig.a();
        if (Result.m8029isSuccessimpl(a)) {
            K4 k4 = (K4) a;
            if (k4 != null) {
                this.a.put(identifier, k4);
            }
            return Result.m8023constructorimpl(Unit.INSTANCE);
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(a);
        if (m8026exceptionOrNullimpl != null) {
            return Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
        }
        return Result.m8023constructorimpl(Unit.INSTANCE);
    }
}
