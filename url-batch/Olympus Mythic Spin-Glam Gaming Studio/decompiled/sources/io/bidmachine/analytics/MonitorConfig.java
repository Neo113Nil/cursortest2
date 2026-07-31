package io.bidmachine.analytics;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \u0018\u00002\u00020\u0001:\u0003*+,BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\n\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lio/bidmachine/analytics/MonitorConfig;", "", "", "name", "url", "", "batchSize", "", "interval", "", "isReportEnabled", "Lio/bidmachine/analytics/Filter;", "filter", "Lio/bidmachine/analytics/MonitorConfig$ConfigExtension;", "configExtension", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJZLio/bidmachine/analytics/Filter;Lio/bidmachine/analytics/MonitorConfig$ConfigExtension;)V", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "getUrl", "c", "I", "getBatchSize", "()I", "d", "J", "getInterval", "()J", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Z", "()Z", InneractiveMediationDefs.GENDER_FEMALE, "Lio/bidmachine/analytics/Filter;", "getFilter", "()Lio/bidmachine/analytics/Filter;", "g", "Lio/bidmachine/analytics/MonitorConfig$ConfigExtension;", "getConfigExtension", "()Lio/bidmachine/analytics/MonitorConfig$ConfigExtension;", "ConfigExtension", "GenericConfigExtension", "ImpConfigExtension", "bidmachine-android-sdk_j_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class MonitorConfig {

    /* renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* renamed from: b, reason: from kotlin metadata */
    private final String url;

    /* renamed from: c, reason: from kotlin metadata */
    private final int batchSize;

    /* renamed from: d, reason: from kotlin metadata */
    private final long interval;

    /* renamed from: e, reason: from kotlin metadata */
    private final boolean isReportEnabled;

    /* renamed from: f, reason: from kotlin metadata */
    private final Filter filter;

    /* renamed from: g, reason: from kotlin metadata */
    private final ConfigExtension configExtension;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lio/bidmachine/analytics/MonitorConfig$ConfigExtension;", "", "bidmachine-android-sdk_j_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface ConfigExtension {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/bidmachine/analytics/MonitorConfig$GenericConfigExtension;", "Lio/bidmachine/analytics/MonitorConfig$ConfigExtension;", "", "config", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getConfig", "()Ljava/lang/String;", "bidmachine-android-sdk_j_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class GenericConfigExtension implements ConfigExtension {

        /* renamed from: a, reason: from kotlin metadata */
        private final String config;

        /* JADX WARN: Multi-variable type inference failed */
        public GenericConfigExtension() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final String getConfig() {
            return this.config;
        }

        public GenericConfigExtension(String str) {
            this.config = str;
        }

        public /* synthetic */ GenericConfigExtension(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B \u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lio/bidmachine/analytics/MonitorConfig$ImpConfigExtension;", "Lio/bidmachine/analytics/MonitorConfig$ConfigExtension;", "", "iaaQuery", "Lkotlin/time/Duration;", "recordsTtl", "<init>", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "Ljava/lang/String;", "getIaaQuery", "()Ljava/lang/String;", "b", "J", "getRecordsTtl-UwyO8pc", "()J", "bidmachine-android-sdk_j_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ImpConfigExtension implements ConfigExtension {

        /* renamed from: a, reason: from kotlin metadata */
        private final String iaaQuery;

        /* renamed from: b, reason: from kotlin metadata */
        private final long recordsTtl;

        public /* synthetic */ ImpConfigExtension(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j);
        }

        public final String getIaaQuery() {
            return this.iaaQuery;
        }

        /* renamed from: getRecordsTtl-UwyO8pc, reason: not valid java name and from getter */
        public final long getRecordsTtl() {
            return this.recordsTtl;
        }

        private ImpConfigExtension(String str, long j) {
            this.iaaQuery = str;
            this.recordsTtl = j;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ ImpConfigExtension(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, r0);
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            str = (i & 1) != 0 ? null : str;
            if ((i & 2) != 0) {
                Duration.Companion companion = Duration.Companion;
                j = DurationKt.toDuration(90, DurationUnit.DAYS);
            }
        }
    }

    public MonitorConfig(String str, String str2, int i, long j, boolean z, Filter filter, ConfigExtension configExtension) {
        this.name = str;
        this.url = str2;
        this.batchSize = i;
        this.interval = j;
        this.isReportEnabled = z;
        this.filter = filter;
        this.configExtension = configExtension;
    }

    public final int getBatchSize() {
        return this.batchSize;
    }

    public final ConfigExtension getConfigExtension() {
        return this.configExtension;
    }

    public final Filter getFilter() {
        return this.filter;
    }

    public final long getInterval() {
        return this.interval;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    /* renamed from: isReportEnabled, reason: from getter */
    public final boolean getIsReportEnabled() {
        return this.isReportEnabled;
    }

    public /* synthetic */ MonitorConfig(String str, String str2, int i, long j, boolean z, Filter filter, ConfigExtension configExtension, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, j, z, filter, (i2 & 64) != 0 ? null : configExtension);
    }
}
