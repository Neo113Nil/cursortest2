package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public interface zj {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    xj a(xj xjVar);

    void a(ByteBuffer byteBuffer);

    void b();

    boolean c();

    void d();

    void flush();

    boolean isActive();
}
