package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ll, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4162ll {
    public static final Mutex c = MutexKt.Mutex$default(false, 1, null);
    public final InterfaceC3892bf a;
    public final LinkedHashSet b;

    public C4162ll(InterfaceC3892bf networkResponse, LinkedHashSet inMobiUnifiedIdInterfaceSet) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        Intrinsics.checkNotNullParameter(inMobiUnifiedIdInterfaceSet, "inMobiUnifiedIdInterfaceSet");
        this.a = networkResponse;
        this.b = inMobiUnifiedIdInterfaceSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:13:0x0087, B:14:0x00a0, B:16:0x00a6, B:23:0x00ae, B:19:0x00b9, B:26:0x00bd, B:33:0x0058, B:37:0x0067, B:43:0x0081, B:44:0x00c8), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:13:0x0087, B:14:0x00a0, B:16:0x00a6, B:23:0x00ae, B:19:0x00b9, B:26:0x00bd, B:33:0x0058, B:37:0x0067, B:43:0x0081, B:44:0x00c8), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JSONObject jSONObject, ContinuationImpl continuationImpl) {
        C4136kl c4136kl;
        Object coroutine_suspended;
        int i;
        JSONObject jSONObject2;
        Mutex mutex;
        int c2;
        Object a;
        JSONObject jSONObject3;
        try {
            if (continuationImpl instanceof C4136kl) {
                c4136kl = (C4136kl) continuationImpl;
                int i2 = c4136kl.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c4136kl.e = i2 - Integer.MIN_VALUE;
                    Object obj = c4136kl.c;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c4136kl.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = c;
                        c4136kl.a = jSONObject;
                        c4136kl.b = mutex2;
                        c4136kl.e = 1;
                        if (mutex2.lock(null, c4136kl) != coroutine_suspended) {
                            jSONObject2 = jSONObject;
                            mutex = mutex2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = c4136kl.b;
                        jSONObject3 = c4136kl.a;
                        ResultKt.throwOnFailure(obj);
                        Q9.b(AbstractC4216nl.a(jSONObject3, Q9.b()));
                        JSONObject a2 = AbstractC4216nl.a(Q9.b());
                        for (InMobiUnifiedIdInterface inMobiUnifiedIdInterface : this.b) {
                            if (a2 == null) {
                                AbstractC4216nl.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT));
                            } else {
                                AbstractC4216nl.a(inMobiUnifiedIdInterface, a2, null);
                            }
                        }
                        this.b.clear();
                        Unit unit = Unit.INSTANCE;
                        mutex.unlock(null);
                        return unit;
                    }
                    mutex = c4136kl.b;
                    jSONObject2 = c4136kl.a;
                    ResultKt.throwOnFailure(obj);
                    c2 = this.a.c();
                    C4017g6 c4017g6 = EnumC4069i6.b;
                    if (c2 != 192 && c2 != 0) {
                        C4084il c4084il = C4084il.a;
                        c4136kl.a = jSONObject2;
                        c4136kl.b = mutex;
                        c4136kl.e = 2;
                        a = N3.a(C4084il.b, new C3950dl(null), c4136kl);
                        if (a == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a = Unit.INSTANCE;
                        }
                        if (a != coroutine_suspended) {
                            jSONObject3 = jSONObject2;
                            Q9.b(AbstractC4216nl.a(jSONObject3, Q9.b()));
                            JSONObject a22 = AbstractC4216nl.a(Q9.b());
                            while (r0.hasNext()) {
                            }
                            this.b.clear();
                            Unit unit2 = Unit.INSTANCE;
                            mutex.unlock(null);
                            return unit2;
                        }
                        return coroutine_suspended;
                    }
                    Unit unit3 = Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit3;
                }
            }
            if (i != 0) {
            }
            c2 = this.a.c();
            C4017g6 c4017g62 = EnumC4069i6.b;
            if (c2 != 192) {
                C4084il c4084il2 = C4084il.a;
                c4136kl.a = jSONObject2;
                c4136kl.b = mutex;
                c4136kl.e = 2;
                a = N3.a(C4084il.b, new C3950dl(null), c4136kl);
                if (a == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
                if (a != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            Unit unit32 = Unit.INSTANCE;
            mutex.unlock(null);
            return unit32;
        } catch (Throwable th) {
            jSONObject.unlock(null);
            throw th;
        }
        c4136kl = new C4136kl(this, continuationImpl);
        Object obj2 = c4136kl.c;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4136kl.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #1 {all -> 0x00ad, blocks: (B:25:0x005d, B:29:0x0083, B:35:0x009d, B:36:0x00af), top: B:24:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, String str, ContinuationImpl continuationImpl) {
        C4110jl c4110jl;
        Object coroutine_suspended;
        int i2;
        String str2;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        int c2;
        Object a;
        String str3;
        try {
            if (continuationImpl instanceof C4110jl) {
                c4110jl = (C4110jl) continuationImpl;
                int i3 = c4110jl.f;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c4110jl.f = i3 - Integer.MIN_VALUE;
                    Object obj = c4110jl.d;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = c4110jl.f;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex3 = c;
                        c4110jl.b = str;
                        c4110jl.c = mutex3;
                        c4110jl.a = i;
                        c4110jl.f = 1;
                        if (mutex3.lock(null, c4110jl) != coroutine_suspended) {
                            str2 = str;
                            mutex = mutex3;
                        }
                        return coroutine_suspended;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = c4110jl.c;
                        str3 = c4110jl.b;
                        try {
                            ResultKt.throwOnFailure(obj);
                            a(str3);
                            Unit unit = Unit.INSTANCE;
                            mutex2.unlock(null);
                            return unit;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    i = c4110jl.a;
                    mutex = c4110jl.c;
                    str2 = c4110jl.b;
                    ResultKt.throwOnFailure(obj);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
                    C4425vk c4425vk = C4425vk.a;
                    C4425vk.b("UnifiedIdNetworkResponseFailure", linkedHashMap, EnumC4530zk.a);
                    c2 = this.a.c();
                    C4017g6 c4017g6 = EnumC4069i6.b;
                    if (c2 != 192 && c2 != 0) {
                        C4084il c4084il = C4084il.a;
                        c4110jl.b = str2;
                        c4110jl.c = mutex;
                        c4110jl.f = 2;
                        a = N3.a(C4084il.b, new C3950dl(null), c4110jl);
                        if (a == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a = Unit.INSTANCE;
                        }
                        if (a != coroutine_suspended) {
                            mutex2 = mutex;
                            str3 = str2;
                            a(str3);
                            Unit unit2 = Unit.INSTANCE;
                            mutex2.unlock(null);
                            return unit2;
                        }
                        return coroutine_suspended;
                    }
                    Unit unit3 = Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit3;
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
            C4425vk c4425vk2 = C4425vk.a;
            C4425vk.b("UnifiedIdNetworkResponseFailure", linkedHashMap2, EnumC4530zk.a);
            c2 = this.a.c();
            C4017g6 c4017g62 = EnumC4069i6.b;
            if (c2 != 192) {
                C4084il c4084il2 = C4084il.a;
                c4110jl.b = str2;
                c4110jl.c = mutex;
                c4110jl.f = 2;
                a = N3.a(C4084il.b, new C3950dl(null), c4110jl);
                if (a == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
                if (a != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            Unit unit32 = Unit.INSTANCE;
            mutex.unlock(null);
            return unit32;
        } catch (Throwable th3) {
            Mutex mutex4 = mutex;
            th = th3;
            mutex2 = mutex4;
            mutex2.unlock(null);
            throw th;
        }
        c4110jl = new C4110jl(this, continuationImpl);
        Object obj2 = c4110jl.d;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c4110jl.f;
        if (i2 != 0) {
        }
    }

    public final void a(String str) {
        JSONObject a = AbstractC4216nl.a(Q9.b());
        try {
            if (a != null) {
                try {
                    if (a.has("ufids") && a.getJSONArray("ufids").length() > 0) {
                        Iterator it = this.b.iterator();
                        while (it.hasNext()) {
                            AbstractC4216nl.a((InMobiUnifiedIdInterface) it.next(), a, null);
                        }
                        this.b.clear();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    this.b.clear();
                    return;
                }
            }
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                AbstractC4216nl.a((InMobiUnifiedIdInterface) it2.next(), null, new Error(InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT));
            }
            this.b.clear();
        } catch (Throwable th) {
            this.b.clear();
            throw th;
        }
    }
}
