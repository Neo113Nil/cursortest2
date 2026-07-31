package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ἶ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1086 {

    /* renamed from: סּ, reason: contains not printable characters */
    public final C0377 f2755;

    /* renamed from: ףּ, reason: contains not printable characters */
    public final String f2756;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public C0945 f2757;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final C1015 f2759;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public C1139 f2760;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final Context f2761;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public boolean f2764;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public boolean f2765;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final Handler f2766;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final C1052 f2767;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final C0404 f2768;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C1007 f2769;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public boolean f2770;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0495 f2771;

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f2754 = StringFog.decrypt("QMzgrs+W0r1y\n", "AaKBwrbiu94=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2753 = StringFog.decrypt("73Pc5fqkp+jwL9bwsaKkpfpv3Ormsq/o6A==\n", "mwG9hp/Gxos=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f2752 = StringFog.decrypt("8edDzE3CE+vn617EVY4K+ezpQNhVyl3r\n", "gogsoSGjPpg=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f2751 = StringFog.decrypt("W/xd1ofsvfx79g==\n", "MpIp+PSJzo8=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f2750 = StringFog.decrypt("CMvQrHjFYScU0M+pd/cmMA==\n", "e7+ixRaiT1Q=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final ArrayList f2763 = new ArrayList();

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final ArrayList f2762 = new ArrayList();

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final Thread.UncaughtExceptionHandler f2758 = Thread.getDefaultUncaughtExceptionHandler();

    public C1086(Context context, C0783 c0783, C0495 c0495, boolean z, String str, C0377 c0377) {
        this.f2755 = c0377;
        Thread.setDefaultUncaughtExceptionHandler(new C1171(this));
        this.f2771 = c0495;
        this.f2761 = context;
        C0916 c0916 = new C0916(context, StringFog.decrypt("ujYTeBx2vOelahltV3C/qq8qE3cAYLTnvQ==\n", "zkRyG3kU3YQ=\n"), StringFog.decrypt("5pOUqa1I6Urwn4mhtQTwWPudl721QKdK\n", "lfz7xMEpxDk=\n"));
        this.f2768 = new C0404(c0916, StringFog.decrypt("bgfj6mONIo8=\n", "JlCmnAbjVvw=\n"), StringFog.decrypt("hGeIJh9j\n", "4RHtSGtNhfs=\n"));
        String str2 = f2751;
        String m4242 = c0916.m4242(str2);
        int parseInt = !TextUtils.isEmpty(m4242) ? Integer.parseInt(m4242) + 1 : 1;
        c0916.m4243(str2, "" + parseInt);
        String str3 = f2750;
        String m42422 = c0916.m4242(str3);
        if (TextUtils.isEmpty(m42422)) {
            m42422 = UUID.randomUUID().toString();
            c0916.m4243(str3, m42422);
        }
        String str4 = m42422;
        String m42423 = ((C0600) AbstractC0590.m4087()).f1020.m4242(C0600.f998);
        this.f2767 = new C1052(context, c0783, parseInt, str4, !TextUtils.isEmpty(m42423) ? Long.parseLong(m42423) : 0L);
        this.f2769 = new C1007(context);
        this.f2770 = false;
        HandlerThread handlerThread = new HandlerThread(StringFog.decrypt("Ece6DJIYZhMxw6oXmDo=\n", "UqbZZPdIFHw=\n"));
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f2766 = handler;
        this.f2759 = new C1015(parseInt);
        this.f2765 = !z;
        this.f2756 = str;
        synchronized (this) {
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new C1283(this), 0);
        }
        m4379();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m4373(C1086 c1086) {
        synchronized (c1086) {
            c1086.f2764 = false;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4374(C1086 c1086) {
        synchronized (c1086) {
            if (c1086.m4382() && !TextUtils.isEmpty(c1086.f2767.f960.m4177()) && !c1086.m4384()) {
                c1086.m4378();
                AbstractC0580.m4078(f2754, StringFog.decrypt("KTc9bTME09QfJDZnLhmUkgg9Pik5C9ecHw==\n", "elJTCVpqtPQ=\n"));
                C0404 c0404 = c1086.f2768;
                int m4271 = c1086.m4385().m4271();
                C1275 c1275 = new C1275(c1086);
                c0404.getClass();
                C0916.m4240().post(new C0450(c0404, m4271, c1275));
            }
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final void m4376() {
        C1139 c1139 = this.f2760;
        if (c1139 != null) {
            C0951 c0951 = this.f2769.f2439;
            synchronized (c0951) {
                c0951.f2267.remove(c1139);
            }
        }
        this.f2757.m4244();
        this.f2757 = null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final synchronized void m4377() {
        try {
            this.f2770 = false;
            Handler handler = this.f2766;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            C1007 c1007 = this.f2769;
            C0951 c0951 = c1007.f2439;
            c0951.f2269.unregisterReceiver(c0951);
            c1007.f2438 = true;
            m4376();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final synchronized void m4378() {
        this.f2764 = true;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final void m4379() {
        C1139 c1139 = new C1139(this);
        this.f2760 = c1139;
        C0951 c0951 = this.f2769.f2439;
        synchronized (c0951) {
            c0951.f2267.add(c1139);
        }
        this.f2757 = new C0945(new C1123(this));
        AbstractC0698.m4143().m4148(new C1118(this));
        AbstractC0590 m4087 = AbstractC0590.m4087();
        C1115 c1115 = new C1115(this);
        C0600 c0600 = (C0600) m4087;
        Handler handler = c0600.f1018;
        if (handler != null) {
            handler.post(new C0630(c0600, c1115));
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m4380() {
        synchronized (this) {
            try {
                Handler handler = this.f2766;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                m4391(true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m4381() {
        try {
            this.f2765 = true;
            AbstractC1026.m4313(new C1163(this));
            m4380();
        } catch (Exception e) {
            AbstractC0577.m4068(f2754, StringFog.decrypt("r7beWWzn0QDKq8J3brfsAailz115tdcbhKA=\n", "6sSsNh7HuG4=\n"), (Throwable) e, false);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized boolean m4382() {
        return this.f2770;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized boolean m4384() {
        return this.f2764;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m4383(JSONObject jSONObject) {
        ArrayList arrayList;
        if (C1213.m4452().m4463()) {
            synchronized (this) {
                arrayList = new ArrayList(this.f2763);
            }
            AbstractC1026.m4312(new C1188(arrayList, jSONObject));
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4375(C1086 c1086, ArrayList arrayList, C1276 c1276) {
        JSONObject jSONObject;
        c1086.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1071 c1071 = (C1071) it.next();
            synchronized (c1071) {
                jSONObject = c1071.f2723.f479;
            }
            if (!jSONObject.has(StringFog.decrypt("7Fym\n", "iCjVOmoQiVE=\n"))) {
                try {
                    jSONObject.put(StringFog.decrypt("fscu\n", "GrNdA/pe7Is=\n"), jSONObject.optLong(AbstractC1183.f3064));
                } catch (JSONException unused) {
                }
            }
            if (c1086.f2759.m4297(jSONObject)) {
                c1086.f2768.m3998(c1071.f2723, null);
            }
            jSONArray.put(jSONObject);
        }
        C1052 c1052 = c1086.f2767;
        c1052.f2655.post(new C1054(c1052, c1086.f2769.f2439.m4248(), jSONArray, new C1191(c1086, jSONArray, arrayList, c1276)));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m4387(C0375 c0375) {
        this.f2763.add(c0375);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m4386(C0374 c0374) {
        this.f2762.add(c0374);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4388(String str, JSONObject jSONObject) {
        m4389(str, jSONObject, null, null);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4389(String str, JSONObject jSONObject, JSONObject jSONObject2, C0548 c0548) {
        boolean z;
        String str2 = f2754;
        AbstractC0580.m4079(str2, str2, AbstractC1293.m4543("rMIefwOQoP74xxYrAt6j6bY=\n", "jLV3C2uwxYY=\n", AbstractC0446.m4006("C7HnWmXA4wIw4+1WZcPjEymm8Ecxhw==\n", "X8OeMwunw3Y=\n", new StringBuilder(), str)), jSONObject, true);
        try {
            if (m4385().m4272().contains(str)) {
                AbstractC0580.m4078(str2, StringFog.decrypt("KZT4c0JSfdAOletzVEF22hPb+zpFXzPaBpbpaRE=\n", "Z/uMUzE3E7Q=\n") + str + StringFog.decrypt("m+MOggCzZFner0uYGv9iWMm9DohK\n", "u8tr+mPfET0=\n"));
                return;
            }
            AbstractC0580.m4078(str2, StringFog.decrypt("7vHJZysepDvVo8NrKx2kKszm3nplDu070qPebygcvm8=\n", "uoOwDkV5hE8=\n") + str);
            C1052 c1052 = this.f2767;
            C0951 c0951 = this.f2769.f2439;
            synchronized (c0951) {
                z = c0951.f2268;
            }
            c1052.m4326(str, jSONObject, jSONObject2, z, new C1143(this, c0548));
        } catch (Exception e) {
            AbstractC0577.m4069(f2754, StringFog.decrypt("p+WA8TzsWzDC5JfwKolEO4zj\n", "4pfynk7MMl4=\n"), e, false, false, true);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized C0972 m4385() {
        return ((C0600) AbstractC0590.m4087()).f1016;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m4391(boolean z) {
        try {
            if (z) {
                this.f2766.removeCallbacksAndMessages(null);
                this.f2766.postDelayed(new C1283(this), 0);
            } else {
                C0404 c0404 = this.f2768;
                C1087 c1087 = new C1087(this);
                c0404.getClass();
                C0916.m4240().post(new C0422(c0404, c1087));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4390(JSONObject jSONObject) {
        JSONObject jSONObject2;
        C0972 m4385 = m4385();
        C0839 c0839 = m4385.f2997;
        JSONObject jSONObject3 = c0839.f2054;
        String str = c0839.f2056;
        List arrayList = new ArrayList();
        String str2 = AbstractC1006.f2436;
        JSONArray optJSONArray = jSONObject3.optJSONArray(str);
        if (optJSONArray != null) {
            arrayList = AbstractC1006.m4289(optJSONArray);
        }
        synchronized (m4385) {
            jSONObject2 = m4385.f2998;
        }
        String decrypt = StringFog.decrypt("INQj\n", "RqBb8WTj3Sk=\n");
        List arrayList2 = new ArrayList();
        JSONArray optJSONArray2 = jSONObject2.optJSONArray(decrypt);
        if (optJSONArray2 != null) {
            arrayList2 = AbstractC1006.m4289(optJSONArray2);
        }
        arrayList.addAll(arrayList2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONObject.remove((String) it.next());
        }
    }
}
