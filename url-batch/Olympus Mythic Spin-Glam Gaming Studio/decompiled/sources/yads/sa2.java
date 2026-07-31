package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public abstract class sa2 {
    public static final lv3 a = new lv3();

    public static void a(Context context) {
        lv3 lv3Var = a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Application Context cannot be null");
        }
        if (lv3Var.a) {
            return;
        }
        lv3Var.a = true;
        lw3 a2 = lw3.a();
        dv3 dv3Var = a2.b;
        a2.c = new xv3(new Handler(), applicationContext, new tu3(), a2);
        ev3.d.a(applicationContext);
        wu3.a(applicationContext);
        WindowManager windowManager = ov3.a;
        ov3.c = applicationContext.getResources().getDisplayMetrics().density;
        ov3.a = (WindowManager) applicationContext.getSystemService("window");
        applicationContext.registerReceiver(new yv3(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        hw3.b.a = applicationContext.getApplicationContext();
        uu3 uu3Var = uu3.e;
        if (!uu3Var.b) {
            uu3Var.c.a(applicationContext);
            uv3 uv3Var = uu3Var.c;
            uv3Var.c = uu3Var;
            uv3Var.b();
            uu3Var.d = uu3Var.c.b;
            uu3Var.b = true;
        }
        nw3.d.a = new WeakReference(applicationContext);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        applicationContext.registerReceiver(new mw3(), intentFilter);
    }
}
