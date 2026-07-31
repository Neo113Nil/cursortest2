package expo.modules.devmenu.modules;

import android.app.Activity;
import androidx.tracing.Trace;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import expo.interfaces.devmenu.DevMenuManagerInterface;
import expo.modules.devmenu.DevMenuManager;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;

/* compiled from: DevMenuModule.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lexpo/modules/devmenu/modules/DevMenuModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "currentActivity", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevMenuModule extends Module {
    public static final int $stable = 8;

    public final Activity getCurrentActivity() {
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity;
        }
        throw new Exceptions.MissingActivity();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent2;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent3;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent4;
        DevMenuModule devMenuModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (devMenuModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(devMenuModule);
            moduleDefinitionBuilder.Name("ExpoDevMenu");
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            AnyType[] anyTypeArr = new AnyType[0];
            Function1<Object[], Unit> function1 = new Function1<Object[], Unit>() { // from class: expo.modules.devmenu.modules.DevMenuModule$definition$lambda$5$$inlined$AsyncFunction$1
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Object[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    DevMenuManagerInterface.DefaultImpls.openMenu$default(DevMenuManager.INSTANCE, DevMenuModule.this.getCurrentActivity(), null, 2, null);
                    return Unit.INSTANCE;
                }
            };
            if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                            if (Intrinsics.areEqual(Unit.class, String.class)) {
                                untypedAsyncFunctionComponent = new StringAsyncFunctionComponent("openMenu", anyTypeArr, function1);
                            } else {
                                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("openMenu", anyTypeArr, function1);
                            }
                        } else {
                            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent("openMenu", anyTypeArr, function1);
                        }
                    } else {
                        untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent("openMenu", anyTypeArr, function1);
                    }
                } else {
                    untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent("openMenu", anyTypeArr, function1);
                }
            } else {
                untypedAsyncFunctionComponent = new IntAsyncFunctionComponent("openMenu", anyTypeArr, function1);
            }
            moduleDefinitionBuilder2.getAsyncFunctions().put("openMenu", untypedAsyncFunctionComponent);
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            AnyType[] anyTypeArr2 = new AnyType[0];
            Function1<Object[], Unit> function12 = new Function1<Object[], Unit>() { // from class: expo.modules.devmenu.modules.DevMenuModule$definition$lambda$5$$inlined$AsyncFunction$2
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Object[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    DevMenuManager.INSTANCE.closeMenu();
                    return Unit.INSTANCE;
                }
            };
            if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                            if (Intrinsics.areEqual(Unit.class, String.class)) {
                                untypedAsyncFunctionComponent2 = new StringAsyncFunctionComponent("closeMenu", anyTypeArr2, function12);
                            } else {
                                untypedAsyncFunctionComponent2 = new UntypedAsyncFunctionComponent("closeMenu", anyTypeArr2, function12);
                            }
                        } else {
                            untypedAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("closeMenu", anyTypeArr2, function12);
                        }
                    } else {
                        untypedAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("closeMenu", anyTypeArr2, function12);
                    }
                } else {
                    untypedAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("closeMenu", anyTypeArr2, function12);
                }
            } else {
                untypedAsyncFunctionComponent2 = new IntAsyncFunctionComponent("closeMenu", anyTypeArr2, function12);
            }
            moduleDefinitionBuilder3.getAsyncFunctions().put("closeMenu", untypedAsyncFunctionComponent2);
            ModuleDefinitionBuilder moduleDefinitionBuilder4 = moduleDefinitionBuilder;
            AnyType[] anyTypeArr3 = new AnyType[0];
            Function1<Object[], Unit> function13 = new Function1<Object[], Unit>() { // from class: expo.modules.devmenu.modules.DevMenuModule$definition$lambda$5$$inlined$AsyncFunction$3
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Object[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    DevMenuManager.INSTANCE.hideMenu();
                    return Unit.INSTANCE;
                }
            };
            if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                            if (Intrinsics.areEqual(Unit.class, String.class)) {
                                untypedAsyncFunctionComponent3 = new StringAsyncFunctionComponent("hideMenu", anyTypeArr3, function13);
                            } else {
                                untypedAsyncFunctionComponent3 = new UntypedAsyncFunctionComponent("hideMenu", anyTypeArr3, function13);
                            }
                        } else {
                            untypedAsyncFunctionComponent3 = new FloatAsyncFunctionComponent("hideMenu", anyTypeArr3, function13);
                        }
                    } else {
                        untypedAsyncFunctionComponent3 = new DoubleAsyncFunctionComponent("hideMenu", anyTypeArr3, function13);
                    }
                } else {
                    untypedAsyncFunctionComponent3 = new BoolAsyncFunctionComponent("hideMenu", anyTypeArr3, function13);
                }
            } else {
                untypedAsyncFunctionComponent3 = new IntAsyncFunctionComponent("hideMenu", anyTypeArr3, function13);
            }
            moduleDefinitionBuilder4.getAsyncFunctions().put("hideMenu", untypedAsyncFunctionComponent3);
            ModuleDefinitionBuilder moduleDefinitionBuilder5 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(ReadableArray.class, Promise.class)) {
                untypedAsyncFunctionComponent4 = new AsyncFunctionWithPromiseComponent("addDevMenuCallbacks", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.devmenu.modules.DevMenuModule$definition$lambda$5$$inlined$AsyncFunction$4
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        String string;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        ReadableArray readableArray = (ReadableArray) promise;
                        DevMenuManager.INSTANCE.getRegisteredCallbacks().clear();
                        int size = readableArray.size();
                        for (int i = 0; i < size; i++) {
                            ReadableMap map = readableArray.getMap(i);
                            if (map != null && (string = map.getString("name")) != null) {
                                DevMenuManager.INSTANCE.getRegisteredCallbacks().add(new DevMenuManager.Callback(string, map.hasKey("shouldCollapse") ? map.getBoolean("shouldCollapse") : true));
                            }
                        }
                        DevMenuManager.INSTANCE.refreshCustomItems();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder5.getConverters();
                AnyType[] anyTypeArr4 = new AnyType[1];
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ReadableArray.class), false));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ReadableArray.class), false, new Function0<KType>() { // from class: expo.modules.devmenu.modules.DevMenuModule$definition$lambda$5$$inlined$AsyncFunction$5
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(ReadableArray.class);
                        }
                    }), converters);
                }
                anyTypeArr4[0] = anyType;
                Function1<Object[], Unit> function14 = new Function1<Object[], Unit>() { // from class: expo.modules.devmenu.modules.DevMenuModule$definition$lambda$5$$inlined$AsyncFunction$6
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        String string;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        ReadableArray readableArray = (ReadableArray) objArr[0];
                        DevMenuManager.INSTANCE.getRegisteredCallbacks().clear();
                        int size = readableArray.size();
                        for (int i = 0; i < size; i++) {
                            ReadableMap map = readableArray.getMap(i);
                            if (map != null && (string = map.getString("name")) != null) {
                                DevMenuManager.INSTANCE.getRegisteredCallbacks().add(new DevMenuManager.Callback(string, map.hasKey("shouldCollapse") ? map.getBoolean("shouldCollapse") : true));
                            }
                        }
                        DevMenuManager.INSTANCE.refreshCustomItems();
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent4 = new StringAsyncFunctionComponent("addDevMenuCallbacks", anyTypeArr4, function14);
                                } else {
                                    untypedAsyncFunctionComponent4 = new UntypedAsyncFunctionComponent("addDevMenuCallbacks", anyTypeArr4, function14);
                                }
                            } else {
                                untypedAsyncFunctionComponent4 = new FloatAsyncFunctionComponent("addDevMenuCallbacks", anyTypeArr4, function14);
                            }
                        } else {
                            untypedAsyncFunctionComponent4 = new DoubleAsyncFunctionComponent("addDevMenuCallbacks", anyTypeArr4, function14);
                        }
                    } else {
                        untypedAsyncFunctionComponent4 = new BoolAsyncFunctionComponent("addDevMenuCallbacks", anyTypeArr4, function14);
                    }
                } else {
                    untypedAsyncFunctionComponent4 = new IntAsyncFunctionComponent("addDevMenuCallbacks", anyTypeArr4, function14);
                }
            }
            moduleDefinitionBuilder5.getAsyncFunctions().put("addDevMenuCallbacks", untypedAsyncFunctionComponent4);
            moduleDefinitionBuilder.getEventListeners().put(EventName.MODULE_DESTROY, new BasicEventListener(EventName.MODULE_DESTROY, new Function0<Unit>() { // from class: expo.modules.devmenu.modules.DevMenuModule$definition$lambda$5$$inlined$OnDestroy$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    DevMenuManager.INSTANCE.getRegisteredCallbacks().clear();
                }
            }));
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }
}
