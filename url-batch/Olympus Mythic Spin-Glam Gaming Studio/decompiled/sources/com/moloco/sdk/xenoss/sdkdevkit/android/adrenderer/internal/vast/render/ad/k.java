package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes4.dex */
public abstract class k {
    public static final int a = 0;

    @StabilityInferred
    public static final class a extends k {
        public static final int c = 8;

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a companion) {
            super(null);
            Intrinsics.checkNotNullParameter(companion, "companion");
            this.b = companion;
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a a() {
            return this.b;
        }
    }

    @StabilityInferred
    public static final class b extends k {
        public static final int c = 8;

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a dec) {
            super(null);
            Intrinsics.checkNotNullParameter(dec, "dec");
            this.b = dec;
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a a() {
            return this.b;
        }
    }

    @StabilityInferred
    public static final class c extends k {
        public static final int c = 8;

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c linear) {
            super(null);
            Intrinsics.checkNotNullParameter(linear, "linear");
            this.b = linear;
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c a() {
            return this.b;
        }
    }

    @StabilityInferred
    public static final class d extends k {
        public static final int c = 8;

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j mraid) {
            super(null);
            Intrinsics.checkNotNullParameter(mraid, "mraid");
            this.b = mraid;
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j a() {
            return this.b;
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public k() {
    }
}
