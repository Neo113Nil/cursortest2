package com.moloco.sdk.internal.services;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes15.dex */
public abstract class A {
    public static final int a = 0;

    @StabilityInferred
    public static final class a extends A {
        public static final int c = 0;

        @NotNull
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String carrier) {
            super(null);
            Intrinsics.checkNotNullParameter(carrier, "carrier");
            this.b = carrier;
        }

        @NotNull
        public final String a() {
            return this.b;
        }
    }

    @StabilityInferred
    public static final class b extends A {

        @NotNull
        public static final b b = new b();
        public static final int c = 0;

        public b() {
            super(null);
        }
    }

    @StabilityInferred
    public static final class c extends A {

        @NotNull
        public static final c b = new c();
        public static final int c = 0;

        public c() {
            super(null);
        }
    }

    public /* synthetic */ A(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public A() {
    }
}
