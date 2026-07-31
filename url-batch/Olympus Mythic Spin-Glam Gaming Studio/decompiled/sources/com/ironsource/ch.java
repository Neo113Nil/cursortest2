package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public interface ch {

    public static final class a {

        @NotNull
        public static final C1357a a = new C1357a(null);

        /* renamed from: com.ironsource.ch$a$a, reason: collision with other inner class name */
        public static final class C1357a {
            public /* synthetic */ C1357a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ch a(boolean z, @NotNull Vg waterfallOperations) {
                Intrinsics.checkNotNullParameter(waterfallOperations, "waterfallOperations");
                return z ? new ah(waterfallOperations) : new Zg(waterfallOperations);
            }

            private C1357a() {
            }
        }
    }

    void a();

    void a(@NotNull B b);

    @NotNull
    Od b();

    @Nullable
    default B c() {
        return null;
    }
}
