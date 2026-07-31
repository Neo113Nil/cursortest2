package com.ogury.core.internal.network;

import com.inmobi.unification.sdk.InitializationStatus;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ogury/core/internal/network/NetworkResponse;", "", "Failure", InitializationStatus.SUCCESS, "Lcom/ogury/core/internal/network/NetworkResponse$Failure;", "Lcom/ogury/core/internal/network/NetworkResponse$Success;", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class NetworkResponse {

    /* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR+\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ogury/core/internal/network/NetworkResponse$Failure;", "Lcom/ogury/core/internal/network/NetworkResponse;", "", "responseBody", "", "", "responseHeaders", "", TelemetryCategory.EXCEPTION, "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Throwable;)V", "a", "Ljava/lang/String;", "getResponseBody", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "getResponseHeaders", "()Ljava/util/Map;", "c", "Ljava/lang/Throwable;", "getException", "()Ljava/lang/Throwable;", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Failure extends NetworkResponse {

        /* renamed from: a, reason: from kotlin metadata */
        public final String responseBody;

        /* renamed from: b, reason: from kotlin metadata */
        public final Map responseHeaders;

        /* renamed from: c, reason: from kotlin metadata */
        public final Throwable exception;

        public /* synthetic */ Failure(String str, Map map, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : map, th);
        }

        @NotNull
        public final Throwable getException() {
            return this.exception;
        }

        @NotNull
        public final String getResponseBody() {
            return this.responseBody;
        }

        @Nullable
        public final Map<String, List<String>> getResponseHeaders() {
            return this.responseHeaders;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull String responseBody, @Nullable Map<String, List<String>> map, @NotNull Throwable exception) {
            super(null);
            Intrinsics.checkNotNullParameter(responseBody, "responseBody");
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.responseBody = responseBody;
            this.responseHeaders = map;
            this.exception = exception;
        }
    }

    /* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\f\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR+\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ogury/core/internal/network/NetworkResponse$Success;", "Lcom/ogury/core/internal/network/NetworkResponse;", "", "responseBody", "", "", "responseHeaders", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "a", "Ljava/lang/String;", "getResponseBody", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "getResponseHeaders", "()Ljava/util/Map;", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Success extends NetworkResponse {

        /* renamed from: a, reason: from kotlin metadata */
        public final String responseBody;

        /* renamed from: b, reason: from kotlin metadata */
        public final Map responseHeaders;

        public /* synthetic */ Success(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : map);
        }

        @NotNull
        public final String getResponseBody() {
            return this.responseBody;
        }

        @Nullable
        public final Map<String, List<String>> getResponseHeaders() {
            return this.responseHeaders;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull String responseBody, @Nullable Map<String, List<String>> map) {
            super(null);
            Intrinsics.checkNotNullParameter(responseBody, "responseBody");
            this.responseBody = responseBody;
            this.responseHeaders = map;
        }
    }

    public NetworkResponse(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
