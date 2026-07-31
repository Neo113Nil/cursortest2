package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes15.dex */
public abstract class y {
    public static final int a = 0;

    @StabilityInferred
    public static final class a extends y {
        public static final int c = 0;

        @NotNull
        public final j b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull j resource) {
            super(null);
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.b = resource;
        }

        @NotNull
        public final j a() {
            return this.b;
        }
    }

    @StabilityInferred
    public static final class b extends y {
        public static final int c = 0;

        @NotNull
        public final k b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull k resource) {
            super(null);
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.b = resource;
        }

        @NotNull
        public final k a() {
            return this.b;
        }
    }

    @StabilityInferred
    public static final class c extends y {
        public static final int c = 0;

        @NotNull
        public final t b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull t resource) {
            super(null);
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.b = resource;
        }

        @NotNull
        public final t a() {
            return this.b;
        }
    }

    public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public y() {
    }
}
