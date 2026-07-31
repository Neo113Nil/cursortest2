package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﹺ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1244 extends AbstractC1144 {

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f3248 = StringFog.decrypt("6r8I9BQceHXduAnvMAo=\n", "vNZtg1V4Cz0=\n");

    /* renamed from: ﮌ, reason: contains not printable characters */
    public C1321 f3250;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public Class f3251;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final C0480 f3254;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public C1149 f3256;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final WeakHashMap f3257 = new WeakHashMap();

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final WeakHashMap f3253 = new WeakHashMap();

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final WeakHashMap f3252 = new WeakHashMap();

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final ArrayList f3249 = new ArrayList();

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final ViewOnLayoutChangeListenerC0492 f3255 = new ViewOnLayoutChangeListenerC0492(this);

    public C1244(JSONObject jSONObject, C1149 c1149) {
        this.f3250 = new C1321();
        this.f3250 = new C1321(jSONObject);
        this.f3256 = c1149;
        C0480 c0480 = new C0480(this);
        this.f3254 = c0480;
        C0379.m3991().m3993(c0480);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4495(C1244 c1244, ArrayList arrayList) {
        int i;
        c1244.getClass();
        for (0; i < arrayList.size(); i + 1) {
            View view = (View) arrayList.get(i);
            C1321 c1321 = c1244.f3250;
            if (c1244.f3256 != null) {
                List<String> list = c1321.f3647;
                if (list != null && !list.isEmpty()) {
                    String name = view.getClass().getPackage().getName();
                    for (String str : list) {
                        if (TextUtils.isEmpty(str)) {
                            str = null;
                        } else {
                            List asList = Arrays.asList(str.split(StringFog.decrypt("yyjl\n", "kAa4QlK4pf8=\n")));
                            if (asList.size() > 3) {
                                str = TextUtils.join(StringFog.decrypt("YQ==\n", "T1vcL2whSHA=\n"), asList.subList(0, 3));
                            }
                        }
                        if (TextUtils.isEmpty(str) || !name.startsWith(str)) {
                        }
                    }
                }
                C1149 c1149 = c1244.f3256;
                C1064 c1064 = c1149.f2904;
                C0880 c0880 = c1149.f2903;
                i = c1064.m4337(c0880.f2145, c0880, Collections.singletonList(view)).m4250() ? 0 : i + 1;
            }
            if (!c1321.f3656) {
                ArrayList arrayList2 = new ArrayList();
                AbstractC1240.m4489(view, WebView.class, null, false, c1321.f3654, c1321.f3650, c1321.f3648, arrayList2);
                if (view instanceof WebView) {
                    arrayList2.add((WebView) view);
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    WebView webView = (WebView) it.next();
                    if (c1244.f3253.get(webView) == null && webView.getClass().getName().startsWith(c1321.f3660)) {
                        C0473 c0473 = new C0473();
                        c1244.f3257.put(webView, c0473);
                        String str2 = c1321.f3659;
                        List asList2 = TextUtils.isEmpty(c1321.f3657) ? null : Arrays.asList(c1321.f3657.split(StringFog.decrypt("Mg==\n", "HguArMt4nNk=\n")));
                        boolean z = c1321.f3653;
                        boolean z2 = c1321.f3658;
                        boolean z3 = c1321.f3652;
                        c0473.f365 = z;
                        c0473.f361 = new C4551b(str2, z3);
                        c0473.f364 = z2;
                        c0473.f367 = asList2;
                        c0473.f2897 = new C0464(c1244);
                        c0473.m4013(webView);
                        c0473.f366 = Integer.toHexString(webView.hashCode());
                        c1244.f3253.put(webView, c1244);
                    }
                }
            } else if (((C1244) c1244.f3253.get(view)) == null) {
                c1244.f3253.put(view, c1244);
                c1244.mo3975(IronSourceNetworkBridge.jsonObjectInit(), view, null);
            } else if (c1321.f3655) {
                c1244.mo3975(IronSourceNetworkBridge.jsonObjectInit(), view, null);
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m4496(View view) {
        Activity m4490;
        try {
            if (this.f3251 == null) {
                this.f3251 = Class.forName(this.f3250.f3661);
            }
            Activity mo4146 = AbstractC0698.m4143().mo4146();
            if (mo4146 == null) {
                return;
            }
            if (this.f3250.f3649.isEmpty() || (m4490 = AbstractC1240.m4490(view)) == null || !this.f3250.f3649.contains(m4490.getClass().getName())) {
                AbstractC1026.m4316(new C0465(this, mo4146, view));
            }
        } catch (Throwable th) {
            AbstractC0580.m4072(f3248, StringFog.decrypt("mK/0dDSiQMmpqe91IaJEwLyu9Ts=\n", "3d2GG0aCJ6w=\n") + this.f3250.f3661 + StringFog.decrypt("1uHR\n", "9szxcZbf3BM=\n") + th.getLocalizedMessage());
            m4497();
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1144
    /* renamed from: ﾒ */
    public final /* bridge */ /* synthetic */ String mo4012(Object obj) {
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4497() {
        this.f2897 = null;
        C0379.m3991().m3992(this.f3254);
        HashSet hashSet = new HashSet(this.f3252.keySet());
        this.f3252.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).removeOnLayoutChangeListener(this.f3255);
        }
    }
}
