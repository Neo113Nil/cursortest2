package io.ably.lib.types;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import io.ably.lib.objects.ObjectsHelper;
import io.ably.lib.objects.ObjectsJsonSerializer;
import io.ably.lib.objects.ObjectsSerializer;
import io.ably.lib.util.Log;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* loaded from: classes7.dex */
public class ProtocolMessage {
    private static final String TAG = "io.ably.lib.types.ProtocolMessage";
    public Action action;
    public Annotation[] annotations;
    public AuthDetails auth;
    public String channel;
    public String channelSerial;
    public ConnectionDetails connectionDetails;
    public String connectionId;
    public int count;
    public ErrorInfo error;
    public int flags;
    public String id;
    public Message[] messages;
    public Long msgSerial;
    public Map<String, String> params;
    public PresenceMessage[] presence;

    @JsonAdapter(ObjectsJsonSerializer.class)
    public Object[] state;
    public long timestamp;

    public enum Action {
        heartbeat,
        ack,
        nack,
        connect,
        connected,
        disconnect,
        disconnected,
        close,
        closed,
        error,
        attach,
        attached,
        detach,
        detached,
        presence,
        message,
        sync,
        auth,
        activate,
        object,
        object_sync,
        annotation;

        public int getValue() {
            return ordinal();
        }

        public static Action findByValue(int i) {
            return values()[i];
        }
    }

    public enum Flag {
        has_presence(0),
        has_backlog(1),
        resumed(2),
        attach_resume(5),
        has_objects(7),
        presence(16),
        publish(17),
        subscribe(18),
        presence_subscribe(19),
        annotation_publish(21),
        annotation_subscribe(22),
        object_subscribe(24),
        object_publish(25);

        private final int mask;

        Flag(int i) {
            this.mask = 1 << i;
        }

        public int getMask() {
            return this.mask;
        }
    }

    public static boolean ackRequired(ProtocolMessage protocolMessage) {
        return protocolMessage.action == Action.message || protocolMessage.action == Action.presence || protocolMessage.action == Action.object || protocolMessage.action == Action.annotation;
    }

    public ProtocolMessage() {
    }

    public ProtocolMessage(Action action) {
        this.action = action;
    }

    public ProtocolMessage(Action action, String str) {
        this.action = action;
        this.channel = str;
    }

    public boolean hasFlag(Flag flag) {
        return (this.flags & flag.getMask()) == flag.getMask();
    }

    public void setFlag(Flag flag) {
        this.flags = flag.getMask() | this.flags;
    }

    public void setFlags(int i) {
        this.flags = i | this.flags;
    }

    void writeMsgpack(MessagePacker messagePacker) throws IOException {
        int i = this.channel != null ? 2 : 1;
        if (this.msgSerial != null) {
            i++;
        }
        if (this.messages != null) {
            i++;
        }
        if (this.presence != null) {
            i++;
        }
        if (this.auth != null) {
            i++;
        }
        if (this.flags != 0) {
            i++;
        }
        if (this.params != null) {
            i++;
        }
        if (this.channelSerial != null) {
            i++;
        }
        if (this.annotations != null) {
            i++;
        }
        if (this.state != null && ObjectsHelper.getSerializer() != null) {
            i++;
        }
        messagePacker.packMapHeader(i);
        messagePacker.packString("action");
        messagePacker.packInt(this.action.getValue());
        if (this.channel != null) {
            messagePacker.packString("channel");
            messagePacker.packString(this.channel);
        }
        if (this.msgSerial != null) {
            messagePacker.packString("msgSerial");
            messagePacker.packLong(this.msgSerial.longValue());
        }
        if (this.messages != null) {
            messagePacker.packString("messages");
            MessageSerializer.writeMsgpackArray(this.messages, messagePacker);
        }
        if (this.presence != null) {
            messagePacker.packString("presence");
            PresenceSerializer.writeMsgpackArray(this.presence, messagePacker);
        }
        if (this.auth != null) {
            messagePacker.packString("auth");
            this.auth.writeMsgpack(messagePacker);
        }
        if (this.flags != 0) {
            messagePacker.packString(NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY);
            messagePacker.packInt(this.flags);
        }
        if (this.params != null) {
            messagePacker.packString("params");
            MessageSerializer.write(this.params, messagePacker);
        }
        if (this.channelSerial != null) {
            messagePacker.packString("channelSerial");
            messagePacker.packString(this.channelSerial);
        }
        if (this.annotations != null) {
            messagePacker.packString("annotations");
            AnnotationSerializer.writeMsgpackArray(this.annotations, messagePacker);
        }
        if (this.state != null) {
            ObjectsSerializer serializer = ObjectsHelper.getSerializer();
            if (serializer != null) {
                messagePacker.packString("state");
                serializer.writeMsgpackArray(this.state, messagePacker);
            } else {
                Log.w(TAG, "Skipping 'state' field msgpack serialization because ObjectsSerializer not found");
            }
        }
    }

    ProtocolMessage readMsgpack(MessageUnpacker messageUnpacker) throws IOException {
        int unpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < unpackMapHeader; i++) {
            String intern = messageUnpacker.unpackString().intern();
            if (!messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                intern.hashCode();
                switch (intern) {
                    case "msgSerial":
                        this.msgSerial = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    case "action":
                        this.action = Action.findByValue(messageUnpacker.unpackInt());
                        break;
                    case "presence":
                        this.presence = PresenceSerializer.readMsgpackArray(messageUnpacker);
                        break;
                    case "params":
                        this.params = MessageSerializer.readStringMap(messageUnpacker);
                        break;
                    case "annotations":
                        this.annotations = AnnotationSerializer.readMsgpackArray(messageUnpacker);
                        break;
                    case "connectionKey":
                        messageUnpacker.unpackString();
                        break;
                    case "messages":
                        this.messages = MessageSerializer.readMsgpackArray(messageUnpacker);
                        break;
                    case "id":
                        this.id = messageUnpacker.unpackString();
                        break;
                    case "auth":
                        this.auth = AuthDetails.fromMsgpack(messageUnpacker);
                        break;
                    case "timestamp":
                        this.timestamp = messageUnpacker.unpackLong();
                        break;
                    case "count":
                        this.count = messageUnpacker.unpackInt();
                        break;
                    case "error":
                        this.error = ErrorInfo.fromMsgpack(messageUnpacker);
                        break;
                    case "flags":
                        this.flags = messageUnpacker.unpackInt();
                        break;
                    case "state":
                        ObjectsSerializer serializer = ObjectsHelper.getSerializer();
                        if (serializer != null) {
                            this.state = serializer.readMsgpackArray(messageUnpacker);
                            break;
                        } else {
                            Log.w(TAG, "Skipping 'state' field msgpack deserialization because ObjectsSerializer not found");
                            messageUnpacker.skipValue();
                            break;
                        }
                    case "connectionDetails":
                        this.connectionDetails = ConnectionDetails.fromMsgpack(messageUnpacker);
                        break;
                    case "channel":
                        this.channel = messageUnpacker.unpackString();
                        break;
                    case "channelSerial":
                        this.channelSerial = messageUnpacker.unpackString();
                        break;
                    case "connectionId":
                        this.connectionId = messageUnpacker.unpackString();
                        break;
                    default:
                        Log.v(TAG, "Unexpected field: " + intern);
                        messageUnpacker.skipValue();
                        break;
                }
            } else {
                messageUnpacker.unpackNil();
            }
        }
        return this;
    }

    static ProtocolMessage fromMsgpack(MessageUnpacker messageUnpacker) throws IOException {
        return new ProtocolMessage().readMsgpack(messageUnpacker);
    }

    public static class ActionSerializer implements JsonSerializer<Action>, JsonDeserializer<Action> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Action deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return Action.findByValue(jsonElement.getAsInt());
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(Action action, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(Integer.valueOf(action.getValue()));
        }
    }

    public static class AuthDetails {
        public String accessToken;

        private AuthDetails() {
        }

        public AuthDetails(String str) {
            this.accessToken = str;
        }

        AuthDetails readMsgpack(MessageUnpacker messageUnpacker) throws IOException {
            int unpackMapHeader = messageUnpacker.unpackMapHeader();
            for (int i = 0; i < unpackMapHeader; i++) {
                String intern = messageUnpacker.unpackString().intern();
                if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                    messageUnpacker.unpackNil();
                } else {
                    intern.hashCode();
                    if (!intern.equals(SDKConstants.PARAM_ACCESS_TOKEN)) {
                        Log.v(ProtocolMessage.TAG, "Unexpected field: " + intern);
                        messageUnpacker.skipValue();
                    } else {
                        this.accessToken = messageUnpacker.unpackString();
                    }
                }
            }
            return this;
        }

        static AuthDetails fromMsgpack(MessageUnpacker messageUnpacker) throws IOException {
            return new AuthDetails().readMsgpack(messageUnpacker);
        }

        void writeMsgpack(MessagePacker messagePacker) throws IOException {
            messagePacker.packMapHeader(this.accessToken != null ? 1 : 0);
            if (this.accessToken != null) {
                messagePacker.packString(SDKConstants.PARAM_ACCESS_TOKEN);
                messagePacker.packString(this.accessToken);
            }
        }
    }
}
