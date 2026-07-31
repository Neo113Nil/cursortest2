package io.ably.lib.types;

import io.ably.lib.http.HttpConstants;
import io.ably.lib.http.HttpCore;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.types.Message;
import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* loaded from: classes7.dex */
public class MessageSerializer {
    private static HttpCore.BodyHandler<Message> messageResponseHandler = new MessageBodyHandler(null);
    private static final String TAG = MessageSerializer.class.getName();

    public static Message[] readMsgpackArray(MessageUnpacker messageUnpacker) throws IOException {
        int unpackArrayHeader = messageUnpacker.unpackArrayHeader();
        Message[] messageArr = new Message[unpackArrayHeader];
        for (int i = 0; i < unpackArrayHeader; i++) {
            messageArr[i] = Message.fromMsgpack(messageUnpacker);
        }
        return messageArr;
    }

    public static Message[] readMsgpack(byte[] bArr) throws AblyException {
        try {
            return readMsgpackArray(Serialisation.msgpackUnpackerConfig.newUnpacker(bArr));
        } catch (IOException e) {
            throw AblyException.fromThrowable(e);
        }
    }

    public static HttpCore.RequestBody asMsgpackRequest(Message message) throws AblyException {
        return asMsgpackRequest(new Message[]{message});
    }

    public static HttpCore.RequestBody asMsgpackRequest(Message[] messageArr) {
        return new HttpUtils.ByteArrayRequestBody(writeMsgpackArray(messageArr), "application/x-msgpack");
    }

    public static byte[] writeMsgpackArray(Message[] messageArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            MessagePacker newPacker = Serialisation.msgpackPackerConfig.newPacker(byteArrayOutputStream);
            writeMsgpackArray(messageArr, newPacker);
            newPacker.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }

    public static void writeMsgpackArray(Message[] messageArr, MessagePacker messagePacker) {
        try {
            messagePacker.packArrayHeader(messageArr.length);
            for (Message message : messageArr) {
                message.writeMsgpack(messagePacker);
            }
        } catch (IOException unused) {
        }
    }

    public static void write(Map<String, String> map, MessagePacker messagePacker) throws IOException {
        messagePacker.packMapHeader(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            messagePacker.packString(entry.getKey());
            messagePacker.packString(entry.getValue());
        }
    }

    public static Map<String, String> readStringMap(MessageUnpacker messageUnpacker) throws IOException {
        HashMap hashMap = new HashMap();
        int unpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < unpackMapHeader; i++) {
            String unpackString = messageUnpacker.unpackString();
            if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else {
                hashMap.put(unpackString, messageUnpacker.unpackString());
            }
        }
        return hashMap;
    }

    public static HttpCore.RequestBody asMsgpackRequest(Message.Batch[] batchArr) {
        return new HttpUtils.ByteArrayRequestBody(writeMsgpackArray(batchArr), "application/x-msgpack");
    }

    static byte[] writeMsgpackArray(Message.Batch[] batchArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            MessagePacker newPacker = Serialisation.msgpackPackerConfig.newPacker(byteArrayOutputStream);
            writeMsgpackArray(batchArr, newPacker);
            newPacker.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }

    static void writeMsgpackArray(Message.Batch[] batchArr, MessagePacker messagePacker) throws IOException {
        try {
            messagePacker.packArrayHeader(batchArr.length);
            for (Message.Batch batch : batchArr) {
                batch.writeMsgpack(messagePacker);
            }
        } catch (IOException unused) {
        }
    }

    public static Message[] readMessagesFromJson(byte[] bArr) throws MessageDecodeException {
        return (Message[]) Serialisation.gson.fromJson(new String(bArr), Message[].class);
    }

    public static HttpCore.RequestBody asJsonRequest(Message message) throws AblyException {
        return asJsonRequest(new Message[]{message});
    }

    public static HttpCore.RequestBody asJsonRequest(Message[] messageArr) {
        return new HttpUtils.JsonRequestBody(Serialisation.gson.toJson(messageArr));
    }

    public static HttpCore.RequestBody asJSONRequest(Message.Batch[] batchArr) {
        return new HttpUtils.JsonRequestBody(Serialisation.gson.toJson(batchArr));
    }

    public static HttpCore.BodyHandler<Message> getMessageResponseHandler(ChannelOptions channelOptions) {
        return channelOptions == null ? messageResponseHandler : new MessageBodyHandler(channelOptions);
    }

    private static class MessageBodyHandler implements HttpCore.BodyHandler<Message> {
        private ChannelOptions opts;

        MessageBodyHandler(ChannelOptions channelOptions) {
            this.opts = channelOptions;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ably.lib.http.HttpCore.BodyHandler
        public Message[] handleResponseBody(String str, byte[] bArr) throws AblyException {
            Message[] readMsgpack;
            try {
                if (HttpConstants.ContentTypes.JSON.equals(str)) {
                    readMsgpack = MessageSerializer.readMessagesFromJson(bArr);
                } else {
                    readMsgpack = "application/x-msgpack".equals(str) ? MessageSerializer.readMsgpack(bArr) : null;
                }
                if (readMsgpack != null) {
                    for (Message message : readMsgpack) {
                        try {
                            message.decode(this.opts);
                        } catch (MessageDecodeException e) {
                            Log.e(MessageSerializer.TAG, e.errorInfo.message);
                        }
                    }
                }
                return readMsgpack;
            } catch (MessageDecodeException e2) {
                throw AblyException.fromThrowable(e2);
            }
        }
    }
}
