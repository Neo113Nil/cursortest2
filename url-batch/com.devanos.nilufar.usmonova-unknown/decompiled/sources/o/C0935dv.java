package o;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: o.dv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0935dv implements Closeable {
    public final boolean h;
    public boolean i;
    public int j;
    public final ReentrantLock k = new ReentrantLock();
    public final RandomAccessFile l;

    public C0935dv(boolean z, RandomAccessFile randomAccessFile) {
        this.h = z;
        this.l = randomAccessFile;
    }

    public static C0455Rl b(C0935dv c0935dv) {
        if (!c0935dv.h) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = c0935dv.k;
        reentrantLock.lock();
        try {
            if (c0935dv.i) {
                throw new IllegalStateException("closed");
            }
            c0935dv.j++;
            reentrantLock.unlock();
            return new C0455Rl(c0935dv);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final C0481Sl c(long j) {
        ReentrantLock reentrantLock = this.k;
        reentrantLock.lock();
        try {
            if (this.i) {
                throw new IllegalStateException("closed");
            }
            this.j++;
            reentrantLock.unlock();
            return new C0481Sl(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.k;
        reentrantLock.lock();
        try {
            if (this.i) {
                return;
            }
            this.i = true;
            if (this.j != 0) {
                return;
            }
            synchronized (this) {
                this.l.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (!this.h) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.k;
        reentrantLock.lock();
        try {
            if (this.i) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                this.l.getFD().sync();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.k;
        reentrantLock.lock();
        try {
            if (this.i) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.l.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
