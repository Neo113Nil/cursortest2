package io.bidmachine.rendering.model;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.bidmachine.iab.script.ScriptWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0002/0B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJP\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\u000f¨\u00061"}, d2 = {"Lio/bidmachine/rendering/model/ScriptConfig;", "", "", "scriptId", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "Lio/bidmachine/rendering/model/ScriptConfig$Type;", "type", "", "forMainFrameOnly", "source", "messageHandler", "<init>", "(Ljava/lang/String;ILio/bidmachine/rendering/model/ScriptConfig$Type;ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Lio/bidmachine/rendering/model/ScriptConfig$Type;", "component4", "()Z", "component5", "component6", "copy", "(Ljava/lang/String;ILio/bidmachine/rendering/model/ScriptConfig$Type;ZLjava/lang/String;Ljava/lang/String;)Lio/bidmachine/rendering/model/ScriptConfig;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getScriptId", "b", "I", "getPriority", "c", "Lio/bidmachine/rendering/model/ScriptConfig$Type;", "getType", "d", "Z", "getForMainFrameOnly", EidRequestBuilder.REQUEST_FIELD_EMAIL, "getSource", InneractiveMediationDefs.GENDER_FEMALE, "getMessageHandler", "Companion", "Type", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ScriptConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata and from toString */
    private final String scriptId;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private final int priority;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    private final Type type;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean forMainFrameOnly;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    private final String source;

    /* renamed from: f, reason: from kotlin metadata and from toString */
    private final String messageHandler;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lio/bidmachine/rendering/model/ScriptConfig$Companion;", "", "()V", "createInline", "Lio/bidmachine/rendering/model/ScriptConfig;", "scriptId", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "source", "appendTags", "", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ScriptConfig createInline$default(Companion companion, String str, int i, String str2, boolean z, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                z = false;
            }
            return companion.createInline(str, i, str2, z);
        }

        @NotNull
        public final ScriptConfig createInline(@NotNull String scriptId, int i, @NotNull String source) {
            Intrinsics.checkNotNullParameter(scriptId, "scriptId");
            Intrinsics.checkNotNullParameter(source, "source");
            return createInline$default(this, scriptId, i, source, false, 8, null);
        }

        private Companion() {
        }

        @NotNull
        public final ScriptConfig createInline(@NotNull String scriptId, int priority, @NotNull String source, boolean appendTags) {
            Intrinsics.checkNotNullParameter(scriptId, "scriptId");
            Intrinsics.checkNotNullParameter(source, "source");
            Type type = Type.InlineTag;
            if (appendTags) {
                source = ScriptWrapper.wrap(source);
            }
            return new ScriptConfig(scriptId, priority, type, true, source, null, 32, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/bidmachine/rendering/model/ScriptConfig$Type;", "", "(Ljava/lang/String;I)V", "DocumentStart", "DocumentEnd", "InlineTag", "Runtime", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Type {
        DocumentStart,
        DocumentEnd,
        InlineTag,
        Runtime
    }

    public ScriptConfig(@NotNull String scriptId, int i, @Nullable Type type, boolean z, @NotNull String source, @Nullable String str) {
        Intrinsics.checkNotNullParameter(scriptId, "scriptId");
        Intrinsics.checkNotNullParameter(source, "source");
        this.scriptId = scriptId;
        this.priority = i;
        this.type = type;
        this.forMainFrameOnly = z;
        this.source = source;
        this.messageHandler = str;
    }

    public static /* synthetic */ ScriptConfig copy$default(ScriptConfig scriptConfig, String str, int i, Type type, boolean z, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = scriptConfig.scriptId;
        }
        if ((i2 & 2) != 0) {
            i = scriptConfig.priority;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            type = scriptConfig.type;
        }
        Type type2 = type;
        if ((i2 & 8) != 0) {
            z = scriptConfig.forMainFrameOnly;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            str2 = scriptConfig.source;
        }
        String str4 = str2;
        if ((i2 & 32) != 0) {
            str3 = scriptConfig.messageHandler;
        }
        return scriptConfig.copy(str, i3, type2, z2, str4, str3);
    }

    @NotNull
    public static final ScriptConfig createInline(@NotNull String str, int i, @NotNull String str2) {
        return INSTANCE.createInline(str, i, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getScriptId() {
        return this.scriptId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getForMainFrameOnly() {
        return this.forMainFrameOnly;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getMessageHandler() {
        return this.messageHandler;
    }

    @NotNull
    public final ScriptConfig copy(@NotNull String scriptId, int priority, @Nullable Type type, boolean forMainFrameOnly, @NotNull String source, @Nullable String messageHandler) {
        Intrinsics.checkNotNullParameter(scriptId, "scriptId");
        Intrinsics.checkNotNullParameter(source, "source");
        return new ScriptConfig(scriptId, priority, type, forMainFrameOnly, source, messageHandler);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScriptConfig)) {
            return false;
        }
        ScriptConfig scriptConfig = (ScriptConfig) other;
        return Intrinsics.areEqual(this.scriptId, scriptConfig.scriptId) && this.priority == scriptConfig.priority && this.type == scriptConfig.type && this.forMainFrameOnly == scriptConfig.forMainFrameOnly && Intrinsics.areEqual(this.source, scriptConfig.source) && Intrinsics.areEqual(this.messageHandler, scriptConfig.messageHandler);
    }

    public final boolean getForMainFrameOnly() {
        return this.forMainFrameOnly;
    }

    @Nullable
    public final String getMessageHandler() {
        return this.messageHandler;
    }

    public final int getPriority() {
        return this.priority;
    }

    @NotNull
    public final String getScriptId() {
        return this.scriptId;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final Type getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.scriptId.hashCode() * 31) + Integer.hashCode(this.priority)) * 31;
        Type type = this.type;
        int hashCode2 = (hashCode + (type == null ? 0 : type.hashCode())) * 31;
        boolean z = this.forMainFrameOnly;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode3 = (((hashCode2 + i) * 31) + this.source.hashCode()) * 31;
        String str = this.messageHandler;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ScriptConfig(scriptId=" + this.scriptId + ", priority=" + this.priority + ", type=" + this.type + ", forMainFrameOnly=" + this.forMainFrameOnly + ", source=" + this.source + ", messageHandler=" + this.messageHandler + ')';
    }

    @NotNull
    public static final ScriptConfig createInline(@NotNull String str, int i, @NotNull String str2, boolean z) {
        return INSTANCE.createInline(str, i, str2, z);
    }

    public /* synthetic */ ScriptConfig(String str, int i, Type type, boolean z, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, type, z, str2, (i2 & 32) != 0 ? null : str3);
    }
}
