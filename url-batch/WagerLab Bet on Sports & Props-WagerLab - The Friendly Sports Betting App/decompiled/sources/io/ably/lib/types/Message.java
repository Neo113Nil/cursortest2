package io.ably.lib.types;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelGroupSerializer;
import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* loaded from: classes7.dex */
public class Message extends BaseMessage {
    private static final String ACTION = "action";
    private static final String ANNOTATIONS = "annotations";
    private static final String CONNECTION_KEY = "connectionKey";
    private static final String EXTRAS = "extras";
    private static final String NAME = "name";
    private static final String SERIAL = "serial";
    private static final String TAG = "io.ably.lib.types.Message";
    private static final String VERSION = "version";
    public MessageAction action;
    public MessageAnnotations annotations;
    public String connectionKey;
    public MessageExtras extras;
    public String name;
    public String serial;
    public MessageVersion version;

    public Message() {
    }

    public Message(String str, Object obj) {
        this(str, obj, null, null);
    }

    public Message(String str, Object obj, String str2) {
        this(str, obj, str2, null);
    }

    public Message(String str, Object obj, MessageExtras messageExtras) {
        this(str, obj, null, messageExtras);
    }

    public Message(String str, Object obj, String str2, MessageExtras messageExtras) {
        this.name = str;
        this.clientId = str2;
        this.data = obj;
        this.extras = messageExtras;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{Message");
        super.getDetails(sb);
        if (this.name != null) {
            sb.append(" name=").append(this.name);
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    void writeMsgpack(MessagePacker messagePacker) throws IOException {
        int countFields = super.countFields();
        if (this.name != null) {
            countFields++;
        }
        if (this.extras != null) {
            countFields++;
        }
        if (this.connectionKey != null) {
            countFields++;
        }
        if (this.serial != null) {
            countFields++;
        }
        if (this.version != null) {
            countFields++;
        }
        if (this.action != null) {
            countFields++;
        }
        if (this.annotations != null) {
            countFields++;
        }
        messagePacker.packMapHeader(countFields);
        super.writeFields(messagePacker);
        if (this.name != null) {
            messagePacker.packString("name");
            messagePacker.packString(this.name);
        }
        if (this.extras != null) {
            messagePacker.packString("extras");
            this.extras.write(messagePacker);
        }
        if (this.connectionKey != null) {
            messagePacker.packString(CONNECTION_KEY);
            messagePacker.packString(this.connectionKey);
        }
        if (this.serial != null) {
            messagePacker.packString(SERIAL);
            messagePacker.packString(this.serial);
        }
        if (this.version != null) {
            messagePacker.packString("version");
            this.version.writeMsgpack(messagePacker);
        }
        if (this.action != null) {
            messagePacker.packString("action");
            messagePacker.packInt(this.action.ordinal());
        }
        if (this.annotations != null) {
            messagePacker.packString(ANNOTATIONS);
            this.annotations.writeMsgpack(messagePacker);
        }
    }

    Message readMsgpack(MessageUnpacker messageUnpacker) throws IOException {
        int unpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < unpackMapHeader; i++) {
            String intern = messageUnpacker.unpackString().intern();
            MessageFormat nextFormat = messageUnpacker.getNextFormat();
            if (nextFormat.equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else if (!super.readField(messageUnpacker, intern, nextFormat)) {
                if (intern.equals("name")) {
                    this.name = messageUnpacker.unpackString();
                } else if (intern.equals("extras")) {
                    this.extras = MessageExtras.read(messageUnpacker);
                } else if (intern.equals(CONNECTION_KEY)) {
                    this.connectionKey = messageUnpacker.unpackString();
                } else if (intern.equals(SERIAL)) {
                    this.serial = messageUnpacker.unpackString();
                } else if (intern.equals("version")) {
                    this.version = MessageVersion.read(messageUnpacker);
                } else if (intern.equals("action")) {
                    this.action = MessageAction.tryFindByOrdinal(messageUnpacker.unpackInt());
                } else if (intern.equals(ANNOTATIONS)) {
                    this.annotations = MessageAnnotations.read(messageUnpacker);
                } else {
                    Log.v(TAG, "Unexpected field: " + intern);
                    messageUnpacker.skipValue();
                }
            }
        }
        return this;
    }

    public static class Batch {
        public String[] channels;
        public Message[] messages;

        public Batch(String str, Message[] messageArr) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("A Batch spec cannot have an empty set of channels");
            }
            if (messageArr == null || messageArr.length == 0) {
                throw new IllegalArgumentException("A Batch spec cannot have an empty set of messages");
            }
            this.channels = new String[]{str};
            this.messages = messageArr;
        }

        public Batch(String[] strArr, Message[] messageArr) {
            if (strArr == null || strArr.length == 0) {
                throw new IllegalArgumentException("A Batch spec cannot have an empty set of channels");
            }
            if (messageArr == null || messageArr.length == 0) {
                throw new IllegalArgumentException("A Batch spec cannot have an empty set of messages");
            }
            this.channels = strArr;
            this.messages = messageArr;
        }

        public Batch(Collection<String> collection, Collection<Message> collection2) {
            this((String[]) collection.toArray(new String[0]), (Message[]) collection2.toArray(new Message[0]));
        }

        public void writeMsgpack(MessagePacker messagePacker) throws IOException {
            messagePacker.packMapHeader(2);
            messagePacker.packString(NotificationsChannelGroupSerializer.CHANNELS_KEY);
            messagePacker.packArrayHeader(this.channels.length);
            for (String str : this.channels) {
                messagePacker.packString(str);
            }
            messagePacker.packString("messages");
            MessageSerializer.writeMsgpackArray(this.messages, messagePacker);
        }
    }

    static Message fromMsgpack(MessageUnpacker messageUnpacker) throws IOException {
        return new Message().readMsgpack(messageUnpacker);
    }

    public static Message fromEncoded(JsonObject jsonObject, ChannelOptions channelOptions) throws MessageDecodeException {
        try {
            Message message = (Message) Serialisation.gson.fromJson((JsonElement) jsonObject, Message.class);
            message.decode(channelOptions);
            return message;
        } catch (Exception e) {
            Log.e(Message.class.getName(), e.getMessage(), e);
            throw MessageDecodeException.fromDescription(e.getMessage());
        }
    }

    public static Message fromEncoded(String str, ChannelOptions channelOptions) throws MessageDecodeException {
        try {
            return fromEncoded(((JsonObject) Serialisation.gson.fromJson(str, JsonObject.class)).getAsJsonObject(), channelOptions);
        } catch (Exception e) {
            Log.e(Message.class.getName(), e.getMessage(), e);
            throw MessageDecodeException.fromDescription(e.getMessage());
        }
    }

    public static Message[] fromEncodedArray(JsonArray jsonArray, ChannelOptions channelOptions) throws MessageDecodeException {
        try {
            Message[] messageArr = new Message[jsonArray.size()];
            for (int i = 0; i < jsonArray.size(); i++) {
                JsonElement jsonElement = jsonArray.get(i);
                if (!jsonElement.isJsonObject()) {
                    throw new JsonParseException("Not all JSON elements are of type JSON Object.");
                }
                messageArr[i] = fromEncoded(jsonElement.getAsJsonObject(), channelOptions);
            }
            return messageArr;
        } catch (Exception e) {
            Log.e(Message.class.getName(), e.getMessage(), e);
            throw MessageDecodeException.fromDescription(e.getMessage());
        }
    }

    public static Message[] fromEncodedArray(String str, ChannelOptions channelOptions) throws MessageDecodeException {
        try {
            return fromEncodedArray((JsonArray) Serialisation.gson.fromJson(str, JsonArray.class), channelOptions);
        } catch (Exception e) {
            Log.e(Message.class.getName(), e.getMessage(), e);
            throw MessageDecodeException.fromDescription(e.getMessage());
        }
    }

    @Override // io.ably.lib.types.BaseMessage
    protected void read(JsonObject jsonObject) throws MessageDecodeException {
        super.read(jsonObject);
        this.name = readString(jsonObject, "name");
        JsonElement jsonElement = jsonObject.get("extras");
        if (jsonElement != null) {
            if (!(jsonElement instanceof JsonObject)) {
                throw MessageDecodeException.fromDescription("Message extras is of type \"" + jsonElement.getClass() + "\" when expected a JSON object.");
            }
            this.extras = MessageExtras.read((JsonObject) jsonElement);
        }
        this.connectionKey = readString(jsonObject, CONNECTION_KEY);
        this.serial = readString(jsonObject, SERIAL);
        JsonElement jsonElement2 = jsonObject.get("version");
        if (jsonElement2 != null) {
            this.version = MessageVersion.read(jsonElement2);
        }
        Integer readInt = readInt(jsonObject, "action");
        this.action = readInt == null ? null : MessageAction.tryFindByOrdinal(readInt.intValue());
        JsonElement jsonElement3 = jsonObject.get(ANNOTATIONS);
        if (jsonElement3 != null) {
            this.annotations = MessageAnnotations.read(jsonElement3);
        }
    }

    public static class Serializer implements JsonSerializer<Message>, JsonDeserializer<Message> {
        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(Message message, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonObject jsonObject = BaseMessage.toJsonObject(message);
            if (message.name != null) {
                jsonObject.addProperty("name", message.name);
            }
            if (message.extras != null) {
                jsonObject.add("extras", Serialisation.gson.toJsonTree(message.extras));
            }
            if (message.connectionKey != null) {
                jsonObject.addProperty(Message.CONNECTION_KEY, message.connectionKey);
            }
            if (message.serial != null) {
                jsonObject.addProperty(Message.SERIAL, message.serial);
            }
            if (message.version != null) {
                jsonObject.add("version", message.version.toJsonTree());
            }
            if (message.action != null) {
                jsonObject.addProperty("action", Integer.valueOf(message.action.ordinal()));
            }
            if (message.annotations != null) {
                jsonObject.add(Message.ANNOTATIONS, message.annotations.toJsonTree());
            }
            return jsonObject;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Message deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            if (!(jsonElement instanceof JsonObject)) {
                throw new JsonParseException("Expected an object but got \"" + jsonElement.getClass() + "\".");
            }
            Message message = new Message();
            try {
                message.read((JsonObject) jsonElement);
                return message;
            } catch (MessageDecodeException e) {
                Log.e(Message.class.getName(), e.getMessage(), e);
                throw new JsonParseException("Failed to deserialize Message from JSON.", e);
            }
        }
    }
}
