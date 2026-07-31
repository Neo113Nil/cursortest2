package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes8.dex */
public abstract class b {
    public static final int a = 0;

    @StabilityInferred
    public static final class a extends b {

        @NotNull
        public static final a b = new a();
        public static final int c = 0;

        public a() {
            super(null);
        }
    }

    @StabilityInferred
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b$b, reason: collision with other inner class name */
    public static final class C1647b extends b {

        @NotNull
        public static final C1647b b = new C1647b();
        public static final int c = 0;

        public C1647b() {
            super(null);
        }
    }

    @StabilityInferred
    public static final class c extends b {

        @NotNull
        public static final c b = new c();
        public static final int c = 0;

        public c() {
            super(null);
        }
    }

    @StabilityInferred
    public static final class d extends b {
        public static final int c = 8;

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.b = error;
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c a() {
            return this.b;
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.b, ((d) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(error=" + this.b + ')';
        }

        @NotNull
        public final d a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new d(error);
        }

        public static /* synthetic */ d a(d dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = dVar.b;
            }
            return dVar.a(cVar);
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public b() {
    }
}
