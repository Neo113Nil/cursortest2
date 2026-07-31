package com.inmobi.media;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class No {
    public static boolean a(WebView view, RenderProcessGoneDetail renderProcessGoneDetail, String source) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(source, "source");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("source", source), TuplesKt.to("isCrashed", Boolean.valueOf(renderProcessGoneDetail != null ? renderProcessGoneDetail.didCrash() : false)));
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("WebViewRenderProcessGoneEvent", mutableMapOf, EnumC4530zk.a);
        view.destroy();
        return true;
    }
}
