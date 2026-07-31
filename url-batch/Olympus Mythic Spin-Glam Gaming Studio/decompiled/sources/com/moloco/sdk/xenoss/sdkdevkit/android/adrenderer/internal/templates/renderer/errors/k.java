package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes12.dex */
public abstract class k extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g {
    public static final int i = 0;

    @NotNull
    public final String h;

    @StabilityInferred
    public static final class a extends k {

        @NotNull
        public static final a j = new a();
        public static final int k = 0;

        public a() {
            super("net::ERR_BLOCKED_BY_ORTB", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 2086682310;
        }

        @NotNull
        public String toString() {
            return "ERR_BLOCKED_BY_ORTB";
        }
    }

    @StabilityInferred
    public static final class b extends k {

        @NotNull
        public static final b j = new b();
        public static final int k = 0;

        public b() {
            super("net::ERR_CLEARTEXT_NOT_PERMITTED", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1499225977;
        }

        @NotNull
        public String toString() {
            return "ERR_CLEARTEXT_NOT_PERMITTED";
        }
    }

    @StabilityInferred
    public static final class c extends k {

        @NotNull
        public static final c j = new c();
        public static final int k = 0;

        public c() {
            super("net::ERR_FAILED", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1678282877;
        }

        @NotNull
        public String toString() {
            return "ERR_FAILED";
        }
    }

    @StabilityInferred
    public static final class d extends k {

        @NotNull
        public static final d j = new d();
        public static final int k = 0;

        public d() {
            super("net::ERR_HTTP2_PING_FAILED", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 505018197;
        }

        @NotNull
        public String toString() {
            return "ERR_HTTP2_PING_FAILED";
        }
    }

    @StabilityInferred
    public static final class e extends k {

        @NotNull
        public static final e j = new e();
        public static final int k = 0;

        public e() {
            super("net::ERR_HTTP2_PROTOCOL_ERROR", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1437709814;
        }

        @NotNull
        public String toString() {
            return "ERR_HTTP2_PROTOCOL_ERROR";
        }
    }

    @StabilityInferred
    public static final class f extends k {

        @NotNull
        public static final f j = new f();
        public static final int k = 0;

        public f() {
            super("net::ERR_NETWORK_CHANGED", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return -1485714141;
        }

        @NotNull
        public String toString() {
            return "ERR_NETWORK_CHANGED";
        }
    }

    @StabilityInferred
    public static final class g extends k {

        @NotNull
        public static final g j = new g();
        public static final int k = 0;

        public g() {
            super("net::ERR_QUIC_PROTOCOL_ERROR", null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return -1472226974;
        }

        @NotNull
        public String toString() {
            return "ERR_QUIC_PROTOCOL_ERROR";
        }
    }

    public /* synthetic */ k(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g
    @NotNull
    public String c() {
        return this.h;
    }

    public k(String str) {
        super(-1, str, true, false, null);
        this.h = str;
    }
}
