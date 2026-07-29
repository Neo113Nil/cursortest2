package com.devanos.nilufar.usmonova.p7.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import o.AbstractC0048Bt;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/devanos/nilufar/usmonova/p7/data/network/dto/PushPayloadDto;", "", "m8t3rx", "", "g9n4zr", "c2h8vn", "j5a9kf", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getM8t3rx", "()Ljava/lang/String;", "getG9n4zr", "getC2h8vn", "getJ5a9kf", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PushPayloadDto {
    public static final int $stable = 0;
    private final String c2h8vn;
    private final String g9n4zr;
    private final String j5a9kf;
    private final String m8t3rx;

    public PushPayloadDto(@Json(name = "m8t3rx") String str, @Json(name = "g9n4zr") String str2, @Json(name = "c2h8vn") String str3, @Json(name = "j5a9kf") String str4) {
        AbstractC0048Bt.n(str, "m8t3rx");
        AbstractC0048Bt.n(str2, "g9n4zr");
        AbstractC0048Bt.n(str3, "c2h8vn");
        AbstractC0048Bt.n(str4, "j5a9kf");
        this.m8t3rx = str;
        this.g9n4zr = str2;
        this.c2h8vn = str3;
        this.j5a9kf = str4;
    }

    public static /* synthetic */ PushPayloadDto copy$default(PushPayloadDto pushPayloadDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushPayloadDto.m8t3rx;
        }
        if ((i & 2) != 0) {
            str2 = pushPayloadDto.g9n4zr;
        }
        if ((i & 4) != 0) {
            str3 = pushPayloadDto.c2h8vn;
        }
        if ((i & 8) != 0) {
            str4 = pushPayloadDto.j5a9kf;
        }
        return pushPayloadDto.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getM8t3rx() {
        return this.m8t3rx;
    }

    /* renamed from: component2, reason: from getter */
    public final String getG9n4zr() {
        return this.g9n4zr;
    }

    /* renamed from: component3, reason: from getter */
    public final String getC2h8vn() {
        return this.c2h8vn;
    }

    /* renamed from: component4, reason: from getter */
    public final String getJ5a9kf() {
        return this.j5a9kf;
    }

    public final PushPayloadDto copy(@Json(name = "m8t3rx") String m8t3rx, @Json(name = "g9n4zr") String g9n4zr, @Json(name = "c2h8vn") String c2h8vn, @Json(name = "j5a9kf") String j5a9kf) {
        AbstractC0048Bt.n(m8t3rx, "m8t3rx");
        AbstractC0048Bt.n(g9n4zr, "g9n4zr");
        AbstractC0048Bt.n(c2h8vn, "c2h8vn");
        AbstractC0048Bt.n(j5a9kf, "j5a9kf");
        return new PushPayloadDto(m8t3rx, g9n4zr, c2h8vn, j5a9kf);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushPayloadDto)) {
            return false;
        }
        PushPayloadDto pushPayloadDto = (PushPayloadDto) other;
        return AbstractC0048Bt.h(this.m8t3rx, pushPayloadDto.m8t3rx) && AbstractC0048Bt.h(this.g9n4zr, pushPayloadDto.g9n4zr) && AbstractC0048Bt.h(this.c2h8vn, pushPayloadDto.c2h8vn) && AbstractC0048Bt.h(this.j5a9kf, pushPayloadDto.j5a9kf);
    }

    public final String getC2h8vn() {
        return this.c2h8vn;
    }

    public final String getG9n4zr() {
        return this.g9n4zr;
    }

    public final String getJ5a9kf() {
        return this.j5a9kf;
    }

    public final String getM8t3rx() {
        return this.m8t3rx;
    }

    public int hashCode() {
        return this.j5a9kf.hashCode() + ((this.c2h8vn.hashCode() + ((this.g9n4zr.hashCode() + (this.m8t3rx.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "PushPayloadDto(m8t3rx=" + this.m8t3rx + ", g9n4zr=" + this.g9n4zr + ", c2h8vn=" + this.c2h8vn + ", j5a9kf=" + this.j5a9kf + ")";
    }
}
