package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.g9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4020g9 extends AbstractC4091j2 {
    public static final C4020g9 c = new C4020g9();
    public static final AtomicBoolean d = new AtomicBoolean(true);

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        AtomicBoolean atomicBoolean = d;
        jSONObject.put("a-audioBannerEnabled", String.valueOf(atomicBoolean.get()));
        if (atomicBoolean.get()) {
            long j = this.a / 1000;
            if (j != 0) {
                jSONObject.put("a-lastAudioBannerPlayedTs", String.valueOf(j));
            }
            int i = this.b;
            if (i > 0) {
                jSONObject.put("a-audioBannerFreq", String.valueOf(i));
            }
            Context context = AbstractC4002fj.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Qa a = Pa.a(context, "banner_audio_pref_file");
                Intrinsics.checkNotNullParameter("user_mute_count", "key");
                int i2 = a.a.getInt("user_mute_count", -1);
                if (i2 > 0) {
                    jSONObject.put("a-b-umc", String.valueOf(i2));
                }
            }
        }
        return jSONObject;
    }
}
