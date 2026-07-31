package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes12.dex */
public final class t extends MessageNano {
    public static volatile t[] c;
    public boolean a;
    public s b;

    public t() {
        a();
    }

    public static t[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new t[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final t a() {
        this.a = true;
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.a;
        if (!z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        s sVar = this.b;
        return sVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, sVar) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.a;
        if (!z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        s sVar = this.b;
        if (sVar != null) {
            codedOutputByteBufferNano.writeMessage(2, sVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readBool();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.b == null) {
                    this.b = new s();
                }
                codedInputByteBufferNano.readMessage(this.b);
            }
        }
    }

    public static t b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new t().mergeFrom(codedInputByteBufferNano);
    }

    public static t a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (t) MessageNano.mergeFrom(new t(), bArr);
    }
}
