package org.chromium.net;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresOptIn;
import java.time.Duration;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class DnsOptions {

    @Nullable
    private final Boolean mEnableStaleDns;

    @Nullable
    private final Boolean mPersistHostCache;

    @Nullable
    private final Long mPersistHostCachePeriodMillis;

    @Nullable
    private final Boolean mPreestablishConnectionsToStaleDnsResults;

    @Nullable
    private final StaleDnsOptions mStaleDnsOptions;

    @Nullable
    private final Boolean mUseBuiltInDnsResolver;

    @RequiresOptIn
    public @interface Experimental {
    }

    DnsOptions(Builder builder) {
        this.mEnableStaleDns = builder.mEnableStaleDns;
        this.mStaleDnsOptions = builder.mStaleDnsOptions;
        this.mPersistHostCachePeriodMillis = builder.mPersistHostCachePeriodMillis;
        this.mPreestablishConnectionsToStaleDnsResults = builder.mPreestablishConnectionsToStaleDnsResults;
        this.mUseBuiltInDnsResolver = builder.mUseBuiltInDnsResolver;
        this.mPersistHostCache = builder.mPersistHostCache;
    }

    @Nullable
    public Boolean getUseBuiltInDnsResolver() {
        return this.mUseBuiltInDnsResolver;
    }

    @Nullable
    public Boolean getPersistHostCache() {
        return this.mPersistHostCache;
    }

    @Nullable
    public Boolean getEnableStaleDns() {
        return this.mEnableStaleDns;
    }

    @Nullable
    public Long getPersistHostCachePeriodMillis() {
        return this.mPersistHostCachePeriodMillis;
    }

    @Nullable
    public Boolean getPreestablishConnectionsToStaleDnsResults() {
        return this.mPreestablishConnectionsToStaleDnsResults;
    }

    @Nullable
    public StaleDnsOptions getStaleDnsOptions() {
        return this.mStaleDnsOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class StaleDnsOptions {

        @Nullable
        private final Boolean mAllowCrossNetworkUsage;

        @Nullable
        private final Long mFreshLookupTimeoutMillis;

        @Nullable
        private final Long mMaxExpiredDelayMillis;

        @Nullable
        private final Boolean mUseStaleOnNameNotResolved;

        @Nullable
        public Long getFreshLookupTimeoutMillis() {
            return this.mFreshLookupTimeoutMillis;
        }

        @Nullable
        public Long getMaxExpiredDelayMillis() {
            return this.mMaxExpiredDelayMillis;
        }

        @Nullable
        public Boolean getAllowCrossNetworkUsage() {
            return this.mAllowCrossNetworkUsage;
        }

        @Nullable
        public Boolean getUseStaleOnNameNotResolved() {
            return this.mUseStaleOnNameNotResolved;
        }

        public static Builder builder() {
            return new Builder();
        }

        StaleDnsOptions(Builder builder) {
            this.mFreshLookupTimeoutMillis = builder.mFreshLookupTimeoutMillis;
            this.mMaxExpiredDelayMillis = builder.mMaxExpiredDelayMillis;
            this.mAllowCrossNetworkUsage = builder.mAllowCrossNetworkUsage;
            this.mUseStaleOnNameNotResolved = builder.mUseStaleOnNameNotResolved;
        }

        public static final class Builder {
            private Boolean mAllowCrossNetworkUsage;
            private Long mFreshLookupTimeoutMillis;
            private Long mMaxExpiredDelayMillis;
            private Boolean mUseStaleOnNameNotResolved;

            Builder() {
            }

            public Builder setFreshLookupTimeoutMillis(long j) {
                this.mFreshLookupTimeoutMillis = Long.valueOf(j);
                return this;
            }

            @RequiresApi
            public Builder setFreshLookupTimeout(@NonNull Duration duration) {
                long millis;
                Objects.requireNonNull(duration);
                millis = duration.toMillis();
                return setFreshLookupTimeoutMillis(millis);
            }

            public Builder setMaxExpiredDelayMillis(long j) {
                this.mMaxExpiredDelayMillis = Long.valueOf(j);
                return this;
            }

            @RequiresApi
            public Builder setMaxExpiredDelay(@NonNull Duration duration) {
                long millis;
                Objects.requireNonNull(duration);
                millis = duration.toMillis();
                return setMaxExpiredDelayMillis(millis);
            }

            public Builder allowCrossNetworkUsage(boolean z) {
                this.mAllowCrossNetworkUsage = Boolean.valueOf(z);
                return this;
            }

            public Builder useStaleOnNameNotResolved(boolean z) {
                this.mUseStaleOnNameNotResolved = Boolean.valueOf(z);
                return this;
            }

            public StaleDnsOptions build() {
                return new StaleDnsOptions(this);
            }
        }
    }

    public static final class Builder {

        @Nullable
        private Boolean mEnableStaleDns;

        @Nullable
        private Boolean mPersistHostCache;

        @Nullable
        private Long mPersistHostCachePeriodMillis;

        @Nullable
        private Boolean mPreestablishConnectionsToStaleDnsResults;

        @Nullable
        private StaleDnsOptions mStaleDnsOptions;

        @Nullable
        private Boolean mUseBuiltInDnsResolver;

        Builder() {
        }

        public Builder useBuiltInDnsResolver(boolean z) {
            this.mUseBuiltInDnsResolver = Boolean.valueOf(z);
            return this;
        }

        public Builder enableStaleDns(boolean z) {
            this.mEnableStaleDns = Boolean.valueOf(z);
            return this;
        }

        public Builder setStaleDnsOptions(StaleDnsOptions staleDnsOptions) {
            this.mStaleDnsOptions = staleDnsOptions;
            return this;
        }

        @Experimental
        public Builder setStaleDnsOptions(StaleDnsOptions.Builder builder) {
            return setStaleDnsOptions(builder.build());
        }

        @Experimental
        public Builder preestablishConnectionsToStaleDnsResults(boolean z) {
            this.mPreestablishConnectionsToStaleDnsResults = Boolean.valueOf(z);
            return this;
        }

        public Builder persistHostCache(boolean z) {
            this.mPersistHostCache = Boolean.valueOf(z);
            return this;
        }

        public Builder setPersistHostCachePeriodMillis(long j) {
            this.mPersistHostCachePeriodMillis = Long.valueOf(j);
            return this;
        }

        @RequiresApi
        public Builder setPersistDelay(@NonNull Duration duration) {
            long millis;
            Objects.requireNonNull(duration);
            millis = duration.toMillis();
            return setPersistHostCachePeriodMillis(millis);
        }

        public DnsOptions build() {
            return new DnsOptions(this);
        }
    }
}
