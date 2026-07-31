package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class A9 extends MessageNano {
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 4;
    public static final int i = 5;
    public static final int j = 6;
    public static final int k = 7;
    public static final int l = 8;
    public static final int m = 9;
    public static final int n = 10;
    public static final int o = 11;
    public static final int p = 12;
    public static volatile A9[] q;
    public long a;
    public C5848z9 b;
    public C5822y9[] c;

    public A9() {
        a();
    }

    public static A9[] b() {
        if (q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (q == null) {
                        q = new A9[0];
                    }
                } finally {
                }
            }
        }
        return q;
    }

    public final A9 a() {
        this.a = 0L;
        this.b = null;
        this.c = C5822y9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.a) + super.computeSerializedSize();
        C5848z9 c5848z9 = this.b;
        if (c5848z9 != null) {
            computeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c5848z9);
        }
        C5822y9[] c5822y9Arr = this.c;
        if (c5822y9Arr != null && c5822y9Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C5822y9[] c5822y9Arr2 = this.c;
                if (i2 >= c5822y9Arr2.length) {
                    break;
                }
                C5822y9 c5822y9 = c5822y9Arr2[i2];
                if (c5822y9 != null) {
                    computeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c5822y9) + computeUInt64Size;
                }
                i2++;
            }
        }
        return computeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.a);
        C5848z9 c5848z9 = this.b;
        if (c5848z9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5848z9);
        }
        C5822y9[] c5822y9Arr = this.c;
        if (c5822y9Arr != null && c5822y9Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C5822y9[] c5822y9Arr2 = this.c;
                if (i2 >= c5822y9Arr2.length) {
                    break;
                }
                C5822y9 c5822y9 = c5822y9Arr2[i2];
                if (c5822y9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c5822y9);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new C5848z9();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C5822y9[] c5822y9Arr = this.c;
                int length = c5822y9Arr == null ? 0 : c5822y9Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C5822y9[] c5822y9Arr2 = new C5822y9[i2];
                if (length != 0) {
                    System.arraycopy(c5822y9Arr, 0, c5822y9Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C5822y9 c5822y9 = new C5822y9();
                    c5822y9Arr2[length] = c5822y9;
                    codedInputByteBufferNano.readMessage(c5822y9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5822y9 c5822y92 = new C5822y9();
                c5822y9Arr2[length] = c5822y92;
                codedInputByteBufferNano.readMessage(c5822y92);
                this.c = c5822y9Arr2;
            }
        }
    }

    public static A9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new A9().mergeFrom(codedInputByteBufferNano);
    }

    public static A9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (A9) MessageNano.mergeFrom(new A9(), bArr);
    }
}
