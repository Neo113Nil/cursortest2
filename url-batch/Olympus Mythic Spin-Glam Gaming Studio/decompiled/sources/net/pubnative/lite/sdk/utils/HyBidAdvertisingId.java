package net.pubnative.lite.sdk.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.X3;
import java.lang.ref.WeakReference;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.network.ApiExecutor;
import net.pubnative.lite.sdk.utils.HyBidAdvertisingId;
import net.pubnative.lite.sdk.utils.reflection.MethodBuilderFactory;
import net.pubnative.lite.sdk.utils.reflection.ReflectionUtils;

/* loaded from: classes14.dex */
public class HyBidAdvertisingId {
    private static final String TAG = "HyBidAdvertisingId";
    private static final String sAdvertisingIdClientClassName = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
    private final WeakReference<Context> mContextRef;

    public interface Listener {
        void onHyBidAdvertisingIdFinish(String str, Boolean bool);
    }

    public HyBidAdvertisingId(Context context) {
        this.mContextRef = new WeakReference<>(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(Listener listener) {
        if (this.mContextRef.get() != null) {
            try {
                ReflectionUtils.MethodBuilder create = MethodBuilderFactory.create(null, "getAdvertisingIdInfo");
                int i = AdvertisingIdClient.$r8$clinit;
                Object execute = create.setStatic(AdvertisingIdClient.class).addParam(Context.class, this.mContextRef.get()).execute();
                post(listener, reflectedGetAdvertisingId(execute, null), reflectedIsLimitAdTrackingEnabled(execute, false));
            } catch (Exception e) {
                HyBid.reportException(e);
                Logger.e(TAG, "Unable to obtain Advertising ID.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$post$1(Listener listener, String str, boolean z) {
        if (listener != null) {
            listener.onHyBidAdvertisingIdFinish(str, Boolean.valueOf(z));
        }
    }

    private static void post(final Listener listener, final String str, final boolean z) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.utils.HyBidAdvertisingId$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                HyBidAdvertisingId.lambda$post$1(HyBidAdvertisingId.Listener.this, str, z);
            }
        }, 0L);
    }

    private String reflectedGetAdvertisingId(Object obj, String str) {
        try {
            return (String) MethodBuilderFactory.create(obj, "getId").execute();
        } catch (Exception e) {
            HyBid.reportException(e);
            return str;
        }
    }

    private boolean reflectedIsLimitAdTrackingEnabled(Object obj, boolean z) {
        try {
            Boolean bool = (Boolean) MethodBuilderFactory.create(obj, X3.j.M).execute();
            return bool != null ? bool.booleanValue() : z;
        } catch (Exception e) {
            HyBid.reportException(e);
            return z;
        }
    }

    public void execute(final Listener listener) {
        ApiExecutor.getInstance().execute(new Runnable() { // from class: net.pubnative.lite.sdk.utils.HyBidAdvertisingId$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                HyBidAdvertisingId.this.lambda$execute$0(listener);
            }
        });
    }
}
