package expo.modules.imagepicker;

import androidx.appcompat.app.AppCompatDelegate;
import com.google.android.gms.location.LocationRequest;
import expo.modules.imagepicker.contracts.CameraContract;
import expo.modules.imagepicker.contracts.CameraContractOptions;
import expo.modules.imagepicker.contracts.CropImageContract;
import expo.modules.imagepicker.contracts.CropImageContractOptions;
import expo.modules.imagepicker.contracts.ImageLibraryContract;
import expo.modules.imagepicker.contracts.ImageLibraryContractOptions;
import expo.modules.imagepicker.contracts.ImagePickerContractResult;
import expo.modules.kotlin.activityresult.AppContextActivityResultCaller;
import expo.modules.kotlin.activityresult.AppContextActivityResultFallbackCallback;
import expo.modules.kotlin.activityresult.AppContextActivityResultLauncher;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImagePickerModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.imagepicker.ImagePickerModule$definition$1$8", f = "ImagePickerModule.kt", i = {0, 1}, l = {101, LocationRequest.PRIORITY_NO_POWER, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY}, m = "invokeSuspend", n = {"$this$RegisterActivityContracts", "$this$RegisterActivityContracts"}, s = {"L$0", "L$0"})
/* loaded from: classes7.dex */
final class ImagePickerModule$definition$1$8 extends SuspendLambda implements Function2<AppContextActivityResultCaller, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ImagePickerModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImagePickerModule$definition$1$8(ImagePickerModule imagePickerModule, Continuation<? super ImagePickerModule$definition$1$8> continuation) {
        super(2, continuation);
        this.this$0 = imagePickerModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ImagePickerModule$definition$1$8 imagePickerModule$definition$1$8 = new ImagePickerModule$definition$1$8(this.this$0, continuation);
        imagePickerModule$definition$1$8.L$0 = obj;
        return imagePickerModule$definition$1$8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AppContextActivityResultCaller appContextActivityResultCaller, Continuation<? super Unit> continuation) {
        return ((ImagePickerModule$definition$1$8) create(appContextActivityResultCaller, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ImagePickerModule imagePickerModule;
        AppContextActivityResultCaller appContextActivityResultCaller;
        ImagePickerModule imagePickerModule2;
        AppContextActivityResultCaller appContextActivityResultCaller2;
        Object registerForActivityResult;
        ImagePickerModule imagePickerModule3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AppContextActivityResultCaller appContextActivityResultCaller3 = (AppContextActivityResultCaller) this.L$0;
            imagePickerModule = this.this$0;
            CameraContract cameraContract = new CameraContract(this.this$0);
            final ImagePickerModule imagePickerModule4 = this.this$0;
            this.L$0 = appContextActivityResultCaller3;
            this.L$1 = imagePickerModule;
            this.label = 1;
            Object registerForActivityResult2 = appContextActivityResultCaller3.registerForActivityResult(cameraContract, new AppContextActivityResultFallbackCallback() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$1$8.1
                @Override // expo.modules.kotlin.activityresult.AppContextActivityResultFallbackCallback
                public final void onActivityResult(CameraContractOptions input, ImagePickerContractResult result) {
                    Intrinsics.checkNotNullParameter(input, "input");
                    Intrinsics.checkNotNullParameter(result, "result");
                    ImagePickerModule.this.handleResultUponActivityDestruction(result, input.getOptions());
                }
            }, this);
            if (registerForActivityResult2 != coroutine_suspended) {
                appContextActivityResultCaller = appContextActivityResultCaller3;
                obj = registerForActivityResult2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                imagePickerModule3 = (ImagePickerModule) this.L$0;
                ResultKt.throwOnFailure(obj);
                imagePickerModule3.cropImageLauncher = (AppContextActivityResultLauncher) obj;
                return Unit.INSTANCE;
            }
            imagePickerModule2 = (ImagePickerModule) this.L$1;
            appContextActivityResultCaller2 = (AppContextActivityResultCaller) this.L$0;
            ResultKt.throwOnFailure(obj);
            imagePickerModule2.imageLibraryLauncher = (AppContextActivityResultLauncher) obj;
            ImagePickerModule imagePickerModule5 = this.this$0;
            CropImageContract cropImageContract = new CropImageContract(this.this$0);
            final ImagePickerModule imagePickerModule6 = this.this$0;
            this.L$0 = imagePickerModule5;
            this.L$1 = null;
            this.label = 3;
            registerForActivityResult = appContextActivityResultCaller2.registerForActivityResult(cropImageContract, new AppContextActivityResultFallbackCallback() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$1$8.3
                @Override // expo.modules.kotlin.activityresult.AppContextActivityResultFallbackCallback
                public final void onActivityResult(CropImageContractOptions input, ImagePickerContractResult result) {
                    Intrinsics.checkNotNullParameter(input, "input");
                    Intrinsics.checkNotNullParameter(result, "result");
                    ImagePickerModule.this.handleResultUponActivityDestruction(result, input.getOptions());
                }
            }, this);
            if (registerForActivityResult != coroutine_suspended) {
                imagePickerModule3 = imagePickerModule5;
                obj = registerForActivityResult;
                imagePickerModule3.cropImageLauncher = (AppContextActivityResultLauncher) obj;
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        imagePickerModule = (ImagePickerModule) this.L$1;
        appContextActivityResultCaller = (AppContextActivityResultCaller) this.L$0;
        ResultKt.throwOnFailure(obj);
        imagePickerModule.cameraLauncher = (AppContextActivityResultLauncher) obj;
        imagePickerModule2 = this.this$0;
        ImageLibraryContract imageLibraryContract = new ImageLibraryContract(this.this$0);
        final ImagePickerModule imagePickerModule7 = this.this$0;
        this.L$0 = appContextActivityResultCaller;
        this.L$1 = imagePickerModule2;
        this.label = 2;
        obj = appContextActivityResultCaller.registerForActivityResult(imageLibraryContract, new AppContextActivityResultFallbackCallback() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$1$8.2
            @Override // expo.modules.kotlin.activityresult.AppContextActivityResultFallbackCallback
            public final void onActivityResult(ImageLibraryContractOptions input, ImagePickerContractResult result) {
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(result, "result");
                ImagePickerModule.this.handleResultUponActivityDestruction(result, input.getOptions());
            }
        }, this);
        if (obj != coroutine_suspended) {
            appContextActivityResultCaller2 = appContextActivityResultCaller;
            imagePickerModule2.imageLibraryLauncher = (AppContextActivityResultLauncher) obj;
            ImagePickerModule imagePickerModule52 = this.this$0;
            CropImageContract cropImageContract2 = new CropImageContract(this.this$0);
            final ImagePickerModule imagePickerModule62 = this.this$0;
            this.L$0 = imagePickerModule52;
            this.L$1 = null;
            this.label = 3;
            registerForActivityResult = appContextActivityResultCaller2.registerForActivityResult(cropImageContract2, new AppContextActivityResultFallbackCallback() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$1$8.3
                @Override // expo.modules.kotlin.activityresult.AppContextActivityResultFallbackCallback
                public final void onActivityResult(CropImageContractOptions input, ImagePickerContractResult result) {
                    Intrinsics.checkNotNullParameter(input, "input");
                    Intrinsics.checkNotNullParameter(result, "result");
                    ImagePickerModule.this.handleResultUponActivityDestruction(result, input.getOptions());
                }
            }, this);
            if (registerForActivityResult != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
