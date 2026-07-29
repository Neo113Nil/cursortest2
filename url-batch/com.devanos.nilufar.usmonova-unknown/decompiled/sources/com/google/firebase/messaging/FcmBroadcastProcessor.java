package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o.C1574nc;
import o.CallableC0144Fl;
import o.DY;
import o.ExecutorC2280yJ;
import o.InterfaceC2301ye;
import o.MU;
import o.PX;

/* loaded from: classes.dex */
public class FcmBroadcastProcessor {
    private static final String EXTRA_BINARY_DATA = "rawData";
    private static final String EXTRA_BINARY_DATA_BASE_64 = "gcm.rawData64";
    private static WithinAppServiceConnection fcmServiceConn;
    private static final Object lock = new Object();
    private final Context context;
    private final Executor executor;

    public FcmBroadcastProcessor(Context context) {
        this.context = context;
        this.executor = new ExecutorC2280yJ();
    }

    private static MU bindToMessagingService(Context context, Intent intent, boolean z) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Binding to service");
        }
        WithinAppServiceConnection serviceConnection = getServiceConnection(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z) {
            return serviceConnection.sendIntent(intent).d(new ExecutorC2280yJ(), new C1574nc(7));
        }
        if (ServiceStarter.getInstance().hasWakeLockPermission(context)) {
            WakeLockHolder.sendWakefulServiceIntent(context, serviceConnection, intent);
        } else {
            serviceConnection.sendIntent(intent);
        }
        return DY.i(-1);
    }

    private static WithinAppServiceConnection getServiceConnection(Context context, String str) {
        WithinAppServiceConnection withinAppServiceConnection;
        synchronized (lock) {
            try {
                if (fcmServiceConn == null) {
                    fcmServiceConn = new WithinAppServiceConnection(context, str);
                }
                withinAppServiceConnection = fcmServiceConn;
            } catch (Throwable th) {
                throw th;
            }
        }
        return withinAppServiceConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$bindToMessagingService$3(MU mu) {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$startMessagingService$0(Context context, Intent intent) {
        return Integer.valueOf(ServiceStarter.getInstance().startMessagingService(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$startMessagingService$1(MU mu) {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MU lambda$startMessagingService$2(Context context, Intent intent, boolean z, MU mu) {
        return (PX.d0() && ((Integer) mu.g()).intValue() == 402) ? bindToMessagingService(context, intent, z).d(new ExecutorC2280yJ(), new C1574nc(6)) : mu;
    }

    public static void reset() {
        synchronized (lock) {
            fcmServiceConn = null;
        }
    }

    public static void setServiceConnection(WithinAppServiceConnection withinAppServiceConnection) {
        synchronized (lock) {
            fcmServiceConn = withinAppServiceConnection;
        }
    }

    public MU process(Intent intent) {
        String stringExtra = intent.getStringExtra(EXTRA_BINARY_DATA_BASE_64);
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra(EXTRA_BINARY_DATA_BASE_64);
        }
        return startMessagingService(this.context, intent);
    }

    @SuppressLint({"InlinedApi"})
    public MU startMessagingService(final Context context, final Intent intent) {
        boolean z = PX.d0() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? DY.e(this.executor, new CallableC0144Fl(context, 0, intent)).e(this.executor, new InterfaceC2301ye() { // from class: o.Gl
            @Override // o.InterfaceC2301ye
            public final Object n(MU mu) {
                MU lambda$startMessagingService$2;
                lambda$startMessagingService$2 = FcmBroadcastProcessor.lambda$startMessagingService$2(context, intent, z2, mu);
                return lambda$startMessagingService$2;
            }
        }) : bindToMessagingService(context, intent, z2);
    }

    public FcmBroadcastProcessor(Context context, ExecutorService executorService) {
        this.context = context;
        this.executor = executorService;
    }
}
