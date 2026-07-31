package yads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.safedk.android.internal.partials.YandexFilesBridge;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class dh0 implements ar {
    public final LinkedHashMap a = new LinkedHashMap(16, 0.75f, true);
    public long b = 0;
    public final ah0 c;
    public final int d;

    public dh0(File file, int i) {
        this.c = new ah0(file);
        this.d = i;
    }

    @Override // yads.ar
    public final synchronized void a() {
        File file = this.c.a;
        if (!file.exists()) {
            if (!file.mkdirs()) {
                file.getAbsolutePath();
                boolean z = lm3.a;
                boolean z2 = ob1.a;
            }
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            try {
                long length = file2.length();
                ch0 ch0Var = new ch0(new BufferedInputStream(new FileInputStream(file2)), length);
                try {
                    try {
                        bh0 a = bh0.a(ch0Var);
                        a.a = length;
                        String str = a.b;
                        if (this.a.containsKey(str)) {
                            this.b = (a.a - ((bh0) this.a.get(str)).a) + this.b;
                        } else {
                            this.b += a.a;
                        }
                        this.a.put(str, a);
                        ch0Var.close();
                    } catch (Throwable th) {
                        ch0Var.close();
                        throw th;
                    }
                } catch (Throwable unused) {
                    continue;
                }
            } catch (IOException unused2) {
                file2.delete();
            } catch (Throwable unused3) {
                file2.delete();
            }
        }
    }

    public final synchronized void b(String str) {
        try {
            File file = this.c.a;
            int length = str.length() / 2;
            boolean delete = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode())).delete();
            bh0 bh0Var = (bh0) this.a.remove(str);
            if (bh0Var != null) {
                this.b -= bh0Var.a;
            }
            if (!delete) {
                int length2 = str.length() / 2;
                String.valueOf(str.substring(0, length2).hashCode());
                String.valueOf(str.substring(length2).hashCode());
                boolean z = lm3.a;
                boolean z2 = ob1.a;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // yads.ar
    public final synchronized zq get(String str) {
        bh0 bh0Var = (bh0) this.a.get(str);
        if (bh0Var == null) {
            return null;
        }
        File file = this.c.a;
        int length = str.length() / 2;
        File file2 = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode()));
        try {
            ch0 ch0Var = new ch0(new BufferedInputStream(new FileInputStream(file2)), file2.length());
            try {
                if (TextUtils.equals(str, bh0.a(ch0Var).b)) {
                    return bh0Var.a(a(ch0Var, ch0Var.a - ch0Var.b));
                }
                file2.getAbsolutePath();
                boolean z = lm3.a;
                boolean z2 = ob1.a;
                bh0 bh0Var2 = (bh0) this.a.remove(str);
                if (bh0Var2 != null) {
                    this.b -= bh0Var2.a;
                }
                return null;
            } finally {
                ch0Var.close();
            }
        } catch (IOException unused) {
            file2.getAbsolutePath();
            boolean z3 = lm3.a;
            boolean z4 = ob1.a;
            b(str);
            return null;
        }
    }

    public final void b() {
        if (this.b < this.d) {
            return;
        }
        if (lm3.a) {
            boolean z = ob1.a;
        }
        SystemClock.elapsedRealtime();
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            bh0 bh0Var = (bh0) ((Map.Entry) it.next()).getValue();
            String str = bh0Var.b;
            File file = this.c.a;
            int length = str.length() / 2;
            if (new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode())).delete()) {
                this.b -= bh0Var.a;
            } else {
                String str2 = bh0Var.b;
                int length2 = str2.length() / 2;
                String.valueOf(str2.substring(0, length2).hashCode());
                String.valueOf(str2.substring(length2).hashCode());
                boolean z2 = ob1.a;
            }
            it.remove();
            if (this.b < this.d * 0.9f) {
                break;
            }
        }
        if (lm3.a) {
            SystemClock.elapsedRealtime();
            boolean z3 = ob1.a;
        }
    }

    @Override // yads.ar
    public final synchronized void a(String str) {
        zq zqVar = get(str);
        if (zqVar != null) {
            zqVar.f = 0L;
            zqVar.e = 0L;
            a(str, zqVar);
        }
    }

    @Override // yads.ar
    public final synchronized void a(String str, zq zqVar) {
        BufferedOutputStream bufferedOutputStream;
        bh0 bh0Var;
        long j = this.b;
        byte[] bArr = zqVar.a;
        long length = j + bArr.length;
        int i = this.d;
        if (length <= i || bArr.length <= i * 0.9f) {
            File file = this.c.a;
            int length2 = str.length() / 2;
            File file2 = new File(file, String.valueOf(str.substring(0, length2).hashCode()) + String.valueOf(str.substring(length2).hashCode()));
            try {
                bufferedOutputStream = new BufferedOutputStream(YandexFilesBridge.fileOutputStreamCtor(file2));
                bh0Var = new bh0(str, zqVar);
            } catch (IOException unused) {
                if (!file2.delete()) {
                    file2.getAbsolutePath();
                    boolean z = lm3.a;
                    boolean z2 = ob1.a;
                }
                if (!this.c.a.exists()) {
                    boolean z3 = lm3.a;
                    boolean z4 = ob1.a;
                    this.a.clear();
                    this.b = 0L;
                    a();
                }
            }
            if (bh0Var.a(bufferedOutputStream)) {
                bufferedOutputStream.write(zqVar.a);
                bufferedOutputStream.close();
                bh0Var.a = file2.length();
                if (!this.a.containsKey(str)) {
                    this.b += bh0Var.a;
                } else {
                    this.b = (bh0Var.a - ((bh0) this.a.get(str)).a) + this.b;
                }
                this.a.put(str, bh0Var);
                b();
                return;
            }
            bufferedOutputStream.close();
            file2.getAbsolutePath();
            boolean z5 = lm3.a;
            boolean z6 = ob1.a;
            throw new IOException();
        }
    }

    public static long b(ch0 ch0Var) {
        int read = ch0Var.read();
        if (read != -1) {
            long j = read & 255;
            int read2 = ch0Var.read();
            if (read2 != -1) {
                long j2 = j | ((read2 & 255) << 8);
                int read3 = ch0Var.read();
                if (read3 != -1) {
                    long j3 = j2 | ((read3 & 255) << 16);
                    int read4 = ch0Var.read();
                    if (read4 != -1) {
                        long j4 = j3 | ((read4 & 255) << 24);
                        int read5 = ch0Var.read();
                        if (read5 != -1) {
                            long j5 = j4 | ((read5 & 255) << 32);
                            int read6 = ch0Var.read();
                            if (read6 != -1) {
                                long j6 = j5 | ((read6 & 255) << 40);
                                int read7 = ch0Var.read();
                                if (read7 != -1) {
                                    long j7 = j6 | ((read7 & 255) << 48);
                                    int read8 = ch0Var.read();
                                    if (read8 != -1) {
                                        return ((read8 & 255) << 56) | j7;
                                    }
                                    throw new EOFException();
                                }
                                throw new EOFException();
                            }
                            throw new EOFException();
                        }
                        throw new EOFException();
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public static byte[] a(ch0 ch0Var, long j) {
        long j2 = ch0Var.a - ch0Var.b;
        if (j >= 0 && j <= j2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(ch0Var).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + j2);
    }

    public static int a(ch0 ch0Var) {
        int read = ch0Var.read();
        if (read != -1) {
            int read2 = ch0Var.read();
            if (read2 != -1) {
                int i = read | (read2 << 8);
                int read3 = ch0Var.read();
                if (read3 != -1) {
                    int i2 = i | (read3 << 16);
                    int read4 = ch0Var.read();
                    if (read4 != -1) {
                        return (read4 << 24) | i2;
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public static void a(BufferedOutputStream bufferedOutputStream, int i) {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static void a(BufferedOutputStream bufferedOutputStream, long j) {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }
}
