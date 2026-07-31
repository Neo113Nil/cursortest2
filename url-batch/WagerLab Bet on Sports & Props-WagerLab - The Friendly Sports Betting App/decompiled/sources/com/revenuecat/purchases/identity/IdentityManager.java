package com.revenuecat.purchases.identity;

import android.content.SharedPreferences;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.strings.IdentityStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: IdentityManager.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0002J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020\u00162\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\"H\u0002J\b\u0010#\u001a\u00020\u0012H\u0002J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J<\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00122\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00160(2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00160+J\u001c\u0010-\u001a\u00020\u00162\u0014\u0010.\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020\u00160+J\u0010\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0012H\u0002J\u0012\u00101\u001a\u00020\u001f2\b\u00102\u001a\u0004\u0018\u00010)H\u0002J\u000e\u00103\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/revenuecat/purchases/identity/IdentityManager;", "", "deviceCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "subscriberAttributesCache", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "subscriberAttributesManager", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "offeringsCache", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "backend", "Lcom/revenuecat/purchases/common/Backend;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "dispatcher", "Lcom/revenuecat/purchases/common/Dispatcher;", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;Lcom/revenuecat/purchases/common/offerings/OfferingsCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/common/Dispatcher;)V", "currentAppUserID", "", "getCurrentAppUserID", "()Ljava/lang/String;", "aliasCurrentUserIdTo", "", "oldAppUserID", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "configure", "appUserID", "copySubscriberAttributesToNewUserIfOldIsAnonymous", "oldAppUserId", "newAppUserId", "currentUserIsAnonymous", "", "enqueue", "command", "Lkotlin/Function0;", "generateRandomID", "invalidateETagCacheIfNeeded", "logIn", "newAppUserID", "onSuccess", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/CustomerInfo;", "onError", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "logOut", "completion", "resetAndSaveUserID", "newUserID", "shouldInvalidateETagCache", "customerInfo", "switchUser", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IdentityManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Regex anonymousIdRegex = new Regex("^\\$RCAnonymousID:([a-f0-9]{32})$");
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final Dispatcher dispatcher;
    private final OfferingsCache offeringsCache;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final SubscriberAttributesCache subscriberAttributesCache;
    private final SubscriberAttributesManager subscriberAttributesManager;

    public IdentityManager(DeviceCache deviceCache, SubscriberAttributesCache subscriberAttributesCache, SubscriberAttributesManager subscriberAttributesManager, OfferingsCache offeringsCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(deviceCache, "deviceCache");
        Intrinsics.checkNotNullParameter(subscriberAttributesCache, "subscriberAttributesCache");
        Intrinsics.checkNotNullParameter(subscriberAttributesManager, "subscriberAttributesManager");
        Intrinsics.checkNotNullParameter(offeringsCache, "offeringsCache");
        Intrinsics.checkNotNullParameter(backend, "backend");
        Intrinsics.checkNotNullParameter(offlineEntitlementsManager, "offlineEntitlementsManager");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.deviceCache = deviceCache;
        this.subscriberAttributesCache = subscriberAttributesCache;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.offeringsCache = offeringsCache;
        this.backend = backend;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.dispatcher = dispatcher;
    }

    /* compiled from: IdentityManager.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/identity/IdentityManager$Companion;", "", "()V", "anonymousIdRegex", "Lkotlin/text/Regex;", "isUserIDAnonymous", "", "appUserID", "", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isUserIDAnonymous(String appUserID) {
            Intrinsics.checkNotNullParameter(appUserID, "appUserID");
            return IdentityManager.anonymousIdRegex.matches(appUserID);
        }
    }

    public final String getCurrentAppUserID() {
        String cachedAppUserID = this.deviceCache.getCachedAppUserID();
        return cachedAppUserID == null ? "" : cachedAppUserID;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x027b A[Catch: all -> 0x0239, TryCatch #0 {all -> 0x0239, blocks: (B:61:0x0031, B:63:0x003e, B:64:0x004f, B:66:0x0054, B:67:0x0066, B:69:0x007b, B:70:0x0097, B:72:0x00ac, B:73:0x00c8, B:75:0x00dd, B:76:0x00f4, B:77:0x00f9, B:79:0x010e, B:80:0x0126, B:82:0x013b, B:83:0x0157, B:84:0x0169, B:86:0x017e, B:87:0x0197, B:89:0x01ac, B:90:0x01c8, B:92:0x01dd, B:93:0x01f8, B:94:0x0209, B:96:0x021e, B:7:0x0240, B:12:0x0265, B:13:0x0276, B:15:0x046f, B:24:0x027b, B:25:0x028d, B:27:0x02a2, B:28:0x02be, B:30:0x02d3, B:31:0x02ef, B:33:0x0304, B:34:0x0320, B:36:0x0335, B:37:0x0351, B:39:0x0366, B:40:0x0384, B:41:0x0396, B:43:0x03ab, B:44:0x03c9, B:46:0x03de, B:47:0x03fb, B:49:0x0410, B:50:0x042d, B:51:0x043e, B:53:0x0453, B:55:0x0251, B:57:0x0259, B:59:0x0261), top: B:60:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x028d A[Catch: all -> 0x0239, TryCatch #0 {all -> 0x0239, blocks: (B:61:0x0031, B:63:0x003e, B:64:0x004f, B:66:0x0054, B:67:0x0066, B:69:0x007b, B:70:0x0097, B:72:0x00ac, B:73:0x00c8, B:75:0x00dd, B:76:0x00f4, B:77:0x00f9, B:79:0x010e, B:80:0x0126, B:82:0x013b, B:83:0x0157, B:84:0x0169, B:86:0x017e, B:87:0x0197, B:89:0x01ac, B:90:0x01c8, B:92:0x01dd, B:93:0x01f8, B:94:0x0209, B:96:0x021e, B:7:0x0240, B:12:0x0265, B:13:0x0276, B:15:0x046f, B:24:0x027b, B:25:0x028d, B:27:0x02a2, B:28:0x02be, B:30:0x02d3, B:31:0x02ef, B:33:0x0304, B:34:0x0320, B:36:0x0335, B:37:0x0351, B:39:0x0366, B:40:0x0384, B:41:0x0396, B:43:0x03ab, B:44:0x03c9, B:46:0x03de, B:47:0x03fb, B:49:0x0410, B:50:0x042d, B:51:0x043e, B:53:0x0453, B:55:0x0251, B:57:0x0259, B:59:0x0261), top: B:60:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02be A[Catch: all -> 0x0239, TryCatch #0 {all -> 0x0239, blocks: (B:61:0x0031, B:63:0x003e, B:64:0x004f, B:66:0x0054, B:67:0x0066, B:69:0x007b, B:70:0x0097, B:72:0x00ac, B:73:0x00c8, B:75:0x00dd, B:76:0x00f4, B:77:0x00f9, B:79:0x010e, B:80:0x0126, B:82:0x013b, B:83:0x0157, B:84:0x0169, B:86:0x017e, B:87:0x0197, B:89:0x01ac, B:90:0x01c8, B:92:0x01dd, B:93:0x01f8, B:94:0x0209, B:96:0x021e, B:7:0x0240, B:12:0x0265, B:13:0x0276, B:15:0x046f, B:24:0x027b, B:25:0x028d, B:27:0x02a2, B:28:0x02be, B:30:0x02d3, B:31:0x02ef, B:33:0x0304, B:34:0x0320, B:36:0x0335, B:37:0x0351, B:39:0x0366, B:40:0x0384, B:41:0x0396, B:43:0x03ab, B:44:0x03c9, B:46:0x03de, B:47:0x03fb, B:49:0x0410, B:50:0x042d, B:51:0x043e, B:53:0x0453, B:55:0x0251, B:57:0x0259, B:59:0x0261), top: B:60:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02ef A[Catch: all -> 0x0239, TryCatch #0 {all -> 0x0239, blocks: (B:61:0x0031, B:63:0x003e, B:64:0x004f, B:66:0x0054, B:67:0x0066, B:69:0x007b, B:70:0x0097, B:72:0x00ac, B:73:0x00c8, B:75:0x00dd, B:76:0x00f4, B:77:0x00f9, B:79:0x010e, B:80:0x0126, B:82:0x013b, B:83:0x0157, B:84:0x0169, B:86:0x017e, B:87:0x0197, B:89:0x01ac, B:90:0x01c8, B:92:0x01dd, B:93:0x01f8, B:94:0x0209, B:96:0x021e, B:7:0x0240, B:12:0x0265, B:13:0x0276, B:15:0x046f, B:24:0x027b, B:25:0x028d, B:27:0x02a2, B:28:0x02be, B:30:0x02d3, B:31:0x02ef, B:33:0x0304, B:34:0x0320, B:36:0x0335, B:37:0x0351, B:39:0x0366, B:40:0x0384, B:41:0x0396, B:43:0x03ab, B:44:0x03c9, B:46:0x03de, B:47:0x03fb, B:49:0x0410, B:50:0x042d, B:51:0x043e, B:53:0x0453, B:55:0x0251, B:57:0x0259, B:59:0x0261), top: B:60:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0320 A[Catch: all -> 0x0239, TryCatch #0 {all -> 0x0239, blocks: (B:61:0x0031, B:63:0x003e, B:64:0x004f, B:66:0x0054, B:67:0x0066, B:69:0x007b, B:70:0x0097, B:72:0x00ac, B:73:0x00c8, B:75:0x00dd, B:76:0x00f4, B:77:0x00f9, B:79:0x010e, B:80:0x0126, B:82:0x013b, B:83:0x0157, B:84:0x0169, B:86:0x017e, B:87:0x0197, B:89:0x01ac, B:90:0x01c8, B:92:0x01dd, B:93:0x01f8, B:94:0x0209, B:96:0x021e, B:7:0x0240, B:12:0x0265, B:13:0x0276, B:15:0x046f, B:24:0x027b, B:25:0x028d, B:27:0x02a2, B:28:0x02be, B:30:0x02d3, B:31:0x02ef, B:33:0x0304, B:34:0x0320, B:36:0x0335, B:37:0x0351, B:39:0x0366, B:40:0x0384, B:41:0x0396, B:43:0x03ab, B:44:0x03c9, B:46:0x03de, B:47:0x03fb, B:49:0x0410, B:50:0x042d, B:51:0x043e, B:53:0x0453, B:55:0x0251, B:57:0x0259, B:59:0x0261), top: B:60:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0351 A[Catch: all -> 0x0239, TryCatch #0 {all -> 0x0239, blocks: (B:61:0x0031, B:63:0x003e, B:64:0x004f, B:66:0x0054, B:67:0x0066, B:69:0x007b, B:70:0x0097, B:72:0x00ac, B:73:0x00c8, B:75:0x00dd, B:76:0x00f4, B:77:0x00f9, B:79:0x010e, B:80:0x0126, B:82:0x013b, B:83:0x0157, B:84:0x0169, B:86:0x017e, B:87:0x0197, B:89:0x01ac, B:90:0x01c8, B:92:0x01dd, B:93:0x01f8, B:94:0x0209, B:96:0x021e, B:7:0x0240, B:12:0x0265, B:13:0x0276, B:15:0x046f, B:24:0x027b, B:25:0x028d, B:27:0x02a2, B:28:0x02be, B:30:0x02d3, B:31:0x02ef, B:33:0x0304, B:34:0x0320, B:36:0x0335, B:37:0x0351, B:39:0x0366, B:40:0x0384, B:41:0x0396, B:43:0x03ab, B:44:0x03c9, B:46:0x03de, B:47:0x03fb, B:49:0x0410, B:50:0x042d, B:51:0x043e, B:53:0x0453, B:55:0x0251, B:57:0x0259, B:59:0x0261), top: B:60:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0384 A[Catch: all -> 0x0239, TryCatch #0 {all -> 0x0239, blocks: (B:61:0x0031, B:63:0x003e, B:64:0x004f, B:66:0x0054, B:67:0x0066, B:69:0x007b, B:70:0x0097, B:72:0x00ac, B:73:0x00c8, B:75:0x00dd, B:76:0x00f4, B:77:0x00f9, B:79:0x010e, B:80:0x0126, B:82:0x013b, B:83:0x0157, B:84:0x0169, B:86:0x017e, B:87:0x0197, B:89:0x01ac, B:90:0x01c8, B:92:0x01dd, B:93:0x01f8, B:94:0x0209, B:96:0x021e, B:7:0x0240, B:12:0x0265, B:13:0x0276, B:15:0x046f, B:24:0x027b, B:25:0x028d, B:27:0x02a2, B:28:0x02be, B:30:0x02d3, B:31:0x02ef, B:33:0x0304, B:34:0x0320, B:36:0x0335, B:37:0x0351, B:39:0x0366, B:40:0x0384, B:41:0x0396, B:43:0x03ab, B:44:0x03c9, B:46:0x03de, B:47:0x03fb, B:49:0x0410, B:50:0x042d, B:51:0x043e, B:53:0x0453, B:55:0x0251, B:57:0x0259, B:59:0x0261), top: B:60:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0396 A[Catch: all -> 0x0239, TryCatch #0 {all -> 0x0239, blocks: (B:61:0x0031, B:63:0x003e, B:64:0x004f, B:66:0x0054, B:67:0x0066, B:69:0x007b, B:70:0x0097, B:72:0x00ac, B:73:0x00c8, B:75:0x00dd, B:76:0x00f4, B:77:0x00f9, B:79:0x010e, B:80:0x0126, B:82:0x013b, B:83:0x0157, B:84:0x0169, B:86:0x017e, B:87:0x0197, B:89:0x01ac, B:90:0x01c8, B:92:0x01dd, B:93:0x01f8, B:94:0x0209, B:96:0x021e, B:7:0x0240, B:12:0x0265, B:13:0x0276, B:15:0x046f, B:24:0x027b, B:25:0x028d, B:27:0x02a2, B:28:0x02be, B:30:0x02d3, B:31:0x02ef, B:33:0x0304, B:34:0x0320, B:36:0x0335, B:37:0x0351, B:39:0x0366, B:40:0x0384, B:41:0x0396, B:43:0x03ab, B:44:0x03c9, B:46:0x03de, B:47:0x03fb, B:49:0x0410, B:50:0x042d, B:51:0x043e, B:53:0x0453, B:55:0x0251, B:57:0x0259, B:59:0x0261), top: B:60:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03c9 A[Catch: all -> 0x0239, TryCatch #0 {all -> 0x0239, blocks: (B:61:0x0031, B:63:0x003e, B:64:0x004f, B:66:0x0054, B:67:0x0066, B:69:0x007b, B:70:0x0097, B:72:0x00ac, B:73:0x00c8, B:75:0x00dd, B:76:0x00f4, B:77:0x00f9, B:79:0x010e, B:80:0x0126, B:82:0x013b, B:83:0x0157, B:84:0x0169, B:86:0x017e, B:87:0x0197, B:89:0x01ac, B:90:0x01c8, B:92:0x01dd, B:93:0x01f8, B:94:0x0209, B:96:0x021e, B:7:0x0240, B:12:0x0265, B:13:0x0276, B:15:0x046f, B:24:0x027b, B:25:0x028d, B:27:0x02a2, B:28:0x02be, B:30:0x02d3, B:31:0x02ef, B:33:0x0304, B:34:0x0320, B:36:0x0335, B:37:0x0351, B:39:0x0366, B:40:0x0384, B:41:0x0396, B:43:0x03ab, B:44:0x03c9, B:46:0x03de, B:47:0x03fb, B:49:0x0410, B:50:0x042d, B:51:0x043e, B:53:0x0453, B:55:0x0251, B:57:0x0259, B:59:0x0261), top: B:60:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03fb A[Catch: all -> 0x0239, TryCatch #0 {all -> 0x0239, blocks: (B:61:0x0031, B:63:0x003e, B:64:0x004f, B:66:0x0054, B:67:0x0066, B:69:0x007b, B:70:0x0097, B:72:0x00ac, B:73:0x00c8, B:75:0x00dd, B:76:0x00f4, B:77:0x00f9, B:79:0x010e, B:80:0x0126, B:82:0x013b, B:83:0x0157, B:84:0x0169, B:86:0x017e, B:87:0x0197, B:89:0x01ac, B:90:0x01c8, B:92:0x01dd, B:93:0x01f8, B:94:0x0209, B:96:0x021e, B:7:0x0240, B:12:0x0265, B:13:0x0276, B:15:0x046f, B:24:0x027b, B:25:0x028d, B:27:0x02a2, B:28:0x02be, B:30:0x02d3, B:31:0x02ef, B:33:0x0304, B:34:0x0320, B:36:0x0335, B:37:0x0351, B:39:0x0366, B:40:0x0384, B:41:0x0396, B:43:0x03ab, B:44:0x03c9, B:46:0x03de, B:47:0x03fb, B:49:0x0410, B:50:0x042d, B:51:0x043e, B:53:0x0453, B:55:0x0251, B:57:0x0259, B:59:0x0261), top: B:60:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x042d A[Catch: all -> 0x0239, TryCatch #0 {all -> 0x0239, blocks: (B:61:0x0031, B:63:0x003e, B:64:0x004f, B:66:0x0054, B:67:0x0066, B:69:0x007b, B:70:0x0097, B:72:0x00ac, B:73:0x00c8, B:75:0x00dd, B:76:0x00f4, B:77:0x00f9, B:79:0x010e, B:80:0x0126, B:82:0x013b, B:83:0x0157, B:84:0x0169, B:86:0x017e, B:87:0x0197, B:89:0x01ac, B:90:0x01c8, B:92:0x01dd, B:93:0x01f8, B:94:0x0209, B:96:0x021e, B:7:0x0240, B:12:0x0265, B:13:0x0276, B:15:0x046f, B:24:0x027b, B:25:0x028d, B:27:0x02a2, B:28:0x02be, B:30:0x02d3, B:31:0x02ef, B:33:0x0304, B:34:0x0320, B:36:0x0335, B:37:0x0351, B:39:0x0366, B:40:0x0384, B:41:0x0396, B:43:0x03ab, B:44:0x03c9, B:46:0x03de, B:47:0x03fb, B:49:0x0410, B:50:0x042d, B:51:0x043e, B:53:0x0453, B:55:0x0251, B:57:0x0259, B:59:0x0261), top: B:60:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x043e A[Catch: all -> 0x0239, TryCatch #0 {all -> 0x0239, blocks: (B:61:0x0031, B:63:0x003e, B:64:0x004f, B:66:0x0054, B:67:0x0066, B:69:0x007b, B:70:0x0097, B:72:0x00ac, B:73:0x00c8, B:75:0x00dd, B:76:0x00f4, B:77:0x00f9, B:79:0x010e, B:80:0x0126, B:82:0x013b, B:83:0x0157, B:84:0x0169, B:86:0x017e, B:87:0x0197, B:89:0x01ac, B:90:0x01c8, B:92:0x01dd, B:93:0x01f8, B:94:0x0209, B:96:0x021e, B:7:0x0240, B:12:0x0265, B:13:0x0276, B:15:0x046f, B:24:0x027b, B:25:0x028d, B:27:0x02a2, B:28:0x02be, B:30:0x02d3, B:31:0x02ef, B:33:0x0304, B:34:0x0320, B:36:0x0335, B:37:0x0351, B:39:0x0366, B:40:0x0384, B:41:0x0396, B:43:0x03ab, B:44:0x03c9, B:46:0x03de, B:47:0x03fb, B:49:0x0410, B:50:0x042d, B:51:0x043e, B:53:0x0453, B:55:0x0251, B:57:0x0259, B:59:0x0261), top: B:60:0x0031 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void configure(String appUserID) {
        String str;
        LogHandler currentLogHandler;
        String str2;
        String invoke;
        final String cachedAppUserID;
        final LogIntent logIntent;
        if (appUserID != null) {
            try {
                str = "[Purchases] - ";
                if (StringsKt.isBlank(appUserID)) {
                    final LogIntent logIntent2 = LogIntent.WARNING;
                    Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.identity.IdentityManager$configure$$inlined$log$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + " Identifying with empty App User ID will be treated as anonymous.";
                        }
                    };
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                        case 1:
                            LogLevel logLevel = LogLevel.DEBUG;
                            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                currentLogHandler2.d("[Purchases] - " + logLevel.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel2 = LogLevel.WARN;
                            LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                currentLogHandler3.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 4:
                            LogLevel logLevel3 = LogLevel.INFO;
                            LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                currentLogHandler4.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 5:
                            LogLevel logLevel4 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                str2 = "[Purchases] - " + logLevel4.name();
                                invoke = function0.invoke();
                                currentLogHandler.d(str2, invoke);
                                break;
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel5 = LogLevel.INFO;
                            LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                currentLogHandler5.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 8:
                            LogLevel logLevel6 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                str2 = "[Purchases] - " + logLevel6.name();
                                invoke = function0.invoke();
                                currentLogHandler.d(str2, invoke);
                                break;
                            }
                            break;
                        case 9:
                            LogLevel logLevel7 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                str2 = "[Purchases] - " + logLevel7.name();
                                invoke = function0.invoke();
                                currentLogHandler.d(str2, invoke);
                                break;
                            }
                            break;
                        case 10:
                            LogLevel logLevel8 = LogLevel.WARN;
                            LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                currentLogHandler6.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 11:
                            LogLevel logLevel9 = LogLevel.WARN;
                            LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                currentLogHandler7.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                            break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            str = "[Purchases] - ";
        }
        if (appUserID != null) {
            cachedAppUserID = !StringsKt.isBlank(appUserID) ? appUserID : null;
            if (cachedAppUserID != null) {
                logIntent = LogIntent.USER;
                Function0<String> function02 = new Function0<String>() { // from class: com.revenuecat.purchases.identity.IdentityManager$configure$$inlined$log$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                        String format = String.format(IdentityStrings.IDENTIFYING_APP_USER_ID, Arrays.copyOf(new Object[]{cachedAppUserID}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        return append.append(format).toString();
                    }
                };
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel10 = LogLevel.DEBUG;
                        LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler8.d("[Purchases] - " + logLevel10.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel11 = LogLevel.WARN;
                        LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                            currentLogHandler9.w("[Purchases] - " + logLevel11.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel12 = LogLevel.INFO;
                        LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                            currentLogHandler10.i("[Purchases] - " + logLevel12.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel13 = LogLevel.DEBUG;
                        LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                            currentLogHandler11.d("[Purchases] - " + logLevel13.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel14 = LogLevel.INFO;
                        LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                            currentLogHandler12.i(str + logLevel14.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel15 = LogLevel.DEBUG;
                        LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                            currentLogHandler13.d("[Purchases] - " + logLevel15.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel16 = LogLevel.DEBUG;
                        LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                            currentLogHandler14.d("[Purchases] - " + logLevel16.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel17 = LogLevel.WARN;
                        LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                            currentLogHandler15.w("[Purchases] - " + logLevel17.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel18 = LogLevel.WARN;
                        LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                            currentLogHandler16.w("[Purchases] - " + logLevel18.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                        break;
                }
                SharedPreferences.Editor startEditing = this.deviceCache.startEditing();
                this.deviceCache.cacheAppUserID(cachedAppUserID, startEditing);
                this.subscriberAttributesCache.cleanUpSubscriberAttributeCache(cachedAppUserID, startEditing);
                invalidateETagCacheIfNeeded(cachedAppUserID);
                startEditing.apply();
                enqueue(new Function0<Unit>() { // from class: com.revenuecat.purchases.identity.IdentityManager$configure$3
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        DeviceCache deviceCache;
                        deviceCache = IdentityManager.this.deviceCache;
                        deviceCache.cleanupOldAttributionData();
                    }
                });
            }
        }
        cachedAppUserID = this.deviceCache.getCachedAppUserID();
        if (cachedAppUserID == null && (cachedAppUserID = this.deviceCache.getLegacyCachedAppUserID()) == null) {
            cachedAppUserID = generateRandomID();
        }
        logIntent = LogIntent.USER;
        Function0<String> function022 = new Function0<String>() { // from class: com.revenuecat.purchases.identity.IdentityManager$configure$$inlined$log$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                String format = String.format(IdentityStrings.IDENTIFYING_APP_USER_ID, Arrays.copyOf(new Object[]{cachedAppUserID}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return append.append(format).toString();
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
        }
        SharedPreferences.Editor startEditing2 = this.deviceCache.startEditing();
        this.deviceCache.cacheAppUserID(cachedAppUserID, startEditing2);
        this.subscriberAttributesCache.cleanUpSubscriberAttributeCache(cachedAppUserID, startEditing2);
        invalidateETagCacheIfNeeded(cachedAppUserID);
        startEditing2.apply();
        enqueue(new Function0<Unit>() { // from class: com.revenuecat.purchases.identity.IdentityManager$configure$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DeviceCache deviceCache;
                deviceCache = IdentityManager.this.deviceCache;
                deviceCache.cleanupOldAttributionData();
            }
        });
    }

    public final Object aliasCurrentUserIdTo(final String str, Continuation<? super Unit> continuation) {
        final String currentAppUserID = getCurrentAppUserID();
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        this.backend.aliasUsers(str, currentAppUserID, new Function0<Unit>() { // from class: com.revenuecat.purchases.identity.IdentityManager$aliasCurrentUserIdTo$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LogHandler currentLogHandler;
                String str2;
                String invoke;
                OfferingsCache offeringsCache;
                DeviceCache deviceCache;
                OfflineEntitlementsManager offlineEntitlementsManager;
                IdentityManager identityManager = IdentityManager.this;
                final String str3 = currentAppUserID;
                final String str4 = str;
                synchronized (identityManager) {
                    final LogIntent logIntent = LogIntent.USER;
                    Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.identity.IdentityManager$aliasCurrentUserIdTo$2$1$invoke$lambda$1$$inlined$log$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                            String format = String.format(IdentityStrings.ALIAS_OLD_USER_ID_TO_CURRENT_SUCCESSFUL, Arrays.copyOf(new Object[]{str4, str3}, 2));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            return append.append(format).toString();
                        }
                    };
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                        case 1:
                            LogLevel logLevel = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                str2 = "[Purchases] - " + logLevel.name();
                                invoke = function0.invoke();
                                currentLogHandler.d(str2, invoke);
                                break;
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel2 = LogLevel.WARN;
                            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 4:
                            LogLevel logLevel3 = LogLevel.INFO;
                            LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 5:
                            LogLevel logLevel4 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                str2 = "[Purchases] - " + logLevel4.name();
                                invoke = function0.invoke();
                                currentLogHandler.d(str2, invoke);
                                break;
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel5 = LogLevel.INFO;
                            LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 8:
                            LogLevel logLevel6 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                str2 = "[Purchases] - " + logLevel6.name();
                                invoke = function0.invoke();
                                currentLogHandler.d(str2, invoke);
                                break;
                            }
                            break;
                        case 9:
                            LogLevel logLevel7 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                str2 = "[Purchases] - " + logLevel7.name();
                                invoke = function0.invoke();
                                currentLogHandler.d(str2, invoke);
                                break;
                            }
                            break;
                        case 10:
                            LogLevel logLevel8 = LogLevel.WARN;
                            LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 11:
                            LogLevel logLevel9 = LogLevel.WARN;
                            LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                            break;
                    }
                    offeringsCache = identityManager.offeringsCache;
                    offeringsCache.clearCache();
                    deviceCache = identityManager.deviceCache;
                    deviceCache.clearCustomerInfoCache(str3);
                    offlineEntitlementsManager = identityManager.offlineEntitlementsManager;
                    offlineEntitlementsManager.resetOfflineCustomerInfoCache();
                    Unit unit = Unit.INSTANCE;
                }
                Continuation<Unit> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m12363constructorimpl(Unit.INSTANCE));
            }
        }, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.identity.IdentityManager$aliasCurrentUserIdTo$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                Continuation<Unit> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m12363constructorimpl(ResultKt.createFailure(new PurchasesException(error))));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : Unit.INSTANCE;
    }

    public final void logIn(final String newAppUserID, final Function2<? super CustomerInfo, ? super Boolean, Unit> onSuccess, final Function1<? super PurchasesError, Unit> onError) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(newAppUserID, "newAppUserID");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (StringsKt.isBlank(newAppUserID)) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.InvalidAppUserIdError, IdentityStrings.LOG_IN_ERROR_MISSING_APP_USER_ID);
            LogUtilsKt.errorLog(purchasesError);
            onError.invoke(purchasesError);
            return;
        }
        final LogIntent logIntent = LogIntent.USER;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.identity.IdentityManager$logIn$$inlined$log$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                String format = String.format(IdentityStrings.LOGGING_IN, Arrays.copyOf(new Object[]{this.getCurrentAppUserID(), newAppUserID}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return append.append(format).toString();
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
        }
        final String currentAppUserID = getCurrentAppUserID();
        this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(newAppUserID, new Function0<Unit>() { // from class: com.revenuecat.purchases.identity.IdentityManager$logIn$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Backend backend;
                backend = IdentityManager.this.backend;
                String str2 = currentAppUserID;
                String str3 = newAppUserID;
                final IdentityManager identityManager = IdentityManager.this;
                final Function2<CustomerInfo, Boolean, Unit> function2 = onSuccess;
                final String str4 = currentAppUserID;
                final String str5 = newAppUserID;
                backend.logIn(str2, str3, new Function2<CustomerInfo, Boolean, Unit>() { // from class: com.revenuecat.purchases.identity.IdentityManager$logIn$3.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(CustomerInfo customerInfo, Boolean bool) {
                        invoke(customerInfo, bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(CustomerInfo customerInfo, final boolean z) {
                        LogHandler currentLogHandler7;
                        String str6;
                        String invoke2;
                        DeviceCache deviceCache;
                        OfferingsCache offeringsCache;
                        SubscriberAttributesCache subscriberAttributesCache;
                        DeviceCache deviceCache2;
                        DeviceCache deviceCache3;
                        OfflineEntitlementsManager offlineEntitlementsManager;
                        Intrinsics.checkNotNullParameter(customerInfo, "customerInfo");
                        IdentityManager identityManager2 = IdentityManager.this;
                        String str7 = str4;
                        final String str8 = str5;
                        synchronized (identityManager2) {
                            try {
                                final LogIntent logIntent2 = LogIntent.USER;
                                try {
                                    Function0<String> function02 = new Function0<String>() { // from class: com.revenuecat.purchases.identity.IdentityManager$logIn$3$1$invoke$lambda$1$$inlined$log$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final String invoke() {
                                            StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                                            String format = String.format(IdentityStrings.LOG_IN_SUCCESSFUL, Arrays.copyOf(new Object[]{str8, Boolean.valueOf(z)}, 2));
                                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                            return append.append(format).toString();
                                        }
                                    };
                                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                                        case 1:
                                            LogLevel logLevel10 = LogLevel.DEBUG;
                                            currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                                str6 = "[Purchases] - " + logLevel10.name();
                                                invoke2 = function02.invoke();
                                                currentLogHandler7.d(str6, invoke2);
                                                break;
                                            }
                                            break;
                                        case 2:
                                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                                            break;
                                        case 3:
                                            LogLevel logLevel11 = LogLevel.WARN;
                                            LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                                currentLogHandler8.w("[Purchases] - " + logLevel11.name(), function02.invoke());
                                                break;
                                            }
                                            break;
                                        case 4:
                                            LogLevel logLevel12 = LogLevel.INFO;
                                            LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                                currentLogHandler9.i("[Purchases] - " + logLevel12.name(), function02.invoke());
                                                break;
                                            }
                                            break;
                                        case 5:
                                            LogLevel logLevel13 = LogLevel.DEBUG;
                                            currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                                str6 = "[Purchases] - " + logLevel13.name();
                                                invoke2 = function02.invoke();
                                                currentLogHandler7.d(str6, invoke2);
                                                break;
                                            }
                                            break;
                                        case 6:
                                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                                            break;
                                        case 7:
                                            LogLevel logLevel14 = LogLevel.INFO;
                                            LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                                currentLogHandler10.i("[Purchases] - " + logLevel14.name(), function02.invoke());
                                                break;
                                            }
                                            break;
                                        case 8:
                                            LogLevel logLevel15 = LogLevel.DEBUG;
                                            currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                                str6 = "[Purchases] - " + logLevel15.name();
                                                invoke2 = function02.invoke();
                                                currentLogHandler7.d(str6, invoke2);
                                                break;
                                            }
                                            break;
                                        case 9:
                                            LogLevel logLevel16 = LogLevel.DEBUG;
                                            currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                                str6 = "[Purchases] - " + logLevel16.name();
                                                invoke2 = function02.invoke();
                                                currentLogHandler7.d(str6, invoke2);
                                                break;
                                            }
                                            break;
                                        case 10:
                                            LogLevel logLevel17 = LogLevel.WARN;
                                            LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                                currentLogHandler11.w("[Purchases] - " + logLevel17.name(), function02.invoke());
                                                break;
                                            }
                                            break;
                                        case 11:
                                            LogLevel logLevel18 = LogLevel.WARN;
                                            LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                                currentLogHandler12.w("[Purchases] - " + logLevel18.name(), function02.invoke());
                                                break;
                                            }
                                            break;
                                        case 12:
                                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                                            break;
                                    }
                                    deviceCache = identityManager2.deviceCache;
                                    deviceCache.clearCachesForAppUserID(str7);
                                    offeringsCache = identityManager2.offeringsCache;
                                    offeringsCache.clearCache();
                                    subscriberAttributesCache = identityManager2.subscriberAttributesCache;
                                    subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(str7);
                                    deviceCache2 = identityManager2.deviceCache;
                                    deviceCache2.cacheAppUserID(str8);
                                    deviceCache3 = identityManager2.deviceCache;
                                    deviceCache3.cacheCustomerInfo(str8, customerInfo);
                                    identityManager2.copySubscriberAttributesToNewUserIfOldIsAnonymous(str7, str8);
                                    offlineEntitlementsManager = identityManager2.offlineEntitlementsManager;
                                    offlineEntitlementsManager.resetOfflineCustomerInfoCache();
                                    Unit unit = Unit.INSTANCE;
                                    function2.invoke(customerInfo, Boolean.valueOf(z));
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }, onError);
            }
        });
    }

    public final synchronized void logOut(final Function1<? super PurchasesError, Unit> completion) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(completion, "completion");
        if (!currentUserIsAnonymous()) {
            this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(getCurrentAppUserID(), new Function0<Unit>() { // from class: com.revenuecat.purchases.identity.IdentityManager$logOut$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    String generateRandomID;
                    LogHandler currentLogHandler2;
                    String str2;
                    String invoke2;
                    IdentityManager identityManager = IdentityManager.this;
                    generateRandomID = identityManager.generateRandomID();
                    identityManager.resetAndSaveUserID(generateRandomID);
                    final LogIntent logIntent = LogIntent.USER;
                    Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.identity.IdentityManager$logOut$2$invoke$$inlined$log$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + " Logged out successfully";
                        }
                    };
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                        case 1:
                            LogLevel logLevel = LogLevel.DEBUG;
                            currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                str2 = "[Purchases] - " + logLevel.name();
                                invoke2 = function0.invoke();
                                currentLogHandler2.d(str2, invoke2);
                                break;
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel2 = LogLevel.WARN;
                            LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                currentLogHandler3.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 4:
                            LogLevel logLevel3 = LogLevel.INFO;
                            LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                currentLogHandler4.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 5:
                            LogLevel logLevel4 = LogLevel.DEBUG;
                            currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                str2 = "[Purchases] - " + logLevel4.name();
                                invoke2 = function0.invoke();
                                currentLogHandler2.d(str2, invoke2);
                                break;
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel5 = LogLevel.INFO;
                            LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                currentLogHandler5.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 8:
                            LogLevel logLevel6 = LogLevel.DEBUG;
                            currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                str2 = "[Purchases] - " + logLevel6.name();
                                invoke2 = function0.invoke();
                                currentLogHandler2.d(str2, invoke2);
                                break;
                            }
                            break;
                        case 9:
                            LogLevel logLevel7 = LogLevel.DEBUG;
                            currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                str2 = "[Purchases] - " + logLevel7.name();
                                invoke2 = function0.invoke();
                                currentLogHandler2.d(str2, invoke2);
                                break;
                            }
                            break;
                        case 10:
                            LogLevel logLevel8 = LogLevel.WARN;
                            LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                currentLogHandler6.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 11:
                            LogLevel logLevel9 = LogLevel.WARN;
                            LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                currentLogHandler7.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                            break;
                    }
                    completion.invoke(null);
                }
            });
            return;
        }
        final LogIntent logIntent = LogIntent.RC_ERROR;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.identity.IdentityManager$logOut$$inlined$log$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + " Called logOut but the current user is anonymous";
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
        }
        completion.invoke(new PurchasesError(PurchasesErrorCode.LogOutWithAnonymousUserError, null, 2, null));
    }

    public final synchronized boolean currentUserIsAnonymous() {
        Companion companion;
        String cachedAppUserID;
        companion = INSTANCE;
        cachedAppUserID = this.deviceCache.getCachedAppUserID();
        if (cachedAppUserID == null) {
            cachedAppUserID = "";
        }
        return companion.isUserIDAnonymous(cachedAppUserID) || Intrinsics.areEqual(this.deviceCache.getCachedAppUserID(), this.deviceCache.getLegacyCachedAppUserID());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copySubscriberAttributesToNewUserIfOldIsAnonymous(String oldAppUserId, String newAppUserId) {
        if (INSTANCE.isUserIDAnonymous(oldAppUserId)) {
            this.subscriberAttributesManager.copyUnsyncedSubscriberAttributes(oldAppUserId, newAppUserId);
        }
    }

    private final void invalidateETagCacheIfNeeded(String appUserID) {
        if (!Intrinsics.areEqual(this.backend.getVerificationMode(), SignatureVerificationMode.Disabled.INSTANCE) && shouldInvalidateETagCache(this.deviceCache.getCachedCustomerInfo(appUserID))) {
            LogLevel logLevel = LogLevel.INFO;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.i("[Purchases] - " + logLevel.name(), IdentityStrings.INVALIDATING_CACHED_ETAG_CACHE);
            }
            this.backend.clearCaches();
        }
    }

    private final boolean shouldInvalidateETagCache(CustomerInfo customerInfo) {
        return (customerInfo == null || customerInfo.getEntitlements().getVerification() != VerificationResult.NOT_REQUESTED || Intrinsics.areEqual(this.backend.getVerificationMode(), SignatureVerificationMode.Disabled.INSTANCE)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String generateRandomID() {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        StringBuilder sb = new StringBuilder("$RCAnonymousID:");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = uuid.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String replace$default = StringsKt.replace$default(lowerCase, "-", "", false, 4, (Object) null);
        final LogIntent logIntent = LogIntent.USER;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.identity.IdentityManager$generateRandomID$lambda$10$$inlined$log$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + " Setting new anonymous App User ID - %s";
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
        }
        return sb.append(replace$default).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void resetAndSaveUserID(String newUserID) {
        this.deviceCache.clearCachesForAppUserID(getCurrentAppUserID());
        this.offeringsCache.clearCache();
        this.subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(getCurrentAppUserID());
        this.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
        this.deviceCache.cacheAppUserID(newUserID);
        this.backend.clearCaches();
    }

    private final synchronized void enqueue(final Function0<Unit> command) {
        this.dispatcher.enqueue(new Runnable() { // from class: com.revenuecat.purchases.identity.IdentityManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Function0.this.invoke();
            }
        }, Delay.NONE);
    }

    public final void switchUser(String newAppUserID) {
        Intrinsics.checkNotNullParameter(newAppUserID, "newAppUserID");
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            String str = "[Purchases] - " + logLevel.name();
            String format = String.format(IdentityStrings.SWITCHING_USER, Arrays.copyOf(new Object[]{newAppUserID}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            currentLogHandler.d(str, format);
        }
        resetAndSaveUserID(newAppUserID);
    }
}
