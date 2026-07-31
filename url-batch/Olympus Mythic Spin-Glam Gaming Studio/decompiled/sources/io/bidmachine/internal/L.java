package io.bidmachine.internal;

import com.explorestack.protobuf.adcom.Context;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.ExternalUserId;
import io.bidmachine.TargetingParams;
import io.bidmachine.protobuf.sdk.MaskedSignals;
import io.bidmachine.utils.Gender;
import io.bidmachine.utils.ProtoSerializerKt;
import io.bidmachine.utils.ProtoUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class L {
    public static final L a = new L();

    static final class a extends Lambda implements Function0 {
        final /* synthetic */ TargetingParams.Data a;
        final /* synthetic */ Context.User.Builder b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TargetingParams.Data data, Context.User.Builder builder) {
            super(0);
            this.a = data;
            this.b = builder;
        }

        public final void a() {
            String userId = this.a.getUserId();
            if (userId != null) {
                this.b.setId(userId);
            }
            Context.Data.Builder a = L.a.a(this.a.getExternalUserIdList());
            if (a != null) {
                this.b.addData(a.build());
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    static final class b extends Lambda implements Function0 {
        final /* synthetic */ TargetingParams.Data a;
        final /* synthetic */ MaskedSignals.Builder b;
        final /* synthetic */ v c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(TargetingParams.Data data, MaskedSignals.Builder builder, v vVar) {
            super(0);
            this.a = data;
            this.b = builder;
            this.c = vVar;
        }

        public final void a() {
            String userId = this.a.getUserId();
            if (userId != null) {
                this.b.setUserId(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(userId))));
            }
            List<ExternalUserId> externalUserIdList = this.a.getExternalUserIdList();
            if (externalUserIdList != null) {
                MaskedSignals.Builder builder = this.b;
                v vVar = this.c;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(externalUserIdList, 10));
                for (ExternalUserId externalUserId : externalUserIdList) {
                    arrayList.add(MapsKt.mapOf(TuplesKt.to("id", externalUserId.getSourceId()), TuplesKt.to("value", externalUserId.getValue())));
                }
                builder.setExternalUserIds(ProtoUtilsKt.toProtoStringValue(vVar.a(ProtoSerializerKt.protoSerialize(arrayList))));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    static final class c extends Lambda implements Function0 {
        final /* synthetic */ TargetingParams.Data a;
        final /* synthetic */ Context.User.Builder b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(TargetingParams.Data data, Context.User.Builder builder) {
            super(0);
            this.a = data;
            this.b = builder;
        }

        public final void a() {
            Integer birthdayYear = this.a.getBirthdayYear();
            if (birthdayYear != null) {
                this.b.setYob(birthdayYear.intValue());
            }
            Gender gender = this.a.getGender();
            if (gender != null) {
                this.b.setGender(gender.getOrtbValue());
            }
            String b = L.a.b(this.a.getKeywords());
            if (b != null) {
                this.b.setKeywords(b);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    static final class d extends Lambda implements Function0 {
        final /* synthetic */ TargetingParams.Data a;
        final /* synthetic */ MaskedSignals.Builder b;
        final /* synthetic */ v c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(TargetingParams.Data data, MaskedSignals.Builder builder, v vVar) {
            super(0);
            this.a = data;
            this.b = builder;
            this.c = vVar;
        }

        public final void a() {
            Integer birthdayYear = this.a.getBirthdayYear();
            if (birthdayYear != null) {
                this.b.setYob(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(birthdayYear.intValue()))));
            }
            Gender gender = this.a.getGender();
            if (gender != null) {
                MaskedSignals.Builder builder = this.b;
                v vVar = this.c;
                String ortbValue = gender.getOrtbValue();
                Intrinsics.checkNotNullExpressionValue(ortbValue, "it.ortbValue");
                builder.setGender(ProtoUtilsKt.toProtoStringValue(vVar.a(ProtoSerializerKt.protoSerialize(ortbValue))));
            }
            String b = L.a.b(this.a.getKeywords());
            if (b != null) {
                this.b.setKeywords(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(b))));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    private L() {
    }

    public static final void a(TargetingParams params, Context.User.Builder builder, MaskedSignals.Builder maskedSignalsBuilder, w privacyGroupRestrictions, v privacyDataMasker) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(maskedSignalsBuilder, "maskedSignalsBuilder");
        Intrinsics.checkNotNullParameter(privacyGroupRestrictions, "privacyGroupRestrictions");
        Intrinsics.checkNotNullParameter(privacyDataMasker, "privacyDataMasker");
        a.a(params.getData(), builder, maskedSignalsBuilder, privacyGroupRestrictions, privacyDataMasker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return CollectionsKt.joinToString$default(list, StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }

    private final void a(TargetingParams.Data data, Context.User.Builder builder, MaskedSignals.Builder builder2, w wVar, v vVar) {
        w.a(wVar, new a(data, builder), new b(data, builder2, vVar), null, 4, null);
        wVar.a(new c(data, builder), new d(data, builder2, vVar));
        builder.setGeo(C6018m.a.a(data, builder2, wVar, vVar).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context.Data.Builder a(List list) {
        Object m8023constructorimpl;
        Object m8023constructorimpl2;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Context.Data.Builder id = Context.Data.newBuilder().setId("external_user_ids");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ExternalUserId externalUserId = (ExternalUserId) it.next();
            try {
                Result.Companion companion = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(externalUserId.getSourceId());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                m8023constructorimpl = null;
            }
            String str = (String) m8023constructorimpl;
            try {
                m8023constructorimpl2 = Result.m8023constructorimpl(externalUserId.getValue());
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m8028isFailureimpl(m8023constructorimpl2)) {
                m8023constructorimpl2 = null;
            }
            String str2 = (String) m8023constructorimpl2;
            if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                id.addSegment(Context.Data.Segment.newBuilder().setId(str).setValue(str2));
            }
        }
        return id;
    }
}
