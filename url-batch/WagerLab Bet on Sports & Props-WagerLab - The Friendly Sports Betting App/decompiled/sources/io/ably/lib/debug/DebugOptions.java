package io.ably.lib.debug;

import io.ably.lib.http.HttpCore;
import io.ably.lib.network.HttpRequest;
import io.ably.lib.transport.ITransport;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ProtocolMessage;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class DebugOptions extends ClientOptions {
    public RawHttpListener httpListener;
    public RawProtocolListener protocolListener;
    public ITransport.Factory transportFactory;

    public interface RawHttpListener {
        void onRawHttpException(String str, String str2, Throwable th);

        HttpCore.Response onRawHttpRequest(String str, HttpRequest httpRequest, String str2, Map<String, List<String>> map, HttpCore.RequestBody requestBody);

        void onRawHttpResponse(String str, String str2, HttpCore.Response response);
    }

    public interface RawProtocolListener {
        void onRawConnect(String str);

        void onRawConnectRequested(String str);

        void onRawMessageRecv(ProtocolMessage protocolMessage);

        void onRawMessageSend(ProtocolMessage protocolMessage);
    }

    public DebugOptions() {
        this.pushFullWait = true;
    }

    public DebugOptions(String str) throws AblyException {
        super(str);
        this.pushFullWait = true;
    }

    @Override // io.ably.lib.types.ClientOptions
    public DebugOptions copy() {
        DebugOptions debugOptions = new DebugOptions();
        debugOptions.protocolListener = this.protocolListener;
        debugOptions.httpListener = this.httpListener;
        debugOptions.transportFactory = this.transportFactory;
        debugOptions.clientId = this.clientId;
        debugOptions.logLevel = this.logLevel;
        debugOptions.logHandler = this.logHandler;
        debugOptions.tls = this.tls;
        debugOptions.restHost = this.restHost;
        debugOptions.realtimeHost = this.realtimeHost;
        debugOptions.port = this.port;
        debugOptions.tlsPort = this.tlsPort;
        debugOptions.autoConnect = this.autoConnect;
        debugOptions.useBinaryProtocol = this.useBinaryProtocol;
        debugOptions.queueMessages = this.queueMessages;
        debugOptions.echoMessages = this.echoMessages;
        debugOptions.recover = this.recover;
        debugOptions.proxy = this.proxy;
        debugOptions.environment = this.environment;
        debugOptions.idempotentRestPublishing = this.idempotentRestPublishing;
        debugOptions.httpOpenTimeout = this.httpOpenTimeout;
        debugOptions.httpRequestTimeout = this.httpRequestTimeout;
        debugOptions.httpMaxRetryDuration = this.httpMaxRetryDuration;
        debugOptions.httpMaxRetryCount = this.httpMaxRetryCount;
        debugOptions.realtimeRequestTimeout = this.realtimeRequestTimeout;
        debugOptions.disconnectedRetryTimeout = this.disconnectedRetryTimeout;
        debugOptions.suspendedRetryTimeout = this.suspendedRetryTimeout;
        debugOptions.fallbackHostsUseDefault = this.fallbackHostsUseDefault;
        debugOptions.fallbackRetryTimeout = this.fallbackRetryTimeout;
        debugOptions.defaultTokenParams = this.defaultTokenParams;
        debugOptions.channelRetryTimeout = this.channelRetryTimeout;
        debugOptions.asyncHttpThreadpoolSize = this.asyncHttpThreadpoolSize;
        debugOptions.pushFullWait = this.pushFullWait;
        debugOptions.localStorage = this.localStorage;
        debugOptions.addRequestIds = this.addRequestIds;
        debugOptions.authCallback = this.authCallback;
        debugOptions.authUrl = this.authUrl;
        debugOptions.authMethod = this.authMethod;
        debugOptions.key = this.key;
        debugOptions.token = this.token;
        debugOptions.tokenDetails = this.tokenDetails;
        debugOptions.authHeaders = this.authHeaders;
        debugOptions.authParams = this.authParams;
        debugOptions.queryTime = this.queryTime;
        debugOptions.useTokenAuth = this.useTokenAuth;
        return debugOptions;
    }
}
