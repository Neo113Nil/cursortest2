package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.ironsource.X3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProductBuilderBridge.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\nJ\b\u0010\r\u001a\u00020\nH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductBuilderBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "builderInstance", "", "<init>", "(Ljava/lang/Object;)V", ProductBuilderBridge.BUILD_METHOD, "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductBridge;", ProductBuilderBridge.SET_PRODUCT_TYPE_METHOD, X3.i.m, "", ProductBuilderBridge.SET_PRODUCT_ID_METHOD, InAppPurchaseMetaData.KEY_PRODUCT_ID, "getClassName", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ProductBuilderBridge extends GenericBridge {

    @NotNull
    private static final String BUILD_METHOD = "build";

    @NotNull
    private static final String SET_PRODUCT_ID_METHOD = "setProductId";

    @NotNull
    private static final String SET_PRODUCT_TYPE_METHOD = "setProductType";

    @NotNull
    private Object builderInstance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductBuilderBridge(@NotNull Object builderInstance) {
        super(MapsKt.mapOf(TuplesKt.to(SET_PRODUCT_ID_METHOD, new Class[]{String.class}), TuplesKt.to(SET_PRODUCT_TYPE_METHOD, new Class[]{String.class}), TuplesKt.to(BUILD_METHOD, new Class[0])));
        Intrinsics.checkNotNullParameter(builderInstance, "builderInstance");
        this.builderInstance = builderInstance;
    }

    @NotNull
    public final ProductBridge build() {
        return new ProductBridge(callNonVoidMethod(BUILD_METHOD, this.builderInstance, new Object[0]));
    }

    @NotNull
    public final ProductBuilderBridge setProductType(@NotNull String productType) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Object callNonVoidMethod = callNonVoidMethod(SET_PRODUCT_TYPE_METHOD, this.builderInstance, productType);
        Intrinsics.checkNotNullExpressionValue(callNonVoidMethod, "callNonVoidMethod(...)");
        this.builderInstance = callNonVoidMethod;
        return this;
    }

    @NotNull
    public final ProductBuilderBridge setProductId(@NotNull String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Object callNonVoidMethod = callNonVoidMethod(SET_PRODUCT_ID_METHOD, this.builderInstance, productId);
        Intrinsics.checkNotNullExpressionValue(callNonVoidMethod, "callNonVoidMethod(...)");
        this.builderInstance = callNonVoidMethod;
        return this;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    protected String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams$Product$Builder";
    }
}
