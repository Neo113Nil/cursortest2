package com.moloco.sdk.internal.services.init;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes13.dex */
public abstract class j {
    public static final int a = 0;

    @StabilityInferred
    public static final class a extends j {
        public static final int c = 0;

        @NotNull
        public final com.moloco.sdk.internal.services.init.b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull com.moloco.sdk.internal.services.init.b type) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.b = type;
        }

        @NotNull
        public final com.moloco.sdk.internal.services.init.b a() {
            return this.b;
        }
    }

    @StabilityInferred
    public static final class b extends j {
        public static final int c = 0;
        public final int b;

        public b(int i) {
            super(null);
            this.b = i;
        }

        public final int a() {
            return this.b;
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public j() {
    }
}
