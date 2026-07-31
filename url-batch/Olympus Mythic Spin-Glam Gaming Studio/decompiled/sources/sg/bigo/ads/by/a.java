package sg.bigo.ads.by;

import android.os.Build;
import com.ironsource.B5;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* loaded from: classes5.dex */
public final class a {
    private static String[] a = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    private static String[] b = {"/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props"};
    private static String[] c = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
    private static String[] d = {"goldfish"};

    public static int a() {
        try {
            if (!e() && !d() && !f()) {
                if (!g()) {
                    return 0;
                }
            }
            return 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String b() {
        return " Build.BOARD = " + Build.BOARD + ", Build.BOOTLOADER = " + Build.BOOTLOADER + ", Build.BRAND = " + Build.BRAND + ", Build.DEVICE = " + Build.DEVICE + ", Build.DISPLAY = " + Build.DISPLAY + ", Build.FINGERPRINT = " + Build.FINGERPRINT + ", Build.HARDWARE = " + Build.HARDWARE + ", Build.HOST = " + Build.HOST + ", Build.MANUFACTURER = " + Build.MANUFACTURER + ", Build.MODEL = " + Build.MODEL + ", Build.PRODUCT = " + Build.PRODUCT + ", Build.TIME = " + Build.TIME + ", Build.TYPE = " + Build.TYPE + ", Build.ID = " + Build.USER + ", Build.VERSION.CODENAME = " + Build.VERSION.CODENAME + ", Build.VERSION.INCREMENTAL = " + Build.VERSION.INCREMENTAL + ", Build.VERSION.RELEASE = " + Build.VERSION.RELEASE + ", Build.VERSION.SDK_INT = " + Build.VERSION.SDK_INT + StringUtils.COMMA;
    }

    public static String c() {
        try {
            Process start = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream(), B5.O));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return sb.toString().toLowerCase();
                }
                sb.append(readLine);
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean d() {
        try {
            for (String str : b) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean e() {
        try {
            for (String str : a) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean f() {
        try {
            for (String str : c) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean g() {
        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
        for (int i = 0; i < 2; i++) {
            File file = fileArr[i];
            if (file.exists() && file.canRead()) {
                byte[] bArr = new byte[1024];
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                String str = new String(bArr);
                for (String str2 : d) {
                    if (str.contains(str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
