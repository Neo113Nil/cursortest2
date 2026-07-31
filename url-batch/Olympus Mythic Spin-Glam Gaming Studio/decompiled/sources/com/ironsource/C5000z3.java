package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.z3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5000z3 implements InterfaceC4803o7 {

    @Nullable
    private final Boolean a;

    @Nullable
    private final Integer b;

    @Nullable
    private final H3 c;

    public C5000z3(@Nullable Boolean bool, @Nullable Integer num, @Nullable H3 h3) {
        this.a = bool;
        this.b = num;
        this.c = h3;
    }

    private final Object a(H3 h3) {
        return new A3(this.a, this.b, h3).a();
    }

    @Override // com.ironsource.InterfaceC4803o7
    @NotNull
    public Object b() {
        Integer num;
        H3 h3 = H3.Second;
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(a(h3));
        if (m8026exceptionOrNullimpl != null) {
            return Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
        }
        return Result.m8023constructorimpl((!Intrinsics.areEqual(this.a, Boolean.TRUE) || (num = this.b) == null) ? null : new Xc(h3.a(num), null, 2, null));
    }

    @Override // com.ironsource.InterfaceC4803o7
    @NotNull
    public Object c() {
        C4922uf c4922uf;
        Integer num;
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(a(this.c));
        if (m8026exceptionOrNullimpl != null) {
            return Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
        }
        if (Intrinsics.areEqual(this.a, Boolean.TRUE) && (num = this.b) != null) {
            int intValue = num.intValue();
            H3 h3 = this.c;
            if (h3 != null) {
                c4922uf = new C4922uf(intValue, h3);
                return Result.m8023constructorimpl(c4922uf);
            }
        }
        c4922uf = null;
        return Result.m8023constructorimpl(c4922uf);
    }

    @Nullable
    public final Boolean d() {
        return this.a;
    }

    @Nullable
    public final Integer e() {
        return this.b;
    }

    @Nullable
    public final H3 f() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC4803o7
    @NotNull
    public Object a() {
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(new L4(this.a).a());
        if (m8026exceptionOrNullimpl != null) {
            return Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
        }
        Boolean bool = this.a;
        return Result.m8023constructorimpl(bool != null ? new K4(bool.booleanValue()) : null);
    }

    public /* synthetic */ C5000z3(Boolean bool, Integer num, H3 h3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : h3);
    }
}
