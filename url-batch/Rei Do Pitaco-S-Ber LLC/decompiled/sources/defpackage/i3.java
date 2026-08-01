package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class i3 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Context g;

    public /* synthetic */ i3(Context context, int i) {
        this.f = i;
        this.g = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        oq oqVar;
        Object obj;
        Context context;
        int i = this.f;
        Context context2 = this.g;
        switch (i) {
            case 0:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i2 < 33) {
                            oqVar = o3.h;
                            break;
                        } else {
                            n6 n6Var = o3.l;
                            n6Var.getClass();
                            h6 h6Var = new h6(n6Var);
                            while (true) {
                                if (h6Var.hasNext()) {
                                    o3 o3Var = (o3) ((WeakReference) h6Var.next()).get();
                                    if (o3Var != null && (context = ((c4) o3Var).p) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                oqVar = new oq(new pq(k3.a(obj)));
                                if (oqVar.a.a.isEmpty()) {
                                    String I = vv.I(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        k3.b(systemService, j3.a(I));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            oqVar = oq.b;
                            if (oqVar.a.a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                o3.k = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new i3(context2, 2));
                break;
            default:
                oo.S(context2, new vw(), oo.k, false);
                break;
        }
    }
}
