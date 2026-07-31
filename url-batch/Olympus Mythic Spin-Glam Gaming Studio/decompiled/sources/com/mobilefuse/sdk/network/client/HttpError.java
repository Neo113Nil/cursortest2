package com.mobilefuse.sdk.network.client;

import com.facebook.internal.NativeProtocol;
import com.mobilefuse.sdk.exception.BaseError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpClient.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/mobilefuse/sdk/network/client/HttpError;", "Lcom/mobilefuse/sdk/exception/BaseError;", "()V", "ConnectionError", NativeProtocol.ERROR_UNKNOWN_ERROR, "Lcom/mobilefuse/sdk/network/client/HttpError$ConnectionError;", "Lcom/mobilefuse/sdk/network/client/HttpError$UnknownError;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes14.dex */
public abstract class HttpError implements BaseError {
    private HttpError() {
    }

    public /* synthetic */ HttpError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: HttpClient.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/mobilefuse/sdk/network/client/HttpError$UnknownError;", "Lcom/mobilefuse/sdk/network/client/HttpError;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
    public static final /* data */ class UnknownError extends HttpError {

        @Nullable
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public UnknownError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ UnknownError copy$default(UnknownError unknownError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknownError.getMessage();
            }
            return unknownError.copy(str);
        }

        @Nullable
        public final String component1() {
            return getMessage();
        }

        @NotNull
        public final UnknownError copy(@Nullable String message) {
            return new UnknownError(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this != other) {
                return (other instanceof UnknownError) && Intrinsics.areEqual(getMessage(), ((UnknownError) other).getMessage());
            }
            return true;
        }

        public int hashCode() {
            String message = getMessage();
            if (message != null) {
                return message.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            return "UnknownError(message=" + getMessage() + ")";
        }

        public UnknownError(@Nullable String str) {
            super(null);
            this.message = str;
        }

        public /* synthetic */ UnknownError(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.mobilefuse.sdk.exception.BaseError
        @Nullable
        public String getMessage() {
            return this.message;
        }
    }

    /* compiled from: HttpClient.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/mobilefuse/sdk/network/client/HttpError$ConnectionError;", "Lcom/mobilefuse/sdk/network/client/HttpError;", "statusCode", "", "message", "", "(ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getStatusCode", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
    public static final /* data */ class ConnectionError extends HttpError {

        @Nullable
        private final String message;
        private final int statusCode;

        public static /* synthetic */ ConnectionError copy$default(ConnectionError connectionError, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = connectionError.statusCode;
            }
            if ((i2 & 2) != 0) {
                str = connectionError.getMessage();
            }
            return connectionError.copy(i, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStatusCode() {
            return this.statusCode;
        }

        @Nullable
        public final String component2() {
            return getMessage();
        }

        @NotNull
        public final ConnectionError copy(int statusCode, @Nullable String message) {
            return new ConnectionError(statusCode, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConnectionError)) {
                return false;
            }
            ConnectionError connectionError = (ConnectionError) other;
            return this.statusCode == connectionError.statusCode && Intrinsics.areEqual(getMessage(), connectionError.getMessage());
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.statusCode) * 31;
            String message = getMessage();
            return hashCode + (message != null ? message.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ConnectionError(statusCode=" + this.statusCode + ", message=" + getMessage() + ")";
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        public /* synthetic */ ConnectionError(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : str);
        }

        @Override // com.mobilefuse.sdk.exception.BaseError
        @Nullable
        public String getMessage() {
            return this.message;
        }

        public ConnectionError(int i, @Nullable String str) {
            super(null);
            this.statusCode = i;
            this.message = str;
        }
    }
}
