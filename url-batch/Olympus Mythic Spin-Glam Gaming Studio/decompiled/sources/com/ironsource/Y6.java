package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public interface Y6 {

    public static final class a implements Y6 {

        @NotNull
        private final EnumC4543a7 a;

        public a(@NotNull EnumC4543a7 strategy) {
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            this.a = strategy;
        }

        @Override // com.ironsource.Y6
        @NotNull
        public String a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.Y6
        @NotNull
        public EnumC4543a7 b() {
            return this.a;
        }

        @NotNull
        public final EnumC4543a7 c() {
            return this.a;
        }
    }

    @NotNull
    String a();

    @NotNull
    EnumC4543a7 b();
}
