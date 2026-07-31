package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC5102b {
    public static final int a = 0;

    @StabilityInferred
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b$a */
    public static final class a extends AbstractC5102b {
        public static final int c = 8;

        @NotNull
        public final o b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull o inline) {
            super(null);
            Intrinsics.checkNotNullParameter(inline, "inline");
            this.b = inline;
        }

        @NotNull
        public final o a() {
            return this.b;
        }
    }

    @StabilityInferred
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b$b, reason: collision with other inner class name */
    public static final class C1638b extends AbstractC5102b {
        public static final int c = 8;

        @NotNull
        public final B b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1638b(@NotNull B wrapper) {
            super(null);
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            this.b = wrapper;
        }

        @NotNull
        public final B a() {
            return this.b;
        }
    }

    public /* synthetic */ AbstractC5102b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC5102b() {
    }
}
