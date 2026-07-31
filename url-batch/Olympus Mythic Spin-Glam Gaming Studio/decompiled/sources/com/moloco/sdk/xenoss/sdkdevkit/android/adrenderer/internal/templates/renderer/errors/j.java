package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes12.dex */
public abstract class j extends g {
    public static final int i = 0;

    @NotNull
    public final String h;

    @StabilityInferred
    public static final class a extends j {

        @NotNull
        public static final a j = new a();
        public static final int k = 0;

        public a() {
            super("net::ERR_UNKNOWN_URL_SCHEME", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 284504500;
        }

        @NotNull
        public String toString() {
            return "ERR_UNKNOWN_URL_SCHEME";
        }
    }

    public /* synthetic */ j(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g
    @NotNull
    public String c() {
        return this.h;
    }

    public j(String str) {
        super(-10, str, false, true, null);
        this.h = str;
    }
}
