package com.ironsource;

import com.ironsource.InterfaceC4839q7;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class Yc implements InterfaceC4839q7, InterfaceC4839q7.a {

    @NotNull
    private final InterfaceC4818p4 a;

    @NotNull
    private final J7 b;

    @NotNull
    private final Map<String, Xc> c;

    public Yc(@NotNull InterfaceC4818p4 currentTimeProvider, @NotNull J7 repository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.a = currentTimeProvider;
        this.b = repository;
        this.c = new LinkedHashMap();
    }

    @NotNull
    public final Map<String, Xc> a() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC4839q7.a
    public void b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        if (this.c.get(identifier) == null) {
            return;
        }
        this.b.a(this.a.a(), identifier);
    }

    private final boolean a(Xc xc, String str) {
        Long a = this.b.a(str);
        return a != null && this.a.a() - a.longValue() < xc.a();
    }

    @Override // com.ironsource.InterfaceC4839q7
    @NotNull
    public G3 a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Xc xc = this.c.get(identifier);
        if (xc == null) {
            return new G3(false, null, 2, null);
        }
        if (a(xc, identifier)) {
            return new G3(true, I3.Pacing);
        }
        return new G3(false, null, 2, null);
    }

    @Override // com.ironsource.InterfaceC4839q7.a
    @NotNull
    public Object a(@NotNull String identifier, @NotNull I3 cappingType, @NotNull InterfaceC4803o7 cappingConfig) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object b = cappingConfig.b();
        if (Result.m8029isSuccessimpl(b)) {
            Xc xc = (Xc) b;
            if (xc != null) {
                this.c.put(identifier, xc);
            }
            return Result.m8023constructorimpl(Unit.INSTANCE);
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(b);
        if (m8026exceptionOrNullimpl != null) {
            return Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
        }
        return Result.m8023constructorimpl(Unit.INSTANCE);
    }
}
