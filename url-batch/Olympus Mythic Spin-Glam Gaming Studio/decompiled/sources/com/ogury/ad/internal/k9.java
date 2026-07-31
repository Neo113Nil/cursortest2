package com.ogury.ad.internal;

import android.content.Context;
import com.ogury.ad.async.Single;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class k9 extends Lambda implements Function0 {
    public final /* synthetic */ n9 a;
    public final /* synthetic */ c0 b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(n9 n9Var, c0 c0Var, Context context) {
        super(0);
        this.a = n9Var;
        this.b = c0Var;
        this.c = context;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag = SourceTag.ADS;
        IntegrationLogger.d(logTag, sourceTag, "[Setup] Completed!");
        Logger.INSTANCE.d(logTag, sourceTag, "SDK Initialized");
        this.a.h = 2;
        this.b.d.onInit();
        n9 n9Var = this.a;
        Iterator it = n9Var.j.iterator();
        while (it.hasNext()) {
            ((d0) ((o9) it.next())).a();
        }
        n9Var.j.clear();
        n9 n9Var2 = this.a;
        Context context = this.c;
        Single.INSTANCE.fromCallable(new l9(n9Var2, context)).subscribe(new m9(n9Var2, context));
        return Unit.INSTANCE;
    }
}
