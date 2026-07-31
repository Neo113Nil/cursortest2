package io.bidmachine.analytics;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001 B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lio/bidmachine/analytics/ReaderConfig;", "", "", "name", "url", "", "interval", "", "uniqueOnly", "", "Lio/bidmachine/analytics/ReaderConfig$Rule;", "rules", "<init>", "(Ljava/lang/String;Ljava/lang/String;JZLjava/util/List;)V", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "getUrl", "c", "J", "getInterval", "()J", "d", "Z", "getUniqueOnly", "()Z", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/util/List;", "getRules", "()Ljava/util/List;", "Rule", "bidmachine-android-sdk_j_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class ReaderConfig {

    /* renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* renamed from: b, reason: from kotlin metadata */
    private final String url;

    /* renamed from: c, reason: from kotlin metadata */
    private final long interval;

    /* renamed from: d, reason: from kotlin metadata */
    private final boolean uniqueOnly;

    /* renamed from: e, reason: from kotlin metadata */
    private final List rules;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lio/bidmachine/analytics/ReaderConfig$Rule;", "", "GeneralRule", "PurRule", "Lio/bidmachine/analytics/ReaderConfig$Rule$GeneralRule;", "Lio/bidmachine/analytics/ReaderConfig$Rule$PurRule;", "bidmachine-android-sdk_j_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface Rule {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lio/bidmachine/analytics/ReaderConfig$Rule$GeneralRule;", "Lio/bidmachine/analytics/ReaderConfig$Rule;", "", "tag", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "b", "getPath", "bidmachine-android-sdk_j_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class GeneralRule implements Rule {

            /* renamed from: a, reason: from kotlin metadata */
            private final String tag;

            /* renamed from: b, reason: from kotlin metadata */
            private final String path;

            public GeneralRule(String str, String str2) {
                this.tag = str;
                this.path = str2;
            }

            public final String getPath() {
                return this.path;
            }

            public final String getTag() {
                return this.tag;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/bidmachine/analytics/ReaderConfig$Rule$PurRule;", "Lio/bidmachine/analytics/ReaderConfig$Rule;", "", "tag", "path", "query", "", "shouldReport", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "a", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "b", "getPath", "c", "getQuery", "d", "Z", "getShouldReport", "()Z", "bidmachine-android-sdk_j_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class PurRule implements Rule {

            /* renamed from: a, reason: from kotlin metadata */
            private final String tag;

            /* renamed from: b, reason: from kotlin metadata */
            private final String path;

            /* renamed from: c, reason: from kotlin metadata */
            private final String query;

            /* renamed from: d, reason: from kotlin metadata */
            private final boolean shouldReport;

            public PurRule(String str, String str2, String str3, boolean z) {
                this.tag = str;
                this.path = str2;
                this.query = str3;
                this.shouldReport = z;
            }

            public final String getPath() {
                return this.path;
            }

            public final String getQuery() {
                return this.query;
            }

            public final boolean getShouldReport() {
                return this.shouldReport;
            }

            public final String getTag() {
                return this.tag;
            }
        }
    }

    public ReaderConfig(String str, String str2, long j, boolean z, List<? extends Rule> list) {
        this.name = str;
        this.url = str2;
        this.interval = j;
        this.uniqueOnly = z;
        this.rules = list;
    }

    public final long getInterval() {
        return this.interval;
    }

    public final String getName() {
        return this.name;
    }

    public final List<Rule> getRules() {
        return this.rules;
    }

    public final boolean getUniqueOnly() {
        return this.uniqueOnly;
    }

    public final String getUrl() {
        return this.url;
    }
}
