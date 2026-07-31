package com.unity3d.ads.core.data.datasource;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidLifecycleDataSource.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidLifecycleDataSource;", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "Landroidx/lifecycle/LifecycleEventObserver;", "<init>", "()V", "_appActive", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "appActive", "Lkotlinx/coroutines/flow/StateFlow;", "getAppActive", "()Lkotlinx/coroutines/flow/StateFlow;", "registerAppLifecycle", "", "appIsForeground", "onStateChanged", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AndroidLifecycleDataSource implements LifecycleDataSource, LifecycleEventObserver {

    @NotNull
    private final MutableStateFlow _appActive;

    @NotNull
    private final StateFlow appActive;

    /* compiled from: AndroidLifecycleDataSource.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidLifecycleDataSource() {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this._appActive = MutableStateFlow;
        this.appActive = FlowKt.asStateFlow(MutableStateFlow);
        registerAppLifecycle();
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    @NotNull
    public StateFlow getAppActive() {
        return this.appActive;
    }

    private final void registerAppLifecycle() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AndroidLifecycleDataSource$registerAppLifecycle$1(this, null), 3, null);
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public boolean appIsForeground() {
        return ((Boolean) getAppActive().getValue()).booleanValue();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        MutableStateFlow mutableStateFlow = this._appActive;
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        boolean z = true;
        if (i == 1) {
            z = false;
        } else if (i != 2) {
            z = ((Boolean) getAppActive().getValue()).booleanValue();
        }
        mutableStateFlow.setValue(Boolean.valueOf(z));
    }
}
