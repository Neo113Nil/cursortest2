package com.ogury.ad.internal;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public final class s5 extends Lambda implements Function1 {
    public final /* synthetic */ u5 a;
    public final /* synthetic */ ArrayList b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(u5 u5Var, ArrayList arrayList) {
        super(1);
        this.a = u5Var;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable it = (Throwable) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (new Regex("Received 5\\d\\d from the server").containsMatchIn(String.valueOf(it.getMessage()))) {
            u5 u5Var = this.a;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                u5Var.b((o5) obj2);
            }
        }
        return Unit.INSTANCE;
    }
}
