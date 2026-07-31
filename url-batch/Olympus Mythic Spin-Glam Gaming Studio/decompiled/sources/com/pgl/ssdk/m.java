package com.pgl.ssdk;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public class m implements q {
    private final FileChannel a;
    private final long b;
    private final long c;

    public m(FileChannel fileChannel, long j, long j2) {
        if (j < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j2)));
        }
        if (j2 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j2)));
        }
        this.a = fileChannel;
        this.b = j;
        this.c = j2;
    }

    private static void a(long j, long j2, long j3) {
        if (j < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j)));
        }
        if (j2 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j2)));
        }
        if (j > j3) {
            throw new IndexOutOfBoundsException("offset (" + j + ") > source size (" + j3 + ")");
        }
        long j4 = j + j2;
        if (j4 < j) {
            throw new IndexOutOfBoundsException("offset (" + j + ") + size (" + j2 + ") overflow");
        }
        if (j4 <= j3) {
            return;
        }
        throw new IndexOutOfBoundsException("offset (" + j + ") + size (" + j2 + ") > source size (" + j3 + ")");
    }

    @Override // com.pgl.ssdk.q
    public long a() {
        long j = this.c;
        if (j != -1) {
            return j;
        }
        try {
            return this.a.size();
        } catch (IOException unused) {
            return 0L;
        }
    }

    @Override // com.pgl.ssdk.q
    public ByteBuffer a(long j, int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(i)));
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        a(j, i, allocate);
        allocate.flip();
        return allocate;
    }

    public void a(long j, int i, ByteBuffer byteBuffer) {
        int read;
        a(j, i, a());
        if (i == 0) {
            return;
        }
        if (i > byteBuffer.remaining()) {
            throw new BufferOverflowException();
        }
        long j2 = this.b + j;
        int limit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i);
            while (i > 0) {
                synchronized (this.a) {
                    this.a.position(j2);
                    read = this.a.read(byteBuffer);
                }
                j2 += read;
                i -= read;
            }
        } finally {
            byteBuffer.limit(limit);
        }
    }

    @Override // com.pgl.ssdk.q
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m a(long j, long j2) {
        long a = a();
        a(j, j2, a);
        return (j == 0 && j2 == a) ? this : new m(this.a, this.b + j, j2);
    }
}
