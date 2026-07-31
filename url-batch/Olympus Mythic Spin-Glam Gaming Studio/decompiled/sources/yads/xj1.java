package yads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes14.dex */
public interface xj1 {
    int a(MediaCodec.BufferInfo bufferInfo);

    MediaFormat a();

    void a(int i);

    void a(int i, int i2, long j, int i3);

    void a(int i, long j);

    void a(int i, q20 q20Var, long j);

    void a(Bundle bundle);

    void a(Surface surface);

    void a(uk1 uk1Var, Handler handler);

    void a(boolean z, int i);

    int b();

    ByteBuffer b(int i);

    ByteBuffer c(int i);

    void flush();

    void release();
}
