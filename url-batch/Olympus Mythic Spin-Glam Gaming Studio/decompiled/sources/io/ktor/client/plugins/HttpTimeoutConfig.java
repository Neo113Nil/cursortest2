package io.ktor.client.plugins;

import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: HttpTimeout.kt */
/* loaded from: classes4.dex */
public final class HttpTimeoutConfig {
    public static final Companion Companion = new Companion(0 == true ? 1 : 0);
    private static final AttributeKey key;
    private Long _connectTimeoutMillis;
    private Long _requestTimeoutMillis;
    private Long _socketTimeoutMillis;

    public /* synthetic */ HttpTimeoutConfig(Long l, Long l2, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : l3);
    }

    public HttpTimeoutConfig(Long l, Long l2, Long l3) {
        this._requestTimeoutMillis = 0L;
        this._connectTimeoutMillis = 0L;
        this._socketTimeoutMillis = 0L;
        setRequestTimeoutMillis(l);
        setConnectTimeoutMillis(l2);
        setSocketTimeoutMillis(l3);
    }

    public final Long getRequestTimeoutMillis() {
        return this._requestTimeoutMillis;
    }

    public final void setRequestTimeoutMillis(Long l) {
        this._requestTimeoutMillis = checkTimeoutValue(l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        KType kType = null;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HttpTimeoutConfig.class);
        try {
            kType = Reflection.typeOf(HttpTimeoutConfig.class);
        } catch (Throwable unused) {
        }
        key = new AttributeKey("TimeoutConfiguration", new TypeInfo(orCreateKotlinClass, kType));
    }

    public final Long getConnectTimeoutMillis() {
        return this._connectTimeoutMillis;
    }

    public final void setConnectTimeoutMillis(Long l) {
        this._connectTimeoutMillis = checkTimeoutValue(l);
    }

    public final Long getSocketTimeoutMillis() {
        return this._socketTimeoutMillis;
    }

    public final void setSocketTimeoutMillis(Long l) {
        this._socketTimeoutMillis = checkTimeoutValue(l);
    }

    private final Long checkTimeoutValue(Long l) {
        if (l == null || l.longValue() > 0) {
            return l;
        }
        throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeoutConfig.INFINITE_TIMEOUT_MS");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HttpTimeoutConfig.class != obj.getClass()) {
            return false;
        }
        HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig) obj;
        return Intrinsics.areEqual(this._requestTimeoutMillis, httpTimeoutConfig._requestTimeoutMillis) && Intrinsics.areEqual(this._connectTimeoutMillis, httpTimeoutConfig._connectTimeoutMillis) && Intrinsics.areEqual(this._socketTimeoutMillis, httpTimeoutConfig._socketTimeoutMillis);
    }

    public int hashCode() {
        Long l = this._requestTimeoutMillis;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this._connectTimeoutMillis;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this._socketTimeoutMillis;
        return hashCode2 + (l3 != null ? l3.hashCode() : 0);
    }

    /* compiled from: HttpTimeout.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
