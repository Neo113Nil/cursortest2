package com.inmobi.media;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorEntity;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.sdk.AppLovinSdk;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.signals.adinfo.SignalCollector;
import com.ironsource.C4538a2;
import com.unity3d.services.core.fid.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class Mc {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static final SignalsConfig b;
    public static final String c;
    public static final Lazy d;
    public static final Lazy e;
    public static Boolean f;
    public static final Function2 g;

    static {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        SignalsConfig signalsConfig = (SignalsConfig) AbstractC4015g4.a.a(SignalsConfig.class);
        b = signalsConfig;
        String topic = signalsConfig.getPublisher().getAuto().getTopic();
        if (topic.length() == 0) {
            topic = com.moloco.sdk.internal.ilrd.provider.a.k;
        }
        c = topic;
        d = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Mc$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Mc.d();
            }
        });
        e = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Mc$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Boolean.valueOf(Mc.b());
            }
        });
        g = new Function2() { // from class: com.inmobi.media.Mc$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Mc.a((Bundle) obj, (String) obj2);
            }
        };
    }

    public static final Unit a(Bundle bundle, String topic) {
        LinkedHashMap a2;
        Intrinsics.checkNotNullParameter(topic, "topic");
        if (bundle != null) {
            try {
                if (Intrinsics.areEqual(topic, c) && (a2 = a(bundle)) != null) {
                    C4000fh.a.getClass();
                    C4000fh.a(a2);
                    a2.toString();
                }
            } catch (Throwable unused) {
            }
        }
        return Unit.INSTANCE;
    }

    public static final boolean b() {
        try {
            int i = AppLovinCommunicator.$r8$clinit;
            if (!Intrinsics.areEqual(AppLovinCommunicator.class.getMethod(Constants.GET_INSTANCE, null).getReturnType(), AppLovinCommunicator.class)) {
                return false;
            }
            int i2 = AppLovinCommunicatorMessage.$r8$clinit;
            if (Intrinsics.areEqual(AppLovinCommunicatorSubscriber.class.getMethod("onMessageReceived", AppLovinCommunicatorMessage.class).getReturnType(), Void.TYPE)) {
                return Intrinsics.areEqual(AppLovinCommunicatorEntity.class.getMethod("getCommunicatorId", null).getReturnType(), String.class);
            }
            return false;
        } catch (Error | Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r2 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c() {
        String str;
        Boolean bool = f;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            String str2 = AppLovinSdk.VERSION;
            Object obj = AppLovinSdk.class.getField("VERSION").get(null);
            str = obj instanceof String ? (String) obj : null;
        } catch (Throwable unused) {
        }
        str = C4538a2.f;
        List<String> incompatibleSdkVer = b.getPublisher().getAuto().getIncompatibleSdkVer();
        Objects.toString(incompatibleSdkVer);
        boolean z = Intrinsics.areEqual(str, C4538a2.f) || incompatibleSdkVer.contains(str);
        f = Boolean.valueOf(z);
        return z;
    }

    public static final SignalCollector d() {
        return new SignalCollector(CollectionsKt.listOf(c));
    }

    public static void a() {
        if (b.getPublisher().getAuto().getEnabled() && !c() && ((Boolean) e.getValue()).booleanValue() && c.length() != 0 && a.compareAndSet(false, true)) {
            ((SignalCollector) d.getValue()).setupAppLovinCommunicator(g);
        }
    }

    public static LinkedHashMap a(Bundle data) {
        boolean z;
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(data, "data");
        if (!a.get()) {
            return null;
        }
        SignalsConfig signalsConfig = b;
        if (!signalsConfig.getPublisher().getAuto().getEnabled()) {
            return null;
        }
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = signalsConfig.getPublisher().getAuto().getAllowedKeys();
        if (allowedKeys.isEmpty()) {
            return null;
        }
        Objects.toString(allowedKeys.keySet());
        Set<String> keySet = data.keySet();
        if (keySet.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.checkNotNull(keySet);
        if (keySet.contains("ad_format") && (obj2 = data.get("ad_format")) != null) {
            linkedHashMap.put("auto_type", obj2);
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (!z) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        for (Map.Entry<String, SignalsConfig.PublisherConfig.KeyData> entry : allowedKeys.entrySet()) {
            String key = entry.getKey();
            SignalsConfig.PublisherConfig.KeyData value = entry.getValue();
            if (keySet.contains(key)) {
                String name = value.getName();
                if (N3.a(name) && (obj = data.get(key)) != null) {
                    linkedHashMap.put(name, obj);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }
}
