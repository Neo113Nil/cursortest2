package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.cl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5264cl extends MessageNano {
    public static volatile C5264cl[] b;
    public C5290dl[] a;

    public C5264cl() {
        a();
    }

    public static C5264cl[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new C5264cl[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final C5264cl a() {
        this.a = C5290dl.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C5290dl[] c5290dlArr = this.a;
        if (c5290dlArr != null && c5290dlArr.length > 0) {
            int i = 0;
            while (true) {
                C5290dl[] c5290dlArr2 = this.a;
                if (i >= c5290dlArr2.length) {
                    break;
                }
                C5290dl c5290dl = c5290dlArr2[i];
                if (c5290dl != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c5290dl) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5290dl[] c5290dlArr = this.a;
        if (c5290dlArr != null && c5290dlArr.length > 0) {
            int i = 0;
            while (true) {
                C5290dl[] c5290dlArr2 = this.a;
                if (i >= c5290dlArr2.length) {
                    break;
                }
                C5290dl c5290dl = c5290dlArr2[i];
                if (c5290dl != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5290dl);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5264cl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C5290dl[] c5290dlArr = this.a;
                int length = c5290dlArr == null ? 0 : c5290dlArr.length;
                int i = repeatedFieldArrayLength + length;
                C5290dl[] c5290dlArr2 = new C5290dl[i];
                if (length != 0) {
                    System.arraycopy(c5290dlArr, 0, c5290dlArr2, 0, length);
                }
                while (length < i - 1) {
                    C5290dl c5290dl = new C5290dl();
                    c5290dlArr2[length] = c5290dl;
                    codedInputByteBufferNano.readMessage(c5290dl);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5290dl c5290dl2 = new C5290dl();
                c5290dlArr2[length] = c5290dl2;
                codedInputByteBufferNano.readMessage(c5290dl2);
                this.a = c5290dlArr2;
            }
        }
    }

    public static C5264cl b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5264cl().mergeFrom(codedInputByteBufferNano);
    }

    public static C5264cl a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5264cl) MessageNano.mergeFrom(new C5264cl(), bArr);
    }
}
