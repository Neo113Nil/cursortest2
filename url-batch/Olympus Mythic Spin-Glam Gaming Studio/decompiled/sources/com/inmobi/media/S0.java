package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* loaded from: classes13.dex */
public abstract class S0 {
    public final C4493y9 a;

    public S0(C4493y9 c4493y9) {
        this.a = c4493y9;
    }

    public abstract Object a(Continuation continuation);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Function1 function1, ContinuationImpl continuationImpl) {
        Q0 q0;
        int i;
        if (continuationImpl instanceof Q0) {
            q0 = (Q0) continuationImpl;
            int i2 = q0.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q0.d = i2 - Integer.MIN_VALUE;
                Object obj = q0.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = q0.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    function1.invoke(C4363tb.a);
                    q0.a = function1;
                    q0.d = 1;
                    obj = a(q0);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    function1 = q0.a;
                    ResultKt.throwOnFailure(obj);
                }
                q0.a = null;
                q0.d = 2;
                Object a = a((String) obj, function1, q0);
                return a != coroutine_suspended ? coroutine_suspended : a;
            }
        }
        q0 = new Q0(this, continuationImpl);
        Object obj2 = q0.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = q0.d;
        if (i != 0) {
        }
        q0.a = null;
        q0.d = 2;
        Object a2 = a((String) obj2, function1, q0);
        if (a2 != coroutine_suspended2) {
        }
    }

    public abstract Unit a(AdResponse adResponse, Function1 function1);

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0103, code lost:
    
        if (a(r0, r14) == r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x007a, code lost:
    
        if (r2 == r4) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00de -> B:46:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x00e0 -> B:46:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x00c7 -> B:46:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x00c9 -> B:46:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Function1 function1, ContinuationImpl continuationImpl) {
        R0 r0;
        int i;
        AdResponse adResponse;
        AdSet adSet;
        Function1 function12;
        AdResponse adResponse2;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        int i2;
        AdResponse adResponse3;
        Iterator it;
        int i3;
        Xg pubContent;
        long j;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads2;
        long j2;
        Function1 function13 = function1;
        if (continuationImpl instanceof R0) {
            r0 = (R0) continuationImpl;
            int i4 = r0.h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                r0.h = i4 - Integer.MIN_VALUE;
                Object obj = r0.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = r0.h;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    function13.invoke(Yf.a);
                    V0 v0 = V0.a;
                    r0.a = function13;
                    r0.h = 1;
                    obj = v0.a(str, r0);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            adResponse2 = (AdResponse) r0.a;
                            ResultKt.throwOnFailure(obj);
                            AdSet adSet2 = (AdSet) CollectionsKt.firstOrNull((List) adResponse2.getAdSets());
                            if (adSet2 != null) {
                                long expiry = adSet2.getExpiry();
                                Long valueOf = Long.valueOf(expiry);
                                if (expiry <= 0) {
                                    valueOf = null;
                                }
                                if (valueOf != null) {
                                    j = valueOf.longValue();
                                    if (adSet2 != null && (ads2 = adSet2.getAds()) != null) {
                                        for (com.inmobi.media.ads.network.common.model.Ad ad : ads2) {
                                            Long expiry2 = ad.getExpiry();
                                            if (expiry2 != null) {
                                                if (expiry2.longValue() <= 0) {
                                                    expiry2 = null;
                                                }
                                                if (expiry2 != null) {
                                                    j2 = expiry2.longValue();
                                                    ad.setExpiryTimestampInMillis(j2 != -1 ? -1L : TimeUnit.SECONDS.toMillis(j2) + ad.getInsertionTimestampInMillis());
                                                }
                                            }
                                            j2 = j;
                                            ad.setExpiryTimestampInMillis(j2 != -1 ? -1L : TimeUnit.SECONDS.toMillis(j2) + ad.getInsertionTimestampInMillis());
                                        }
                                    }
                                    return adResponse2;
                                }
                            }
                            j = -1;
                            if (adSet2 != null) {
                                while (r2.hasNext()) {
                                }
                            }
                            return adResponse2;
                        }
                        i3 = r0.e;
                        i2 = r0.d;
                        it = r0.c;
                        adResponse3 = r0.b;
                        function12 = (Function1) r0.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (ClassCastException e) {
                            C4493y9 c4493y9 = this.a;
                            if (c4493y9 != null) {
                                c4493y9.a("AdResponseManager", "Error parsing pub content: " + i3, e);
                            }
                        } catch (IllegalArgumentException e2) {
                            C4493y9 c4493y92 = this.a;
                            if (c4493y92 != null) {
                                c4493y92.a("AdResponseManager", "Error parsing pub content: " + i3, e2);
                            }
                        }
                        do {
                            i3 = i2;
                            if (!it.hasNext()) {
                                Object next = it.next();
                                i2 = i3 + 1;
                                if (i3 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                pubContent = ((com.inmobi.media.ads.network.common.model.Ad) next).getPubContent();
                                r0.a = function12;
                                r0.b = adResponse3;
                                r0.c = it;
                                r0.d = i2;
                                r0.e = i3;
                                r0.h = 2;
                            } else {
                                adResponse2 = adResponse3;
                                r0.a = adResponse2;
                                r0.b = null;
                                r0.c = null;
                                r0.h = 3;
                            }
                        } while (pubContent.a(r0) != coroutine_suspended);
                        return coroutine_suspended;
                    }
                    function13 = (Function1) r0.a;
                    ResultKt.throwOnFailure(obj);
                }
                adResponse = (AdResponse) obj;
                adSet = (AdSet) CollectionsKt.firstOrNull((List) adResponse.getAdSets());
                if (adSet == null && (ads = adSet.getAds()) != null) {
                    i2 = 0;
                    function12 = function13;
                    adResponse3 = adResponse;
                    it = ads.iterator();
                    do {
                        i3 = i2;
                        if (!it.hasNext()) {
                        }
                    } while (pubContent.a(r0) != coroutine_suspended);
                    return coroutine_suspended;
                }
                function12 = function13;
                adResponse2 = adResponse;
                r0.a = adResponse2;
                r0.b = null;
                r0.c = null;
                r0.h = 3;
            }
        }
        r0 = new R0(this, continuationImpl);
        Object obj2 = r0.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = r0.h;
        if (i != 0) {
        }
        adResponse = (AdResponse) obj2;
        adSet = (AdSet) CollectionsKt.firstOrNull((List) adResponse.getAdSets());
        if (adSet == null) {
        }
        function12 = function13;
        adResponse2 = adResponse;
        r0.a = adResponse2;
        r0.b = null;
        r0.c = null;
        r0.h = 3;
    }
}
