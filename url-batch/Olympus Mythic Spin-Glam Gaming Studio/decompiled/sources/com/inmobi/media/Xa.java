package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.Job;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class Xa implements Zf {
    public CrashConfig a;
    public C4358t6 b;
    public final C3913ca c;
    public final Function1 d;

    public Xa(CrashConfig crashConfig) {
        Intrinsics.checkNotNullParameter(crashConfig, "crashConfig");
        this.a = crashConfig;
        this.c = new C3913ca(crashConfig);
        this.d = new Function1() { // from class: com.inmobi.media.Xa$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Xa.a(Xa.this, (N2) obj);
            }
        };
    }

    public static final Unit a(Xa xa, N2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i = it.a;
        if (i != 1 && i != 2) {
            switch (i) {
                case 150:
                case 151:
                case 152:
                    Map map = it.c;
                    if (map != null && map.containsKey("data")) {
                        Object obj = it.c.get("data");
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.inmobi.commons.core.incident.IncidentEvent");
                        C3887ba incident = (C3887ba) obj;
                        xa.getClass();
                        Intrinsics.checkNotNullParameter(incident, "incident");
                        Hl.a(new Wa(xa, incident, null));
                        break;
                    }
                    break;
            }
        } else {
            C4358t6 c4358t6 = xa.b;
            if (c4358t6 != null) {
                c4358t6.f.set(false);
                c4358t6.g.set(true);
                Job job = c4358t6.j;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, null, 1, null);
                }
                c4358t6.j = null;
                c4358t6.i = null;
            }
            xa.b = null;
            ((Kc) AbstractC4002fj.e.getValue()).a(xa.d);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ff, code lost:
    
        if (r13 != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0101, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (r13.a(r15, (kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (r15 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        if (r15.a(r7, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Xa xa, C3887ba c3887ba, ContinuationImpl continuationImpl) {
        Sa sa;
        int i;
        C3887ba c3887ba2;
        String str;
        Object a;
        xa.getClass();
        if (continuationImpl instanceof Sa) {
            sa = (Sa) continuationImpl;
            int i2 = sa.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sa.d = i2 - Integer.MIN_VALUE;
                Object obj = sa.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sa.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = System.currentTimeMillis() - (xa.a.getEventTTL() * 1000);
                    Y9 y9 = (Y9) AbstractC3861aa.a.getValue();
                    sa.a = c3887ba;
                    sa.d = 1;
                } else if (i == 1) {
                    c3887ba = sa.a;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    c3887ba = sa.a;
                    ResultKt.throwOnFailure(obj);
                    int intValue = (((Number) obj).intValue() + 1) - xa.a.getMaxEventsToPersist();
                    if (intValue > 0) {
                        Y9 y92 = (Y9) AbstractC3861aa.a.getValue();
                        sa.a = c3887ba;
                        sa.d = 3;
                    }
                    c3887ba2 = c3887ba;
                    Y9 y93 = (Y9) AbstractC3861aa.a.getValue();
                    sa.a = null;
                    sa.d = 4;
                    C4308r9 c4308r9 = y93.b;
                    String str2 = y93.a;
                    c3887ba2.getClass();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("eventId", c3887ba2.e);
                    contentValues.put("componentType", c3887ba2.f);
                    contentValues.put("eventType", c3887ba2.a);
                    str = c3887ba2.b;
                    if (str == null) {
                    }
                    contentValues.put("payload", str);
                    contentValues.put("ts", String.valueOf(c3887ba2.c));
                    a = c4308r9.a(str2, contentValues, 4, sa);
                    if (a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    c3887ba2 = sa.a;
                    ResultKt.throwOnFailure(obj);
                    Y9 y932 = (Y9) AbstractC3861aa.a.getValue();
                    sa.a = null;
                    sa.d = 4;
                    C4308r9 c4308r92 = y932.b;
                    String str22 = y932.a;
                    c3887ba2.getClass();
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("eventId", c3887ba2.e);
                    contentValues2.put("componentType", c3887ba2.f);
                    contentValues2.put("eventType", c3887ba2.a);
                    str = c3887ba2.b;
                    if (str == null) {
                        str = "";
                    }
                    contentValues2.put("payload", str);
                    contentValues2.put("ts", String.valueOf(c3887ba2.c));
                    a = c4308r92.a(str22, contentValues2, 4, sa);
                    if (a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        a = Unit.INSTANCE;
                    }
                }
                Y9 y94 = (Y9) AbstractC3861aa.a.getValue();
                sa.a = c3887ba;
                sa.d = 2;
                obj = y94.a(sa);
            }
        }
        sa = new Sa(xa, continuationImpl);
        Object obj2 = sa.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sa.d;
        if (i != 0) {
        }
        Y9 y942 = (Y9) AbstractC3861aa.a.getValue();
        sa.a = c3887ba;
        sa.d = 2;
        obj2 = y942.a(sa);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Xa xa, ContinuationImpl continuationImpl) {
        Va va;
        Object obj;
        int i;
        xa.getClass();
        if (continuationImpl instanceof Va) {
            va = (Va) continuationImpl;
            int i2 = va.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                va.c = i2 - Integer.MIN_VALUE;
                obj = va.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = va.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Y9 y9 = (Y9) AbstractC3861aa.a.getValue();
                    va.c = 1;
                    obj = y9.a(va);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((Number) obj).intValue() > 0) {
                    xa.a();
                }
                return Unit.INSTANCE;
            }
        }
        va = new Va(xa, continuationImpl);
        obj = va.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = va.c;
        if (i != 0) {
        }
        if (((Number) obj).intValue() > 0) {
        }
        return Unit.INSTANCE;
    }

    public final void a() {
        C4121k6 eventConfig = this.a.getEventConfig();
        eventConfig.k = this.a.getUrl();
        C4358t6 c4358t6 = this.b;
        if (c4358t6 != null) {
            Intrinsics.checkNotNullParameter(eventConfig, "eventConfig");
            c4358t6.i = eventConfig;
        } else {
            this.b = new C4358t6("crash", (Y9) AbstractC3861aa.a.getValue(), this, this.a.getEventConfig(), null);
        }
        C4358t6 c4358t62 = this.b;
        if (c4358t62 != null) {
            c4358t62.a(false);
        }
    }

    @Override // com.inmobi.media.Zf
    public final Object a(Continuation continuation) {
        int a;
        Object runBlocking$default;
        String str;
        F5.a.getClass();
        int n = F5.n();
        int i = 1;
        if (n == 0) {
            a = this.a.getMobileConfig().a();
        } else if (n != 1) {
            a = this.a.getMobileConfig().a();
        } else {
            a = this.a.getWifiConfig().a();
        }
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new Ra(a, null), 1, null);
        List<C3887ba> list = (List) runBlocking$default;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Boxing.boxInt(((C3887ba) it.next()).d));
            }
            try {
                HashMap hashMap = new HashMap(F5.a.a(false));
                hashMap.put("im-accid", AbstractC4002fj.c);
                hashMap.put("version", "2.0.0");
                hashMap.put("component", "crash");
                hashMap.put("mk-version", AbstractC4030gj.a());
                hashMap.putAll(E1.e);
                hashMap.put("tp", AbstractC4030gj.b);
                String str2 = AbstractC4030gj.a;
                if (str2 == null) {
                    str2 = "";
                }
                hashMap.put("tpVer", str2);
                JSONObject jSONObject = new JSONObject(hashMap);
                JSONArray jSONArray = new JSONArray();
                for (C3887ba c3887ba : list) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("eventId", c3887ba.e);
                    jSONObject2.put("eventType", c3887ba.a);
                    String str3 = c3887ba.b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    int length = str3.length() - i;
                    int i2 = 0;
                    boolean z = false;
                    while (i2 <= length) {
                        boolean z2 = Intrinsics.compare((int) str3.charAt(!z ? i2 : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i2++;
                        } else {
                            z = true;
                        }
                    }
                    if (str3.subSequence(i2, length + 1).toString().length() > 0) {
                        String str4 = c3887ba.b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        jSONObject2.put("crash_report", str4);
                    }
                    jSONObject2.put("ts", c3887ba.c);
                    jSONArray.put(jSONObject2);
                    i = 1;
                }
                jSONObject.put("crash", jSONArray);
                str = jSONObject.toString();
            } catch (JSONException unused) {
                str = null;
            }
            if (str != null) {
                return new C4173m6(str, arrayList);
            }
        }
        return null;
    }
}
