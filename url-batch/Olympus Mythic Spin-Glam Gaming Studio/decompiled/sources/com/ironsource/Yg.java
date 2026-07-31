package com.ironsource;

import com.ironsource.AbstractC4709j3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class Yg<Smash extends AbstractC4709j3<?>> {

    @NotNull
    private final dh<Smash> a;

    public Yg(@NotNull dh<Smash> smashPicker) {
        Intrinsics.checkNotNullParameter(smashPicker, "smashPicker");
        this.a = smashPicker;
    }

    @NotNull
    public final List<Smash> a() {
        return this.a.c();
    }

    public final boolean b() {
        return this.a.c().isEmpty() && this.a.a().isEmpty();
    }

    public final boolean c() {
        return this.a.d() == 0;
    }
}
