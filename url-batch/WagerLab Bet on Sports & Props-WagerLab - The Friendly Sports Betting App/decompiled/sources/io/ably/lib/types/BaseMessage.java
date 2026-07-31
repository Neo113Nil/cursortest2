package io.ably.lib.types;

import com.davidehrmann.vcdiff.VCDiffDecoder;
import com.davidehrmann.vcdiff.VCDiffDecoderBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import io.ably.lib.util.Base64Coder;
import io.ably.lib.util.Crypto;
import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* loaded from: classes7.dex */
public class BaseMessage implements Cloneable {
    private static final String CLIENT_ID = "clientId";
    private static final String CONNECTION_ID = "connectionId";
    private static final String DATA = "data";
    private static final String ENCODING = "encoding";
    private static final String ID = "id";
    private static final String TIMESTAMP = "timestamp";
    public String clientId;
    public String connectionId;
    public Object data;
    public String encoding;
    public String id;
    public long timestamp;
    private static final VCDiffDecoder vcdiffDecoder = VCDiffDecoderBuilder.builder().buildSimple();
    private static Pattern xformPattern = Pattern.compile("([\\-\\w]+)(\\+([\\-\\w]+))?");
    private static final String TAG = BaseMessage.class.getName();

    public void getDetails(StringBuilder sb) {
        if (this.clientId != null) {
            sb.append(" clientId=").append(this.clientId);
        }
        if (this.connectionId != null) {
            sb.append(" connectionId=").append(this.connectionId);
        }
        if (this.data != null) {
            sb.append(" data=").append(this.data);
        }
        if (this.encoding != null) {
            sb.append(" encoding=").append(this.encoding);
        }
        if (this.id != null) {
            sb.append(" id=").append(this.id);
        }
    }

    public void decode(ChannelOptions channelOptions) throws MessageDecodeException {
        decode(channelOptions, new DecodingContext());
    }

    private static byte[] vcdiffApply(byte[] bArr, byte[] bArr2) throws MessageDecodeException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            vcdiffDecoder.decode(bArr2, bArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            throw MessageDecodeException.fromThrowableAndErrorInfo(th, new ErrorInfo("VCDIFF delta decode failed", 400, 40018));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
    
        throw io.ably.lib.types.MessageDecodeException.fromDescription("Encrypted message received but encryption is not set up");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void decode(ChannelOptions channelOptions, DecodingContext decodingContext) throws MessageDecodeException {
        int i;
        Matcher matcher;
        char c;
        Object obj = this.data;
        String str = this.encoding;
        if (str != null) {
            String[] split = str.split("\\/");
            int length = split.length;
            while (true) {
                if (length > 0) {
                    try {
                        i = length - 1;
                        matcher = xformPattern.matcher(split[i]);
                    } finally {
                    }
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        switch (group.hashCode()) {
                            case -1396204209:
                                if (group.equals("base64")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1360271861:
                                if (group.equals("cipher")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -822215630:
                                if (group.equals(DeltaExtras.FORMAT_VCDIFF)) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3271912:
                                if (group.equals("json")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 111607186:
                                if (group.equals("utf-8")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c != 0) {
                            if (c == 1) {
                                try {
                                    this.data = new String((byte[]) this.data, "UTF-8");
                                } catch (UnsupportedEncodingException | ClassCastException unused) {
                                }
                            } else if (c == 2) {
                                try {
                                    this.data = Serialisation.gsonParser.parse(((String) this.data).trim());
                                } catch (JsonParseException unused2) {
                                    throw MessageDecodeException.fromDescription("Invalid JSON data received");
                                }
                            } else if (c != 3) {
                                if (c == 4) {
                                    obj = vcdiffApply((byte[]) this.data, decodingContext.getLastMessageData());
                                    this.data = obj;
                                }
                            } else if (channelOptions != null && channelOptions.encrypted) {
                                try {
                                    this.data = Crypto.createChannelDecipher(channelOptions.getCipherParamsOrDefault()).decrypt((byte[]) this.data);
                                } catch (AblyException e) {
                                    throw MessageDecodeException.fromDescription(e.errorInfo.message);
                                }
                            }
                            length = i;
                        } else {
                            try {
                                byte[] decode = Base64Coder.decode((String) this.data);
                                this.data = decode;
                                if (length == split.length) {
                                    obj = decode;
                                }
                                length = i;
                            } catch (IllegalArgumentException unused3) {
                                throw MessageDecodeException.fromDescription("Invalid base64 data received");
                            }
                        }
                        this.encoding = length > 0 ? join(split, IOUtils.DIR_SEPARATOR_UNIX, 0, length) : null;
                    }
                }
            }
        }
        if (obj instanceof String) {
            decodingContext.setLastMessageData((String) obj);
        } else if (obj instanceof byte[]) {
            decodingContext.setLastMessageData((byte[]) obj);
        } else if (obj != null) {
            throw MessageDecodeException.fromDescription("Message data neither String nor byte[]. Unsupported message data type.");
        }
    }

    public void encode(ChannelOptions channelOptions) throws AblyException {
        Object obj = this.data;
        if (obj != null) {
            if (obj instanceof JsonElement) {
                this.data = Serialisation.gson.toJson((JsonElement) this.data);
                this.encoding = (this.encoding == null ? "" : this.encoding + "/") + "json";
            }
            Object obj2 = this.data;
            if (obj2 instanceof String) {
                if (channelOptions != null && channelOptions.encrypted) {
                    try {
                        this.data = ((String) this.data).getBytes("UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                    }
                    this.encoding = (this.encoding == null ? "" : this.encoding + "/") + "utf-8";
                }
            } else if (!(obj2 instanceof byte[])) {
                Log.d(TAG, "Message data must be either `byte[]`, `String` or `JSONElement`; implicit coercion of other types to String is deprecated");
                throw AblyException.fromErrorInfo(new ErrorInfo("Invalid message data or encoding", 400, 40013));
            }
        }
        if (channelOptions == null || !channelOptions.encrypted) {
            return;
        }
        Crypto.EncryptingChannelCipher createChannelEncipher = Crypto.createChannelEncipher(channelOptions.getCipherParamsOrDefault());
        this.data = createChannelEncipher.encrypt((byte[]) this.data);
        this.encoding = (this.encoding != null ? this.encoding + "/" : "") + "cipher+" + createChannelEncipher.getAlgorithm();
    }

    private String join(String[] strArr, char c, int i, int i2) {
        StringBuilder sb = new StringBuilder(strArr[i]);
        for (int i3 = i + 1; i3 < i2; i3++) {
            sb.append(c).append(strArr[i3]);
        }
        return sb.toString();
    }

    public static JsonObject toJsonObject(BaseMessage baseMessage) {
        JsonObject jsonObject = new JsonObject();
        Object obj = baseMessage.data;
        String str = baseMessage.encoding;
        if (obj != null) {
            if (obj instanceof byte[]) {
                jsonObject.addProperty("data", new String(Base64Coder.encode((byte[]) obj)));
                str = str == null ? "base64" : str + "/base64";
            } else {
                jsonObject.addProperty("data", obj.toString());
            }
            if (str != null) {
                jsonObject.addProperty(ENCODING, str);
            }
        }
        String str2 = baseMessage.id;
        if (str2 != null) {
            jsonObject.addProperty("id", str2);
        }
        String str3 = baseMessage.clientId;
        if (str3 != null) {
            jsonObject.addProperty("clientId", str3);
        }
        String str4 = baseMessage.connectionId;
        if (str4 != null) {
            jsonObject.addProperty("connectionId", str4);
        }
        return jsonObject;
    }

    protected void read(JsonObject jsonObject) throws MessageDecodeException {
        Long readLong = readLong(jsonObject, "timestamp");
        if (readLong != null) {
            this.timestamp = readLong.longValue();
        }
        this.id = readString(jsonObject, "id");
        this.clientId = readString(jsonObject, "clientId");
        this.connectionId = readString(jsonObject, "connectionId");
        this.encoding = readString(jsonObject, ENCODING);
        this.data = readString(jsonObject, "data");
    }

    protected String readString(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null || (jsonElement instanceof JsonNull)) {
            return null;
        }
        return jsonElement.getAsString();
    }

    protected Long readLong(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null || (jsonElement instanceof JsonNull)) {
            return null;
        }
        return Long.valueOf(jsonElement.getAsLong());
    }

    protected Integer readInt(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null || (jsonElement instanceof JsonNull)) {
            return null;
        }
        return Integer.valueOf(jsonElement.getAsInt());
    }

    boolean readField(MessageUnpacker messageUnpacker, String str, MessageFormat messageFormat) throws IOException {
        str.hashCode();
        switch (str) {
            case "id":
                this.id = messageUnpacker.unpackString();
                return true;
            case "data":
                if (messageFormat.getValueType().isBinaryType()) {
                    byte[] bArr = new byte[messageUnpacker.unpackBinaryHeader()];
                    messageUnpacker.readPayload(bArr);
                    this.data = bArr;
                    return true;
                }
                this.data = messageUnpacker.unpackString();
                return true;
            case "timestamp":
                this.timestamp = messageUnpacker.unpackLong();
                return true;
            case "clientId":
                this.clientId = messageUnpacker.unpackString();
                return true;
            case "encoding":
                this.encoding = messageUnpacker.unpackString();
                return true;
            case "connectionId":
                this.connectionId = messageUnpacker.unpackString();
                return true;
            default:
                return false;
        }
    }

    protected int countFields() {
        int i = this.timestamp > 0 ? 1 : 0;
        if (this.id != null) {
            i++;
        }
        if (this.clientId != null) {
            i++;
        }
        if (this.connectionId != null) {
            i++;
        }
        if (this.encoding != null) {
            i++;
        }
        return this.data != null ? i + 1 : i;
    }

    void writeFields(MessagePacker messagePacker) throws IOException {
        if (this.timestamp > 0) {
            messagePacker.packString("timestamp");
            messagePacker.packLong(this.timestamp);
        }
        if (this.id != null) {
            messagePacker.packString("id");
            messagePacker.packString(this.id);
        }
        if (this.clientId != null) {
            messagePacker.packString("clientId");
            messagePacker.packString(this.clientId);
        }
        if (this.connectionId != null) {
            messagePacker.packString("connectionId");
            messagePacker.packString(this.connectionId);
        }
        if (this.encoding != null) {
            messagePacker.packString(ENCODING);
            messagePacker.packString(this.encoding);
        }
        if (this.data != null) {
            messagePacker.packString("data");
            Object obj = this.data;
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                messagePacker.packBinaryHeader(bArr.length);
                messagePacker.writePayload(bArr);
                return;
            }
            messagePacker.packString(obj.toString());
        }
    }
}
