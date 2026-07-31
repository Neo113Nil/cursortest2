package com.inmobi.media;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.s3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4328s3 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b4 A[Catch: Exception -> 0x00d0, CancellationException -> 0x00d2, TryCatch #4 {CancellationException -> 0x00d2, Exception -> 0x00d0, blocks: (B:13:0x00a9, B:15:0x00b4, B:21:0x00c1, B:23:0x00c5, B:28:0x00d5, B:47:0x0093), top: B:46:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Z2 z2, ContinuationImpl continuationImpl) {
        C4301r3 c4301r3;
        int i;
        String str;
        Exception e;
        String str2;
        InterfaceC3892bf interfaceC3892bf;
        Z2 z22 = z2;
        if (continuationImpl instanceof C4301r3) {
            c4301r3 = (C4301r3) continuationImpl;
            int i2 = c4301r3.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4301r3.d = i2 - Integer.MIN_VALUE;
                Object obj = c4301r3.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4301r3.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    E3 e3 = E3.a;
                    Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                    int i3 = z22.a;
                    str = "access$getTAG$p(...)";
                    Xe xe = new Xe(z22.b, E3.a(z2), new Ok(E3.c().getPingTimeout() * 1000, E3.c().getPingTimeout() * 1000, E3.c().getPingTimeout() * 1000), z22.c, null, z22.d, 16);
                    try {
                        F9 f9 = (F9) Ve.f.getValue();
                        c4301r3.a = z22;
                        c4301r3.d = 1;
                        obj = f9.a.a(xe, c4301r3);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (CancellationException unused) {
                        str2 = str;
                        E3 e32 = E3.a;
                        Intrinsics.checkNotNullExpressionValue("E3", str2);
                        return EnumC4069i6.n;
                    } catch (Exception e2) {
                        e = e2;
                        E3 e33 = E3.a;
                        Intrinsics.checkNotNullExpressionValue("E3", str);
                        e.getMessage();
                        return EnumC4069i6.d;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z22 = c4301r3.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        str = "access$getTAG$p(...)";
                    } catch (CancellationException unused2) {
                        str2 = "access$getTAG$p(...)";
                        E3 e322 = E3.a;
                        Intrinsics.checkNotNullExpressionValue("E3", str2);
                        return EnumC4069i6.n;
                    } catch (Exception e4) {
                        e = e4;
                        str = "access$getTAG$p(...)";
                        E3 e332 = E3.a;
                        Intrinsics.checkNotNullExpressionValue("E3", str);
                        e.getMessage();
                        return EnumC4069i6.d;
                    }
                }
                interfaceC3892bf = (InterfaceC3892bf) obj;
                E3 e34 = E3.a;
                if (!Fl.a(interfaceC3892bf)) {
                    return null;
                }
                int c = interfaceC3892bf.c();
                if (200 <= c && c < 300) {
                    return null;
                }
                if (!z22.d) {
                    C4017g6 c4017g6 = EnumC4069i6.b;
                    if (303 == c || 302 == c) {
                        return null;
                    }
                }
                EnumC4069i6.b.getClass();
                return C4017g6.a(c);
            }
        }
        c4301r3 = new C4301r3(this, continuationImpl);
        Object obj2 = c4301r3.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4301r3.d;
        if (i != 0) {
        }
        interfaceC3892bf = (InterfaceC3892bf) obj2;
        E3 e342 = E3.a;
        if (!Fl.a(interfaceC3892bf)) {
        }
    }
}
