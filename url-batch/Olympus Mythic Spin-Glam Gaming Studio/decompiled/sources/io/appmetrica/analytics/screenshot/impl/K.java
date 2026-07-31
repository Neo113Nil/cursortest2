package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class K extends MessageNano {
    public static volatile K[] b;
    public boolean a;

    public K() {
        a();
    }

    public static K[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new K[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final K a() {
        this.a = true;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.a;
        return !z ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(1, z) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.a;
        if (!z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.a = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static K b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new K().mergeFrom(codedInputByteBufferNano);
    }

    public static K a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (K) MessageNano.mergeFrom(new K(), bArr);
    }
}
