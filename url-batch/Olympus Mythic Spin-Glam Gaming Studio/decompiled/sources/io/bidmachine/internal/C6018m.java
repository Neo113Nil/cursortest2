package io.bidmachine.internal;

import android.location.Location;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.TargetingParams;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.sdk.MaskedSignals;
import io.bidmachine.utils.ProtoSerializerKt;
import io.bidmachine.utils.ProtoUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.bidmachine.internal.m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C6018m {
    public static final C6018m a = new C6018m();

    /* renamed from: io.bidmachine.internal.m$a */
    static final class a extends Lambda implements Function0 {
        final /* synthetic */ Function0 a;
        final /* synthetic */ Context.Geo.Builder b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0, Context.Geo.Builder builder) {
            super(0);
            this.a = function0;
            this.b = builder;
        }

        public final void a() {
            Location location = (Location) this.a.mo4828invoke();
            if (location != null) {
                Context.Geo.Builder builder = this.b;
                builder.setLat((float) location.getLatitude());
                builder.setLon((float) location.getLongitude());
                builder.setAccur((int) location.getAccuracy());
                builder.setLastfix(location.getTime());
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: io.bidmachine.internal.m$b */
    static final class b extends Lambda implements Function0 {
        final /* synthetic */ Function0 a;
        final /* synthetic */ MaskedSignals.Builder b;
        final /* synthetic */ v c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0, MaskedSignals.Builder builder, v vVar) {
            super(0);
            this.a = function0;
            this.b = builder;
            this.c = vVar;
        }

        public final void a() {
            Location location = (Location) this.a.mo4828invoke();
            if (location != null) {
                MaskedSignals.Builder builder = this.b;
                v vVar = this.c;
                builder.setDeviceLat(ProtoUtilsKt.toProtoStringValue(vVar.a(ProtoSerializerKt.protoSerialize((float) location.getLatitude()))));
                builder.setDeviceLon(ProtoUtilsKt.toProtoStringValue(vVar.a(ProtoSerializerKt.protoSerialize((float) location.getLongitude()))));
                builder.setAccuracy(ProtoUtilsKt.toProtoStringValue(vVar.a(ProtoSerializerKt.protoSerialize((int) location.getAccuracy()))));
                builder.setLastfix(ProtoUtilsKt.toProtoStringValue(vVar.a(ProtoSerializerKt.protoSerialize(location.getTime()))));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: io.bidmachine.internal.m$c */
    static final class c extends Lambda implements Function0 {
        final /* synthetic */ TargetingParams.Data a;
        final /* synthetic */ Context.Geo.Builder b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(TargetingParams.Data data, Context.Geo.Builder builder) {
            super(0);
            this.a = data;
            this.b = builder;
        }

        public final void a() {
            String city = this.a.getCity();
            if (city != null) {
                Context.Geo.Builder builder = this.b;
                Intrinsics.checkNotNullExpressionValue(builder, "builder");
                builder.setCity(city);
            }
            String zip = this.a.getZip();
            if (zip != null) {
                Context.Geo.Builder builder2 = this.b;
                Intrinsics.checkNotNullExpressionValue(builder2, "builder");
                builder2.setZip(zip);
            }
            Location deviceLocation = this.a.getDeviceLocation();
            if (deviceLocation != null) {
                Context.Geo.Builder builder3 = this.b;
                builder3.setLat((float) deviceLocation.getLatitude());
                builder3.setLon((float) deviceLocation.getLongitude());
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: io.bidmachine.internal.m$d */
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
            String city = this.a.getCity();
            if (city != null) {
                this.b.setUserCity(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(city))));
            }
            String zip = this.a.getZip();
            if (zip != null) {
                this.b.setUserZip(ProtoUtilsKt.toProtoStringValue(this.c.a(ProtoSerializerKt.protoSerialize(zip))));
            }
            Location deviceLocation = this.a.getDeviceLocation();
            if (deviceLocation != null) {
                MaskedSignals.Builder builder = this.b;
                v vVar = this.c;
                builder.setUserLat(ProtoUtilsKt.toProtoStringValue(vVar.a(ProtoSerializerKt.protoSerialize((float) deviceLocation.getLatitude()))));
                builder.setUserLon(ProtoUtilsKt.toProtoStringValue(vVar.a(ProtoSerializerKt.protoSerialize((float) deviceLocation.getLongitude()))));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    private C6018m() {
    }

    public static final Context.Geo.Builder a(MaskedSignals.Builder maskedSignalsBuilder, w privacyGroupRestrictions, v privacyDataMasker, Function0 locationProvider) {
        Intrinsics.checkNotNullParameter(maskedSignalsBuilder, "maskedSignalsBuilder");
        Intrinsics.checkNotNullParameter(privacyGroupRestrictions, "privacyGroupRestrictions");
        Intrinsics.checkNotNullParameter(privacyDataMasker, "privacyDataMasker");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Context.Geo.Builder builder = Context.Geo.newBuilder();
        builder.setUtcoffset(Utils.getUtcOffsetMinutes());
        privacyGroupRestrictions.d(new a(locationProvider, builder), new b(locationProvider, maskedSignalsBuilder, privacyDataMasker));
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        return builder;
    }

    public final Context.Geo.Builder a(TargetingParams.Data data, MaskedSignals.Builder maskedSignalsBuilder, w privacyGroupRestrictions, v privacyDataMasker) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(maskedSignalsBuilder, "maskedSignalsBuilder");
        Intrinsics.checkNotNullParameter(privacyGroupRestrictions, "privacyGroupRestrictions");
        Intrinsics.checkNotNullParameter(privacyDataMasker, "privacyDataMasker");
        Context.Geo.Builder builder = Context.Geo.newBuilder();
        String country = data.getCountry();
        if (country != null) {
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            builder.setCountry(country);
        }
        privacyGroupRestrictions.d(new c(data, builder), new d(data, maskedSignalsBuilder, privacyDataMasker));
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        return builder;
    }
}
