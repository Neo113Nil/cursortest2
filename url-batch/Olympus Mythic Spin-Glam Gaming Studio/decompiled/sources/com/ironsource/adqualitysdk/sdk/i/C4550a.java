package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4550a extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C4551b f131;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ WebView f132;

    public C4550a(C4551b c4551b, WebView webView) {
        this.f131 = c4551b;
        this.f132 = webView;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo3946() {
        String str;
        JSONObject jSONObject;
        C4551b c4551b = this.f131;
        c4551b.getClass();
        String str2 = C4551b.f133.f425;
        try {
            String decrypt = StringFog.decrypt("qWtKrTL/h8etZkKxJ/SF3rdtXg==\n", "8jAD43i6xJM=\n");
            C0762 c0762 = ((C0600) AbstractC0590.m4087()).f1015;
            synchronized (c0762) {
                jSONObject = c0762.f2998;
            }
            String replace = str2.replace(decrypt, jSONObject.optString(StringFog.decrypt("ek+y\n", "ECbcQdXKUIg=\n"), c0762.f1767)).replace(StringFog.decrypt("Wy5/BqGlG7NfP28UsQ==\n", "AHU8SezoVP0=\n"), C4551b.f133.f424);
            str = (c4551b.f135 ? replace.replace(StringFog.decrypt("/zOahOpqzCHuO4KB\n", "pGjf3L44jX4=\n"), C4551b.f133.f423) : replace.replace(StringFog.decrypt("3Ys2CE51u/vMgy4N\n", "htBzUBon+qQ=\n"), "")).replace(StringFog.decrypt("aEOE7czUJidnV5X9yMk+OQ==\n", "MxjHooKaY2Q=\n"), c4551b.f136);
        } catch (Throwable th) {
            AbstractC0580.m4072(C4551b.f134, StringFog.decrypt("6bxJlcEMbp+MqV6O+V9TnuWgUZ/QWD3R\n", "rM47+rMsB/E=\n") + th.getLocalizedMessage());
            str = str2;
        }
        AbstractC1026.m4312(new C0483(this, AbstractC1048.m4323(str.getBytes())));
    }
}
