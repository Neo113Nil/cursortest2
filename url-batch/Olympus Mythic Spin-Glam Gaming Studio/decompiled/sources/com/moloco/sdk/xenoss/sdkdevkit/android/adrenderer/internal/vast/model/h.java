package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes15.dex */
public abstract class h {
    public static final int a = 0;

    @StabilityInferred
    public static final class a extends h {
        public static final int c = 8;

        @NotNull
        public final List<e> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull List<e> companions) {
            super(null);
            Intrinsics.checkNotNullParameter(companions, "companions");
            this.b = companions;
        }

        @NotNull
        public final List<e> a() {
            return this.b;
        }
    }

    @StabilityInferred
    public static final class b extends h {
        public static final int c = 8;

        @NotNull
        public final p b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull p linear) {
            super(null);
            Intrinsics.checkNotNullParameter(linear, "linear");
            this.b = linear;
        }

        @NotNull
        public final p a() {
            return this.b;
        }
    }

    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public h() {
    }
}
