package yads;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public abstract class a92 {
    public static void a(Context context, d92 d92Var) {
        Executor mainExecutor;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            z82 z82Var = new z82(d92Var);
            mainExecutor = context.getMainExecutor();
            telephonyManager.registerTelephonyCallback(mainExecutor, z82Var);
            telephonyManager.unregisterTelephonyCallback(z82Var);
        } catch (RuntimeException unused) {
            d92Var.a(5);
        }
    }
}
