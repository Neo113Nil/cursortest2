package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.v8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5743v8 extends MessageNano {
    public static volatile C5743v8[] c;
    public byte[] a;
    public C5847z8 b;

    public C5743v8() {
        a();
    }

    public static C5743v8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C5743v8[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final C5743v8 a() {
        this.a = WireFormatNano.EMPTY_BYTES;
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.a);
        }
        C5847z8 c5847z8 = this.b;
        return c5847z8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c5847z8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        C5847z8 c5847z8 = this.b;
        if (c5847z8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5847z8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5743v8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.b == null) {
                    this.b = new C5847z8();
                }
                codedInputByteBufferNano.readMessage(this.b);
            }
        }
    }

    public static C5743v8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5743v8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5743v8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5743v8) MessageNano.mergeFrom(new C5743v8(), bArr);
    }
}
