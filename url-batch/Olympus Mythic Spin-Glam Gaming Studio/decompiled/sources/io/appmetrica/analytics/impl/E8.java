package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class E8 extends MessageNano {
    public static volatile E8[] c;
    public D8[] a;
    public int b;

    public E8() {
        a();
    }

    public static E8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new E8[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final E8 a() {
        this.a = D8.b();
        this.b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        D8[] d8Arr = this.a;
        if (d8Arr != null && d8Arr.length > 0) {
            int i = 0;
            while (true) {
                D8[] d8Arr2 = this.a;
                if (i >= d8Arr2.length) {
                    break;
                }
                D8 d8 = d8Arr2[i];
                if (d8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, d8) + computeSerializedSize;
                }
                i++;
            }
        }
        int i2 = this.b;
        return i2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(2, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        D8[] d8Arr = this.a;
        if (d8Arr != null && d8Arr.length > 0) {
            int i = 0;
            while (true) {
                D8[] d8Arr2 = this.a;
                if (i >= d8Arr2.length) {
                    break;
                }
                D8 d8 = d8Arr2[i];
                if (d8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, d8);
                }
                i++;
            }
        }
        int i2 = this.b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                D8[] d8Arr = this.a;
                int length = d8Arr == null ? 0 : d8Arr.length;
                int i = repeatedFieldArrayLength + length;
                D8[] d8Arr2 = new D8[i];
                if (length != 0) {
                    System.arraycopy(d8Arr, 0, d8Arr2, 0, length);
                }
                while (length < i - 1) {
                    D8 d8 = new D8();
                    d8Arr2[length] = d8;
                    codedInputByteBufferNano.readMessage(d8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                D8 d82 = new D8();
                d8Arr2[length] = d82;
                codedInputByteBufferNano.readMessage(d82);
                this.a = d8Arr2;
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.b = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    public static E8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new E8().mergeFrom(codedInputByteBufferNano);
    }

    public static E8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (E8) MessageNano.mergeFrom(new E8(), bArr);
    }
}
