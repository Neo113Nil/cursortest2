package com.yandex.div.core.util;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AlertDialog;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SafeAlertDialogBuilder.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\rJ\u001a\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0018J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u001a\u001a\u00020\u00002\b\b\u0001\u0010\u001c\u001a\u00020\rJ\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0006\u0010 \u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/yandex/div/core/util/SafeAlertDialogBuilder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "alertDialogBuilder", "Landroidx/appcompat/app/AlertDialog$Builder;", "create", "Lcom/yandex/div/core/util/SafeAlertDialog;", "setMessage", "message", "", "messageId", "", "setNegativeButton", "textId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/content/DialogInterface$OnClickListener;", "text", "", "setOnCancelListener", "onCancelListener", "Landroid/content/DialogInterface$OnCancelListener;", "setOnDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "setPositiveButton", "setTitle", "title", "titleId", "setView", "view", "Landroid/view/View;", "show", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SafeAlertDialogBuilder {

    @NotNull
    private final AlertDialog.Builder alertDialogBuilder;

    public SafeAlertDialogBuilder(@NotNull Context context) {
        this.alertDialogBuilder = new AlertDialog.Builder(context);
    }

    @NotNull
    public final SafeAlertDialogBuilder setView(@Nullable View view) {
        if (view != null) {
            view.setFilterTouchesWhenObscured(true);
        }
        this.alertDialogBuilder.setView(view);
        return this;
    }

    @NotNull
    public final SafeAlertDialogBuilder setTitle(@StringRes int titleId) {
        this.alertDialogBuilder.setTitle(titleId);
        return this;
    }

    @NotNull
    public final SafeAlertDialogBuilder setTitle(@Nullable CharSequence title) {
        this.alertDialogBuilder.setTitle(title);
        return this;
    }

    @NotNull
    public final SafeAlertDialogBuilder setMessage(@StringRes int messageId) {
        this.alertDialogBuilder.setMessage(messageId);
        return this;
    }

    @NotNull
    public final SafeAlertDialogBuilder setMessage(@Nullable CharSequence message) {
        this.alertDialogBuilder.setMessage(message);
        return this;
    }

    @NotNull
    public final SafeAlertDialogBuilder setPositiveButton(@StringRes int textId, @Nullable DialogInterface.OnClickListener listener) {
        this.alertDialogBuilder.setPositiveButton(textId, listener);
        return this;
    }

    @NotNull
    public final SafeAlertDialogBuilder setPositiveButton(@NotNull String text, @Nullable DialogInterface.OnClickListener listener) {
        this.alertDialogBuilder.setPositiveButton(text, listener);
        return this;
    }

    @NotNull
    public final SafeAlertDialogBuilder setNegativeButton(@StringRes int textId, @Nullable DialogInterface.OnClickListener listener) {
        this.alertDialogBuilder.setNegativeButton(textId, listener);
        return this;
    }

    @NotNull
    public final SafeAlertDialogBuilder setNegativeButton(@NotNull String text, @Nullable DialogInterface.OnClickListener listener) {
        this.alertDialogBuilder.setNegativeButton(text, listener);
        return this;
    }

    @NotNull
    public final SafeAlertDialogBuilder setOnCancelListener(@Nullable DialogInterface.OnCancelListener onCancelListener) {
        this.alertDialogBuilder.setOnCancelListener(onCancelListener);
        return this;
    }

    @NotNull
    public final SafeAlertDialogBuilder setOnDismissListener(@Nullable DialogInterface.OnDismissListener listener) {
        this.alertDialogBuilder.setOnDismissListener(listener);
        return this;
    }

    @NotNull
    public final SafeAlertDialog create() {
        return new SafeAlertDialog(this.alertDialogBuilder.create());
    }

    @NotNull
    public final SafeAlertDialog show() {
        SafeAlertDialog create = create();
        create.show();
        return create;
    }
}
