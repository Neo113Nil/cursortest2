package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.h6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5378h6 extends MessageNano {
    public static volatile C5378h6[] d;
    public C5612q6 a;
    public C5612q6[] b;
    public String c;

    public C5378h6() {
        a();
    }

    public static C5378h6[] b() {
        if (d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (d == null) {
                        d = new C5378h6[0];
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final C5378h6 a() {
        this.a = null;
        this.b = C5612q6.b();
        this.c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C5612q6 c5612q6 = this.a;
        if (c5612q6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5612q6);
        }
        C5612q6[] c5612q6Arr = this.b;
        if (c5612q6Arr != null && c5612q6Arr.length > 0) {
            int i = 0;
            while (true) {
                C5612q6[] c5612q6Arr2 = this.b;
                if (i >= c5612q6Arr2.length) {
                    break;
                }
                C5612q6 c5612q62 = c5612q6Arr2[i];
                if (c5612q62 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c5612q62) + computeSerializedSize;
                }
                i++;
            }
        }
        return !this.c.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.c) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5612q6 c5612q6 = this.a;
        if (c5612q6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5612q6);
        }
        C5612q6[] c5612q6Arr = this.b;
        if (c5612q6Arr != null && c5612q6Arr.length > 0) {
            int i = 0;
            while (true) {
                C5612q6[] c5612q6Arr2 = this.b;
                if (i >= c5612q6Arr2.length) {
                    break;
                }
                C5612q6 c5612q62 = c5612q6Arr2[i];
                if (c5612q62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c5612q62);
                }
                i++;
            }
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5378h6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new C5612q6();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C5612q6[] c5612q6Arr = this.b;
                int length = c5612q6Arr == null ? 0 : c5612q6Arr.length;
                int i = repeatedFieldArrayLength + length;
                C5612q6[] c5612q6Arr2 = new C5612q6[i];
                if (length != 0) {
                    System.arraycopy(c5612q6Arr, 0, c5612q6Arr2, 0, length);
                }
                while (length < i - 1) {
                    C5612q6 c5612q6 = new C5612q6();
                    c5612q6Arr2[length] = c5612q6;
                    codedInputByteBufferNano.readMessage(c5612q6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5612q6 c5612q62 = new C5612q6();
                c5612q6Arr2[length] = c5612q62;
                codedInputByteBufferNano.readMessage(c5612q62);
                this.b = c5612q6Arr2;
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.c = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C5378h6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5378h6().mergeFrom(codedInputByteBufferNano);
    }

    public static C5378h6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5378h6) MessageNano.mergeFrom(new C5378h6(), bArr);
    }
}
