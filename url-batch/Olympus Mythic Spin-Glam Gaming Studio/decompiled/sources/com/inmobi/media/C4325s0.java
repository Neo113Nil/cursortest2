package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.s0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4325s0 {
    public static final C4325s0 a = new C4325s0();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Ze ze, ContinuationImpl continuationImpl) {
        C4273q0 c4273q0;
        int i;
        InterfaceC3892bf interfaceC3892bf;
        if (continuationImpl instanceof C4273q0) {
            c4273q0 = (C4273q0) continuationImpl;
            int i2 = c4273q0.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4273q0.c = i2 - Integer.MIN_VALUE;
                Object obj = c4273q0.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4273q0.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    c4273q0.c = 1;
                    obj = b(ze, c4273q0);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                interfaceC3892bf = (InterfaceC3892bf) obj;
                if (interfaceC3892bf.c() != 204) {
                    throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), new S6(interfaceC3892bf.c()));
                }
                int c = interfaceC3892bf.c();
                C4017g6 c4017g6 = EnumC4069i6.b;
                if (c == 176) {
                    throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), new R6((short) 2369));
                }
                if (interfaceC3892bf.c() == 200) {
                    return interfaceC3892bf;
                }
                int c2 = interfaceC3892bf.c();
                throw new Y(new InMobiAdRequestStatus(c2 != 192 ? c2 != 0 ? (c2 == 504 || c2 == 176) ? InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT : (400 > c2 || c2 >= 500) ? (500 > c2 || c2 > 599) ? InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR : InMobiAdRequestStatus.StatusCode.SERVER_ERROR : InMobiAdRequestStatus.StatusCode.REQUEST_INVALID : InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE : InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), new S6(interfaceC3892bf.c()));
            }
        }
        c4273q0 = new C4273q0(this, continuationImpl);
        Object obj2 = c4273q0.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4273q0.c;
        if (i != 0) {
        }
        interfaceC3892bf = (InterfaceC3892bf) obj2;
        if (interfaceC3892bf.c() != 204) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Ze ze, ContinuationImpl continuationImpl) {
        C4298r0 c4298r0;
        int i;
        try {
            if (continuationImpl instanceof C4298r0) {
                c4298r0 = (C4298r0) continuationImpl;
                int i2 = c4298r0.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c4298r0.c = i2 - Integer.MIN_VALUE;
                    Object obj = c4298r0.a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c4298r0.c;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    F9 f9 = (F9) Ve.a.getValue();
                    c4298r0.c = 1;
                    Object a2 = f9.a.a(ze, c4298r0);
                    return a2 == coroutine_suspended ? coroutine_suspended : a2;
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException unused) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new R6((short) 2206));
        }
        c4298r0 = new C4298r0(this, continuationImpl);
        Object obj2 = c4298r0.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4298r0.c;
    }
}
