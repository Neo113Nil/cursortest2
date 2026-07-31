package com.yandex.div.storage.database;

import android.database.Cursor;
import com.yandex.div.internal.util.IOUtils;
import java.io.Closeable;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReadState.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u0004H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/storage/database/ReadState;", "Ljava/io/Closeable;", "onCloseState", "Lkotlin/Function0;", "", "cursorProvider", "Ljavax/inject/Provider;", "Landroid/database/Cursor;", "(Lkotlin/jvm/functions/Function0;Ljavax/inject/Provider;)V", "_cursor", "cursor", "getCursor", "()Landroid/database/Cursor;", "close", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReadState implements Closeable {

    @Nullable
    private Cursor _cursor;

    @NotNull
    private final Provider cursorProvider;

    @NotNull
    private final Function0 onCloseState;

    public ReadState(@NotNull Function0 function0, @NotNull Provider provider) {
        this.onCloseState = function0;
        this.cursorProvider = provider;
    }

    public /* synthetic */ ReadState(Function0 function0, Provider provider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function0() { // from class: com.yandex.div.storage.database.ReadState.1
            public final void invoke() {
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }
        } : function0, provider);
    }

    @NotNull
    public final Cursor getCursor() {
        if (this._cursor != null) {
            throw new RuntimeException("Cursor should be called only once");
        }
        Cursor cursor = (Cursor) this.cursorProvider.get();
        this._cursor = cursor;
        return cursor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IOUtils.closeCursorSilently(this._cursor);
        this.onCloseState.mo4828invoke();
    }
}
