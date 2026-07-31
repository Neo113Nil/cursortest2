package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class O extends MessageNano {
    public static volatile O[] c;
    public boolean a;
    public N b;

    public O() {
        a();
    }

    public static O[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new O[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final O a() {
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
        N n = this.b;
        return n != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, n) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.a;
        if (!z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        N n = this.b;
        if (n != null) {
            codedOutputByteBufferNano.writeMessage(2, n);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                    this.b = new N();
                }
                codedInputByteBufferNano.readMessage(this.b);
            }
        }
    }

    public static O b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new O().mergeFrom(codedInputByteBufferNano);
    }

    public static O a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (O) MessageNano.mergeFrom(new O(), bArr);
    }
}
