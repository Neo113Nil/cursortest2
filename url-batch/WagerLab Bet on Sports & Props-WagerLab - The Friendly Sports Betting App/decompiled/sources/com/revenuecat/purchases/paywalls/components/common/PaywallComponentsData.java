package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: PaywallComponentsData.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\u00020\u0001:\u00029:B\u0093\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\"\b\u0001\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017Bk\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0018J&\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207HÁ\u0001¢\u0006\u0002\b8R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001fR4\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\"R$\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010&\u0012\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010%R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010)R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010%R\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "", "seen1", "", "templateName", "", "assetBaseURL", "Ljava/net/URL;", "componentsConfig", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;", "componentsLocalizations", "", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "defaultLocaleIdentifier", "revision", "zeroDecimalPlaceCountries", "", "exitOffers", "Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;Ljava/util/Map;Ljava/lang/String;ILjava/util/List;Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;Ljava/util/Map;Ljava/lang/String;ILjava/util/List;Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAssetBaseURL$annotations", "()V", "getAssetBaseURL", "()Ljava/net/URL;", "getComponentsConfig$annotations", "getComponentsConfig", "()Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;", "getComponentsLocalizations$annotations", "getComponentsLocalizations", "()Ljava/util/Map;", "getDefaultLocaleIdentifier-uqtKvyA$annotations", "getDefaultLocaleIdentifier-uqtKvyA", "()Ljava/lang/String;", "Ljava/lang/String;", "getExitOffers$annotations", "getExitOffers", "()Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers;", "getRevision", "()I", "getTemplateName$annotations", "getTemplateName", "getZeroDecimalPlaceCountries$annotations", "getZeroDecimalPlaceCountries", "()Ljava/util/List;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$purchases_defaultsBc8Release", "$serializer", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final class PaywallComponentsData {
    private final URL assetBaseURL;
    private final ComponentsConfig componentsConfig;
    private final Map<LocaleId, Map<LocalizationKey, LocalizationData>> componentsLocalizations;
    private final String defaultLocaleIdentifier;
    private final ExitOffers exitOffers;
    private final int revision;
    private final String templateName;
    private final List<String> zeroDecimalPlaceCountries;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new LinkedHashMapSerializer(LocaleId$$serializer.INSTANCE, new LinkedHashMapSerializer(LocalizationKey$$serializer.INSTANCE, LocalizationDataSerializer.INSTANCE)), null, null, null, null};

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PaywallComponentsData(int i, @SerialName("template_name") String str, @SerialName("asset_base_url") @Serializable(with = URLSerializer.class) URL url, @SerialName("components_config") ComponentsConfig componentsConfig, @SerialName("components_localizations") Map map, @SerialName("default_locale") String str2, int i2, @SerialName("zero_decimal_place_countries") @Serializable(with = GoogleListSerializer.class) List list, @SerialName("exit_offers") ExitOffers exitOffers, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, url, componentsConfig, (Map<LocaleId, ? extends Map<LocalizationKey, ? extends LocalizationData>>) map, str2, i2, (List<String>) list, exitOffers, serializationConstructorMarker);
    }

    public /* synthetic */ PaywallComponentsData(String str, URL url, ComponentsConfig componentsConfig, Map map, String str2, int i, List list, ExitOffers exitOffers, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, url, componentsConfig, map, str2, i, list, exitOffers);
    }

    @SerialName("asset_base_url")
    @Serializable(with = URLSerializer.class)
    public static /* synthetic */ void getAssetBaseURL$annotations() {
    }

    @SerialName("components_config")
    public static /* synthetic */ void getComponentsConfig$annotations() {
    }

    @SerialName("components_localizations")
    public static /* synthetic */ void getComponentsLocalizations$annotations() {
    }

    @SerialName("default_locale")
    /* renamed from: getDefaultLocaleIdentifier-uqtKvyA$annotations, reason: not valid java name */
    public static /* synthetic */ void m10702getDefaultLocaleIdentifieruqtKvyA$annotations() {
    }

    @SerialName("exit_offers")
    public static /* synthetic */ void getExitOffers$annotations() {
    }

    @SerialName("template_name")
    public static /* synthetic */ void getTemplateName$annotations() {
    }

    @SerialName("zero_decimal_place_countries")
    @Serializable(with = GoogleListSerializer.class)
    public static /* synthetic */ void getZeroDecimalPlaceCountries$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallComponentsData)) {
            return false;
        }
        PaywallComponentsData paywallComponentsData = (PaywallComponentsData) obj;
        return Intrinsics.areEqual(this.templateName, paywallComponentsData.templateName) && Intrinsics.areEqual(this.assetBaseURL, paywallComponentsData.assetBaseURL) && Intrinsics.areEqual(this.componentsConfig, paywallComponentsData.componentsConfig) && Intrinsics.areEqual(this.componentsLocalizations, paywallComponentsData.componentsLocalizations) && LocaleId.m10660equalsimpl0(this.defaultLocaleIdentifier, paywallComponentsData.defaultLocaleIdentifier) && this.revision == paywallComponentsData.revision && Intrinsics.areEqual(this.zeroDecimalPlaceCountries, paywallComponentsData.zeroDecimalPlaceCountries) && Intrinsics.areEqual(this.exitOffers, paywallComponentsData.exitOffers);
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.templateName.hashCode() * 31) + this.assetBaseURL.hashCode()) * 31) + this.componentsConfig.hashCode()) * 31) + this.componentsLocalizations.hashCode()) * 31) + LocaleId.m10661hashCodeimpl(this.defaultLocaleIdentifier)) * 31) + this.revision) * 31) + this.zeroDecimalPlaceCountries.hashCode()) * 31;
        ExitOffers exitOffers = this.exitOffers;
        return hashCode + (exitOffers == null ? 0 : exitOffers.hashCode());
    }

    public String toString() {
        return "PaywallComponentsData(templateName=" + this.templateName + ", assetBaseURL=" + this.assetBaseURL + ", componentsConfig=" + this.componentsConfig + ", componentsLocalizations=" + this.componentsLocalizations + ", defaultLocaleIdentifier=" + ((Object) LocaleId.m10662toStringimpl(this.defaultLocaleIdentifier)) + ", revision=" + this.revision + ", zeroDecimalPlaceCountries=" + this.zeroDecimalPlaceCountries + ", exitOffers=" + this.exitOffers + ')';
    }

    /* compiled from: PaywallComponentsData.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PaywallComponentsData> serializer() {
            return PaywallComponentsData$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PaywallComponentsData(int i, String str, URL url, ComponentsConfig componentsConfig, Map<LocaleId, ? extends Map<LocalizationKey, ? extends LocalizationData>> map, String str2, int i2, List<String> list, ExitOffers exitOffers, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, PaywallComponentsData$$serializer.INSTANCE.getDescriptor());
        }
        this.templateName = str;
        this.assetBaseURL = url;
        this.componentsConfig = componentsConfig;
        this.componentsLocalizations = map;
        this.defaultLocaleIdentifier = str2;
        if ((i & 32) == 0) {
            this.revision = 0;
        } else {
            this.revision = i2;
        }
        if ((i & 64) == 0) {
            this.zeroDecimalPlaceCountries = CollectionsKt.emptyList();
        } else {
            this.zeroDecimalPlaceCountries = list;
        }
        if ((i & 128) == 0) {
            this.exitOffers = null;
        } else {
            this.exitOffers = exitOffers;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PaywallComponentsData(String templateName, URL assetBaseURL, ComponentsConfig componentsConfig, Map<LocaleId, ? extends Map<LocalizationKey, ? extends LocalizationData>> componentsLocalizations, String defaultLocaleIdentifier, int i, List<String> zeroDecimalPlaceCountries, ExitOffers exitOffers) {
        Intrinsics.checkNotNullParameter(templateName, "templateName");
        Intrinsics.checkNotNullParameter(assetBaseURL, "assetBaseURL");
        Intrinsics.checkNotNullParameter(componentsConfig, "componentsConfig");
        Intrinsics.checkNotNullParameter(componentsLocalizations, "componentsLocalizations");
        Intrinsics.checkNotNullParameter(defaultLocaleIdentifier, "defaultLocaleIdentifier");
        Intrinsics.checkNotNullParameter(zeroDecimalPlaceCountries, "zeroDecimalPlaceCountries");
        this.templateName = templateName;
        this.assetBaseURL = assetBaseURL;
        this.componentsConfig = componentsConfig;
        this.componentsLocalizations = componentsLocalizations;
        this.defaultLocaleIdentifier = defaultLocaleIdentifier;
        this.revision = i;
        this.zeroDecimalPlaceCountries = zeroDecimalPlaceCountries;
        this.exitOffers = exitOffers;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PaywallComponentsData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.templateName);
        output.encodeSerializableElement(serialDesc, 1, URLSerializer.INSTANCE, self.assetBaseURL);
        output.encodeSerializableElement(serialDesc, 2, ComponentsConfig$$serializer.INSTANCE, self.componentsConfig);
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.componentsLocalizations);
        output.encodeSerializableElement(serialDesc, 4, LocaleId$$serializer.INSTANCE, LocaleId.m10657boximpl(self.defaultLocaleIdentifier));
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.revision != 0) {
            output.encodeIntElement(serialDesc, 5, self.revision);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !Intrinsics.areEqual(self.zeroDecimalPlaceCountries, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 6, GoogleListSerializer.INSTANCE, self.zeroDecimalPlaceCountries);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.exitOffers == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, ExitOffers$$serializer.INSTANCE, self.exitOffers);
    }

    public final /* synthetic */ String getTemplateName() {
        return this.templateName;
    }

    public final /* synthetic */ URL getAssetBaseURL() {
        return this.assetBaseURL;
    }

    public final /* synthetic */ ComponentsConfig getComponentsConfig() {
        return this.componentsConfig;
    }

    public final /* synthetic */ Map getComponentsLocalizations() {
        return this.componentsLocalizations;
    }

    /* renamed from: getDefaultLocaleIdentifier-uqtKvyA, reason: not valid java name and from getter */
    public final /* synthetic */ String getDefaultLocaleIdentifier() {
        return this.defaultLocaleIdentifier;
    }

    public final /* synthetic */ int getRevision() {
        return this.revision;
    }

    public /* synthetic */ PaywallComponentsData(String str, URL url, ComponentsConfig componentsConfig, Map map, String str2, int i, List list, ExitOffers exitOffers, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, url, componentsConfig, map, str2, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? CollectionsKt.emptyList() : list, (i2 & 128) != 0 ? null : exitOffers, null);
    }

    public final /* synthetic */ List getZeroDecimalPlaceCountries() {
        return this.zeroDecimalPlaceCountries;
    }

    public final /* synthetic */ ExitOffers getExitOffers() {
        return this.exitOffers;
    }
}
