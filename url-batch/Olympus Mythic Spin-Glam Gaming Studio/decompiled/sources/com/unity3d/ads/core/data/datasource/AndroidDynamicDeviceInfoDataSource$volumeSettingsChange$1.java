package com.unity3d.ads.core.data.datasource;

import android.database.ContentObserver;
import android.provider.Settings;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$DoubleRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1", f = "AndroidDynamicDeviceInfoDataSource.kt", l = {654}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 extends SuspendLambda implements Function2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, Continuation continuation) {
        super(2, continuation);
        this.this$0 = androidDynamicDeviceInfoDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1 = new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this.this$0, continuation);
        androidDynamicDeviceInfoDataSource$volumeSettingsChange$1.L$0 = obj;
        return androidDynamicDeviceInfoDataSource$volumeSettingsChange$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope producerScope, Continuation continuation) {
        return ((AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.database.ContentObserver, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        double streamVolume;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final Ref$DoubleRef ref$DoubleRef = new Ref$DoubleRef();
            streamVolume = this.this$0.getStreamVolume(3);
            ref$DoubleRef.element = streamVolume;
            ChannelsKt.trySendBlocking(producerScope, new VolumeSettingsChange.VolumeChange(streamVolume));
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            int ringerMode = this.this$0.getRingerMode();
            ref$IntRef.element = ringerMode;
            ChannelsKt.trySendBlocking(producerScope, new VolumeSettingsChange.MuteChange(ringerMode == 0));
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource = this.this$0;
            final ?? r4 = new ContentObserver() { // from class: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(null);
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean selfChange) {
                    double streamVolume2;
                    super.onChange(selfChange);
                    streamVolume2 = AndroidDynamicDeviceInfoDataSource.this.getStreamVolume(3);
                    Ref$DoubleRef ref$DoubleRef2 = ref$DoubleRef;
                    if (streamVolume2 != ref$DoubleRef2.element) {
                        ref$DoubleRef2.element = streamVolume2;
                        ChannelsKt.trySendBlocking(producerScope, new VolumeSettingsChange.VolumeChange(streamVolume2));
                    }
                    int ringerMode2 = AndroidDynamicDeviceInfoDataSource.this.getRingerMode();
                    Ref$IntRef ref$IntRef2 = ref$IntRef;
                    if (ringerMode2 != ref$IntRef2.element) {
                        ref$IntRef2.element = ringerMode2;
                        ChannelsKt.trySendBlocking(producerScope, new VolumeSettingsChange.MuteChange(ringerMode2 == 0));
                    }
                }
            };
            this.this$0.getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, r4);
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource2 = this.this$0;
            Function0 function0 = new Function0() { // from class: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1.invokeSuspend$lambda$0(AndroidDynamicDeviceInfoDataSource.this, r4);
                    return invokeSuspend$lambda$0;
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1) {
        androidDynamicDeviceInfoDataSource.getContext().getContentResolver().unregisterContentObserver(androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1);
        return Unit.INSTANCE;
    }
}
