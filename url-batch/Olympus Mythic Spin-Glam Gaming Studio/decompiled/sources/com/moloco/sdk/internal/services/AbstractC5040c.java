package com.moloco.sdk.internal.services;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* renamed from: com.moloco.sdk.internal.services.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC5040c {
    public static final int a = 0;

    @StabilityInferred
    /* renamed from: com.moloco.sdk.internal.services.c$a */
    public static final class a extends AbstractC5040c {
        public static final int c = 0;

        @NotNull
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String id) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.b = id;
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
            return "Available(id=" + this.b + ')';
        }

        @NotNull
        public final a a(@NotNull String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new a(id);
        }

        public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.b;
            }
            return aVar.a(str);
        }
    }

    @StabilityInferred
    /* renamed from: com.moloco.sdk.internal.services.c$b */
    public static final class b extends AbstractC5040c {

        @NotNull
        public static final b b = new b();
        public static final int c = 0;

        public b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC5040c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC5040c() {
    }
}
