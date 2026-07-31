package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingResultExtensionsBillingIndependentKt;
import com.revenuecat.purchases.google.ErrorsKt;
import com.revenuecat.purchases.strings.PurchaseStrings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: AcknowledgePurchaseUseCase.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class AcknowledgePurchaseUseCase$executeAsync$1 extends Lambda implements Function1<BillingClient, Unit> {
    final /* synthetic */ AcknowledgePurchaseUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcknowledgePurchaseUseCase$executeAsync$1(AcknowledgePurchaseUseCase acknowledgePurchaseUseCase) {
        super(1);
        this.this$0 = acknowledgePurchaseUseCase;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
        invoke2(billingClient);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BillingClient invoke) {
        AcknowledgePurchaseUseCaseParams acknowledgePurchaseUseCaseParams;
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        AcknowledgePurchaseParams.Builder newBuilder = AcknowledgePurchaseParams.newBuilder();
        acknowledgePurchaseUseCaseParams = this.this$0.useCaseParams;
        AcknowledgePurchaseParams build = newBuilder.setPurchaseToken(acknowledgePurchaseUseCaseParams.getPurchaseToken()).build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …\n                .build()");
        final AcknowledgePurchaseUseCase acknowledgePurchaseUseCase = this.this$0;
        invoke.acknowledgePurchase(build, new AcknowledgePurchaseResponseListener() { // from class: com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase$executeAsync$1$$ExternalSyntheticLambda0
            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
            public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                AcknowledgePurchaseUseCase$executeAsync$1.invoke$lambda$0(AcknowledgePurchaseUseCase.this, billingResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(final AcknowledgePurchaseUseCase acknowledgePurchaseUseCase, BillingResult billingResult) {
        AcknowledgePurchaseUseCaseParams acknowledgePurchaseUseCaseParams;
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        acknowledgePurchaseUseCaseParams = acknowledgePurchaseUseCase.useCaseParams;
        BillingClientUseCase.processResult$default(acknowledgePurchaseUseCase, billingResult, acknowledgePurchaseUseCaseParams.getPurchaseToken(), null, new Function1<BillingResult, Unit>() { // from class: com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase$executeAsync$1$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BillingResult billingResult2) {
                invoke2(billingResult2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BillingResult errorBillingResult) {
                final String str;
                AcknowledgePurchaseUseCaseParams acknowledgePurchaseUseCaseParams2;
                LogHandler currentLogHandler;
                String str2;
                String invoke;
                Intrinsics.checkNotNullParameter(errorBillingResult, "errorBillingResult");
                if (errorBillingResult.getResponseCode() == 8) {
                    acknowledgePurchaseUseCaseParams2 = AcknowledgePurchaseUseCase.this.useCaseParams;
                    if (acknowledgePurchaseUseCaseParams2.getInitiationSource() == PostReceiptInitiationSource.RESTORE) {
                        final LogIntent logIntent = LogIntent.GOOGLE_WARNING;
                        str = PurchaseStrings.ACKNOWLEDGING_PURCHASE_ERROR_RESTORE;
                        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + ' ' + str;
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
                        AcknowledgePurchaseUseCase.this.getOnError().invoke(ErrorsKt.billingResponseToPurchasesError(errorBillingResult.getResponseCode(), str));
                    }
                }
                str = AcknowledgePurchaseUseCase.this.getErrorMessage() + " - " + BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(errorBillingResult);
                final LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
                Function0<String> function02 = new Function0<String>() { // from class: com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + ' ' + str;
                    }
                };
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                    case 1:
                        LogLevel logLevel10 = LogLevel.DEBUG;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.d("[Purchases] - " + logLevel10.name(), function02.invoke());
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
                        LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                            currentLogHandler10.d("[Purchases] - " + logLevel13.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel14 = LogLevel.INFO;
                        LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                            currentLogHandler11.i("[Purchases] - " + logLevel14.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel15 = LogLevel.DEBUG;
                        LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                            currentLogHandler12.d("[Purchases] - " + logLevel15.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel16 = LogLevel.DEBUG;
                        LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                            currentLogHandler13.d("[Purchases] - " + logLevel16.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel17 = LogLevel.WARN;
                        LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                            currentLogHandler14.w("[Purchases] - " + logLevel17.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel18 = LogLevel.WARN;
                        LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                            currentLogHandler15.w("[Purchases] - " + logLevel18.name(), function02.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                        break;
                }
                AcknowledgePurchaseUseCase.this.getOnError().invoke(ErrorsKt.billingResponseToPurchasesError(errorBillingResult.getResponseCode(), str));
            }
        }, 4, null);
    }
}
