package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.android.billingclient.api.PendingPurchasesParams;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PendingPurchasesParamsBridge.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u0004\u0018\u00010\u0003R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/PendingPurchasesParamsBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "pendingPurchasesParamsInternalInstance", "", "<init>", "(Ljava/lang/Object;)V", "getClassName", "", "getInternalClass", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PendingPurchasesParamsBridge extends GenericBridge {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String NEW_BUILDER_METHOD_NAME = "newBuilder";

    @Nullable
    private final Object pendingPurchasesParamsInternalInstance;

    public PendingPurchasesParamsBridge(@Nullable Object obj) {
        super(MapsKt.hashMapOf(TuplesKt.to("newBuilder", new Class[0])));
        this.pendingPurchasesParamsInternalInstance = obj;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    protected String getClassName() {
        return "com.android.billingclient.api.PendingPurchasesParams";
    }

    @Nullable
    /* renamed from: getInternalClass, reason: from getter */
    public final Object getPendingPurchasesParamsInternalInstance() {
        return this.pendingPurchasesParamsInternalInstance;
    }

    /* compiled from: PendingPurchasesParamsBridge.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/PendingPurchasesParamsBridge$Companion;", "", "<init>", "()V", "getClassForParams", "Ljava/lang/Class;", "NEW_BUILDER_METHOD_NAME", "", "newBuilder", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/PendingPurchasesParamsBuilderBridge;", "callNonVoidStaticMethod", "methodName", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Class<?> getClassForParams() {
            Intrinsics.checkNotNullExpressionValue(PendingPurchasesParams.class, "forName(...)");
            return PendingPurchasesParams.class;
        }

        @NotNull
        public final PendingPurchasesParamsBuilderBridge newBuilder() {
            return new PendingPurchasesParamsBuilderBridge(callNonVoidStaticMethod("newBuilder"));
        }

        private final Object callNonVoidStaticMethod(String methodName) {
            Object invoke = getClassForParams().getMethod(methodName, null).invoke(null, null);
            if (invoke != null) {
                return invoke;
            }
            throw new IllegalStateException("Static method " + methodName + " returned null");
        }
    }
}
