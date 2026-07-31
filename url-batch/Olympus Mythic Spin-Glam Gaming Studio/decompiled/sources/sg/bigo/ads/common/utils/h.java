package sg.bigo.ads.common.utils;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class h {
    public static File a(File file) {
        return new File(file.getPath() + ".bak");
    }

    @NonNull
    public static String a(InputStream inputStream) {
        String str = "";
        if (inputStream == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream2.write(bArr, 0, read);
                }
                str = byteArrayOutputStream2.toString();
                a((Closeable) inputStream);
                a(byteArrayOutputStream2);
            } catch (IOException unused) {
                byteArrayOutputStream = byteArrayOutputStream2;
                a((Closeable) inputStream);
                if (byteArrayOutputStream != null) {
                    a(byteArrayOutputStream);
                }
                return str;
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                a((Closeable) inputStream);
                if (byteArrayOutputStream != null) {
                    a(byteArrayOutputStream);
                }
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        return str;
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

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0053: MOVE (r6 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:60:0x0053 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] b(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream3;
        File a = a(file);
        if (a.exists()) {
            file.delete();
            a.renameTo(file);
        }
        FileInputStream fileInputStream4 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            try {
                int length = (int) file.length();
                if (length != 0) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[length];
                        if (fileInputStream.read(bArr) == length) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused) {
                                sg.bigo.ads.bn.a.a("IOUtils", "close file " + file.getPath() + " failed");
                            }
                            return bArr;
                        }
                    } catch (Exception unused2) {
                        sg.bigo.ads.bn.a.a(0, "IOUtils", "read file " + file.getPath() + " failed");
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused3) {
                                sg.bigo.ads.bn.a.a("IOUtils", "close file " + file.getPath() + " failed");
                            }
                        }
                        return null;
                    }
                } else {
                    fileInputStream = null;
                }
                file.getName();
                byteArrayOutputStream = new ByteArrayOutputStream();
                fileInputStream3 = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
                fileInputStream4 = fileInputStream2;
            }
            try {
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int read = fileInputStream3.read(bArr2);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int length2 = byteArray.length;
                file.getName();
                if (byteArray.length != 0) {
                    try {
                        fileInputStream3.close();
                    } catch (IOException unused4) {
                        sg.bigo.ads.bn.a.a("IOUtils", "close file " + file.getPath() + " failed");
                    }
                    return byteArray;
                }
                sg.bigo.ads.bn.a.a(0, "IOUtils", "read " + file.getName() + " failed, data's length is 0.");
                throw new Exception("read " + file.getName() + " failed, data's length is 0.");
            } catch (Exception unused5) {
                fileInputStream = fileInputStream3;
                sg.bigo.ads.bn.a.a(0, "IOUtils", "read file " + file.getPath() + " failed");
                if (fileInputStream != null) {
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream4 = fileInputStream3;
                if (fileInputStream4 != null) {
                    try {
                        fileInputStream4.close();
                    } catch (IOException unused6) {
                        sg.bigo.ads.bn.a.a("IOUtils", "close file " + file.getPath() + " failed");
                    }
                }
                throw th;
            }
        } catch (Exception unused7) {
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
