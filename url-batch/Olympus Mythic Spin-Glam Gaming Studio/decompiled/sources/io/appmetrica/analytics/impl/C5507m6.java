package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.m6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5507m6 extends MessageNano {
    public static volatile C5507m6[] b;
    public String a;

    public C5507m6() {
        a();
    }

    public static C5507m6[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new C5507m6[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final C5507m6 a() {
        this.a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(1, this.a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5507m6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.a = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C5507m6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5507m6().mergeFrom(codedInputByteBufferNano);
    }

    public static C5507m6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5507m6) MessageNano.mergeFrom(new C5507m6(), bArr);
    }
}
