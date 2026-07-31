package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.AdNetwork;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
abstract class y {
    private static final String[] a = {"network", POBConstants.KEY_FORMAT, "ad_units"};

    static NetworkConfig a(Context context, AdNetwork adNetwork) {
        NetworkConfig a2;
        if (context == null) {
            return null;
        }
        final String name = adNetwork.getName();
        if (TextUtils.isEmpty(name) || (a2 = a(context, name, adNetwork.getCustomParamsMap())) == null) {
            return null;
        }
        for (AdNetwork.AdUnit adUnit : adNetwork.getAdUnitsList()) {
            AdFormat byRemoteName = AdFormat.byRemoteName(adUnit.getAdFormat());
            if (byRemoteName != null) {
                a2.withMediationConfig(byRemoteName, adUnit.getCustomParamsMap());
            } else {
                Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.y$$ExternalSyntheticLambda0
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String a3;
                        a3 = y.a(name);
                        return a3;
                    }
                });
            }
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b(String str) {
        return String.format("Network (%s) adUnit register fail: %s not provided", str, POBConstants.KEY_FORMAT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c(String str) {
        return String.format("Network (%s) load fail!", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d(String str) {
        return String.format("Network (%s) load fail!", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a(String str) {
        return String.format("Network (%s) adUnit register fail: %s not provided", str, POBConstants.KEY_FORMAT);
    }

    static NetworkConfig a(Context context, JSONObject jSONObject) {
        final String str;
        if (context == null) {
            return null;
        }
        try {
            str = jSONObject.getString("network");
        } catch (Throwable th) {
            th = th;
            str = null;
        }
        try {
            final NetworkConfig a2 = a(context, str, Utils.toMap(jSONObject));
            if (a2 == null) {
                return null;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("ad_units");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                AdFormat byRemoteName = AdFormat.byRemoteName(jSONObject2.getString(POBConstants.KEY_FORMAT));
                if (byRemoteName != null) {
                    a2.withMediationConfig(byRemoteName, a(Utils.toMap(jSONObject2)));
                } else {
                    Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.y$$ExternalSyntheticLambda1
                        @Override // io.bidmachine.utils.lazy.LazyValue
                        public final Object get() {
                            String b;
                            b = y.b(str);
                            return b;
                        }
                    });
                }
            }
            Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.y$$ExternalSyntheticLambda2
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String a3;
                    a3 = y.a(NetworkConfig.this);
                    return a3;
                }
            });
            return a2;
        } catch (Throwable th2) {
            th = th2;
            Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.y$$ExternalSyntheticLambda3
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String c;
                    c = y.c(str);
                    return c;
                }
            });
            Logger.w(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a(NetworkConfig networkConfig) {
        return String.format("Load network from json config completed successfully: %s", networkConfig.getNetworkKey());
    }

    private static NetworkConfig a(Context context, final String str, Map map) {
        x a2 = w.a(context, str);
        if (a2 == null) {
            return null;
        }
        try {
            return (NetworkConfig) Class.forName(a2.b()).getConstructor(Map.class).newInstance(a(map));
        } catch (Throwable th) {
            Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.y$$ExternalSyntheticLambda4
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String d;
                    d = y.d(str);
                    return d;
                }
            });
            Logger.w(th);
            return null;
        }
    }

    private static Map a(Map map) {
        if (map != null) {
            try {
                for (String str : a) {
                    map.remove(str);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }
}
