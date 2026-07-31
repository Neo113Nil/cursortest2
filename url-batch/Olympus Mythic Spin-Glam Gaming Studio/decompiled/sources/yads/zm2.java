package yads;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zm2 extends o41 {
    public static final zm2 h = new zm2(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    public final transient Object e;
    public final transient Object[] f;
    public final transient int g;

    public zm2(Object obj, Object[] objArr, int i) {
        this.e = obj;
        this.f = objArr;
        this.g = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a1, code lost:
    
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d9, code lost:
    
        r2[r7] = r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zm2 a(int i, Object[] objArr) {
        byte[] bArr;
        if (i == 0) {
            return h;
        }
        Object obj = null;
        int i2 = 0;
        if (i == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new zm2(null, objArr, 1);
        }
        hg2.b(i, objArr.length >> 1);
        int a = q41.a(i);
        if (i == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
        } else {
            int i3 = a - 1;
            if (a <= 128) {
                bArr = new byte[a];
                Arrays.fill(bArr, (byte) -1);
                while (i2 < i) {
                    int i4 = i2 * 2;
                    Object obj2 = objArr[i4];
                    Objects.requireNonNull(obj2);
                    Object obj3 = objArr[i4 ^ 1];
                    Objects.requireNonNull(obj3);
                    int a2 = rz0.a(obj2.hashCode());
                    while (true) {
                        int i5 = a2 & i3;
                        int i6 = bArr[i5] & 255;
                        if (i6 == 255) {
                            break;
                        }
                        if (obj2.equals(objArr[i6])) {
                            throw a(obj2, obj3, objArr, i6);
                        }
                        a2 = i5 + 1;
                    }
                }
            } else if (a <= 32768) {
                bArr = new short[a];
                Arrays.fill(bArr, (short) -1);
                while (i2 < i) {
                    int i7 = i2 * 2;
                    Object obj4 = objArr[i7];
                    Objects.requireNonNull(obj4);
                    Object obj5 = objArr[i7 ^ 1];
                    Objects.requireNonNull(obj5);
                    int a3 = rz0.a(obj4.hashCode());
                    while (true) {
                        int i8 = a3 & i3;
                        int i9 = bArr[i8] & 65535;
                        if (i9 == 65535) {
                            break;
                        }
                        if (obj4.equals(objArr[i9])) {
                            throw a(obj4, obj5, objArr, i9);
                        }
                        a3 = i8 + 1;
                    }
                }
            } else {
                bArr = new int[a];
                Arrays.fill((int[]) bArr, -1);
                while (i2 < i) {
                    int i10 = i2 * 2;
                    Object obj6 = objArr[i10];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr[i10 ^ 1];
                    Objects.requireNonNull(obj7);
                    int a4 = rz0.a(obj6.hashCode());
                    while (true) {
                        int i11 = a4 & i3;
                        ?? r8 = bArr[i11];
                        if (r8 == -1) {
                            break;
                        }
                        if (obj6.equals(objArr[r8])) {
                            throw a(obj6, obj7, objArr, r8);
                        }
                        a4 = i11 + 1;
                    }
                }
            }
            obj = bArr;
        }
        return new zm2(obj, objArr, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009d A[RETURN] */
    @Override // yads.o41, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object obj3 = this.e;
        Object[] objArr = this.f;
        int i = this.g;
        if (obj != null) {
            if (i == 1) {
                Object obj4 = objArr[0];
                Objects.requireNonNull(obj4);
                if (obj4.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else if (obj3 != null) {
                if (obj3 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj3;
                    int length = bArr.length - 1;
                    int a = rz0.a(obj.hashCode());
                    while (true) {
                        int i2 = a & length;
                        int i3 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i3])) {
                            obj2 = objArr[i3 ^ 1];
                            break;
                        }
                        a = i2 + 1;
                    }
                } else if (obj3 instanceof short[]) {
                    short[] sArr = (short[]) obj3;
                    int length2 = sArr.length - 1;
                    int a2 = rz0.a(obj.hashCode());
                    while (true) {
                        int i4 = a2 & length2;
                        int i5 = sArr[i4] & 65535;
                        if (i5 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i5])) {
                            obj2 = objArr[i5 ^ 1];
                            break;
                        }
                        a2 = i4 + 1;
                    }
                } else {
                    int[] iArr = (int[]) obj3;
                    int length3 = iArr.length - 1;
                    int a3 = rz0.a(obj.hashCode());
                    while (true) {
                        int i6 = a3 & length3;
                        int i7 = iArr[i6];
                        if (i7 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i7])) {
                            obj2 = objArr[i7 ^ 1];
                            break;
                        }
                        a3 = i6 + 1;
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    public static IllegalArgumentException a(Object obj, Object obj2, Object[] objArr, int i) {
        return new IllegalArgumentException("Multiple entries with same key: " + obj + "=" + obj2 + " and " + objArr[i] + "=" + objArr[i ^ 1]);
    }
}
