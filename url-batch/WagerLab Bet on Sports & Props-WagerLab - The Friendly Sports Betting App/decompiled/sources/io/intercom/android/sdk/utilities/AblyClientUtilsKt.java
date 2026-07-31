package io.intercom.android.sdk.utilities;

import io.intercom.android.sdk.AblyManager;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: AblyClientUtils.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0080@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"handleAblyLifecycle", "", "dataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "ablyManager", "Lio/intercom/android/sdk/AblyManager;", "(Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lio/intercom/android/sdk/AblyManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AblyClientUtilsKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object handleAblyLifecycle(IntercomDataLayer intercomDataLayer, final AblyManager ablyManager, Continuation<? super Unit> continuation) {
        AblyClientUtilsKt$handleAblyLifecycle$1 ablyClientUtilsKt$handleAblyLifecycle$1;
        int i;
        if (continuation instanceof AblyClientUtilsKt$handleAblyLifecycle$1) {
            ablyClientUtilsKt$handleAblyLifecycle$1 = (AblyClientUtilsKt$handleAblyLifecycle$1) continuation;
            if ((ablyClientUtilsKt$handleAblyLifecycle$1.label & Integer.MIN_VALUE) != 0) {
                ablyClientUtilsKt$handleAblyLifecycle$1.label -= Integer.MIN_VALUE;
                Object obj = ablyClientUtilsKt$handleAblyLifecycle$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ablyClientUtilsKt$handleAblyLifecycle$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<IntercomEvent> event = intercomDataLayer.getEvent();
                    FlowCollector<? super IntercomEvent> flowCollector = new FlowCollector() { // from class: io.intercom.android.sdk.utilities.AblyClientUtilsKt$handleAblyLifecycle$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation2) {
                            return emit((IntercomEvent) obj2, (Continuation<? super Unit>) continuation2);
                        }

                        public final Object emit(IntercomEvent intercomEvent, Continuation<? super Unit> continuation2) {
                            if (Intrinsics.areEqual(intercomEvent, IntercomEvent.SoftReset.INSTANCE)) {
                                AblyManager.this.disconnect();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    ablyClientUtilsKt$handleAblyLifecycle$1.label = 1;
                    if (event.collect(flowCollector, ablyClientUtilsKt$handleAblyLifecycle$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
        ablyClientUtilsKt$handleAblyLifecycle$1 = new AblyClientUtilsKt$handleAblyLifecycle$1(continuation);
        Object obj2 = ablyClientUtilsKt$handleAblyLifecycle$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ablyClientUtilsKt$handleAblyLifecycle$1.label;
        if (i != 0) {
        }
        throw new KotlinNothingValueException();
    }
}
