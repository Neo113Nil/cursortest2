package yads;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes14.dex */
public final class ft2 implements p01 {
    public final String a;
    public final gt2 b;

    public ft2(String str, gt2 gt2Var) {
        this.a = str;
        this.b = gt2Var;
    }

    @Override // yads.p01
    public final WebResourceResponse a(WebView webView, WebResourceRequest webResourceRequest) {
        String a;
        Uri url = webResourceRequest.getUrl();
        if (!Intrinsics.areEqual(url != null ? url.getLastPathSegment() : null, this.a) || (a = this.b.a()) == null || a.length() == 0) {
            return null;
        }
        byte[] bytes = a.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new WebResourceResponse(POBCommonConstants.CONTENT_TYPE_JAVASCRIPT, "UTF-8", new ByteArrayInputStream(bytes));
    }
}
