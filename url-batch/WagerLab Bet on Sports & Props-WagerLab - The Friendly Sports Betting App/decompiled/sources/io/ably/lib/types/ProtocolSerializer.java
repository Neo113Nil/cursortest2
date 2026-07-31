package io.ably.lib.types;

import io.ably.lib.util.Serialisation;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import org.msgpack.core.MessagePacker;

/* loaded from: classes7.dex */
public class ProtocolSerializer {
    public static ProtocolMessage readMsgpack(byte[] bArr) throws AblyException {
        try {
            return ProtocolMessage.fromMsgpack(Serialisation.msgpackUnpackerConfig.newUnpacker(bArr));
        } catch (IOException e) {
            throw AblyException.fromThrowable(e);
        }
    }

    public static byte[] writeMsgpack(ProtocolMessage protocolMessage) throws AblyException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        MessagePacker newPacker = Serialisation.msgpackPackerConfig.newPacker(byteArrayOutputStream);
        try {
            protocolMessage.writeMsgpack(newPacker);
            newPacker.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw AblyException.fromThrowable(e);
        }
    }

    public static ProtocolMessage fromJSON(String str) throws AblyException {
        return (ProtocolMessage) Serialisation.gson.fromJson(str, ProtocolMessage.class);
    }

    public static byte[] writeJSON(ProtocolMessage protocolMessage) throws AblyException {
        return Serialisation.gson.toJson(protocolMessage).getBytes(Charset.forName("UTF-8"));
    }
}
