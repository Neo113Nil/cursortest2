package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.f5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4640f5<T> extends Pc {
    void b(@NotNull C5005z8 c5005z8);

    @NotNull
    String c();

    @NotNull
    Y5 d();

    @NotNull
    Function1 i();

    default boolean j() {
        return k().exists();
    }

    @NotNull
    C5005z8 k();

    @NotNull
    InterfaceC5004z7 l();

    default void m() {
        l().a(this);
        if (k().exists()) {
            IronSourceStorageUtils.deleteFile(k());
        }
        try {
            l().a(k(), d().value(), 5, 5);
        } catch (Exception e) {
            C4782n4.d().a(e);
            Function1 i = i();
            Result.Companion companion = Result.INSTANCE;
            i.invoke(Result.m8022boximpl(Result.m8023constructorimpl(ResultKt.createFailure(e))));
        }
    }
}
