package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class Hm extends MessageNano {
    public static volatile Hm[] b;
    public long a;

    public Hm() {
        a();
    }

    public static Hm[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new Hm[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final Hm a() {
        this.a = 864000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.a;
        return j != 864000000 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.a;
        if (j != 864000000) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Hm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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

    public static Hm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Hm().mergeFrom(codedInputByteBufferNano);
    }

    public static Hm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Hm) MessageNano.mergeFrom(new Hm(), bArr);
    }
}
