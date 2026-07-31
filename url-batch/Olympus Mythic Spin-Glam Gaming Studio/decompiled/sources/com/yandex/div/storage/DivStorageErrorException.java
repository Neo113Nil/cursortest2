package com.yandex.div.storage;

import com.yandex.div.storage.database.StorageException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivStorageErrorException.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div/storage/DivStorageErrorException;", "Lcom/yandex/div/storage/database/StorageException;", "errorMessage", "", "cause", "", "cardId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "Companion", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DivStorageErrorException extends StorageException {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    public DivStorageErrorException() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ DivStorageErrorException(String str, Throwable th, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : str2);
    }

    /* compiled from: DivStorageErrorException.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/storage/DivStorageErrorException$Companion;", "", "()V", "getMessage", "", "errorMessage", "cardId", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
        
            if (r3 == null) goto L6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String getMessage(String errorMessage, String cardId) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(errorMessage);
            if (cardId != null) {
                str = " Card id: " + cardId;
            }
            str = "";
            sb.append(str);
            return sb.toString();
        }
    }

    public DivStorageErrorException(@NotNull String str, @Nullable Throwable th, @Nullable String str2) {
        super(INSTANCE.getMessage(str, str2), th, str2);
    }
}
