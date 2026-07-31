package org.chromium.net;

import com.applovin.impl.n7$$ExternalSyntheticBackport3;
import com.ironsource.X3;
import com.ironsource.mediationsdk.metadata.a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.DnsOptions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
final class ExperimentalOptionsTranslator {

    @FunctionalInterface
    interface JsonPatch {
        void applyTo(JSONObject jSONObject) throws JSONException;
    }

    private ExperimentalOptionsTranslator() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void connectionMigrationOptionsToJson(JSONObject jSONObject, ConnectionMigrationOptions connectionMigrationOptions) throws JSONException {
        JSONObject createDefaultIfAbsent = createDefaultIfAbsent(jSONObject, "QUIC");
        if (connectionMigrationOptions.getEnableDefaultNetworkMigration() != null) {
            createDefaultIfAbsent.put("migrate_sessions_on_network_change_v2", connectionMigrationOptions.getEnableDefaultNetworkMigration());
        }
        if (connectionMigrationOptions.getAllowServerMigration() != null) {
            createDefaultIfAbsent.put("allow_server_migration", connectionMigrationOptions.getAllowServerMigration());
        }
        if (connectionMigrationOptions.getMigrateIdleConnections() != null) {
            createDefaultIfAbsent.put("migrate_idle_sessions", connectionMigrationOptions.getMigrateIdleConnections());
        }
        if (connectionMigrationOptions.getIdleMigrationPeriodSeconds() != null) {
            createDefaultIfAbsent.put("idle_session_migration_period_seconds", connectionMigrationOptions.getIdleMigrationPeriodSeconds());
        }
        if (connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork() != null) {
            createDefaultIfAbsent.put("retry_on_alternate_network_before_handshake", connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork());
        }
        if (connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds() != null) {
            createDefaultIfAbsent.put("max_time_on_non_default_network_seconds", connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds());
        }
        if (connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount() != null) {
            createDefaultIfAbsent.put("max_migrations_to_non_default_network_on_path_degrading", connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount());
        }
        if (connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount() != null) {
            createDefaultIfAbsent.put("max_migrations_to_non_default_network_on_write_error", connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount());
        }
        if (connectionMigrationOptions.getEnablePathDegradationMigration() != null) {
            boolean booleanValue = connectionMigrationOptions.getEnablePathDegradationMigration().booleanValue();
            createDefaultIfAbsent.put("allow_port_migration", booleanValue);
            if (connectionMigrationOptions.getAllowNonDefaultNetworkUsage() != null) {
                boolean booleanValue2 = connectionMigrationOptions.getAllowNonDefaultNetworkUsage().booleanValue();
                if (!booleanValue && booleanValue2) {
                    throw new IllegalArgumentException("Unable to turn on non-default network usage without path degradation migration!");
                }
                if (booleanValue && booleanValue2) {
                    createDefaultIfAbsent.put("migrate_sessions_early_v2", true);
                    createDefaultIfAbsent.put("migrate_sessions_on_network_change_v2", true);
                } else {
                    createDefaultIfAbsent.put("migrate_sessions_early_v2", false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void dnsOptionsToJson(JSONObject jSONObject, DnsOptions dnsOptions) throws JSONException {
        JSONObject createDefaultIfAbsent = createDefaultIfAbsent(jSONObject, "AsyncDNS");
        if (dnsOptions.getUseBuiltInDnsResolver() != null) {
            createDefaultIfAbsent.put(a.k, dnsOptions.getUseBuiltInDnsResolver());
        }
        JSONObject createDefaultIfAbsent2 = createDefaultIfAbsent(jSONObject, "StaleDNS");
        if (dnsOptions.getEnableStaleDns() != null) {
            createDefaultIfAbsent2.put(a.k, dnsOptions.getEnableStaleDns());
        }
        if (dnsOptions.getPersistHostCache() != null) {
            createDefaultIfAbsent2.put("persist_to_disk", dnsOptions.getPersistHostCache());
        }
        if (dnsOptions.getPersistHostCachePeriodMillis() != null) {
            createDefaultIfAbsent2.put("persist_delay_ms", dnsOptions.getPersistHostCachePeriodMillis());
        }
        if (dnsOptions.getStaleDnsOptions() != null) {
            DnsOptions.StaleDnsOptions staleDnsOptions = dnsOptions.getStaleDnsOptions();
            if (staleDnsOptions.getAllowCrossNetworkUsage() != null) {
                createDefaultIfAbsent2.put("allow_other_network", staleDnsOptions.getAllowCrossNetworkUsage());
            }
            if (staleDnsOptions.getFreshLookupTimeoutMillis() != null) {
                createDefaultIfAbsent2.put("delay_ms", staleDnsOptions.getFreshLookupTimeoutMillis());
            }
            if (staleDnsOptions.getUseStaleOnNameNotResolved() != null) {
                createDefaultIfAbsent2.put("use_stale_on_name_not_resolved", staleDnsOptions.getUseStaleOnNameNotResolved());
            }
            if (staleDnsOptions.getMaxExpiredDelayMillis() != null) {
                createDefaultIfAbsent2.put("max_expired_time_ms", staleDnsOptions.getMaxExpiredDelayMillis());
            }
        }
        JSONObject createDefaultIfAbsent3 = createDefaultIfAbsent(jSONObject, "QUIC");
        if (dnsOptions.getPreestablishConnectionsToStaleDnsResults() != null) {
            createDefaultIfAbsent3.put("race_stale_dns_on_connection", dnsOptions.getPreestablishConnectionsToStaleDnsResults());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void quicOptionsToJson(JSONObject jSONObject, QuicOptions quicOptions) throws JSONException {
        JSONObject createDefaultIfAbsent = createDefaultIfAbsent(jSONObject, "QUIC");
        if (!quicOptions.getQuicHostAllowlist().isEmpty()) {
            createDefaultIfAbsent.put("host_whitelist", n7$$ExternalSyntheticBackport3.m(StringUtils.COMMA, quicOptions.getQuicHostAllowlist()));
        }
        if (!quicOptions.getEnabledQuicVersions().isEmpty()) {
            createDefaultIfAbsent.put("quic_version", n7$$ExternalSyntheticBackport3.m(StringUtils.COMMA, quicOptions.getEnabledQuicVersions()));
        }
        if (!quicOptions.getConnectionOptions().isEmpty()) {
            createDefaultIfAbsent.put("connection_options", n7$$ExternalSyntheticBackport3.m(StringUtils.COMMA, quicOptions.getConnectionOptions()));
        }
        if (!quicOptions.getClientConnectionOptions().isEmpty()) {
            createDefaultIfAbsent.put("client_connection_options", n7$$ExternalSyntheticBackport3.m(StringUtils.COMMA, quicOptions.getClientConnectionOptions()));
        }
        if (!quicOptions.getExtraQuicheFlags().isEmpty()) {
            createDefaultIfAbsent.put("set_quic_flags", n7$$ExternalSyntheticBackport3.m(StringUtils.COMMA, quicOptions.getExtraQuicheFlags()));
        }
        if (quicOptions.getInMemoryServerConfigsCacheSize() != null) {
            createDefaultIfAbsent.put("max_server_configs_stored_in_properties", quicOptions.getInMemoryServerConfigsCacheSize());
        }
        if (quicOptions.getHandshakeUserAgent() != null) {
            createDefaultIfAbsent.put("user_agent_id", quicOptions.getHandshakeUserAgent());
        }
        if (quicOptions.getRetryWithoutAltSvcOnQuicErrors() != null) {
            createDefaultIfAbsent.put("retry_without_alt_svc_on_quic_errors", quicOptions.getRetryWithoutAltSvcOnQuicErrors());
        }
        if (quicOptions.getEnableTlsZeroRtt() != null) {
            createDefaultIfAbsent.put("disable_tls_zero_rtt", !quicOptions.getEnableTlsZeroRtt().booleanValue());
        }
        if (quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds() != null) {
            createDefaultIfAbsent.put("max_idle_time_before_crypto_handshake_seconds", quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds());
        }
        if (quicOptions.getCryptoHandshakeTimeoutSeconds() != null) {
            createDefaultIfAbsent.put("max_time_before_crypto_handshake_seconds", quicOptions.getCryptoHandshakeTimeoutSeconds());
        }
        if (quicOptions.getIdleConnectionTimeoutSeconds() != null) {
            createDefaultIfAbsent.put("idle_connection_timeout_seconds", quicOptions.getIdleConnectionTimeoutSeconds());
        }
        if (quicOptions.getRetransmittableOnWireTimeoutMillis() != null) {
            createDefaultIfAbsent.put("retransmittable_on_wire_timeout_milliseconds", quicOptions.getRetransmittableOnWireTimeoutMillis());
        }
        if (quicOptions.getCloseSessionsOnIpChange() != null) {
            createDefaultIfAbsent.put("close_sessions_on_ip_change", quicOptions.getCloseSessionsOnIpChange());
        }
        if (quicOptions.getGoawaySessionsOnIpChange() != null) {
            createDefaultIfAbsent.put("goaway_sessions_on_ip_change", quicOptions.getGoawaySessionsOnIpChange());
        }
        if (quicOptions.getInitialBrokenServicePeriodSeconds() != null) {
            createDefaultIfAbsent.put("initial_delay_for_broken_alternative_service_seconds", quicOptions.getInitialBrokenServicePeriodSeconds());
        }
        if (quicOptions.getIncreaseBrokenServicePeriodExponentially() != null) {
            createDefaultIfAbsent.put("exponential_backoff_on_initial_delay", quicOptions.getIncreaseBrokenServicePeriodExponentially());
        }
        if (quicOptions.getDelayJobsWithAvailableSpdySession() != null) {
            createDefaultIfAbsent.put("delay_main_job_with_available_spdy_session", quicOptions.getDelayJobsWithAvailableSpdySession());
        }
    }

    static JSONObject toJsonExperimentalOptions(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Experimental options parsing failed", e);
        }
    }

    static JSONObject applyJsonPatches(JSONObject jSONObject, List<JsonPatch> list) {
        if (jSONObject == null && list.isEmpty()) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        Iterator<JsonPatch> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().applyTo(jSONObject);
            } catch (JSONException e) {
                throw new IllegalStateException("Unable to apply JSON patch!", e);
            }
        }
        return jSONObject;
    }

    private static JSONObject createDefaultIfAbsent(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            try {
                jSONObject.put(str, optJSONObject);
            } catch (JSONException e) {
                throw new IllegalArgumentException("Failed adding a default object for key [" + str + X3.j.e, e);
            }
        }
        return optJSONObject;
    }
}
