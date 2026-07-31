package com.composeunstyled;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusRequester;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TabGroup.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R;\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR;\u0010\u000e\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR?\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00122\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017RK\u0010\u001b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u001a0\u00192\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u001a0\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\r\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fRK\u0010!\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u001a0\u00192\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u001a0\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\r\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001f¨\u0006%"}, d2 = {"Lcom/composeunstyled/TabsRegistry;", "", "<init>", "()V", "<set-?>", "", "Lcom/composeunstyled/TabKey;", "focusedTab", "getFocusedTab", "()Ljava/lang/String;", "setFocusedTab", "(Ljava/lang/String;)V", "focusedTab$delegate", "Landroidx/compose/runtime/MutableState;", "activatedTab", "getActivatedTab", "setActivatedTab", "activatedTab$delegate", "", "tabKeys", "getTabKeys", "()Ljava/util/List;", "setTabKeys", "(Ljava/util/List;)V", "tabKeys$delegate", "", "Landroidx/compose/ui/focus/FocusRequester;", "tabFocusRequesters", "getTabFocusRequesters", "()Ljava/util/Map;", "setTabFocusRequesters", "(Ljava/util/Map;)V", "tabFocusRequesters$delegate", "panelsFocusRequesters", "getPanelsFocusRequesters", "setPanelsFocusRequesters", "panelsFocusRequesters$delegate", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TabsRegistry {

    /* renamed from: focusedTab$delegate, reason: from kotlin metadata */
    private final MutableState focusedTab = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: activatedTab$delegate, reason: from kotlin metadata */
    private final MutableState activatedTab = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: tabKeys$delegate, reason: from kotlin metadata */
    private final MutableState tabKeys = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);

    /* renamed from: tabFocusRequesters$delegate, reason: from kotlin metadata */
    private final MutableState tabFocusRequesters = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);

    /* renamed from: panelsFocusRequesters$delegate, reason: from kotlin metadata */
    private final MutableState panelsFocusRequesters = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public final String getFocusedTab() {
        return (String) this.focusedTab.getValue();
    }

    public final void setFocusedTab(String str) {
        this.focusedTab.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getActivatedTab() {
        return (String) this.activatedTab.getValue();
    }

    public final void setActivatedTab(String str) {
        this.activatedTab.setValue(str);
    }

    public final List<String> getTabKeys() {
        return (List) this.tabKeys.getValue();
    }

    public final void setTabKeys(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tabKeys.setValue(list);
    }

    public final Map<String, FocusRequester> getTabFocusRequesters() {
        return (Map) this.tabFocusRequesters.getValue();
    }

    public final void setTabFocusRequesters(Map<String, FocusRequester> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.tabFocusRequesters.setValue(map);
    }

    public final Map<String, FocusRequester> getPanelsFocusRequesters() {
        return (Map) this.panelsFocusRequesters.getValue();
    }

    public final void setPanelsFocusRequesters(Map<String, FocusRequester> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.panelsFocusRequesters.setValue(map);
    }
}
