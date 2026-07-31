package com.smaato.sdk.ng.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.X3;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.network.ApiExecutor;
import com.smaato.sdk.ng.utils.NextGenAdvertisingId;
import com.smaato.sdk.ng.utils.reflection.MethodBuilderFactory;
import com.smaato.sdk.ng.utils.reflection.ReflectionUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public class NextGenAdvertisingId {
    private static final String b = "NextGenAdvertisingId";
    private final WeakReference<Context> a;

    public interface Listener {
        void onNextGenAdvertisingIdFinish(String str, Boolean bool);
    }

    public NextGenAdvertisingId(Context context) {
        this.a = new WeakReference<>(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Listener listener) {
        if (this.a.get() != null) {
            try {
                ReflectionUtils.MethodBuilder create = MethodBuilderFactory.create(null, "getAdvertisingIdInfo");
                int i = AdvertisingIdClient.$r8$clinit;
                Object execute = create.setStatic(AdvertisingIdClient.class).addParam(Context.class, this.a.get()).execute();
                b(listener, a(execute, (String) null), a(execute, false));
            } catch (Exception e) {
                NextGen.reportException(e);
                Logger.e(b, "Unable to obtain Advertising ID.");
            }
        }
    }

    private static void b(final Listener listener, final String str, final boolean z) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.smaato.sdk.ng.utils.NextGenAdvertisingId$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                NextGenAdvertisingId.a(NextGenAdvertisingId.Listener.this, str, z);
            }
        }, 0L);
    }

    public void execute(final Listener listener) {
        ApiExecutor.getInstance().execute(new Runnable() { // from class: com.smaato.sdk.ng.utils.NextGenAdvertisingId$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                NextGenAdvertisingId.this.a(listener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Listener listener, String str, boolean z) {
        if (listener != null) {
            listener.onNextGenAdvertisingIdFinish(str, Boolean.valueOf(z));
        }
    }

    private String a(Object obj, String str) {
        try {
            return (String) MethodBuilderFactory.create(obj, "getId").execute();
        } catch (Exception e) {
            NextGen.reportException(e);
            return str;
        }
    }

    private boolean a(Object obj, boolean z) {
        try {
            Boolean bool = (Boolean) MethodBuilderFactory.create(obj, X3.j.M).execute();
            return bool != null ? bool.booleanValue() : z;
        } catch (Exception e) {
            NextGen.reportException(e);
            return z;
        }
    }
}
