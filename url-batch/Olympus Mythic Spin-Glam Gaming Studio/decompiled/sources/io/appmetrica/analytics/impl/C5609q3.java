package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.q3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C5609q3 implements InterfaceC5634r3 {
    public final int a;

    public C5609q3(int i) {
        this.a = i;
    }

    public static InterfaceC5634r3 a(InterfaceC5634r3... interfaceC5634r3Arr) {
        return new C5609q3(b(interfaceC5634r3Arr));
    }

    public static int b(InterfaceC5634r3... interfaceC5634r3Arr) {
        int i = 0;
        for (InterfaceC5634r3 interfaceC5634r3 : interfaceC5634r3Arr) {
            if (interfaceC5634r3 != null) {
                i = interfaceC5634r3.getBytesTruncated() + i;
            }
        }
        return i;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5634r3
    public final int getBytesTruncated() {
        return this.a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.a + '}';
    }
}
