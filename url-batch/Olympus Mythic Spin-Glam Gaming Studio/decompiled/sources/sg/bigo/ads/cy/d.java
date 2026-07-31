package sg.bigo.ads.cy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes5.dex */
public final class d {
    private static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x011b, code lost:
    
        throw new java.io.IOException("illegal entry: ".concat(r8));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(@NonNull File file, @NonNull File file2) {
        if (!file.isFile()) {
            throw new IOException("zip not found: ".concat(String.valueOf(file)));
        }
        if (!file2.exists() && !file2.mkdirs()) {
            throw new IOException("cannot mkdir: ".concat(String.valueOf(file2)));
        }
        File canonicalFile = file2.getCanonicalFile();
        String canonicalPath = canonicalFile.getCanonicalPath();
        byte[] bArr = new byte[8192];
        ZipInputStream zipInputStream = null;
        try {
            ZipInputStream zipInputStream2 = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
            long j = 0;
            int i = 0;
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream2.getNextEntry();
                    if (nextEntry == null) {
                        a(zipInputStream2);
                        return;
                    }
                    i++;
                    if (i > 2000) {
                        throw new IOException("too many zip entries");
                    }
                    String name = nextEntry.getName();
                    if (name.startsWith("/") || name.contains("..")) {
                        break;
                    }
                    File file3 = new File(canonicalFile, name);
                    String canonicalPath2 = file3.getCanonicalPath();
                    if (!canonicalPath2.startsWith(canonicalPath + File.separator) && !canonicalPath2.equals(canonicalPath)) {
                        throw new IOException("zip slip: ".concat(name));
                    }
                    if (!nextEntry.isDirectory()) {
                        File parentFile = file3.getParentFile();
                        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                            throw new IOException("mkdir parent failed: ".concat(String.valueOf(parentFile)));
                        }
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file3);
                            while (true) {
                                try {
                                    int read = zipInputStream2.read(bArr);
                                    if (read <= 0) {
                                        a(fileOutputStream);
                                        break;
                                    }
                                    j += read;
                                    if (j > 83886080) {
                                        throw new IOException("uncompressed size exceeds limit");
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                } catch (Throwable th) {
                                    th = th;
                                    zipInputStream = fileOutputStream;
                                    a(zipInputStream);
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else if (!file3.exists() && !file3.mkdirs()) {
                        throw new IOException("mkdir failed: ".concat(String.valueOf(file3)));
                    }
                    zipInputStream2.closeEntry();
                } catch (Throwable th3) {
                    th = th3;
                    zipInputStream = zipInputStream2;
                    a(zipInputStream);
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private static void a(@Nullable StringBuilder sb, @NonNull String str) {
        if (sb != null) {
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(str);
        }
    }

    public static boolean a(@NonNull File file, @NonNull File file2, @Nullable StringBuilder sb) {
        String simpleName;
        try {
            if (file2.exists() || file2.mkdirs()) {
                a(file, file2);
                return true;
            }
            a(sb, "无法创建解压目录: " + file2.getAbsolutePath());
            return false;
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("解压失败: ");
            String message = th.getMessage();
            if (message == null || message.length() <= 0) {
                simpleName = th.getClass().getSimpleName();
            } else {
                simpleName = th.getClass().getSimpleName() + ": " + message;
            }
            sb2.append(simpleName);
            a(sb, sb2.toString());
            return false;
        }
    }
}
