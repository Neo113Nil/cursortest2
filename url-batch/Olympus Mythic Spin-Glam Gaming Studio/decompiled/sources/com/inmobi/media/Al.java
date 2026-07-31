package com.inmobi.media;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* loaded from: classes11.dex */
public abstract class Al {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName("UTF-8");

    public static String a(InputStreamReader inputStreamReader) {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    String stringWriter2 = stringWriter.toString();
                    inputStreamReader.close();
                    return stringWriter2;
                }
                stringWriter.write(cArr, 0, read);
            }
        } catch (Throwable th) {
            inputStreamReader.close();
            throw th;
        }
    }

    public static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
