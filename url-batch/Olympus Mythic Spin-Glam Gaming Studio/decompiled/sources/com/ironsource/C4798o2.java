package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.ironsource.o2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4798o2 implements InterfaceC4816p2 {

    @NotNull
    private final String a;

    @NotNull
    private final Fd b;

    public C4798o2(@NotNull String encryptedAuctionResponse, @NotNull Fd providerName) {
        Intrinsics.checkNotNullParameter(encryptedAuctionResponse, "encryptedAuctionResponse");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.a = encryptedAuctionResponse;
        this.b = providerName;
    }

    @Override // com.ironsource.InterfaceC4816p2
    @NotNull
    public Object a() {
        Object m8023constructorimpl;
        String c = C4729k5.b().c();
        Intrinsics.checkNotNullExpressionValue(c, "getInstance().mediationKey");
        C4842qa c4842qa = new C4842qa(new F4(this.a, c));
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(c4842qa.a());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl == null) {
            return C4762m2.h.a((JSONObject) m8023constructorimpl, this.b.value());
        }
        C4782n4.d().a(m8026exceptionOrNullimpl);
        return m8026exceptionOrNullimpl instanceof IllegalArgumentException ? Result.m8023constructorimpl(ResultKt.createFailure(new C4571b8(C4908u5.a.d()))) : Result.m8023constructorimpl(ResultKt.createFailure(new C4571b8(C4908u5.a.h())));
    }
}
