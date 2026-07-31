package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.xo, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5811xo extends MessageNano {
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static volatile C5811xo[] i;
    public byte[] a;
    public int b;
    public C5837yo c;
    public C5863zo d;

    public C5811xo() {
        a();
    }

    public static C5811xo[] b() {
        if (i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (i == null) {
                        i = new C5811xo[0];
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public final C5811xo a() {
        this.a = WireFormatNano.EMPTY_BYTES;
        this.b = 0;
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.b) + CodedOutputByteBufferNano.computeBytesSize(1, this.a) + super.computeSerializedSize();
        C5837yo c5837yo = this.c;
        if (c5837yo != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c5837yo);
        }
        C5863zo c5863zo = this.d;
        return c5863zo != null ? computeInt32Size + CodedOutputByteBufferNano.computeMessageSize(4, c5863zo) : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.a);
        codedOutputByteBufferNano.writeInt32(2, this.b);
        C5837yo c5837yo = this.c;
        if (c5837yo != null) {
            codedOutputByteBufferNano.writeMessage(3, c5837yo);
        }
        C5863zo c5863zo = this.d;
        if (c5863zo != null) {
            codedOutputByteBufferNano.writeMessage(4, c5863zo);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5811xo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.b = readInt32;
                }
            } else if (readTag == 26) {
                if (this.c == null) {
                    this.c = new C5837yo();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.d == null) {
                    this.d = new C5863zo();
                }
                codedInputByteBufferNano.readMessage(this.d);
            }
        }
    }

    public static C5811xo b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5811xo().mergeFrom(codedInputByteBufferNano);
    }

    public static C5811xo a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5811xo) MessageNano.mergeFrom(new C5811xo(), bArr);
    }
}
