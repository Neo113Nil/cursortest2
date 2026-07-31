package com.yandex.div.json;

import com.yandex.div.internal.util.JsonNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ParsingException.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/json/ParsingException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "reason", "Lcom/yandex/div/json/ParsingExceptionReason;", "message", "", "cause", "", "source", "Lcom/yandex/div/internal/util/JsonNode;", "jsonSummary", "(Lcom/yandex/div/json/ParsingExceptionReason;Ljava/lang/String;Ljava/lang/Throwable;Lcom/yandex/div/internal/util/JsonNode;Ljava/lang/String;)V", "getJsonSummary", "()Ljava/lang/String;", "getReason", "()Lcom/yandex/div/json/ParsingExceptionReason;", "getSource", "()Lcom/yandex/div/internal/util/JsonNode;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public class ParsingException extends RuntimeException {

    @Nullable
    private final String jsonSummary;

    @NotNull
    private final ParsingExceptionReason reason;

    @Nullable
    private final JsonNode source;

    public /* synthetic */ ParsingException(ParsingExceptionReason parsingExceptionReason, String str, Throwable th, JsonNode jsonNode, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingExceptionReason, str, (i & 4) != 0 ? null : th, (i & 8) != 0 ? null : jsonNode, (i & 16) != 0 ? null : str2);
    }

    @NotNull
    public ParsingExceptionReason getReason() {
        return this.reason;
    }

    @Nullable
    public JsonNode getSource() {
        return this.source;
    }

    @Nullable
    public String getJsonSummary() {
        return this.jsonSummary;
    }

    public ParsingException(@NotNull ParsingExceptionReason parsingExceptionReason, @NotNull String str, @Nullable Throwable th, @Nullable JsonNode jsonNode, @Nullable String str2) {
        super(str, th);
        this.reason = parsingExceptionReason;
        this.source = jsonNode;
        this.jsonSummary = str2;
    }
}
