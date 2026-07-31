package com.ironsource;

import com.ironsource.I8;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.pe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4828pe implements I8, I8.a {

    @Nullable
    private C4810oe a;
    private boolean b;

    @Override // com.ironsource.I8
    @Nullable
    public Va a() {
        C4810oe c4810oe = this.a;
        if (c4810oe != null) {
            return new Va(c4810oe);
        }
        return null;
    }

    @Override // com.ironsource.I8
    @Nullable
    public M9 b() {
        C4810oe c4810oe = this.a;
        if (c4810oe != null) {
            return new M9(c4810oe);
        }
        return null;
    }

    @Override // com.ironsource.I8
    public boolean c() {
        return this.b;
    }

    @Override // com.ironsource.I8.a
    public void d() {
        this.b = true;
    }

    @Override // com.ironsource.I8.a
    public void a(@NotNull C4810oe sdkConfig) {
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        this.a = sdkConfig;
    }
}
