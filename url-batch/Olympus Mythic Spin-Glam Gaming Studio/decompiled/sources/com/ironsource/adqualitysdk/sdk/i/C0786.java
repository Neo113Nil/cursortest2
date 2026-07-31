package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐦ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0786 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public C0484 f1851;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final ArrayList f1852 = new ArrayList();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final Context f1853;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final AbstractC0593 f1854;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C0537 f1855;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0546 f1856;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1112 f1857;

    public C0786(Context context, C1112 c1112, C0546 c0546, C0537 c0537, AbstractC0593 abstractC0593) {
        this.f1857 = c1112;
        this.f1856 = c0546;
        this.f1855 = c0537;
        this.f1854 = abstractC0593;
        this.f1853 = context.getApplicationContext();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m4183() {
        Iterator it = this.f1852.iterator();
        while (it.hasNext()) {
            C0880 c0880 = (C0880) it.next();
            C1147 c1147 = c0880.f2137;
            c1147.getClass();
            AbstractC1026.m4312(new C1170(c1147));
            C1147 c11472 = c0880.f2137;
            c11472.getClass();
            AbstractC1026.m4312(new C1148(c11472));
            C1147 c11473 = c0880.f2137;
            c11473.getClass();
            AbstractC1026.m4312(new C1158(c11473));
            if (c0880.f2141 != null) {
                AbstractC0698 m4143 = AbstractC0698.m4143();
                C1067 c1067 = c0880.f2141;
                synchronized (m4143) {
                    m4143.f1553.remove(c1067);
                }
                c0880.f2141 = null;
            }
            C0945 c0945 = c0880.f2140;
            if (c0945 != null) {
                c0945.m4244();
                c0880.f2140 = null;
            }
            c0880.f2142 = null;
        }
        AbstractC1026.m4312(new C0804(this));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m4184() {
        return this.f1854.mo4038();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m4185() {
        HashMap hashMap;
        String m4101 = this.f1854.m4101();
        String str = null;
        if (TextUtils.isEmpty(m4101) || StringFog.decrypt("q5jZ53XEJA==\n", "7taYpTmBYPE=\n").equals(m4101) || StringFog.decrypt("nnb/gR+lCms=\n", "2j+swF3pTy8=\n").equals(m4101)) {
            return null;
        }
        C1112 c1112 = this.f1857;
        String m41012 = this.f1854.m4101();
        if (c1112.f2826 == null) {
            JSONObject optJSONObject = c1112.f2833.optJSONObject(C1112.f2822);
            if (optJSONObject != null) {
                hashMap = new HashMap();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, optJSONObject.optString(next, null));
                }
            } else {
                hashMap = null;
            }
            if (hashMap != null) {
                ArrayList arrayList = new ArrayList(hashMap.keySet());
                Collections.sort(arrayList, new C1119());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (AbstractC1246.m4506(m41012, str2) >= 0) {
                        str = (String) hashMap.get(str2);
                    }
                }
                c1112.f2826 = str;
            }
        }
        return c1112.f2826;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized ArrayList m4186() {
        if (this.f1852 != null) {
            return new ArrayList(this.f1852);
        }
        return new ArrayList();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0770 m4187(C0754 c0754) {
        if (c0754 != null) {
            return new C0770(c0754, m4187((C0754) this.f1857.m4407().get(c0754.f1687)));
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m4188() {
        if (this.f1854.mo4038()) {
            Iterator it = m4186().iterator();
            while (it.hasNext()) {
                C0880 c0880 = (C0880) it.next();
                this.f1857.m4408().f1849.m4182(c0880.f2146.f1776.f1688, c0880);
            }
        }
    }
}
