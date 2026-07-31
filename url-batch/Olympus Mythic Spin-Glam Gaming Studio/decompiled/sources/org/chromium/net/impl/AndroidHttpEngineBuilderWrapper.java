package org.chromium.net.impl;

import android.net.http.ConnectionMigrationOptions;
import android.net.http.DnsOptions;
import android.net.http.HttpEngine;
import android.net.http.QuicOptions;
import android.util.Log;
import androidx.annotation.RequiresExtension;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.telemetry.ExperimentalOptions;
import org.chromium.net.telemetry.OptionalBoolean;

@RequiresExtension
/* loaded from: classes13.dex */
class AndroidHttpEngineBuilderWrapper extends ICronetEngineBuilder {
    private static final String TAG = "HttpEngBuilderWrap";
    private static boolean sLibraryLoaderUnsupportedLogged;
    private static boolean sNQEUnsupportedLogged;
    private final HttpEngine.Builder mBackend;

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }

    public AndroidHttpEngineBuilderWrapper(HttpEngine.Builder builder) {
        this.mBackend = builder;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public String getDefaultUserAgent() {
        String defaultUserAgent;
        defaultUserAgent = this.mBackend.getDefaultUserAgent();
        return defaultUserAgent;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setUserAgent(String str) {
        this.mBackend.setUserAgent(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setStoragePath(String str) {
        this.mBackend.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        if (!sLibraryLoaderUnsupportedLogged) {
            Log.i(TAG, "Custom library loader is unsupported when HttpEngineNativeProvider is used.");
            sLibraryLoaderUnsupportedLogged = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableQuic(boolean z) {
        this.mBackend.setEnableQuic(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableHttp2(boolean z) {
        this.mBackend.setEnableHttp2(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableBrotli(boolean z) {
        this.mBackend.setEnableBrotli(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableHttpCache(int i, long j) {
        this.mBackend.setEnableHttpCache(i, j);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        this.mBackend.addQuicHint(str, i, i2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date) {
        Instant instant;
        HttpEngine.Builder builder = this.mBackend;
        instant = date.toInstant();
        builder.addPublicKeyPins(str, set, z, instant);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.mBackend.setEnablePublicKeyPinningBypassForLocalTrustAnchors(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setExperimentalOptions(String str) {
        ExperimentalOptions experimentalOptions = new ExperimentalOptions(str);
        this.mBackend.setConnectionMigrationOptions(parseConnectionMigrationOptions(experimentalOptions));
        this.mBackend.setDnsOptions(parseDnsOptions(experimentalOptions));
        this.mBackend.setQuicOptions(parseQuicOptions(experimentalOptions));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        if (!sNQEUnsupportedLogged) {
            Log.i(TAG, "NetworkQualityEstimator is unsupported when HttpEngineNativeProvider is used");
            sNQEUnsupportedLogged = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ExperimentalCronetEngine build() {
        HttpEngine build;
        build = this.mBackend.build();
        return new AndroidHttpEngineWrapper(build);
    }

    @VisibleForTesting
    public static ConnectionMigrationOptions parseConnectionMigrationOptions(ExperimentalOptions experimentalOptions) {
        ConnectionMigrationOptions build;
        ConnectionMigrationOptions.Builder m = AndroidHttpEngineBuilderWrapper$$ExternalSyntheticApiModelOutline40.m();
        m.setDefaultNetworkMigration(optionalBooleanToMigrationOptionState(experimentalOptions.getMigrateSessionsOnNetworkChangeV2Option()));
        m.setPathDegradationMigration(optionalBooleanToMigrationOptionState(experimentalOptions.getAllowPortMigration()));
        OptionalBoolean migrateSessionsEarlyV2 = experimentalOptions.getMigrateSessionsEarlyV2();
        m.setAllowNonDefaultNetworkUsage(optionalBooleanToMigrationOptionState(migrateSessionsEarlyV2));
        OptionalBoolean optionalBoolean = OptionalBoolean.TRUE;
        if (migrateSessionsEarlyV2 == optionalBoolean) {
            m.setPathDegradationMigration(optionalBooleanToMigrationOptionState(optionalBoolean));
        }
        build = m.build();
        return build;
    }

    @VisibleForTesting
    public static DnsOptions parseDnsOptions(ExperimentalOptions experimentalOptions) {
        DnsOptions.StaleDnsOptions.Builder allowCrossNetworkUsage;
        DnsOptions.Builder useHttpStackDnsResolver;
        DnsOptions.Builder staleDns;
        DnsOptions.StaleDnsOptions build;
        DnsOptions.Builder staleDnsOptions;
        DnsOptions.Builder preestablishConnectionsToStaleDnsResults;
        DnsOptions build2;
        Duration ofMillis;
        Duration ofMillis2;
        Duration ofMillis3;
        DnsOptions.StaleDnsOptions.Builder m = AndroidHttpEngineBuilderWrapper$$ExternalSyntheticApiModelOutline37.m();
        int staleDnsDelayMillisOption = experimentalOptions.getStaleDnsDelayMillisOption();
        if (staleDnsDelayMillisOption != -1) {
            ofMillis3 = Duration.ofMillis(staleDnsDelayMillisOption);
            m.setFreshLookupTimeout(ofMillis3);
        }
        int staleDnsMaxExpiredTimeMillisOption = experimentalOptions.getStaleDnsMaxExpiredTimeMillisOption();
        if (staleDnsMaxExpiredTimeMillisOption != -1) {
            ofMillis2 = Duration.ofMillis(staleDnsMaxExpiredTimeMillisOption);
            m.setMaxExpiredDelay(ofMillis2);
        }
        allowCrossNetworkUsage = m.setAllowCrossNetworkUsage(optionalBooleanToMigrationOptionState(experimentalOptions.getStaleDnsAllowOtherNetworkOption()));
        allowCrossNetworkUsage.setUseStaleOnNameNotResolved(optionalBooleanToMigrationOptionState(experimentalOptions.getStaleDnsUseStaleOnNameNotResolvedOption()));
        DnsOptions.Builder m2 = AndroidHttpEngineBuilderWrapper$$ExternalSyntheticApiModelOutline38.m();
        useHttpStackDnsResolver = m2.setUseHttpStackDnsResolver(optionalBooleanToMigrationOptionState(experimentalOptions.getAsyncDnsEnableOption()));
        staleDns = useHttpStackDnsResolver.setStaleDns(optionalBooleanToMigrationOptionState(experimentalOptions.getStaleDnsEnableOption()));
        build = m.build();
        staleDnsOptions = staleDns.setStaleDnsOptions(build);
        preestablishConnectionsToStaleDnsResults = staleDnsOptions.setPreestablishConnectionsToStaleDnsResults(optionalBooleanToMigrationOptionState(experimentalOptions.getRaceStaleDnsOnConnection()));
        preestablishConnectionsToStaleDnsResults.setPersistHostCache(optionalBooleanToMigrationOptionState(experimentalOptions.getStaleDnsPersistToDiskOption()));
        int staleDnsPersistDelayMillisOption = experimentalOptions.getStaleDnsPersistDelayMillisOption();
        if (staleDnsPersistDelayMillisOption != -1) {
            ofMillis = Duration.ofMillis(staleDnsPersistDelayMillisOption);
            m2.setPersistHostCachePeriod(ofMillis);
        }
        build2 = m2.build();
        return build2;
    }

    @VisibleForTesting
    public static QuicOptions parseQuicOptions(ExperimentalOptions experimentalOptions) {
        QuicOptions build;
        Duration ofSeconds;
        QuicOptions.Builder m = AndroidHttpEngineBuilderWrapper$$ExternalSyntheticApiModelOutline39.m();
        if (experimentalOptions.getHostWhitelist() != null) {
            for (String str : experimentalOptions.getHostWhitelist().split(StringUtils.COMMA)) {
                m.addAllowedQuicHost(str);
            }
        }
        int maxServerConfigsStoredInPropertiesOption = experimentalOptions.getMaxServerConfigsStoredInPropertiesOption();
        if (maxServerConfigsStoredInPropertiesOption != -1) {
            m.setInMemoryServerConfigsCacheSize(maxServerConfigsStoredInPropertiesOption);
        }
        String userAgentId = experimentalOptions.getUserAgentId();
        if (userAgentId != null) {
            m.setHandshakeUserAgent(userAgentId);
        }
        int idleConnectionTimeoutSecondsOption = experimentalOptions.getIdleConnectionTimeoutSecondsOption();
        if (idleConnectionTimeoutSecondsOption != -1) {
            ofSeconds = Duration.ofSeconds(idleConnectionTimeoutSecondsOption);
            m.setIdleConnectionTimeout(ofSeconds);
        }
        build = m.build();
        return build;
    }

    /* renamed from: org.chromium.net.impl.AndroidHttpEngineBuilderWrapper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$chromium$net$telemetry$OptionalBoolean;

        static {
            int[] iArr = new int[OptionalBoolean.values().length];
            $SwitchMap$org$chromium$net$telemetry$OptionalBoolean = iArr;
            try {
                iArr[OptionalBoolean.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$chromium$net$telemetry$OptionalBoolean[OptionalBoolean.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$chromium$net$telemetry$OptionalBoolean[OptionalBoolean.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static int optionalBooleanToMigrationOptionState(OptionalBoolean optionalBoolean) {
        int i = AnonymousClass1.$SwitchMap$org$chromium$net$telemetry$OptionalBoolean[optionalBoolean.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 0;
                }
                throw new AssertionError("Invalid OptionalBoolean value: " + String.valueOf(optionalBoolean));
            }
        }
        return i2;
    }
}
