package io.ably.lib.rest;

import io.ably.lib.http.AsyncHttpPaginatedQuery;
import io.ably.lib.http.AsyncHttpScheduler;
import io.ably.lib.http.AsyncPaginatedQuery;
import io.ably.lib.http.Http;
import io.ably.lib.http.HttpCore;
import io.ably.lib.http.HttpPaginatedQuery;
import io.ably.lib.http.HttpScheduler;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.http.PaginatedQuery;
import io.ably.lib.http.SyncHttpScheduler;
import io.ably.lib.platform.Platform;
import io.ably.lib.push.Push;
import io.ably.lib.rest.Auth;
import io.ably.lib.transport.Defaults;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.AsyncHttpPaginatedResponse;
import io.ably.lib.types.AsyncPaginatedResult;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ChannelOptions;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.HttpPaginatedResponse;
import io.ably.lib.types.Message;
import io.ably.lib.types.MessageSerializer;
import io.ably.lib.types.PaginatedResult;
import io.ably.lib.types.Param;
import io.ably.lib.types.PublishResponse;
import io.ably.lib.types.ReadOnlyMap;
import io.ably.lib.types.Stats;
import io.ably.lib.types.StatsReader;
import io.ably.lib.util.Crypto;
import io.ably.lib.util.InternalMap;
import io.ably.lib.util.Log;
import io.ably.lib.util.PlatformAgentProvider;
import io.ably.lib.util.Serialisation;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes7.dex */
public abstract class AblyBase implements AutoCloseable {
    private static final int LEGACY_API_PROTOCOL_V2 = 2;
    public final Auth auth;
    public final Channels channels;
    public final Http http;
    public final HttpCore httpCore;
    public final ClientOptions options;
    public final Platform platform;
    protected final PlatformAgentProvider platformAgentProvider;
    public final Push push;

    public interface Channels extends ReadOnlyMap<String, Channel> {
        Channel get(String str);

        Channel get(String str, ChannelOptions channelOptions) throws AblyException;

        void release(String str);

        @Override // io.ably.lib.types.ReadOnlyMap
        int size();

        @Override // io.ably.lib.types.ReadOnlyMap
        Iterable<Channel> values();
    }

    protected void onAuthError(ErrorInfo errorInfo) {
    }

    protected void onAuthUpdated(String str, boolean z) throws AblyException {
    }

    protected void onAuthUpdatedAsync(String str, Auth.AuthUpdateResult authUpdateResult) {
    }

    protected void onClientIdSet(String str) {
    }

    public AblyBase(String str, PlatformAgentProvider platformAgentProvider) throws AblyException {
        this(new ClientOptions(str), platformAgentProvider);
    }

    public AblyBase(ClientOptions clientOptions, PlatformAgentProvider platformAgentProvider) throws AblyException {
        if (clientOptions == null) {
            Log.e(getClass().getName(), "no options provided");
            throw AblyException.fromErrorInfo(new ErrorInfo("no options provided", 400, 40000));
        }
        this.options = clientOptions;
        Log.setLevel(clientOptions.logLevel);
        Log.setHandler(clientOptions.logHandler);
        Log.i(getClass().getName(), MetricTracker.Action.STARTED);
        this.platformAgentProvider = platformAgentProvider;
        Auth auth = new Auth(this, clientOptions);
        this.auth = auth;
        HttpCore httpCore = new HttpCore(clientOptions, auth, platformAgentProvider);
        this.httpCore = httpCore;
        this.http = new Http(new AsyncHttpScheduler(httpCore, clientOptions), new SyncHttpScheduler(httpCore));
        this.channels = new InternalChannels();
        this.platform = new Platform();
        this.push = new Push(this);
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        this.http.close();
    }

    protected void connect() {
        this.http.connect();
    }

    private class InternalChannels extends InternalMap<String, Channel> implements Channels {
        private InternalChannels() {
        }

        @Override // io.ably.lib.rest.AblyBase.Channels
        public Channel get(String str) {
            try {
                return get(str, null);
            } catch (AblyException unused) {
                return null;
            }
        }

        @Override // io.ably.lib.rest.AblyBase.Channels
        public Channel get(String str, ChannelOptions channelOptions) throws AblyException {
            Channel channel = (Channel) this.map.get(str);
            if (channel != null) {
                if (channelOptions != null) {
                    channel.options = channelOptions;
                }
                return channel;
            }
            Channel channel2 = new Channel(AblyBase.this, str, channelOptions);
            this.map.put(str, channel2);
            return channel2;
        }

        @Override // io.ably.lib.rest.AblyBase.Channels
        public void release(String str) {
            this.map.remove(str);
        }
    }

    public long time() throws AblyException {
        return time(this.http);
    }

    long time(Http http) throws AblyException {
        return timeImpl(http).sync().longValue();
    }

    public void timeAsync(Callback<Long> callback) {
        timeAsync(this.http, callback);
    }

    void timeAsync(Http http, Callback<Long> callback) {
        timeImpl(http).async(callback);
    }

    private Http.Request<Long> timeImpl(Http http) {
        final Param[] array = this.options.addRequestIds ? Param.array(Crypto.generateRandomRequestId()) : null;
        return http.request(new Http.Execute<Long>() { // from class: io.ably.lib.rest.AblyBase.1
            @Override // io.ably.lib.http.Http.Execute
            public void execute(HttpScheduler httpScheduler, Callback<Long> callback) throws AblyException {
                httpScheduler.get("/time", HttpUtils.defaultAcceptHeaders(false), array, new HttpCore.ResponseHandler<Long>() { // from class: io.ably.lib.rest.AblyBase.1.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // io.ably.lib.http.HttpCore.ResponseHandler
                    public Long handleResponse(HttpCore.Response response, ErrorInfo errorInfo) throws AblyException {
                        if (errorInfo != null) {
                            throw AblyException.fromErrorInfo(errorInfo);
                        }
                        return ((Long[]) Serialisation.gson.fromJson(new String(response.body), Long[].class))[0];
                    }
                }, false, callback);
            }
        });
    }

    public PaginatedResult<Stats> stats(Param[] paramArr) throws AblyException {
        return stats(this.http, paramArr);
    }

    PaginatedResult<Stats> stats(Http http, Param[] paramArr) throws AblyException {
        return new PaginatedQuery(http, "/stats", Param.set(HttpUtils.defaultAcceptHeaders(false), new Param(Defaults.ABLY_PROTOCOL_VERSION_HEADER, (Object) 2)), paramArr, StatsReader.statsResponseHandler).get();
    }

    public void statsAsync(Param[] paramArr, Callback<AsyncPaginatedResult<Stats>> callback) {
        statsAsync(this.http, paramArr, callback);
    }

    void statsAsync(Http http, Param[] paramArr, Callback<AsyncPaginatedResult<Stats>> callback) {
        new AsyncPaginatedQuery(http, "/stats", Param.set(HttpUtils.defaultAcceptHeaders(false), new Param(Defaults.ABLY_PROTOCOL_VERSION_HEADER, (Object) 2)), paramArr, StatsReader.statsResponseHandler).get(callback);
    }

    public HttpPaginatedResponse request(String str, String str2, Param[] paramArr, HttpCore.RequestBody requestBody, Param[] paramArr2) throws AblyException {
        return request(this.http, str, str2, paramArr, requestBody, paramArr2);
    }

    HttpPaginatedResponse request(Http http, String str, String str2, Param[] paramArr, HttpCore.RequestBody requestBody, Param[] paramArr2) throws AblyException {
        return new HttpPaginatedQuery(http, str, str2, HttpUtils.mergeHeaders(HttpUtils.defaultAcceptHeaders(false), paramArr2), paramArr, requestBody).exec();
    }

    public void requestAsync(String str, String str2, Param[] paramArr, HttpCore.RequestBody requestBody, Param[] paramArr2, AsyncHttpPaginatedResponse.Callback callback) {
        requestAsync(this.http, str, str2, paramArr, requestBody, paramArr2, callback);
    }

    void requestAsync(Http http, String str, String str2, Param[] paramArr, HttpCore.RequestBody requestBody, Param[] paramArr2, AsyncHttpPaginatedResponse.Callback callback) {
        new AsyncHttpPaginatedQuery(http, str, str2, HttpUtils.mergeHeaders(HttpUtils.defaultAcceptHeaders(false), paramArr2), paramArr, requestBody).exec(callback);
    }

    public PublishResponse[] publishBatch(Message.Batch[] batchArr, ChannelOptions channelOptions) throws AblyException {
        return publishBatchImpl(batchArr, channelOptions, null).sync();
    }

    public PublishResponse[] publishBatch(Message.Batch[] batchArr, ChannelOptions channelOptions, Param[] paramArr) throws AblyException {
        return publishBatchImpl(batchArr, channelOptions, paramArr).sync();
    }

    public void publishBatchAsync(Message.Batch[] batchArr, ChannelOptions channelOptions, Callback<PublishResponse[]> callback) throws AblyException {
        publishBatchImpl(batchArr, channelOptions, null).async(callback);
    }

    public void publishBatchAsync(Message.Batch[] batchArr, ChannelOptions channelOptions, Param[] paramArr, Callback<PublishResponse[]> callback) throws AblyException {
        publishBatchImpl(batchArr, channelOptions, paramArr).async(callback);
    }

    private Http.Request<PublishResponse[]> publishBatchImpl(final Message.Batch[] batchArr, ChannelOptions channelOptions, final Param[] paramArr) throws AblyException {
        boolean z = false;
        for (Message.Batch batch : batchArr) {
            for (Message message : batch.messages) {
                z |= message.id != null;
                this.auth.checkClientId(message, true, false);
                message.encode(channelOptions);
            }
            if (!z && this.options.idempotentRestPublishing) {
                String randomId = Crypto.getRandomId();
                for (int i = 0; i < batch.messages.length; i++) {
                    batch.messages[i].id = randomId + AbstractJsonLexerKt.COLON + i;
                }
            }
        }
        return this.http.request(new Http.Execute<PublishResponse[]>() { // from class: io.ably.lib.rest.AblyBase.2
            @Override // io.ably.lib.http.Http.Execute
            public void execute(HttpScheduler httpScheduler, Callback<PublishResponse[]> callback) throws AblyException {
                httpScheduler.post("/messages", Param.set(HttpUtils.defaultAcceptHeaders(AblyBase.this.options.useBinaryProtocol), new Param(Defaults.ABLY_PROTOCOL_VERSION_HEADER, (Object) 2)), AblyBase.this.options.addRequestIds ? Param.set(paramArr, Crypto.generateRandomRequestId()) : paramArr, AblyBase.this.options.useBinaryProtocol ? MessageSerializer.asMsgpackRequest(batchArr) : MessageSerializer.asJSONRequest(batchArr), new HttpCore.ResponseHandler<PublishResponse[]>() { // from class: io.ably.lib.rest.AblyBase.2.1
                    @Override // io.ably.lib.http.HttpCore.ResponseHandler
                    public PublishResponse[] handleResponse(HttpCore.Response response, ErrorInfo errorInfo) throws AblyException {
                        if (errorInfo != null && errorInfo.code != 40020) {
                            throw AblyException.fromErrorInfo(errorInfo);
                        }
                        return PublishResponse.getBulkPublishResponseHandler(response.statusCode).handleResponseBody(response.contentType, response.body);
                    }
                }, true, callback);
            }
        });
    }
}
