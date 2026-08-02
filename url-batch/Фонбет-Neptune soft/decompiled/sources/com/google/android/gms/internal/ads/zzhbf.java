package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public enum zzhbf {
    DOUBLE(zzhbg.DOUBLE, 1),
    FLOAT(zzhbg.FLOAT, 5),
    INT64(zzhbg.LONG, 0),
    UINT64(zzhbg.LONG, 0),
    INT32(zzhbg.INT, 0),
    FIXED64(zzhbg.LONG, 1),
    FIXED32(zzhbg.INT, 5),
    BOOL(zzhbg.BOOLEAN, 0),
    STRING(zzhbg.STRING, 2),
    GROUP(zzhbg.MESSAGE, 3),
    MESSAGE(zzhbg.MESSAGE, 2),
    BYTES(zzhbg.BYTE_STRING, 2),
    UINT32(zzhbg.INT, 0),
    ENUM(zzhbg.ENUM, 0),
    SFIXED32(zzhbg.INT, 5),
    SFIXED64(zzhbg.LONG, 1),
    SINT32(zzhbg.INT, 0),
    SINT64(zzhbg.LONG, 0);

    private final zzhbg zzt;

    zzhbf(zzhbg zzhbgVar, int i) {
        this.zzt = zzhbgVar;
    }

    public final zzhbg zza() {
        return this.zzt;
    }
}
