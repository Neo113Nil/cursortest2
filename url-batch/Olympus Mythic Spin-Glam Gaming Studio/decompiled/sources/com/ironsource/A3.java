package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public final class A3 implements InterfaceC4821p7 {

    @Nullable
    private final Boolean a;

    @Nullable
    private final Integer b;

    @Nullable
    private final H3 c;

    public A3(@Nullable Boolean bool, @Nullable Integer num, @Nullable H3 h3) {
        this.a = bool;
        this.b = num;
        this.c = h3;
    }

    @Override // com.ironsource.InterfaceC4821p7
    @NotNull
    public Object a() {
        Boolean bool = this.a;
        if (bool == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(new Exception("enabled flag is not provided or invalid")));
        }
        if (!bool.booleanValue()) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(Boolean.FALSE);
        }
        Integer num = this.b;
        if (num == null || num.intValue() <= 0) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(new Exception("limit flag is not provided or invalid")));
        }
        if (this.c == null) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(new Exception("unit flag is not provided or invalid")));
        }
        Result.Companion companion5 = Result.INSTANCE;
        return Result.m8023constructorimpl(Boolean.TRUE);
    }
}
