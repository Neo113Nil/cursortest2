package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import androidx.compose.runtime.internal.StabilityInferred;
import com.inmobi.unification.sdk.InitializationStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes14.dex */
public abstract class j {
    public static final int a = 0;

    @StabilityInferred
    public static final class a extends j {

        @NotNull
        public static final a b = new a();
        public static final int c = 0;

        public a() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1425206400;
        }

        @NotNull
        public String toString() {
            return "Backgrounded";
        }
    }

    @StabilityInferred
    public static final class b extends j {

        @NotNull
        public static final b b = new b();
        public static final int c = 0;

        public b() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -296757611;
        }

        @NotNull
        public String toString() {
            return "Fallback";
        }
    }

    @StabilityInferred
    public static final class c extends j {

        @NotNull
        public static final c b = new c();
        public static final int c = 0;

        public c() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1208562192;
        }

        @NotNull
        public String toString() {
            return InitializationStatus.SUCCESS;
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public j() {
    }
}
