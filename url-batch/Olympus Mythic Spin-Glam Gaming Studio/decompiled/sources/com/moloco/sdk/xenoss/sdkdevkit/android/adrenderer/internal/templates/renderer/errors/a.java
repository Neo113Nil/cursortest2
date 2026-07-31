package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes11.dex */
public abstract class a extends g {
    public static final int i = 0;

    @NotNull
    public final String h;

    @StabilityInferred
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a$a, reason: collision with other inner class name */
    public static final class C1613a extends a {

        @NotNull
        public static final C1613a j = new C1613a();
        public static final int k = 0;

        public C1613a() {
            super("net::ERR_CERT_AUTHORITY_INVALID", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof C1613a);
        }

        public int hashCode() {
            return -932810174;
        }

        @NotNull
        public String toString() {
            return "ERR_CERT_AUTHORITY_INVALID";
        }
    }

    public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g
    @NotNull
    public String c() {
        return this.h;
    }

    public a(String str) {
        super(0, str, false, true, null);
        this.h = str;
    }
}
