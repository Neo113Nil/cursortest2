package com.inmobi.media;

import com.ironsource.X3;
import com.safedk.android.internal.partials.InMobiFilesBridge;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class P5 implements Closeable {
    public static final Pattern p = Pattern.compile("[a-z0-9_-]{1,64}");
    public static final I5 q = new I5();
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final N5 g;
    public final long j;
    public BufferedWriter l;
    public int m;
    public final ThreadPoolExecutor a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final LinkedHashMap i = new LinkedHashMap(0, 0.75f, true);
    public long k = 0;
    public long n = 0;
    public final J5 o = new J5(this);
    public final int f = 1;
    public final int h = 2;

    public P5(File file, long j, N5 n5) {
        this.b = file;
        this.c = new File(file, "journal");
        this.d = new File(file, "journal.tmp");
        this.e = new File(file, "journal.bkp");
        this.j = j;
        this.g = n5;
    }

    public final void a() {
        File file = this.d;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            M5 m5 = (M5) it.next();
            int i = 0;
            if (m5.d == null) {
                while (i < this.h) {
                    this.k += m5.b[i];
                    i++;
                }
            } else {
                m5.d = null;
                while (i < this.h) {
                    File a = m5.a(i);
                    if (a.exists() && !a.delete()) {
                        throw new IOException();
                    }
                    File b = m5.b(i);
                    if (b.exists() && !b.delete()) {
                        throw new IOException();
                    }
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void b() {
        C4004fk c4004fk = new C4004fk(new FileInputStream(this.c), Al.a);
        try {
            String a = c4004fk.a();
            String a2 = c4004fk.a();
            String a3 = c4004fk.a();
            String a4 = c4004fk.a();
            String a5 = c4004fk.a();
            if (!"libcore.io.DiskLruCache".equals(a) || !"1".equals(a2) || !Integer.toString(this.f).equals(a3) || !Integer.toString(this.h).equals(a4) || !"".equals(a5)) {
                throw new IOException("unexpected journal header: [" + a + ", " + a2 + ", " + a4 + ", " + a5 + X3.j.e);
            }
            int i = 0;
            while (true) {
                try {
                    c(c4004fk.a());
                    i++;
                } catch (EOFException unused) {
                    this.m = i - this.i.size();
                    Al.a(c4004fk);
                    return;
                }
            }
        } catch (Throwable th) {
            Al.a(c4004fk);
            throw th;
        }
    }

    public final void c(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.i.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        M5 m5 = (M5) this.i.get(substring);
        if (m5 == null) {
            m5 = new M5(this, substring);
            this.i.put(substring, m5);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                m5.d = new L5(this, m5);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(" ");
        m5.c = true;
        m5.d = null;
        if (split.length != m5.e.h) {
            throw new IOException("unexpected journal line: " + Arrays.toString(split));
        }
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                m5.b[i2] = Long.parseLong(split[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.l == null) {
                return;
            }
            Iterator it = new ArrayList(this.i.values()).iterator();
            while (it.hasNext()) {
                L5 l5 = ((M5) it.next()).d;
                if (l5 != null) {
                    l5.d.a(l5, false);
                }
            }
            while (this.k > this.j) {
                d((String) ((Map.Entry) this.i.entrySet().iterator().next()).getKey());
            }
            this.l.close();
            this.l = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(String str) {
        if (this.l == null) {
            throw new IllegalStateException("cache is closed");
        }
        if (!p.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
        M5 m5 = (M5) this.i.get(str);
        if (m5 != null && m5.d == null) {
            for (int i = 0; i < this.h; i++) {
                File file = m5.a(i);
                if (this.g != null) {
                    Intrinsics.checkNotNullParameter(file, "file");
                    if (str != null && i == 0) {
                        String str2 = "";
                        try {
                            String a = Al.a(new InputStreamReader(new FileInputStream(file), Al.b));
                            Intrinsics.checkNotNullExpressionValue(a, "readFully(...)");
                            str2 = a;
                        } catch (Exception unused) {
                        }
                        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("urlKey", str), TuplesKt.to("url", str2));
                        C4425vk c4425vk = C4425vk.a;
                        C4425vk.b("ResourceDiskCacheFileEvicted", mutableMapOf, EnumC4530zk.a);
                    }
                }
                if (file.exists() && !file.delete()) {
                    throw new IOException("failed to delete " + file);
                }
                long j = this.k;
                long[] jArr = m5.b;
                this.k = j - jArr[i];
                jArr[i] = 0;
            }
            this.m++;
            this.l.append((CharSequence) ("REMOVE " + str + '\n'));
            this.i.remove(str);
            int i2 = this.m;
            if (i2 >= 2000 && i2 >= this.i.size()) {
                this.a.submit(this.o);
            }
        }
    }

    public final L5 a(String str) {
        synchronized (this) {
            try {
                if (this.l != null) {
                    if (p.matcher(str).matches()) {
                        M5 m5 = (M5) this.i.get(str);
                        if (m5 == null) {
                            m5 = new M5(this, str);
                            this.i.put(str, m5);
                        } else if (m5.d != null) {
                            return null;
                        }
                        L5 l5 = new L5(this, m5);
                        m5.d = l5;
                        this.l.write("DIRTY " + str + '\n');
                        this.l.flush();
                        return l5;
                    }
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void c() {
        try {
            BufferedWriter bufferedWriter = this.l;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(InMobiFilesBridge.fileOutputStreamCtor(this.d), Al.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.h));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (M5 m5 : this.i.values()) {
                    if (m5.d != null) {
                        bufferedWriter2.write("DIRTY " + m5.a + '\n');
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("CLEAN ");
                        sb.append(m5.a);
                        StringBuilder sb2 = new StringBuilder();
                        for (long j : m5.b) {
                            sb2.append(' ');
                            sb2.append(j);
                        }
                        sb.append(sb2.toString());
                        sb.append('\n');
                        bufferedWriter2.write(sb.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.c.exists()) {
                    File file = this.c;
                    File file2 = this.e;
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (this.d.renameTo(this.c)) {
                    this.e.delete();
                    this.l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c, true), Al.a));
                } else {
                    throw new IOException();
                }
            } catch (Throwable th) {
                bufferedWriter2.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(L5 l5, boolean z) {
        int i;
        M5 m5 = l5.a;
        if (m5.d == l5) {
            if (z && !m5.c) {
                for (int i2 = 0; i2 < this.h; i2++) {
                    if (l5.b[i2]) {
                        if (!m5.b(i2).exists()) {
                            l5.d.a(l5, false);
                            return;
                        }
                    } else {
                        l5.d.a(l5, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                }
            }
            for (int i3 = 0; i3 < this.h; i3++) {
                File b = m5.b(i3);
                if (z) {
                    if (b.exists()) {
                        File a = m5.a(i3);
                        b.renameTo(a);
                        long j = m5.b[i3];
                        long length = a.length();
                        m5.b[i3] = length;
                        this.k = (this.k - j) + length;
                    }
                } else if (b.exists() && !b.delete()) {
                    throw new IOException();
                }
            }
            this.m++;
            m5.d = null;
            if (m5.c | z) {
                m5.c = true;
                BufferedWriter bufferedWriter = this.l;
                StringBuilder sb = new StringBuilder("CLEAN ");
                sb.append(m5.a);
                StringBuilder sb2 = new StringBuilder();
                for (long j2 : m5.b) {
                    sb2.append(' ');
                    sb2.append(j2);
                }
                sb.append(sb2.toString());
                sb.append('\n');
                bufferedWriter.write(sb.toString());
                if (z) {
                    this.n++;
                }
            } else {
                this.i.remove(m5.a);
                this.l.write("REMOVE " + m5.a + '\n');
            }
            this.l.flush();
            if (this.k > this.j || ((i = this.m) >= 2000 && i >= this.i.size())) {
                this.a.submit(this.o);
                return;
            }
            return;
        }
        throw new IllegalStateException("CurrentEditor of Entry didn't match with CurrentEditor instance.");
    }

    public final synchronized O5 b(String key) {
        InputStream inputStream;
        if (this.l != null) {
            if (p.matcher(key).matches()) {
                M5 m5 = (M5) this.i.get(key);
                if (m5 == null) {
                    return null;
                }
                if (!m5.c) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.h];
                for (int i = 0; i < this.h; i++) {
                    try {
                        inputStreamArr[i] = new FileInputStream(m5.a(i));
                    } catch (FileNotFoundException unused) {
                        if (this.g != null) {
                            Intrinsics.checkNotNullParameter(key, "key");
                            Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("urlKey", key));
                            C4425vk c4425vk = C4425vk.a;
                            C4425vk.b("ResourceDiskCacheFileMissing", mutableMapOf, EnumC4530zk.a);
                        }
                        for (int i2 = 0; i2 < this.h && (inputStream = inputStreamArr[i2]) != null; i2++) {
                            Al.a(inputStream);
                        }
                        return null;
                    }
                }
                this.m++;
                this.l.append((CharSequence) ("READ " + key + '\n'));
                int i3 = this.m;
                if (i3 >= 2000 && i3 >= this.i.size()) {
                    this.a.submit(this.o);
                }
                return new O5(inputStreamArr);
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + key + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }
}
