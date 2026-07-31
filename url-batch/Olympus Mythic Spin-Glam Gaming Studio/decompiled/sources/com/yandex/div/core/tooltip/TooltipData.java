package com.yandex.div.core.tooltip;

import androidx.activity.OnBackPressedCallback;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.util.SafePopupWindow;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div2.Div;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTooltipController.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0002\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/div/core/tooltip/TooltipData;", "", "id", "", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "div", "Lcom/yandex/div2/Div;", "popupWindow", "Lcom/yandex/div/core/util/SafePopupWindow;", "ticket", "Lcom/yandex/div/core/DivPreloader$Ticket;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "dismissed", "", "(Ljava/lang/String;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div2/Div;Lcom/yandex/div/core/util/SafePopupWindow;Lcom/yandex/div/core/DivPreloader$Ticket;Landroidx/activity/OnBackPressedCallback;Z)V", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "getDismissed", "()Z", "setDismissed", "(Z)V", "getDiv", "()Lcom/yandex/div2/Div;", "getId", "()Ljava/lang/String;", "getOnBackPressedCallback", "()Landroidx/activity/OnBackPressedCallback;", "getPopupWindow", "()Lcom/yandex/div/core/util/SafePopupWindow;", "getTicket", "()Lcom/yandex/div/core/DivPreloader$Ticket;", "setTicket", "(Lcom/yandex/div/core/DivPreloader$Ticket;)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TooltipData {

    @NotNull
    private final BindingContext bindingContext;
    private boolean dismissed;

    @NotNull
    private final Div div;

    @NotNull
    private final String id;

    @Nullable
    private final OnBackPressedCallback onBackPressedCallback;

    @NotNull
    private final SafePopupWindow popupWindow;

    @Nullable
    private DivPreloader.Ticket ticket;

    public TooltipData(@NotNull String str, @NotNull BindingContext bindingContext, @NotNull Div div, @NotNull SafePopupWindow safePopupWindow, @Nullable DivPreloader.Ticket ticket, @Nullable OnBackPressedCallback onBackPressedCallback, boolean z) {
        this.id = str;
        this.bindingContext = bindingContext;
        this.div = div;
        this.popupWindow = safePopupWindow;
        this.ticket = ticket;
        this.onBackPressedCallback = onBackPressedCallback;
        this.dismissed = z;
    }

    public /* synthetic */ TooltipData(String str, BindingContext bindingContext, Div div, SafePopupWindow safePopupWindow, DivPreloader.Ticket ticket, OnBackPressedCallback onBackPressedCallback, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bindingContext, div, safePopupWindow, (i & 16) != 0 ? null : ticket, onBackPressedCallback, (i & 64) != 0 ? false : z);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final BindingContext getBindingContext() {
        return this.bindingContext;
    }

    @NotNull
    public final Div getDiv() {
        return this.div;
    }

    @NotNull
    public final SafePopupWindow getPopupWindow() {
        return this.popupWindow;
    }

    @Nullable
    public final DivPreloader.Ticket getTicket() {
        return this.ticket;
    }

    public final void setTicket(@Nullable DivPreloader.Ticket ticket) {
        this.ticket = ticket;
    }

    @Nullable
    public final OnBackPressedCallback getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    public final boolean getDismissed() {
        return this.dismissed;
    }

    public final void setDismissed(boolean z) {
        this.dismissed = z;
    }
}
