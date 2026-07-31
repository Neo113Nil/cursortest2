package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class d92 {
    public static d92 e;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final Object c = new Object();
    public int d = 0;

    public d92(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new c92(this), intentFilter);
    }

    public static synchronized d92 a(Context context) {
        d92 d92Var;
        synchronized (d92.class) {
            try {
                if (e == null) {
                    e = new d92(context);
                }
                d92Var = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d92Var;
    }

    public final void b(final b92 b92Var) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.b.remove(weakReference);
            }
        }
        this.b.add(new WeakReference(b92Var));
        this.a.post(new Runnable() { // from class: yads.d92$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                d92.this.a(b92Var);
            }
        });
    }

    public final /* synthetic */ void a(b92 b92Var) {
        b92Var.a(a());
    }

    public final int a() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public static int b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 1;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 2;
                }
                if (type == 9) {
                    return 7;
                }
                if (type != 4 && type != 5) {
                    return type != 6 ? 8 : 5;
                }
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                    return 3;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 14:
                case 15:
                case 17:
                    return 4;
                case 13:
                    return 5;
                case 16:
                case 19:
                default:
                    return 6;
                case 18:
                    return 2;
                case 20:
                    return sb3.a >= 29 ? 9 : 0;
            }
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public final void a(int i) {
        synchronized (this.c) {
            try {
                if (this.d == i) {
                    return;
                }
                this.d = i;
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    b92 b92Var = (b92) weakReference.get();
                    if (b92Var != null) {
                        b92Var.a(i);
                    } else {
                        this.b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
