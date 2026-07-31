package io.appmetrica.analytics.idsync.internal.model;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0018\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00180\u0017\u0012\u0006\u0010#\u001a\u00020\u001e\u0012\u0006\u0010&\u001a\u00020\u001e\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018\u0012\u0006\u00100\u001a\u00020\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b4\u00105J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R)\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010&\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u00100\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u00103\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b2\u0010\f¨\u00066"}, d2 = {"Lio/appmetrica/analytics/idsync/internal/model/RequestConfig;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "type", "b", "getUrl", "url", "Lio/appmetrica/analytics/idsync/internal/model/Preconditions;", "c", "Lio/appmetrica/analytics/idsync/internal/model/Preconditions;", "getPreconditions", "()Lio/appmetrica/analytics/idsync/internal/model/Preconditions;", "preconditions", "", "", "d", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "headers", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "J", "getResendIntervalForValidResponse", "()J", "resendIntervalForValidResponse", InneractiveMediationDefs.GENDER_FEMALE, "getResendIntervalForInvalidResponse", "resendIntervalForInvalidResponse", "g", "Ljava/util/List;", "getValidResponseCodes", "()Ljava/util/List;", "validResponseCodes", "h", "Z", "getReportEventEnabled", "()Z", "reportEventEnabled", "i", "getReportUrl", "reportUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/appmetrica/analytics/idsync/internal/model/Preconditions;Ljava/util/Map;JJLjava/util/List;ZLjava/lang/String;)V", "id-sync_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RequestConfig {

    /* renamed from: a, reason: from kotlin metadata */
    private final String type;

    /* renamed from: b, reason: from kotlin metadata */
    private final String url;

    /* renamed from: c, reason: from kotlin metadata */
    private final Preconditions preconditions;

    /* renamed from: d, reason: from kotlin metadata */
    private final Map headers;

    /* renamed from: e, reason: from kotlin metadata */
    private final long resendIntervalForValidResponse;

    /* renamed from: f, reason: from kotlin metadata */
    private final long resendIntervalForInvalidResponse;

    /* renamed from: g, reason: from kotlin metadata */
    private final List validResponseCodes;

    /* renamed from: h, reason: from kotlin metadata */
    private final boolean reportEventEnabled;

    /* renamed from: i, reason: from kotlin metadata */
    private final String reportUrl;

    public RequestConfig(@NotNull String str, @NotNull String str2, @NotNull Preconditions preconditions, @NotNull Map<String, ? extends List<String>> map, long j, long j2, @NotNull List<Integer> list, boolean z, @Nullable String str3) {
        this.type = str;
        this.url = str2;
        this.preconditions = preconditions;
        this.headers = map;
        this.resendIntervalForValidResponse = j;
        this.resendIntervalForInvalidResponse = j2;
        this.validResponseCodes = list;
        this.reportEventEnabled = z;
        this.reportUrl = str3;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(RequestConfig.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.RequestConfig");
        RequestConfig requestConfig = (RequestConfig) other;
        return this.resendIntervalForValidResponse == requestConfig.resendIntervalForValidResponse && this.resendIntervalForInvalidResponse == requestConfig.resendIntervalForInvalidResponse && Intrinsics.areEqual(this.type, requestConfig.type) && Intrinsics.areEqual(this.url, requestConfig.url) && Intrinsics.areEqual(this.preconditions, requestConfig.preconditions) && Intrinsics.areEqual(this.headers, requestConfig.headers) && Intrinsics.areEqual(this.validResponseCodes, requestConfig.validResponseCodes) && this.reportEventEnabled == requestConfig.reportEventEnabled && Intrinsics.areEqual(this.reportUrl, requestConfig.reportUrl);
    }

    @NotNull
    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final Preconditions getPreconditions() {
        return this.preconditions;
    }

    public final boolean getReportEventEnabled() {
        return this.reportEventEnabled;
    }

    @Nullable
    public final String getReportUrl() {
        return this.reportUrl;
    }

    public final long getResendIntervalForInvalidResponse() {
        return this.resendIntervalForInvalidResponse;
    }

    public final long getResendIntervalForValidResponse() {
        return this.resendIntervalForValidResponse;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final List<Integer> getValidResponseCodes() {
        return this.validResponseCodes;
    }

    public int hashCode() {
        int hashCode = (Boolean.hashCode(this.reportEventEnabled) + ((this.validResponseCodes.hashCode() + ((this.headers.hashCode() + ((this.preconditions.hashCode() + ((this.url.hashCode() + ((this.type.hashCode() + ((Long.hashCode(this.resendIntervalForInvalidResponse) + (Long.hashCode(this.resendIntervalForValidResponse) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.reportUrl;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RequestConfig(type='" + this.type + "', url='" + this.url + "', preconditions=" + this.preconditions + ", headers=" + this.headers + ", resendIntervalForValidResponse=" + this.resendIntervalForValidResponse + ", resendIntervalForInvalidResponse=" + this.resendIntervalForInvalidResponse + ", validResponseCodes=" + this.validResponseCodes + ", reportEventEnabled=" + this.reportEventEnabled + ", reportUrl=" + this.reportUrl + ')';
    }
}
