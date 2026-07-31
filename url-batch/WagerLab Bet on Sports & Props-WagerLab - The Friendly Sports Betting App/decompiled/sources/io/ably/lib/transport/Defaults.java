package io.ably.lib.transport;

import io.ably.lib.BuildConfig;
import io.ably.lib.transport.ITransport;
import io.ably.lib.transport.WebSocketTransport;
import io.ably.lib.types.ClientOptions;

/* loaded from: classes7.dex */
public class Defaults {
    public static final String ABLY_AGENT_HEADER = "Ably-Agent";
    public static final String ABLY_AGENT_PARAM = "agent";
    public static final String ABLY_CLIENT_ID_HEADER = "X-Ably-ClientId";
    public static final String ABLY_PROTOCOL_VERSION = "4";
    public static final String ABLY_PROTOCOL_VERSION_HEADER = "X-Ably-Version";
    public static final String ABLY_PROTOCOL_VERSION_PARAM = "v";
    public static final String HOST_REALTIME = "realtime.ably.io";
    public static final String HOST_REST = "rest.ably.io";
    public static final int HTTP_ASYNC_THREADPOOL_SIZE = 64;
    public static final int HTTP_MAX_RETRY_COUNT = 3;
    public static final int PORT = 80;
    public static final int TLS_PORT = 443;
    public static final String ABLY_AGENT_VERSION = String.format("%s/%s", "ably-java", BuildConfig.VERSION);
    public static final String[] HOST_FALLBACKS = {"A.ably-realtime.com", "B.ably-realtime.com", "C.ably-realtime.com", "D.ably-realtime.com", "E.ably-realtime.com"};
    public static int TIMEOUT_CONNECT = 15000;
    public static int TIMEOUT_DISCONNECT = 15000;
    public static int TIMEOUT_CHANNEL_RETRY = 15000;
    public static int TIMEOUT_HTTP_OPEN = 4000;
    public static int TIMEOUT_HTTP_REQUEST = 10000;
    public static int httpMaxRetryDuration = 15000;
    public static long realtimeRequestTimeout = 10000;
    public static long suspendedRetryTimeout = 30000;
    public static long fallbackRetryTimeout = 600000;
    public static long maxIdleInterval = 20000;
    public static int maxMessageSize = 65536;
    public static long connectionStateTtl = 120000;
    public static final ITransport.Factory TRANSPORT = new WebSocketTransport.Factory();

    public static int getPort(ClientOptions clientOptions) {
        if (clientOptions.tls) {
            if (clientOptions.tlsPort != 0) {
                return clientOptions.tlsPort;
            }
            return 443;
        }
        if (clientOptions.port != 0) {
            return clientOptions.port;
        }
        return 80;
    }

    public static String[] getEnvironmentFallbackHosts(String str) {
        return new String[]{str + "-a-fallback.ably-realtime.com", str + "-b-fallback.ably-realtime.com", str + "-c-fallback.ably-realtime.com", str + "-d-fallback.ably-realtime.com", str + "-e-fallback.ably-realtime.com"};
    }
}
