package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public final class A1 {

    @NotNull
    private final String a;

    /* JADX WARN: Multi-variable type inference failed */
    public A1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A1) && Intrinsics.areEqual(this.a, ((A1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplicationAuctionSettings(auctionData=" + this.a + ")";
    }

    public A1(@NotNull String auctionData) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        this.a = auctionData;
    }

    @NotNull
    public final A1 a(@NotNull String auctionData) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        return new A1(auctionData);
    }

    public /* synthetic */ A1(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ A1 a(A1 a1, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = a1.a;
        }
        return a1.a(str);
    }
}
