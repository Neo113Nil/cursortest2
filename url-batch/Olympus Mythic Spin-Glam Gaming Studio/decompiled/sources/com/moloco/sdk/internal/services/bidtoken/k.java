package com.moloco.sdk.internal.services.bidtoken;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes5.dex */
public final class k {
    public static final int d = 0;

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final f c;

    public k(@NotNull String bidToken, @NotNull String publicKey, @NotNull f bidTokenConfig) {
        Intrinsics.checkNotNullParameter(bidToken, "bidToken");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(bidTokenConfig, "bidTokenConfig");
        this.a = bidToken;
        this.b = publicKey;
        this.c = bidTokenConfig;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final f c() {
        return this.c;
    }

    @NotNull
    public final String d() {
        return this.a;
    }

    @NotNull
    public final f e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.a, kVar.a) && Intrinsics.areEqual(this.b, kVar.b) && Intrinsics.areEqual(this.c, kVar.c);
    }

    @NotNull
    public final String f() {
        return this.b;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    @NotNull
    public String toString() {
        return "BidTokenResponseComponents(bidToken=" + this.a + ", publicKey=" + this.b + ", bidTokenConfig=" + this.c + ')';
    }

    @NotNull
    public final k a(@NotNull String bidToken, @NotNull String publicKey, @NotNull f bidTokenConfig) {
        Intrinsics.checkNotNullParameter(bidToken, "bidToken");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(bidTokenConfig, "bidTokenConfig");
        return new k(bidToken, publicKey, bidTokenConfig);
    }

    public static /* synthetic */ k a(k kVar, String str, String str2, f fVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kVar.a;
        }
        if ((i & 2) != 0) {
            str2 = kVar.b;
        }
        if ((i & 4) != 0) {
            fVar = kVar.c;
        }
        return kVar.a(str, str2, fVar);
    }
}
