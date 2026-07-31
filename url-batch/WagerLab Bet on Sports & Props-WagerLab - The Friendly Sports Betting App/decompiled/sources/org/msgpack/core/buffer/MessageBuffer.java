package org.msgpack.core.buffer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.msgpack.core.Preconditions;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
public class MessageBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int ARRAY_BYTE_BASE_OFFSET;
    private static final String BIGENDIAN_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferBE";
    private static final String DEFAULT_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBuffer";
    private static final String UNIVERSAL_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferU";
    static final boolean isUniversalBuffer;
    private static final Constructor<?> mbArrConstructor;
    private static final Constructor<?> mbBBConstructor;
    static final Unsafe unsafe;
    protected final long address;
    protected final Object base;
    protected final ByteBuffer reference;
    protected final int size;

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(3:2|3|4)|(11:(3:91|92|(19:97|7|8|(14:10|11|(1:13)(1:84)|14|15|16|17|(1:78)(1:23)|(4:39|40|42|(2:44|(1:46)(2:47|48))(2:49|50))|25|(3:27|(1:29)|30)|31|32|34)|86|11|(0)(0)|14|15|16|17|(0)|78|(0)|25|(0)|31|32|34))|16|17|(0)|78|(0)|25|(0)|31|32|34)|6|7|8|(0)|86|11|(0)(0)|14|15|(2:(1:101)|(0))) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0073  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v9 */
    static {
        char c;
        String property;
        int indexOf;
        int parseInt;
        int parseInt2;
        boolean z;
        boolean z2;
        Unsafe unsafe2;
        String str = DEFAULT_MESSAGE_BUFFER;
        boolean z3 = "";
        String str2 = UNIVERSAL_MESSAGE_BUFFER;
        Unsafe unsafe3 = null;
        int i = 16;
        try {
            try {
                property = System.getProperty("java.specification.version", "");
                indexOf = property.indexOf(46);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            c = 2;
        } catch (Throwable th2) {
            th = th2;
            c = 2;
        }
        try {
            try {
                if (indexOf != -1) {
                    try {
                        try {
                            try {
                                parseInt = Integer.parseInt(property.substring(0, indexOf));
                                parseInt2 = Integer.parseInt(property.substring(indexOf + 1));
                            } catch (NumberFormatException e2) {
                                e2.printStackTrace(System.err);
                            }
                            if (parseInt > 1 || (parseInt == 1 && parseInt2 >= 7)) {
                                z = true;
                                if (Class.forName("sun.misc.Unsafe") != null) {
                                    z2 = true;
                                    c = 2;
                                    z3 = (Boolean.parseBoolean(System.getProperty("msgpack.universal-buffer", "false")) && !System.getProperty("java.runtime.name", "").toLowerCase().contains("android") && !(System.getProperty("com.google.appengine.runtime.version") != null) && z && z2) ? 0 : 1;
                                    if (z3 == 0) {
                                        try {
                                            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                                            declaredField.setAccessible(true);
                                            unsafe2 = (Unsafe) declaredField.get(null);
                                        } catch (Exception e3) {
                                            e = e3;
                                        }
                                        try {
                                            if (unsafe2 == null) {
                                                throw new RuntimeException("Unsafe is unavailable");
                                            }
                                            i = unsafe2.arrayBaseOffset(byte[].class);
                                            int arrayIndexScale = unsafe2.arrayIndexScale(byte[].class);
                                            if (arrayIndexScale != 1) {
                                                throw new IllegalStateException("Byte array index scale must be 1, but is " + arrayIndexScale);
                                            }
                                            unsafe3 = unsafe2;
                                        } catch (Exception e4) {
                                            e = e4;
                                            unsafe3 = unsafe2;
                                            e.printStackTrace(System.err);
                                            unsafe = unsafe3;
                                            ARRAY_BYTE_BASE_OFFSET = 16;
                                            isUniversalBuffer = true;
                                            try {
                                                Class<?> cls = Class.forName(UNIVERSAL_MESSAGE_BUFFER);
                                                Class<?>[] clsArr = new Class[3];
                                                clsArr[0] = byte[].class;
                                                clsArr[1] = Integer.TYPE;
                                                clsArr[c] = Integer.TYPE;
                                                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(clsArr);
                                                declaredConstructor.setAccessible(true);
                                                mbArrConstructor = declaredConstructor;
                                                Constructor<?> declaredConstructor2 = cls.getDeclaredConstructor(ByteBuffer.class);
                                                declaredConstructor2.setAccessible(true);
                                                mbBBConstructor = declaredConstructor2;
                                                return;
                                            } catch (Exception e5) {
                                                e5.printStackTrace(System.err);
                                                throw new RuntimeException(e5);
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            unsafe3 = unsafe2;
                                            unsafe = unsafe3;
                                            ARRAY_BYTE_BASE_OFFSET = 16;
                                            isUniversalBuffer = z3;
                                            if (z3 == 0) {
                                            }
                                            try {
                                                Class<?> cls2 = Class.forName(str2);
                                                Class<?>[] clsArr2 = new Class[3];
                                                clsArr2[0] = byte[].class;
                                                clsArr2[1] = Integer.TYPE;
                                                clsArr2[c] = Integer.TYPE;
                                                Constructor<?> declaredConstructor3 = cls2.getDeclaredConstructor(clsArr2);
                                                declaredConstructor3.setAccessible(true);
                                                mbArrConstructor = declaredConstructor3;
                                                Constructor<?> declaredConstructor4 = cls2.getDeclaredConstructor(ByteBuffer.class);
                                                declaredConstructor4.setAccessible(true);
                                                mbBBConstructor = declaredConstructor4;
                                                throw th;
                                            } catch (Exception e6) {
                                                e6.printStackTrace(System.err);
                                                throw new RuntimeException(e6);
                                            }
                                        }
                                    }
                                    unsafe = unsafe3;
                                    ARRAY_BYTE_BASE_OFFSET = i;
                                    isUniversalBuffer = z3;
                                    if (z3 == 0) {
                                        if (ByteOrder.nativeOrder() != ByteOrder.LITTLE_ENDIAN) {
                                            str = BIGENDIAN_MESSAGE_BUFFER;
                                        }
                                        str2 = str;
                                    }
                                    Class<?> cls3 = Class.forName(str2);
                                    Constructor<?> declaredConstructor5 = cls3.getDeclaredConstructor(byte[].class, Integer.TYPE, Integer.TYPE);
                                    declaredConstructor5.setAccessible(true);
                                    mbArrConstructor = declaredConstructor5;
                                    Constructor<?> declaredConstructor6 = cls3.getDeclaredConstructor(ByteBuffer.class);
                                    declaredConstructor6.setAccessible(true);
                                    mbBBConstructor = declaredConstructor6;
                                    return;
                                }
                                z2 = false;
                                c = 2;
                                if (Boolean.parseBoolean(System.getProperty("msgpack.universal-buffer", "false"))) {
                                }
                                if (z3 == 0) {
                                }
                                unsafe = unsafe3;
                                ARRAY_BYTE_BASE_OFFSET = i;
                                isUniversalBuffer = z3;
                                if (z3 == 0) {
                                }
                                Class<?> cls32 = Class.forName(str2);
                                Constructor<?> declaredConstructor52 = cls32.getDeclaredConstructor(byte[].class, Integer.TYPE, Integer.TYPE);
                                declaredConstructor52.setAccessible(true);
                                mbArrConstructor = declaredConstructor52;
                                Constructor<?> declaredConstructor62 = cls32.getDeclaredConstructor(ByteBuffer.class);
                                declaredConstructor62.setAccessible(true);
                                mbBBConstructor = declaredConstructor62;
                                return;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z3 = 0;
                            c = 2;
                            unsafe = unsafe3;
                            ARRAY_BYTE_BASE_OFFSET = 16;
                            isUniversalBuffer = z3;
                            if (z3 == 0) {
                                if (ByteOrder.nativeOrder() != ByteOrder.LITTLE_ENDIAN) {
                                    str = BIGENDIAN_MESSAGE_BUFFER;
                                }
                                str2 = str;
                            }
                            Class<?> cls22 = Class.forName(str2);
                            Class<?>[] clsArr22 = new Class[3];
                            clsArr22[0] = byte[].class;
                            clsArr22[1] = Integer.TYPE;
                            clsArr22[c] = Integer.TYPE;
                            Constructor<?> declaredConstructor32 = cls22.getDeclaredConstructor(clsArr22);
                            declaredConstructor32.setAccessible(true);
                            mbArrConstructor = declaredConstructor32;
                            Constructor<?> declaredConstructor42 = cls22.getDeclaredConstructor(ByteBuffer.class);
                            declaredConstructor42.setAccessible(true);
                            mbBBConstructor = declaredConstructor42;
                            throw th;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        c = 2;
                        e.printStackTrace(System.err);
                        unsafe = unsafe3;
                        ARRAY_BYTE_BASE_OFFSET = 16;
                        isUniversalBuffer = true;
                        Class<?> cls4 = Class.forName(UNIVERSAL_MESSAGE_BUFFER);
                        Class<?>[] clsArr3 = new Class[3];
                        clsArr3[0] = byte[].class;
                        clsArr3[1] = Integer.TYPE;
                        clsArr3[c] = Integer.TYPE;
                        Constructor<?> declaredConstructor7 = cls4.getDeclaredConstructor(clsArr3);
                        declaredConstructor7.setAccessible(true);
                        mbArrConstructor = declaredConstructor7;
                        Constructor<?> declaredConstructor22 = cls4.getDeclaredConstructor(ByteBuffer.class);
                        declaredConstructor22.setAccessible(true);
                        mbBBConstructor = declaredConstructor22;
                        return;
                    }
                }
                Class<?> cls322 = Class.forName(str2);
                Constructor<?> declaredConstructor522 = cls322.getDeclaredConstructor(byte[].class, Integer.TYPE, Integer.TYPE);
                declaredConstructor522.setAccessible(true);
                mbArrConstructor = declaredConstructor522;
                Constructor<?> declaredConstructor622 = cls322.getDeclaredConstructor(ByteBuffer.class);
                declaredConstructor622.setAccessible(true);
                mbBBConstructor = declaredConstructor622;
                return;
            } catch (Exception e8) {
                e8.printStackTrace(System.err);
                throw new RuntimeException(e8);
            }
            if (Boolean.parseBoolean(System.getProperty("msgpack.universal-buffer", "false"))) {
            }
            if (z3 == 0) {
            }
            unsafe = unsafe3;
            ARRAY_BYTE_BASE_OFFSET = i;
            isUniversalBuffer = z3;
            if (z3 == 0) {
            }
        } catch (Exception e9) {
            e = e9;
            e.printStackTrace(System.err);
            unsafe = unsafe3;
            ARRAY_BYTE_BASE_OFFSET = 16;
            isUniversalBuffer = true;
            Class<?> cls42 = Class.forName(UNIVERSAL_MESSAGE_BUFFER);
            Class<?>[] clsArr32 = new Class[3];
            clsArr32[0] = byte[].class;
            clsArr32[1] = Integer.TYPE;
            clsArr32[c] = Integer.TYPE;
            Constructor<?> declaredConstructor72 = cls42.getDeclaredConstructor(clsArr32);
            declaredConstructor72.setAccessible(true);
            mbArrConstructor = declaredConstructor72;
            Constructor<?> declaredConstructor222 = cls42.getDeclaredConstructor(ByteBuffer.class);
            declaredConstructor222.setAccessible(true);
            mbBBConstructor = declaredConstructor222;
            return;
        } catch (Throwable th5) {
            th = th5;
            z3 = 0;
            unsafe = unsafe3;
            ARRAY_BYTE_BASE_OFFSET = 16;
            isUniversalBuffer = z3;
            if (z3 == 0) {
            }
            Class<?> cls222 = Class.forName(str2);
            Class<?>[] clsArr222 = new Class[3];
            clsArr222[0] = byte[].class;
            clsArr222[1] = Integer.TYPE;
            clsArr222[c] = Integer.TYPE;
            Constructor<?> declaredConstructor322 = cls222.getDeclaredConstructor(clsArr222);
            declaredConstructor322.setAccessible(true);
            mbArrConstructor = declaredConstructor322;
            Constructor<?> declaredConstructor422 = cls222.getDeclaredConstructor(ByteBuffer.class);
            declaredConstructor422.setAccessible(true);
            mbBBConstructor = declaredConstructor422;
            throw th;
        }
        z = false;
        if (Class.forName("sun.misc.Unsafe") != null) {
        }
        z2 = false;
        c = 2;
    }

    public static MessageBuffer allocate(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("size must not be negative");
        }
        return wrap(new byte[i]);
    }

    public static MessageBuffer wrap(byte[] bArr) {
        return newMessageBuffer(bArr, 0, bArr.length);
    }

    public static MessageBuffer wrap(byte[] bArr, int i, int i2) {
        return newMessageBuffer(bArr, i, i2);
    }

    public static MessageBuffer wrap(ByteBuffer byteBuffer) {
        return newMessageBuffer(byteBuffer);
    }

    private static MessageBuffer newMessageBuffer(byte[] bArr, int i, int i2) {
        Preconditions.checkNotNull(bArr);
        return newInstance(mbArrConstructor, bArr, Integer.valueOf(i), Integer.valueOf(i2));
    }

    private static MessageBuffer newMessageBuffer(ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer);
        return newInstance(mbBBConstructor, byteBuffer);
    }

    private static MessageBuffer newInstance(Constructor<?> constructor, Object... objArr) {
        try {
            return (MessageBuffer) constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            if (e3.getCause() instanceof Error) {
                throw ((Error) e3.getCause());
            }
            throw new IllegalStateException(e3.getCause());
        }
    }

    public static void releaseBuffer(MessageBuffer messageBuffer) {
        if (isUniversalBuffer || messageBuffer.hasArray()) {
            return;
        }
        if (DirectBufferAccess.isDirectByteBufferInstance(messageBuffer.reference)) {
            DirectBufferAccess.clean(messageBuffer.reference);
        } else {
            unsafe.freeMemory(messageBuffer.address);
        }
    }

    MessageBuffer(byte[] bArr, int i, int i2) {
        this.base = bArr;
        this.address = ARRAY_BYTE_BASE_OFFSET + i;
        this.size = i2;
        this.reference = null;
    }

    MessageBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            if (isUniversalBuffer) {
                throw new UnsupportedOperationException("Cannot create MessageBuffer from a DirectBuffer on this platform");
            }
            this.base = null;
            this.address = DirectBufferAccess.getAddress(byteBuffer) + byteBuffer.position();
            this.size = byteBuffer.remaining();
            this.reference = byteBuffer;
            return;
        }
        if (byteBuffer.hasArray()) {
            this.base = byteBuffer.array();
            this.address = ARRAY_BYTE_BASE_OFFSET + byteBuffer.arrayOffset() + byteBuffer.position();
            this.size = byteBuffer.remaining();
            this.reference = null;
            return;
        }
        throw new IllegalArgumentException("Only the array-backed ByteBuffer or DirectBuffer is supported");
    }

    protected MessageBuffer(Object obj, long j, int i) {
        this.base = obj;
        this.address = j;
        this.size = i;
        this.reference = null;
    }

    public int size() {
        return this.size;
    }

    public MessageBuffer slice(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        Preconditions.checkArgument(i + i2 <= size());
        return new MessageBuffer(this.base, this.address + i, i2);
    }

    public byte getByte(int i) {
        return unsafe.getByte(this.base, this.address + i);
    }

    public boolean getBoolean(int i) {
        return unsafe.getBoolean(this.base, this.address + i);
    }

    public short getShort(int i) {
        return Short.reverseBytes(unsafe.getShort(this.base, this.address + i));
    }

    public int getInt(int i) {
        return Integer.reverseBytes(unsafe.getInt(this.base, this.address + i));
    }

    public float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    public long getLong(int i) {
        return Long.reverseBytes(unsafe.getLong(this.base, this.address + i));
    }

    public double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    public void getBytes(int i, byte[] bArr, int i2, int i3) {
        unsafe.copyMemory(this.base, this.address + i, bArr, ARRAY_BYTE_BASE_OFFSET + i2, i3);
    }

    public void getBytes(int i, int i2, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < i2) {
            throw new BufferOverflowException();
        }
        byteBuffer.put(sliceAsByteBuffer(i, i2));
    }

    public void putByte(int i, byte b) {
        unsafe.putByte(this.base, this.address + i, b);
    }

    public void putBoolean(int i, boolean z) {
        unsafe.putBoolean(this.base, this.address + i, z);
    }

    public void putShort(int i, short s) {
        unsafe.putShort(this.base, this.address + i, Short.reverseBytes(s));
    }

    public void putInt(int i, int i2) {
        unsafe.putInt(this.base, this.address + i, Integer.reverseBytes(i2));
    }

    public void putFloat(int i, float f) {
        putInt(i, Float.floatToRawIntBits(f));
    }

    public void putLong(int i, long j) {
        unsafe.putLong(this.base, i + this.address, Long.reverseBytes(j));
    }

    public void putDouble(int i, double d) {
        putLong(i, Double.doubleToRawLongBits(d));
    }

    public void putBytes(int i, byte[] bArr, int i2, int i3) {
        unsafe.copyMemory(bArr, ARRAY_BYTE_BASE_OFFSET + i2, this.base, this.address + i, i3);
    }

    public void putByteBuffer(int i, ByteBuffer byteBuffer, int i2) {
        if (byteBuffer.isDirect()) {
            unsafe.copyMemory((Object) null, DirectBufferAccess.getAddress(byteBuffer) + byteBuffer.position(), this.base, this.address + i, i2);
            byteBuffer.position(byteBuffer.position() + i2);
            return;
        }
        if (byteBuffer.hasArray()) {
            unsafe.copyMemory(byteBuffer.array(), ARRAY_BYTE_BASE_OFFSET + byteBuffer.position(), this.base, this.address + i, i2);
            byteBuffer.position(byteBuffer.position() + i2);
        } else {
            if (hasArray()) {
                byteBuffer.get((byte[]) this.base, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                unsafe.putByte(this.base, this.address + i, byteBuffer.get());
            }
        }
    }

    public void putMessageBuffer(int i, MessageBuffer messageBuffer, int i2, int i3) {
        unsafe.copyMemory(messageBuffer.base, messageBuffer.address + i2, this.base, i + this.address, i3);
    }

    public ByteBuffer sliceAsByteBuffer(int i, int i2) {
        if (hasArray()) {
            return ByteBuffer.wrap((byte[]) this.base, (int) ((this.address - ARRAY_BYTE_BASE_OFFSET) + i), i2);
        }
        return DirectBufferAccess.newByteBuffer(this.address, i, i2, this.reference);
    }

    public ByteBuffer sliceAsByteBuffer() {
        return sliceAsByteBuffer(0, size());
    }

    public boolean hasArray() {
        return this.base != null;
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        unsafe.copyMemory(this.base, this.address, bArr, ARRAY_BYTE_BASE_OFFSET, size());
        return bArr;
    }

    public byte[] array() {
        return (byte[]) this.base;
    }

    public int arrayOffset() {
        return ((int) this.address) - ARRAY_BYTE_BASE_OFFSET;
    }

    public void copyTo(int i, MessageBuffer messageBuffer, int i2, int i3) {
        unsafe.copyMemory(this.base, this.address + i, messageBuffer.base, i2 + messageBuffer.address, i3);
    }

    public String toHexString(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = i; i3 < i2; i3++) {
            if (i3 != i) {
                sb.append(" ");
            }
            sb.append(String.format("%02x", Byte.valueOf(getByte(i3))));
        }
        return sb.toString();
    }
}
