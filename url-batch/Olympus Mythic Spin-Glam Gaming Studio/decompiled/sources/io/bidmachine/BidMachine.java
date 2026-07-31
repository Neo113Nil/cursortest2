package io.bidmachine;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequest;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes15.dex */
public class BidMachine {
    public static final String NAME = "BidMachine";
    private static final String TAG = "BidMachine";
    public static final String VERSION = "3.7.1";

    @NonNull
    @WorkerThread
    @Deprecated
    public static String getBidToken(@NonNull Context context, @NonNull AdsFormat adsFormat) {
        return getBidToken(context, new AdPlacementConfig.Builder(adsFormat.toAdFormat()).build());
    }

    @Nullable
    public static Object getExtrasParam(@NonNull Context context, @NonNull String str) {
        return ExtraParamsManager.get().getPublic(context, str);
    }

    public static void initialize(@NonNull Context context, @NonNull String str) {
        initialize(context, str, null);
    }

    public static boolean isInitialized() {
        return k.b().s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getBidToken$17(String str) {
        return String.format("getBidToken - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getBidToken$18(BidTokenCallback bidTokenCallback, Context context, AdPlacementConfig adPlacementConfig) {
        bidTokenCallback.onCollected(getBidToken(context, adPlacementConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$initialize$0(String str) {
        return String.format("initialize - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setConsentConfig$3(boolean z, String str) {
        return String.format("setConsentConfig - %s, %s", Boolean.valueOf(z), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ io.bidmachine.internal.A lambda$setConsentConfig$4(boolean z, String str, io.bidmachine.internal.A a) {
        return a.a(Boolean.valueOf(z)).b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setConsentStatus$5(boolean z) {
        return String.format("setConsentStatus - %s", Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ io.bidmachine.internal.A lambda$setConsentStatus$6(boolean z, io.bidmachine.internal.A a) {
        return a.a(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ io.bidmachine.internal.A lambda$setCoppa$10(Boolean bool, io.bidmachine.internal.A a) {
        return a.b(bool).c(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setCoppa$9(Boolean bool) {
        return String.format("setCoppa - %s", bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setEndpoint$1(String str) {
        return String.format("setEndpoint - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setGPP$13(String str, List list) {
        return String.format("setGPP - %s, [%s]", str, Utils.join(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ io.bidmachine.internal.A lambda$setGPP$14(String str, List list, io.bidmachine.internal.A a) {
        return a.c(str).a(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setNonPersonalized$15(Boolean bool) {
        return "setNonPersonalized - " + bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ io.bidmachine.internal.A lambda$setNonPersonalized$16(Boolean bool, io.bidmachine.internal.A a) {
        return a.c(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setSubjectToGDPR$7(Boolean bool) {
        return String.format("setSubjectToGDPR - %s", bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ io.bidmachine.internal.A lambda$setSubjectToGDPR$8(Boolean bool, io.bidmachine.internal.A a) {
        return a.d(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setTestMode$2(boolean z) {
        return String.format("setTestMode - %s", Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setUSPrivacyString$11(String str) {
        return String.format("setUSPrivacyString - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ io.bidmachine.internal.A lambda$setUSPrivacyString$12(String str, io.bidmachine.internal.A a) {
        return a.a(str);
    }

    public static void registerAdRequestListener(@NonNull AdRequest.AdRequestListener<?> adRequestListener) {
        Logger.d("BidMachine", "registerAdRequestListener");
        k.b().a(adRequestListener);
    }

    public static void registerNetworks(@NonNull NetworkConfig... networkConfigArr) {
        Logger.d("BidMachine", "registerNetworks with NetworkConfig array");
        NetworkRegistry.registerNetworks(networkConfigArr);
    }

    @Deprecated
    public static void setConsentConfig(final boolean z, @Nullable final String str) {
        Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.BidMachine$$ExternalSyntheticLambda6
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$setConsentConfig$3;
                lambda$setConsentConfig$3 = BidMachine.lambda$setConsentConfig$3(z, str);
                return lambda$setConsentConfig$3;
            }
        });
        k.b().k().a(new Function1() { // from class: io.bidmachine.BidMachine$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                io.bidmachine.internal.A lambda$setConsentConfig$4;
                lambda$setConsentConfig$4 = BidMachine.lambda$setConsentConfig$4(z, str, (io.bidmachine.internal.A) obj);
                return lambda$setConsentConfig$4;
            }
        });
    }

    public static void setConsentStatus(final boolean z) {
        Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.BidMachine$$ExternalSyntheticLambda14
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$setConsentStatus$5;
                lambda$setConsentStatus$5 = BidMachine.lambda$setConsentStatus$5(z);
                return lambda$setConsentStatus$5;
            }
        });
        k.b().k().a(new Function1() { // from class: io.bidmachine.BidMachine$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                io.bidmachine.internal.A lambda$setConsentStatus$6;
                lambda$setConsentStatus$6 = BidMachine.lambda$setConsentStatus$6(z, (io.bidmachine.internal.A) obj);
                return lambda$setConsentStatus$6;
            }
        });
    }

    public static void setCoppa(@Nullable final Boolean bool) {
        Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.BidMachine$$ExternalSyntheticLambda0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$setCoppa$9;
                lambda$setCoppa$9 = BidMachine.lambda$setCoppa$9(bool);
                return lambda$setCoppa$9;
            }
        });
        k.b().k().a(new Function1() { // from class: io.bidmachine.BidMachine$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                io.bidmachine.internal.A lambda$setCoppa$10;
                lambda$setCoppa$10 = BidMachine.lambda$setCoppa$10(bool, (io.bidmachine.internal.A) obj);
                return lambda$setCoppa$10;
            }
        });
    }

    public static void setEndpoint(@NonNull final String str) {
        Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.BidMachine$$ExternalSyntheticLambda8
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$setEndpoint$1;
                lambda$setEndpoint$1 = BidMachine.lambda$setEndpoint$1(str);
                return lambda$setEndpoint$1;
            }
        });
        UrlProvider.setEndpoint(str);
    }

    public static void setGPP(@Nullable final String str, @Nullable final List<Integer> list) {
        Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.BidMachine$$ExternalSyntheticLambda2
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$setGPP$13;
                lambda$setGPP$13 = BidMachine.lambda$setGPP$13(str, list);
                return lambda$setGPP$13;
            }
        });
        k.b().k().a(new Function1() { // from class: io.bidmachine.BidMachine$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                io.bidmachine.internal.A lambda$setGPP$14;
                lambda$setGPP$14 = BidMachine.lambda$setGPP$14(str, list, (io.bidmachine.internal.A) obj);
                return lambda$setGPP$14;
            }
        });
    }

    public static void setLoggingEnabled(boolean z) {
        if (Debugger.isLoggingLock()) {
            Logger.d("BidMachine", "setLoggingEnabled skipped");
            return;
        }
        if (z) {
            Logger.setLoggingEnabled(true);
            Logger.d("BidMachine", "setLoggingEnabled - true");
        } else {
            Logger.d("BidMachine", "setLoggingEnabled - false");
            Logger.setLoggingEnabled(false);
        }
        NetworkRegistry.setLoggingEnabled(z);
    }

    public static void setNonPersonalized(@Nullable final Boolean bool) {
        Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.BidMachine$$ExternalSyntheticLambda11
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$setNonPersonalized$15;
                lambda$setNonPersonalized$15 = BidMachine.lambda$setNonPersonalized$15(bool);
                return lambda$setNonPersonalized$15;
            }
        });
        k.b().k().a(new Function1() { // from class: io.bidmachine.BidMachine$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                io.bidmachine.internal.A lambda$setNonPersonalized$16;
                lambda$setNonPersonalized$16 = BidMachine.lambda$setNonPersonalized$16(bool, (io.bidmachine.internal.A) obj);
                return lambda$setNonPersonalized$16;
            }
        });
    }

    public static void setPublisher(@Nullable Publisher publisher) {
        Logger.d("BidMachine", "setPublisher");
        k.b().a(publisher);
    }

    public static void setSubjectToGDPR(@Nullable final Boolean bool) {
        Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.BidMachine$$ExternalSyntheticLambda16
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$setSubjectToGDPR$7;
                lambda$setSubjectToGDPR$7 = BidMachine.lambda$setSubjectToGDPR$7(bool);
                return lambda$setSubjectToGDPR$7;
            }
        });
        k.b().k().a(new Function1() { // from class: io.bidmachine.BidMachine$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                io.bidmachine.internal.A lambda$setSubjectToGDPR$8;
                lambda$setSubjectToGDPR$8 = BidMachine.lambda$setSubjectToGDPR$8(bool, (io.bidmachine.internal.A) obj);
                return lambda$setSubjectToGDPR$8;
            }
        });
    }

    public static void setTargetingParams(@Nullable TargetingParams targetingParams) {
        Logger.d("BidMachine", "setTargetingParams");
        k.b().a(targetingParams);
    }

    public static void setTestMode(final boolean z) {
        if (Debugger.isTestModeLock()) {
            Logger.d("BidMachine", "setTestMode skipped");
        } else {
            Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.BidMachine$$ExternalSyntheticLambda5
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$setTestMode$2;
                    lambda$setTestMode$2 = BidMachine.lambda$setTestMode$2(z);
                    return lambda$setTestMode$2;
                }
            });
            k.b().a(z);
        }
    }

    @Deprecated
    public static void setUSPrivacyString(@Nullable final String str) {
        Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.BidMachine$$ExternalSyntheticLambda9
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$setUSPrivacyString$11;
                lambda$setUSPrivacyString$11 = BidMachine.lambda$setUSPrivacyString$11(str);
                return lambda$setUSPrivacyString$11;
            }
        });
        k.b().k().a(new Function1() { // from class: io.bidmachine.BidMachine$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                io.bidmachine.internal.A lambda$setUSPrivacyString$12;
                lambda$setUSPrivacyString$12 = BidMachine.lambda$setUSPrivacyString$12(str, (io.bidmachine.internal.A) obj);
                return lambda$setUSPrivacyString$12;
            }
        });
    }

    public static void unregisterAdRequestListener(@NonNull AdRequest.AdRequestListener<?> adRequestListener) {
        Logger.d("BidMachine", "unregisterAdRequestListener");
        k.b().b(adRequestListener);
    }

    @NonNull
    @WorkerThread
    public static String getBidToken(@NonNull Context context, @NonNull AdPlacementConfig adPlacementConfig) {
        final String a = o.a(context.getApplicationContext(), adPlacementConfig);
        Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.BidMachine$$ExternalSyntheticLambda4
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$getBidToken$17;
                lambda$getBidToken$17 = BidMachine.lambda$getBidToken$17(a);
                return lambda$getBidToken$17;
            }
        });
        return a;
    }

    public static void initialize(@NonNull Context context, @NonNull final String str, @Nullable InitializationCallback initializationCallback) {
        Logger.d("BidMachine", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.BidMachine$$ExternalSyntheticLambda18
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$initialize$0;
                lambda$initialize$0 = BidMachine.lambda$initialize$0(str);
                return lambda$initialize$0;
            }
        });
        k.b().a(context, str, initializationCallback);
    }

    @WorkerThread
    public static void registerNetworks(@NonNull Context context, @NonNull String str) {
        Logger.d("BidMachine", "registerNetworks with JSON string");
        NetworkRegistry.registerNetworks(context, str);
    }

    @AnyThread
    @Deprecated
    public static void getBidToken(@NonNull Context context, @NonNull AdsFormat adsFormat, @NonNull BidTokenCallback bidTokenCallback) {
        getBidToken(context, new AdPlacementConfig.Builder(adsFormat.toAdFormat()).build(), bidTokenCallback);
    }

    @AnyThread
    public static void getBidToken(@NonNull Context context, @NonNull final AdPlacementConfig adPlacementConfig, @NonNull final BidTokenCallback bidTokenCallback) {
        final Context applicationContext = context.getApplicationContext();
        BidTokenTaskManager.execute(new Runnable() { // from class: io.bidmachine.BidMachine$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                BidMachine.lambda$getBidToken$18(BidTokenCallback.this, applicationContext, adPlacementConfig);
            }
        });
    }

    public static void registerNetworks(@NonNull Context context, @NonNull String str, @Nullable NetworkRegistryCallback networkRegistryCallback) {
        Logger.d("BidMachine", "registerNetworks with JSON string");
        NetworkRegistry.registerNetworks(context, str, networkRegistryCallback);
    }
}
