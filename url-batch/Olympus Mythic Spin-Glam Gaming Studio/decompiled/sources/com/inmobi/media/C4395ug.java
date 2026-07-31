package com.inmobi.media;

import com.adjust.sdk.Constants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.yandex.div.core.DivActionHandler;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.chromium.net.NetError;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ug, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4395ug implements InterfaceC4421vg {
    public final InterfaceC4315rg a;
    public final Hi b;
    public final String c;
    public final AtomicBoolean d;

    public C4395ug(InterfaceC4315rg interfaceC4315rg, Hi hi) {
        this.a = interfaceC4315rg;
        this.b = hi;
        String id = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(id, "toString(...)");
        this.c = id;
        this.d = new AtomicBoolean(false);
        N8 n8 = C4131kg.b;
        if (n8 != null) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(this, "listener");
            n8.b.put(id, new WeakReference(this));
            Iterator it = n8.b.entrySet().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                    it.remove();
                }
            }
        }
        C4462x5 c4462x5 = C4131kg.c;
        if (c4462x5 != null) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(this, "listener");
            c4462x5.b.put(id, new WeakReference(this));
            Iterator it2 = c4462x5.b.entrySet().iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
                if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                    it2.remove();
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:25|26))(2:27|28)|12|(3:15|(2:17|18)(1:20)|13)|21|22|23))|38|6|7|(0)(0)|12|(1:13)|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002f, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        a(r8, (short) 2243);
        r10 = r8.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r10 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        r0 = com.inmobi.media.EnumC4043h6.a;
        ((com.inmobi.media.C4370ti) r10).a("", -104, "Ping JSON is invalid", java.lang.System.currentTimeMillis(), 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        r9.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002d, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        a(r8, (short) 2244);
        r9.getMessage();
        r10 = com.inmobi.media.AbstractC3861aa.a;
        com.inmobi.media.AbstractC4361t9.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x002b, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        a(r8, (short) 2245);
        r9.getMessage();
        r10 = com.inmobi.media.AbstractC3861aa.a;
        com.inmobi.media.AbstractC3861aa.a(new com.inmobi.media.Q2(r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[Catch: NoClassDefFoundError -> 0x002b, Exception -> 0x002d, JSONException -> 0x002f, TRY_LEAVE, TryCatch #2 {JSONException -> 0x002f, Exception -> 0x002d, NoClassDefFoundError -> 0x002b, blocks: (B:11:0x0027, B:13:0x0044, B:15:0x004a, B:28:0x003c), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        C4368tg c4368tg;
        int i;
        Iterator it;
        if (continuationImpl instanceof C4368tg) {
            c4368tg = (C4368tg) continuationImpl;
            int i2 = c4368tg.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4368tg.d = i2 - Integer.MIN_VALUE;
                Object obj = c4368tg.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4368tg.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    it = a(str).iterator();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = c4368tg.a;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    C4053hg c4053hg = (C4053hg) it.next();
                    b(c4053hg.e);
                    c4368tg.a = it;
                    c4368tg.d = 1;
                    if (a(c4053hg, c4368tg) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        c4368tg = new C4368tg(this, continuationImpl);
        Object obj2 = c4368tg.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4368tg.d;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    public final void b(String priority) {
        Hi hi = this.b;
        if (hi != null) {
            Intrinsics.checkNotNullParameter(priority, "priority");
            Map a = hi.a();
            a.put(DivActionHandler.DivActionReason.TRIGGER, priority);
            AbstractC4526zg.a("PingStarted", a);
        }
    }

    public static Object a(C4053hg c4053hg, C4368tg c4368tg) {
        Objects.toString(c4053hg);
        if (Intrinsics.areEqual(c4053hg.e, Constants.HIGH)) {
            N8 n8 = C4131kg.b;
            if (n8 != null) {
                Object b = n8.b(c4053hg, c4368tg);
                if (b != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    b = Unit.INSTANCE;
                }
                return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Unit.INSTANCE;
            }
        } else {
            C4462x5 c4462x5 = C4131kg.c;
            if (c4462x5 != null) {
                Object a = c4462x5.a(c4053hg, c4368tg);
                if (a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a = Unit.INSTANCE;
                }
                return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.inmobi.media.hg] */
    public final List a(String str) {
        JSONArray jSONArray = new JSONArray(str);
        if (jSONArray.length() == 0) {
            a(this, (short) 2253);
            InterfaceC4315rg interfaceC4315rg = this.a;
            if (interfaceC4315rg != null) {
                EnumC4043h6[] enumC4043h6Arr = EnumC4043h6.a;
                ((C4370ti) interfaceC4315rg).a("", -105, "Ping array is empty", System.currentTimeMillis(), 0);
            }
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                a(this, (short) 2254);
            } else {
                String optString = optJSONObject.optString("id");
                if (optString != null && !StringsKt.isBlank(optString)) {
                    String optString2 = optJSONObject.optString("url");
                    if (a(optString, optString2)) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("headers");
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (optJSONObject2 != null) {
                            Iterator<String> keys = optJSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                linkedHashMap.put(next, optJSONObject2.optString(next, ""));
                            }
                        }
                        boolean optBoolean = optJSONObject.optBoolean("allowRedirects", true);
                        String optString3 = optJSONObject.optString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Constants.NORMAL);
                        boolean optBoolean2 = optJSONObject.optBoolean("ackRequired", false);
                        Intrinsics.checkNotNull(optString2);
                        String str2 = optString3 == null ? Constants.NORMAL : optString3;
                        String str3 = this.c;
                        Hi hi = this.b;
                        r8 = new C4053hg(optString2, optString, linkedHashMap, optBoolean, str2, optBoolean2, 0, str3, System.currentTimeMillis(), null, hi != null ? hi.a : null);
                    }
                } else {
                    Intrinsics.checkNotNull(optString);
                    a(this, (short) 2255);
                    InterfaceC4315rg interfaceC4315rg2 = this.a;
                    if (interfaceC4315rg2 != null) {
                        EnumC4043h6[] enumC4043h6Arr2 = EnumC4043h6.a;
                        ((C4370ti) interfaceC4315rg2).a(optString, NetError.ERR_CONNECTION_RESET, "Ping ID is missing", System.currentTimeMillis(), 0);
                    }
                }
            }
            if (r8 != null) {
                arrayList.add(r8);
            }
        }
        return arrayList;
    }

    public final boolean a(String str, String str2) {
        String host;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            try {
                URI uri = new URI(str2);
                if ((Intrinsics.areEqual(uri.getScheme(), "http") || Intrinsics.areEqual(uri.getScheme(), "https")) && (host = uri.getHost()) != null) {
                    if (!StringsKt.isBlank(host)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            a(this, (short) 2256);
            InterfaceC4315rg interfaceC4315rg = this.a;
            if (interfaceC4315rg != null) {
                EnumC4043h6[] enumC4043h6Arr = EnumC4043h6.a;
                ((C4370ti) interfaceC4315rg).a(str, -102, "Ping url is invalid", System.currentTimeMillis(), 0);
            }
            return false;
        }
        a(this, (short) 2252);
        InterfaceC4315rg interfaceC4315rg2 = this.a;
        if (interfaceC4315rg2 != null) {
            EnumC4043h6[] enumC4043h6Arr2 = EnumC4043h6.a;
            ((C4370ti) interfaceC4315rg2).a(str, -103, "Ping URL is missing", System.currentTimeMillis(), 0);
        }
        return false;
    }

    public final void a(C4053hg ping, int i, long j) {
        InterfaceC4315rg interfaceC4315rg;
        Intrinsics.checkNotNullParameter(ping, "ping");
        if (this.d.get()) {
            return;
        }
        String str = ping.a;
        if (Intrinsics.areEqual(Constants.HIGH, ping.e) && ping.f && (interfaceC4315rg = this.a) != null) {
            ((C4370ti) interfaceC4315rg).a(ping.b, i, null, j, ping.g);
        }
        String priority = ping.e;
        long currentTimeMillis = System.currentTimeMillis() - ping.i;
        Hi hi = this.b;
        if (hi != null) {
            Intrinsics.checkNotNullParameter(priority, "priority");
            Map a = hi.a();
            a.put(DivActionHandler.DivActionReason.TRIGGER, priority);
            a.put("latency", Long.valueOf(currentTimeMillis));
            AbstractC4526zg.a("PingSuccess", a);
        }
    }

    public final void a(C4053hg ping, int i, String str, int i2, long j) {
        InterfaceC4315rg interfaceC4315rg;
        Intrinsics.checkNotNullParameter(ping, "ping");
        if (this.d.get()) {
            return;
        }
        String str2 = ping.a;
        if (Intrinsics.areEqual(Constants.HIGH, ping.e) && ping.f && ping.g < 1 && (interfaceC4315rg = this.a) != null) {
            ((C4370ti) interfaceC4315rg).a(ping.b, i, str, j, ping.g);
        }
        String priority = ping.e;
        Hi hi = this.b;
        if (hi != null) {
            if (priority == null) {
                priority = "unknown";
            }
            Intrinsics.checkNotNullParameter(priority, "priority");
            Map a = hi.a();
            a.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2247);
            a.put(DivActionHandler.DivActionReason.TRIGGER, priority);
            a.put("retryCount", String.valueOf(i2));
            AbstractC4526zg.a("PingFailed", a);
        }
    }

    public static void a(C4395ug c4395ug, short s) {
        Hi hi = c4395ug.b;
        if (hi != null) {
            Intrinsics.checkNotNullParameter("unknown", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Map a = hi.a();
            a.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
            a.put(DivActionHandler.DivActionReason.TRIGGER, "unknown");
            a.put("retryCount", String.valueOf(0));
            AbstractC4526zg.a("PingFailed", a);
        }
    }
}
