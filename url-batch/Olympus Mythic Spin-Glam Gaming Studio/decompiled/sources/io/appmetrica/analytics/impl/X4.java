package io.appmetrica.analytics.impl;

import com.ironsource.X3;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class X4 implements InterfaceC5560o7 {
    public final String a;
    public final String b;

    public X4(@NotNull C5351g5 c5351g5) {
        this.a = String.format("component_%s.db", Arrays.copyOf(new Object[]{c5351g5.d() ? X3.i.Z : c5351g5.b()}, 1));
        this.b = "db_metrica_" + c5351g5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5560o7
    @NotNull
    public final String a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5560o7
    @NotNull
    public final String b() {
        return this.a;
    }
}
