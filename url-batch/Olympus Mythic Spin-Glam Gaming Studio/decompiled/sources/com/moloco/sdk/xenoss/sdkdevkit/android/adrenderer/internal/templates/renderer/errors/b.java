package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes12.dex */
public abstract class b extends g {
    public static final int i = 0;

    @NotNull
    public final String h;

    @StabilityInferred
    public static final class a extends b {

        @NotNull
        public static final a j = new a();
        public static final int k = 0;

        public a() {
            super("net::ERR_CONNECTION_ABORTED", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -262105110;
        }

        @NotNull
        public String toString() {
            return "ERR_CONNECTION_ABORTED";
        }
    }

    @StabilityInferred
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.b$b, reason: collision with other inner class name */
    public static final class C1614b extends b {

        @NotNull
        public static final C1614b j = new C1614b();
        public static final int k = 0;

        public C1614b() {
            super("net::ERR_CONNECTION_CLOSED", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof C1614b);
        }

        public int hashCode() {
            return -219055663;
        }

        @NotNull
        public String toString() {
            return "ERR_CONNECTION_CLOSED";
        }
    }

    @StabilityInferred
    public static final class c extends b {

        @NotNull
        public static final c j = new c();
        public static final int k = 0;

        public c() {
            super("net::ERR_CONNECTION_REFUSED", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 2018219755;
        }

        @NotNull
        public String toString() {
            return "ERR_CONNECTION_REFUSED";
        }
    }

    @StabilityInferred
    public static final class d extends b {

        @NotNull
        public static final d j = new d();
        public static final int k = 0;

        public d() {
            super("net::ERR_CONNECTION_RESET", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 976412714;
        }

        @NotNull
        public String toString() {
            return "ERR_CONNECTION_RESET";
        }
    }

    @StabilityInferred
    public static final class e extends b {

        @NotNull
        public static final e j = new e();
        public static final int k = 0;

        public e() {
            super("net::ERR_SOCKET_NOT_CONNECTED", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1961158189;
        }

        @NotNull
        public String toString() {
            return "ERR_SOCKET_NOT_CONNECTED";
        }
    }

    public /* synthetic */ b(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g
    @NotNull
    public String c() {
        return this.h;
    }

    public b(String str) {
        super(-6, str, true, false, null);
        this.h = str;
    }
}
