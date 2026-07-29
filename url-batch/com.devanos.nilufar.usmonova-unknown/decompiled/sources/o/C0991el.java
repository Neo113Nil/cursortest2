package o;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: o.el, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0991el extends InputStream implements DataInput {
    public final DataInputStream h;
    public int i;
    public ByteOrder j;
    public byte[] k;
    public final int l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0991el(byte[] bArr) {
        this(r0, 0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.l = bArr.length;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.h.available();
    }

    public final void b(int i) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.h;
            int skip = (int) dataInputStream.skip(i3);
            if (skip <= 0) {
                if (this.k == null) {
                    this.k = new byte[8192];
                }
                skip = dataInputStream.read(this.k, 0, Math.min(8192, i3));
                if (skip == -1) {
                    throw new EOFException(AbstractC1888sN.h(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += skip;
        }
        this.i += i2;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.i++;
        return this.h.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.i++;
        return this.h.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.i++;
        int read = this.h.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.i += 2;
        return this.h.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        this.i += i2;
        this.h.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.i += 4;
        DataInputStream dataInputStream = this.h;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.j;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.j);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j;
        long j2;
        this.i += 8;
        DataInputStream dataInputStream = this.h;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.j;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
            j2 = read;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.j);
            }
            j = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
            j2 = read8;
        }
        return j + j2;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.i += 2;
        DataInputStream dataInputStream = this.h;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.j;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.j);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.i += 2;
        return this.h.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.i++;
        return this.h.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.i += 2;
        DataInputStream dataInputStream = this.h;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.j;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.j);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0991el(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.h.read(bArr, i, i2);
        this.i += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.i += bArr.length;
        this.h.readFully(bArr);
    }

    public C0991el(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.h = dataInputStream;
        dataInputStream.mark(0);
        this.i = 0;
        this.j = byteOrder;
        this.l = inputStream instanceof C0991el ? ((C0991el) inputStream).l : -1;
    }
}
