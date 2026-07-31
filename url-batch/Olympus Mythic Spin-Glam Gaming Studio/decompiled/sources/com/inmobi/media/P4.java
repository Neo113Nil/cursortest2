package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class P4 implements A4 {
    @Override // com.inmobi.media.A4
    public final void a(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        synchronized (this) {
            try {
                S4 s4 = S4.a;
                Intrinsics.checkNotNullExpressionValue("S4", "access$getTAG$p(...)");
                S4 s42 = S4.a;
                C4277q4 c4277q4 = AbstractC4015g4.a;
                Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                C4277q4 c4277q42 = AbstractC4015g4.a;
                S4.e = AbstractC3989f6.a(((SignalsConfig) c4277q42.a(SignalsConfig.class)).getKA());
                Context context = AbstractC4002fj.a;
                if (context != null) {
                    Intrinsics.checkNotNullExpressionValue("S4", "TAG");
                    ConcurrentHashMap concurrentHashMap = Qa.b;
                    Qa a = Pa.a(context, "c_data_store");
                    Context context2 = AbstractC4002fj.a;
                    int i = 1;
                    if (context2 != null) {
                        Qa a2 = Pa.a(context2, "c_data_store");
                        Intrinsics.checkNotNullParameter("akv", "key");
                        i = a2.a.getInt("akv", 1);
                    }
                    Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                    if (((SignalsConfig) c4277q42.a(SignalsConfig.class)).getVAK() != i) {
                        Intrinsics.checkNotNullExpressionValue("S4", "TAG");
                        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                        a.a("akv", ((SignalsConfig) c4277q42.a(SignalsConfig.class)).getVAK(), false);
                        s42.f();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
