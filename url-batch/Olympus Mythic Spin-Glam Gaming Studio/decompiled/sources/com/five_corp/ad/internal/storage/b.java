package com.five_corp.ad.internal.storage;

import android.util.Log;
import com.five_corp.ad.internal.l;
import com.five_corp.ad.internal.m;
import com.safedk.android.internal.partials.LINEFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class b {
    public final File a;
    public final com.five_corp.ad.internal.logger.a b;

    public b(File file, String str, com.five_corp.ad.internal.logger.a aVar) {
        this.a = new File(new File(file, "com.five_corp"), str);
        this.b = aVar;
    }

    public final com.five_corp.ad.internal.util.c a(String str) {
        com.five_corp.ad.internal.util.b b = b(str);
        if (!b.a) {
            return new com.five_corp.ad.internal.util.c(false, b.b);
        }
        if (!((Boolean) b.c).booleanValue()) {
            return new com.five_corp.ad.internal.util.c(true, null);
        }
        File file = new File(this.a, str);
        try {
            if (file.delete()) {
                return new com.five_corp.ad.internal.util.c(true, null);
            }
            return new com.five_corp.ad.internal.util.c(false, new l(m.S2, "File path: " + file.getAbsolutePath(), null));
        } catch (SecurityException e) {
            return new com.five_corp.ad.internal.util.c(false, new l(m.T2, "File path: " + file.getAbsolutePath(), e));
        }
    }

    public final com.five_corp.ad.internal.util.b b(String str) {
        File file = new File(this.a, str);
        try {
            return new com.five_corp.ad.internal.util.b(true, null, Boolean.valueOf(file.exists()));
        } catch (SecurityException e) {
            return new com.five_corp.ad.internal.util.b(false, new l(m.Q2, "File path: " + file.getAbsolutePath(), e), null);
        }
    }

    public final com.five_corp.ad.internal.util.c a() {
        try {
            if (this.a.exists()) {
                return new com.five_corp.ad.internal.util.c(true, null);
            }
            if (!this.a.mkdirs()) {
                return new com.five_corp.ad.internal.util.c(false, new l(m.b3, "Data directory path: " + this.a.getAbsolutePath(), null));
            }
            if (!this.a.setReadable(true, false)) {
                return new com.five_corp.ad.internal.util.c(false, new l(m.c3, "Data directory path: " + this.a.getAbsolutePath(), null));
            }
            if (!this.a.setWritable(true, false)) {
                return new com.five_corp.ad.internal.util.c(false, new l(m.d3, "Data directory path: " + this.a.getAbsolutePath(), null));
            }
            if (!this.a.setExecutable(true, false)) {
                return new com.five_corp.ad.internal.util.c(false, new l(m.e3, "Data directory path: " + this.a.getAbsolutePath(), null));
            }
            return new com.five_corp.ad.internal.util.c(true, null);
        } catch (SecurityException e) {
            return new com.five_corp.ad.internal.util.c(false, new l(m.f3, "Data directory path: " + this.a.getAbsolutePath(), e));
        }
    }

    public final com.five_corp.ad.internal.util.c a(String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        File createTempFile;
        File file = new File(this.a, str);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                createTempFile = File.createTempFile("tmp", null, this.a);
                fileOutputStream = LINEFilesBridge.fileOutputStreamCtor(createTempFile);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
        } catch (IOException e) {
            e = e;
        } catch (SecurityException e2) {
            e = e2;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            fileOutputStream.getFD().sync();
            if (!createTempFile.renameTo(file)) {
                com.five_corp.ad.internal.util.c cVar = new com.five_corp.ad.internal.util.c(false, new l(m.k3, "File path: " + file.getAbsolutePath(), null));
                try {
                    fileOutputStream.close();
                    return cVar;
                } catch (IOException e3) {
                    Log.getStackTraceString(e3);
                    return cVar;
                }
            }
            if (!file.setReadable(true, false)) {
                com.five_corp.ad.internal.util.c cVar2 = new com.five_corp.ad.internal.util.c(false, new l(m.a3, "File path: " + file.getAbsolutePath(), null));
                try {
                    fileOutputStream.close();
                    return cVar2;
                } catch (IOException e4) {
                    Log.getStackTraceString(e4);
                    return cVar2;
                }
            }
            try {
                fileOutputStream.close();
            } catch (IOException e5) {
                Log.getStackTraceString(e5);
            }
            return new com.five_corp.ad.internal.util.c(true, null);
        } catch (IOException e6) {
            e = e6;
            fileOutputStream2 = fileOutputStream;
            com.five_corp.ad.internal.util.c cVar3 = new com.five_corp.ad.internal.util.c(false, new l(m.Z2, "File path: " + file.getAbsolutePath(), e));
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e7) {
                    Log.getStackTraceString(e7);
                }
            }
            return cVar3;
        } catch (SecurityException e8) {
            e = e8;
            fileOutputStream2 = fileOutputStream;
            com.five_corp.ad.internal.util.c cVar4 = new com.five_corp.ad.internal.util.c(false, new l(m.Y2, "File path: " + file.getAbsolutePath(), e));
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e9) {
                    Log.getStackTraceString(e9);
                }
            }
            return cVar4;
        } catch (Throwable th2) {
            th = th2;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e10) {
                    Log.getStackTraceString(e10);
                }
            }
            throw th;
        }
    }
}
