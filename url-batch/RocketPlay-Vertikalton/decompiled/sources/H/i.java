package H;

import B1.p;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final o.f f558a = new o.f(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f559b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f560c;
    public static final o.k d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new l());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f559b = threadPoolExecutor;
        f560c = new Object();
        d = new o.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h a(String str, Context context, e eVar, int i) {
        o.f fVar = f558a;
        Typeface typeface = (Typeface) fVar.a(str);
        if (typeface != null) {
            return new h(typeface);
        }
        try {
            p a2 = d.a(context, eVar);
            int i2 = 1;
            j[] jVarArr = (j[]) a2.f223b;
            int i3 = a2.f222a;
            if (i3 != 0) {
                if (i3 == 1) {
                    i2 = -2;
                    if (i2 != 0) {
                        return new h(i2);
                    }
                    Typeface w2 = C.h.f238a.w(context, jVarArr, i);
                    if (w2 == null) {
                        return new h(-3);
                    }
                    fVar.b(str, w2);
                    return new h(w2);
                }
                i2 = -3;
                if (i2 != 0) {
                }
            } else {
                if (jVarArr != null && jVarArr.length != 0) {
                    int length = jVarArr.length;
                    i2 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        int i5 = jVarArr[i4].f564e;
                        if (i5 == 0) {
                            i4++;
                        } else if (i5 >= 0) {
                            i2 = i5;
                        }
                    }
                }
                if (i2 != 0) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new h(-1);
        }
    }
}
