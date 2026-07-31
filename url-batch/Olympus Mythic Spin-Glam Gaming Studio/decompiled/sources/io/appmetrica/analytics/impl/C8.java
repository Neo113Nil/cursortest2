package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class C8 extends MessageNano {
    public static volatile C8[] b;
    public A8 a;

    public C8() {
        a();
    }

    public static C8[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new C8[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final C8 a() {
        this.a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        A8 a8 = this.a;
        return a8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, a8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        A8 a8 = this.a;
        if (a8 != null) {
            codedOutputByteBufferNano.writeMessage(1, a8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.a == null) {
                    this.a = new A8();
                }
                codedInputByteBufferNano.readMessage(this.a);
            }
        }
    }

    public static C8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C8().mergeFrom(codedInputByteBufferNano);
    }

    public static C8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C8) MessageNano.mergeFrom(new C8(), bArr);
    }
}
