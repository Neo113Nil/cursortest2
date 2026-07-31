package com.mobilefuse.sdk.service.impl.ifv;

import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.MobileFuseSettings;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.service.MobileFuseService;
import com.mobilefuse.sdk.service.MobileFuseServices_LogsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: AppSetIdService.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0000¢\u0006\u0002\b\bJ'\u0010\t\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000bH\u0010¢\u0006\u0002\b\rJ\u001c\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0014¨\u0006\u0010"}, d2 = {"Lcom/mobilefuse/sdk/service/impl/ifv/AppSetIdService;", "Lcom/mobilefuse/sdk/service/MobileFuseService;", "()V", "getAppSetId", "", "callback", "Lkotlin/Function1;", "Lcom/mobilefuse/sdk/service/impl/ifv/AppSetIdModel;", "getAppSetId$mobilefuse_sdk_core_release", "initServiceImpl", "completeAction", "Lkotlin/Function2;", "", "initServiceImpl$mobilefuse_sdk_core_release", "onAppSetIdError", "resetImpl", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes14.dex */
public final class AppSetIdService extends MobileFuseService {

    @NotNull
    public static final AppSetIdService INSTANCE = new AppSetIdService();

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    protected void resetImpl() {
    }

    private AppSetIdService() {
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    public void initServiceImpl$mobilefuse_sdk_core_release(@NotNull final Function2 completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        getAppSetId$mobilefuse_sdk_core_release(new Function1() { // from class: com.mobilefuse.sdk.service.impl.ifv.AppSetIdService$initServiceImpl$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AppSetIdModel) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull AppSetIdModel details) {
                Intrinsics.checkNotNullParameter(details, "details");
                Function2.this.invoke(AppSetIdService.INSTANCE, Boolean.valueOf(details.getId().length() > 0));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAppSetIdError(Function1 callback) {
        callback.invoke(AppSetIdModelKt.getDefaultAppSet());
        MobileFuseServices_LogsKt.logServiceDebug(this, "Error obtaining the AppSet ID");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, com.google.android.gms.tasks.Task] */
    public final void getAppSetId$mobilefuse_sdk_core_release(@NotNull final Function1 callback) {
        Either errorResult;
        Task addOnSuccessListener;
        Task addOnFailureListener;
        Intrinsics.checkNotNullParameter(callback, "callback");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            AppSetIdClient client = AppSet.getClient(AppLifecycleHelper.getGlobalContext());
            Intrinsics.checkNotNullExpressionValue(client, "AppSet.getClient(AppLifecycleHelper.globalContext)");
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ?? appSetIdInfo = client.getAppSetIdInfo();
            ref$ObjectRef.element = appSetIdInfo;
            errorResult = new SuccessResult((appSetIdInfo == 0 || (addOnSuccessListener = appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.mobilefuse.sdk.service.impl.ifv.AppSetIdService$getAppSetId$$inlined$gracefullyHandleException$lambda$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(AppSetIdInfo it) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    int scope = it.getScope();
                    String id = it.getId();
                    Intrinsics.checkNotNullExpressionValue(id, "it.id");
                    if (id.length() == 0 || StringsKt.isBlank(id)) {
                        AppSetIdService.INSTANCE.onAppSetIdError(Function1.this);
                        return;
                    }
                    Function1.this.invoke(new AppSetIdModel(scope, id));
                    MobileFuseSettings.INSTANCE.setAppSetId$mobilefuse_sdk_core_release(id);
                    MobileFuseServices_LogsKt.logServiceDebug(AppSetIdService.INSTANCE, "Successfully obtain the AppSet ID " + id);
                }
            })) == null || (addOnFailureListener = addOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.mobilefuse.sdk.service.impl.ifv.AppSetIdService$getAppSetId$$inlined$gracefullyHandleException$lambda$2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(@NotNull Exception it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    AppSetIdService.INSTANCE.onAppSetIdError(Function1.this);
                }
            })) == null) ? null : addOnFailureListener.addOnCompleteListener(new OnCompleteListener() { // from class: com.mobilefuse.sdk.service.impl.ifv.AppSetIdService$getAppSetId$1$3
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(@NotNull Task<AppSetIdInfo> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Ref$ObjectRef.this.element = null;
                }
            }));
        } catch (Throwable th) {
            if (AppSetIdService$getAppSetId$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            INSTANCE.onAppSetIdError(callback);
        }
    }
}
