package com.revenuecat.purchases.ads.events.types;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AdMediatorName.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", InAppPurchaseConstants.METHOD_TO_STRING, "toString-impl", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes7.dex */
public final class AdMediatorName {
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String AD_MOB = m10554constructorimpl("AdMob");
    private static final String APP_LOVIN = m10554constructorimpl("AppLovin");

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdMediatorName m10553boximpl(String str) {
        return new AdMediatorName(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m10554constructorimpl(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10555equalsimpl(String str, Object obj) {
        return (obj instanceof AdMediatorName) && Intrinsics.areEqual(str, ((AdMediatorName) obj).getValue());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10556equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10557hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10558toStringimpl(String str) {
        return "AdMediatorName(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m10555equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m10557hashCodeimpl(this.value);
    }

    public String toString() {
        return m10558toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ String getValue() {
        return this.value;
    }

    /* compiled from: AdMediatorName.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdMediatorName$Companion;", "", "()V", "AD_MOB", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "getAD_MOB-GyoM_N4", "()Ljava/lang/String;", "Ljava/lang/String;", "APP_LOVIN", "getAPP_LOVIN-GyoM_N4", "fromString", "value", "", "fromString-CJOXPJU", "(Ljava/lang/String;)Ljava/lang/String;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getAD_MOB-GyoM_N4, reason: not valid java name */
        public final String m10561getAD_MOBGyoM_N4() {
            return AdMediatorName.AD_MOB;
        }

        /* renamed from: getAPP_LOVIN-GyoM_N4, reason: not valid java name */
        public final String m10562getAPP_LOVINGyoM_N4() {
            return AdMediatorName.APP_LOVIN;
        }

        /* renamed from: fromString-CJOXPJU, reason: not valid java name */
        public final String m10560fromStringCJOXPJU(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            String obj = StringsKt.trim((CharSequence) value).toString();
            return Intrinsics.areEqual(obj, "AdMob") ? m10561getAD_MOBGyoM_N4() : Intrinsics.areEqual(obj, "AppLovin") ? m10562getAPP_LOVINGyoM_N4() : AdMediatorName.m10554constructorimpl(value);
        }
    }

    private /* synthetic */ AdMediatorName(String str) {
        this.value = str;
    }
}
