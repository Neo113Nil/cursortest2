package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class Dm extends MessageNano {
    public static volatile Dm[] c;
    public String a;
    public Cm b;

    public Dm() {
        a();
    }

    public static Dm[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new Dm[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final Dm a() {
        this.a = "";
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        Cm cm = this.b;
        return cm != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, cm) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        Cm cm = this.b;
        if (cm != null) {
            codedOutputByteBufferNano.writeMessage(2, cm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Dm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.b == null) {
                    this.b = new Cm();
                }
                codedInputByteBufferNano.readMessage(this.b);
            }
        }
    }

    public static Dm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Dm().mergeFrom(codedInputByteBufferNano);
    }

    public static Dm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Dm) MessageNano.mergeFrom(new Dm(), bArr);
    }
}
