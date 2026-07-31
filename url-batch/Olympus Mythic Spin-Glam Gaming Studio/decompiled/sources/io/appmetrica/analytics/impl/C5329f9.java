package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.f9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5329f9 extends MessageNano {
    public static volatile C5329f9[] b;
    public C5303e9[] a;

    public C5329f9() {
        a();
    }

    public static C5329f9[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new C5329f9[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final C5329f9 a() {
        this.a = C5303e9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C5303e9[] c5303e9Arr = this.a;
        if (c5303e9Arr != null && c5303e9Arr.length > 0) {
            int i = 0;
            while (true) {
                C5303e9[] c5303e9Arr2 = this.a;
                if (i >= c5303e9Arr2.length) {
                    break;
                }
                C5303e9 c5303e9 = c5303e9Arr2[i];
                if (c5303e9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c5303e9) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5303e9[] c5303e9Arr = this.a;
        if (c5303e9Arr != null && c5303e9Arr.length > 0) {
            int i = 0;
            while (true) {
                C5303e9[] c5303e9Arr2 = this.a;
                if (i >= c5303e9Arr2.length) {
                    break;
                }
                C5303e9 c5303e9 = c5303e9Arr2[i];
                if (c5303e9 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5303e9);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5329f9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C5303e9[] c5303e9Arr = this.a;
                int length = c5303e9Arr == null ? 0 : c5303e9Arr.length;
                int i = repeatedFieldArrayLength + length;
                C5303e9[] c5303e9Arr2 = new C5303e9[i];
                if (length != 0) {
                    System.arraycopy(c5303e9Arr, 0, c5303e9Arr2, 0, length);
                }
                while (length < i - 1) {
                    C5303e9 c5303e9 = new C5303e9();
                    c5303e9Arr2[length] = c5303e9;
                    codedInputByteBufferNano.readMessage(c5303e9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5303e9 c5303e92 = new C5303e9();
                c5303e9Arr2[length] = c5303e92;
                codedInputByteBufferNano.readMessage(c5303e92);
                this.a = c5303e9Arr2;
            }
        }
    }

    public static C5329f9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5329f9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5329f9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5329f9) MessageNano.mergeFrom(new C5329f9(), bArr);
    }
}
