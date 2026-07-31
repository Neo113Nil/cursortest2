package yads;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes15.dex */
public final class fd2 {
    public final Context a;

    public fd2(Context context) {
        this.a = context.getApplicationContext();
    }

    public final dd2 a() {
        Object systemService = this.a.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        Boolean valueOf = powerManager != null ? Boolean.valueOf(powerManager.isInteractive()) : null;
        if (!(valueOf != null ? valueOf.booleanValue() : true)) {
            return dd2.c;
        }
        Object systemService2 = this.a.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
        return keyguardManager != null ? keyguardManager.isKeyguardLocked() : false ? dd2.b : dd2.d;
    }
}
