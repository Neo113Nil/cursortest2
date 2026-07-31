package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.hm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4059hm {
    public static final C4059hm a = new C4059hm();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, C4456x c4456x, ArrayList arrayList, ContinuationImpl continuationImpl) {
        C4033gm c4033gm;
        int i;
        Ml ml;
        Sl e;
        Ml ml2;
        if (continuationImpl instanceof C4033gm) {
            c4033gm = (C4033gm) continuationImpl;
            int i2 = c4033gm.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4033gm.d = i2 - Integer.MIN_VALUE;
                Object obj = c4033gm.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4033gm.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    G g = c4456x.b;
                    ml = new Ml(g);
                    C3979em c3979em = new C3979em(c4456x.b.a.b.getVastVideo(), ml, c4456x.a.c);
                    try {
                        Map a2 = Hk.a(g);
                        C4425vk c4425vk = C4425vk.a;
                        C4425vk.b("VastParseStart", a2, EnumC4530zk.a);
                        c4033gm.a = ml;
                        try {
                            c4033gm.d = 1;
                            Object a3 = c3979em.a(str, arrayList, c4033gm);
                            if (a3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj = a3;
                            ml2 = ml;
                        } catch (Sl e2) {
                            e = e2;
                            short s = e.a;
                            Map a4 = Hk.a(ml.a);
                            a4.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
                            C4425vk c4425vk2 = C4425vk.a;
                            C4425vk.b("VastParseFailure", a4, EnumC4530zk.a);
                            throw e;
                        }
                    } catch (Sl e3) {
                        e = e3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ml2 = c4033gm.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Sl e4) {
                        e = e4;
                        ml = ml2;
                        short s2 = e.a;
                        Map a42 = Hk.a(ml.a);
                        a42.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s2));
                        C4425vk c4425vk22 = C4425vk.a;
                        C4425vk.b("VastParseFailure", a42, EnumC4530zk.a);
                        throw e;
                    }
                }
                Map a5 = Hk.a(ml2.a);
                C4425vk c4425vk3 = C4425vk.a;
                C4425vk.b("VastParseSuccess", a5, EnumC4530zk.a);
                return obj;
            }
        }
        c4033gm = new C4033gm(this, continuationImpl);
        Object obj2 = c4033gm.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4033gm.d;
        if (i != 0) {
        }
        Map a52 = Hk.a(ml2.a);
        C4425vk c4425vk32 = C4425vk.a;
        C4425vk.b("VastParseSuccess", a52, EnumC4530zk.a);
        return obj2;
    }
}
