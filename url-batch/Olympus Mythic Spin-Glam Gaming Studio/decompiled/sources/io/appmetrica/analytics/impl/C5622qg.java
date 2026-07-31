package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.qg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5622qg extends MessageNano {
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static volatile C5622qg[] h;
    public byte[] a;
    public long b;
    public long c;
    public int d;

    public C5622qg() {
        a();
    }

    public static C5622qg[] b() {
        if (h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (h == null) {
                        h = new C5622qg[0];
                    }
                } finally {
                }
            }
        }
        return h;
    }

    public final C5622qg a() {
        this.a = WireFormatNano.EMPTY_BYTES;
        this.b = 0L;
        this.c = 0L;
        this.d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.a) + super.computeSerializedSize();
        long j = this.b;
        if (j != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
        }
        long j2 = this.c;
        if (j2 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
        }
        int i = this.d;
        return i != 0 ? computeBytesSize + CodedOutputByteBufferNano.computeInt32Size(4, i) : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.a);
        long j = this.b;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j);
        }
        long j2 = this.c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j2);
        }
        int i = this.d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5622qg mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.d = readInt32;
                }
            }
        }
    }

    public static C5622qg b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5622qg().mergeFrom(codedInputByteBufferNano);
    }

    public static C5622qg a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5622qg) MessageNano.mergeFrom(new C5622qg(), bArr);
    }
}
