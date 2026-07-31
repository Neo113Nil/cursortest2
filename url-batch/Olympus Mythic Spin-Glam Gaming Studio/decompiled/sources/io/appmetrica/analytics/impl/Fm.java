package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class Fm extends MessageNano {
    public static volatile Fm[] b;
    public long a;

    public Fm() {
        a();
    }

    public static Fm[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new Fm[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final Fm a() {
        this.a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.a;
        return j != 10000 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.a;
        if (j != 10000) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Fm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static Fm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Fm().mergeFrom(codedInputByteBufferNano);
    }

    public static Fm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Fm) MessageNano.mergeFrom(new Fm(), bArr);
    }
}
