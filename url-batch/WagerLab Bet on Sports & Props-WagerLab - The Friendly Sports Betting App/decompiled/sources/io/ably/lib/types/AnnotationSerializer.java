package io.ably.lib.types;

import io.ably.lib.http.HttpConstants;
import io.ably.lib.http.HttpCore;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* loaded from: classes7.dex */
public class AnnotationSerializer {
    private static final String TAG = "io.ably.lib.types.AnnotationSerializer";

    public static void writeMsgpackArray(Annotation[] annotationArr, MessagePacker messagePacker) {
        try {
            messagePacker.packArrayHeader(annotationArr.length);
            for (Annotation annotation : annotationArr) {
                annotation.writeMsgpack(messagePacker);
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static Annotation[] readMsgpackArray(MessageUnpacker messageUnpacker) throws IOException {
        int unpackArrayHeader = messageUnpacker.unpackArrayHeader();
        Annotation[] annotationArr = new Annotation[unpackArrayHeader];
        for (int i = 0; i < unpackArrayHeader; i++) {
            annotationArr[i] = Annotation.fromMsgpack(messageUnpacker);
        }
        return annotationArr;
    }

    public static HttpCore.RequestBody asMsgpackRequest(Annotation[] annotationArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            MessagePacker newPacker = Serialisation.msgpackPackerConfig.newPacker(byteArrayOutputStream);
            newPacker.packArrayHeader(annotationArr.length);
            for (Annotation annotation : annotationArr) {
                annotation.writeMsgpack(newPacker);
            }
            newPacker.flush();
        } catch (IOException e) {
            Log.e(TAG, e.getMessage(), e);
        }
        return new HttpUtils.ByteArrayRequestBody(byteArrayOutputStream.toByteArray(), "application/x-msgpack");
    }

    public static HttpCore.RequestBody asJsonRequest(Annotation[] annotationArr) {
        return new HttpUtils.JsonRequestBody(Serialisation.gson.toJson(annotationArr));
    }

    public static HttpCore.BodyHandler<Annotation> getAnnotationResponseHandler(ChannelOptions channelOptions) {
        return new AnnotationBodyHandler(channelOptions);
    }

    public static Annotation[] readMsgpack(byte[] bArr) throws AblyException {
        try {
            return readMsgpackArray(Serialisation.msgpackUnpackerConfig.newUnpacker(bArr));
        } catch (IOException e) {
            throw AblyException.fromThrowable(e);
        }
    }

    public static Annotation[] readMessagesFromJson(byte[] bArr) throws MessageDecodeException {
        return (Annotation[]) Serialisation.gson.fromJson(new String(bArr), Annotation[].class);
    }

    private static class AnnotationBodyHandler implements HttpCore.BodyHandler<Annotation> {
        private final ChannelOptions channelOptions;

        AnnotationBodyHandler(ChannelOptions channelOptions) {
            this.channelOptions = channelOptions;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ably.lib.http.HttpCore.BodyHandler
        public Annotation[] handleResponseBody(String str, byte[] bArr) throws AblyException {
            Annotation[] readMsgpack;
            try {
                if (HttpConstants.ContentTypes.JSON.equals(str)) {
                    readMsgpack = AnnotationSerializer.readMessagesFromJson(bArr);
                } else {
                    readMsgpack = "application/x-msgpack".equals(str) ? AnnotationSerializer.readMsgpack(bArr) : null;
                }
                if (readMsgpack != null) {
                    for (Annotation annotation : readMsgpack) {
                        try {
                            if (annotation.data != null) {
                                annotation.decode(this.channelOptions);
                            }
                        } catch (MessageDecodeException e) {
                            Log.e(AnnotationSerializer.TAG, e.errorInfo.message);
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
