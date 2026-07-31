package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.z9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5848z9 extends MessageNano {
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static volatile C5848z9[] g;
    public C9 a;
    public String b;
    public int c;

    public C5848z9() {
        a();
    }

    public static C5848z9[] b() {
        if (g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (g == null) {
                        g = new C5848z9[0];
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public final C5848z9 a() {
        this.a = null;
        this.b = "";
        this.c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C9 c9 = this.a;
        if (c9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c9);
        }
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.b) + computeSerializedSize;
        int i = this.c;
        return i != 0 ? computeStringSize + CodedOutputByteBufferNano.computeInt32Size(5, i) : computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9 c9 = this.a;
        if (c9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c9);
        }
        codedOutputByteBufferNano.writeString(2, this.b);
        int i = this.c;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(5, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5848z9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new C9();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readString();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.c = readInt32;
                }
            }
        }
    }

    public static C5848z9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5848z9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5848z9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5848z9) MessageNano.mergeFrom(new C5848z9(), bArr);
    }
}
