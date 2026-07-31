package expo.modules.imagemanipulator;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.tracing.Trace;
import com.amazon.a.a.o.b;
import expo.modules.imagemanipulator.transformers.CropTransformer;
import expo.modules.imagemanipulator.transformers.FlipTransformer;
import expo.modules.imagemanipulator.transformers.ResizeTransformer;
import expo.modules.imagemanipulator.transformers.RotateTransformer;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.classcomponent.ClassComponentBuilder;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.SuspendFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.objects.PropertyComponentBuilderWithThis;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.EitherOfThree;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* compiled from: ImageManipulatorModule.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lexpo/modules/imagemanipulator/ImageManipulatorModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "createManipulatorContext", "Lexpo/modules/imagemanipulator/ImageManipulatorContext;", "url", "Landroid/net/Uri;", "bitmap", "Landroid/graphics/Bitmap;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-image-manipulator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageManipulatorModule extends Module {
    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageManipulatorContext createManipulatorContext(Uri url) {
        return new ImageManipulatorContext(getRuntimeContext(), new ManipulatorTask(getAppContext().getBackgroundCoroutineScope(), new ImageManipulatorModule$createManipulatorContext$loader$1(this, url, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageManipulatorContext createManipulatorContext(Bitmap bitmap) {
        return new ImageManipulatorContext(getRuntimeContext(), new ManipulatorTask(getAppContext().getBackgroundCoroutineScope(), new ImageManipulatorModule$createManipulatorContext$task$1(bitmap, null)));
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        ImageManipulatorModule imageManipulatorModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (imageManipulatorModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(imageManipulatorModule);
            moduleDefinitionBuilder.Name("ExpoImageManipulator");
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
            AnyType[] anyTypeArr = new AnyType[1];
            AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(EitherOfThree.class), false));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(EitherOfThree.class), false, new Function0<KType>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$$inlined$Function$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(EitherOfThree.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(Uri.class)), KTypeProjection.INSTANCE.invariant(Reflection.typeOf(SharedRef.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(Bitmap.class)))), KTypeProjection.INSTANCE.invariant(Reflection.typeOf(SharedRef.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(Drawable.class)))));
                    }
                }), converters);
            }
            anyTypeArr[0] = anyType;
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class));
            if (returnType == null) {
                returnType = new ReturnType(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class));
                returnTypeProvider.getTypes().put(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), returnType);
            }
            moduleDefinitionBuilder2.getSyncFunctions().put("manipulate", new SyncFunctionComponent("manipulate", anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$$inlined$Function$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    Bitmap bitmap;
                    ImageManipulatorContext createManipulatorContext;
                    ImageManipulatorContext createManipulatorContext2;
                    ImageManipulatorContext createManipulatorContext3;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    EitherOfThree eitherOfThree = (EitherOfThree) objArr[0];
                    if (eitherOfThree.isFirstType(Reflection.getOrCreateKotlinClass(Uri.class))) {
                        createManipulatorContext3 = ImageManipulatorModule.this.createManipulatorContext((Uri) eitherOfThree.getFirstType(Reflection.getOrCreateKotlinClass(Uri.class)));
                        return createManipulatorContext3;
                    }
                    if (eitherOfThree.isSecondType(Reflection.getOrCreateKotlinClass(SharedRef.class))) {
                        createManipulatorContext2 = ImageManipulatorModule.this.createManipulatorContext((Bitmap) ((SharedRef) eitherOfThree.getSecondType(Reflection.getOrCreateKotlinClass(SharedRef.class))).getRef());
                        return createManipulatorContext2;
                    }
                    Drawable drawable = (Drawable) ((SharedRef) eitherOfThree.getThirdType(Reflection.getOrCreateKotlinClass(SharedRef.class))).getRef();
                    BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                    if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                        createManipulatorContext = ImageManipulatorModule.this.createManipulatorContext(bitmap);
                        return createManipulatorContext;
                    }
                    throw new Exceptions.IllegalArgument("The drawable cannot be converted to a bitmap", null, 2, null);
                }
            }));
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class);
            Module module = moduleDefinitionBuilder.getModule();
            if (module == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            AppContext appContext = module.getAppContext();
            AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), false));
            ClassComponentBuilder classComponentBuilder = new ClassComponentBuilder(appContext, "Context", orCreateKotlinClass, anyType2 == null ? new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), false, new Function0<KType>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$$inlined$Class$default$1
                @Override // kotlin.jvm.functions.Function0
                public final KType invoke() {
                    return Reflection.typeOf(ImageManipulatorContext.class);
                }
            }), null) : anyType2, moduleDefinitionBuilder.getConverters());
            TypeConverterProvider converters2 = classComponentBuilder.getConverters();
            AnyType[] anyTypeArr2 = new AnyType[1];
            AnyType anyType3 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Uri.class), false));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Uri.class), false, new Function0<KType>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Constructor$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(Uri.class);
                    }
                }), converters2);
            }
            anyTypeArr2[0] = anyType3;
            ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
            ReturnType returnType2 = returnTypeProvider2.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
                returnTypeProvider2.getTypes().put(Reflection.getOrCreateKotlinClass(Object.class), returnType2);
            }
            classComponentBuilder.setConstructor(new SyncFunctionComponent("constructor", anyTypeArr2, returnType2, new Function1<Object[], Object>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Constructor$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    ImageManipulatorContext createManipulatorContext;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    createManipulatorContext = ImageManipulatorModule.this.createManipulatorContext((Uri) objArr[0]);
                    return createManipulatorContext;
                }
            }));
            ClassComponentBuilder classComponentBuilder2 = classComponentBuilder;
            TypeConverterProvider converters3 = classComponentBuilder2.getConverters();
            AnyType[] anyTypeArr3 = new AnyType[2];
            AnyType anyType4 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), false));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), false, new Function0<KType>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(ImageManipulatorContext.class);
                    }
                }), converters3);
            }
            anyTypeArr3[0] = anyType4;
            AnyType anyType5 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ResizeOptions.class), false));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ResizeOptions.class), false, new Function0<KType>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$2
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(ResizeOptions.class);
                    }
                }), converters3);
            }
            anyTypeArr3[1] = anyType5;
            ReturnTypeProvider returnTypeProvider3 = ReturnTypeProvider.INSTANCE;
            ReturnType returnType3 = returnTypeProvider3.getTypes().get(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class));
            if (returnType3 == null) {
                returnType3 = new ReturnType(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class));
                returnTypeProvider3.getTypes().put(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), returnType3);
            }
            classComponentBuilder2.getSyncFunctions().put("resize", new SyncFunctionComponent("resize", anyTypeArr3, returnType3, new Function1<Object[], Object>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    return ((ImageManipulatorContext) objArr[0]).addTransformer(new ResizeTransformer((ResizeOptions) objArr[1]));
                }
            }));
            ClassComponentBuilder classComponentBuilder3 = classComponentBuilder;
            TypeConverterProvider converters4 = classComponentBuilder3.getConverters();
            AnyType[] anyTypeArr4 = new AnyType[2];
            AnyType anyType6 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), false));
            if (anyType6 == null) {
                anyType6 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), false, new Function0<KType>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$4
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(ImageManipulatorContext.class);
                    }
                }), converters4);
            }
            anyTypeArr4[0] = anyType6;
            AnyType anyType7 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Float.class), false));
            if (anyType7 == null) {
                anyType7 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Float.class), false, new Function0<KType>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$5
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(Float.TYPE);
                    }
                }), converters4);
            }
            anyTypeArr4[1] = anyType7;
            ReturnTypeProvider returnTypeProvider4 = ReturnTypeProvider.INSTANCE;
            ReturnType returnType4 = returnTypeProvider4.getTypes().get(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class));
            if (returnType4 == null) {
                returnType4 = new ReturnType(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class));
                returnTypeProvider4.getTypes().put(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), returnType4);
            }
            classComponentBuilder3.getSyncFunctions().put("rotate", new SyncFunctionComponent("rotate", anyTypeArr4, returnType4, new Function1<Object[], Object>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    return ((ImageManipulatorContext) objArr[0]).addTransformer(new RotateTransformer(((Number) objArr[1]).floatValue()));
                }
            }));
            ClassComponentBuilder classComponentBuilder4 = classComponentBuilder;
            TypeConverterProvider converters5 = classComponentBuilder4.getConverters();
            AnyType[] anyTypeArr5 = new AnyType[2];
            AnyType anyType8 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), false));
            if (anyType8 == null) {
                anyType8 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), false, new Function0<KType>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$7
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(ImageManipulatorContext.class);
                    }
                }), converters5);
            }
            anyTypeArr5[0] = anyType8;
            AnyType anyType9 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(FlipType.class), false));
            if (anyType9 == null) {
                anyType9 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(FlipType.class), false, new Function0<KType>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$8
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(FlipType.class);
                    }
                }), converters5);
            }
            anyTypeArr5[1] = anyType9;
            ReturnTypeProvider returnTypeProvider5 = ReturnTypeProvider.INSTANCE;
            ReturnType returnType5 = returnTypeProvider5.getTypes().get(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class));
            if (returnType5 == null) {
                returnType5 = new ReturnType(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class));
                returnTypeProvider5.getTypes().put(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), returnType5);
            }
            classComponentBuilder4.getSyncFunctions().put("flip", new SyncFunctionComponent("flip", anyTypeArr5, returnType5, new Function1<Object[], Object>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    return ((ImageManipulatorContext) objArr[0]).addTransformer(new FlipTransformer((FlipType) objArr[1]));
                }
            }));
            ClassComponentBuilder classComponentBuilder5 = classComponentBuilder;
            TypeConverterProvider converters6 = classComponentBuilder5.getConverters();
            AnyType[] anyTypeArr6 = new AnyType[2];
            AnyType anyType10 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), false));
            if (anyType10 == null) {
                anyType10 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), false, new Function0<KType>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$10
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(ImageManipulatorContext.class);
                    }
                }), converters6);
            }
            anyTypeArr6[0] = anyType10;
            AnyType anyType11 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(CropRect.class), false));
            if (anyType11 == null) {
                anyType11 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(CropRect.class), false, new Function0<KType>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$11
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(CropRect.class);
                    }
                }), converters6);
            }
            anyTypeArr6[1] = anyType11;
            ReturnTypeProvider returnTypeProvider6 = ReturnTypeProvider.INSTANCE;
            ReturnType returnType6 = returnTypeProvider6.getTypes().get(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class));
            if (returnType6 == null) {
                returnType6 = new ReturnType(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class));
                returnTypeProvider6.getTypes().put(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), returnType6);
            }
            classComponentBuilder5.getSyncFunctions().put("crop", new SyncFunctionComponent("crop", anyTypeArr6, returnType6, new Function1<Object[], Object>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    return ((ImageManipulatorContext) objArr[0]).addTransformer(new CropTransformer((CropRect) objArr[1]));
                }
            }));
            ClassComponentBuilder classComponentBuilder6 = classComponentBuilder;
            TypeConverterProvider converters7 = classComponentBuilder6.getConverters();
            AnyType[] anyTypeArr7 = new AnyType[1];
            AnyType anyType12 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), false));
            if (anyType12 == null) {
                anyType12 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), false, new Function0<KType>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$13
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(ImageManipulatorContext.class);
                    }
                }), converters7);
            }
            anyTypeArr7[0] = anyType12;
            ReturnTypeProvider returnTypeProvider7 = ReturnTypeProvider.INSTANCE;
            ReturnType returnType7 = returnTypeProvider7.getTypes().get(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class));
            if (returnType7 == null) {
                returnType7 = new ReturnType(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class));
                returnTypeProvider7.getTypes().put(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), returnType7);
            }
            classComponentBuilder6.getSyncFunctions().put("reset", new SyncFunctionComponent("reset", anyTypeArr7, returnType7, new Function1<Object[], Object>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Function$14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    return ((ImageManipulatorContext) objArr[0]).reset();
                }
            }));
            AsyncFunctionBuilder AsyncFunction = classComponentBuilder.AsyncFunction("renderAsync");
            String name = AsyncFunction.getName();
            TypeConverterProvider converters8 = AsyncFunction.getConverters();
            AnyType[] anyTypeArr8 = new AnyType[1];
            AnyType anyType13 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), false));
            if (anyType13 == null) {
                anyType13 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ImageManipulatorContext.class), false, new Function0<KType>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Coroutine$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(ImageManipulatorContext.class);
                    }
                }), converters8);
            }
            anyTypeArr8[0] = anyType13;
            AsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name, anyTypeArr8, new ImageManipulatorModule$definition$lambda$13$lambda$8$$inlined$Coroutine$2(null, this)));
            moduleDefinitionBuilder.getClassData().add(classComponentBuilder.buildClass());
            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(ImageRef.class);
            Module module2 = moduleDefinitionBuilder.getModule();
            if (module2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            AppContext appContext2 = module2.getAppContext();
            AnyType anyType14 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ImageRef.class), false));
            ClassComponentBuilder classComponentBuilder7 = new ClassComponentBuilder(appContext2, "Image", orCreateKotlinClass2, anyType14 == null ? new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ImageRef.class), false, new Function0<KType>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$$inlined$Class$default$2
                @Override // kotlin.jvm.functions.Function0
                public final KType invoke() {
                    return Reflection.typeOf(ImageRef.class);
                }
            }), null) : anyType14, moduleDefinitionBuilder.getConverters());
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis = new PropertyComponentBuilderWithThis(classComponentBuilder7.getOwnerType().getKType(), "width");
            AnyType[] anyTypeArr9 = {new AnyType(propertyComponentBuilderWithThis.getThisType(), null, 2, null)};
            ReturnTypeProvider returnTypeProvider8 = ReturnTypeProvider.INSTANCE;
            ReturnType returnType8 = returnTypeProvider8.getTypes().get(Reflection.getOrCreateKotlinClass(Integer.class));
            if (returnType8 == null) {
                returnType8 = new ReturnType(Reflection.getOrCreateKotlinClass(Integer.class));
                returnTypeProvider8.getTypes().put(Reflection.getOrCreateKotlinClass(Integer.class), returnType8);
            }
            SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(b.au, anyTypeArr9, returnType8, new Function1<Object[], Object>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$12$$inlined$Property$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Integer.valueOf(((ImageRef) it[0]).getRef().getWidth());
                }
            });
            syncFunctionComponent.setOwnerType(propertyComponentBuilderWithThis.getThisType());
            syncFunctionComponent.setCanTakeOwner(true);
            propertyComponentBuilderWithThis.setGetter(syncFunctionComponent);
            classComponentBuilder7.getProperties().put("width", propertyComponentBuilderWithThis);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis2 = new PropertyComponentBuilderWithThis(classComponentBuilder7.getOwnerType().getKType(), "height");
            AnyType[] anyTypeArr10 = {new AnyType(propertyComponentBuilderWithThis2.getThisType(), null, 2, null)};
            ReturnTypeProvider returnTypeProvider9 = ReturnTypeProvider.INSTANCE;
            ReturnType returnType9 = returnTypeProvider9.getTypes().get(Reflection.getOrCreateKotlinClass(Integer.class));
            if (returnType9 == null) {
                returnType9 = new ReturnType(Reflection.getOrCreateKotlinClass(Integer.class));
                returnTypeProvider9.getTypes().put(Reflection.getOrCreateKotlinClass(Integer.class), returnType9);
            }
            SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent(b.au, anyTypeArr10, returnType9, new Function1<Object[], Object>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$12$$inlined$Property$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Integer.valueOf(((ImageRef) it[0]).getRef().getHeight());
                }
            });
            syncFunctionComponent2.setOwnerType(propertyComponentBuilderWithThis2.getThisType());
            syncFunctionComponent2.setCanTakeOwner(true);
            propertyComponentBuilderWithThis2.setGetter(syncFunctionComponent2);
            classComponentBuilder7.getProperties().put("height", propertyComponentBuilderWithThis2);
            AsyncFunctionBuilder AsyncFunction2 = classComponentBuilder7.AsyncFunction("saveAsync");
            String name2 = AsyncFunction2.getName();
            TypeConverterProvider converters9 = AsyncFunction2.getConverters();
            AnyType[] anyTypeArr11 = new AnyType[2];
            AnyType anyType15 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ImageRef.class), false));
            if (anyType15 == null) {
                anyType15 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ImageRef.class), false, new Function0<KType>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$12$$inlined$Coroutine$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(ImageRef.class);
                    }
                }), converters9);
            }
            anyTypeArr11[0] = anyType15;
            AnyType anyType16 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ManipulateOptions.class), true));
            if (anyType16 == null) {
                anyType16 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ManipulateOptions.class), true, new Function0<KType>() { // from class: expo.modules.imagemanipulator.ImageManipulatorModule$definition$lambda$13$lambda$12$$inlined$Coroutine$2
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(ManipulateOptions.class);
                    }
                }), converters9);
            }
            anyTypeArr11[1] = anyType16;
            AsyncFunction2.setAsyncFunctionComponent(new SuspendFunctionComponent(name2, anyTypeArr11, new ImageManipulatorModule$definition$lambda$13$lambda$12$$inlined$Coroutine$3(null, this)));
            moduleDefinitionBuilder.getClassData().add(classComponentBuilder7.buildClass());
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }
}
