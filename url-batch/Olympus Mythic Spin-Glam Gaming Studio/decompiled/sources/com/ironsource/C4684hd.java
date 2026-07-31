package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.hd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4684hd extends AbstractC4781n3 {

    @NotNull
    private String e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4684hd(int i, @NotNull String placementName, boolean z, @NotNull String rewardName, int i2, @Nullable C4702id c4702id) {
        super(i, placementName, z, c4702id);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.f = i2;
        this.e = rewardName;
    }

    public final int e() {
        return this.f;
    }

    @NotNull
    public final String f() {
        return this.e;
    }

    @Override // com.ironsource.AbstractC4781n3
    @NotNull
    public String toString() {
        return super.toString() + ", reward name: " + this.e + " , amount: " + this.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4684hd(@NotNull AbstractC4781n3 placement) {
        super(placement.b(), placement.c(), placement.d(), placement.a());
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.e = "";
    }
}
