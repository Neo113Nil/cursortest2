package com.vungle.ads.internal.network;

import com.vungle.ads.TpatError;
import com.vungle.ads.internal.model.c3;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;

/* loaded from: classes6.dex */
public final class r {
    public final VungleApiClient a;
    public final Executor b;
    public final com.vungle.ads.internal.signals.j c;
    public final FilePreferences d;
    public final Object e;

    public r(VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.j ioExecutor, com.vungle.ads.internal.executor.j jobExecutor, PathProvider pathProvider, com.vungle.ads.internal.signals.j jVar) {
        Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        Intrinsics.checkNotNullParameter(ioExecutor, "ioExecutor");
        Intrinsics.checkNotNullParameter(jobExecutor, "jobExecutor");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.a = vungleApiClient;
        this.b = jobExecutor;
        this.c = jVar;
        this.d = FilePreferences.d.a(ioExecutor, pathProvider, "vngFailedTpats");
        this.e = new Object();
    }

    public final void b() {
        for (Map.Entry entry : a().entrySet()) {
            String str = (String) entry.getKey();
            d dVar = (d) entry.getValue();
            p pVar = new p(str);
            pVar.g = true;
            pVar.e = Boolean.FALSE;
            pVar.c = dVar.b;
            pVar.d = dVar.c;
            pVar.h = dVar.e;
            p a = pVar.a(dVar.a);
            a.i = dVar.f;
            a(a.a(), true);
        }
    }

    public final void a(final q request, final boolean z) {
        Intrinsics.checkNotNullParameter(request, "request");
        final String url = request.i();
        Intrinsics.checkNotNullParameter(url, "url");
        com.vungle.ads.internal.signals.j jVar = this.c;
        String d = jVar != null ? jVar.d() : null;
        if (d == null) {
            d = "";
        }
        if (d.length() > 0) {
            String quote = Pattern.quote("{{{session_id}}}");
            Intrinsics.checkNotNullExpressionValue(quote, "quote(Constants.SESSION_ID)");
            url = new Regex(quote).replace(url, d);
        }
        this.b.execute(new Runnable() { // from class: com.vungle.ads.internal.network.r$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                r.a(r.this, request, url, z);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        if (r3 < r11.e()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        r0 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        r3 = com.iab.omid.library.vungle.internal.l.a("tpat key: ");
        r3.append(r11.i);
        r3.append(", error: ");
        r3.append(r4.a);
        r3.append(", errorIsTerminal: ");
        r3.append(r4.b);
        r3.append(" url: ");
        r3.append(r12);
        r3 = r3.toString();
        r5 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("TpatSender", r3);
        new com.vungle.ads.TpatError(r0, r3).setLogEntry$vungle_ads_release(r11.j).logErrorNoReturnValue$vungle_ads_release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        r0 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_ERROR;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r this$0, q request, String urlWithSessionId, boolean z) {
        boolean z2;
        c3 a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(urlWithSessionId, "$urlWithSessionId");
        this$0.getClass();
        Boolean bool = request.e;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            String str = request.i;
            z2 = Intrinsics.areEqual(str, "checkpoint.0") || Intrinsics.areEqual(str, UnifiedMediationParams.KEY_CLICK_URL) || Intrinsics.areEqual(str, "impression") || Intrinsics.areEqual(str, "load_ad");
        }
        int i = 0;
        do {
            a = this$0.a.a(urlWithSessionId, request.b(), request.a(), request.d(), request.c());
            if (!z2 || a == null || !a.b()) {
                break;
            } else {
                i++;
            }
        } while (i < request.e());
        if (request.f()) {
            if (a == null || !a.a()) {
                if (a != null || z) {
                    synchronized (this$0.e) {
                        try {
                            Map a2 = this$0.a();
                            d dVar = (d) a2.get(request.i());
                            int a3 = dVar != null ? dVar.a() : 0;
                            if (a == null && a3 > 0) {
                                a2.remove(request.i());
                                this$0.a(a2);
                            } else if (a != null && a3 >= request.g()) {
                                a2.remove(request.i());
                                this$0.a(a2);
                                Sdk.SDKError.Reason reason = Sdk.SDKError.Reason.TPAT_RETRY_FAILED;
                                String str2 = "tpat key: " + request.i + ", error: " + a.a + ", errorIsTerminal: " + a.b + " url: " + urlWithSessionId;
                                boolean z3 = com.vungle.ads.internal.util.u.a;
                                com.vungle.ads.internal.util.t.b("TpatSender", str2);
                                new TpatError(reason, str2).setLogEntry$vungle_ads_release(request.j).logErrorNoReturnValue$vungle_ads_release();
                            } else if (a != null) {
                                d dVar2 = (d) a2.get(request.i());
                                a2.put(request.i(), dVar2 != null ? d.a(dVar2, a3 + 1) : new d(request.d(), request.b(), request.a(), 1, request.g(), request.h()));
                                this$0.a(a2);
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public final Map a() {
        Object m8023constructorimpl;
        String string = this.d.getString("FAILED_TPATS");
        if (string != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Json.Default r1 = Json.Default;
                SerializersModule serializersModule = r1.getSerializersModule();
                KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
                KSerializer serializer = SerializersKt.serializer(serializersModule, Reflection.mutableCollectionType(Reflection.typeOf(Map.class, companion2.invariant(Reflection.typeOf(String.class)), companion2.invariant(Reflection.typeOf(d.class)))));
                Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                m8023constructorimpl = Result.m8023constructorimpl((Map) r1.decodeFromString(serializer, string));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
            if (m8026exceptionOrNullimpl != null) {
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.b("TpatSender", "Failed to decode stored tpats: " + m8026exceptionOrNullimpl);
            }
            if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
                m8023constructorimpl = new LinkedHashMap();
            }
            Map map = (Map) m8023constructorimpl;
            if (map != null) {
                return map;
            }
        }
        return new LinkedHashMap();
    }

    public final void a(Map map) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            FilePreferences filePreferences = this.d;
            Json.Default r2 = Json.Default;
            SerializersModule serializersModule = r2.getSerializersModule();
            KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
            KSerializer serializer = SerializersKt.serializer(serializersModule, Reflection.mutableCollectionType(Reflection.typeOf(Map.class, companion2.invariant(Reflection.typeOf(String.class)), companion2.invariant(Reflection.typeOf(d.class)))));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            filePreferences.a("FAILED_TPATS", r2.encodeToString(serializer, map)).b();
            m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.b("TpatSender", "Failed to encode the about to storing tpats: " + map);
        }
    }
}
