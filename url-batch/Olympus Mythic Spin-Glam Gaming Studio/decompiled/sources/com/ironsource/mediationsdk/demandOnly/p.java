package com.ironsource.mediationsdk.demandOnly;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface p {

    public static class a implements p {

        @NotNull
        private final String a;

        public a(@NotNull String plumbus) {
            Intrinsics.checkNotNullParameter(plumbus, "plumbus");
            this.a = plumbus;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.p
        @NotNull
        public String value() {
            return this.a;
        }
    }

    public static final class b extends a {
        public b() {
            super("");
        }
    }

    @NotNull
    String value();
}
