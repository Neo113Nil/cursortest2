package com.ogury.core.internal;

import android.content.SharedPreferences;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes12.dex */
public final class x0 extends ContinuationImpl {
    public z0 a;
    public SharedPreferences b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(z0 z0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return z0.a(this.d, this);
    }
}
