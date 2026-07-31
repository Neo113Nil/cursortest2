package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes5.dex */
public final class g implements GeneratedSerializer {
    public static final g a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        g gVar = new g();
        a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.AdUnit", gVar, 30);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("ad_type", true);
        pluginGeneratedSerialDescriptor.addElement("ad_source", true);
        pluginGeneratedSerialDescriptor.addElement("expiry", true);
        pluginGeneratedSerialDescriptor.addElement("expiry_duration", true);
        pluginGeneratedSerialDescriptor.addElement("deeplink_url", true);
        pluginGeneratedSerialDescriptor.addElement("click_coordinates_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("ad_load_optimization", true);
        pluginGeneratedSerialDescriptor.addElement("mediation_name", true);
        pluginGeneratedSerialDescriptor.addElement("info", true);
        pluginGeneratedSerialDescriptor.addElement("sleep", true);
        pluginGeneratedSerialDescriptor.addElement("error_code", true);
        pluginGeneratedSerialDescriptor.addElement("tpat", true);
        pluginGeneratedSerialDescriptor.addElement("vm_url", true);
        pluginGeneratedSerialDescriptor.addElement("vm_version", true);
        pluginGeneratedSerialDescriptor.addElement("ad_market_id", true);
        pluginGeneratedSerialDescriptor.addElement("notification", true);
        pluginGeneratedSerialDescriptor.addElement("load_ad", true);
        pluginGeneratedSerialDescriptor.addElement("viewability", true);
        pluginGeneratedSerialDescriptor.addElement("template_type", true);
        pluginGeneratedSerialDescriptor.addElement("template_settings", true);
        pluginGeneratedSerialDescriptor.addElement("creative_id", true);
        pluginGeneratedSerialDescriptor.addElement("app_id", true);
        pluginGeneratedSerialDescriptor.addElement("show_close", true);
        pluginGeneratedSerialDescriptor.addElement("show_close_incentivized", true);
        pluginGeneratedSerialDescriptor.addElement("ad_size", true);
        pluginGeneratedSerialDescriptor.addElement("webview_settings", true);
        pluginGeneratedSerialDescriptor.addElement("use_preloading", true);
        pluginGeneratedSerialDescriptor.addElement("ad_partial_download_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("max_download_retry_attempts", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(w.a), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(new ArrayListSerializer(stringSerializer)), BuiltinSerializersKt.getNullable(new ArrayListSerializer(stringSerializer)), BuiltinSerializersKt.getNullable(x.a), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(t.a), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(d.a), BuiltinSerializersKt.getNullable(d0.a), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r80) {
        /*
            Method dump skipped, instructions count: 2378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.model.g.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        i value = (i) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        i.a(value, beginStructure, pluginGeneratedSerialDescriptor);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
