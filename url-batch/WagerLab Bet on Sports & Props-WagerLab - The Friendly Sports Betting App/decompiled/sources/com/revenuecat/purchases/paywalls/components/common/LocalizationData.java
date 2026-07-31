package com.revenuecat.purchases.paywalls.components.common;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* compiled from: Localization.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "", "Companion", "Image", "Text", "Video", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Image;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Text;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Video;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable(with = LocalizationDataSerializer.class)
/* loaded from: classes7.dex */
public interface LocalizationData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: Localization.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final KSerializer<LocalizationData> serializer() {
            return LocalizationDataSerializer.INSTANCE;
        }
    }

    /* compiled from: Localization.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Text;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", InAppPurchaseConstants.METHOD_TO_STRING, "toString-impl", "$serializer", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Serializable
    @JvmInline
    public static final class Text implements LocalizationData {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Text m10679boximpl(String str) {
            return new Text(str);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m10680constructorimpl(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m10681equalsimpl(String str, Object obj) {
            return (obj instanceof Text) && Intrinsics.areEqual(str, ((Text) obj).m10685unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m10682equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m10683hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m10684toStringimpl(String str) {
            return "Text(value=" + str + ')';
        }

        public boolean equals(Object obj) {
            return m10681equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m10683hashCodeimpl(this.value);
        }

        public String toString() {
            return m10684toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m10685unboximpl() {
            return this.value;
        }

        /* compiled from: Localization.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Text$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Text;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Text> serializer() {
                return LocalizationData$Text$$serializer.INSTANCE;
            }
        }

        private /* synthetic */ Text(String str) {
            this.value = str;
        }

        public final /* synthetic */ String getValue() {
            return this.value;
        }
    }

    /* compiled from: Localization.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Image;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "value", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "constructor-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;)Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "getValue", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "equals", "", "other", "", "equals-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;)I", InAppPurchaseConstants.METHOD_TO_STRING, "", "toString-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;)Ljava/lang/String;", "$serializer", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Serializable
    @JvmInline
    public static final class Image implements LocalizationData {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ThemeImageUrls value;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Image m10672boximpl(ThemeImageUrls themeImageUrls) {
            return new Image(themeImageUrls);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static ThemeImageUrls m10673constructorimpl(ThemeImageUrls value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m10674equalsimpl(ThemeImageUrls themeImageUrls, Object obj) {
            return (obj instanceof Image) && Intrinsics.areEqual(themeImageUrls, ((Image) obj).m10678unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m10675equalsimpl0(ThemeImageUrls themeImageUrls, ThemeImageUrls themeImageUrls2) {
            return Intrinsics.areEqual(themeImageUrls, themeImageUrls2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m10676hashCodeimpl(ThemeImageUrls themeImageUrls) {
            return themeImageUrls.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m10677toStringimpl(ThemeImageUrls themeImageUrls) {
            return "Image(value=" + themeImageUrls + ')';
        }

        public boolean equals(Object obj) {
            return m10674equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m10676hashCodeimpl(this.value);
        }

        public String toString() {
            return m10677toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ ThemeImageUrls m10678unboximpl() {
            return this.value;
        }

        /* compiled from: Localization.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Image$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Image;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Image> serializer() {
                return LocalizationData$Image$$serializer.INSTANCE;
            }
        }

        private /* synthetic */ Image(ThemeImageUrls themeImageUrls) {
            this.value = themeImageUrls;
        }

        public final /* synthetic */ ThemeImageUrls getValue() {
            return this.value;
        }
    }

    /* compiled from: Localization.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Video;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "value", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "constructor-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;)Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "getValue", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "equals", "", "other", "", "equals-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;)I", InAppPurchaseConstants.METHOD_TO_STRING, "", "toString-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;)Ljava/lang/String;", "$serializer", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Serializable
    @JvmInline
    public static final class Video implements LocalizationData {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ThemeVideoUrls value;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Video m10686boximpl(ThemeVideoUrls themeVideoUrls) {
            return new Video(themeVideoUrls);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static ThemeVideoUrls m10687constructorimpl(ThemeVideoUrls value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m10688equalsimpl(ThemeVideoUrls themeVideoUrls, Object obj) {
            return (obj instanceof Video) && Intrinsics.areEqual(themeVideoUrls, ((Video) obj).m10692unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m10689equalsimpl0(ThemeVideoUrls themeVideoUrls, ThemeVideoUrls themeVideoUrls2) {
            return Intrinsics.areEqual(themeVideoUrls, themeVideoUrls2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m10690hashCodeimpl(ThemeVideoUrls themeVideoUrls) {
            return themeVideoUrls.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m10691toStringimpl(ThemeVideoUrls themeVideoUrls) {
            return "Video(value=" + themeVideoUrls + ')';
        }

        public boolean equals(Object obj) {
            return m10688equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m10690hashCodeimpl(this.value);
        }

        public String toString() {
            return m10691toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ ThemeVideoUrls m10692unboximpl() {
            return this.value;
        }

        /* compiled from: Localization.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Video$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Video;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Video> serializer() {
                return LocalizationData$Video$$serializer.INSTANCE;
            }
        }

        private /* synthetic */ Video(ThemeVideoUrls themeVideoUrls) {
            this.value = themeVideoUrls;
        }

        public final /* synthetic */ ThemeVideoUrls getValue() {
            return this.value;
        }
    }
}
