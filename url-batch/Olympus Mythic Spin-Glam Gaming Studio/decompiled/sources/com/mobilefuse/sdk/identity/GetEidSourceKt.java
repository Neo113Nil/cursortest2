package com.mobilefuse.sdk.identity;

import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.MobileFuseSettings;
import com.mobilefuse.sdk.MobileFuseTargetingData;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.ConversionsKt;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.privacy.PrivacyCenter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetEidSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001ap\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\b\u0002\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0000¨\u0006\u000b"}, d2 = {"getEidSource", "", "Lcom/mobilefuse/sdk/identity/EidService;", "currentEidsMapFactory", "Lkotlin/Function0;", "", "lmtFactory", "", "advertisingIdFactory", "emailFactory", "phoneNumberFactory", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes3.dex */
public final class GetEidSourceKt {
    public static /* synthetic */ String getEidSource$default(EidService eidService, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = new GetEidSourceKt$getEidSource$1(eidService);
        }
        if ((i & 2) != 0) {
            function02 = new Function0() { // from class: com.mobilefuse.sdk.identity.GetEidSourceKt$getEidSource$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    return Boolean.valueOf(invoke());
                }

                public final boolean invoke() {
                    return PrivacyCenter.isSdkLimitedToSendUserData$default(null, 1, null);
                }
            };
        }
        Function0 function06 = function02;
        if ((i & 4) != 0) {
            function03 = new GetEidSourceKt$getEidSource$3(MobileFuseSettings.INSTANCE);
        }
        Function0 function07 = function03;
        if ((i & 8) != 0) {
            final MobileFuseTargetingData.Companion companion = MobileFuseTargetingData.INSTANCE;
            function04 = new MutablePropertyReference0Impl(companion) { // from class: com.mobilefuse.sdk.identity.GetEidSourceKt$getEidSource$4
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                @Nullable
                public Object get() {
                    return ((MobileFuseTargetingData.Companion) this.receiver).getEmail();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public void set(@Nullable Object obj2) {
                    ((MobileFuseTargetingData.Companion) this.receiver).setEmail((String) obj2);
                }
            };
        }
        Function0 function08 = function04;
        if ((i & 16) != 0) {
            final MobileFuseTargetingData.Companion companion2 = MobileFuseTargetingData.INSTANCE;
            function05 = new MutablePropertyReference0Impl(companion2) { // from class: com.mobilefuse.sdk.identity.GetEidSourceKt$getEidSource$5
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                @Nullable
                public Object get() {
                    return ((MobileFuseTargetingData.Companion) this.receiver).getPhoneNumber();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public void set(@Nullable Object obj2) {
                    ((MobileFuseTargetingData.Companion) this.receiver).setPhoneNumber((String) obj2);
                }
            };
        }
        return getEidSource(eidService, function0, function06, function07, function08, function05);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String getEidSource(@NotNull EidService getEidSource, @NotNull Function0 currentEidsMapFactory, @NotNull Function0 lmtFactory, @NotNull Function0 advertisingIdFactory, @NotNull Function0 emailFactory, @NotNull Function0 phoneNumberFactory) {
        CharSequence charSequence;
        boolean z;
        Intrinsics.checkNotNullParameter(getEidSource, "$this$getEidSource");
        Intrinsics.checkNotNullParameter(currentEidsMapFactory, "currentEidsMapFactory");
        Intrinsics.checkNotNullParameter(lmtFactory, "lmtFactory");
        Intrinsics.checkNotNullParameter(advertisingIdFactory, "advertisingIdFactory");
        Intrinsics.checkNotNullParameter(emailFactory, "emailFactory");
        Intrinsics.checkNotNullParameter(phoneNumberFactory, "phoneNumberFactory");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (((Map) currentEidsMapFactory.mo4828invoke()).isEmpty()) {
                DebuggingKt.logDebug$default(getEidSource, "No valid extended user id, return null as an eidSource.", null, 2, null);
                return null;
            }
            if (!((Boolean) lmtFactory.mo4828invoke()).booleanValue() && (charSequence = (CharSequence) advertisingIdFactory.mo4828invoke()) != null && charSequence.length() != 0) {
                z = true;
                boolean z2 = emailFactory.mo4828invoke() == null;
                boolean z3 = phoneNumberFactory.mo4828invoke() != null;
                StringBuilder sb = new StringBuilder();
                sb.append(ConversionsKt.toInt(z));
                sb.append(ConversionsKt.toInt(z2));
                sb.append(ConversionsKt.toInt(z3));
                return sb.toString();
            }
            z = false;
            if (emailFactory.mo4828invoke() == null) {
            }
            if (phoneNumberFactory.mo4828invoke() != null) {
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ConversionsKt.toInt(z));
            sb2.append(ConversionsKt.toInt(z2));
            sb2.append(ConversionsKt.toInt(z3));
            return sb2.toString();
        } catch (Throwable th) {
            if (GetEidSourceKt$getEidSource$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return null;
        }
    }
}
