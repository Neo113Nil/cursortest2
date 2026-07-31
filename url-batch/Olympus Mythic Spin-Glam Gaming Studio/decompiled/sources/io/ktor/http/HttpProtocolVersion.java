package io.ktor.http;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpProtocolVersion.kt */
/* loaded from: classes13.dex */
public final class HttpProtocolVersion {
    private final int major;
    private final int minor;
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final HttpProtocolVersion HTTP_2_0 = new HttpProtocolVersion("HTTP", 2, 0);
    private static final HttpProtocolVersion HTTP_1_1 = new HttpProtocolVersion("HTTP", 1, 1);
    private static final HttpProtocolVersion HTTP_1_0 = new HttpProtocolVersion("HTTP", 1, 0);
    private static final HttpProtocolVersion SPDY_3 = new HttpProtocolVersion("SPDY", 3, 0);
    private static final HttpProtocolVersion QUIC = new HttpProtocolVersion("QUIC", 1, 0);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpProtocolVersion)) {
            return false;
        }
        HttpProtocolVersion httpProtocolVersion = (HttpProtocolVersion) obj;
        return Intrinsics.areEqual(this.name, httpProtocolVersion.name) && this.major == httpProtocolVersion.major && this.minor == httpProtocolVersion.minor;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + Integer.hashCode(this.major)) * 31) + Integer.hashCode(this.minor);
    }

    /* compiled from: HttpProtocolVersion.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HttpProtocolVersion getHTTP_1_1() {
            return HttpProtocolVersion.HTTP_1_1;
        }
    }

    public HttpProtocolVersion(String name, int i, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.major = i;
        this.minor = i2;
    }

    public String toString() {
        return this.name + '/' + this.major + '.' + this.minor;
    }
}
