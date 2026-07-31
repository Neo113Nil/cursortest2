package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes13.dex */
public final class Vi extends MessageNano {
    public static volatile Vi[] c;
    public byte[] a;
    public byte[] b;

    public Vi() {
        a();
    }

    public static Vi[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new Vi[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final Vi a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.a = bArr;
        this.b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.a);
        }
        return !Arrays.equals(this.b, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        if (!Arrays.equals(this.b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Vi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static Vi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Vi().mergeFrom(codedInputByteBufferNano);
    }

    public static Vi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Vi) MessageNano.mergeFrom(new Vi(), bArr);
    }
}
