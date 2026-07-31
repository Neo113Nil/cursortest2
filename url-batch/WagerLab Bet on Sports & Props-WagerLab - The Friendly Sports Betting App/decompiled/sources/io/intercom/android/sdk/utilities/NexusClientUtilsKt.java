package io.intercom.android.sdk.utilities;

import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.NexusWrapper;
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

/* compiled from: NexusClientUtils.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0080@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"handleNexusClientLifecycle", "", "dataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "nexusWrapper", "Lio/intercom/android/sdk/NexusWrapper;", "(Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lio/intercom/android/sdk/NexusWrapper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NexusClientUtilsKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object handleNexusClientLifecycle(final IntercomDataLayer intercomDataLayer, final NexusWrapper nexusWrapper, Continuation<? super Unit> continuation) {
        NexusClientUtilsKt$handleNexusClientLifecycle$1 nexusClientUtilsKt$handleNexusClientLifecycle$1;
        int i;
        if (continuation instanceof NexusClientUtilsKt$handleNexusClientLifecycle$1) {
            nexusClientUtilsKt$handleNexusClientLifecycle$1 = (NexusClientUtilsKt$handleNexusClientLifecycle$1) continuation;
            if ((nexusClientUtilsKt$handleNexusClientLifecycle$1.label & Integer.MIN_VALUE) != 0) {
                nexusClientUtilsKt$handleNexusClientLifecycle$1.label -= Integer.MIN_VALUE;
                Object obj = nexusClientUtilsKt$handleNexusClientLifecycle$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nexusClientUtilsKt$handleNexusClientLifecycle$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<IntercomEvent> event = intercomDataLayer.getEvent();
                    FlowCollector<? super IntercomEvent> flowCollector = new FlowCollector() { // from class: io.intercom.android.sdk.utilities.NexusClientUtilsKt$handleNexusClientLifecycle$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation2) {
                            return emit((IntercomEvent) obj2, (Continuation<? super Unit>) continuation2);
                        }

                        public final Object emit(IntercomEvent intercomEvent, Continuation<? super Unit> continuation2) {
                            if (intercomEvent instanceof IntercomEvent.AppEnteredBackground) {
                                NexusWrapper.this.scheduleDisconnect(intercomDataLayer.getConfig().getValue().getNewSessionThresholdMs());
                            } else if (intercomEvent instanceof IntercomEvent.AppEnteredForeground) {
                                NexusWrapper.this.connect(intercomDataLayer.getConfig().getValue().getRealTimeConfig(), true);
                            } else if (intercomEvent instanceof IntercomEvent.BaseResponseReceived) {
                                NexusConfig realTimeConfig = ((IntercomEvent.BaseResponseReceived) intercomEvent).getBaseResponse().getConfig().getRealTimeConfig();
                                if (realTimeConfig.getEndpoints().isEmpty()) {
                                    NexusWrapper.this.disconnect();
                                } else if (!intercomDataLayer.getHostAppState().getValue().isBackgrounded()) {
                                    NexusWrapper.this.connect(realTimeConfig, true);
                                }
                            } else if (Intrinsics.areEqual(intercomEvent, IntercomEvent.SoftReset.INSTANCE)) {
                                NexusWrapper.this.disconnect();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    nexusClientUtilsKt$handleNexusClientLifecycle$1.label = 1;
                    if (event.collect(flowCollector, nexusClientUtilsKt$handleNexusClientLifecycle$1) == coroutine_suspended) {
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
        nexusClientUtilsKt$handleNexusClientLifecycle$1 = new NexusClientUtilsKt$handleNexusClientLifecycle$1(continuation);
        Object obj2 = nexusClientUtilsKt$handleNexusClientLifecycle$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nexusClientUtilsKt$handleNexusClientLifecycle$1.label;
        if (i != 0) {
        }
        throw new KotlinNothingValueException();
    }
}
