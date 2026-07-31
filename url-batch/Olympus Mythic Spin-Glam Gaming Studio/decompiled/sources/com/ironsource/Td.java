package com.ironsource;

import com.ironsource.C4902u;
import com.ironsource.O7;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Td {

    @NotNull
    private final C4936vb a;

    @Nullable
    private final Map<String, C4902u.d> b;

    @Nullable
    private final Map<String, C4902u.d> c;

    public Td(@NotNull C4936vb tools, @Nullable Map<String, C4902u.d> map, @Nullable Map<String, C4902u.d> map2) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        this.a = tools;
        this.b = map;
        this.c = map2;
    }

    private final void b(O7.a aVar, String str, String str2, Integer num) {
        Object a = a(str2, num);
        if (Result.m8029isSuccessimpl(a)) {
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(num);
            aVar.a(str, str2, num.intValue());
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(a);
        if (m8026exceptionOrNullimpl != null) {
            this.a.b(str, 3004, m8026exceptionOrNullimpl.getMessage());
        }
    }

    public final void a(@NotNull O7.a rewardService) {
        Intrinsics.checkNotNullParameter(rewardService, "rewardService");
        Map<String, C4902u.d> map = this.c;
        if (map != null && (r0 = map.entrySet().iterator()) != null) {
            for (Map.Entry<String, C4902u.d> entry : map.entrySet()) {
                String key = entry.getKey();
                Rd f = entry.getValue().f();
                if (f != null) {
                    b(rewardService, key, f.b(), f.a());
                }
            }
        }
        Map<String, C4902u.d> map2 = this.b;
        if (map2 == null || (r0 = map2.entrySet().iterator()) == null) {
            return;
        }
        for (Map.Entry<String, C4902u.d> entry2 : map2.entrySet()) {
            String key2 = entry2.getKey();
            Rd a = entry2.getValue().a();
            if (a != null) {
                a(rewardService, key2, a.b(), a.a());
            }
        }
    }

    private final void a(O7.a aVar, String str, String str2, Integer num) {
        Object a = a(str2, num);
        if (Result.m8029isSuccessimpl(a)) {
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(num);
            aVar.b(str, str2, num.intValue());
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(a);
        if (m8026exceptionOrNullimpl != null) {
            this.a.b(str, 3004, m8026exceptionOrNullimpl.getMessage());
        }
    }

    private final Object a(String str, Integer num) {
        if (str != null && num != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m8023constructorimpl(Unit.INSTANCE);
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m8023constructorimpl(ResultKt.createFailure(new Exception("name - " + str + " or amount - " + num + " is not provided or invalid")));
    }
}
