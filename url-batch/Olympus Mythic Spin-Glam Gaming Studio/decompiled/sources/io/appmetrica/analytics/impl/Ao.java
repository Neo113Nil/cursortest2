package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class Ao extends MessageNano {
    public static volatile Ao[] b;
    public C5811xo[] a;

    public Ao() {
        a();
    }

    public static Ao[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new Ao[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final Ao a() {
        this.a = C5811xo.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C5811xo[] c5811xoArr = this.a;
        if (c5811xoArr != null && c5811xoArr.length > 0) {
            int i = 0;
            while (true) {
                C5811xo[] c5811xoArr2 = this.a;
                if (i >= c5811xoArr2.length) {
                    break;
                }
                C5811xo c5811xo = c5811xoArr2[i];
                if (c5811xo != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c5811xo) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5811xo[] c5811xoArr = this.a;
        if (c5811xoArr != null && c5811xoArr.length > 0) {
            int i = 0;
            while (true) {
                C5811xo[] c5811xoArr2 = this.a;
                if (i >= c5811xoArr2.length) {
                    break;
                }
                C5811xo c5811xo = c5811xoArr2[i];
                if (c5811xo != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5811xo);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ao mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C5811xo[] c5811xoArr = this.a;
                int length = c5811xoArr == null ? 0 : c5811xoArr.length;
                int i = repeatedFieldArrayLength + length;
                C5811xo[] c5811xoArr2 = new C5811xo[i];
                if (length != 0) {
                    System.arraycopy(c5811xoArr, 0, c5811xoArr2, 0, length);
                }
                while (length < i - 1) {
                    C5811xo c5811xo = new C5811xo();
                    c5811xoArr2[length] = c5811xo;
                    codedInputByteBufferNano.readMessage(c5811xo);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5811xo c5811xo2 = new C5811xo();
                c5811xoArr2[length] = c5811xo2;
                codedInputByteBufferNano.readMessage(c5811xo2);
                this.a = c5811xoArr2;
            }
        }
    }

    public static Ao b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ao().mergeFrom(codedInputByteBufferNano);
    }

    public static Ao a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ao) MessageNano.mergeFrom(new Ao(), bArr);
    }
}
