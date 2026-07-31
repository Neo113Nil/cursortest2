package com.unity3d.ads.datastore;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ByteStringStoreKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/datastore/ByteStringStoreKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ByteStringStoreKt {

    @NotNull
    public static final ByteStringStoreKt INSTANCE = new ByteStringStoreKt();

    private ByteStringStoreKt() {
    }

    /* compiled from: ByteStringStoreKt.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/datastore/ByteStringStoreKt$Dsl;", "", "_builder", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore$Builder;", "<init>", "(Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore$Builder;)V", "_build", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "value", "Lcom/google/protobuf/ByteString;", "data", "getData", "()Lcom/google/protobuf/ByteString;", "setData", "(Lcom/google/protobuf/ByteString;)V", "clearData", "", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final ByteStringStoreOuterClass.ByteStringStore.Builder _builder;

        public /* synthetic */ Dsl(ByteStringStoreOuterClass.ByteStringStore.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(ByteStringStoreOuterClass.ByteStringStore.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: ByteStringStoreKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/datastore/ByteStringStoreKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/unity3d/ads/datastore/ByteStringStoreKt$Dsl;", "builder", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(ByteStringStoreOuterClass.ByteStringStore.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ ByteStringStoreOuterClass.ByteStringStore _build() {
            ByteStringStoreOuterClass.ByteStringStore build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        @NotNull
        public final ByteString getData() {
            ByteString data = this._builder.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            return data;
        }

        public final void setData(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setData(value);
        }

        public final void clearData() {
            this._builder.clearData();
        }
    }
}
