package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TransactionEventRequestKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonGetTransactionRequest.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096B¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/events/CommonGetTransactionRequest;", "Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "<init>", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;)V", "invoke", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "transactionDataList", "", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "googlePlayBillingLibraryVersion", "", "transactionOrigin", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;", "(Ljava/util/List;Ljava/lang/String;Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CommonGetTransactionRequest implements GetTransactionRequest {

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    public CommonGetTransactionRequest(@NotNull DeviceInfoRepository deviceInfoRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.domain.events.GetTransactionRequest
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull List<TransactionEventRequestOuterClass.TransactionData> list, @NotNull String str, @NotNull TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, @NotNull Continuation continuation) {
        CommonGetTransactionRequest$invoke$1 commonGetTransactionRequest$invoke$1;
        int i;
        TransactionEventRequestKt.Dsl _create;
        String str2;
        TransactionEventRequestKt.Dsl dsl;
        Object obj;
        List<TransactionEventRequestOuterClass.TransactionData> list2;
        TransactionEventRequestKt.Dsl dsl2;
        if (continuation instanceof CommonGetTransactionRequest$invoke$1) {
            commonGetTransactionRequest$invoke$1 = (CommonGetTransactionRequest$invoke$1) continuation;
            int i2 = commonGetTransactionRequest$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonGetTransactionRequest$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = commonGetTransactionRequest$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonGetTransactionRequest$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    TransactionEventRequestKt.Dsl.Companion companion = TransactionEventRequestKt.Dsl.INSTANCE;
                    TransactionEventRequestOuterClass.TransactionEventRequest.Builder newBuilder = TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                    _create = companion._create(newBuilder);
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    commonGetTransactionRequest$invoke$1.L$0 = list;
                    commonGetTransactionRequest$invoke$1.L$1 = str;
                    commonGetTransactionRequest$invoke$1.L$2 = transactionOrigin;
                    commonGetTransactionRequest$invoke$1.L$3 = _create;
                    commonGetTransactionRequest$invoke$1.L$4 = _create;
                    commonGetTransactionRequest$invoke$1.L$5 = _create;
                    commonGetTransactionRequest$invoke$1.label = 1;
                    Object staticDeviceInfo = deviceInfoRepository.staticDeviceInfo(commonGetTransactionRequest$invoke$1);
                    if (staticDeviceInfo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = str;
                    dsl = _create;
                    obj = staticDeviceInfo;
                    list2 = list;
                    dsl2 = dsl;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dsl2 = (TransactionEventRequestKt.Dsl) commonGetTransactionRequest$invoke$1.L$5;
                    dsl = (TransactionEventRequestKt.Dsl) commonGetTransactionRequest$invoke$1.L$4;
                    TransactionEventRequestKt.Dsl dsl3 = (TransactionEventRequestKt.Dsl) commonGetTransactionRequest$invoke$1.L$3;
                    TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin2 = (TransactionEventRequestOuterClass.TransactionOrigin) commonGetTransactionRequest$invoke$1.L$2;
                    str2 = (String) commonGetTransactionRequest$invoke$1.L$1;
                    list2 = (List) commonGetTransactionRequest$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    _create = dsl3;
                    transactionOrigin = transactionOrigin2;
                    obj = obj2;
                }
                dsl2.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                dsl.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
                dsl.setAppStore(TransactionEventRequestOuterClass.StoreType.STORE_TYPE_GOOGLE_PLAY);
                dsl.setGooglePlayBillingLibraryVersion(str2);
                dsl.setOrigin(transactionOrigin);
                dsl.addAllTransactionData(dsl.getTransactionData(), list2);
                return _create._build();
            }
        }
        commonGetTransactionRequest$invoke$1 = new CommonGetTransactionRequest$invoke$1(this, continuation);
        Object obj22 = commonGetTransactionRequest$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonGetTransactionRequest$invoke$1.label;
        if (i != 0) {
        }
        dsl2.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
        dsl.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
        dsl.setAppStore(TransactionEventRequestOuterClass.StoreType.STORE_TYPE_GOOGLE_PLAY);
        dsl.setGooglePlayBillingLibraryVersion(str2);
        dsl.setOrigin(transactionOrigin);
        dsl.addAllTransactionData(dsl.getTransactionData(), list2);
        return _create._build();
    }
}
