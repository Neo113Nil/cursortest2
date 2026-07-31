package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʽ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public abstract class AbstractViewOnLayoutChangeListenerC0474 extends AbstractC1144 implements View.OnLayoutChangeListener {

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f359 = StringFog.decrypt("WdEM429DT6Fq/A/bYkpdkg==\n", "DrRutQYmOOA=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public C4551b f361;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public C4554e f363;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public boolean f364;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public boolean f365;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public String f366;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public List f367;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final WeakHashMap f362 = new WeakHashMap();

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final ArrayList f360 = new ArrayList();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m4010(AbstractViewOnLayoutChangeListenerC0474 abstractViewOnLayoutChangeListenerC0474, String str) {
        abstractViewOnLayoutChangeListenerC0474.getClass();
        try {
            String decode = URLDecoder.decode(str, StringFog.decrypt("1mpG2Os=\n", "gz4A9dP/GOc=\n"));
            if (!TextUtils.isEmpty(decode)) {
                return IronSourceNetworkBridge.jsonObjectInit(decode);
            }
        } catch (Exception e) {
            String str2 = f359;
            AbstractC0580.m4080(str2, str2, StringFog.decrypt("5LUII52ao3bVsxMiiJqgctWm\n", "ocd6TO+6xBM=\n"), e, null, false);
        }
        return IronSourceNetworkBridge.jsonObjectInit();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            if (view instanceof WebView) {
                WebView webView = (WebView) view;
                if (this.f362.containsKey(webView)) {
                    m4011(webView);
                }
            }
        } catch (Throwable th) {
            AbstractC0577.m4068(f359, StringFog.decrypt("i3qiVBSrIPnuZ753B/Im4rpLuFoI7Cw=\n", "zgjQO2aLSZc=\n"), th, false);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1144, com.ironsource.adqualitysdk.sdk.i.InterfaceC1156
    /* renamed from: ﻛ */
    public final void mo3973(JSONObject jSONObject, View view, Object obj) {
        jSONObject.remove(AbstractC1183.f3064);
        super.mo3973(jSONObject, (WebView) view, obj);
    }

    /* renamed from: ﾇ */
    public abstract Object mo4009(WebView webView);

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m4011(WebView webView) {
        C4554e c4554e = (C4554e) this.f362.get(webView);
        if (this.f365 && c4554e.f145.f429) {
            if (!(o.m3953(webView) instanceof C0777)) {
                c4554e.m3947();
            }
            C4551b c4551b = this.f361;
            c4551b.getClass();
            try {
                AbstractC1026.m4313(new C4550a(c4551b, webView));
            } catch (Exception e) {
                AbstractC0580.m4072(C4551b.f134, StringFog.decrypt("hN1l/5DOWN6rynTki4BWkKvcN+SNzkbVo/l+9ZXUEQ==\n", "wa8XkOLuMbA=\n") + e.getLocalizedMessage());
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4013(WebView webView) {
        if (webView == null || this.f362.containsKey(webView)) {
            return;
        }
        String decrypt = StringFog.decrypt("RLJFrUlH1UwK\n", "JdYmwSss72M=\n");
        WeakHashMap weakHashMap = C4554e.f143;
        C4554e c4554e = (C4554e) weakHashMap.get(webView);
        if (c4554e == null) {
            c4554e = new C4554e(webView, decrypt);
            weakHashMap.put(webView, c4554e);
        }
        if (this.f363 == null) {
            this.f363 = c4554e;
        }
        this.f362.put(webView, c4554e);
        C0497 c0497 = new C0497(this);
        this.f360.add(c0497);
        c4554e.f144.add(c0497);
        m4011(webView);
        webView.addOnLayoutChangeListener(this);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1144
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String mo4012(Object obj) {
        return this.f366;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1144, com.ironsource.adqualitysdk.sdk.i.InterfaceC1156
    /* renamed from: ﾒ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo3975(JSONObject jSONObject, WebView webView, Object obj) {
        if (webView != null) {
            try {
                jSONObject.put(AbstractC1183.f3021, webView.getWindowToken() != null);
            } catch (JSONException unused) {
            }
        }
        super.mo3975(jSONObject, webView, obj);
    }
}
