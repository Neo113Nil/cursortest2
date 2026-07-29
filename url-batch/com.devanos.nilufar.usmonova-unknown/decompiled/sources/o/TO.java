package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class TO {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final C0998es c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f;
    public T20 g;
    public final GR a = new GR(0);
    public final Messenger e = new Messenger(new K20(this, Looper.getMainLooper()));

    public TO(Context context) {
        this.b = context;
        this.c = new C0998es(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public final p30 a(Bundle bundle) {
        String num;
        synchronized (TO.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        NU nu = new NU();
        synchronized (this.a) {
            this.a.put(num, nu);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.b;
        synchronized (TO.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, G20.a);
                }
                intent.putExtra("app", i);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f != null || this.g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.g.h;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            nu.a.a(ExecutorC2239xi.k, new ZZ(this, num, this.d.schedule(new R2(14, nu), 30L, TimeUnit.SECONDS)));
            return nu.a;
        }
        if (this.c.b() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        nu.a.a(ExecutorC2239xi.k, new ZZ(this, num, this.d.schedule(new R2(14, nu), 30L, TimeUnit.SECONDS)));
        return nu.a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.a) {
            try {
                NU nu = (NU) this.a.remove(str);
                if (nu != null) {
                    nu.b(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
