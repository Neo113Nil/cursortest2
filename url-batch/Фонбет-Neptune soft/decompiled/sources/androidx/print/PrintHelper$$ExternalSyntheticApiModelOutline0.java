package androidx.print;

import android.adservices.adid.AdId;
import android.adservices.adid.AdIdManager;
import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.AdSelectionManager;
import android.adservices.adselection.AdSelectionOutcome;
import android.adservices.adselection.ReportImpressionRequest;
import android.adservices.appsetid.AppSetId;
import android.adservices.appsetid.AppSetIdManager;
import android.adservices.common.AdData;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerParams;
import android.app.Notification;
import android.media.session.MediaSessionManager;
import android.net.Uri;
import java.util.List;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class PrintHelper$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ AdId m(Object obj) {
        return (AdId) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AdIdManager m185m(Object obj) {
        return (AdIdManager) obj;
    }

    public static /* synthetic */ AdSelectionConfig.Builder m() {
        return new AdSelectionConfig.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AdSelectionManager m186m(Object obj) {
        return (AdSelectionManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AdSelectionOutcome m187m(Object obj) {
        return (AdSelectionOutcome) obj;
    }

    public static /* synthetic */ ReportImpressionRequest m(long j, AdSelectionConfig adSelectionConfig) {
        return new ReportImpressionRequest(j, adSelectionConfig);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AppSetId m188m(Object obj) {
        return (AppSetId) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AppSetIdManager m189m(Object obj) {
        return (AppSetIdManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ AdData.Builder m190m() {
        return new AdData.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ CustomAudience.Builder m192m() {
        return new CustomAudience.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ CustomAudienceManager m193m(Object obj) {
        return (CustomAudienceManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ JoinCustomAudienceRequest.Builder m194m() {
        return new JoinCustomAudienceRequest.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ LeaveCustomAudienceRequest.Builder m195m() {
        return new LeaveCustomAudienceRequest.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ TrustedBiddingData.Builder m196m() {
        return new TrustedBiddingData.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MeasurementManager m197m(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* synthetic */ WebSourceRegistrationRequest.Builder m(List list, Uri uri) {
        return new WebSourceRegistrationRequest.Builder(list, uri);
    }

    public static /* synthetic */ WebTriggerParams.Builder m(Uri uri) {
        return new WebTriggerParams.Builder(uri);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ Notification.DecoratedMediaCustomViewStyle m198m() {
        return new Notification.DecoratedMediaCustomViewStyle();
    }

    public static /* synthetic */ MediaSessionManager.RemoteUserInfo m(String str, int i, int i2) {
        return new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m201m() {
        return AdIdManager.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m205m() {
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return AdSelectionManager.class;
    }

    /* renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m208m$1() {
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return AppSetIdManager.class;
    }

    public static /* bridge */ /* synthetic */ Class m$3() {
        return CustomAudienceManager.class;
    }

    public static /* bridge */ /* synthetic */ Class m$4() {
        return MeasurementManager.class;
    }
}
