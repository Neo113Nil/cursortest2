package yads;

import android.view.View;
import java.util.LinkedHashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes9.dex */
public final class ag3 implements Runnable {
    public final /* synthetic */ bg3 b;

    public ag3(bg3 bg3Var) {
        this.b = bg3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bg3 bg3Var = this.b;
        if (!bg3Var.d) {
            if (bg3Var.a.a.contains(rg3.d)) {
                jg3 jg3Var = this.b.b;
                mg3 mg3Var = jg3Var.d;
                pi3 pi3Var = jg3Var.e;
                pi3Var.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!TypeIntrinsics.isMutableMap(linkedHashMap)) {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                View view = pi3Var.b.getView();
                Integer valueOf = view != null ? Integer.valueOf(view.getHeight()) : null;
                Integer valueOf2 = view != null ? Integer.valueOf(view.getWidth()) : null;
                gl1 gl1Var = pi3Var.a.c;
                if (valueOf == null || valueOf.intValue() <= 0) {
                    valueOf = null;
                }
                if (valueOf == null) {
                    linkedHashMap.put("view_container_height", "undefined");
                } else {
                    linkedHashMap.put("view_container_height", valueOf);
                }
                if (valueOf2 == null || valueOf2.intValue() <= 0) {
                    valueOf2 = null;
                }
                if (valueOf2 == null) {
                    linkedHashMap.put("view_container_width", "undefined");
                } else {
                    linkedHashMap.put("view_container_width", valueOf2);
                }
                int i = gl1Var.g;
                Integer valueOf3 = i > 0 ? Integer.valueOf(i) : null;
                if (valueOf3 == null) {
                    linkedHashMap.put("video_height", "undefined");
                } else {
                    linkedHashMap.put("video_height", valueOf3);
                }
                int i2 = gl1Var.h;
                Integer valueOf4 = i2 > 0 ? Integer.valueOf(i2) : null;
                if (valueOf4 == null) {
                    linkedHashMap.put("video_width", "undefined");
                } else {
                    linkedHashMap.put("video_width", valueOf4);
                }
                String str = gl1Var.e;
                if (str == null) {
                    linkedHashMap.put("video_codec", "undefined");
                } else {
                    linkedHashMap.put("video_codec", str);
                }
                String str2 = gl1Var.d;
                if (str2 == null) {
                    linkedHashMap.put("video_mime_type", "undefined");
                } else {
                    linkedHashMap.put("video_mime_type", str2);
                }
                Float f = gl1Var.f;
                if (f == null) {
                    linkedHashMap.put("video_vmaf", "undefined");
                } else {
                    linkedHashMap.put("video_vmaf", f);
                }
                mg3Var.f = MapsKt.mapOf(TuplesKt.to("video_playback_info", linkedHashMap));
                i5 i5Var = jg3Var.a;
                h5 h5Var = h5.y;
                i5Var.a(h5Var);
                if (!jg3Var.h) {
                    jg3Var.h = true;
                    mg3 mg3Var2 = jg3Var.d;
                    mg3Var2.getClass();
                    mg3Var2.a(MapsKt.mutableMapOf(TuplesKt.to("status", "success"), TuplesKt.to("durations", mg3Var2.c.a.a(SetsKt.setOf((Object[]) new h5[]{h5Var, h5.z})))));
                }
                bg3 bg3Var2 = this.b;
                bg3Var2.d = true;
                bg3Var2.c.removeCallbacksAndMessages(null);
                bg3Var2.e = false;
                return;
            }
        }
        this.b.c.postDelayed(this, 200L);
    }
}
