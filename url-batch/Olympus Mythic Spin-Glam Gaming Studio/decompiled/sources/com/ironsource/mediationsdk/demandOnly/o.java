package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.InterfaceC4765m5;
import com.ironsource.Jb;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface o extends InterfaceC4765m5<String> {

    public static final class a implements o {

        @NotNull
        private final String a;

        public a(@NotNull String rowAdm) {
            Intrinsics.checkNotNullParameter(rowAdm, "rowAdm");
            this.a = rowAdm;
        }

        @Override // com.ironsource.InterfaceC4765m5
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a() {
            return this.a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.o
        public <T> T a(@NotNull Jb<String, T> mapper) {
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            return mapper.a(this.a);
        }
    }

    <T> T a(@NotNull Jb<String, T> jb);
}
