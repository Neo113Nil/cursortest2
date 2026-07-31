package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class L8 extends MessageNano {
    public static volatile L8[] c;
    public G8 a;
    public I8 b;

    public L8() {
        a();
    }

    public static L8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new L8[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final L8 a() {
        this.a = null;
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        G8 g8 = this.a;
        if (g8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, g8);
        }
        I8 i8 = this.b;
        return i8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, i8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        G8 g8 = this.a;
        if (g8 != null) {
            codedOutputByteBufferNano.writeMessage(1, g8);
        }
        I8 i8 = this.b;
        if (i8 != null) {
            codedOutputByteBufferNano.writeMessage(2, i8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final L8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new G8();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.b == null) {
                    this.b = new I8();
                }
                codedInputByteBufferNano.readMessage(this.b);
            }
        }
    }

    public static L8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new L8().mergeFrom(codedInputByteBufferNano);
    }

    public static L8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (L8) MessageNano.mergeFrom(new L8(), bArr);
    }
}
