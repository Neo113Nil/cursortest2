package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class Le implements InterfaceC5198a7 {
    public final File a;
    public final Sg b;

    public Le(@NotNull File file, @NotNull Sg sg2) {
        this.a = file;
        this.b = sg2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5198a7
    @NotNull
    public final File a(@NotNull Context context, @NotNull String str) {
        return new File(this.a, this.b.a(str));
    }
}
