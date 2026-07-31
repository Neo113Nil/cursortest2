package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes12.dex */
public abstract class c extends g {
    public static final int i = 0;

    @NotNull
    public final String h;

    @StabilityInferred
    public static final class a extends c {

        @NotNull
        public static final a j = new a();
        public static final int k = 0;

        public a() {
            super("net::ERR_ADDRESS_UNREACHABLE", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -557181147;
        }

        @NotNull
        public String toString() {
            return "ERR_ADDRESS_UNREACHABLE";
        }
    }

    @StabilityInferred
    public static final class b extends c {

        @NotNull
        public static final b j = new b();
        public static final int k = 0;

        public b() {
            super("net::ERR_INTERNET_DISCONNECTED", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 909214677;
        }

        @NotNull
        public String toString() {
            return "ERR_INTERNET_DISCONNECTED";
        }
    }

    @StabilityInferred
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.c$c, reason: collision with other inner class name */
    public static final class C1615c extends c {

        @NotNull
        public static final C1615c j = new C1615c();
        public static final int k = 0;

        public C1615c() {
            super("net::ERR_NAME_NOT_RESOLVED", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof C1615c);
        }

        public int hashCode() {
            return -1297026924;
        }

        @NotNull
        public String toString() {
            return "ERR_NAME_NOT_RESOLVED";
        }
    }

    public /* synthetic */ c(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g
    @NotNull
    public String c() {
        return this.h;
    }

    public c(String str) {
        super(-2, str, true, false, null);
        this.h = str;
    }
}
