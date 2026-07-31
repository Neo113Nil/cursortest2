package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes8.dex */
public abstract class d {
    public static final int a = 0;

    @StabilityInferred
    public static final class a extends d {

        @NotNull
        public static final a b = new a();
        public static final int c = 0;

        public a() {
            super(null);
        }
    }

    @StabilityInferred
    public static final class b extends d {

        @NotNull
        public static final b b = new b();
        public static final int c = 0;

        public b() {
            super(null);
        }
    }

    @StabilityInferred
    public static final class c extends d {

        @NotNull
        public static final c b = new c();
        public static final int c = 0;

        public c() {
            super(null);
        }
    }

    @StabilityInferred
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d$d, reason: collision with other inner class name */
    public static final class C1665d extends d {
        public static final int c = 0;

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1665d(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.b = error;
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l a() {
            return this.b;
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l b() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1665d) && this.b == ((C1665d) obj).b;
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(error=" + this.b + ')';
        }

        @NotNull
        public final C1665d a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new C1665d(error);
        }

        public static /* synthetic */ C1665d a(C1665d c1665d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar, int i, Object obj) {
            if ((i & 1) != 0) {
                lVar = c1665d.b;
            }
            return c1665d.a(lVar);
        }
    }

    @StabilityInferred
    public static final class e extends d {

        @NotNull
        public static final e b = new e();
        public static final int c = 0;

        public e() {
            super(null);
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public d() {
    }
}
