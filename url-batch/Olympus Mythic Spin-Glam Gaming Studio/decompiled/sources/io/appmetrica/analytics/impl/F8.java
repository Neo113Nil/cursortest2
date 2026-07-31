package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class F8 extends MessageNano {
    public static volatile F8[] c;
    public C5743v8 a;
    public C5743v8[] b;

    public F8() {
        a();
    }

    public static F8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new F8[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final F8 a() {
        this.a = null;
        this.b = C5743v8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C5743v8 c5743v8 = this.a;
        if (c5743v8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5743v8);
        }
        C5743v8[] c5743v8Arr = this.b;
        if (c5743v8Arr != null && c5743v8Arr.length > 0) {
            int i = 0;
            while (true) {
                C5743v8[] c5743v8Arr2 = this.b;
                if (i >= c5743v8Arr2.length) {
                    break;
                }
                C5743v8 c5743v82 = c5743v8Arr2[i];
                if (c5743v82 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c5743v82) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5743v8 c5743v8 = this.a;
        if (c5743v8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5743v8);
        }
        C5743v8[] c5743v8Arr = this.b;
        if (c5743v8Arr != null && c5743v8Arr.length > 0) {
            int i = 0;
            while (true) {
                C5743v8[] c5743v8Arr2 = this.b;
                if (i >= c5743v8Arr2.length) {
                    break;
                }
                C5743v8 c5743v82 = c5743v8Arr2[i];
                if (c5743v82 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c5743v82);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new C5743v8();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C5743v8[] c5743v8Arr = this.b;
                int length = c5743v8Arr == null ? 0 : c5743v8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C5743v8[] c5743v8Arr2 = new C5743v8[i];
                if (length != 0) {
                    System.arraycopy(c5743v8Arr, 0, c5743v8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C5743v8 c5743v8 = new C5743v8();
                    c5743v8Arr2[length] = c5743v8;
                    codedInputByteBufferNano.readMessage(c5743v8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5743v8 c5743v82 = new C5743v8();
                c5743v8Arr2[length] = c5743v82;
                codedInputByteBufferNano.readMessage(c5743v82);
                this.b = c5743v8Arr2;
            }
        }
    }

    public static F8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new F8().mergeFrom(codedInputByteBufferNano);
    }

    public static F8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (F8) MessageNano.mergeFrom(new F8(), bArr);
    }
}
