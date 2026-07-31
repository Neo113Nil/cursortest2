package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.x8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5795x8 extends MessageNano {
    public static volatile C5795x8[] e;
    public G8 a;
    public I8 b;
    public C5847z8 c;
    public F8 d;

    public C5795x8() {
        a();
    }

    public static C5795x8[] b() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (e == null) {
                        e = new C5795x8[0];
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public final C5795x8 a() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        G8 g8 = this.a;
        if (g8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, g8);
        }
        I8 i8 = this.b;
        if (i8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, i8);
        }
        C5847z8 c5847z8 = this.c;
        if (c5847z8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c5847z8);
        }
        F8 f8 = this.d;
        return f8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, f8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        G8 g8 = this.a;
        if (g8 != null) {
            codedOutputByteBufferNano.writeMessage(1, g8);
        }
        I8 i8 = this.b;
        if (i8 != null) {
            codedOutputByteBufferNano.writeMessage(2, i8);
        }
        C5847z8 c5847z8 = this.c;
        if (c5847z8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5847z8);
        }
        F8 f8 = this.d;
        if (f8 != null) {
            codedOutputByteBufferNano.writeMessage(4, f8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5795x8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new G8();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new I8();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 26) {
                if (this.c == null) {
                    this.c = new C5847z8();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.d == null) {
                    this.d = new F8();
                }
                codedInputByteBufferNano.readMessage(this.d);
            }
        }
    }

    public static C5795x8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5795x8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5795x8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5795x8) MessageNano.mergeFrom(new C5795x8(), bArr);
    }
}
