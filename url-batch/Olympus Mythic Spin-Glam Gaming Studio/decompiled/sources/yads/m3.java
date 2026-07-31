package yads;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.reflect.KProperty;

/* loaded from: classes4.dex */
public final class m3 extends WebChromeClient {
    public static final /* synthetic */ KProperty[] b = {ra.a(m3.class, "context", "getContext()Landroid/content/Context;", 0)};
    public final qm2 a;

    public m3(Context context) {
        this.a = new qm2(context);
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        qm2 qm2Var = this.a;
        KProperty kProperty = b[0];
        Object obj = (Context) qm2Var.a.get();
        o3 o3Var = obj instanceof o3 ? (o3) obj : null;
        if (o3Var != null) {
            r1 r1Var = (r1) o3Var;
            int i2 = i * 100;
            r1Var.k.setProgress(i2);
            if (10000 > i2) {
                r1Var.a(0);
            } else {
                r1Var.j.setText(webView.getTitle());
                r1Var.a(8);
            }
        }
    }
}
