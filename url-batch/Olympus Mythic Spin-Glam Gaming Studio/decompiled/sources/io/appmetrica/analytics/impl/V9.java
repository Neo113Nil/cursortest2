package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class V9 extends MessageNano {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = 6;
    public static volatile V9[] j;
    public int a;
    public byte[] b;

    public V9() {
        a();
    }

    public static V9[] b() {
        if (j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (j == null) {
                        j = new V9[0];
                    }
                } finally {
                }
            }
        }
        return j;
    }

    public final V9 a() {
        this.a = 0;
        this.b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.a;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        return !Arrays.equals(this.b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i2 = this.a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        if (!Arrays.equals(this.b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                switch (readInt32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        this.a = readInt32;
                        break;
                }
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static V9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new V9().mergeFrom(codedInputByteBufferNano);
    }

    public static V9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (V9) MessageNano.mergeFrom(new V9(), bArr);
    }
}
