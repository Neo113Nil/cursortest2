package com.inmobi.media;

import android.os.Debug;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.vf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4420vf {
    public static final CrashConfig a;

    static {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
        a = (CrashConfig) AbstractC4015g4.a.a(CrashConfig.class);
        System.currentTimeMillis();
    }

    public static void a(JSONObject payload, boolean z, boolean z2, long j) {
        int i;
        int i2;
        long j2;
        long j3;
        long[] jArr;
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (a.getCrashConfig().getReportOOMInfo() && z) {
            AbstractC3988f5 crashType = z2 ? C3960e5.d : C3908c5.d;
            Intrinsics.checkNotNullParameter(crashType, "type");
            Qa a2 = AbstractC3939da.a();
            if (a2 != null) {
                String key = crashType.c;
                Intrinsics.checkNotNullParameter(key, "key");
                a2.a(crashType.c, a2.a.getInt(key, 0) + 1, true);
            }
            Intrinsics.checkNotNullParameter(crashType, "crashType");
            Qa a3 = AbstractC3939da.a();
            if (a3 != null) {
                String key2 = crashType.a;
                Intrinsics.checkNotNullParameter(key2, "key");
                long j4 = a3.a.getLong(key2, 0L);
                String str = crashType.b;
                if (j4 == 0) {
                    a3.a(str, j, true);
                } else {
                    a3.a(str, j - j4, true);
                }
            }
            if (z2) {
                C3960e5 crashType2 = C3960e5.d;
                Intrinsics.checkNotNullParameter(crashType2, "type");
                Qa a4 = AbstractC3939da.a();
                if (a4 != null) {
                    String key3 = crashType2.c;
                    Intrinsics.checkNotNullParameter(key3, "key");
                    i = a4.a.getInt(key3, 0);
                } else {
                    i = 0;
                }
                C3908c5 crashType3 = C3908c5.d;
                Intrinsics.checkNotNullParameter(crashType3, "type");
                Qa a5 = AbstractC3939da.a();
                if (a5 != null) {
                    String key4 = crashType3.c;
                    Intrinsics.checkNotNullParameter(key4, "key");
                    i2 = a5.a.getInt(key4, 0);
                } else {
                    i2 = 0;
                }
                int i3 = i + i2;
                float f = i3 > 0 ? (i * 100.0f) / i3 : 0.0f;
                payload.put("inmobiOOMCount", i);
                payload.put("appOOMCount", i2);
                Intrinsics.checkNotNullParameter(crashType3, "crashType");
                Qa a6 = AbstractC3939da.a();
                if (a6 != null) {
                    String key5 = crashType3.b;
                    Intrinsics.checkNotNullParameter(key5, "key");
                    j2 = a6.a.getLong(key5, 0L);
                } else {
                    j2 = 0;
                }
                payload.put("appOomCrashInterval", j2);
                Intrinsics.checkNotNullParameter(crashType2, "crashType");
                Qa a7 = AbstractC3939da.a();
                if (a7 != null) {
                    String key6 = crashType2.b;
                    Intrinsics.checkNotNullParameter(key6, "key");
                    j3 = a7.a.getLong(key6, 0L);
                } else {
                    j3 = 0;
                }
                payload.put("inmOOMCrashInterval", j3);
                payload.put("oomRatioInMobiToApp", Float.valueOf(f));
                F5.a.getClass();
                if (F5.y()) {
                    long j5 = 0;
                    long j6 = 0;
                    for (Map.Entry<String, String> entry : Debug.getRuntimeStats().entrySet()) {
                        String key7 = entry.getKey();
                        String value = entry.getValue();
                        if (Intrinsics.areEqual(key7, "art.gc.blocking-gc-count")) {
                            Intrinsics.checkNotNull(value);
                            Long longOrNull = StringsKt.toLongOrNull(value);
                            j5 = longOrNull != null ? longOrNull.longValue() : 0L;
                        } else if (Intrinsics.areEqual(key7, "art.gc.gc-count")) {
                            Intrinsics.checkNotNull(value);
                            Long longOrNull2 = StringsKt.toLongOrNull(value);
                            j6 = longOrNull2 != null ? longOrNull2.longValue() : 0L;
                        }
                    }
                    jArr = new long[]{j5, j6};
                } else {
                    jArr = null;
                }
                if (jArr != null) {
                    payload.put("blockingGcCount", jArr[0]);
                    payload.put("gcCount", jArr[1]);
                }
            }
        }
    }
}
