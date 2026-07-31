package com.google.protobuf;

import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.ByteString;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes12.dex */
final class MessageSchema implements Schema {
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final UnknownFieldSchema unknownFieldSchema;
    private final boolean useCachedSizeField;

    private static boolean isEnforceUtf8(int i) {
        return (i & 536870912) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int i) {
        return (i & Integer.MIN_VALUE) != 0;
    }

    private static boolean isRequired(int i) {
        return (i & 268435456) != 0;
    }

    private static long offset(int i) {
        return i & 1048575;
    }

    private static int type(int i) {
        return (i & 267386880) >>> 20;
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, ProtoSyntax protoSyntax, boolean z, int[] iArr2, int i3, int i4, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i2;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.syntax = protoSyntax;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z;
        this.intArray = iArr2;
        this.checkInitializedCount = i3;
        this.repeatedFieldOffsetStart = i4;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    static MessageSchema newSchema(Class cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof RawMessageInfo) {
            return newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        return newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static MessageSchema newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        int i17;
        int i18;
        String str;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        java.lang.reflect.Field reflectField;
        int i24;
        char charAt11;
        int i25;
        int i26;
        Object obj;
        java.lang.reflect.Field reflectField2;
        Object obj2;
        java.lang.reflect.Field reflectField3;
        int i27;
        char charAt12;
        int i28;
        char charAt13;
        int i29;
        char charAt14;
        int i30;
        char charAt15;
        String stringInfo = rawMessageInfo.getStringInfo();
        int length = stringInfo.length();
        char c = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (stringInfo.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int charAt16 = stringInfo.charAt(i);
        if (charAt16 >= 55296) {
            int i33 = charAt16 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                charAt15 = stringInfo.charAt(i32);
                if (charAt15 < 55296) {
                    break;
                }
                i33 |= (charAt15 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            charAt16 = i33 | (charAt15 << i34);
            i32 = i30;
        }
        if (charAt16 == 0) {
            charAt = 0;
            charAt2 = 0;
            i5 = 0;
            i6 = 0;
            i2 = 0;
            i4 = 0;
            iArr = EMPTY_INT_ARRAY;
            i3 = 0;
        } else {
            int i35 = i32 + 1;
            int charAt17 = stringInfo.charAt(i32);
            if (charAt17 >= 55296) {
                int i36 = charAt17 & 8191;
                int i37 = 13;
                while (true) {
                    i14 = i35 + 1;
                    charAt10 = stringInfo.charAt(i35);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i36 |= (charAt10 & 8191) << i37;
                    i37 += 13;
                    i35 = i14;
                }
                charAt17 = i36 | (charAt10 << i37);
                i35 = i14;
            }
            int i38 = i35 + 1;
            int charAt18 = stringInfo.charAt(i35);
            if (charAt18 >= 55296) {
                int i39 = charAt18 & 8191;
                int i40 = 13;
                while (true) {
                    i13 = i38 + 1;
                    charAt9 = stringInfo.charAt(i38);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i39 |= (charAt9 & 8191) << i40;
                    i40 += 13;
                    i38 = i13;
                }
                charAt18 = i39 | (charAt9 << i40);
                i38 = i13;
            }
            int i41 = i38 + 1;
            int charAt19 = stringInfo.charAt(i38);
            if (charAt19 >= 55296) {
                int i42 = charAt19 & 8191;
                int i43 = 13;
                while (true) {
                    i12 = i41 + 1;
                    charAt8 = stringInfo.charAt(i41);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i42 |= (charAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i12;
                }
                charAt19 = i42 | (charAt8 << i43);
                i41 = i12;
            }
            int i44 = i41 + 1;
            int charAt20 = stringInfo.charAt(i41);
            if (charAt20 >= 55296) {
                int i45 = charAt20 & 8191;
                int i46 = 13;
                while (true) {
                    i11 = i44 + 1;
                    charAt7 = stringInfo.charAt(i44);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i45 |= (charAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i11;
                }
                charAt20 = i45 | (charAt7 << i46);
                i44 = i11;
            }
            int i47 = i44 + 1;
            charAt = stringInfo.charAt(i44);
            if (charAt >= 55296) {
                int i48 = charAt & 8191;
                int i49 = 13;
                while (true) {
                    i10 = i47 + 1;
                    charAt6 = stringInfo.charAt(i47);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i48 |= (charAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i10;
                }
                charAt = i48 | (charAt6 << i49);
                i47 = i10;
            }
            int i50 = i47 + 1;
            charAt2 = stringInfo.charAt(i47);
            if (charAt2 >= 55296) {
                int i51 = charAt2 & 8191;
                int i52 = 13;
                while (true) {
                    i9 = i50 + 1;
                    charAt5 = stringInfo.charAt(i50);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i51 |= (charAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i9;
                }
                charAt2 = i51 | (charAt5 << i52);
                i50 = i9;
            }
            int i53 = i50 + 1;
            int charAt21 = stringInfo.charAt(i50);
            if (charAt21 >= 55296) {
                int i54 = charAt21 & 8191;
                int i55 = 13;
                while (true) {
                    i8 = i53 + 1;
                    charAt4 = stringInfo.charAt(i53);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i54 |= (charAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i8;
                }
                charAt21 = i54 | (charAt4 << i55);
                i53 = i8;
            }
            int i56 = i53 + 1;
            int charAt22 = stringInfo.charAt(i53);
            if (charAt22 >= 55296) {
                int i57 = charAt22 & 8191;
                int i58 = 13;
                while (true) {
                    i7 = i56 + 1;
                    charAt3 = stringInfo.charAt(i56);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i57 |= (charAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i7;
                }
                charAt22 = i57 | (charAt3 << i58);
                i56 = i7;
            }
            i2 = (charAt17 * 2) + charAt18;
            i3 = charAt17;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i4 = charAt22;
            i32 = i56;
            i5 = charAt19;
            i6 = charAt20;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = rawMessageInfo.getObjects();
        Class<?> cls = rawMessageInfo.getDefaultInstance().getClass();
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr = new Object[charAt * 2];
        int i59 = i4 + charAt2;
        int i60 = i4;
        int i61 = i59;
        int i62 = 0;
        int i63 = 0;
        while (i32 < length) {
            int i64 = i32 + 1;
            int charAt23 = stringInfo.charAt(i32);
            if (charAt23 >= c) {
                int i65 = charAt23 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i29 = i66 + 1;
                    charAt14 = stringInfo.charAt(i66);
                    if (charAt14 < c) {
                        break;
                    }
                    i65 |= (charAt14 & 8191) << i67;
                    i67 += 13;
                    i66 = i29;
                }
                charAt23 = i65 | (charAt14 << i67);
                i15 = i29;
            } else {
                i15 = i64;
            }
            int i68 = i15 + 1;
            int charAt24 = stringInfo.charAt(i15);
            if (charAt24 >= c) {
                int i69 = charAt24 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i28 = i70 + 1;
                    charAt13 = stringInfo.charAt(i70);
                    if (charAt13 < c) {
                        break;
                    }
                    i69 |= (charAt13 & 8191) << i71;
                    i71 += 13;
                    i70 = i28;
                }
                charAt24 = i69 | (charAt13 << i71);
                i16 = i28;
            } else {
                i16 = i68;
            }
            int i72 = charAt24 & 255;
            int i73 = length;
            if ((charAt24 & 1024) != 0) {
                iArr[i62] = i63;
                i62++;
            }
            int i74 = i62;
            if (i72 >= 51) {
                int i75 = i16 + 1;
                int charAt25 = stringInfo.charAt(i16);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i76 = charAt25 & 8191;
                    int i77 = 13;
                    while (true) {
                        i27 = i75 + 1;
                        charAt12 = stringInfo.charAt(i75);
                        if (charAt12 < c2) {
                            break;
                        }
                        i76 |= (charAt12 & 8191) << i77;
                        i77 += 13;
                        i75 = i27;
                        c2 = 55296;
                    }
                    charAt25 = i76 | (charAt12 << i77);
                    i75 = i27;
                }
                int i78 = i72 - 51;
                int i79 = i75;
                if (i78 == 9 || i78 == 17) {
                    i26 = i2 + 1;
                    objArr[((i63 / 3) * 2) + 1] = objects[i2];
                } else {
                    if (i78 == 12 && (rawMessageInfo.getSyntax().equals(ProtoSyntax.PROTO2) || (charAt24 & 2048) != 0)) {
                        i26 = i2 + 1;
                        objArr[((i63 / 3) * 2) + 1] = objects[i2];
                    }
                    int i80 = charAt25 * 2;
                    obj = objects[i80];
                    if (!(obj instanceof java.lang.reflect.Field)) {
                        reflectField2 = (java.lang.reflect.Field) obj;
                    } else {
                        reflectField2 = reflectField(cls, (String) obj);
                        objects[i80] = reflectField2;
                    }
                    i17 = i5;
                    i23 = (int) unsafe.objectFieldOffset(reflectField2);
                    int i81 = i80 + 1;
                    obj2 = objects[i81];
                    if (!(obj2 instanceof java.lang.reflect.Field)) {
                        reflectField3 = (java.lang.reflect.Field) obj2;
                    } else {
                        reflectField3 = reflectField(cls, (String) obj2);
                        objects[i81] = reflectField3;
                    }
                    i18 = i6;
                    i19 = i2;
                    i21 = i79;
                    str = stringInfo;
                    i20 = (int) unsafe.objectFieldOffset(reflectField3);
                    i22 = 0;
                }
                i2 = i26;
                int i802 = charAt25 * 2;
                obj = objects[i802];
                if (!(obj instanceof java.lang.reflect.Field)) {
                }
                i17 = i5;
                i23 = (int) unsafe.objectFieldOffset(reflectField2);
                int i812 = i802 + 1;
                obj2 = objects[i812];
                if (!(obj2 instanceof java.lang.reflect.Field)) {
                }
                i18 = i6;
                i19 = i2;
                i21 = i79;
                str = stringInfo;
                i20 = (int) unsafe.objectFieldOffset(reflectField3);
                i22 = 0;
            } else {
                i17 = i5;
                int i82 = i2 + 1;
                java.lang.reflect.Field reflectField4 = reflectField(cls, (String) objects[i2]);
                if (i72 == 9 || i72 == 17) {
                    i18 = i6;
                    objArr[((i63 / 3) * 2) + 1] = reflectField4.getType();
                } else {
                    if (i72 == 27 || i72 == 49) {
                        i18 = i6;
                        i25 = i2 + 2;
                        objArr[((i63 / 3) * 2) + 1] = objects[i82];
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        i18 = i6;
                        if (rawMessageInfo.getSyntax() == ProtoSyntax.PROTO2 || (charAt24 & 2048) != 0) {
                            i25 = i2 + 2;
                            objArr[((i63 / 3) * 2) + 1] = objects[i82];
                        }
                    } else {
                        if (i72 == 50) {
                            int i83 = i60 + 1;
                            iArr[i60] = i63;
                            int i84 = (i63 / 3) * 2;
                            int i85 = i2 + 2;
                            objArr[i84] = objects[i82];
                            if ((charAt24 & 2048) != 0) {
                                i82 = i2 + 3;
                                objArr[i84 + 1] = objects[i85];
                                i60 = i83;
                            } else {
                                i60 = i83;
                                i82 = i85;
                            }
                        }
                        i18 = i6;
                    }
                    i82 = i25;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(reflectField4);
                if ((charAt24 & 4096) == 0 || i72 > 17) {
                    str = stringInfo;
                    i19 = i82;
                    i20 = 1048575;
                    i21 = i16;
                    i22 = 0;
                } else {
                    i21 = i16 + 1;
                    int charAt26 = stringInfo.charAt(i16);
                    if (charAt26 >= 55296) {
                        int i86 = charAt26 & 8191;
                        int i87 = 13;
                        while (true) {
                            i24 = i21 + 1;
                            charAt11 = stringInfo.charAt(i21);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i86 |= (charAt11 & 8191) << i87;
                            i87 += 13;
                            i21 = i24;
                        }
                        charAt26 = i86 | (charAt11 << i87);
                        i21 = i24;
                    }
                    int i88 = (i3 * 2) + (charAt26 / 32);
                    Object obj3 = objects[i88];
                    if (obj3 instanceof java.lang.reflect.Field) {
                        reflectField = (java.lang.reflect.Field) obj3;
                    } else {
                        reflectField = reflectField(cls, (String) obj3);
                        objects[i88] = reflectField;
                    }
                    str = stringInfo;
                    i19 = i82;
                    i20 = (int) unsafe.objectFieldOffset(reflectField);
                    i22 = charAt26 % 32;
                }
                if (i72 >= 18 && i72 <= 49) {
                    iArr[i61] = objectFieldOffset;
                    i61++;
                }
                i23 = objectFieldOffset;
            }
            int i89 = i63 + 1;
            iArr2[i63] = charAt23;
            int i90 = i63 + 2;
            int i91 = i3;
            iArr2[i89] = i23 | (i72 << 20) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0);
            i63 += 3;
            iArr2[i90] = i20 | (i22 << 20);
            i32 = i21;
            stringInfo = str;
            i2 = i19;
            length = i73;
            i6 = i18;
            i62 = i74;
            i3 = i91;
            i5 = i17;
            c = 55296;
        }
        return new MessageSchema(iArr2, objArr, i5, i6, rawMessageInfo.getDefaultInstance(), rawMessageInfo.getSyntax(), false, iArr, i4, i59, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private static java.lang.reflect.Field reflectField(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    static MessageSchema newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int i;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i2 = 0;
        int i3 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i2++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i3++;
            }
        }
        int[] iArr2 = i2 > 0 ? new int[i2] : null;
        int[] iArr3 = i3 > 0 ? new int[i3] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < fields.length) {
            FieldInfo fieldInfo2 = fields[i4];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i5, objArr);
            if (i6 < checkInitialized.length && checkInitialized[i6] == fieldNumber3) {
                checkInitialized[i6] = i5;
                i6++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i7] = i5;
                i7++;
            } else if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                i = i5;
                iArr3[i8] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                i8++;
                i4++;
                i5 = i + 3;
            }
            i = i5;
            i4++;
            i5 = i + 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new MessageSchema(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), structuralMessageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private static void storeFieldData(FieldInfo fieldInfo, int[] iArr, int i, Object[] objArr) {
        int objectFieldOffset;
        int i2;
        fieldInfo.getOneof();
        FieldType type = fieldInfo.getType();
        int objectFieldOffset2 = (int) UnsafeUtil.objectFieldOffset(fieldInfo.getField());
        int id = type.id();
        if (!type.isList() && !type.isMap()) {
            java.lang.reflect.Field presenceField = fieldInfo.getPresenceField();
            objectFieldOffset = presenceField == null ? 1048575 : (int) UnsafeUtil.objectFieldOffset(presenceField);
            i2 = Integer.numberOfTrailingZeros(fieldInfo.getPresenceMask());
        } else if (fieldInfo.getCachedSizeField() == null) {
            objectFieldOffset = 0;
            i2 = 0;
        } else {
            objectFieldOffset = (int) UnsafeUtil.objectFieldOffset(fieldInfo.getCachedSizeField());
            i2 = 0;
        }
        iArr[i] = fieldInfo.getFieldNumber();
        iArr[i + 1] = objectFieldOffset2 | (id << 20) | (fieldInfo.isRequired() ? 268435456 : 0) | (fieldInfo.isEnforceUtf8() ? 536870912 : 0);
        iArr[i + 2] = objectFieldOffset | (i2 << 20);
        Class messageFieldClass = fieldInfo.getMessageFieldClass();
        if (fieldInfo.getMapDefaultEntry() == null) {
            if (messageFieldClass != null) {
                objArr[((i / 3) * 2) + 1] = messageFieldClass;
                return;
            } else {
                if (fieldInfo.getEnumVerifier() != null) {
                    objArr[((i / 3) * 2) + 1] = fieldInfo.getEnumVerifier();
                    return;
                }
                return;
            }
        }
        int i3 = (i / 3) * 2;
        objArr[i3] = fieldInfo.getMapDefaultEntry();
        if (messageFieldClass != null) {
            objArr[i3 + 1] = messageFieldClass;
        } else if (fieldInfo.getEnumVerifier() != null) {
            objArr[i3 + 1] = fieldInfo.getEnumVerifier();
        }
    }

    @Override // com.google.protobuf.Schema
    public Object newInstance() {
        return this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(Object obj, Object obj2) {
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(obj, obj2, i)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(obj).equals(this.unknownFieldSchema.getFromMessage(obj2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(obj).equals(this.extensionSchema.getExtensions(obj2));
        }
        return true;
    }

    private boolean equals(Object obj, Object obj2, int i) {
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (arePresentForEquals(obj, obj2, i) && Double.doubleToLongBits(UnsafeUtil.getDouble(obj, offset)) == Double.doubleToLongBits(UnsafeUtil.getDouble(obj2, offset))) {
                    break;
                }
                break;
            case 1:
                if (arePresentForEquals(obj, obj2, i) && Float.floatToIntBits(UnsafeUtil.getFloat(obj, offset)) == Float.floatToIntBits(UnsafeUtil.getFloat(obj2, offset))) {
                    break;
                }
                break;
            case 2:
                if (arePresentForEquals(obj, obj2, i) && UnsafeUtil.getLong(obj, offset) == UnsafeUtil.getLong(obj2, offset)) {
                    break;
                }
                break;
            case 3:
                if (arePresentForEquals(obj, obj2, i) && UnsafeUtil.getLong(obj, offset) == UnsafeUtil.getLong(obj2, offset)) {
                    break;
                }
                break;
            case 4:
                if (arePresentForEquals(obj, obj2, i) && UnsafeUtil.getInt(obj, offset) == UnsafeUtil.getInt(obj2, offset)) {
                    break;
                }
                break;
            case 5:
                if (arePresentForEquals(obj, obj2, i) && UnsafeUtil.getLong(obj, offset) == UnsafeUtil.getLong(obj2, offset)) {
                    break;
                }
                break;
            case 6:
                if (arePresentForEquals(obj, obj2, i) && UnsafeUtil.getInt(obj, offset) == UnsafeUtil.getInt(obj2, offset)) {
                    break;
                }
                break;
            case 7:
                if (arePresentForEquals(obj, obj2, i) && UnsafeUtil.getBoolean(obj, offset) == UnsafeUtil.getBoolean(obj2, offset)) {
                    break;
                }
                break;
            case 8:
                if (arePresentForEquals(obj, obj2, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(obj, offset), UnsafeUtil.getObject(obj2, offset))) {
                    break;
                }
                break;
            case 9:
                if (arePresentForEquals(obj, obj2, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(obj, offset), UnsafeUtil.getObject(obj2, offset))) {
                    break;
                }
                break;
            case 10:
                if (arePresentForEquals(obj, obj2, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(obj, offset), UnsafeUtil.getObject(obj2, offset))) {
                    break;
                }
                break;
            case 11:
                if (arePresentForEquals(obj, obj2, i) && UnsafeUtil.getInt(obj, offset) == UnsafeUtil.getInt(obj2, offset)) {
                    break;
                }
                break;
            case 12:
                if (arePresentForEquals(obj, obj2, i) && UnsafeUtil.getInt(obj, offset) == UnsafeUtil.getInt(obj2, offset)) {
                    break;
                }
                break;
            case 13:
                if (arePresentForEquals(obj, obj2, i) && UnsafeUtil.getInt(obj, offset) == UnsafeUtil.getInt(obj2, offset)) {
                    break;
                }
                break;
            case 14:
                if (arePresentForEquals(obj, obj2, i) && UnsafeUtil.getLong(obj, offset) == UnsafeUtil.getLong(obj2, offset)) {
                    break;
                }
                break;
            case 15:
                if (arePresentForEquals(obj, obj2, i) && UnsafeUtil.getInt(obj, offset) == UnsafeUtil.getInt(obj2, offset)) {
                    break;
                }
                break;
            case 16:
                if (arePresentForEquals(obj, obj2, i) && UnsafeUtil.getLong(obj, offset) == UnsafeUtil.getLong(obj2, offset)) {
                    break;
                }
                break;
            case 17:
                if (arePresentForEquals(obj, obj2, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(obj, offset), UnsafeUtil.getObject(obj2, offset))) {
                    break;
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (isOneofCaseEqual(obj, obj2, i) && SchemaUtil.safeEquals(UnsafeUtil.getObject(obj, offset), UnsafeUtil.getObject(obj2, offset))) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(Object obj) {
        int i;
        int hashLong;
        int length = this.buffer.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i3);
            int numberAt = numberAt(i3);
            long offset = offset(typeAndOffsetAt);
            int i4 = 37;
            switch (type(typeAndOffsetAt)) {
                case 0:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(obj, offset)));
                    i2 = i + hashLong;
                    break;
                case 1:
                    i = i2 * 53;
                    hashLong = Float.floatToIntBits(UnsafeUtil.getFloat(obj, offset));
                    i2 = i + hashLong;
                    break;
                case 2:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(obj, offset));
                    i2 = i + hashLong;
                    break;
                case 3:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(obj, offset));
                    i2 = i + hashLong;
                    break;
                case 4:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getInt(obj, offset);
                    i2 = i + hashLong;
                    break;
                case 5:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(obj, offset));
                    i2 = i + hashLong;
                    break;
                case 6:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getInt(obj, offset);
                    i2 = i + hashLong;
                    break;
                case 7:
                    i = i2 * 53;
                    hashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(obj, offset));
                    i2 = i + hashLong;
                    break;
                case 8:
                    i = i2 * 53;
                    hashLong = ((String) UnsafeUtil.getObject(obj, offset)).hashCode();
                    i2 = i + hashLong;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(obj, offset);
                    if (object != null) {
                        i4 = object.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getObject(obj, offset).hashCode();
                    i2 = i + hashLong;
                    break;
                case 11:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getInt(obj, offset);
                    i2 = i + hashLong;
                    break;
                case 12:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getInt(obj, offset);
                    i2 = i + hashLong;
                    break;
                case 13:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getInt(obj, offset);
                    i2 = i + hashLong;
                    break;
                case 14:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(obj, offset));
                    i2 = i + hashLong;
                    break;
                case 15:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getInt(obj, offset);
                    i2 = i + hashLong;
                    break;
                case 16:
                    i = i2 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(obj, offset));
                    i2 = i + hashLong;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(obj, offset);
                    if (object2 != null) {
                        i4 = object2.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getObject(obj, offset).hashCode();
                    i2 = i + hashLong;
                    break;
                case 50:
                    i = i2 * 53;
                    hashLong = UnsafeUtil.getObject(obj, offset).hashCode();
                    i2 = i + hashLong;
                    break;
                case 51:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(obj, offset)));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Float.floatToIntBits(oneofFloatAt(obj, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(obj, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(obj, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(obj, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(obj, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(obj, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashBoolean(oneofBooleanAt(obj, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = ((String) UnsafeUtil.getObject(obj, offset)).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = UnsafeUtil.getObject(obj, offset).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = UnsafeUtil.getObject(obj, offset).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(obj, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(obj, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(obj, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(obj, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = oneofIntAt(obj, offset);
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(obj, offset));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(obj, numberAt, i3)) {
                        i = i2 * 53;
                        hashLong = UnsafeUtil.getObject(obj, offset).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.unknownFieldSchema.getFromMessage(obj).hashCode();
        return this.hasExtensions ? (hashCode * 53) + this.extensionSchema.getExtensions(obj).hashCode() : hashCode;
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(Object obj, Object obj2) {
        checkMutable(obj);
        obj2.getClass();
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(obj, obj2, i);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, obj, obj2);
        }
    }

    private void mergeSingleField(Object obj, Object obj2, int i) {
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        int numberAt = numberAt(i);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putDouble(obj, offset, UnsafeUtil.getDouble(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 1:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putFloat(obj, offset, UnsafeUtil.getFloat(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 2:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putLong(obj, offset, UnsafeUtil.getLong(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 3:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putLong(obj, offset, UnsafeUtil.getLong(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 4:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putInt(obj, offset, UnsafeUtil.getInt(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 5:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putLong(obj, offset, UnsafeUtil.getLong(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 6:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putInt(obj, offset, UnsafeUtil.getInt(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 7:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putBoolean(obj, offset, UnsafeUtil.getBoolean(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 8:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putObject(obj, offset, UnsafeUtil.getObject(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 9:
                mergeMessage(obj, obj2, i);
                break;
            case 10:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putObject(obj, offset, UnsafeUtil.getObject(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 11:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putInt(obj, offset, UnsafeUtil.getInt(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 12:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putInt(obj, offset, UnsafeUtil.getInt(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 13:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putInt(obj, offset, UnsafeUtil.getInt(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 14:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putLong(obj, offset, UnsafeUtil.getLong(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 15:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putInt(obj, offset, UnsafeUtil.getInt(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 16:
                if (isFieldPresent(obj2, i)) {
                    UnsafeUtil.putLong(obj, offset, UnsafeUtil.getLong(obj2, offset));
                    setFieldPresent(obj, i);
                    break;
                }
                break;
            case 17:
                mergeMessage(obj, obj2, i);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(obj, obj2, offset);
                break;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, obj, obj2, offset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(obj2, numberAt, i)) {
                    UnsafeUtil.putObject(obj, offset, UnsafeUtil.getObject(obj2, offset));
                    setOneofPresent(obj, numberAt, i);
                    break;
                }
                break;
            case 60:
                mergeOneofMessage(obj, obj2, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(obj2, numberAt, i)) {
                    UnsafeUtil.putObject(obj, offset, UnsafeUtil.getObject(obj2, offset));
                    setOneofPresent(obj, numberAt, i);
                    break;
                }
                break;
            case 68:
                mergeOneofMessage(obj, obj2, i);
                break;
        }
    }

    private void mergeMessage(Object obj, Object obj2, int i) {
        if (isFieldPresent(obj2, i)) {
            long offset = offset(typeAndOffsetAt(i));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(obj2, offset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + obj2);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isFieldPresent(obj, i)) {
                if (!isMutable(object)) {
                    unsafe.putObject(obj, offset, object);
                } else {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(obj, offset, newInstance);
                }
                setFieldPresent(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(obj, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeOneofMessage(Object obj, Object obj2, int i) {
        int numberAt = numberAt(i);
        if (isOneofPresent(obj2, numberAt, i)) {
            long offset = offset(typeAndOffsetAt(i));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(obj2, offset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + obj2);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isOneofPresent(obj, numberAt, i)) {
                if (!isMutable(object)) {
                    unsafe.putObject(obj, offset, object);
                } else {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(obj, offset, newInstance);
                }
                setOneofPresent(obj, numberAt, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(obj, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.Schema
    public int getSerializedSize(Object obj) {
        int i;
        int i2;
        int i3;
        int computeDoubleSize;
        int computeBoolSize;
        int computeSFixed32Size;
        boolean z;
        int computeSizeFixed32List;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < this.buffer.length) {
            int typeAndOffsetAt = typeAndOffsetAt(i7);
            int type = type(typeAndOffsetAt);
            int numberAt = numberAt(i7);
            int i9 = this.buffer[i7 + 2];
            int i10 = i9 & i4;
            if (type <= 17) {
                if (i10 != i5) {
                    i6 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i9 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long offset = offset(typeAndOffsetAt);
            if (type < FieldType.DOUBLE_LIST_PACKED.id() || type > FieldType.SINT64_LIST_PACKED.id()) {
                i10 = 0;
            }
            switch (type) {
                case 0:
                    if (!isFieldPresent(obj, i7, i, i2, i3)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i8 += computeDoubleSize;
                        break;
                    }
                case 1:
                    if (!isFieldPresent(obj, i7, i, i2, i3)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i8 += computeDoubleSize;
                        break;
                    }
                case 2:
                    if (!isFieldPresent(obj, i7, i, i2, i3)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, unsafe.getLong(obj, offset));
                        i8 += computeDoubleSize;
                        break;
                    }
                case 3:
                    if (!isFieldPresent(obj, i7, i, i2, i3)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, unsafe.getLong(obj, offset));
                        i8 += computeDoubleSize;
                        break;
                    }
                case 4:
                    if (!isFieldPresent(obj, i7, i, i2, i3)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, unsafe.getInt(obj, offset));
                        i8 += computeDoubleSize;
                        break;
                    }
                case 5:
                    if (!isFieldPresent(obj, i7, i, i2, i3)) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i8 += computeDoubleSize;
                        break;
                    }
                case 6:
                    if (isFieldPresent(obj, i7, i, i2, i3)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i8 += computeDoubleSize;
                        break;
                    }
                    break;
                case 7:
                    if (isFieldPresent(obj, i7, i, i2, i3)) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i8 += computeBoolSize;
                    }
                    break;
                case 8:
                    if (isFieldPresent(obj, i7, i, i2, i3)) {
                        Object object = unsafe.getObject(obj, offset);
                        if (object instanceof ByteString) {
                            computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object);
                        } else {
                            computeBoolSize = CodedOutputStream.computeStringSize(numberAt, (String) object);
                        }
                        i8 += computeBoolSize;
                    }
                    break;
                case 9:
                    if (isFieldPresent(obj, i7, i, i2, i3)) {
                        computeBoolSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i7));
                        i8 += computeBoolSize;
                    }
                    break;
                case 10:
                    if (isFieldPresent(obj, i7, i, i2, i3)) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(obj, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 11:
                    if (isFieldPresent(obj, i7, i, i2, i3)) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(numberAt, unsafe.getInt(obj, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 12:
                    if (isFieldPresent(obj, i7, i, i2, i3)) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(numberAt, unsafe.getInt(obj, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 13:
                    if (isFieldPresent(obj, i7, i, i2, i3)) {
                        computeSFixed32Size = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i8 += computeSFixed32Size;
                    }
                    break;
                case 14:
                    if (isFieldPresent(obj, i7, i, i2, i3)) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i8 += computeBoolSize;
                    }
                    break;
                case 15:
                    if (isFieldPresent(obj, i7, i, i2, i3)) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(numberAt, unsafe.getInt(obj, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 16:
                    if (isFieldPresent(obj, i7, i, i2, i3)) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(numberAt, unsafe.getLong(obj, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 17:
                    if (isFieldPresent(obj, i7, i, i2, i3)) {
                        computeBoolSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(obj, offset), getMessageFieldSchema(i7));
                        i8 += computeBoolSize;
                    }
                    break;
                case 18:
                    computeBoolSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i8 += computeBoolSize;
                    break;
                case 19:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i8 += computeSizeFixed32List;
                    break;
                case 20:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeInt64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i8 += computeSizeFixed32List;
                    break;
                case 21:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeUInt64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i8 += computeSizeFixed32List;
                    break;
                case 22:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeInt32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i8 += computeSizeFixed32List;
                    break;
                case 23:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i8 += computeSizeFixed32List;
                    break;
                case 24:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i8 += computeSizeFixed32List;
                    break;
                case 25:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeBoolList(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i8 += computeSizeFixed32List;
                    break;
                case 26:
                    computeBoolSize = SchemaUtil.computeSizeStringList(numberAt, (List) unsafe.getObject(obj, offset));
                    i8 += computeBoolSize;
                    break;
                case 27:
                    computeBoolSize = SchemaUtil.computeSizeMessageList(numberAt, (List) unsafe.getObject(obj, offset), getMessageFieldSchema(i7));
                    i8 += computeBoolSize;
                    break;
                case 28:
                    computeBoolSize = SchemaUtil.computeSizeByteStringList(numberAt, (List) unsafe.getObject(obj, offset));
                    i8 += computeBoolSize;
                    break;
                case 29:
                    computeBoolSize = SchemaUtil.computeSizeUInt32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i8 += computeBoolSize;
                    break;
                case 30:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeEnumList(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i8 += computeSizeFixed32List;
                    break;
                case 31:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i8 += computeSizeFixed32List;
                    break;
                case 32:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i8 += computeSizeFixed32List;
                    break;
                case 33:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeSInt32List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i8 += computeSizeFixed32List;
                    break;
                case 34:
                    z = false;
                    computeSizeFixed32List = SchemaUtil.computeSizeSInt64List(numberAt, (List) unsafe.getObject(obj, offset), false);
                    i8 += computeSizeFixed32List;
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeSFixed32Size;
                    }
                    break;
                case 36:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeSFixed32Size;
                    }
                    break;
                case 37:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeSFixed32Size;
                    }
                    break;
                case 38:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeSFixed32Size;
                    }
                    break;
                case 39:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeSFixed32Size;
                    }
                    break;
                case 40:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeSFixed32Size;
                    }
                    break;
                case 41:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeSFixed32Size;
                    }
                    break;
                case 42:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeSFixed32Size;
                    }
                    break;
                case 43:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeSFixed32Size;
                    }
                    break;
                case 44:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeSFixed32Size;
                    }
                    break;
                case 45:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeSFixed32Size;
                    }
                    break;
                case 46:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeSFixed32Size;
                    }
                    break;
                case 47:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeSFixed32Size;
                    }
                    break;
                case 48:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(obj, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i10, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i8 += computeSFixed32Size;
                    }
                    break;
                case 49:
                    computeBoolSize = SchemaUtil.computeSizeGroupList(numberAt, (List) unsafe.getObject(obj, offset), getMessageFieldSchema(i7));
                    i8 += computeBoolSize;
                    break;
                case 50:
                    computeBoolSize = this.mapFieldSchema.getSerializedSize(numberAt, unsafe.getObject(obj, offset), getMapFieldDefaultEntry(i7));
                    i8 += computeBoolSize;
                    break;
                case 51:
                    if (isOneofPresent(obj, numberAt, i7)) {
                        computeBoolSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i8 += computeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(obj, numberAt, i7)) {
                        computeBoolSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i8 += computeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(obj, numberAt, i7)) {
                        computeBoolSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(obj, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(obj, numberAt, i7)) {
                        computeBoolSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(obj, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(obj, numberAt, i7)) {
                        computeBoolSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(obj, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(obj, numberAt, i7)) {
                        computeBoolSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i8 += computeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(obj, numberAt, i7)) {
                        computeSFixed32Size = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i8 += computeSFixed32Size;
                    }
                    break;
                case 58:
                    if (isOneofPresent(obj, numberAt, i7)) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i8 += computeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(obj, numberAt, i7)) {
                        Object object2 = unsafe.getObject(obj, offset);
                        if (object2 instanceof ByteString) {
                            computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2);
                        } else {
                            computeBoolSize = CodedOutputStream.computeStringSize(numberAt, (String) object2);
                        }
                        i8 += computeBoolSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(obj, numberAt, i7)) {
                        computeBoolSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i7));
                        i8 += computeBoolSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(obj, numberAt, i7)) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(obj, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(obj, numberAt, i7)) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(obj, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(obj, numberAt, i7)) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(obj, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(obj, numberAt, i7)) {
                        computeSFixed32Size = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i8 += computeSFixed32Size;
                    }
                    break;
                case 65:
                    if (isOneofPresent(obj, numberAt, i7)) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i8 += computeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(obj, numberAt, i7)) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(obj, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(obj, numberAt, i7)) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(obj, offset));
                        i8 += computeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(obj, numberAt, i7)) {
                        computeBoolSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(obj, offset), getMessageFieldSchema(i7));
                        i8 += computeBoolSize;
                    }
                    break;
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
        }
        int unknownFieldsSerializedSize = i8 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(obj).getSerializedSize() : unknownFieldsSerializedSize;
    }

    private int getUnknownFieldsSerializedSize(UnknownFieldSchema unknownFieldSchema, Object obj) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(obj));
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(Object obj, Writer writer) {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(obj, writer);
        } else {
            writeFieldsInAscendingOrder(obj, writer);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeFieldsInAscendingOrder(Object obj, Writer writer) {
        Map.Entry entry;
        Iterator it;
        int length;
        int i;
        int i2;
        Map.Entry entry2;
        int i3;
        int i4;
        Map.Entry entry3;
        boolean z;
        Map.Entry entry4;
        if (this.hasExtensions) {
            FieldSet extensions = this.extensionSchema.getExtensions(obj);
            if (!extensions.isEmpty()) {
                Iterator it2 = extensions.iterator();
                entry = (Map.Entry) it2.next();
                it = it2;
                length = this.buffer.length;
                Unsafe unsafe = UNSAFE;
                int i5 = 1048575;
                int i6 = 1048575;
                int i7 = 0;
                i = 0;
                while (i < length) {
                    int typeAndOffsetAt = typeAndOffsetAt(i);
                    int numberAt = numberAt(i);
                    int type = type(typeAndOffsetAt);
                    if (type <= 17) {
                        int i8 = this.buffer[i + 2];
                        int i9 = i8 & i5;
                        if (i9 != i6) {
                            if (i9 == i5) {
                                entry4 = entry;
                                i7 = 0;
                            } else {
                                entry4 = entry;
                                i7 = unsafe.getInt(obj, i9);
                            }
                            i6 = i9;
                        } else {
                            entry4 = entry;
                        }
                        int i10 = 1 << (i8 >>> 20);
                        i2 = i6;
                        i3 = i10;
                        entry2 = entry4;
                    } else {
                        i2 = i6;
                        entry2 = entry;
                        i3 = 0;
                    }
                    int i11 = i7;
                    while (entry2 != null && this.extensionSchema.extensionNumber(entry2) <= numberAt) {
                        this.extensionSchema.serializeExtension(writer, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long offset = offset(typeAndOffsetAt);
                    switch (type) {
                        case 0:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeDouble(numberAt, doubleAt(obj, offset));
                                break;
                            }
                        case 1:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeFloat(numberAt, floatAt(obj, offset));
                                break;
                            }
                        case 2:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeInt64(numberAt, unsafe.getLong(obj, offset));
                                break;
                            }
                        case 3:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeUInt64(numberAt, unsafe.getLong(obj, offset));
                                break;
                            }
                        case 4:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeInt32(numberAt, unsafe.getInt(obj, offset));
                                break;
                            }
                        case 5:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeFixed64(numberAt, unsafe.getLong(obj, offset));
                                break;
                            }
                        case 6:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeFixed32(numberAt, unsafe.getInt(obj, offset));
                                break;
                            }
                        case 7:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeBool(numberAt, booleanAt(obj, offset));
                                break;
                            }
                        case 8:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                writeString(numberAt, unsafe.getObject(obj, offset), writer);
                                break;
                            }
                        case 9:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeMessage(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i));
                                break;
                            }
                        case 10:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeBytes(numberAt, (ByteString) unsafe.getObject(obj, offset));
                                break;
                            }
                        case 11:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeUInt32(numberAt, unsafe.getInt(obj, offset));
                                break;
                            }
                        case 12:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeEnum(numberAt, unsafe.getInt(obj, offset));
                                break;
                            }
                        case 13:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeSFixed32(numberAt, unsafe.getInt(obj, offset));
                                break;
                            }
                        case 14:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeSFixed64(numberAt, unsafe.getLong(obj, offset));
                                break;
                            }
                        case 15:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeSInt32(numberAt, unsafe.getInt(obj, offset));
                                break;
                            }
                        case 16:
                            i4 = length;
                            entry3 = entry2;
                            if (!isFieldPresent(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeSInt64(numberAt, unsafe.getLong(obj, offset));
                                break;
                            }
                        case 17:
                            entry3 = entry2;
                            i4 = length;
                            if (!isFieldPresent(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                writer.writeGroup(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i));
                                break;
                            }
                        case 18:
                            z = false;
                            SchemaUtil.writeDoubleList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 19:
                            z = false;
                            SchemaUtil.writeFloatList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 20:
                            z = false;
                            SchemaUtil.writeInt64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 21:
                            z = false;
                            SchemaUtil.writeUInt64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 22:
                            z = false;
                            SchemaUtil.writeInt32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 23:
                            z = false;
                            SchemaUtil.writeFixed64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 24:
                            z = false;
                            SchemaUtil.writeFixed32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 25:
                            z = false;
                            SchemaUtil.writeBoolList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 26:
                            SchemaUtil.writeStringList(numberAt(i), (List) unsafe.getObject(obj, offset), writer);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 27:
                            SchemaUtil.writeMessageList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, getMessageFieldSchema(i));
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 28:
                            SchemaUtil.writeBytesList(numberAt(i), (List) unsafe.getObject(obj, offset), writer);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 29:
                            z = false;
                            SchemaUtil.writeUInt32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 30:
                            z = false;
                            SchemaUtil.writeEnumList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 31:
                            z = false;
                            SchemaUtil.writeSFixed32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 32:
                            z = false;
                            SchemaUtil.writeSFixed64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 33:
                            z = false;
                            SchemaUtil.writeSInt32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 34:
                            z = false;
                            SchemaUtil.writeSInt64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, false);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 35:
                            SchemaUtil.writeDoubleList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 36:
                            SchemaUtil.writeFloatList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 37:
                            SchemaUtil.writeInt64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 38:
                            SchemaUtil.writeUInt64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 39:
                            SchemaUtil.writeInt32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 40:
                            SchemaUtil.writeFixed64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 41:
                            SchemaUtil.writeFixed32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 42:
                            SchemaUtil.writeBoolList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 43:
                            SchemaUtil.writeUInt32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 44:
                            SchemaUtil.writeEnumList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 45:
                            SchemaUtil.writeSFixed32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 46:
                            SchemaUtil.writeSFixed64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 47:
                            SchemaUtil.writeSInt32List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 48:
                            SchemaUtil.writeSInt64List(numberAt(i), (List) unsafe.getObject(obj, offset), writer, true);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 49:
                            SchemaUtil.writeGroupList(numberAt(i), (List) unsafe.getObject(obj, offset), writer, getMessageFieldSchema(i));
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 50:
                            writeMapHelper(writer, numberAt, unsafe.getObject(obj, offset), i);
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 51:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeDouble(numberAt, oneofDoubleAt(obj, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 52:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeFloat(numberAt, oneofFloatAt(obj, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 53:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeInt64(numberAt, oneofLongAt(obj, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 54:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeUInt64(numberAt, oneofLongAt(obj, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 55:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeInt32(numberAt, oneofIntAt(obj, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 56:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeFixed64(numberAt, oneofLongAt(obj, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 57:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeFixed32(numberAt, oneofIntAt(obj, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 58:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeBool(numberAt, oneofBooleanAt(obj, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 59:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writeString(numberAt, unsafe.getObject(obj, offset), writer);
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 60:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeMessage(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 61:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeBytes(numberAt, (ByteString) unsafe.getObject(obj, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 62:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeUInt32(numberAt, oneofIntAt(obj, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 63:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeEnum(numberAt, oneofIntAt(obj, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 64:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeSFixed32(numberAt, oneofIntAt(obj, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 65:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeSFixed64(numberAt, oneofLongAt(obj, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 66:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeSInt32(numberAt, oneofIntAt(obj, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 67:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeSInt64(numberAt, oneofLongAt(obj, offset));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        case 68:
                            if (isOneofPresent(obj, numberAt, i)) {
                                writer.writeGroup(numberAt, unsafe.getObject(obj, offset), getMessageFieldSchema(i));
                            }
                            i4 = length;
                            entry3 = entry2;
                            break;
                        default:
                            i4 = length;
                            entry3 = entry2;
                            break;
                    }
                    i += 3;
                    i6 = i2;
                    entry = entry3;
                    i7 = i11;
                    length = i4;
                    i5 = 1048575;
                }
                while (entry != null) {
                    this.extensionSchema.serializeExtension(writer, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                writeUnknownInMessageTo(this.unknownFieldSchema, obj, writer);
            }
        }
        entry = null;
        it = null;
        length = this.buffer.length;
        Unsafe unsafe2 = UNSAFE;
        int i52 = 1048575;
        int i62 = 1048575;
        int i72 = 0;
        i = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        writeUnknownInMessageTo(this.unknownFieldSchema, obj, writer);
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeFieldsInDescendingOrder(Object obj, Writer writer) {
        Iterator it;
        Map.Entry entry;
        int length;
        writeUnknownInMessageTo(this.unknownFieldSchema, obj, writer);
        if (this.hasExtensions) {
            FieldSet extensions = this.extensionSchema.getExtensions(obj);
            if (!extensions.isEmpty()) {
                it = extensions.descendingIterator();
                entry = (Map.Entry) it.next();
                for (length = this.buffer.length - 3; length >= 0; length -= 3) {
                    int typeAndOffsetAt = typeAndOffsetAt(length);
                    int numberAt = numberAt(length);
                    while (entry != null && this.extensionSchema.extensionNumber(entry) > numberAt) {
                        this.extensionSchema.serializeExtension(writer, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    switch (type(typeAndOffsetAt)) {
                        case 0:
                            if (isFieldPresent(obj, length)) {
                                writer.writeDouble(numberAt, doubleAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (isFieldPresent(obj, length)) {
                                writer.writeFloat(numberAt, floatAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (isFieldPresent(obj, length)) {
                                writer.writeInt64(numberAt, longAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (isFieldPresent(obj, length)) {
                                writer.writeUInt64(numberAt, longAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (isFieldPresent(obj, length)) {
                                writer.writeInt32(numberAt, intAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (isFieldPresent(obj, length)) {
                                writer.writeFixed64(numberAt, longAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (isFieldPresent(obj, length)) {
                                writer.writeFixed32(numberAt, intAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (isFieldPresent(obj, length)) {
                                writer.writeBool(numberAt, booleanAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (isFieldPresent(obj, length)) {
                                writeString(numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (isFieldPresent(obj, length)) {
                                writer.writeMessage(numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (isFieldPresent(obj, length)) {
                                writer.writeBytes(numberAt, (ByteString) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (isFieldPresent(obj, length)) {
                                writer.writeUInt32(numberAt, intAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (isFieldPresent(obj, length)) {
                                writer.writeEnum(numberAt, intAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (isFieldPresent(obj, length)) {
                                writer.writeSFixed32(numberAt, intAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (isFieldPresent(obj, length)) {
                                writer.writeSFixed64(numberAt, longAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (isFieldPresent(obj, length)) {
                                writer.writeSInt32(numberAt, intAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (isFieldPresent(obj, length)) {
                                writer.writeSInt64(numberAt, longAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (isFieldPresent(obj, length)) {
                                writer.writeGroup(numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 19:
                            SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 20:
                            SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 21:
                            SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 22:
                            SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 23:
                            SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 24:
                            SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 25:
                            SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 26:
                            SchemaUtil.writeStringList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer);
                            break;
                        case 27:
                            SchemaUtil.writeMessageList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, getMessageFieldSchema(length));
                            break;
                        case 28:
                            SchemaUtil.writeBytesList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer);
                            break;
                        case 29:
                            SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 30:
                            SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 31:
                            SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 32:
                            SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 33:
                            SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 34:
                            SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, false);
                            break;
                        case 35:
                            SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 36:
                            SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 37:
                            SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 38:
                            SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 39:
                            SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 40:
                            SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 41:
                            SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 42:
                            SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 43:
                            SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 44:
                            SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 45:
                            SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 46:
                            SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 47:
                            SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 48:
                            SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, true);
                            break;
                        case 49:
                            SchemaUtil.writeGroupList(numberAt(length), (List) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer, getMessageFieldSchema(length));
                            break;
                        case 50:
                            writeMapHelper(writer, numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), length);
                            break;
                        case 51:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeDouble(numberAt, oneofDoubleAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeFloat(numberAt, oneofFloatAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeInt64(numberAt, oneofLongAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeUInt64(numberAt, oneofLongAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeInt32(numberAt, oneofIntAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeFixed64(numberAt, oneofLongAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeFixed32(numberAt, oneofIntAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeBool(numberAt, oneofBooleanAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writeString(numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), writer);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeMessage(numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeBytes(numberAt, (ByteString) UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeUInt32(numberAt, oneofIntAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeEnum(numberAt, oneofIntAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeSFixed32(numberAt, oneofIntAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeSFixed64(numberAt, oneofLongAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeSInt32(numberAt, oneofIntAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeSInt64(numberAt, oneofLongAt(obj, offset(typeAndOffsetAt)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (isOneofPresent(obj, numberAt, length)) {
                                writer.writeGroup(numberAt, UnsafeUtil.getObject(obj, offset(typeAndOffsetAt)), getMessageFieldSchema(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.extensionSchema.serializeExtension(writer, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
            }
        }
        it = null;
        entry = null;
        while (length >= 0) {
        }
        while (entry != null) {
        }
    }

    private void writeMapHelper(Writer writer, int i, Object obj, int i2) {
        if (obj != null) {
            writer.writeMap(i, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeUnknownInMessageTo(UnknownFieldSchema unknownFieldSchema, Object obj, Writer writer) {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(obj), writer);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        checkMutable(obj);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, obj, reader, extensionRegistryLite);
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x0093, code lost:
    
        r0 = r18.checkInitializedCount;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0098, code lost:
    
        if (r0 >= r18.repeatedFieldOffsetStart) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x009a, code lost:
    
        r4 = filterMapUnknownEnumValues(r21, r18.intArray[r0], r4, r19, r21);
        r0 = r0 + 1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x00b0, code lost:
    
        r11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x00b1, code lost:
    
        if (r4 == null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x00b3, code lost:
    
        r7.setBuilderToMessage(r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x00b6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x064b A[Catch: all -> 0x0671, TRY_LEAVE, TryCatch #0 {all -> 0x0671, blocks: (B:35:0x0645, B:37:0x064b, B:50:0x0675, B:51:0x067a), top: B:34:0x0645 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x06b1 A[LOOP:4: B:66:0x06ad->B:68:0x06b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x06c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void mergeFromHelper(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        Object obj2;
        UnknownFieldSchema unknownFieldSchema2;
        int i;
        Object obj3;
        Object obj4;
        ExtensionRegistryLite extensionRegistryLite2;
        Object obj5;
        UnknownFieldSchema unknownFieldSchema3 = unknownFieldSchema;
        Object obj6 = obj;
        ExtensionRegistryLite extensionRegistryLite3 = extensionRegistryLite;
        Object obj7 = null;
        FieldSet fieldSet = null;
        while (true) {
            try {
                int fieldNumber = reader.getFieldNumber();
                int positionForFieldNumber = positionForFieldNumber(fieldNumber);
                if (positionForFieldNumber >= 0) {
                    obj2 = obj6;
                    try {
                        int typeAndOffsetAt = typeAndOffsetAt(positionForFieldNumber);
                        switch (type(typeAndOffsetAt)) {
                            case 0:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putDouble(obj2, offset(typeAndOffsetAt), reader.readDouble());
                                setFieldPresent(obj2, positionForFieldNumber);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 1:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putFloat(obj2, offset(typeAndOffsetAt), reader.readFloat());
                                setFieldPresent(obj2, positionForFieldNumber);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 2:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putLong(obj2, offset(typeAndOffsetAt), reader.readInt64());
                                setFieldPresent(obj2, positionForFieldNumber);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 3:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putLong(obj2, offset(typeAndOffsetAt), reader.readUInt64());
                                setFieldPresent(obj2, positionForFieldNumber);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 4:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putInt(obj2, offset(typeAndOffsetAt), reader.readInt32());
                                setFieldPresent(obj2, positionForFieldNumber);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 5:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putLong(obj2, offset(typeAndOffsetAt), reader.readFixed64());
                                setFieldPresent(obj2, positionForFieldNumber);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 6:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putInt(obj2, offset(typeAndOffsetAt), reader.readFixed32());
                                setFieldPresent(obj2, positionForFieldNumber);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 7:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putBoolean(obj2, offset(typeAndOffsetAt), reader.readBool());
                                setFieldPresent(obj2, positionForFieldNumber);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 8:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                readString(obj2, typeAndOffsetAt, reader);
                                setFieldPresent(obj2, positionForFieldNumber);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 9:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                MessageLite messageLite = (MessageLite) mutableMessageFieldForMerge(obj2, positionForFieldNumber);
                                reader.mergeMessageField(messageLite, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite2);
                                storeMessageField(obj2, positionForFieldNumber, messageLite);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 10:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), reader.readBytes());
                                setFieldPresent(obj2, positionForFieldNumber);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 11:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putInt(obj2, offset(typeAndOffsetAt), reader.readUInt32());
                                setFieldPresent(obj2, positionForFieldNumber);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 12:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                int readEnum = reader.readEnum();
                                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(positionForFieldNumber);
                                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(readEnum)) {
                                    obj7 = SchemaUtil.storeUnknownEnum(obj2, fieldNumber, readEnum, obj5, unknownFieldSchema2);
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    obj6 = obj2;
                                    break;
                                }
                                UnsafeUtil.putInt(obj2, offset(typeAndOffsetAt), readEnum);
                                setFieldPresent(obj2, positionForFieldNumber);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 13:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putInt(obj2, offset(typeAndOffsetAt), reader.readSFixed32());
                                setFieldPresent(obj2, positionForFieldNumber);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 14:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putLong(obj2, offset(typeAndOffsetAt), reader.readSFixed64());
                                setFieldPresent(obj2, positionForFieldNumber);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 15:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putInt(obj2, offset(typeAndOffsetAt), reader.readSInt32());
                                setFieldPresent(obj2, positionForFieldNumber);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 16:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                UnsafeUtil.putLong(obj2, offset(typeAndOffsetAt), reader.readSInt64());
                                setFieldPresent(obj2, positionForFieldNumber);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 17:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                MessageLite messageLite2 = (MessageLite) mutableMessageFieldForMerge(obj2, positionForFieldNumber);
                                reader.mergeGroupField(messageLite2, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite2);
                                storeMessageField(obj2, positionForFieldNumber, messageLite2);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 18:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readDoubleList(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 19:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFloatList(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 20:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readInt64List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 21:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readUInt64List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 22:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readInt32List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 23:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFixed64List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 24:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFixed32List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 25:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readBoolList(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 26:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                readStringList(obj2, typeAndOffsetAt, reader);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 27:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                readMessageList(obj, typeAndOffsetAt, reader, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite);
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 28:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readBytesList(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 29:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readUInt32List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 30:
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                List mutableListAt = this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt));
                                reader.readEnumList(mutableListAt);
                                obj7 = SchemaUtil.filterUnknownEnumList(obj, fieldNumber, mutableListAt, getEnumFieldVerifier(positionForFieldNumber), obj7, unknownFieldSchema);
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 31:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSFixed32List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 32:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSFixed64List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 33:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSInt32List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 34:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSInt64List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 35:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readDoubleList(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 36:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFloatList(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 37:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readInt64List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 38:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readUInt64List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 39:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readInt32List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 40:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFixed64List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 41:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readFixed32List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 42:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readBoolList(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 43:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readUInt32List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 44:
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                List mutableListAt2 = this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt));
                                reader.readEnumList(mutableListAt2);
                                obj7 = SchemaUtil.filterUnknownEnumList(obj, fieldNumber, mutableListAt2, getEnumFieldVerifier(positionForFieldNumber), obj7, unknownFieldSchema);
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 45:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSFixed32List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 46:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSFixed64List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 47:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSInt32List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 48:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                reader.readSInt64List(this.listFieldSchema.mutableListAt(obj2, offset(typeAndOffsetAt)));
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 49:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                try {
                                    readGroupList(obj, offset(typeAndOffsetAt), reader, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite);
                                    obj7 = obj5;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                    obj7 = obj5;
                                    try {
                                        if (!unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                        }
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        unknownFieldSchema3 = unknownFieldSchema2;
                                        obj6 = obj2;
                                    } catch (Throwable th) {
                                        th = th;
                                        obj3 = obj7;
                                        for (i = this.checkInitializedCount; i < this.repeatedFieldOffsetStart; i++) {
                                            obj3 = filterMapUnknownEnumValues(obj, this.intArray[i], obj3, unknownFieldSchema, obj);
                                        }
                                        if (obj3 != null) {
                                            unknownFieldSchema2.setBuilderToMessage(obj2, obj3);
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj7 = obj5;
                                    obj3 = obj7;
                                    while (i < this.repeatedFieldOffsetStart) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 50:
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                try {
                                    mergeMap(obj, positionForFieldNumber, getMapFieldDefaultEntry(positionForFieldNumber), extensionRegistryLite, reader);
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    obj7 = obj5;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    obj7 = obj5;
                                    if (!unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                        if (obj7 == null) {
                                            obj7 = unknownFieldSchema2.getBuilderFromMessage(obj2);
                                        }
                                        if (!unknownFieldSchema2.mergeOneFieldFrom(obj7, reader, 0)) {
                                            Object obj8 = obj7;
                                            for (int i2 = this.checkInitializedCount; i2 < this.repeatedFieldOffsetStart; i2++) {
                                                obj8 = filterMapUnknownEnumValues(obj, this.intArray[i2], obj8, unknownFieldSchema, obj);
                                            }
                                            if (obj8 != null) {
                                                unknownFieldSchema2.setBuilderToMessage(obj2, obj8);
                                                return;
                                            }
                                            return;
                                        }
                                    } else if (!reader.skipField()) {
                                        Object obj9 = obj7;
                                        for (int i3 = this.checkInitializedCount; i3 < this.repeatedFieldOffsetStart; i3++) {
                                            obj9 = filterMapUnknownEnumValues(obj, this.intArray[i3], obj9, unknownFieldSchema, obj);
                                        }
                                        if (obj9 != null) {
                                            unknownFieldSchema2.setBuilderToMessage(obj2, obj9);
                                            return;
                                        }
                                        return;
                                    }
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    obj6 = obj2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    obj7 = obj5;
                                    obj3 = obj7;
                                    while (i < this.repeatedFieldOffsetStart) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 51:
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), Double.valueOf(reader.readDouble()));
                                setOneofPresent(obj2, fieldNumber, positionForFieldNumber);
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 52:
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), Float.valueOf(reader.readFloat()));
                                setOneofPresent(obj2, fieldNumber, positionForFieldNumber);
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 53:
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), Long.valueOf(reader.readInt64()));
                                setOneofPresent(obj2, fieldNumber, positionForFieldNumber);
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 54:
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), Long.valueOf(reader.readUInt64()));
                                setOneofPresent(obj2, fieldNumber, positionForFieldNumber);
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 55:
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), Integer.valueOf(reader.readInt32()));
                                setOneofPresent(obj2, fieldNumber, positionForFieldNumber);
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 56:
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), Long.valueOf(reader.readFixed64()));
                                setOneofPresent(obj2, fieldNumber, positionForFieldNumber);
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 57:
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), Integer.valueOf(reader.readFixed32()));
                                setOneofPresent(obj2, fieldNumber, positionForFieldNumber);
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 58:
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), Boolean.valueOf(reader.readBool()));
                                setOneofPresent(obj2, fieldNumber, positionForFieldNumber);
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 59:
                                readString(obj2, typeAndOffsetAt, reader);
                                setOneofPresent(obj2, fieldNumber, positionForFieldNumber);
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 60:
                                MessageLite messageLite3 = (MessageLite) mutableOneofMessageFieldForMerge(obj2, fieldNumber, positionForFieldNumber);
                                reader.mergeMessageField(messageLite3, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite3);
                                storeOneofMessageField(obj2, fieldNumber, positionForFieldNumber, messageLite3);
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 61:
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), reader.readBytes());
                                setOneofPresent(obj2, fieldNumber, positionForFieldNumber);
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 62:
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), Integer.valueOf(reader.readUInt32()));
                                setOneofPresent(obj2, fieldNumber, positionForFieldNumber);
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 63:
                                int readEnum2 = reader.readEnum();
                                Internal.EnumVerifier enumFieldVerifier2 = getEnumFieldVerifier(positionForFieldNumber);
                                if (enumFieldVerifier2 != null && !enumFieldVerifier2.isInRange(readEnum2)) {
                                    obj7 = SchemaUtil.storeUnknownEnum(obj2, fieldNumber, readEnum2, obj7, unknownFieldSchema3);
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    unknownFieldSchema2 = unknownFieldSchema3;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    obj6 = obj2;
                                    break;
                                }
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), Integer.valueOf(readEnum2));
                                setOneofPresent(obj2, fieldNumber, positionForFieldNumber);
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 64:
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), Integer.valueOf(reader.readSFixed32()));
                                setOneofPresent(obj2, fieldNumber, positionForFieldNumber);
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 65:
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), Long.valueOf(reader.readSFixed64()));
                                setOneofPresent(obj2, fieldNumber, positionForFieldNumber);
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 66:
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), Integer.valueOf(reader.readSInt32()));
                                setOneofPresent(obj2, fieldNumber, positionForFieldNumber);
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 67:
                                UnsafeUtil.putObject(obj2, offset(typeAndOffsetAt), Long.valueOf(reader.readSInt64()));
                                setOneofPresent(obj2, fieldNumber, positionForFieldNumber);
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            case 68:
                                MessageLite messageLite4 = (MessageLite) mutableOneofMessageFieldForMerge(obj2, fieldNumber, positionForFieldNumber);
                                reader.mergeGroupField(messageLite4, getMessageFieldSchema(positionForFieldNumber), extensionRegistryLite3);
                                storeOneofMessageField(obj2, fieldNumber, positionForFieldNumber, messageLite4);
                                obj5 = obj7;
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj7 = obj5;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                            default:
                                if (obj7 == null) {
                                    try {
                                        obj7 = unknownFieldSchema3.getBuilderFromMessage(obj2);
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        unknownFieldSchema2 = unknownFieldSchema3;
                                        if (!unknownFieldSchema2.shouldDiscardUnknownFields(reader)) {
                                        }
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        unknownFieldSchema3 = unknownFieldSchema2;
                                        obj6 = obj2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        unknownFieldSchema2 = unknownFieldSchema3;
                                        obj3 = obj7;
                                        while (i < this.repeatedFieldOffsetStart) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                }
                                if (!unknownFieldSchema3.mergeOneFieldFrom(obj7, reader, 0)) {
                                    Object obj10 = obj7;
                                    for (int i4 = this.checkInitializedCount; i4 < this.repeatedFieldOffsetStart; i4++) {
                                        obj10 = filterMapUnknownEnumValues(obj, this.intArray[i4], obj10, unknownFieldSchema, obj);
                                    }
                                    if (obj10 != null) {
                                        unknownFieldSchema3.setBuilderToMessage(obj2, obj10);
                                        return;
                                    }
                                    return;
                                }
                                extensionRegistryLite2 = extensionRegistryLite3;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                unknownFieldSchema3 = unknownFieldSchema2;
                                obj6 = obj2;
                                break;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        Object obj11 = obj7;
                        for (int i5 = this.checkInitializedCount; i5 < this.repeatedFieldOffsetStart; i5++) {
                            obj11 = filterMapUnknownEnumValues(obj, this.intArray[i5], obj11, unknownFieldSchema, obj);
                        }
                        if (obj11 != null) {
                            unknownFieldSchema3.setBuilderToMessage(obj6, obj11);
                            return;
                        }
                        return;
                    }
                    try {
                        Object findExtensionByNumber = !this.hasExtensions ? null : extensionSchema.findExtensionByNumber(extensionRegistryLite3, this.defaultInstance, fieldNumber);
                        if (findExtensionByNumber != null) {
                            FieldSet mutableExtensions = fieldSet == null ? extensionSchema.getMutableExtensions(obj) : fieldSet;
                            obj4 = obj6;
                            try {
                                obj7 = extensionSchema.parseExtension(obj, reader, findExtensionByNumber, extensionRegistryLite, mutableExtensions, obj7, unknownFieldSchema);
                                fieldSet = mutableExtensions;
                            } catch (Throwable th6) {
                                th = th6;
                                obj2 = obj4;
                                unknownFieldSchema2 = unknownFieldSchema3;
                                obj3 = obj7;
                                while (i < this.repeatedFieldOffsetStart) {
                                }
                                if (obj3 != null) {
                                }
                                throw th;
                            }
                        } else {
                            obj4 = obj6;
                            if (!unknownFieldSchema3.shouldDiscardUnknownFields(reader)) {
                                if (obj7 == null) {
                                    obj7 = unknownFieldSchema3.getBuilderFromMessage(obj4);
                                }
                                if (!unknownFieldSchema3.mergeOneFieldFrom(obj7, reader, 0)) {
                                }
                            } else if (!reader.skipField()) {
                            }
                        }
                        obj6 = obj4;
                    } catch (Throwable th7) {
                        th = th7;
                        obj2 = obj6;
                        unknownFieldSchema2 = unknownFieldSchema3;
                        obj3 = obj7;
                        while (i < this.repeatedFieldOffsetStart) {
                        }
                        if (obj3 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th8) {
                th = th8;
            }
        }
    }

    static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = newInstance;
        return newInstance;
    }

    /* renamed from: com.google.protobuf.MessageSchema$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private int decodeMapEntryValue(byte[] bArr, int i, int i2, WireFormat.FieldType fieldType, Class cls, ArrayDecoders.Registers registers) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int decodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return decodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i));
                return i + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i));
                return i + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i));
                return i + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return decodeVarint32;
            case 12:
            case 13:
                int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return decodeVarint642;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor(cls), bArr, i, i2, registers);
            case 15:
                int decodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return decodeVarint322;
            case 16:
                int decodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return decodeVarint643;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    private int decodeMapEntry(byte[] bArr, int i, int i2, MapEntryLite.Metadata metadata, Map map, ArrayDecoders.Registers registers) {
        int i3;
        int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
        int i4 = registers.int1;
        if (i4 < 0 || i4 > i2 - decodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i5 = decodeVarint32 + i4;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (decodeVarint32 < i5) {
            int i6 = decodeVarint32 + 1;
            byte b = bArr[decodeVarint32];
            if (b < 0) {
                i3 = ArrayDecoders.decodeVarint32(b, bArr, i6, registers);
                b = registers.int1;
            } else {
                i3 = i6;
            }
            int i7 = b >>> 3;
            int i8 = b & 7;
            if (i7 == 1) {
                if (i8 == metadata.keyType.getWireType()) {
                    decodeVarint32 = decodeMapEntryValue(bArr, i3, i2, metadata.keyType, null, registers);
                    obj = registers.object1;
                } else {
                    decodeVarint32 = ArrayDecoders.skipField(b, bArr, i3, i2, registers);
                }
            } else {
                if (i7 == 2 && i8 == metadata.valueType.getWireType()) {
                    decodeVarint32 = decodeMapEntryValue(bArr, i3, i2, metadata.valueType, metadata.defaultValue.getClass(), registers);
                    obj2 = registers.object1;
                }
                decodeVarint32 = ArrayDecoders.skipField(b, bArr, i3, i2, registers);
            }
        }
        if (decodeVarint32 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i5;
    }

    private int parseRepeatedField(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, ArrayDecoders.Registers registers) {
        int decodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe.getObject(obj, j2);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            protobufList = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, protobufList);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedDoubleList(bArr, i, protobufList, registers);
                }
                if (i5 == 1) {
                    return ArrayDecoders.decodeDoubleList(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedFloatList(bArr, i, protobufList, registers);
                }
                if (i5 == 5) {
                    return ArrayDecoders.decodeFloatList(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedVarint64List(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeVarint64List(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedVarint32List(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeVarint32List(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedFixed64List(bArr, i, protobufList, registers);
                }
                if (i5 == 1) {
                    return ArrayDecoders.decodeFixed64List(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedFixed32List(bArr, i, protobufList, registers);
                }
                if (i5 == 5) {
                    return ArrayDecoders.decodeFixed32List(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedBoolList(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeBoolList(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        return ArrayDecoders.decodeStringList(i3, bArr, i, i2, protobufList, registers);
                    }
                    return ArrayDecoders.decodeStringListRequireUtf8(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 27:
                if (i5 == 2) {
                    return ArrayDecoders.decodeMessageList(getMessageFieldSchema(i6), i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 28:
                if (i5 == 2) {
                    return ArrayDecoders.decodeBytesList(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    decodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i, protobufList, registers);
                } else if (i5 == 0) {
                    decodeVarint32List = ArrayDecoders.decodeVarint32List(i3, bArr, i, i2, protobufList, registers);
                }
                SchemaUtil.filterUnknownEnumList(obj, i4, protobufList, getEnumFieldVerifier(i6), (Object) null, this.unknownFieldSchema);
                return decodeVarint32List;
            case 33:
            case 47:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedSInt32List(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeSInt32List(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    return ArrayDecoders.decodePackedSInt64List(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.decodeSInt64List(i3, bArr, i, i2, protobufList, registers);
                }
                break;
            case 49:
                if (i5 == 3) {
                    return ArrayDecoders.decodeGroupList(getMessageFieldSchema(i6), i3, bArr, i, i2, protobufList, registers);
                }
                break;
        }
        return i;
    }

    private int parseMapField(Object obj, byte[] bArr, int i, int i2, int i3, long j, ArrayDecoders.Registers registers) {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i3);
        Object object = unsafe.getObject(obj, j);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            unsafe.putObject(obj, j, newMapField);
            object = newMapField;
        }
        return decodeMapEntry(bArr, i, i2, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, ArrayDecoders.Registers registers) {
        Unsafe unsafe = UNSAFE;
        long j2 = this.buffer[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i)));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i)));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int decodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                    unsafe.putObject(obj, j, Long.valueOf(registers.long1));
                    unsafe.putInt(obj, j2, i4);
                    return decodeVarint64;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                    unsafe.putObject(obj, j, Integer.valueOf(registers.int1));
                    unsafe.putInt(obj, j2, i4);
                    return decodeVarint32;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                    unsafe.putObject(obj, j, Boolean.valueOf(registers.long1 != 0));
                    unsafe.putInt(obj, j2, i4);
                    return decodeVarint642;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int decodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                    int i13 = registers.int1;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !Utf8.isValidUtf8(bArr, decodeVarint322, decodeVarint322 + i13)) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        unsafe.putObject(obj, j, new String(bArr, decodeVarint322, i13, Internal.UTF_8));
                        decodeVarint322 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return decodeVarint322;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object mutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(obj, i4, i8);
                    int mergeMessageField = ArrayDecoders.mergeMessageField(mutableOneofMessageFieldForMerge, getMessageFieldSchema(i8), bArr, i, i2, registers);
                    storeOneofMessageField(obj, i4, i8, mutableOneofMessageFieldForMerge);
                    return mergeMessageField;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int decodeBytes = ArrayDecoders.decodeBytes(bArr, i, registers);
                    unsafe.putObject(obj, j, registers.object1);
                    unsafe.putInt(obj, j2, i4);
                    return decodeBytes;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int decodeVarint323 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                    int i14 = registers.int1;
                    Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i8);
                    if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i14)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        getMutableUnknownFields(obj).storeField(i3, Long.valueOf(i14));
                    }
                    return decodeVarint323;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int decodeVarint324 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                    unsafe.putObject(obj, j, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                    unsafe.putInt(obj, j2, i4);
                    return decodeVarint324;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int decodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                    unsafe.putObject(obj, j, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                    unsafe.putInt(obj, j2, i4);
                    return decodeVarint643;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object mutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(obj, i4, i8);
                    int mergeGroupField = ArrayDecoders.mergeGroupField(mutableOneofMessageFieldForMerge2, getMessageFieldSchema(i8), bArr, i, i2, (i3 & (-8)) | 4, registers);
                    storeOneofMessageField(obj, i4, i8, mutableOneofMessageFieldForMerge2);
                    return mergeGroupField;
                }
                break;
        }
        return i;
    }

    private Schema getMessageFieldSchema(int i) {
        int i2 = (i / 3) * 2;
        Schema schema = (Schema) this.objects[i2];
        if (schema != null) {
            return schema;
        }
        Schema schemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i2 + 1]);
        this.objects[i2] = schemaFor;
        return schemaFor;
    }

    private Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) * 2];
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i) {
        return (Internal.EnumVerifier) this.objects[((i / 3) * 2) + 1];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:101:0x009a. Please report as an issue. */
    int parseMessage(Object obj, byte[] bArr, int i, int i2, int i3, ArrayDecoders.Registers registers) {
        Unsafe unsafe;
        int i4;
        MessageSchema messageSchema;
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj2;
        int i9;
        int positionForFieldNumber;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        byte[] bArr2;
        int i16;
        int i17;
        char c;
        byte[] bArr3;
        int decodeVarint64;
        int i18;
        int i19;
        MessageSchema messageSchema2 = this;
        Object obj3 = obj;
        byte[] bArr4 = bArr;
        int i20 = i2;
        int i21 = i3;
        ArrayDecoders.Registers registers2 = registers;
        checkMutable(obj);
        Unsafe unsafe2 = UNSAFE;
        int i22 = i;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = -1;
        int i27 = 1048575;
        while (true) {
            if (i22 < i20) {
                int i28 = i22 + 1;
                byte b = bArr4[i22];
                if (b < 0) {
                    int decodeVarint32 = ArrayDecoders.decodeVarint32(b, bArr4, i28, registers2);
                    i9 = registers2.int1;
                    i28 = decodeVarint32;
                } else {
                    i9 = b;
                }
                int i29 = i9 >>> 3;
                int i30 = i9 & 7;
                if (i29 > i26) {
                    positionForFieldNumber = messageSchema2.positionForFieldNumber(i29, i23 / 3);
                } else {
                    positionForFieldNumber = messageSchema2.positionForFieldNumber(i29);
                }
                int i31 = positionForFieldNumber;
                if (i31 == -1) {
                    i10 = i29;
                    i11 = i28;
                    i6 = i9;
                    i12 = i25;
                    i13 = i27;
                    unsafe = unsafe2;
                    i4 = i21;
                    i14 = 0;
                } else {
                    int i32 = messageSchema2.buffer[i31 + 1];
                    int type = type(i32);
                    long offset = offset(i32);
                    int i33 = i9;
                    if (type <= 17) {
                        int i34 = messageSchema2.buffer[i31 + 2];
                        int i35 = 1 << (i34 >>> 20);
                        int i36 = 1048575;
                        int i37 = i34 & 1048575;
                        if (i37 != i27) {
                            if (i27 != 1048575) {
                                unsafe2.putInt(obj3, i27, i25);
                                i36 = 1048575;
                            }
                            i13 = i37;
                            i15 = i37 == i36 ? 0 : unsafe2.getInt(obj3, i37);
                        } else {
                            i15 = i25;
                            i13 = i27;
                        }
                        switch (type) {
                            case 0:
                                bArr2 = bArr;
                                i10 = i29;
                                i16 = i31;
                                i17 = i33;
                                c = 65535;
                                if (i30 != 1) {
                                    i4 = i3;
                                    i11 = i28;
                                    i14 = i16;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i17;
                                    break;
                                } else {
                                    UnsafeUtil.putDouble(obj3, offset, ArrayDecoders.decodeDouble(bArr2, i28));
                                    i22 = i28 + 8;
                                    i25 = i15 | i35;
                                    i21 = i3;
                                    i23 = i16;
                                    bArr4 = bArr2;
                                    i24 = i17;
                                    i27 = i13;
                                    i26 = i10;
                                    i20 = i2;
                                }
                            case 1:
                                bArr2 = bArr;
                                i10 = i29;
                                i16 = i31;
                                i17 = i33;
                                c = 65535;
                                if (i30 != 5) {
                                    i4 = i3;
                                    i11 = i28;
                                    i14 = i16;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i17;
                                    break;
                                } else {
                                    UnsafeUtil.putFloat(obj3, offset, ArrayDecoders.decodeFloat(bArr2, i28));
                                    i22 = i28 + 4;
                                    i25 = i15 | i35;
                                    i21 = i3;
                                    i23 = i16;
                                    bArr4 = bArr2;
                                    i24 = i17;
                                    i27 = i13;
                                    i26 = i10;
                                    i20 = i2;
                                }
                            case 2:
                            case 3:
                                bArr3 = bArr;
                                i10 = i29;
                                i16 = i31;
                                i17 = i33;
                                c = 65535;
                                if (i30 != 0) {
                                    i4 = i3;
                                    i11 = i28;
                                    i14 = i16;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i17;
                                    break;
                                } else {
                                    decodeVarint64 = ArrayDecoders.decodeVarint64(bArr3, i28, registers2);
                                    unsafe2.putLong(obj, offset, registers2.long1);
                                    i25 = i15 | i35;
                                    i21 = i3;
                                    i23 = i16;
                                    bArr4 = bArr3;
                                    i22 = decodeVarint64;
                                    i24 = i17;
                                    i27 = i13;
                                    i26 = i10;
                                    i20 = i2;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i10 = i29;
                                i16 = i31;
                                i17 = i33;
                                c = 65535;
                                if (i30 != 0) {
                                    i4 = i3;
                                    i11 = i28;
                                    i14 = i16;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i17;
                                    break;
                                } else {
                                    i22 = ArrayDecoders.decodeVarint32(bArr2, i28, registers2);
                                    unsafe2.putInt(obj3, offset, registers2.int1);
                                    i25 = i15 | i35;
                                    i21 = i3;
                                    i23 = i16;
                                    bArr4 = bArr2;
                                    i24 = i17;
                                    i27 = i13;
                                    i26 = i10;
                                    i20 = i2;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i10 = i29;
                                i16 = i31;
                                i17 = i33;
                                c = 65535;
                                if (i30 != 1) {
                                    i4 = i3;
                                    i11 = i28;
                                    i14 = i16;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i17;
                                    break;
                                } else {
                                    unsafe2.putLong(obj, offset, ArrayDecoders.decodeFixed64(bArr2, i28));
                                    i22 = i28 + 8;
                                    i25 = i15 | i35;
                                    i21 = i3;
                                    i23 = i16;
                                    bArr4 = bArr2;
                                    i24 = i17;
                                    i27 = i13;
                                    i26 = i10;
                                    i20 = i2;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i10 = i29;
                                i16 = i31;
                                i17 = i33;
                                c = 65535;
                                if (i30 != 5) {
                                    i4 = i3;
                                    i11 = i28;
                                    i14 = i16;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i17;
                                    break;
                                } else {
                                    unsafe2.putInt(obj3, offset, ArrayDecoders.decodeFixed32(bArr2, i28));
                                    i22 = i28 + 4;
                                    i25 = i15 | i35;
                                    i21 = i3;
                                    i23 = i16;
                                    bArr4 = bArr2;
                                    i24 = i17;
                                    i27 = i13;
                                    i26 = i10;
                                    i20 = i2;
                                }
                            case 7:
                                bArr2 = bArr;
                                i10 = i29;
                                i16 = i31;
                                i17 = i33;
                                c = 65535;
                                if (i30 != 0) {
                                    i4 = i3;
                                    i11 = i28;
                                    i14 = i16;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i17;
                                    break;
                                } else {
                                    i22 = ArrayDecoders.decodeVarint64(bArr2, i28, registers2);
                                    UnsafeUtil.putBoolean(obj3, offset, registers2.long1 != 0);
                                    i25 = i15 | i35;
                                    i21 = i3;
                                    i23 = i16;
                                    bArr4 = bArr2;
                                    i24 = i17;
                                    i27 = i13;
                                    i26 = i10;
                                    i20 = i2;
                                }
                            case 8:
                                bArr2 = bArr;
                                i10 = i29;
                                i16 = i31;
                                i17 = i33;
                                c = 65535;
                                if (i30 != 2) {
                                    i4 = i3;
                                    i11 = i28;
                                    i14 = i16;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i17;
                                    break;
                                } else {
                                    if (isEnforceUtf8(i32)) {
                                        i22 = ArrayDecoders.decodeStringRequireUtf8(bArr2, i28, registers2);
                                    } else {
                                        i22 = ArrayDecoders.decodeString(bArr2, i28, registers2);
                                    }
                                    unsafe2.putObject(obj3, offset, registers2.object1);
                                    i25 = i15 | i35;
                                    i21 = i3;
                                    i23 = i16;
                                    bArr4 = bArr2;
                                    i24 = i17;
                                    i27 = i13;
                                    i26 = i10;
                                    i20 = i2;
                                }
                            case 9:
                                bArr2 = bArr;
                                i10 = i29;
                                i16 = i31;
                                i17 = i33;
                                c = 65535;
                                if (i30 != 2) {
                                    i4 = i3;
                                    i11 = i28;
                                    i14 = i16;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i17;
                                    break;
                                } else {
                                    Object mutableMessageFieldForMerge = messageSchema2.mutableMessageFieldForMerge(obj3, i16);
                                    i22 = ArrayDecoders.mergeMessageField(mutableMessageFieldForMerge, messageSchema2.getMessageFieldSchema(i16), bArr, i28, i2, registers);
                                    messageSchema2.storeMessageField(obj3, i16, mutableMessageFieldForMerge);
                                    i25 = i15 | i35;
                                    i21 = i3;
                                    i23 = i16;
                                    bArr4 = bArr2;
                                    i24 = i17;
                                    i27 = i13;
                                    i26 = i10;
                                    i20 = i2;
                                }
                            case 10:
                                bArr2 = bArr;
                                i10 = i29;
                                i16 = i31;
                                i17 = i33;
                                c = 65535;
                                if (i30 != 2) {
                                    i4 = i3;
                                    i11 = i28;
                                    i14 = i16;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i17;
                                    break;
                                } else {
                                    i22 = ArrayDecoders.decodeBytes(bArr2, i28, registers2);
                                    unsafe2.putObject(obj3, offset, registers2.object1);
                                    i25 = i15 | i35;
                                    i21 = i3;
                                    i23 = i16;
                                    bArr4 = bArr2;
                                    i24 = i17;
                                    i27 = i13;
                                    i26 = i10;
                                    i20 = i2;
                                }
                            case 12:
                                bArr2 = bArr;
                                i10 = i29;
                                i16 = i31;
                                i17 = i33;
                                c = 65535;
                                if (i30 != 0) {
                                    i4 = i3;
                                    i11 = i28;
                                    i14 = i16;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i17;
                                    break;
                                } else {
                                    i22 = ArrayDecoders.decodeVarint32(bArr2, i28, registers2);
                                    int i38 = registers2.int1;
                                    Internal.EnumVerifier enumFieldVerifier = messageSchema2.getEnumFieldVerifier(i16);
                                    if (!isLegacyEnumIsClosed(i32) || enumFieldVerifier == null || enumFieldVerifier.isInRange(i38)) {
                                        unsafe2.putInt(obj3, offset, i38);
                                        i25 = i15 | i35;
                                        i21 = i3;
                                        i23 = i16;
                                        bArr4 = bArr2;
                                        i24 = i17;
                                        i27 = i13;
                                        i26 = i10;
                                        i20 = i2;
                                    } else {
                                        getMutableUnknownFields(obj).storeField(i17, Long.valueOf(i38));
                                        i21 = i3;
                                        i23 = i16;
                                        i25 = i15;
                                        i24 = i17;
                                        i27 = i13;
                                        i26 = i10;
                                        i20 = i2;
                                        bArr4 = bArr2;
                                    }
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i10 = i29;
                                i16 = i31;
                                i17 = i33;
                                c = 65535;
                                if (i30 != 0) {
                                    i4 = i3;
                                    i11 = i28;
                                    i14 = i16;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i17;
                                    break;
                                } else {
                                    i22 = ArrayDecoders.decodeVarint32(bArr2, i28, registers2);
                                    unsafe2.putInt(obj3, offset, CodedInputStream.decodeZigZag32(registers2.int1));
                                    i25 = i15 | i35;
                                    i21 = i3;
                                    i23 = i16;
                                    bArr4 = bArr2;
                                    i24 = i17;
                                    i27 = i13;
                                    i26 = i10;
                                    i20 = i2;
                                }
                            case 16:
                                i10 = i29;
                                i16 = i31;
                                i17 = i33;
                                c = 65535;
                                bArr3 = bArr;
                                if (i30 != 0) {
                                    i4 = i3;
                                    i11 = i28;
                                    i14 = i16;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i17;
                                    break;
                                } else {
                                    decodeVarint64 = ArrayDecoders.decodeVarint64(bArr3, i28, registers2);
                                    unsafe2.putLong(obj, offset, CodedInputStream.decodeZigZag64(registers2.long1));
                                    i25 = i15 | i35;
                                    i21 = i3;
                                    i23 = i16;
                                    bArr4 = bArr3;
                                    i22 = decodeVarint64;
                                    i24 = i17;
                                    i27 = i13;
                                    i26 = i10;
                                    i20 = i2;
                                }
                            case 17:
                                if (i30 != 3) {
                                    i10 = i29;
                                    i17 = i33;
                                    c = 65535;
                                    i16 = i31;
                                    i4 = i3;
                                    i11 = i28;
                                    i14 = i16;
                                    unsafe = unsafe2;
                                    i12 = i15;
                                    i6 = i17;
                                    break;
                                } else {
                                    Object mutableMessageFieldForMerge2 = messageSchema2.mutableMessageFieldForMerge(obj3, i31);
                                    i10 = i29;
                                    i17 = i33;
                                    i22 = ArrayDecoders.mergeGroupField(mutableMessageFieldForMerge2, messageSchema2.getMessageFieldSchema(i31), bArr, i28, i2, (i29 << 3) | 4, registers);
                                    messageSchema2.storeMessageField(obj3, i31, mutableMessageFieldForMerge2);
                                    i25 = i15 | i35;
                                    bArr4 = bArr;
                                    i21 = i3;
                                    i23 = i31;
                                    i24 = i17;
                                    i27 = i13;
                                    i26 = i10;
                                    i20 = i2;
                                }
                            default:
                                i10 = i29;
                                i16 = i31;
                                i17 = i33;
                                c = 65535;
                                i4 = i3;
                                i11 = i28;
                                i14 = i16;
                                unsafe = unsafe2;
                                i12 = i15;
                                i6 = i17;
                                break;
                        }
                    } else {
                        i10 = i29;
                        int i39 = i27;
                        i12 = i25;
                        if (type != 27) {
                            i13 = i39;
                            if (type <= 49) {
                                int i40 = i28;
                                unsafe = unsafe2;
                                i14 = i31;
                                i19 = i33;
                                i22 = parseRepeatedField(obj, bArr, i28, i2, i33, i10, i30, i31, i32, type, offset, registers);
                                if (i22 != i40) {
                                    messageSchema2 = this;
                                    obj3 = obj;
                                    bArr4 = bArr;
                                    i20 = i2;
                                    i21 = i3;
                                    registers2 = registers;
                                    i24 = i19;
                                    i25 = i12;
                                    i23 = i14;
                                    i27 = i13;
                                    i26 = i10;
                                    unsafe2 = unsafe;
                                } else {
                                    i4 = i3;
                                    i11 = i22;
                                    i6 = i19;
                                }
                            } else {
                                i18 = i28;
                                unsafe = unsafe2;
                                i14 = i31;
                                i19 = i33;
                                if (type != 50) {
                                    i22 = parseOneofField(obj, bArr, i18, i2, i19, i10, i30, i32, type, offset, i14, registers);
                                    if (i22 != i18) {
                                        messageSchema2 = this;
                                        obj3 = obj;
                                        bArr4 = bArr;
                                        i20 = i2;
                                        i21 = i3;
                                        registers2 = registers;
                                        i24 = i19;
                                        i25 = i12;
                                        i23 = i14;
                                        i27 = i13;
                                        i26 = i10;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i11 = i22;
                                        i6 = i19;
                                    }
                                } else if (i30 == 2) {
                                    i22 = parseMapField(obj, bArr, i18, i2, i14, offset, registers);
                                    if (i22 != i18) {
                                        messageSchema2 = this;
                                        obj3 = obj;
                                        bArr4 = bArr;
                                        i20 = i2;
                                        i21 = i3;
                                        registers2 = registers;
                                        i24 = i19;
                                        i25 = i12;
                                        i23 = i14;
                                        i27 = i13;
                                        i26 = i10;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i11 = i22;
                                        i6 = i19;
                                    }
                                }
                            }
                        } else if (i30 == 2) {
                            Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe2.getObject(obj3, offset);
                            if (!protobufList.isModifiable()) {
                                int size = protobufList.size();
                                protobufList = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj3, offset, protobufList);
                            }
                            i22 = ArrayDecoders.decodeMessageList(messageSchema2.getMessageFieldSchema(i31), i33, bArr, i28, i2, protobufList, registers);
                            i21 = i3;
                            i23 = i31;
                            i24 = i33;
                            i25 = i12;
                            i27 = i39;
                            i26 = i10;
                            bArr4 = bArr;
                            i20 = i2;
                        } else {
                            i13 = i39;
                            i18 = i28;
                            unsafe = unsafe2;
                            i14 = i31;
                            i19 = i33;
                        }
                        i4 = i3;
                        i11 = i18;
                        i6 = i19;
                    }
                }
                if (i6 != i4 || i4 == 0) {
                    if (this.hasExtensions && registers.extensionRegistry != ExtensionRegistryLite.getEmptyRegistry()) {
                        i22 = ArrayDecoders.decodeExtensionOrUnknownField(i6, bArr, i11, i2, obj, this.defaultInstance, this.unknownFieldSchema, registers);
                    } else {
                        i22 = ArrayDecoders.decodeUnknownField(i6, bArr, i11, i2, getMutableUnknownFields(obj), registers);
                    }
                    obj3 = obj;
                    bArr4 = bArr;
                    i20 = i2;
                    i24 = i6;
                    messageSchema2 = this;
                    registers2 = registers;
                    i25 = i12;
                    i23 = i14;
                    i27 = i13;
                    i26 = i10;
                    unsafe2 = unsafe;
                    i21 = i4;
                } else {
                    i8 = 1048575;
                    messageSchema = this;
                    i5 = i11;
                    i25 = i12;
                    i7 = i13;
                }
            } else {
                int i41 = i27;
                unsafe = unsafe2;
                i4 = i21;
                messageSchema = messageSchema2;
                i5 = i22;
                i6 = i24;
                i7 = i41;
                i8 = 1048575;
            }
        }
        if (i7 != i8) {
            obj2 = obj;
            unsafe.putInt(obj2, i7, i25);
        } else {
            obj2 = obj;
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i42 = messageSchema.checkInitializedCount; i42 < messageSchema.repeatedFieldOffsetStart; i42++) {
            unknownFieldSetLite = (UnknownFieldSetLite) filterMapUnknownEnumValues(obj, messageSchema.intArray[i42], unknownFieldSetLite, messageSchema.unknownFieldSchema, obj);
        }
        if (unknownFieldSetLite != null) {
            messageSchema.unknownFieldSchema.setBuilderToMessage(obj2, unknownFieldSetLite);
        }
        if (i4 == 0) {
            if (i5 != i2) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i5 > i2 || i6 != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i5;
    }

    private Object mutableMessageFieldForMerge(Object obj, int i) {
        Schema messageFieldSchema = getMessageFieldSchema(i);
        long offset = offset(typeAndOffsetAt(i));
        if (!isFieldPresent(obj, i)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(obj, offset);
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    private void storeMessageField(Object obj, int i, Object obj2) {
        UNSAFE.putObject(obj, offset(typeAndOffsetAt(i)), obj2);
        setFieldPresent(obj, i);
    }

    private Object mutableOneofMessageFieldForMerge(Object obj, int i, int i2) {
        Schema messageFieldSchema = getMessageFieldSchema(i2);
        if (!isOneofPresent(obj, i, i2)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(obj, offset(typeAndOffsetAt(i2)));
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    private void storeOneofMessageField(Object obj, int i, int i2, Object obj2) {
        UNSAFE.putObject(obj, offset(typeAndOffsetAt(i2)), obj2);
        setOneofPresent(obj, i, i2);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(Object obj, byte[] bArr, int i, int i2, ArrayDecoders.Registers registers) {
        parseMessage(obj, bArr, i, i2, 0, registers);
    }

    @Override // com.google.protobuf.Schema
    public void makeImmutable(Object obj) {
        if (isMutable(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int length = this.buffer.length;
            for (int i = 0; i < length; i += 3) {
                int typeAndOffsetAt = typeAndOffsetAt(i);
                long offset = offset(typeAndOffsetAt);
                int type = type(typeAndOffsetAt);
                if (type != 9) {
                    if (type == 60 || type == 68) {
                        if (isOneofPresent(obj, numberAt(i), i)) {
                            getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(obj, offset));
                        }
                    } else {
                        switch (type) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.listFieldSchema.makeImmutableListAt(obj, offset);
                                break;
                            case 50:
                                Unsafe unsafe = UNSAFE;
                                Object object = unsafe.getObject(obj, offset);
                                if (object != null) {
                                    unsafe.putObject(obj, offset, this.mapFieldSchema.toImmutable(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                }
                if (isFieldPresent(obj, i)) {
                    getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(obj, offset));
                }
            }
            this.unknownFieldSchema.makeImmutable(obj);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(obj);
            }
        }
    }

    private final void mergeMap(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long offset = offset(typeAndOffsetAt(i));
        Object object = UnsafeUtil.getObject(obj, offset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, offset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            UnsafeUtil.putObject(obj, offset, newMapField);
            object = newMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    private Object filterMapUnknownEnumValues(Object obj, int i, Object obj2, UnknownFieldSchema unknownFieldSchema, Object obj3) {
        Internal.EnumVerifier enumFieldVerifier;
        int numberAt = numberAt(i);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i)) == null) ? obj2 : filterUnknownEnumMap(i, numberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, obj2, unknownFieldSchema, obj3);
    }

    private Object filterUnknownEnumMap(int i, int i2, Map map, Internal.EnumVerifier enumVerifier, Object obj, UnknownFieldSchema unknownFieldSchema, Object obj2) {
        MapEntryLite.Metadata forMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!enumVerifier.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = unknownFieldSchema.getBuilderFromMessage(obj2);
                }
                ByteString.CodedBuilder newCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(forMapMetadata, entry.getKey(), entry.getValue()));
                try {
                    MapEntryLite.writeTo(newCodedBuilder.getCodedOutput(), forMapMetadata, entry.getKey(), entry.getValue());
                    unknownFieldSchema.addLengthDelimited(obj, i2, newCodedBuilder.build());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    @Override // com.google.protobuf.Schema
    public final boolean isInitialized(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.checkInitializedCount) {
            int i6 = this.intArray[i5];
            int numberAt = numberAt(i6);
            int typeAndOffsetAt = typeAndOffsetAt(i6);
            int i7 = this.buffer[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = UNSAFE.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if (isRequired(typeAndOffsetAt) && !isFieldPresent(obj, i6, i, i2, i9)) {
                return false;
            }
            int type = type(typeAndOffsetAt);
            if (type == 9 || type == 17) {
                if (isFieldPresent(obj, i6, i, i2, i9) && !isInitialized(obj, typeAndOffsetAt, getMessageFieldSchema(i6))) {
                    return false;
                }
            } else {
                if (type != 27) {
                    if (type == 60 || type == 68) {
                        if (isOneofPresent(obj, numberAt, i6) && !isInitialized(obj, typeAndOffsetAt, getMessageFieldSchema(i6))) {
                            return false;
                        }
                    } else if (type != 49) {
                        if (type == 50 && !isMapInitialized(obj, typeAndOffsetAt, i6)) {
                            return false;
                        }
                    }
                }
                if (!isListInitialized(obj, typeAndOffsetAt, i6)) {
                    return false;
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(obj).isInitialized();
    }

    private static boolean isInitialized(Object obj, int i, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i)));
    }

    private boolean isListInitialized(Object obj, int i, int i2) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!messageFieldSchema.isInitialized(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    private boolean isMapInitialized(Object obj, int i, int i2) {
        Map forMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(obj, offset(i)));
        if (forMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        Schema schema = null;
        for (Object obj2 : forMapData.values()) {
            if (schema == null) {
                schema = Protobuf.getInstance().schemaFor((Class) obj2.getClass());
            }
            if (!schema.isInitialized(obj2)) {
                return false;
            }
        }
        return true;
    }

    private void writeString(int i, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.writeString(i, (String) obj);
        } else {
            writer.writeBytes(i, (ByteString) obj);
        }
    }

    private void readString(Object obj, int i, Reader reader) {
        if (isEnforceUtf8(i)) {
            UnsafeUtil.putObject(obj, offset(i), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i, Reader reader) {
        if (isEnforceUtf8(i)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i)));
        }
    }

    private void readMessageList(Object obj, int i, Reader reader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i)), schema, extensionRegistryLite);
    }

    private void readGroupList(Object obj, long j, Reader reader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j), schema, extensionRegistryLite);
    }

    private int numberAt(int i) {
        return this.buffer[i];
    }

    private int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    private int presenceMaskAndOffsetAt(int i) {
        return this.buffer[i + 2];
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private static double doubleAt(Object obj, long j) {
        return UnsafeUtil.getDouble(obj, j);
    }

    private static float floatAt(Object obj, long j) {
        return UnsafeUtil.getFloat(obj, j);
    }

    private static int intAt(Object obj, long j) {
        return UnsafeUtil.getInt(obj, j);
    }

    private static long longAt(Object obj, long j) {
        return UnsafeUtil.getLong(obj, j);
    }

    private static boolean booleanAt(Object obj, long j) {
        return UnsafeUtil.getBoolean(obj, j);
    }

    private static double oneofDoubleAt(Object obj, long j) {
        return ((Double) UnsafeUtil.getObject(obj, j)).doubleValue();
    }

    private static float oneofFloatAt(Object obj, long j) {
        return ((Float) UnsafeUtil.getObject(obj, j)).floatValue();
    }

    private static int oneofIntAt(Object obj, long j) {
        return ((Integer) UnsafeUtil.getObject(obj, j)).intValue();
    }

    private static long oneofLongAt(Object obj, long j) {
        return ((Long) UnsafeUtil.getObject(obj, j)).longValue();
    }

    private static boolean oneofBooleanAt(Object obj, long j) {
        return ((Boolean) UnsafeUtil.getObject(obj, j)).booleanValue();
    }

    private boolean arePresentForEquals(Object obj, Object obj2, int i) {
        return isFieldPresent(obj, i) == isFieldPresent(obj2, i);
    }

    private boolean isFieldPresent(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return isFieldPresent(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private boolean isFieldPresent(Object obj, int i) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & presenceMaskAndOffsetAt;
        if (j != 1048575) {
            return (UnsafeUtil.getInt(obj, j) & (1 << (presenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int typeAndOffsetAt = typeAndOffsetAt(i);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(obj, offset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(obj, offset)) != 0;
            case 2:
                return UnsafeUtil.getLong(obj, offset) != 0;
            case 3:
                return UnsafeUtil.getLong(obj, offset) != 0;
            case 4:
                return UnsafeUtil.getInt(obj, offset) != 0;
            case 5:
                return UnsafeUtil.getLong(obj, offset) != 0;
            case 6:
                return UnsafeUtil.getInt(obj, offset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(obj, offset);
            case 8:
                Object object = UnsafeUtil.getObject(obj, offset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof ByteString) {
                    return !ByteString.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return UnsafeUtil.getObject(obj, offset) != null;
            case 10:
                return !ByteString.EMPTY.equals(UnsafeUtil.getObject(obj, offset));
            case 11:
                return UnsafeUtil.getInt(obj, offset) != 0;
            case 12:
                return UnsafeUtil.getInt(obj, offset) != 0;
            case 13:
                return UnsafeUtil.getInt(obj, offset) != 0;
            case 14:
                return UnsafeUtil.getLong(obj, offset) != 0;
            case 15:
                return UnsafeUtil.getInt(obj, offset) != 0;
            case 16:
                return UnsafeUtil.getLong(obj, offset) != 0;
            case 17:
                return UnsafeUtil.getObject(obj, offset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void setFieldPresent(Object obj, int i) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & presenceMaskAndOffsetAt;
        if (j == 1048575) {
            return;
        }
        UnsafeUtil.putInt(obj, j, (1 << (presenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(obj, j));
    }

    private boolean isOneofPresent(Object obj, int i, int i2) {
        return UnsafeUtil.getInt(obj, (long) (presenceMaskAndOffsetAt(i2) & 1048575)) == i;
    }

    private boolean isOneofCaseEqual(Object obj, Object obj2, int i) {
        long presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i) & 1048575;
        return UnsafeUtil.getInt(obj, presenceMaskAndOffsetAt) == UnsafeUtil.getInt(obj2, presenceMaskAndOffsetAt);
    }

    private void setOneofPresent(Object obj, int i, int i2) {
        UnsafeUtil.putInt(obj, presenceMaskAndOffsetAt(i2) & 1048575, i);
    }

    private int positionForFieldNumber(int i) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, 0);
    }

    private int positionForFieldNumber(int i, int i2) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, i2);
    }

    private int slowPositionForFieldNumber(int i, int i2) {
        int length = (this.buffer.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int numberAt = numberAt(i4);
            if (i == numberAt) {
                return i4;
            }
            if (i < numberAt) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
