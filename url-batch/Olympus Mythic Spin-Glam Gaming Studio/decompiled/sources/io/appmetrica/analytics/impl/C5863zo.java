package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.zo, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5863zo extends MessageNano {
    public static volatile C5863zo[] e;
    public byte[] a;
    public double b;
    public double c;
    public boolean d;

    public C5863zo() {
        a();
    }

    public static C5863zo[] b() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (e == null) {
                        e = new C5863zo[0];
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public final C5863zo a() {
        this.a = WireFormatNano.EMPTY_BYTES;
        this.b = 0.0d;
        this.c = 0.0d;
        this.d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.a);
        }
        if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.b);
        }
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.c);
        }
        boolean z = this.d;
        return z ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.b);
        }
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.c);
        }
        boolean z = this.d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5863zo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 17) {
                this.b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 25) {
                this.c = codedInputByteBufferNano.readDouble();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.d = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C5863zo b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5863zo().mergeFrom(codedInputByteBufferNano);
    }

    public static C5863zo a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5863zo) MessageNano.mergeFrom(new C5863zo(), bArr);
    }
}
