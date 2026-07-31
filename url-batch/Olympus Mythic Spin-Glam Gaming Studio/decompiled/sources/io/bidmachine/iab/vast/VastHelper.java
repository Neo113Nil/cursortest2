package io.bidmachine.iab.vast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public class VastHelper {
    static final WeakHashMap a = new WeakHashMap();
    private static final BroadcastReceiver b = new a();
    private static final IntentFilter c;
    private static boolean d;
    private static boolean e;

    public interface OnScreenStateChangeListener {
        void onScreenStateChange(boolean z);
    }

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (VastHelper.class) {
                boolean unused = VastHelper.e = "android.intent.action.SCREEN_ON".equals(intent.getAction());
            }
            WeakHashMap weakHashMap = VastHelper.a;
            synchronized (weakHashMap) {
                try {
                    Iterator it = weakHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((OnScreenStateChangeListener) it.next()).onScreenStateChange(VastHelper.e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static {
        IntentFilter intentFilter = new IntentFilter();
        c = intentFilter;
        d = false;
        e = false;
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
    }

    public static void addScreenStateChangeListener(@NonNull View view, @NonNull OnScreenStateChangeListener onScreenStateChangeListener) {
        a(view.getContext());
        WeakHashMap weakHashMap = a;
        synchronized (weakHashMap) {
            weakHashMap.put(view, onScreenStateChangeListener);
        }
    }

    public static boolean isScreenOn(Context context) {
        a(context);
        return e;
    }

    public static void removeScreenStateChangeListener(@NonNull View view) {
        if (d) {
            WeakHashMap weakHashMap = a;
            synchronized (weakHashMap) {
                weakHashMap.remove(view);
            }
        }
    }

    private static synchronized void a(Context context) {
        synchronized (VastHelper.class) {
            if (!d) {
                synchronized (VastHelper.class) {
                    try {
                        if (!d) {
                            e = ((PowerManager) context.getSystemService("power")).isScreenOn();
                            context.getApplicationContext().registerReceiver(b, c);
                            d = true;
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
