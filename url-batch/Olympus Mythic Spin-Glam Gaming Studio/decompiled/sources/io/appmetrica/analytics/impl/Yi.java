package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes12.dex */
public final class Yi extends MessageNano {
    public static volatile Yi[] d;
    public boolean a;
    public Xi b;
    public Wi c;

    public Yi() {
        a();
    }

    public static Yi[] b() {
        if (d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (d == null) {
                        d = new Yi[0];
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final Yi a() {
        this.a = false;
        this.b = null;
        this.c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.a;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        Xi xi = this.b;
        if (xi != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, xi);
        }
        Wi wi = this.c;
        return wi != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, wi) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        Xi xi = this.b;
        if (xi != null) {
            codedOutputByteBufferNano.writeMessage(2, xi);
        }
        Wi wi = this.c;
        if (wi != null) {
            codedOutputByteBufferNano.writeMessage(3, wi);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Yi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readBool();
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new Xi();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.c == null) {
                    this.c = new Wi();
                }
                codedInputByteBufferNano.readMessage(this.c);
            }
        }
    }

    public static Yi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Yi().mergeFrom(codedInputByteBufferNano);
    }

    public static Yi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Yi) MessageNano.mergeFrom(new Yi(), bArr);
    }
}
