package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓾ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public abstract class AbstractC0872 extends AbstractC1144 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public C1150 f2099;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public AbstractViewOnLayoutChangeListenerC0474 f2100;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final WeakHashMap f2101 = new WeakHashMap();

    /* renamed from: ﺙ, reason: contains not printable characters */
    public C0873 f2098 = new C0873();

    static {
        StringFog.decrypt("lnpW0MvR5YW1YXvY8NP5hLxqSA==\n", "0A86vLiyl+A=\n");
    }

    public AbstractC0872(C1150 c1150) {
        this.f2099 = c1150;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m4223(Object obj) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        C4554e c4554e = m4224(obj).f363;
        mo3978(jsonObjectInit, c4554e != null ? (WebView) c4554e.f145.f431.get() : null, obj);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1144, com.ironsource.adqualitysdk.sdk.i.InterfaceC1156
    /* renamed from: ｋ */
    public final void mo3975(JSONObject jSONObject, View view, Object obj) {
        mo3973(jSONObject, (WebView) view, obj);
    }

    /* renamed from: ﾇ */
    public abstract View mo3966(Object obj);

    /* renamed from: ﾇ */
    public abstract AbstractViewOnLayoutChangeListenerC0474 mo3967();

    /* renamed from: ﾇ */
    public abstract void mo3968(Object obj, ArrayList arrayList);

    /* renamed from: ﾒ */
    public abstract InterfaceC1156 mo3969();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4226(JSONObject jSONObject, Object obj, String str) {
        C0873 c0873 = this.f2098;
        boolean z = c0873.f2109 && !TextUtils.isEmpty(c0873.f2112);
        AbstractViewOnLayoutChangeListenerC0474 m4224 = m4224(obj);
        if (m4224 == null) {
            m4224 = mo3967();
            if (this.f2098.f2104) {
                this.f2101.put(obj, m4224);
            } else {
                this.f2100 = m4224;
            }
            m4224.f2897 = mo3969();
        }
        for (WebView webView : m4224.f362.keySet()) {
            webView.removeOnLayoutChangeListener(m4224);
            C4554e c4554e = (C4554e) m4224.f362.get(webView);
            Iterator it = m4224.f360.iterator();
            while (it.hasNext()) {
                c4554e.f144.remove((InterfaceC0938) it.next());
            }
        }
        m4224.f360.clear();
        m4224.f363 = null;
        m4224.f362.clear();
        C0873 c08732 = this.f2098;
        String str2 = c08732.f2112;
        List list = c08732.f2111;
        boolean z2 = c08732.f2106;
        boolean z3 = c08732.f2105;
        m4224.f365 = z;
        m4224.f361 = new C4551b(str2, z3);
        m4224.f364 = z2;
        m4224.f367 = list;
        m4224.f366 = str;
        if (!this.f2098.f2107) {
            super.mo3975(jSONObject, null, obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        mo3968(obj, arrayList);
        List arrayList2 = new ArrayList();
        C1150 c1150 = this.f2099;
        if (c1150 != null) {
            try {
                C1064 c1064 = c1150.f2907;
                C0880 c0880 = c1150.f2905;
                arrayList2 = (List) c1064.m4337(c0880.f2145, c0880, Collections.singletonList(obj)).f2276;
            } catch (Exception unused) {
                AbstractC0580.m4072(StringFog.decrypt("b2vxvJ+WsmRxZ++njp2Wcg==\n", "PQ6c0+vz8wA=\n"), StringFog.decrypt("bJWZYwgd0uRdk4JiHR3C5EuxgmkNTpXnW4iGLA==\n", "KefrDHo9tYE=\n") + c1150.f2906);
                arrayList2 = null;
            }
        }
        String str3 = AbstractC0530.f589;
        HashSet hashSet = new HashSet(arrayList);
        if (arrayList2 != null) {
            hashSet.addAll(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(hashSet);
        if (arrayList3.isEmpty() || this.f2098.f2108) {
            View mo3966 = mo3966(obj);
            if (mo3966 != null) {
                mo3966.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0877(this, obj));
            }
            if (arrayList3.isEmpty()) {
                super.mo3975(jSONObject, null, obj);
                return;
            }
        }
        if (this.f2098.f2103) {
            AbstractC1026.f2539.post(new RunnableC0876(this, obj, arrayList3, jSONObject));
        } else {
            m4225(obj, arrayList3);
            super.mo3975(jSONObject, (WebView) arrayList3.get(0), obj);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final AbstractViewOnLayoutChangeListenerC0474 m4224(Object obj) {
        if (this.f2098.f2104) {
            return (AbstractViewOnLayoutChangeListenerC0474) this.f2101.get(obj);
        }
        return this.f2100;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4222(AbstractC0872 abstractC0872, JSONObject jSONObject, WebView webView, Object obj) {
        super.mo3975(jSONObject, webView, obj);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4225(Object obj, ArrayList arrayList) {
        AbstractViewOnLayoutChangeListenerC0474 m4224 = m4224(obj);
        m4224.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m4224.m4013((WebView) it.next());
        }
        if (this.f2098.f2110) {
            m4224(obj).f366 = Integer.toHexString(((WebView) arrayList.get(0)).hashCode());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1144
    /* renamed from: ﾒ */
    public final String mo4012(Object obj) {
        return m4224(obj).f366;
    }
}
