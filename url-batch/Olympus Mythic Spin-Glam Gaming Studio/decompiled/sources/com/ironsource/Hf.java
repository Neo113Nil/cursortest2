package com.ironsource;

import com.ironsource.Gf;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class Hf {
    @NotNull
    public static final <T> Gf.b a(T t, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return Gf.b.b.a(t, block);
    }
}
