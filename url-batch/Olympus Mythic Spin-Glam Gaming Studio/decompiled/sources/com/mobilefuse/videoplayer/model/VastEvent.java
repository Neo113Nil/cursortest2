package com.mobilefuse.videoplayer.model;

import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastEvent;", "", "eventType", "Lcom/mobilefuse/videoplayer/model/EventType;", X3.i.j0, "", "id", "offset", "Lcom/mobilefuse/videoplayer/model/VastTime;", "url", "(Lcom/mobilefuse/videoplayer/model/EventType;Ljava/lang/String;Ljava/lang/String;Lcom/mobilefuse/videoplayer/model/VastTime;Ljava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "getEventType", "()Lcom/mobilefuse/videoplayer/model/EventType;", "getId", "getOffset", "()Lcom/mobilefuse/videoplayer/model/VastTime;", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes3.dex */
public final /* data */ class VastEvent {

    @Nullable
    private final String eventName;

    @NotNull
    private final EventType eventType;

    @Nullable
    private final String id;

    @Nullable
    private final VastTime offset;

    @Nullable
    private final String url;

    public static /* synthetic */ VastEvent copy$default(VastEvent vastEvent, EventType eventType, String str, String str2, VastTime vastTime, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            eventType = vastEvent.eventType;
        }
        if ((i & 2) != 0) {
            str = vastEvent.eventName;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = vastEvent.id;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            vastTime = vastEvent.offset;
        }
        VastTime vastTime2 = vastTime;
        if ((i & 16) != 0) {
            str3 = vastEvent.url;
        }
        return vastEvent.copy(eventType, str4, str5, vastTime2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final EventType getEventType() {
        return this.eventType;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final VastTime getOffset() {
        return this.offset;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final VastEvent copy(@NotNull EventType eventType, @Nullable String eventName, @Nullable String id, @Nullable VastTime offset, @Nullable String url) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return new VastEvent(eventType, eventName, id, offset, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VastEvent)) {
            return false;
        }
        VastEvent vastEvent = (VastEvent) other;
        return Intrinsics.areEqual(this.eventType, vastEvent.eventType) && Intrinsics.areEqual(this.eventName, vastEvent.eventName) && Intrinsics.areEqual(this.id, vastEvent.id) && Intrinsics.areEqual(this.offset, vastEvent.offset) && Intrinsics.areEqual(this.url, vastEvent.url);
    }

    public int hashCode() {
        EventType eventType = this.eventType;
        int hashCode = (eventType != null ? eventType.hashCode() : 0) * 31;
        String str = this.eventName;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        VastTime vastTime = this.offset;
        int hashCode4 = (hashCode3 + (vastTime != null ? vastTime.hashCode() : 0)) * 31;
        String str3 = this.url;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VastEvent(eventType=" + this.eventType + ", eventName=" + this.eventName + ", id=" + this.id + ", offset=" + this.offset + ", url=" + this.url + ")";
    }

    public VastEvent(@NotNull EventType eventType, @Nullable String str, @Nullable String str2, @Nullable VastTime vastTime, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.eventType = eventType;
        this.eventName = str;
        this.id = str2;
        this.offset = vastTime;
        this.url = str3;
    }

    @NotNull
    public final EventType getEventType() {
        return this.eventType;
    }

    @Nullable
    public final String getEventName() {
        return this.eventName;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final VastTime getOffset() {
        return this.offset;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }
}
