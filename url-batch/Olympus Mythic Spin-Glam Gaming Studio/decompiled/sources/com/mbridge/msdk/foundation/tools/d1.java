package com.mbridge.msdk.foundation.tools;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* compiled from: Util.java */
/* loaded from: classes10.dex */
class d1 {

    /* compiled from: Util.java */
    private static class a {
        static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        static final SecureRandom b = new SecureRandom();
    }

    static int a(int[] iArr, int i) {
        int length = (iArr.length >> 1) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = iArr[i3 << 1];
            if (i4 < i) {
                i2 = i3 + 1;
            } else {
                if (i4 <= i) {
                    return i3;
                }
                length = i3 - 1;
            }
        }
        return length;
    }

    private static void b(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                b(file2);
            }
        }
        file.delete();
    }

    static byte[] c(File file) throws IOException {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) == 0) {
            int i = (int) length;
            byte[] bArr = new byte[i];
            a(file, bArr, i);
            return bArr;
        }
        throw new IllegalArgumentException("file too large, path:" + file.getPath());
    }

    static boolean d(File file) throws IOException {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        return parentFile != null && (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
    }

    static void a(File file) {
        try {
            if (file.exists()) {
                b(file);
            }
        } catch (Exception unused) {
        }
    }

    static void a(File file, byte[] bArr, int i) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i2 = 0;
        while (i2 < i) {
            try {
                int read = randomAccessFile.read(bArr, i2, i - i2);
                if (read < 0) {
                    break;
                } else {
                    i2 += read;
                }
            } finally {
                a(randomAccessFile);
            }
        }
    }

    static String b() {
        byte[] bArr = new byte[16];
        a.b.nextBytes(bArr);
        char[] cArr = new char[32];
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = i << 1;
            char[] cArr2 = a.a;
            cArr[i2] = cArr2[(b >> 4) & 15];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    static int a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", null);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(declaredField.get(null), null)).intValue();
        } catch (Throwable unused) {
            return 4096;
        }
    }

    static boolean a(File file, byte[] bArr) {
        File file2;
        try {
            file2 = new File(file.getParent(), file.getName() + ".tmp");
        } catch (Exception unused) {
        }
        if (!d(file2)) {
            return false;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
        try {
            randomAccessFile.setLength(bArr.length);
            randomAccessFile.write(bArr);
            a(randomAccessFile);
            if (!file.exists() || file.delete()) {
                return file2.renameTo(file);
            }
            return false;
        } catch (Throwable th) {
            a(randomAccessFile);
            throw th;
        }
    }
}
