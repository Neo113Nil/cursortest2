package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* renamed from: com.inmobi.media.yo, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4508yo extends S0 {
    public final Ze b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4508yo(Ze networkRequest, C4493y9 c4493y9) {
        super(c4493y9);
        Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
        this.b = networkRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.inmobi.media.S0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        C4482xo c4482xo;
        int i;
        if (continuation instanceof C4482xo) {
            c4482xo = (C4482xo) continuation;
            int i2 = c4482xo.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4482xo.c = i2 - Integer.MIN_VALUE;
                Object obj = c4482xo.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4482xo.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4325s0 c4325s0 = C4325s0.a;
                    Ze ze = this.b;
                    c4482xo.c = 1;
                    obj = c4325s0.a(ze, c4482xo);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                InterfaceC3892bf interfaceC3892bf = (InterfaceC3892bf) obj;
                IntRange intRange = AbstractC4026gf.a;
                Intrinsics.checkNotNullParameter(interfaceC3892bf, "<this>");
                return interfaceC3892bf.d().string(Charsets.UTF_8);
            }
        }
        c4482xo = new C4482xo(this, (ContinuationImpl) continuation);
        Object obj2 = c4482xo.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4482xo.c;
        if (i != 0) {
        }
        InterfaceC3892bf interfaceC3892bf2 = (InterfaceC3892bf) obj2;
        IntRange intRange2 = AbstractC4026gf.a;
        Intrinsics.checkNotNullParameter(interfaceC3892bf2, "<this>");
        return interfaceC3892bf2.d().string(Charsets.UTF_8);
    }

    @Override // com.inmobi.media.S0
    public final Unit a(AdResponse adResponse, Function1 function1) {
        Objects.toString(adResponse);
        W0.a(adResponse, this.a, function1);
        return Unit.INSTANCE;
    }
}
