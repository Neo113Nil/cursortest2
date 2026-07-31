package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public final class z3 {
    private static final long c = TimeUnit.MINUTES.toMillis(30);
    private static final long d;
    private static final long e;
    private static final FilenameFilter f;
    private static final FilenameFilter g;
    private static final FilenameFilter h;
    private static long i;
    private static long j;
    private static volatile z3 k;
    private final Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    private final File b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        d = timeUnit.toMillis(7L);
        long millis = timeUnit.toMillis(1L);
        e = millis;
        f = new FilenameFilter() { // from class: com.my.target.z3$$ExternalSyntheticLambda2
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean a;
                a = z3.a(file, str);
                return a;
            }
        };
        g = new FilenameFilter() { // from class: com.my.target.z3$$ExternalSyntheticLambda3
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean b;
                b = z3.b(file, str);
                return b;
            }
        };
        h = new FilenameFilter() { // from class: com.my.target.z3$$ExternalSyntheticLambda4
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean c2;
                c2 = z3.c(file, str);
                return c2;
            }
        };
        i = 104857600L;
        j = millis;
    }

    private z3(File file) {
        this.b = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(File file, String str) {
        return str.startsWith("mytrg_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(File file, String str) {
        return str.endsWith(".mp4");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(File file, String str) {
        return str.endsWith(".mp3");
    }

    public static long d() {
        return j;
    }

    private synchronized void e() {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                if (file.exists() && file.isFile()) {
                    mi.a("DiskCache: Perform pending deletion - " + file.getPath());
                    if (!file.delete()) {
                        mi.a("DiskCache: Unable to delete file - " + file.getAbsolutePath());
                    }
                }
                it.remove();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void f() {
        mi.a("DiskCache: cache dir was deleted during runtime, re-creating...");
        if (!this.b.mkdirs()) {
            throw new Exception("can't re-create cache dir in runtime");
        }
    }

    private void g() {
        File[] listFiles = this.b.listFiles(f);
        if (listFiles == null) {
            return;
        }
        Arrays.sort(listFiles, new Comparator() { // from class: com.my.target.z3$$ExternalSyntheticLambda5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a;
                a = z3.a((File) obj, (File) obj2);
                return a;
            }
        });
        long j2 = 0;
        boolean z = false;
        for (File file : listFiles) {
            if (!z) {
                j2 += file.length();
                if (j2 > i) {
                    z = true;
                }
            }
            if (z) {
                mi.a("DiskCache: Remove file to enforce size limit - " + file.getPath());
                if (!file.delete()) {
                    mi.a("DiskCache: Unable to delete file - " + file.getAbsolutePath());
                }
            }
        }
    }

    private void h() {
        File[] listFiles;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.b.lastModified() > j && (listFiles = this.b.listFiles(f)) != null) {
            for (File file : listFiles) {
                if (file.isFile() && currentTimeMillis - file.lastModified() > j) {
                    mi.a("DiskCache: Remove expired file - " + file.getPath());
                    if (!file.delete()) {
                        mi.a("DiskCache: Unable to delete file - " + file.getAbsolutePath());
                    }
                }
            }
            if (this.b.setLastModified(currentTimeMillis)) {
                return;
            }
            mi.a("DiskCache: Unable to set last modified to dir - " + this.b.getAbsolutePath());
        }
    }

    private void i() {
        File[] listFiles = this.b.listFiles(h);
        if (listFiles != null) {
            if (listFiles.length <= 10) {
                return;
            }
            Arrays.sort(listFiles, new Comparator() { // from class: com.my.target.z3$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int b;
                    b = z3.b((File) obj, (File) obj2);
                    return b;
                }
            });
            for (int i2 = 10; i2 < listFiles.length; i2++) {
                String path = listFiles[i2].getPath();
                mi.a("DiskCache: Remove redundant audio - " + path);
                if (!listFiles[i2].delete()) {
                    mi.a("DiskCache: Unable to remove file - " + path);
                }
            }
        }
    }

    private void j() {
        File[] listFiles = this.b.listFiles(g);
        if (listFiles != null) {
            if (listFiles.length <= 10) {
                return;
            }
            Arrays.sort(listFiles, new Comparator() { // from class: com.my.target.z3$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int c2;
                    c2 = z3.c((File) obj, (File) obj2);
                    return c2;
                }
            });
            for (int i2 = 10; i2 < listFiles.length; i2++) {
                String path = listFiles[i2].getPath();
                mi.a("DiskCache: Remove redundant video - " + path);
                if (!listFiles[i2].delete()) {
                    mi.a("DiskCache: Unable to remove file - " + path);
                }
            }
        }
    }

    public synchronized void k() {
        try {
            if (!this.b.exists()) {
                f();
                return;
            }
            e();
            g();
            h();
            j();
            i();
        } catch (Throwable th) {
            mi.c("DiskCache: exception - " + th);
        }
    }

    public static void a(long j2) {
        if (j2 < 52428800) {
            i = 52428800L;
        } else {
            i = Math.min(j2, 107374182400L);
        }
    }

    public static z3 b(Context context) {
        z3 z3Var;
        z3 z3Var2 = k;
        if (z3Var2 != null) {
            return z3Var2;
        }
        synchronized (z3.class) {
            z3Var = k;
            if (z3Var == null) {
                try {
                    z3Var = new z3(a(context));
                    k = z3Var;
                } catch (Exception e2) {
                    mi.c("DiskCache: unable to create cache dir: " + e2);
                    return null;
                }
            }
        }
        return z3Var;
    }

    public static long c() {
        return i;
    }

    public synchronized File c(InputStream inputStream, String str) {
        File a;
        k();
        a = a(str, ".mp4");
        mi.a("DiskCache: Save video - " + a.getPath());
        return a(inputStream, a);
    }

    public synchronized void a() {
        File[] listFiles = this.b.listFiles(f);
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    mi.a("DiskCache: Mark file for deletion - " + file.getPath());
                    this.a.add(file);
                }
            }
        }
    }

    public String c(String str) {
        return b(str, ".mp4");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int c(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    private static File a(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, "mytargetcache");
            if (!file.exists() && !file.mkdirs()) {
                throw new Exception("can't create mytarget cache dir");
            }
            if (file.isDirectory() && file.canWrite()) {
                return file;
            }
            throw new Exception("can't write to mytarget cache dir");
        }
        throw new Exception("can't get context cache dir");
    }

    public static z3 b() {
        return k;
    }

    public static void b(long j2) {
        long j3 = c;
        if (j2 < j3) {
            j = j3;
        } else {
            j = Math.min(j2, d);
        }
    }

    public synchronized File b(InputStream inputStream, String str) {
        File a;
        k();
        a = a(str, ".img");
        mi.a("DiskCache: Save image - " + a.getPath());
        return a(inputStream, a);
    }

    public synchronized Bitmap b(String str) {
        try {
            k();
            File a = a(str, ".img");
            if (!a.exists()) {
                return null;
            }
            mi.a("DiskCache: Get image - " + a.getPath());
            try {
                if (!a.exists()) {
                    mi.a("DiskCache: File disappeared before reading: " + a.getPath());
                    return null;
                }
                return BitmapFactory.decodeFile(a.getAbsolutePath());
            } catch (OutOfMemoryError e2) {
                System.gc();
                mi.c("DiskCache: OutOfMemoryError, trying once again");
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 2;
                    return BitmapFactory.decodeFile(a.getAbsolutePath(), options);
                } catch (OutOfMemoryError unused) {
                    mi.c("DiskCache: OutOfMemoryError, called twice - " + e2);
                    return null;
                }
            } catch (Throwable th) {
                mi.c("DiskCache: exception - " + th);
                return null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized File a(InputStream inputStream, String str) {
        File a;
        k();
        a = a(str, ".mp3");
        mi.a("DiskCache: Save audio - " + a.getPath());
        return a(inputStream, a);
    }

    public synchronized File a(int i2, String str, boolean z) {
        File a;
        k();
        a = a(Integer.toString(i2), ".json");
        mi.a("DiskCache: Save text - " + a.getPath());
        long currentTimeMillis = System.currentTimeMillis();
        if (a.exists() && z) {
            currentTimeMillis = a.lastModified();
        }
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(a), StandardCharsets.UTF_8.newEncoder());
            try {
                outputStreamWriter.write(str);
                outputStreamWriter.close();
                if (!a.setLastModified(currentTimeMillis)) {
                    mi.a("DiskCache: Unable to set last modified to file - " + a.getPath());
                }
                outputStreamWriter.close();
            } finally {
            }
        } catch (Throwable th) {
            mi.c("DiskCache: exception - " + th);
            return null;
        }
        return a;
    }

    private synchronized String b(String str, String str2) {
        k();
        File a = a(str, str2);
        if (!a.exists()) {
            return null;
        }
        mi.a("DiskCache: Get path - " + a.getPath());
        try {
            return a.getAbsolutePath();
        } catch (Throwable th) {
            mi.c("DiskCache: exception - " + th);
            return null;
        }
    }

    public String a(String str) {
        return b(str, ".mp3");
    }

    public synchronized String a(int i2, long j2) {
        FileInputStream fileInputStream;
        StringBuilder sb;
        k();
        File a = a(Integer.toString(i2), ".json");
        if (!a.exists()) {
            return null;
        }
        if (a.isFile() && System.currentTimeMillis() - a.lastModified() > j2) {
            mi.a("DiskCache: Remove expired file - " + a.getPath());
            if (!a.delete()) {
                mi.a("DiskCache: Unable to delete file - " + a.getAbsolutePath());
            }
            return null;
        }
        mi.a("DiskCache: Get text - " + a.getPath());
        try {
            fileInputStream = new FileInputStream(a);
            try {
                sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.UTF_8));
                char[] cArr = new char[1024];
                while (true) {
                    int read = bufferedReader.read(cArr);
                    if (read == -1) {
                        break;
                    }
                    sb.append(new String(cArr, 0, read));
                }
            } finally {
            }
        } catch (Throwable th) {
            mi.c("DiskCache: exception - " + th);
        }
        if (sb.length() == 0) {
            mi.a("DiskCache: Error - cache file is empty");
            fileInputStream.close();
            return null;
        }
        String sb2 = sb.toString();
        fileInputStream.close();
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    private File a(InputStream inputStream, File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                a(inputStream, fileOutputStream);
                fileOutputStream.close();
                return file;
            } finally {
            }
        } catch (Throwable th) {
            mi.c("DiskCache: exception - " + th);
            return null;
        }
    }

    private int a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 8192);
                int i2 = 0;
                while (true) {
                    try {
                        int read = bufferedInputStream.read(bArr, 0, 8192);
                        if (read != -1) {
                            bufferedOutputStream.write(bArr, 0, read);
                            i2 += read;
                        } else {
                            bufferedOutputStream.flush();
                            bufferedOutputStream.close();
                            bufferedInputStream.close();
                            return i2;
                        }
                    } finally {
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            mi.a("DiskCache: Error - " + th.getMessage());
            throw th;
        }
    }

    File a(String str, String str2) {
        return new File(this.b.getAbsolutePath() + File.separator + ("mytrg_" + p4.c(str) + str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }
}
