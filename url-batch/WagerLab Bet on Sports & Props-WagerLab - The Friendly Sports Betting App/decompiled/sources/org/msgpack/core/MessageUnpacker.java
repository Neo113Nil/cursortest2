package org.msgpack.core;

import androidx.collection.SieveCacheKt;
import com.google.common.base.Ascii;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.UShort;
import org.msgpack.core.MessagePack;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferInput;
import org.msgpack.value.ImmutableValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueFactory;
import org.msgpack.value.ValueType;
import org.msgpack.value.Variable;

/* loaded from: classes9.dex */
public class MessageUnpacker implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final MessageBuffer EMPTY_BUFFER = MessageBuffer.wrap(new byte[0]);
    private static final String EMPTY_STRING = "";
    private final CodingErrorAction actionOnMalformedString;
    private final CodingErrorAction actionOnUnmappableString;
    private final boolean allowReadingBinaryAsString;
    private final boolean allowReadingStringAsBinary;
    private CharBuffer decodeBuffer;
    private StringBuilder decodeStringBuffer;
    private CharsetDecoder decoder;
    private MessageBufferInput in;
    private int nextReadPosition;
    private int position;
    private final int stringDecoderBufferSize;
    private final int stringSizeLimit;
    private long totalReadBytes;
    private MessageBuffer buffer = EMPTY_BUFFER;
    private final MessageBuffer numberBuffer = MessageBuffer.allocate(8);

    protected MessageUnpacker(MessageBufferInput messageBufferInput, MessagePack.UnpackerConfig unpackerConfig) {
        this.in = (MessageBufferInput) Preconditions.checkNotNull(messageBufferInput, "MessageBufferInput is null");
        this.allowReadingStringAsBinary = unpackerConfig.getAllowReadingStringAsBinary();
        this.allowReadingBinaryAsString = unpackerConfig.getAllowReadingBinaryAsString();
        this.actionOnMalformedString = unpackerConfig.getActionOnMalformedString();
        this.actionOnUnmappableString = unpackerConfig.getActionOnUnmappableString();
        this.stringSizeLimit = unpackerConfig.getStringSizeLimit();
        this.stringDecoderBufferSize = unpackerConfig.getStringDecoderBufferSize();
    }

    public MessageBufferInput reset(MessageBufferInput messageBufferInput) throws IOException {
        MessageBufferInput messageBufferInput2 = (MessageBufferInput) Preconditions.checkNotNull(messageBufferInput, "MessageBufferInput is null");
        MessageBufferInput messageBufferInput3 = this.in;
        this.in = messageBufferInput2;
        this.buffer = EMPTY_BUFFER;
        this.position = 0;
        this.totalReadBytes = 0L;
        return messageBufferInput3;
    }

    public long getTotalReadBytes() {
        return this.totalReadBytes + this.position;
    }

    private MessageBuffer getNextBuffer() throws IOException {
        MessageBuffer next = this.in.next();
        if (next == null) {
            throw new MessageInsufficientBufferException();
        }
        this.totalReadBytes += this.buffer.size();
        return next;
    }

    private void nextBuffer() throws IOException {
        this.buffer = getNextBuffer();
        this.position = 0;
    }

    private MessageBuffer prepareNumberBuffer(int i) throws IOException {
        int size = this.buffer.size();
        int i2 = this.position;
        int i3 = size - i2;
        if (i3 >= i) {
            this.nextReadPosition = i2;
            this.position = i2 + i;
            return this.buffer;
        }
        if (i3 > 0) {
            this.numberBuffer.putMessageBuffer(0, this.buffer, i2, i3);
            i -= i3;
        } else {
            i3 = 0;
        }
        while (true) {
            nextBuffer();
            int size2 = this.buffer.size();
            if (size2 >= i) {
                this.numberBuffer.putMessageBuffer(i3, this.buffer, 0, i);
                this.position = i;
                this.nextReadPosition = 0;
                return this.numberBuffer;
            }
            this.numberBuffer.putMessageBuffer(i3, this.buffer, 0, size2);
            i -= size2;
            i3 += size2;
        }
    }

    private static int utf8MultibyteCharacterSize(byte b) {
        return Integer.numberOfLeadingZeros((~(b & 255)) << 24);
    }

    public boolean hasNext() throws IOException {
        return ensureBuffer();
    }

    private boolean ensureBuffer() throws IOException {
        while (this.buffer.size() <= this.position) {
            MessageBuffer next = this.in.next();
            if (next == null) {
                return false;
            }
            this.totalReadBytes += this.buffer.size();
            this.buffer = next;
            this.position = 0;
        }
        return true;
    }

    public MessageFormat getNextFormat() throws IOException {
        if (!ensureBuffer()) {
            throw new MessageInsufficientBufferException();
        }
        return MessageFormat.valueOf(this.buffer.getByte(this.position));
    }

    private byte readByte() throws IOException {
        int size = this.buffer.size();
        int i = this.position;
        if (size > i) {
            byte b = this.buffer.getByte(i);
            this.position++;
            return b;
        }
        nextBuffer();
        if (this.buffer.size() > 0) {
            byte b2 = this.buffer.getByte(0);
            this.position = 1;
            return b2;
        }
        return readByte();
    }

    private short readShort() throws IOException {
        return prepareNumberBuffer(2).getShort(this.nextReadPosition);
    }

    private int readInt() throws IOException {
        return prepareNumberBuffer(4).getInt(this.nextReadPosition);
    }

    private long readLong() throws IOException {
        return prepareNumberBuffer(8).getLong(this.nextReadPosition);
    }

    private float readFloat() throws IOException {
        return prepareNumberBuffer(4).getFloat(this.nextReadPosition);
    }

    private double readDouble() throws IOException {
        return prepareNumberBuffer(8).getDouble(this.nextReadPosition);
    }

    public void skipValue() throws IOException {
        skipValue(1);
    }

    public void skipValue(int i) throws IOException {
        int i2;
        int i3;
        while (i > 0) {
            byte readByte = readByte();
            switch (MessageFormat.valueOf(readByte)) {
                case FIXMAP:
                    i2 = readByte & 15;
                    i3 = i2 * 2;
                    i += i3;
                    i--;
                case FIXARRAY:
                    i3 = readByte & 15;
                    i += i3;
                    i--;
                case FIXSTR:
                    skipPayload(readByte & Ascii.US);
                    i--;
                case INT8:
                case UINT8:
                    skipPayload(1);
                    i--;
                case INT16:
                case UINT16:
                    skipPayload(2);
                    i--;
                case INT32:
                case UINT32:
                case FLOAT32:
                    skipPayload(4);
                    i--;
                case INT64:
                case UINT64:
                case FLOAT64:
                    skipPayload(8);
                    i--;
                case BIN8:
                case STR8:
                    skipPayload(readNextLength8());
                    i--;
                case BIN16:
                case STR16:
                    skipPayload(readNextLength16());
                    i--;
                case BIN32:
                case STR32:
                    skipPayload(readNextLength32());
                    i--;
                case FIXEXT1:
                    skipPayload(2);
                    i--;
                case FIXEXT2:
                    skipPayload(3);
                    i--;
                case FIXEXT4:
                    skipPayload(5);
                    i--;
                case FIXEXT8:
                    skipPayload(9);
                    i--;
                case FIXEXT16:
                    skipPayload(17);
                    i--;
                case EXT8:
                    skipPayload(readNextLength8() + 1);
                    i--;
                case EXT16:
                    skipPayload(readNextLength16() + 1);
                    i--;
                case EXT32:
                    skipPayload(readNextLength32() + 1);
                    i--;
                case ARRAY16:
                    i3 = readNextLength16();
                    i += i3;
                    i--;
                case ARRAY32:
                    i3 = readNextLength32();
                    i += i3;
                    i--;
                case MAP16:
                    i2 = readNextLength16();
                    i3 = i2 * 2;
                    i += i3;
                    i--;
                case MAP32:
                    i2 = readNextLength32();
                    i3 = i2 * 2;
                    i += i3;
                    i--;
                case NEVER_USED:
                    throw new MessageNeverUsedFormatException("Encountered 0xC1 \"NEVER_USED\" byte");
                default:
                    i--;
            }
        }
    }

    private static MessagePackException unexpected(String str, byte b) {
        MessageFormat valueOf = MessageFormat.valueOf(b);
        if (valueOf == MessageFormat.NEVER_USED) {
            return new MessageNeverUsedFormatException(String.format("Expected %s, but encountered 0xC1 \"NEVER_USED\" byte", str));
        }
        String name = valueOf.getValueType().name();
        return new MessageTypeException(String.format("Expected %s, but got %s (%02x)", str, name.substring(0, 1) + name.substring(1).toLowerCase(), Byte.valueOf(b)));
    }

    /* renamed from: org.msgpack.core.MessageUnpacker$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$msgpack$value$ValueType;

        static {
            int[] iArr = new int[ValueType.values().length];
            $SwitchMap$org$msgpack$value$ValueType = iArr;
            try {
                iArr[ValueType.NIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.BINARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.MAP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.EXTENSION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[MessageFormat.values().length];
            $SwitchMap$org$msgpack$core$MessageFormat = iArr2;
            try {
                iArr2[MessageFormat.POSFIXINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.NEGFIXINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.NIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXMAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXSTR.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT8.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT8.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT16.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT16.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FLOAT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FLOAT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BIN8.ordinal()] = 18;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.STR8.ordinal()] = 19;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BIN16.ordinal()] = 20;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.STR16.ordinal()] = 21;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BIN32.ordinal()] = 22;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.STR32.ordinal()] = 23;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT1.ordinal()] = 24;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT2.ordinal()] = 25;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT4.ordinal()] = 26;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT8.ordinal()] = 27;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT16.ordinal()] = 28;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.EXT8.ordinal()] = 29;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.EXT16.ordinal()] = 30;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.EXT32.ordinal()] = 31;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.ARRAY16.ordinal()] = 32;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.ARRAY32.ordinal()] = 33;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.MAP16.ordinal()] = 34;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.MAP32.ordinal()] = 35;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.NEVER_USED.ordinal()] = 36;
            } catch (NoSuchFieldError unused45) {
            }
        }
    }

    public ImmutableValue unpackValue() throws IOException {
        MessageFormat nextFormat = getNextFormat();
        int i = 0;
        switch (AnonymousClass1.$SwitchMap$org$msgpack$value$ValueType[nextFormat.getValueType().ordinal()]) {
            case 1:
                readByte();
                return ValueFactory.newNil();
            case 2:
                return ValueFactory.newBoolean(unpackBoolean());
            case 3:
                if (AnonymousClass1.$SwitchMap$org$msgpack$core$MessageFormat[nextFormat.ordinal()] == 16) {
                    return ValueFactory.newInteger(unpackBigInteger());
                }
                return ValueFactory.newInteger(unpackLong());
            case 4:
                return ValueFactory.newFloat(unpackDouble());
            case 5:
                return ValueFactory.newString(readPayload(unpackRawStringHeader()), true);
            case 6:
                return ValueFactory.newBinary(readPayload(unpackBinaryHeader()), true);
            case 7:
                int unpackArrayHeader = unpackArrayHeader();
                Value[] valueArr = new Value[unpackArrayHeader];
                while (i < unpackArrayHeader) {
                    valueArr[i] = unpackValue();
                    i++;
                }
                return ValueFactory.newArray(valueArr, true);
            case 8:
                int unpackMapHeader = unpackMapHeader() * 2;
                Value[] valueArr2 = new Value[unpackMapHeader];
                while (i < unpackMapHeader) {
                    valueArr2[i] = unpackValue();
                    valueArr2[i + 1] = unpackValue();
                    i += 2;
                }
                return ValueFactory.newMap(valueArr2, true);
            case 9:
                ExtensionTypeHeader unpackExtensionTypeHeader = unpackExtensionTypeHeader();
                return ValueFactory.newExtension(unpackExtensionTypeHeader.getType(), readPayload(unpackExtensionTypeHeader.getLength()));
            default:
                throw new MessageNeverUsedFormatException("Unknown value type");
        }
    }

    public Variable unpackValue(Variable variable) throws IOException {
        MessageFormat nextFormat = getNextFormat();
        int i = 0;
        switch (AnonymousClass1.$SwitchMap$org$msgpack$value$ValueType[nextFormat.getValueType().ordinal()]) {
            case 1:
                readByte();
                variable.setNilValue();
                return variable;
            case 2:
                variable.setBooleanValue(unpackBoolean());
                return variable;
            case 3:
                if (AnonymousClass1.$SwitchMap$org$msgpack$core$MessageFormat[nextFormat.ordinal()] == 16) {
                    variable.setIntegerValue(unpackBigInteger());
                    return variable;
                }
                variable.setIntegerValue(unpackLong());
                return variable;
            case 4:
                variable.setFloatValue(unpackDouble());
                return variable;
            case 5:
                variable.setStringValue(readPayload(unpackRawStringHeader()));
                return variable;
            case 6:
                variable.setBinaryValue(readPayload(unpackBinaryHeader()));
                return variable;
            case 7:
                int unpackArrayHeader = unpackArrayHeader();
                ArrayList arrayList = new ArrayList(unpackArrayHeader);
                while (i < unpackArrayHeader) {
                    arrayList.add(unpackValue());
                    i++;
                }
                variable.setArrayValue(arrayList);
                return variable;
            case 8:
                int unpackMapHeader = unpackMapHeader();
                HashMap hashMap = new HashMap();
                while (i < unpackMapHeader) {
                    hashMap.put(unpackValue(), unpackValue());
                    i++;
                }
                variable.setMapValue(hashMap);
                return variable;
            case 9:
                ExtensionTypeHeader unpackExtensionTypeHeader = unpackExtensionTypeHeader();
                variable.setExtensionValue(unpackExtensionTypeHeader.getType(), readPayload(unpackExtensionTypeHeader.getLength()));
                return variable;
            default:
                throw new MessageFormatException("Unknown value type");
        }
    }

    public void unpackNil() throws IOException {
        byte readByte = readByte();
        if (readByte != -64) {
            throw unexpected("Nil", readByte);
        }
    }

    public boolean unpackBoolean() throws IOException {
        byte readByte = readByte();
        if (readByte == -62) {
            return false;
        }
        if (readByte == -61) {
            return true;
        }
        throw unexpected("boolean", readByte);
    }

    public byte unpackByte() throws IOException {
        long readLong;
        byte readByte = readByte();
        if (MessagePack.Code.isFixInt(readByte)) {
            return readByte;
        }
        switch (readByte) {
            case -52:
                byte readByte2 = readByte();
                if (readByte2 >= 0) {
                    return readByte2;
                }
                throw overflowU8(readByte2);
            case -51:
                short readShort = readShort();
                if (readShort < 0 || readShort > 127) {
                    throw overflowU16(readShort);
                }
                return (byte) readShort;
            case -50:
                int readInt = readInt();
                if (readInt < 0 || readInt > 127) {
                    throw overflowU32(readInt);
                }
                return (byte) readInt;
            case -49:
                readLong = readLong();
                if (readLong < 0 || readLong > 127) {
                    throw overflowU64(readLong);
                }
                break;
            case -48:
                return readByte();
            case -47:
                short readShort2 = readShort();
                if (readShort2 < -128 || readShort2 > 127) {
                    throw overflowI16(readShort2);
                }
                return (byte) readShort2;
            case -46:
                int readInt2 = readInt();
                if (readInt2 < -128 || readInt2 > 127) {
                    throw overflowI32(readInt2);
                }
                return (byte) readInt2;
            case -45:
                readLong = readLong();
                if (readLong < -128 || readLong > 127) {
                    throw overflowI64(readLong);
                }
                break;
            default:
                throw unexpected("Integer", readByte);
        }
        return (byte) readLong;
    }

    public short unpackShort() throws IOException {
        int readByte;
        long readLong;
        byte readByte2 = readByte();
        if (MessagePack.Code.isFixInt(readByte2)) {
            return readByte2;
        }
        switch (readByte2) {
            case -52:
                readByte = readByte() & 255;
                return (short) readByte;
            case -51:
                short readShort = readShort();
                if (readShort >= 0) {
                    return readShort;
                }
                throw overflowU16(readShort);
            case -50:
                int readInt = readInt();
                if (readInt < 0 || readInt > 32767) {
                    throw overflowU32(readInt);
                }
                return (short) readInt;
            case -49:
                readLong = readLong();
                if (readLong < 0 || readLong > 32767) {
                    throw overflowU64(readLong);
                }
                readByte = (int) readLong;
                return (short) readByte;
            case -48:
                readByte = readByte();
                return (short) readByte;
            case -47:
                return readShort();
            case -46:
                int readInt2 = readInt();
                if (readInt2 < -32768 || readInt2 > 32767) {
                    throw overflowI32(readInt2);
                }
                return (short) readInt2;
            case -45:
                readLong = readLong();
                if (readLong < -32768 || readLong > 32767) {
                    throw overflowI64(readLong);
                }
                readByte = (int) readLong;
                return (short) readByte;
            default:
                throw unexpected("Integer", readByte2);
        }
    }

    public int unpackInt() throws IOException {
        byte readByte = readByte();
        if (MessagePack.Code.isFixInt(readByte)) {
            return readByte;
        }
        switch (readByte) {
            case -52:
                return readByte() & 255;
            case -51:
                return readShort() & UShort.MAX_VALUE;
            case -50:
                int readInt = readInt();
                if (readInt >= 0) {
                    return readInt;
                }
                throw overflowU32(readInt);
            case -49:
                long readLong = readLong();
                if (readLong < 0 || readLong > SieveCacheKt.NodeLinkMask) {
                    throw overflowU64(readLong);
                }
                return (int) readLong;
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                long readLong2 = readLong();
                if (readLong2 < SieveCacheKt.NodeMetaAndPreviousMask || readLong2 > SieveCacheKt.NodeLinkMask) {
                    throw overflowI64(readLong2);
                }
                return (int) readLong2;
            default:
                throw unexpected("Integer", readByte);
        }
    }

    public long unpackLong() throws IOException {
        byte readByte = readByte();
        if (MessagePack.Code.isFixInt(readByte)) {
            return readByte;
        }
        switch (readByte) {
            case -52:
                return readByte() & 255;
            case -51:
                return readShort() & UShort.MAX_VALUE;
            case -50:
                int readInt = readInt();
                return readInt < 0 ? (readInt & Integer.MAX_VALUE) + 2147483648L : readInt;
            case -49:
                long readLong = readLong();
                if (readLong >= 0) {
                    return readLong;
                }
                throw overflowU64(readLong);
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                return readLong();
            default:
                throw unexpected("Integer", readByte);
        }
    }

    public BigInteger unpackBigInteger() throws IOException {
        byte readByte = readByte();
        if (MessagePack.Code.isFixInt(readByte)) {
            return BigInteger.valueOf(readByte);
        }
        switch (readByte) {
            case -52:
                return BigInteger.valueOf(readByte() & 255);
            case -51:
                return BigInteger.valueOf(readShort() & UShort.MAX_VALUE);
            case -50:
                int readInt = readInt();
                if (readInt < 0) {
                    return BigInteger.valueOf((readInt & Integer.MAX_VALUE) + 2147483648L);
                }
                return BigInteger.valueOf(readInt);
            case -49:
                long readLong = readLong();
                if (readLong < 0) {
                    return BigInteger.valueOf(readLong - Long.MIN_VALUE).setBit(63);
                }
                return BigInteger.valueOf(readLong);
            case -48:
                return BigInteger.valueOf(readByte());
            case -47:
                return BigInteger.valueOf(readShort());
            case -46:
                return BigInteger.valueOf(readInt());
            case -45:
                return BigInteger.valueOf(readLong());
            default:
                throw unexpected("Integer", readByte);
        }
    }

    public float unpackFloat() throws IOException {
        byte readByte = readByte();
        if (readByte == -54) {
            return readFloat();
        }
        if (readByte == -53) {
            return (float) readDouble();
        }
        throw unexpected("Float", readByte);
    }

    public double unpackDouble() throws IOException {
        byte readByte = readByte();
        if (readByte == -54) {
            return readFloat();
        }
        if (readByte == -53) {
            return readDouble();
        }
        throw unexpected("Float", readByte);
    }

    private void resetDecoder() {
        CharsetDecoder charsetDecoder = this.decoder;
        if (charsetDecoder == null) {
            this.decodeBuffer = CharBuffer.allocate(this.stringDecoderBufferSize);
            this.decoder = MessagePack.UTF8.newDecoder().onMalformedInput(this.actionOnMalformedString).onUnmappableCharacter(this.actionOnUnmappableString);
        } else {
            charsetDecoder.reset();
        }
        StringBuilder sb = this.decodeStringBuffer;
        if (sb == null) {
            this.decodeStringBuffer = new StringBuilder();
        } else {
            sb.setLength(0);
        }
    }

    public String unpackString() throws IOException {
        int remaining;
        int unpackRawStringHeader = unpackRawStringHeader();
        if (unpackRawStringHeader == 0) {
            return "";
        }
        if (unpackRawStringHeader > this.stringSizeLimit) {
            throw new MessageSizeException(String.format("cannot unpack a String of size larger than %,d: %,d", Integer.valueOf(this.stringSizeLimit), Integer.valueOf(unpackRawStringHeader)), unpackRawStringHeader);
        }
        resetDecoder();
        if (this.buffer.size() - this.position >= unpackRawStringHeader) {
            return decodeStringFastPath(unpackRawStringHeader);
        }
        while (true) {
            if (unpackRawStringHeader <= 0) {
                break;
            }
            try {
                int size = this.buffer.size();
                int i = this.position;
                int i2 = size - i;
                if (i2 >= unpackRawStringHeader) {
                    this.decodeStringBuffer.append(decodeStringFastPath(unpackRawStringHeader));
                    break;
                }
                if (i2 == 0) {
                    nextBuffer();
                } else {
                    ByteBuffer sliceAsByteBuffer = this.buffer.sliceAsByteBuffer(i, i2);
                    int position = sliceAsByteBuffer.position();
                    this.decodeBuffer.clear();
                    CoderResult decode = this.decoder.decode(sliceAsByteBuffer, this.decodeBuffer, false);
                    int position2 = sliceAsByteBuffer.position() - position;
                    this.position += position2;
                    unpackRawStringHeader -= position2;
                    this.decodeStringBuffer.append(this.decodeBuffer.flip());
                    if (decode.isError()) {
                        handleCoderError(decode);
                    }
                    if (decode.isUnderflow() && position2 < i2) {
                        ByteBuffer allocate = ByteBuffer.allocate(utf8MultibyteCharacterSize(this.buffer.getByte(this.position)));
                        MessageBuffer messageBuffer = this.buffer;
                        messageBuffer.getBytes(this.position, messageBuffer.size() - this.position, allocate);
                        while (true) {
                            nextBuffer();
                            remaining = allocate.remaining();
                            if (this.buffer.size() >= remaining) {
                                break;
                            }
                            MessageBuffer messageBuffer2 = this.buffer;
                            messageBuffer2.getBytes(0, messageBuffer2.size(), allocate);
                            this.position = this.buffer.size();
                        }
                        this.buffer.getBytes(0, remaining, allocate);
                        this.position = remaining;
                        allocate.position(0);
                        this.decodeBuffer.clear();
                        CoderResult decode2 = this.decoder.decode(allocate, this.decodeBuffer, false);
                        if (decode2.isError()) {
                            handleCoderError(decode2);
                        }
                        if (decode2.isOverflow() || (decode2.isUnderflow() && allocate.position() < allocate.limit())) {
                            try {
                                decode2.throwException();
                                throw new MessageFormatException("Unexpected UTF-8 multibyte sequence");
                            } catch (Exception e) {
                                throw new MessageFormatException("Unexpected UTF-8 multibyte sequence", e);
                            }
                        }
                        unpackRawStringHeader -= allocate.limit();
                        this.decodeStringBuffer.append(this.decodeBuffer.flip());
                    }
                }
            } catch (CharacterCodingException e2) {
                throw new MessageStringCodingException(e2);
            }
        }
        return this.decodeStringBuffer.toString();
    }

    private void handleCoderError(CoderResult coderResult) throws CharacterCodingException {
        if ((coderResult.isMalformed() && this.actionOnMalformedString == CodingErrorAction.REPORT) || (coderResult.isUnmappable() && this.actionOnUnmappableString == CodingErrorAction.REPORT)) {
            coderResult.throwException();
        }
    }

    private String decodeStringFastPath(int i) {
        if (this.actionOnMalformedString == CodingErrorAction.REPLACE && this.actionOnUnmappableString == CodingErrorAction.REPLACE && this.buffer.hasArray()) {
            String str = new String(this.buffer.array(), this.buffer.arrayOffset() + this.position, i, MessagePack.UTF8);
            this.position += i;
            return str;
        }
        try {
            CharBuffer decode = this.decoder.decode(this.buffer.sliceAsByteBuffer(this.position, i));
            this.position += i;
            return decode.toString();
        } catch (CharacterCodingException e) {
            throw new MessageStringCodingException(e);
        }
    }

    public int unpackArrayHeader() throws IOException {
        byte readByte = readByte();
        if (MessagePack.Code.isFixedArray(readByte)) {
            return readByte & Ascii.SI;
        }
        if (readByte == -36) {
            return readNextLength16();
        }
        if (readByte == -35) {
            return readNextLength32();
        }
        throw unexpected("Array", readByte);
    }

    public int unpackMapHeader() throws IOException {
        byte readByte = readByte();
        if (MessagePack.Code.isFixedMap(readByte)) {
            return readByte & Ascii.SI;
        }
        if (readByte == -34) {
            return readNextLength16();
        }
        if (readByte == -33) {
            return readNextLength32();
        }
        throw unexpected("Map", readByte);
    }

    public ExtensionTypeHeader unpackExtensionTypeHeader() throws IOException {
        byte readByte = readByte();
        switch (readByte) {
            case -57:
                MessageBuffer prepareNumberBuffer = prepareNumberBuffer(2);
                return new ExtensionTypeHeader(prepareNumberBuffer.getByte(this.nextReadPosition + 1), prepareNumberBuffer.getByte(this.nextReadPosition) & 255);
            case -56:
                MessageBuffer prepareNumberBuffer2 = prepareNumberBuffer(3);
                return new ExtensionTypeHeader(prepareNumberBuffer2.getByte(this.nextReadPosition + 2), prepareNumberBuffer2.getShort(this.nextReadPosition) & UShort.MAX_VALUE);
            case -55:
                MessageBuffer prepareNumberBuffer3 = prepareNumberBuffer(5);
                int i = prepareNumberBuffer3.getInt(this.nextReadPosition);
                if (i < 0) {
                    throw overflowU32Size(i);
                }
                return new ExtensionTypeHeader(prepareNumberBuffer3.getByte(this.nextReadPosition + 4), i);
            default:
                switch (readByte) {
                    case -44:
                        return new ExtensionTypeHeader(readByte(), 1);
                    case -43:
                        return new ExtensionTypeHeader(readByte(), 2);
                    case -42:
                        return new ExtensionTypeHeader(readByte(), 4);
                    case -41:
                        return new ExtensionTypeHeader(readByte(), 8);
                    case -40:
                        return new ExtensionTypeHeader(readByte(), 16);
                    default:
                        throw unexpected("Ext", readByte);
                }
        }
    }

    private int tryReadStringHeader(byte b) throws IOException {
        switch (b) {
            case -39:
                return readNextLength8();
            case -38:
                return readNextLength16();
            case -37:
                return readNextLength32();
            default:
                return -1;
        }
    }

    private int tryReadBinaryHeader(byte b) throws IOException {
        switch (b) {
            case -60:
                return readNextLength8();
            case -59:
                return readNextLength16();
            case -58:
                return readNextLength32();
            default:
                return -1;
        }
    }

    public int unpackRawStringHeader() throws IOException {
        int tryReadBinaryHeader;
        byte readByte = readByte();
        if (MessagePack.Code.isFixedRaw(readByte)) {
            return readByte & Ascii.US;
        }
        int tryReadStringHeader = tryReadStringHeader(readByte);
        if (tryReadStringHeader >= 0) {
            return tryReadStringHeader;
        }
        if (!this.allowReadingBinaryAsString || (tryReadBinaryHeader = tryReadBinaryHeader(readByte)) < 0) {
            throw unexpected("String", readByte);
        }
        return tryReadBinaryHeader;
    }

    public int unpackBinaryHeader() throws IOException {
        int tryReadStringHeader;
        byte readByte = readByte();
        if (MessagePack.Code.isFixedRaw(readByte)) {
            return readByte & Ascii.US;
        }
        int tryReadBinaryHeader = tryReadBinaryHeader(readByte);
        if (tryReadBinaryHeader >= 0) {
            return tryReadBinaryHeader;
        }
        if (!this.allowReadingStringAsBinary || (tryReadStringHeader = tryReadStringHeader(readByte)) < 0) {
            throw unexpected("Binary", readByte);
        }
        return tryReadStringHeader;
    }

    private void skipPayload(int i) throws IOException {
        while (true) {
            int size = this.buffer.size();
            int i2 = this.position;
            int i3 = size - i2;
            if (i3 >= i) {
                this.position = i2 + i;
                return;
            } else {
                this.position = i2 + i3;
                i -= i3;
                nextBuffer();
            }
        }
    }

    public void readPayload(ByteBuffer byteBuffer) throws IOException {
        while (true) {
            int remaining = byteBuffer.remaining();
            int size = this.buffer.size();
            int i = this.position;
            int i2 = size - i;
            if (i2 >= remaining) {
                this.buffer.getBytes(i, remaining, byteBuffer);
                this.position += remaining;
                return;
            } else {
                this.buffer.getBytes(i, i2, byteBuffer);
                this.position += i2;
                nextBuffer();
            }
        }
    }

    public void readPayload(byte[] bArr) throws IOException {
        readPayload(bArr, 0, bArr.length);
    }

    public byte[] readPayload(int i) throws IOException {
        byte[] bArr = new byte[i];
        readPayload(bArr);
        return bArr;
    }

    public void readPayload(byte[] bArr, int i, int i2) throws IOException {
        readPayload(ByteBuffer.wrap(bArr, i, i2));
    }

    public MessageBuffer readPayloadAsReference(int i) throws IOException {
        int size = this.buffer.size();
        int i2 = this.position;
        if (size - i2 >= i) {
            MessageBuffer slice = this.buffer.slice(i2, i);
            this.position += i;
            return slice;
        }
        MessageBuffer allocate = MessageBuffer.allocate(i);
        readPayload(allocate.sliceAsByteBuffer());
        return allocate;
    }

    private int readNextLength8() throws IOException {
        return readByte() & 255;
    }

    private int readNextLength16() throws IOException {
        return readShort() & UShort.MAX_VALUE;
    }

    private int readNextLength32() throws IOException {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        throw overflowU32Size(readInt);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.buffer = EMPTY_BUFFER;
        this.position = 0;
        this.in.close();
    }

    private static MessageIntegerOverflowException overflowU8(byte b) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(b & 255));
    }

    private static MessageIntegerOverflowException overflowU16(short s) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(s & UShort.MAX_VALUE));
    }

    private static MessageIntegerOverflowException overflowU32(int i) {
        return new MessageIntegerOverflowException(BigInteger.valueOf((i & Integer.MAX_VALUE) + 2147483648L));
    }

    private static MessageIntegerOverflowException overflowU64(long j) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(j - Long.MIN_VALUE).setBit(63));
    }

    private static MessageIntegerOverflowException overflowI16(short s) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(s));
    }

    private static MessageIntegerOverflowException overflowI32(int i) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(i));
    }

    private static MessageIntegerOverflowException overflowI64(long j) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(j));
    }

    private static MessageSizeException overflowU32Size(int i) {
        return new MessageSizeException((i & Integer.MAX_VALUE) + 2147483648L);
    }
}
