package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MutableMultiplePermissionsState.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032 \b\u0002\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0001¢\u0006\u0002\u0010\n\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"rememberMutableMultiplePermissionsState", "Lcom/google/accompanist/permissions/MultiplePermissionsState;", "permissions", "", "", "onPermissionsResult", "Lkotlin/Function1;", "", "", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/google/accompanist/permissions/MultiplePermissionsState;", "rememberMutablePermissionsState", "Lcom/google/accompanist/permissions/MutablePermissionState;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "permissions_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MutableMultiplePermissionsStateKt {
    public static final MultiplePermissionsState rememberMutableMultiplePermissionsState(List<String> permissions, final Function1<? super Map<String, Boolean>, Unit> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        composer.startReplaceableGroup(-2044770427);
        if ((i2 & 2) != 0) {
            function1 = new Function1<Map<String, ? extends Boolean>, Unit>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Map<String, Boolean> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Boolean> map) {
                    invoke2((Map<String, Boolean>) map);
                    return Unit.INSTANCE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2044770427, i, -1, "com.google.accompanist.permissions.rememberMutableMultiplePermissionsState (MutableMultiplePermissionsState.kt:45)");
        }
        List<MutablePermissionState> rememberMutablePermissionsState = rememberMutablePermissionsState(permissions, composer, 8);
        PermissionsUtilKt.PermissionsLifecycleCheckerEffect(rememberMutablePermissionsState, null, composer, 8, 2);
        composer.startReplaceableGroup(-1585748799);
        boolean changed = composer.changed(permissions);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new MutableMultiplePermissionsState(rememberMutablePermissionsState);
            composer.updateRememberedValue(rememberedValue);
        }
        final MutableMultiplePermissionsState mutableMultiplePermissionsState = (MutableMultiplePermissionsState) rememberedValue;
        composer.endReplaceableGroup();
        ActivityResultContracts.RequestMultiplePermissions requestMultiplePermissions = new ActivityResultContracts.RequestMultiplePermissions();
        composer.startReplaceableGroup(-1585748493);
        boolean changed2 = ((((i & 112) ^ 48) > 32 && composer.changedInstance(function1)) || (i & 48) == 32) | composer.changed(mutableMultiplePermissionsState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (Function1) new Function1<Map<String, Boolean>, Unit>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$launcher$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Map<String, Boolean> map) {
                    invoke2(map);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Map<String, Boolean> permissionsResult) {
                    Intrinsics.checkNotNullParameter(permissionsResult, "permissionsResult");
                    MutableMultiplePermissionsState.this.updatePermissionsStatus$permissions_release(permissionsResult);
                    function1.invoke(permissionsResult);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        final ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions, (Function1) rememberedValue2, composer, 8);
        EffectsKt.DisposableEffect(mutableMultiplePermissionsState, rememberLauncherForActivityResult, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                MutableMultiplePermissionsState.this.setLauncher$permissions_release(rememberLauncherForActivityResult);
                final MutableMultiplePermissionsState mutableMultiplePermissionsState2 = MutableMultiplePermissionsState.this;
                return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        MutableMultiplePermissionsState.this.setLauncher$permissions_release(null);
                    }
                };
            }
        }, composer, ManagedActivityResultLauncher.$stable << 3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableMultiplePermissionsState;
    }

    private static final List<MutablePermissionState> rememberMutablePermissionsState(List<String> list, Composer composer, int i) {
        composer.startReplaceableGroup(992349447);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(992349447, i, -1, "com.google.accompanist.permissions.rememberMutablePermissionsState (MutableMultiplePermissionsState.kt:76)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) consume;
        Activity findActivity = PermissionsUtilKt.findActivity(context);
        composer.startReplaceableGroup(-1458104306);
        boolean changed = composer.changed(list);
        ArrayList rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new MutablePermissionState((String) it.next(), context, findActivity));
            }
            rememberedValue = arrayList;
            composer.updateRememberedValue(rememberedValue);
        }
        List<MutablePermissionState> list3 = (List) rememberedValue;
        composer.endReplaceableGroup();
        for (final MutablePermissionState mutablePermissionState : list3) {
            composer.startMovableGroup(-1458104076, mutablePermissionState.getPermission());
            ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
            composer.startReplaceableGroup(-1458103836);
            boolean changed2 = composer.changed(mutablePermissionState);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function1) new Function1<Boolean, Unit>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$launcher$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        MutablePermissionState.this.refreshPermissionStatus$permissions_release();
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            final ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (Function1) rememberedValue2, composer, 8);
            EffectsKt.DisposableEffect(rememberLauncherForActivityResult, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    MutablePermissionState.this.setLauncher$permissions_release(rememberLauncherForActivityResult);
                    final MutablePermissionState mutablePermissionState2 = MutablePermissionState.this;
                    return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            MutablePermissionState.this.setLauncher$permissions_release(null);
                        }
                    };
                }
            }, composer, ManagedActivityResultLauncher.$stable);
            composer.endMovableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return list3;
    }
}
