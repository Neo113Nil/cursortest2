package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.safedk.android.analytics.brandsafety.m;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TransactionEventRequestKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TransactionEventRequestKt {

    @NotNull
    public static final TransactionEventRequestKt INSTANCE = new TransactionEventRequestKt();

    private TransactionEventRequestKt() {
    }

    /* compiled from: TransactionEventRequestKt.kt */
    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 c2\u00020\u0001:\u0002cdB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010'\u001a\u00020\u0010J\u0006\u0010.\u001a\u00020\u0010J%\u00105\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000202002\u0006\u0010\b\u001a\u000201H\u0007¢\u0006\u0002\b6J&\u00107\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000202002\u0006\u0010\b\u001a\u000201H\u0087\n¢\u0006\u0002\b8J+\u00109\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000202002\f\u0010:\u001a\b\u0012\u0004\u0012\u0002010;H\u0007¢\u0006\u0002\b<J,\u00107\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000202002\f\u0010:\u001a\b\u0012\u0004\u0012\u0002010;H\u0087\n¢\u0006\u0002\b=J.\u0010>\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000202002\u0006\u0010?\u001a\u00020!2\u0006\u0010\b\u001a\u000201H\u0087\u0002¢\u0006\u0002\b@J\u001d\u0010A\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020200H\u0007¢\u0006\u0002\bBJ\u0006\u0010L\u001a\u00020\u0010J\u0006\u0010V\u001a\u00020\u0010J\u0006\u0010Z\u001a\u00020\u0010J\u0006\u0010a\u001a\u00020\u0010J\u0006\u0010b\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u00020!2\u0006\u0010\b\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010)\u001a\u00020(2\u0006\u0010\b\u001a\u00020(8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001d\u0010/\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000202008F¢\u0006\u0006\u001a\u0004\b3\u00104R$\u0010D\u001a\u00020C2\u0006\u0010\b\u001a\u00020C8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010I\u001a\u00020!2\u0006\u0010\b\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010$\"\u0004\bK\u0010&R$\u0010N\u001a\u00020M2\u0006\u0010\b\u001a\u00020M8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010S\u001a\u00020!2\u0006\u0010\b\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010$\"\u0004\bU\u0010&R$\u0010W\u001a\u00020(2\u0006\u0010\b\u001a\u00020(8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010+\"\u0004\bY\u0010-R$\u0010\\\u001a\u00020[2\u0006\u0010\b\u001a\u00020[8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`¨\u0006e"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest$Builder;", "<init>", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest$Builder;)V", "_build", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "value", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfo", "getStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", "clearStaticDeviceInfo", "", "hasStaticDeviceInfo", "", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfo", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", "clearDynamicDeviceInfo", "hasDynamicDeviceInfo", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreType;", "appStore", "getAppStore", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreType;", "setAppStore", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreType;)V", "", "appStoreValue", "getAppStoreValue", "()I", "setAppStoreValue", "(I)V", "clearAppStore", "", "customStore", "getCustomStore", "()Ljava/lang/String;", "setCustomStore", "(Ljava/lang/String;)V", "clearCustomStore", "transactionData", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl$TransactionDataProxy;", "getTransactionData", "()Lcom/google/protobuf/kotlin/DslList;", m.l, "addTransactionData", "plusAssign", "plusAssignTransactionData", "addAll", "values", "", "addAllTransactionData", "plusAssignAllTransactionData", "set", "index", "setTransactionData", "clear", "clearTransactionData", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;", "origin", "getOrigin", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;", "setOrigin", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;)V", "originValue", "getOriginValue", "setOriginValue", "clearOrigin", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreKitVersion;", "storeKitVersion", "getStoreKitVersion", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreKitVersion;", "setStoreKitVersion", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$StoreKitVersion;)V", "storeKitVersionValue", "getStoreKitVersionValue", "setStoreKitVersionValue", "clearStoreKitVersion", "googlePlayBillingLibraryVersion", "getGooglePlayBillingLibraryVersion", "setGooglePlayBillingLibraryVersion", "clearGooglePlayBillingLibraryVersion", "Lcom/google/protobuf/ByteString;", "receipt", "getReceipt", "()Lcom/google/protobuf/ByteString;", "setReceipt", "(Lcom/google/protobuf/ByteString;)V", "clearReceipt", "hasReceipt", "Companion", "TransactionDataProxy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final TransactionEventRequestOuterClass.TransactionEventRequest.Builder _builder;

        public /* synthetic */ Dsl(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: TransactionEventRequestKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionEventRequest _build() {
            TransactionEventRequestOuterClass.TransactionEventRequest build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        @NotNull
        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            Intrinsics.checkNotNullExpressionValue(staticDeviceInfo, "getStaticDeviceInfo(...)");
            return staticDeviceInfo;
        }

        public final void setStaticDeviceInfo(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        @NotNull
        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            Intrinsics.checkNotNullExpressionValue(dynamicDeviceInfo, "getDynamicDeviceInfo(...)");
            return dynamicDeviceInfo;
        }

        public final void setDynamicDeviceInfo(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        @NotNull
        public final TransactionEventRequestOuterClass.StoreType getAppStore() {
            TransactionEventRequestOuterClass.StoreType appStore = this._builder.getAppStore();
            Intrinsics.checkNotNullExpressionValue(appStore, "getAppStore(...)");
            return appStore;
        }

        public final void setAppStore(@NotNull TransactionEventRequestOuterClass.StoreType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAppStore(value);
        }

        public final int getAppStoreValue() {
            return this._builder.getAppStoreValue();
        }

        public final void setAppStoreValue(int i) {
            this._builder.setAppStoreValue(i);
        }

        public final void clearAppStore() {
            this._builder.clearAppStore();
        }

        @NotNull
        public final String getCustomStore() {
            String customStore = this._builder.getCustomStore();
            Intrinsics.checkNotNullExpressionValue(customStore, "getCustomStore(...)");
            return customStore;
        }

        public final void setCustomStore(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCustomStore(value);
        }

        public final void clearCustomStore() {
            this._builder.clearCustomStore();
        }

        /* compiled from: TransactionEventRequestKt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/TransactionEventRequestKt$Dsl$TransactionDataProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class TransactionDataProxy extends DslProxy {
            private TransactionDataProxy() {
            }
        }

        public final /* synthetic */ DslList getTransactionData() {
            List<TransactionEventRequestOuterClass.TransactionData> transactionDataList = this._builder.getTransactionDataList();
            Intrinsics.checkNotNullExpressionValue(transactionDataList, "getTransactionDataList(...)");
            return new DslList(transactionDataList);
        }

        public final /* synthetic */ void addTransactionData(DslList dslList, TransactionEventRequestOuterClass.TransactionData value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addTransactionData(value);
        }

        public final /* synthetic */ void plusAssignTransactionData(DslList<TransactionEventRequestOuterClass.TransactionData, TransactionDataProxy> dslList, TransactionEventRequestOuterClass.TransactionData value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addTransactionData(dslList, value);
        }

        public final /* synthetic */ void addAllTransactionData(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllTransactionData(values);
        }

        public final /* synthetic */ void plusAssignAllTransactionData(DslList<TransactionEventRequestOuterClass.TransactionData, TransactionDataProxy> dslList, Iterable<TransactionEventRequestOuterClass.TransactionData> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllTransactionData(dslList, values);
        }

        public final /* synthetic */ void setTransactionData(DslList dslList, int i, TransactionEventRequestOuterClass.TransactionData value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTransactionData(i, value);
        }

        public final /* synthetic */ void clearTransactionData(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearTransactionData();
        }

        @NotNull
        public final TransactionEventRequestOuterClass.TransactionOrigin getOrigin() {
            TransactionEventRequestOuterClass.TransactionOrigin origin = this._builder.getOrigin();
            Intrinsics.checkNotNullExpressionValue(origin, "getOrigin(...)");
            return origin;
        }

        public final void setOrigin(@NotNull TransactionEventRequestOuterClass.TransactionOrigin value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOrigin(value);
        }

        public final int getOriginValue() {
            return this._builder.getOriginValue();
        }

        public final void setOriginValue(int i) {
            this._builder.setOriginValue(i);
        }

        public final void clearOrigin() {
            this._builder.clearOrigin();
        }

        @NotNull
        public final TransactionEventRequestOuterClass.StoreKitVersion getStoreKitVersion() {
            TransactionEventRequestOuterClass.StoreKitVersion storeKitVersion = this._builder.getStoreKitVersion();
            Intrinsics.checkNotNullExpressionValue(storeKitVersion, "getStoreKitVersion(...)");
            return storeKitVersion;
        }

        public final void setStoreKitVersion(@NotNull TransactionEventRequestOuterClass.StoreKitVersion value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStoreKitVersion(value);
        }

        public final int getStoreKitVersionValue() {
            return this._builder.getStoreKitVersionValue();
        }

        public final void setStoreKitVersionValue(int i) {
            this._builder.setStoreKitVersionValue(i);
        }

        public final void clearStoreKitVersion() {
            this._builder.clearStoreKitVersion();
        }

        @NotNull
        public final String getGooglePlayBillingLibraryVersion() {
            String googlePlayBillingLibraryVersion = this._builder.getGooglePlayBillingLibraryVersion();
            Intrinsics.checkNotNullExpressionValue(googlePlayBillingLibraryVersion, "getGooglePlayBillingLibraryVersion(...)");
            return googlePlayBillingLibraryVersion;
        }

        public final void setGooglePlayBillingLibraryVersion(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setGooglePlayBillingLibraryVersion(value);
        }

        public final void clearGooglePlayBillingLibraryVersion() {
            this._builder.clearGooglePlayBillingLibraryVersion();
        }

        @NotNull
        public final ByteString getReceipt() {
            ByteString receipt = this._builder.getReceipt();
            Intrinsics.checkNotNullExpressionValue(receipt, "getReceipt(...)");
            return receipt;
        }

        public final void setReceipt(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setReceipt(value);
        }

        public final void clearReceipt() {
            this._builder.clearReceipt();
        }

        public final boolean hasReceipt() {
            return this._builder.hasReceipt();
        }
    }
}
