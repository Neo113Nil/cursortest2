package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.ironsource.X3;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: QueryPurchasesParamsBuilderBridge.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0014J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryPurchasesParamsBuilderBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "builderInstance", "", "<init>", "(Ljava/lang/Object;)V", "getBuilderInstance", "()Ljava/lang/Object;", "setBuilderInstance", "getClassName", "", QueryPurchasesParamsBuilderBridge.BUILD_METHOD, "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsParamsBridge;", QueryPurchasesParamsBuilderBridge.SET_PRODUCT_TYPE_METHOD, X3.i.m, "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QueryPurchasesParamsBuilderBridge extends GenericBridge {

    @NotNull
    private static final String BUILD_METHOD = "build";

    @NotNull
    private static final String SET_PRODUCT_TYPE_METHOD = "setProductType";

    @NotNull
    private Object builderInstance;

    @NotNull
    public final Object getBuilderInstance() {
        return this.builderInstance;
    }

    public final void setBuilderInstance(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.builderInstance = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchasesParamsBuilderBridge(@NotNull Object builderInstance) {
        super(MapsKt.mapOf(TuplesKt.to(SET_PRODUCT_TYPE_METHOD, new Class[]{String.class}), TuplesKt.to(BUILD_METHOD, new Class[0])));
        Intrinsics.checkNotNullParameter(builderInstance, "builderInstance");
        this.builderInstance = builderInstance;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    protected String getClassName() {
        return "com.android.billingclient.api.QueryPurchasesParams$Builder";
    }

    @NotNull
    public final QueryProductDetailsParamsBridge build() {
        return new QueryProductDetailsParamsBridge(callNonVoidMethod(BUILD_METHOD, this.builderInstance, new Object[0]));
    }

    @NotNull
    public final QueryPurchasesParamsBuilderBridge setProductType(@NotNull String productType) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Object callNonVoidMethod = callNonVoidMethod(SET_PRODUCT_TYPE_METHOD, this.builderInstance, productType);
        Intrinsics.checkNotNullExpressionValue(callNonVoidMethod, "callNonVoidMethod(...)");
        this.builderInstance = callNonVoidMethod;
        return this;
    }
}
