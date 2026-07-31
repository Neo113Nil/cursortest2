package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.r6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5637r6 extends MessageNano {
    public static volatile C5637r6[] f;
    public String a;
    public String b;
    public C5585p6[] c;
    public C5637r6 d;
    public C5637r6[] e;

    public C5637r6() {
        a();
    }

    public static C5637r6[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new C5637r6[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    public final C5637r6 a() {
        this.a = "";
        this.b = "";
        this.c = C5585p6.b();
        this.d = null;
        this.e = b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.a) + super.computeSerializedSize();
        if (!this.b.equals("")) {
            computeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        C5585p6[] c5585p6Arr = this.c;
        int i = 0;
        if (c5585p6Arr != null && c5585p6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C5585p6[] c5585p6Arr2 = this.c;
                if (i2 >= c5585p6Arr2.length) {
                    break;
                }
                C5585p6 c5585p6 = c5585p6Arr2[i2];
                if (c5585p6 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, c5585p6) + computeStringSize;
                }
                i2++;
            }
        }
        C5637r6 c5637r6 = this.d;
        if (c5637r6 != null) {
            computeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c5637r6);
        }
        C5637r6[] c5637r6Arr = this.e;
        if (c5637r6Arr != null && c5637r6Arr.length > 0) {
            while (true) {
                C5637r6[] c5637r6Arr2 = this.e;
                if (i >= c5637r6Arr2.length) {
                    break;
                }
                C5637r6 c5637r62 = c5637r6Arr2[i];
                if (c5637r62 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c5637r62) + computeStringSize;
                }
                i++;
            }
        }
        return computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.a);
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        C5585p6[] c5585p6Arr = this.c;
        int i = 0;
        if (c5585p6Arr != null && c5585p6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C5585p6[] c5585p6Arr2 = this.c;
                if (i2 >= c5585p6Arr2.length) {
                    break;
                }
                C5585p6 c5585p6 = c5585p6Arr2[i2];
                if (c5585p6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c5585p6);
                }
                i2++;
            }
        }
        C5637r6 c5637r6 = this.d;
        if (c5637r6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c5637r6);
        }
        C5637r6[] c5637r6Arr = this.e;
        if (c5637r6Arr != null && c5637r6Arr.length > 0) {
            while (true) {
                C5637r6[] c5637r6Arr2 = this.e;
                if (i >= c5637r6Arr2.length) {
                    break;
                }
                C5637r6 c5637r62 = c5637r6Arr2[i];
                if (c5637r62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c5637r62);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5637r6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C5585p6[] c5585p6Arr = this.c;
                int length = c5585p6Arr == null ? 0 : c5585p6Arr.length;
                int i = repeatedFieldArrayLength + length;
                C5585p6[] c5585p6Arr2 = new C5585p6[i];
                if (length != 0) {
                    System.arraycopy(c5585p6Arr, 0, c5585p6Arr2, 0, length);
                }
                while (length < i - 1) {
                    C5585p6 c5585p6 = new C5585p6();
                    c5585p6Arr2[length] = c5585p6;
                    codedInputByteBufferNano.readMessage(c5585p6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5585p6 c5585p62 = new C5585p6();
                c5585p6Arr2[length] = c5585p62;
                codedInputByteBufferNano.readMessage(c5585p62);
                this.c = c5585p6Arr2;
            } else if (readTag == 34) {
                if (this.d == null) {
                    this.d = new C5637r6();
                }
                codedInputByteBufferNano.readMessage(this.d);
            } else if (readTag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C5637r6[] c5637r6Arr = this.e;
                int length2 = c5637r6Arr == null ? 0 : c5637r6Arr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                C5637r6[] c5637r6Arr2 = new C5637r6[i2];
                if (length2 != 0) {
                    System.arraycopy(c5637r6Arr, 0, c5637r6Arr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    C5637r6 c5637r6 = new C5637r6();
                    c5637r6Arr2[length2] = c5637r6;
                    codedInputByteBufferNano.readMessage(c5637r6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C5637r6 c5637r62 = new C5637r6();
                c5637r6Arr2[length2] = c5637r62;
                codedInputByteBufferNano.readMessage(c5637r62);
                this.e = c5637r6Arr2;
            }
        }
    }

    public static C5637r6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5637r6().mergeFrom(codedInputByteBufferNano);
    }

    public static C5637r6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5637r6) MessageNano.mergeFrom(new C5637r6(), bArr);
    }
}
