package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.o6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5559o6 extends MessageNano {
    public static volatile C5559o6[] c;
    public int a;
    public String b;

    public C5559o6() {
        a();
    }

    public static C5559o6[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C5559o6[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final C5559o6 a() {
        this.a = 0;
        this.b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.a;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        return !this.b.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.a;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5559o6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 3) {
                    this.a = readInt32;
                }
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C5559o6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5559o6().mergeFrom(codedInputByteBufferNano);
    }

    public static C5559o6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5559o6) MessageNano.mergeFrom(new C5559o6(), bArr);
    }
}
