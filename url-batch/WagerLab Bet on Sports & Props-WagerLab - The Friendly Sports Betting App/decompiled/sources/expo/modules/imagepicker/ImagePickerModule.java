package expo.modules.imagepicker;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.OperationCanceledException;
import androidx.core.content.ContextCompat;
import androidx.tracing.Trace;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.core.errors.ModuleNotFoundException;
import expo.modules.imagepicker.contracts.CameraContractOptions;
import expo.modules.imagepicker.contracts.CropImageContractOptions;
import expo.modules.imagepicker.contracts.ImageLibraryContractOptions;
import expo.modules.imagepicker.contracts.ImagePickerContractResult;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.interfaces.permissions.PermissionsResponseListener;
import expo.modules.interfaces.permissions.PermissionsStatus;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.activityresult.AppContextActivityResultLauncher;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SuspendFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ImagePickerModule.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J4\u0010 \u001a\u00020!2\u001c\u0010\"\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0$\u0012\u0006\u0012\u0004\u0018\u00010!0#2\u0006\u0010%\u001a\u00020&H\u0082@¢\u0006\u0002\u0010'J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020&H\u0002J,\u0010+\u001a\u00020,2\u001c\u0010\"\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0$\u0012\u0006\u0012\u0004\u0018\u00010!0#H\u0082@¢\u0006\u0002\u0010-J\u001b\u0010.\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00101\u001a\u00020\u001bH\u0002¢\u0006\u0002\u00102J\u0010\u00103\u001a\u00020)2\u0006\u0010%\u001a\u00020&H\u0002J\u000e\u00104\u001a\u00020)H\u0082@¢\u0006\u0002\u00105R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\rX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\rX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lexpo/modules/imagepicker/ImagePickerModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "mediaHandler", "Lexpo/modules/imagepicker/MediaHandler;", "cameraLauncher", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "Lexpo/modules/imagepicker/contracts/CameraContractOptions;", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult;", "imageLibraryLauncher", "Lexpo/modules/imagepicker/contracts/ImageLibraryContractOptions;", "cropImageLauncher", "Lexpo/modules/imagepicker/contracts/CropImageContractOptions;", "cacheDirectory", "Ljava/io/File;", "getCacheDirectory", "()Ljava/io/File;", "pendingMediaPickingResult", "Lexpo/modules/imagepicker/PendingMediaPickingResult;", "isPickerOpen", "", "createPermissionsDecorator", "Lexpo/modules/interfaces/permissions/PermissionsResponseListener;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/kotlin/Promise;", "launchContract", "", "pickerLauncher", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lexpo/modules/imagepicker/ImagePickerOptions;", "(Lkotlin/jvm/functions/Function1;Lexpo/modules/imagepicker/ImagePickerOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleResultUponActivityDestruction", "", "result", "launchPicker", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult$Success;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMediaLibraryPermissions", "", "", "writeOnly", "(Z)[Ljava/lang/String;", "ensureTargetActivityIsAvailable", "ensureCameraPermissionsAreGranted", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImagePickerModule extends Module {
    private AppContextActivityResultLauncher<CameraContractOptions, ImagePickerContractResult> cameraLauncher;
    private AppContextActivityResultLauncher<CropImageContractOptions, ImagePickerContractResult> cropImageLauncher;
    private AppContextActivityResultLauncher<ImageLibraryContractOptions, ImagePickerContractResult> imageLibraryLauncher;
    private boolean isPickerOpen;
    private final MediaHandler mediaHandler = new MediaHandler(this);
    private PendingMediaPickingResult pendingMediaPickingResult;

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent2;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2;
        ImagePickerModule imagePickerModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (imagePickerModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(imagePickerModule);
            moduleDefinitionBuilder.Name(ImagePickerConstants.TAG);
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
            AnyType[] anyTypeArr = new AnyType[1];
            AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Boolean.class), false));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Boolean.class), false, new Function0<KType>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunctionWithPromise$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(Boolean.TYPE);
                    }
                }), converters);
            }
            anyTypeArr[0] = anyType;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent3 = new AsyncFunctionWithPromiseComponent("requestMediaLibraryPermissionsAsync", anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunctionWithPromise$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    String[] mediaLibraryPermissions;
                    PermissionsResponseListener createPermissionsDecorator;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
                    Permissions permissions = ImagePickerModule.this.getAppContext().getPermissions();
                    if (permissions != null) {
                        mediaLibraryPermissions = ImagePickerModule.this.getMediaLibraryPermissions(booleanValue);
                        createPermissionsDecorator = ImagePickerModule.this.createPermissionsDecorator(promise);
                        permissions.askForPermissions(createPermissionsDecorator, (String[]) Arrays.copyOf(mediaLibraryPermissions, mediaLibraryPermissions.length));
                        return;
                    }
                    throw new Exceptions.PermissionsModuleNotFound();
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder2.getAsyncFunctions().put("requestMediaLibraryPermissionsAsync", asyncFunctionWithPromiseComponent3);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent4 = asyncFunctionWithPromiseComponent3;
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            TypeConverterProvider converters2 = moduleDefinitionBuilder3.getConverters();
            AnyType[] anyTypeArr2 = new AnyType[1];
            AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Boolean.class), false));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Boolean.class), false, new Function0<KType>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunctionWithPromise$3
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(Boolean.TYPE);
                    }
                }), converters2);
            }
            anyTypeArr2[0] = anyType2;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent5 = new AsyncFunctionWithPromiseComponent("getMediaLibraryPermissionsAsync", anyTypeArr2, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunctionWithPromise$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    String[] mediaLibraryPermissions;
                    PermissionsResponseListener createPermissionsDecorator;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
                    Permissions permissions = ImagePickerModule.this.getAppContext().getPermissions();
                    if (permissions != null) {
                        mediaLibraryPermissions = ImagePickerModule.this.getMediaLibraryPermissions(booleanValue);
                        createPermissionsDecorator = ImagePickerModule.this.createPermissionsDecorator(promise);
                        permissions.getPermissions(createPermissionsDecorator, (String[]) Arrays.copyOf(mediaLibraryPermissions, mediaLibraryPermissions.length));
                        return;
                    }
                    throw new Exceptions.PermissionsModuleNotFound();
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder3.getAsyncFunctions().put("getMediaLibraryPermissionsAsync", asyncFunctionWithPromiseComponent5);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent6 = asyncFunctionWithPromiseComponent5;
            ModuleDefinitionBuilder moduleDefinitionBuilder4 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("requestCameraPermissionsAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunction$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        Permissions.askForPermissionsWithPermissionsManager(ImagePickerModule.this.getAppContext().getPermissions(), promise, "android.permission.CAMERA");
                    }
                });
            } else {
                TypeConverterProvider converters3 = moduleDefinitionBuilder4.getConverters();
                AnyType[] anyTypeArr3 = new AnyType[1];
                AnyType anyType3 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType3 == null) {
                    anyType3 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Promise.class), false, new Function0<KType>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunction$2
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Promise.class);
                        }
                    }), converters3);
                }
                anyTypeArr3[0] = anyType3;
                Function1<Object[], Unit> function1 = new Function1<Object[], Unit>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Permissions.askForPermissionsWithPermissionsManager(ImagePickerModule.this.getAppContext().getPermissions(), (Promise) objArr[0], "android.permission.CAMERA");
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent = new StringAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr3, function1);
                                } else {
                                    untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr3, function1);
                                }
                            } else {
                                untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr3, function1);
                            }
                        } else {
                            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr3, function1);
                        }
                    } else {
                        untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr3, function1);
                    }
                } else {
                    untypedAsyncFunctionComponent = new IntAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr3, function1);
                }
                asyncFunctionWithPromiseComponent = untypedAsyncFunctionComponent;
            }
            moduleDefinitionBuilder4.getAsyncFunctions().put("requestCameraPermissionsAsync", asyncFunctionWithPromiseComponent);
            ModuleDefinitionBuilder moduleDefinitionBuilder5 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent("getCameraPermissionsAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunction$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        Permissions.getPermissionsWithPermissionsManager(ImagePickerModule.this.getAppContext().getPermissions(), promise, "android.permission.CAMERA");
                    }
                });
            } else {
                TypeConverterProvider converters4 = moduleDefinitionBuilder5.getConverters();
                AnyType[] anyTypeArr4 = new AnyType[1];
                AnyType anyType4 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType4 == null) {
                    anyType4 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Promise.class), false, new Function0<KType>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunction$5
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(Promise.class);
                        }
                    }), converters4);
                }
                anyTypeArr4[0] = anyType4;
                Function1<Object[], Unit> function12 = new Function1<Object[], Unit>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunction$6
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Permissions.getPermissionsWithPermissionsManager(ImagePickerModule.this.getAppContext().getPermissions(), (Promise) objArr[0], "android.permission.CAMERA");
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent2 = new StringAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr4, function12);
                                } else {
                                    untypedAsyncFunctionComponent2 = new UntypedAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr4, function12);
                                }
                            } else {
                                untypedAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr4, function12);
                            }
                        } else {
                            untypedAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr4, function12);
                        }
                    } else {
                        untypedAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr4, function12);
                    }
                } else {
                    untypedAsyncFunctionComponent2 = new IntAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr4, function12);
                }
                asyncFunctionWithPromiseComponent2 = untypedAsyncFunctionComponent2;
            }
            moduleDefinitionBuilder5.getAsyncFunctions().put("getCameraPermissionsAsync", asyncFunctionWithPromiseComponent2);
            AsyncFunctionBuilder AsyncFunction = moduleDefinitionBuilder.AsyncFunction("launchCameraAsync");
            String name = AsyncFunction.getName();
            TypeConverterProvider converters5 = AsyncFunction.getConverters();
            AnyType[] anyTypeArr5 = new AnyType[1];
            AnyType anyType5 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ImagePickerOptions.class), false));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ImagePickerOptions.class), false, new Function0<KType>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$Coroutine$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(ImagePickerOptions.class);
                    }
                }), converters5);
            }
            anyTypeArr5[0] = anyType5;
            AsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name, anyTypeArr5, new ImagePickerModule$definition$lambda$7$$inlined$Coroutine$2(null, this)));
            AsyncFunctionBuilder AsyncFunction2 = moduleDefinitionBuilder.AsyncFunction("launchImageLibraryAsync");
            String name2 = AsyncFunction2.getName();
            TypeConverterProvider converters6 = AsyncFunction2.getConverters();
            AnyType[] anyTypeArr6 = new AnyType[1];
            AnyType anyType6 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ImagePickerOptions.class), false));
            if (anyType6 == null) {
                anyType6 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ImagePickerOptions.class), false, new Function0<KType>() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$Coroutine$3
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(ImagePickerOptions.class);
                    }
                }), converters6);
            }
            anyTypeArr6[0] = anyType6;
            AsyncFunction2.setAsyncFunctionComponent(new SuspendFunctionComponent(name2, anyTypeArr6, new ImagePickerModule$definition$lambda$7$$inlined$Coroutine$4(null, this)));
            AsyncFunctionBuilder AsyncFunction3 = moduleDefinitionBuilder.AsyncFunction("getPendingResultAsync");
            SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(AsyncFunction3.getName(), new AnyType[0], new ImagePickerModule$definition$lambda$7$$inlined$Coroutine$5(null, this));
            AsyncFunction3.setAsyncFunctionComponent(suspendFunctionComponent);
            SuspendFunctionComponent suspendFunctionComponent2 = suspendFunctionComponent;
            moduleDefinitionBuilder.RegisterActivityContracts(new ImagePickerModule$definition$1$8(this, null));
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }

    public final Context getContext() {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new IllegalArgumentException("React Application Context is null".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getCacheDirectory() {
        return getAppContext().getCacheDirectory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PermissionsResponseListener createPermissionsDecorator(final Promise promise) {
        final WeakReference weak = UtilsKt.weak(getAppContext().getReactContext());
        return new PermissionsResponseListener() { // from class: expo.modules.imagepicker.ImagePickerModule$$ExternalSyntheticLambda0
            @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
            public final void onResult(Map map) {
                ImagePickerModule.createPermissionsDecorator$lambda$14(Promise.this, weak, this, map);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void createPermissionsDecorator$lambda$14(Promise promise, WeakReference weakReference, ImagePickerModule imagePickerModule, Map map) {
        boolean z;
        boolean z2;
        String status;
        Intrinsics.checkNotNull(map);
        boolean z3 = false;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (((PermissionsResponse) ((Map.Entry) it.next()).getValue()).getStatus() != PermissionsStatus.GRANTED) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (!map.isEmpty()) {
            if (!map.isEmpty()) {
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    if (((PermissionsResponse) ((Map.Entry) it2.next()).getValue()).getStatus() == PermissionsStatus.DENIED) {
                    }
                }
            }
            z2 = true;
            if (!map.isEmpty()) {
                Iterator it3 = map.entrySet().iterator();
                while (it3.hasNext()) {
                    if (!((PermissionsResponse) ((Map.Entry) it3.next()).getValue()).getCanAskAgain()) {
                        break;
                    }
                }
            }
            z3 = true;
            Bundle bundle = new Bundle();
            bundle.putString(PermissionsResponse.EXPIRES_KEY, "never");
            if (!z) {
                status = PermissionsStatus.GRANTED.getStatus();
            } else if (z2) {
                status = PermissionsStatus.DENIED.getStatus();
            } else {
                status = PermissionsStatus.UNDETERMINED.getStatus();
            }
            bundle.putString("status", status);
            bundle.putBoolean(PermissionsResponse.CAN_ASK_AGAIN_KEY, z3);
            bundle.putBoolean(PermissionsResponse.GRANTED_KEY, z);
            if (!z) {
                bundle.putString(ImagePickerModuleKt.ACCESS_PRIVILEGES_PERMISSION_KEY, "all");
                promise.resolve(bundle);
                return;
            }
            if (Build.VERSION.SDK_INT < 34) {
                bundle.putString(ImagePickerModuleKt.ACCESS_PRIVILEGES_PERMISSION_KEY, "none");
                promise.resolve(bundle);
                return;
            }
            Context context = (Context) weakReference.get();
            if (context == null) {
                promise.reject(new Exceptions.ReactContextLost());
                return;
            }
            if (ContextCompat.checkSelfPermission(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                bundle.putBoolean(PermissionsResponse.GRANTED_KEY, true);
                bundle.putBoolean(PermissionsResponse.CAN_ASK_AGAIN_KEY, true);
                bundle.putString("status", PermissionsStatus.GRANTED.getStatus());
                bundle.putString(ImagePickerModuleKt.ACCESS_PRIVILEGES_PERMISSION_KEY, "limited");
            } else {
                bundle.putString(ImagePickerModuleKt.ACCESS_PRIVILEGES_PERMISSION_KEY, "none");
            }
            promise.resolve(bundle);
            return;
        }
        z2 = false;
        if (!map.isEmpty()) {
        }
        z3 = true;
        Bundle bundle2 = new Bundle();
        bundle2.putString(PermissionsResponse.EXPIRES_KEY, "never");
        if (!z) {
        }
        bundle2.putString("status", status);
        bundle2.putBoolean(PermissionsResponse.CAN_ASK_AGAIN_KEY, z3);
        bundle2.putBoolean(PermissionsResponse.GRANTED_KEY, z);
        if (!z) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e9, code lost:
    
        if (r11 == r1) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object launchContract(Function1<? super Continuation<? super ImagePickerContractResult>, ? extends Object> function1, ImagePickerOptions imagePickerOptions, Continuation<Object> continuation) {
        ImagePickerModule$launchContract$1 imagePickerModule$launchContract$1;
        Object coroutine_suspended;
        int i;
        ImagePickerOptions imagePickerOptions2;
        Ref.ObjectRef objectRef;
        T t;
        Ref.ObjectRef objectRef2;
        Object launchPicker;
        Ref.ObjectRef objectRef3;
        T t2;
        Object obj;
        try {
            if (continuation instanceof ImagePickerModule$launchContract$1) {
                imagePickerModule$launchContract$1 = (ImagePickerModule$launchContract$1) continuation;
                if ((imagePickerModule$launchContract$1.label & Integer.MIN_VALUE) != 0) {
                    imagePickerModule$launchContract$1.label -= Integer.MIN_VALUE;
                    Object obj2 = imagePickerModule$launchContract$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = imagePickerModule$launchContract$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        if (this.isPickerOpen) {
                            return new ImagePickerResponse(true, null, 2, null);
                        }
                        this.isPickerOpen = true;
                        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                        imagePickerModule$launchContract$1.L$0 = imagePickerOptions;
                        imagePickerModule$launchContract$1.L$1 = objectRef4;
                        imagePickerModule$launchContract$1.L$2 = objectRef4;
                        imagePickerModule$launchContract$1.label = 1;
                        Object launchPicker2 = launchPicker(function1, imagePickerModule$launchContract$1);
                        if (launchPicker2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        imagePickerOptions2 = imagePickerOptions;
                        objectRef = objectRef4;
                        t = launchPicker2;
                        objectRef2 = objectRef;
                    } else if (i == 1) {
                        objectRef2 = (Ref.ObjectRef) imagePickerModule$launchContract$1.L$2;
                        objectRef = (Ref.ObjectRef) imagePickerModule$launchContract$1.L$1;
                        imagePickerOptions2 = (ImagePickerOptions) imagePickerModule$launchContract$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        t = obj2;
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                            obj = obj2;
                            return (ImagePickerResponse) obj;
                        }
                        objectRef3 = (Ref.ObjectRef) imagePickerModule$launchContract$1.L$2;
                        objectRef = (Ref.ObjectRef) imagePickerModule$launchContract$1.L$1;
                        imagePickerOptions2 = (ImagePickerOptions) imagePickerModule$launchContract$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        t2 = obj2;
                        objectRef3.element = t2;
                        MediaHandler mediaHandler = this.mediaHandler;
                        List<Pair<MediaType, Uri>> data = ((ImagePickerContractResult.Success) objectRef.element).getData();
                        imagePickerModule$launchContract$1.L$0 = null;
                        imagePickerModule$launchContract$1.L$1 = null;
                        imagePickerModule$launchContract$1.L$2 = null;
                        imagePickerModule$launchContract$1.label = 3;
                        Object readExtras$expo_image_picker_release = mediaHandler.readExtras$expo_image_picker_release(data, imagePickerOptions2, imagePickerModule$launchContract$1);
                        obj = readExtras$expo_image_picker_release;
                    }
                    objectRef2.element = t;
                    if (!imagePickerOptions2.getAllowsMultipleSelection() && imagePickerOptions2.getAllowsEditing() && ((ImagePickerContractResult.Success) objectRef.element).getData().size() == 1 && ((ImagePickerContractResult.Success) objectRef.element).getData().get(0).getFirst() == MediaType.IMAGE) {
                        Function1<? super Continuation<? super ImagePickerContractResult>, ? extends Object> imagePickerModule$launchContract$2 = new ImagePickerModule$launchContract$2(this, objectRef, imagePickerOptions2, null);
                        imagePickerModule$launchContract$1.L$0 = imagePickerOptions2;
                        imagePickerModule$launchContract$1.L$1 = objectRef;
                        imagePickerModule$launchContract$1.L$2 = objectRef;
                        imagePickerModule$launchContract$1.label = 2;
                        launchPicker = launchPicker(imagePickerModule$launchContract$2, imagePickerModule$launchContract$1);
                        if (launchPicker != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef3 = objectRef;
                        t2 = launchPicker;
                        objectRef3.element = t2;
                    }
                    MediaHandler mediaHandler2 = this.mediaHandler;
                    List<Pair<MediaType, Uri>> data2 = ((ImagePickerContractResult.Success) objectRef.element).getData();
                    imagePickerModule$launchContract$1.L$0 = null;
                    imagePickerModule$launchContract$1.L$1 = null;
                    imagePickerModule$launchContract$1.L$2 = null;
                    imagePickerModule$launchContract$1.label = 3;
                    Object readExtras$expo_image_picker_release2 = mediaHandler2.readExtras$expo_image_picker_release(data2, imagePickerOptions2, imagePickerModule$launchContract$1);
                    obj = readExtras$expo_image_picker_release2;
                }
            }
            if (i != 0) {
            }
            objectRef2.element = t;
            if (!imagePickerOptions2.getAllowsMultipleSelection()) {
                Function1<? super Continuation<? super ImagePickerContractResult>, ? extends Object> imagePickerModule$launchContract$22 = new ImagePickerModule$launchContract$2(this, objectRef, imagePickerOptions2, null);
                imagePickerModule$launchContract$1.L$0 = imagePickerOptions2;
                imagePickerModule$launchContract$1.L$1 = objectRef;
                imagePickerModule$launchContract$1.L$2 = objectRef;
                imagePickerModule$launchContract$1.label = 2;
                launchPicker = launchPicker(imagePickerModule$launchContract$22, imagePickerModule$launchContract$1);
                if (launchPicker != coroutine_suspended) {
                }
            }
            MediaHandler mediaHandler22 = this.mediaHandler;
            List<Pair<MediaType, Uri>> data22 = ((ImagePickerContractResult.Success) objectRef.element).getData();
            imagePickerModule$launchContract$1.L$0 = null;
            imagePickerModule$launchContract$1.L$1 = null;
            imagePickerModule$launchContract$1.L$2 = null;
            imagePickerModule$launchContract$1.label = 3;
            Object readExtras$expo_image_picker_release22 = mediaHandler22.readExtras$expo_image_picker_release(data22, imagePickerOptions2, imagePickerModule$launchContract$1);
            obj = readExtras$expo_image_picker_release22;
        } catch (OperationCanceledException unused) {
            return new ImagePickerResponse(true, null, 2, null);
        } finally {
            this.isPickerOpen = false;
        }
        imagePickerModule$launchContract$1 = new ImagePickerModule$launchContract$1(this, continuation);
        Object obj22 = imagePickerModule$launchContract$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = imagePickerModule$launchContract$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleResultUponActivityDestruction(ImagePickerContractResult result, ImagePickerOptions options) {
        if (result instanceof ImagePickerContractResult.Success) {
            this.pendingMediaPickingResult = new PendingMediaPickingResult(((ImagePickerContractResult.Success) result).getData(), options);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object launchPicker(Function1<? super Continuation<? super ImagePickerContractResult>, ? extends Object> function1, Continuation<? super ImagePickerContractResult.Success> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ImagePickerModule$launchPicker$2(function1, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String[] getMediaLibraryPermissions(boolean writeOnly) {
        if (Build.VERSION.SDK_INT >= 33) {
            return new String[0];
        }
        String[] strArr = new String[2];
        strArr[0] = "android.permission.WRITE_EXTERNAL_STORAGE";
        strArr[1] = !writeOnly ? "android.permission.READ_EXTERNAL_STORAGE" : null;
        return (String[]) CollectionsKt.listOfNotNull((Object[]) strArr).toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureTargetActivityIsAvailable(ImagePickerOptions options) {
        Intent intent = new Intent(options.getNativeMediaTypes().toCameraIntentAction());
        if (intent.resolveActivity(getAppContext().getThrowingActivity().getApplication().getPackageManager()) == null) {
            throw new MissingActivityToHandleIntent(intent.getType());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ensureCameraPermissionsAreGranted(Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        Permissions permissions = getAppContext().getPermissions();
        if (permissions == null) {
            throw new ModuleNotFoundException("Permissions");
        }
        PermissionsResponseListener permissionsResponseListener = new PermissionsResponseListener() { // from class: expo.modules.imagepicker.ImagePickerModule$ensureCameraPermissionsAreGranted$2$1
            @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
            public final void onResult(Map<String, PermissionsResponse> map) {
                if (Build.VERSION.SDK_INT >= 29) {
                    PermissionsResponse permissionsResponse = map.get("android.permission.CAMERA");
                    if ((permissionsResponse != null ? permissionsResponse.getStatus() : null) == PermissionsStatus.GRANTED) {
                        CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m12363constructorimpl(Unit.INSTANCE));
                        return;
                    } else {
                        CancellableContinuation<Unit> cancellableContinuation2 = cancellableContinuationImpl2;
                        Result.Companion companion2 = Result.INSTANCE;
                        cancellableContinuation2.resumeWith(Result.m12363constructorimpl(ResultKt.createFailure(new UserRejectedPermissionsException())));
                        return;
                    }
                }
                PermissionsResponse permissionsResponse2 = map.get("android.permission.WRITE_EXTERNAL_STORAGE");
                if ((permissionsResponse2 != null ? permissionsResponse2.getStatus() : null) == PermissionsStatus.GRANTED) {
                    PermissionsResponse permissionsResponse3 = map.get("android.permission.CAMERA");
                    if ((permissionsResponse3 != null ? permissionsResponse3.getStatus() : null) == PermissionsStatus.GRANTED) {
                        CancellableContinuation<Unit> cancellableContinuation3 = cancellableContinuationImpl2;
                        Result.Companion companion3 = Result.INSTANCE;
                        cancellableContinuation3.resumeWith(Result.m12363constructorimpl(Unit.INSTANCE));
                        return;
                    }
                }
                CancellableContinuation<Unit> cancellableContinuation4 = cancellableContinuationImpl2;
                Result.Companion companion4 = Result.INSTANCE;
                cancellableContinuation4.resumeWith(Result.m12363constructorimpl(ResultKt.createFailure(new UserRejectedPermissionsException())));
            }
        };
        String[] strArr = new String[2];
        strArr[0] = Build.VERSION.SDK_INT < 29 ? "android.permission.WRITE_EXTERNAL_STORAGE" : null;
        strArr[1] = "android.permission.CAMERA";
        String[] strArr2 = (String[]) CollectionsKt.listOfNotNull((Object[]) strArr).toArray(new String[0]);
        permissions.askForPermissions(permissionsResponseListener, (String[]) Arrays.copyOf(strArr2, strArr2.length));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
