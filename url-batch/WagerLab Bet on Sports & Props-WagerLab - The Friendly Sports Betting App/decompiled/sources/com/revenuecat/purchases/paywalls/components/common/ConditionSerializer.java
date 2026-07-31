package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.utils.serializers.SealedDeserializerWithDefault;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* compiled from: ComponentOverride.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer;", "Lcom/revenuecat/purchases/utils/serializers/SealedDeserializerWithDefault;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "()V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConditionSerializer extends SealedDeserializerWithDefault<ComponentOverride.Condition> {
    public static final ConditionSerializer INSTANCE = new ConditionSerializer();

    private ConditionSerializer() {
        super("Condition", MapsKt.mapOf(TuplesKt.to("compact", new Function0<KSerializer<ComponentOverride.Condition.Compact>>() { // from class: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<ComponentOverride.Condition.Compact> invoke() {
                return ComponentOverride.Condition.Compact.INSTANCE.serializer();
            }
        }), TuplesKt.to("medium", new Function0<KSerializer<ComponentOverride.Condition.Medium>>() { // from class: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.2
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<ComponentOverride.Condition.Medium> invoke() {
                return ComponentOverride.Condition.Medium.INSTANCE.serializer();
            }
        }), TuplesKt.to("expanded", new Function0<KSerializer<ComponentOverride.Condition.Expanded>>() { // from class: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.3
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<ComponentOverride.Condition.Expanded> invoke() {
                return ComponentOverride.Condition.Expanded.INSTANCE.serializer();
            }
        }), TuplesKt.to("intro_offer", new Function0<KSerializer<ComponentOverride.Condition.IntroOffer>>() { // from class: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.4
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<ComponentOverride.Condition.IntroOffer> invoke() {
                return ComponentOverride.Condition.IntroOffer.INSTANCE.serializer();
            }
        }), TuplesKt.to("multiple_intro_offers", new Function0<KSerializer<ComponentOverride.Condition.MultipleIntroOffers>>() { // from class: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.5
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<ComponentOverride.Condition.MultipleIntroOffers> invoke() {
                return ComponentOverride.Condition.MultipleIntroOffers.INSTANCE.serializer();
            }
        }), TuplesKt.to("selected", new Function0<KSerializer<ComponentOverride.Condition.Selected>>() { // from class: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.6
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<ComponentOverride.Condition.Selected> invoke() {
                return ComponentOverride.Condition.Selected.INSTANCE.serializer();
            }
        })), new Function1<String, ComponentOverride.Condition>() { // from class: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer.7
            @Override // kotlin.jvm.functions.Function1
            public final ComponentOverride.Condition invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ComponentOverride.Condition.Unsupported.INSTANCE;
            }
        }, null, 8, null);
    }
}
