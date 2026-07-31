package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.data.model.OperationType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UnityAdsNetworkException.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002BU\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "type", "Lcom/unity3d/ads/core/data/model/OperationType;", "code", "", "url", "protocol", "cronetCode", "client", "<init>", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/OperationType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getType", "()Lcom/unity3d/ads/core/data/model/OperationType;", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrl", "getProtocol", "getCronetCode", "getClient", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class UnityAdsNetworkException extends Exception {

    @Nullable
    private final String client;

    @Nullable
    private final Integer code;

    @Nullable
    private final Integer cronetCode;

    @NotNull
    private final String message;

    @Nullable
    private final String protocol;

    @NotNull
    private final OperationType type;

    @Nullable
    private final String url;

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    public /* synthetic */ UnityAdsNetworkException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? OperationType.UNKNOWN : operationType, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num2, (i & 64) == 0 ? str4 : null);
    }

    @NotNull
    public final OperationType getType() {
        return this.type;
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final String getProtocol() {
        return this.protocol;
    }

    @Nullable
    public final Integer getCronetCode() {
        return this.cronetCode;
    }

    @Nullable
    public final String getClient() {
        return this.client;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsNetworkException(@NotNull String message, @NotNull OperationType type, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Integer num2, @Nullable String str3) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type, "type");
        this.message = message;
        this.type = type;
        this.code = num;
        this.url = str;
        this.protocol = str2;
        this.cronetCode = num2;
        this.client = str3;
    }
}
