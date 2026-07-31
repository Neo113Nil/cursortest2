package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Uf {

    @Nullable
    private final String a;

    @Nullable
    private final String b;
    private final boolean c;

    @Nullable
    private final Boolean d;

    public Uf(@Nullable String str, boolean z, @Nullable Boolean bool, @Nullable String str2) {
        this.a = str2;
        this.b = str;
        this.c = z;
        this.d = bool;
    }

    @Nullable
    public final String a() {
        return this.b;
    }

    @Nullable
    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return Intrinsics.areEqual(this.d, Boolean.TRUE);
    }

    public final boolean a(@NotNull NetworkSettings networkSettings, @NotNull IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        String str = this.b;
        if (str == null || str.length() == 0) {
            return true;
        }
        Xf xf = Xf.a;
        return Intrinsics.areEqual(xf.a(networkSettings), this.b) && xf.a(networkSettings, adUnit) == this.c;
    }

    public /* synthetic */ Uf(String str, boolean z, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : str2);
    }
}
