package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐯ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C0791 {

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final C0546 f1863;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final C0545 f1864;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final C0373 f1865;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final String f1866;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public volatile C0696 f1867;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f1862 = StringFog.decrypt("lvznhMR5OFyn3uiEwH0pQQ==\n", "1ZOJ6qEaTDM=\n");

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f1861 = StringFog.decrypt("zcuHBoTmwA==\n", "iIXGRMijhGA=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AtomicBoolean f1876 = new AtomicBoolean(false);

    /* renamed from: ﾇ, reason: contains not printable characters */
    public boolean f1875 = false;

    /* renamed from: ｋ, reason: contains not printable characters */
    public volatile ArrayList f1874 = new ArrayList();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final ArrayList f1873 = new ArrayList();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final HashMap f1872 = new HashMap();

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final HashMap f1871 = new HashMap();

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final C0537 f1870 = new C0537();

    /* renamed from: ﱡ, reason: contains not printable characters */
    public C0785 f1869 = C0785.m4179();

    /* renamed from: ﱟ, reason: contains not printable characters */
    public HashMap f1868 = new HashMap();

    static {
        StringFog.decrypt("4fPA3q3QgsA=\n", "pbqTn++cx4Q=\n");
    }

    public C0791(C0545 c0545, C1086 c1086, String str, C0696 c0696, C0373 c0373) {
        this.f1864 = c0545;
        C0546 c0546 = new C0546(AbstractC1026.f2538, c1086);
        this.f1863 = c0546;
        AbstractC0577.f967 = new WeakReference(c0546);
        c0546.f624.add(new C0891(this));
        this.f1866 = str;
        this.f1867 = c0696;
        this.f1865 = c0373;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static HashMap m4189(C0791 c0791) {
        HashMap hashMap;
        synchronized (c0791) {
            hashMap = c0791.f1871;
        }
        return hashMap;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static ArrayList m4190(C0791 c0791) {
        ArrayList arrayList;
        synchronized (c0791) {
            arrayList = c0791.f1873;
        }
        return arrayList;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static List m4191(C0791 c0791) {
        ArrayList arrayList;
        synchronized (c0791) {
            arrayList = c0791.f1874;
        }
        return arrayList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static HashMap m4192(C0791 c0791) {
        HashMap hashMap;
        synchronized (c0791) {
            hashMap = c0791.f1872;
        }
        return hashMap;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4195(C0791 c0791) {
        synchronized (c0791) {
            try {
                C0696 c0696 = c0791.f1867;
                if (c0696 == null) {
                    return;
                }
                if (c0696.m4142(c0791.m4198())) {
                    ((C0373) c0791.m4202()).adQualitySdkInitSuccess();
                } else {
                    ((C0373) c0791.m4202()).adQualitySdkInitFailed(ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT, StringFog.decrypt("QiJLeM3cYe5vOQRp0ZJ47n4oS3fN02vuaG0YbsHRavh/Kx53zss=\n", "DE1rG6KyD4s=\n"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final synchronized boolean m4196() {
        return AbstractC0590.m4087().mo4088();
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final synchronized void m4197() {
        try {
            if (this.f1876.getAndSet(true)) {
                return;
            }
            C0696 c0696 = this.f1867;
            AbstractC1026.m4316(new C0837(this));
            if (c0696 != null) {
                AbstractC1026.m4312(new C0699(c0696));
            }
            this.f1867 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized boolean m4198() {
        boolean z;
        if (AbstractC0590.m4087().mo4090()) {
            z = m4196();
        }
        return z;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized List m4199() {
        return this.f1874;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m4200() {
        HashMap hashMap;
        try {
            synchronized (this) {
                hashMap = this.f1872;
            }
            return m4194(hashMap);
        } catch (JSONException e) {
            String str = f1862;
            AbstractC0580.m4080(str, str, StringFog.decrypt("GYUerEDEMBI4ngKkEoc+GDKSD7ddlnEAOYUfql2KIg==\n", "XPdswzLkUXY=\n"), e, null, false);
            return IronSourceNetworkBridge.jsonObjectInit();
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized HashMap m4201() {
        return this.f1871;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m4193(C0791 c0791, C0786 c0786) {
        c0791.getClass();
        String m4101 = c0786.f1854.m4101();
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put(AbstractC1183.f3022, m4101);
        } catch (JSONException e) {
            String str = f1862;
            AbstractC0580.m4080(str, str, StringFog.decrypt("HwfTVoMGDkw/FNVQn0FNXTUbz1ySUgJMegPES4JPAlB6H9JWnw==\n", "WnWhOfEmbT4=\n"), e, null, false);
        }
        try {
            jsonObjectInit.put(AbstractC1183.f3023, c0786.f1857.f2829);
        } catch (JSONException e2) {
            String str2 = f1862;
            AbstractC0580.m4080(str2, str2, StringFog.decrypt("BwkQA8yFKwYnGhYF0MJoFy0VDAnd0ScGYg0HHs3MJxpiERED0A==\n", "QntibL6lSHQ=\n"), e2, null, false);
        }
        return jsonObjectInit;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4204(Context context, LinkedHashMap linkedHashMap, C0824 c0824) {
        boolean mo4088;
        if (linkedHashMap.size() > 0) {
            String str = (String) linkedHashMap.keySet().iterator().next();
            List list = (List) linkedHashMap.remove(str);
            String mo3944 = (list == null || list.isEmpty() || list.get(0) == null) ? null : ((AbstractC0955) list.get(0)).mo3944();
            if (mo3944 != null) {
                C0696 c0696 = this.f1867;
                if (c0696 != null) {
                    c0696.f1550.put(mo3944, new C0715(mo3944));
                }
                AbstractC1026.m4314(new C0794(this, mo3944, context, str, list, linkedHashMap, c0824));
                synchronized (this) {
                    mo4088 = AbstractC0590.m4087().mo4088();
                }
                if (mo4088) {
                    return;
                }
                m4204(context, linkedHashMap, c0824);
                return;
            }
            m4204(context, linkedHashMap, c0824);
            return;
        }
        AbstractC1026.m4316(new C1069(c0824));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4206(String str, JSONObject jSONObject) {
        C0696 c0696 = this.f1867;
        if (c0696 != null) {
            AbstractC1026.m4312(new C0706(c0696, str, EnumC0718.f1595));
        }
        if (jSONObject != null) {
            try {
                jSONObject.put(StringFog.decrypt("bIgh\n", "COtS/ZGvZ2w=\n"), true);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0084  */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4203(Context context, String str, String str2, AbstractC0955 abstractC0955, AbstractRunnableC0913 abstractRunnableC0913) {
        C0461 c0461;
        C0461 c04612;
        HashMap hashMap;
        long j;
        abstractC0955.getClass();
        if (((C0600) AbstractC0590.m4087()).f1015.m4159()) {
            String m4160 = ((C0600) AbstractC0590.m4087()).f1015.m4160(abstractC0955.mo3944());
            if (!TextUtils.isEmpty(m4160)) {
                c04612 = new C0457(StringFog.decrypt("MNlThVK7xNIhxRI=\n", "U7Y96zfYsL0=\n") + abstractC0955.mo3944(), StringFog.decrypt("scd9\n", "hulN381moDk=\n"), m4160);
                if (c04612 == null) {
                    AbstractC0593 mo3945 = abstractC0955.mo3945();
                    String m4101 = mo3945.m4101();
                    synchronized (this) {
                        hashMap = this.f1872;
                    }
                    JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                    try {
                        jsonObjectInit.put(AbstractC1183.f3022, m4101);
                    } catch (JSONException e) {
                        String str3 = f1862;
                        AbstractC0580.m4080(str3, str3, StringFog.decrypt("HwfTVoMGDkw/FNVQn0FNXTUbz1ySUgJMegPES4JPAlB6H9JWnw==\n", "WnWhOfEmbT4=\n"), e, null, false);
                    }
                    hashMap.put(str2, jsonObjectInit);
                    C0696 c0696 = this.f1867;
                    if (c0696 != null) {
                        AbstractC1026.m4312(new C0706(c0696, str2, EnumC0718.f1598));
                    }
                    C0949 c0949 = new C0949(this, context, this.f1864.m4044(c04612, new C0958(this, context, mo3945, str, str2, abstractC0955, abstractRunnableC0913)), mo3945, str, str2, abstractC0955, abstractRunnableC0913);
                    if (!AbstractC0590.m4087().mo4091()) {
                        C0545 c0545 = this.f1864;
                        c0545.getClass();
                        if (c0545.f614.m4242(c04612.mo4004().replace(StringFog.decrypt("/w==\n", "0Prxh/nblcY=\n"), StringFog.decrypt("Tg==\n", "YCv5phv/FLs=\n"))) != null) {
                            j = 0;
                            AbstractC1026.m4317(c0949, j);
                            return;
                        }
                    }
                    j = 2000;
                    AbstractC1026.m4317(c0949, j);
                    return;
                }
                AbstractC1026.m4316(abstractRunnableC0913);
                return;
            }
            c0461 = null;
        } else {
            c0461 = new C0461(StringFog.decrypt("pYndgrBLcTK0lZw=\n", "xuaz7NUoBV0=\n") + abstractC0955.mo3944(), StringFog.decrypt("TN2B\n", "e/OxBFqgrXk=\n"));
        }
        c04612 = c0461;
        if (c04612 == null) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m4207(String str) {
        return this.f1868.containsKey(str) && ((C1079) this.f1868.get(str)).m4366(this.f1866);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m4194(HashMap hashMap) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        JSONObject jsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit();
        Iterator it = new HashSet(hashMap.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            jsonObjectInit2.put(str.toLowerCase(), (JSONObject) hashMap.get(str));
        }
        jsonObjectInit.put(StringFog.decrypt("NtPHZQ==\n", "QKCpFqZgKvg=\n"), jsonObjectInit2);
        return jsonObjectInit;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4205(String str, List list) {
        ArrayList arrayList;
        if (this.f1876.get()) {
            return;
        }
        if (this.f1874 != null) {
            arrayList = new ArrayList(this.f1874);
        } else {
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C0786) it.next()).m4186().iterator();
            while (it2.hasNext()) {
                C0880 c0880 = (C0880) it2.next();
                c0880.getClass();
                String str2 = C0880.f2131 + str;
                AbstractC1026.m4313(new C1185(c0880, str2, list));
                AbstractC1026.m4312(new C1179(c0880, str2, list));
                try {
                    AbstractC1026.m4314(new C1152(new C1175(c0880, str2, list)));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized ISAdQualityInitListener m4202() {
        return this.f1865;
    }
}
