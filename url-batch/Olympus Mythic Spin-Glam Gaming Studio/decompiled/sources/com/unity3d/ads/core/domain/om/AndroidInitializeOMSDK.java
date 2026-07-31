package com.unity3d.ads.core.domain.om;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource$Monotonic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidInitializeOMSDK.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\rH\u0096B¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/domain/om/AndroidInitializeOMSDK;", "Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;", "context", "Landroid/content/Context;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "omRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;)V", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AndroidInitializeOMSDK implements InitializeOMSDK {

    @NotNull
    private final Context context;

    @NotNull
    private final OpenMeasurementRepository omRepository;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidInitializeOMSDK(@NotNull Context context, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull SessionRepository sessionRepository, @NotNull OpenMeasurementRepository omRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(omRepository, "omRepository");
        this.context = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
        this.omRepository = omRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.unity3d.ads.core.domain.om.InitializeOMSDK
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull Continuation continuation) {
        AndroidInitializeOMSDK$invoke$1 androidInitializeOMSDK$invoke$1;
        int i;
        long j;
        OMResult oMResult;
        if (continuation instanceof AndroidInitializeOMSDK$invoke$1) {
            androidInitializeOMSDK$invoke$1 = (AndroidInitializeOMSDK$invoke$1) continuation;
            int i2 = androidInitializeOMSDK$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidInitializeOMSDK$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidInitializeOMSDK$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidInitializeOMSDK$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.sessionRepository.isOmEnabled()) {
                        long m8186markNowz9LOYto = TimeSource$Monotonic.INSTANCE.m8186markNowz9LOYto();
                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "om_activate_started", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 126, (Object) null);
                        OpenMeasurementRepository openMeasurementRepository = this.omRepository;
                        Context context = this.context;
                        androidInitializeOMSDK$invoke$1.J$0 = m8186markNowz9LOYto;
                        androidInitializeOMSDK$invoke$1.label = 1;
                        obj = openMeasurementRepository.activateOM(context, androidInitializeOMSDK$invoke$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        j = m8186markNowz9LOYto;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = androidInitializeOMSDK$invoke$1.J$0;
                ResultKt.throwOnFailure(obj);
                oMResult = (OMResult) obj;
                if (!(oMResult instanceof OMResult.Success)) {
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "om_activate_success_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 124, (Object) null);
                } else {
                    if (!(oMResult instanceof OMResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                    Double boxDouble = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource$Monotonic.ValueTimeMark.m8187boximpl(j)));
                    Map createMapBuilder = MapsKt.createMapBuilder();
                    OMResult.Failure failure = (OMResult.Failure) oMResult;
                    createMapBuilder.put("reason", failure.getReason());
                    if (failure.getReasonDebug() != null) {
                        createMapBuilder.put("reason_debug", failure.getReasonDebug());
                    }
                    Unit unit = Unit.INSTANCE;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "om_activate_failure_time", boxDouble, MapsKt.build(createMapBuilder), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                }
                return Unit.INSTANCE;
            }
        }
        androidInitializeOMSDK$invoke$1 = new AndroidInitializeOMSDK$invoke$1(this, continuation);
        Object obj2 = androidInitializeOMSDK$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidInitializeOMSDK$invoke$1.label;
        if (i != 0) {
        }
        oMResult = (OMResult) obj2;
        if (!(oMResult instanceof OMResult.Success)) {
        }
        return Unit.INSTANCE;
    }
}
