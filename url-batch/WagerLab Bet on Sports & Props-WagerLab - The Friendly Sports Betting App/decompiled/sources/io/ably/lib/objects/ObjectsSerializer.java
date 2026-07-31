package io.ably.lib.objects;

import com.google.gson.JsonArray;
import java.io.IOException;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* loaded from: classes7.dex */
public interface ObjectsSerializer {
    JsonArray asJsonArray(Object[] objArr);

    Object[] readFromJsonArray(JsonArray jsonArray);

    Object[] readMsgpackArray(MessageUnpacker messageUnpacker) throws IOException;

    void writeMsgpackArray(Object[] objArr, MessagePacker messagePacker) throws IOException;
}
