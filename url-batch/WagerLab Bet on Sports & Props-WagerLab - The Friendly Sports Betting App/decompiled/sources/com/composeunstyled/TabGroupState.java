package com.composeunstyled;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: deprecated.TabGroup.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR3\u0010\f\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u000b\u001a\u00060\u0003j\u0002`\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R;\u0010\u0013\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u000e\u0010\u000b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/composeunstyled/TabGroupState;", "", "initialTab", "", "Lcom/composeunstyled/TabKey;", "tabs", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTabs$core_release", "()Ljava/util/List;", "<set-?>", "selectedTab", "getSelectedTab", "()Ljava/lang/String;", "setSelectedTab", "(Ljava/lang/String;)V", "selectedTab$delegate", "Landroidx/compose/runtime/MutableState;", "focusedTab", "getFocusedTab", "setFocusedTab", "focusedTab$delegate", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TabGroupState {
    public static final int $stable = 8;

    /* renamed from: focusedTab$delegate, reason: from kotlin metadata */
    private final MutableState focusedTab;

    /* renamed from: selectedTab$delegate, reason: from kotlin metadata */
    private final MutableState selectedTab;
    private final List<String> tabs;

    public TabGroupState(String initialTab, List<String> tabs) {
        Intrinsics.checkNotNullParameter(initialTab, "initialTab");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.tabs = tabs;
        this.selectedTab = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(initialTab, null, 2, null);
        this.focusedTab = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public final List<String> getTabs$core_release() {
        return this.tabs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getSelectedTab() {
        return (String) this.selectedTab.getValue();
    }

    public final void setSelectedTab(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectedTab.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getFocusedTab() {
        return (String) this.focusedTab.getValue();
    }

    public final void setFocusedTab(String str) {
        this.focusedTab.setValue(str);
    }
}
