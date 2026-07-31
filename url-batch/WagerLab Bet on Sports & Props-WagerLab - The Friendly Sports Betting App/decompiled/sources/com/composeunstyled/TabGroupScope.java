package com.composeunstyled;

import androidx.compose.ui.focus.FocusRequester;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: deprecated.TabGroup.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R$\u0010\b\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\f0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\f0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/composeunstyled/TabGroupScope;", "", "state", "Lcom/composeunstyled/TabGroupState;", "<init>", "(Lcom/composeunstyled/TabGroupState;)V", "getState", "()Lcom/composeunstyled/TabGroupState;", "tabFocusRequesters", "", "", "Lcom/composeunstyled/TabKey;", "Landroidx/compose/ui/focus/FocusRequester;", "getTabFocusRequesters$core_release", "()Ljava/util/Map;", "panelFocusRequesters", "getPanelFocusRequesters$core_release", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TabGroupScope {
    public static final int $stable = 8;
    private final Map<String, FocusRequester> panelFocusRequesters;
    private final TabGroupState state;
    private final Map<String, FocusRequester> tabFocusRequesters;

    public TabGroupScope(TabGroupState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.tabFocusRequesters = new LinkedHashMap();
        this.panelFocusRequesters = new LinkedHashMap();
    }

    public final TabGroupState getState() {
        return this.state;
    }

    public final Map<String, FocusRequester> getTabFocusRequesters$core_release() {
        return this.tabFocusRequesters;
    }

    public final Map<String, FocusRequester> getPanelFocusRequesters$core_release() {
        return this.panelFocusRequesters;
    }
}
