package com.unity3d.services.core.fid;

import android.content.Context;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FIdStaticBridge.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\tH\u0014¨\u0006\n"}, d2 = {"Lcom/unity3d/services/core/fid/FIdStaticBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "<init>", "()V", Constants.GET_INSTANCE, "Lcom/unity3d/services/core/fid/FIdBridge;", "context", "Landroid/content/Context;", "getClassName", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FIdStaticBridge extends GenericBridge {
    public FIdStaticBridge() {
        super(MapsKt.mapOf(new Pair(Constants.GET_INSTANCE, new Class[]{Context.class})), false);
    }

    @Nullable
    public final FIdBridge getInstance(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object callNonVoidMethod = callNonVoidMethod(Constants.GET_INSTANCE, null, context);
        if (callNonVoidMethod != null) {
            return new FIdBridge(callNonVoidMethod);
        }
        return null;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    protected String getClassName() {
        return Constants.INSTANCE.getClassName();
    }
}
