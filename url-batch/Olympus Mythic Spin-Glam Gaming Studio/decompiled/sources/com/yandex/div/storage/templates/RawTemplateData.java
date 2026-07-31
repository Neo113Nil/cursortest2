package com.yandex.div.storage.templates;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: RawTemplateData.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/storage/templates/RawTemplateData;", "", "hash", "", "data", "", "(Ljava/lang/String;[B)V", "getData", "()[B", "getHash", "()Ljava/lang/String;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RawTemplateData {

    @NotNull
    private final byte[] data;

    @NotNull
    private final String hash;

    public RawTemplateData(@NotNull String str, @NotNull byte[] bArr) {
        this.hash = str;
        this.data = bArr;
    }

    @NotNull
    public final String getHash() {
        return this.hash;
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }
}
