package io.appmetrica.analytics.impl;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: io.appmetrica.analytics.impl.ib, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC5409ib {
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(File file) {
        byte[] bArr;
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileLock fileLock;
        if (file != null && file.exists()) {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    fileLock = channel.lock(0L, Long.MAX_VALUE, true);
                    try {
                        ByteBuffer allocate = ByteBuffer.allocate((int) file.length());
                        channel.read(allocate);
                        allocate.flip();
                        bArr = allocate.array();
                    } catch (IOException | SecurityException unused) {
                        bArr = null;
                        if (bArr == null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            C5340fk c5340fk = Dj.a;
                            c5340fk.getClass();
                            c5340fk.a(new Ej("error_during_file_reading", th));
                            file.getAbsolutePath();
                            a(fileLock);
                            Do.a((Closeable) randomAccessFile);
                            bArr = null;
                            if (bArr == null) {
                            }
                        } finally {
                            file.getAbsolutePath();
                            a(fileLock);
                            Do.a((Closeable) randomAccessFile);
                        }
                    }
                } catch (IOException | SecurityException unused2) {
                    fileLock = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileLock = null;
                }
            } catch (IOException | SecurityException unused3) {
                randomAccessFile = null;
                fileLock = null;
            } catch (Throwable th4) {
                th = th4;
                randomAccessFile = null;
                fileLock = null;
            }
            if (bArr == null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        }
        bArr = null;
        if (bArr == null) {
        }
    }

    public static void a(FileLock fileLock) {
        if (fileLock == null || !fileLock.isValid()) {
            return;
        }
        try {
            fileLock.release();
        } catch (IOException unused) {
        }
    }

    public static void a(String str, FileOutputStream fileOutputStream) {
        FileLock fileLock = null;
        try {
            FileChannel channel = fileOutputStream.getChannel();
            fileLock = channel.lock();
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            ByteBuffer allocate = ByteBuffer.allocate(bytes.length);
            allocate.put(bytes);
            allocate.flip();
            channel.write(allocate);
            channel.force(true);
        } catch (IOException unused) {
        } finally {
            a(fileLock);
            Do.a((Closeable) fileOutputStream);
        }
    }

    public static byte[] a(String str) {
        try {
            return MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }
}
