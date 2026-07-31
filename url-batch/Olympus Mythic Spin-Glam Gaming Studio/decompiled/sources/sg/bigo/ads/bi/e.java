package sg.bigo.ads.bi;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import sg.bigo.ads.bi.f;

/* loaded from: classes6.dex */
class e implements ServiceConnection, IBinder.DeathRecipient {
    private static volatile e c;
    private static final Object d = new Object();
    private final Context e;
    boolean b = false;
    final BlockingQueue<IBinder> a = new LinkedBlockingQueue(1);

    private e(Context context) {
        this.e = context;
    }

    public static e a(Context context) {
        if (c == null) {
            synchronized (e.class) {
                try {
                    if (c == null) {
                        c = new e(context);
                    }
                } finally {
                }
            }
        }
        return c;
    }

    private void a(IBinder iBinder) {
        try {
            synchronized (d) {
                this.a.clear();
                this.a.add(iBinder);
            }
        } catch (Exception unused) {
        }
    }

    private void b() {
        try {
            synchronized (d) {
                this.a.clear();
            }
        } catch (Exception unused) {
        }
    }

    public final f a(long j, TimeUnit timeUnit) {
        try {
            IBinder poll = this.a.poll(j, timeUnit);
            if (poll == null) {
                return null;
            }
            a(poll);
            return f.a.a(poll);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final synchronized void a() {
        if (this.b) {
            try {
                this.b = false;
                b();
                this.e.unbindService(this);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        a();
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        a();
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a(iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        b();
    }
}
