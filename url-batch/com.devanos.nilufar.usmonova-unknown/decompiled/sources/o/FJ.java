package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class FJ {
    public static final RN a = new RN();
    public static final Object b = new Object();
    public static C0140Fh c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? DJ.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static C0140Fh b() {
        C0140Fh c0140Fh = new C0140Fh(18);
        c = c0140Fh;
        a.set(c0140Fh);
        return c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:80)(1:18)|19|(1:79)(1:23)|24|25|26|(2:64|65)(1:28)|29|(9:36|(1:40)|(1:47)|48|(2:56|57)|52|53|54|55)|(1:63)|(1:40)|(3:42|45|47)|48|(1:50)|56|57|52|53|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009e, code lost:
    
        r6 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z) {
        EJ a2;
        EJ ej;
        int i;
        if (z || c == null) {
            synchronized (b) {
                if (!z) {
                    try {
                        if (c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28 && i2 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i3 = 0;
                    boolean z2 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z3 = file2.exists() && length2 > 0;
                    try {
                        long a3 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a2 = EJ.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            a2 = null;
                        }
                        if (a2 != null && a2.c == a3 && (i = a2.b) != 2) {
                            i3 = i;
                            if (z && z3 && i3 != 1) {
                                i3 = 2;
                            }
                            if (a2 != null && a2.b == 2 && i3 == 1 && length < a2.d) {
                                i3 = 3;
                            }
                            ej = new EJ(1, i3, a3, length2);
                            if (a2 != null || !a2.equals(ej)) {
                                ej.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z3) {
                            i3 = 2;
                        }
                        if (z) {
                            i3 = 2;
                        }
                        if (a2 != null) {
                            i3 = 3;
                        }
                        ej = new EJ(1, i3, a3, length2);
                        if (a2 != null) {
                        }
                        ej.b(file3);
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
