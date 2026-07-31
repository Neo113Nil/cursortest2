package com.inmobi.media;

import android.util.Log;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes13.dex */
public final class Y0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Oe a;
    public final /* synthetic */ View b;
    public final /* synthetic */ FriendlyObstructionPurpose c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(Oe oe, View view, FriendlyObstructionPurpose friendlyObstructionPurpose, Continuation continuation) {
        super(2, continuation);
        this.a = oe;
        this.b = view;
        this.c = friendlyObstructionPurpose;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Y0(this.a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Y0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            AdSession adSession = this.a.c;
            if (adSession != null) {
                adSession.addFriendlyObstruction(this.b, this.c, null);
            }
        } catch (IllegalArgumentException e) {
            InterfaceC4466x9 interfaceC4466x9 = this.a.b;
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a(AbstractC3984f1.f, "Failed to addObstruction. Reason: " + Log.getStackTraceString(e));
            }
        }
        return Unit.INSTANCE;
    }
}
