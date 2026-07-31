package com.ogury.core.internal.datastore.preferences.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/ogury/core/internal/datastore/preferences/core/Preferences;", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ogury.core.internal.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {343}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class PreferencesKt$edit$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function2 $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesKt$edit$2(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(this.$transform, continuation);
        preferencesKt$edit$2.L$0 = obj;
        return preferencesKt$edit$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull Preferences preferences, @Nullable Continuation continuation) {
        return ((PreferencesKt$edit$2) create(preferences, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            ResultKt.throwOnFailure(obj);
            return mutablePreferences;
        }
        ResultKt.throwOnFailure(obj);
        MutablePreferences mutablePreferences2 = ((Preferences) this.L$0).toMutablePreferences();
        Function2 function2 = this.$transform;
        this.L$0 = mutablePreferences2;
        this.label = 1;
        return function2.invoke(mutablePreferences2, this) == coroutine_suspended ? coroutine_suspended : mutablePreferences2;
    }
}
