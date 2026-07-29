package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: o.eo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0994eo {
    public static final C1679pB a = new C1679pB(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final GR d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new LN());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new GR(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0863co a(String str, Context context, C1216i8 c1216i8, int i) {
        C1679pB c1679pB = a;
        Typeface typeface = (Typeface) c1679pB.a(str);
        if (typeface != null) {
            return new C0863co(typeface);
        }
        try {
            C1143h2 A = AbstractC1052fg.A(context, c1216i8);
            C1718po[] c1718poArr = (C1718po[]) A.i;
            int i2 = A.h;
            int i3 = 1;
            if (i2 != 0) {
                if (i2 == 1) {
                    i3 = -2;
                    if (i3 != 0) {
                        return new C0863co(i3);
                    }
                    Typeface g = BX.a.g(context, c1718poArr, i);
                    if (g == null) {
                        return new C0863co(-3);
                    }
                    c1679pB.b(str, g);
                    return new C0863co(g);
                }
                i3 = -3;
                if (i3 != 0) {
                }
            } else {
                if (c1718poArr != null && c1718poArr.length != 0) {
                    int length = c1718poArr.length;
                    i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        int i5 = c1718poArr[i4].e;
                        if (i5 == 0) {
                            i4++;
                        } else if (i5 >= 0) {
                            i3 = i5;
                        }
                    }
                }
                if (i3 != 0) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0863co(-1);
        }
    }
}
