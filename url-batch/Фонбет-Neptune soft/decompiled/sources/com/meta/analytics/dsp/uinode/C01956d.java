package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.6d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01956d {
    public static byte[] A02;
    public static String[] A03 = {"xEW9LSpkxtcMkiVkCjWXuTu5CJHPJiyq", "tTP", "A", "dhAFlm3SiPB0s9864OvgcmZEVzRtwwmX", "mnE9bSEHBlleLkXo6La2W5bpkmZqSUyN", "0jwmHWkFqK", "xBcWrb6s57BN1yke0uYkFqIHC7aAgPEb", "dL0KwaEpZdlIbw3ka3MpOkzONR5qkJY2"};
    public static final String A04;
    public static volatile C01956d A05;
    public final C0888Ym A00;
    public final Map<String, C01926a> A01 = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private Bitmap A02(C02177f c02177f, C01926a c01926a, String str) {
        Bitmap A01;
        String str2 = c01926a.A07;
        int i = c01926a.A03;
        int i2 = c01926a.A04;
        long currentTimeMillis = System.currentTimeMillis();
        IOException e = null;
        String A08 = A08(223, 9, 70);
        boolean startsWith = str2.startsWith(A08);
        String A082 = A08(239, 22, 123);
        if (startsWith || str2.startsWith(A082)) {
            String substring = str2.startsWith(A08) ? str2.substring(A08.length()) : str2.substring(A082.length());
            InputStream inputStream = null;
            try {
                try {
                    inputStream = this.A00.getAssets().open(substring);
                    if (A0C(i, i2)) {
                        try {
                            A01 = AbstractC01996h.A01(inputStream, i, i2);
                        } catch (IOException e2) {
                            e = e2;
                            A0B(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (OutOfMemoryError e3) {
                            e = e3;
                            A0B(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            throw th;
                        }
                    } else {
                        A01 = BitmapFactory.decodeStream(inputStream);
                    }
                    if (inputStream != null) {
                        A0A(inputStream);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e4) {
                e = e4;
            } catch (OutOfMemoryError e5) {
                e = e5;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            boolean A0C = A0C(i, i2);
            if (A03[2].length() == 5) {
                throw new RuntimeException();
            }
            A03[3] = "EtuvklQgZLPMp8CYh3QQVMKsyyqrprqR";
            if (A0C) {
                try {
                    A01 = A05(str2, i, i2);
                } catch (IOException e6) {
                    e = e6;
                    A0B(e);
                    A01 = A03(str2);
                }
            } else {
                A01 = A03(str2);
            }
        }
        String th4 = e != null ? e.toString() : null;
        if (A01 == null) {
            C01976f.A03(c02177f, c01926a, str, C01976f.A03, th4, null, null);
            return null;
        }
        long A00 = A00(str2, A01);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (A00 > 0) {
            C01976f.A03(c02177f, c01926a, str, C01976f.A02, th4, Long.valueOf(A00), Long.valueOf(currentTimeMillis2));
            return A01;
        }
        C01976f.A03(c02177f, c01926a, str, C01976f.A01, th4, null, null);
        if (C0478Ih.A0t(c02177f)) {
            return null;
        }
        return A01;
    }

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{97, 102, 34, 124, 98, 107, 68, 103, 98, 38, 105, 115, 114, 118, 115, 114, 38, 98, 99, 117, 114, 111, 104, 103, 114, 111, 105, 104, 38, 46, 96, 111, 106, 99, 59, Ascii.SUB, 49, 44, 53, 57, 40, 120, 43, 49, 34, Base64.padSymbol, 120, Base64.padSymbol, 32, 59, Base64.padSymbol, Base64.padSymbol, 60, 43, 120, 53, 57, 32, 120, 43, 49, 34, Base64.padSymbol, 120, 62, 55, 42, 120, 43, 44, 55, 42, 57, 63, Base64.padSymbol, 98, 120, 103, 69, 71, 76, 65, 4, 65, 86, 86, 75, 86, 10, 4, 102, 77, 80, 73, 69, 84, 4, 77, 87, 4, 74, 81, 72, 72, 10, 57, Ascii.RS, Ascii.SYN, 19, Ascii.SUB, Ascii.ESC, 95, Ascii.VT, 16, 95, Ascii.FS, 16, Ascii.SI, 6, 95, 19, 16, Ascii.FS, Ascii.RS, 19, 95, Ascii.SYN, Ascii.DC2, Ascii.RS, Ascii.CAN, Ascii.SUB, 95, Ascii.SYN, 17, Ascii.VT, 16, 95, Ascii.FS, Ascii.RS, Ascii.FS, Ascii.ETB, Ascii.SUB, 95, 87, 10, Ascii.CR, 19, 66, 53, Ascii.SO, 1, 2, Ascii.FF, 5, 64, Ascii.DC4, Ascii.SI, 64, Ascii.ETB, Ascii.DC2, 9, Ascii.DC4, 5, 64, 2, 9, Ascii.DC4, Ascii.CR, 1, 16, 64, Ascii.DC4, Ascii.SI, 64, 6, 9, Ascii.FF, 5, 64, 72, Ascii.NAK, Ascii.DC2, Ascii.FF, 93, 80, 107, 100, 103, 105, 96, 37, 113, 106, 37, 114, 119, 108, 113, 96, 37, 103, 108, 113, 104, 100, 117, 37, 113, 106, 37, 106, 112, 113, 117, 112, 113, 37, 118, 113, 119, 96, 100, 104, 126, 108, 108, 122, 107, 37, 48, 48, 48, 63, 48, 53, 60, 99, 118, 118, 68, 75, 78, 71, Ascii.CAN, Ascii.CR, Ascii.CR, Ascii.CR, 67, 76, 70, 80, 77, 75, 70, 125, 67, 81, 81, 71, 86, Ascii.CR, Ascii.ESC, Ascii.US, 19, Ascii.NAK, Ascii.ETB, 0, 3, Ascii.CR, 8, 77, 86, 83, 86, 87, 79, 86};
    }

    static {
        A09();
        A04 = C01956d.class.getSimpleName();
    }

    public C01956d(C0888Ym c0888Ym) {
        this.A00 = c0888Ym;
    }

    private int A00(String str, Bitmap bitmap) {
        String A08 = A08(0, 2, 17);
        if (bitmap == null) {
            A0B(null);
            return 0;
        }
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 85));
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            int size = byteArrayOutputStream.size();
            if (size >= C0478Ih.A0F(this.A00)) {
                A0B(new Throwable(A08(35, 42, 1) + size));
                return 0;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.flush();
            A0A(byteArrayOutputStream);
            if (A03[7].charAt(22) != 'z') {
                throw new RuntimeException();
            }
            A03[4] = "r6vsbyQxsbBUkJdqjFKv7NMRisOUwCFh";
            A0A(fileOutputStream);
            return size;
        } catch (OutOfMemoryError e) {
            A0B(e);
            Log.e(A04, A08(Opcodes.INVOKESTATIC, 39, 92), e);
            return 0;
        } catch (FileNotFoundException e2) {
            Log.e(A04, A08(6, 29, 95) + file.getPath() + A08, e2);
            A0B(e2);
            return 0;
        } catch (IOException e3) {
            A0B(e3);
            Log.e(A04, A08(Opcodes.LCMP, 36, 57) + str + A08, e3);
            return 0;
        } finally {
            A0A(byteArrayOutputStream);
            A0A(null);
        }
    }

    private final Bitmap A01(C02177f c02177f, C01926a c01926a, int i, int i2, String str) {
        if (C01976f.A06(c02177f) && A08(266, 4, 53).equals(str)) {
            Map<String, C01926a> map = this.A01;
            if (A03[4].charAt(4) != 'b') {
                throw new RuntimeException();
            }
            A03[1] = "FHlvPh";
            map.put(c01926a.A07, c01926a);
        }
        String str2 = c01926a.A07;
        C01966e c01966e = new C01966e(c01926a.A05, c01926a.A06, A08(261, 5, 43), str, str2);
        File A07 = A07(this.A00);
        StringBuilder append = new StringBuilder().append(str2.hashCode());
        String url = A08(2, 4, 85);
        File file = new File(A07, append.append(url).toString());
        if (!file.exists()) {
            C01976f.A04(c02177f, c01966e, false);
            String url2 = A08(232, 7, 0);
            if (str2.startsWith(url2)) {
                String url3 = A08(239, 22, 123);
                if (!str2.startsWith(url3)) {
                    return A04(str2, i2, i);
                }
            }
            return A02(c02177f, c01926a, str);
        }
        C01976f.A04(c02177f, c01966e, true);
        try {
            if (A0C(i2, i)) {
                return AbstractC01996h.A02(file.getCanonicalPath(), i2, i, this.A00);
            }
            String url4 = file.getCanonicalPath();
            return BitmapFactory.decodeFile(url4);
        } catch (IOException e) {
            A0B(e);
            return null;
        }
    }

    private Bitmap A03(String str) {
        byte[] bytes;
        RJ ADy = C0700Rc.A00(this.A00).ADy(str, new RY());
        if (ADy != null && (bytes = ADy.A68()) != null) {
            return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        }
        return null;
    }

    private Bitmap A04(String str, int i, int i2) {
        Bitmap decodeStream;
        int A00;
        try {
            boolean A0C = A0C(i, i2);
            String A08 = A08(232, 7, 0);
            if (A0C) {
                decodeStream = AbstractC01996h.A02(str.substring(A08.length()), i, i2, this.A00);
            } else {
                decodeStream = BitmapFactory.decodeStream(new FileInputStream(str.substring(A08.length())), null, null);
            }
            A00 = A00(str, decodeStream);
        } catch (IOException e) {
            Log.e(A04, A08(105, 43, 38) + str + A08(0, 2, 17), e);
        }
        if (C0478Ih.A0t(this.A00)) {
            if (A00 <= 0) {
                return null;
            }
            return decodeStream;
        }
        return decodeStream;
    }

    private Bitmap A05(String str, int i, int i2) throws IOException {
        URL urlObj = new URL(str);
        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
        connection.setDoInput(true);
        connection.connect();
        InputStream inputStream = connection.getInputStream();
        Bitmap A01 = AbstractC01996h.A01(inputStream, i, i2);
        A0A(inputStream);
        return A01;
    }

    public static C01956d A06(C0888Ym c0888Ym) {
        if (A05 == null) {
            synchronized (C01956d.class) {
                if (A05 == null) {
                    A05 = new C01956d(c0888Ym);
                }
            }
        }
        return A05;
    }

    public static File A07(C02177f c02177f) {
        return c02177f.getCacheDir();
    }

    public static void A0A(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private void A0B(Throwable th) {
        String A08 = A08(261, 5, 43);
        if (th != null) {
            this.A00.A07().A9a(A08, C8A.A1f, new C8B(th));
        } else {
            this.A00.A07().A9a(A08, C8A.A1f, new C8B(A08(77, 28, 125)));
        }
    }

    private boolean A0C(int i, int i2) {
        return i > 0 && i2 > 0 && C0478Ih.A1A(this.A00);
    }

    public final Bitmap A0D(C01926a c01926a) {
        return A01(this.A00, c01926a, c01926a.A04, c01926a.A03, c01926a.A01);
    }

    public final Bitmap A0E(C02177f c02177f, String str, int i, int i2, String str2) {
        C01926a c01926a = this.A01.get(str);
        return (!C01976f.A06(c02177f) || c01926a == null) ? A01(c02177f, new C01926a(str, i, i2, A08(270, 7, 97), A08(270, 7, 97)), i2, i, str2) : A01(c02177f, c01926a, i2, i, str2);
    }

    public final File A0F(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 85));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final String A0G(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 85));
        return file.exists() ? file.getPath() : str;
    }
}
