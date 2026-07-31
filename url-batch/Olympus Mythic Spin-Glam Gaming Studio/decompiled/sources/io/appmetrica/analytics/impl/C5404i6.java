package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.i6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5404i6 extends MessageNano {
    public static volatile C5404i6[] d;
    public C5378h6 a;
    public String b;
    public int c;

    public C5404i6() {
        a();
    }

    public static C5404i6[] b() {
        if (d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (d == null) {
                        d = new C5404i6[0];
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final C5404i6 a() {
        this.a = null;
        this.b = "";
        this.c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C5378h6 c5378h6 = this.a;
        if (c5378h6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5378h6);
        }
        if (!this.b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        int i = this.c;
        return i != -1 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5378h6 c5378h6 = this.a;
        if (c5378h6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5378h6);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        int i = this.c;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5404i6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new C5378h6();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.c = readInt32;
                }
            }
        }
    }

    public static C5404i6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5404i6().mergeFrom(codedInputByteBufferNano);
    }

    public static C5404i6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5404i6) MessageNano.mergeFrom(new C5404i6(), bArr);
    }
}
