package o;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.messaging.ServiceStarter;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: o.Rb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0445Rb extends BroadcastReceiver {
    private static SoftReference zza;
    private static SoftReference zzb;

    public final int a(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            onNotificationDismissed(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return ServiceStarter.ERROR_UNKNOWN;
    }

    public Executor getBroadcastExecutor() {
        ExecutorService executorService;
        synchronized (AbstractC0445Rb.class) {
            try {
                SoftReference softReference = zza;
                executorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorService == null) {
                    executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new ThreadFactoryC1024fE("firebase-iid-executor")));
                    zza = new SoftReference(executorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public abstract int onMessageReceive(Context context, C0419Qb c0419Qb);

    public abstract void onNotificationDismissed(Context context, Bundle bundle);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        getBroadcastExecutor().execute(new Runnable() { // from class: o.Z20
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0445Rb.this.zza(intent, context, isOrderedBroadcast, goAsync);
            }
        });
    }

    public final /* synthetic */ void zza(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        Executor executor;
        int i;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                i = a(context, intent2);
            } else if (intent.getExtras() == null) {
                i = ServiceStarter.ERROR_UNKNOWN;
            } else {
                C0419Qb c0419Qb = new C0419Qb(intent);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (AbstractC0445Rb.class) {
                    try {
                        SoftReference softReference = zzb;
                        executor = softReference != null ? (Executor) softReference.get() : null;
                        if (executor == null) {
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1024fE("pscm-ack-executor"));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            zzb = new SoftReference(executor);
                        }
                    } finally {
                    }
                }
                executor.execute(new MN(context, c0419Qb, countDownLatch));
                int onMessageReceive = onMessageReceive(context, c0419Qb);
                try {
                    if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                        Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e) {
                    Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e.toString()));
                }
                i = onMessageReceive;
            }
            if (z && pendingResult != null) {
                pendingResult.setResultCode(i);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th;
        }
    }
}
