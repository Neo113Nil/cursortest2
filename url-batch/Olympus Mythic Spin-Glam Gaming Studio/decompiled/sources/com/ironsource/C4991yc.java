package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.yc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4991yc implements Fd {

    @NotNull
    private final String a;

    /* renamed from: com.ironsource.yc$a */
    public static final class a {

        @NotNull
        public static final a a = new a();

        @NotNull
        public static final String b = "IronSource";

        private a() {
        }
    }

    public C4991yc(@NotNull String networkInstanceId) {
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        this.a = networkInstanceId;
    }

    @Override // com.ironsource.Fd
    @NotNull
    public String value() {
        if (this.a.length() == 0) {
            return "";
        }
        if (Intrinsics.areEqual(this.a, "0") || Intrinsics.areEqual(this.a, "IronSource")) {
            return "IronSource";
        }
        return "IronSource_" + this.a;
    }
}
