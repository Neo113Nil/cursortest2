package com.mobilefuse.sdk.internal.repository;

import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.network.client.HttpErrorToTelemetryExtrasKt;
import com.mobilefuse.sdk.network.client.HttpParamsPostBody;
import com.mobilefuse.sdk.network.client.HttpPostRequest;
import com.mobilefuse.sdk.network.client.HttpRequestDataModelKt;
import com.mobilefuse.sdk.network.model.MfxBidResponseToTelemetryExtrasKt;
import com.mobilefuse.sdk.telemetry.TelemetryAction;
import com.mobilefuse.sdk.telemetry.TelemetryActionFactory;
import com.mobilefuse.sdk.telemetry.TelemetryActionParam;
import com.mobilefuse.sdk.telemetry.TelemetryActionSdkEvents;
import com.mobilefuse.sdk.telemetry.TelemetrySdkActionType;
import com.mobilefuse.sdk.telemetry.TelemetrySdkParamType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdRepositoryTelemetry.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001aB\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u000b\u001a\u00020\f\u001a\u001c\u0010\r\u001a\u00020\u0006*\u00020\u000e2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u0012\u001a\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018¨\u0006\u0019"}, d2 = {"addTelemetryBidResponseAction", "", "T", "Lcom/mobilefuse/sdk/internal/repository/AdRepositoryResponse;", "Lcom/mobilefuse/sdk/internal/repository/AdRepository;", "requestAction", "Lcom/mobilefuse/sdk/telemetry/TelemetryAction;", "result", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/exception/BaseError;", "Lcom/mobilefuse/sdk/internal/repository/ParsedAdMarkupResponse;", "bidToken", "", "addTelemetryMfxBidRequestAction", "Lcom/mobilefuse/sdk/internal/repository/MfxAdRepository;", "httpRequest", "Lcom/mobilefuse/sdk/network/client/HttpPostRequest;", "Lcom/mobilefuse/sdk/network/client/HttpParamsPostBody;", "Lcom/mobilefuse/sdk/mfx/MfxPostRequest;", "toTelemetryExtras", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionParam;", "Lcom/mobilefuse/sdk/internal/repository/AdLoadingConfig;", "shouldIncludeAdInfo", "", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes6.dex */
public final class AdRepositoryTelemetryKt {
    @NotNull
    public static final List<TelemetryActionParam> toTelemetryExtras(@NotNull AdLoadingConfig toTelemetryExtras, boolean z) {
        Intrinsics.checkNotNullParameter(toTelemetryExtras, "$this$toTelemetryExtras");
        return CollectionsKt.listOf((Object[]) new TelemetryActionParam[]{new TelemetryActionParam(TelemetrySdkParamType.BID_REPOSITORY_ID, Integer.valueOf(toTelemetryExtras.getUid()), true), new TelemetryActionParam(TelemetrySdkParamType.AD_INSTANCE_ID, Integer.valueOf(toTelemetryExtras.getAdInstanceId()), true), new TelemetryActionParam(TelemetrySdkParamType.AD_INSTANCE_TYPE, toTelemetryExtras.getAdType(), z), new TelemetryActionParam(TelemetrySdkParamType.PLACEMENT_ID, toTelemetryExtras.getPlacementId(), z)});
    }

    public static /* synthetic */ void addTelemetryBidResponseAction$default(AdRepository adRepository, TelemetryAction telemetryAction, Either either, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        addTelemetryBidResponseAction(adRepository, telemetryAction, either, str);
    }

    public static final <T extends AdRepositoryResponse> void addTelemetryBidResponseAction(@NotNull AdRepository<T> addTelemetryBidResponseAction, @Nullable TelemetryAction telemetryAction, @NotNull Either<? extends BaseError, ParsedAdMarkupResponse> result, @NotNull String bidToken) {
        TelemetryAction createWarnAction;
        TelemetryActionSdkEvents telemetryActionSdkEvents;
        Intrinsics.checkNotNullParameter(addTelemetryBidResponseAction, "$this$addTelemetryBidResponseAction");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(bidToken, "bidToken");
        List mutableListOf = CollectionsKt.mutableListOf(new TelemetryActionParam(TelemetrySdkParamType.BID_REPOSITORY_TYPE, addTelemetryBidResponseAction.getRepositoryType(), false));
        List list = mutableListOf;
        CollectionsKt.addAll(list, toTelemetryExtras(addTelemetryBidResponseAction.getAdLoadingConfig(), false));
        if (result instanceof SuccessResult) {
            SuccessResult successResult = (SuccessResult) result;
            CollectionsKt.addAll(list, MfxBidResponseToTelemetryExtrasKt.toTelemetryExtras(((ParsedAdMarkupResponse) successResult.getValue()).getBidResponse()));
            if (Intrinsics.areEqual(addTelemetryBidResponseAction.getRepositoryType(), "bidding")) {
                list.add(new TelemetryActionParam(TelemetrySdkParamType.BID_RESPONSE_TOKEN, bidToken, true));
                TelemetrySdkActionType telemetrySdkActionType = TelemetrySdkActionType.BID_TOKEN_DECODED;
                telemetryActionSdkEvents = new TelemetryActionSdkEvents("bid", telemetrySdkActionType.getMessage(), telemetrySdkActionType.getLogExtraMessage(), false, false, false, 56, null);
            } else {
                telemetryActionSdkEvents = new TelemetryActionSdkEvents("bid", TelemetrySdkActionType.BID_RESPONSE_RECEIVED.getMessage(), "Ad #" + addTelemetryBidResponseAction.getAdLoadingConfig().getAdInstanceId() + " received bid response " + ((ParsedAdMarkupResponse) successResult.getValue()).getBidResponse().getId() + " with bid CPM " + ((ParsedAdMarkupResponse) successResult.getValue()).getBidResponse().getCpm(), false, false, false, 56, null);
            }
            createWarnAction = TelemetryActionFactory.createHttpResponseAction(addTelemetryBidResponseAction, telemetryActionSdkEvents, telemetryAction, 200, ((ParsedAdMarkupResponse) successResult.getValue()).getBidResponse().getAdm(), mutableListOf);
        } else {
            if (!(result instanceof ErrorResult)) {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : mutableListOf) {
                if (((TelemetryActionParam) obj).getType() != TelemetrySdkParamType.AD_INSTANCE_ID) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((TelemetryActionParam) it.next()).setIncludeToBreadcrumb(false);
                arrayList2.add(Unit.INSTANCE);
            }
            ErrorResult errorResult = (ErrorResult) result;
            CollectionsKt.addAll(list, HttpErrorToTelemetryExtrasKt.toTelemetryExtras((BaseError) errorResult.getValue()));
            BaseError baseError = (BaseError) errorResult.getValue();
            if (baseError instanceof HttpError.ConnectionError) {
                CollectionsKt.addAll(list, HttpErrorToTelemetryExtrasKt.toHttpTelemetryExtras((HttpError.ConnectionError) baseError));
            }
            TelemetrySdkActionType telemetrySdkActionType2 = TelemetrySdkActionType.BID_INELIGIBLE_RESPONSE;
            createWarnAction = TelemetryActionFactory.createWarnAction(addTelemetryBidResponseAction, new TelemetryActionSdkEvents(telemetrySdkActionType2.getCategory(), telemetrySdkActionType2.getMessage(), "Ad #" + addTelemetryBidResponseAction.getAdLoadingConfig().getAdInstanceId() + " Bid was ineligible for impression with reason: " + ((BaseError) errorResult.getValue()).getMessage(), false, false, false, 56, null), mutableListOf);
        }
        addTelemetryBidResponseAction.getTelemetryAgent().onAction(createWarnAction);
    }

    @NotNull
    public static final TelemetryAction addTelemetryMfxBidRequestAction(@NotNull MfxAdRepository addTelemetryMfxBidRequestAction, @NotNull HttpPostRequest<HttpParamsPostBody> httpRequest) {
        Intrinsics.checkNotNullParameter(addTelemetryMfxBidRequestAction, "$this$addTelemetryMfxBidRequestAction");
        Intrinsics.checkNotNullParameter(httpRequest, "httpRequest");
        List mutableListOf = CollectionsKt.mutableListOf(new TelemetryActionParam(TelemetrySdkParamType.BID_REPOSITORY_TYPE, addTelemetryMfxBidRequestAction.getRepositoryType(), false));
        CollectionsKt.addAll(mutableListOf, toTelemetryExtras(addTelemetryMfxBidRequestAction.getAdLoadingConfig(), true));
        TelemetrySdkActionType telemetrySdkActionType = TelemetrySdkActionType.BID_REQUEST_SENT;
        TelemetryAction createHttpPostRequestAction = TelemetryActionFactory.createHttpPostRequestAction(addTelemetryMfxBidRequestAction, new TelemetryActionSdkEvents(telemetrySdkActionType.getCategory(), telemetrySdkActionType.getMessage(), "Ad #" + addTelemetryMfxBidRequestAction.getAdLoadingConfig().getAdInstanceId() + " sent bid request (" + addTelemetryMfxBidRequestAction.getAdLoadingConfig().getAdType() + ')', false, false, false, 56, null), httpRequest.getUrl(), HttpRequestDataModelKt.getTelemetryBody(httpRequest.getBody()), mutableListOf);
        addTelemetryMfxBidRequestAction.getTelemetryAgent().onAction(createHttpPostRequestAction);
        return createHttpPostRequestAction;
    }
}
