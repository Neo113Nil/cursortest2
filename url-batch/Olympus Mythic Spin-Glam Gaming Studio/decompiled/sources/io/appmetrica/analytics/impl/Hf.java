package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class Hf extends MessageNano {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static volatile Hf[] g;
    public Ff a;
    public Gf[] b;

    public Hf() {
        a();
    }

    public static Hf[] b() {
        if (g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (g == null) {
                        g = new Hf[0];
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public final Hf a() {
        this.a = null;
        this.b = Gf.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Ff ff = this.a;
        if (ff != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, ff);
        }
        Gf[] gfArr = this.b;
        if (gfArr != null && gfArr.length > 0) {
            int i = 0;
            while (true) {
                Gf[] gfArr2 = this.b;
                if (i >= gfArr2.length) {
                    break;
                }
                Gf gf = gfArr2[i];
                if (gf != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, gf) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Ff ff = this.a;
        if (ff != null) {
            codedOutputByteBufferNano.writeMessage(1, ff);
        }
        Gf[] gfArr = this.b;
        if (gfArr != null && gfArr.length > 0) {
            int i = 0;
            while (true) {
                Gf[] gfArr2 = this.b;
                if (i >= gfArr2.length) {
                    break;
                }
                Gf gf = gfArr2[i];
                if (gf != null) {
                    codedOutputByteBufferNano.writeMessage(2, gf);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Hf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new Ff();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                Gf[] gfArr = this.b;
                int length = gfArr == null ? 0 : gfArr.length;
                int i = repeatedFieldArrayLength + length;
                Gf[] gfArr2 = new Gf[i];
                if (length != 0) {
                    System.arraycopy(gfArr, 0, gfArr2, 0, length);
                }
                while (length < i - 1) {
                    Gf gf = new Gf();
                    gfArr2[length] = gf;
                    codedInputByteBufferNano.readMessage(gf);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Gf gf2 = new Gf();
                gfArr2[length] = gf2;
                codedInputByteBufferNano.readMessage(gf2);
                this.b = gfArr2;
            }
        }
    }

    public static Hf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Hf().mergeFrom(codedInputByteBufferNano);
    }

    public static Hf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Hf) MessageNano.mergeFrom(new Hf(), bArr);
    }
}
