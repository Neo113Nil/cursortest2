package yads;

import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.internal.partials.YandexNetworkBridge;

/* loaded from: classes3.dex */
public class qn {
    public final vb2 a;

    public qn(vb2 vb2Var) {
        this.a = vb2Var;
        vb2Var.setId(2);
    }

    public void a(String str) {
        vb2 vb2Var = this.a;
        YandexNetworkBridge.webviewLoadDataWithBaseURL(vb2Var, "https://yandex.ru", vb2Var.a(str), POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
    }

    public void a(t01 t01Var) {
        this.a.setHtmlWebViewListener(t01Var);
    }
}
