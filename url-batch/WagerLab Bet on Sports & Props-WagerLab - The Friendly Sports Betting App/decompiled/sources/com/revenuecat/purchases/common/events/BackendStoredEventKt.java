package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.ads.events.AdEvent;
import com.revenuecat.purchases.common.events.BackendEvent;
import com.revenuecat.purchases.common.events.BackendStoredEvent;
import com.revenuecat.purchases.customercenter.events.CustomerCenterImpressionEvent;
import com.revenuecat.purchases.customercenter.events.CustomerCenterSurveyOptionChosenEvent;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackendStoredEvent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0002*\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u000f"}, d2 = {"toBackendEvent", "Lcom/revenuecat/purchases/common/events/BackendEvent;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "toBackendStoredEvent", "Lcom/revenuecat/purchases/ads/events/AdEvent$Displayed;", "appUserID", "", "appSessionID", "Lcom/revenuecat/purchases/ads/events/AdEvent$FailedToLoad;", "Lcom/revenuecat/purchases/ads/events/AdEvent$Loaded;", "Lcom/revenuecat/purchases/ads/events/AdEvent$Open;", "Lcom/revenuecat/purchases/ads/events/AdEvent$Revenue;", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent;", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BackendStoredEventKt {
    public static final BackendEvent toBackendEvent(BackendStoredEvent backendStoredEvent) {
        Intrinsics.checkNotNullParameter(backendStoredEvent, "<this>");
        if (backendStoredEvent instanceof BackendStoredEvent.Paywalls) {
            return ((BackendStoredEvent.Paywalls) backendStoredEvent).getEvent();
        }
        if (backendStoredEvent instanceof BackendStoredEvent.CustomerCenter) {
            return ((BackendStoredEvent.CustomerCenter) backendStoredEvent).getEvent();
        }
        if (backendStoredEvent instanceof BackendStoredEvent.Ad) {
            return ((BackendStoredEvent.Ad) backendStoredEvent).getEvent();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(PaywallEvent paywallEvent, String appUserID) {
        Intrinsics.checkNotNullParameter(paywallEvent, "<this>");
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        String uuid = paywallEvent.getCreationData().getId().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "creationData.id.toString()");
        String value = paywallEvent.getType().getValue();
        String uuid2 = paywallEvent.getData().getSessionIdentifier().toString();
        Intrinsics.checkNotNullExpressionValue(uuid2, "data.sessionIdentifier.toString()");
        return new BackendStoredEvent.Paywalls(new BackendEvent.Paywalls(uuid, 1, value, appUserID, uuid2, paywallEvent.getData().getOfferingIdentifier(), paywallEvent.getData().getPaywallRevision(), paywallEvent.getCreationData().getDate().getTime(), paywallEvent.getData().getDisplayMode(), paywallEvent.getData().getDarkMode(), paywallEvent.getData().getLocaleIdentifier()));
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(CustomerCenterImpressionEvent customerCenterImpressionEvent, String appUserID, String appSessionID) {
        Intrinsics.checkNotNullParameter(customerCenterImpressionEvent, "<this>");
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        Intrinsics.checkNotNullParameter(appSessionID, "appSessionID");
        String uuid = customerCenterImpressionEvent.getCreationData().getId().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "creationData.id.toString()");
        return new BackendStoredEvent.CustomerCenter(new BackendEvent.CustomerCenter(uuid, customerCenterImpressionEvent.getData().getRevisionID(), customerCenterImpressionEvent.getData().getType(), appUserID, appSessionID, customerCenterImpressionEvent.getData().getTimestamp().getTime(), customerCenterImpressionEvent.getData().getDarkMode(), customerCenterImpressionEvent.getData().getLocale(), customerCenterImpressionEvent.getData().getDisplayMode(), null, null, null));
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(CustomerCenterSurveyOptionChosenEvent customerCenterSurveyOptionChosenEvent, String appUserID, String appSessionID) {
        Intrinsics.checkNotNullParameter(customerCenterSurveyOptionChosenEvent, "<this>");
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        Intrinsics.checkNotNullParameter(appSessionID, "appSessionID");
        String uuid = customerCenterSurveyOptionChosenEvent.getCreationData().getId().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "creationData.id.toString()");
        return new BackendStoredEvent.CustomerCenter(new BackendEvent.CustomerCenter(uuid, customerCenterSurveyOptionChosenEvent.getData().getRevisionID(), customerCenterSurveyOptionChosenEvent.getData().getType(), appUserID, appSessionID, customerCenterSurveyOptionChosenEvent.getData().getTimestamp().getTime(), customerCenterSurveyOptionChosenEvent.getData().getDarkMode(), customerCenterSurveyOptionChosenEvent.getData().getLocale(), customerCenterSurveyOptionChosenEvent.getData().getDisplayMode(), customerCenterSurveyOptionChosenEvent.getData().getPath(), customerCenterSurveyOptionChosenEvent.getData().getUrl(), customerCenterSurveyOptionChosenEvent.getData().getSurveyOptionID()));
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(AdEvent.Open open, String appUserID, String appSessionID) {
        Intrinsics.checkNotNullParameter(open, "<this>");
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        Intrinsics.checkNotNullParameter(appSessionID, "appSessionID");
        return new BackendStoredEvent.Ad(new BackendEvent.Ad(open.getId(), open.getEventVersion(), open.getType().getValue(), open.getTimestamp(), open.getNetworkName(), open.getMediatorName(), open.getPlacement(), open.getAdUnitId(), open.getImpressionId(), appUserID, appSessionID, (Long) null, (String) null, (String) null, (Integer) null, 30720, (DefaultConstructorMarker) null));
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(AdEvent.Displayed displayed, String appUserID, String appSessionID) {
        Intrinsics.checkNotNullParameter(displayed, "<this>");
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        Intrinsics.checkNotNullParameter(appSessionID, "appSessionID");
        return new BackendStoredEvent.Ad(new BackendEvent.Ad(displayed.getId(), displayed.getEventVersion(), displayed.getType().getValue(), displayed.getTimestamp(), displayed.getNetworkName(), displayed.getMediatorName(), displayed.getPlacement(), displayed.getAdUnitId(), displayed.getImpressionId(), appUserID, appSessionID, (Long) null, (String) null, (String) null, (Integer) null, 30720, (DefaultConstructorMarker) null));
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(AdEvent.Revenue revenue, String appUserID, String appSessionID) {
        Intrinsics.checkNotNullParameter(revenue, "<this>");
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        Intrinsics.checkNotNullParameter(appSessionID, "appSessionID");
        return new BackendStoredEvent.Ad(new BackendEvent.Ad(revenue.getId(), revenue.getEventVersion(), revenue.getType().getValue(), revenue.getTimestamp(), revenue.getNetworkName(), revenue.getMediatorName(), revenue.getPlacement(), revenue.getAdUnitId(), revenue.getImpressionId(), appUserID, appSessionID, Long.valueOf(revenue.getRevenueMicros()), revenue.getCurrency(), revenue.getPrecision(), (Integer) null, 16384, (DefaultConstructorMarker) null));
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(AdEvent.Loaded loaded, String appUserID, String appSessionID) {
        Intrinsics.checkNotNullParameter(loaded, "<this>");
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        Intrinsics.checkNotNullParameter(appSessionID, "appSessionID");
        return new BackendStoredEvent.Ad(new BackendEvent.Ad(loaded.getId(), loaded.getEventVersion(), loaded.getType().getValue(), loaded.getTimestamp(), loaded.getNetworkName(), loaded.getMediatorName(), loaded.getPlacement(), loaded.getAdUnitId(), loaded.getImpressionId(), appUserID, appSessionID, (Long) null, (String) null, (String) null, (Integer) null, 30720, (DefaultConstructorMarker) null));
    }

    public static final /* synthetic */ BackendStoredEvent toBackendStoredEvent(AdEvent.FailedToLoad failedToLoad, String appUserID, String appSessionID) {
        Intrinsics.checkNotNullParameter(failedToLoad, "<this>");
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        Intrinsics.checkNotNullParameter(appSessionID, "appSessionID");
        return new BackendStoredEvent.Ad(new BackendEvent.Ad(failedToLoad.getId(), failedToLoad.getEventVersion(), failedToLoad.getType().getValue(), failedToLoad.getTimestamp(), failedToLoad.getNetworkName(), failedToLoad.getMediatorName(), failedToLoad.getPlacement(), failedToLoad.getAdUnitId(), failedToLoad.getImpressionId(), appUserID, appSessionID, (Long) null, (String) null, (String) null, failedToLoad.getMediatorErrorCode(), 14336, (DefaultConstructorMarker) null));
    }
}
