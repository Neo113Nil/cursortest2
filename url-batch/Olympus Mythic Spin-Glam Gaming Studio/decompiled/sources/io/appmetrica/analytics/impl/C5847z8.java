package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.z8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5847z8 extends MessageNano {
    public static volatile C5847z8[] c;
    public long a;
    public int b;

    public C5847z8() {
        a();
    }

    public static C5847z8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C5847z8[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final C5847z8 a() {
        this.a = 0L;
        this.b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.a;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        int i = this.b;
        return i != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.a;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        int i = this.b;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(2, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5847z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    public static C5847z8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5847z8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5847z8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5847z8) MessageNano.mergeFrom(new C5847z8(), bArr);
    }
}
