package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class L4 implements InterfaceC4821p7 {

    @Nullable
    private final Boolean a;

    public L4(@Nullable Boolean bool) {
        this.a = bool;
    }

    @Override // com.ironsource.InterfaceC4821p7
    @NotNull
    public Object a() {
        Boolean bool = this.a;
        if (bool != null) {
            return Result.m8023constructorimpl(bool);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m8023constructorimpl(ResultKt.createFailure(new Exception("enabled flag is not provided or invalid")));
    }
}
