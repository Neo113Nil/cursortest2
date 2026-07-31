package com.ironsource;

import com.ironsource.L8;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.cf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4596cf implements L8, L8.a {

    @NotNull
    private final Map<String, Integer> a = new HashMap();

    @NotNull
    private final Map<String, Integer> b = new HashMap();

    @Override // com.ironsource.L8.a
    public void a(@NotNull List<? extends L8.b> smashes) {
        Intrinsics.checkNotNullParameter(smashes, "smashes");
        for (L8.b bVar : smashes) {
            this.a.put(bVar.c(), 0);
            this.b.put(bVar.c(), Integer.valueOf(bVar.b()));
        }
    }

    @Override // com.ironsource.L8
    public boolean b(@NotNull L8.b smash) {
        boolean z;
        Intrinsics.checkNotNullParameter(smash, "smash");
        synchronized (this) {
            String c = smash.c();
            if (this.a.containsKey(c)) {
                Integer num = this.a.get(c);
                Intrinsics.checkNotNull(num);
                z = num.intValue() >= smash.b();
            }
        }
        return z;
    }

    @Override // com.ironsource.L8.a
    public void a(@NotNull L8.b smash) {
        Intrinsics.checkNotNullParameter(smash, "smash");
        synchronized (this) {
            try {
                String c = smash.c();
                if (this.a.containsKey(c)) {
                    Map<String, Integer> map = this.a;
                    Integer num = map.get(c);
                    Intrinsics.checkNotNull(num);
                    map.put(c, Integer.valueOf(num.intValue() + 1));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.L8
    public boolean a() {
        for (String str : this.b.keySet()) {
            Integer num = this.a.get(str);
            Intrinsics.checkNotNull(num);
            int intValue = num.intValue();
            Integer num2 = this.b.get(str);
            Intrinsics.checkNotNull(num2);
            if (intValue < num2.intValue()) {
                return false;
            }
        }
        return true;
    }
}
