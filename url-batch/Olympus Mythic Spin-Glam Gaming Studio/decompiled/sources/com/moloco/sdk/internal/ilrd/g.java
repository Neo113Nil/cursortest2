package com.moloco.sdk.internal.ilrd;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public abstract class g {
    public static final int a = 0;

    @StabilityInferred
    public static final class a extends g {
        public static final int c = 0;

        @NotNull
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String reason) {
            super(null);
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.b = reason;
        }

        @NotNull
        public final String a() {
            return this.b;
        }

        @NotNull
        public final String b() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.b, ((a) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(reason=" + this.b + ')';
        }

        @NotNull
        public final a a(@NotNull String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new a(reason);
        }

        public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.b;
            }
            return aVar.a(str);
        }
    }

    @StabilityInferred
    public static final class b extends g {

        @NotNull
        public static final b b = new b();
        public static final int c = 0;

        public b() {
            super(null);
        }
    }

    @StabilityInferred
    public static final class c extends g {

        @NotNull
        public static final c b = new c();
        public static final int c = 0;

        public c() {
            super(null);
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public g() {
    }
}
