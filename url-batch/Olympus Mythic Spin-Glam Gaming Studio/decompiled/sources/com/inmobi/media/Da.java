package com.inmobi.media;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class Da extends SuspendLambda implements Function2 {
    public final /* synthetic */ Ha a;
    public final /* synthetic */ EnumC4244on b;
    public final /* synthetic */ JSONObject c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Da(Ha ha, EnumC4244on enumC4244on, JSONObject jSONObject, Continuation continuation) {
        super(2, continuation);
        this.a = ha;
        this.b = enumC4244on;
        this.c = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Da(this.a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Da) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a.a;
        EnumC4244on action = this.b;
        JSONObject jSONObject = this.c;
        gestureDetectorOnGestureListenerC4476xi.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        D8 d8 = gestureDetectorOnGestureListenerC4476xi.Z0;
        if (d8 != null) {
            Intrinsics.checkNotNullParameter(action, "action");
            switch (action.ordinal()) {
                case 0:
                    d8.b(true);
                    break;
                case 1:
                    d8.b(false);
                    break;
                case 2:
                    if (!d8.g.get()) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("action", "play");
                        A8 a8 = A8.e;
                        A8[] a8Arr = {A8.c, A8.f, A8.g, a8};
                        EnumC4071i8[] enumC4071i8Arr = EnumC4071i8.a;
                        if (d8.a(a8Arr, "executeVideoPlayerActions", jSONObject2.toString(), a8)) {
                            d8.k.d();
                            break;
                        }
                    }
                    break;
                case 3:
                    if (!d8.g.get()) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("action", "pause");
                        A8 a82 = A8.f;
                        A8[] a8Arr2 = {A8.c, a82, A8.g, A8.e};
                        EnumC4071i8[] enumC4071i8Arr2 = EnumC4071i8.a;
                        if (d8.a(a8Arr2, "executeVideoPlayerActions", jSONObject3.toString(), a82)) {
                            d8.k.c();
                            break;
                        }
                    }
                    break;
                case 4:
                    d8.a(true);
                    break;
                case 5:
                    d8.a(false);
                    break;
                case 6:
                    if (!d8.g.get()) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("action", "pause");
                        A8 a83 = A8.f;
                        A8[] a8Arr3 = {A8.c, a83, A8.g, A8.e};
                        EnumC4071i8[] enumC4071i8Arr3 = EnumC4071i8.a;
                        if (d8.a(a8Arr3, "executeVideoPlayerActions", jSONObject4.toString(), a83)) {
                            d8.k.c();
                        }
                    }
                    Mf mf = d8.p;
                    if (mf != null) {
                        In videoEvent = new In((long) d8.k.a().getTime());
                        Intrinsics.checkNotNullParameter(videoEvent, "videoEvent");
                        Oe oe = mf.e;
                        if (oe != null) {
                            oe.a(videoEvent);
                            break;
                        }
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            gestureDetectorOnGestureListenerC4476xi.a(EnumC4465x8.l, jSONObject);
        } else {
            EnumC4465x8 enumC4465x8 = EnumC4465x8.e;
            EnumC4071i8[] enumC4071i8Arr4 = EnumC4071i8.a;
            C3991f8 obj2 = new C3991f8(jSONObject);
            Intrinsics.checkNotNullParameter(obj2, "obj");
            gestureDetectorOnGestureListenerC4476xi.a(enumC4465x8, AbstractC4494ya.a(obj2, C3991f8.class));
        }
        return Unit.INSTANCE;
    }
}
