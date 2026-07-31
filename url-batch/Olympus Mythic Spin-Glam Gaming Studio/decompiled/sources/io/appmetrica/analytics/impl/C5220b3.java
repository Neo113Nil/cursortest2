package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.b3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5220b3 implements Ck {
    public final ArrayList a;
    public Intent b;
    public final Context c;
    public final W5 d;
    public final IHandlerExecutor e;

    public C5220b3(@NonNull Context context, @NonNull IHandlerExecutor iHandlerExecutor) {
        this(context, iHandlerExecutor, 0);
    }

    @Nullable
    public final synchronized Intent a(@NonNull Consumer<Intent> consumer) {
        this.a.add(consumer);
        return this.b;
    }

    public final void b() {
        this.b = null;
        W5 w5 = this.d;
        Context context = this.c;
        synchronized (w5) {
            if (w5.b) {
                try {
                    context.unregisterReceiver(w5.a);
                    w5.b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ck
    public final synchronized void onCreate() {
        Intent a = a();
        this.b = a;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(a);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ck
    public final synchronized void onDestroy() {
        this.b = null;
        b();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }

    public C5220b3(Context context, IHandlerExecutor iHandlerExecutor, int i) {
        this.a = new ArrayList();
        this.b = null;
        this.c = context;
        this.e = iHandlerExecutor;
        this.d = V5.a(new G2(new C5194a3(this), iHandlerExecutor));
    }

    public final Intent a() {
        Intent intent;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        W5 w5 = this.d;
        Context context = this.c;
        IHandlerExecutor iHandlerExecutor = this.e;
        synchronized (w5) {
            intent = null;
            try {
                intent = context.registerReceiver(w5.a, intentFilter, null, iHandlerExecutor.getHandler());
                w5.b = true;
            } catch (Throwable unused) {
            }
        }
        return intent;
    }
}
