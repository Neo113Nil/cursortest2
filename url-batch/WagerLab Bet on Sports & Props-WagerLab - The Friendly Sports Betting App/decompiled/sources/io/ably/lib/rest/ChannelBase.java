package io.ably.lib.rest;

import io.ably.lib.http.BasePaginatedQuery;
import io.ably.lib.http.Http;
import io.ably.lib.http.HttpCore;
import io.ably.lib.http.HttpScheduler;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.realtime.CompletionListener;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.AsyncPaginatedResult;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ChannelOptions;
import io.ably.lib.types.Message;
import io.ably.lib.types.MessageSerializer;
import io.ably.lib.types.PaginatedResult;
import io.ably.lib.types.Param;
import io.ably.lib.types.PresenceMessage;
import io.ably.lib.types.PresenceSerializer;
import io.ably.lib.util.Crypto;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes7.dex */
public class ChannelBase {
    private final AblyBase ably;
    public final RestAnnotations annotations;
    private final String basePath;
    public final String name;
    ChannelOptions options;
    public final Presence presence = new Presence();

    public void publish(String str, Object obj) throws AblyException {
        publish(this.ably.http, str, obj);
    }

    void publish(Http http, String str, Object obj) throws AblyException {
        publishImpl(http, str, obj).sync();
    }

    public void publishAsync(String str, Object obj, CompletionListener completionListener) {
        publishAsync(this.ably.http, str, obj, completionListener);
    }

    void publishAsync(Http http, String str, Object obj, CompletionListener completionListener) {
        publishImpl(http, str, obj).async(new CompletionListener.ToCallback(completionListener));
    }

    private Http.Request<Void> publishImpl(Http http, String str, Object obj) {
        return publishImpl(http, new Message[]{new Message(str, obj)});
    }

    public void publish(Message[] messageArr) throws AblyException {
        publish(this.ably.http, messageArr);
    }

    void publish(Http http, Message[] messageArr) throws AblyException {
        publishImpl(http, messageArr).sync();
    }

    public void publishAsync(Message[] messageArr, CompletionListener completionListener) {
        publishAsync(this.ably.http, messageArr, completionListener);
    }

    void publishAsync(Http http, Message[] messageArr, CompletionListener completionListener) {
        publishImpl(http, messageArr).async(new CompletionListener.ToCallback(completionListener));
    }

    private Http.Request<Void> publishImpl(Http http, final Message[] messageArr) {
        return http.request(new Http.Execute<Void>() { // from class: io.ably.lib.rest.ChannelBase.1
            @Override // io.ably.lib.http.Http.Execute
            public void execute(HttpScheduler httpScheduler, Callback<Void> callback) throws AblyException {
                int i = 0;
                boolean z = false;
                for (Message message : messageArr) {
                    z |= message.id != null;
                    ChannelBase.this.ably.auth.checkClientId(message, true, false);
                    message.encode(ChannelBase.this.options);
                }
                if (!z && ChannelBase.this.ably.options.idempotentRestPublishing) {
                    String randomId = Crypto.getRandomId();
                    while (true) {
                        Message[] messageArr2 = messageArr;
                        if (i >= messageArr2.length) {
                            break;
                        }
                        messageArr2[i].id = randomId + AbstractJsonLexerKt.COLON + i;
                        i++;
                    }
                }
                httpScheduler.post(ChannelBase.this.basePath + "/messages", HttpUtils.defaultAcceptHeaders(ChannelBase.this.ably.options.useBinaryProtocol), ChannelBase.this.ably.options.addRequestIds ? Param.array(Crypto.generateRandomRequestId()) : null, ChannelBase.this.ably.options.useBinaryProtocol ? MessageSerializer.asMsgpackRequest(messageArr) : MessageSerializer.asJsonRequest(messageArr), null, true, callback);
            }
        });
    }

    public PaginatedResult<Message> history(Param[] paramArr) throws AblyException {
        return history(this.ably.http, paramArr);
    }

    PaginatedResult<Message> history(Http http, Param[] paramArr) throws AblyException {
        return historyImpl(http, paramArr).sync();
    }

    public void historyAsync(Param[] paramArr, Callback<AsyncPaginatedResult<Message>> callback) {
        historyAsync(this.ably.http, paramArr, callback);
    }

    void historyAsync(Http http, Param[] paramArr, Callback<AsyncPaginatedResult<Message>> callback) {
        historyImpl(http, paramArr).async(callback);
    }

    private BasePaginatedQuery.ResultRequest<Message> historyImpl(Http http, Param[] paramArr) {
        HttpCore.BodyHandler<Message> messageResponseHandler = MessageSerializer.getMessageResponseHandler(this.options);
        if (this.ably.options.addRequestIds) {
            paramArr = Param.set(paramArr, Crypto.generateRandomRequestId());
        }
        return new BasePaginatedQuery(http, this.basePath + "/messages", HttpUtils.defaultAcceptHeaders(this.ably.options.useBinaryProtocol), paramArr, messageResponseHandler).get();
    }

    public class Presence {
        public Presence() {
        }

        public PaginatedResult<PresenceMessage> get(Param[] paramArr) throws AblyException {
            return get(ChannelBase.this.ably.http, paramArr);
        }

        PaginatedResult<PresenceMessage> get(Http http, Param[] paramArr) throws AblyException {
            return getImpl(http, paramArr).sync();
        }

        public void getAsync(Param[] paramArr, Callback<AsyncPaginatedResult<PresenceMessage>> callback) {
            getAsync(ChannelBase.this.ably.http, paramArr, callback);
        }

        void getAsync(Http http, Param[] paramArr, Callback<AsyncPaginatedResult<PresenceMessage>> callback) {
            getImpl(http, paramArr).async(callback);
        }

        private BasePaginatedQuery.ResultRequest<PresenceMessage> getImpl(Http http, Param[] paramArr) {
            HttpCore.BodyHandler<PresenceMessage> presenceResponseHandler = PresenceSerializer.getPresenceResponseHandler(ChannelBase.this.options);
            if (ChannelBase.this.ably.options.addRequestIds) {
                paramArr = Param.set(paramArr, Crypto.generateRandomRequestId());
            }
            return new BasePaginatedQuery(http, ChannelBase.this.basePath + "/presence", HttpUtils.defaultAcceptHeaders(ChannelBase.this.ably.options.useBinaryProtocol), paramArr, presenceResponseHandler).get();
        }

        public PaginatedResult<PresenceMessage> history(Param[] paramArr) throws AblyException {
            return history(ChannelBase.this.ably.http, paramArr);
        }

        PaginatedResult<PresenceMessage> history(Http http, Param[] paramArr) throws AblyException {
            return historyImpl(http, paramArr).sync();
        }

        public void historyAsync(Param[] paramArr, Callback<AsyncPaginatedResult<PresenceMessage>> callback) {
            historyAsync(ChannelBase.this.ably.http, paramArr, callback);
        }

        void historyAsync(Http http, Param[] paramArr, Callback<AsyncPaginatedResult<PresenceMessage>> callback) {
            historyImpl(http, paramArr).async(callback);
        }

        private BasePaginatedQuery.ResultRequest<PresenceMessage> historyImpl(Http http, Param[] paramArr) {
            HttpCore.BodyHandler<PresenceMessage> presenceResponseHandler = PresenceSerializer.getPresenceResponseHandler(ChannelBase.this.options);
            if (ChannelBase.this.ably.options.addRequestIds) {
                paramArr = Param.set(paramArr, Crypto.generateRandomRequestId());
            }
            return new BasePaginatedQuery(http, ChannelBase.this.basePath + "/presence/history", HttpUtils.defaultAcceptHeaders(ChannelBase.this.ably.options.useBinaryProtocol), paramArr, presenceResponseHandler).get();
        }
    }

    ChannelBase(AblyBase ablyBase, String str, ChannelOptions channelOptions) throws AblyException {
        this.ably = ablyBase;
        this.name = str;
        this.options = channelOptions;
        this.basePath = "/channels/" + HttpUtils.encodeURIComponent(str);
        this.annotations = new RestAnnotations(str, ablyBase.http, ablyBase.options, channelOptions);
    }
}
