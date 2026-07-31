package com.ironsource;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.r2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4851r2 {

    @NotNull
    private final String a;
    private final com.ironsource.mediationsdk.d b;

    public C4851r2(@NotNull String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        this.a = serverData;
        this.b = com.ironsource.mediationsdk.d.b();
    }

    private final String c() {
        return this.a;
    }

    @NotNull
    public final C4851r2 a(@NotNull String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        return new C4851r2(serverData);
    }

    @NotNull
    public final Map<String, String> b() {
        Map<String, String> b = this.b.b(this.a);
        Intrinsics.checkNotNullExpressionValue(b, "auctionDataUtils.getAuct…verDataParams(serverData)");
        return b;
    }

    @NotNull
    public final String d() {
        String c = this.b.c(this.a);
        Intrinsics.checkNotNullExpressionValue(c, "auctionDataUtils.getDyna…romServerData(serverData)");
        return c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4851r2) && Intrinsics.areEqual(this.a, ((C4851r2) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "AuctionServerData(serverData=" + this.a + ")";
    }

    public static /* synthetic */ C4851r2 a(C4851r2 c4851r2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4851r2.a;
        }
        return c4851r2.a(str);
    }

    @NotNull
    public final String a() {
        String a = this.b.a(this.a);
        Intrinsics.checkNotNullExpressionValue(a, "auctionDataUtils.getAdmFromServerData(serverData)");
        return a;
    }
}
