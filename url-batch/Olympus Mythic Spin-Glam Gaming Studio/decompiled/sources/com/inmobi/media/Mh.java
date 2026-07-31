package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class Mh {
    public final C4067i4 a;
    public final Lazy b;

    public Mh(C4067i4 configDao) {
        Intrinsics.checkNotNullParameter(configDao, "configDao");
        this.a = configDao;
        this.b = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Mh$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Mh.a();
            }
        });
    }

    public static final Sh a() {
        return new Sh((F9) Ve.b.getValue());
    }

    public static final ArrayList a(Mh mh) {
        C4382u4 c4382u4;
        C4382u4 c4382u42;
        C4382u4 c4382u43;
        C4382u4 c4382u44;
        C4382u4 c4382u45;
        ArrayList arrayList = new ArrayList();
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        C4277q4 c4277q42 = AbstractC4015g4.a;
        RootConfig rootConfig = (RootConfig) c4277q42.a(RootConfig.class);
        if (a(rootConfig, RootConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig2 = (RootConfig) c4277q42.a(RootConfig.class);
            if (Intrinsics.areEqual(RootConfig.class, RootConfig.class)) {
                c4382u45 = new C4382u4(rootConfig2.getUrlForType("root"), rootConfig2);
            } else {
                Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
                Config a = c4277q42.a(RootConfig.class);
                c4382u45 = new C4382u4(rootConfig2.getUrlForType(a.getType()), a);
            }
            arrayList.add(c4382u45);
            return arrayList;
        }
        if (a(rootConfig, AdConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig3 = (RootConfig) c4277q42.a(RootConfig.class);
            if (Intrinsics.areEqual(AdConfig.class, RootConfig.class)) {
                c4382u44 = new C4382u4(rootConfig3.getUrlForType("root"), rootConfig3);
            } else {
                Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
                Config a2 = c4277q42.a(AdConfig.class);
                c4382u44 = new C4382u4(rootConfig3.getUrlForType(a2.getType()), a2);
            }
            arrayList.add(c4382u44);
        }
        if (a(rootConfig, TelemetryConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig4 = (RootConfig) c4277q42.a(RootConfig.class);
            if (Intrinsics.areEqual(TelemetryConfig.class, RootConfig.class)) {
                c4382u43 = new C4382u4(rootConfig4.getUrlForType("root"), rootConfig4);
            } else {
                Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
                Config a3 = c4277q42.a(TelemetryConfig.class);
                c4382u43 = new C4382u4(rootConfig4.getUrlForType(a3.getType()), a3);
            }
            arrayList.add(c4382u43);
        }
        if (a(rootConfig, SignalsConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig5 = (RootConfig) c4277q42.a(RootConfig.class);
            if (Intrinsics.areEqual(SignalsConfig.class, RootConfig.class)) {
                c4382u42 = new C4382u4(rootConfig5.getUrlForType("root"), rootConfig5);
            } else {
                Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                Config a4 = c4277q42.a(SignalsConfig.class);
                c4382u42 = new C4382u4(rootConfig5.getUrlForType(a4.getType()), a4);
            }
            arrayList.add(c4382u42);
        }
        if (a(rootConfig, CrashConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig6 = (RootConfig) c4277q42.a(RootConfig.class);
            if (Intrinsics.areEqual(CrashConfig.class, RootConfig.class)) {
                c4382u4 = new C4382u4(rootConfig6.getUrlForType("root"), rootConfig6);
            } else {
                Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
                Config a5 = c4277q42.a(CrashConfig.class);
                c4382u4 = new C4382u4(rootConfig6.getUrlForType(a5.getType()), a5);
            }
            arrayList.add(c4382u4);
        }
        return arrayList;
    }

    public static boolean a(RootConfig rootConfig, Class clazz) {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Config a = AbstractC4015g4.a.a(clazz);
        return a == null || System.currentTimeMillis() - a.getLastUpdateTimeStamp() > rootConfig.getExpiryInMillisForType(B4.a(clazz));
    }
}
