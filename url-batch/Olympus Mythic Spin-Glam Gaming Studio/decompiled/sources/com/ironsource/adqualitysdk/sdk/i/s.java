package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class s extends AbstractC0872 implements q, View.OnLayoutChangeListener {

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f163 = StringFog.decrypt("dju1yfhwmOlEJZrJ32ag5E03qQ==\n", "IVLbrZcHzoA=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public r f164;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final WeakHashMap f165;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public Class f166;

    public s(JSONObject jSONObject) {
        super(null);
        this.f165 = new WeakHashMap();
        this.f164 = new r();
        m3970(jSONObject);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            View m3964 = m3964(view, this.f166);
            if (m3964 != null) {
                if (!this.f165.containsKey(m3964)) {
                    this.f165.put(m3964, Boolean.TRUE);
                    m4226(IronSourceNetworkBridge.jsonObjectInit(), (Object) m3964, Integer.toHexString(m3964.hashCode()));
                }
                view.removeOnLayoutChangeListener(this);
            }
        } catch (Throwable th) {
            AbstractC0577.m4068(f163, StringFog.decrypt("2F8d/I/P/mW9QgHfnJb4fuluB/KTiPI=\n", "nS1vk/3vlws=\n"), th, false);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0872
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void mo3968(Object obj, ArrayList arrayList) {
        View view = (View) obj;
        r rVar = this.f164;
        AbstractC1240.m4489(view, WebView.class, rVar.f161, true, false, null, rVar.f2102, arrayList);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0872
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final InterfaceC1156 mo3969() {
        return this;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m3970(JSONObject jSONObject) {
        r rVar = new r(jSONObject);
        this.f2098 = rVar;
        this.f164 = rVar;
        try {
            this.f166 = Class.forName(rVar.f162);
            C0379.m3991().m3993(this);
        } catch (ClassNotFoundException e) {
            AbstractC0580.m4073(f163, StringFog.decrypt("ZGXVqy1870JSY8KqNjLkC1V4h6EpOe1fUjfBtjAxow==\n", "IRenxF9cgys=\n") + rVar.f162 + StringFog.decrypt("wbU=\n", "+5Vxe/3PEYM=\n") + e.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0872
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final View mo3966(Object obj) {
        return (View) obj;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0872
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractViewOnLayoutChangeListenerC0474 mo3967() {
        return new C0472();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.q
    /* renamed from: ﾇ */
    public final void mo3962(View view) {
        View m3964 = m3964(view, this.f166);
        if (m3964 == null || this.f165.remove(m3964) == null) {
            return;
        }
        m4223(view);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.q
    /* renamed from: ﾒ */
    public final void mo3963(View view) {
        View m3965;
        View m3964 = m3964(view, this.f166);
        if (m3964 != null) {
            if (this.f165.containsKey(m3964)) {
                return;
            }
            this.f165.put(m3964, Boolean.TRUE);
            m4226(IronSourceNetworkBridge.jsonObjectInit(), (Object) m3964, Integer.toHexString(m3964.hashCode()));
            return;
        }
        if (TextUtils.isEmpty(this.f164.f160) || (m3965 = m3965(view, this.f164.f160)) == null) {
            return;
        }
        m3965.addOnLayoutChangeListener(this);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static View m3964(View view, Class cls) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (cls.isAssignableFrom(childAt.getClass())) {
                return childAt;
            }
            View m3964 = m3964(childAt, cls);
            if (m3964 != null) {
                return m3964;
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static View m3965(View view, String str) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getClass().getName().startsWith(str)) {
                return childAt;
            }
            View m3965 = m3965(childAt, str);
            if (m3965 != null) {
                return m3965;
            }
        }
        return null;
    }
}
