package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.k6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5455k6 extends MessageNano {
    public static volatile C5455k6[] c;
    public byte[] a;
    public C5559o6 b;

    public C5455k6() {
        a();
    }

    public static C5455k6[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C5455k6[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final C5455k6 a() {
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
        C5559o6 c5559o6 = this.b;
        return c5559o6 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c5559o6) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        C5559o6 c5559o6 = this.b;
        if (c5559o6 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5559o6);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5455k6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                    this.b = new C5559o6();
                }
                codedInputByteBufferNano.readMessage(this.b);
            }
        }
    }

    public static C5455k6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5455k6().mergeFrom(codedInputByteBufferNano);
    }

    public static C5455k6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5455k6) MessageNano.mergeFrom(new C5455k6(), bArr);
    }
}
