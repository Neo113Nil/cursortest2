package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public enum zzhhx {
    DOUBLE(0, 1, zzhiy.DOUBLE),
    FLOAT(1, 1, zzhiy.FLOAT),
    INT64(2, 1, zzhiy.LONG),
    UINT64(3, 1, zzhiy.LONG),
    INT32(4, 1, zzhiy.INT),
    FIXED64(5, 1, zzhiy.LONG),
    FIXED32(6, 1, zzhiy.INT),
    BOOL(7, 1, zzhiy.BOOLEAN),
    STRING(8, 1, zzhiy.STRING),
    MESSAGE(9, 1, zzhiy.MESSAGE),
    BYTES(10, 1, zzhiy.BYTE_STRING),
    UINT32(11, 1, zzhiy.INT),
    ENUM(12, 1, zzhiy.ENUM),
    SFIXED32(13, 1, zzhiy.INT),
    SFIXED64(14, 1, zzhiy.LONG),
    SINT32(15, 1, zzhiy.INT),
    SINT64(16, 1, zzhiy.LONG),
    GROUP(17, 1, zzhiy.MESSAGE),
    DOUBLE_LIST(18, 2, zzhiy.DOUBLE),
    FLOAT_LIST(19, 2, zzhiy.FLOAT),
    INT64_LIST(20, 2, zzhiy.LONG),
    UINT64_LIST(21, 2, zzhiy.LONG),
    INT32_LIST(22, 2, zzhiy.INT),
    FIXED64_LIST(23, 2, zzhiy.LONG),
    FIXED32_LIST(24, 2, zzhiy.INT),
    BOOL_LIST(25, 2, zzhiy.BOOLEAN),
    STRING_LIST(26, 2, zzhiy.STRING),
    MESSAGE_LIST(27, 2, zzhiy.MESSAGE),
    BYTES_LIST(28, 2, zzhiy.BYTE_STRING),
    UINT32_LIST(29, 2, zzhiy.INT),
    ENUM_LIST(30, 2, zzhiy.ENUM),
    SFIXED32_LIST(31, 2, zzhiy.INT),
    SFIXED64_LIST(32, 2, zzhiy.LONG),
    SINT32_LIST(33, 2, zzhiy.INT),
    SINT64_LIST(34, 2, zzhiy.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzhiy.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzhiy.FLOAT),
    INT64_LIST_PACKED(37, 3, zzhiy.LONG),
    UINT64_LIST_PACKED(38, 3, zzhiy.LONG),
    INT32_LIST_PACKED(39, 3, zzhiy.INT),
    FIXED64_LIST_PACKED(40, 3, zzhiy.LONG),
    FIXED32_LIST_PACKED(41, 3, zzhiy.INT),
    BOOL_LIST_PACKED(42, 3, zzhiy.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzhiy.INT),
    ENUM_LIST_PACKED(44, 3, zzhiy.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzhiy.INT),
    SFIXED64_LIST_PACKED(46, 3, zzhiy.LONG),
    SINT32_LIST_PACKED(47, 3, zzhiy.INT),
    SINT64_LIST_PACKED(48, 3, zzhiy.LONG),
    GROUP_LIST(49, 2, zzhiy.MESSAGE),
    MAP(50, 4, zzhiy.VOID);

    private static final zzhhx[] zzaa;
    private final int zzZ;

    static {
        zzhhx[] values = values();
        zzaa = new zzhhx[values.length];
        for (zzhhx zzhhxVar : values) {
            zzaa[zzhhxVar.zzZ] = zzhhxVar;
        }
    }

    zzhhx(int i, int i2, zzhiy zzhiyVar) {
        this.zzZ = i;
        int i3 = i2 - 1;
        if (i3 == 1) {
            zzhiyVar.zza();
        } else if (i3 == 3) {
            zzhiyVar.zza();
        }
        if (i2 == 1) {
            zzhiy zzhiyVar2 = zzhiy.VOID;
            zzhiyVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzZ;
    }
}
