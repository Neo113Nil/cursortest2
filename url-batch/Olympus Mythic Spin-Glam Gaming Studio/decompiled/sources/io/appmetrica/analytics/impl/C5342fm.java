package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: io.appmetrica.analytics.impl.fm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5342fm implements InterfaceC5368gm {
    public static final Map k = Collections.unmodifiableMap(new C5265cm());
    public final Ji b;
    public final C5549nm c;
    public final Handler d;
    public PublicLogger e;
    public HashMap i;
    public final List a = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
    public final Object g = new Object();
    public final WeakHashMap h = new WeakHashMap();
    public boolean j = false;
    public final C5291dm f = new C5291dm(this);

    public C5342fm(@NonNull Ji ji, @NonNull C5549nm c5549nm, @NonNull Handler handler) {
        this.b = ji;
        this.c = c5549nm;
        this.d = handler;
    }

    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list, @Nullable Map<String, String> map) {
        synchronized (this.g) {
            try {
                C5549nm c5549nm = this.c;
                c5549nm.getClass();
                if (!Do.a((Map) map) && !Do.a(map, c5549nm.e)) {
                    c5549nm.e = new HashMap(map);
                    c5549nm.g = true;
                    c5549nm.c();
                }
                a(startupParamsCallback, list);
                if (this.c.a((List) list)) {
                    a(list, new C5316em(this, startupParamsCallback), map, true);
                } else {
                    a(new Bundle(), startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c5 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0096, B:11:0x00c5, B:12:0x00cc, B:14:0x00d2, B:15:0x00d9, B:17:0x00ee, B:19:0x00f9, B:20:0x0105, B:26:0x00f3, B:27:0x0082, B:29:0x008f), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d2 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0096, B:11:0x00c5, B:12:0x00cc, B:14:0x00d2, B:15:0x00d9, B:17:0x00ee, B:19:0x00f9, B:20:0x0105, B:26:0x00f3, B:27:0x0082, B:29:0x008f), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ee A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0096, B:11:0x00c5, B:12:0x00cc, B:14:0x00d2, B:15:0x00d9, B:17:0x00ee, B:19:0x00f9, B:20:0x0105, B:26:0x00f3, B:27:0x0082, B:29:0x008f), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f9 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0096, B:11:0x00c5, B:12:0x00cc, B:14:0x00d2, B:15:0x00d9, B:17:0x00ee, B:19:0x00f9, B:20:0x0105, B:26:0x00f3, B:27:0x0082, B:29:0x008f), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0096, B:11:0x00c5, B:12:0x00cc, B:14:0x00d2, B:15:0x00d9, B:17:0x00ee, B:19:0x00f9, B:20:0x0105, B:26:0x00f3, B:27:0x0082, B:29:0x008f), top: B:3:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Bundle bundle) {
        HashMap hashMap;
        HashMap a;
        IdentifiersResult a2 = C5427j4.a(bundle, "Uuid");
        IdentifiersResult a3 = C5427j4.a(bundle, "DeviceId");
        IdentifiersResult a4 = C5427j4.a(bundle, "DeviceIdHash");
        IdentifiersResult a5 = C5427j4.a(bundle, "AdUrlReport");
        IdentifiersResult a6 = C5427j4.a(bundle, "AdUrlGet");
        IdentifiersResult a7 = C5427j4.a(bundle, "Clids");
        IdentifiersResult a8 = C5427j4.a(bundle, "RequestClids");
        IdentifiersResult a9 = C5427j4.a(bundle, IronSourceConstants.TYPE_GAID);
        IdentifiersResult a10 = C5427j4.a(bundle, "HOAID");
        IdentifiersResult a11 = C5427j4.a(bundle, "YANDEX_ADV_ID");
        IdentifiersResult a12 = C5427j4.a(bundle, "CUSTOM_SDK_HOSTS");
        long j = bundle.getLong("ServerTimeOffset");
        long j2 = bundle.getLong("NextStartupTime");
        C5616qa a13 = C5427j4.a(bundle);
        Bundle bundle2 = bundle.getBundle("module_configs");
        C5549nm c5549nm = this.c;
        synchronized (c5549nm) {
            try {
                IdentifiersResult identifiersResult = (IdentifiersResult) c5549nm.b.get(StartupParamsCallback.APPMETRICA_UUID);
                if (identifiersResult != null) {
                    Ho ho = c5549nm.o;
                    String str = identifiersResult.id;
                    ho.getClass();
                    if (Ho.a(str)) {
                        c5549nm.a(StartupParamsCallback.APPMETRICA_DEVICE_ID, a3);
                        c5549nm.a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, a4);
                        c5549nm.b.put("appmetrica_google_adv_id", a9);
                        c5549nm.b.put("appmetrica_huawei_oaid", a10);
                        c5549nm.b.put("appmetrica_yandex_adv_id", a11);
                        c5549nm.l.a(a12);
                        c5549nm.m.a(a13);
                        if (!C5549nm.a(a6)) {
                            c5549nm.b.put("appmetrica_get_ad_url", a6);
                        }
                        if (!C5549nm.a(a5)) {
                            c5549nm.b.put("appmetrica_report_ad_url", a5);
                        }
                        c5549nm.f = j;
                        T3 t3 = c5549nm.k;
                        hashMap = c5549nm.e;
                        a = Cb.a(a8.id);
                        t3.getClass();
                        if (!Do.a((Map) hashMap) ? Do.a((Map) a) : hashMap.equals(a)) {
                            c5549nm.b.put("appmetrica_clids", a7);
                            c5549nm.g = false;
                        }
                        c5549nm.h = j2;
                        c5549nm.c();
                    }
                }
                Ho ho2 = c5549nm.o;
                String str2 = a2.id;
                ho2.getClass();
                if (Ho.a(str2)) {
                    c5549nm.b.put(StartupParamsCallback.APPMETRICA_UUID, a2);
                }
                c5549nm.a(StartupParamsCallback.APPMETRICA_DEVICE_ID, a3);
                c5549nm.a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, a4);
                c5549nm.b.put("appmetrica_google_adv_id", a9);
                c5549nm.b.put("appmetrica_huawei_oaid", a10);
                c5549nm.b.put("appmetrica_yandex_adv_id", a11);
                c5549nm.l.a(a12);
                c5549nm.m.a(a13);
                if (!C5549nm.a(a6)) {
                }
                if (!C5549nm.a(a5)) {
                }
                c5549nm.f = j;
                T3 t32 = c5549nm.k;
                hashMap = c5549nm.e;
                a = Cb.a(a8.id);
                t32.getClass();
                if (!Do.a((Map) hashMap) ? Do.a((Map) a) : hashMap.equals(a)) {
                }
                c5549nm.h = j2;
                c5549nm.c();
            } catch (Throwable th) {
                throw th;
            }
        }
        C5661s4.l().m().a(bundle2, new SdkIdentifiers(a2.id, a3.id, a4.id));
        h();
    }

    @NonNull
    @VisibleForTesting
    public final S6 c() {
        return this.f;
    }

    public final String d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.c.b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    @NonNull
    public final C5667sa e() {
        C5616qa c5616qa;
        C5549nm c5549nm = this.c;
        C5537na c5537na = c5549nm.n;
        C5563oa c5563oa = c5549nm.m;
        synchronized (c5563oa) {
            c5616qa = c5563oa.b;
        }
        c5537na.getClass();
        Boolean bool = c5616qa.a;
        return new C5667sa();
    }

    public final long f() {
        return this.c.f;
    }

    public final String g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.c.b.get(StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final void h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.c.a((Collection) list)) {
                weakHashMap.put((StartupParamsCallback) entry.getKey(), list);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            StartupParamsCallback startupParamsCallback = (StartupParamsCallback) ((Map.Entry) it.next()).getKey();
            if (startupParamsCallback != null) {
                a(new Bundle(), startupParamsCallback);
            }
        }
        weakHashMap.clear();
    }

    public final void i() {
        synchronized (this.g) {
            try {
                if (this.j) {
                    if (this.c.b()) {
                    }
                }
                this.j = true;
                a(this.a, this.f, this.i, false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(@NonNull Bundle bundle) {
        b(bundle, null);
    }

    public final void a(@NonNull PublicLogger publicLogger) {
        this.e = publicLogger;
    }

    public final void a(List list, S6 s6, Map map, boolean z) {
        T6 t6 = new T6(this.d, s6);
        Ji ji = this.b;
        ji.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new C5694tb(t6, list, map, z));
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = Q9.a;
        C5273d4 c5273d4 = new C5273d4("", "", 1536, 0, anonymousInstance);
        c5273d4.m = bundle;
        V4 v4 = ji.a;
        ji.a(Ji.a(c5273d4, v4), v4, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (Do.a((Map) map)) {
            return;
        }
        synchronized (this.g) {
            try {
                HashMap b = Wm.b(map);
                this.i = b;
                this.b.a(b);
                C5549nm c5549nm = this.c;
                c5549nm.getClass();
                if (!Do.a((Map) b) && !Do.a(b, c5549nm.e)) {
                    c5549nm.e = new HashMap(b);
                    c5549nm.g = true;
                    c5549nm.c();
                }
            } finally {
            }
        }
    }

    public final void b(@NonNull Bundle bundle, @Nullable StartupParamsCallback startupParamsCallback) {
        synchronized (this.g) {
            try {
                b(bundle);
                h();
                if (startupParamsCallback != null) {
                    a(bundle, startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str) {
        synchronized (this.g) {
            this.b.a(str);
        }
    }

    public final void b(List<String> list) {
        synchronized (this.g) {
            try {
                List list2 = this.c.d;
                if (Do.a((Collection) list)) {
                    if (!Do.a((Collection) list2)) {
                        C5549nm c5549nm = this.c;
                        c5549nm.d = null;
                        c5549nm.i.a((List<String>) null);
                        this.b.a((List) null);
                    }
                } else if (!Do.a(list, list2)) {
                    C5549nm c5549nm2 = this.c;
                    c5549nm2.d = list;
                    c5549nm2.i.a(list);
                    this.b.a(list);
                } else {
                    this.b.a(list2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        EnumC5213am enumC5213am;
        if (this.h.containsKey(startupParamsCallback)) {
            List list = (List) this.h.get(startupParamsCallback);
            if (this.c.a((Collection) list)) {
                startupParamsCallback.onReceive(a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i = bundle.getInt("startup_error_key_code");
                    enumC5213am = EnumC5213am.UNKNOWN;
                    if (i == 1) {
                        enumC5213am = EnumC5213am.NETWORK;
                    } else if (i == 2) {
                        enumC5213am = EnumC5213am.PARSE;
                    }
                } else {
                    enumC5213am = null;
                }
                if (enumC5213am == null) {
                    if (!this.c.a()) {
                        PublicLogger publicLogger = this.e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    } else {
                        enumC5213am = EnumC5213am.UNKNOWN;
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(k, enumC5213am, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, a(list));
            }
            this.h.remove(startupParamsCallback);
            if (this.h.isEmpty()) {
                C5631r0 c5631r0 = this.b.d;
                synchronized (c5631r0.f) {
                    c5631r0.c = false;
                    c5631r0.c();
                }
            }
        }
    }

    public final void b(@Nullable String str) {
        synchronized (this.g) {
            this.b.b(str);
        }
    }

    public final Map<String, String> b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.c.b.get("appmetrica_clids");
        String str = identifiersResult == null ? null : identifiersResult.id;
        if (!TextUtils.isEmpty(str)) {
            return Cb.a(str);
        }
        return this.i;
    }

    public final StartupParamsCallback.Result a(List list) {
        HashMap hashMap = new HashMap();
        C5549nm c5549nm = this.c;
        synchronized (c5549nm) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    IdentifiersResult identifiersResult = (IdentifiersResult) c5549nm.b.get(str);
                    if (identifiersResult != null) {
                        hashMap.put(str, c5549nm.c.a(identifiersResult));
                    }
                }
                c5549nm.l.a(list, hashMap);
                c5549nm.m.a(list, hashMap);
            } catch (Throwable th) {
                throw th;
            }
        }
        return new StartupParamsCallback.Result(hashMap);
    }

    public final void a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.h.isEmpty()) {
            C5631r0 c5631r0 = this.b.d;
            synchronized (c5631r0.f) {
                c5631r0.c = true;
                c5631r0.b();
            }
        }
        this.h.put(startupParamsCallback, list);
    }

    @NonNull
    public final AdvIdentifiersResult a() {
        C5549nm c5549nm = this.c;
        Q q = c5549nm.j;
        IdentifiersResult identifiersResult = (IdentifiersResult) c5549nm.b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) c5549nm.b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) c5549nm.b.get("appmetrica_yandex_adv_id");
        q.getClass();
        return new AdvIdentifiersResult(Q.a(identifiersResult), Q.a(identifiersResult2), Q.a(identifiersResult3));
    }
}
