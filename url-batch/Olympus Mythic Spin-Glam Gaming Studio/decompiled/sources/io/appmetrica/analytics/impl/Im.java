package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class Im extends MessageNano {
    public static volatile Im[] g;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;

    public Im() {
        a();
    }

    public static Im[] b() {
        if (g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (g == null) {
                        g = new Im[0];
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public final Im a() {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBoolSize = CodedOutputByteBufferNano.computeBoolSize(4, this.d) + CodedOutputByteBufferNano.computeBoolSize(3, this.c) + CodedOutputByteBufferNano.computeBoolSize(2, this.b) + CodedOutputByteBufferNano.computeBoolSize(1, this.a) + super.computeSerializedSize();
        boolean z = this.e;
        if (z) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(5, z);
        }
        int i = this.f;
        return i != -1 ? computeBoolSize + CodedOutputByteBufferNano.computeInt32Size(6, i) : computeBoolSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.a);
        codedOutputByteBufferNano.writeBool(2, this.b);
        codedOutputByteBufferNano.writeBool(3, this.c);
        codedOutputByteBufferNano.writeBool(4, this.d);
        boolean z = this.e;
        if (z) {
            codedOutputByteBufferNano.writeBool(5, z);
        }
        int i = this.f;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(6, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Im mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.b = codedInputByteBufferNano.readBool();
            } else if (readTag == 24) {
                this.c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.d = codedInputByteBufferNano.readBool();
            } else if (readTag == 40) {
                this.e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f = readInt32;
                }
            }
        }
    }

    public static Im b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Im().mergeFrom(codedInputByteBufferNano);
    }

    public static Im a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Im) MessageNano.mergeFrom(new Im(), bArr);
    }
}
