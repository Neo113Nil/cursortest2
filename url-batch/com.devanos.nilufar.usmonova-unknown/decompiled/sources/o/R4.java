package o;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.lang.ref.WeakReference;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class R4 implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ Context i;

    public /* synthetic */ R4(Context context, int i) {
        this.h = i;
        this.i = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c1, code lost:
    
        if (r2 != null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        IA ia;
        Object obj;
        Context context;
        switch (this.h) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context2 = this.i;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i < 33) {
                            ia = V4.j;
                            break;
                        } else {
                            N6 n6 = V4.n;
                            n6.getClass();
                            F6 f6 = new F6(n6);
                            while (true) {
                                if (f6.hasNext()) {
                                    V4 v4 = (V4) ((WeakReference) f6.next()).get();
                                    if (v4 != null && (context = ((LayoutInflaterFactory2C1213i5) v4).r) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                ia = new IA(new KA(T4.a(obj)));
                                if (ia.a.a.isEmpty()) {
                                    String L = AbstractC1052fg.L(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        T4.b(systemService, S4.a(L));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            ia = IA.b;
                            if (ia.a.a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                V4.m = true;
                break;
            case 1:
                (Build.VERSION.SDK_INT >= 28 ? CJ.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new R4(this.i, 2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 2:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new R4(this.i, 3));
                break;
            default:
                AbstractC0022At.N(this.i, new ExecutorC2280yJ(), AbstractC0022At.i, false);
                break;
        }
    }

    public /* synthetic */ R4(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.h = 1;
        this.i = context;
    }
}
