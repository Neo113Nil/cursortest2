package io.bidmachine.internal;

import com.explorestack.protobuf.BoolValue;
import com.explorestack.protobuf.StringValue;
import io.bidmachine.protobuf.sdk.MaskedSignals;
import io.bidmachine.protobuf.sdk.Regs;
import io.bidmachine.protobuf.sdk.RestrictionKind;
import io.bidmachine.utils.ProtoUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class B {
    public static final B a = new B();

    private B() {
    }

    public static final void a(Regs.Builder regsBuilder, MaskedSignals.Builder maskedSignalsBuilder, C6025u privacyContext) {
        Intrinsics.checkNotNullParameter(regsBuilder, "regsBuilder");
        Intrinsics.checkNotNullParameter(maskedSignalsBuilder, "maskedSignalsBuilder");
        Intrinsics.checkNotNullParameter(privacyContext, "privacyContext");
        B b = a;
        regsBuilder.setPub(b.a(privacyContext.f()));
        regsBuilder.setCmp(b.a(privacyContext.b()));
        regsBuilder.setPersistedMode(F.a(privacyContext.e()));
        regsBuilder.setMaskedSignals(maskedSignalsBuilder);
        List g = privacyContext.g();
        if (g.isEmpty()) {
            g = null;
        }
        if (g != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(g, 10));
            Iterator it = g.iterator();
            while (it.hasNext()) {
                arrayList.add(D.a((C) it.next()));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                regsBuilder.addRestrictionKinds((RestrictionKind) it2.next());
            }
        }
    }

    public final Regs.Pub.Builder a(A publisherPrivacySettings) {
        BoolValue protoBooleanValue;
        StringValue protoStringValue;
        StringValue protoStringValue2;
        BoolValue protoBooleanValue2;
        BoolValue protoBooleanValue3;
        BoolValue protoBooleanValue4;
        StringValue protoStringValue3;
        Intrinsics.checkNotNullParameter(publisherPrivacySettings, "publisherPrivacySettings");
        Regs.Pub.Builder builder = Regs.Pub.newBuilder();
        String d = publisherPrivacySettings.d();
        if (d != null && (protoStringValue3 = ProtoUtilsKt.toProtoStringValue(d)) != null) {
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.setConsentString(protoStringValue3);
        }
        Boolean h = publisherPrivacySettings.h();
        if (h != null && (protoBooleanValue4 = ProtoUtilsKt.toProtoBooleanValue(h.booleanValue())) != null) {
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.setGdprZone(protoBooleanValue4);
        }
        Boolean b = publisherPrivacySettings.b();
        if (b != null && (protoBooleanValue3 = ProtoUtilsKt.toProtoBooleanValue(b.booleanValue())) != null) {
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.setGdprConsent(protoBooleanValue3);
        }
        Boolean c = publisherPrivacySettings.c();
        if (c != null && (protoBooleanValue2 = ProtoUtilsKt.toProtoBooleanValue(c.booleanValue())) != null) {
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.setCoppa(protoBooleanValue2);
        }
        String a2 = publisherPrivacySettings.a();
        if (a2 != null && (protoStringValue2 = ProtoUtilsKt.toProtoStringValue(a2)) != null) {
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.setCcpa(protoStringValue2);
        }
        String f = publisherPrivacySettings.f();
        if (f != null && (protoStringValue = ProtoUtilsKt.toProtoStringValue(f)) != null) {
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.setGpp(protoStringValue);
        }
        Boolean g = publisherPrivacySettings.g();
        if (g != null && (protoBooleanValue = ProtoUtilsKt.toProtoBooleanValue(g.booleanValue())) != null) {
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.setNonPersonalized(protoBooleanValue);
        }
        List e = publisherPrivacySettings.e();
        if (e != null) {
            if (e.isEmpty()) {
                e = null;
            }
            if (e != null) {
                Iterator it = e.iterator();
                while (it.hasNext()) {
                    builder.addGppSid(((Number) it.next()).intValue());
                }
            }
        }
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        return builder;
    }

    public final Regs.CMP.Builder a(C6024t platformPrivacySettings) {
        StringValue protoStringValue;
        StringValue protoStringValue2;
        BoolValue protoBooleanValue;
        StringValue protoStringValue3;
        BoolValue protoBooleanValue2;
        StringValue protoStringValue4;
        Intrinsics.checkNotNullParameter(platformPrivacySettings, "platformPrivacySettings");
        Regs.CMP.Builder builder = Regs.CMP.newBuilder();
        String e = platformPrivacySettings.e();
        if (e != null && (protoStringValue4 = ProtoUtilsKt.toProtoStringValue(e)) != null) {
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.setTcfV1String(protoStringValue4);
        }
        Boolean f = platformPrivacySettings.f();
        if (f != null && (protoBooleanValue2 = ProtoUtilsKt.toProtoBooleanValue(f.booleanValue())) != null) {
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.setTcfV1Zone(protoBooleanValue2);
        }
        String g = platformPrivacySettings.g();
        if (g != null && (protoStringValue3 = ProtoUtilsKt.toProtoStringValue(g)) != null) {
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.setTcfV2String(protoStringValue3);
        }
        Boolean h = platformPrivacySettings.h();
        if (h != null && (protoBooleanValue = ProtoUtilsKt.toProtoBooleanValue(h.booleanValue())) != null) {
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.setTcfV2Zone(protoBooleanValue);
        }
        String a2 = platformPrivacySettings.a();
        if (a2 != null && (protoStringValue2 = ProtoUtilsKt.toProtoStringValue(a2)) != null) {
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.setCcpa(protoStringValue2);
        }
        String c = platformPrivacySettings.c();
        if (c != null && (protoStringValue = ProtoUtilsKt.toProtoStringValue(c)) != null) {
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.setGpp(protoStringValue);
        }
        List b = platformPrivacySettings.b();
        if (b != null) {
            if (b.isEmpty()) {
                b = null;
            }
            if (b != null) {
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    builder.addGppSid(((Number) it.next()).intValue());
                }
            }
        }
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        return builder;
    }
}
